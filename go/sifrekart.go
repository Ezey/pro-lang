package main

import (
	"fmt"
	"math/rand"
	"time"
)

//kard da bulunacak karakter,sembol,sayıların tanımının yapıldıgı bölümdür.Her durum için ayrı ayrı tanımlanmıştır
var (
	baslik           [29]string = [29]string{"■", "□", "▲", "△", "○", "●", "★", "☂", "☀", "☁", "☹", "☺", "♠", "♣", "♥", "♦", "♫", "€", "¥", "£", "$", "!", "?", "¡", "¿", "⊙", "◐", "◩", "�"}
	sayi             [10]string = [10]string{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}
	sayiveharf       [55]string = [55]string{"2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"}
	sayiharfvesembol [73]string = [73]string{"2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "j", "k", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "@", "#", "$", "%", "&", "*", "<", ">", "?", "€", "+", "{", "}", "[", "]", "(", ")", "/"}
)

//Random sayı üretmek için kullanılan fonksiyondur
func init() {
	rand.Seed(time.Now().UTC().UnixNano())
}

//kartımızı oluşturdugumuz asıl fonksiyondur ve bu kısımda harfler rasgele tutulur
func passwordcard(yarisay string, sembol string) {
	var grid [10][29]string
	if (yarisay == "E") || (yarisay == "e") {
		if (sembol == "E") || (sembol == "e") {
			for x := 1; x < 5; x++ {
				for y := 0; y < 29; y++ {
					grid[x][y] = sayiharfvesembol[rand.Intn(73)]
				}
			}
		} else if (sembol == "H") || (sembol == "h") {
			for x := 1; x < 5; x++ {
				for y := 0; y < 29; y++ {
					grid[x][y] = sayiveharf[rand.Intn(55)]
				}
			}
		}
		for x := 5; x < 9; x++ {
			for y := 0; y < 29; y++ {
				grid[x][y] = sayi[rand.Intn(10)]
			}
		}

	} else if (yarisay == "H") || (yarisay == "h") {
		if (sembol == "H") || (sembol == "h") {
			for x := 1; x < 9; x++ {
				for y := 0; y < 29; y++ {
					grid[x][y] = sayiveharf[rand.Intn(55)]
				}
			}
		} else if (sembol == "E") || (sembol == "e") {
			for x := 1; x < 9; x++ {
				for y := 0; y < 29; y++ {
					grid[x][y] = sayiharfvesembol[rand.Intn(73)]
				}
			}
		}

	}
	//orjinal sitesindeki onay kutularını kullanamadıgımız için evet yada hayır kontrolunda başka degerler girdiginde oluşak durumu karşılayan fonksiyon bu bölgededir
	if ((yarisay == "H") || (yarisay == "h") || (yarisay == "E") || (yarisay == "e")) && ((sembol == "E") || (sembol == "e") || (sembol == "H") || (sembol == "h")) {
		yazdir(grid)
	} else {
		fmt.Println("Lütfen sadece belirtilen harfleri seçiniz")
	}
}

//basslik kısmını sabit olarak verdigimiz degerleri karıştırarak kullanmaya yarar
func baslikkaristir() {
	var tmp string
	for i := 28; i > 0; i-- {
		j := rand.Intn(i)
		tmp = baslik[i]
		baslik[i] = baslik[j]
		baslik[j] = tmp
	}
}

//kartımızı ekrana ekrana çıktı olarak vermeye yarayan fonksiyon
func yazdir(grid [10][29]string) {
	baslikkaristir()
	grid[0] = baslik
	fmt.Println(" ", grid[0])
	for z := 1; z < 9; z++ {
		fmt.Println(z, grid[z])
	}

}

// ana fonksiyonuzmudur dışarıdan bilgi almaya yarayan ana tanımlar burada kullanılmıştır
func main() {
	var b, s string
	fmt.Println("Yarısı sayı olsunmu E/H")
	fmt.Scanf("%s", &b)
	fmt.Println("Semboller olsunmu E/H")
	fmt.Scanf("%s", &s)
	passwordcard(b, s)
}
