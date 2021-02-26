package com.rifdahalf.pagipetangdzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_keutamaan_dzikir.*

class KeutamaanDzikir : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keutamaan_dzikir)

        iv_arrow_back.setOnClickListener(this)
        iv_btn_share.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_arrow_back -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.iv_btn_share -> {
                val share = tv_keutamaan_1.text.toString()
                val share_arab = tv_arab_keutamaan_1.text.toString()
                val share_arti = tv_arti_keutamaan_1.text.toString()


                val shareIntent = Intent()
                shareIntent.action = Intent.ACTION_SEND
                shareIntent.type = "text/plain"
                shareIntent.putExtra(
                    Intent.EXTRA_TEXT,
                    "Assalamu'alaikum! Aloha Sobat Muslim & Muslimah \n \nSudah Baca Dzikir Pagi & Petang?\n" +
                            " \n$share\n$share_arab\n$share_arti\n \nYuk baca dzikir Pagi & Petang dan lebih tahu keutamaan lainnya dengan mendownload aplikasi *Dzikir Pagi & Petang sesuai Al-qur'an dan Sunnah* disini:\n\nhttps://play.google.com/store/apps/details?id=com.rifdahalf.pagipetangdzikirapp"
                )
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Keutamaan Dzikir Pagi Petang")
                startActivity(Intent.createChooser(shareIntent, "Share text via"))
            }
        }
    }
}