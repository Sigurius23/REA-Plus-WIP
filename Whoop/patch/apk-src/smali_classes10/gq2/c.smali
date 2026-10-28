.class public final Lgq2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lgq2/c;",
        "",
        "<init>",
        "()V",
        "",
        "theme",
        "themeVariant",
        "Lkr2/d;",
        "a",
        "(Ljava/lang/String;Ljava/lang/String;)Lkr2/d;",
        "user-journey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lgq2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lgq2/c;

    invoke-direct {v0}, Lgq2/c;-><init>()V

    sput-object v0, Lgq2/c;->a:Lgq2/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lgq2/c;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkr2/d;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Lgq2/c;->a(Ljava/lang/String;Ljava/lang/String;)Lkr2/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)Lkr2/d;
    .locals 6

    const-string v0, "theme"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const-string p2, ""

    :cond_0
    sget-object v0, Llq2/f;->SECONDARY:Llq2/f;

    invoke-static {}, Llq2/f;->values()[Llq2/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v0, v4

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    sparse-switch p2, :sswitch_data_0

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string p2, "CARD_8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :cond_4
    sget-object p1, Lkr2/d$a;->b:Lkr2/d$a;

    return-object p1

    :pswitch_1
    const-string p2, "CARD_7"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_3

    :cond_5
    sget-object p1, Lkr2/d$e;->b:Lkr2/d$e;

    return-object p1

    :pswitch_2
    const-string p2, "CARD_6"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_3

    :cond_6
    sget-object p1, Lkr2/d$f;->b:Lkr2/d$f;

    return-object p1

    :pswitch_3
    const-string p2, "CARD_5"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_3

    :cond_7
    sget-object p1, Lkr2/d$b;->b:Lkr2/d$b;

    return-object p1

    :pswitch_4
    const-string p2, "CARD_4"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_3

    :cond_8
    sget-object p1, Lkr2/d$c;->b:Lkr2/d$c;

    return-object p1

    :pswitch_5
    const-string p2, "CARD_3"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_3

    :cond_9
    sget-object p1, Lkr2/d$g;->b:Lkr2/d$g;

    return-object p1

    :pswitch_6
    const-string p2, "CARD_2"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_3

    :cond_a
    sget-object p1, Lkr2/d$h;->b:Lkr2/d$h;

    return-object p1

    :pswitch_7
    const-string p2, "CARD_1"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_3

    :cond_b
    sget-object p1, Lkr2/d$d;->b:Lkr2/d$d;

    return-object p1

    :sswitch_0
    const-string p2, "LANDING_SCREEN_BOTTOM"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_3

    :sswitch_1
    const-string p2, "CHRONOLOGICAL_SECTION_HEALTHSPAN_YOUNGER"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_3

    :cond_c
    new-instance p1, Lkr2/d$k;

    invoke-direct {p1, v0}, Lkr2/d$k;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_2
    const-string p2, "LANDING_SCREEN_FULL"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_3

    :cond_d
    new-instance p1, Lkr2/d$p;

    invoke-direct {p1, v0}, Lkr2/d$p;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_3
    const-string p2, "STREAK_STATS_SILVER"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_3

    :cond_e
    sget-object p1, Lkr2/d$f0;->b:Lkr2/d$f0;

    return-object p1

    :sswitch_4
    const-string p2, "STREAK_STATS_BRONZE"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_3

    :cond_f
    sget-object p1, Lkr2/d$b0;->b:Lkr2/d$b0;

    return-object p1

    :sswitch_5
    const-string p2, "CHRONOLOGICAL_SECTION_99_PERCENT_CLUB"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_3

    :cond_10
    new-instance p1, Lkr2/d$i;

    invoke-direct {p1, v0}, Lkr2/d$i;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_6
    const-string p2, "STREAK_STATS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto/16 :goto_3

    :cond_11
    new-instance p1, Lkr2/d$a0;

    invoke-direct {p1, v0}, Lkr2/d$a0;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_7
    const-string p2, "STREAK_STATS_GOLD"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto/16 :goto_3

    :cond_12
    sget-object p1, Lkr2/d$d0;->b:Lkr2/d$d0;

    return-object p1

    :sswitch_8
    const-string p2, "STREAK_STATS_2000"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto/16 :goto_3

    :cond_13
    sget-object p1, Lkr2/d$x;->b:Lkr2/d$x;

    return-object p1

    :sswitch_9
    const-string p2, "STREAK_STATS_1000"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto/16 :goto_3

    :cond_14
    sget-object p1, Lkr2/d$u;->b:Lkr2/d$u;

    return-object p1

    :sswitch_a
    const-string p2, "SLEEP"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto/16 :goto_3

    :cond_15
    new-instance p1, Lkr2/d$s;

    invoke-direct {p1, v0}, Lkr2/d$s;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_b
    const-string p2, "OUTRO"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto/16 :goto_3

    :cond_16
    new-instance p1, Lkr2/d$o;

    invoke-direct {p1, v0}, Lkr2/d$o;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_c
    const-string p2, "INTRO"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto/16 :goto_3

    :cond_17
    new-instance p1, Lkr2/d$q;

    invoke-direct {p1, v0}, Lkr2/d$q;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_d
    const-string p2, "STREAK_STATS_PLATINUM"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto/16 :goto_3

    :cond_18
    sget-object p1, Lkr2/d$e0;->b:Lkr2/d$e0;

    return-object p1

    :sswitch_e
    const-string p2, "RECOVERY"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_19

    goto/16 :goto_3

    :cond_19
    new-instance p1, Lkr2/d$r;

    invoke-direct {p1, v0}, Lkr2/d$r;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_f
    const-string p2, "LANDING_SCREEN_TOP"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    goto/16 :goto_3

    :cond_1a
    new-instance p1, Lkr2/d$q;

    invoke-direct {p1, v0}, Lkr2/d$q;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_10
    const-string p2, "STREAK_STATS_1"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1b

    goto/16 :goto_3

    :cond_1b
    sget-object p1, Lkr2/d$w;->b:Lkr2/d$w;

    return-object p1

    :sswitch_11
    const-string p2, "CHRONOLOGICAL_SECTION_HEALTHSPAN_OLDER"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1c

    goto/16 :goto_3

    :cond_1c
    new-instance p1, Lkr2/d$j;

    invoke-direct {p1, v0}, Lkr2/d$j;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_12
    const-string p2, "STREAK_STATS_DIAMOND"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1d

    goto/16 :goto_3

    :cond_1d
    sget-object p1, Lkr2/d$c0;->b:Lkr2/d$c0;

    return-object p1

    :sswitch_13
    const-string p2, "ONE_PERCENT_CLUB"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1e

    goto/16 :goto_3

    :cond_1e
    new-instance p1, Lkr2/d$l;

    invoke-direct {p1, v0}, Lkr2/d$l;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_14
    const-string p2, "STREAK_STATS_730"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1f

    goto/16 :goto_3

    :cond_1f
    sget-object p1, Lkr2/d$z;->b:Lkr2/d$z;

    return-object p1

    :sswitch_15
    const-string p2, "STREAK_STATS_365"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_20

    goto :goto_3

    :cond_20
    sget-object p1, Lkr2/d$y;->b:Lkr2/d$y;

    return-object p1

    :sswitch_16
    const-string p2, "STREAK_STATS_180"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_21

    goto :goto_3

    :cond_21
    new-instance p1, Lkr2/d$a0;

    invoke-direct {p1, v0}, Lkr2/d$a0;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_17
    const-string p2, "STREAK_STATS_14"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_22

    goto :goto_3

    :cond_22
    sget-object p1, Lkr2/d$v;->b:Lkr2/d$v;

    return-object p1

    :sswitch_18
    const-string p2, "STRAIN"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_23

    goto :goto_3

    :cond_23
    new-instance p1, Lkr2/d$t;

    invoke-direct {p1, v0}, Lkr2/d$t;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_19
    const-string p2, "WRAP_UP"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_24

    goto :goto_3

    :cond_24
    new-instance p1, Lkr2/d$m;

    invoke-direct {p1, v0}, Lkr2/d$m;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_1a
    const-string p2, "DEFAULT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_25

    goto :goto_3

    :cond_25
    new-instance p1, Lkr2/d$m;

    invoke-direct {p1, v0}, Lkr2/d$m;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_1b
    const-string p2, "CHRONOLOGICAL_SECTION_ONE_PERCENT_CLUB"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_26

    goto :goto_3

    :cond_26
    new-instance p1, Lkr2/d$l;

    invoke-direct {p1, v0}, Lkr2/d$l;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_1c
    const-string p2, "HEALTHSPAN_CONTRIBUTORS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_27

    :goto_3
    new-instance p1, Lkr2/d$m;

    invoke-direct {p1, v0}, Lkr2/d$m;-><init>(Llq2/f;)V

    return-object p1

    :cond_27
    new-instance p1, Lkr2/d$n;

    invoke-direct {p1, v0}, Lkr2/d$n;-><init>(Llq2/f;)V

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x7e7c2d0f -> :sswitch_1c
        -0x7c8ea9a4 -> :sswitch_1b
        -0x79209ddf -> :sswitch_1a
        -0x761ab550 -> :sswitch_19
        -0x6d97ca8b -> :sswitch_18
        -0x66032a7c -> :sswitch_17
        -0x5a622458 -> :sswitch_16
        -0x5a621d0f -> :sswitch_15
        -0x5a620e6d -> :sswitch_14
        -0x569bb217 -> :sswitch_13
        -0x4e5bad8d -> :sswitch_12
        -0x3fd83c72 -> :sswitch_11
        -0x2c94bf50 -> :sswitch_10
        -0x156aedd6 -> :sswitch_f
        -0xfb906b -> :sswitch_e
        0x86b4cd -> :sswitch_d
        0x4296e4c -> :sswitch_c
        0x48129eb -> :sswitch_b
        0x4b536b7 -> :sswitch_a
        0xe1d7b80 -> :sswitch_9
        0xe1defdf -> :sswitch_8
        0xe27f381 -> :sswitch_7
        0x16105c7e -> :sswitch_6
        0x16c2487c -> :sswitch_5
        0x1b9cb07b -> :sswitch_4
        0x381efdee -> :sswitch_3
        0x6806ec3a -> :sswitch_2
        0x6c5578bf -> :sswitch_1
        0x7ad8a116 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x760efac2
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
