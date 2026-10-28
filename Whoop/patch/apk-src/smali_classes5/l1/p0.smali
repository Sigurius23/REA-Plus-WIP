.class public final synthetic Ll1/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Ll1/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll1/p0;->x:I

    iput-object p2, p0, Ll1/p0;->y:Ljava/lang/Object;

    iput-object p3, p0, Ll1/p0;->z:Ljava/lang/Object;

    iput-object p4, p0, Ll1/p0;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll1/p0;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/i1;Ld0/i1;Ld0/i1;ILd0/i1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ll1/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/p0;->y:Ljava/lang/Object;

    iput-object p2, p0, Ll1/p0;->z:Ljava/lang/Object;

    iput-object p3, p0, Ll1/p0;->E:Ljava/lang/Object;

    iput p4, p0, Ll1/p0;->x:I

    iput-object p5, p0, Ll1/p0;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly2/j1;ILy2/j1;Ly2/j1;Ly2/j1;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput v0, p0, Ll1/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/p0;->y:Ljava/lang/Object;

    iput p2, p0, Ll1/p0;->x:I

    iput-object p3, p0, Ll1/p0;->z:Ljava/lang/Object;

    iput-object p4, p0, Ll1/p0;->E:Ljava/lang/Object;

    iput-object p5, p0, Ll1/p0;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Ll1/p0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll1/p0;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp1/c1;

    iget-object v0, p0, Ll1/p0;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/c1;

    iget-object v0, p0, Ll1/p0;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ll1/p0;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroid/content/Context;

    iget v1, p0, Ll1/p0;->x:I

    invoke-static/range {v1 .. v6}, Lw81/c;->e(ILp1/c1;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroid/content/Context;)Landroidx/viewpager2/widget/ViewPager2;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ll1/p0;->y:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    iget-object v1, p0, Ll1/p0;->z:Ljava/lang/Object;

    check-cast v1, Ly2/j1;

    iget-object v2, p0, Ll1/p0;->E:Ljava/lang/Object;

    check-cast v2, Ly2/j1;

    iget-object v3, p0, Ll1/p0;->F:Ljava/lang/Object;

    check-cast v3, Ly2/j1;

    check-cast p1, Ly2/i1;

    const-string v4, "$this$layout"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v4, v0, Ly2/j1;->x:I

    iget v5, p0, Ll1/p0;->x:I

    sub-int v4, v5, v4

    div-int/lit8 v4, v4, 0x2

    const/4 v6, 0x0

    invoke-static {v0, v6, v4, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v4, v0, Ly2/j1;->w:I

    iget v6, v1, Ly2/j1;->x:I

    sub-int v6, v5, v6

    div-int/lit8 v6, v6, 0x2

    invoke-static {v1, v4, v6, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    iget v1, v1, Ly2/j1;->w:I

    add-int/2addr v4, v1

    iget v1, v2, Ly2/j1;->x:I

    sub-int v1, v5, v1

    div-int/lit8 v1, v1, 0x2

    invoke-static {v2, v4, v1, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v3, :cond_0

    iget v0, v0, Ly2/j1;->w:I

    invoke-static {v3, v0, v5, p1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ll1/p0;->y:Ljava/lang/Object;

    check-cast v0, Ld0/i1;

    iget-object v1, p0, Ll1/p0;->z:Ljava/lang/Object;

    check-cast v1, Ld0/i1;

    iget-object v2, p0, Ll1/p0;->E:Ljava/lang/Object;

    check-cast v2, Ld0/i1;

    iget-object v3, p0, Ll1/p0;->F:Ljava/lang/Object;

    check-cast v3, Ld0/i1;

    check-cast p1, Lc0/q;

    check-cast p1, Lc0/x;

    invoke-virtual {p1}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/k1;

    iget p1, p1, Ll1/k1;->a:I

    iget v4, p0, Ll1/p0;->x:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-ne p1, v6, :cond_1

    new-instance p1, Lkx1/b;

    const/16 v7, 0xa

    invoke-direct {p1, v7}, Lkx1/b;-><init>(I)V

    invoke-static {v0, p1}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p1

    invoke-static {v1, v5}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    invoke-static {v2, v5}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    new-instance v2, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v5, 0x15

    invoke-direct {v2, v4, v5}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-static {v0, v2}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-virtual {v1, v0}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v7, 0x15

    invoke-direct {p1, v4, v7}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-static {v0, p1}, Lc0/w0;->o(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p1

    invoke-static {v1, v5}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v1

    invoke-virtual {p1, v1}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object p1

    new-instance v1, Lkx1/b;

    const/16 v4, 0xa

    invoke-direct {v1, v4}, Lkx1/b;-><init>(I)V

    invoke-static {v0, v1}, Lc0/w0;->s(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-static {v2, v5}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p1

    :goto_0
    new-instance v0, Lkk1/b;

    const/16 v1, 0x8

    invoke-direct {v0, v3, v1}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lc0/r1;

    invoke-direct {v1, v6, v0}, Lc0/r1;-><init>(ZLc93/m;)V

    iput-object v1, p1, Lc0/l0;->d:Lc0/r1;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
