.class public final Laq1/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq1/f;->u(Lyp1/b$c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Laq1/f$e;->w:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p2

    and-int/lit8 v1, p4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v0}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v1, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v1, v6

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    move-object/from16 v1, p0

    iget-object v4, v1, Laq1/f$e;->w:Ljava/util/List;

    invoke-interface {v4, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lm91/u;

    const v0, -0x3aa5bd20

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    instance-of v0, v8, Lso1/y;

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x6

    if-eqz v0, :cond_5

    const v0, -0x3aa52d83

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v2

    int-to-float v2, v3

    invoke-static {v0, v2, v4, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    check-cast v8, Lso1/y;

    invoke-static {v8, v12, v7}, Lwo1/w;->b(Lso1/y;Landroidx/compose/runtime/Composer;I)V

    int-to-float v0, v5

    invoke-static {v0, v2, v4, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_4

    :cond_5
    instance-of v0, v8, Lf11/e;

    if-eqz v0, :cond_7

    const v0, -0x3aa06a57

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lf11/c;

    invoke-direct {v0}, Lf11/c;-><init>()V

    move-object v13, v8

    check-cast v13, Lf11/e;

    const/16 v26, 0xeff

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/high16 v22, 0x41400000    # 12.0f

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Lf11/e;->b(Lf11/e;Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;ILjava/lang/Object;)Lf11/e;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v6, v8, :cond_6

    sget-object v6, Laq1/f$b;->w:Laq1/f$b;

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v8, Lf11/e;->m:I

    or-int/lit8 v8, v8, 0x30

    sget v9, Lf11/c;->a:I

    shl-int/lit8 v5, v9, 0x6

    or-int/2addr v5, v8

    invoke-virtual {v0, v2, v6, v12, v5}, Lf11/c;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    int-to-float v0, v3

    invoke-static {v0, v0, v4, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_4

    :cond_7
    const v0, -0x3a9bb3e2

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    const/16 v14, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v0, v3

    invoke-static {v0, v0, v4, v12, v7}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_4
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_8
    move-object/from16 v1, p0

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

    invoke-virtual {p0, p1, p2, p3, p4}, Laq1/f$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
