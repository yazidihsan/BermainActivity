package com.example.coder.dongenginteraktif.model;

import com.example.coder.dongenginteraktif.R;

public class Dongeng {
private Halaman[] mHalamans;


public Dongeng(){
    mHalamans = new Halaman[7];

    mHalamans[0] = new Halaman(
            R.drawable.gambar0, "Indonesia membutuhkan programmer IOT untuk bisa bersaing " +
            "dengan negara maju.", new Pilihan("mau bersaing kah?",1),
            new Pilihan("menyerah saja.",2)
    );
    mHalamans[1] = new Halaman(
            R.drawable.gambar1, "SDM Programmer seharusnya ditingkatkan biaya untuk pelatihan " +
            "sertifikasi agar mampu bersaing.", new Pilihan("setuju atau tidak?",3),
            new Pilihan("pemborosan APBN negara saja lu tong.",4)
    );
    mHalamans[2] = new Halaman(
            R.drawable.gambar2, "Masih banyak bidang lain yang lebih diunggulkan dalam " +
            "persaingan global", new Pilihan("tidak usah terlalu pusing",4),
            new Pilihan("ada alternatif lain.",6)
    );
    mHalamans[3] = new Halaman(
            R.drawable.gambar3, "Sertifikasi profesimembuktikan SDM IT unggul dalam persaingan " +
            "global", new Pilihan("mulai kapan?",4),
            new Pilihan("kurang pas",5)
    );
    mHalamans[4] = new Halaman(
            R.drawable.gambar0, "APBN lebih dialokasian pada sosialisasi ketenagakerjaan " +
            "bagi kalangan menengah ke bawah.", new Pilihan("apakah begitu seharusnya?",5),
            new Pilihan("mungkin ada pendapat lain",6)
    );
    mHalamans[5] = new Halaman(
            R.drawable.gambar0, "Indonesia membutuhkan programmer IOT untuk bisa bersaing " +
            "dengan negara maju."
    );
    mHalamans[6] = new Halaman(
            R.drawable.gambar0, "Indonesia membutuhkan programmer IOT untuk bisa bersaing " +
            "dengan negara maju."
    );



}
}
