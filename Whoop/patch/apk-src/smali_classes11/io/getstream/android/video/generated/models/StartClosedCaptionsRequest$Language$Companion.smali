.class public final Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Companion;",
        "",
        "()V",
        "fromString",
        "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;",
        "s",
        "",
        "stream-video-android-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
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
    invoke-direct {p0}, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromString(Ljava/lang/String;)Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;
    .locals 1

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "auto"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Auto;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Auto;

    return-object p1

    :sswitch_1
    const-string v0, "zh"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Zh;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Zh;

    return-object p1

    :sswitch_2
    const-string v0, "uk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Uk;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Uk;

    return-object p1

    :sswitch_3
    const-string v0, "tr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tr;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tr;

    return-object p1

    :sswitch_4
    const-string v0, "tl"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tl;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tl;

    return-object p1

    :sswitch_5
    const-string v0, "th"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Th;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Th;

    return-object p1

    :sswitch_6
    const-string v0, "ta"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ta;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ta;

    return-object p1

    :sswitch_7
    const-string v0, "sv"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    :cond_7
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sv;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sv;

    return-object p1

    :sswitch_8
    const-string v0, "sl"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    :cond_8
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sl;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sl;

    return-object p1

    :sswitch_9
    const-string v0, "sk"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sk;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sk;

    return-object p1

    :sswitch_a
    const-string v0, "ru"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    :cond_a
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ru;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ru;

    return-object p1

    :sswitch_b
    const-string v0, "ro"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ro;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ro;

    return-object p1

    :sswitch_c
    const-string v0, "pt"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    :cond_c
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pt;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pt;

    return-object p1

    :sswitch_d
    const-string v0, "pl"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    :cond_d
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pl;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pl;

    return-object p1

    :sswitch_e
    const-string v0, "no"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$No;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$No;

    return-object p1

    :sswitch_f
    const-string v0, "nl"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_0

    :cond_f
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Nl;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Nl;

    return-object p1

    :sswitch_10
    const-string v0, "ms"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    :cond_10
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ms;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ms;

    return-object p1

    :sswitch_11
    const-string v0, "ko"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_0

    :cond_11
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ko;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ko;

    return-object p1

    :sswitch_12
    const-string v0, "ja"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_0

    :cond_12
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ja;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ja;

    return-object p1

    :sswitch_13
    const-string v0, "it"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_0

    :cond_13
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$It;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$It;

    return-object p1

    :sswitch_14
    const-string v0, "id"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_0

    :cond_14
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Id;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Id;

    return-object p1

    :sswitch_15
    const-string v0, "hu"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_0

    :cond_15
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hu;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hu;

    return-object p1

    :sswitch_16
    const-string v0, "hr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_0

    :cond_16
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hr;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hr;

    return-object p1

    :sswitch_17
    const-string v0, "hi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_0

    :cond_17
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hi;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hi;

    return-object p1

    :sswitch_18
    const-string v0, "he"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_0

    :cond_18
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$He;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$He;

    return-object p1

    :sswitch_19
    const-string v0, "fr"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_0

    :cond_19
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fr;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fr;

    return-object p1

    :sswitch_1a
    const-string v0, "fi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_0

    :cond_1a
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fi;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fi;

    return-object p1

    :sswitch_1b
    const-string v0, "et"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_0

    :cond_1b
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Et;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Et;

    return-object p1

    :sswitch_1c
    const-string v0, "es"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_0

    :cond_1c
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Es;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Es;

    return-object p1

    :sswitch_1d
    const-string v0, "en"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_0

    :cond_1d
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$En;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$En;

    return-object p1

    :sswitch_1e
    const-string v0, "el"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_0

    :cond_1e
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$El;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$El;

    return-object p1

    :sswitch_1f
    const-string v0, "de"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_0

    :cond_1f
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$De;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$De;

    return-object p1

    :sswitch_20
    const-string v0, "da"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_0

    :cond_20
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Da;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Da;

    return-object p1

    :sswitch_21
    const-string v0, "cs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_0

    :cond_21
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Cs;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Cs;

    return-object p1

    :sswitch_22
    const-string v0, "ca"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_0

    :cond_22
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ca;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ca;

    return-object p1

    :sswitch_23
    const-string v0, "bg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_0

    :cond_23
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Bg;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Bg;

    return-object p1

    :sswitch_24
    const-string v0, "ar"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    :goto_0
    new-instance v0, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Unknown;

    invoke-direct {v0, p1}, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Unknown;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_24
    sget-object p1, Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ar;->INSTANCE:Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ar;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xc31 -> :sswitch_24
        0xc45 -> :sswitch_23
        0xc5e -> :sswitch_22
        0xc70 -> :sswitch_21
        0xc7d -> :sswitch_20
        0xc81 -> :sswitch_1f
        0xca7 -> :sswitch_1e
        0xca9 -> :sswitch_1d
        0xcae -> :sswitch_1c
        0xcaf -> :sswitch_1b
        0xcc3 -> :sswitch_1a
        0xccc -> :sswitch_19
        0xcfd -> :sswitch_18
        0xd01 -> :sswitch_17
        0xd0a -> :sswitch_16
        0xd0d -> :sswitch_15
        0xd1b -> :sswitch_14
        0xd2b -> :sswitch_13
        0xd37 -> :sswitch_12
        0xd64 -> :sswitch_11
        0xda6 -> :sswitch_10
        0xdbe -> :sswitch_f
        0xdc1 -> :sswitch_e
        0xdfc -> :sswitch_d
        0xe04 -> :sswitch_c
        0xe3d -> :sswitch_b
        0xe43 -> :sswitch_a
        0xe58 -> :sswitch_9
        0xe59 -> :sswitch_8
        0xe63 -> :sswitch_7
        0xe6d -> :sswitch_6
        0xe74 -> :sswitch_5
        0xe78 -> :sswitch_4
        0xe7e -> :sswitch_3
        0xe96 -> :sswitch_2
        0xf2e -> :sswitch_1
        0x2dddaf -> :sswitch_0
    .end sparse-switch
.end method
