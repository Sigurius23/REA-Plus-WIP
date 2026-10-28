.class public final Lab/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt9/g;
.implements Lji/e;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lab/h0;->w:I

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    .line 143
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 144
    iput p1, p0, Lab/h0;->x:I

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 0

    iput p1, p0, Lab/h0;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x5

    .line 23
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 24
    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    return-void

    .line 25
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    return-void

    .line 27
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, La0/g;

    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p2}, La0/f1;-><init>(I)V

    .line 29
    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    iput p2, p0, Lab/h0;->x:I

    return-void

    .line 30
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [Lp0/h;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 32
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    return-void

    .line 33
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_3
        0xc -> :sswitch_2
        0x10 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lab/h0;->w:I

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    iput p3, p0, Lab/h0;->x:I

    if-nez p4, :cond_0

    .line 135
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 136
    :cond_0
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 137
    iput-object p5, p0, Lab/h0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILx8/s;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lab/h0;->w:I

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput p1, p0, Lab/h0;->x:I

    .line 96
    iput-object p2, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 97
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lab/h0;->w:I

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 140
    const-string p1, "_androidx_security_master_key_"

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILq83/j;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lab/h0;->w:I

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput p2, p0, Lab/h0;->x:I

    .line 100
    iput-object p3, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 101
    new-instance p2, Lal0/f;

    const/4 p3, 0x5

    invoke-direct {p2, p1, p3}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-static {p2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb3/j3;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lab/h0;->w:I

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lhi/a;Lfi/l;I)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lab/h0;->w:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 19
    iput-object p2, p0, Lab/h0;->z:Ljava/lang/Object;

    .line 20
    iput p3, p0, Lab/h0;->x:I

    if-lez p3, :cond_0

    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Li7/g;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lab/h0;->w:I

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 88
    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 89
    iput p1, p0, Lab/h0;->x:I

    return-void
.end method

.method public constructor <init>(Li93/j;Lp0/y;)V
    .locals 12

    const/16 v0, 0xd

    iput v0, p0, Lab/h0;->w:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    invoke-virtual {p2}, Lp0/y;->m()Lab/h0;

    move-result-object p2

    .line 36
    iget v0, p1, Li93/h;->w:I

    if-ltz v0, :cond_0

    goto :goto_0

    .line 37
    :cond_0
    const-string v1, "negative nearestRange.first"

    .line 38
    invoke-static {v1}, Lk0/a;->c(Ljava/lang/String;)V

    .line 39
    :goto_0
    iget p1, p1, Li93/h;->x:I

    .line 40
    iget v1, p2, Lab/h0;->x:I

    add-int/lit8 v1, v1, -0x1

    .line 41
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge p1, v0, :cond_1

    .line 42
    sget-object p1, La0/z0;->a:La0/m0;

    const-string p2, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 44
    new-array p2, p1, [Ljava/lang/Object;

    iput-object p2, p0, Lab/h0;->z:Ljava/lang/Object;

    .line 45
    iput p1, p0, Lab/h0;->x:I

    goto/16 :goto_6

    :cond_1
    sub-int v1, p1, v0

    add-int/lit8 v1, v1, 0x1

    .line 46
    new-array v2, v1, [Ljava/lang/Object;

    iput-object v2, p0, Lab/h0;->z:Ljava/lang/Object;

    .line 47
    iput v0, p0, Lab/h0;->x:I

    .line 48
    new-instance v2, La0/m0;

    invoke-direct {v2, v1}, La0/m0;-><init>(I)V

    .line 49
    iget-object v1, p2, Lab/h0;->y:Ljava/lang/Object;

    check-cast v1, Lr1/c;

    .line 50
    const-string v3, ", size "

    const-string v4, "Index "

    if-ltz v0, :cond_2

    .line 51
    iget v5, p2, Lab/h0;->x:I

    if-ge v0, v5, :cond_2

    goto :goto_1

    .line 52
    :cond_2
    invoke-static {v0, v4, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 53
    iget v6, p2, Lab/h0;->x:I

    .line 54
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lk0/a;->e(Ljava/lang/String;)V

    :goto_1
    if-ltz p1, :cond_3

    .line 55
    iget v5, p2, Lab/h0;->x:I

    if-ge p1, v5, :cond_3

    goto :goto_2

    .line 56
    :cond_3
    invoke-static {p1, v4, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 57
    iget p2, p2, Lab/h0;->x:I

    .line 58
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lk0/a;->e(Ljava/lang/String;)V

    :goto_2
    if-lt p1, v0, :cond_4

    goto :goto_3

    .line 59
    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "toIndex ("

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ") should be not smaller than fromIndex ("

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x29

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    invoke-static {p2}, Lk0/a;->a(Ljava/lang/String;)V

    .line 61
    :goto_3
    invoke-static {v0, v1}, Lp0/y;->g(ILr1/c;)I

    move-result p2

    .line 62
    iget-object v3, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v3, v3, p2

    check-cast v3, Lp0/h;

    .line 63
    iget v3, v3, Lp0/h;->a:I

    :goto_4
    if-gt v3, p1, :cond_8

    .line 64
    iget-object v4, v1, Lr1/c;->w:[Ljava/lang/Object;

    aget-object v4, v4, p2

    .line 65
    check-cast v4, Lp0/h;

    .line 66
    iget-object v5, v4, Lp0/h;->c:Lp0/q;

    .line 67
    invoke-interface {v5}, Lp0/q;->getKey()Lkotlin/jvm/functions/Function1;

    move-result-object v5

    .line 68
    iget v6, v4, Lp0/h;->a:I

    .line 69
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 70
    iget v8, v4, Lp0/h;->b:I

    add-int/2addr v8, v6

    add-int/lit8 v8, v8, -0x1

    .line 71
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    if-gt v7, v8, :cond_7

    :goto_5
    if-eqz v5, :cond_5

    sub-int v9, v7, v6

    .line 72
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v5, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_6

    .line 73
    :cond_5
    new-instance v9, Lp0/f;

    invoke-direct {v9, v7}, Lp0/f;-><init>(I)V

    .line 74
    :cond_6
    invoke-virtual {v2, v9, v7}, La0/m0;->h(Ljava/lang/Object;I)V

    .line 75
    iget-object v10, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v10, [Ljava/lang/Object;

    iget v11, p0, Lab/h0;->x:I

    sub-int v11, v7, v11

    aput-object v9, v10, v11

    if-eq v7, v8, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 76
    :cond_7
    iget v4, v4, Lp0/h;->b:I

    add-int/2addr v3, v4

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    .line 77
    :cond_8
    iput-object v2, p0, Lab/h0;->y:Ljava/lang/Object;

    :goto_6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p4, p0, Lab/h0;->w:I

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    iput p2, p0, Lab/h0;->x:I

    iput-object p3, p0, Lab/h0;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    const/16 v0, 0x12

    iput v0, p0, Lab/h0;->w:I

    .line 2
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const-string p2, ""

    goto :goto_1

    .line 3
    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 4
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v4, 0x5b

    .line 5
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v4, v1

    :goto_0
    if-ge v4, v0, :cond_2

    .line 6
    aget-object v5, p2, v4

    .line 7
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-le v6, v2, :cond_1

    const-string v6, ","

    .line 8
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    :cond_1
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const-string p2, "] "

    .line 10
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 11
    :goto_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lab/h0;->z:Ljava/lang/Object;

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v0, 0x17

    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {p1, v3}, [Ljava/lang/Object;

    move-result-object p1

    if-gt p2, v0, :cond_3

    move v1, v2

    :cond_3
    if-eqz v1, :cond_5

    const/4 p1, 0x2

    :goto_2
    const/4 p2, 0x7

    if-gt p1, p2, :cond_4

    .line 14
    iget-object p2, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    .line 15
    invoke-static {p2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-nez p2, :cond_4

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_4
    iput p1, p0, Lab/h0;->x:I

    return-void

    .line 16
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "tag \"%s\" is longer than the %d character maximum"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public constructor <init>(Lng3/k;Llg3/b;)V
    .locals 9

    const/16 v0, 0xb

    iput v0, p0, Lab/h0;->w:I

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    iget-object v0, p2, Llg3/b;->e:Lkg3/d;

    if-nez v0, :cond_0

    goto/16 :goto_6

    .line 104
    :cond_0
    sget-object v1, Lng3/p;->b:Lg73/d;

    invoke-interface {p1, v1}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkg3/d;

    .line 105
    sget-object v2, Lng3/p;->a:Lg73/a;

    invoke-interface {p1, v2}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljg3/o;

    const/4 v3, 0x0

    if-nez v1, :cond_2

    if-nez v0, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    move v4, v3

    goto :goto_1

    :cond_2
    if-nez v0, :cond_3

    goto :goto_0

    .line 106
    :cond_3
    invoke-virtual {v1, v0}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v4

    :goto_1
    const/4 v5, 0x0

    if-eqz v4, :cond_4

    move-object v0, v5

    :cond_4
    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    if-eqz v0, :cond_6

    move-object v4, v0

    goto :goto_2

    :cond_6
    move-object v4, v1

    :goto_2
    if-eqz v0, :cond_b

    .line 107
    sget-object v6, Lng3/a;->W:Lng3/a;

    invoke-interface {p1, v6}, Lng3/k;->a(Lng3/m;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 108
    move-object v0, v4

    check-cast v0, Lkg3/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object v5

    goto :goto_5

    .line 110
    :cond_7
    sget-object v6, Lkg3/e;->w:Lkg3/e;

    if-ne v0, v6, :cond_8

    if-eqz v1, :cond_b

    .line 111
    :cond_8
    invoke-static {}, Lng3/a;->values()[Lng3/a;

    move-result-object v1

    array-length v6, v1

    :goto_3
    if-ge v3, v6, :cond_b

    aget-object v7, v1, v3

    .line 112
    invoke-virtual {v7}, Lng3/a;->isDateBased()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {p1, v7}, Lng3/k;->a(Lng3/m;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    .line 113
    :cond_9
    new-instance p2, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid override chronology for temporal: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 115
    throw p2

    :cond_a
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 116
    :cond_b
    :goto_5
    new-instance v0, Llg3/r;

    invoke-direct {v0, v5, p1, v4, v2}, Llg3/r;-><init>(Ljg3/d;Lng3/k;Lkg3/d;Ljg3/o;)V

    move-object p1, v0

    .line 117
    :goto_6
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 118
    iget-object p1, p2, Llg3/b;->c:Llg3/t;

    .line 119
    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsm/c;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lab/h0;->w:I

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    .line 92
    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 93
    iput p1, p0, Lab/h0;->x:I

    return-void
.end method

.method public constructor <init>(Lty/c;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lab/h0;->w:I

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    .line 131
    sget-object p1, Lyr/c;->w:Lyr/c;

    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    const p1, 0x7fffffff

    .line 132
    iput p1, p0, Lab/h0;->x:I

    return-void
.end method

.method public constructor <init>(Lz8/e;)V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lab/h0;->w:I

    .line 120
    new-instance v0, Lcom/iterable/iterableapi/g1;

    .line 121
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v1, Ljc/b;

    const/16 v2, 0x13

    .line 123
    invoke-direct {v1, v2}, Ljc/b;-><init>(I)V

    .line 124
    iput-object v1, v0, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    iput-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    .line 127
    iput-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 128
    iput p1, p0, Lab/h0;->x:I

    return-void
.end method

.method public static s(C)Lab/h0;
    .locals 3

    new-instance v0, Lyr/b;

    invoke-direct {v0, p0}, Lyr/b;-><init>(C)V

    new-instance p0, Lab/h0;

    new-instance v1, Lty/c;

    const/16 v2, 0x1b

    invoke-direct {v1, v0, v2}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v1}, Lab/h0;-><init>(Lty/c;)V

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 9

    new-instance v0, Lfh/a;

    iget-object v1, p0, Lab/h0;->y:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lhi/a;

    iget-object v1, v6, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lab/h0;->z:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Lfi/l;

    invoke-interface {v7}, Lfi/l;->e()Lrh/j;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, v6, Lhi/a;->x:Landroid/widget/ImageView;

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v2, v3}, Lrh/o;->b(Lrh/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v7}, Lfi/l;->d()Lfi/i;

    move-result-object v3

    iget-object v3, v3, Lfi/i;->q:Lgi/g;

    iget v4, p0, Lab/h0;->x:I

    instance-of v8, v7, Lfi/q;

    if-eqz v8, :cond_2

    move-object v5, v7

    check-cast v5, Lfi/q;

    iget-boolean v5, v5, Lfi/q;->g:Z

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v5, 0x1

    :goto_2
    invoke-direct/range {v0 .. v5}, Lfh/a;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lgi/g;IZ)V

    if-eqz v8, :cond_3

    invoke-static {v0}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v0

    invoke-virtual {v6, v0}, Lhi/a;->b(Lrh/j;)V

    return-void

    :cond_3
    instance-of v1, v7, Lfi/d;

    if-eqz v1, :cond_4

    invoke-static {v0}, Lrh/o;->c(Landroid/graphics/drawable/Drawable;)Lrh/j;

    move-result-object v0

    invoke-virtual {v6, v0}, Lhi/a;->b(Lrh/j;)V

    return-void

    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public b(I)Ld/q;
    .locals 13

    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, [[B

    iget v1, p0, Lab/h0;->x:I

    iget-object v2, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v2, Ld/p;

    instance-of v3, v2, Ld/i;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ld/i;

    iput-boolean v4, v3, Ld/i;->F:Z

    invoke-virtual {v3}, Ld/i;->h()Z

    :cond_0
    invoke-static {v2, p1}, Ld/g0;->b(Ljava/io/InputStream;I)I

    move-result v3

    const/4 v5, 0x1

    const/16 v6, 0x8

    const/16 v7, 0x11

    const/16 v8, 0x10

    const/4 v9, 0x4

    const/4 v10, 0x3

    if-eq v3, v10, :cond_2

    if-eq v3, v9, :cond_2

    if-eq v3, v8, :cond_2

    if-eq v3, v7, :cond_2

    if-ne v3, v6, :cond_1

    goto :goto_0

    :cond_1
    move v11, v4

    goto :goto_1

    :cond_2
    :goto_0
    move v11, v5

    :goto_1
    invoke-static {v2, v1, v11}, Ld/g0;->h(Ljava/io/InputStream;IZ)I

    move-result v11

    if-gez v11, :cond_a

    and-int/lit8 v4, p1, 0x20

    if-eqz v4, :cond_9

    new-instance v4, Ld/i;

    invoke-direct {v4, v2, v1}, Ld/i;-><init>(Ljava/io/InputStream;I)V

    new-instance v2, Lab/h0;

    const/4 v5, 0x5

    invoke-direct {v2, v4, v1, v0, v5}, Lab/h0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    and-int/lit16 p1, p1, 0xc0

    if-eqz p1, :cond_3

    new-instance v0, Ld/q0;

    invoke-direct {v0, p1, v3, v2}, Ld/q0;-><init>(IILab/h0;)V

    return-object v0

    :cond_3
    if-eq v3, v10, :cond_8

    if-eq v3, v9, :cond_7

    if-eq v3, v6, :cond_6

    if-eq v3, v8, :cond_5

    if-ne v3, v7, :cond_4

    new-instance p1, Ld/h0;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_4
    new-instance p1, La/h;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unknown BER object encountered: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ld/h0;

    const/4 v0, 0x0

    invoke-direct {p1, v2, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_6
    new-instance p1, Ld/h0;

    const/4 v0, 0x3

    invoke-direct {p1, v2, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_7
    new-instance p1, Ld/o;

    const/4 v0, 0x1

    invoke-direct {p1, v2, v0}, Ld/o;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_8
    new-instance p1, Ld/w;

    invoke-direct {p1, v2}, Ld/w;-><init>(Lab/h0;)V

    return-object p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "indefinite-length primitive encoding encountered"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance v12, Ld/c;

    invoke-direct {v12, v2, v11, v1}, Ld/c;-><init>(Ljava/io/InputStream;II)V

    and-int/lit16 v1, p1, 0xe0

    if-nez v1, :cond_10

    if-eq v3, v10, :cond_f

    if-eq v3, v9, :cond_e

    if-eq v3, v6, :cond_d

    if-eq v3, v8, :cond_c

    if-eq v3, v7, :cond_b

    :try_start_0
    invoke-static {v3, v12, v0}, Ld/g0;->m(ILd/c;[[B)Ld/b1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, La/h;

    const-string v1, "corrupted stream detected"

    invoke-direct {v0, p1, v1}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance p1, La/h;

    const-string v0, "sequences must use constructed encoding (see X.690 8.9.1/8.10.1)"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, La/h;

    const-string v0, "sets must use constructed encoding (see X.690 8.11.1/8.12.1)"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, La/h;

    const-string v0, "externals must use constructed encoding (see X.690 8.18)"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Ld/o;

    const/4 v0, 0x0

    invoke-direct {p1, v12, v0}, Ld/o;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_f
    new-instance p1, Ld/r0;

    invoke-direct {p1, v12}, Ld/r0;-><init>(Ld/c;)V

    return-object p1

    :cond_10
    new-instance v1, Lab/h0;

    iget v2, v12, Ld/p;->x:I

    const/4 v11, 0x5

    invoke-direct {v1, v12, v2, v0, v11}, Lab/h0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    and-int/lit16 v0, p1, 0xc0

    if-eqz v0, :cond_12

    and-int/lit8 p1, p1, 0x20

    if-eqz p1, :cond_11

    move v4, v5

    :cond_11
    new-instance p1, Ld/g1;

    invoke-direct {p1, v0, v3, v4, v1}, Ld/g1;-><init>(IIZLab/h0;)V

    return-object p1

    :cond_12
    if-eq v3, v10, :cond_17

    if-eq v3, v9, :cond_16

    if-eq v3, v6, :cond_15

    if-eq v3, v8, :cond_14

    if-ne v3, v7, :cond_13

    new-instance p1, Ld/h0;

    const/4 v0, 0x4

    invoke-direct {p1, v1, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_13
    new-instance p1, La/h;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "unknown DL object encountered: 0x"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_14
    new-instance p1, Ld/h0;

    const/4 v0, 0x2

    invoke-direct {p1, v1, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_15
    new-instance p1, Ld/h0;

    const/4 v0, 0x3

    invoke-direct {p1, v1, v0}, Ld/h0;-><init>(Lab/h0;I)V

    return-object p1

    :cond_16
    new-instance p1, Ld/o;

    const/4 v0, 0x1

    invoke-direct {p1, v1, v0}, Ld/o;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_17
    new-instance p1, Ld/w;

    invoke-direct {p1, v1}, Ld/w;-><init>(Lab/h0;)V

    return-object p1
.end method

.method public c()Ld/s;
    .locals 4

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Ld/p;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-gez v1, :cond_0

    new-instance v0, Ld/s;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld/s;-><init>(I)V

    return-object v0

    :cond_0
    new-instance v2, Ld/s;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ld/s;-><init>(I)V

    :cond_1
    invoke-virtual {p0, v1}, Lab/h0;->b(I)Ld/q;

    move-result-object v1

    instance-of v3, v1, Ld/f;

    if-eqz v3, :cond_2

    check-cast v1, Ld/f;

    invoke-interface {v1}, Ld/f;->b()Ld/b1;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v1}, Ld/s;->e(Ld/b1;)V

    goto :goto_1

    :cond_2
    invoke-interface {v1}, Ld/q;->d()Ld/b1;

    move-result-object v1

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v1

    if-gez v1, :cond_1

    return-object v2
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lx8/n;

    sget-object v1, Lx8/t;->c:[B

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v2, v1

    invoke-virtual {v0, v2, v1}, Lx8/n;->D(I[B)V

    return-void
.end method

.method public e(Le83/b;)V
    .locals 4

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    :goto_0
    if-eqz v0, :cond_5

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x4

    if-ge v1, v2, :cond_4

    aget-object v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_3

    :cond_0
    sget-object v2, Lb83/h;->w:Lb83/h;

    if-ne v3, v2, :cond_1

    invoke-virtual {p1}, Le83/b;->onComplete()V

    return-void

    :cond_1
    instance-of v2, v3, Lb83/f;

    if-eqz v2, :cond_2

    check-cast v3, Lb83/f;

    iget-object v0, v3, Lb83/f;->w:Ljava/lang/Throwable;

    invoke-virtual {p1, v0}, Le83/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    instance-of v2, v3, Lb83/g;

    if-eqz v2, :cond_3

    check-cast v3, Lb83/g;

    iget-object v2, v3, Lb83/g;->w:Ljava/lang/Object;

    invoke-virtual {p1, v2}, Le83/b;->b(Leg3/b;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p1, v3}, Le83/b;->onNext(Ljava/lang/Object;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    aget-object v0, v0, v2

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0

    :cond_5
    return-void
.end method

.method public f(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lab/h0;->x:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    iput-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    const/4 v0, 0x0

    :cond_0
    iget-object v1, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    aput-object p1, v1, v0

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lab/h0;->x:I

    return-void
.end method

.method public g(ILp0/q;)V
    .locals 2

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "size should be >=0"

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance v0, Lp0/h;

    iget v1, p0, Lab/h0;->x:I

    invoke-direct {v0, v1, p1, p2}, Lp0/h;-><init>(IILp0/q;)V

    iget p2, p0, Lab/h0;->x:I

    add-int/2addr p2, p1

    iput p2, p0, Lab/h0;->x:I

    iget-object p1, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast p1, Lr1/c;

    invoke-virtual {p1, v0}, Lr1/c;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public h()Ldb/j0;
    .locals 5

    iget v0, p0, Lab/h0;->x:I

    if-nez v0, :cond_1

    iget-object v1, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v1, Landroid/security/keystore/KeyGenParameterSpec;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "build() called before setKeyGenParameterSpec or setKeyScheme."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x1

    const/16 v2, 0x100

    const/4 v3, 0x3

    if-ne v0, v1, :cond_2

    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    iget-object v4, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v0, v4, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const-string v4, "GCM"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setBlockModes([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const-string v4, "NoPadding"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeySize(I)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v0

    iput-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Landroid/security/keystore/KeyGenParameterSpec;

    if-eqz v0, :cond_a

    sget-object v4, Lsb/c;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getKeySize()I

    move-result v4

    if-ne v4, v2, :cond_9

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getBlockModes()[Ljava/lang/String;

    move-result-object v2

    const-string v4, "GCM"

    filled-new-array {v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getPurposes()I

    move-result v2

    if-ne v2, v3, :cond_7

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getEncryptionPaddings()[Ljava/lang/String;

    move-result-object v2

    const-string v3, "NoPadding"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->isUserAuthenticationRequired()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getUserAuthenticationValidityDurationSeconds()I

    move-result v2

    if-lt v2, v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    sget-object v1, Lsb/c;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getKeystoreAlias()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AndroidKeyStore"

    invoke-static {v3}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    invoke-virtual {v3, v2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_5

    :try_start_1
    const-string v2, "AES"

    const-string v3, "AndroidKeyStore"

    invoke-static {v2, v3}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljavax/crypto/KeyGenerator;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v2}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;
    :try_end_1
    .catch Ljava/security/ProviderException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v2, Ljava/security/GeneralSecurityException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_5
    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getKeystoreAlias()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ldb/j0;

    iget-object v2, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, Landroid/security/keystore/KeyGenParameterSpec;

    invoke-direct {v1, v0, v2}, Ldb/j0;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid padding mode, want NoPadding got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getEncryptionPaddings()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getPurposes()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid block mode, want GCM got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getBlockModes()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "invalid key size, want 256 bits got "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec;->getKeySize()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " bits"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "KeyGenParameterSpec was null after build() check"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public i()Lzr/b1;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v1, Lzr/h0;

    if-nez v1, :cond_16

    iget v1, v0, Lab/h0;->x:I

    iget-object v2, v0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    if-nez v1, :cond_0

    sget-object v1, Lzr/b1;->G:Lzr/b1;

    goto/16 :goto_c

    :cond_0
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-ne v1, v3, :cond_1

    aget-object v1, v2, v5

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v1, v2, v3

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lzr/b1;

    invoke-direct {v1, v2, v3, v4}, Lzr/b1;-><init>([Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_c

    :cond_1
    array-length v6, v2

    shr-int/2addr v6, v3

    invoke-static {v1, v6}, Lrj/o;->k(II)V

    invoke-static {v1}, Lzr/j0;->j(I)I

    move-result v6

    const/4 v7, 0x2

    if-ne v1, v3, :cond_2

    aget-object v6, v2, v5

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v6, v2, v3

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v16, v3

    move/from16 v17, v5

    :goto_0
    move/from16 v18, v7

    goto/16 :goto_b

    :cond_2
    add-int/lit8 v8, v6, -0x1

    const/16 v9, 0x80

    const/4 v10, 0x3

    const/4 v11, -0x1

    if-gt v6, v9, :cond_8

    new-array v6, v6, [B

    invoke-static {v6, v11}, Ljava/util/Arrays;->fill([BB)V

    move v9, v5

    move v11, v9

    :goto_1
    if-ge v9, v1, :cond_6

    mul-int/lit8 v12, v9, 0x2

    mul-int/lit8 v13, v11, 0x2

    aget-object v14, v2, v12

    invoke-static {v14}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/2addr v12, v3

    aget-object v12, v2, v12

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14}, Ljava/lang/Object;->hashCode()I

    move-result v15

    invoke-static {v15}, Lzr/q;->p(I)I

    move-result v15

    :goto_2
    and-int/2addr v15, v8

    move/from16 v16, v3

    aget-byte v3, v6, v15

    move/from16 v17, v5

    const/16 v5, 0xff

    and-int/2addr v3, v5

    if-ne v3, v5, :cond_4

    int-to-byte v3, v13

    aput-byte v3, v6, v15

    if-ge v11, v9, :cond_3

    aput-object v14, v2, v13

    xor-int/lit8 v3, v13, 0x1

    aput-object v12, v2, v3

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    aget-object v5, v2, v3

    invoke-virtual {v14, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v4, Lzr/h0;

    xor-int/lit8 v3, v3, 0x1

    aget-object v5, v2, v3

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v4, v14, v12, v5}, Lzr/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v12, v2, v3

    :goto_3
    add-int/lit8 v9, v9, 0x1

    move/from16 v3, v16

    move/from16 v5, v17

    goto :goto_1

    :cond_5
    add-int/lit8 v15, v15, 0x1

    move/from16 v3, v16

    move/from16 v5, v17

    goto :goto_2

    :cond_6
    move/from16 v16, v3

    move/from16 v17, v5

    if-ne v11, v1, :cond_7

    move-object v4, v6

    goto :goto_0

    :cond_7
    new-array v3, v10, [Ljava/lang/Object;

    aput-object v6, v3, v17

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v16

    aput-object v4, v3, v7

    :goto_4
    move-object v4, v3

    goto :goto_0

    :cond_8
    move/from16 v16, v3

    move/from16 v17, v5

    const v3, 0x8000

    if-gt v6, v3, :cond_e

    new-array v3, v6, [S

    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([SS)V

    move/from16 v5, v17

    move v6, v5

    :goto_5
    if-ge v5, v1, :cond_c

    mul-int/lit8 v9, v5, 0x2

    mul-int/lit8 v11, v6, 0x2

    aget-object v12, v2, v9

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/lit8 v9, v9, 0x1

    aget-object v9, v2, v9

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/lang/Object;->hashCode()I

    move-result v13

    invoke-static {v13}, Lzr/q;->p(I)I

    move-result v13

    :goto_6
    and-int/2addr v13, v8

    aget-short v14, v3, v13

    const v15, 0xffff

    and-int/2addr v14, v15

    if-ne v14, v15, :cond_a

    int-to-short v14, v11

    aput-short v14, v3, v13

    if-ge v6, v5, :cond_9

    aput-object v12, v2, v11

    xor-int/lit8 v11, v11, 0x1

    aput-object v9, v2, v11

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_a
    aget-object v15, v2, v14

    invoke-virtual {v12, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_b

    new-instance v4, Lzr/h0;

    xor-int/lit8 v11, v14, 0x1

    aget-object v13, v2, v11

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v4, v12, v9, v13}, Lzr/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v2, v11

    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_b
    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_c
    if-ne v6, v1, :cond_d

    goto :goto_4

    :cond_d
    new-array v5, v10, [Ljava/lang/Object;

    aput-object v3, v5, v17

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v16

    aput-object v4, v5, v7

    move-object v4, v5

    goto/16 :goto_0

    :cond_e
    new-array v3, v6, [I

    invoke-static {v3, v11}, Ljava/util/Arrays;->fill([II)V

    move/from16 v5, v17

    move v6, v5

    :goto_8
    if-ge v5, v1, :cond_12

    mul-int/lit8 v9, v5, 0x2

    mul-int/lit8 v12, v6, 0x2

    aget-object v13, v2, v9

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    xor-int/lit8 v9, v9, 0x1

    aget-object v9, v2, v9

    invoke-static {v9}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/lang/Object;->hashCode()I

    move-result v14

    invoke-static {v14}, Lzr/q;->p(I)I

    move-result v14

    :goto_9
    and-int/2addr v14, v8

    aget v15, v3, v14

    if-ne v15, v11, :cond_10

    aput v12, v3, v14

    if-ge v6, v5, :cond_f

    aput-object v13, v2, v12

    xor-int/lit8 v12, v12, 0x1

    aput-object v9, v2, v12

    :cond_f
    add-int/lit8 v6, v6, 0x1

    move/from16 v18, v7

    goto :goto_a

    :cond_10
    move/from16 v18, v7

    aget-object v7, v2, v15

    invoke-virtual {v13, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    new-instance v4, Lzr/h0;

    xor-int/lit8 v7, v15, 0x1

    aget-object v12, v2, v7

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v4, v13, v9, v12}, Lzr/h0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v2, v7

    :goto_a
    add-int/lit8 v5, v5, 0x1

    move/from16 v7, v18

    goto :goto_8

    :cond_11
    add-int/lit8 v14, v14, 0x1

    move/from16 v7, v18

    goto :goto_9

    :cond_12
    move/from16 v18, v7

    if-ne v6, v1, :cond_13

    move-object v4, v3

    goto :goto_b

    :cond_13
    new-array v5, v10, [Ljava/lang/Object;

    aput-object v3, v5, v17

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v5, v16

    aput-object v4, v5, v18

    move-object v4, v5

    :goto_b
    instance-of v3, v4, [Ljava/lang/Object;

    if-eqz v3, :cond_14

    check-cast v4, [Ljava/lang/Object;

    aget-object v1, v4, v18

    check-cast v1, Lzr/h0;

    iput-object v1, v0, Lab/h0;->z:Ljava/lang/Object;

    aget-object v1, v4, v17

    aget-object v3, v4, v16

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/lit8 v4, v3, 0x2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    move-object v4, v1

    move v1, v3

    :cond_14
    new-instance v3, Lzr/b1;

    invoke-direct {v3, v2, v1, v4}, Lzr/b1;-><init>([Ljava/lang/Object;ILjava/lang/Object;)V

    move-object v1, v3

    :goto_c
    iget-object v2, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, Lzr/h0;

    if-nez v2, :cond_15

    return-object v1

    :cond_15
    invoke-virtual {v2}, Lzr/h0;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v1

    throw v1

    :cond_16
    invoke-virtual {v1}, Lzr/h0;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v1

    throw v1
.end method

.method public j(Lt9/o;J)Lt9/f;
    .locals 18

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Lt9/o;->getPosition()J

    move-result-wide v5

    const v1, 0x1b8a0

    int-to-long v1, v1

    invoke-interface/range {p1 .. p1}, Lt9/o;->getLength()J

    move-result-wide v3

    sub-long/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v1, v1

    iget-object v2, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v2, Lx8/n;

    invoke-virtual {v2, v1}, Lx8/n;->C(I)V

    iget-object v3, v2, Lx8/n;->a:[B

    const/4 v4, 0x0

    move-object/from16 v7, p1

    invoke-interface {v7, v3, v4, v1}, Lt9/o;->p([BII)V

    iget v1, v2, Lx8/n;->c:I

    const-wide/16 v3, -0x1

    move-wide v9, v3

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    invoke-virtual {v2}, Lx8/n;->a()I

    move-result v11

    const/16 v12, 0xbc

    if-lt v11, v12, :cond_7

    iget-object v11, v2, Lx8/n;->a:[B

    iget v12, v2, Lx8/n;->b:I

    :goto_1
    if-ge v12, v1, :cond_0

    aget-byte v15, v11, v12

    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v7, 0x47

    if-eq v15, v7, :cond_1

    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_0
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    :cond_1
    add-int/lit16 v7, v12, 0xbc

    if-le v7, v1, :cond_2

    goto :goto_2

    :cond_2
    iget v3, v0, Lab/h0;->x:I

    invoke-static {v2, v12, v3}, Lug/m;->L(Lx8/n;II)J

    move-result-wide v3

    cmp-long v8, v3, v16

    if-eqz v8, :cond_6

    iget-object v8, v0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v8, Lx8/s;

    invoke-virtual {v8, v3, v4}, Lx8/s;->b(J)J

    move-result-wide v3

    cmp-long v8, v3, p2

    if-lez v8, :cond_4

    cmp-long v1, v13, v16

    if-nez v1, :cond_3

    new-instance v1, Lt9/f;

    const/4 v2, -0x1

    invoke-direct/range {v1 .. v6}, Lt9/f;-><init>(IJJ)V

    return-object v1

    :cond_3
    add-long v15, v5, v9

    new-instance v11, Lt9/f;

    const/4 v12, 0x0

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v11 .. v16}, Lt9/f;-><init>(IJJ)V

    return-object v11

    :cond_4
    const-wide/32 v8, 0x186a0

    add-long/2addr v8, v3

    cmp-long v8, v8, p2

    if-lez v8, :cond_5

    int-to-long v1, v12

    add-long v11, v5, v1

    new-instance v7, Lt9/f;

    const/4 v8, 0x0

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct/range {v7 .. v12}, Lt9/f;-><init>(IJJ)V

    return-object v7

    :cond_5
    int-to-long v8, v12

    move-wide v13, v3

    move-wide v9, v8

    :cond_6
    invoke-virtual {v2, v7}, Lx8/n;->F(I)V

    int-to-long v3, v7

    goto :goto_0

    :cond_7
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    :goto_2
    cmp-long v1, v13, v16

    if-eqz v1, :cond_8

    add-long v15, v5, v3

    new-instance v11, Lt9/f;

    const/4 v12, -0x2

    invoke-direct/range {v11 .. v16}, Lt9/f;-><init>(IJJ)V

    return-object v11

    :cond_8
    sget-object v1, Lt9/f;->d:Lt9/f;

    return-object v1
.end method

.method public k(Lb83/a;)V
    .locals 4

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    :goto_0
    if-eqz v0, :cond_3

    const/4 v1, 0x0

    :goto_1
    const/4 v2, 0x4

    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p1, v3}, Lp73/c;->test(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    aget-object v0, v0, v2

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_3
    return-void
.end method

.method public l(I)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lab/h0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    iget v1, p0, Lab/h0;->x:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lab/h0;->x:I

    :cond_0
    :goto_0
    iget v1, p0, Lab/h0;->x:I

    if-lez v1, :cond_1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    if-ge p1, v1, :cond_1

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lab/h0;->x:I

    goto :goto_0

    :cond_1
    :goto_1
    iget v1, p0, Lab/h0;->x:I

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    if-lt p1, v1, :cond_2

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lab/h0;->x:I

    goto :goto_1

    :cond_2
    iget p1, p0, Lab/h0;->x:I

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseArray;

    iget v1, p0, Lab/h0;->x:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_3

    const/4 v1, 0x0

    iput v1, p0, Lab/h0;->x:I

    :cond_3
    :goto_2
    iget v1, p0, Lab/h0;->x:I

    if-lez v1, :cond_4

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    if-ge p1, v1, :cond_4

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lab/h0;->x:I

    goto :goto_2

    :cond_4
    :goto_3
    iget v1, p0, Lab/h0;->x:I

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_5

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v1

    if-lt p1, v1, :cond_5

    iget v1, p0, Lab/h0;->x:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lab/h0;->x:I

    goto :goto_3

    :cond_5
    iget p1, p0, Lab/h0;->x:I

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public m(I)Lp0/h;
    .locals 3

    if-ltz p1, :cond_0

    iget v0, p0, Lab/h0;->x:I

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Index "

    const-string v1, ", size "

    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lab/h0;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk0/a;->e(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lp0/h;

    if-eqz v0, :cond_1

    iget v1, v0, Lp0/h;->a:I

    iget v2, v0, Lp0/h;->b:I

    add-int/2addr v2, v1

    if-ge p1, v2, :cond_1

    if-gt v1, p1, :cond_1

    return-object v0

    :cond_1
    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Lr1/c;

    invoke-static {p1, v0}, Lp0/y;->g(ILr1/c;)I

    move-result p1

    iget-object v0, v0, Lr1/c;->w:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Lp0/h;

    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    return-object p1
.end method

.method public n(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, La0/m0;

    invoke-virtual {v0, p1}, La0/m0;->d(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, v0, La0/m0;->c:[I

    aget p1, v0, p1

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public o(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget v1, p0, Lab/h0;->x:I

    sub-int/2addr p1, v1

    if-ltz p1, :cond_0

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p1, v0, p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public p()I
    .locals 2

    iget v0, p0, Lab/h0;->x:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/16 v0, 0x200

    return v0

    :cond_1
    const/16 v0, 0x800

    return v0
.end method

.method public q()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public r(Lng3/m;)Ljava/lang/Long;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Lng3/k;

    invoke-interface {v0, p1}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget v0, p0, Lab/h0;->x:I

    if-lez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    throw p1
.end method

.method public t(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Lab/h0;->x:I

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v2, v1

    if-le v0, v2, :cond_0

    array-length v2, v1

    invoke-static {v2, v0}, Lzr/a0;->e(II)I

    move-result v0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    :cond_0
    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    iget v1, p0, Lab/h0;->x:I

    mul-int/lit8 v2, v1, 0x2

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    aput-object p2, v0, v2

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lab/h0;->x:I

    return-void

    :cond_1
    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "null value in entry: "

    const-string v1, "=null"

    invoke-static {p1, v0, v1}, Lih0/d0;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null key in entry: null="

    invoke-static {p2, v0}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lab/h0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Lng3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lb83/f;)V
    .locals 2

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-void
.end method

.method public v(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Lmc3/c;

    instance-of v1, p2, Lvg/o;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lvg/o;

    iget v2, v1, Lvg/o;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lvg/o;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lvg/o;

    invoke-direct {v1, p0, p2}, Lvg/o;-><init>(Lab/h0;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lvg/o;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lvg/o;->F:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v1, Lvg/o;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/s;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget-object p1, v1, Lvg/o;->y:Ljava/lang/Object;

    check-cast p1, Lbc3/s;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception p2

    goto/16 :goto_7

    :pswitch_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget-object p1, v1, Lvg/o;->y:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lmc3/a;

    iget-object p1, v1, Lvg/o;->x:Lbc3/s;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    iget-object p1, v1, Lvg/o;->x:Lbc3/s;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    iget-object p1, v1, Lvg/o;->w:Ls83/i;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ls83/i;

    iput-object p2, v1, Lvg/o;->w:Ls83/i;

    iput v4, v1, Lvg/o;->F:I

    invoke-virtual {v0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_1

    goto/16 :goto_9

    :cond_1
    :goto_1
    iget-object p2, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast p2, Lbc3/t;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lbc3/t1;->isActive()Z

    move-result v3

    if-ne v3, v4, :cond_6

    iget p1, p0, Lab/h0;->x:I

    add-int/2addr p1, v4

    iput p1, p0, Lab/h0;->x:I

    invoke-virtual {v0, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    iput-object v5, v1, Lvg/o;->w:Ls83/i;

    iput-object p2, v1, Lvg/o;->x:Lbc3/s;

    const/4 p1, 0x2

    iput p1, v1, Lvg/o;->F:I

    invoke-virtual {p2, v1}, Lbc3/t1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    goto/16 :goto_9

    :cond_2
    move-object p1, p2

    :goto_2
    iput-object v5, v1, Lvg/o;->w:Ls83/i;

    iput-object p1, v1, Lvg/o;->x:Lbc3/s;

    iput-object v0, v1, Lvg/o;->y:Ljava/lang/Object;

    const/4 p2, 0x3

    iput p2, v1, Lvg/o;->F:I

    invoke-virtual {v0, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    goto/16 :goto_9

    :cond_3
    :goto_3
    :try_start_1
    iget p2, p0, Lab/h0;->x:I

    add-int/lit8 p2, p2, -0x1

    iput p2, p0, Lab/h0;->x:I

    if-nez p2, :cond_4

    iput-object v5, p0, Lab/h0;->z:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_4
    :goto_4
    invoke-interface {v0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    iput-object v5, v1, Lvg/o;->w:Ls83/i;

    iput-object v5, v1, Lvg/o;->x:Lbc3/s;

    iput-object v5, v1, Lvg/o;->y:Ljava/lang/Object;

    const/4 p2, 0x4

    iput p2, v1, Lvg/o;->F:I

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_5

    goto :goto_9

    :cond_5
    :goto_5
    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :goto_6
    invoke-interface {v0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_6
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    iput-object p2, p0, Lab/h0;->z:Ljava/lang/Object;

    invoke-virtual {v0, v5}, Lmc3/c;->i(Ljava/lang/Object;)V

    :try_start_2
    iput-object v5, v1, Lvg/o;->w:Ls83/i;

    iput-object v5, v1, Lvg/o;->x:Lbc3/s;

    iput-object p2, v1, Lvg/o;->y:Ljava/lang/Object;

    const/4 v0, 0x5

    iput v0, v1, Lvg/o;->F:I

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v2, :cond_7

    goto :goto_9

    :cond_7
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    goto :goto_8

    :catchall_2
    move-exception p1

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_7
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_8
    new-instance v0, Ll83/n;

    invoke-direct {v0, p2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    iput-object v5, v1, Lvg/o;->w:Ls83/i;

    iput-object v5, v1, Lvg/o;->x:Lbc3/s;

    iput-object v5, v1, Lvg/o;->y:Ljava/lang/Object;

    const/4 p2, 0x6

    iput p2, v1, Lvg/o;->F:I

    invoke-virtual {p1, v1}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p2, v2, :cond_8

    :goto_9
    return-object v2

    :cond_8
    :goto_a
    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(Ljava/lang/CharSequence;)Ljava/util/List;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Lty/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lyr/h;

    invoke-direct {v1, v0, p0, p1}, Lyr/h;-><init>(Lty/c;Lab/h0;Ljava/lang/CharSequence;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v1}, Lyr/h;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lyr/h;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public x(Ljava/lang/String;Lto/h;)V
    .locals 3

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v0, p0, Lab/h0;->x:I

    if-lez v0, :cond_0

    new-instance v0, Ljp/d;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljp/d;-><init>(Landroid/os/Looper;I)V

    new-instance v1, Lc5/m;

    const/4 v2, 0x4

    invoke-direct {v1, p0, p2, p1, v2}, Lc5/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x3b

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "LifecycleCallback with tag "

    const-string v2, " already added to this fragment."

    invoke-static {v1, v0, p1, v2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public y(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lab/h0;->x:I

    iput-object p1, p0, Lab/h0;->z:Ljava/lang/Object;

    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lto/h;

    if-eqz p1, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v2, v1}, Lto/h;->d(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public z(Landroid/os/Bundle;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto/h;

    invoke-virtual {v3, v2}, Lto/h;->g(Landroid/os/Bundle;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method
