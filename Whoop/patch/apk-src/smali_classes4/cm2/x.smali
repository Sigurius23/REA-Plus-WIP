.class public final Lcm2/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm2/x$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ7\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lcm2/x;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/trends/data/model/MetricsTrendKey;",
        "metricsTrendKey",
        "",
        "value",
        "",
        "doesContainTrendPlot",
        "isCalibrating",
        "Ly81/e;",
        "b",
        "(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/Double;ZZ)Ly81/e;",
        "Lor2/h0;",
        "graphKey",
        "i",
        "(Lor2/h0;Ljava/lang/Double;ZZ)Ly81/e;",
        "f",
        "(Ljava/lang/Double;)Ly81/e;",
        "",
        "index",
        "g",
        "(I)Ly81/e;",
        "Lvl2/q;",
        "style",
        "Li91/a;",
        "d",
        "(Lvl2/q;)Li91/a;",
        "",
        "color",
        "h",
        "(Ljava/lang/String;)Ly81/e;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lcm2/x;->e(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcm2/x;Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/Double;ZZILjava/lang/Object;)Ly81/e;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcm2/x;->b(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/Double;ZZ)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v5

    new-instance p0, Li2/x;

    invoke-direct {p0, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3, v4, v5}, [Ll83/k;

    move-result-object v2

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const v4, 0x439d8000    # 315.0f

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lgb1/u;->d(Li2/s;[Ll83/k;IFZILjava/lang/Object;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcm2/x;Lor2/h0;Ljava/lang/Double;ZZILjava/lang/Object;)Ly81/e;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcm2/x;->i(Lor2/h0;Ljava/lang/Double;ZZ)Ly81/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/whoop/trends/data/model/MetricsTrendKey;Ljava/lang/Double;ZZ)Ly81/e;
    .locals 1

    const-string v0, "metricsTrendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    sget-object p1, Lcm2/x$b;->w:Lcm2/x$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p4, Lcm2/x$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p4, p1

    const/4 p4, 0x0

    packed-switch p1, :pswitch_data_0

    move-object p1, p4

    goto :goto_0

    :pswitch_0
    sget-object p1, Lcm2/x$h;->w:Lcm2/x$h;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    sget-object p1, Lcm2/x$g;->w:Lcm2/x$g;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0, p2}, Lcm2/x;->f(Ljava/lang/Double;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    sget-object p1, Lcm2/x$f;->w:Lcm2/x$f;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    sget-object p1, Lcm2/x$e;->w:Lcm2/x$e;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    sget-object p1, Lcm2/x$d;->w:Lcm2/x$d;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    sget-object p1, Lcm2/x$c;->w:Lcm2/x$c;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ly81/e;->toTestableColor-0d7_KjU()J

    move-result-wide p1

    const p3, 0x3e4ccccd    # 0.2f

    invoke-static {p3, p1, p2}, Li2/x;->c(FJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Ly81/g;->b(J)Ly81/e;

    move-result-object p1

    :cond_1
    return-object p1

    :cond_2
    return-object p4

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lvl2/q;)Li91/a;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcm2/x$a;->d:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcm2/x$o;->w:Lcm2/x$o;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    sget-object p1, Lcm2/x$n;->w:Lcm2/x$n;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object p1, Lcm2/x$m;->w:Lcm2/x$m;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcm2/x$l;->w:Lcm2/x$l;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_3
    sget-object p1, Lcm2/x$k;->w:Lcm2/x$k;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_4
    sget-object p1, Lcm2/x$j;->w:Lcm2/x$j;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcj2/a;

    const/16 v0, 0x12

    invoke-direct {p1, v0}, Lcj2/a;-><init>(I)V

    invoke-static {p1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_6
    sget-object p1, Lcm2/x$i;->w:Lcm2/x$i;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_7
    sget-object p1, Lcm2/x$x;->w:Lcm2/x$x;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_8
    sget-object p1, Lcm2/x$w;->w:Lcm2/x$w;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_9
    sget-object p1, Lcm2/x$v;->w:Lcm2/x$v;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_a
    sget-object p1, Lcm2/x$u;->w:Lcm2/x$u;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_b
    sget-object p1, Lcm2/x$t;->w:Lcm2/x$t;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_c
    sget-object p1, Lcm2/x$s;->w:Lcm2/x$s;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_d
    sget-object p1, Lcm2/x$r;->w:Lcm2/x$r;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_e
    sget-object p1, Lcm2/x$q;->w:Lcm2/x$q;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    :pswitch_f
    sget-object p1, Lcm2/x$p;->w:Lcm2/x$p;

    invoke-static {p1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public final f(Ljava/lang/Double;)Ly81/e;
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    const-wide v2, 0x3fd5c28f5c28f5c3L    # 0.34

    cmpg-double v0, v0, v2

    if-gez v0, :cond_1

    sget-object p1, Lcm2/x$y;->w:Lcm2/x$y;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide v2, 0x3fe570a3d70a3d71L    # 0.67

    cmpg-double p1, v0, v2

    if-gez p1, :cond_2

    sget-object p1, Lcm2/x$z;->w:Lcm2/x$z;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, Lcm2/x$a0;->w:Lcm2/x$a0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method

.method public final g(I)Ly81/e;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    sget-object p1, Lcm2/x$d0;->w:Lcm2/x$d0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Lcm2/x$c0;->w:Lcm2/x$c0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lcm2/x$b0;->w:Lcm2/x$b0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljava/lang/String;)Ly81/e;
    .locals 6

    const-string v0, "color"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_0

    :pswitch_0
    const-string v0, "ZONE_5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    return-object p1

    :pswitch_1
    const-string v0, "ZONE_4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    sget-object p1, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p1

    :pswitch_2
    const-string v0, "ZONE_3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_0

    :cond_2
    sget-object p1, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    return-object p1

    :pswitch_3
    const-string v0, "ZONE_2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    sget-object p1, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p1

    :pswitch_4
    const-string v0, "ZONE_1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_0

    :cond_4
    sget-object p1, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    return-object p1

    :pswitch_5
    const-string v0, "ZONE_0"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    :cond_5
    sget-object p1, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p1

    :pswitch_6
    const-string v0, "STRAIN_5"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    sget-object p1, Lcm2/x$i0;->w:Lcm2/x$i0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_7
    const-string v0, "STRAIN_4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lcm2/x$h0;->w:Lcm2/x$h0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_8
    const-string v0, "STRAIN_3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    sget-object p1, Lcm2/x$g0;->w:Lcm2/x$g0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_9
    const-string v0, "STRAIN_2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    sget-object p1, Lcm2/x$f0;->w:Lcm2/x$f0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_a
    const-string v0, "STRAIN_1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto :goto_0

    :cond_a
    sget-object p1, Lcm2/x$e0;->w:Lcm2/x$e0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :sswitch_0
    const-string v0, "POOR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto :goto_0

    :cond_b
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1

    :sswitch_1
    const-string v0, "OPTIMAL"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_0

    :cond_c
    sget-object p1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p1

    :sswitch_2
    const-string v0, "SUFFICIENT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_0

    :cond_d
    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :sswitch_3
    const-string v0, "STRAIN"

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
    sget-object p1, Ly81/f;->STRAIN:Ly81/f;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d97ca8b -> :sswitch_3
        -0x328cd6e2 -> :sswitch_2
        -0x1fadf69e -> :sswitch_1
        0x259022 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch -0x66cf4819
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_1
    .packed-switch -0x61ee13a3
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Lor2/h0;Ljava/lang/Double;ZZ)Ly81/e;
    .locals 1

    const-string v0, "graphKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p4, :cond_0

    sget-object p1, Lcm2/x$j0;->w:Lcm2/x$j0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p3, :cond_1

    const p3, 0x3e4ccccd    # 0.2f

    goto :goto_0

    :cond_1
    const/high16 p3, 0x3f800000    # 1.0f

    :goto_0
    sget-object p4, Lcm2/x$a;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p4, p1

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    sget-object p1, Lcm2/x$o0;->w:Lcm2/x$o0;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance p1, Lcm2/x$n0;

    invoke-direct {p1, p3}, Lcm2/x$n0;-><init>(F)V

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p2}, Lcm2/x;->f(Ljava/lang/Double;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_3
    new-instance p1, Lcm2/x$m0;

    invoke-direct {p1, p3}, Lcm2/x$m0;-><init>(F)V

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_4
    new-instance p1, Lcm2/x$l0;

    invoke-direct {p1, p3}, Lcm2/x$l0;-><init>(F)V

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcm2/x$k0;

    invoke-direct {p1, p3}, Lcm2/x$k0;-><init>(F)V

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
