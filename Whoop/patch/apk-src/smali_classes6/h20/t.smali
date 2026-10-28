.class public final Lh20/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/v;


# static fields
.field public static final a:Lh20/t;

.field public static final b:Lh20/t;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lh20/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh20/t;->a:Lh20/t;

    new-instance v0, Lh20/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh20/t;->b:Lh20/t;

    return-void
.end method

.method public static a(Lzy/c;Ly00/o4;ZZ)Lh20/l;
    .locals 10

    const-string v0, "displayName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ly00/o4;->R:Ly00/s2;

    iget-object v1, p1, Ly00/o4;->E:Ly00/f4;

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lh20/k;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_6

    new-instance v3, Lh20/n4;

    invoke-direct {v3, v0}, Lh20/n4;-><init>(Ly00/s2;)V

    goto :goto_1

    :cond_2
    iget-object v0, p1, Ly00/o4;->L:Ly00/e4;

    if-eqz v0, :cond_6

    new-instance v3, Lh20/o4;

    invoke-direct {v3, v0}, Lh20/o4;-><init>(Ly00/e4;)V

    goto :goto_1

    :cond_3
    iget-object v0, p1, Ly00/o4;->Q:Ly00/l4;

    if-eqz v0, :cond_6

    new-instance v3, Lh20/p4;

    invoke-direct {v3, v0}, Lh20/p4;-><init>(Ly00/l4;)V

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    new-instance v3, Lh20/n4;

    invoke-direct {v3, v0}, Lh20/n4;-><init>(Ly00/s2;)V

    goto :goto_1

    :cond_5
    iget-object v0, p1, Ly00/o4;->H:Ly00/z3;

    if-eqz v0, :cond_6

    new-instance v3, Lh20/m4;

    iget-object v1, p1, Ly00/o4;->F:Ly00/v3;

    invoke-direct {v3, v0, v1}, Lh20/m4;-><init>(Ly00/z3;Ly00/v3;)V

    :cond_6
    :goto_1
    new-instance v4, Lh20/l;

    if-nez v3, :cond_7

    sget-object v3, Lh20/q4;->a:Lh20/q4;

    :cond_7
    move-object v5, p0

    move-object v6, p1

    move v8, p2

    move v9, p3

    move-object v7, v3

    invoke-direct/range {v4 .. v9}, Lh20/l;-><init>(Lzy/c;Ly00/o4;Lh20/r4;ZZ)V

    return-object v4
.end method

.method public static b(Le30/c;Lv00/c0;I)Lh20/g;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    new-instance v7, Lh20/y;

    invoke-direct {v7}, Lh20/y;-><init>()V

    and-int/lit8 v1, p2, 0x8

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    move v10, v8

    :goto_0
    const-string v1, "viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paymentMethodMetadata"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    iget-object v3, v0, Le30/c;->H:Lny/d;

    new-instance v5, Ld30/f;

    const/4 v1, 0x4

    invoke-direct {v5, v0, v1}, Ld30/f;-><init>(Le30/c;I)V

    new-instance v6, Ld30/f;

    const/4 v1, 0x5

    invoke-direct {v6, v0, v1}, Ld30/f;-><init>(Le30/c;I)V

    const-string v1, "tapToAddCollectionHandler"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, v4, Lv00/c0;->k0:Z

    const/4 v11, 0x0

    if-eqz v1, :cond_1

    new-instance v1, Lb30/m;

    invoke-direct/range {v1 .. v6}, Lb30/m;-><init>(Lbc3/c0;Lny/d;Lv00/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    move-object v14, v1

    goto :goto_1

    :cond_1
    move-object v14, v11

    :goto_1
    invoke-static {v0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    iget-object v3, v0, Le30/c;->F:Lzx/o;

    iget-object v2, v0, Le30/c;->E:Lh20/x;

    iget-object v2, v2, Lh20/x;->a:Lwz/l1;

    iget-object v5, v0, Le30/c;->Z:Lh20/f;

    iget-object v5, v5, Lh20/f;->c:Ln53/e;

    iget-object v5, v5, Ln53/e;->y:Ll83/e;

    check-cast v5, Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    move v6, v9

    iget-object v9, v0, Le30/c;->x:Lk20/a;

    move v12, v10

    iget-object v10, v0, Le30/c;->z:Landroidx/lifecycle/k1;

    move-object v13, v11

    iget-object v11, v0, Le30/c;->N:Ld1/j;

    if-eqz v12, :cond_5

    invoke-virtual {v0}, Le30/c;->n()Lh20/d0;

    move-result-object v12

    if-eqz v12, :cond_2

    invoke-interface {v12}, Lh20/d0;->b()Lq20/y;

    move-result-object v12

    goto :goto_2

    :cond_2
    move-object v12, v13

    :goto_2
    instance-of v12, v12, Lq20/n;

    if-eqz v12, :cond_4

    invoke-virtual {v0}, Le30/c;->n()Lh20/d0;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-interface {v12}, Lh20/d0;->e()Ly00/d5;

    move-result-object v12

    move-object v13, v12

    :cond_3
    if-eqz v13, :cond_4

    goto :goto_3

    :cond_4
    move v8, v6

    :goto_3
    iget-boolean v6, v4, Lv00/c0;->c0:Z

    iget-object v12, v0, Le30/c;->z:Landroidx/lifecycle/k1;

    new-instance v13, Lb5/d;

    invoke-direct {v13, v8, v6, v12}, Lb5/d;-><init>(ZZLandroidx/lifecycle/k1;)V

    :cond_5
    new-instance v6, Lh20/g;

    move v8, v5

    new-instance v5, Le30/a;

    const/4 v12, 0x1

    invoke-direct {v5, v0, v12}, Le30/a;-><init>(Le30/c;I)V

    move-object v12, v6

    new-instance v6, Ld30/f;

    const/4 v15, 0x6

    invoke-direct {v6, v0, v15}, Ld30/f;-><init>(Le30/c;I)V

    move-object v0, v12

    const/4 v12, 0x0

    move-object/from16 v16, v7

    move-object v7, v2

    move-object/from16 v2, v16

    invoke-direct/range {v0 .. v14}, Lh20/g;-><init>(Lbc3/c0;Lh20/y;Lzx/o;Lv00/c0;Lc93/a;Lkotlin/jvm/functions/Function1;Lwz/l1;ZLk20/a;Landroidx/lifecycle/k1;Lg40/z;ZLb5/d;Lb30/m;)V

    return-object v0
.end method

.method public static synthetic c(Lzy/c;Ly00/o4;ZI)Lh20/l;
    .locals 2

    and-int/lit8 v0, p3, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p2, v1

    :cond_0
    and-int/lit8 p3, p3, 0x8

    if-eqz p3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    :goto_0
    invoke-static {p0, p1, p2, v1}, Lh20/t;->a(Lzy/c;Ly00/o4;ZZ)Lh20/l;

    move-result-object p0

    return-object p0
.end method
