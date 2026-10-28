.class public final Lev2/n$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lev2/n;->s(Ldv2/e$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Ll0/y;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Ll0/y;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lev2/n$j;->w:Ljava/util/List;

    iput-object p2, p0, Lev2/n$j;->x:Ll0/y;

    iput-object p3, p0, Lev2/n$j;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 16

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

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lev2/n$j;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/a;

    const v2, 0x1bd431f0

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    iget-object v6, v0, Lev2/n$j;->x:Ll0/y;

    invoke-virtual {v1}, Lm91/a;->e()Ld0/q0;

    move-result-object v7

    sget-object v9, Lc0/c1;->a:Lc0/d1;

    new-instance v2, Lev2/n$d;

    iget-object v3, v0, Lev2/n$j;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v2, v1, v3}, Lev2/n$d;-><init>(Lm91/a;Lkotlin/jvm/functions/Function1;)V

    const v1, -0x1d2d4f0d

    invoke-static {v1, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x180000

    const/16 v15, 0x1a

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v15}, Landroidx/compose/animation/b;->d(Ll0/y;Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    return-void

    :cond_5
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lev2/n$j;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
