.class public final synthetic Lrm2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrm2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrm2/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Ls32/f;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lv00/c0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lv00/c0;->P:Lv00/p;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lv00/p;->E:Lv00/o;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :pswitch_1
    check-cast p1, Lk2/c;

    invoke-static {p1}, Ls01/f;->h(Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {p1}, Ls01/f;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lf2/d;

    invoke-static {p1}, Ls01/f;->b(Lf2/d;)Lf2/g;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1}, Ls01/f;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Ls01/f;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lny2/a;

    invoke-static {p1}, Lry2/c;->c(Lny2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lrx0/g;->c(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lrx0/e;->a(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lrx0/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lrv2/e;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lrs2/c;->e(Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {p1}, Lrs2/c;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Li2/g0;

    invoke-static {p1}, Lrs2/a;->g(Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lrr2/h;->h(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/util/Map$Entry;

    invoke-static {p1}, Lrr2/h;->k(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lrq2/c0;->f(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lrq2/a0;->d(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lrq2/k;->d(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lrq2/i;->f(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {p1}, Lrq0/z0;->H(F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lcom/whoop/domain/model/teams/TeamUserListing;

    invoke-static {p1}, Lrq0/t0;->M(Lcom/whoop/domain/model/teams/TeamUserListing;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lrq0/p;

    invoke-static {p1}, Lrq0/z;->a(Lrq0/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lrq0/z;->b(Ljava/util/List;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lrp2/a;->a(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lrm2/e;->y(Lc0/q;)Lc0/e1;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lrm2/e;->r(Lc0/q;)Lc0/c1;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lrm2/e;->p(Lc0/q;)Lc0/e1;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lrm2/e;->n(Lc0/q;)Lc0/c1;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
