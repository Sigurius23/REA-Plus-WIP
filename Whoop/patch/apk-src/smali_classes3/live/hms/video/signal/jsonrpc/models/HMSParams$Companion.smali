.class public final Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/jsonrpc/models/HMSParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;",
        "",
        "<init>",
        "()V",
        "fromReceivedParams",
        "Llive/hms/video/signal/jsonrpc/models/HMSParams;",
        "method",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "params",
        "Lcom/google/gson/JsonObject;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromReceivedParams(Llive/hms/video/signal/HMSSignalMethod;Lcom/google/gson/JsonObject;)Llive/hms/video/signal/jsonrpc/models/HMSParams;
    .locals 1

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/signal/jsonrpc/models/HMSParams$Companion$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Unsupported;

    goto :goto_0

    :cond_0
    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$OnError;

    goto :goto_0

    :cond_1
    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Trickle;

    goto :goto_0

    :cond_2
    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Offer;

    goto :goto_0

    :cond_3
    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Join;

    goto :goto_0

    :cond_4
    const-class p1, Llive/hms/video/signal/jsonrpc/models/HMSParams$Answer;

    :goto_0
    sget-object v0, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v0}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "fromJson(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llive/hms/video/signal/jsonrpc/models/HMSParams;

    return-object p1
.end method
