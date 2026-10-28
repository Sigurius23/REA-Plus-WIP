.class public final Lqa3/c0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final Y:Lqa3/c0;

.field public static final Z:Lqa3/a;


# instance fields
.field public E:I

.field public F:I

.field public G:Lqa3/w0;

.field public H:I

.field public I:Ljava/util/List;

.field public J:Lqa3/w0;

.field public K:I

.field public L:Ljava/util/List;

.field public M:Ljava/util/List;

.field public N:I

.field public O:Ljava/util/List;

.field public P:Ljava/util/List;

.field public Q:Lqa3/c1;

.field public R:Ljava/util/List;

.field public S:Lqa3/q;

.field public T:Ljava/util/List;

.field public U:Ljava/util/List;

.field public V:Ljava/util/List;

.field public W:B

.field public X:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/c0;->Z:Lqa3/a;

    new-instance v0, Lqa3/c0;

    invoke-direct {v0}, Lqa3/c0;-><init>()V

    sput-object v0, Lqa3/c0;->Y:Lqa3/c0;

    invoke-virtual {v0}, Lqa3/c0;->p()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lqa3/c0;->N:I

    .line 9
    iput-byte v0, p0, Lqa3/c0;->W:B

    .line 10
    iput v0, p0, Lqa3/c0;->X:I

    .line 11
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/c0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/b0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lqa3/c0;->N:I

    .line 3
    iput-byte v0, p0, Lqa3/c0;->W:B

    .line 4
    iput v0, p0, Lqa3/c0;->X:I

    .line 5
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 6
    iput-object p1, p0, Lqa3/c0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 12
    invoke-direct {v1}, Lwa3/m;-><init>()V

    const/4 v3, -0x1

    .line 13
    iput v3, v1, Lqa3/c0;->N:I

    .line 14
    iput-byte v3, v1, Lqa3/c0;->W:B

    .line 15
    iput v3, v1, Lqa3/c0;->X:I

    .line 16
    invoke-virtual {v1}, Lqa3/c0;->p()V

    .line 17
    new-instance v3, Lwa3/d;

    invoke-direct {v3}, Lwa3/d;-><init>()V

    const/4 v4, 0x1

    .line 18
    invoke-static {v3, v4}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/16 v8, 0x800

    const/high16 v9, 0x10000

    const/16 v10, 0x400

    const v11, 0x8000

    const/high16 v12, 0x20000

    const/16 v14, 0x200

    const/16 v15, 0x2000

    move/from16 v16, v4

    const/16 v4, 0x100

    if-nez v6, :cond_1f

    const/16 v17, 0x20

    .line 19
    :try_start_0
    invoke-virtual {v0}, Lwa3/f;->o()I

    move-result v13

    const/16 v18, 0x0

    sparse-switch v13, :sswitch_data_0

    .line 20
    invoke-virtual {v1, v0, v5, v2, v13}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v4

    if-nez v4, :cond_15

    :sswitch_0
    move/from16 v6, v16

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move/from16 v20, v11

    move/from16 v19, v12

    goto/16 :goto_b

    :catch_0
    move-exception v0

    move/from16 v20, v11

    move/from16 v19, v12

    goto/16 :goto_9

    :catch_1
    move-exception v0

    move/from16 v20, v11

    move/from16 v19, v12

    goto/16 :goto_a

    :sswitch_1
    and-int v13, v7, v12

    if-eq v13, v12, :cond_0

    .line 21
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iput-object v13, v1, Lqa3/c0;->V:Ljava/util/List;
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    or-int/2addr v7, v12

    .line 22
    :cond_0
    :try_start_1
    iget-object v13, v1, Lqa3/c0;->V:Ljava/util/List;
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move/from16 v19, v12

    :try_start_2
    sget-object v12, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v13, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :catchall_1
    move-exception v0

    :goto_1
    move/from16 v20, v11

    goto/16 :goto_b

    :catch_2
    move-exception v0

    :goto_2
    move/from16 v20, v11

    goto/16 :goto_9

    :catch_3
    move-exception v0

    :goto_3
    move/from16 v20, v11

    goto/16 :goto_a

    :catchall_2
    move-exception v0

    move/from16 v19, v12

    goto :goto_1

    :catch_4
    move-exception v0

    move/from16 v19, v12

    goto :goto_2

    :catch_5
    move-exception v0

    move/from16 v19, v12

    goto :goto_3

    :sswitch_2
    move/from16 v19, v12

    and-int v12, v7, v11

    if-eq v12, v11, :cond_1

    .line 23
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/c0;->T:Ljava/util/List;

    or-int/2addr v7, v11

    .line 24
    :cond_1
    iget-object v12, v1, Lqa3/c0;->T:Ljava/util/List;

    sget-object v13, Lqa3/m;->H:Lqa3/l;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_3
    move/from16 v19, v12

    .line 25
    iget v12, v1, Lqa3/c0;->y:I

    and-int/2addr v12, v4

    if-ne v12, v4, :cond_2

    .line 26
    iget-object v12, v1, Lqa3/c0;->S:Lqa3/q;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v13, Lqa3/p;
    :try_end_2
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move/from16 v20, v11

    const/4 v11, 0x0

    .line 28
    :try_start_3
    invoke-direct {v13, v11}, Lqa3/p;-><init>(I)V

    .line 29
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v11, v13, Lqa3/p;->z:Ljava/util/List;

    .line 30
    invoke-virtual {v13, v12}, Lqa3/p;->l(Lqa3/q;)V

    goto :goto_4

    :cond_2
    move/from16 v20, v11

    move-object/from16 v13, v18

    .line 31
    :goto_4
    sget-object v11, Lqa3/q;->F:Lqa3/a;

    invoke-virtual {v0, v11, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v11

    check-cast v11, Lqa3/q;

    iput-object v11, v1, Lqa3/c0;->S:Lqa3/q;

    if-eqz v13, :cond_3

    .line 32
    invoke-virtual {v13, v11}, Lqa3/p;->l(Lqa3/q;)V

    .line 33
    invoke-virtual {v13}, Lqa3/p;->j()Lqa3/q;

    move-result-object v11

    iput-object v11, v1, Lqa3/c0;->S:Lqa3/q;

    goto :goto_5

    :catchall_3
    move-exception v0

    goto/16 :goto_b

    :catch_6
    move-exception v0

    goto/16 :goto_9

    :catch_7
    move-exception v0

    goto/16 :goto_a

    .line 34
    :cond_3
    :goto_5
    iget v11, v1, Lqa3/c0;->y:I

    or-int/2addr v11, v4

    iput v11, v1, Lqa3/c0;->y:I

    goto/16 :goto_8

    :sswitch_4
    move/from16 v20, v11

    move/from16 v19, v12

    .line 35
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 36
    invoke-virtual {v0, v11}, Lwa3/f;->e(I)I

    move-result v11

    and-int/lit16 v12, v7, 0x2000

    if-eq v12, v15, :cond_4

    .line 37
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_4

    .line 38
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/c0;->R:Ljava/util/List;

    or-int/lit16 v7, v7, 0x2000

    .line 39
    :cond_4
    :goto_6
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_5

    .line 40
    iget-object v12, v1, Lqa3/c0;->R:Ljava/util/List;

    .line 41
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v13

    .line 42
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 43
    :cond_5
    invoke-virtual {v0, v11}, Lwa3/f;->d(I)V

    goto/16 :goto_8

    :sswitch_5
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit16 v11, v7, 0x2000

    if-eq v11, v15, :cond_6

    .line 44
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->R:Ljava/util/List;

    or-int/lit16 v7, v7, 0x2000

    .line 45
    :cond_6
    iget-object v11, v1, Lqa3/c0;->R:Ljava/util/List;

    .line 46
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v12

    .line 47
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_6
    move/from16 v20, v11

    move/from16 v19, v12

    .line 48
    iget v11, v1, Lqa3/c0;->y:I

    const/16 v12, 0x80

    and-int/2addr v11, v12

    if-ne v11, v12, :cond_7

    .line 49
    iget-object v11, v1, Lqa3/c0;->Q:Lqa3/c1;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-static {v11}, Lqa3/c1;->i(Lqa3/c1;)Lqa3/g;

    move-result-object v18

    :cond_7
    move-object/from16 v11, v18

    .line 51
    sget-object v13, Lqa3/c1;->H:Lqa3/a;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    check-cast v13, Lqa3/c1;

    iput-object v13, v1, Lqa3/c0;->Q:Lqa3/c1;

    if-eqz v11, :cond_8

    .line 52
    invoke-virtual {v11, v13}, Lqa3/g;->o(Lqa3/c1;)V

    .line 53
    invoke-virtual {v11}, Lqa3/g;->k()Lqa3/c1;

    move-result-object v11

    iput-object v11, v1, Lqa3/c0;->Q:Lqa3/c1;

    .line 54
    :cond_8
    iget v11, v1, Lqa3/c0;->y:I

    or-int/2addr v11, v12

    iput v11, v1, Lqa3/c0;->y:I

    goto/16 :goto_8

    :sswitch_7
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit16 v11, v7, 0x400

    if-eq v11, v10, :cond_9

    .line 55
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->O:Ljava/util/List;

    or-int/lit16 v7, v7, 0x400

    .line 56
    :cond_9
    iget-object v11, v1, Lqa3/c0;->O:Ljava/util/List;

    sget-object v12, Lqa3/e1;->O:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_8
    move/from16 v20, v11

    move/from16 v19, v12

    and-int v11, v7, v9

    if-eq v11, v9, :cond_a

    .line 57
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->U:Ljava/util/List;

    or-int/2addr v7, v9

    .line 58
    :cond_a
    iget-object v11, v1, Lqa3/c0;->U:Ljava/util/List;

    sget-object v12, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_9
    move/from16 v20, v11

    move/from16 v19, v12

    .line 59
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 60
    invoke-virtual {v0, v11}, Lwa3/f;->e(I)I

    move-result v11

    and-int/lit16 v12, v7, 0x200

    if-eq v12, v14, :cond_b

    .line 61
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_b

    .line 62
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v1, Lqa3/c0;->M:Ljava/util/List;

    or-int/lit16 v7, v7, 0x200

    .line 63
    :cond_b
    :goto_7
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v12

    if-lez v12, :cond_c

    .line 64
    iget-object v12, v1, Lqa3/c0;->M:Ljava/util/List;

    .line 65
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v13

    .line 66
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 67
    :cond_c
    invoke-virtual {v0, v11}, Lwa3/f;->d(I)V

    goto/16 :goto_8

    :sswitch_a
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit16 v11, v7, 0x200

    if-eq v11, v14, :cond_d

    .line 68
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->M:Ljava/util/List;

    or-int/lit16 v7, v7, 0x200

    .line 69
    :cond_d
    iget-object v11, v1, Lqa3/c0;->M:Ljava/util/List;

    .line 70
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v12

    .line 71
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_b
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit16 v11, v7, 0x100

    if-eq v11, v4, :cond_e

    .line 72
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->L:Ljava/util/List;

    or-int/lit16 v7, v7, 0x100

    .line 73
    :cond_e
    iget-object v11, v1, Lqa3/c0;->L:Ljava/util/List;

    sget-object v12, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_c
    move/from16 v20, v11

    move/from16 v19, v12

    .line 74
    iget v11, v1, Lqa3/c0;->y:I

    or-int/lit8 v11, v11, 0x1

    iput v11, v1, Lqa3/c0;->y:I

    .line 75
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 76
    iput v11, v1, Lqa3/c0;->z:I

    goto/16 :goto_8

    :sswitch_d
    move/from16 v20, v11

    move/from16 v19, v12

    .line 77
    iget v11, v1, Lqa3/c0;->y:I

    or-int/lit8 v11, v11, 0x40

    iput v11, v1, Lqa3/c0;->y:I

    .line 78
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 79
    iput v11, v1, Lqa3/c0;->K:I

    goto/16 :goto_8

    :sswitch_e
    move/from16 v20, v11

    move/from16 v19, v12

    .line 80
    iget v11, v1, Lqa3/c0;->y:I

    or-int/lit8 v11, v11, 0x10

    iput v11, v1, Lqa3/c0;->y:I

    .line 81
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 82
    iput v11, v1, Lqa3/c0;->H:I

    goto/16 :goto_8

    :sswitch_f
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit16 v11, v7, 0x800

    if-eq v11, v8, :cond_f

    .line 83
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->P:Ljava/util/List;

    or-int/lit16 v7, v7, 0x800

    .line 84
    :cond_f
    iget-object v11, v1, Lqa3/c0;->P:Ljava/util/List;

    sget-object v12, Lqa3/e1;->O:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_10
    move/from16 v20, v11

    move/from16 v19, v12

    .line 85
    iget v11, v1, Lqa3/c0;->y:I

    and-int/lit8 v11, v11, 0x20

    move/from16 v12, v17

    if-ne v11, v12, :cond_10

    .line 86
    iget-object v11, v1, Lqa3/c0;->J:Lqa3/w0;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    invoke-static {v11}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v18

    :cond_10
    move-object/from16 v11, v18

    .line 88
    sget-object v12, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    check-cast v12, Lqa3/w0;

    iput-object v12, v1, Lqa3/c0;->J:Lqa3/w0;

    if-eqz v11, :cond_11

    .line 89
    invoke-virtual {v11, v12}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 90
    invoke-virtual {v11}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v11

    iput-object v11, v1, Lqa3/c0;->J:Lqa3/w0;

    .line 91
    :cond_11
    iget v11, v1, Lqa3/c0;->y:I

    const/16 v17, 0x20

    or-int/lit8 v11, v11, 0x20

    iput v11, v1, Lqa3/c0;->y:I

    goto/16 :goto_8

    :sswitch_11
    move/from16 v20, v11

    move/from16 v19, v12

    and-int/lit8 v11, v7, 0x20

    const/16 v12, 0x20

    if-eq v11, v12, :cond_12

    .line 92
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    iput-object v11, v1, Lqa3/c0;->I:Ljava/util/List;

    or-int/lit8 v7, v7, 0x20

    .line 93
    :cond_12
    iget-object v11, v1, Lqa3/c0;->I:Ljava/util/List;

    sget-object v12, Lqa3/b1;->O:Lqa3/a;

    invoke-virtual {v0, v12, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :sswitch_12
    move/from16 v20, v11

    move/from16 v19, v12

    .line 94
    iget v11, v1, Lqa3/c0;->y:I

    const/16 v12, 0x8

    and-int/2addr v11, v12

    if-ne v11, v12, :cond_13

    .line 95
    iget-object v11, v1, Lqa3/c0;->G:Lqa3/w0;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    invoke-static {v11}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v18

    :cond_13
    move-object/from16 v11, v18

    .line 97
    sget-object v13, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v13, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v13

    check-cast v13, Lqa3/w0;

    iput-object v13, v1, Lqa3/c0;->G:Lqa3/w0;

    if-eqz v11, :cond_14

    .line 98
    invoke-virtual {v11, v13}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 99
    invoke-virtual {v11}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v11

    iput-object v11, v1, Lqa3/c0;->G:Lqa3/w0;

    .line 100
    :cond_14
    iget v11, v1, Lqa3/c0;->y:I

    or-int/2addr v11, v12

    iput v11, v1, Lqa3/c0;->y:I

    goto :goto_8

    :sswitch_13
    move/from16 v20, v11

    move/from16 v19, v12

    .line 101
    iget v11, v1, Lqa3/c0;->y:I

    or-int/lit8 v11, v11, 0x4

    iput v11, v1, Lqa3/c0;->y:I

    .line 102
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 103
    iput v11, v1, Lqa3/c0;->F:I

    goto :goto_8

    :sswitch_14
    move/from16 v20, v11

    move/from16 v19, v12

    .line 104
    iget v11, v1, Lqa3/c0;->y:I

    or-int/lit8 v11, v11, 0x2

    iput v11, v1, Lqa3/c0;->y:I

    .line 105
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v11

    .line 106
    iput v11, v1, Lqa3/c0;->E:I
    :try_end_3
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_6
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :cond_15
    :goto_8
    move/from16 v4, v16

    goto/16 :goto_0

    .line 107
    :goto_9
    :try_start_4
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 108
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    .line 109
    iput-object v1, v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 110
    throw v2

    .line 111
    :goto_a
    iput-object v1, v0, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    .line 112
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :goto_b
    and-int/lit8 v2, v7, 0x20

    const/16 v12, 0x20

    if-ne v2, v12, :cond_16

    .line 113
    iget-object v2, v1, Lqa3/c0;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->I:Ljava/util/List;

    :cond_16
    and-int/lit16 v2, v7, 0x800

    if-ne v2, v8, :cond_17

    .line 114
    iget-object v2, v1, Lqa3/c0;->P:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->P:Ljava/util/List;

    :cond_17
    and-int/lit16 v2, v7, 0x100

    if-ne v2, v4, :cond_18

    .line 115
    iget-object v2, v1, Lqa3/c0;->L:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->L:Ljava/util/List;

    :cond_18
    and-int/lit16 v2, v7, 0x200

    if-ne v2, v14, :cond_19

    .line 116
    iget-object v2, v1, Lqa3/c0;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->M:Ljava/util/List;

    :cond_19
    and-int v2, v7, v9

    if-ne v2, v9, :cond_1a

    .line 117
    iget-object v2, v1, Lqa3/c0;->U:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->U:Ljava/util/List;

    :cond_1a
    and-int/lit16 v2, v7, 0x400

    if-ne v2, v10, :cond_1b

    .line 118
    iget-object v2, v1, Lqa3/c0;->O:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->O:Ljava/util/List;

    :cond_1b
    and-int/lit16 v2, v7, 0x2000

    if-ne v2, v15, :cond_1c

    .line 119
    iget-object v2, v1, Lqa3/c0;->R:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->R:Ljava/util/List;

    :cond_1c
    and-int v2, v7, v20

    move/from16 v4, v20

    if-ne v2, v4, :cond_1d

    .line 120
    iget-object v2, v1, Lqa3/c0;->T:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->T:Ljava/util/List;

    :cond_1d
    and-int v2, v7, v19

    move/from16 v4, v19

    if-ne v2, v4, :cond_1e

    .line 121
    iget-object v2, v1, Lqa3/c0;->V:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->V:Ljava/util/List;

    .line 122
    :cond_1e
    :try_start_5
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_8
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 123
    :catch_8
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->x:Lwa3/e;

    goto :goto_c

    :catchall_4
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->x:Lwa3/e;

    .line 124
    throw v0

    .line 125
    :goto_c
    invoke-virtual {v1}, Lwa3/m;->m()V

    .line 126
    throw v0

    :cond_1f
    and-int/lit8 v0, v7, 0x20

    const/16 v12, 0x20

    if-ne v0, v12, :cond_20

    .line 127
    iget-object v0, v1, Lqa3/c0;->I:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->I:Ljava/util/List;

    :cond_20
    and-int/lit16 v0, v7, 0x800

    if-ne v0, v8, :cond_21

    .line 128
    iget-object v0, v1, Lqa3/c0;->P:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->P:Ljava/util/List;

    :cond_21
    and-int/lit16 v0, v7, 0x100

    if-ne v0, v4, :cond_22

    .line 129
    iget-object v0, v1, Lqa3/c0;->L:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->L:Ljava/util/List;

    :cond_22
    and-int/lit16 v0, v7, 0x200

    if-ne v0, v14, :cond_23

    .line 130
    iget-object v0, v1, Lqa3/c0;->M:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->M:Ljava/util/List;

    :cond_23
    and-int v0, v7, v9

    if-ne v0, v9, :cond_24

    .line 131
    iget-object v0, v1, Lqa3/c0;->U:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->U:Ljava/util/List;

    :cond_24
    and-int/lit16 v0, v7, 0x400

    if-ne v0, v10, :cond_25

    .line 132
    iget-object v0, v1, Lqa3/c0;->O:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->O:Ljava/util/List;

    :cond_25
    and-int/lit16 v0, v7, 0x2000

    if-ne v0, v15, :cond_26

    .line 133
    iget-object v0, v1, Lqa3/c0;->R:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->R:Ljava/util/List;

    :cond_26
    const v4, 0x8000

    and-int v0, v7, v4

    if-ne v0, v4, :cond_27

    .line 134
    iget-object v0, v1, Lqa3/c0;->T:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->T:Ljava/util/List;

    :cond_27
    const/high16 v4, 0x20000

    and-int v0, v7, v4

    if-ne v0, v4, :cond_28

    .line 135
    iget-object v0, v1, Lqa3/c0;->V:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->V:Ljava/util/List;

    .line 136
    :cond_28
    :try_start_6
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_9
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 137
    :catch_9
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, v1, Lqa3/c0;->x:Lwa3/e;

    goto :goto_d

    :catchall_5
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/c0;->x:Lwa3/e;

    .line 138
    throw v0

    .line 139
    :goto_d
    invoke-virtual {v1}, Lwa3/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_14
        0x10 -> :sswitch_13
        0x1a -> :sswitch_12
        0x22 -> :sswitch_11
        0x2a -> :sswitch_10
        0x32 -> :sswitch_f
        0x38 -> :sswitch_e
        0x40 -> :sswitch_d
        0x48 -> :sswitch_c
        0x52 -> :sswitch_b
        0x58 -> :sswitch_a
        0x5a -> :sswitch_9
        0x62 -> :sswitch_8
        0x6a -> :sswitch_7
        0xf2 -> :sswitch_6
        0xf8 -> :sswitch_5
        0xfa -> :sswitch_4
        0x102 -> :sswitch_3
        0x10a -> :sswitch_2
        0x112 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/c0;->Y:Lqa3/c0;

    return-object v0
.end method

.method public final b()Z
    .locals 5

    iget-byte v0, p0, Lqa3/c0;->W:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/c0;->y:I

    and-int/lit8 v3, v0, 0x4

    const/4 v4, 0x4

    if-ne v3, v4, :cond_15

    const/16 v3, 0x8

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lqa3/c0;->G:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-virtual {v3}, Lqa3/b1;->b()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iget v0, p0, Lqa3/c0;->y:I

    const/16 v3, 0x20

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lqa3/c0;->J:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_5
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    iget-object v3, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move v0, v2

    :goto_2
    iget-object v3, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_9

    iget-object v3, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-virtual {v3}, Lqa3/e1;->b()Z

    move-result v3

    if-nez v3, :cond_8

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    move v0, v2

    :goto_3
    iget-object v3, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_b

    iget-object v3, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-virtual {v3}, Lqa3/e1;->b()Z

    move-result v3

    if-nez v3, :cond_a

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    iget v0, p0, Lqa3/c0;->y:I

    const/16 v3, 0x80

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_c

    iget-object v0, p0, Lqa3/c0;->Q:Lqa3/c1;

    invoke-virtual {v0}, Lqa3/c1;->b()Z

    move-result v0

    if-nez v0, :cond_c

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_c
    iget v0, p0, Lqa3/c0;->y:I

    const/16 v3, 0x100

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_d

    iget-object v0, p0, Lqa3/c0;->S:Lqa3/q;

    invoke-virtual {v0}, Lqa3/q;->b()Z

    move-result v0

    if-nez v0, :cond_d

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_d
    move v0, v2

    :goto_4
    iget-object v3, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_f

    iget-object v3, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/m;

    invoke-virtual {v3}, Lqa3/m;->b()Z

    move-result v3

    if-nez v3, :cond_e

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_e
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_f
    move v0, v2

    :goto_5
    iget-object v3, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_11

    iget-object v3, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_10

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_10
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_11
    move v0, v2

    :goto_6
    iget-object v3, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_13

    iget-object v3, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_12

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_12
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_13
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_14

    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2

    :cond_14
    iput-byte v1, p0, Lqa3/c0;->W:B

    return v1

    :cond_15
    iput-byte v2, p0, Lqa3/c0;->W:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b0;->k()Lqa3/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/b0;->o(Lqa3/c0;)V

    return-object v0
.end method

.method public final d()I
    .locals 9

    iget v0, p0, Lqa3/c0;->X:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/c0;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/c0;->E:I

    invoke-static {v3, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v4, p0, Lqa3/c0;->y:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    iget v4, p0, Lqa3/c0;->F:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_2
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_3

    const/4 v4, 0x3

    iget-object v7, p0, Lqa3/c0;->G:Lqa3/w0;

    invoke-static {v4, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    move v4, v2

    :goto_1
    iget-object v7, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    iget-object v7, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwa3/v;

    invoke-static {v5, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x5

    iget-object v7, p0, Lqa3/c0;->J:Lqa3/w0;

    invoke-static {v4, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    move v4, v2

    :goto_2
    iget-object v7, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_6

    iget-object v7, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwa3/v;

    const/4 v8, 0x6

    invoke-static {v8, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v7, 0x10

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_7

    const/4 v4, 0x7

    iget v7, p0, Lqa3/c0;->H:I

    invoke-static {v4, v7}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_7
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v7, 0x40

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_8

    iget v4, p0, Lqa3/c0;->K:I

    invoke-static {v6, v4}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_8
    iget v4, p0, Lqa3/c0;->y:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_9

    const/16 v3, 0x9

    iget v4, p0, Lqa3/c0;->z:I

    invoke-static {v3, v4}, Lwa3/g;->b(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_9
    move v3, v2

    :goto_3
    iget-object v4, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_a

    iget-object v4, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xa

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_a
    move v3, v2

    move v4, v3

    :goto_4
    iget-object v6, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_b

    iget-object v6, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_b
    add-int/2addr v0, v4

    iget-object v3, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_c

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v3

    add-int/2addr v0, v3

    :cond_c
    iput v4, p0, Lqa3/c0;->N:I

    move v3, v2

    :goto_5
    iget-object v4, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_d

    iget-object v4, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xc

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_d
    move v3, v2

    :goto_6
    iget-object v4, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_e

    iget-object v4, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0xd

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_e
    iget v3, p0, Lqa3/c0;->y:I

    const/16 v4, 0x80

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_f

    const/16 v3, 0x1e

    iget-object v4, p0, Lqa3/c0;->Q:Lqa3/c1;

    invoke-static {v3, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v3

    add-int/2addr v0, v3

    :cond_f
    move v3, v2

    move v4, v3

    :goto_7
    iget-object v6, p0, Lqa3/c0;->R:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_10

    iget-object v6, p0, Lqa3/c0;->R:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_10
    add-int/2addr v0, v4

    iget-object v3, p0, Lqa3/c0;->R:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v3, v1

    add-int/2addr v3, v0

    iget v0, p0, Lqa3/c0;->y:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_11

    iget-object v0, p0, Lqa3/c0;->S:Lqa3/q;

    invoke-static {v5, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v3, v0

    :cond_11
    move v0, v2

    :goto_8
    iget-object v1, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_12

    iget-object v1, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v4, 0x21

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_12
    :goto_9
    iget-object v0, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_13

    iget-object v0, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/v;

    const/16 v1, 0x22

    invoke-static {v1, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_13
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v0

    add-int/2addr v0, v3

    iget-object v1, p0, Lqa3/c0;->x:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/c0;->X:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/b0;->k()Lqa3/b0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 8

    invoke-virtual {p0}, Lqa3/c0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/c0;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/c0;->E:I

    invoke-virtual {p1, v3, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget v1, p0, Lqa3/c0;->y:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_1

    iget v1, p0, Lqa3/c0;->F:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_1
    iget v1, p0, Lqa3/c0;->y:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v5, p0, Lqa3/c0;->G:Lqa3/w0;

    invoke-virtual {p1, v1, v5}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    const/4 v1, 0x0

    move v5, v1

    :goto_0
    iget-object v6, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    iget-object v6, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa3/v;

    invoke-virtual {p1, v4, v6}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    iget-object v6, p0, Lqa3/c0;->J:Lqa3/w0;

    invoke-virtual {p1, v4, v6}, Lwa3/g;->o(ILwa3/v;)V

    :cond_4
    move v4, v1

    :goto_1
    iget-object v6, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_5

    iget-object v6, p0, Lqa3/c0;->P:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa3/v;

    const/4 v7, 0x6

    invoke-virtual {p1, v7, v6}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v6, 0x10

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_6

    const/4 v4, 0x7

    iget v6, p0, Lqa3/c0;->H:I

    invoke-virtual {p1, v4, v6}, Lwa3/g;->m(II)V

    :cond_6
    iget v4, p0, Lqa3/c0;->y:I

    const/16 v6, 0x40

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_7

    iget v4, p0, Lqa3/c0;->K:I

    invoke-virtual {p1, v2, v4}, Lwa3/g;->m(II)V

    :cond_7
    iget v2, p0, Lqa3/c0;->y:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_8

    const/16 v2, 0x9

    iget v3, p0, Lqa3/c0;->z:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_8
    move v2, v1

    :goto_2
    iget-object v3, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_9

    iget-object v3, p0, Lqa3/c0;->L:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0xa

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    iget-object v2, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_a

    const/16 v2, 0x5a

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    iget v2, p0, Lqa3/c0;->N:I

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    :cond_a
    move v2, v1

    :goto_3
    iget-object v3, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    iget-object v3, p0, Lqa3/c0;->M:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lwa3/g;->n(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    move v2, v1

    :goto_4
    iget-object v3, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_c

    iget-object v3, p0, Lqa3/c0;->U:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0xc

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_c
    move v2, v1

    :goto_5
    iget-object v3, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_d

    iget-object v3, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0xd

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_d
    iget v2, p0, Lqa3/c0;->y:I

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_e

    const/16 v2, 0x1e

    iget-object v3, p0, Lqa3/c0;->Q:Lqa3/c1;

    invoke-virtual {p1, v2, v3}, Lwa3/g;->o(ILwa3/v;)V

    :cond_e
    move v2, v1

    :goto_6
    iget-object v3, p0, Lqa3/c0;->R:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_f

    iget-object v3, p0, Lqa3/c0;->R:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x1f

    invoke-virtual {p1, v4, v3}, Lwa3/g;->m(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_f
    iget v2, p0, Lqa3/c0;->y:I

    const/16 v3, 0x100

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_10

    iget-object v2, p0, Lqa3/c0;->S:Lqa3/q;

    invoke-virtual {p1, v5, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_10
    move v2, v1

    :goto_7
    iget-object v3, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_11

    iget-object v3, p0, Lqa3/c0;->T:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0x21

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_11
    :goto_8
    iget-object v2, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_12

    iget-object v2, p0, Lqa3/c0;->V:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/16 v3, 0x22

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_12
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/c0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final p()V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lqa3/c0;->z:I

    iput v0, p0, Lqa3/c0;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lqa3/c0;->F:I

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, p0, Lqa3/c0;->G:Lqa3/w0;

    iput v0, p0, Lqa3/c0;->H:I

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->I:Ljava/util/List;

    iput-object v1, p0, Lqa3/c0;->J:Lqa3/w0;

    iput v0, p0, Lqa3/c0;->K:I

    iput-object v2, p0, Lqa3/c0;->L:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->M:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->O:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->P:Ljava/util/List;

    sget-object v0, Lqa3/c1;->G:Lqa3/c1;

    iput-object v0, p0, Lqa3/c0;->Q:Lqa3/c1;

    iput-object v2, p0, Lqa3/c0;->R:Ljava/util/List;

    sget-object v0, Lqa3/q;->E:Lqa3/q;

    iput-object v0, p0, Lqa3/c0;->S:Lqa3/q;

    iput-object v2, p0, Lqa3/c0;->T:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->U:Ljava/util/List;

    iput-object v2, p0, Lqa3/c0;->V:Ljava/util/List;

    return-void
.end method
