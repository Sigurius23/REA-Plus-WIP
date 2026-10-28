.class public final Lqa3/j0;
.super Lwa3/l;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:Lqa3/w0;

.field public I:I

.field public J:Ljava/util/List;

.field public K:Lqa3/w0;

.field public L:I

.field public M:Ljava/util/List;

.field public N:Ljava/util/List;

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

.field public z:I


# direct methods
.method public static synthetic k()Lqa3/j0;
    .locals 1

    invoke-static {}, Lqa3/j0;->n()Lqa3/j0;

    move-result-object v0

    return-object v0
.end method

.method public static n()Lqa3/j0;
    .locals 3

    new-instance v0, Lqa3/j0;

    invoke-direct {v0}, Lwa3/l;-><init>()V

    const/16 v1, 0x206

    iput v1, v0, Lqa3/j0;->E:I

    const/16 v1, 0x806

    iput v1, v0, Lqa3/j0;->F:I

    sget-object v1, Lqa3/w0;->U:Lqa3/w0;

    iput-object v1, v0, Lqa3/j0;->H:Lqa3/w0;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->J:Ljava/util/List;

    iput-object v1, v0, Lqa3/j0;->K:Lqa3/w0;

    iput-object v2, v0, Lqa3/j0;->M:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->N:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->O:Ljava/util/List;

    sget-object v1, Lqa3/e1;->N:Lqa3/e1;

    iput-object v1, v0, Lqa3/j0;->P:Lqa3/e1;

    iput-object v2, v0, Lqa3/j0;->S:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->T:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->U:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->V:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->W:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->X:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->Y:Ljava/util/List;

    iput-object v2, v0, Lqa3/j0;->Z:Ljava/util/List;

    sget-object v1, Lqa3/q;->E:Lqa3/q;

    iput-object v1, v0, Lqa3/j0;->a0:Lqa3/q;

    iput-object v1, v0, Lqa3/j0;->b0:Lqa3/q;

    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lqa3/j0;->n()Lqa3/j0;

    move-result-object v0

    invoke-virtual {p0}, Lqa3/j0;->l()Lqa3/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqa3/j0;->o(Lqa3/k0;)V

    return-object v0
.end method

.method public final g()Lwa3/v;
    .locals 2

    invoke-virtual {p0}, Lqa3/j0;->l()Lqa3/k0;

    move-result-object v0

    invoke-virtual {v0}, Lqa3/k0;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/impl/protobuf/UninitializedMessageException;-><init>()V

    throw v0
.end method

.method public final h(Lwa3/f;Lwa3/i;)Lwa3/k;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lqa3/k0;->f0:Lqa3/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lqa3/k0;

    invoke-direct {v1, p1, p2}, Lqa3/k0;-><init>(Lwa3/f;Lwa3/i;)V
    :try_end_0
    .catch Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0, v1}, Lqa3/j0;->o(Lqa3/k0;)V

    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    iget-object p2, p1, Lkotlin/reflect/jvm/internal/impl/protobuf/InvalidProtocolBufferException;->w:Lwa3/v;

    check-cast p2, Lqa3/k0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Lqa3/j0;->o(Lqa3/k0;)V

    :cond_0
    throw p1
.end method

.method public final bridge synthetic i(Lwa3/p;)Lwa3/k;
    .locals 0

    check-cast p1, Lqa3/k0;

    invoke-virtual {p0, p1}, Lqa3/j0;->o(Lqa3/k0;)V

    return-object p0
.end method

.method public final l()Lqa3/k0;
    .locals 5

    new-instance v0, Lqa3/k0;

    invoke-direct {v0, p0}, Lqa3/k0;-><init>(Lqa3/j0;)V

    iget v1, p0, Lqa3/j0;->z:I

    and-int/lit8 v2, v1, 0x1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget v2, p0, Lqa3/j0;->E:I

    iput v2, v0, Lqa3/k0;->z:I

    and-int/lit8 v2, v1, 0x2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_1

    or-int/lit8 v3, v3, 0x2

    :cond_1
    iget v2, p0, Lqa3/j0;->F:I

    iput v2, v0, Lqa3/k0;->E:I

    and-int/lit8 v2, v1, 0x4

    const/4 v4, 0x4

    if-ne v2, v4, :cond_2

    or-int/lit8 v3, v3, 0x4

    :cond_2
    iget v2, p0, Lqa3/j0;->G:I

    iput v2, v0, Lqa3/k0;->F:I

    and-int/lit8 v2, v1, 0x8

    const/16 v4, 0x8

    if-ne v2, v4, :cond_3

    or-int/lit8 v3, v3, 0x8

    :cond_3
    iget-object v2, p0, Lqa3/j0;->H:Lqa3/w0;

    iput-object v2, v0, Lqa3/k0;->G:Lqa3/w0;

    and-int/lit8 v2, v1, 0x10

    const/16 v4, 0x10

    if-ne v2, v4, :cond_4

    or-int/lit8 v3, v3, 0x10

    :cond_4
    iget v2, p0, Lqa3/j0;->I:I

    iput v2, v0, Lqa3/k0;->H:I

    and-int/lit8 v2, v1, 0x20

    const/16 v4, 0x20

    if-ne v2, v4, :cond_5

    iget-object v2, p0, Lqa3/j0;->J:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->J:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/lit8 v2, v2, -0x21

    iput v2, p0, Lqa3/j0;->z:I

    :cond_5
    iget-object v2, p0, Lqa3/j0;->J:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->I:Ljava/util/List;

    and-int/lit8 v2, v1, 0x40

    const/16 v4, 0x40

    if-ne v2, v4, :cond_6

    or-int/lit8 v3, v3, 0x20

    :cond_6
    iget-object v2, p0, Lqa3/j0;->K:Lqa3/w0;

    iput-object v2, v0, Lqa3/k0;->J:Lqa3/w0;

    and-int/lit16 v2, v1, 0x80

    const/16 v4, 0x80

    if-ne v2, v4, :cond_7

    or-int/lit8 v3, v3, 0x40

    :cond_7
    iget v2, p0, Lqa3/j0;->L:I

    iput v2, v0, Lqa3/k0;->K:I

    iget v2, p0, Lqa3/j0;->z:I

    const/16 v4, 0x100

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_8

    iget-object v2, p0, Lqa3/j0;->M:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->M:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/lit16 v2, v2, -0x101

    iput v2, p0, Lqa3/j0;->z:I

    :cond_8
    iget-object v2, p0, Lqa3/j0;->M:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->L:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/16 v4, 0x200

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_9

    iget-object v2, p0, Lqa3/j0;->N:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->N:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/lit16 v2, v2, -0x201

    iput v2, p0, Lqa3/j0;->z:I

    :cond_9
    iget-object v2, p0, Lqa3/j0;->N:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->M:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/16 v4, 0x400

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_a

    iget-object v2, p0, Lqa3/j0;->O:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->O:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/lit16 v2, v2, -0x401

    iput v2, p0, Lqa3/j0;->z:I

    :cond_a
    iget-object v2, p0, Lqa3/j0;->O:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->O:Ljava/util/List;

    and-int/lit16 v2, v1, 0x800

    const/16 v4, 0x800

    if-ne v2, v4, :cond_b

    or-int/lit16 v3, v3, 0x80

    :cond_b
    iget-object v2, p0, Lqa3/j0;->P:Lqa3/e1;

    iput-object v2, v0, Lqa3/k0;->P:Lqa3/e1;

    and-int/lit16 v2, v1, 0x1000

    const/16 v4, 0x1000

    if-ne v2, v4, :cond_c

    or-int/lit16 v3, v3, 0x100

    :cond_c
    iget v2, p0, Lqa3/j0;->Q:I

    iput v2, v0, Lqa3/k0;->Q:I

    and-int/lit16 v2, v1, 0x2000

    const/16 v4, 0x2000

    if-ne v2, v4, :cond_d

    or-int/lit16 v3, v3, 0x200

    :cond_d
    iget v2, p0, Lqa3/j0;->R:I

    iput v2, v0, Lqa3/k0;->R:I

    iget v2, p0, Lqa3/j0;->z:I

    const/16 v4, 0x4000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_e

    iget-object v2, p0, Lqa3/j0;->S:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->S:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/lit16 v2, v2, -0x4001

    iput v2, p0, Lqa3/j0;->z:I

    :cond_e
    iget-object v2, p0, Lqa3/j0;->S:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->S:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, 0x8000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_f

    iget-object v2, p0, Lqa3/j0;->T:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->T:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x8001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_f
    iget-object v2, p0, Lqa3/j0;->T:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->T:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x10000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_10

    iget-object v2, p0, Lqa3/j0;->U:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->U:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x10001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_10
    iget-object v2, p0, Lqa3/j0;->U:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->U:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x20000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_11

    iget-object v2, p0, Lqa3/j0;->V:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->V:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x20001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_11
    iget-object v2, p0, Lqa3/j0;->V:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->V:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x40000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_12

    iget-object v2, p0, Lqa3/j0;->W:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->W:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x40001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_12
    iget-object v2, p0, Lqa3/j0;->W:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->W:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x80000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_13

    iget-object v2, p0, Lqa3/j0;->X:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->X:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x80001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_13
    iget-object v2, p0, Lqa3/j0;->X:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->X:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x100000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_14

    iget-object v2, p0, Lqa3/j0;->Y:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->Y:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x100001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_14
    iget-object v2, p0, Lqa3/j0;->Y:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->Y:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const/high16 v4, 0x200000

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_15

    iget-object v2, p0, Lqa3/j0;->Z:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lqa3/j0;->Z:Ljava/util/List;

    iget v2, p0, Lqa3/j0;->z:I

    const v4, -0x200001

    and-int/2addr v2, v4

    iput v2, p0, Lqa3/j0;->z:I

    :cond_15
    iget-object v2, p0, Lqa3/j0;->Z:Ljava/util/List;

    iput-object v2, v0, Lqa3/k0;->Z:Ljava/util/List;

    const/high16 v2, 0x400000

    and-int v4, v1, v2

    if-ne v4, v2, :cond_16

    or-int/lit16 v3, v3, 0x400

    :cond_16
    iget-object v2, p0, Lqa3/j0;->a0:Lqa3/q;

    iput-object v2, v0, Lqa3/k0;->a0:Lqa3/q;

    const/high16 v2, 0x800000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_17

    or-int/lit16 v3, v3, 0x800

    :cond_17
    iget-object v1, p0, Lqa3/j0;->b0:Lqa3/q;

    iput-object v1, v0, Lqa3/k0;->b0:Lqa3/q;

    iput v3, v0, Lqa3/k0;->y:I

    return-object v0
.end method

.method public final o(Lqa3/k0;)V
    .locals 7

    sget-object v0, Lqa3/k0;->e0:Lqa3/k0;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iget v0, p1, Lqa3/k0;->y:I

    and-int/lit8 v1, v0, 0x1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    iget v1, p1, Lqa3/k0;->z:I

    iget v3, p0, Lqa3/j0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/j0;->z:I

    iput v1, p0, Lqa3/j0;->E:I

    :cond_1
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget v1, p1, Lqa3/k0;->E:I

    iget v3, p0, Lqa3/j0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/j0;->z:I

    iput v1, p0, Lqa3/j0;->F:I

    :cond_2
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    iget v1, p1, Lqa3/k0;->F:I

    iget v3, p0, Lqa3/j0;->z:I

    or-int/2addr v2, v3

    iput v2, p0, Lqa3/j0;->z:I

    iput v1, p0, Lqa3/j0;->G:I

    :cond_3
    const/16 v1, 0x8

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_5

    iget-object v0, p1, Lqa3/k0;->G:Lqa3/w0;

    iget v2, p0, Lqa3/j0;->z:I

    and-int/2addr v2, v1

    if-ne v2, v1, :cond_4

    iget-object v2, p0, Lqa3/j0;->H:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v2, v3, :cond_4

    invoke-static {v2}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v2

    invoke-virtual {v2, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v2}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/j0;->H:Lqa3/w0;

    goto :goto_0

    :cond_4
    iput-object v0, p0, Lqa3/j0;->H:Lqa3/w0;

    :goto_0
    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_5
    iget v0, p1, Lqa3/k0;->y:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_6

    iget v0, p1, Lqa3/k0;->H:I

    iget v2, p0, Lqa3/j0;->z:I

    or-int/2addr v1, v2

    iput v1, p0, Lqa3/j0;->z:I

    iput v0, p0, Lqa3/j0;->I:I

    :cond_6
    iget-object v0, p1, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v1, 0x20

    if-nez v0, :cond_9

    iget-object v0, p0, Lqa3/j0;->J:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lqa3/k0;->I:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->J:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_1

    :cond_7
    iget v0, p0, Lqa3/j0;->z:I

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_8

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->J:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->J:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_8
    iget-object v0, p0, Lqa3/j0;->J:Ljava/util/List;

    iget-object v2, p1, Lqa3/k0;->I:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_9
    :goto_1
    iget v0, p1, Lqa3/k0;->y:I

    and-int/2addr v0, v1

    const/16 v2, 0x40

    if-ne v0, v1, :cond_b

    iget-object v0, p1, Lqa3/k0;->J:Lqa3/w0;

    iget v1, p0, Lqa3/j0;->z:I

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_a

    iget-object v1, p0, Lqa3/j0;->K:Lqa3/w0;

    sget-object v3, Lqa3/w0;->U:Lqa3/w0;

    if-eq v1, v3, :cond_a

    invoke-static {v1}, Lqa3/w0;->r(Lqa3/w0;)Lqa3/v0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lqa3/v0;->n(Lqa3/w0;)Lqa3/v0;

    invoke-virtual {v1}, Lqa3/v0;->k()Lqa3/w0;

    move-result-object v0

    iput-object v0, p0, Lqa3/j0;->K:Lqa3/w0;

    goto :goto_2

    :cond_a
    iput-object v0, p0, Lqa3/j0;->K:Lqa3/w0;

    :goto_2
    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/j0;->z:I

    :cond_b
    iget v0, p1, Lqa3/k0;->y:I

    and-int/2addr v0, v2

    const/16 v1, 0x80

    if-ne v0, v2, :cond_c

    iget v0, p1, Lqa3/k0;->K:I

    iget v2, p0, Lqa3/j0;->z:I

    or-int/2addr v2, v1

    iput v2, p0, Lqa3/j0;->z:I

    iput v0, p0, Lqa3/j0;->L:I

    :cond_c
    iget-object v0, p1, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v2, 0x100

    if-nez v0, :cond_f

    iget-object v0, p0, Lqa3/j0;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, Lqa3/k0;->L:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->M:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_3

    :cond_d
    iget v0, p0, Lqa3/j0;->z:I

    and-int/2addr v0, v2

    if-eq v0, v2, :cond_e

    new-instance v0, Ljava/util/ArrayList;

    iget-object v3, p0, Lqa3/j0;->M:Ljava/util/List;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->M:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/j0;->z:I

    :cond_e
    iget-object v0, p0, Lqa3/j0;->M:Ljava/util/List;

    iget-object v3, p1, Lqa3/k0;->L:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_f
    :goto_3
    iget-object v0, p1, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v3, 0x200

    if-nez v0, :cond_12

    iget-object v0, p0, Lqa3/j0;->N:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lqa3/k0;->M:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->N:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    and-int/lit16 v0, v0, -0x201

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_4

    :cond_10
    iget v0, p0, Lqa3/j0;->z:I

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_11

    new-instance v0, Ljava/util/ArrayList;

    iget-object v4, p0, Lqa3/j0;->N:Ljava/util/List;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->N:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v3

    iput v0, p0, Lqa3/j0;->z:I

    :cond_11
    iget-object v0, p0, Lqa3/j0;->N:Ljava/util/List;

    iget-object v4, p1, Lqa3/k0;->M:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_12
    :goto_4
    iget-object v0, p1, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/16 v4, 0x400

    if-nez v0, :cond_15

    iget-object v0, p0, Lqa3/j0;->O:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p1, Lqa3/k0;->O:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->O:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_5

    :cond_13
    iget v0, p0, Lqa3/j0;->z:I

    and-int/2addr v0, v4

    if-eq v0, v4, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    iget-object v5, p0, Lqa3/j0;->O:Ljava/util/List;

    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->O:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v4

    iput v0, p0, Lqa3/j0;->z:I

    :cond_14
    iget-object v0, p0, Lqa3/j0;->O:Ljava/util/List;

    iget-object v5, p1, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_15
    :goto_5
    iget v0, p1, Lqa3/k0;->y:I

    and-int/2addr v0, v1

    const/16 v5, 0x800

    if-ne v0, v1, :cond_17

    iget-object v0, p1, Lqa3/k0;->P:Lqa3/e1;

    iget v1, p0, Lqa3/j0;->z:I

    and-int/2addr v1, v5

    if-ne v1, v5, :cond_16

    iget-object v1, p0, Lqa3/j0;->P:Lqa3/e1;

    sget-object v6, Lqa3/e1;->N:Lqa3/e1;

    if-eq v1, v6, :cond_16

    invoke-static {}, Lqa3/d1;->l()Lqa3/d1;

    move-result-object v6

    invoke-virtual {v6, v1}, Lqa3/d1;->n(Lqa3/e1;)V

    invoke-virtual {v6, v0}, Lqa3/d1;->n(Lqa3/e1;)V

    invoke-virtual {v6}, Lqa3/d1;->k()Lqa3/e1;

    move-result-object v0

    iput-object v0, p0, Lqa3/j0;->P:Lqa3/e1;

    goto :goto_6

    :cond_16
    iput-object v0, p0, Lqa3/j0;->P:Lqa3/e1;

    :goto_6
    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v5

    iput v0, p0, Lqa3/j0;->z:I

    :cond_17
    iget v0, p1, Lqa3/k0;->y:I

    and-int/lit16 v1, v0, 0x100

    if-ne v1, v2, :cond_18

    iget v1, p1, Lqa3/k0;->Q:I

    iget v2, p0, Lqa3/j0;->z:I

    or-int/lit16 v2, v2, 0x1000

    iput v2, p0, Lqa3/j0;->z:I

    iput v1, p0, Lqa3/j0;->Q:I

    :cond_18
    and-int/2addr v0, v3

    if-ne v0, v3, :cond_19

    iget v0, p1, Lqa3/k0;->R:I

    iget v1, p0, Lqa3/j0;->z:I

    or-int/lit16 v1, v1, 0x2000

    iput v1, p0, Lqa3/j0;->z:I

    iput v0, p0, Lqa3/j0;->R:I

    :cond_19
    iget-object v0, p1, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    iget-object v0, p0, Lqa3/j0;->S:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p1, Lqa3/k0;->S:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->S:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_7

    :cond_1a
    iget v0, p0, Lqa3/j0;->z:I

    const/16 v1, 0x4000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_1b

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->S:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->S:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_1b
    iget-object v0, p0, Lqa3/j0;->S:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->S:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1c
    :goto_7
    iget-object v0, p1, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    iget-object v0, p0, Lqa3/j0;->T:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    iget-object v0, p1, Lqa3/k0;->T:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->T:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x8001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_8

    :cond_1d
    iget v0, p0, Lqa3/j0;->z:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_1e

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->T:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->T:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_1e
    iget-object v0, p0, Lqa3/j0;->T:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->T:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1f
    :goto_8
    iget-object v0, p1, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_22

    iget-object v0, p0, Lqa3/j0;->U:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    iget-object v0, p1, Lqa3/k0;->U:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->U:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x10001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_9

    :cond_20
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_21

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->U:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->U:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_21
    iget-object v0, p0, Lqa3/j0;->U:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->U:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_22
    :goto_9
    iget-object v0, p1, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_25

    iget-object v0, p0, Lqa3/j0;->V:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_23

    iget-object v0, p1, Lqa3/k0;->V:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->V:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x20001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_a

    :cond_23
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_24

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->V:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->V:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_24
    iget-object v0, p0, Lqa3/j0;->V:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->V:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_25
    :goto_a
    iget-object v0, p1, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_28

    iget-object v0, p0, Lqa3/j0;->W:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_26

    iget-object v0, p1, Lqa3/k0;->W:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->W:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x40001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_b

    :cond_26
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_27

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->W:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->W:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_27
    iget-object v0, p0, Lqa3/j0;->W:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->W:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_28
    :goto_b
    iget-object v0, p1, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, p0, Lqa3/j0;->X:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_29

    iget-object v0, p1, Lqa3/k0;->X:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->X:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x80001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_c

    :cond_29
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2a

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->X:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->X:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_2a
    iget-object v0, p0, Lqa3/j0;->X:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->X:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2b
    :goto_c
    iget-object v0, p1, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2e

    iget-object v0, p0, Lqa3/j0;->Y:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2c

    iget-object v0, p1, Lqa3/k0;->Y:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->Y:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x100001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_d

    :cond_2c
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x100000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_2d

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->Y:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->Y:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_2d
    iget-object v0, p0, Lqa3/j0;->Y:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->Y:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_2e
    :goto_d
    iget-object v0, p1, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_31

    iget-object v0, p0, Lqa3/j0;->Z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2f

    iget-object v0, p1, Lqa3/k0;->Z:Ljava/util/List;

    iput-object v0, p0, Lqa3/j0;->Z:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    const v1, -0x200001

    and-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    goto :goto_e

    :cond_2f
    iget v0, p0, Lqa3/j0;->z:I

    const/high16 v1, 0x200000

    and-int/2addr v0, v1

    if-eq v0, v1, :cond_30

    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lqa3/j0;->Z:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lqa3/j0;->Z:Ljava/util/List;

    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v1

    iput v0, p0, Lqa3/j0;->z:I

    :cond_30
    iget-object v0, p0, Lqa3/j0;->Z:Ljava/util/List;

    iget-object v1, p1, Lqa3/k0;->Z:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_31
    :goto_e
    iget v0, p1, Lqa3/k0;->y:I

    and-int/2addr v0, v4

    if-ne v0, v4, :cond_33

    iget-object v0, p1, Lqa3/k0;->a0:Lqa3/q;

    iget v1, p0, Lqa3/j0;->z:I

    const/high16 v2, 0x400000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_32

    iget-object v1, p0, Lqa3/j0;->a0:Lqa3/q;

    sget-object v3, Lqa3/q;->E:Lqa3/q;

    if-eq v1, v3, :cond_32

    new-instance v3, Lqa3/p;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lqa3/p;-><init>(I)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v3, v1}, Lqa3/p;->l(Lqa3/q;)V

    invoke-virtual {v3, v0}, Lqa3/p;->l(Lqa3/q;)V

    invoke-virtual {v3}, Lqa3/p;->j()Lqa3/q;

    move-result-object v0

    iput-object v0, p0, Lqa3/j0;->a0:Lqa3/q;

    goto :goto_f

    :cond_32
    iput-object v0, p0, Lqa3/j0;->a0:Lqa3/q;

    :goto_f
    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/j0;->z:I

    :cond_33
    iget v0, p1, Lqa3/k0;->y:I

    and-int/2addr v0, v5

    if-ne v0, v5, :cond_35

    iget-object v0, p1, Lqa3/k0;->b0:Lqa3/q;

    iget v1, p0, Lqa3/j0;->z:I

    const/high16 v2, 0x800000

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_34

    iget-object v1, p0, Lqa3/j0;->b0:Lqa3/q;

    sget-object v3, Lqa3/q;->E:Lqa3/q;

    if-eq v1, v3, :cond_34

    new-instance v3, Lqa3/p;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lqa3/p;-><init>(I)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v4, v3, Lqa3/p;->z:Ljava/util/List;

    invoke-virtual {v3, v1}, Lqa3/p;->l(Lqa3/q;)V

    invoke-virtual {v3, v0}, Lqa3/p;->l(Lqa3/q;)V

    invoke-virtual {v3}, Lqa3/p;->j()Lqa3/q;

    move-result-object v0

    iput-object v0, p0, Lqa3/j0;->b0:Lqa3/q;

    goto :goto_10

    :cond_34
    iput-object v0, p0, Lqa3/j0;->b0:Lqa3/q;

    :goto_10
    iget v0, p0, Lqa3/j0;->z:I

    or-int/2addr v0, v2

    iput v0, p0, Lqa3/j0;->z:I

    :cond_35
    invoke-virtual {p0, p1}, Lwa3/l;->j(Lwa3/m;)V

    iget-object v0, p0, Lwa3/k;->w:Lwa3/e;

    iget-object p1, p1, Lqa3/k0;->x:Lwa3/e;

    invoke-virtual {v0, p1}, Lwa3/e;->c(Lwa3/e;)Lwa3/e;

    move-result-object p1

    iput-object p1, p0, Lwa3/k;->w:Lwa3/e;

    return-void
.end method
