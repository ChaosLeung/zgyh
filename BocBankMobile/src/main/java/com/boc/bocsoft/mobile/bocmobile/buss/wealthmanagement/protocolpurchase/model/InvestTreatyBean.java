package com.boc.bocsoft.mobile.bocmobile.buss.wealthmanagement.protocolpurchase.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 4.60 060 产品投资协议查询--响应
 * Created by liuweidong on 2016/11/6.
 */
public class InvestTreatyBean implements Parcelable, Comparable<InvestTreatyBean> {
    private String periodBal;// 份额持有天数
    private String isNeedPur;// 购买选项 0：期初购买1：协议不购买
    private String isNeedRed;// 赎回选项 0：到期赎回1：协议不赎回
    private String kind;// 产品性质 0:结构性理财产品1:类基金理财产品
    private String agrCode;// 产品协议编号
    private String agrName;// 产品协议名称
    private String agrType;// 协议类型 1：智能投资2：定时定额投资3：周期滚续投资4：余额理财投资
    private String proid;// 产品ID
    private String proNam;// 产品名称
    private String instType;// 投资方式 1:周期连续协议2:周期不连续协议3:多次购买协议4:多次赎回协议5:定时定额投资6:余额理财投资7:周期滚续协议8:业绩基准周期滚续
    private String periodAgr;// 当协议类型为智能投资，那么该字段返回相应周期频率。
    private String periodPur;// 剩余可购买期数频率 如果协议类型为智能投资，那么该字段返回相应期数频率，否则返回空
    private String proCur;// 产品币种

    public String getPeriodBal() {
        return periodBal;
    }

    public void setPeriodBal(String periodBal) {
        this.periodBal = periodBal;
    }

    public String getIsNeedPur() {
        return isNeedPur;
    }

    public void setIsNeedPur(String isNeedPur) {
        this.isNeedPur = isNeedPur;
    }

    public String getIsNeedRed() {
        return isNeedRed;
    }

    public void setIsNeedRed(String isNeedRed) {
        this.isNeedRed = isNeedRed;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getAgrCode() {
        return agrCode;
    }

    public void setAgrCode(String agrCode) {
        this.agrCode = agrCode;
    }

    public String getAgrName() {
        return agrName;
    }

    public void setAgrName(String agrName) {
        this.agrName = agrName;
    }

    public String getAgrType() {
        return agrType;
    }

    public void setAgrType(String agrType) {
        this.agrType = agrType;
    }

    public String getProid() {
        return proid;
    }

    public void setProid(String proid) {
        this.proid = proid;
    }

    public String getProNam() {
        return proNam;
    }

    public void setProNam(String proNam) {
        this.proNam = proNam;
    }

    public String getInstType() {
        return instType;
    }

    public void setInstType(String instType) {
        this.instType = instType;
    }

    public String getPeriodAgr() {
        return periodAgr;
    }

    public void setPeriodAgr(String periodAgr) {
        this.periodAgr = periodAgr;
    }

    public String getPeriodPur() {
        return periodPur;
    }

    public void setPeriodPur(String periodPur) {
        this.periodPur = periodPur;
    }

    public String getProCur() {
        return proCur;
    }

    public void setProCur(String proCur) {
        this.proCur = proCur;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.periodBal);
        dest.writeString(this.isNeedPur);
        dest.writeString(this.isNeedRed);
        dest.writeString(this.kind);
        dest.writeString(this.agrCode);
        dest.writeString(this.agrName);
        dest.writeString(this.agrType);
        dest.writeString(this.proid);
        dest.writeString(this.proNam);
        dest.writeString(this.instType);
        dest.writeString(this.periodAgr);
        dest.writeString(this.periodPur);
        dest.writeString(this.proCur);
    }

    public InvestTreatyBean() {
    }

    protected InvestTreatyBean(Parcel in) {
        this.periodBal = in.readString();
        this.isNeedPur = in.readString();
        this.isNeedRed = in.readString();
        this.kind = in.readString();
        this.agrCode = in.readString();
        this.agrName = in.readString();
        this.agrType = in.readString();
        this.proid = in.readString();
        this.proNam = in.readString();
        this.instType = in.readString();
        this.periodAgr = in.readString();
        this.periodPur = in.readString();
        this.proCur = in.readString();
    }

    public static final Parcelable.Creator<InvestTreatyBean> CREATOR = new Parcelable.Creator<InvestTreatyBean>() {
        @Override
        public InvestTreatyBean createFromParcel(Parcel source) {
            return new InvestTreatyBean(source);
        }

        @Override
        public InvestTreatyBean[] newArray(int size) {
            return new InvestTreatyBean[size];
        }
    };

    @Override
    public int compareTo(InvestTreatyBean another) {
        if (Integer.valueOf(agrType.trim()) > Integer.valueOf(another.getAgrType().trim())) {
            return 1;
        } else {
            if (Integer.valueOf(agrType.trim()) == Integer.valueOf(another.getAgrType().trim())) {
                if (Integer.valueOf(instType.trim()) > Integer.valueOf(another.getInstType().trim())) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return -1;
        }
    }
}
