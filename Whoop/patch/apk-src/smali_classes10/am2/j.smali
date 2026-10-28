.class public final synthetic Lam2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;Lp1/c1;)V
    .locals 0

    iput p1, p0, Lam2/j;->w:I

    iput-object p2, p0, Lam2/j;->x:Lp1/c1;

    iput-object p3, p0, Lam2/j;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lam2/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/i5;->j(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/i5;->s(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/i5;->r(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lzc1/i5;->l(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Lg2/v;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lw80/b;->g(Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lrm1/i;->e(Lp1/c1;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lrm1/h;->e(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lrm1/h;->h(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lmq2/g;->d(Lp1/c1;Lp1/c1;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Ly2/y;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lmq2/g;->e(Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Ll3/r0;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lh01/s;->d(Lp1/c1;Lp1/c1;Ll3/r0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Landroid/net/Uri;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lgv1/g;->c(Lp1/c1;Lp1/c1;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Ljava/lang/Integer;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Le81/d0;->a(Lp1/c1;Lp1/c1;Ljava/lang/Integer;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lam2/j;->x:Lp1/c1;

    iget-object v1, p0, Lam2/j;->y:Lp1/c1;

    invoke-static {v0, v1, p1}, Lam2/k;->h(Lp1/c1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lam2/j;->y:Lp1/c1;

    check-cast p1, Lg1/z3;

    iget-object v1, p0, Lam2/j;->x:Lp1/c1;

    invoke-static {v1, v0, p1}, Lam2/k;->n(Lp1/c1;Lp1/c1;Lg1/z3;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
