.class public final Lqa3/k;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final g0:Lqa3/k;

.field public static final h0:Lqa3/a;


# instance fields
.field public E:I

.field public F:I

.field public G:Ljava/util/List;

.field public H:Ljava/util/List;

.field public I:Ljava/util/List;

.field public J:I

.field public K:Ljava/util/List;

.field public L:I

.field public M:Ljava/util/List;

.field public N:Ljava/util/List;

.field public O:I

.field public P:Ljava/util/List;

.field public Q:Ljava/util/List;

.field public R:Ljava/util/List;

.field public S:Ljava/util/List;

.field public T:Ljava/util/List;

.field public U:Ljava/util/List;

.field public V:I

.field public W:I

.field public X:Lqa3/w0;

.field public Y:I

.field public Z:Ljava/util/List;

.field public a0:Lqa3/c1;

.field public b0:Ljava/util/List;

.field public c0:Lqa3/j1;

.field public d0:Ljava/util/List;

.field public e0:B

.field public f0:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/k;->h0:Lqa3/a;

    new-instance v0, Lqa3/k;

    invoke-direct {v0}, Lqa3/k;-><init>()V

    sput-object v0, Lqa3/k;->g0:Lqa3/k;

    invoke-virtual {v0}, Lqa3/k;->p()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lqa3/k;->J:I

    .line 12
    iput v0, p0, Lqa3/k;->L:I

    .line 13
    iput v0, p0, Lqa3/k;->O:I

    .line 14
    iput v0, p0, Lqa3/k;->V:I

    .line 15
    iput-byte v0, p0, Lqa3/k;->e0:B

    .line 16
    iput v0, p0, Lqa3/k;->f0:I

    .line 17
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/k;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/i;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lqa3/k;->J:I

    .line 3
    iput v0, p0, Lqa3/k;->L:I

    .line 4
    iput v0, p0, Lqa3/k;->O:I

    .line 5
    iput v0, p0, Lqa3/k;->V:I

    .line 6
    iput-byte v0, p0, Lqa3/k;->e0:B

    .line 7
    iput v0, p0, Lqa3/k;->f0:I

    .line 8
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 9
    iput-object p1, p0, Lqa3/k;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 18
    invoke-direct {v1}, Lwa3/m;-><init>()V

    const/4 v3, -0x1

    .line 19
    iput v3, v1, Lqa3/k;->J:I

    .line 20
    iput v3, v1, Lqa3/k;->L:I

    .line 21
    iput v3, v1, Lqa3/k;->O:I

    .line 22
    iput v3, v1, Lqa3/k;->V:I

    .line 23
    iput-byte v3, v1, Lqa3/k;->e0:B

    .line 24
    iput v3, v1, Lqa3/k;->f0:I

    .line 25
    invoke-virtual {v1}, Lqa3/k;->p()V

    .line 26
    invoke-static {}, Lwa3/e;->l()Lwa3/d;

    move-result-object v3

    const/4 v4, 0x1

    .line 27
    invoke-static {v3, v4}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/high16 v13, 0x40000

    const/high16 v14, 0x400000

    move/from16 v16, v4

    const/16 v17, 0x8

    const/16 v15, 0x10

    const/16 v8, 0x100

    const/high16 v9, 0x100000

    const/16 v10, 0x80

    const/16 v18, 0x20

    const/16 v11, 0x40

    if-nez v6, :cond_2f

    .line 28
    :try_start_0
    invoke-virtual {v0}, Lwa3/f;->o()I

    move-result v12

    const/16 v19, 0x0

    sparse-switch v12, :sswitch_data_0

    .line 29
    invoke-virtual {v1, v0, v5, v2, v12}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v4

    if-nez v4, :cond_1f

    :sswitch_0
    move/from16 v6, v16

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    move/from16 v20, v14

    goto/16 :goto_9

    :catch_0
    move-exception v0

    move/from16 v20, v14

    goto/16 :goto_7

    :catch_1
    move-exception v0

    move/from16 v20, v14

    goto/16 :goto_8

    :sswitch_1
    and-int v12, v7, v14

    if-eq v12, v14, :cond_0

    .line 30
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/k;->d0:Ljava/util/List;

    or-int/2addr v7, v14

    .line 31
    :cond_0
    iget-object v12, v1, Lqa3/k;->d0:Ljava/util/List;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v20, v14

    :try_start_1
    sget-object v14, Lqa3/m;->H:Lqa3/l;

    invoke-virtual {v0, v14, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    goto/16 :goto_9

    :catch_2
    move-exception v0

    goto/16 :goto_7

    :catch_3
    move-exception v0

    goto/16 :goto_8

    :sswitch_2
    move/from16 v20, v14

    .line 32
    iget v12, v1, Lqa3/k;->y:I

    and-int/2addr v12, v10

    if-ne v12, v10, :cond_1

    .line 33
    iget-object v12, v1, Lqa3/k;->c0:Lqa3/j1;

    invoke-virtual {v12}, Lqa3/j1;->i()Lqa3/p;

    move-result-object v19

    :cond_1
    move-object/from16 v12, v19

    .line 34
    sget-object v14, Lqa3/j1;->F:Lqa3/a;

    invoke-virtual {v0, v14, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v14

    check-cast v14, Lqa3/j1;

    iput-object v14, v1, Lqa3/k;->c0:Lqa3/j1;

    if-eqz v12, :cond_2

    .line 35
    invoke-virtual {v12, v14}, Lqa3/p;->n(Lqa3/j1;)V

    .line 36
    invoke-virtual {v12}, Lqa3/p;->k()Lqa3/j1;

    move-result-object v12

    iput-object v12, v1, Lqa3/k;->c0:Lqa3/j1;

    .line 37
    :cond_2
    iget v12, v1, Lqa3/k;->y:I

    or-int/2addr v12, v10

    iput v12, v1, Lqa3/k;->y:I

    goto/16 :goto_6

    :sswitch_3
    move/from16 v20, v14

    .line 38
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v12

    .line 39
    invoke-virtual {v0, v12}, Lwa3/f;->e(I)I

    move-result v12

    and-int v14, v7, v9

    if-eq v14, v9, :cond_3

    .line 40
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v14

    if-lez v14, :cond_3

    .line 41
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iput-object v14, v1, Lqa3/k;->b0:Ljava/util/List;

    or-int/2addr v7, v9

    .line 42
    :cond_3
    :goto_1
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v14

    if-lez v14, :cond_4

    .line 43
    iget-object v14, v1, Lqa3/k;->b0:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v14, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 44
    :cond_4
    invoke-virtual {v0, v12}, Lwa3/f;->d(I)V

    goto/16 :goto_6

    :sswitch_4
    move/from16 v20, v14

    and-int v4, v7, v9

    if-eq v4, v9, :cond_5

    .line 45
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->b0:Ljava/util/List;

    or-int/2addr v7, v9

    .line 46
    :cond_5
    iget-object v4, v1, Lqa3/k;->b0:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_5
    move/from16 v20, v14

    .line 47
    iget v4, v1, Lqa3/k;->y:I

    and-int/2addr v4, v11

    if-ne v4, v11, :cond_6

    .line 48
    iget-object v4, v1, Lqa3/k;->a0:Lqa3/c1;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    invoke-static {v4}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v19

    :cond_6
    move-object/from16 v4, v19

    .line 50
    sget-object v12, Lqa3/c1;->H:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    check-cast v12, Lqa3/c1;

    iput-object v12, v1, Lqa3/k;->a0:Lqa3/c1;

    if-eqz v4, :cond_7

    .line 51
    invoke-virtual {v4, v12}, Lqa3/g;->o(Lqa3/c1;)V

    .line 52
    invoke-virtual {v4}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v4

    iput-object v4, v1, Lqa3/k;->a0:Lqa3/c1;

    .line 53
    :cond_7
    iget v4, v1, Lqa3/k;->y:I

    or-int/2addr v4, v11

    iput v4, v1, Lqa3/k;->y:I

    goto/16 :goto_6

    :sswitch_6
    move/from16 v20, v14

    and-int v4, v7, v13

    if-eq v4, v13, :cond_8

    .line 54
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->Z:Ljava/util/List;

    or-int/2addr v7, v13

    .line 55
    :cond_8
    iget-object v4, v1, Lqa3/k;->Z:Ljava/util/List;

    sget-object v12, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_7
    move/from16 v20, v14

    .line 56
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 57
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit16 v12, v7, 0x100

    if-eq v12, v8, :cond_9

    .line 58
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_9

    .line 59
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/k;->N:Ljava/util/List;

    or-int/lit16 v7, v7, 0x100

    .line 60
    :cond_9
    :goto_2
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_a

    .line 61
    iget-object v12, v1, Lqa3/k;->N:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 62
    :cond_a
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto/16 :goto_6

    :sswitch_8
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x100

    if-eq v4, v8, :cond_b

    .line 63
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->N:Ljava/util/List;

    or-int/lit16 v7, v7, 0x100

    .line 64
    :cond_b
    iget-object v4, v1, Lqa3/k;->N:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_9
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x80

    if-eq v4, v10, :cond_c

    .line 65
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->M:Ljava/util/List;

    or-int/lit16 v7, v7, 0x80

    .line 66
    :cond_c
    iget-object v4, v1, Lqa3/k;->M:Ljava/util/List;

    sget-object v12, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_a
    move/from16 v20, v14

    .line 67
    iget v4, v1, Lqa3/k;->y:I

    or-int/lit8 v4, v4, 0x20

    iput v4, v1, Lqa3/k;->y:I

    .line 68
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k;->Y:I

    goto/16 :goto_6

    :sswitch_b
    move/from16 v20, v14

    .line 69
    iget v4, v1, Lqa3/k;->y:I

    and-int/2addr v4, v15

    if-ne v4, v15, :cond_d

    .line 70
    iget-object v4, v1, Lqa3/k;->X:Lqa3/w0;

    invoke-virtual {v4}, Lqa3/w0;->s()Lqa3/v0;

    move-result-object v19

    :cond_d
    move-object/from16 v4, v19

    .line 71
    sget-object v12, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    check-cast v12, Lqa3/w0;

    iput-object v12, v1, Lqa3/k;->X:Lqa3/w0;

    if-eqz v4, :cond_e

    .line 72
    invoke-virtual {v4, v12}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 73
    invoke-virtual {v4}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v4

    iput-object v4, v1, Lqa3/k;->X:Lqa3/w0;

    .line 74
    :cond_e
    iget v4, v1, Lqa3/k;->y:I

    or-int/2addr v4, v15

    iput v4, v1, Lqa3/k;->y:I

    goto/16 :goto_6

    :sswitch_c
    move/from16 v20, v14

    .line 75
    iget v4, v1, Lqa3/k;->y:I

    or-int/lit8 v4, v4, 0x8

    iput v4, v1, Lqa3/k;->y:I

    .line 76
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k;->W:I

    goto/16 :goto_6

    :sswitch_d
    move/from16 v20, v14

    .line 77
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 78
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit16 v12, v7, 0x4000

    const/16 v14, 0x4000

    if-eq v12, v14, :cond_f

    .line 79
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_f

    .line 80
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/k;->U:Ljava/util/List;

    or-int/lit16 v7, v7, 0x4000

    .line 81
    :cond_f
    :goto_3
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_10

    .line 82
    iget-object v12, v1, Lqa3/k;->U:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 83
    :cond_10
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto/16 :goto_6

    :sswitch_e
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x4000

    const/16 v14, 0x4000

    if-eq v4, v14, :cond_11

    .line 84
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->U:Ljava/util/List;

    or-int/lit16 v7, v7, 0x4000

    .line 85
    :cond_11
    iget-object v4, v1, Lqa3/k;->U:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_f
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x2000

    const/16 v12, 0x2000

    if-eq v4, v12, :cond_12

    .line 86
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->T:Ljava/util/List;

    or-int/lit16 v7, v7, 0x2000

    .line 87
    :cond_12
    iget-object v4, v1, Lqa3/k;->T:Ljava/util/List;

    sget-object v12, Lqa3/x;->I:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_10
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x1000

    const/16 v12, 0x1000

    if-eq v4, v12, :cond_13

    .line 88
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->S:Ljava/util/List;

    or-int/lit16 v7, v7, 0x1000

    .line 89
    :cond_13
    iget-object v4, v1, Lqa3/k;->S:Ljava/util/List;

    sget-object v12, Lqa3/y0;->Q:Lqa3/l;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_11
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x800

    const/16 v12, 0x800

    if-eq v4, v12, :cond_14

    .line 90
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->R:Ljava/util/List;

    or-int/lit16 v7, v7, 0x800

    .line 91
    :cond_14
    iget-object v4, v1, Lqa3/k;->R:Ljava/util/List;

    sget-object v12, Lqa3/k0;->f0:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_12
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x400

    const/16 v12, 0x400

    if-eq v4, v12, :cond_15

    .line 92
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->Q:Ljava/util/List;

    or-int/lit16 v7, v7, 0x400

    .line 93
    :cond_15
    iget-object v4, v1, Lqa3/k;->Q:Ljava/util/List;

    sget-object v12, Lqa3/c0;->Z:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_13
    move/from16 v20, v14

    and-int/lit16 v4, v7, 0x200

    const/16 v12, 0x200

    if-eq v4, v12, :cond_16

    .line 94
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->P:Ljava/util/List;

    or-int/lit16 v7, v7, 0x200

    .line 95
    :cond_16
    iget-object v4, v1, Lqa3/k;->P:Ljava/util/List;

    sget-object v12, Lqa3/o;->L:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_14
    move/from16 v20, v14

    .line 96
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 97
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit8 v12, v7, 0x40

    if-eq v12, v11, :cond_17

    .line 98
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_17

    .line 99
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/k;->K:Ljava/util/List;

    or-int/lit8 v7, v7, 0x40

    .line 100
    :cond_17
    :goto_4
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_18

    .line 101
    iget-object v12, v1, Lqa3/k;->K:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 102
    :cond_18
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto/16 :goto_6

    :sswitch_15
    move/from16 v20, v14

    and-int/lit8 v4, v7, 0x40

    if-eq v4, v11, :cond_19

    .line 103
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->K:Ljava/util/List;

    or-int/lit8 v7, v7, 0x40

    .line 104
    :cond_19
    iget-object v4, v1, Lqa3/k;->K:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_16
    move/from16 v20, v14

    and-int/lit8 v4, v7, 0x10

    if-eq v4, v15, :cond_1a

    .line 105
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->H:Ljava/util/List;

    or-int/lit8 v7, v7, 0x10

    .line 106
    :cond_1a
    iget-object v4, v1, Lqa3/k;->H:Ljava/util/List;

    sget-object v12, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_17
    move/from16 v20, v14

    and-int/lit8 v4, v7, 0x8

    move/from16 v12, v17

    if-eq v4, v12, :cond_1b

    .line 107
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->G:Ljava/util/List;

    or-int/lit8 v7, v7, 0x8

    .line 108
    :cond_1b
    iget-object v4, v1, Lqa3/k;->G:Ljava/util/List;

    sget-object v12, Lqa3/b1;->O:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_6

    :sswitch_18
    move/from16 v20, v14

    .line 109
    iget v4, v1, Lqa3/k;->y:I

    or-int/lit8 v4, v4, 0x4

    iput v4, v1, Lqa3/k;->y:I

    .line 110
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k;->F:I

    goto/16 :goto_6

    :sswitch_19
    move/from16 v20, v14

    .line 111
    iget v4, v1, Lqa3/k;->y:I

    or-int/lit8 v4, v4, 0x2

    iput v4, v1, Lqa3/k;->y:I

    .line 112
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k;->E:I

    goto :goto_6

    :sswitch_1a
    move/from16 v20, v14

    .line 113
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 114
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit8 v12, v7, 0x20

    move/from16 v14, v18

    if-eq v12, v14, :cond_1c

    .line 115
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_1c

    .line 116
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/k;->I:Ljava/util/List;

    or-int/lit8 v7, v7, 0x20

    .line 117
    :cond_1c
    :goto_5
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_1d

    .line 118
    iget-object v12, v1, Lqa3/k;->I:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 119
    :cond_1d
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto :goto_6

    :sswitch_1b
    move/from16 v20, v14

    and-int/lit8 v4, v7, 0x20

    const/16 v14, 0x20

    if-eq v4, v14, :cond_1e

    .line 120
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k;->I:Ljava/util/List;

    or-int/lit8 v7, v7, 0x20

    .line 121
    :cond_1e
    iget-object v4, v1, Lqa3/k;->I:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v4, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :sswitch_1c
    move/from16 v20, v14

    .line 122
    iget v4, v1, Lqa3/k;->y:I

    or-int/lit8 v4, v4, 0x1

    iput v4, v1, Lqa3/k;->y:I

    .line 123
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k;->z:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_1f
    :goto_6
    move/from16 v4, v16

    goto/16 :goto_0

    .line 124
    :goto_7
    :try_start_2
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 125
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a(Lwa3/m;)V

    throw v2

    .line 126
    :goto_8
    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a(Lwa3/m;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_9
    and-int/lit8 v2, v7, 0x20

    const/16 v14, 0x20

    if-ne v2, v14, :cond_20

    .line 127
    iget-object v2, v1, Lqa3/k;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->I:Ljava/util/List;

    :cond_20
    and-int/lit8 v2, v7, 0x8

    const/16 v12, 0x8

    if-ne v2, v12, :cond_21

    .line 128
    iget-object v2, v1, Lqa3/k;->G:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->G:Ljava/util/List;

    :cond_21
    and-int/lit8 v2, v7, 0x10

    if-ne v2, v15, :cond_22

    .line 129
    iget-object v2, v1, Lqa3/k;->H:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->H:Ljava/util/List;

    :cond_22
    and-int/lit8 v2, v7, 0x40

    if-ne v2, v11, :cond_23

    .line 130
    iget-object v2, v1, Lqa3/k;->K:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->K:Ljava/util/List;

    :cond_23
    and-int/lit16 v2, v7, 0x200

    const/16 v12, 0x200

    if-ne v2, v12, :cond_24

    .line 131
    iget-object v2, v1, Lqa3/k;->P:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->P:Ljava/util/List;

    :cond_24
    and-int/lit16 v2, v7, 0x400

    const/16 v12, 0x400

    if-ne v2, v12, :cond_25

    .line 132
    iget-object v2, v1, Lqa3/k;->Q:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->Q:Ljava/util/List;

    :cond_25
    and-int/lit16 v2, v7, 0x800

    const/16 v12, 0x800

    if-ne v2, v12, :cond_26

    .line 133
    iget-object v2, v1, Lqa3/k;->R:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->R:Ljava/util/List;

    :cond_26
    and-int/lit16 v2, v7, 0x1000

    const/16 v12, 0x1000

    if-ne v2, v12, :cond_27

    .line 134
    iget-object v2, v1, Lqa3/k;->S:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->S:Ljava/util/List;

    :cond_27
    and-int/lit16 v2, v7, 0x2000

    const/16 v12, 0x2000

    if-ne v2, v12, :cond_28

    .line 135
    iget-object v2, v1, Lqa3/k;->T:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->T:Ljava/util/List;

    :cond_28
    and-int/lit16 v2, v7, 0x4000

    const/16 v14, 0x4000

    if-ne v2, v14, :cond_29

    .line 136
    iget-object v2, v1, Lqa3/k;->U:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->U:Ljava/util/List;

    :cond_29
    and-int/lit16 v2, v7, 0x80

    if-ne v2, v10, :cond_2a

    .line 137
    iget-object v2, v1, Lqa3/k;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->M:Ljava/util/List;

    :cond_2a
    and-int/lit16 v2, v7, 0x100

    if-ne v2, v8, :cond_2b

    .line 138
    iget-object v2, v1, Lqa3/k;->N:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->N:Ljava/util/List;

    :cond_2b
    and-int v2, v7, v13

    if-ne v2, v13, :cond_2c

    .line 139
    iget-object v2, v1, Lqa3/k;->Z:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->Z:Ljava/util/List;

    :cond_2c
    and-int v2, v7, v9

    if-ne v2, v9, :cond_2d

    .line 140
    iget-object v2, v1, Lqa3/k;->b0:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->b0:Ljava/util/List;

    :cond_2d
    and-int v2, v7, v20

    move/from16 v4, v20

    if-ne v2, v4, :cond_2e

    .line 141
    iget-object v2, v1, Lqa3/k;->d0:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->d0:Ljava/util/List;

    .line 142
    :cond_2e
    :try_start_3
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 143
    :catch_4
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->x:Lwa3/e;

    goto :goto_a

    :catchall_2
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->x:Lwa3/e;

    .line 144
    throw v0

    .line 145
    :goto_a
    invoke-virtual {v1}, Lwa3/m;->m()V

    .line 146
    throw v0

    :cond_2f
    and-int/lit8 v0, v7, 0x20

    const/16 v14, 0x20

    if-ne v0, v14, :cond_30

    .line 147
    iget-object v0, v1, Lqa3/k;->I:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->I:Ljava/util/List;

    :cond_30
    and-int/lit8 v0, v7, 0x8

    const/16 v12, 0x8

    if-ne v0, v12, :cond_31

    .line 148
    iget-object v0, v1, Lqa3/k;->G:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->G:Ljava/util/List;

    :cond_31
    and-int/lit8 v0, v7, 0x10

    if-ne v0, v15, :cond_32

    .line 149
    iget-object v0, v1, Lqa3/k;->H:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->H:Ljava/util/List;

    :cond_32
    and-int/lit8 v0, v7, 0x40

    if-ne v0, v11, :cond_33

    .line 150
    iget-object v0, v1, Lqa3/k;->K:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->K:Ljava/util/List;

    :cond_33
    and-int/lit16 v0, v7, 0x200

    const/16 v12, 0x200

    if-ne v0, v12, :cond_34

    .line 151
    iget-object v0, v1, Lqa3/k;->P:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->P:Ljava/util/List;

    :cond_34
    and-int/lit16 v0, v7, 0x400

    const/16 v12, 0x400

    if-ne v0, v12, :cond_35

    .line 152
    iget-object v0, v1, Lqa3/k;->Q:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->Q:Ljava/util/List;

    :cond_35
    and-int/lit16 v0, v7, 0x800

    const/16 v12, 0x800

    if-ne v0, v12, :cond_36

    .line 153
    iget-object v0, v1, Lqa3/k;->R:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->R:Ljava/util/List;

    :cond_36
    and-int/lit16 v0, v7, 0x1000

    const/16 v12, 0x1000

    if-ne v0, v12, :cond_37

    .line 154
    iget-object v0, v1, Lqa3/k;->S:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->S:Ljava/util/List;

    :cond_37
    and-int/lit16 v0, v7, 0x2000

    const/16 v12, 0x2000

    if-ne v0, v12, :cond_38

    .line 155
    iget-object v0, v1, Lqa3/k;->T:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->T:Ljava/util/List;

    :cond_38
    and-int/lit16 v0, v7, 0x4000

    const/16 v14, 0x4000

    if-ne v0, v14, :cond_39

    .line 156
    iget-object v0, v1, Lqa3/k;->U:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->U:Ljava/util/List;

    :cond_39
    and-int/lit16 v0, v7, 0x80

    if-ne v0, v10, :cond_3a

    .line 157
    iget-object v0, v1, Lqa3/k;->M:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->M:Ljava/util/List;

    :cond_3a
    and-int/lit16 v0, v7, 0x100

    if-ne v0, v8, :cond_3b

    .line 158
    iget-object v0, v1, Lqa3/k;->N:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->N:Ljava/util/List;

    :cond_3b
    and-int v0, v7, v13

    if-ne v0, v13, :cond_3c

    .line 159
    iget-object v0, v1, Lqa3/k;->Z:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->Z:Ljava/util/List;

    :cond_3c
    and-int v0, v7, v9

    if-ne v0, v9, :cond_3d

    .line 160
    iget-object v0, v1, Lqa3/k;->b0:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->b0:Ljava/util/List;

    :cond_3d
    const/high16 v4, 0x400000

    and-int v0, v7, v4

    if-ne v0, v4, :cond_3e

    .line 161
    iget-object v0, v1, Lqa3/k;->d0:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->d0:Ljava/util/List;

    .line 162
    :cond_3e
    :try_start_4
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 163
    :catch_5
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, v1, Lqa3/k;->x:Lwa3/e;

    goto :goto_b

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k;->x:Lwa3/e;

    .line 164
    throw v0

    .line 165
    :goto_b
    invoke-virtual {v1}, Lwa3/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1c
        0x10 -> :sswitch_1b
        0x12 -> :sswitch_1a
        0x18 -> :sswitch_19
        0x20 -> :sswitch_18
        0x2a -> :sswitch_17
        0x32 -> :sswitch_16
        0x38 -> :sswitch_15
        0x3a -> :sswitch_14
        0x42 -> :sswitch_13
        0x4a -> :sswitch_12
        0x52 -> :sswitch_11
        0x5a -> :sswitch_10
        0x6a -> :sswitch_f
        0x80 -> :sswitch_e
        0x82 -> :sswitch_d
        0x88 -> :sswitch_c
        0x92 -> :sswitch_b
        0x98 -> :sswitch_a
        0xa2 -> :sswitch_9
        0xa8 -> :sswitch_8
        0xaa -> :sswitch_7
        0xca -> :sswitch_6
        0xf2 -> :sswitch_5
        0xf8 -> :sswitch_4
        0xfa -> :sswitch_3
        0x102 -> :sswitch_2
        0x10a -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/k;->g0:Lqa3/k;

    return-object v0
.end method

.method public final b()Z
    .locals 4

    iget-byte v0, p0, Lqa3/k;->e0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/k;->y:I

    const/4 v3, 0x2

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_19

    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    iget-object v3, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-virtual {v3}, Lqa3/b1;->b()Z

    move-result v3

    if-nez v3, :cond_2

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_5

    iget-object v3, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_4

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_2
    iget-object v3, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    iget-object v3, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    move v0, v2

    :goto_3
    iget-object v3, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_9

    iget-object v3, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/o;

    invoke-virtual {v3}, Lqa3/o;->b()Z

    move-result v3

    if-nez v3, :cond_8

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_9
    move v0, v2

    :goto_4
    iget-object v3, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_b

    iget-object v3, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/c0;

    invoke-virtual {v3}, Lqa3/c0;->b()Z

    move-result v3

    if-nez v3, :cond_a

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_b
    move v0, v2

    :goto_5
    iget-object v3, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_d

    iget-object v3, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/k0;

    invoke-virtual {v3}, Lqa3/k0;->b()Z

    move-result v3

    if-nez v3, :cond_c

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_d
    move v0, v2

    :goto_6
    iget-object v3, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_f

    iget-object v3, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/y0;

    invoke-virtual {v3}, Lqa3/y0;->b()Z

    move-result v3

    if-nez v3, :cond_e

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_f
    move v0, v2

    :goto_7
    iget-object v3, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_11

    iget-object v3, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/x;

    invoke-virtual {v3}, Lqa3/x;->b()Z

    move-result v3

    if-nez v3, :cond_10

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_10
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_11
    iget v0, p0, Lqa3/k;->y:I

    const/16 v3, 0x10

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_12

    iget-object v0, p0, Lqa3/k;->X:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_12

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_12
    move v0, v2

    :goto_8
    iget-object v3, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_14

    iget-object v3, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_13

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_14
    iget v0, p0, Lqa3/k;->y:I

    const/16 v3, 0x40

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_15

    iget-object v0, p0, Lqa3/k;->a0:Lqa3/c1;

    invoke-virtual {v0}, Lqa3/c1;->b()Z

    move-result v0

    if-nez v0, :cond_15

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_15
    move v0, v2

    :goto_9
    iget-object v3, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_17

    iget-object v3, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/m;

    invoke-virtual {v3}, Lqa3/m;->b()Z

    move-result v3

    if-nez v3, :cond_16

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_16
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_17
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_18

    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2

    :cond_18
    iput-byte v1, p0, Lqa3/k;->e0:B

    return v1

    :cond_19
    iput-byte v2, p0, Lqa3/k;->e0:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/i;->k()Lqa3/i;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/i;->o(Lqa3/k;)V

    return-object v0
.end method

.method public final d()I
    .locals 7

    iget v0, p0, Lqa3/k;->f0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/k;->y:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/k;->z:I

    invoke-static {v1, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    move v1, v2

    move v3, v1

    :goto_1
    iget-object v4, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    iget-object v4, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v0, v3

    iget-object v1, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    add-int/lit8 v0, v0, 0x1

    invoke-static {v3}, Lwa3/g;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_3
    iput v3, p0, Lqa3/k;->J:I

    iget v1, p0, Lqa3/k;->y:I

    const/4 v3, 0x2

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    const/4 v1, 0x3

    iget v4, p0, Lqa3/k;->E:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_4
    iget v1, p0, Lqa3/k;->y:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_5

    iget v1, p0, Lqa3/k;->F:I

    invoke-static {v4, v1}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    :goto_2
    iget-object v4, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_6

    iget-object v4, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/4 v5, 0x5

    invoke-static {v5, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_6
    move v1, v2

    :goto_3
    iget-object v4, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_7

    iget-object v4, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/4 v5, 0x6

    invoke-static {v5, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    move v1, v2

    move v4, v1

    :goto_4
    iget-object v5, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_8

    iget-object v5, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v5}, Lwa3/g;->c(I)I

    move-result v5

    add-int/2addr v4, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_8
    add-int/2addr v0, v4

    iget-object v1, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_9
    iput v4, p0, Lqa3/k;->L:I

    move v1, v2

    :goto_5
    iget-object v4, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x8

    if-ge v1, v4, :cond_a

    iget-object v4, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    invoke-static {v5, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_a
    move v1, v2

    :goto_6
    iget-object v4, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_b

    iget-object v4, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0x9

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_b
    move v1, v2

    :goto_7
    iget-object v4, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_c

    iget-object v4, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xa

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_c
    move v1, v2

    :goto_8
    iget-object v4, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_d

    iget-object v4, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xb

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_d
    move v1, v2

    :goto_9
    iget-object v4, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_e

    iget-object v4, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xd

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_e
    move v1, v2

    move v4, v1

    :goto_a
    iget-object v6, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_f

    iget-object v6, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_f
    add-int/2addr v0, v4

    iget-object v1, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    add-int/lit8 v0, v0, 0x2

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_10
    iput v4, p0, Lqa3/k;->V:I

    iget v1, p0, Lqa3/k;->y:I

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_11

    const/16 v1, 0x11

    iget v4, p0, Lqa3/k;->W:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_11
    iget v1, p0, Lqa3/k;->y:I

    const/16 v4, 0x10

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_12

    const/16 v1, 0x12

    iget-object v4, p0, Lqa3/k;->X:Lqa3/w0;

    invoke-static {v1, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_12
    iget v1, p0, Lqa3/k;->y:I

    const/16 v4, 0x20

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_13

    const/16 v1, 0x13

    iget v5, p0, Lqa3/k;->Y:I

    invoke-static {v1, v5}, Lwa3/g;->b(II)I

    move-result v1

    add-int/2addr v0, v1

    :cond_13
    move v1, v2

    :goto_b
    iget-object v5, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_14

    iget-object v5, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwa3/v;

    const/16 v6, 0x14

    invoke-static {v6, v5}, Lwa3/g;->d(ILwa3/v;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_14
    move v1, v2

    move v5, v1

    :goto_c
    iget-object v6, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_15

    iget-object v6, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_15
    add-int/2addr v0, v5

    iget-object v1, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    add-int/lit8 v0, v0, 0x2

    invoke-static {v5}, Lwa3/g;->c(I)I

    move-result v1

    add-int/2addr v0, v1

    :cond_16
    iput v5, p0, Lqa3/k;->O:I

    move v1, v2

    :goto_d
    iget-object v5, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v1, v5, :cond_17

    iget-object v5, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwa3/v;

    const/16 v6, 0x19

    invoke-static {v6, v5}, Lwa3/g;->d(ILwa3/v;)I

    move-result v5

    add-int/2addr v0, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_d

    :cond_17
    iget v1, p0, Lqa3/k;->y:I

    const/16 v5, 0x40

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_18

    const/16 v1, 0x1e

    iget-object v5, p0, Lqa3/k;->a0:Lqa3/c1;

    invoke-static {v1, v5}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_18
    move v1, v2

    move v5, v1

    :goto_e
    iget-object v6, p0, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_19

    iget-object v6, p0, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v5, v6

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_19
    add-int/2addr v0, v5

    iget-object v1, p0, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    mul-int/2addr v1, v3

    add-int/2addr v1, v0

    iget v0, p0, Lqa3/k;->y:I

    const/16 v3, 0x80

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_1a

    iget-object v0, p0, Lqa3/k;->c0:Lqa3/j1;

    invoke-static {v4, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v1, v0

    :cond_1a
    :goto_f
    iget-object v0, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_1b

    iget-object v0, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/v;

    const/16 v3, 0x21

    invoke-static {v3, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v1, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_f

    :cond_1b
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v0

    add-int/2addr v0, v1

    iget-object v1, p0, Lqa3/k;->x:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/k;->f0:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/i;->k()Lqa3/i;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 7

    invoke-virtual {p0}, Lqa3/k;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/k;->y:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/k;->z:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget-object v1, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/16 v2, 0x12

    if-lez v1, :cond_1

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    iget v1, p0, Lqa3/k;->J:I

    invoke-virtual {p1, v1}, Lwa3/g;->v(I)V

    :cond_1
    const/4 v1, 0x0

    move v3, v1

    :goto_0
    iget-object v4, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_2

    iget-object v4, p0, Lqa3/k;->I:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lwa3/g;->n(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget v3, p0, Lqa3/k;->y:I

    const/4 v4, 0x2

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_3

    const/4 v3, 0x3

    iget v4, p0, Lqa3/k;->E:I

    invoke-virtual {p1, v3, v4}, Lwa3/g;->m(II)V

    :cond_3
    iget v3, p0, Lqa3/k;->y:I

    const/4 v4, 0x4

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_4

    iget v3, p0, Lqa3/k;->F:I

    invoke-virtual {p1, v4, v3}, Lwa3/g;->m(II)V

    :cond_4
    move v3, v1

    :goto_1
    iget-object v4, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    iget-object v4, p0, Lqa3/k;->G:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/4 v5, 0x5

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move v3, v1

    :goto_2
    iget-object v4, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_6

    iget-object v4, p0, Lqa3/k;->H:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/4 v5, 0x6

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    iget-object v3, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    const/16 v3, 0x3a

    invoke-virtual {p1, v3}, Lwa3/g;->v(I)V

    iget v3, p0, Lqa3/k;->L:I

    invoke-virtual {p1, v3}, Lwa3/g;->v(I)V

    :cond_7
    move v3, v1

    :goto_3
    iget-object v4, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_8

    iget-object v4, p0, Lqa3/k;->K:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lwa3/g;->n(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_8
    move v3, v1

    :goto_4
    iget-object v4, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x8

    if-ge v3, v4, :cond_9

    iget-object v4, p0, Lqa3/k;->P:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_9
    move v3, v1

    :goto_5
    iget-object v4, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    iget-object v4, p0, Lqa3/k;->Q:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0x9

    invoke-virtual {p1, v6, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_a
    move v3, v1

    :goto_6
    iget-object v4, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_b

    iget-object v4, p0, Lqa3/k;->R:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xa

    invoke-virtual {p1, v6, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_b
    move v3, v1

    :goto_7
    iget-object v4, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    iget-object v4, p0, Lqa3/k;->S:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xb

    invoke-virtual {p1, v6, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_c
    move v3, v1

    :goto_8
    iget-object v4, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_d

    iget-object v4, p0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xd

    invoke-virtual {p1, v6, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_d
    iget-object v3, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_e

    const/16 v3, 0x82

    invoke-virtual {p1, v3}, Lwa3/g;->v(I)V

    iget v3, p0, Lqa3/k;->V:I

    invoke-virtual {p1, v3}, Lwa3/g;->v(I)V

    :cond_e
    move v3, v1

    :goto_9
    iget-object v4, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_f

    iget-object v4, p0, Lqa3/k;->U:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lwa3/g;->n(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_f
    iget v3, p0, Lqa3/k;->y:I

    and-int/2addr v3, v5

    if-ne v3, v5, :cond_10

    const/16 v3, 0x11

    iget v4, p0, Lqa3/k;->W:I

    invoke-virtual {p1, v3, v4}, Lwa3/g;->m(II)V

    :cond_10
    iget v3, p0, Lqa3/k;->y:I

    const/16 v4, 0x10

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_11

    iget-object v3, p0, Lqa3/k;->X:Lqa3/w0;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_11
    iget v2, p0, Lqa3/k;->y:I

    const/16 v3, 0x20

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_12

    const/16 v2, 0x13

    iget v4, p0, Lqa3/k;->Y:I

    invoke-virtual {p1, v2, v4}, Lwa3/g;->m(II)V

    :cond_12
    move v2, v1

    :goto_a
    iget-object v4, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_13

    iget-object v4, p0, Lqa3/k;->M:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v5, 0x14

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_13
    iget-object v2, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_14

    const/16 v2, 0xaa

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    iget v2, p0, Lqa3/k;->O:I

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    :cond_14
    move v2, v1

    :goto_b
    iget-object v4, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_15

    iget-object v4, p0, Lqa3/k;->N:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {p1, v4}, Lwa3/g;->n(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    :cond_15
    move v2, v1

    :goto_c
    iget-object v4, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_16

    iget-object v4, p0, Lqa3/k;->Z:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v5, 0x19

    invoke-virtual {p1, v5, v4}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_16
    iget v2, p0, Lqa3/k;->y:I

    const/16 v4, 0x40

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_17

    const/16 v2, 0x1e

    iget-object v4, p0, Lqa3/k;->a0:Lqa3/c1;

    invoke-virtual {p1, v2, v4}, Lwa3/g;->o(ILwa3/v;)V

    :cond_17
    move v2, v1

    :goto_d
    iget-object v4, p0, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v2, v4, :cond_18

    iget-object v4, p0, Lqa3/k;->b0:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x1f

    invoke-virtual {p1, v5, v4}, Lwa3/g;->m(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_18
    iget v2, p0, Lqa3/k;->y:I

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_19

    iget-object v2, p0, Lqa3/k;->c0:Lqa3/j1;

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_19
    :goto_e
    iget-object v2, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1a

    iget-object v2, p0, Lqa3/k;->d0:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/16 v3, 0x21

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_1a
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/k;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final p()V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lqa3/k;->z:I

    const/4 v0, 0x0

    iput v0, p0, Lqa3/k;->E:I

    iput v0, p0, Lqa3/k;->F:I

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->G:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->H:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->I:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->K:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->M:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->N:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->P:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->Q:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->R:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->S:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->T:Ljava/util/List;

    iput-object v1, p0, Lqa3/k;->U:Ljava/util/List;

    iput v0, p0, Lqa3/k;->W:I

    sget-object v2, Lqa3/w0;->U:Lqa3/w0;

    iput-object v2, p0, Lqa3/k;->X:Lqa3/w0;

    iput v0, p0, Lqa3/k;->Y:I

    iput-object v1, p0, Lqa3/k;->Z:Ljava/util/List;

    sget-object v0, Lqa3/c1;->G:Lqa3/c1;

    iput-object v0, p0, Lqa3/k;->a0:Lqa3/c1;

    iput-object v1, p0, Lqa3/k;->b0:Ljava/util/List;

    sget-object v0, Lqa3/j1;->E:Lqa3/j1;

    iput-object v0, p0, Lqa3/k;->c0:Lqa3/j1;

    iput-object v1, p0, Lqa3/k;->d0:Ljava/util/List;

    return-void
.end method
