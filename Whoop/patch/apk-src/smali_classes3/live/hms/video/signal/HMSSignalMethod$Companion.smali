.class public final Llive/hms/video/signal/HMSSignalMethod$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/HMSSignalMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Llive/hms/video/signal/HMSSignalMethod$Companion;",
        "",
        "<init>",
        "()V",
        "from",
        "Llive/hms/video/signal/HMSSignalMethod;",
        "method",
        "",
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
    invoke-direct {p0}, Llive/hms/video/signal/HMSSignalMethod$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final from(Ljava/lang/String;)Llive/hms/video/signal/HMSSignalMethod;
    .locals 1

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "on-error"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->SERVER_ERROR:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :sswitch_1
    const-string v0, "offer"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->OFFER:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :sswitch_2
    const-string v0, "leave"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->LEAVE:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :sswitch_3
    const-string v0, "join"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->JOIN:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :sswitch_4
    const-string v0, "trickle"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->TRICKLE:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :sswitch_5
    const-string v0, "answer"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->SDK_NOTIFICATION:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    :cond_5
    sget-object p1, Llive/hms/video/signal/HMSSignalMethod;->ANSWER:Llive/hms/video/signal/HMSSignalMethod;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5435c042 -> :sswitch_5
        -0x3f2e6bf4 -> :sswitch_4
        0x31dd2a -> :sswitch_3
        0x6214eb7 -> :sswitch_2
        0x64c1a5c -> :sswitch_1
        0x181ed09a -> :sswitch_0
    .end sparse-switch
.end method
