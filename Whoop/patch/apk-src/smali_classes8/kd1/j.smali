.class public final Lkd1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkd1/j;",
        "",
        "<init>",
        "()V",
        "",
        "styleName",
        "Lb91/a;",
        "f",
        "(Ljava/lang/String;)Lb91/a;",
        "colorName",
        "Ly81/f;",
        "e",
        "(Ljava/lang/String;)Ly81/f;",
        "overlayName",
        "Li91/a;",
        "g",
        "(Ljava/lang/String;)Li91/a;",
        "design_release"
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
.field public static final a:Lkd1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkd1/j;

    invoke-direct {v0}, Lkd1/j;-><init>()V

    sput-object v0, Lkd1/j;->a:Lkd1/j;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lkd1/j;->j(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lkd1/j;->h(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lkd1/j;->k(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lkd1/j;->i(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->t()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->w()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xc

    const/high16 v3, 0x44c80000    # 1600.0f

    invoke-static {v0, p0, v3, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->r()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->r()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->w()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->w()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final e(Ljava/lang/String;)Ly81/f;
    .locals 6

    const-string v0, "colorName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "COACH_BLUE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Ly81/f;->COACH_BLUE:Ly81/f;

    return-object p1

    :sswitch_1
    const-string v0, "MEDIUM_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Ly81/f;->RECOVERY_MEDIUM_RECOVERY:Ly81/f;

    return-object p1

    :sswitch_2
    const-string v0, "POSITIVE_TREND"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1

    :sswitch_3
    const-string v0, "HIGH_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Ly81/f;->RECOVERY_HIGH_RECOVERY:Ly81/f;

    return-object p1

    :sswitch_4
    const-string v0, "NEGATIVE_TREND"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :sswitch_5
    const-string v0, "LOW_RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    return-object p1

    :sswitch_6
    const-string v0, "LIGHT_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    sget-object p1, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p1

    :sswitch_7
    const-string v0, "REM_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    return-object p1

    :sswitch_8
    const-string v0, "DEEP_SLEEP"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    sget-object p1, Ly81/f;->SLEEP_DEEP_SLEEP:Ly81/f;

    return-object p1

    :sswitch_9
    const-string v0, "RECOVERY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    sget-object p1, Ly81/f;->RECOVERY:Ly81/f;

    return-object p1

    :sswitch_a
    const-string v0, "ACCENTS_ACTION"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    sget-object p1, Ly81/f;->ACCENT_ACTION:Ly81/f;

    return-object p1

    :sswitch_b
    const-string v0, "STRAIN_ZONE_3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    sget-object p1, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object p1

    :sswitch_c
    const-string v0, "WHITE_90"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    sget-object p1, Ly81/f;->WHITE_90:Ly81/f;

    return-object p1

    :sswitch_d
    const-string v0, "WHITE_70"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    sget-object p1, Ly81/f;->WHITE_70:Ly81/f;

    return-object p1

    :sswitch_e
    const-string v0, "WHITE_50"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :goto_0
    sget-object v0, Ly81/f;->BRAND_WHITE:Ly81/f;

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_f

    aget-object v4, v1, v3

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_2

    :cond_e
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_f
    const/4 v4, 0x0

    :goto_2
    if-nez v4, :cond_10

    return-object v0

    :cond_10
    return-object v4

    :cond_11
    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x5066d16f -> :sswitch_e
        -0x5066d131 -> :sswitch_d
        -0x5066d0f3 -> :sswitch_c
        -0x3fb26996 -> :sswitch_b
        -0x3e39c594 -> :sswitch_a
        -0xfb906b -> :sswitch_9
        0x8692da4 -> :sswitch_8
        0xdae12b2 -> :sswitch_7
        0x3582c62e -> :sswitch_6
        0x44af5440 -> :sswitch_5
        0x496cacf3 -> :sswitch_4
        0x4b010192 -> :sswitch_3
        0x61bfd7b7 -> :sswitch_2
        0x62ac311f -> :sswitch_1
        0x68fb90ff -> :sswitch_0
    .end sparse-switch
.end method

.method public final f(Ljava/lang/String;)Lb91/a;
    .locals 1

    const-string v0, "styleName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "BODY_B2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->b()Lb91/a;

    move-result-object p1

    return-object p1

    :sswitch_1
    const-string v0, "BODY_B1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->a()Lb91/a;

    move-result-object p1

    return-object p1

    :sswitch_2
    const-string v0, "HEADLINE_H4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->r()Lb91/a;

    move-result-object p1

    return-object p1

    :sswitch_3
    const-string v0, "HEADLINE_H3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->q()Lb91/a;

    move-result-object p1

    return-object p1

    :sswitch_4
    const-string v0, "TITLE_T3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->P()Lb91/a;

    move-result-object p1

    return-object p1

    :sswitch_5
    const-string v0, "TITLE_T2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->o()Lb91/a;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p1

    invoke-virtual {p1}, Lb91/d;->O()Lb91/a;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x40cf863b -> :sswitch_5
        -0x40cf863a -> :sswitch_4
        0x2aa52f36 -> :sswitch_3
        0x2aa52f37 -> :sswitch_2
        0x2e123fec -> :sswitch_1
        0x2e123fed -> :sswitch_0
    .end sparse-switch
.end method

.method public final g(Ljava/lang/String;)Li91/a;
    .locals 1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "ENDCAP_OVERLAY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljp2/f;

    const/16 v0, 0x17

    invoke-direct {p1, v0}, Ljp2/f;-><init>(I)V

    invoke-static {p1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :sswitch_1
    const-string v0, "GRADIENT_LINEAR_45"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljp2/f;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Ljp2/f;-><init>(I)V

    invoke-static {p1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :sswitch_2
    const-string v0, "OVERLAY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljp2/f;

    const/16 v0, 0x19

    invoke-direct {p1, v0}, Ljp2/f;-><init>(I)V

    invoke-static {p1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :sswitch_3
    const-string v0, "BRAND_BLACK"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljp2/f;

    const/16 v0, 0x1a

    invoke-direct {p1, v0}, Ljp2/f;-><init>(I)V

    invoke-static {p1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    const/4 p1, 0x0

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0x5e7e1af9 -> :sswitch_3
        -0x16402fd0 -> :sswitch_2
        0x46517f8c -> :sswitch_1
        0x6215e908 -> :sswitch_0
    .end sparse-switch
.end method
