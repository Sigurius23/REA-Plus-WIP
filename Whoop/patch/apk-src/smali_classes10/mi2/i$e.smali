.class public final Lmi2/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmi2/i;->s(Lji2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
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

.field final synthetic x:Lji2/f;

.field final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lji2/f;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lmi2/i$e;->w:Ljava/util/List;

    iput-object p2, p0, Lmi2/i$e;->x:Lji2/f;

    iput-object p3, p0, Lmi2/i$e;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, p4, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    move-object/from16 v2, p3

    check-cast v2, Lp1/q;

    move-object/from16 v4, p1

    invoke-virtual {v2, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p4, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v2, 0x93

    const/16 v5, 0x92

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v2, v6

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lmi2/i$e;->w:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lji2/d;

    const v2, -0x17d6cf64

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lji2/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_5

    const v2, -0x17d5ce8e

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->n()J

    move-result-wide v10

    int-to-float v13, v3

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    mul-float/2addr v2, v13

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    iget-object v2, v0, Lmi2/i$e;->x:Lji2/f;

    invoke-virtual {v2}, Lji2/f;->e()Z

    move-result v2

    invoke-static {v1, v2, v15, v7}, Lmi2/i;->H(Lji2/d;ZLandroidx/compose/runtime/Composer;I)Lf0/t;

    move-result-object v12

    iget-object v2, v0, Lmi2/i$e;->x:Lji2/f;

    iget-object v3, v0, Lmi2/i$e;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lji2/d;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v2, v3, v4}, Lmi2/i;->G(Landroidx/compose/ui/Modifier;Lji2/f;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v2, Lmi2/i$a;

    iget-object v3, v0, Lmi2/i$e;->x:Lji2/f;

    invoke-direct {v2, v1, v3}, Lmi2/i$a;-><init>(Lji2/d;Lji2/f;)V

    const v1, 0x52d0b1b5

    invoke-static {v1, v15, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0x1b0000

    const/16 v17, 0x8

    invoke-static/range {v8 .. v17}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const v1, -0x17c69011

    invoke-virtual {v15, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v15, v7}, Lp1/q;->q(Z)V

    return-void

    :cond_6
    invoke-virtual {v15}, Lp1/q;->X()V

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

    invoke-virtual {p0, p1, p2, p3, p4}, Lmi2/i$e;->a(Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
