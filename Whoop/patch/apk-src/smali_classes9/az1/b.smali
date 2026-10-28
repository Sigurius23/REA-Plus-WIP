.class public final synthetic Laz1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Laz1/b;->w:I

    iput-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Laz1/b;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ly3/c;

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    const/4 p1, 0x0

    int-to-long v2, p1

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    new-instance p1, Ly3/j;

    invoke-direct {p1, v0, v1}, Ly3/j;-><init>(J)V

    return-object p1

    :pswitch_0
    check-cast p1, Lh2/b;

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lh2/b;

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lfh0/d;->c(Lc93/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lfg2/m;->d(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Ln0/q;

    invoke-static {v0, p1}, Lfg2/m;->c(Lc93/a;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Ly3/c;

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/b;

    return-object p1

    :pswitch_6
    check-cast p1, Ly3/c;

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/b;

    return-object p1

    :pswitch_7
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lf01/w;->d(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lep1/s;->d(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Lep1/e;->a(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lj/a;

    invoke-static {v0, p1}, Leg2/j;->g(Lc93/a;Lj/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Leg2/e;->a(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Leg2/e;->c(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Ld62/c;->d(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Ld42/b;->c(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lp1/i0;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb1/e;

    const/4 v0, 0x3

    iget-object v1, p0, Laz1/b;->x:Lc93/a;

    invoke-direct {p1, v1, v0}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_10
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Ld11/f;->h(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->j(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/ui/WhoopNewToolbar;->f(Lc93/a;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lcom/whoop/profile/view/ProfileHeaderKt;->i(Lc93/a;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lcoil/compose/AsyncImagePainter$State$Success;

    invoke-static {v0, p1}, Lce2/c;->a(Lc93/a;Lcoil/compose/AsyncImagePainter$State$Success;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lc41/y4;->g(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lc41/y4;->e(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lc41/t;->a(Lc93/a;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lg2/v;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Laz1/b;->x:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_19
    check-cast p1, Li3/z;

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La31/e;

    const/4 v1, 0x2

    iget-object v2, p0, Laz1/b;->x:Lc93/a;

    invoke-direct {v0, v2, v1}, La31/e;-><init>(Lc93/a;I)V

    invoke-static {p1, v0}, Li3/w;->c(Li3/z;Lc93/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    invoke-static {v0, p1}, Lb01/p;->k(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Laz1/h;->g(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Laz1/b;->x:Lc93/a;

    check-cast p1, Lc31/c;

    invoke-static {v0, p1}, Laz1/c;->d(Lc93/a;Lc31/c;)Ll83/a0;

    move-result-object p1

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
