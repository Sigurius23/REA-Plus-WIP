.class public final Lmn1/c$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmn1/c;->o(Ljn1/d$c;Ln0/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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

.field final synthetic y:I

.field final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lj31/k;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lmn1/c$h;->w:Ljava/util/List;

    iput-object p2, p0, Lmn1/c$h;->x:Lj31/k;

    iput p3, p0, Lmn1/c$h;->y:I

    iput-object p4, p0, Lmn1/c$h;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 13

    move v0, p2

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    if-nez v3, :cond_3

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p2}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v1, 0x93

    const/16 v4, 0x92

    const/4 v12, 0x0

    if-eq v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v12

    :goto_3
    and-int/lit8 v4, v1, 0x1

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lmn1/c$h;->w:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le41/i;

    const v4, -0x5aa17446

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    iget-object v4, p0, Lmn1/c$h;->x:Lj31/k;

    invoke-virtual {v4}, Lj31/m;->v()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Le41/i;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const v4, 0x3f733333    # 0.95f

    :goto_4
    move v5, v4

    goto :goto_5

    :cond_5
    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_4

    :goto_5
    const/4 v10, 0x0

    const/16 v11, 0x1e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v4

    move-object v5, v4

    invoke-virtual {v3}, Le41/i;->getId()Ljava/lang/String;

    move-result-object v4

    iget v6, p0, Lmn1/c$h;->y:I

    add-int/2addr v6, v0

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5}, Lmn1/c;->A(Lp1/t2;)F

    move-result v5

    invoke-static {v5, v7}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v7, p0, Lmn1/c$h;->x:Lj31/k;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-instance v8, Lmn1/c$b;

    iget-object v10, p0, Lmn1/c$h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v11, p0, Lmn1/c$h;->x:Lj31/k;

    invoke-direct {v8, v3, v10, p2, v11}, Lmn1/c$b;-><init>(Le41/i;Lkotlin/jvm/functions/Function1;ILj31/k;)V

    const v0, -0x641b88e1

    invoke-static {v0, v9, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    and-int/lit8 v0, v1, 0xe

    const/high16 v1, 0x180000

    or-int/2addr v0, v1

    sget v1, Lj31/k;->t:I

    shl-int/lit8 v1, v1, 0x3

    or-int v10, v0, v1

    const/16 v11, 0x10

    move-object v3, v7

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v11}, Lj31/f;->e(Landroidx/compose/foundation/lazy/a;Lj31/m;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;ZLc93/n;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    return-void

    :cond_6
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

    invoke-virtual {p0, p1, p2, p3, p4}, Lmn1/c$h;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
