package com.satmatgroup.mewarpe.aeps_activities

data class AepsCommisionHistoryModel(
    val account_holder_name: String,
    val account_number: String,
    val aeps_cus_id: String,
    val aeps_cus_insert_id: String,
    val aeps_date_time: String,
    val aeps_id: String,
    val aeps_permission: String,
    val aeps_txn_agentid: String,
    val aeps_txn_clbal: String,
    val aeps_txn_comment: String,
    val aeps_txn_crdt: String,
    val aeps_txn_date: String,
    val aeps_txn_dbdt: String,
    val aeps_txn_id: String,
    val aeps_txn_opbal: String,
    val aeps_txn_recrefid: String,
    val aeps_txn_type: String,
    val amount: String,
    val apiclid: String,
    val bank_name: String,
    val call_back: String,
    val category: String,
    val comm_package_id: String,
    val commission_gst: String,
    val commission_net: String,
    val commission_tds: String,
    val cus_added_date: String,
    val cus_address_line_1: String,
    val cus_address_line_2: String,
    val cus_company_name: String,
    val cus_email: String,
    val cus_first_name: String,
    val cus_id: String,
    val cus_ip: String,
    val cus_last_name: String,
    val cus_mobile: String,
    val cus_status: String,
    val cus_type: String,
    val date_of_birth: String,
    val dmt_dispute_status: String,
    val id_proof: String,
    val ifsc_code: String,
    val pan_number: String,
    val pincode: String,
    val prefix: String,
    val profile_img: String,
    val status: String,
    val token: String,
    val total_commission: String,
    val transactionType: String,
    val transaction_ref_id: String,
    val txn_ip: String
)