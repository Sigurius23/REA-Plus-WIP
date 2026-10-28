.class public final Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/utils/HMSLogger$Loggable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/LogUtils;->staticFileWriterStart(Landroid/content/Context;Llive/hms/video/sdk/models/FrameworkInfo;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "live/hms/video/utils/LogUtils$staticFileWriterStart$1",
        "Llive/hms/video/utils/HMSLogger$Loggable;",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "level",
        "",
        "tag",
        "message",
        "",
        "isWebRtCLog",
        "Ll83/a0;",
        "onLogMessage",
        "(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Z)V",
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


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $fileWriter:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$fileWriter:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLogMessage(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-static {}, Llive/hms/video/utils/LogUtils;->access$getLogDateFormatter$p()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p4, :cond_0

    const-string p4, "RTC"

    goto :goto_0

    :cond_0
    const-string p4, "HMS"

    :goto_0
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p4, 0x3a

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$fileWriter:Lkotlin/jvm/internal/g0;

    iget-object p2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Ljava/io/FileWriter;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\t\t"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, Lyb3/r;->Q0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0xa

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "ran into an exception closing the log file :"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "LogUtils"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$fileWriter:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Ljava/io/FileWriter;

    invoke-virtual {p1}, Ljava/io/Writer;->close()V

    iget-object p1, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$fileWriter:Lkotlin/jvm/internal/g0;

    sget-object p2, Llive/hms/video/utils/LogUtils;->INSTANCE:Llive/hms/video/utils/LogUtils;

    iget-object p3, p0, Llive/hms/video/utils/LogUtils$staticFileWriterStart$1;->$context:Landroid/content/Context;

    invoke-virtual {p2}, Llive/hms/video/utils/LogUtils;->getCurrentSessionFile()Ljava/io/File;

    move-result-object p4

    invoke-static {p2, p3, p4}, Llive/hms/video/utils/LogUtils;->access$initiateLogging(Llive/hms/video/utils/LogUtils;Landroid/content/Context;Ljava/io/File;)Ljava/io/FileWriter;

    move-result-object p2

    iput-object p2, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void
.end method

.method public onLogToFile(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/utils/HMSLogger$LogFiles;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lhms/webrtc/RTCStats;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Llive/hms/video/utils/HMSLogger$Loggable$DefaultImpls;->onLogToFile(Llive/hms/video/utils/HMSLogger$Loggable;Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
