.class public final Lmj/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmj/p;


# direct methods
.method public synthetic constructor <init>(Lmj/p;I)V
    .locals 0

    iput p2, p0, Lmj/o;->w:I

    iput-object p1, p0, Lmj/o;->x:Lmj/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lmj/o;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p2, Lmj/r;->a:Lp1/u2;

    iget-object v0, p0, Lmj/o;->x:Lmj/p;

    iget-object v1, v0, Lmj/p;->a:Lcom/amplitude/android/engagement/a;

    invoke-virtual {p2, v1}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v1, Lmj/o;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lmj/o;-><init>(Lmj/p;I)V

    const v0, -0x3fd3f2a3

    invoke-static {v0, p1, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    sget-object p2, Lmj/r;->b:Lp1/u2;

    iget-object v0, p0, Lmj/o;->x:Lmj/p;

    invoke-virtual {p2, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p2

    new-instance v1, Lmj/o;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lmj/o;-><init>(Lmj/p;I)V

    const v0, 0x4bdfc09d    # 2.9327674E7f

    invoke-static {v0, p1, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v1, 0x38

    invoke-static {p2, v0, p1, v1}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_5

    :cond_5
    :goto_4
    iget-object p2, p0, Lmj/o;->x:Lmj/p;

    iget-object v0, p2, Lmj/p;->d:Luj/m;

    new-instance v1, Lmj/o;

    const/4 v2, 0x0

    invoke-direct {v1, p2, v2}, Lmj/o;-><init>(Lmj/p;I)V

    const p2, -0x53a6d980

    invoke-static {p2, p1, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p2

    const/16 v1, 0x180

    invoke-static {v0, v2, p2, p1, v1}, Luj/k;->a(Luj/m;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object v0, p0, Lmj/o;->x:Lmj/p;

    iget-object v1, v0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    and-int/lit8 p2, p2, 0xb

    const/4 v2, 0x2

    if-ne p2, v2, :cond_7

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_7

    :cond_7
    :goto_6
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/Nudge;->isCarousel()Z

    move-result p2

    const/4 v7, 0x0

    if-eqz p2, :cond_8

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p1, -0x4f64d536

    invoke-virtual {v5, p1}, Lp1/q;->f0(I)V

    iget v2, v0, Lmj/p;->c:I

    iget-object v3, v0, Lmj/p;->e:Lmj/a;

    new-instance v4, Lmj/n;

    const/4 p1, 0x0

    invoke-direct {v4, v0, p1}, Lmj/n;-><init>(Lmj/p;I)V

    const/16 v6, 0x208

    invoke-static/range {v1 .. v6}, Ldc/a;->e(Lcom/amplitude/android/engagement/types/Nudge;ILmj/a;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    check-cast p1, Lp1/q;

    const p2, -0x4f64d3b2

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    iget p2, v0, Lmj/p;->c:I

    new-instance v2, Lmj/n;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lmj/n;-><init>(Lmj/p;I)V

    const/16 v0, 0x8

    invoke-static {v1, p2, v2, p1, v0}, Lds/q;->g(Lcom/amplitude/android/engagement/types/Nudge;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v7}, Lp1/q;->q(Z)V

    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
