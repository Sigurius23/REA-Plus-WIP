.class public final synthetic Lb30/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb30/r;->w:I

    iput-object p1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb30/r;->x:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lb30/r;->w:I

    iput-object p1, p0, Lb30/r;->x:Lp1/c1;

    iput-object p2, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb30/r;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ll3/r0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Lp12/e;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lp12/x;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp12/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lcom/whoop/core/details/view/a;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {p1, v0, v1}, Lo51/c;->b(ILkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lnh0/b;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lm90/b;->k(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lm90/b;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Lm90/b;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lm80/d;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lm01/d;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Llf0/l1;->g(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Llf0/l;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Ljp1/m;->i(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Lkb1/e;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lim1/t0;->y(Lkotlin/jvm/functions/Function1;Lp1/c1;Lkb1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Lv41/s;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Li51/r;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Lv41/s;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Li51/f;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lhv2/i;->o(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lg40/n3;

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    invoke-interface {v0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lfe0/e;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lf01/n;->j(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Ldo0/b;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v1, v0}, Ldo0/b;->d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lci0/d;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lci0/d;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lzc1/d0;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lcom/whoop/design/showcase/gallery/view/fragment/AtomicGalleryFragment;->I(Lp1/c1;Lkotlin/jvm/functions/Function1;Lzc1/d0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lb30/r;->x:Lp1/c1;

    check-cast p1, Ll3/r0;

    iget-object v1, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lc41/v1;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcs1/c;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lbs1/c0;->o0(Lp1/c1;Lkotlin/jvm/functions/Function1;Lcs1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcs1/c;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lbs1/c0;->T(Lp1/c1;Lkotlin/jvm/functions/Function1;Lcs1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-static {v0, v1, p1}, Lbs1/c0;->Y(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lb30/q;

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v1, p0, Lb30/r;->x:Lp1/c1;

    invoke-interface {v1, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p0, Lb30/r;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
