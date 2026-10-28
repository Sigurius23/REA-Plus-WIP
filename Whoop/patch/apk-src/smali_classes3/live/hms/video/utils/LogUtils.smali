.class public final Llive/hms/video/utils/LogUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010(R$\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008*\u0010+\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R$\u00100\u001a\u0004\u0018\u00010\u00088\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103\"\u0004\u00084\u00105R\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00086\u0010\"\u00a8\u00067"
    }
    d2 = {
        "Llive/hms/video/utils/LogUtils;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ljava/io/File;",
        "givenSessionFile",
        "Ljava/io/FileWriter;",
        "initiateLogging",
        "(Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;",
        "",
        "dirName",
        "filename",
        "makeLogFile",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;",
        "Ll83/a0;",
        "closeLogging",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "frameworkInfo",
        "staticFileWriterStart",
        "(Landroid/content/Context;Llive/hms/video/sdk/models/FrameworkInfo;)Ljava/lang/String;",
        "saveLogsToFile",
        "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;",
        "getDirPath",
        "(Landroid/content/Context;)Ljava/io/File;",
        "checkDirSizeAndRemove",
        "(Landroid/content/Context;)V",
        "",
        "DEVICE_INFO",
        "[Ljava/lang/String;",
        "getDEVICE_INFO",
        "()[Ljava/lang/String;",
        "MAX_DIR_SIZE",
        "Ljava/lang/String;",
        "",
        "DEFAULT_DIR_SIZE",
        "J",
        "Ljava/text/SimpleDateFormat;",
        "logFileNameDateFormatter",
        "Ljava/text/SimpleDateFormat;",
        "logDateFormatter",
        "currentSessionFile",
        "Ljava/io/File;",
        "getCurrentSessionFile",
        "()Ljava/io/File;",
        "setCurrentSessionFile",
        "(Ljava/io/File;)V",
        "currentSessionFileWriter",
        "Ljava/io/FileWriter;",
        "getCurrentSessionFileWriter",
        "()Ljava/io/FileWriter;",
        "setCurrentSessionFileWriter",
        "(Ljava/io/FileWriter;)V",
        "TAG",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final DEFAULT_DIR_SIZE:J = 0xf4240L

.field private static final DEVICE_INFO:[Ljava/lang/String;

.field public static final INSTANCE:Llive/hms/video/utils/LogUtils;

.field public static final MAX_DIR_SIZE:Ljava/lang/String; = "max_dir_size"

.field private static final TAG:Ljava/lang/String; = "LogUtils"

.field private static currentSessionFile:Ljava/io/File;

.field private static currentSessionFileWriter:Ljava/io/FileWriter;

.field private static final logDateFormatter:Ljava/text/SimpleDateFormat;

.field private static final logFileNameDateFormatter:Ljava/text/SimpleDateFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Llive/hms/video/utils/LogUtils;

    invoke-direct {v0}, Llive/hms/video/utils/LogUtils;-><init>()V

    sput-object v0, Llive/hms/video/utils/LogUtils;->INSTANCE:Llive/hms/video/utils/LogUtils;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Android SDK: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Release: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Brand: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Device: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Id: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Hardware: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Manufacturer: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Model: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Product: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    filled-new-array/range {v2 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Llive/hms/video/utils/LogUtils;->DEVICE_INFO:[Ljava/lang/String;

    new-instance v0, Ljava/text/SimpleDateFormat;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "yyyy.MM.dd-HH:mm:ss.SSS"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Llive/hms/video/utils/LogUtils;->logFileNameDateFormatter:Ljava/text/SimpleDateFormat;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v2, "HH:mm:ss"

    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    sput-object v0, Llive/hms/video/utils/LogUtils;->logDateFormatter:Ljava/text/SimpleDateFormat;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/io/File;Ljava/io/File;)I
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/utils/LogUtils;->checkDirSizeAndRemove$lambda$5$lambda$2(Ljava/io/File;Ljava/io/File;)I

    move-result p0

    return p0
.end method

.method public static final synthetic access$getLogDateFormatter$p()Ljava/text/SimpleDateFormat;
    .locals 1

    sget-object v0, Llive/hms/video/utils/LogUtils;->logDateFormatter:Ljava/text/SimpleDateFormat;

    return-object v0
.end method

.method public static final synthetic access$initiateLogging(Llive/hms/video/utils/LogUtils;Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;
    .locals 0

    invoke-direct {p0, p1, p2}, Llive/hms/video/utils/LogUtils;->initiateLogging(Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/utils/c;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1, p2}, Llive/hms/video/utils/LogUtils;->checkDirSizeAndRemove$lambda$5$lambda$3(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method private static final checkDirSizeAndRemove$lambda$5$lambda$2(Ljava/io/File;Ljava/io/File;)I
    .locals 2

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result p0

    return p0
.end method

.method private static final checkDirSizeAndRemove$lambda$5$lambda$3(Lc93/m;Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private final initiateLogging(Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;
    .locals 1

    if-nez p2, :cond_0

    const-string p2, "logs"

    const-string v0, "session_log"

    invoke-direct {p0, p1, p2, v0}, Llive/hms/video/utils/LogUtils;->makeLogFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    :cond_0
    sput-object p2, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    new-instance p1, Ljava/io/FileWriter;

    sget-object p2, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    sput-object p1, Llive/hms/video/utils/LogUtils;->currentSessionFileWriter:Ljava/io/FileWriter;

    return-object p1
.end method

.method private final makeLogFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 4

    new-instance v0, Ljava/io/File;

    invoke-virtual {p1, p2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const-string p2, ""

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Llive/hms/video/utils/LogUtils;->logFileNameDateFormatter:Ljava/text/SimpleDateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".log"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public final checkDirSizeAndRemove(Landroid/content/Context;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "max_dir_size"

    const-wide/32 v2, 0xf4240

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    new-instance v2, Ljava/io/File;

    const-string v3, "logs"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const-string v3, ""

    invoke-direct {v2, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v2, Llive/hms/video/utils/c;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Llive/hms/video/utils/c;-><init>(I)V

    new-instance v3, Lea2/l;

    const/16 v4, 0xa

    invoke-direct {v3, v2, v4}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    array-length v2, p1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_1

    aget-object v6, p1, v5

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v7

    add-long/2addr v3, v7

    cmp-long v7, v3, v0

    if-lez v7, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final closeLogging()V
    .locals 2

    sget-object v0, Llive/hms/video/utils/LogUtils;->currentSessionFileWriter:Ljava/io/FileWriter;

    if-eqz v0, :cond_0

    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    invoke-virtual {v1}, Llive/hms/video/utils/HMSLogger;->removeInjectedLoggable()V

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    const/4 v0, 0x0

    sput-object v0, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    sput-object v0, Llive/hms/video/utils/LogUtils;->currentSessionFileWriter:Ljava/io/FileWriter;

    :cond_0
    return-void
.end method

.method public final getCurrentSessionFile()Ljava/io/File;
    .locals 1

    sget-object v0, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    return-object v0
.end method

.method public final getCurrentSessionFileWriter()Ljava/io/FileWriter;
    .locals 1

    sget-object v0, Llive/hms/video/utils/LogUtils;->currentSessionFileWriter:Ljava/io/FileWriter;

    return-object v0
.end method

.method public final getDEVICE_INFO()[Ljava/lang/String;
    .locals 1

    sget-object v0, Llive/hms/video/utils/LogUtils;->DEVICE_INFO:[Ljava/lang/String;

    return-object v0
.end method

.method public final getDirPath(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/File;

    const-string v1, "logs"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    const-string v1, ""

    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final saveLogsToFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    const-string v0, "LogUtils"

    const-string v1, "logcat -f "

    const-string v2, "context"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "filename"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "crash"

    invoke-direct {p0, p1, v2, p2}, Llive/hms/video/utils/LogUtils;->makeLogFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error occurred while saving logs in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Saved logs to file "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-object p1
.end method

.method public final setCurrentSessionFile(Ljava/io/File;)V
    .locals 0

    sput-object p1, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    return-void
.end method

.method public final setCurrentSessionFileWriter(Ljava/io/FileWriter;)V
    .locals 0

    sput-object p1, Llive/hms/video/utils/LogUtils;->currentSessionFileWriter:Ljava/io/FileWriter;

    return-void
.end method

.method public final staticFileWriterStart(Landroid/content/Context;Llive/hms/video/sdk/models/FrameworkInfo;)Ljava/lang/String;
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "frameworkInfo"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/utils/LogUtils;->closeLogging()V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1}, Llive/hms/video/utils/LogUtils;->initiateLogging(Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;

    move-result-object v2

    iput-object v2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Android Agent: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v4, Llive/hms/video/utils/HMSAgentOs;

    new-instance v5, Llive/hms/video/sdk/SignatureChecker;

    invoke-direct {v5, p1}, Llive/hms/video/sdk/SignatureChecker;-><init>(Landroid/content/Context;)V

    invoke-direct {v4, p2, v5}, Llive/hms/video/utils/HMSAgentOs;-><init>(Llive/hms/video/sdk/models/FrameworkInfo;Llive/hms/video/sdk/SignatureChecker;)V

    invoke-virtual {v4}, Llive/hms/video/utils/HMSAgentOs;->getUserAgent()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    iget-object p2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Ljava/io/FileWriter;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Device Info: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Llive/hms/video/utils/LogUtils;->DEVICE_INFO:[Ljava/lang/String;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    sget-object p2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v2, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;

    invoke-direct {v2, v0, p1}, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;-><init>(Lkotlin/jvm/internal/g0;Landroid/content/Context;)V

    invoke-virtual {p2, v2}, Llive/hms/video/utils/HMSLogger;->injectLoggable(Llive/hms/video/utils/HMSLogger$Loggable;)V

    sget-object p1, Llive/hms/video/utils/LogUtils;->currentSessionFile:Ljava/io/File;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method
