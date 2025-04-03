package LUTools;

//=======================================================================================
/**
 TVersionInfo.java
 */
//=======================================================================================

class TVersionInfo_TEST {
    String LogPath = "";
    int Log = 30;
    String LogDir = "";
    String LogFile = "";
    String Userid = "";
}

public class TVersionInfo {
    public String LUClassName = "TVersionInfo";
    private String FFileName = "";
    private String FInfo = "";
    private int FFileDate = 0;
    private String FFileVersion = "";
    private int FFileInfoSize = 0;
    private int FInfoSize = 0;
    private String FFileInfo = "";
    private String FCompanyName = "";
    private String FFileDescription = "";
    private String FInternalName = "";
    private String FLegalTrademarks = "";
    private String FLegalCopyright = "";
    private String FProductName = "";
    private String FOriginalFilename = "";
    private String FProductVersion = "";
    private String FComments = "";

    private String lang = "";
    private String codepage = "";

    private String FTmp = "";
    private String FTransInfo = "";
    private int FTransInfoSize = 0;
    //--------------------------------------------------
    // constructor
    //--------------------------------------------------
    public TVersionInfo() {
        ;
    }
    //--------------------------------------------------
    // destructor
    //--------------------------------------------------
    void Finalize () {
        ;
    }

    //--------------------------------------------------
    // //@property FileName
    //--------------------------------------------------
    // getter
    //@property
    public String getFileName() {
        return this.FFileName;
    }

    // setter
    //@FileName.setter
    public void setFileName(String Value) {
        this.FFileName = Value;
        String[] propNames = {"Comments", "InternalName", "ProductName",
                "CompanyName", "LegalCopyright", "ProductVersion",
                "FileDescription", "LegalTrademarks", "PrivateBuild",
                "FileVersion", "OriginalFilename", "SpecialBuild"};

        //String[] props = {"FixedFileInfo" = None, "StringFileInfo" = None, "FileVersion" = None};
/*
        if Value == "":
            return
        self.__FFileName = Value
        // Get the size of the FileVersionInformatioin
        if self.__FInfoSize > 0:
            pass
        //self.__FInfoSize = win32api.GetFileVersionInfoSize(self.__FFileName.encode(), None)
        // If InfoSize = 0, then the file may not exist, or
        // it may not have file version information in it.
        //if self.__FInfoSize == 0:
        //    raise Exception.Create("Can""t get file version information for "+self.__FFileName)

        //file modification
        //self.__FFileDate = FileDateToDateTime(FileAge(Value))
        LFileTimeSource = os.path.getmtime(self.__FFileName)
        //convert timestamp into DateTime object
        self.__FFileDate = datetime.datetime.fromtimestamp(LFileTimeSource)

        // Get the information
        //self.__FInfo = win32api.GetFileVersionInfo(self.__FFileName, 0, self.__FInfoSize, self.__FInfo)
        // backslash as parm returns dictionary of numeric info corresponding to VS_FIXEDFILEINFO struc
        self.__FInfo = win32api.GetFileVersionInfo (self.__FFileName, "\\")
        props ["FixedFileInfo"] = self.__FInfo
        props ["FileVersion"] = "%d.%d.%d.%d" % (self.__FInfo ["FileVersionMS"] / 65536,
                                                 self.__FInfo ["FileVersionMS"] % 65536,
                                                 self.__FInfo ["FileVersionLS"] / 65536,
                                                 self.__FInfo ["FileVersionLS"] % 65536)
        self.__FFileVersion = props ["FileVersion"]

        // \VarFileInfo\Translation returns list of available (language, codepage)
        // pairs that can be used to retreive string info. We are using only the first pair.
        self.__lang, self.__codepage = win32api.GetFileVersionInfo (self.__FFileName, "\\VarFileInfo\\Translation") [0]
        //print ("__lang = ",self.__lang)
        //print ("__codepage = ", self.__codepage)

        // any other must be of the form \StringfileInfo\%04X%04X\parm_name, middle
        // two are language/codepage pair returned from above
        strInfo = {}
        for propName in propNames:
            strInfoPath = u"\\StringFileInfo\\%04X%04X\\%s" % (self.__lang, self.__codepage, propName)
            //// print str_info
            strInfo [propName] = win32api.GetFileVersionInfo (self.__FFileName, strInfoPath)
        props ["StringFileInfo"] = strInfo
        self.__FCompanyName = strInfo ["CompanyName"]
        self.__FFileDescription = strInfo ["FileDescription"]
        self.__FInternalName = strInfo ["InternalName"]
        self.__FLegalCopyright = strInfo ["LegalCopyright"]
        self.__FLegalTrademarks = strInfo ["LegalTrademarks"]
        self.__FOriginalFilename = strInfo ["OriginalFilename"]
        self.__FProductName = strInfo ["ProductName"]
        self.__FProductVersion = strInfo ["ProductVersion"]
        self.__FComments = strInfo ["Comments"]
 */
    }

    //--------------------------------------------------
    // //@property Major1
    //--------------------------------------------------
    // getter
    //@property
    public int getMajor1() {
        int LResult = 0; // (int) (this.FInfo["FileVersionMS"] / 65536);
        return LResult;
    }

    //--------------------------------------------------
    // //@property Major2
    //--------------------------------------------------
    // getter
    //@property
    public int getMajor2() {
        int LResult =  0; // (int) (this.FInfo["FileVersionMS"] % 65536);
        return LResult;
    }

    //--------------------------------------------------
    // //@property Minor1
    //--------------------------------------------------
    // getter
    //@property
    public int getMinor1() {
        int LResult =  0; // (int) (this.FInfo["FileVersionLS"] / 65536);
        return LResult;
    }

    //--------------------------------------------------
    // //@property Minor2
    //--------------------------------------------------
    // getter
    //@property
    public int getMinor2() {
        int LResult =  0; // (int) (this.FInfo["FileVersionLS"] % 65536);
        return LResult;
    }

    //--------------------------------------------------
    // //@property Lang1
    //--------------------------------------------------
    // getter
    //@property
    public String getLang1() {
        String LResult = ""; //this.FTransInfo.dwLang1;
        return LResult;
    }

    //--------------------------------------------------
    // //@property Lang2
    //--------------------------------------------------
    // getter
    //@property
    public String getLang2() {
        String LResult = ""; //this.FTransInfo.dwLang2;
        return LResult;
    }

    //--------------------------------------------------
    // //@property LangCharSet
    //--------------------------------------------------
    // getter
    //@property
    public String getLangCharSet() {
        //Result = IntToHex(Lang1,4)+IntToHex(Lang2,4);
        String LResult = "";
        return LResult;
    }

    //--------------------------------------------------
    // //@property FileVersion
    //--------------------------------------------------
    // getter
    //@property
    public String getFileVersion() {
        String LResult = this.FFileVersion;
        return LResult;
    }

    //--------------------------------------------------
    // //@property FileDate
    //--------------------------------------------------
    // getter
    //@property
    public int getFileDate() {
        int LResult = this.FFileDate;
        return LResult;
    }

    //--------------------------------------------------
    // //@property CompanyName
    //--------------------------------------------------
    // getter
    //@property
    public String getCompanyName() {
        String LResult = this.FCompanyName;
        return LResult;
    }

    //--------------------------------------------------
    // //@property FileDescription
    //--------------------------------------------------
    // getter
    //@property
    public String getFileDescription() {
        String LResult = this.FFileDescription;
        return LResult;
    }

    //--------------------------------------------------
    // //@property InternalName
    //--------------------------------------------------
    // getter
    //@property
    public String getInternalName() {
        String LResult = this.FInternalName;
        return LResult;
    }

    //--------------------------------------------------
    // //@property LegalCopyright
    //--------------------------------------------------
    // getter
    //@property
    public String getLegalCopyright() {
        String LResult = this.FLegalCopyright;
        return LResult;
    }

    //--------------------------------------------------
    // //@property LegalTrademarks
    //--------------------------------------------------
    // getter
    //@property
    public String getLegalTrademarks() {
        String LResult = this.FLegalTrademarks;
        return LResult;
    }

    //--------------------------------------------------
    // //@property OriginalFilename
    //--------------------------------------------------
    // getter
    //@property
    public String getOriginalFilename() {
        String LResult = this.FOriginalFilename;
        return LResult;
    }

    //--------------------------------------------------
    // //@property ProductName
    //--------------------------------------------------
    // getter
    //@property
    public String getProductName() {
        String LResult = this.FProductName;
        return LResult;
    }

    //--------------------------------------------------
    // //@property ProductVersion
    //--------------------------------------------------
    // getter
    //@property
    public String getProductVersion() {
        String LResult = this.FProductVersion;
        return LResult;
    }

    //--------------------------------------------------
    // //@property Comments
    //--------------------------------------------------
    // getter
    //@property
    public String getComments() {
        String LResult = this.FComments;
        return LResult;
    }
}
