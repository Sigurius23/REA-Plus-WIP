.class public final Llive/hms/video/utils/HMSLogger;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/HMSLogger$LogFiles;,
        Llive/hms/video/utils/HMSLogger$LogLevel;,
        Llive/hms/video/utils/HMSLogger$Loggable;,
        Llive/hms/video/utils/HMSLogger$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0011\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u000389:B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ=\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u0003J3\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\'\u0010%\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010\u000bJ\u001d\u0010\'\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\'\u0010\u000bJ\u001d\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008(\u0010\u000bJ%\u0010(\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008(\u0010)J%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u000c\u0010)R\u001d\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00040*8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\"\u00104\u001a\u00020\r8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u0010/\u001a\u0004\u00085\u00101\"\u0004\u00086\u00103R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u00107\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/utils/HMSLogger;",
        "",
        "<init>",
        "()V",
        "",
        "tag",
        "Ll83/a0;",
        "logDeviceInfo",
        "(Ljava/lang/String;)V",
        "message",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "e",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "level",
        "",
        "tr",
        "",
        "isWebRTCLog",
        "log",
        "(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V",
        "Llive/hms/video/utils/HMSLogger$Loggable;",
        "loggable",
        "injectLoggable",
        "(Llive/hms/video/utils/HMSLogger$Loggable;)V",
        "removeInjectedLoggable",
        "Llive/hms/video/utils/HMSLogger$LogFiles;",
        "fileName",
        "",
        "Lhms/webrtc/RTCStats;",
        "logFile$lib_release",
        "(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V",
        "logFile",
        "Lhms/webrtc/Logging$Severity;",
        "severity",
        "webRTCLog$lib_release",
        "(Lhms/webrtc/Logging$Severity;Ljava/lang/String;Ljava/lang/String;)V",
        "webRTCLog",
        "v",
        "i",
        "w",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V",
        "",
        "DEVICE_INFO",
        "[Ljava/lang/String;",
        "getDEVICE_INFO",
        "()[Ljava/lang/String;",
        "Llive/hms/video/utils/HMSLogger$LogLevel;",
        "getLevel",
        "()Llive/hms/video/utils/HMSLogger$LogLevel;",
        "setLevel",
        "(Llive/hms/video/utils/HMSLogger$LogLevel;)V",
        "webRtcLogLevel",
        "getWebRtcLogLevel",
        "setWebRtcLogLevel",
        "Llive/hms/video/utils/HMSLogger$Loggable;",
        "Loggable",
        "LogLevel",
        "LogFiles",
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
.field private static final DEVICE_INFO:[Ljava/lang/String;

.field public static final INSTANCE:Llive/hms/video/utils/HMSLogger;

.field private static level:Llive/hms/video/utils/HMSLogger$LogLevel;

.field private static loggable:Llive/hms/video/utils/HMSLogger$Loggable;

.field private static webRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Llive/hms/video/utils/HMSLogger;

    invoke-direct {v0}, Llive/hms/video/utils/HMSLogger;-><init>()V

    sput-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

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

    sput-object v0, Llive/hms/video/utils/HMSLogger;->DEVICE_INFO:[Ljava/lang/String;

    sget-object v0, Llive/hms/video/utils/HMSLogger$LogLevel;->DEBUG:Llive/hms/video/utils/HMSLogger$LogLevel;

    sput-object v0, Llive/hms/video/utils/HMSLogger;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    sget-object v0, Llive/hms/video/utils/HMSLogger$LogLevel;->ERROR:Llive/hms/video/utils/HMSLogger$LogLevel;

    sput-object v0, Llive/hms/video/utils/HMSLogger;->webRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getLoggable$p()Llive/hms/video/utils/HMSLogger$Loggable;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->loggable:Llive/hms/video/utils/HMSLogger$Loggable;

    return-object v0
.end method

.method public static final d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->DEBUG:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->ERROR:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method private final log(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V
    .locals 7

    if-eqz p5, :cond_0

    sget-object v0, Llive/hms/video/utils/HMSLogger;->webRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p5, :cond_1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Llive/hms/video/utils/HMSLogger$log$1;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/utils/HMSLogger$log$1;-><init>(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Llive/hms/video/utils/HMSLogger$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p1, p1, p2

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-static {v3, v4, p4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :pswitch_1
    invoke-static {v3, v4, p4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :pswitch_2
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_3
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :pswitch_4
    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    :pswitch_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Llive/hms/video/utils/HMSLogger;->log(Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    return-void
.end method

.method public static final logDeviceInfo(Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->VERBOSE:Llive/hms/video/utils/HMSLogger$LogLevel;

    sget-object v3, Llive/hms/video/utils/HMSLogger;->DEVICE_INFO:[Ljava/lang/String;

    const/4 v7, 0x0

    const/16 v8, 0x3e

    const-string v4, ", "

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->ERROR:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public final getDEVICE_INFO()[Ljava/lang/String;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->DEVICE_INFO:[Ljava/lang/String;

    return-object v0
.end method

.method public final getLevel()Llive/hms/video/utils/HMSLogger$LogLevel;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object v0
.end method

.method public final getWebRtcLogLevel()Llive/hms/video/utils/HMSLogger$LogLevel;
    .locals 1

    sget-object v0, Llive/hms/video/utils/HMSLogger;->webRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-object v0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->INFO:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public final injectLoggable(Llive/hms/video/utils/HMSLogger$Loggable;)V
    .locals 1

    const-string v0, "loggable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Llive/hms/video/utils/HMSLogger;->loggable:Llive/hms/video/utils/HMSLogger$Loggable;

    return-void
.end method

.method public final logFile$lib_release(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V
    .locals 1
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

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->loggable:Llive/hms/video/utils/HMSLogger$Loggable;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2, p3}, Llive/hms/video/utils/HMSLogger$Loggable;->onLogToFile(Llive/hms/video/utils/HMSLogger$LogFiles;Ljava/lang/String;Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final removeInjectedLoggable()V
    .locals 1

    const/4 v0, 0x0

    sput-object v0, Llive/hms/video/utils/HMSLogger;->loggable:Llive/hms/video/utils/HMSLogger$Loggable;

    return-void
.end method

.method public final setLevel(Llive/hms/video/utils/HMSLogger$LogLevel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Llive/hms/video/utils/HMSLogger;->level:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-void
.end method

.method public final setWebRtcLogLevel(Llive/hms/video/utils/HMSLogger$LogLevel;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Llive/hms/video/utils/HMSLogger;->webRtcLogLevel:Llive/hms/video/utils/HMSLogger$LogLevel;

    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->VERBOSE:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->WARN:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public final w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 9

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tr"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v2, Llive/hms/video/utils/HMSLogger$LogLevel;->WARN:Llive/hms/video/utils/HMSLogger$LogLevel;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-static/range {v1 .. v8}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method

.method public final webRTCLog$lib_release(Lhms/webrtc/Logging$Severity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const-string v0, "severity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    sget-object p1, Llive/hms/video/utils/HMSLogger$LogLevel;->OFF:Llive/hms/video/utils/HMSLogger$LogLevel;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_0
    sget-object p1, Llive/hms/video/utils/HMSLogger$LogLevel;->ERROR:Llive/hms/video/utils/HMSLogger$LogLevel;

    goto :goto_0

    :cond_1
    sget-object p1, Llive/hms/video/utils/HMSLogger$LogLevel;->WARN:Llive/hms/video/utils/HMSLogger$LogLevel;

    goto :goto_0

    :cond_2
    sget-object p1, Llive/hms/video/utils/HMSLogger$LogLevel;->INFO:Llive/hms/video/utils/HMSLogger$LogLevel;

    goto :goto_0

    :cond_3
    sget-object p1, Llive/hms/video/utils/HMSLogger$LogLevel;->VERBOSE:Llive/hms/video/utils/HMSLogger$LogLevel;

    goto :goto_0

    :goto_1
    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    invoke-static/range {v0 .. v7}, Llive/hms/video/utils/HMSLogger;->log$default(Llive/hms/video/utils/HMSLogger;Llive/hms/video/utils/HMSLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    return-void
.end method
