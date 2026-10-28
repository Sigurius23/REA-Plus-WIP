.class public abstract Ll3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ly3/o;->b:[Ly3/p;

    sget-wide v0, Ly3/o;->c:J

    sput-wide v0, Ll3/c0;->a:J

    return-void
.end method

.method public static final a(Ll3/b0;IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)Ll3/b0;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    const-wide v13, 0xff00000000L

    const/high16 v15, -0x80000000

    if-ne v1, v15, :cond_0

    const-wide/16 v16, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v16, 0x0

    iget v11, v0, Ll3/b0;->a:I

    if-ne v1, v11, :cond_9

    :goto_0
    sget-object v11, Ly3/o;->b:[Ly3/p;

    and-long v11, v3, v13

    cmp-long v11, v11, v16

    if-nez v11, :cond_1

    goto :goto_1

    :cond_1
    iget-wide v11, v0, Ll3/b0;->c:J

    invoke-static {v3, v4, v11, v12}, Ly3/o;->a(JJ)Z

    move-result v11

    if-eqz v11, :cond_9

    :goto_1
    if-eqz v5, :cond_2

    iget-object v11, v0, Ll3/b0;->d:Lw3/q;

    invoke-virtual {v5, v11}, Lw3/q;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    :cond_2
    if-ne v2, v15, :cond_3

    goto :goto_2

    :cond_3
    iget v11, v0, Ll3/b0;->b:I

    if-ne v2, v11, :cond_9

    :goto_2
    if-eqz v6, :cond_4

    iget-object v11, v0, Ll3/b0;->e:Ll3/e0;

    invoke-virtual {v6, v11}, Ll3/e0;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    :cond_4
    if-eqz v7, :cond_5

    iget-object v11, v0, Ll3/b0;->f:Lw3/i;

    invoke-virtual {v7, v11}, Lw3/i;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    :cond_5
    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    iget v11, v0, Ll3/b0;->g:I

    if-ne v8, v11, :cond_9

    :goto_3
    if-ne v9, v15, :cond_7

    goto :goto_4

    :cond_7
    iget v11, v0, Ll3/b0;->h:I

    if-ne v9, v11, :cond_9

    :goto_4
    if-eqz v10, :cond_8

    iget-object v11, v0, Ll3/b0;->i:Lw3/s;

    invoke-virtual {v10, v11}, Lw3/s;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_5

    :cond_8
    return-object v0

    :cond_9
    :goto_5
    sget-object v11, Ly3/o;->b:[Ly3/p;

    and-long v11, v3, v13

    cmp-long v11, v11, v16

    if-nez v11, :cond_a

    iget-wide v3, v0, Ll3/b0;->c:J

    :cond_a
    if-nez v5, :cond_b

    iget-object v5, v0, Ll3/b0;->d:Lw3/q;

    :cond_b
    if-ne v1, v15, :cond_c

    iget v1, v0, Ll3/b0;->a:I

    :cond_c
    if-ne v2, v15, :cond_d

    iget v2, v0, Ll3/b0;->b:I

    :cond_d
    iget-object v11, v0, Ll3/b0;->e:Ll3/e0;

    if-nez v11, :cond_e

    goto :goto_6

    :cond_e
    if-nez v6, :cond_f

    move-object v6, v11

    :cond_f
    :goto_6
    if-nez v7, :cond_10

    iget-object v7, v0, Ll3/b0;->f:Lw3/i;

    :cond_10
    if-nez v8, :cond_11

    iget v8, v0, Ll3/b0;->g:I

    :cond_11
    if-ne v9, v15, :cond_12

    iget v9, v0, Ll3/b0;->h:I

    :cond_12
    if-nez v10, :cond_13

    iget-object v0, v0, Ll3/b0;->i:Lw3/s;

    move-object v10, v0

    :cond_13
    new-instance v0, Ll3/b0;

    move-object/from16 p0, v0

    move/from16 p1, v1

    move/from16 p2, v2

    move-wide/from16 p3, v3

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move-object/from16 p10, v10

    invoke-direct/range {p0 .. p10}, Ll3/b0;-><init>(IIJLw3/q;Ll3/e0;Lw3/i;IILw3/s;)V

    return-object v0
.end method
