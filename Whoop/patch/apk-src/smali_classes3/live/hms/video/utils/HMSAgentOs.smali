.class public final Llive/hms/video/utils/HMSAgentOs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0017\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\u00080\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00088\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u00088\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\u001eR\u001b\u0010%\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010 \u001a\u0004\u0008$\u0010\u001eR\u001b\u0010(\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010 \u001a\u0004\u0008\'\u0010\u001eR\u001b\u0010+\u001a\u00020\u00088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010 \u001a\u0004\u0008*\u0010\u001e\u00a8\u0006,"
    }
    d2 = {
        "Llive/hms/video/utils/HMSAgentOs;",
        "",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "frameworkInfo",
        "Llive/hms/video/sdk/SignatureChecker;",
        "signatureChecker",
        "<init>",
        "(Llive/hms/video/sdk/models/FrameworkInfo;Llive/hms/video/sdk/SignatureChecker;)V",
        "",
        "agent",
        "kotlin.jvm.PlatformType",
        "getUrlEncodedAgent",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "hash",
        "bytesToHex",
        "([B)Ljava/lang/String;",
        "Llive/hms/video/events/AnalyticsEvent;",
        "event",
        "getUniqueEventId",
        "(Llive/hms/video/events/AnalyticsEvent;)Ljava/lang/String;",
        "Landroid/content/Context;",
        "context",
        "getDeviceId",
        "(Landroid/content/Context;)Ljava/lang/String;",
        "Llive/hms/video/sdk/models/FrameworkInfo;",
        "TAG",
        "Ljava/lang/String;",
        "USER_AGENT_V2_NAME",
        "getUSER_AGENT_V2_NAME",
        "()Ljava/lang/String;",
        "userAgentUrlEncoded$delegate",
        "Ll83/h;",
        "getUserAgentUrlEncoded",
        "userAgentUrlEncoded",
        "userAgent$delegate",
        "getUserAgent",
        "userAgent",
        "userAgentV2$delegate",
        "getUserAgentV2",
        "userAgentV2",
        "userAgentV2Encoded$delegate",
        "getUserAgentV2Encoded",
        "userAgentV2Encoded",
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
.field private final TAG:Ljava/lang/String;

.field private final USER_AGENT_V2_NAME:Ljava/lang/String;

.field private final frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

.field private final userAgent$delegate:Ll83/h;

.field private final userAgentUrlEncoded$delegate:Ll83/h;

.field private final userAgentV2$delegate:Ll83/h;

.field private final userAgentV2Encoded$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/FrameworkInfo;Llive/hms/video/sdk/SignatureChecker;)V
    .locals 1

    const-string v0, "frameworkInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    const-string p1, "HMSAgentOs"

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->TAG:Ljava/lang/String;

    const-string p1, "user_agent_v2"

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->USER_AGENT_V2_NAME:Ljava/lang/String;

    new-instance p1, Llive/hms/video/utils/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Llive/hms/video/utils/a;-><init>(Llive/hms/video/utils/HMSAgentOs;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentUrlEncoded$delegate:Ll83/h;

    new-instance p1, Llive/hms/video/utils/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Llive/hms/video/utils/a;-><init>(Llive/hms/video/utils/HMSAgentOs;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->userAgent$delegate:Ll83/h;

    new-instance p1, Ll01/q;

    const/16 v0, 0x15

    invoke-direct {p1, v0, p2, p0}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentV2$delegate:Ll83/h;

    new-instance p1, Llive/hms/video/utils/a;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Llive/hms/video/utils/a;-><init>(Llive/hms/video/utils/HMSAgentOs;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentV2Encoded$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSAgentOs;->userAgentV2Encoded_delegate$lambda$3(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llive/hms/video/sdk/SignatureChecker;Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/utils/HMSAgentOs;->userAgentV2_delegate$lambda$2(Llive/hms/video/sdk/SignatureChecker;Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final bytesToHex([B)Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toHexString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic c(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSAgentOs;->userAgentUrlEncoded_delegate$lambda$0(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Llive/hms/video/utils/HMSAgentOs;->userAgent_delegate$lambda$1(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final getUrlEncodedAgent(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    const-string v0, "UTF-8"

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string v0, "_"

    const/4 v1, 0x0

    const-string v2, " "

    invoke-static {p1, v2, v0, v1}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final getUserAgentV2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentV2$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getUserAgentV2Encoded()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentV2Encoded$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final userAgentUrlEncoded_delegate$lambda$0(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Llive/hms/video/utils/HMSAgentOs;->USER_AGENT_V2_NAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Llive/hms/video/utils/HMSAgentOs;->getUserAgentV2Encoded()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final userAgentV2Encoded_delegate$lambda$3(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/utils/HMSAgentOs;->getUserAgentV2()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Llive/hms/video/utils/HMSAgentOs;->getUrlEncodedAgent(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final userAgentV2_delegate$lambda$2(Llive/hms/video/sdk/SignatureChecker;Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 5

    const-string v0, "$signatureChecker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "MODEL"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "_"

    const/4 v3, 0x0

    const-string v4, " "

    invoke-static {v1, v4, v2, v3}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Llive/hms/video/sdk/SignatureChecker;->isReleaseSigned()Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "prod"

    goto :goto_0

    :cond_0
    const-string p0, "debug"

    :goto_0
    const-string v2, ",sdk:android,sdk_version:2.9.87,device_model:"

    const-string v3, ",env:"

    const-string v4, "os:android,os_version:"

    invoke-static {v0, v4, v2, v1, v3}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ",is_prebuilt:"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p1, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-virtual {p0}, Llive/hms/video/sdk/models/FrameworkInfo;->isPrebuilt()Z

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object p0, p1, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-virtual {p0}, Llive/hms/video/sdk/models/FrameworkInfo;->getFramework()Llive/hms/video/events/AgentType;

    move-result-object p0

    sget-object v1, Llive/hms/video/events/AgentType;->ANDROID_NATIVE:Llive/hms/video/events/AgentType;

    if-eq p0, v1, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, ",framework:"

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/FrameworkInfo;->getFramework()Llive/hms/video/events/AgentType;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AgentType;->getServerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",framework_version:"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/FrameworkInfo;->getFrameworkVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",framework_sdk_version:"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Llive/hms/video/utils/HMSAgentOs;->frameworkInfo:Llive/hms/video/sdk/models/FrameworkInfo;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/FrameworkInfo;->getFrameworkSdkVersion()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    const-string p0, ""

    :goto_1
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final userAgent_delegate$lambda$1(Llive/hms/video/utils/HMSAgentOs;)Ljava/lang/String;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Llive/hms/video/utils/HMSAgentOs;->getUserAgentV2()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getDeviceId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "HardwareIds"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v1, "android_id"

    invoke-static {p1, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const-string v0, "digest(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/utils/HMSAgentOs;->bytesToHex([B)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getUSER_AGENT_V2_NAME()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/HMSAgentOs;->USER_AGENT_V2_NAME:Ljava/lang/String;

    return-object v0
.end method

.method public final getUniqueEventId(Llive/hms/video/events/AnalyticsEvent;)Ljava/lang/String;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEvent;->getTimestamp()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEvent;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getUserAgent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/HMSAgentOs;->userAgent$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getUserAgentUrlEncoded()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/HMSAgentOs;->userAgentUrlEncoded$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
