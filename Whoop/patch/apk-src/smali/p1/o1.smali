.class public final Lp1/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:I

.field public c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:La0/g0;

.field public final f:Ll83/p;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/o1;->a:Ljava/util/ArrayList;

    iput p2, p0, Lp1/o1;->b:I

    if-ltz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, "Invalid start index"

    invoke-static {p2}, Lp1/q1;->a(Ljava/lang/String;)V

    :goto_0
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lp1/o1;->d:Ljava/util/ArrayList;

    new-instance p2, La0/g0;

    invoke-direct {p2}, La0/g0;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_1
    if-ge v0, p1, :cond_1

    iget-object v2, p0, Lp1/o1;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/r0;

    iget v3, v2, Lp1/r0;->c:I

    iget v2, v2, Lp1/r0;->d:I

    new-instance v4, Lp1/l0;

    invoke-direct {v4, v0, v1, v2}, Lp1/l0;-><init>(III)V

    invoke-virtual {p2, v3, v4}, La0/g0;->h(ILjava/lang/Object;)V

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput-object p2, p0, Lp1/o1;->e:La0/g0;

    new-instance p1, Lfa3/u;

    const/16 p2, 0xb

    invoke-direct {p1, p0, p2}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lp1/o1;->f:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(II)Z
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p2

    iget-object v2, v0, Lp1/o1;->e:La0/g0;

    move/from16 v3, p1

    invoke-virtual {v2, v3}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/l0;

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    iget v5, v3, Lp1/l0;->b:I

    iget v6, v3, Lp1/l0;->c:I

    sub-int v6, v1, v6

    iput v1, v3, Lp1/l0;->c:I

    if-eqz v6, :cond_3

    iget-object v1, v2, La0/s;->c:[Ljava/lang/Object;

    iget-object v2, v2, La0/s;->a:[J

    array-length v7, v2

    add-int/lit8 v7, v7, -0x2

    if-ltz v7, :cond_3

    move v8, v4

    :goto_0
    aget-wide v9, v2, v8

    not-long v11, v9

    const/4 v13, 0x7

    shl-long/2addr v11, v13

    and-long/2addr v11, v9

    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v11, v13

    cmp-long v11, v11, v13

    if-eqz v11, :cond_2

    sub-int v11, v8, v7

    not-int v11, v11

    ushr-int/lit8 v11, v11, 0x1f

    const/16 v12, 0x8

    rsub-int/lit8 v11, v11, 0x8

    move v13, v4

    :goto_1
    if-ge v13, v11, :cond_1

    const-wide/16 v14, 0xff

    and-long/2addr v14, v9

    const-wide/16 v16, 0x80

    cmp-long v14, v14, v16

    if-gez v14, :cond_0

    shl-int/lit8 v14, v8, 0x3

    add-int/2addr v14, v13

    aget-object v14, v1, v14

    check-cast v14, Lp1/l0;

    iget v15, v14, Lp1/l0;->b:I

    if-lt v15, v5, :cond_0

    invoke-virtual {v14, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_0

    iget v15, v14, Lp1/l0;->b:I

    add-int/2addr v15, v6

    if-ltz v15, :cond_0

    iput v15, v14, Lp1/l0;->b:I

    :cond_0
    shr-long/2addr v9, v12

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_1
    if-ne v11, v12, :cond_3

    :cond_2
    if-eq v8, v7, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    return v1

    :cond_4
    return v4
.end method
