.class public final Lbm/i;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Lbm/a;

.field public final synthetic x:Lx1/b;

.field public final synthetic y:Lbm/n;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lbm/a;Lx1/b;Lbm/n;I)V
    .locals 0

    iput-object p1, p0, Lbm/i;->w:Lbm/a;

    iput-object p2, p0, Lbm/i;->x:Lx1/b;

    iput-object p3, p0, Lbm/i;->y:Lbm/n;

    iput p4, p0, Lbm/i;->z:I

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    const-string v0, "$this$items"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p4, 0xe

    if-nez v0, :cond_1

    move-object v0, p3

    check-cast v0, Lp1/q;

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 p4, p4, 0x70

    if-nez p4, :cond_3

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p2}, Lp1/q;->e(I)Z

    move-result p4

    if-eqz p4, :cond_2

    const/16 p4, 0x20

    goto :goto_2

    :cond_2
    const/16 p4, 0x10

    :goto_2
    or-int/2addr v0, p4

    :cond_3
    and-int/lit16 p4, v0, 0x2db

    const/16 v1, 0x92

    if-ne p4, v1, :cond_5

    move-object p4, p3

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_5
    :goto_3
    sget-object p4, Lb2/t;->w:Lb2/t;

    iget-object v1, p0, Lbm/i;->w:Lbm/a;

    const/4 v2, 0x0

    invoke-static {p4, v1, v2}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/Modifier;Lt2/a;Lt2/d;)Landroidx/compose/ui/Modifier;

    move-result-object p4

    const/high16 v1, 0x3f800000    # 1.0f

    check-cast p1, Landroidx/compose/foundation/lazy/b;

    invoke-virtual {p1, v1, p4}, Landroidx/compose/foundation/lazy/b;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 p4, 0x3

    const/4 v1, 0x0

    invoke-static {p1, v2, v1, p4}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    check-cast p3, Lp1/q;

    const p4, 0x2bb5b5d7

    invoke-virtual {p3, p4}, Lp1/q;->f0(I)V

    sget-object p4, Lb2/e;->w:Lb2/m;

    invoke-static {p4, v1, p3, v1}, Ll0/q;->e(Lb2/h;ZLandroidx/compose/runtime/Composer;I)Ll0/t;

    move-result-object p4

    const v2, -0x4ee9b9da

    invoke-virtual {p3, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p3, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    sget-object v3, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {p3, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/m;

    sget-object v4, Lb3/v1;->s:Lp1/u2;

    invoke-virtual {p3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb3/j3;

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    new-instance v6, Ly2/b0;

    const/4 v7, 0x1

    invoke-direct {v6, v7, p1}, Ly2/b0;-><init>(ILandroidx/compose/ui/Modifier;)V

    new-instance p1, Lx1/b;

    const v8, -0x7e903e5b

    invoke-direct {p1, v6, v7, v8}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {p3}, Lp1/q;->i0()V

    iget-boolean v6, p3, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {p3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Lp1/q;->s0()V

    :goto_4
    iput-boolean v1, p3, Lp1/q;->y:Z

    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p3, v5, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->e:La3/i;

    invoke-static {p3, p4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->h:La3/i;

    invoke-static {p3, p4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p4, La3/k;->i:La3/i;

    invoke-static {p3, p4, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget p4, p3, Lp1/q;->z:I

    if-ltz p4, :cond_7

    move p4, v7

    goto :goto_5

    :cond_7
    move p4, v1

    :goto_5
    iput-boolean p4, p3, Lp1/q;->y:Z

    new-instance p4, Lp1/d2;

    invoke-direct {p4, p3}, Lp1/d2;-><init>(Landroidx/compose/runtime/Composer;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, p4, p3, v2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p1, 0x7ab4aae9

    invoke-virtual {p3, p1}, Lp1/q;->f0(I)V

    const p1, -0x7f65a980

    invoke-virtual {p3, p1}, Lp1/q;->f0(I)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    and-int/lit8 p2, v0, 0x70

    iget p4, p0, Lbm/i;->z:I

    and-int/lit16 p4, p4, 0x380

    or-int/2addr p2, p4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p4, p0, Lbm/i;->x:Lx1/b;

    iget-object v0, p0, Lbm/i;->y:Lbm/n;

    invoke-virtual {p4, v0, p1, p3, p2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3, v1, v1, v7, v1}, Lb9/y;->B(Lp1/q;ZZZZ)V

    invoke-virtual {p3, v1}, Lp1/q;->q(Z)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
