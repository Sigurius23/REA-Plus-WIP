.class public final synthetic Lp0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lp0/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 2
    iput p2, p0, Lp0/w0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp0/w0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lr61/d;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ly3/l;

    check-cast p2, Ly3/l;

    sget-object p1, Ld0/b0;->a:Ld0/v;

    const/4 p2, 0x2

    const/16 v0, 0x12c

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-static {p1, p2}, Lqm1/e;->f(Ljava/lang/Object;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lh91/b;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lqj2/b;->a(Lh91/b;I)Lg51/c;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lqg0/f;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lq83/j;

    check-cast p2, Lq83/h;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    sget-object v0, Lq83/k;->w:Lq83/k;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lq83/e;->w:Lq83/e;

    invoke-interface {p1, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v2

    check-cast v2, Lq83/f;

    if-nez v2, :cond_1

    new-instance v0, Lq83/c;

    invoke-direct {v0, p2, p1}, Lq83/c;-><init>(Lq83/h;Lq83/j;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lq83/c;

    invoke-direct {p1, v2, p2}, Lq83/c;-><init>(Lq83/h;Lq83/j;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lq83/c;

    new-instance v1, Lq83/c;

    invoke-direct {v1, p2, p1}, Lq83/c;-><init>(Lq83/h;Lq83/j;)V

    invoke-direct {v0, v2, v1}, Lq83/c;-><init>(Lq83/h;Lq83/j;)V

    goto :goto_0

    :goto_1
    return-object p2

    :pswitch_5
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lq83/h;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lcom/whoop/payments/domain/models/Card;

    invoke-static {p1, p2}, Lq22/d;->q(ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lq22/h;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lq22/d;->e(Lq22/h;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lq22/a;->b(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lq22/a;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lq22/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lq12/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p1, p2}, Lse/a;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ly1/b;

    check-cast p2, Lq0/b;

    invoke-virtual {p2}, Lq0/y;->k()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p2, Lq0/y;->d:Ll9/o;

    iget-object v0, v0, Ll9/o;->d:Ljava/lang/Object;

    check-cast v0, Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    const/high16 v1, -0x41000000    # -0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v1, v2}, Le93/b;->m(FFF)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p2}, Lq0/b;->m()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p1, v0, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lpp2/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lpp1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lpm2/f;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lgt0/h;

    check-cast p2, Lgt0/h;

    invoke-static {p1, p2}, Lpm2/d;->w(Lgt0/h;Lgt0/h;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lpj2/b;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {p1, p2}, Lph1/a;->a(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lcom/whoop/navigation/e;

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lpa2/a;->a(Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lp90/e;

    invoke-static {p1, p2}, Lp90/d;->r(ZLp90/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lq22/h;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lp90/d;->e(Lq22/h;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lp6/w;

    check-cast p2, Lp6/u1;

    iput-object p2, p1, Lp6/w;->d:Lp6/u1;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_18
    check-cast p1, Lp6/w;

    check-cast p2, Ly3/h;

    iget-wide v0, p2, Ly3/h;->a:J

    iput-wide v0, p1, Lp6/w;->c:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, Lp6/y;

    check-cast p2, Ln6/n;

    instance-of v0, p2, Lv6/v;

    if-nez v0, :cond_4

    instance-of v0, p2, Lv6/n;

    if-nez v0, :cond_4

    instance-of v0, p2, Lp6/u;

    if-nez v0, :cond_4

    iget-object v0, p1, Lp6/y;->b:Ln6/o;

    invoke-interface {v0, p2}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p2

    iget-object p1, p1, Lp6/y;->a:Ln6/o;

    new-instance v0, Lp6/y;

    invoke-direct {v0, p1, p2}, Lp6/y;-><init>(Ln6/o;Ln6/o;)V

    goto :goto_3

    :cond_4
    iget-object v0, p1, Lp6/y;->a:Ln6/o;

    invoke-interface {v0, p2}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p2

    iget-object p1, p1, Lp6/y;->b:Ln6/o;

    new-instance v0, Lp6/y;

    invoke-direct {v0, p2, p1}, Lp6/y;-><init>(Ln6/o;Ln6/o;)V

    :goto_3
    return-object v0

    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Ln6/n;

    instance-of p2, p2, Lo6/b;

    if-eqz p2, :cond_5

    add-int/lit8 p1, p1, 0x1

    :cond_5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p1, p2}, Lo73/a;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1c
    check-cast p1, Ly1/b;

    check-cast p2, Lp0/x0;

    invoke-virtual {p2}, Lp0/x0;->e()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_6

    const/4 p1, 0x0

    :cond_6
    return-object p1

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
