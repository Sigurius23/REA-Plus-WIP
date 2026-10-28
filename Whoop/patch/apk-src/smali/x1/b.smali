.class public final Lx1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;
.implements Lkotlin/jvm/functions/Function3;
.implements Lc93/n;
.implements Lc93/o;
.implements Lc93/p;
.implements Lc93/q;
.implements Lc93/r;
.implements Lc93/s;
.implements Lc93/b;
.implements Lc93/c;
.implements Lc93/d;
.implements Lc93/e;
.implements Lc93/f;
.implements Lc93/g;
.implements Lc93/h;
.implements Lc93/i;
.implements Lc93/j;
.implements Lc93/k;
.implements Lc93/l;


# instance fields
.field public E:Ljava/util/ArrayList;

.field public final w:I

.field public final x:Z

.field public y:Ljava/lang/Object;

.field public z:Lp1/v1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lx1/b;->w:I

    iput-boolean p2, p0, Lx1/b;->x:Z

    iput-object p1, p0, Lx1/b;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 8

    check-cast p1, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, p1}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-static {v1, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr p2, v0

    iget-object v0, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v0, Lc93/m;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Lj1/h;

    const/16 v6, 0x8

    const/4 v7, 0x1

    const/4 v1, 0x2

    const-class v3, Lx1/b;

    const-string v4, "invoke"

    const-string v5, "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;"

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lj1/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object p2
.end method

.method public final c(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 3

    check-cast p2, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, p2}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v1}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {v1, v1}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p3

    iget-object v1, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x3

    invoke-static {v2, v1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function3;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v1, La11/j;

    const/16 v2, 0x13

    invoke-direct {v1, p0, p1, p3, v2}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, p2, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 7

    check-cast p3, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, p3}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    invoke-static {v1, v1}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v1}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p4

    iget-object v1, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x4

    invoke-static {v2, v1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v1, Lc93/n;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, p1, p2, p3, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_1

    new-instance v1, La11/o;

    const/4 v6, 0x6

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p4

    invoke-direct/range {v1 .. v6}, La11/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, p3, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v0
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 11

    move-object/from16 v8, p6

    check-cast v8, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, v8}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x5

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int v0, p7, v0

    iget-object v2, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x7

    invoke-static {v3, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/q;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    invoke-interface/range {v2 .. v9}, Lc93/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1

    new-instance v0, Lbe1/f;

    const/16 v8, 0xf

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbe1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v9
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 9

    move-object v6, p4

    check-cast v6, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, v6}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x3

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int/2addr v0, p5

    iget-object v2, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x5

    invoke-static {v3, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/o;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-interface/range {v2 .. v7}, Lc93/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1

    new-instance v0, Lwm1/e;

    const/16 v6, 0x16

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lwm1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v7
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 10

    move-object v7, p5

    check-cast v7, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, v7}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int v0, p6, v0

    iget-object v2, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x6

    invoke-static {v3, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/p;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-interface/range {v2 .. v8}, Lc93/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1

    new-instance v0, Lud0/b;

    const/4 v7, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lud0/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v8
.end method

.method public final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 12

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, v9}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x6

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int v0, p8, v0

    iget-object v2, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-static {v3, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/r;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-interface/range {v2 .. v10}, Lc93/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1

    new-instance v0, Lb30/u2;

    const/16 v9, 0xd

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lb30/u2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v10
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
    .locals 13

    move-object/from16 v11, p9

    check-cast v11, Lp1/q;

    iget v0, p0, Lx1/b;->w:I

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0, v11}, Lx1/b;->j(Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0, v2}, Lx1/c;->a(II)I

    move-result v0

    :goto_0
    or-int v0, p10, v0

    iget-object v2, p0, Lx1/b;->y:Ljava/lang/Object;

    const-string v3, "null cannot be cast to non-null type kotlin.Function10<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"p6\")] kotlin.Any?, @[ParameterName(name = \"p7\")] kotlin.Any?, @[ParameterName(name = \"p8\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0xa

    invoke-static {v3, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/b;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-interface/range {v2 .. v12}, Lc93/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_1

    new-instance v0, Ld42/n;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ld42/n;-><init>(Lx1/b;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_1
    return-object v12
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lx1/b;->a(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lx1/b;->c(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p3, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lx1/b;->d(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 4
    move-object v4, p4

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Number;

    invoke-virtual {p5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lx1/b;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 5
    move-object v5, p5

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lx1/b;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 6
    move-object v6, p6

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p7, Ljava/lang/Number;

    invoke-virtual {p7}, Ljava/lang/Number;->intValue()I

    move-result v7

    move-object v3, p3

    check-cast v3, Ljava/lang/Boolean;

    move-object v5, p5

    check-cast v5, Ljava/lang/Boolean;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v7}, Lx1/b;->e(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;Ljava/lang/Boolean;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 7
    move-object/from16 v7, p7

    check-cast v7, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p8

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v8

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v8}, Lx1/b;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 8
    move-object/from16 v9, p9

    check-cast v9, Landroidx/compose/runtime/Composer;

    move-object/from16 v0, p10

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v10

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-virtual/range {v0 .. v10}, Lx1/b;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Landroidx/compose/runtime/Composer;)V
    .locals 4

    iget-boolean v0, p0, Lx1/b;->x:Z

    if-eqz v0, :cond_4

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->B()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p1, v0, Lp1/v1;->b:I

    or-int/lit8 p1, p1, 0x1

    iput p1, v0, Lp1/v1;->b:I

    iget-object p1, p0, Lx1/b;->z:Lp1/v1;

    invoke-static {p1, v0}, Lx1/c;->f(Lp1/v1;Lp1/v1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iput-object v0, p0, Lx1/b;->z:Lp1/v1;

    return-void

    :cond_0
    iget-object p1, p0, Lx1/b;->E:Ljava/util/ArrayList;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lx1/b;->E:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/v1;

    invoke-static {v3, v0}, Lx1/c;->f(Lp1/v1;Lp1/v1;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-void
.end method

.method public final k(Ll83/e;)V
    .locals 5

    iget-object v0, p0, Lx1/b;->y:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lx1/b;->y:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-object p1, p0, Lx1/b;->y:Ljava/lang/Object;

    if-nez v0, :cond_5

    iget-boolean p1, p0, Lx1/b;->x:Z

    if-eqz p1, :cond_5

    iget-object p1, p0, Lx1/b;->z:Lp1/v1;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v2, p1, Lp1/v1;->a:Lp1/w;

    if-eqz v2, :cond_1

    invoke-virtual {v2, p1, v0}, Lp1/w;->r(Lp1/v1;Ljava/lang/Object;)Lp1/p0;

    :cond_1
    iput-object v0, p0, Lx1/b;->z:Lp1/v1;

    :cond_2
    iget-object p1, p0, Lx1/b;->E:Ljava/util/ArrayList;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_1
    if-ge v1, v2, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/v1;

    iget-object v4, v3, Lp1/v1;->a:Lp1/w;

    if-eqz v4, :cond_3

    invoke-virtual {v4, v3, v0}, Lp1/w;->r(Lp1/v1;Ljava/lang/Object;)Lp1/p0;

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_5
    return-void
.end method
