/***********************************************************/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <dirent.h>
#include <fcntl.h>
#include <time.h>

void parse(char *, char *);
void process(char *, char *, int);

void ls(char *);
int date();
void pwd();
void cd(char *);
int cp(char *, char *);
int cat(const char *);
int removedir(const char *);
int remove(const char *);
int mv(char *, char *);
void makedir(char *);
void help();
void clear();
int echo();


/******************** main **************************/
int main(int argc, char *argv[]) 
{
  char *komut;
  char *yol;
  char tampon[1024];
  
  char *arg1;
  char *arg2;
  
  arg1 = (char*) malloc(sizeof(char));
  arg2 = (char*) malloc(sizeof(char));
  
  komut = (char *)malloc(sizeof(char));
  yol = (char *)malloc(sizeof(char));
  
  int loop = 1;
  while(loop == 1){
    yol = getenv("MYPATH");
    if(yol != NULL){
      printf("MYPATH = %s\n", yol);
    }
    else
       yol = "/desktop/tmp";
         
    
    printf("MYPATH = %s", yol);     
    printf("\nEzey<>: ");
    komut = fgets(tampon, 1024, stdin);
    printf("%s", tampon);
    printf("%s", komut);
    
    //komutlarin calistirilmassi
    if (strcmp(komut,"ls")==0){
			if(argc==1)
				ls(".");
			else
				ls(argv[1]);
    }
    if(strcmp(komut, "cd\n") == 0){
        cd(strtok(NULL, " "));
    }
    if(strcmp(komut, "rmdir\n") == 0){
       removedir(strtok(NULL, " "));
    }
    if(strcmp(komut, "rm\n") == 0){
       remove(strtok(NULL, " "));
    }
    if(strcmp(komut, "mkdir\n") == 0){
       makedir(strtok(NULL, " "));
    }
    if(strcmp(komut, "cat\n") == 0){
       cat(strtok(NULL, " "));
    }
    
    if(strcmp(komut, "cp\n")== 0){
       arg1=strtok(NULL," ");
       arg2=strtok(NULL,"\0");
       cp(arg1,arg2);
			 
    }
    if(strcmp(komut, "pwd\n") == 0){
	pwd();
    }
    if (strcmp(komut,"date") == 0){
	date();
    }
    if(strcmp(komut, "mv\n") == 0){
       arg1=(strtok(NULL, " "));
       arg2=(strtok(NULL, "\0"));			
       mv(arg1,arg2);
    }
    if (strcmp(komut,"echo") == 0){
	echo();
    }
    
    if (strcmp(komut,"clear") == 0){
	clear();
    }
    if (strcmp(komut,"help") == 0){
	help();
    }
        
    if(strcmp(komut,"exit\n") == 0 || strcmp(komut, "quit\n") == 0){
      loop = 0;
      printf("Program Sonlandirildi..!\n");
    }
    
    
   parse(komut, yol);
  
  }
  
  return 0;
  getch();
  
  free(arg1);
  free(arg2);
  free(komut);
  free(yol);
}

/**************** ls *********************************/
void ls(char *nmdir)
{
 DIR *dir;
 struct dirent *varaux;
	dir= opendir(nmdir);
		while((varaux=readdir(dir))!=NULL)	
		{
			if (varaux->d_name[0]!='.')

			printf("=> %s\n",varaux->d_name);
		}
  printf("\n");
}



/***************** cd *******************************/

void cd(char *pathname)
{
     
	chdir(pathname);
	 

}

/***************** pwd ******************************/

void pwd()
{
 
 char * var = (char *) malloc(sizeof(char));
 getcwd(var, sizeof(char));
 printf("%s\n",var);
 free(var);

}

/**************** cp ********************************/

int cp(char *kaynak, char *hedef)
{        
   FILE *original,*copy;
   char mychar;
        

   if(strcmp(kaynak,hedef)!=0)
   {       
	
       if((original = fopen(kaynak,"r")) == NULL)
       {
            printf("\n Kaynak dosya bulunamadi.\n\n");
       }             
       if((copy = fopen(hedef,"w")) == NULL)
       {
            printf("\n Hedef dosya bulunamadi.\n\n");
       }
       while(!feof(original))
       {
            mychar = getc(original);
            if(!feof(original))
                putc(mychar,copy);
       }

       fclose(original);
       fclose(copy);
       printf("\n Kopyalama tamamlandi.");
   }
   else printf("Kopyalama yapilamadi.\n");
   
   return 0;
}
         

/**************** date *****************************/

int date()
{
 
 char *tempo=malloc(sizeof(char));
 time_t t = time(NULL);
 tempo=ctime(&t);
 printf("%s\n",tempo);
 free(tempo);

}

/*************** echo ******************************/
int echo()
{
  char str[50];
  
  printf("\n Bir sey yaz: ");
  scanf("%[^\n]+", str);

  printf(" Echo : %s", str);

  return 0;    


} 

/************** cat ********************************/

int cat(const char *rec)
{

  struct stat *bf;
  char *ch;
  int fd;
  bf = malloc(sizeof(struct stat));
  stat(rec,bf);
  ch =(char *)malloc(bf->st_size);
  fd = open(rec,O_RDONLY);
  read(fd,ch,bf->st_size);
  printf("%s\n\n",ch);
  
  free(bf);
  free(ch);
  return 0;
}

/*************** rmdir ****************************/

int removedir(const char *pathname)
{
    
  rmdir(pathname);
  printf("Silme islemi tamamlandi.\n");
  return 0;
  
}

/*************** rm *******************************/
int remove(const char *pathname)
{
   unlink(pathname);
   return 0;
}

/****************** mv ****************************/
int mv(char *name, char *newname)
{
    int result;
    result = rename(name, newname);
    
    if(result != 0)
    	printf("Dosya tasinamadi..!\n");
    
    return 0;
}

/***************** mkdir **************************/

void makedir(char *pathname)
{

  mkdir(pathname);
 
  printf("%s dizini basariyla olusturuldu.\n", pathname );

}

/**************** help ****************************/
void help()
{
   printf("help\n");
}     

/*************** clear ***************************/
void clear()
{
   system("clear");     

}

/***************** parse ****************************/

void parse(char *komut, char *yol)
{
  char *argv;
  int argNum = 0;
  argv = strtok(komut, " ");
  while(argv != NULL){
    printf("%s %d\n", argv, argNum);
    argv = strtok (NULL, " ");
    argNum++;
    }
  printf("Calling...\n");
  process(argv, yol, argNum);
  printf("Called\n");
}

/****************** process ************************/
void process(char *argv, char *yol, int argNum)
{
  char *patika;
  int sokak = 0;
  patika = strtok(yol, "#");
  while(patika != NULL){
    printf("%s %d\n", patika, sokak);
    patika= strtok(NULL, "#");
    sokak++;
  }
}

/*****************************************************/
