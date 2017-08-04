package com.tools.entity;

import java.util.List;

/**
 * Created by 浅子影 on 2017/4/23.
 */

public class Test_CompanyInfo {

    /**
     * ErrorInfo : {"ErrorCode":"0","ErrorMessage":""}
     * Data : [{"panyid":5,"id":80311001,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"宏源热电","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":1,"rowid":1},{"panyid":12,"id":80311002,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"华栾制药","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"25","industryName":"医药","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":1,"rowid":2},{"panyid":7,"id":80311003,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"大成二部","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":3},{"panyid":9,"id":80311004,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"大成一部","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":4},{"panyid":10,"id":80311005,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"新诺威","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":5},{"panyid":4,"id":80311006,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"新宇三阳","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":6},{"panyid":8,"id":80311007,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"圣雪葡萄糖","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":7},{"panyid":11,"id":80311008,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"神威药业","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"25","industryName":"医药","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":8},{"panyid":6,"id":80311010,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"泽兴","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":9},{"panyid":13,"id":80311011,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"栾城污水处理厂","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"14","industryName":"玻璃","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":10},{"panyid":14,"id":80311012,"cityId":11,"cityName":"石家庄市","zoneId":24,"zoneName":"栾城区","name":"科硕化工","OfficerName":"","phone":"","address":"","sybhdjb":"一级","mobilename":"","mobilePhone":"","cz":"","dh":null,"yzbm":"","dzyx":"","qyzclxID":100,"qygm":"大型","skxz":"国控","yxzt":"生产","tcny":"","icCard":null,"longitude":0,"latitude":0,"affiliation":"","companyType":null,"industryType":"16","industryName":"化工","basin":"请选择","pollutionType":"15","pollutionName":"废水","pollutionAdress":null,"Administrativecode":"","sign":"","pollutionLevel":"请选择","Administrator":"","connection_state":0,"rowid":11}]
     */

    private ErrorInfoBean ErrorInfo;
    private List<DataBean> Data;

    public ErrorInfoBean getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(ErrorInfoBean ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class ErrorInfoBean {
        /**
         * ErrorCode : 0
         * ErrorMessage :
         */

        private String ErrorCode;
        private String ErrorMessage;

        public String getErrorCode() {
            return ErrorCode;
        }

        public void setErrorCode(String ErrorCode) {
            this.ErrorCode = ErrorCode;
        }

        public String getErrorMessage() {
            return ErrorMessage;
        }

        public void setErrorMessage(String ErrorMessage) {
            this.ErrorMessage = ErrorMessage;
        }
    }

    public static class DataBean {
        /**
         * panyid : 5
         * id : 80311001
         * cityId : 11
         * cityName : 石家庄市
         * zoneId : 24
         * zoneName : 栾城区
         * name : 宏源热电
         * OfficerName :
         * phone :
         * address :
         * sybhdjb : 一级
         * mobilename :
         * mobilePhone :
         * cz :
         * dh : null
         * yzbm :
         * dzyx :
         * qyzclxID : 100
         * qygm : 大型
         * skxz : 国控
         * yxzt : 生产
         * tcny :
         * icCard : null
         * longitude : 0.0
         * latitude : 0.0
         * affiliation :
         * companyType : null
         * industryType : 14
         * industryName : 玻璃
         * basin : 请选择
         * pollutionType : 15
         * pollutionName : 废水
         * pollutionAdress : null
         * Administrativecode :
         * sign :
         * pollutionLevel : 请选择
         * Administrator :
         * connection_state : 1
         * rowid : 1
         */

        private int panyid;
        private int id;
        private int cityId;
        private String cityName;
        private int zoneId;
        private String zoneName;
        private String name;
        private String OfficerName;
        private String phone;
        private String address;
        private String sybhdjb;
        private String mobilename;
        private String mobilePhone;
        private String cz;
        private Object dh;
        private String yzbm;
        private String dzyx;
        private int qyzclxID;
        private String qygm;
        private String skxz;
        private String yxzt;
        private String tcny;
        private Object icCard;
        private double longitude;
        private double latitude;
        private String affiliation;
        private Object companyType;
        private String industryType;
        private String industryName;
        private String basin;
        private String pollutionType;
        private String pollutionName;
        private Object pollutionAdress;
        private String Administrativecode;
        private String sign;
        private String pollutionLevel;
        private String Administrator;
        private int connection_state;
        private int rowid;

        public int getPanyid() {
            return panyid;
        }

        public void setPanyid(int panyid) {
            this.panyid = panyid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getCityId() {
            return cityId;
        }

        public void setCityId(int cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

        public int getZoneId() {
            return zoneId;
        }

        public void setZoneId(int zoneId) {
            this.zoneId = zoneId;
        }

        public String getZoneName() {
            return zoneName;
        }

        public void setZoneName(String zoneName) {
            this.zoneName = zoneName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOfficerName() {
            return OfficerName;
        }

        public void setOfficerName(String OfficerName) {
            this.OfficerName = OfficerName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getSybhdjb() {
            return sybhdjb;
        }

        public void setSybhdjb(String sybhdjb) {
            this.sybhdjb = sybhdjb;
        }

        public String getMobilename() {
            return mobilename;
        }

        public void setMobilename(String mobilename) {
            this.mobilename = mobilename;
        }

        public String getMobilePhone() {
            return mobilePhone;
        }

        public void setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
        }

        public String getCz() {
            return cz;
        }

        public void setCz(String cz) {
            this.cz = cz;
        }

        public Object getDh() {
            return dh;
        }

        public void setDh(Object dh) {
            this.dh = dh;
        }

        public String getYzbm() {
            return yzbm;
        }

        public void setYzbm(String yzbm) {
            this.yzbm = yzbm;
        }

        public String getDzyx() {
            return dzyx;
        }

        public void setDzyx(String dzyx) {
            this.dzyx = dzyx;
        }

        public int getQyzclxID() {
            return qyzclxID;
        }

        public void setQyzclxID(int qyzclxID) {
            this.qyzclxID = qyzclxID;
        }

        public String getQygm() {
            return qygm;
        }

        public void setQygm(String qygm) {
            this.qygm = qygm;
        }

        public String getSkxz() {
            return skxz;
        }

        public void setSkxz(String skxz) {
            this.skxz = skxz;
        }

        public String getYxzt() {
            return yxzt;
        }

        public void setYxzt(String yxzt) {
            this.yxzt = yxzt;
        }

        public String getTcny() {
            return tcny;
        }

        public void setTcny(String tcny) {
            this.tcny = tcny;
        }

        public Object getIcCard() {
            return icCard;
        }

        public void setIcCard(Object icCard) {
            this.icCard = icCard;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public String getAffiliation() {
            return affiliation;
        }

        public void setAffiliation(String affiliation) {
            this.affiliation = affiliation;
        }

        public Object getCompanyType() {
            return companyType;
        }

        public void setCompanyType(Object companyType) {
            this.companyType = companyType;
        }

        public String getIndustryType() {
            return industryType;
        }

        public void setIndustryType(String industryType) {
            this.industryType = industryType;
        }

        public String getIndustryName() {
            return industryName;
        }

        public void setIndustryName(String industryName) {
            this.industryName = industryName;
        }

        public String getBasin() {
            return basin;
        }

        public void setBasin(String basin) {
            this.basin = basin;
        }

        public String getPollutionType() {
            return pollutionType;
        }

        public void setPollutionType(String pollutionType) {
            this.pollutionType = pollutionType;
        }

        public String getPollutionName() {
            return pollutionName;
        }

        public void setPollutionName(String pollutionName) {
            this.pollutionName = pollutionName;
        }

        public Object getPollutionAdress() {
            return pollutionAdress;
        }

        public void setPollutionAdress(Object pollutionAdress) {
            this.pollutionAdress = pollutionAdress;
        }

        public String getAdministrativecode() {
            return Administrativecode;
        }

        public void setAdministrativecode(String Administrativecode) {
            this.Administrativecode = Administrativecode;
        }

        public String getSign() {
            return sign;
        }

        public void setSign(String sign) {
            this.sign = sign;
        }

        public String getPollutionLevel() {
            return pollutionLevel;
        }

        public void setPollutionLevel(String pollutionLevel) {
            this.pollutionLevel = pollutionLevel;
        }

        public String getAdministrator() {
            return Administrator;
        }

        public void setAdministrator(String Administrator) {
            this.Administrator = Administrator;
        }

        public int getConnection_state() {
            return connection_state;
        }

        public void setConnection_state(int connection_state) {
            this.connection_state = connection_state;
        }

        public int getRowid() {
            return rowid;
        }

        public void setRowid(int rowid) {
            this.rowid = rowid;
        }
    }
}
