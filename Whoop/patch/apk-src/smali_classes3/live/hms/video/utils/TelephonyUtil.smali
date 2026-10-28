.class public final Llive/hms/video/utils/TelephonyUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/utils/TelephonyUtil;",
        "",
        "<init>",
        "()V",
        "getNetworkType",
        "",
        "dataNetworkType",
        "",
        "(Ljava/lang/Integer;)Ljava/lang/String;",
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
.field public static final INSTANCE:Llive/hms/video/utils/TelephonyUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/utils/TelephonyUtil;

    invoke-direct {v0}, Llive/hms/video/utils/TelephonyUtil;-><init>()V

    sput-object v0, Llive/hms/video/utils/TelephonyUtil;->INSTANCE:Llive/hms/video/utils/TelephonyUtil;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getNetworkType(Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x7

    if-eq v0, v1, :cond_19

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_19

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_19

    :goto_2
    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_19

    :goto_3
    if-nez p1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xb

    if-eq v0, v1, :cond_19

    :goto_4
    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    goto/16 :goto_14

    :cond_6
    :goto_5
    if-nez p1, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_18

    :goto_6
    if-nez p1, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_18

    :goto_7
    if-nez p1, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xf

    if-eq v0, v1, :cond_18

    :goto_8
    if-nez p1, :cond_a

    goto :goto_9

    :cond_a
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x9

    if-eq v0, v1, :cond_18

    :goto_9
    if-nez p1, :cond_b

    goto :goto_a

    :cond_b
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_18

    :goto_a
    if-nez p1, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_18

    :goto_b
    if-nez p1, :cond_d

    goto :goto_c

    :cond_d
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_18

    :goto_c
    if-nez p1, :cond_e

    goto :goto_d

    :cond_e
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_18

    :goto_d
    if-nez p1, :cond_f

    goto :goto_e

    :cond_f
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_18

    :goto_e
    if-nez p1, :cond_10

    goto :goto_f

    :cond_10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x11

    if-ne v0, v1, :cond_11

    goto :goto_13

    :cond_11
    :goto_f
    if-nez p1, :cond_12

    goto :goto_10

    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_13

    const-string p1, "LTE"

    return-object p1

    :cond_13
    :goto_10
    if-nez p1, :cond_14

    goto :goto_11

    :cond_14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x14

    if-ne v0, v1, :cond_15

    const-string p1, "5G"

    return-object p1

    :cond_15
    :goto_11
    if-nez p1, :cond_16

    goto :goto_12

    :cond_16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x12

    if-ne p1, v0, :cond_17

    const-string p1, "WIFI"

    return-object p1

    :cond_17
    :goto_12
    const-string p1, "UNKNOWN"

    return-object p1

    :cond_18
    :goto_13
    const-string p1, "3G"

    return-object p1

    :cond_19
    :goto_14
    const-string p1, "EDGE"

    return-object p1
.end method
