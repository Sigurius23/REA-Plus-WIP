.class public final synthetic Lbs1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbs1/i;->w:I

    iput-object p1, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbs1/i;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lbs1/i;->w:I

    iput-object p1, p0, Lbs1/i;->y:Lp1/c1;

    iput-object p2, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbs1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lp41/c;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lp11/a;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lot1/d;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lnw0/g;->o(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lmf2/f;->i(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Llf0/t0;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Llc0/j;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Llc0/j;->g(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Ljp1/r;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Liw0/x;->N(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lhe2/c;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lh02/o0;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lgv1/n;->d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lfg2/j;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_d
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lfg2/h;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_e
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lfc2/b;->e(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_f
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lf51/d;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_10
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lep1/q;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v0, p0, Lbs1/i;->y:Lp1/c1;

    iget-object v1, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lej1/o;->f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_12
    iget-object v0, p0, Lbs1/i;->y:Lp1/c1;

    iget-object v1, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Leg2/j;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_13
    iget-object v0, p0, Lbs1/i;->y:Lp1/c1;

    iget-object v1, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Leg2/j;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Ldk2/j;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_15
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Ld42/j;->k(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/edit/form/HeightWeightGroupedFormFieldKt;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/ProfileScreenKt;->x(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_19
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lc41/y4;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1a
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lbs1/c0;->y0(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lbs1/l;->b(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v0, p0, Lbs1/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbs1/i;->y:Lp1/c1;

    invoke-static {v0, v1}, Lbs1/l;->c(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

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
