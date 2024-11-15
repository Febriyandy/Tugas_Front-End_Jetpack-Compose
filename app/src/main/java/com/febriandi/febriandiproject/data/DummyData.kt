package com.febriandi.febriandiproject.data

import com.febriandi.agrojaya.model.Artikel
import com.febriandi.agrojaya.model.Paket
import com.febriandi.febriandiproject.R
import com.febriandi.febriandiproject.model.Gallery

object DummyData {
    val artikel = listOf(
        Artikel(
            id = 1,
            judul = "Urban Farming Dan Kelebihannya",
            penulis = "Baraja",
            isi = "Urban farming atau pertanian perkotaan adalah konsep bertani di lingkungan kota yang semakin populer, terutama di tengah keterbatasan lahan dan meningkatnya kebutuhan pangan lokal. Berbeda dengan pertanian tradisional yang memerlukan lahan luas, urban farming memanfaatkan lahan kecil seperti halaman, atap bangunan, atau bahkan ruang vertikal. Teknik ini memungkinkan penduduk kota menanam tanaman seperti sayuran, buah-buahan, dan rempah-rempah.\n" +
                    "\n" +
                    "Salah satu kelebihan utama dari urban farming adalah efisiensi lahan. Dengan teknik seperti hidroponik atau vertikultur, tanaman dapat tumbuh dalam ruang yang lebih kecil. Selain itu, urban farming membantu mengurangi jejak karbon karena produk pertanian tidak perlu diangkut dari tempat jauh, sehingga emisi yang dihasilkan dari transportasi berkurang. Urban farming juga mendukung ketahanan pangan di perkotaan dengan menyediakan sumber pangan yang segar dan sehat bagi masyarakat sekitar.\n" +
                    "\n" +
                    "Manfaat lain yang tidak kalah penting adalah aspek edukatif dan kesehatan. Kegiatan bercocok tanam bisa menjadi aktivitas yang menyenangkan dan menyehatkan, memberikan kesempatan bagi masyarakat perkotaan untuk lebih terhubung dengan alam, serta belajar tentang pentingnya keberlanjutan dan konservasi lingkungan. Urban farming juga dapat meningkatkan kualitas udara di kota, mengurangi panas, dan mempercantik lingkungan, menjadikannya solusi ideal untuk masa depan perkotaan yang lebih hijau.",
            photo = R.drawable.artikel1,
            like = 21,
        ),
        Artikel(
            id = 2,
            judul = "Air Dan Pertanian",
            penulis = "Adinda",
            isi = "Air adalah salah satu sumber daya paling penting dalam dunia pertanian. Tanpa pasokan air yang memadai, tanaman tidak dapat tumbuh dengan optimal, dan hasil panen akan berkurang drastis. Air digunakan dalam berbagai tahap pertumbuhan tanaman, mulai dari penyemaian, pertumbuhan vegetatif, hingga masa panen. Namun, ketersediaan air yang cukup dan berkualitas juga menjadi tantangan tersendiri, terutama di daerah yang mengalami kekeringan atau musim kemarau panjang.\n" +
                    "\n" +
                    "Dalam praktik pertanian modern, manajemen penggunaan air sangatlah penting untuk memastikan bahwa air digunakan secara efisien dan berkelanjutan. Teknologi irigasi, seperti irigasi tetes dan irigasi sprinkler, telah dikembangkan untuk membantu petani menghemat penggunaan air. Irigasi tetes, misalnya, memungkinkan air disalurkan langsung ke akar tanaman, sehingga mengurangi penguapan dan mencegah pemborosan. Sistem ini sangat berguna di daerah yang memiliki sumber air terbatas.\n" +
                    "\n" +
                    "Selain itu, teknik pengelolaan tanah seperti mulsa dan penanaman berlapis membantu menjaga kelembapan tanah, sehingga tanaman tetap mendapatkan suplai air yang cukup meskipun dalam kondisi cuaca panas. Di sisi lain, perubahan iklim juga berdampak pada siklus air di pertanian, dengan meningkatnya frekuensi kekeringan dan hujan ekstrem yang dapat mengganggu produksi pangan. Oleh karena itu, penting bagi para petani untuk menerapkan praktik pertanian berkelanjutan dan memanfaatkan teknologi pengelolaan air secara optimal demi memastikan ketahanan pangan di masa depan.",
            photo = R.drawable.artikel3,
            like = 14,
        ),
        Artikel(
            id = 3,
            judul = "Metode Urban Farming",
            penulis = "Rendy M,Muthaqin",
            isi = "Urban farming atau pertanian kota merupakan solusi kreatif untuk memenuhi kebutuhan pangan di tengah terbatasnya lahan perkotaan. Dengan urban farming, masyarakat dapat memanfaatkan lahan sempit untuk menanam berbagai tanaman, seperti sayuran, buah-buahan, dan rempah-rempah. Berikut adalah beberapa metode urban farming yang populer:\n" +
                    "\n" +
                    "Hidroponik\n" +
                    "Hidroponik adalah metode bercocok tanam tanpa tanah, menggunakan larutan air yang kaya akan nutrisi. Tanaman ditempatkan dalam media seperti rockwool atau serbuk kayu untuk menjaga akar tetap lembab. Hidroponik sangat populer karena efisien dalam penggunaan air dan bisa dilakukan dalam ruangan dengan bantuan pencahayaan buatan.\n" +
                    "\n" +
                    "Akuaponik\n" +
                    "Akuaponik menggabungkan hidroponik dan akuakultur (budidaya ikan). Limbah dari ikan digunakan sebagai nutrisi bagi tanaman, sementara tanaman berperan sebagai penyaring air yang kembali ke kolam ikan. Metode ini sangat efisien dalam hal sumber daya karena menciptakan ekosistem yang saling menguntungkan.\n" +
                    "\n" +
                    "Vertikultur (Vertical Farming)\n" +
                    "Vertikultur memanfaatkan ruang vertikal, seperti dinding atau rak bertingkat, untuk menanam tanaman. Dengan menggunakan pot atau media tanam yang disusun bertingkat, vertikultur memungkinkan penanaman lebih banyak tanaman di lahan terbatas. Metode ini cocok untuk balkon, dinding bangunan, atau bahkan di dalam ruangan.\n" +
                    "\n" +
                    "Kebun Kontainer (Container Gardening)\n" +
                    "Kebun kontainer adalah metode menanam di pot atau wadah yang dapat ditempatkan di berbagai area, seperti teras, balkon, atau halaman. Metode ini fleksibel dan cocok untuk berbagai jenis tanaman. Selain mudah dipindahkan, tanaman dalam wadah juga lebih mudah dirawat.\n" +
                    "\n" +
                    "Kebun Atap (Rooftop Gardening)\n" +
                    "Rooftop gardening adalah praktik menanam di atas atap bangunan. Selain menghasilkan bahan pangan, kebun atap dapat membantu menurunkan suhu bangunan dan memperbaiki kualitas udara. Metode ini ideal di kota-kota besar dengan banyak bangunan bertingkat.\n" +
                    "\n" +
                    "Dengan metode-metode urban farming ini, masyarakat perkotaan bisa memproduksi pangan mereka sendiri, mengurangi ketergantungan pada pasokan dari luar, dan meningkatkan kualitas hidup di lingkungan padat. Urban farming juga memberi kesempatan untuk gaya hidup yang lebih sehat dan ramah lingkungan.",
            photo = R.drawable.artikel5,
            like = 20,
        ),
        Artikel(
            id = 4,
            judul = "Tanaman Yang Cocok Untuk Urban Farming",
            penulis = "Febriandi",
            isi = "Urban farming atau pertanian perkotaan menjadi tren yang populer sebagai solusi bercocok tanam di lahan terbatas. Banyak jenis tanaman yang cocok untuk urban farming karena mudah ditanam, cepat tumbuh, dan tidak memerlukan lahan luas. Berikut beberapa tanaman yang paling sesuai untuk ditanam di lingkungan perkotaan:\n" +
                    "\n" +
                    "Sayuran Hijau (Selada, Bayam, Kangkung)\n" +
                    "Sayuran hijau seperti selada, bayam, dan kangkung sangat cocok untuk urban farming karena pertumbuhannya cepat dan mudah. Tanaman ini bisa ditanam dalam pot kecil atau sistem hidroponik, sehingga tidak membutuhkan banyak tempat. Selain itu, sayuran ini memiliki kebutuhan air yang tidak terlalu tinggi, menjadikannya pilihan ideal untuk lahan sempit.\n" +
                    "\n" +
                    "Tomat\n" +
                    "Tomat merupakan tanaman yang populer untuk ditanam di perkotaan. Tanaman ini dapat tumbuh dalam pot atau kontainer dan tidak memerlukan lahan luas. Tomat cherry, khususnya, sangat cocok untuk sistem vertikal atau kebun kontainer karena ukurannya yang kecil dan produktivitasnya yang tinggi.\n" +
                    "\n" +
                    "Cabai dan Paprika\n" +
                    "Cabai dan paprika juga cocok untuk urban farming, terutama di iklim hangat. Keduanya dapat ditanam dalam pot atau sistem vertikal, dan tidak memerlukan perawatan yang rumit. Selain bermanfaat sebagai bahan dapur, cabai dan paprika juga mempercantik kebun dengan warna-warni buahnya.\n" +
                    "\n" +
                    "Herba (Basil, Mint, Rosemary)\n" +
                    "Tanaman herba seperti basil, mint, dan rosemary adalah pilihan favorit karena dapat tumbuh dengan baik di pot kecil dan mudah dirawat. Herba ini juga cocok untuk ditanam di dalam ruangan dekat jendela dengan paparan sinar matahari. Selain memperkaya aroma dan rasa masakan, herba juga memiliki manfaat kesehatan.\n" +
                    "\n" +
                    "Wortel dan Lobak\n" +
                    "Meski membutuhkan tanah yang sedikit lebih dalam, wortel dan lobak tetap bisa ditanam dalam kontainer besar. Kedua sayuran akar ini tumbuh baik di lingkungan urban dan tidak memerlukan perawatan intensif. Hasil panennya dapat diolah menjadi beragam jenis makanan yang sehat dan bergizi.\n" +
                    "\n" +
                    "Terong\n" +
                    "Terong adalah tanaman yang cukup tahan cuaca dan mudah tumbuh di lahan terbatas. Tanaman ini bisa tumbuh dalam pot dan cocok untuk metode kebun atap atau kontainer. Dengan perawatan yang tepat, terong dapat tumbuh subur dan menghasilkan panen yang melimpah.\n" +
                    "\n" +
                    "Urban farming tidak hanya memungkinkan kita memanfaatkan lahan terbatas, tetapi juga memberikan pengalaman bertani yang menyenangkan. Dengan memilih tanaman yang tepat, kita bisa menghasilkan bahan pangan sehat, mempercantik lingkungan, dan berkontribusi pada keberlanjutan lingkungan.",
            photo = R.drawable.artikel2,
            like = 15,
        ),
        Artikel(
            id = 5,
            judul = "Perawatan Urban Farming",
            penulis = "Andi Zakaria",
            isi = "Urban farming atau pertanian perkotaan merupakan salah satu solusi cerdas untuk bertani di lahan terbatas, seperti di atap rumah, balkon, atau taman kecil. Namun, agar hasil pertanian di perkotaan dapat optimal, perawatan yang tepat sangat diperlukan. Berikut beberapa tips perawatan untuk tanaman urban farming agar tumbuh subur dan menghasilkan panen yang berkualitas:\n" +
                    "\n" +
                    "Pemilihan Tanaman yang Tepat\n" +
                    "Pilih tanaman yang sesuai dengan kondisi lingkungan tempat tinggal. Tanaman seperti sayuran hijau (selada, bayam), herba (mint, basil), dan buah kecil (tomat, cabai) cocok untuk urban farming karena mereka tidak membutuhkan banyak ruang dan bisa tumbuh dengan baik di pot atau wadah vertikal.\n" +
                    "\n" +
                    "Penyiraman yang Tepat\n" +
                    "Penyiraman adalah kunci utama dalam perawatan urban farming. Tanaman di dalam pot atau kebun vertikal membutuhkan perhatian lebih dalam hal kelembaban tanah. Pastikan tanah tidak terlalu kering, namun juga tidak tergenang air. Sebaiknya siram tanaman pada pagi atau sore hari untuk menghindari penguapan yang berlebihan.\n" +
                    "\n" +
                    "Pencahayaan yang Cukup\n" +
                    "Mayoritas tanaman memerlukan sinar matahari untuk tumbuh dengan baik. Pastikan tanaman urban farming mendapatkan setidaknya 4-6 jam sinar matahari langsung setiap hari. Untuk tanaman yang ditanam di dalam ruangan, Anda bisa menggunakan lampu tumbuh (grow light) untuk membantu tanaman mendapatkan cahaya yang cukup.\n" +
                    "\n" +
                    "Pemupukan\n" +
                    "Pemupukan secara rutin sangat penting untuk memastikan tanaman mendapatkan nutrisi yang cukup. Gunakan pupuk organik atau kompos agar tanaman tumbuh sehat tanpa bahan kimia yang berbahaya. Pupuk bisa diberikan setiap dua minggu sekali, tergantung pada jenis tanaman.\n" +
                    "\n" +
                    "Pengendalian Hama dan Penyakit\n" +
                    "Perhatikan tanda-tanda serangan hama atau penyakit, seperti daun yang menguning atau berlubang. Gunakan pestisida alami atau metode pengendalian biologis untuk menjaga kebun tetap sehat dan bebas dari hama.\n" +
                    "\n" +
                    "Dengan perawatan yang tepat, urban farming dapat memberikan hasil yang memuaskan, bahkan di lahan terbatas sekalipun. Selain itu, Anda juga dapat menikmati manfaat pertanian yang ramah lingkungan dan menghasilkan bahan pangan yang segar langsung dari kebun sendiri.",
            photo = R.drawable.artikel4,
            like = 27,
        ),
        Artikel(
            id = 6,
            judul = "Urban Farming Dan Kelebihannya",
            penulis = "Baraja",
            isi = "Urban farming atau pertanian perkotaan adalah konsep bertani di lingkungan kota yang semakin populer, terutama di tengah keterbatasan lahan dan meningkatnya kebutuhan pangan lokal. Berbeda dengan pertanian tradisional yang memerlukan lahan luas, urban farming memanfaatkan lahan kecil seperti halaman, atap bangunan, atau bahkan ruang vertikal. Teknik ini memungkinkan penduduk kota menanam tanaman seperti sayuran, buah-buahan, dan rempah-rempah.\n" +
                    "\n" +
                    "Salah satu kelebihan utama dari urban farming adalah efisiensi lahan. Dengan teknik seperti hidroponik atau vertikultur, tanaman dapat tumbuh dalam ruang yang lebih kecil. Selain itu, urban farming membantu mengurangi jejak karbon karena produk pertanian tidak perlu diangkut dari tempat jauh, sehingga emisi yang dihasilkan dari transportasi berkurang. Urban farming juga mendukung ketahanan pangan di perkotaan dengan menyediakan sumber pangan yang segar dan sehat bagi masyarakat sekitar.\n" +
                    "\n" +
                    "Manfaat lain yang tidak kalah penting adalah aspek edukatif dan kesehatan. Kegiatan bercocok tanam bisa menjadi aktivitas yang menyenangkan dan menyehatkan, memberikan kesempatan bagi masyarakat perkotaan untuk lebih terhubung dengan alam, serta belajar tentang pentingnya keberlanjutan dan konservasi lingkungan. Urban farming juga dapat meningkatkan kualitas udara di kota, mengurangi panas, dan mempercantik lingkungan, menjadikannya solusi ideal untuk masa depan perkotaan yang lebih hijau.",
            photo = R.drawable.artikel1,
            like = 21,
        ),
        Artikel(
            id = 7,
            judul = "Air Dan Pertanian",
            penulis = "Adinda",
            isi = "Air adalah salah satu sumber daya paling penting dalam dunia pertanian. Tanpa pasokan air yang memadai, tanaman tidak dapat tumbuh dengan optimal, dan hasil panen akan berkurang drastis. Air digunakan dalam berbagai tahap pertumbuhan tanaman, mulai dari penyemaian, pertumbuhan vegetatif, hingga masa panen. Namun, ketersediaan air yang cukup dan berkualitas juga menjadi tantangan tersendiri, terutama di daerah yang mengalami kekeringan atau musim kemarau panjang.\n" +
                    "\n" +
                    "Dalam praktik pertanian modern, manajemen penggunaan air sangatlah penting untuk memastikan bahwa air digunakan secara efisien dan berkelanjutan. Teknologi irigasi, seperti irigasi tetes dan irigasi sprinkler, telah dikembangkan untuk membantu petani menghemat penggunaan air. Irigasi tetes, misalnya, memungkinkan air disalurkan langsung ke akar tanaman, sehingga mengurangi penguapan dan mencegah pemborosan. Sistem ini sangat berguna di daerah yang memiliki sumber air terbatas.\n" +
                    "\n" +
                    "Selain itu, teknik pengelolaan tanah seperti mulsa dan penanaman berlapis membantu menjaga kelembapan tanah, sehingga tanaman tetap mendapatkan suplai air yang cukup meskipun dalam kondisi cuaca panas. Di sisi lain, perubahan iklim juga berdampak pada siklus air di pertanian, dengan meningkatnya frekuensi kekeringan dan hujan ekstrem yang dapat mengganggu produksi pangan. Oleh karena itu, penting bagi para petani untuk menerapkan praktik pertanian berkelanjutan dan memanfaatkan teknologi pengelolaan air secara optimal demi memastikan ketahanan pangan di masa depan.",
            photo = R.drawable.artikel3,
            like = 14,
        ),
        Artikel(
            id = 8,
            judul = "Metode Urban Farming",
            penulis = "Rendy M,Muthaqin",
            isi = "Urban farming atau pertanian kota merupakan solusi kreatif untuk memenuhi kebutuhan pangan di tengah terbatasnya lahan perkotaan. Dengan urban farming, masyarakat dapat memanfaatkan lahan sempit untuk menanam berbagai tanaman, seperti sayuran, buah-buahan, dan rempah-rempah. Berikut adalah beberapa metode urban farming yang populer:\n" +
                    "\n" +
                    "Hidroponik\n" +
                    "Hidroponik adalah metode bercocok tanam tanpa tanah, menggunakan larutan air yang kaya akan nutrisi. Tanaman ditempatkan dalam media seperti rockwool atau serbuk kayu untuk menjaga akar tetap lembab. Hidroponik sangat populer karena efisien dalam penggunaan air dan bisa dilakukan dalam ruangan dengan bantuan pencahayaan buatan.\n" +
                    "\n" +
                    "Akuaponik\n" +
                    "Akuaponik menggabungkan hidroponik dan akuakultur (budidaya ikan). Limbah dari ikan digunakan sebagai nutrisi bagi tanaman, sementara tanaman berperan sebagai penyaring air yang kembali ke kolam ikan. Metode ini sangat efisien dalam hal sumber daya karena menciptakan ekosistem yang saling menguntungkan.\n" +
                    "\n" +
                    "Vertikultur (Vertical Farming)\n" +
                    "Vertikultur memanfaatkan ruang vertikal, seperti dinding atau rak bertingkat, untuk menanam tanaman. Dengan menggunakan pot atau media tanam yang disusun bertingkat, vertikultur memungkinkan penanaman lebih banyak tanaman di lahan terbatas. Metode ini cocok untuk balkon, dinding bangunan, atau bahkan di dalam ruangan.\n" +
                    "\n" +
                    "Kebun Kontainer (Container Gardening)\n" +
                    "Kebun kontainer adalah metode menanam di pot atau wadah yang dapat ditempatkan di berbagai area, seperti teras, balkon, atau halaman. Metode ini fleksibel dan cocok untuk berbagai jenis tanaman. Selain mudah dipindahkan, tanaman dalam wadah juga lebih mudah dirawat.\n" +
                    "\n" +
                    "Kebun Atap (Rooftop Gardening)\n" +
                    "Rooftop gardening adalah praktik menanam di atas atap bangunan. Selain menghasilkan bahan pangan, kebun atap dapat membantu menurunkan suhu bangunan dan memperbaiki kualitas udara. Metode ini ideal di kota-kota besar dengan banyak bangunan bertingkat.\n" +
                    "\n" +
                    "Dengan metode-metode urban farming ini, masyarakat perkotaan bisa memproduksi pangan mereka sendiri, mengurangi ketergantungan pada pasokan dari luar, dan meningkatkan kualitas hidup di lingkungan padat. Urban farming juga memberi kesempatan untuk gaya hidup yang lebih sehat dan ramah lingkungan.",
            photo = R.drawable.artikel5,
            like = 20,
        ),
        Artikel(
            id = 9,
            judul = "Tanaman Yang Cocok Untuk Urban Farming",
            penulis = "Febriandi",
            isi = "Urban farming atau pertanian perkotaan menjadi tren yang populer sebagai solusi bercocok tanam di lahan terbatas. Banyak jenis tanaman yang cocok untuk urban farming karena mudah ditanam, cepat tumbuh, dan tidak memerlukan lahan luas. Berikut beberapa tanaman yang paling sesuai untuk ditanam di lingkungan perkotaan:\n" +
                    "\n" +
                    "Sayuran Hijau (Selada, Bayam, Kangkung)\n" +
                    "Sayuran hijau seperti selada, bayam, dan kangkung sangat cocok untuk urban farming karena pertumbuhannya cepat dan mudah. Tanaman ini bisa ditanam dalam pot kecil atau sistem hidroponik, sehingga tidak membutuhkan banyak tempat. Selain itu, sayuran ini memiliki kebutuhan air yang tidak terlalu tinggi, menjadikannya pilihan ideal untuk lahan sempit.\n" +
                    "\n" +
                    "Tomat\n" +
                    "Tomat merupakan tanaman yang populer untuk ditanam di perkotaan. Tanaman ini dapat tumbuh dalam pot atau kontainer dan tidak memerlukan lahan luas. Tomat cherry, khususnya, sangat cocok untuk sistem vertikal atau kebun kontainer karena ukurannya yang kecil dan produktivitasnya yang tinggi.\n" +
                    "\n" +
                    "Cabai dan Paprika\n" +
                    "Cabai dan paprika juga cocok untuk urban farming, terutama di iklim hangat. Keduanya dapat ditanam dalam pot atau sistem vertikal, dan tidak memerlukan perawatan yang rumit. Selain bermanfaat sebagai bahan dapur, cabai dan paprika juga mempercantik kebun dengan warna-warni buahnya.\n" +
                    "\n" +
                    "Herba (Basil, Mint, Rosemary)\n" +
                    "Tanaman herba seperti basil, mint, dan rosemary adalah pilihan favorit karena dapat tumbuh dengan baik di pot kecil dan mudah dirawat. Herba ini juga cocok untuk ditanam di dalam ruangan dekat jendela dengan paparan sinar matahari. Selain memperkaya aroma dan rasa masakan, herba juga memiliki manfaat kesehatan.\n" +
                    "\n" +
                    "Wortel dan Lobak\n" +
                    "Meski membutuhkan tanah yang sedikit lebih dalam, wortel dan lobak tetap bisa ditanam dalam kontainer besar. Kedua sayuran akar ini tumbuh baik di lingkungan urban dan tidak memerlukan perawatan intensif. Hasil panennya dapat diolah menjadi beragam jenis makanan yang sehat dan bergizi.\n" +
                    "\n" +
                    "Terong\n" +
                    "Terong adalah tanaman yang cukup tahan cuaca dan mudah tumbuh di lahan terbatas. Tanaman ini bisa tumbuh dalam pot dan cocok untuk metode kebun atap atau kontainer. Dengan perawatan yang tepat, terong dapat tumbuh subur dan menghasilkan panen yang melimpah.\n" +
                    "\n" +
                    "Urban farming tidak hanya memungkinkan kita memanfaatkan lahan terbatas, tetapi juga memberikan pengalaman bertani yang menyenangkan. Dengan memilih tanaman yang tepat, kita bisa menghasilkan bahan pangan sehat, mempercantik lingkungan, dan berkontribusi pada keberlanjutan lingkungan.",
            photo = R.drawable.artikel2,
            like = 15,
        ),
        Artikel(
            id = 10,
            judul = "Perawatan Urban Farming",
            penulis = "Andi Zakaria",
            isi = "Urban farming atau pertanian perkotaan merupakan salah satu solusi cerdas untuk bertani di lahan terbatas, seperti di atap rumah, balkon, atau taman kecil. Namun, agar hasil pertanian di perkotaan dapat optimal, perawatan yang tepat sangat diperlukan. Berikut beberapa tips perawatan untuk tanaman urban farming agar tumbuh subur dan menghasilkan panen yang berkualitas:\n" +
                    "\n" +
                    "Pemilihan Tanaman yang Tepat\n" +
                    "Pilih tanaman yang sesuai dengan kondisi lingkungan tempat tinggal. Tanaman seperti sayuran hijau (selada, bayam), herba (mint, basil), dan buah kecil (tomat, cabai) cocok untuk urban farming karena mereka tidak membutuhkan banyak ruang dan bisa tumbuh dengan baik di pot atau wadah vertikal.\n" +
                    "\n" +
                    "Penyiraman yang Tepat\n" +
                    "Penyiraman adalah kunci utama dalam perawatan urban farming. Tanaman di dalam pot atau kebun vertikal membutuhkan perhatian lebih dalam hal kelembaban tanah. Pastikan tanah tidak terlalu kering, namun juga tidak tergenang air. Sebaiknya siram tanaman pada pagi atau sore hari untuk menghindari penguapan yang berlebihan.\n" +
                    "\n" +
                    "Pencahayaan yang Cukup\n" +
                    "Mayoritas tanaman memerlukan sinar matahari untuk tumbuh dengan baik. Pastikan tanaman urban farming mendapatkan setidaknya 4-6 jam sinar matahari langsung setiap hari. Untuk tanaman yang ditanam di dalam ruangan, Anda bisa menggunakan lampu tumbuh (grow light) untuk membantu tanaman mendapatkan cahaya yang cukup.\n" +
                    "\n" +
                    "Pemupukan\n" +
                    "Pemupukan secara rutin sangat penting untuk memastikan tanaman mendapatkan nutrisi yang cukup. Gunakan pupuk organik atau kompos agar tanaman tumbuh sehat tanpa bahan kimia yang berbahaya. Pupuk bisa diberikan setiap dua minggu sekali, tergantung pada jenis tanaman.\n" +
                    "\n" +
                    "Pengendalian Hama dan Penyakit\n" +
                    "Perhatikan tanda-tanda serangan hama atau penyakit, seperti daun yang menguning atau berlubang. Gunakan pestisida alami atau metode pengendalian biologis untuk menjaga kebun tetap sehat dan bebas dari hama.\n" +
                    "\n" +
                    "Dengan perawatan yang tepat, urban farming dapat memberikan hasil yang memuaskan, bahkan di lahan terbatas sekalipun. Selain itu, Anda juga dapat menikmati manfaat pertanian yang ramah lingkungan dan menghasilkan bahan pangan yang segar langsung dari kebun sendiri.",
            photo = R.drawable.artikel4,
            like = 27,
        ),
    )

    val paket = listOf(
        Paket(
            id = 1,
            nama_paket = "Paket Dasar",
            harga = "Rp. 500.000",
            fitur = "• Instalasi sistem hidroponik kecil (10 tanaman)\n" +
                    "• 1 jenis tanaman\n" +
                    "• Pupuk dan nutrisi awal untuk 1 bulan\n" +
                    "• Konsultasi singkat via online 1x",
            detail = "Paket Dasar dirancang untuk pemula yang ingin memulai urban farming di rumah dengan investasi minimal. Paket ini menyediakan instalasi sistem hidroponik kecil yang cukup untuk beberapa tanaman sayuran daun seperti selada atau bayam. Dengan paket ini, Anda akan mendapatkan bimbingan singkat mengenai perawatan dasar agar tanaman tumbuh dengan baik. Paket Dasar juga menyediakan pupuk dan nutrisi yang cukup untuk satu bulan awal, serta satu kali konsultasi online untuk mendukung tahap awal Anda dalam bercocok tanam.",
            photo = R.drawable.paket1,
        ),
        Paket(
            id = 2,
            nama_paket = "Paket Menengah",
            harga = "Rp. 1.000.000",
            fitur = "• Instalasi sistem hidroponik sedang\n" +
                    "• 20 Tanaman\n" +
                    "• 3 jenis tanaman pilihan\n" +
                    "• Nutrisi awal untuk 1-2 bulan\n" +
                    "• 2x konsultasi lanjutan secara online",
            detail = "Paket Menengah memberikan solusi lebih lengkap untuk yang sudah berpengalaman atau ingin menambah koleksi tanaman. Paket ini mencakup instalasi sistem hidroponik ukuran sedang yang dapat menampung 20 tanaman sekaligus. Selain itu, Anda bisa memilih hingga 3 jenis tanaman (misalnya selada, bayam, dan basil), yang sudah termasuk pupuk dan nutrisi untuk 1-2 bulan awal. Paket ini juga mencakup dua kali konsultasi lanjutan secara online untuk membantu Anda dalam merawat dan menjaga pertumbuhan tanaman dengan optimal.\n",
            photo = R.drawable.paket2,
        ),
        Paket(
            id = 3,
            nama_paket = "Paket Lengkap",
            harga = "Rp. 2.500.000",
            fitur = "• Instalasi sistem hidroponik otomatis\n" +
                    "• 50 Tanaman\n" +
                    "• 5 jenis tanaman pilihan\n" +
                    "• Alat pengukur nutrisi dan pH\n" +
                    "• Konsultasi 4x, termasuk kunjungan lapangan 1x (opsional)",
            detail = "Paket Lengkap cocok untuk mereka yang serius ingin memiliki kebun urban dengan sistem yang lebih canggih dan terautomasi. Dengan kapasitas hingga 50 tanaman, paket ini mencakup instalasi sistem hidroponik otomatis yang menyertakan irigasi otomatis untuk memudahkan perawatan. Anda juga dapat memilih hingga 5 jenis tanaman, termasuk sayuran atau buah-buahan kecil seperti cabai dan tomat. Selain pupuk dan nutrisi, Anda juga akan mendapatkan alat pengukur pH dan nutrisi agar dapat mengontrol kondisi tanaman dengan lebih baik. Paket ini mencakup hingga empat kali konsultasi, termasuk satu kunjungan lapangan untuk pengecekan langsung (opsional), menjadikannya pilihan tepat bagi mereka yang ingin hasil maksimal.",
            photo = R.drawable.paket3,
        ),
        Paket(
            id = 4,
            nama_paket = "Paket Premium",
            harga = "Rp. 5.000.000",
            fitur = "• Sistem hidroponik dan vertikultur, irigasi otomatis untuk skala bisnis\n" +
                    "• 10 jenis tanaman pilihan\n" +
                    "• Nutrisi, alat monitoring lengkap, dan pelatihan perawatan\n" +
                    "• Konsultasi rutin dan bimbingan bulanan selama 6 bulan",
            detail = "Paket Premium adalah pilihan terbaik untuk Anda yang ingin mengembangkan urban farming dalam skala besar atau bahkan sebagai bisnis kecil. Dengan instalasi sistem hidroponik dan vertikultur yang dilengkapi dengan irigasi otomatis, Anda bisa menanam hingga 10 jenis tanaman, termasuk sayuran, buah-buahan, dan herbal sesuai permintaan. Anda juga mendapatkan nutrisi lengkap, alat monitoring untuk memantau kondisi pH dan nutrisi, serta pelatihan intensif mengenai perawatan tanaman. Selain itu, terdapat bimbingan rutin dan konsultasi bulanan selama 6 bulan, memastikan Anda mendapatkan hasil terbaik. Paket ini memberikan solusi lengkap dengan teknologi dan dukungan profesional untuk urban farming yang sukses.",
            photo = R.drawable.paket4,
        ),
        Paket(
            id = 5,
            nama_paket = "Paket Dasar",
            harga = "Rp. 500.000",
            fitur = "• Instalasi sistem hidroponik kecil (10 tanaman)\n" +
                    "• 1 jenis tanaman\n" +
                    "• Pupuk dan nutrisi awal untuk 1 bulan\n" +
                    "• Konsultasi singkat via online 1x",
            detail = "Paket Dasar dirancang untuk pemula yang ingin memulai urban farming di rumah dengan investasi minimal. Paket ini menyediakan instalasi sistem hidroponik kecil yang cukup untuk beberapa tanaman sayuran daun seperti selada atau bayam. Dengan paket ini, Anda akan mendapatkan bimbingan singkat mengenai perawatan dasar agar tanaman tumbuh dengan baik. Paket Dasar juga menyediakan pupuk dan nutrisi yang cukup untuk satu bulan awal, serta satu kali konsultasi online untuk mendukung tahap awal Anda dalam bercocok tanam.",
            photo = R.drawable.paket1,
        ),
        Paket(
            id = 6,
            nama_paket = "Paket Menengah",
            harga = "Rp. 1.000.000",
            fitur = "• Instalasi sistem hidroponik sedang\n" +
                    "• 20 Tanaman\n" +
                    "• 3 jenis tanaman pilihan\n" +
                    "• Nutrisi awal untuk 1-2 bulan\n" +
                    "• 2x konsultasi lanjutan secara online",
            detail = "Paket Menengah memberikan solusi lebih lengkap untuk yang sudah berpengalaman atau ingin menambah koleksi tanaman. Paket ini mencakup instalasi sistem hidroponik ukuran sedang yang dapat menampung 20 tanaman sekaligus. Selain itu, Anda bisa memilih hingga 3 jenis tanaman (misalnya selada, bayam, dan basil), yang sudah termasuk pupuk dan nutrisi untuk 1-2 bulan awal. Paket ini juga mencakup dua kali konsultasi lanjutan secara online untuk membantu Anda dalam merawat dan menjaga pertumbuhan tanaman dengan optimal.\n",
            photo = R.drawable.paket2,
        ),
        Paket(
            id = 7,
            nama_paket = "Paket Lengkap",
            harga = "Rp. 2.500.000",
            fitur = "• Instalasi sistem hidroponik otomatis\n" +
                    "• 50 Tanaman\n" +
                    "• 5 jenis tanaman pilihan\n" +
                    "• Alat pengukur nutrisi dan pH\n" +
                    "• Konsultasi 4x, termasuk kunjungan lapangan 1x (opsional)",
            detail = "Paket Lengkap cocok untuk mereka yang serius ingin memiliki kebun urban dengan sistem yang lebih canggih dan terautomasi. Dengan kapasitas hingga 50 tanaman, paket ini mencakup instalasi sistem hidroponik otomatis yang menyertakan irigasi otomatis untuk memudahkan perawatan. Anda juga dapat memilih hingga 5 jenis tanaman, termasuk sayuran atau buah-buahan kecil seperti cabai dan tomat. Selain pupuk dan nutrisi, Anda juga akan mendapatkan alat pengukur pH dan nutrisi agar dapat mengontrol kondisi tanaman dengan lebih baik. Paket ini mencakup hingga empat kali konsultasi, termasuk satu kunjungan lapangan untuk pengecekan langsung (opsional), menjadikannya pilihan tepat bagi mereka yang ingin hasil maksimal.",
            photo = R.drawable.paket3,
        ),
        Paket(
            id = 8,
            nama_paket = "Paket Premium",
            harga = "Rp. 5.000.000",
            fitur = "• Sistem hidroponik dan vertikultur, irigasi otomatis untuk skala bisnis\n" +
                    "• 10 jenis tanaman pilihan\n" +
                    "• Nutrisi, alat monitoring lengkap, dan pelatihan perawatan\n" +
                    "• Konsultasi rutin dan bimbingan bulanan selama 6 bulan",
            detail = "Paket Premium adalah pilihan terbaik untuk Anda yang ingin mengembangkan urban farming dalam skala besar atau bahkan sebagai bisnis kecil. Dengan instalasi sistem hidroponik dan vertikultur yang dilengkapi dengan irigasi otomatis, Anda bisa menanam hingga 10 jenis tanaman, termasuk sayuran, buah-buahan, dan herbal sesuai permintaan. Anda juga mendapatkan nutrisi lengkap, alat monitoring untuk memantau kondisi pH dan nutrisi, serta pelatihan intensif mengenai perawatan tanaman. Selain itu, terdapat bimbingan rutin dan konsultasi bulanan selama 6 bulan, memastikan Anda mendapatkan hasil terbaik. Paket ini memberikan solusi lengkap dengan teknologi dan dukungan profesional untuk urban farming yang sukses.",
            photo = R.drawable.paket4,
        ),
        Paket(
            id = 9,
            nama_paket = "Paket Dasar",
            harga = "Rp. 500.000",
            fitur = "• Instalasi sistem hidroponik kecil (10 tanaman)\n" +
                    "• 1 jenis tanaman\n" +
                    "• Pupuk dan nutrisi awal untuk 1 bulan\n" +
                    "• Konsultasi singkat via online 1x",
            detail = "Paket Dasar dirancang untuk pemula yang ingin memulai urban farming di rumah dengan investasi minimal. Paket ini menyediakan instalasi sistem hidroponik kecil yang cukup untuk beberapa tanaman sayuran daun seperti selada atau bayam. Dengan paket ini, Anda akan mendapatkan bimbingan singkat mengenai perawatan dasar agar tanaman tumbuh dengan baik. Paket Dasar juga menyediakan pupuk dan nutrisi yang cukup untuk satu bulan awal, serta satu kali konsultasi online untuk mendukung tahap awal Anda dalam bercocok tanam.",
            photo = R.drawable.paket1,
        ),
        Paket(
            id = 10,
            nama_paket = "Paket Menengah",
            harga = "Rp. 1.000.000",
            fitur = "• Instalasi sistem hidroponik sedang\n" +
                    "• 20 Tanaman\n" +
                    "• 3 jenis tanaman pilihan\n" +
                    "• Nutrisi awal untuk 1-2 bulan\n" +
                    "• 2x konsultasi lanjutan secara online",
            detail = "Paket Menengah memberikan solusi lebih lengkap untuk yang sudah berpengalaman atau ingin menambah koleksi tanaman. Paket ini mencakup instalasi sistem hidroponik ukuran sedang yang dapat menampung 20 tanaman sekaligus. Selain itu, Anda bisa memilih hingga 3 jenis tanaman (misalnya selada, bayam, dan basil), yang sudah termasuk pupuk dan nutrisi untuk 1-2 bulan awal. Paket ini juga mencakup dua kali konsultasi lanjutan secara online untuk membantu Anda dalam merawat dan menjaga pertumbuhan tanaman dengan optimal.\n",
            photo = R.drawable.paket2,
        ),
        Paket(
            id = 11,
            nama_paket = "Paket Lengkap",
            harga = "Rp. 2.500.000",
            fitur = "• Instalasi sistem hidroponik otomatis\n" +
                    "• 50 Tanaman\n" +
                    "• 5 jenis tanaman pilihan\n" +
                    "• Alat pengukur nutrisi dan pH\n" +
                    "• Konsultasi 4x, termasuk kunjungan lapangan 1x (opsional)",
            detail = "Paket Lengkap cocok untuk mereka yang serius ingin memiliki kebun urban dengan sistem yang lebih canggih dan terautomasi. Dengan kapasitas hingga 50 tanaman, paket ini mencakup instalasi sistem hidroponik otomatis yang menyertakan irigasi otomatis untuk memudahkan perawatan. Anda juga dapat memilih hingga 5 jenis tanaman, termasuk sayuran atau buah-buahan kecil seperti cabai dan tomat. Selain pupuk dan nutrisi, Anda juga akan mendapatkan alat pengukur pH dan nutrisi agar dapat mengontrol kondisi tanaman dengan lebih baik. Paket ini mencakup hingga empat kali konsultasi, termasuk satu kunjungan lapangan untuk pengecekan langsung (opsional), menjadikannya pilihan tepat bagi mereka yang ingin hasil maksimal.",
            photo = R.drawable.paket3,
        ),
        Paket(
            id = 12,
            nama_paket = "Paket Premium",
            harga = "Rp. 5.000.000",
            fitur = "• Sistem hidroponik dan vertikultur, irigasi otomatis untuk skala bisnis\n" +
                    "• 10 jenis tanaman pilihan\n" +
                    "• Nutrisi, alat monitoring lengkap, dan pelatihan perawatan\n" +
                    "• Konsultasi rutin dan bimbingan bulanan selama 6 bulan",
            detail = "Paket Premium adalah pilihan terbaik untuk Anda yang ingin mengembangkan urban farming dalam skala besar atau bahkan sebagai bisnis kecil. Dengan instalasi sistem hidroponik dan vertikultur yang dilengkapi dengan irigasi otomatis, Anda bisa menanam hingga 10 jenis tanaman, termasuk sayuran, buah-buahan, dan herbal sesuai permintaan. Anda juga mendapatkan nutrisi lengkap, alat monitoring untuk memantau kondisi pH dan nutrisi, serta pelatihan intensif mengenai perawatan tanaman. Selain itu, terdapat bimbingan rutin dan konsultasi bulanan selama 6 bulan, memastikan Anda mendapatkan hasil terbaik. Paket ini memberikan solusi lengkap dengan teknologi dan dukungan profesional untuk urban farming yang sukses.",
            photo = R.drawable.paket4,
        ),
    )

    val gallery = listOf(
        Gallery(
            id = 1,
            name = "Sawi",
            photo = R.drawable.sawi
        ),
        Gallery(
            id = 2,
            name = "Cabe Rawit",
            photo = R.drawable.cabe_rawit
        ),
        Gallery(
            id = 3,
            name = "Bayam",
            photo = R.drawable.bayam
        ),
        Gallery(
            id = 4,
            name = "Kangkung",
            photo = R.drawable.kangkung
        ),Gallery(
            id = 5,
            name = "Tomat",
            photo = R.drawable.tomat
        ),Gallery(
            id = 6,
            name = "Terong",
            photo = R.drawable.terong
        ),Gallery(
            id = 7,
            name = "Timun",
            photo = R.drawable.timun
        ),Gallery(
            id = 8,
            name = "Pare",
            photo = R.drawable.pare
        ),Gallery(
            id = 9,
            name = "Pete",
            photo = R.drawable.pete
        ),Gallery(
            id = 10,
            name = "Kacang Panjang",
            photo = R.drawable.kacang_panjang
        ),







    )
}