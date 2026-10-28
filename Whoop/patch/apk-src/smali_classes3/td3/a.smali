.class public abstract Ltd3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public e:Z

.field public final f:Ljava/util/List;

.field public final g:Ltd3/n;

.field public final h:Ltd3/i;

.field public final i:Landroid/os/Handler;

.field public final j:Ljava/util/ArrayList;

.field public final k:Ljava/util/HashSet;

.field public final l:Ljava/util/HashMap;

.field public final m:Lbq/b;


# direct methods
.method public constructor <init>(ZZLjava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ltd3/a;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ltd3/a;->j:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ltd3/a;->k:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ltd3/a;->l:Ljava/util/HashMap;

    new-instance v0, Lbq/b;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ltd3/a;->m:Lbq/b;

    invoke-static {p3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ltd3/a;->f:Ljava/util/List;

    iput-object p4, p0, Ltd3/a;->g:Ltd3/n;

    iput-object p5, p0, Ltd3/a;->h:Ltd3/i;

    iput-object p6, p0, Ltd3/a;->i:Landroid/os/Handler;

    const/4 p5, 0x0

    iput-boolean p5, p0, Ltd3/a;->e:Z

    iget v0, p4, Ltd3/n;->z:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-boolean v0, p4, Ltd3/n;->J:Z

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, p5

    :goto_0
    iput-boolean v0, p0, Ltd3/a;->d:Z

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    if-eqz p2, :cond_1

    iget-boolean p2, p4, Ltd3/n;->H:Z

    if-nez p2, :cond_2

    :cond_1
    move p2, v1

    goto :goto_1

    :cond_2
    move p2, p5

    :goto_1
    iput-boolean p2, p0, Ltd3/a;->b:Z

    iget-wide p2, p4, Ltd3/n;->E:J

    const-wide/16 v2, 0x0

    cmp-long v0, p2, v2

    if-lez v0, :cond_4

    if-eqz p1, :cond_3

    iget-boolean p1, p4, Ltd3/n;->I:Z

    if-nez p1, :cond_4

    :cond_3
    move p5, v1

    :cond_4
    iput-boolean p5, p0, Ltd3/a;->c:Z

    if-eqz p5, :cond_5

    new-instance p1, Lds/s;

    const/16 p4, 0xe

    const/4 p5, 0x0

    invoke-direct {p1, p0, p6, p5, p4}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {p6, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void
.end method


# virtual methods
.method public final a(ILtd3/m;)V
    .locals 3

    iget-boolean v0, p0, Ltd3/a;->e:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Ltd3/a;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Ltd3/a;->c(Ltd3/m;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p2, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Ltd3/a;->d:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltd3/a;->l:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    iget-object p1, p0, Ltd3/a;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->isEmpty()Z

    move-result p1

    iget-object v2, p0, Ltd3/a;->l:Ljava/util/HashMap;

    invoke-virtual {v2, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd3/m;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    iget-object v0, p0, Ltd3/a;->g:Ltd3/n;

    iget v0, v0, Ltd3/n;->z:I

    const/4 v1, 0x2

    and-int/2addr v0, v1

    if-lez v0, :cond_1

    iget-object v0, p0, Ltd3/a;->h:Ltd3/i;

    invoke-virtual {v0, v1, p2}, Ltd3/i;->c(ILtd3/m;)V

    :cond_1
    if-eqz p1, :cond_5

    iget-object p1, p0, Ltd3/a;->g:Ltd3/n;

    iget p1, p1, Ltd3/n;->z:I

    and-int/lit8 p1, p1, 0x4

    if-lez p1, :cond_5

    iget-object p1, p0, Ltd3/a;->i:Landroid/os/Handler;

    iget-object p2, p0, Ltd3/a;->m:Lbq/b;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Ltd3/a;->i:Landroid/os/Handler;

    iget-object p2, p0, Ltd3/a;->m:Lbq/b;

    iget-object v0, p0, Ltd3/a;->g:Ltd3/n;

    iget-wide v0, v0, Ltd3/n;->L:J

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    iget-boolean v1, p0, Ltd3/a;->c:Z

    if-eqz v1, :cond_4

    iget-object v1, p0, Ltd3/a;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_2
    iget-object p1, p0, Ltd3/a;->k:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Ltd3/a;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ltd3/a;->k:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_4
    iget-object v0, p0, Ltd3/a;->h:Ltd3/i;

    invoke-virtual {v0, p1, p2}, Ltd3/i;->c(ILtd3/m;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final b(Ljava/util/ArrayList;)V
    .locals 3

    iget-boolean v0, p0, Ltd3/a;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ltd3/a;->b:Z

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltd3/m;

    invoke-virtual {p0, v1}, Ltd3/a;->c(Ltd3/m;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object p1, v0

    :cond_3
    iget-object v0, p0, Ltd3/a;->h:Ltd3/i;

    invoke-virtual {v0, p1}, Ltd3/i;->a(Ljava/util/List;)V

    return-void
.end method

.method public final c(Ltd3/m;)Z
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Ltd3/a;->f:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltd3/k;

    iget-object v5, v3, Ltd3/k;->F:[B

    iget-object v6, v3, Ltd3/k;->I:[B

    iget-object v7, v3, Ltd3/k;->y:Landroid/os/ParcelUuid;

    iget-object v8, v3, Ltd3/k;->w:Ljava/lang/String;

    const/4 v9, 0x1

    if-nez v1, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v10, v1, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    iget-object v11, v3, Ltd3/k;->x:Ljava/lang/String;

    if-eqz v11, :cond_2

    invoke-virtual {v10}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v10, v1, Ltd3/m;->x:Ltd3/l;

    if-nez v10, :cond_3

    if-nez v8, :cond_11

    if-nez v7, :cond_11

    if-nez v6, :cond_11

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    if-eqz v8, :cond_4

    iget-object v11, v10, Ltd3/l;->f:Ljava/lang/String;

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto/16 :goto_5

    :cond_4
    const/4 v8, 0x0

    if-eqz v7, :cond_c

    iget-object v11, v3, Ltd3/k;->z:Landroid/os/ParcelUuid;

    iget-object v12, v10, Ltd3/l;->b:Ljava/util/List;

    if-nez v12, :cond_6

    :cond_5
    move v7, v4

    goto :goto_2

    :cond_6
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/os/ParcelUuid;

    if-nez v11, :cond_8

    move-object v14, v8

    goto :goto_0

    :cond_8
    invoke-virtual {v11}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v14

    :goto_0
    invoke-virtual {v7}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v15

    invoke-virtual {v13}, Landroid/os/ParcelUuid;->getUuid()Ljava/util/UUID;

    move-result-object v13

    if-nez v14, :cond_9

    invoke-virtual {v15, v13}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v13

    goto :goto_1

    :cond_9
    invoke-virtual {v15}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v16

    invoke-virtual {v14}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v18

    and-long v16, v16, v18

    invoke-virtual {v13}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v18

    invoke-virtual {v14}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v20

    and-long v18, v18, v20

    cmp-long v16, v16, v18

    if-eqz v16, :cond_b

    :cond_a
    move v13, v4

    goto :goto_1

    :cond_b
    invoke-virtual {v15}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v15

    invoke-virtual {v14}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v17

    and-long v15, v15, v17

    invoke-virtual {v13}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v17

    invoke-virtual {v14}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v13

    and-long v13, v17, v13

    cmp-long v13, v15, v13

    if-nez v13, :cond_a

    move v13, v9

    :goto_1
    if-eqz v13, :cond_7

    move v7, v9

    :goto_2
    if-nez v7, :cond_c

    goto :goto_5

    :cond_c
    iget-object v7, v3, Ltd3/k;->E:Landroid/os/ParcelUuid;

    if-eqz v7, :cond_e

    if-eqz v10, :cond_e

    iget-object v11, v3, Ltd3/k;->G:[B

    iget-object v12, v10, Ltd3/l;->d:Ljava/util/Map;

    if-nez v12, :cond_d

    move-object v7, v8

    goto :goto_3

    :cond_d
    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, [B

    :goto_3
    invoke-static {v5, v11, v7}, Ltd3/k;->b([B[B[B)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_5

    :cond_e
    iget v5, v3, Ltd3/k;->H:I

    if-ltz v5, :cond_10

    if-eqz v10, :cond_10

    iget-object v3, v3, Ltd3/k;->J:[B

    iget-object v7, v10, Ltd3/l;->c:Landroid/util/SparseArray;

    if-nez v7, :cond_f

    goto :goto_4

    :cond_f
    invoke-virtual {v7, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, [B

    :goto_4
    invoke-static {v6, v3, v8}, Ltd3/k;->b([B[B[B)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_5

    :cond_10
    move v4, v9

    :cond_11
    :goto_5
    if-eqz v4, :cond_0

    return v9

    :cond_12
    return v4
.end method
