package com.rifdahalf.pagipetangdzikirapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.rifdahalf.pagipetangdzikirapp.CustomZoom.CenterZoomLayout
import com.rifdahalf.pagipetangdzikirapp.DzikirAdapter.DzikirAdapter
import com.rifdahalf.pagipetangdzikirapp.Model.Dzikir
import kotlinx.android.synthetic.main.activity_keutamaan_dzikir.*
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.main_activity.ll_keutamaan_dzikir

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        iv_dzikir_pagi.setOnClickListener(this)
        iv_dzikir_petang.setOnClickListener(this)
        tv_dzikir_pagi.setOnClickListener(this)
        tv_dzikir_petang.setOnClickListener(this)
        ll_keutamaan_dzikir.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.iv_dzikir_pagi -> {
                val intent = Intent(this, DzikirPagi::class.java)
                startActivity(intent)
            }
            R.id.iv_dzikir_petang -> {
                val intent = Intent(this, DzikirPetang::class.java)
                startActivity(intent)
            }
            R.id.tv_dzikir_pagi -> {
                val intent = Intent(this, DzikirPagi::class.java)
                startActivity(intent)
            }
            R.id.tv_dzikir_petang -> {
                val intent = Intent(this, DzikirPetang::class.java)
                startActivity(intent)
            }
            R.id.ll_keutamaan_dzikir -> {
                val intent = Intent(this, KeutamaanDzikir::class.java)
                startActivity(intent)
            }
        }
    }
}