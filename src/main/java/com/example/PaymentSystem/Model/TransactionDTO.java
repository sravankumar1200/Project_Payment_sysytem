package com.example.PaymentSystem.Model;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
//@Entity
public class TransactionDTO {
   // @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
    private String custid;
    //@Transient
    private String bic;
    //@Transient



 private Double amount;
    private  String messagecode;
    private String transfertypecode;
 private String reciver_ac_name;
 private Long reciver_ac_no;

 public String getCustid() {
  return custid;
 }

 public void setCustid(String custid) {
  this.custid = custid;
 }

 public String getBic() {
  return bic;
 }

 public void setBic(String bic) {
  this.bic = bic;
 }

 public Double getAmount() {
  return amount;
 }

 public void setAmount(Double amount) {
  this.amount = amount;
 }

 public String getMessagecode() {
  return messagecode;
 }

 public void setMessagecode(String messagecode) {
  this.messagecode = messagecode;
 }

 public String getTransfertypecode() {
  return transfertypecode;
 }

 public void setTransfertypecode(String transfertypecode) {
  this.transfertypecode = transfertypecode;
 }

 public String getReciver_ac_name() {
  return reciver_ac_name;
 }

 public void setReciver_ac_name(String reciver_ac_name) {
  this.reciver_ac_name = reciver_ac_name;
 }

 public Long getReciver_ac_no() {
  return reciver_ac_no;
 }

 public void setReciver_ac_no(Long reciver_ac_no) {
  this.reciver_ac_no = reciver_ac_no;
 }
}


