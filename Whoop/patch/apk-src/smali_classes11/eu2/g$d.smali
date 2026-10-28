.class public final Leu2/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Leu2/g;->l(Ljava/util/List;Ln0/u;Lin2/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lj31/k;

.field final synthetic y:Ljava/util/List;

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lj31/k;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Leu2/g$d;->w:Ljava/util/List;

    iput-object p2, p0, Leu2/g$d;->x:Lj31/k;

    iput-object p3, p0, Leu2/g$d;->y:Ljava/util/List;

    iput-object p4, p0, Leu2/g$d;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v0, p0

    move/from16 v4, p2

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    move-object/from16 v7, p1

    invoke-virtual {v1, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p1

    move/from16 v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v4}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    move v8, v1

    and-int/lit16 v1, v8, 0x93

    const/16 v2, 0x92

    const/4 v12, 0x0

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v12

    :goto_3
    and-int/lit8 v2, v8, 0x1

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v0, Leu2/g$d;->w:Ljava/util/List;

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    and-int/lit8 v10, v8, 0x7e

    move-object v2, v1

    check-cast v2, Leu2/p;

    const v1, 0x449d8ec9

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Leu2/g$d;->x:Lj31/k;

    invoke-virtual {v1}, Lj31/m;->v()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2}, Leu2/p;->e()Ljava/util/UUID;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v1, 0x3f733333    # 0.95f

    :goto_4
    move v13, v1

    goto :goto_5

    :cond_5
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_4

    :goto_5
    const/16 v18, 0x0

    const/16 v19, 0x1e

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v9

    invoke-static/range {v13 .. v19}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v1

    invoke-virtual {v2}, Leu2/p;->e()Ljava/util/UUID;

    move-result-object v11

    if-nez v4, :cond_6

    int-to-float v3, v12

    :goto_6
    move v15, v3

    goto :goto_7

    :cond_6
    const/16 v3, 0x8

    int-to-float v3, v3

    goto :goto_6

    :goto_7
    const/16 v17, 0x0

    const/16 v18, 0xd

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1}, Leu2/g;->B(Lp1/t2;)F

    move-result v1

    invoke-static {v1, v3}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    iget-object v14, v0, Leu2/g$d;->x:Lj31/k;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-instance v1, Leu2/g$a;

    iget-object v3, v0, Leu2/g$d;->x:Lj31/k;

    iget-object v5, v0, Leu2/g$d;->y:Ljava/util/List;

    iget-object v6, v0, Leu2/g$d;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v6}, Leu2/g$a;-><init>(Leu2/p;Lj31/k;ILjava/util/List;Lkotlin/jvm/functions/Function1;)V

    const v2, 0x2a03b032

    invoke-static {v2, v9, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    and-int/lit8 v2, v8, 0xe

    const/high16 v3, 0x180000

    or-int/2addr v2, v3

    sget v3, Lj31/k;->t:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v2, v3

    shl-int/lit8 v3, v10, 0x9

    const v4, 0xe000

    and-int/2addr v3, v4

    or-int v10, v2, v3

    move-object v4, v11

    const/16 v11, 0x10

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move-object v8, v1

    move-object v5, v13

    move-object v3, v14

    move-object v6, v15

    invoke-static/range {v2 .. v11}, Lj31/f;->e(Landroidx/compose/foundation/lazy/a;Lj31/m;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;ZLc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    return-void

    :cond_7
    invoke-virtual {v9}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Leu2/g$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
