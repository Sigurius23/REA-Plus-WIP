.class public final Lb30/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ZZLc93/a;Ll0/l1;Lx1/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lb30/s4;->w:I

    sget-object v0, Ll0/m;->a:Ll0/e;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lb30/s4;->x:Z

    iput-boolean p2, p0, Lb30/s4;->y:Z

    iput-object p3, p0, Lb30/s4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/s4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/s4;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZZLj0/i;Ljava/lang/Object;Li2/a1;I)V
    .locals 0

    .line 2
    iput p6, p0, Lb30/s4;->w:I

    iput-boolean p1, p0, Lb30/s4;->x:Z

    iput-boolean p2, p0, Lb30/s4;->y:Z

    iput-object p3, p0, Lb30/s4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lb30/s4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lb30/s4;->F:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lb30/s4;->w:I

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

    move-object v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v1, Ll1/t2;->a:Ll1/t2;

    iget-object p1, p0, Lb30/s4;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lj0/i;

    iget-object p1, p0, Lb30/s4;->E:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Ll1/e4;

    iget-object p1, p0, Lb30/s4;->F:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Li2/a1;

    const/high16 v11, 0x6000000

    const/16 v12, 0xc8

    iget-boolean v2, p0, Lb30/s4;->x:Z

    iget-boolean v3, p0, Lb30/s4;->y:Z

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v1 .. v12}, Ll1/t2;->a(ZZLj0/i;Landroidx/compose/ui/Modifier;Ll1/e4;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    and-int/2addr p2, v2

    move-object v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object v1, Lg1/i8;->a:Lg1/i8;

    iget-object p1, p0, Lb30/s4;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lj0/i;

    iget-object p1, p0, Lb30/s4;->E:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lg1/y1;

    iget-object p1, p0, Lb30/s4;->F:Ljava/lang/Object;

    move-object v6, p1

    check-cast v6, Li2/a1;

    const/high16 v10, 0xc00000

    const/16 v11, 0x60

    iget-boolean v2, p0, Lb30/s4;->x:Z

    iget-boolean v3, p0, Lb30/s4;->y:Z

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v11}, Lg1/i8;->a(ZZLj0/i;Lg1/e8;Li2/a1;FFLandroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

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

    goto/16 :goto_6

    :cond_5
    :goto_4
    iget-object p2, p0, Lb30/s4;->z:Ljava/lang/Object;

    check-cast p2, Lc93/a;

    sget-object v0, Lb2/t;->w:Lb2/t;

    iget-boolean v1, p0, Lb30/s4;->x:Z

    iget-boolean v2, p0, Lb30/s4;->y:Z

    invoke-static {v0, v1, v2, p2}, Landroidx/compose/foundation/selection/b;->b(Landroidx/compose/ui/Modifier;ZZLc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    iget-object v0, p0, Lb30/s4;->E:Ljava/lang/Object;

    check-cast v0, Ll0/l1;

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Ll0/m;->c:Ll0/g;

    iget-object v1, p0, Lb30/s4;->F:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x0

    invoke-static {v0, v2, p1, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    invoke-static {p1}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result v2

    move-object v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v6, v3, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v3, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v2, v3, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 p2, 0x6

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    sget-object v0, Ll0/z;->a:Ll0/z;

    invoke-virtual {v1, v0, p1, p2}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-virtual {v3, p1}, Lp1/q;->q(Z)V

    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
