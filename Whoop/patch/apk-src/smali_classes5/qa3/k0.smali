.class public final Lqa3/k0;
.super Lwa3/m;
.source "SourceFile"


# static fields
.field public static final e0:Lqa3/k0;

.field public static final f0:Lqa3/a;


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

.field public P:Lqa3/e1;

.field public Q:I

.field public R:I

.field public S:Ljava/util/List;

.field public T:Ljava/util/List;

.field public U:Ljava/util/List;

.field public V:Ljava/util/List;

.field public W:Ljava/util/List;

.field public X:Ljava/util/List;

.field public Y:Ljava/util/List;

.field public Z:Ljava/util/List;

.field public a0:Lqa3/q;

.field public b0:Lqa3/q;

.field public c0:B

.field public d0:I

.field public final x:Lwa3/e;

.field public y:I

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa3/a;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lqa3/a;-><init>(I)V

    sput-object v0, Lqa3/k0;->f0:Lqa3/a;

    new-instance v0, Lqa3/k0;

    invoke-direct {v0}, Lqa3/k0;-><init>()V

    sput-object v0, Lqa3/k0;->e0:Lqa3/k0;

    invoke-virtual {v0}, Lqa3/k0;->p()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Lwa3/m;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lqa3/k0;->N:I

    .line 9
    iput-byte v0, p0, Lqa3/k0;->c0:B

    .line 10
    iput v0, p0, Lqa3/k0;->d0:I

    .line 11
    sget-object v0, Lwa3/e;->w:Lwa3/u;

    iput-object v0, p0, Lqa3/k0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lqa3/j0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lwa3/m;-><init>(Lwa3/l;)V

    const/4 v0, -0x1

    .line 2
    iput v0, p0, Lqa3/k0;->N:I

    .line 3
    iput-byte v0, p0, Lqa3/k0;->c0:B

    .line 4
    iput v0, p0, Lqa3/k0;->d0:I

    .line 5
    iget-object p1, p1, Lwa3/k;->w:Lwa3/e;

    .line 6
    iput-object p1, p0, Lqa3/k0;->x:Lwa3/e;

    return-void
.end method

.method public constructor <init>(Lwa3/f;Lwa3/i;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 12
    invoke-direct {v1}, Lwa3/m;-><init>()V

    const/4 v3, -0x1

    .line 13
    iput v3, v1, Lqa3/k0;->N:I

    .line 14
    iput-byte v3, v1, Lqa3/k0;->c0:B

    .line 15
    iput v3, v1, Lqa3/k0;->d0:I

    .line 16
    invoke-virtual {v1}, Lqa3/k0;->p()V

    .line 17
    invoke-static {}, Lwa3/e;->l()Lwa3/d;

    move-result-object v3

    const/4 v4, 0x1

    .line 18
    invoke-static {v3, v4}, Lwa3/g;->j(Ljava/io/OutputStream;I)Lwa3/g;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const v11, 0x8000

    const/high16 v12, 0x80000

    const/high16 v13, 0x100000

    const/high16 v14, 0x200000

    move/from16 v16, v4

    const/16 v17, 0x20

    const/16 v15, 0x400

    const/high16 v18, 0x10000

    if-nez v6, :cond_27

    .line 19
    :try_start_0
    invoke-virtual {v0}, Lwa3/f;->o()I

    move-result v8

    const/16 v19, 0x0

    sparse-switch v8, :sswitch_data_0

    .line 20
    invoke-virtual {v1, v0, v5, v2, v8}, Lwa3/m;->n(Lwa3/f;Lwa3/g;Lwa3/i;I)Z

    move-result v4
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_1a

    :sswitch_0
    move/from16 v6, v16

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    goto/16 :goto_b

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :catch_1
    move-exception v0

    goto/16 :goto_a

    .line 21
    :sswitch_1
    :try_start_1
    iget v8, v1, Lqa3/k0;->y:I
    :try_end_1
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/high16 v20, 0x20000

    const/16 v9, 0x800

    and-int/2addr v8, v9

    if-ne v8, v9, :cond_0

    .line 22
    :try_start_2
    iget-object v8, v1, Lqa3/k0;->b0:Lqa3/q;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/high16 v21, 0x40000

    .line 23
    :try_start_3
    new-instance v10, Lqa3/p;

    const/4 v4, 0x0

    .line 24
    invoke-direct {v10, v4}, Lqa3/p;-><init>(I)V

    .line 25
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v10, Lqa3/p;->z:Ljava/util/List;

    .line 26
    invoke-virtual {v10, v8}, Lqa3/p;->l(Lqa3/q;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    :goto_1
    const/high16 v21, 0x40000

    goto/16 :goto_b

    :catch_2
    move-exception v0

    :goto_2
    const/high16 v21, 0x40000

    goto/16 :goto_9

    :catch_3
    move-exception v0

    :goto_3
    const/high16 v21, 0x40000

    goto/16 :goto_a

    :cond_0
    const/high16 v21, 0x40000

    move-object/from16 v10, v19

    .line 27
    :goto_4
    sget-object v4, Lqa3/q;->F:Lqa3/a;

    invoke-virtual {v0, v4, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lqa3/q;

    iput-object v4, v1, Lqa3/k0;->b0:Lqa3/q;

    if-eqz v10, :cond_1

    .line 28
    invoke-virtual {v10, v4}, Lqa3/p;->l(Lqa3/q;)V

    .line 29
    invoke-virtual {v10}, Lqa3/p;->j()Lqa3/q;

    move-result-object v4

    iput-object v4, v1, Lqa3/k0;->b0:Lqa3/q;

    .line 30
    :cond_1
    iget v4, v1, Lqa3/k0;->y:I

    or-int/2addr v4, v9

    iput v4, v1, Lqa3/k0;->y:I

    goto/16 :goto_8

    :catchall_2
    move-exception v0

    const/high16 v20, 0x20000

    goto :goto_1

    :catch_4
    move-exception v0

    const/high16 v20, 0x20000

    goto :goto_2

    :catch_5
    move-exception v0

    const/high16 v20, 0x20000

    goto :goto_3

    :sswitch_2
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    .line 31
    iget v4, v1, Lqa3/k0;->y:I

    and-int/2addr v4, v15

    if-ne v4, v15, :cond_2

    .line 32
    iget-object v4, v1, Lqa3/k0;->a0:Lqa3/q;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    new-instance v8, Lqa3/p;

    const/4 v9, 0x0

    .line 34
    invoke-direct {v8, v9}, Lqa3/p;-><init>(I)V

    .line 35
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v9, v8, Lqa3/p;->z:Ljava/util/List;

    .line 36
    invoke-virtual {v8, v4}, Lqa3/p;->l(Lqa3/q;)V

    goto :goto_5

    :cond_2
    move-object/from16 v8, v19

    .line 37
    :goto_5
    sget-object v4, Lqa3/q;->F:Lqa3/a;

    invoke-virtual {v0, v4, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v4

    check-cast v4, Lqa3/q;

    iput-object v4, v1, Lqa3/k0;->a0:Lqa3/q;

    if-eqz v8, :cond_3

    .line 38
    invoke-virtual {v8, v4}, Lqa3/p;->l(Lqa3/q;)V

    .line 39
    invoke-virtual {v8}, Lqa3/p;->j()Lqa3/q;

    move-result-object v4

    iput-object v4, v1, Lqa3/k0;->a0:Lqa3/q;

    .line 40
    :cond_3
    iget v4, v1, Lqa3/k0;->y:I

    or-int/2addr v4, v15

    iput v4, v1, Lqa3/k0;->y:I

    goto/16 :goto_8

    :sswitch_3
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int v4, v7, v14

    if-eq v4, v14, :cond_4

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->Z:Ljava/util/List;

    or-int/2addr v7, v14

    .line 42
    :cond_4
    iget-object v4, v1, Lqa3/k0;->Z:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_4
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int v4, v7, v13

    if-eq v4, v13, :cond_5

    .line 43
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->Y:Ljava/util/List;

    or-int/2addr v7, v13

    .line 44
    :cond_5
    iget-object v4, v1, Lqa3/k0;->Y:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_5
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int v4, v7, v12

    if-eq v4, v12, :cond_6

    .line 45
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->X:Ljava/util/List;

    or-int/2addr v7, v12

    .line 46
    :cond_6
    iget-object v4, v1, Lqa3/k0;->X:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_6
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int v4, v7, v11

    if-eq v4, v11, :cond_7

    .line 47
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->T:Ljava/util/List;

    or-int/2addr v7, v11

    .line 48
    :cond_7
    iget-object v4, v1, Lqa3/k0;->T:Ljava/util/List;

    sget-object v8, Lqa3/m;->H:Lqa3/l;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_7
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    .line 49
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 50
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit16 v8, v7, 0x4000

    const/16 v9, 0x4000

    if-eq v8, v9, :cond_8

    .line 51
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v8

    if-lez v8, :cond_8

    .line 52
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Lqa3/k0;->S:Ljava/util/List;

    or-int/lit16 v7, v7, 0x4000

    .line 53
    :cond_8
    :goto_6
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v8

    if-lez v8, :cond_9

    .line 54
    iget-object v8, v1, Lqa3/k0;->S:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 55
    :cond_9
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto/16 :goto_8

    :sswitch_8
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int/lit16 v4, v7, 0x4000

    const/16 v9, 0x4000

    if-eq v4, v9, :cond_a

    .line 56
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->S:Ljava/util/List;

    or-int/lit16 v7, v7, 0x4000

    .line 57
    :cond_a
    iget-object v4, v1, Lqa3/k0;->S:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_9
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int/lit16 v4, v7, 0x400

    if-eq v4, v15, :cond_b

    .line 58
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->O:Ljava/util/List;

    or-int/lit16 v7, v7, 0x400

    .line 59
    :cond_b
    iget-object v4, v1, Lqa3/k0;->O:Ljava/util/List;

    sget-object v8, Lqa3/e1;->O:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_a
    const/high16 v20, 0x20000

    const/high16 v21, 0x40000

    and-int v4, v7, v21

    move/from16 v8, v21

    if-eq v4, v8, :cond_c

    .line 60
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->W:Ljava/util/List;

    or-int/2addr v7, v8

    .line 61
    :cond_c
    iget-object v4, v1, Lqa3/k0;->W:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_b
    const/high16 v20, 0x20000

    and-int v4, v7, v20

    move/from16 v8, v20

    if-eq v4, v8, :cond_d

    .line 62
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->V:Ljava/util/List;

    or-int/2addr v7, v8

    .line 63
    :cond_d
    iget-object v4, v1, Lqa3/k0;->V:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_c
    and-int v4, v7, v18

    move/from16 v8, v18

    if-eq v4, v8, :cond_e

    .line 64
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->U:Ljava/util/List;

    or-int/2addr v7, v8

    .line 65
    :cond_e
    iget-object v4, v1, Lqa3/k0;->U:Ljava/util/List;

    sget-object v8, Lqa3/h;->H:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 66
    :sswitch_d
    invoke-virtual {v0}, Lwa3/f;->l()I

    move-result v4

    .line 67
    invoke-virtual {v0, v4}, Lwa3/f;->e(I)I

    move-result v4

    and-int/lit16 v8, v7, 0x200

    const/16 v9, 0x200

    if-eq v8, v9, :cond_f

    .line 68
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v8

    if-lez v8, :cond_f

    .line 69
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Lqa3/k0;->M:Ljava/util/List;

    or-int/lit16 v7, v7, 0x200

    .line 70
    :cond_f
    :goto_7
    invoke-virtual {v0}, Lwa3/f;->c()I

    move-result v8

    if-lez v8, :cond_10

    .line 71
    iget-object v8, v1, Lqa3/k0;->M:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 72
    :cond_10
    invoke-virtual {v0, v4}, Lwa3/f;->d(I)V

    goto/16 :goto_8

    :sswitch_e
    and-int/lit16 v4, v7, 0x200

    const/16 v9, 0x200

    if-eq v4, v9, :cond_11

    .line 73
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->M:Ljava/util/List;

    or-int/lit16 v7, v7, 0x200

    .line 74
    :cond_11
    iget-object v4, v1, Lqa3/k0;->M:Ljava/util/List;

    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    :sswitch_f
    and-int/lit16 v4, v7, 0x100

    const/16 v8, 0x100

    if-eq v4, v8, :cond_12

    .line 75
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->L:Ljava/util/List;

    or-int/lit16 v7, v7, 0x100

    .line 76
    :cond_12
    iget-object v4, v1, Lqa3/k0;->L:Ljava/util/List;

    sget-object v8, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_8

    .line 77
    :sswitch_10
    iget v4, v1, Lqa3/k0;->y:I

    or-int/lit8 v4, v4, 0x1

    iput v4, v1, Lqa3/k0;->y:I

    .line 78
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->z:I

    goto/16 :goto_8

    .line 79
    :sswitch_11
    iget v4, v1, Lqa3/k0;->y:I

    or-int/lit8 v4, v4, 0x40

    iput v4, v1, Lqa3/k0;->y:I

    .line 80
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->K:I

    goto/16 :goto_8

    .line 81
    :sswitch_12
    iget v4, v1, Lqa3/k0;->y:I

    or-int/lit8 v4, v4, 0x10

    iput v4, v1, Lqa3/k0;->y:I

    .line 82
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->H:I

    goto/16 :goto_8

    .line 83
    :sswitch_13
    iget v4, v1, Lqa3/k0;->y:I

    const/16 v9, 0x200

    or-int/2addr v4, v9

    iput v4, v1, Lqa3/k0;->y:I

    .line 84
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->R:I

    goto/16 :goto_8

    .line 85
    :sswitch_14
    iget v4, v1, Lqa3/k0;->y:I

    const/16 v8, 0x100

    or-int/2addr v4, v8

    iput v4, v1, Lqa3/k0;->y:I

    .line 86
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->Q:I

    goto/16 :goto_8

    .line 87
    :sswitch_15
    iget v4, v1, Lqa3/k0;->y:I

    const/16 v8, 0x80

    and-int/2addr v4, v8

    if-ne v4, v8, :cond_13

    .line 88
    iget-object v4, v1, Lqa3/k0;->P:Lqa3/e1;

    invoke-virtual {v4}, Lqa3/e1;->p()Lqa3/d1;

    move-result-object v19

    :cond_13
    move-object/from16 v4, v19

    .line 89
    sget-object v9, Lqa3/e1;->O:Lqa3/a;

    invoke-virtual {v0, v9, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v9

    check-cast v9, Lqa3/e1;

    iput-object v9, v1, Lqa3/k0;->P:Lqa3/e1;

    if-eqz v4, :cond_14

    .line 90
    invoke-virtual {v4, v9}, Lqa3/d1;->n(Lqa3/e1;)V

    .line 91
    invoke-virtual {v4}, Lqa3/d1;->k()Lqa3/e1;

    move-result-object v4

    iput-object v4, v1, Lqa3/k0;->P:Lqa3/e1;

    .line 92
    :cond_14
    iget v4, v1, Lqa3/k0;->y:I

    or-int/2addr v4, v8

    iput v4, v1, Lqa3/k0;->y:I

    goto/16 :goto_8

    .line 93
    :sswitch_16
    iget v4, v1, Lqa3/k0;->y:I

    and-int/lit8 v4, v4, 0x20

    move/from16 v8, v17

    if-ne v4, v8, :cond_15

    .line 94
    iget-object v4, v1, Lqa3/k0;->J:Lqa3/w0;

    invoke-virtual {v4}, Lqa3/w0;->s()Lqa3/v0;

    move-result-object v19

    :cond_15
    move-object/from16 v4, v19

    .line 95
    sget-object v8, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    check-cast v8, Lqa3/w0;

    iput-object v8, v1, Lqa3/k0;->J:Lqa3/w0;

    if-eqz v4, :cond_16

    .line 96
    invoke-virtual {v4, v8}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 97
    invoke-virtual {v4}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v4

    iput-object v4, v1, Lqa3/k0;->J:Lqa3/w0;

    .line 98
    :cond_16
    iget v4, v1, Lqa3/k0;->y:I

    const/16 v17, 0x20

    or-int/lit8 v4, v4, 0x20

    iput v4, v1, Lqa3/k0;->y:I

    goto :goto_8

    :sswitch_17
    and-int/lit8 v4, v7, 0x20

    const/16 v8, 0x20

    if-eq v4, v8, :cond_17

    .line 99
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, Lqa3/k0;->I:Ljava/util/List;

    or-int/lit8 v7, v7, 0x20

    .line 100
    :cond_17
    iget-object v4, v1, Lqa3/k0;->I:Ljava/util/List;

    sget-object v8, Lqa3/b1;->O:Lqa3/a;

    invoke-virtual {v0, v8, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 101
    :sswitch_18
    iget v4, v1, Lqa3/k0;->y:I

    const/16 v8, 0x8

    and-int/2addr v4, v8

    if-ne v4, v8, :cond_18

    .line 102
    iget-object v4, v1, Lqa3/k0;->G:Lqa3/w0;

    invoke-virtual {v4}, Lqa3/w0;->s()Lqa3/v0;

    move-result-object v19

    :cond_18
    move-object/from16 v4, v19

    .line 103
    sget-object v9, Lqa3/w0;->V:Lqa3/a;

    invoke-virtual {v0, v9, v2}, Lwa3/f;->h(Lwa3/x;Lwa3/i;)Lwa3/v;

    move-result-object v9

    check-cast v9, Lqa3/w0;

    iput-object v9, v1, Lqa3/k0;->G:Lqa3/w0;

    if-eqz v4, :cond_19

    .line 104
    invoke-virtual {v4, v9}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    .line 105
    invoke-virtual {v4}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v4

    iput-object v4, v1, Lqa3/k0;->G:Lqa3/w0;

    .line 106
    :cond_19
    iget v4, v1, Lqa3/k0;->y:I

    or-int/2addr v4, v8

    iput v4, v1, Lqa3/k0;->y:I

    goto :goto_8

    .line 107
    :sswitch_19
    iget v4, v1, Lqa3/k0;->y:I

    or-int/lit8 v4, v4, 0x4

    iput v4, v1, Lqa3/k0;->y:I

    .line 108
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->F:I

    goto :goto_8

    .line 109
    :sswitch_1a
    iget v4, v1, Lqa3/k0;->y:I

    or-int/lit8 v4, v4, 0x2

    iput v4, v1, Lqa3/k0;->y:I

    .line 110
    invoke-virtual {v0}, Lwa3/f;->g()I

    move-result v4

    iput v4, v1, Lqa3/k0;->E:I
    :try_end_3
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_1a
    :goto_8
    move/from16 v4, v16

    goto/16 :goto_0

    .line 111
    :goto_9
    :try_start_4
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;

    .line 112
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a(Lwa3/m;)V

    throw v2

    .line 113
    :goto_a
    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->a(Lwa3/m;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_b
    and-int/lit8 v2, v7, 0x20

    const/16 v8, 0x20

    if-ne v2, v8, :cond_1b

    .line 114
    iget-object v2, v1, Lqa3/k0;->I:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->I:Ljava/util/List;

    :cond_1b
    and-int/lit16 v2, v7, 0x100

    const/16 v8, 0x100

    if-ne v2, v8, :cond_1c

    .line 115
    iget-object v2, v1, Lqa3/k0;->L:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->L:Ljava/util/List;

    :cond_1c
    and-int/lit16 v2, v7, 0x200

    const/16 v9, 0x200

    if-ne v2, v9, :cond_1d

    .line 116
    iget-object v2, v1, Lqa3/k0;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->M:Ljava/util/List;

    :cond_1d
    const/high16 v8, 0x10000

    and-int v2, v7, v8

    if-ne v2, v8, :cond_1e

    .line 117
    iget-object v2, v1, Lqa3/k0;->U:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->U:Ljava/util/List;

    :cond_1e
    const/high16 v8, 0x20000

    and-int v2, v7, v8

    if-ne v2, v8, :cond_1f

    .line 118
    iget-object v2, v1, Lqa3/k0;->V:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->V:Ljava/util/List;

    :cond_1f
    const/high16 v8, 0x40000

    and-int v2, v7, v8

    if-ne v2, v8, :cond_20

    .line 119
    iget-object v2, v1, Lqa3/k0;->W:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->W:Ljava/util/List;

    :cond_20
    and-int/lit16 v2, v7, 0x400

    if-ne v2, v15, :cond_21

    .line 120
    iget-object v2, v1, Lqa3/k0;->O:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->O:Ljava/util/List;

    :cond_21
    and-int/lit16 v2, v7, 0x4000

    const/16 v9, 0x4000

    if-ne v2, v9, :cond_22

    .line 121
    iget-object v2, v1, Lqa3/k0;->S:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->S:Ljava/util/List;

    :cond_22
    and-int v2, v7, v11

    if-ne v2, v11, :cond_23

    .line 122
    iget-object v2, v1, Lqa3/k0;->T:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->T:Ljava/util/List;

    :cond_23
    and-int v2, v7, v12

    if-ne v2, v12, :cond_24

    .line 123
    iget-object v2, v1, Lqa3/k0;->X:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->X:Ljava/util/List;

    :cond_24
    and-int v2, v7, v13

    if-ne v2, v13, :cond_25

    .line 124
    iget-object v2, v1, Lqa3/k0;->Y:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->Y:Ljava/util/List;

    :cond_25
    and-int v2, v7, v14

    if-ne v2, v14, :cond_26

    .line 125
    iget-object v2, v1, Lqa3/k0;->Z:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->Z:Ljava/util/List;

    .line 126
    :cond_26
    :try_start_5
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_6
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 127
    :catch_6
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->x:Lwa3/e;

    goto :goto_c

    :catchall_3
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->x:Lwa3/e;

    .line 128
    throw v0

    .line 129
    :goto_c
    invoke-virtual {v1}, Lwa3/m;->m()V

    .line 130
    throw v0

    :cond_27
    and-int/lit8 v0, v7, 0x20

    const/16 v8, 0x20

    if-ne v0, v8, :cond_28

    .line 131
    iget-object v0, v1, Lqa3/k0;->I:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->I:Ljava/util/List;

    :cond_28
    and-int/lit16 v0, v7, 0x100

    const/16 v8, 0x100

    if-ne v0, v8, :cond_29

    .line 132
    iget-object v0, v1, Lqa3/k0;->L:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->L:Ljava/util/List;

    :cond_29
    and-int/lit16 v0, v7, 0x200

    const/16 v9, 0x200

    if-ne v0, v9, :cond_2a

    .line 133
    iget-object v0, v1, Lqa3/k0;->M:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->M:Ljava/util/List;

    :cond_2a
    const/high16 v8, 0x10000

    and-int v0, v7, v8

    if-ne v0, v8, :cond_2b

    .line 134
    iget-object v0, v1, Lqa3/k0;->U:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->U:Ljava/util/List;

    :cond_2b
    const/high16 v8, 0x20000

    and-int v0, v7, v8

    if-ne v0, v8, :cond_2c

    .line 135
    iget-object v0, v1, Lqa3/k0;->V:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->V:Ljava/util/List;

    :cond_2c
    const/high16 v8, 0x40000

    and-int v0, v7, v8

    if-ne v0, v8, :cond_2d

    .line 136
    iget-object v0, v1, Lqa3/k0;->W:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->W:Ljava/util/List;

    :cond_2d
    and-int/lit16 v0, v7, 0x400

    if-ne v0, v15, :cond_2e

    .line 137
    iget-object v0, v1, Lqa3/k0;->O:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->O:Ljava/util/List;

    :cond_2e
    and-int/lit16 v0, v7, 0x4000

    const/16 v9, 0x4000

    if-ne v0, v9, :cond_2f

    .line 138
    iget-object v0, v1, Lqa3/k0;->S:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->S:Ljava/util/List;

    :cond_2f
    and-int v0, v7, v11

    if-ne v0, v11, :cond_30

    .line 139
    iget-object v0, v1, Lqa3/k0;->T:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->T:Ljava/util/List;

    :cond_30
    and-int v0, v7, v12

    if-ne v0, v12, :cond_31

    .line 140
    iget-object v0, v1, Lqa3/k0;->X:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->X:Ljava/util/List;

    :cond_31
    and-int v0, v7, v13

    if-ne v0, v13, :cond_32

    .line 141
    iget-object v0, v1, Lqa3/k0;->Y:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->Y:Ljava/util/List;

    :cond_32
    and-int v0, v7, v14

    if-ne v0, v14, :cond_33

    .line 142
    iget-object v0, v1, Lqa3/k0;->Z:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->Z:Ljava/util/List;

    .line 143
    :cond_33
    :try_start_6
    invoke-virtual {v5}, Lwa3/g;->i()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 144
    :catch_7
    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v0

    iput-object v0, v1, Lqa3/k0;->x:Lwa3/e;

    goto :goto_d

    :catchall_4
    move-exception v0

    invoke-virtual {v3}, Lwa3/d;->i()Lwa3/e;

    move-result-object v2

    iput-object v2, v1, Lqa3/k0;->x:Lwa3/e;

    .line 145
    throw v0

    .line 146
    :goto_d
    invoke-virtual {v1}, Lwa3/m;->m()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1a
        0x10 -> :sswitch_19
        0x1a -> :sswitch_18
        0x22 -> :sswitch_17
        0x2a -> :sswitch_16
        0x32 -> :sswitch_15
        0x38 -> :sswitch_14
        0x40 -> :sswitch_13
        0x48 -> :sswitch_12
        0x50 -> :sswitch_11
        0x58 -> :sswitch_10
        0x62 -> :sswitch_f
        0x68 -> :sswitch_e
        0x6a -> :sswitch_d
        0x72 -> :sswitch_c
        0x7a -> :sswitch_b
        0x82 -> :sswitch_a
        0x8a -> :sswitch_9
        0xf8 -> :sswitch_8
        0xfa -> :sswitch_7
        0x102 -> :sswitch_6
        0x10a -> :sswitch_5
        0x112 -> :sswitch_4
        0x11a -> :sswitch_3
        0x142 -> :sswitch_2
        0x14a -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final a()Lwa3/v;
    .locals 1

    sget-object v0, Lqa3/k0;->e0:Lqa3/k0;

    return-object v0
.end method

.method public final b()Z
    .locals 5

    iget-byte v0, p0, Lqa3/k0;->c0:B

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget v0, p0, Lqa3/k0;->y:I

    and-int/lit8 v3, v0, 0x4

    const/4 v4, 0x4

    if-ne v3, v4, :cond_1c

    const/16 v3, 0x8

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lqa3/k0;->G:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_2

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_2
    move v0, v2

    :goto_0
    iget-object v3, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_4

    iget-object v3, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-virtual {v3}, Lqa3/b1;->b()Z

    move-result v3

    if-nez v3, :cond_3

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v3, 0x20

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lqa3/k0;->J:Lqa3/w0;

    invoke-virtual {v0}, Lqa3/w0;->b()Z

    move-result v0

    if-nez v0, :cond_5

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_5
    move v0, v2

    :goto_1
    iget-object v3, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_7

    iget-object v3, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-virtual {v3}, Lqa3/w0;->b()Z

    move-result v3

    if-nez v3, :cond_6

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    move v0, v2

    :goto_2
    iget-object v3, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_9

    iget-object v3, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-virtual {v3}, Lqa3/e1;->b()Z

    move-result v3

    if-nez v3, :cond_8

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_9
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v3, 0x80

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_a

    iget-object v0, p0, Lqa3/k0;->P:Lqa3/e1;

    invoke-virtual {v0}, Lqa3/e1;->b()Z

    move-result v0

    if-nez v0, :cond_a

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_a
    move v0, v2

    :goto_3
    iget-object v3, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_c

    iget-object v3, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/m;

    invoke-virtual {v3}, Lqa3/m;->b()Z

    move-result v3

    if-nez v3, :cond_b

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_c
    move v0, v2

    :goto_4
    iget-object v3, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_e

    iget-object v3, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_d

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_d
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_e
    move v0, v2

    :goto_5
    iget-object v3, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_10

    iget-object v3, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_f

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_10
    move v0, v2

    :goto_6
    iget-object v3, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_12

    iget-object v3, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_11

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_11
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_12
    move v0, v2

    :goto_7
    iget-object v3, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_14

    iget-object v3, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_13

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_13
    add-int/lit8 v0, v0, 0x1

    goto :goto_7

    :cond_14
    move v0, v2

    :goto_8
    iget-object v3, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_16

    iget-object v3, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_15

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_15
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_16
    move v0, v2

    :goto_9
    iget-object v3, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_18

    iget-object v3, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/h;

    invoke-virtual {v3}, Lqa3/h;->b()Z

    move-result v3

    if-nez v3, :cond_17

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_17
    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_18
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v3, 0x400

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_19

    iget-object v0, p0, Lqa3/k0;->a0:Lqa3/q;

    invoke-virtual {v0}, Lqa3/q;->b()Z

    move-result v0

    if-nez v0, :cond_19

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_19
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v3, 0x800

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_1a

    iget-object v0, p0, Lqa3/k0;->b0:Lqa3/q;

    invoke-virtual {v0}, Lqa3/q;->b()Z

    move-result v0

    if-nez v0, :cond_1a

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_1a
    invoke-virtual {p0}, Lwa3/m;->i()Z

    move-result v0

    if-nez v0, :cond_1b

    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2

    :cond_1b
    iput-byte v1, p0, Lqa3/k0;->c0:B

    return v1

    :cond_1c
    iput-byte v2, p0, Lqa3/k0;->c0:B

    return v2
.end method

.method public final c()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/j0;->k()Lqa3/j0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lqa3/j0;->o(Lqa3/k0;)V

    return-object v0
.end method

.method public final d()I
    .locals 8

    iget v0, p0, Lqa3/k0;->d0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lqa3/k0;->y:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iget v0, p0, Lqa3/k0;->E:I

    invoke-static {v3, v0}, Lwa3/g;->b(II)I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v4, p0, Lqa3/k0;->y:I

    const/4 v5, 0x4

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_2

    iget v4, p0, Lqa3/k0;->F:I

    invoke-static {v1, v4}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_2
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v6, 0x8

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_3

    const/4 v4, 0x3

    iget-object v7, p0, Lqa3/k0;->G:Lqa3/w0;

    invoke-static {v4, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_3
    move v4, v2

    :goto_1
    iget-object v7, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v4, v7, :cond_4

    iget-object v7, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwa3/v;

    invoke-static {v5, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v7

    add-int/2addr v0, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_4
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_5

    const/4 v4, 0x5

    iget-object v7, p0, Lqa3/k0;->J:Lqa3/w0;

    invoke-static {v4, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_5
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v7, 0x80

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_6

    const/4 v4, 0x6

    iget-object v7, p0, Lqa3/k0;->P:Lqa3/e1;

    invoke-static {v4, v7}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    :cond_6
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v7, 0x100

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_7

    const/4 v4, 0x7

    iget v7, p0, Lqa3/k0;->Q:I

    invoke-static {v4, v7}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_7
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v7, 0x200

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_8

    iget v4, p0, Lqa3/k0;->R:I

    invoke-static {v6, v4}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_8
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v6, 0x10

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_9

    const/16 v4, 0x9

    iget v7, p0, Lqa3/k0;->H:I

    invoke-static {v4, v7}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_9
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v7, 0x40

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_a

    const/16 v4, 0xa

    iget v7, p0, Lqa3/k0;->K:I

    invoke-static {v4, v7}, Lwa3/g;->b(II)I

    move-result v4

    add-int/2addr v0, v4

    :cond_a
    iget v4, p0, Lqa3/k0;->y:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_b

    const/16 v3, 0xb

    iget v4, p0, Lqa3/k0;->z:I

    invoke-static {v3, v4}, Lwa3/g;->b(II)I

    move-result v3

    add-int/2addr v0, v3

    :cond_b
    move v3, v2

    :goto_2
    iget-object v4, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_c

    iget-object v4, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v7, 0xc

    invoke-static {v7, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_c
    move v3, v2

    move v4, v3

    :goto_3
    iget-object v7, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v3, v7, :cond_d

    iget-object v7, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static {v7}, Lwa3/g;->c(I)I

    move-result v7

    add-int/2addr v4, v7

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_d
    add-int/2addr v0, v4

    iget-object v3, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_e

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4}, Lwa3/g;->c(I)I

    move-result v3

    add-int/2addr v0, v3

    :cond_e
    iput v4, p0, Lqa3/k0;->N:I

    move v3, v2

    :goto_4
    iget-object v4, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_f

    iget-object v4, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v7, 0xe

    invoke-static {v7, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_f
    move v3, v2

    :goto_5
    iget-object v4, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_10

    iget-object v4, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v7, 0xf

    invoke-static {v7, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_10
    move v3, v2

    :goto_6
    iget-object v4, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_11

    iget-object v4, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_11
    move v3, v2

    :goto_7
    iget-object v4, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_12

    iget-object v4, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwa3/v;

    const/16 v6, 0x11

    invoke-static {v6, v4}, Lwa3/g;->d(ILwa3/v;)I

    move-result v4

    add-int/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_12
    move v3, v2

    move v4, v3

    :goto_8
    iget-object v6, p0, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v3, v6, :cond_13

    iget-object v6, p0, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Lwa3/g;->c(I)I

    move-result v6

    add-int/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    :cond_13
    add-int/2addr v0, v4

    iget-object v3, p0, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v3, v1

    add-int/2addr v3, v0

    move v0, v2

    :goto_9
    iget-object v1, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_14

    iget-object v1, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    invoke-static {v5, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_9

    :cond_14
    move v0, v2

    :goto_a
    iget-object v1, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_15

    iget-object v1, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v4, 0x21

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_a

    :cond_15
    move v0, v2

    :goto_b
    iget-object v1, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_16

    iget-object v1, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwa3/v;

    const/16 v4, 0x22

    invoke-static {v4, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v1

    add-int/2addr v3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_b

    :cond_16
    :goto_c
    iget-object v0, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_17

    iget-object v0, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwa3/v;

    const/16 v1, 0x23

    invoke-static {v1, v0}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v3, v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_c

    :cond_17
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v1, 0x400

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_18

    const/16 v0, 0x28

    iget-object v1, p0, Lqa3/k0;->a0:Lqa3/q;

    invoke-static {v0, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v3, v0

    :cond_18
    iget v0, p0, Lqa3/k0;->y:I

    const/16 v1, 0x800

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_19

    const/16 v0, 0x29

    iget-object v1, p0, Lqa3/k0;->b0:Lqa3/q;

    invoke-static {v0, v1}, Lwa3/g;->d(ILwa3/v;)I

    move-result v0

    add-int/2addr v3, v0

    :cond_19
    invoke-virtual {p0}, Lwa3/m;->j()I

    move-result v0

    add-int/2addr v0, v3

    iget-object v1, p0, Lqa3/k0;->x:Lwa3/e;

    invoke-virtual {v1}, Lwa3/e;->size()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Lqa3/k0;->d0:I

    return v1
.end method

.method public final e()Lwa3/k;
    .locals 1

    invoke-static {}, Lqa3/j0;->k()Lqa3/j0;

    move-result-object v0

    return-object v0
.end method

.method public final f(Lwa3/g;)V
    .locals 7

    invoke-virtual {p0}, Lqa3/k0;->d()I

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p0}, Lp0/n0;-><init>(Lwa3/m;)V

    iget v1, p0, Lqa3/k0;->y:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lqa3/k0;->E:I

    invoke-virtual {p1, v3, v1}, Lwa3/g;->m(II)V

    :cond_0
    iget v1, p0, Lqa3/k0;->y:I

    const/4 v4, 0x4

    and-int/2addr v1, v4

    if-ne v1, v4, :cond_1

    iget v1, p0, Lqa3/k0;->F:I

    invoke-virtual {p1, v2, v1}, Lwa3/g;->m(II)V

    :cond_1
    iget v1, p0, Lqa3/k0;->y:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    const/4 v1, 0x3

    iget-object v5, p0, Lqa3/k0;->G:Lqa3/w0;

    invoke-virtual {p1, v1, v5}, Lwa3/g;->o(ILwa3/v;)V

    :cond_2
    const/4 v1, 0x0

    move v5, v1

    :goto_0
    iget-object v6, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_3

    iget-object v6, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwa3/v;

    invoke-virtual {p1, v4, v6}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v5, 0x20

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_4

    const/4 v4, 0x5

    iget-object v6, p0, Lqa3/k0;->J:Lqa3/w0;

    invoke-virtual {p1, v4, v6}, Lwa3/g;->o(ILwa3/v;)V

    :cond_4
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v6, 0x80

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_5

    const/4 v4, 0x6

    iget-object v6, p0, Lqa3/k0;->P:Lqa3/e1;

    invoke-virtual {p1, v4, v6}, Lwa3/g;->o(ILwa3/v;)V

    :cond_5
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v6, 0x100

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_6

    const/4 v4, 0x7

    iget v6, p0, Lqa3/k0;->Q:I

    invoke-virtual {p1, v4, v6}, Lwa3/g;->m(II)V

    :cond_6
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v6, 0x200

    and-int/2addr v4, v6

    if-ne v4, v6, :cond_7

    iget v4, p0, Lqa3/k0;->R:I

    invoke-virtual {p1, v2, v4}, Lwa3/g;->m(II)V

    :cond_7
    iget v2, p0, Lqa3/k0;->y:I

    const/16 v4, 0x10

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    const/16 v2, 0x9

    iget v6, p0, Lqa3/k0;->H:I

    invoke-virtual {p1, v2, v6}, Lwa3/g;->m(II)V

    :cond_8
    iget v2, p0, Lqa3/k0;->y:I

    const/16 v6, 0x40

    and-int/2addr v2, v6

    if-ne v2, v6, :cond_9

    const/16 v2, 0xa

    iget v6, p0, Lqa3/k0;->K:I

    invoke-virtual {p1, v2, v6}, Lwa3/g;->m(II)V

    :cond_9
    iget v2, p0, Lqa3/k0;->y:I

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_a

    const/16 v2, 0xb

    iget v3, p0, Lqa3/k0;->z:I

    invoke-virtual {p1, v2, v3}, Lwa3/g;->m(II)V

    :cond_a
    move v2, v1

    :goto_1
    iget-object v3, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_b

    iget-object v3, p0, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v6, 0xc

    invoke-virtual {p1, v6, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_b
    iget-object v2, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_c

    const/16 v2, 0x6a

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    iget v2, p0, Lqa3/k0;->N:I

    invoke-virtual {p1, v2}, Lwa3/g;->v(I)V

    :cond_c
    move v2, v1

    :goto_2
    iget-object v3, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_d

    iget-object v3, p0, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p1, v3}, Lwa3/g;->n(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_d
    move v2, v1

    :goto_3
    iget-object v3, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_e

    iget-object v3, p0, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v6, 0xe

    invoke-virtual {p1, v6, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_e
    move v2, v1

    :goto_4
    iget-object v3, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_f

    iget-object v3, p0, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v6, 0xf

    invoke-virtual {p1, v6, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_f
    move v2, v1

    :goto_5
    iget-object v3, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_10

    iget-object v3, p0, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_10
    move v2, v1

    :goto_6
    iget-object v3, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_11

    iget-object v3, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0x11

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_11
    move v2, v1

    :goto_7
    iget-object v3, p0, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_12

    iget-object v3, p0, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x1f

    invoke-virtual {p1, v4, v3}, Lwa3/g;->m(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_12
    move v2, v1

    :goto_8
    iget-object v3, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_13

    iget-object v3, p0, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    invoke-virtual {p1, v5, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_13
    move v2, v1

    :goto_9
    iget-object v3, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_14

    iget-object v3, p0, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0x21

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_9

    :cond_14
    move v2, v1

    :goto_a
    iget-object v3, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_15

    iget-object v3, p0, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwa3/v;

    const/16 v4, 0x22

    invoke-virtual {p1, v4, v3}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_a

    :cond_15
    :goto_b
    iget-object v2, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_16

    iget-object v2, p0, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwa3/v;

    const/16 v3, 0x23

    invoke-virtual {p1, v3, v2}, Lwa3/g;->o(ILwa3/v;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_16
    iget v1, p0, Lqa3/k0;->y:I

    const/16 v2, 0x400

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_17

    const/16 v1, 0x28

    iget-object v2, p0, Lqa3/k0;->a0:Lqa3/q;

    invoke-virtual {p1, v1, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_17
    iget v1, p0, Lqa3/k0;->y:I

    const/16 v2, 0x800

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_18

    const/16 v1, 0x29

    iget-object v2, p0, Lqa3/k0;->b0:Lqa3/q;

    invoke-virtual {p1, v1, v2}, Lwa3/g;->o(ILwa3/v;)V

    :cond_18
    const/16 v1, 0x4a38

    invoke-virtual {v0, v1, p1}, Lp0/n0;->n(ILwa3/g;)V

    iget-object v0, p0, Lqa3/k0;->x:Lwa3/e;

    invoke-virtual {p1, v0}, Lwa3/g;->r(Lwa3/e;)V

    return-void
.end method

.method public final p()V
    .locals 3

    const/16 v0, 0x206

    iput v0, p0, Lqa3/k0;->z:I

    const/16 v0, 0x806

    iput v0, p0, Lqa3/k0;->E:I

    const/4 v0, 0x0

    iput v0, p0, Lqa3/k0;->F:I

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, p0, Lqa3/k0;->G:Lqa3/w0;

    iput v0, p0, Lqa3/k0;->H:I

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->I:Ljava/util/List;

    iput-object v1, p0, Lqa3/k0;->J:Lqa3/w0;

    iput v0, p0, Lqa3/k0;->K:I

    iput-object v2, p0, Lqa3/k0;->L:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->M:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->O:Ljava/util/List;

    sget-object v1, Lqa3/e1;->N:Lqa3/e1;

    iput-object v1, p0, Lqa3/k0;->P:Lqa3/e1;

    iput v0, p0, Lqa3/k0;->Q:I

    iput v0, p0, Lqa3/k0;->R:I

    iput-object v2, p0, Lqa3/k0;->S:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->T:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->U:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->V:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->W:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->X:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->Y:Ljava/util/List;

    iput-object v2, p0, Lqa3/k0;->Z:Ljava/util/List;

    sget-object v0, Lqa3/q;->E:Lqa3/q;

    iput-object v0, p0, Lqa3/k0;->a0:Lqa3/q;

    iput-object v0, p0, Lqa3/k0;->b0:Lqa3/q;

    return-void
.end method
