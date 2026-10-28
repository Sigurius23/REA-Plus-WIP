.class public final Ltd3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;

.field public final c:Landroid/util/SparseArray;

.field public final d:Ljava/util/Map;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:[B


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/util/SparseArray;Ljava/util/HashMap;IILjava/lang/String;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd3/l;->b:Ljava/util/List;

    iput-object p2, p0, Ltd3/l;->c:Landroid/util/SparseArray;

    iput-object p3, p0, Ltd3/l;->d:Ljava/util/Map;

    iput-object p6, p0, Ltd3/l;->f:Ljava/lang/String;

    iput p4, p0, Ltd3/l;->a:I

    iput p5, p0, Ltd3/l;->e:I

    iput-object p7, p0, Ltd3/l;->g:[B

    return-void
.end method

.method public static a([B)Ltd3/l;
    .locals 17

    move-object/from16 v7, p0

    const/4 v0, 0x0

    if-nez v7, :cond_0

    return-object v0

    :cond_0
    const/4 v2, -0x1

    const/high16 v3, -0x80000000

    move-object v6, v0

    move v4, v2

    move v5, v3

    const/4 v8, 0x0

    move-object v2, v6

    move-object v3, v2

    :goto_0
    :try_start_0
    array-length v9, v7

    if-ge v8, v9, :cond_1

    add-int/lit8 v9, v8, 0x1

    aget-byte v10, v7, v8

    const/16 v11, 0xff

    and-int/2addr v10, v11

    if-nez v10, :cond_2

    :cond_1
    move-object v1, v0

    goto/16 :goto_5

    :cond_2
    add-int/lit8 v12, v10, -0x1

    add-int/lit8 v13, v8, 0x2

    aget-byte v9, v7, v9

    and-int/2addr v9, v11

    const/16 v14, 0x16

    const/16 v1, 0x20

    const/4 v15, 0x2

    if-eq v9, v14, :cond_6

    if-eq v9, v11, :cond_7

    if-eq v9, v1, :cond_6

    const/16 v8, 0x21

    if-eq v9, v8, :cond_6

    packed-switch v9, :pswitch_data_0

    :goto_1
    const/4 v8, 0x0

    goto/16 :goto_4

    :pswitch_0
    aget-byte v1, v7, v13

    move v5, v1

    goto :goto_1

    :pswitch_1
    new-instance v1, Ljava/lang/String;

    new-array v6, v12, [B

    const/4 v8, 0x0

    invoke-static {v7, v13, v6, v8, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {v1, v6}, Ljava/lang/String;-><init>([B)V

    move-object v6, v1

    goto :goto_1

    :pswitch_2
    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    const/16 v14, 0x10

    invoke-static {v7, v13, v12, v14, v0}, Ltd3/l;->b([BIIILjava/util/ArrayList;)V

    goto :goto_1

    :pswitch_3
    if-nez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    const/4 v8, 0x4

    invoke-static {v7, v13, v12, v8, v0}, Ltd3/l;->b([BIIILjava/util/ArrayList;)V

    goto :goto_1

    :pswitch_4
    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_5
    invoke-static {v7, v13, v12, v15, v0}, Ltd3/l;->b([BIIILjava/util/ArrayList;)V

    goto :goto_1

    :pswitch_5
    aget-byte v1, v7, v13

    and-int/2addr v1, v11

    move v4, v1

    goto :goto_1

    :cond_6
    const/16 v14, 0x10

    const/16 v16, 0x4

    goto :goto_2

    :cond_7
    add-int/lit8 v1, v8, 0x3

    aget-byte v1, v7, v1

    and-int/2addr v1, v11

    shl-int/lit8 v1, v1, 0x8

    aget-byte v9, v7, v13

    and-int/2addr v9, v11

    add-int/2addr v1, v9

    add-int/lit8 v8, v8, 0x4

    add-int/lit8 v10, v10, -0x3

    new-array v9, v10, [B

    const/4 v11, 0x0

    invoke-static {v7, v8, v9, v11, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-nez v2, :cond_8

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    :cond_8
    invoke-virtual {v2, v1, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    :goto_2
    if-ne v9, v1, :cond_9

    move/from16 v15, v16

    goto :goto_3

    :cond_9
    const/16 v8, 0x21

    if-ne v9, v8, :cond_a

    move v15, v14

    :cond_a
    :goto_3
    new-array v1, v15, [B

    const/4 v8, 0x0

    invoke-static {v7, v13, v1, v8, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Ltd3/g;->a([B)Landroid/os/ParcelUuid;

    move-result-object v1

    add-int v9, v13, v15

    sub-int v10, v12, v15

    new-array v11, v10, [B

    invoke-static {v7, v9, v11, v8, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-nez v3, :cond_b

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    :cond_b
    invoke-interface {v3, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_4
    add-int v1, v13, v12

    move v8, v1

    goto/16 :goto_0

    :goto_5
    new-instance v0, Ltd3/l;

    invoke-direct/range {v0 .. v7}, Ltd3/l;-><init>(Ljava/util/ArrayList;Landroid/util/SparseArray;Ljava/util/HashMap;IILjava/lang/String;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unable to parse scan record: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ScanRecord"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ltd3/l;

    const/high16 v5, -0x80000000

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object/from16 v7, p0

    invoke-direct/range {v0 .. v7}, Ltd3/l;-><init>(Ljava/util/ArrayList;Landroid/util/SparseArray;Ljava/util/HashMap;IILjava/lang/String;[B)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b([BIIILjava/util/ArrayList;)V
    .locals 2

    :goto_0
    if-lez p2, :cond_0

    new-array v0, p3, [B

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Ltd3/g;->a([B)Landroid/os/ParcelUuid;

    move-result-object v0

    invoke-interface {p4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sub-int/2addr p2, p3

    add-int/2addr p1, p3

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ltd3/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ltd3/l;

    iget-object v0, p0, Ltd3/l;->g:[B

    iget-object p1, p1, Ltd3/l;->g:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ScanRecord [advertiseFlags="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ltd3/l;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", serviceUuids="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/l;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", manufacturerSpecificData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    const-string v2, "="

    const-string v3, "{"

    const-string v4, "{}"

    const-string v5, "null"

    iget-object v6, p0, Ltd3/l;->c:Landroid/util/SparseArray;

    if-nez v6, :cond_0

    move-object v6, v5

    goto :goto_1

    :cond_0
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-nez v7, :cond_1

    move-object v6, v4

    goto :goto_1

    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v6}, Landroid/util/SparseArray;->size()I

    move-result v9

    if-ge v8, v9, :cond_2

    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [B

    invoke-static {v9}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_1
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", serviceData="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Ltd3/l;->d:Ljava/util/Map;

    if-nez v6, :cond_3

    move-object v4, v5

    goto :goto_3

    :cond_3
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    invoke-static {v5}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_3
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", txPowerLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ltd3/l;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", deviceName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ltd3/l;->f:Ljava/lang/String;

    const-string v2, "]"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
