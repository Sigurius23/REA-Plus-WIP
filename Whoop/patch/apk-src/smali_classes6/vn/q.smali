.class public final Lvn/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/y;
.implements Lko/b0;
.implements Lsn/t0;
.implements Lwm/k;
.implements Lsn/p0;


# static fields
.field public static final y0:Ljava/util/Set;


# instance fields
.field public final E:Lko/o;

.field public final F:Lrm/c0;

.field public final G:Lvm/h;

.field public final H:Lsn/z;

.field public final I:Lg73/d;

.field public final J:Lko/c0;

.field public final K:Lsn/z;

.field public final L:I

.field public final M:Lf1/p1;

.field public final N:Ljava/util/ArrayList;

.field public final O:Ljava/util/List;

.field public final P:Lvn/n;

.field public final Q:Lvn/n;

.field public final R:Landroid/os/Handler;

.field public final S:Ljava/util/ArrayList;

.field public final T:Ljava/util/Map;

.field public U:Lun/a;

.field public V:[Lvn/p;

.field public W:[I

.field public final X:Ljava/util/HashSet;

.field public final Y:Landroid/util/SparseIntArray;

.field public Z:Lvn/o;

.field public a0:I

.field public b0:I

.field public c0:Z

.field public d0:Z

.field public e0:I

.field public f0:Lrm/c0;

.field public g0:Lrm/c0;

.field public h0:Z

.field public i0:Lsn/x0;

.field public j0:Ljava/util/Set;

.field public k0:[I

.field public l0:I

.field public m0:Z

.field public n0:[Z

.field public o0:[Z

.field public p0:J

.field public q0:J

.field public r0:Z

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:J

.field public final w:Ljava/lang/String;

.field public w0:Lvm/c;

.field public final x:I

.field public x0:Lvn/j;

.field public final y:Lvn/k;

.field public final z:Lvn/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lvn/q;->y0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILvn/k;Lvn/h;Ljava/util/Map;Lko/o;JLrm/c0;Lvm/h;Lsn/z;Lg73/d;Lsn/z;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvn/q;->w:Ljava/lang/String;

    iput p2, p0, Lvn/q;->x:I

    iput-object p3, p0, Lvn/q;->y:Lvn/k;

    iput-object p4, p0, Lvn/q;->z:Lvn/h;

    iput-object p5, p0, Lvn/q;->T:Ljava/util/Map;

    iput-object p6, p0, Lvn/q;->E:Lko/o;

    iput-object p9, p0, Lvn/q;->F:Lrm/c0;

    iput-object p10, p0, Lvn/q;->G:Lvm/h;

    iput-object p11, p0, Lvn/q;->H:Lsn/z;

    iput-object p12, p0, Lvn/q;->I:Lg73/d;

    iput-object p13, p0, Lvn/q;->K:Lsn/z;

    iput p14, p0, Lvn/q;->L:I

    new-instance p1, Lko/c0;

    const-string p2, "Loader:HlsSampleStreamWrapper"

    invoke-direct {p1, p2}, Lko/c0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lvn/q;->J:Lko/c0;

    new-instance p1, Lf1/p1;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lf1/p1;-><init>(I)V

    const/4 p2, 0x0

    iput-object p2, p1, Lf1/p1;->y:Ljava/lang/Object;

    const/4 p3, 0x0

    iput-boolean p3, p1, Lf1/p1;->x:Z

    iput-object p2, p1, Lf1/p1;->z:Ljava/lang/Object;

    iput-object p1, p0, Lvn/q;->M:Lf1/p1;

    new-array p1, p3, [I

    iput-object p1, p0, Lvn/q;->W:[I

    new-instance p1, Ljava/util/HashSet;

    sget-object p4, Lvn/q;->y0:Ljava/util/Set;

    invoke-interface {p4}, Ljava/util/Set;->size()I

    move-result p5

    invoke-direct {p1, p5}, Ljava/util/HashSet;-><init>(I)V

    iput-object p1, p0, Lvn/q;->X:Ljava/util/HashSet;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-interface {p4}, Ljava/util/Set;->size()I

    move-result p4

    invoke-direct {p1, p4}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object p1, p0, Lvn/q;->Y:Landroid/util/SparseIntArray;

    new-array p1, p3, [Lvn/p;

    iput-object p1, p0, Lvn/q;->V:[Lvn/p;

    new-array p1, p3, [Z

    iput-object p1, p0, Lvn/q;->o0:[Z

    new-array p1, p3, [Z

    iput-object p1, p0, Lvn/q;->n0:[Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lvn/q;->O:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvn/q;->S:Ljava/util/ArrayList;

    new-instance p1, Lvn/n;

    invoke-direct {p1, p0, p3}, Lvn/n;-><init>(Lvn/q;I)V

    iput-object p1, p0, Lvn/q;->P:Lvn/n;

    new-instance p1, Lvn/n;

    const/4 p3, 0x1

    invoke-direct {p1, p0, p3}, Lvn/n;-><init>(Lvn/q;I)V

    iput-object p1, p0, Lvn/q;->Q:Lvn/n;

    invoke-static {p2}, Llo/y;->k(Lmo/h;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lvn/q;->R:Landroid/os/Handler;

    iput-wide p7, p0, Lvn/q;->p0:J

    iput-wide p7, p0, Lvn/q;->q0:J

    return-void
.end method

.method public static B(I)I
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x3

    if-eq p0, v0, :cond_1

    if-eq p0, v2, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v1

    :cond_1
    return v2

    :cond_2
    return v0
.end method

.method public static t(II)Lwm/h;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x36

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unmapped track with id "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " of type "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "HlsSampleStreamWrapper"

    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p0, Lwm/h;

    invoke-direct {p0}, Lwm/h;-><init>()V

    return-object p0
.end method

.method public static y(Lrm/c0;Lrm/c0;Z)Lrm/c0;
    .locals 7

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lrm/c0;->I:Ljava/lang/String;

    iget-object v1, p1, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v1}, Llo/m;->g(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2, v0}, Llo/y;->m(ILjava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    invoke-static {v2, v0}, Llo/y;->n(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llo/m;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, Llo/m;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Lrm/c0;->a()Lrm/b0;

    move-result-object v3

    iget-object v5, p0, Lrm/c0;->w:Ljava/lang/String;

    iput-object v5, v3, Lrm/b0;->a:Ljava/lang/String;

    iget-object v5, p0, Lrm/c0;->x:Ljava/lang/String;

    iput-object v5, v3, Lrm/b0;->b:Ljava/lang/String;

    iget-object v5, p0, Lrm/c0;->y:Ljava/lang/String;

    iput-object v5, v3, Lrm/b0;->c:Ljava/lang/String;

    iget v5, p0, Lrm/c0;->z:I

    iput v5, v3, Lrm/b0;->d:I

    iget v5, p0, Lrm/c0;->E:I

    iput v5, v3, Lrm/b0;->e:I

    const/4 v5, -0x1

    if-eqz p2, :cond_2

    iget v6, p0, Lrm/c0;->F:I

    goto :goto_1

    :cond_2
    move v6, v5

    :goto_1
    iput v6, v3, Lrm/b0;->f:I

    if-eqz p2, :cond_3

    iget p2, p0, Lrm/c0;->G:I

    goto :goto_2

    :cond_3
    move p2, v5

    :goto_2
    iput p2, v3, Lrm/b0;->g:I

    iput-object v0, v3, Lrm/b0;->h:Ljava/lang/String;

    const/4 p2, 0x2

    if-ne v2, p2, :cond_4

    iget p2, p0, Lrm/c0;->Q:I

    iput p2, v3, Lrm/b0;->p:I

    iget p2, p0, Lrm/c0;->R:I

    iput p2, v3, Lrm/b0;->q:I

    iget p2, p0, Lrm/c0;->S:F

    iput p2, v3, Lrm/b0;->r:F

    :cond_4
    if-eqz v1, :cond_5

    iput-object v1, v3, Lrm/b0;->k:Ljava/lang/String;

    :cond_5
    iget p2, p0, Lrm/c0;->Y:I

    if-eq p2, v5, :cond_6

    if-ne v2, v4, :cond_6

    iput p2, v3, Lrm/b0;->x:I

    :cond_6
    iget-object p0, p0, Lrm/c0;->J:Lin/c;

    if-eqz p0, :cond_9

    iget-object p1, p1, Lrm/c0;->J:Lin/c;

    if-eqz p1, :cond_8

    iget-object p0, p0, Lin/c;->w:[Lin/b;

    array-length p2, p0

    if-nez p2, :cond_7

    move-object p0, p1

    goto :goto_3

    :cond_7
    new-instance p2, Lin/c;

    iget-object p1, p1, Lin/c;->w:[Lin/b;

    array-length v0, p1

    array-length v1, p0

    add-int/2addr v0, v1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    array-length p1, p1

    array-length v1, p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, p1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    check-cast v0, [Lin/b;

    invoke-direct {p2, v0}, Lin/c;-><init>([Lin/b;)V

    move-object p0, p2

    :cond_8
    :goto_3
    iput-object p0, v3, Lrm/b0;->i:Lin/c;

    :cond_9
    new-instance p0, Lrm/c0;

    invoke-direct {p0, v3}, Lrm/c0;-><init>(Lrm/b0;)V

    return-object p0
.end method


# virtual methods
.method public final A()Lvn/j;
    .locals 2

    iget-object v0, p0, Lvn/q;->N:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvn/j;

    return-object v0
.end method

.method public final C()Z
    .locals 4

    iget-wide v0, p0, Lvn/q;->q0:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final D()V
    .locals 16

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lvn/q;->h0:Z

    if-nez v1, :cond_1a

    iget-object v1, v0, Lvn/q;->k0:[I

    if-nez v1, :cond_1a

    iget-boolean v1, v0, Lvn/q;->c0:Z

    if-nez v1, :cond_0

    goto/16 :goto_12

    :cond_0
    iget-object v1, v0, Lvn/q;->V:[Lvn/p;

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    invoke-virtual {v5}, Lsn/q0;->o()Lrm/c0;

    move-result-object v5

    if-nez v5, :cond_1

    goto/16 :goto_12

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lvn/q;->i0:Lsn/x0;

    const/4 v2, 0x3

    const/4 v4, -0x1

    if-eqz v1, :cond_a

    iget v1, v1, Lsn/x0;->w:I

    new-array v5, v1, [I

    iput-object v5, v0, Lvn/q;->k0:[I

    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([II)V

    move v4, v3

    :goto_1
    if-ge v4, v1, :cond_9

    move v5, v3

    :goto_2
    iget-object v6, v0, Lvn/q;->V:[Lvn/p;

    array-length v7, v6

    if-ge v5, v7, :cond_8

    aget-object v6, v6, v5

    invoke-virtual {v6}, Lsn/q0;->o()Lrm/c0;

    move-result-object v6

    invoke-static {v6}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v7, v0, Lvn/q;->i0:Lsn/x0;

    invoke-virtual {v7, v4}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v7

    iget-object v7, v7, Lsn/w0;->y:[Lrm/c0;

    aget-object v7, v7, v3

    iget-object v8, v6, Lrm/c0;->L:Ljava/lang/String;

    iget-object v9, v7, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v8}, Llo/m;->g(Ljava/lang/String;)I

    move-result v10

    if-eq v10, v2, :cond_3

    invoke-static {v9}, Llo/m;->g(Ljava/lang/String;)I

    move-result v6

    if-ne v10, v6, :cond_7

    goto :goto_3

    :cond_3
    invoke-static {v8, v9}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_4

    :cond_4
    const-string v9, "application/cea-608"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    const-string v9, "application/cea-708"

    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    :cond_5
    iget v6, v6, Lrm/c0;->d0:I

    iget v7, v7, Lrm/c0;->d0:I

    if-ne v6, v7, :cond_7

    :cond_6
    :goto_3
    iget-object v6, v0, Lvn/q;->k0:[I

    aput v5, v6, v4

    goto :goto_5

    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_9
    iget-object v1, v0, Lvn/q;->S:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvn/m;

    invoke-virtual {v2}, Lvn/m;->a()V

    goto :goto_6

    :cond_a
    iget-object v1, v0, Lvn/q;->V:[Lvn/p;

    array-length v1, v1

    const/4 v5, -0x2

    move v6, v3

    move v8, v4

    move v7, v5

    :goto_7
    const/4 v9, 0x1

    const/4 v10, 0x2

    if-ge v6, v1, :cond_10

    iget-object v11, v0, Lvn/q;->V:[Lvn/p;

    aget-object v11, v11, v6

    invoke-virtual {v11}, Lsn/q0;->o()Lrm/c0;

    move-result-object v11

    invoke-static {v11}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v11, v11, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v11}, Llo/m;->j(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_b

    move v9, v10

    goto :goto_8

    :cond_b
    invoke-static {v11}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    goto :goto_8

    :cond_c
    invoke-static {v11}, Llo/m;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_d

    move v9, v2

    goto :goto_8

    :cond_d
    move v9, v5

    :goto_8
    invoke-static {v9}, Lvn/q;->B(I)I

    move-result v10

    invoke-static {v7}, Lvn/q;->B(I)I

    move-result v11

    if-le v10, v11, :cond_e

    move v8, v6

    move v7, v9

    goto :goto_9

    :cond_e
    if-ne v9, v7, :cond_f

    if-eq v8, v4, :cond_f

    move v8, v4

    :cond_f
    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_10
    iget-object v2, v0, Lvn/q;->z:Lvn/h;

    iget-object v2, v2, Lvn/h;->h:Lsn/w0;

    iget v5, v2, Lsn/w0;->w:I

    iput v4, v0, Lvn/q;->l0:I

    new-array v4, v1, [I

    iput-object v4, v0, Lvn/q;->k0:[I

    move v4, v3

    :goto_a
    if-ge v4, v1, :cond_11

    iget-object v6, v0, Lvn/q;->k0:[I

    aput v4, v6, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_11
    new-array v4, v1, [Lsn/w0;

    move v6, v3

    :goto_b
    if-ge v6, v1, :cond_18

    iget-object v11, v0, Lvn/q;->V:[Lvn/p;

    aget-object v11, v11, v6

    invoke-virtual {v11}, Lsn/q0;->o()Lrm/c0;

    move-result-object v11

    invoke-static {v11}, Llo/a;->j(Ljava/lang/Object;)V

    iget-object v12, v0, Lvn/q;->w:Ljava/lang/String;

    iget-object v13, v0, Lvn/q;->F:Lrm/c0;

    if-ne v6, v8, :cond_15

    new-array v14, v5, [Lrm/c0;

    move v15, v3

    :goto_c
    if-ge v15, v5, :cond_14

    iget-object v3, v2, Lsn/w0;->y:[Lrm/c0;

    aget-object v3, v3, v15

    if-ne v7, v9, :cond_12

    if-eqz v13, :cond_12

    invoke-virtual {v3, v13}, Lrm/c0;->c(Lrm/c0;)Lrm/c0;

    move-result-object v3

    :cond_12
    if-ne v5, v9, :cond_13

    invoke-virtual {v11, v3}, Lrm/c0;->c(Lrm/c0;)Lrm/c0;

    move-result-object v3

    goto :goto_d

    :cond_13
    invoke-static {v3, v11, v9}, Lvn/q;->y(Lrm/c0;Lrm/c0;Z)Lrm/c0;

    move-result-object v3

    :goto_d
    aput-object v3, v14, v15

    add-int/lit8 v15, v15, 0x1

    const/4 v3, 0x0

    goto :goto_c

    :cond_14
    new-instance v3, Lsn/w0;

    invoke-direct {v3, v12, v14}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    aput-object v3, v4, v6

    iput v6, v0, Lvn/q;->l0:I

    const/4 v14, 0x0

    goto :goto_10

    :cond_15
    if-ne v7, v10, :cond_16

    iget-object v3, v11, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v3}, Llo/m;->h(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_e

    :cond_16
    const/4 v13, 0x0

    :goto_e
    if-ge v6, v8, :cond_17

    move v3, v6

    goto :goto_f

    :cond_17
    add-int/lit8 v3, v6, -0x1

    :goto_f
    const/16 v14, 0x12

    invoke-static {v14, v12}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v14}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, ":muxed:"

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lsn/w0;

    const/4 v14, 0x0

    invoke-static {v13, v11, v14}, Lvn/q;->y(Lrm/c0;Lrm/c0;Z)Lrm/c0;

    move-result-object v11

    filled-new-array {v11}, [Lrm/c0;

    move-result-object v11

    invoke-direct {v12, v3, v11}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    aput-object v12, v4, v6

    :goto_10
    add-int/lit8 v6, v6, 0x1

    move v3, v14

    goto :goto_b

    :cond_18
    move v14, v3

    invoke-virtual {v0, v4}, Lvn/q;->w([Lsn/w0;)Lsn/x0;

    move-result-object v1

    iput-object v1, v0, Lvn/q;->i0:Lsn/x0;

    iget-object v1, v0, Lvn/q;->j0:Ljava/util/Set;

    if-nez v1, :cond_19

    move v3, v9

    goto :goto_11

    :cond_19
    move v3, v14

    :goto_11
    invoke-static {v3}, Llo/a;->i(Z)V

    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    iput-object v1, v0, Lvn/q;->j0:Ljava/util/Set;

    iput-boolean v9, v0, Lvn/q;->d0:Z

    iget-object v1, v0, Lvn/q;->y:Lvn/k;

    invoke-virtual {v1}, Lvn/k;->r()V

    :cond_1a
    :goto_12
    return-void
.end method

.method public final E()V
    .locals 4

    iget-object v0, p0, Lvn/q;->J:Lko/c0;

    iget-object v1, v0, Lko/c0;->c:Ljava/io/IOException;

    if-nez v1, :cond_8

    iget-object v0, v0, Lko/c0;->b:Lko/z;

    if-eqz v0, :cond_1

    iget v1, v0, Lko/z;->w:I

    iget-object v2, v0, Lko/z;->z:Ljava/io/IOException;

    if-eqz v2, :cond_1

    iget v0, v0, Lko/z;->E:I

    if-gt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    throw v2

    :cond_1
    :goto_0
    iget-object v0, p0, Lvn/q;->z:Lvn/h;

    iget-object v1, v0, Lvn/h;->n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    if-nez v1, :cond_7

    iget-object v1, v0, Lvn/h;->o:Landroid/net/Uri;

    if-eqz v1, :cond_6

    iget-boolean v2, v0, Lvn/h;->s:Z

    if-eqz v2, :cond_6

    iget-object v0, v0, Lvn/h;->g:Lwn/c;

    iget-object v0, v0, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn/b;

    iget-object v1, v0, Lwn/b;->x:Lko/c0;

    iget-object v2, v1, Lko/c0;->c:Ljava/io/IOException;

    if-nez v2, :cond_5

    iget-object v1, v1, Lko/c0;->b:Lko/z;

    if-eqz v1, :cond_3

    iget v2, v1, Lko/z;->w:I

    iget-object v3, v1, Lko/z;->z:Ljava/io/IOException;

    if-eqz v3, :cond_3

    iget v1, v1, Lko/z;->E:I

    if-gt v1, v2, :cond_2

    goto :goto_1

    :cond_2
    throw v3

    :cond_3
    :goto_1
    iget-object v0, v0, Lwn/b;->J:Ljava/io/IOException;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    throw v0

    :cond_5
    throw v2

    :cond_6
    :goto_2
    return-void

    :cond_7
    throw v1

    :cond_8
    throw v1
.end method

.method public final varargs F([Lsn/w0;[I)V
    .locals 5

    invoke-virtual {p0, p1}, Lvn/q;->w([Lsn/w0;)Lsn/x0;

    move-result-object p1

    iput-object p1, p0, Lvn/q;->i0:Lsn/x0;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lvn/q;->j0:Ljava/util/Set;

    array-length p1, p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_0

    aget v2, p2, v1

    iget-object v3, p0, Lvn/q;->j0:Ljava/util/Set;

    iget-object v4, p0, Lvn/q;->i0:Lsn/x0;

    invoke-virtual {v4, v2}, Lsn/x0;->a(I)Lsn/w0;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lvn/q;->l0:I

    new-instance p1, Llr/e;

    const/16 p2, 0x17

    iget-object v0, p0, Lvn/q;->y:Lvn/k;

    invoke-direct {p1, v0, p2}, Llr/e;-><init>(Ljava/lang/Object;I)V

    iget-object p2, p0, Lvn/q;->R:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lvn/q;->d0:Z

    return-void
.end method

.method public final G()V
    .locals 6

    iget-object v0, p0, Lvn/q;->V:[Lvn/p;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, v0, v3

    iget-boolean v5, p0, Lvn/q;->r0:Z

    invoke-virtual {v4, v5}, Lsn/q0;->u(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput-boolean v2, p0, Lvn/q;->r0:Z

    return-void
.end method

.method public final H(JZ)Z
    .locals 4

    iput-wide p1, p0, Lvn/q;->p0:J

    invoke-virtual {p0}, Lvn/q;->C()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lvn/q;->q0:J

    return v1

    :cond_0
    iget-boolean v0, p0, Lvn/q;->c0:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    if-nez p3, :cond_3

    iget-object p3, p0, Lvn/q;->V:[Lvn/p;

    array-length p3, p3

    move v0, v2

    :goto_0
    if-ge v0, p3, :cond_2

    iget-object v3, p0, Lvn/q;->V:[Lvn/p;

    aget-object v3, v3, v0

    invoke-virtual {v3, p1, p2, v2}, Lsn/q0;->v(JZ)Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lvn/q;->o0:[Z

    aget-boolean v3, v3, v0

    if-nez v3, :cond_3

    iget-boolean v3, p0, Lvn/q;->m0:Z

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    :goto_1
    iput-wide p1, p0, Lvn/q;->q0:J

    iput-boolean v2, p0, Lvn/q;->t0:Z

    iget-object p1, p0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lvn/q;->J:Lko/c0;

    invoke-virtual {p1}, Lko/c0;->b()Z

    move-result p2

    if-eqz p2, :cond_5

    iget-boolean p2, p0, Lvn/q;->c0:Z

    if-eqz p2, :cond_4

    iget-object p2, p0, Lvn/q;->V:[Lvn/p;

    array-length p3, p2

    :goto_2
    if-ge v2, p3, :cond_4

    aget-object v0, p2, v2

    invoke-virtual {v0}, Lsn/q0;->g()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lko/c0;->a()V

    return v1

    :cond_5
    const/4 p2, 0x0

    iput-object p2, p1, Lko/c0;->c:Ljava/io/IOException;

    invoke-virtual {p0}, Lvn/q;->G()V

    return v1
.end method

.method public final a()Z
    .locals 1

    iget-object v0, p0, Lvn/q;->J:Lko/c0;

    invoke-virtual {v0}, Lko/c0;->b()Z

    move-result v0

    return v0
.end method

.method public final c(Lko/a0;)V
    .locals 12

    check-cast p1, Lun/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lvn/q;->U:Lun/a;

    instance-of v0, p1, Lvn/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lvn/e;

    iget-object v1, v0, Lvn/e;->j:[B

    iget-object v2, p0, Lvn/q;->z:Lvn/h;

    iput-object v1, v2, Lvn/h;->m:[B

    iget-object v1, v2, Lvn/h;->j:Lty/c;

    iget-object v2, v0, Lun/a;->b:Lko/n;

    iget-object v2, v2, Lko/n;->a:Landroid/net/Uri;

    iget-object v0, v0, Lvn/e;->l:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lty/c;->x:Ljava/lang/Object;

    check-cast v1, Lvn/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :cond_0
    new-instance v2, Lsn/m;

    iget-wide v0, p1, Lun/a;->a:J

    iget-object v0, p1, Lun/a;->i:Lko/i0;

    iget-object v0, v0, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lvn/q;->I:Lg73/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p1, Lun/a;->c:I

    iget-object v5, p1, Lun/a;->d:Lrm/c0;

    iget v6, p1, Lun/a;->e:I

    iget-object v7, p1, Lun/a;->f:Ljava/lang/Object;

    iget-wide v8, p1, Lun/a;->g:J

    iget-wide v10, p1, Lun/a;->h:J

    iget-object v1, p0, Lvn/q;->K:Lsn/z;

    iget v4, p0, Lvn/q;->x:I

    invoke-virtual/range {v1 .. v11}, Lsn/z;->e(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    iget-boolean p1, p0, Lvn/q;->d0:Z

    if-nez p1, :cond_1

    iget-wide v0, p0, Lvn/q;->p0:J

    invoke-virtual {p0, v0, v1}, Lvn/q;->u(J)Z

    return-void

    :cond_1
    iget-object p1, p0, Lvn/q;->y:Lvn/k;

    invoke-virtual {p1, p0}, Lvn/k;->c(Lsn/t0;)V

    return-void
.end method

.method public final d()J
    .locals 2

    invoke-virtual {p0}, Lvn/q;->C()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lvn/q;->q0:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lvn/q;->t0:Z

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_1
    invoke-virtual {p0}, Lvn/q;->A()Lvn/j;

    move-result-object v0

    iget-wide v0, v0, Lun/a;->h:J

    return-wide v0
.end method

.method public final g()V
    .locals 6

    iget-object v0, p0, Lvn/q;->V:[Lvn/p;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lsn/q0;->u(Z)V

    iget-object v4, v3, Lsn/q0;->h:Lty/c;

    if-eqz v4, :cond_0

    iget-object v5, v3, Lsn/q0;->e:Lsn/z;

    invoke-virtual {v4, v5}, Lty/c;->u(Lsn/z;)V

    const/4 v4, 0x0

    iput-object v4, v3, Lsn/q0;->h:Lty/c;

    iput-object v4, v3, Lsn/q0;->g:Lrm/c0;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final l()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvn/q;->u0:Z

    iget-object v0, p0, Lvn/q;->R:Landroid/os/Handler;

    iget-object v1, p0, Lvn/q;->Q:Lvn/n;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final m()J
    .locals 8

    iget-object v0, p0, Lvn/q;->N:Ljava/util/ArrayList;

    iget-boolean v1, p0, Lvn/q;->t0:Z

    if-eqz v1, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    return-wide v0

    :cond_0
    invoke-virtual {p0}, Lvn/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v0, p0, Lvn/q;->q0:J

    return-wide v0

    :cond_1
    iget-wide v1, p0, Lvn/q;->p0:J

    invoke-virtual {p0}, Lvn/q;->A()Lvn/j;

    move-result-object v3

    iget-boolean v4, v3, Lvn/j;->H:Z

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_3

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lvn/j;

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_4

    iget-wide v3, v3, Lun/a;->h:J

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    :cond_4
    iget-boolean v0, p0, Lvn/q;->c0:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lvn/q;->V:[Lvn/p;

    array-length v3, v0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_5

    aget-object v5, v0, v4

    monitor-enter v5

    :try_start_0
    iget-wide v6, v5, Lsn/q0;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v5

    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_5
    return-wide v1
.end method

.method public final n(J)V
    .locals 5

    iget-object v0, p0, Lvn/q;->J:Lko/c0;

    iget-object v1, v0, Lko/c0;->c:Ljava/io/IOException;

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lvn/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {v0}, Lko/c0;->b()Z

    move-result v1

    iget-object v2, p0, Lvn/q;->z:Lvn/h;

    iget-object v3, p0, Lvn/q;->O:Ljava/util/List;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lvn/q;->U:Lun/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lvn/q;->U:Lun/a;

    iget-object v4, v2, Lvn/h;->n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    if-eqz v4, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v2, v2, Lvn/h;->q:Lio/o;

    invoke-interface {v2, p1, p2, v1, v3}, Lio/o;->t(JLun/a;Ljava/util/List;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {v0}, Lko/c0;->a()V

    return-void

    :cond_3
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    :goto_1
    const/4 v1, 0x2

    if-lez v0, :cond_4

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvn/j;

    invoke-virtual {v2, v4}, Lvn/h;->b(Lvn/j;)I

    move-result v4

    if-ne v4, v1, :cond_4

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-ge v0, v4, :cond_5

    invoke-virtual {p0, v0}, Lvn/q;->z(I)V

    :cond_5
    iget-object v0, v2, Lvn/h;->n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    if-nez v0, :cond_7

    iget-object v0, v2, Lvn/h;->q:Lio/o;

    invoke-interface {v0}, Lio/o;->length()I

    move-result v0

    if-ge v0, v1, :cond_6

    goto :goto_2

    :cond_6
    iget-object v0, v2, Lvn/h;->q:Lio/o;

    invoke-interface {v0, p1, p2, v3}, Lio/o;->l(JLjava/util/List;)I

    move-result p1

    goto :goto_3

    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result p1

    :goto_3
    iget-object p2, p0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_8

    invoke-virtual {p0, p1}, Lvn/q;->z(I)V

    :cond_8
    :goto_4
    return-void
.end method

.method public final o(II)Lwm/s;
    .locals 10

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lvn/q;->y0:Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lvn/q;->X:Ljava/util/HashSet;

    iget-object v4, p0, Lvn/q;->Y:Landroid/util/SparseIntArray;

    const/4 v5, 0x0

    if-eqz v0, :cond_3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Llo/a;->e(Z)V

    const/4 v0, -0x1

    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvn/q;->W:[I

    aput p1, v0, v1

    :cond_1
    iget-object v0, p0, Lvn/q;->W:[I

    aget v0, v0, v1

    if-ne v0, p1, :cond_2

    iget-object v0, p0, Lvn/q;->V:[Lvn/p;

    aget-object v5, v0, v1

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Lvn/q;->t(II)Lwm/h;

    move-result-object v5

    goto :goto_1

    :cond_3
    move v0, v2

    :goto_0
    iget-object v1, p0, Lvn/q;->V:[Lvn/p;

    array-length v6, v1

    if-ge v0, v6, :cond_5

    iget-object v6, p0, Lvn/q;->W:[I

    aget v6, v6, v0

    if-ne v6, p1, :cond_4

    aget-object v5, v1, v0

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    if-nez v5, :cond_d

    iget-boolean v0, p0, Lvn/q;->u0:Z

    if-eqz v0, :cond_6

    invoke-static {p1, p2}, Lvn/q;->t(II)Lwm/h;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object v0, p0, Lvn/q;->V:[Lvn/p;

    array-length v0, v0

    const/4 v1, 0x1

    if-eq p2, v1, :cond_7

    const/4 v5, 0x2

    if-ne p2, v5, :cond_8

    :cond_7
    move v2, v1

    :cond_8
    new-instance v5, Lvn/p;

    iget-object v6, p0, Lvn/q;->H:Lsn/z;

    iget-object v7, p0, Lvn/q;->T:Ljava/util/Map;

    iget-object v8, p0, Lvn/q;->E:Lko/o;

    iget-object v9, p0, Lvn/q;->G:Lvm/h;

    invoke-direct {v5, v8, v9, v6, v7}, Lvn/p;-><init>(Lko/o;Lvm/h;Lsn/z;Ljava/util/Map;)V

    iget-wide v6, p0, Lvn/q;->p0:J

    iput-wide v6, v5, Lsn/q0;->t:J

    if-eqz v2, :cond_9

    iget-object v6, p0, Lvn/q;->w0:Lvm/c;

    iput-object v6, v5, Lvn/p;->I:Lvm/c;

    iput-boolean v1, v5, Lsn/q0;->z:Z

    :cond_9
    iget-wide v6, p0, Lvn/q;->v0:J

    iget-wide v8, v5, Lsn/q0;->F:J

    cmp-long v8, v8, v6

    if-eqz v8, :cond_a

    iput-wide v6, v5, Lsn/q0;->F:J

    iput-boolean v1, v5, Lsn/q0;->z:Z

    :cond_a
    iget-object v6, p0, Lvn/q;->x0:Lvn/j;

    if-eqz v6, :cond_b

    iget v6, v6, Lvn/j;->k:I

    iput v6, v5, Lsn/q0;->C:I

    :cond_b
    iput-object p0, v5, Lsn/q0;->f:Ljava/lang/Object;

    iget-object v6, p0, Lvn/q;->W:[I

    add-int/lit8 v7, v0, 0x1

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v6

    iput-object v6, p0, Lvn/q;->W:[I

    aput p1, v6, v0

    iget-object p1, p0, Lvn/q;->V:[Lvn/p;

    sget v6, Llo/y;->a:I

    array-length v6, p1

    add-int/2addr v6, v1

    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    array-length p1, p1

    aput-object v5, v1, p1

    check-cast v1, [Lvn/p;

    iput-object v1, p0, Lvn/q;->V:[Lvn/p;

    iget-object p1, p0, Lvn/q;->o0:[Z

    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lvn/q;->o0:[Z

    aput-boolean v2, p1, v0

    iget-boolean p1, p0, Lvn/q;->m0:Z

    or-int/2addr p1, v2

    iput-boolean p1, p0, Lvn/q;->m0:Z

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    invoke-static {p2}, Lvn/q;->B(I)I

    move-result p1

    iget v1, p0, Lvn/q;->a0:I

    invoke-static {v1}, Lvn/q;->B(I)I

    move-result v1

    if-le p1, v1, :cond_c

    iput v0, p0, Lvn/q;->b0:I

    iput p2, p0, Lvn/q;->a0:I

    :cond_c
    iget-object p1, p0, Lvn/q;->n0:[Z

    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object p1

    iput-object p1, p0, Lvn/q;->n0:[Z

    :cond_d
    const/4 p1, 0x5

    if-ne p2, p1, :cond_f

    iget-object p1, p0, Lvn/q;->Z:Lvn/o;

    if-nez p1, :cond_e

    new-instance p1, Lvn/o;

    iget p2, p0, Lvn/q;->L:I

    invoke-direct {p1, v5, p2}, Lvn/o;-><init>(Lwm/s;I)V

    iput-object p1, p0, Lvn/q;->Z:Lvn/o;

    :cond_e
    iget-object p1, p0, Lvn/q;->Z:Lvn/o;

    return-object p1

    :cond_f
    return-object v5
.end method

.method public final p(Lko/a0;Z)V
    .locals 12

    check-cast p1, Lun/a;

    const/4 v0, 0x0

    iput-object v0, p0, Lvn/q;->U:Lun/a;

    new-instance v2, Lsn/m;

    iget-wide v0, p1, Lun/a;->a:J

    iget-object v0, p1, Lun/a;->i:Lko/i0;

    iget-object v0, v0, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lvn/q;->I:Lg73/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, p1, Lun/a;->c:I

    iget-object v5, p1, Lun/a;->d:Lrm/c0;

    iget v6, p1, Lun/a;->e:I

    iget-object v7, p1, Lun/a;->f:Ljava/lang/Object;

    iget-wide v8, p1, Lun/a;->g:J

    iget-wide v10, p1, Lun/a;->h:J

    iget-object v1, p0, Lvn/q;->K:Lsn/z;

    iget v4, p0, Lvn/q;->x:I

    invoke-virtual/range {v1 .. v11}, Lsn/z;->c(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    if-nez p2, :cond_2

    invoke-virtual {p0}, Lvn/q;->C()Z

    move-result p1

    if-nez p1, :cond_0

    iget p1, p0, Lvn/q;->e0:I

    if-nez p1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lvn/q;->G()V

    :cond_1
    iget p1, p0, Lvn/q;->e0:I

    if-lez p1, :cond_2

    iget-object p1, p0, Lvn/q;->y:Lvn/k;

    invoke-virtual {p1, p0}, Lvn/k;->c(Lsn/t0;)V

    :cond_2
    return-void
.end method

.method public final q(Lko/a0;Ljava/io/IOException;I)Lbb/f;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v12, p2

    move-object/from16 v1, p1

    check-cast v1, Lun/a;

    instance-of v2, v1, Lvn/j;

    if-eqz v2, :cond_1

    move-object v3, v1

    check-cast v3, Lvn/j;

    iget-boolean v3, v3, Lvn/j;->K:Z

    if-nez v3, :cond_1

    instance-of v3, v12, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    if-eqz v3, :cond_1

    move-object v3, v12

    check-cast v3, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;

    iget v3, v3, Lcom/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException;->y:I

    const/16 v4, 0x19a

    if-eq v3, v4, :cond_0

    const/16 v4, 0x194

    if-ne v3, v4, :cond_1

    :cond_0
    sget-object v1, Lko/c0;->d:Lbb/f;

    return-object v1

    :cond_1
    iget-object v3, v1, Lun/a;->i:Lko/i0;

    iget-wide v3, v3, Lko/i0;->x:J

    move v5, v2

    new-instance v2, Lsn/m;

    iget-object v6, v1, Lun/a;->i:Lko/i0;

    iget-object v6, v6, Lko/i0;->y:Landroid/net/Uri;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-wide v6, v1, Lun/a;->g:J

    invoke-static {v6, v7}, Llo/y;->G(J)J

    iget-wide v6, v1, Lun/a;->h:J

    invoke-static {v6, v7}, Llo/y;->G(J)J

    new-instance v6, Lai/j;

    move/from16 v7, p3

    invoke-direct {v6, v12, v7}, Lai/j;-><init>(Ljava/lang/Object;I)V

    iget-object v7, v0, Lvn/q;->z:Lvn/h;

    iget-object v8, v7, Lvn/h;->q:Lio/o;

    invoke-static {v8}, Lkotlin/jvm/internal/j;->z(Lio/o;)Lc9/k;

    move-result-object v8

    iget-object v9, v0, Lvn/q;->I:Lg73/d;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8, v6}, Lg73/d;->g(Lc9/k;Lai/j;)Lbb/f;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_2

    iget v10, v8, Lbb/f;->a:I

    const/4 v11, 0x2

    if-ne v10, v11, :cond_2

    iget-wide v10, v8, Lbb/f;->b:J

    iget-object v8, v7, Lvn/h;->q:Lio/o;

    iget-object v7, v7, Lvn/h;->h:Lsn/w0;

    iget-object v13, v1, Lun/a;->d:Lrm/c0;

    invoke-virtual {v7, v13}, Lsn/w0;->a(Lrm/c0;)I

    move-result v7

    invoke-interface {v8, v7}, Lio/o;->i(I)I

    move-result v7

    invoke-interface {v8, v7, v10, v11}, Lio/o;->r(IJ)Z

    move-result v7

    move v14, v7

    goto :goto_0

    :cond_2
    move v14, v9

    :goto_0
    const/4 v7, 0x1

    if-eqz v14, :cond_6

    if-eqz v5, :cond_5

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-nez v3, :cond_5

    iget-object v3, v0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v7

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvn/j;

    if-ne v4, v1, :cond_3

    move v4, v7

    goto :goto_1

    :cond_3
    move v4, v9

    :goto_1
    invoke-static {v4}, Llo/a;->i(Z)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    iget-wide v3, v0, Lvn/q;->p0:J

    iput-wide v3, v0, Lvn/q;->q0:J

    goto :goto_2

    :cond_4
    invoke-static {v3}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvn/j;

    iput-boolean v7, v3, Lvn/j;->J:Z

    :cond_5
    :goto_2
    sget-object v3, Lko/c0;->e:Lbb/f;

    :goto_3
    move-object v15, v3

    goto :goto_4

    :cond_6
    invoke-static {v6}, Lg73/d;->i(Lai/j;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    if-eqz v5, :cond_7

    new-instance v5, Lbb/f;

    const/4 v6, 0x0

    invoke-direct {v5, v9, v3, v4, v6}, Lbb/f;-><init>(IJB)V

    move-object v3, v5

    goto :goto_3

    :cond_7
    sget-object v3, Lko/c0;->f:Lbb/f;

    goto :goto_3

    :goto_4
    iget v3, v15, Lbb/f;->a:I

    if-eqz v3, :cond_9

    if-ne v3, v7, :cond_8

    goto :goto_5

    :cond_8
    move/from16 v16, v9

    goto :goto_6

    :cond_9
    :goto_5
    move/from16 v16, v7

    :goto_6
    xor-int/lit8 v13, v16, 0x1

    iget v3, v1, Lun/a;->c:I

    iget-object v5, v1, Lun/a;->d:Lrm/c0;

    iget v6, v1, Lun/a;->e:I

    iget-object v7, v1, Lun/a;->f:Ljava/lang/Object;

    iget-wide v8, v1, Lun/a;->g:J

    iget-wide v10, v1, Lun/a;->h:J

    iget-object v1, v0, Lvn/q;->K:Lsn/z;

    iget v4, v0, Lvn/q;->x:I

    invoke-virtual/range {v1 .. v13}, Lsn/z;->g(Lsn/m;IILrm/c0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    if-nez v16, :cond_a

    const/4 v1, 0x0

    iput-object v1, v0, Lvn/q;->U:Lun/a;

    :cond_a
    if-eqz v14, :cond_c

    iget-boolean v1, v0, Lvn/q;->d0:Z

    if-nez v1, :cond_b

    iget-wide v1, v0, Lvn/q;->p0:J

    invoke-virtual {v0, v1, v2}, Lvn/q;->u(J)Z

    return-object v15

    :cond_b
    iget-object v1, v0, Lvn/q;->y:Lvn/k;

    invoke-virtual {v1, v0}, Lvn/k;->c(Lsn/t0;)V

    :cond_c
    return-object v15
.end method

.method public final r()V
    .locals 2

    iget-object v0, p0, Lvn/q;->R:Landroid/os/Handler;

    iget-object v1, p0, Lvn/q;->P:Lvn/n;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final s()V
    .locals 1

    iget-boolean v0, p0, Lvn/q;->d0:Z

    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Lvn/q;->i0:Lsn/x0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lvn/q;->j0:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final u(J)Z
    .locals 58

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lvn/q;->t0:Z

    const/4 v2, 0x0

    if-nez v1, :cond_3e

    iget-object v1, v0, Lvn/q;->J:Lko/c0;

    invoke-virtual {v1}, Lko/c0;->b()Z

    move-result v3

    if-nez v3, :cond_3e

    iget-object v3, v1, Lko/c0;->c:Ljava/io/IOException;

    if-eqz v3, :cond_0

    return v2

    :cond_0
    invoke-virtual {v0}, Lvn/q;->C()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iget-wide v4, v0, Lvn/q;->q0:J

    iget-object v6, v0, Lvn/q;->V:[Lvn/p;

    array-length v7, v6

    move v8, v2

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    iget-wide v10, v0, Lvn/q;->q0:J

    iput-wide v10, v9, Lsn/q0;->t:J

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    move-object v13, v3

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Lvn/q;->A()Lvn/j;

    move-result-object v3

    iget-boolean v4, v3, Lvn/j;->H:Z

    if-eqz v4, :cond_3

    iget-wide v3, v3, Lun/a;->h:J

    :goto_2
    move-wide v4, v3

    goto :goto_3

    :cond_3
    iget-wide v4, v0, Lvn/q;->p0:J

    iget-wide v6, v3, Lun/a;->g:J

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_2

    :goto_3
    iget-object v3, v0, Lvn/q;->O:Ljava/util/List;

    goto :goto_1

    :goto_4
    iget-object v15, v0, Lvn/q;->M:Lf1/p1;

    const/4 v3, 0x0

    iput-object v3, v15, Lf1/p1;->y:Ljava/lang/Object;

    iput-boolean v2, v15, Lf1/p1;->x:Z

    iput-object v3, v15, Lf1/p1;->z:Ljava/lang/Object;

    iget-boolean v6, v0, Lvn/q;->d0:Z

    if-nez v6, :cond_5

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_6

    :cond_4
    move/from16 v16, v2

    :goto_5
    move-object/from16 v17, v3

    goto :goto_7

    :cond_5
    :goto_6
    const/16 v16, 0x1

    goto :goto_5

    :goto_7
    iget-object v3, v0, Lvn/q;->z:Lvn/h;

    iget-object v6, v3, Lvn/h;->j:Lty/c;

    iget-object v8, v3, Lvn/h;->e:[Landroid/net/Uri;

    iget-object v9, v3, Lvn/h;->g:Lwn/c;

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_6

    move-object/from16 v10, v17

    goto :goto_8

    :cond_6
    invoke-static {v13}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lvn/j;

    :goto_8
    if-nez v10, :cond_7

    const/4 v12, -0x1

    goto :goto_9

    :cond_7
    iget-object v12, v3, Lvn/h;->h:Lsn/w0;

    iget-object v14, v10, Lun/a;->d:Lrm/c0;

    invoke-virtual {v12, v14}, Lsn/w0;->a(Lrm/c0;)I

    move-result v12

    :goto_9
    sub-long v18, v4, p1

    move-object/from16 v20, v8

    iget-wide v7, v3, Lvn/h;->r:J

    move-object/from16 v22, v3

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v23, v7, v2

    if-eqz v23, :cond_8

    sub-long v7, v7, p1

    goto :goto_a

    :cond_8
    move-wide v7, v2

    :goto_a
    move-wide/from16 v23, v2

    move-object/from16 v2, v22

    if-eqz v10, :cond_b

    iget-boolean v3, v2, Lvn/h;->p:Z

    if-nez v3, :cond_a

    move/from16 v22, v12

    iget-wide v11, v10, Lun/a;->h:J

    move-object/from16 v25, v15

    iget-wide v14, v10, Lun/a;->g:J

    sub-long/2addr v11, v14

    sub-long v14, v18, v11

    move-wide/from16 v27, v4

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v18

    cmp-long v14, v7, v23

    if-eqz v14, :cond_9

    sub-long/2addr v7, v11

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    :cond_9
    :goto_b
    move-wide v11, v7

    move-wide/from16 v3, v27

    goto :goto_c

    :cond_a
    move-wide/from16 v27, v4

    move/from16 v22, v12

    move-object/from16 v25, v15

    goto :goto_b

    :cond_b
    move-wide/from16 v27, v4

    move-object/from16 v25, v15

    move/from16 v22, v12

    goto :goto_b

    :goto_c
    invoke-virtual {v2, v10, v3, v4}, Lvn/h;->a(Lvn/j;J)[Lun/c;

    move-result-object v14

    move-object v7, v6

    iget-object v6, v2, Lvn/h;->q:Lio/o;

    move-wide/from16 v27, v3

    move-object v15, v9

    move-object v4, v10

    move-wide/from16 v9, v18

    move/from16 v5, v22

    const/4 v3, -0x1

    move-object/from16 v18, v7

    move-wide/from16 v7, p1

    invoke-interface/range {v6 .. v14}, Lio/o;->q(JJJLjava/util/List;[Lun/c;)V

    iget-object v6, v2, Lvn/h;->q:Lio/o;

    invoke-interface {v6}, Lio/o;->m()I

    move-result v12

    if-eq v5, v12, :cond_c

    const/4 v7, 0x1

    goto :goto_d

    :cond_c
    const/4 v7, 0x0

    :goto_d
    aget-object v11, v20, v12

    invoke-virtual {v15, v11}, Lwn/c;->d(Landroid/net/Uri;)Z

    move-result v6

    if-nez v6, :cond_d

    move-object/from16 v13, v25

    iput-object v11, v13, Lf1/p1;->z:Ljava/lang/Object;

    iget-boolean v3, v2, Lvn/h;->s:Z

    iget-object v4, v2, Lvn/h;->o:Landroid/net/Uri;

    invoke-virtual {v11, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    and-int/2addr v3, v4

    iput-boolean v3, v2, Lvn/h;->s:Z

    iput-object v11, v2, Lvn/h;->o:Landroid/net/Uri;

    :goto_e
    move-object v15, v1

    goto/16 :goto_30

    :cond_d
    move-object/from16 v13, v25

    const/4 v14, 0x1

    invoke-virtual {v15, v14, v11}, Lwn/c;->a(ZLandroid/net/Uri;)Lwn/j;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v8, v6, Lwn/j;->h:J

    iget-boolean v10, v6, Lwn/n;->c:Z

    iput-boolean v10, v2, Lvn/h;->p:Z

    iget-boolean v10, v6, Lwn/j;->o:Z

    if-eqz v10, :cond_e

    move-object v10, v4

    move-wide/from16 v3, v23

    goto :goto_f

    :cond_e
    move-object v10, v4

    iget-wide v3, v6, Lwn/j;->u:J

    add-long/2addr v3, v8

    move-wide/from16 p1, v3

    iget-wide v3, v15, Lwn/c;->N:J

    sub-long v3, p1, v3

    :goto_f
    iput-wide v3, v2, Lvn/h;->r:J

    iget-wide v3, v15, Lwn/c;->N:J

    sub-long/2addr v8, v3

    move-object v3, v2

    move/from16 v22, v5

    move v5, v7

    move-wide v7, v8

    move-object v4, v10

    move-object/from16 p1, v11

    move/from16 p2, v12

    move-object/from16 v2, v17

    move-wide/from16 v9, v27

    const/4 v14, -0x1

    invoke-virtual/range {v3 .. v10}, Lvn/h;->c(Lvn/j;ZLwn/j;JJ)Landroid/util/Pair;

    move-result-object v11

    iget-object v12, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    move-object v12, v3

    iget-wide v2, v6, Lwn/j;->k:J

    cmp-long v2, v27, v2

    if-gez v2, :cond_f

    if-eqz v4, :cond_f

    if-eqz v5, :cond_f

    aget-object v11, v20, v22

    const/4 v2, 0x1

    invoke-virtual {v15, v2, v11}, Lwn/c;->a(ZLandroid/net/Uri;)Lwn/j;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v2, v6, Lwn/j;->h:J

    iget-wide v7, v15, Lwn/c;->N:J

    sub-long v7, v2, v7

    const/4 v5, 0x0

    move-object v3, v12

    invoke-virtual/range {v3 .. v10}, Lvn/h;->c(Lvn/j;ZLwn/j;JJ)Landroid/util/Pair;

    move-result-object v2

    iget-object v5, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v27

    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move/from16 v12, v22

    :goto_10
    move-wide v8, v7

    move-wide/from16 v14, v27

    goto :goto_11

    :cond_f
    move-object v3, v12

    move/from16 v12, p2

    move v2, v11

    move-object/from16 v11, p1

    goto :goto_10

    :goto_11
    iget-object v7, v6, Lwn/n;->a:Ljava/lang/String;

    iget-boolean v10, v6, Lwn/n;->c:Z

    move-wide/from16 p1, v8

    iget-wide v8, v6, Lwn/j;->k:J

    iget-object v5, v6, Lwn/j;->r:Lzr/g0;

    cmp-long v20, v14, v8

    if-gez v20, :cond_10

    new-instance v2, Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    invoke-direct {v2}, Lcom/google/android/exoplayer2/source/BehindLiveWindowException;-><init>()V

    iput-object v2, v3, Lvn/h;->n:Lcom/google/android/exoplayer2/source/BehindLiveWindowException;

    goto/16 :goto_e

    :cond_10
    move-wide/from16 v27, v8

    iget-object v8, v6, Lwn/j;->s:Lzr/g0;

    move/from16 v20, v10

    sub-long v9, v14, v27

    long-to-int v9, v9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v10

    const-wide/16 v29, 0x1

    if-ne v9, v10, :cond_13

    const/4 v10, -0x1

    if-eq v2, v10, :cond_11

    goto :goto_12

    :cond_11
    const/4 v2, 0x0

    :goto_12
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    if-ge v2, v9, :cond_12

    new-instance v9, Lvn/g;

    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/h;

    invoke-direct {v9, v8, v14, v15, v2}, Lvn/g;-><init>(Lwn/h;JI)V

    move-object v2, v9

    goto :goto_13

    :cond_12
    const/4 v2, 0x0

    goto :goto_13

    :cond_13
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwn/g;

    move/from16 v22, v9

    const/4 v9, -0x1

    if-ne v2, v9, :cond_14

    new-instance v2, Lvn/g;

    invoke-direct {v2, v10, v14, v15, v9}, Lvn/g;-><init>(Lwn/h;JI)V

    goto :goto_13

    :cond_14
    iget-object v9, v10, Lwn/g;->M:Lzr/g0;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    if-ge v2, v9, :cond_15

    new-instance v8, Lvn/g;

    iget-object v9, v10, Lwn/g;->M:Lzr/g0;

    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lwn/h;

    invoke-direct {v8, v9, v14, v15, v2}, Lvn/g;-><init>(Lwn/h;JI)V

    move-object v2, v8

    goto :goto_13

    :cond_15
    const/16 v26, 0x1

    add-int/lit8 v9, v22, 0x1

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v2

    if-ge v9, v2, :cond_16

    new-instance v2, Lvn/g;

    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/h;

    add-long v14, v14, v29

    const/4 v9, -0x1

    invoke-direct {v2, v8, v14, v15, v9}, Lvn/g;-><init>(Lwn/h;JI)V

    goto :goto_13

    :cond_16
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_12

    new-instance v2, Lvn/g;

    const/4 v9, 0x0

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/h;

    add-long v14, v14, v29

    invoke-direct {v2, v8, v14, v15, v9}, Lvn/g;-><init>(Lwn/h;JI)V

    :goto_13
    if-nez v2, :cond_1a

    iget-boolean v2, v6, Lwn/j;->o:Z

    if-nez v2, :cond_17

    iput-object v11, v13, Lf1/p1;->z:Ljava/lang/Object;

    iget-boolean v2, v3, Lvn/h;->s:Z

    iget-object v4, v3, Lvn/h;->o:Landroid/net/Uri;

    invoke-virtual {v11, v4}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v4

    and-int/2addr v2, v4

    iput-boolean v2, v3, Lvn/h;->s:Z

    iput-object v11, v3, Lvn/h;->o:Landroid/net/Uri;

    goto/16 :goto_e

    :cond_17
    if-nez v16, :cond_18

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_19

    :cond_18
    const/4 v14, 0x1

    goto :goto_14

    :cond_19
    new-instance v2, Lvn/g;

    invoke-static {v5}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lwn/h;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    int-to-long v9, v5

    add-long v9, v27, v9

    sub-long v9, v9, v29

    const/4 v14, -0x1

    invoke-direct {v2, v8, v9, v10, v14}, Lvn/g;-><init>(Lwn/h;JI)V

    goto :goto_15

    :goto_14
    iput-boolean v14, v13, Lf1/p1;->x:Z

    goto/16 :goto_e

    :cond_1a
    :goto_15
    iget-boolean v5, v2, Lvn/g;->d:Z

    iget-object v8, v2, Lvn/g;->a:Lwn/h;

    const/4 v9, 0x0

    iput-boolean v9, v3, Lvn/h;->s:Z

    const/4 v9, 0x0

    iput-object v9, v3, Lvn/h;->o:Landroid/net/Uri;

    iget-object v9, v8, Lwn/h;->x:Lwn/g;

    iget-wide v14, v8, Lwn/h;->E:J

    if-eqz v9, :cond_1c

    iget-object v9, v9, Lwn/h;->G:Ljava/lang/String;

    if-nez v9, :cond_1b

    goto :goto_16

    :cond_1b
    invoke-static {v7, v9}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    goto :goto_17

    :cond_1c
    :goto_16
    const/4 v9, 0x0

    :goto_17
    invoke-virtual {v3, v9, v12}, Lvn/h;->d(Landroid/net/Uri;I)Lvn/e;

    move-result-object v10

    iput-object v10, v13, Lf1/p1;->y:Ljava/lang/Object;

    if-eqz v10, :cond_1d

    goto :goto_1f

    :cond_1d
    iget-object v10, v8, Lwn/h;->G:Ljava/lang/String;

    if-nez v10, :cond_1e

    const/4 v10, 0x0

    :goto_18
    move/from16 v16, v5

    goto :goto_19

    :cond_1e
    invoke-static {v7, v10}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    goto :goto_18

    :goto_19
    invoke-virtual {v3, v10, v12}, Lvn/h;->d(Landroid/net/Uri;I)Lvn/e;

    move-result-object v5

    iput-object v5, v13, Lf1/p1;->y:Ljava/lang/Object;

    if-eqz v5, :cond_1f

    goto :goto_1f

    :cond_1f
    if-nez v4, :cond_21

    sget-object v5, Lvn/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    :goto_1a
    move-wide/from16 v19, v14

    :cond_20
    const/16 v56, 0x0

    goto :goto_1e

    :cond_21
    iget-object v5, v4, Lvn/j;->m:Landroid/net/Uri;

    invoke-virtual {v11, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    iget-boolean v5, v4, Lvn/j;->H:Z

    if-eqz v5, :cond_22

    goto :goto_1a

    :cond_22
    add-long v27, p1, v14

    instance-of v5, v8, Lwn/e;

    if-eqz v5, :cond_25

    move-object v5, v8

    check-cast v5, Lwn/e;

    iget-boolean v5, v5, Lwn/e;->L:Z

    if-nez v5, :cond_24

    iget v5, v2, Lvn/g;->c:I

    if-nez v5, :cond_23

    if-eqz v20, :cond_23

    goto :goto_1b

    :cond_23
    const/16 v20, 0x0

    goto :goto_1c

    :cond_24
    :goto_1b
    const/16 v20, 0x1

    :cond_25
    :goto_1c
    if-eqz v20, :cond_26

    move-wide/from16 v19, v14

    iget-wide v14, v4, Lun/a;->h:J

    cmp-long v5, v27, v14

    if-gez v5, :cond_20

    goto :goto_1d

    :cond_26
    move-wide/from16 v19, v14

    :goto_1d
    const/16 v56, 0x1

    :goto_1e
    if-eqz v56, :cond_27

    if-eqz v16, :cond_27

    :goto_1f
    goto/16 :goto_e

    :cond_27
    iget-object v5, v3, Lvn/h;->a:Lvn/i;

    iget-object v14, v3, Lvn/h;->b:Lko/l;

    iget-object v15, v3, Lvn/h;->f:[Lrm/c0;

    aget-object v31, v15, v12

    iget-object v12, v3, Lvn/h;->i:Ljava/util/List;

    iget-object v15, v3, Lvn/h;->q:Lio/o;

    invoke-interface {v15}, Lio/o;->o()I

    move-result v38

    iget-object v15, v3, Lvn/h;->q:Lio/o;

    invoke-interface {v15}, Lio/o;->g()Ljava/lang/Object;

    move-result-object v39

    iget-boolean v15, v3, Lvn/h;->l:Z

    move-object/from16 v28, v5

    iget-object v5, v3, Lvn/h;->d:Lty/c;

    if-nez v10, :cond_28

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v37, v12

    move/from16 v50, v15

    move-object/from16 v12, v18

    const/4 v10, 0x0

    goto :goto_20

    :cond_28
    move-object/from16 v37, v12

    move/from16 v50, v15

    move-object/from16 v12, v18

    iget-object v15, v12, Lty/c;->x:Ljava/lang/Object;

    check-cast v15, Lvn/d;

    invoke-virtual {v15, v10}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, [B

    :goto_20
    if-nez v9, :cond_29

    const/4 v9, 0x0

    goto :goto_21

    :cond_29
    iget-object v12, v12, Lty/c;->x:Ljava/lang/Object;

    check-cast v12, Lvn/d;

    invoke-virtual {v12, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    :goto_21
    iget-object v3, v3, Lvn/h;->k:Lsm/f;

    sget-object v12, Lvn/j;->L:Ljava/util/concurrent/atomic/AtomicInteger;

    sget-object v44, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iget-object v12, v8, Lwn/h;->w:Ljava/lang/String;

    invoke-static {v7, v12}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v12

    move-object v15, v1

    iget-wide v0, v8, Lwn/h;->I:J

    move-wide/from16 v45, v0

    iget-wide v0, v8, Lwn/h;->J:J

    if-eqz v16, :cond_2a

    const/16 v18, 0x8

    move/from16 v49, v18

    :goto_22
    move-wide/from16 v47, v0

    goto :goto_23

    :cond_2a
    const/16 v49, 0x0

    goto :goto_22

    :goto_23
    const-string v0, "The uri must be set."

    invoke-static {v12, v0}, Llo/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v30, Lko/n;

    const/16 v42, 0x1

    const/16 v43, 0x0

    move-object/from16 v41, v12

    move-object/from16 v40, v30

    invoke-direct/range {v40 .. v49}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    if-eqz v10, :cond_2b

    const/16 v32, 0x1

    goto :goto_24

    :cond_2b
    const/16 v32, 0x0

    :goto_24
    if-eqz v32, :cond_2c

    iget-object v0, v8, Lwn/h;->H:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lvn/j;->d(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_25

    :cond_2c
    const/4 v0, 0x0

    :goto_25
    if-eqz v10, :cond_2d

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lvn/a;

    invoke-direct {v1, v14, v10, v0}, Lvn/a;-><init>(Lko/l;[B[B)V

    move-object/from16 v29, v1

    goto :goto_26

    :cond_2d
    move-object/from16 v29, v14

    :goto_26
    iget-object v0, v8, Lwn/h;->x:Lwn/g;

    if-eqz v0, :cond_31

    if-eqz v9, :cond_2e

    const/4 v1, 0x1

    goto :goto_27

    :cond_2e
    const/4 v1, 0x0

    :goto_27
    if-eqz v1, :cond_2f

    iget-object v10, v0, Lwn/h;->H:Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10}, Lvn/j;->d(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_28

    :cond_2f
    const/4 v10, 0x0

    :goto_28
    iget-object v12, v0, Lwn/h;->w:Ljava/lang/String;

    invoke-static {v7, v12}, Llo/a;->C(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v41

    new-instance v40, Lko/n;

    move-object/from16 v25, v13

    iget-wide v12, v0, Lwn/h;->I:J

    move v7, v1

    iget-wide v0, v0, Lwn/h;->J:J

    const/16 v43, 0x0

    const/16 v49, 0x0

    const/16 v42, 0x1

    move-wide/from16 v47, v0

    move-wide/from16 v45, v12

    invoke-direct/range {v40 .. v49}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    if-eqz v9, :cond_30

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lvn/a;

    invoke-direct {v0, v14, v9, v10}, Lvn/a;-><init>(Lko/l;[B[B)V

    move-object v14, v0

    :cond_30
    move/from16 v35, v7

    move-object/from16 v33, v14

    move-object/from16 v0, v40

    goto :goto_29

    :cond_31
    move-object/from16 v25, v13

    const/4 v0, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    :goto_29
    add-long v40, p1, v19

    iget-wide v9, v8, Lwn/h;->y:J

    add-long v42, v40, v9

    iget v1, v6, Lwn/j;->j:I

    iget v6, v8, Lwn/h;->z:I

    add-int/2addr v1, v6

    if-eqz v4, :cond_36

    iget-object v6, v4, Lvn/j;->q:Lko/n;

    if-eq v0, v6, :cond_33

    if-eqz v0, :cond_32

    if-eqz v6, :cond_32

    iget-object v7, v0, Lko/n;->a:Landroid/net/Uri;

    iget-object v9, v6, Lko/n;->a:Landroid/net/Uri;

    invoke-virtual {v7, v9}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_32

    iget-wide v9, v0, Lko/n;->e:J

    iget-wide v6, v6, Lko/n;->e:J

    cmp-long v6, v9, v6

    if-nez v6, :cond_32

    goto :goto_2a

    :cond_32
    const/4 v7, 0x0

    goto :goto_2b

    :cond_33
    :goto_2a
    const/4 v7, 0x1

    :goto_2b
    iget-object v6, v4, Lvn/j;->m:Landroid/net/Uri;

    invoke-virtual {v11, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_34

    iget-boolean v6, v4, Lvn/j;->H:Z

    if-eqz v6, :cond_34

    const/4 v6, 0x1

    goto :goto_2c

    :cond_34
    const/4 v6, 0x0

    :goto_2c
    iget-object v9, v4, Lvn/j;->y:Lnn/h;

    iget-object v10, v4, Lvn/j;->z:Led3/a;

    if-eqz v7, :cond_35

    if-eqz v6, :cond_35

    iget-boolean v6, v4, Lvn/j;->J:Z

    if-nez v6, :cond_35

    iget v6, v4, Lvn/j;->l:I

    if-ne v6, v1, :cond_35

    iget-object v4, v4, Lvn/j;->C:Lvn/b;

    move-object/from16 v17, v4

    goto :goto_2d

    :cond_35
    const/16 v17, 0x0

    :goto_2d
    move-object/from16 v53, v17

    :goto_2e
    move-object/from16 v54, v9

    move-object/from16 v55, v10

    goto :goto_2f

    :cond_36
    new-instance v9, Lnn/h;

    const/4 v4, 0x0

    invoke-direct {v9, v4}, Lnn/h;-><init>(Lnn/g;)V

    new-instance v10, Led3/a;

    const/16 v6, 0xa

    invoke-direct {v10, v6}, Led3/a;-><init>(I)V

    move-object/from16 v53, v4

    goto :goto_2e

    :goto_2f
    new-instance v27, Lvn/j;

    iget-wide v6, v2, Lvn/g;->b:J

    iget v2, v2, Lvn/g;->c:I

    const/16 v26, 0x1

    xor-int/lit8 v47, v16, 0x1

    iget-boolean v4, v8, Lwn/h;->K:Z

    iget-object v5, v5, Lty/c;->x:Ljava/lang/Object;

    check-cast v5, Landroid/util/SparseArray;

    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Llo/x;

    if-nez v9, :cond_37

    new-instance v9, Llo/x;

    const-wide v12, 0x7ffffffffffffffeL

    invoke-direct {v9, v12, v13}, Llo/x;-><init>(J)V

    invoke-virtual {v5, v1, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_37
    move-object/from16 v51, v9

    iget-object v5, v8, Lwn/h;->F:Lvm/c;

    move-object/from16 v34, v0

    move/from16 v48, v1

    move/from16 v46, v2

    move-object/from16 v57, v3

    move/from16 v49, v4

    move-object/from16 v52, v5

    move-wide/from16 v44, v6

    move-object/from16 v36, v11

    invoke-direct/range {v27 .. v57}, Lvn/j;-><init>(Lvn/i;Lko/l;Lko/n;Lrm/c0;ZLko/l;Lko/n;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLlo/x;Lvm/c;Lvn/b;Lnn/h;Led3/a;ZLsm/f;)V

    move-object/from16 v13, v25

    move-object/from16 v0, v27

    iput-object v0, v13, Lf1/p1;->y:Ljava/lang/Object;

    :goto_30
    iget-boolean v0, v13, Lf1/p1;->x:Z

    iget-object v1, v13, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Lun/a;

    iget-object v2, v13, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v2, Landroid/net/Uri;

    if-eqz v0, :cond_38

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    iput-wide v3, v0, Lvn/q;->q0:J

    const/4 v14, 0x1

    iput-boolean v14, v0, Lvn/q;->t0:Z

    return v14

    :cond_38
    move-object/from16 v0, p0

    if-nez v1, :cond_3a

    if-eqz v2, :cond_39

    iget-object v1, v0, Lvn/q;->y:Lvn/k;

    iget-object v1, v1, Lvn/k;->x:Lwn/c;

    iget-object v1, v1, Lwn/c;->z:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwn/b;

    iget-object v2, v1, Lwn/b;->w:Landroid/net/Uri;

    invoke-virtual {v1, v2}, Lwn/b;->d(Landroid/net/Uri;)V

    const/16 v21, 0x0

    return v21

    :cond_39
    const/16 v21, 0x0

    goto/16 :goto_33

    :cond_3a
    instance-of v2, v1, Lvn/j;

    if-eqz v2, :cond_3d

    move-object v2, v1

    check-cast v2, Lvn/j;

    iput-object v2, v0, Lvn/q;->x0:Lvn/j;

    iget-object v3, v2, Lun/a;->d:Lrm/c0;

    iput-object v3, v0, Lvn/q;->f0:Lrm/c0;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v3, v0, Lvn/q;->q0:J

    iget-object v3, v0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v3

    iget-object v4, v0, Lvn/q;->V:[Lvn/p;

    array-length v5, v4

    const/4 v9, 0x0

    :goto_31
    if-ge v9, v5, :cond_3b

    aget-object v6, v4, v9

    iget v7, v6, Lsn/q0;->q:I

    iget v6, v6, Lsn/q0;->p:I

    add-int/2addr v7, v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v3, v6}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_31

    :cond_3b
    invoke-virtual {v3}, Lzr/d0;->f()Lzr/w0;

    move-result-object v3

    iput-object v0, v2, Lvn/j;->D:Lvn/q;

    iput-object v3, v2, Lvn/j;->I:Lzr/g0;

    iget-object v3, v0, Lvn/q;->V:[Lvn/p;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_32
    if-ge v5, v4, :cond_3d

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v7, v2, Lvn/j;->k:I

    iput v7, v6, Lsn/q0;->C:I

    iget-boolean v7, v2, Lvn/j;->n:Z

    if-eqz v7, :cond_3c

    const/4 v14, 0x1

    iput-boolean v14, v6, Lsn/q0;->G:Z

    :cond_3c
    add-int/lit8 v5, v5, 0x1

    goto :goto_32

    :cond_3d
    iput-object v1, v0, Lvn/q;->U:Lun/a;

    iget-object v2, v0, Lvn/q;->I:Lg73/d;

    iget v3, v1, Lun/a;->c:I

    invoke-virtual {v2, v3}, Lg73/d;->h(I)I

    move-result v2

    invoke-virtual {v15, v1, v0, v2}, Lko/c0;->d(Lko/a0;Lko/y;I)J

    new-instance v4, Lsn/m;

    iget-object v2, v1, Lun/a;->b:Lko/n;

    invoke-direct {v4, v2}, Lsn/m;-><init>(Lko/n;)V

    iget v5, v1, Lun/a;->c:I

    iget-object v7, v1, Lun/a;->d:Lrm/c0;

    iget v8, v1, Lun/a;->e:I

    iget-object v9, v1, Lun/a;->f:Ljava/lang/Object;

    iget-wide v10, v1, Lun/a;->g:J

    iget-wide v12, v1, Lun/a;->h:J

    iget-object v3, v0, Lvn/q;->K:Lsn/z;

    iget v6, v0, Lvn/q;->x:I

    invoke-virtual/range {v3 .. v13}, Lsn/z;->i(Lsn/m;IILrm/c0;ILjava/lang/Object;JJ)V

    const/16 v26, 0x1

    return v26

    :cond_3e
    move/from16 v21, v2

    :goto_33
    return v21
.end method

.method public final w([Lsn/w0;)Lsn/x0;
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget-object v2, p1, v1

    iget v3, v2, Lsn/w0;->w:I

    new-array v3, v3, [Lrm/c0;

    move v4, v0

    :goto_1
    iget v5, v2, Lsn/w0;->w:I

    if-ge v4, v5, :cond_0

    iget-object v5, v2, Lsn/w0;->y:[Lrm/c0;

    aget-object v5, v5, v4

    iget-object v6, p0, Lvn/q;->G:Lvm/h;

    invoke-interface {v6, v5}, Lvm/h;->b(Lrm/c0;)I

    move-result v6

    invoke-virtual {v5}, Lrm/c0;->a()Lrm/b0;

    move-result-object v5

    iput v6, v5, Lrm/b0;->D:I

    new-instance v6, Lrm/c0;

    invoke-direct {v6, v5}, Lrm/c0;-><init>(Lrm/b0;)V

    aput-object v6, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    new-instance v4, Lsn/w0;

    iget-object v2, v2, Lsn/w0;->x:Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Lsn/w0;-><init>(Ljava/lang/String;[Lrm/c0;)V

    aput-object v4, p1, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lsn/x0;

    invoke-direct {v0, p1}, Lsn/x0;-><init>([Lsn/w0;)V

    return-object v0
.end method

.method public final x(Lwm/p;)V
    .locals 0

    return-void
.end method

.method public final z(I)V
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lvn/q;->J:Lko/c0;

    invoke-virtual {v1}, Lko/c0;->b()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-static {v1}, Llo/a;->i(Z)V

    move/from16 v1, p1

    :goto_0
    iget-object v3, v0, Lvn/q;->N:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v6, -0x1

    if-ge v1, v4, :cond_3

    move v4, v1

    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ge v4, v7, :cond_1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvn/j;

    iget-boolean v7, v7, Lvn/j;->n:Z

    if-eqz v7, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvn/j;

    const/4 v7, 0x0

    :goto_2
    iget-object v8, v0, Lvn/q;->V:[Lvn/p;

    array-length v8, v8

    if-ge v7, v8, :cond_4

    invoke-virtual {v4, v7}, Lvn/j;->e(I)I

    move-result v8

    iget-object v9, v0, Lvn/q;->V:[Lvn/p;

    aget-object v9, v9, v7

    invoke-virtual {v9}, Lsn/q0;->l()I

    move-result v9

    if-le v9, v8, :cond_2

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    move v1, v6

    :cond_4
    if-ne v1, v6, :cond_5

    return-void

    :cond_5
    invoke-virtual {v0}, Lvn/q;->A()Lvn/j;

    move-result-object v4

    iget-wide v6, v4, Lun/a;->h:J

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvn/j;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    sget v9, Llo/y;->a:I

    if-ltz v1, :cond_f

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-gt v8, v9, :cond_f

    if-gt v1, v8, :cond_f

    if-eq v1, v8, :cond_6

    invoke-virtual {v3, v1, v8}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    :cond_6
    const/4 v1, 0x0

    :goto_4
    iget-object v8, v0, Lvn/q;->V:[Lvn/p;

    array-length v8, v8

    if-ge v1, v8, :cond_d

    invoke-virtual {v4, v1}, Lvn/j;->e(I)I

    move-result v8

    iget-object v9, v0, Lvn/q;->V:[Lvn/p;

    aget-object v9, v9, v1

    iget-object v10, v9, Lsn/q0;->a:Ll9/w0;

    invoke-virtual {v9, v8}, Lsn/q0;->h(I)J

    move-result-wide v8

    iget v11, v10, Ll9/w0;->b:I

    iget-wide v12, v10, Ll9/w0;->c:J

    cmp-long v12, v8, v12

    if-gtz v12, :cond_7

    move v12, v2

    goto :goto_5

    :cond_7
    const/4 v12, 0x0

    :goto_5
    invoke-static {v12}, Llo/a;->e(Z)V

    iput-wide v8, v10, Ll9/w0;->c:J

    const-wide/16 v12, 0x0

    cmp-long v12, v8, v12

    const/16 v13, 0x9

    if-eqz v12, :cond_8

    iget-object v12, v10, Ll9/w0;->f:Ljava/lang/Object;

    check-cast v12, Lai/h;

    iget-wide v14, v12, Lai/h;->x:J

    cmp-long v8, v8, v14

    if-nez v8, :cond_9

    :cond_8
    move-wide v15, v6

    goto :goto_7

    :cond_9
    :goto_6
    iget-wide v8, v10, Ll9/w0;->c:J

    iget-wide v14, v12, Lai/h;->y:J

    cmp-long v8, v8, v14

    if-lez v8, :cond_a

    iget-object v8, v12, Lai/h;->E:Ljava/lang/Object;

    move-object v12, v8

    check-cast v12, Lai/h;

    goto :goto_6

    :cond_a
    iget-object v8, v12, Lai/h;->E:Ljava/lang/Object;

    check-cast v8, Lai/h;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10, v8}, Ll9/w0;->b(Lai/h;)V

    new-instance v9, Lai/h;

    iget-wide v14, v12, Lai/h;->y:J

    invoke-direct {v9, v11, v14, v15, v13}, Lai/h;-><init>(IJI)V

    iput-object v9, v12, Lai/h;->E:Ljava/lang/Object;

    iget-wide v13, v10, Ll9/w0;->c:J

    move-wide v15, v6

    iget-wide v5, v12, Lai/h;->y:J

    cmp-long v5, v13, v5

    if-nez v5, :cond_b

    move-object v12, v9

    :cond_b
    iput-object v12, v10, Ll9/w0;->h:Ljava/lang/Object;

    iget-object v5, v10, Ll9/w0;->g:Ljava/lang/Object;

    check-cast v5, Lai/h;

    if-ne v5, v8, :cond_c

    iput-object v9, v10, Ll9/w0;->g:Ljava/lang/Object;

    goto :goto_8

    :goto_7
    iget-object v5, v10, Ll9/w0;->f:Ljava/lang/Object;

    check-cast v5, Lai/h;

    invoke-virtual {v10, v5}, Ll9/w0;->b(Lai/h;)V

    new-instance v5, Lai/h;

    iget-wide v6, v10, Ll9/w0;->c:J

    invoke-direct {v5, v11, v6, v7, v13}, Lai/h;-><init>(IJI)V

    iput-object v5, v10, Ll9/w0;->f:Ljava/lang/Object;

    iput-object v5, v10, Ll9/w0;->g:Ljava/lang/Object;

    iput-object v5, v10, Ll9/w0;->h:Ljava/lang/Object;

    :cond_c
    :goto_8
    add-int/lit8 v1, v1, 0x1

    move-wide v6, v15

    goto/16 :goto_4

    :cond_d
    move-wide v15, v6

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-wide v1, v0, Lvn/q;->p0:J

    iput-wide v1, v0, Lvn/q;->q0:J

    :goto_9
    const/4 v1, 0x0

    goto :goto_a

    :cond_e
    invoke-static {v3}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvn/j;

    iput-boolean v2, v1, Lvn/j;->J:Z

    goto :goto_9

    :goto_a
    iput-boolean v1, v0, Lvn/q;->t0:Z

    iget v7, v0, Lvn/q;->a0:I

    iget-wide v1, v4, Lun/a;->g:J

    new-instance v5, Ll9/y;

    iget-object v3, v0, Lvn/q;->K:Lsn/z;

    invoke-virtual {v3, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v11

    move-wide v1, v15

    invoke-virtual {v3, v1, v2}, Lsn/z;->a(J)J

    move-result-wide v13

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v14}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    invoke-virtual {v3, v5}, Lsn/z;->k(Ll9/y;)V

    return-void

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1
.end method
