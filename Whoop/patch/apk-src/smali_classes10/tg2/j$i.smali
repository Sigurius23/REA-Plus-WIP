.class public final Ltg2/j$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg2/j;->l(Ln82/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V
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

.field final synthetic x:Lkotlin/jvm/functions/Function1;

.field final synthetic y:Ln82/c;

.field final synthetic z:Lp1/a1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ln82/c;Lp1/a1;)V
    .locals 0

    iput-object p1, p0, Ltg2/j$i;->w:Ljava/util/List;

    iput-object p2, p0, Ltg2/j$i;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Ltg2/j$i;->y:Ln82/c;

    iput-object p4, p0, Ltg2/j$i;->z:Lp1/a1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v2, p2

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    move-object/from16 v3, p1

    invoke-virtual {v1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x30

    const/16 v10, 0x20

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v10

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    move v11, v1

    and-int/lit16 v1, v11, 0x93

    const/16 v3, 0x92

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v1, v3, :cond_4

    move v1, v12

    goto :goto_3

    :cond_4
    move v1, v13

    :goto_3
    and-int/lit8 v3, v11, 0x1

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v0, Ltg2/j$i;->w:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    const v3, -0x5a8b4308

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    new-instance v3, Lb81/j;

    invoke-static {v14, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    iget-object v4, v0, Ltg2/j$i;->z:Lp1/a1;

    invoke-static {v4}, Ltg2/j;->r(Lp1/a1;)I

    move-result v4

    if-ne v4, v2, :cond_5

    move v4, v12

    goto :goto_4

    :cond_5
    move v4, v13

    :goto_4
    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v5, 0x0

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    move-object v15, v3

    move-object v3, v1

    move-object v1, v15

    invoke-direct/range {v1 .. v9}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v3, v11, 0x70

    xor-int/lit8 v3, v3, 0x30

    if-le v3, v10, :cond_6

    invoke-virtual {v14, v2}, Lp1/q;->e(I)Z

    move-result v3

    if-nez v3, :cond_8

    :cond_6
    and-int/lit8 v3, v11, 0x30

    if-ne v3, v10, :cond_7

    goto :goto_5

    :cond_7
    move v12, v13

    :cond_8
    :goto_5
    iget-object v3, v0, Ltg2/j$i;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v12

    iget-object v4, v0, Ltg2/j$i;->y:Ln82/c;

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_a

    :cond_9
    new-instance v4, Ltg2/j$g;

    iget-object v3, v0, Ltg2/j$i;->x:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Ltg2/j$i;->y:Ln82/c;

    iget-object v6, v0, Ltg2/j$i;->z:Lp1/a1;

    invoke-direct {v4, v2, v3, v5, v6}, Ltg2/j$g;-><init>(ILkotlin/jvm/functions/Function1;Ln82/c;Lp1/a1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    sget v2, Lb81/j;->f:I

    invoke-static {v1, v4, v14, v2}, Lb81/i;->c(Lb81/j;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    return-void

    :cond_b
    invoke-virtual {v14}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Ltg2/j$i;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
