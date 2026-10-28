.class public final Llive/hms/video/utils/AuthTokenUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/AuthTokenUtils$AuthToken;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/utils/AuthTokenUtils;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "getJWTPayload",
        "Llive/hms/video/utils/AuthTokenUtils$AuthToken;",
        "token",
        "AuthToken",
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
.field public static final INSTANCE:Llive/hms/video/utils/AuthTokenUtils;

.field private static final TAG:Ljava/lang/String; = "AuthTokenUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/utils/AuthTokenUtils;

    invoke-direct {v0}, Llive/hms/video/utils/AuthTokenUtils;-><init>()V

    sput-object v0, Llive/hms/video/utils/AuthTokenUtils;->INSTANCE:Llive/hms/video/utils/AuthTokenUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getJWTPayload(Ljava/lang/String;)Llive/hms/video/utils/AuthTokenUtils$AuthToken;
    .locals 10

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getJWTPayload: token="

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "AuthTokenUtils"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "."

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x6

    invoke-static {p1, v0, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    sget-object v3, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const-string v5, "Expected 3 \'.\' separate fields - header, payload and signature respectively"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Llive/hms/video/error/ErrorFactory$APIErrors;->InvalidTokenFormat$default(Llive/hms/video/error/ErrorFactory$APIErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v2, "UTF_8"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sget-object p1, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {p1}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object p1

    const-class v0, Llive/hms/video/utils/AuthTokenUtils$AuthToken;

    invoke-virtual {p1, v2, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "fromJson(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/utils/AuthTokenUtils$AuthToken;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :goto_0
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "Error not parsing json"

    invoke-virtual {v0, v1, v2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v3, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    move-object v5, p1

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Llive/hms/video/error/ErrorFactory$APIErrors;->InvalidTokenFormat$default(Llive/hms/video/error/ErrorFactory$APIErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1

    :goto_1
    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v2, "Error parsing json"

    invoke-virtual {v0, v1, v2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v3, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v4, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const-string v5, "Token is missing room id"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Llive/hms/video/error/ErrorFactory$APIErrors;->InvalidTokenFormat$default(Llive/hms/video/error/ErrorFactory$APIErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1

    :cond_2
    sget-object v0, Llive/hms/video/error/ErrorFactory$APIErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$APIErrors;

    sget-object v1, Llive/hms/video/error/ErrorFactory$Action;->INIT:Llive/hms/video/error/ErrorFactory$Action;

    const/16 v5, 0xc

    const/4 v6, 0x0

    const-string v2, "Token cannot be an empty string"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Llive/hms/video/error/ErrorFactory$APIErrors;->InvalidTokenFormat$default(Llive/hms/video/error/ErrorFactory$APIErrors;Llive/hms/video/error/ErrorFactory$Action;Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;ILjava/lang/Object;)Llive/hms/video/error/HMSException;

    move-result-object p1

    throw p1
.end method
