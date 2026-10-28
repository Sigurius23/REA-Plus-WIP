.class public final Lsl0/u0$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u0;->V(Lnl0/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;ZLkotlin/jvm/functions/Function3;Lc93/a;ZLandroidx/compose/runtime/Composer;III)V
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
.field final synthetic E:Lsl0/y0;

.field final synthetic w:Ljava/util/List;

.field final synthetic x:Lnl0/f;

.field final synthetic y:Lkotlin/jvm/functions/Function1;

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lnl0/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lsl0/y0;)V
    .locals 0

    iput-object p1, p0, Lsl0/u0$k;->w:Ljava/util/List;

    iput-object p2, p0, Lsl0/u0$k;->x:Lnl0/f;

    iput-object p3, p0, Lsl0/u0$k;->y:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lsl0/u0$k;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lsl0/u0$k;->E:Lsl0/y0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v3, p2

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p4, 0x30

    const/16 v4, 0x20

    if-nez v2, :cond_3

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v3}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v1, 0x93

    const/16 v5, 0x92

    const/4 v8, 0x0

    const/4 v6, 0x1

    if-eq v2, v5, :cond_4

    move v2, v6

    goto :goto_3

    :cond_4
    move v2, v8

    :goto_3
    and-int/lit8 v5, v1, 0x1

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lsl0/u0$k;->w:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lm91/u;

    const v2, 0x9ef41e3

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lsl0/m0;->c()Lm91/p;

    move-result-object v10

    sget-object v11, Lsl0/u0$g;->w:Lsl0/u0$g;

    and-int/lit8 v2, v1, 0x70

    xor-int/lit8 v2, v2, 0x30

    if-le v2, v4, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->e(I)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_5
    and-int/lit8 v1, v1, 0x30

    if-ne v1, v4, :cond_6

    goto :goto_4

    :cond_6
    move v6, v8

    :cond_7
    :goto_4
    iget-object v1, v0, Lsl0/u0$k;->x:Lnl0/f;

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v6

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lsl0/u0$k;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lsl0/u0$k;->z:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_9

    :cond_8
    new-instance v1, Lsl0/u0$h;

    iget-object v2, v0, Lsl0/u0$k;->E:Lsl0/y0;

    iget-object v4, v0, Lsl0/u0$k;->x:Lnl0/f;

    iget-object v6, v0, Lsl0/u0$k;->y:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lsl0/u0$k;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v1 .. v7}, Lsl0/u0$h;-><init>(Lsl0/y0;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v1

    :cond_9
    move-object v12, v2

    check-cast v12, Lkotlin/jvm/functions/Function1;

    sget v1, Lm91/p;->b:I

    shl-int/lit8 v14, v1, 0x3

    const/4 v15, 0x0

    move-object v9, v5

    invoke-static/range {v9 .. v15}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v8}, Lp1/q;->q(Z)V

    return-void

    :cond_a
    invoke-virtual {v13}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lsl0/u0$k;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
