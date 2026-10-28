.class public final Lb3/v3;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb3/w3;

.field public final synthetic y:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lb3/w3;Lc93/m;I)V
    .locals 0

    iput p3, p0, Lb3/v3;->w:I

    iput-object p1, p0, Lb3/v3;->x:Lb3/w3;

    iput-object p2, p0, Lb3/v3;->y:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lb3/v3;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_e

    iget-object p2, p0, Lb3/v3;->x:Lb3/w3;

    iget-object v0, p2, Lb3/w3;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    const v1, 0x7f0a07b0

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/Set;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    instance-of v4, v3, Ld93/a;

    if-eqz v4, :cond_1

    instance-of v4, v3, Ld93/f;

    if-eqz v4, :cond_2

    :cond_1
    check-cast v3, Ljava/util/Set;

    goto :goto_1

    :cond_2
    move-object v3, v5

    :goto_1
    if-nez v3, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_3

    check-cast v3, Landroid/view/View;

    goto :goto_2

    :cond_3
    move-object v3, v5

    :goto_2
    if-eqz v3, :cond_4

    invoke-virtual {v3, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    goto :goto_3

    :cond_4
    move-object v1, v5

    :goto_3
    instance-of v3, v1, Ljava/util/Set;

    if-eqz v3, :cond_6

    instance-of v3, v1, Ld93/a;

    if-eqz v3, :cond_5

    instance-of v3, v1, Ld93/f;

    if-eqz v3, :cond_6

    :cond_5
    move-object v3, v1

    check-cast v3, Ljava/util/Set;

    goto :goto_4

    :cond_6
    move-object v3, v5

    :cond_7
    :goto_4
    if-eqz v3, :cond_9

    iget-object v1, p1, Lp1/q;->U:Lp1/v;

    if-nez v1, :cond_8

    new-instance v1, Lp1/v;

    iget-object v4, p1, Lp1/q;->h:Lp1/w;

    invoke-direct {v1, v4}, Lp1/v;-><init>(Lp1/s;)V

    iput-object v1, p1, Lp1/q;->U:Lp1/v;

    :cond_8
    invoke-interface {v3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iput-boolean v2, p1, Lp1/q;->q:Z

    iput-boolean v2, p1, Lp1/q;->C:Z

    iget-object v1, p1, Lp1/q;->c:Lp1/f2;

    invoke-virtual {v1}, Lp1/f2;->c()V

    iget-object v1, p1, Lp1/q;->H:Lp1/f2;

    invoke-virtual {v1}, Lp1/f2;->c()V

    iget-object v1, p1, Lp1/q;->I:Lp1/i2;

    iget-object v2, v1, Lp1/i2;->a:Lp1/f2;

    iget-object v4, v2, Lp1/f2;->J:Ljava/util/HashMap;

    iput-object v4, v1, Lp1/i2;->e:Ljava/util/HashMap;

    iget-object v2, v2, Lp1/f2;->K:La0/g0;

    iput-object v2, v1, Lp1/i2;->f:La0/g0;

    :cond_9
    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_a

    if-ne v2, v4, :cond_b

    :cond_a
    new-instance v2, Lb3/u3;

    const/4 v1, 0x0

    invoke-direct {v2, p2, v5, v1}, Lb3/u3;-><init>(Lb3/w3;Lq83/d;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lc93/m;

    invoke-static {p1, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_c

    if-ne v2, v4, :cond_d

    :cond_c
    new-instance v2, Lb3/u3;

    const/4 v1, 0x1

    invoke-direct {v2, p2, v5, v1}, Lb3/u3;-><init>(Lb3/w3;Lq83/d;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lc93/m;

    invoke-static {p1, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La2/f;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    new-instance v1, Lb3/v3;

    iget-object v2, p0, Lb3/v3;->y:Lc93/m;

    const/4 v3, 0x0

    invoke-direct {v1, p2, v2, v3}, Lb3/v3;-><init>(Lb3/w3;Lc93/m;I)V

    const p2, -0x10b420f1

    invoke-static {p2, p1, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 v1, 0x38

    invoke-static {v0, p2, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_e
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_f

    move v0, v3

    goto :goto_6

    :cond_f
    move v0, v2

    :goto_6
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_10

    iget-object p2, p0, Lb3/v3;->x:Lb3/w3;

    iget-object p2, p2, Lb3/w3;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v0, p0, Lb3/v3;->y:Lc93/m;

    invoke-static {p2, v0, p1, v2}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a(Landroidx/compose/ui/platform/AndroidComposeView;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_10
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
