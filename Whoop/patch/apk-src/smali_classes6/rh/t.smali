.class public final Lrh/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrh/n;


# static fields
.field public static final synthetic f:I


# instance fields
.field public final a:Lrh/q;

.field public final b:Lhc3/d;

.field public final c:Lai/e;

.field public final d:Lrh/d;

.field public volatile synthetic e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lrh/t;

    const-string v1, "e"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lrh/q;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lrh/t;->a:Lrh/q;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v2

    new-instance v3, Lc53/b;

    sget-object v4, Lbc3/a0;->w:Lbc3/a0;

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Lc53/b;-><init>(Lq83/i;I)V

    invoke-static {v2, v3}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v2

    iput-object v2, v0, Lrh/t;->b:Lhc3/d;

    new-instance v2, Lki/a;

    invoke-direct {v2, v0}, Lki/a;-><init>(Lrh/t;)V

    new-instance v3, Lai/e;

    invoke-direct {v3, v0}, Lai/e;-><init>(Lrh/t;)V

    iput-object v3, v0, Lrh/t;->c:Lai/e;

    iget-object v4, v1, Lrh/q;->e:Lrh/d;

    new-instance v6, Lb30/m;

    invoke-direct {v6, v4}, Lb30/m;-><init>(Lrh/d;)V

    iget-object v4, v6, Lb30/m;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    iget-object v7, v6, Lb30/m;->E:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    iget-object v8, v6, Lb30/m;->z:Ljava/lang/Object;

    check-cast v8, Ljava/util/ArrayList;

    iget-object v9, v6, Lb30/m;->F:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    iget-object v1, v1, Lrh/q;->b:Lfi/f;

    iget-object v10, v1, Lfi/f;->n:Lrh/i;

    sget-object v11, Lrh/o;->a:Lf93/a;

    iget-object v10, v10, Lrh/i;->a:Ljava/util/Map;

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_0

    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_0
    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_1

    new-instance v10, Lrh/l;

    invoke-direct {v10, v11}, Lrh/l;-><init>(I)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, Lrh/l;

    invoke-direct {v10, v5}, Lrh/l;-><init>(I)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    new-instance v10, Lzh/a;

    const/4 v12, 0x0

    invoke-direct {v10, v12}, Lzh/a;-><init>(I)V

    sget-object v13, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v14, Landroid/net/Uri;

    invoke-virtual {v13, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v6, v10, v14}, Lb30/m;->i(Lzh/a;Lj93/d;)V

    new-instance v10, Lzh/a;

    const/4 v14, 0x3

    invoke-direct {v10, v14}, Lzh/a;-><init>(I)V

    const-class v15, Ljava/lang/Integer;

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v6, v10, v15}, Lb30/m;->i(Lzh/a;Lj93/d;)V

    new-instance v10, Lyh/a;

    invoke-direct {v10, v12}, Lyh/a;-><init>(I)V

    const-class v15, Lrh/y;

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    new-instance v12, Ll83/k;

    invoke-direct {v12, v10, v14}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, Lli/b;

    invoke-direct {v10, v11}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v10, Lli/b;

    const/4 v12, 0x5

    invoke-direct {v10, v12}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v10, Lli/b;

    const/16 v12, 0xa

    invoke-direct {v10, v12}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v10, Lli/b;

    const/4 v12, 0x7

    invoke-direct {v10, v12}, Lli/b;-><init>(I)V

    const-class v12, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v13, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v10, Lli/b;

    invoke-direct {v10, v5}, Lli/b;-><init>(I)V

    const-class v12, Landroid/graphics/Bitmap;

    invoke-virtual {v13, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v6, v10, v12}, Lb30/m;->g(Luh/e;Lj93/d;)V

    sget-object v10, Lrh/p;->a:Lf93/a;

    iget-object v10, v1, Lfi/f;->n:Lrh/i;

    sget-object v12, Lrh/p;->a:Lf93/a;

    iget-object v10, v10, Lrh/i;->a:Ljava/util/Map;

    invoke-interface {v10, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    const/4 v12, 0x4

    if-nez v10, :cond_2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    :cond_2
    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-static {v10}, Lmc3/j;->a(I)Lmc3/i;

    move-result-object v10

    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1d

    sget-object v12, Lsh/n;->b:Lsh/n;

    if-lt v14, v5, :cond_6

    iget-object v5, v1, Lfi/f;->n:Lrh/i;

    sget-object v14, Lrh/p;->c:Lf93/a;

    iget-object v5, v5, Lrh/i;->a:Ljava/util/Map;

    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_3

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_3
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_6

    iget-object v5, v1, Lfi/f;->n:Lrh/i;

    sget-object v14, Lrh/p;->b:Lf93/a;

    iget-object v5, v5, Lrh/i;->a:Ljava/util/Map;

    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_4

    move-object v5, v12

    :cond_4
    check-cast v5, Lsh/n;

    invoke-virtual {v5, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    sget-object v14, Lsh/n;->c:Lsh/n;

    invoke-virtual {v5, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    :cond_5
    new-instance v5, Lsh/u;

    invoke-direct {v5, v10}, Lsh/u;-><init>(Lmc3/i;)V

    new-instance v14, Lrh/c;

    const/4 v11, 0x0

    invoke-direct {v14, v5, v11}, Lrh/c;-><init>(Lsh/j;I)V

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    new-instance v5, Lsh/c;

    iget-object v1, v1, Lfi/f;->n:Lrh/i;

    sget-object v11, Lrh/p;->b:Lf93/a;

    iget-object v1, v1, Lrh/i;->a:Ljava/util/Map;

    invoke-interface {v1, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    move-object v12, v1

    :goto_0
    check-cast v12, Lsh/n;

    invoke-direct {v5, v10, v12}, Lsh/c;-><init>(Lmc3/i;Lsh/n;)V

    new-instance v1, Lrh/c;

    const/4 v11, 0x0

    invoke-direct {v1, v5, v11}, Lrh/c;-><init>(Lsh/j;I)V

    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lzh/a;

    const/4 v5, 0x1

    invoke-direct {v1, v5}, Lzh/a;-><init>(I)V

    const-class v5, Ljava/io/File;

    invoke-virtual {v13, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->i(Lzh/a;Lj93/d;)V

    new-instance v1, Lli/b;

    const/16 v5, 0x9

    invoke-direct {v1, v5}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v1, Lli/b;

    const/4 v5, 0x4

    invoke-direct {v1, v5}, Lli/b;-><init>(I)V

    const-class v10, Ljava/nio/ByteBuffer;

    invoke-virtual {v13, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v6, v1, v10}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v1, Lzh/a;

    invoke-direct {v1, v5}, Lzh/a;-><init>(I)V

    const-class v5, Ljava/lang/String;

    invoke-virtual {v13, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->i(Lzh/a;Lj93/d;)V

    new-instance v1, Lzh/a;

    const/4 v5, 0x2

    invoke-direct {v1, v5}, Lzh/a;-><init>(I)V

    const-class v10, Lne3/e0;

    invoke-virtual {v13, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v6, v1, v10}, Lb30/m;->i(Lzh/a;Lj93/d;)V

    new-instance v1, Lyh/a;

    const/4 v10, 0x1

    invoke-direct {v1, v10}, Lyh/a;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    new-instance v11, Ll83/k;

    invoke-direct {v11, v1, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lyh/a;

    invoke-direct {v1, v5}, Lyh/a;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    new-instance v10, Ll83/k;

    invoke-direct {v10, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lli/b;

    const/16 v5, 0x8

    invoke-direct {v1, v5}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v1, Lli/b;

    const/4 v5, 0x3

    invoke-direct {v1, v5}, Lli/b;-><init>(I)V

    const-class v5, [B

    invoke-virtual {v13, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v1, Lli/b;

    const/4 v5, 0x6

    invoke-direct {v1, v5}, Lli/b;-><init>(I)V

    invoke-virtual {v13, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v6, v1, v5}, Lb30/m;->g(Luh/e;Lj93/d;)V

    new-instance v1, Lxh/f;

    invoke-direct {v1, v0, v2, v3}, Lxh/f;-><init>(Lrh/t;Lki/a;Lai/e;)V

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, Lrh/d;

    invoke-static {v4}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    iget-object v1, v6, Lb30/m;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v1}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-static {v8}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v13

    invoke-static {v7}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v14

    invoke-static {v9}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v15

    invoke-direct/range {v10 .. v15}, Lrh/d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v10, v0, Lrh/t;->d:Lrh/d;

    return-void
.end method


# virtual methods
.method public final a(Lfi/i;)Lfi/c;
    .locals 4

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v0}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v0

    new-instance v1, Lrh/r;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p0, p1, v2, v3}, Lrh/r;-><init>(Lrh/t;Lfi/i;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v3, p0, Lrh/t;->b:Lhc3/d;

    invoke-static {v3, v0, v1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    invoke-static {p1, v0}, Lrh/o;->d(Lfi/i;Lbc3/j0;)Lfi/c;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lfi/i;ILs83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    move-object/from16 v0, p3

    instance-of v2, v0, Lrh/s;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lrh/s;

    iget v3, v2, Lrh/s;->H:I

    const/high16 v5, -0x80000000

    and-int v6, v3, v5

    if-eqz v6, :cond_0

    sub-int/2addr v3, v5

    iput v3, v2, Lrh/s;->H:I

    :goto_0
    move-object v0, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lrh/s;

    invoke-direct {v2, v1, v0}, Lrh/s;-><init>(Lrh/t;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v2, v0, Lrh/s;->F:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lrh/s;->H:I

    const/4 v9, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v11, :cond_3

    if-eq v3, v10, :cond_2

    if-ne v3, v9, :cond_1

    iget-object v3, v0, Lrh/s;->z:Lrh/f;

    iget-object v4, v0, Lrh/s;->y:Lfi/i;

    iget-object v5, v0, Lrh/s;->x:Lfi/p;

    iget-object v6, v0, Lrh/s;->w:Lrh/t;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_12

    :catchall_0
    move-exception v0

    goto/16 :goto_15

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v3, v0, Lrh/s;->E:Lrh/j;

    iget-object v4, v0, Lrh/s;->z:Lrh/f;

    iget-object v5, v0, Lrh/s;->y:Lfi/i;

    iget-object v6, v0, Lrh/s;->x:Lfi/p;

    iget-object v7, v0, Lrh/s;->w:Lrh/t;

    :try_start_1
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v18, v3

    move-object/from16 v17, v4

    move-object v14, v5

    move-object v5, v6

    move-object v15, v7

    goto/16 :goto_10

    :catchall_1
    move-exception v0

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    goto/16 :goto_15

    :cond_3
    iget-object v3, v0, Lrh/s;->z:Lrh/f;

    iget-object v4, v0, Lrh/s;->y:Lfi/i;

    iget-object v5, v0, Lrh/s;->x:Lfi/p;

    iget-object v6, v0, Lrh/s;->w:Lrh/t;

    :try_start_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_f

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v7

    if-nez p2, :cond_5

    move v2, v11

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    iget-object v13, v1, Lrh/t;->c:Lai/e;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v4, Lfi/i;->c:Lhi/a;

    instance-of v3, v5, Lhi/a;

    if-eqz v3, :cond_7

    sget-object v2, Lfi/k;->e:Lf93/a;

    invoke-static {v4, v2}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/x;

    if-nez v2, :cond_6

    invoke-static {v4}, Lai/e;->a(Lfi/i;)Landroidx/lifecycle/x;

    move-result-object v2

    :cond_6
    move-object v6, v2

    new-instance v2, Lfi/s;

    iget-object v3, v13, Lai/e;->a:Lrh/t;

    invoke-direct/range {v2 .. v7}, Lfi/s;-><init>(Lrh/t;Lfi/i;Lhi/a;Landroidx/lifecycle/x;Lbc3/k1;)V

    :goto_3
    move-object v5, v2

    goto :goto_5

    :cond_7
    sget-object v3, Lfi/k;->e:Lf93/a;

    invoke-static {v4, v3}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/lifecycle/x;

    if-nez v3, :cond_9

    if-eqz v2, :cond_8

    invoke-static {v4}, Lai/e;->a(Lfi/i;)Landroidx/lifecycle/x;

    move-result-object v3

    goto :goto_4

    :cond_8
    move-object v3, v12

    :cond_9
    :goto_4
    if-eqz v3, :cond_a

    new-instance v2, Lfi/m;

    invoke-direct {v2, v3, v7}, Lfi/m;-><init>(Landroidx/lifecycle/x;Lbc3/k1;)V

    goto :goto_3

    :cond_a
    new-instance v2, Lfi/a;

    invoke-direct {v2, v7}, Lfi/a;-><init>(Lbc3/k1;)V

    goto :goto_3

    :goto_5
    invoke-interface {v5}, Lfi/p;->a()V

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v4, Lfi/i;->a:Landroid/content/Context;

    new-instance v3, Lfi/e;

    invoke-direct {v3, v4, v2}, Lfi/e;-><init>(Lfi/i;Landroid/content/Context;)V

    iget-object v2, v4, Lfi/i;->c:Lhi/a;

    iget-object v6, v13, Lai/e;->a:Lrh/t;

    iget-object v6, v6, Lrh/t;->a:Lrh/q;

    iget-object v6, v6, Lrh/q;->b:Lfi/f;

    iput-object v6, v3, Lfi/e;->b:Lfi/f;

    iget-object v6, v4, Lfi/i;->t:Lfi/g;

    iget-object v7, v6, Lfi/g;->d:Lgi/j;

    if-nez v7, :cond_e

    instance-of v13, v2, Lhi/a;

    if-eqz v13, :cond_d

    iget-object v13, v2, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {v13}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v14

    sget-object v15, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    if-eq v14, v15, :cond_c

    sget-object v15, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    if-ne v14, v15, :cond_b

    goto :goto_6

    :cond_b
    new-instance v14, Lgi/f;

    invoke-direct {v14, v13}, Lgi/f;-><init>(Landroid/widget/ImageView;)V

    goto :goto_7

    :cond_c
    :goto_6
    sget-object v14, Lgi/j;->a:Lgi/e;

    goto :goto_7

    :cond_d
    sget-object v14, Lgi/j;->a:Lgi/e;

    :goto_7
    iput-object v14, v3, Lfi/e;->k:Lgi/j;

    goto :goto_8

    :cond_e
    move-object v14, v7

    :goto_8
    iget-object v13, v6, Lfi/g;->e:Lgi/g;

    if-nez v13, :cond_15

    instance-of v13, v2, Lhi/a;

    if-eqz v13, :cond_f

    move-object v13, v2

    goto :goto_9

    :cond_f
    move-object v13, v12

    :goto_9
    if-eqz v13, :cond_10

    iget-object v13, v13, Lhi/a;->x:Landroid/widget/ImageView;

    goto :goto_a

    :cond_10
    move-object v13, v12

    :goto_a
    if-eqz v13, :cond_11

    goto :goto_b

    :cond_11
    move-object v13, v12

    :goto_b
    if-eqz v13, :cond_14

    sget-object v4, Lki/l;->a:[Landroid/graphics/Bitmap$Config;

    invoke-virtual {v13}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v4

    if-nez v4, :cond_12

    const/4 v4, -0x1

    goto :goto_c

    :cond_12
    sget-object v13, Lki/k;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v13, v4

    :goto_c
    if-eq v4, v11, :cond_13

    if-eq v4, v10, :cond_13

    if-eq v4, v9, :cond_13

    const/4 v13, 0x4

    if-eq v4, v13, :cond_13

    sget-object v4, Lgi/g;->w:Lgi/g;

    goto :goto_d

    :cond_13
    sget-object v4, Lgi/g;->x:Lgi/g;

    goto :goto_d

    :cond_14
    iget-object v4, v4, Lfi/i;->q:Lgi/g;

    :goto_d
    iput-object v4, v3, Lfi/e;->l:Lgi/g;

    :cond_15
    iget-object v4, v6, Lfi/g;->f:Lgi/d;

    if-nez v4, :cond_18

    if-nez v7, :cond_16

    sget-object v4, Lgi/j;->a:Lgi/e;

    invoke-static {v14, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_16

    sget-object v2, Lgi/d;->x:Lgi/d;

    goto :goto_e

    :cond_16
    instance-of v4, v2, Lhi/a;

    if-eqz v4, :cond_17

    instance-of v4, v14, Lgi/f;

    if-eqz v4, :cond_17

    iget-object v2, v2, Lhi/a;->x:Landroid/widget/ImageView;

    check-cast v14, Lgi/f;

    iget-object v4, v14, Lgi/f;->b:Landroid/widget/ImageView;

    if-ne v2, v4, :cond_17

    sget-object v2, Lgi/d;->x:Lgi/d;

    goto :goto_e

    :cond_17
    sget-object v2, Lgi/d;->w:Lgi/d;

    :goto_e
    iput-object v2, v3, Lfi/e;->m:Lgi/d;

    :cond_18
    invoke-virtual {v3}, Lfi/e;->a()Lfi/i;

    move-result-object v4

    sget-object v3, Lrh/f;->a:Lrh/f;

    :try_start_3
    iget-object v2, v4, Lfi/i;->b:Ljava/lang/Object;

    sget-object v6, Lfi/n;->a:Lfi/n;

    invoke-virtual {v2, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    invoke-interface {v5}, Lfi/p;->start()V

    if-nez p2, :cond_19

    iput-object v1, v0, Lrh/s;->w:Lrh/t;

    iput-object v5, v0, Lrh/s;->x:Lfi/p;

    iput-object v4, v0, Lrh/s;->y:Lfi/i;

    iput-object v3, v0, Lrh/s;->z:Lrh/f;

    iput v11, v0, Lrh/s;->H:I

    invoke-interface {v5, v0}, Lfi/p;->b(Lrh/s;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v2, v8, :cond_19

    goto/16 :goto_11

    :catchall_2
    move-exception v0

    move-object v6, v1

    goto/16 :goto_15

    :cond_19
    move-object v6, v1

    :goto_f
    :try_start_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v4, Lfi/i;->c:Lhi/a;

    if-eqz v2, :cond_1b

    iget-object v7, v4, Lfi/i;->m:Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrh/j;

    if-nez v7, :cond_1a

    iget-object v7, v4, Lfi/i;->u:Lfi/f;

    iget-object v7, v7, Lfi/f;->h:Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lrh/j;

    :cond_1a
    invoke-virtual {v2, v7}, Lhi/a;->b(Lrh/j;)V

    :cond_1b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v4, Lfi/i;->d:Lfi/h;

    if-eqz v2, :cond_1c

    invoke-interface {v2, v4}, Lfi/h;->onStart(Lfi/i;)V

    :cond_1c
    iget-object v2, v4, Lfi/i;->p:Lgi/j;

    iput-object v6, v0, Lrh/s;->w:Lrh/t;

    iput-object v5, v0, Lrh/s;->x:Lfi/p;

    iput-object v4, v0, Lrh/s;->y:Lfi/i;

    iput-object v3, v0, Lrh/s;->z:Lrh/f;

    iput-object v12, v0, Lrh/s;->E:Lrh/j;

    iput v10, v0, Lrh/s;->H:I

    invoke-interface {v2, v0}, Lgi/j;->a(Lrh/s;)Ljava/lang/Object;

    move-result-object v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne v2, v8, :cond_1d

    goto :goto_11

    :cond_1d
    move-object/from16 v17, v3

    move-object v14, v4

    move-object v15, v6

    move-object/from16 v18, v12

    :goto_10
    :try_start_5
    move-object/from16 v16, v2

    check-cast v16, Lgi/i;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v14, Lfi/i;->g:Lq83/j;

    new-instance v13, Lcz/d;

    const/16 v19, 0x0

    const/16 v20, 0xc

    invoke-direct/range {v13 .. v20}, Lcz/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object/from16 v3, v17

    :try_start_6
    iput-object v15, v0, Lrh/s;->w:Lrh/t;

    iput-object v5, v0, Lrh/s;->x:Lfi/p;

    iput-object v14, v0, Lrh/s;->y:Lfi/i;

    iput-object v3, v0, Lrh/s;->z:Lrh/f;

    iput-object v12, v0, Lrh/s;->E:Lrh/j;

    iput v9, v0, Lrh/s;->H:I

    invoke-static {v2, v13, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-ne v2, v8, :cond_1e

    :goto_11
    return-object v8

    :cond_1e
    move-object v4, v14

    move-object v6, v15

    :goto_12
    :try_start_7
    check-cast v2, Lfi/l;

    instance-of v0, v2, Lfi/q;

    if-eqz v0, :cond_1f

    move-object v0, v2

    check-cast v0, Lfi/q;

    iget-object v7, v4, Lfi/i;->c:Lhi/a;

    invoke-virtual {v6, v0, v7, v3}, Lrh/t;->e(Lfi/q;Lhi/a;Lrh/f;)V

    goto :goto_13

    :cond_1f
    instance-of v0, v2, Lfi/d;

    if-eqz v0, :cond_20

    move-object v0, v2

    check-cast v0, Lfi/d;

    iget-object v7, v4, Lfi/i;->c:Lhi/a;

    invoke-virtual {v6, v0, v7, v3}, Lrh/t;->d(Lfi/d;Lhi/a;Lrh/f;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_13
    invoke-interface {v5}, Lfi/p;->complete()V

    return-object v2

    :cond_20
    :try_start_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catchall_3
    move-exception v0

    :goto_14
    move-object v4, v14

    move-object v6, v15

    goto :goto_15

    :catchall_4
    move-exception v0

    move-object/from16 v3, v17

    goto :goto_14

    :cond_21
    :try_start_9
    new-instance v0, Lcoil3/request/NullRequestDataException;

    invoke-direct {v0}, Lcoil3/request/NullRequestDataException;-><init>()V

    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :goto_15
    :try_start_a
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    if-eqz v2, :cond_23

    iget-object v2, v6, Lrh/t;->a:Lrh/q;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v4, Lfi/i;->d:Lfi/h;

    if-eqz v2, :cond_22

    invoke-interface {v2, v4}, Lfi/h;->onCancel(Lfi/i;)V

    :cond_22
    throw v0

    :catchall_5
    move-exception v0

    goto :goto_16

    :cond_23
    invoke-static {v4, v0}, Ldc/a;->f(Lfi/i;Ljava/lang/Throwable;)Lfi/d;

    move-result-object v0

    iget-object v2, v4, Lfi/i;->c:Lhi/a;

    invoke-virtual {v6, v0, v2, v3}, Lrh/t;->d(Lfi/d;Lhi/a;Lrh/f;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    invoke-interface {v5}, Lfi/p;->complete()V

    return-object v0

    :goto_16
    invoke-interface {v5}, Lfi/p;->complete()V

    throw v0
.end method

.method public final c(Lfi/i;Ls83/i;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p1, Lfi/i;->c:Lhi/a;

    instance-of v0, v0, Lhi/a;

    if-nez v0, :cond_1

    iget-object v0, p1, Lfi/i;->p:Lgi/j;

    instance-of v0, v0, Lgi/f;

    if-nez v0, :cond_1

    sget-object v0, Lfi/k;->e:Lf93/a;

    invoke-static {p1, v0}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/x;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0, p2}, Lrh/t;->b(Lfi/i;ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    new-instance v0, Ln43/a;

    const/4 v1, 0x0

    const/16 v2, 0x11

    invoke-direct {v0, p1, p0, v1, v2}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lfi/d;Lhi/a;Lrh/f;)V
    .locals 4

    iget-object v0, p1, Lfi/d;->b:Lfi/i;

    iget-object v1, p1, Lfi/d;->a:Lrh/j;

    instance-of v2, p2, Lhi/a;

    if-nez v2, :cond_0

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_0
    sget-object v2, Lfi/k;->a:Lf93/a;

    invoke-static {v0, v2}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji/d;

    invoke-interface {v2, p2, p1}, Lji/d;->a(Lhi/a;Lfi/l;)Lji/e;

    move-result-object v2

    instance-of v3, v2, Lji/c;

    if-eqz v3, :cond_1

    :goto_0
    invoke-virtual {p2, v1}, Lhi/a;->b(Lrh/j;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2}, Lji/e;->a()V

    :cond_2
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v0, Lfi/i;->d:Lfi/h;

    if-eqz p2, :cond_3

    invoke-interface {p2, v0, p1}, Lfi/h;->onError(Lfi/i;Lfi/d;)V

    :cond_3
    return-void
.end method

.method public final e(Lfi/q;Lhi/a;Lrh/f;)V
    .locals 4

    iget-object v0, p1, Lfi/q;->b:Lfi/i;

    iget-object v1, p1, Lfi/q;->a:Lrh/j;

    instance-of v2, p2, Lhi/a;

    if-nez v2, :cond_0

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_0
    sget-object v2, Lfi/k;->a:Lf93/a;

    invoke-static {v0, v2}, Lrh/o;->e(Lfi/i;Lf93/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lji/d;

    invoke-interface {v2, p2, p1}, Lji/d;->a(Lhi/a;Lfi/l;)Lji/e;

    move-result-object v2

    instance-of v3, v2, Lji/c;

    if-eqz v3, :cond_1

    :goto_0
    invoke-virtual {p2, v1}, Lhi/a;->b(Lrh/j;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2}, Lji/e;->a()V

    :cond_2
    :goto_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v0, Lfi/i;->d:Lfi/h;

    if-eqz p2, :cond_3

    invoke-interface {p2, v0, p1}, Lfi/h;->onSuccess(Lfi/i;Lfi/q;)V

    :cond_3
    return-void
.end method
