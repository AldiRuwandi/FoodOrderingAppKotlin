package com.example.foodorderingappkotlin.model

object setFoodData {

    fun setFoods(): List<FoodData>{
        var FoodList = mutableListOf<FoodData>()
        FoodList.add(
            FoodData(
                1,
                "Pizza Italiano",
                "Foodies Market",
                "7.5 Min",
                "25 Min",
                "Pizza adalah roti berbentuk bulat pipih dengan diameter 30 cm yang dipanggang dalam oven dan biasanya disiram saus tomat serta keju dan dengan makanan tambahan lainnya (topping) yang sesuai selera penikmatnya.",
                "Rp. 15.000"
            )
        )
        FoodList.add(
            FoodData(
                2,
                "Chicken Wings",
                "Foodies Market",
                "10 Min",
                "17 Min",
                "Sayap ayam khas Spanyol biasanya dibumbui paprika bakar dan bawang putih. Kunci mengolahnya adalah menggunakan wajan besar untuk memastikan kulitnya renyah dan perasa tambahan dari air perasan lemon, minyak zaitun berkualitas tinggi, serta lada hitam bubuk.",
                "Rp. 25.000"
            )
        )
        FoodList.add(
            FoodData(
                3,
                "Hamburger US",
                "Foodies Market",
                "5 Min",
                "30 Min",
                "(atau sering kali disebut dengan burger) adalah sejenis makanan berupa roti berbentuk bundar yang diiris dua dan di tengahnya diisi dengan patty yang biasanya diambil dari daging, kemudian sayur-sayuran berupa selada, tomat dan bawang bombai.",
                "Rp. 15.000"
            )
        )
        FoodList.add(
            FoodData(
                4,
                "Kebab Turkey",
                "Foodies Market",
                "7 Min",
                "12 Min",
                "Kebab adalah penganan cepat saji terdiri atas daging sapi yang dipanggang seperti sate kemudian diiris-iris ditambah dengan sayuran segar dan mayones, lalu dibalut dengan kulit tortila.",
                "Rp. 7.500"
            )
        )
        FoodList.add(
            FoodData(
                5,
                "Red Velvet",
                "Foodies Market",
                "30 Min",
                "15 Min",
                "Bolu red velvet atau kue red velvet biasanya adalah bolu lapis coklat berwarna merah, coklat kemerahan, atau kemerahan, yang dilapisi dengan keju krim putih. Resep-resep tradisional tak memakai pewarna makanan, dengan warna merah didapatkan dari bubuk coklat yang mengandung antosianin.",
                "Rp. 50.000"
            )
        )
        FoodList.add(
            FoodData(
                6,
                "Spaghetti",
                "Foodies Market",
                "20 Min",
                "20 Min",
                "Spaghetti merupakan salah satu dari varian pasta yang memiliki bentuk silinder tipis dan padat yang terbuat dari olahan gandum. Spaghetti telah menjadi makanan pokok tradisional penduduk Italia.",
                "Rp. 18.000"
            )
        )
        FoodList.add(
            FoodData(
                7,
                "Tacos",
                "Foodies Market",
                "6 Min",
                "17 Min",
                "Taco adalah makanan tradisional Meksiko berupa kulit tortila berisi sayuran, daging, dan saus. ... Namun, versi taco yang terkenal mempunyai tortila bertekstur keras atau disebut hard sell taco danbentuknya seperti huruf u.",
                "Rp. 10.000"
            )
        )
        FoodList.add(
            FoodData(
                8,
                "Dimsum",
                "Foodies Market",
                "3 Min",
                "10 Min",
                "Dim sum adalah masakan asli Kanton yang terdiri dari kukus dan goreng dengan berbagai isian lezat. Pada umumnya, orang yang lebih tua berkumpul menikmati dim sum di pagi hari setelah olahraga.",
                "Rp. 3.000"
            )
        )
        FoodList.add(
            FoodData(
                9,
                "Fish Cake",
                "Foodies Market",
                "10 Min",
                "24 Min",
                "kue Jepang berbentuk ikan. Bagian atas kue dipanggang terpisah dengan bagian bawah kue. Setelah kue hampir matang, keduanya disatukan dengan selai kacang merah. Kue ini juga sering diisi dengan cokelat, vla, keju, atau sosis.",
                "Rp. 2.500"
            )
        )
        FoodList.add(
            FoodData(
                10,
                "French Fries",
                "Foodies Market",
                "5 Min",
                "30 Min",
                "Kentang goreng adalah hidangan yang dibuat dari potongan-potongan kentang yang digoreng dalam minyak goreng panas. Di dalam menu rumah-rumah makan, kentang goreng yang dipotong panjang-panjang dan digoreng dalam keadaan terendam di dalam minyak goreng panas disebut French fries.",
                "Rp. 7.000"
            )
        )

        return FoodList
    }
}