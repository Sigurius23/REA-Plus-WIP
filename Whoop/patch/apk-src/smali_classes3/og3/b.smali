.class public final Log3/b;
.super Log3/h;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final E:[Ljg3/p;

.field public final F:[Log3/f;

.field public final G:Ljava/util/concurrent/ConcurrentHashMap;

.field public final w:[J

.field public final x:[Ljg3/p;

.field public final y:[J

.field public final z:[Ljg3/e;


# direct methods
.method public constructor <init>([J[Ljg3/p;[J[Ljg3/p;[Log3/f;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Log3/b;->G:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p1, p0, Log3/b;->w:[J

    iput-object p2, p0, Log3/b;->x:[Ljg3/p;

    iput-object p3, p0, Log3/b;->y:[J

    iput-object p4, p0, Log3/b;->E:[Ljg3/p;

    iput-object p5, p0, Log3/b;->F:[Log3/f;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    move p5, p2

    :goto_0
    array-length v0, p3

    if-ge p5, v0, :cond_1

    aget-object v0, p4, p5

    add-int/lit8 v1, p5, 0x1

    aget-object v2, p4, v1

    aget-wide v3, p3, p5

    invoke-static {v3, v4, p2, v0}, Ljg3/e;->u0(JILjg3/p;)Ljg3/e;

    move-result-object p5

    iget v0, v0, Ljg3/p;->x:I

    iget v3, v2, Ljg3/p;->x:I

    if-le v3, v0, :cond_0

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v2, v2, Ljg3/p;->x:I

    sub-int/2addr v2, v0

    int-to-long v2, v2

    invoke-virtual {p5, v2, v3}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object p5

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    sub-int/2addr v3, v0

    int-to-long v2, v3

    invoke-virtual {p5, v2, v3}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    move p5, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Ljg3/e;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljg3/e;

    iput-object p1, p0, Log3/b;->z:[Ljg3/e;

    return-void
.end method

.method private writeReplace()Ljava/lang/Object;
    .locals 2

    new-instance v0, Log3/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Log3/a;-><init>(BLjava/io/Serializable;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ljg3/c;)Ljg3/p;
    .locals 8

    iget-wide v0, p1, Ljg3/c;->F:J

    iget-object p1, p0, Log3/b;->F:[Log3/f;

    array-length p1, p1

    iget-object v2, p0, Log3/b;->E:[Ljg3/p;

    iget-object v3, p0, Log3/b;->y:[J

    if-lez p1, :cond_3

    array-length p1, v3

    if-eqz p1, :cond_0

    array-length p1, v3

    add-int/lit8 p1, p1, -0x1

    aget-wide v4, v3, p1

    cmp-long p1, v0, v4

    if-lez p1, :cond_3

    :cond_0
    array-length p1, v2

    add-int/lit8 p1, p1, -0x1

    aget-object p1, v2, p1

    iget p1, p1, Ljg3/p;->x:I

    int-to-long v2, p1

    add-long/2addr v2, v0

    const-wide/32 v4, 0x15180

    invoke-static {v2, v3, v4, v5}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p1

    iget p1, p1, Ljg3/d;->F:I

    invoke-virtual {p0, p1}, Log3/b;->e(I)[Log3/e;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_2

    aget-object v2, p1, v3

    iget-object v4, v2, Log3/e;->w:Ljg3/e;

    iget-object v5, v2, Log3/e;->x:Ljg3/p;

    invoke-virtual {v4, v5}, Lkg3/b;->o0(Ljg3/p;)J

    move-result-wide v6

    cmp-long v4, v0, v6

    if-gez v4, :cond_1

    return-object v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, v2, Log3/e;->y:Ljg3/p;

    return-object p1

    :cond_3
    invoke-static {v3, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result p1

    if-gez p1, :cond_4

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    :cond_4
    add-int/lit8 p1, p1, 0x1

    aget-object p1, v2, p1

    return-object p1
.end method

.method public final b(Ljg3/e;)Log3/e;
    .locals 1

    invoke-virtual {p0, p1}, Log3/b;->f(Ljg3/e;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Log3/e;

    if-eqz v0, :cond_0

    check-cast p1, Log3/e;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Ljg3/e;)Ljava/util/List;
    .locals 3

    invoke-virtual {p0, p1}, Log3/b;->f(Ljg3/e;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Log3/e;

    if-eqz v0, :cond_1

    check-cast p1, Log3/e;

    iget-object v0, p1, Log3/e;->y:Ljg3/p;

    iget v1, v0, Ljg3/p;->x:I

    iget-object p1, p1, Log3/e;->x:Ljg3/p;

    iget v2, p1, Ljg3/p;->x:I

    if-le v1, v2, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    filled-new-array {p1, v0}, [Ljg3/p;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast p1, Ljg3/p;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljg3/e;Ljg3/p;)Z
    .locals 0

    invoke-virtual {p0, p1}, Log3/b;->c(Ljg3/e;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e(I)[Log3/e;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget-object v3, v0, Log3/b;->G:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Log3/e;

    if-eqz v4, :cond_0

    return-object v4

    :cond_0
    iget-object v4, v0, Log3/b;->F:[Log3/f;

    array-length v5, v4

    new-array v5, v5, [Log3/e;

    const/4 v7, 0x0

    :goto_0
    array-length v8, v4

    if-ge v7, v8, :cond_5

    aget-object v8, v4, v7

    iget-object v9, v8, Log3/f;->H:Ljg3/p;

    iget v10, v9, Ljg3/p;->x:I

    iget-object v11, v8, Log3/f;->y:Ljg3/a;

    iget-object v12, v8, Log3/f;->w:Ljg3/g;

    iget-byte v13, v8, Log3/f;->x:B

    if-gez v13, :cond_2

    sget-object v14, Lkg3/e;->w:Lkg3/e;

    int-to-long v14, v1

    invoke-static {v14, v15}, Lkg3/e;->isLeapYear(J)Z

    move-result v6

    invoke-virtual {v12, v6}, Ljg3/g;->m(Z)I

    move-result v6

    const/4 v0, 0x1

    add-int/2addr v6, v0

    add-int/2addr v6, v13

    sget-object v13, Ljg3/d;->I:Ljg3/d;

    sget-object v13, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v13, v14, v15}, Lng3/a;->f(J)V

    sget-object v13, Lng3/a;->U:Lng3/a;

    int-to-long v14, v6

    invoke-virtual {v13, v14, v15}, Lng3/a;->f(J)V

    invoke-static {v1, v12, v6}, Ljg3/d;->p0(ILjg3/g;I)Ljg3/d;

    move-result-object v6

    if-eqz v11, :cond_1

    new-instance v12, Lc9/k;

    invoke-direct {v12, v0, v11}, Lc9/k;-><init>(ILjg3/a;)V

    invoke-virtual {v6, v12}, Ljg3/d;->D0(Lng3/l;)Ljg3/d;

    move-result-object v6

    :cond_1
    const/4 v12, 0x0

    goto :goto_1

    :cond_2
    sget-object v0, Ljg3/d;->I:Ljg3/d;

    sget-object v0, Lng3/a;->c0:Lng3/a;

    int-to-long v14, v1

    invoke-virtual {v0, v14, v15}, Lng3/a;->f(J)V

    const-string v0, "month"

    invoke-static {v12, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lng3/a;->U:Lng3/a;

    int-to-long v14, v13

    invoke-virtual {v0, v14, v15}, Lng3/a;->f(J)V

    invoke-static {v1, v12, v13}, Ljg3/d;->p0(ILjg3/g;I)Ljg3/d;

    move-result-object v6

    if-eqz v11, :cond_1

    new-instance v0, Lc9/k;

    const/4 v12, 0x0

    invoke-direct {v0, v12, v11}, Lc9/k;-><init>(ILjg3/a;)V

    invoke-virtual {v6, v0}, Ljg3/d;->D0(Lng3/l;)Ljg3/d;

    move-result-object v6

    :goto_1
    iget v0, v8, Log3/f;->E:I

    int-to-long v13, v0

    invoke-virtual {v6, v13, v14}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v0

    iget-object v6, v8, Log3/f;->z:Ljg3/f;

    invoke-static {v0, v6}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v0

    iget v6, v8, Log3/f;->F:I

    iget-object v11, v8, Log3/f;->G:Ljg3/p;

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v6

    if-eqz v6, :cond_4

    const/4 v13, 0x2

    if-eq v6, v13, :cond_3

    goto :goto_2

    :cond_3
    iget v6, v11, Ljg3/p;->x:I

    sub-int/2addr v10, v6

    int-to-long v10, v10

    invoke-virtual {v0, v10, v11}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v0

    goto :goto_2

    :cond_4
    sget-object v6, Ljg3/p;->F:Ljg3/p;

    iget v6, v6, Ljg3/p;->x:I

    sub-int/2addr v10, v6

    int-to-long v10, v10

    invoke-virtual {v0, v10, v11}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v0

    :goto_2
    new-instance v6, Log3/e;

    iget-object v8, v8, Log3/f;->I:Ljg3/p;

    invoke-direct {v6, v0, v9, v8}, Log3/e;-><init>(Ljg3/e;Ljg3/p;Ljg3/p;)V

    aput-object v6, v5, v7

    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_5
    const/16 v0, 0x834

    if-ge v1, v0, :cond_6

    invoke-virtual {v3, v2, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-object v5
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Log3/b;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Log3/b;

    iget-object v1, p0, Log3/b;->w:[J

    iget-object v3, p1, Log3/b;->w:[J

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/b;->x:[Ljg3/p;

    iget-object v3, p1, Log3/b;->x:[Ljg3/p;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/b;->y:[J

    iget-object v3, p1, Log3/b;->y:[J

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/b;->E:[Ljg3/p;

    iget-object v3, p1, Log3/b;->E:[Ljg3/p;

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Log3/b;->F:[Log3/f;

    iget-object p1, p1, Log3/b;->F:[Log3/f;

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    return v2

    :cond_2
    instance-of v1, p1, Log3/g;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Log3/b;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Ljg3/c;->H:Ljg3/c;

    invoke-virtual {p0, v1}, Log3/b;->a(Ljg3/c;)Ljg3/p;

    move-result-object v1

    check-cast p1, Log3/g;

    iget-object p1, p1, Log3/g;->w:Ljg3/p;

    invoke-virtual {v1, p1}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final f(Ljg3/e;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Log3/b;->F:[Log3/f;

    array-length v0, v0

    const/4 v1, 0x0

    iget-object v2, p0, Log3/b;->z:[Ljg3/e;

    if-lez v0, :cond_9

    array-length v0, v2

    if-eqz v0, :cond_1

    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v2, v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljg3/e;->q0(Ljg3/e;)I

    move-result v0

    if-lez v0, :cond_9

    goto :goto_0

    :cond_0
    iget-object v3, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v3}, Ljg3/d;->toEpochDay()J

    move-result-wide v3

    iget-object v5, v0, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v5}, Ljg3/d;->toEpochDay()J

    move-result-wide v5

    cmp-long v3, v3, v5

    if-gtz v3, :cond_1

    if-nez v3, :cond_9

    iget-object v3, p1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v3}, Ljg3/f;->C0()J

    move-result-wide v3

    iget-object v0, v0, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0}, Ljg3/f;->C0()J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-lez v0, :cond_9

    :cond_1
    :goto_0
    iget-object v0, p1, Ljg3/e;->F:Ljg3/d;

    iget v0, v0, Ljg3/d;->F:I

    invoke-virtual {p0, v0}, Log3/b;->e(I)[Log3/e;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v1, v2, :cond_8

    aget-object v3, v0, v1

    iget-object v4, v3, Log3/e;->w:Ljg3/e;

    iget-object v5, v3, Log3/e;->w:Ljg3/e;

    iget-object v6, v3, Log3/e;->y:Ljg3/p;

    iget-object v7, v3, Log3/e;->x:Ljg3/p;

    iget v8, v6, Ljg3/p;->x:I

    iget v9, v7, Ljg3/p;->x:I

    if-le v8, v9, :cond_4

    invoke-virtual {p1, v4}, Ljg3/e;->s0(Ljg3/e;)Z

    move-result v4

    if-eqz v4, :cond_2

    :goto_2
    move-object v3, v7

    goto :goto_4

    :cond_2
    iget v4, v6, Ljg3/p;->x:I

    iget v8, v7, Ljg3/p;->x:I

    sub-int/2addr v4, v8

    int-to-long v8, v4

    invoke-virtual {v5, v8, v9}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljg3/e;->s0(Ljg3/e;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_4

    :cond_3
    :goto_3
    move-object v3, v6

    goto :goto_4

    :cond_4
    invoke-virtual {p1, v4}, Ljg3/e;->s0(Ljg3/e;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    iget v4, v6, Ljg3/p;->x:I

    iget v6, v7, Ljg3/p;->x:I

    sub-int/2addr v4, v6

    int-to-long v8, v4

    invoke-virtual {v5, v8, v9}, Ljg3/e;->w0(J)Ljg3/e;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljg3/e;->s0(Ljg3/e;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    :goto_4
    instance-of v4, v3, Log3/e;

    if-nez v4, :cond_8

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_8
    :goto_5
    return-object v3

    :cond_9
    invoke-static {v2, p1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    const/4 v0, -0x1

    iget-object v3, p0, Log3/b;->E:[Ljg3/p;

    if-ne p1, v0, :cond_a

    aget-object p1, v3, v1

    return-object p1

    :cond_a
    if-gez p1, :cond_b

    neg-int p1, p1

    add-int/lit8 p1, p1, -0x2

    goto :goto_6

    :cond_b
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    if-ge p1, v0, :cond_c

    aget-object v0, v2, p1

    add-int/lit8 v1, p1, 0x1

    aget-object v4, v2, v1

    invoke-virtual {v0, v4}, Ljg3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move p1, v1

    :cond_c
    :goto_6
    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_e

    aget-object v0, v2, p1

    add-int/lit8 v1, p1, 0x1

    aget-object v1, v2, v1

    div-int/lit8 p1, p1, 0x2

    aget-object v2, v3, p1

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v3, p1

    iget v3, p1, Ljg3/p;->x:I

    iget v4, v2, Ljg3/p;->x:I

    if-le v3, v4, :cond_d

    new-instance v1, Log3/e;

    invoke-direct {v1, v0, v2, p1}, Log3/e;-><init>(Ljg3/e;Ljg3/p;Ljg3/p;)V

    return-object v1

    :cond_d
    new-instance v0, Log3/e;

    invoke-direct {v0, v1, v2, p1}, Log3/e;-><init>(Ljg3/e;Ljg3/p;Ljg3/p;)V

    return-object v0

    :cond_e
    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1

    aget-object p1, v3, p1

    return-object p1
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Log3/b;->y:[J

    array-length v0, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Log3/b;->F:[Log3/f;

    array-length v0, v0

    if-nez v0, :cond_0

    iget-object v0, p0, Log3/b;->E:[Ljg3/p;

    aget-object v0, v0, v1

    iget-object v2, p0, Log3/b;->x:[Ljg3/p;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljg3/p;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Log3/b;->w:[J

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([J)I

    move-result v0

    iget-object v1, p0, Log3/b;->x:[Ljg3/p;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/b;->y:[J

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([J)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/b;->E:[Ljg3/p;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    iget-object v1, p0, Log3/b;->F:[Log3/f;

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StandardZoneRules[currentStandardOffset="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Log3/b;->x:[Ljg3/p;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
