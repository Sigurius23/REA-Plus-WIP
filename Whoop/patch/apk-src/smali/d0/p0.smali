.class public final Ld0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/y;


# instance fields
.field public final a:Ld0/o0;


# direct methods
.method public constructor <init>(Ld0/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/p0;->a:Ld0/o0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ld0/f2;)Ld0/g2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld0/p0;->f(Ld0/f2;)Ld0/n2;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic a(Ld0/f2;)Ld0/i2;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Ld0/p0;->f(Ld0/f2;)Ld0/n2;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ld0/f2;)Ld0/n2;
    .locals 20

    new-instance v0, La0/f0;

    move-object/from16 v1, p0

    iget-object v2, v1, Ld0/p0;->a:Ld0/o0;

    iget-object v3, v2, Ld0/o0;->b:La0/g0;

    iget v4, v3, La0/s;->e:I

    add-int/lit8 v4, v4, 0x2

    invoke-direct {v0, v4}, La0/f0;-><init>(I)V

    new-instance v4, La0/g0;

    iget v5, v3, La0/s;->e:I

    invoke-direct {v4, v5}, La0/g0;-><init>(I)V

    iget-object v5, v3, La0/s;->b:[I

    iget-object v6, v3, La0/s;->c:[Ljava/lang/Object;

    iget-object v7, v3, La0/s;->a:[J

    array-length v8, v7

    add-int/lit8 v8, v8, -0x2

    if-ltz v8, :cond_2

    const/4 v10, 0x0

    :goto_0
    aget-wide v11, v7, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_3

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_1

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_0

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    aget v9, v5, v16

    aget-object v16, v6, v16

    move/from16 v18, v14

    move-object/from16 v14, v16

    check-cast v14, Ld0/n0;

    invoke-virtual {v0, v9}, La0/f0;->a(I)V

    new-instance v1, Ld0/m2;

    move-object/from16 v16, v5

    move-object/from16 v19, v6

    move-object/from16 v5, p1

    iget-object v6, v5, Ld0/f2;->a:Lkotlin/jvm/functions/Function1;

    iget-object v5, v14, Ld0/n0;->a:Ljava/lang/Float;

    invoke-interface {v6, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld0/r;

    iget-object v6, v14, Ld0/n0;->b:Ld0/z;

    invoke-direct {v1, v5, v6}, Ld0/m2;-><init>(Ld0/r;Ld0/z;)V

    invoke-virtual {v4, v9, v1}, La0/g0;->h(ILjava/lang/Object;)V

    goto :goto_2

    :cond_0
    move-object/from16 v16, v5

    move-object/from16 v19, v6

    move/from16 v18, v14

    :goto_2
    shr-long v11, v11, v18

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    move/from16 v14, v18

    move-object/from16 v6, v19

    goto :goto_1

    :cond_1
    move-object/from16 v16, v5

    move-object/from16 v19, v6

    move v1, v14

    if-ne v13, v1, :cond_2

    goto :goto_3

    :cond_2
    const/4 v1, 0x0

    goto :goto_4

    :cond_3
    move-object/from16 v16, v5

    move-object/from16 v19, v6

    :goto_3
    if-eq v10, v8, :cond_2

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p0

    move-object/from16 v5, v16

    move-object/from16 v6, v19

    goto :goto_0

    :goto_4
    invoke-virtual {v3, v1}, La0/s;->a(I)Z

    move-result v5

    if-nez v5, :cond_6

    iget v5, v0, La0/f0;->b:I

    if-ltz v5, :cond_5

    const/4 v6, 0x1

    add-int/2addr v5, v6

    invoke-virtual {v0, v5}, La0/f0;->b(I)V

    iget-object v5, v0, La0/f0;->a:[I

    iget v7, v0, La0/f0;->b:I

    if-eqz v7, :cond_4

    invoke-static {v6, v1, v5, v5, v7}, Lm83/n;->e0(II[I[II)V

    :cond_4
    aput v1, v5, v1

    iget v1, v0, La0/f0;->b:I

    add-int/2addr v1, v6

    iput v1, v0, La0/f0;->b:I

    goto :goto_5

    :cond_5
    const-string v0, "Index must be between 0 and size"

    invoke-static {v0}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_6
    :goto_5
    iget v1, v2, Ld0/o0;->a:I

    invoke-virtual {v3, v1}, La0/s;->a(I)Z

    move-result v1

    if-nez v1, :cond_7

    iget v1, v2, Ld0/o0;->a:I

    invoke-virtual {v0, v1}, La0/f0;->a(I)V

    :cond_7
    iget v1, v0, La0/f0;->b:I

    if-nez v1, :cond_8

    goto :goto_6

    :cond_8
    iget-object v3, v0, La0/f0;->a:[I

    const-string v5, "<this>"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    invoke-static {v3, v5, v1}, Ljava/util/Arrays;->sort([III)V

    :goto_6
    new-instance v1, Ld0/n2;

    iget v2, v2, Ld0/o0;->a:I

    sget-object v3, Ld0/b0;->c:Lb23/h;

    invoke-direct {v1, v0, v4, v2, v3}, Ld0/n2;-><init>(La0/f0;La0/g0;ILd0/z;)V

    return-object v1
.end method
