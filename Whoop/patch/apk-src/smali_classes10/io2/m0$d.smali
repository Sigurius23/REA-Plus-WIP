.class public final Lio2/m0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio2/m0;->o(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio2/m0$d;->w:Ljava/util/List;

    iput-object p2, p0, Lio2/m0$d;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio2/m0$d;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v5, p1

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v1}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :cond_3
    and-int/lit16 v5, v2, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    move v5, v7

    :goto_3
    and-int/2addr v2, v8

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v0, Lio2/m0$d;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio2/p0;

    const v2, 0x4c2bbbc3    # 4.5018892E7f

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    int-to-float v2, v8

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v22, v2, v5

    invoke-virtual {v1}, Lio2/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v6, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v2, v6, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v13

    const/4 v5, 0x3

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v21

    invoke-virtual {v1}, Lio2/p0;->a()Lgz0/m0;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_5

    new-instance v4, Ly71/g;

    invoke-virtual {v1}, Lio2/p0;->a()Lgz0/m0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    invoke-direct {v4, v8, v5, v3, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v4

    goto :goto_4

    :cond_5
    move-object/from16 v17, v5

    :goto_4
    new-instance v3, Ly71/g;

    invoke-static {v2}, Lyb0/f;->a(Lx81/d;)I

    move-result v2

    sget v4, Lln2/a;->j:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    invoke-direct {v3, v2, v4}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    iget-object v2, v0, Lio2/m0$d;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    iget-object v4, v0, Lio2/m0$d;->y:Ljava/lang/String;

    invoke-virtual {v6, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_6

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_7

    :cond_6
    new-instance v4, Lio2/m0$a;

    iget-object v2, v0, Lio2/m0$d;->x:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lio2/m0$d;->y:Ljava/lang/String;

    invoke-direct {v4, v2, v5, v1}, Lio2/m0$a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lio2/p0;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v33, v4

    check-cast v33, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v2, Ly71/g;->c:I

    shl-int/lit8 v4, v2, 0x12

    or-int v35, v1, v4

    shl-int/lit8 v1, v2, 0x9

    or-int/lit8 v36, v1, 0x30

    const/16 v37, 0x0

    const v38, 0x3fd3b4

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v24, v3

    move-object/from16 v34, v6

    invoke-static/range {v9 .. v38}, Lhy0/g1;->j(Lcom/whoop/design/util/TextResource;JLi91/d;JLi2/t;ZLy71/g;Li2/t;FLhy0/o1;Li2/a1;FFLy71/g;Li2/x;FLhy0/c1;Lkd1/o;Ljava/util/List;IILandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v1, v34

    invoke-virtual {v1, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    move-object v1, v6

    invoke-virtual {v1}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lio2/m0$d;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
