package id.bayu.mainan.activity.report.presenter

import id.bayu.mainan.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}