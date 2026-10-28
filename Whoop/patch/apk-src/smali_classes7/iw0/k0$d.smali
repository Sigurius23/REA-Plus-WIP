.class public final Liw0/k0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liw0/k0;->j(Landroidx/compose/ui/Modifier;Liw0/l0;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic E:Lkotlin/jvm/functions/Function1;

.field final synthetic F:Z

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Landroidx/compose/ui/Modifier;

.field final synthetic y:Liw0/l0;

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/util/List;Landroidx/compose/ui/Modifier;Liw0/l0;ZLkotlin/jvm/functions/Function1;Z)V
    .locals 0

    iput-object p1, p0, Liw0/k0$d;->w:Ljava/util/List;

    iput-object p2, p0, Liw0/k0$d;->x:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Liw0/k0$d;->y:Liw0/l0;

    iput-boolean p4, p0, Liw0/k0$d;->z:Z

    iput-object p5, p0, Liw0/k0$d;->E:Lkotlin/jvm/functions/Function1;

    iput-boolean p6, p0, Liw0/k0$d;->F:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v2, 0x93

    const/16 v4, 0x92

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_4

    move v3, v6

    goto :goto_3

    :cond_4
    move v3, v5

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Liw0/k0$d;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Liw0/y;

    const v1, -0x7a00ca50    # -2.3999806E-35f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Liw0/k0$d;->x:Landroidx/compose/ui/Modifier;

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    int-to-float v4, v6

    mul-float/2addr v4, v3

    invoke-static {v1, v2, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v14}, Liw0/y;->b()Z

    move-result v8

    new-instance v13, Liw0/k0$a;

    iget-object v15, v0, Liw0/k0$d;->y:Liw0/l0;

    iget-boolean v1, v0, Liw0/k0$d;->z:Z

    iget-object v2, v0, Liw0/k0$d;->E:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, v0, Liw0/k0$d;->F:Z

    move/from16 v16, v1

    move-object/from16 v17, v2

    move/from16 v18, v3

    invoke-direct/range {v13 .. v18}, Liw0/k0$a;-><init>(Liw0/y;Liw0/l0;ZLkotlin/jvm/functions/Function1;Z)V

    const v1, 0x4d3a8ef

    invoke-static {v1, v12, v13}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v13, 0x6000

    const/16 v14, 0xc

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v14}, Lo11/s;->e(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_5
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Liw0/k0$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
