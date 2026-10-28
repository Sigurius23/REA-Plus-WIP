.class public final Lvp1/h$g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvp1/h;->H0(Ltp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lvp1/h$g0;->w:Ljava/util/List;

    iput-object p2, p0, Lvp1/h$g0;->x:Lkotlin/jvm/functions/Function1;

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

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v3, v4, :cond_4

    move v3, v5

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/2addr v2, v5

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, v0, Lvp1/h$g0;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    const v2, -0x5ef9f610

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    instance-of v2, v1, Ltp1/g;

    if-eqz v2, :cond_7

    const v2, -0x5ef954a6

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    new-instance v11, Ltp1/g;

    move-object v2, v1

    check-cast v2, Ltp1/g;

    invoke-virtual {v2}, Ltp1/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Ltp1/g;->b()Lgz0/m0;

    move-result-object v13

    sget-object v14, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    const/16 v17, 0x18

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v18}, Ltp1/g;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v0, Lvp1/h$g0;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Lvp1/h$j;

    iget-object v2, v0, Lvp1/h$g0;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {v3, v1, v2}, Lvp1/h$j;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v9, v3

    check-cast v9, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v2, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v1, v2

    const/4 v12, 0x2

    const/4 v8, 0x0

    move-object v7, v11

    move v11, v1

    invoke-static/range {v7 .. v12}, Lvp1/h;->S1(Ltp1/g;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const v1, -0x5eee607b

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    invoke-virtual {v10}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lvp1/h$g0;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
