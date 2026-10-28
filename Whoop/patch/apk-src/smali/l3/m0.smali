.class public final Ll3/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/b;


# instance fields
.field public final a:Lw3/o;

.field public final b:J

.field public final c:Lp3/r;

.field public final d:Lp3/n;

.field public final e:Lp3/o;

.field public final f:Lp3/i;

.field public final g:Ljava/lang/String;

.field public final h:J

.field public final i:Lw3/a;

.field public final j:Lw3/p;

.field public final k:Ls3/b;

.field public final l:J

.field public final m:Lw3/l;

.field public final n:Li2/z0;

.field public final o:Ll3/f0;

.field public final p:Lk2/f;


# direct methods
.method public constructor <init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;I)V
    .locals 23

    move/from16 v0, p19

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 28
    sget-wide v1, Li2/x;->n:J

    move-wide v4, v1

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 29
    sget-wide v1, Ly3/o;->c:J

    move-wide v6, v1

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v8, v2

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    move-object v9, v2

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    move-object v10, v2

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    move-object v11, v2

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    move-object v12, v2

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    .line 30
    sget-wide v13, Ly3/o;->c:J

    goto :goto_7

    :cond_7
    move-wide/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    move-object/from16 v17, v2

    goto :goto_a

    :cond_a
    move-object/from16 v17, p14

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    .line 31
    sget-wide v18, Li2/x;->n:J

    goto :goto_b

    :cond_b
    move-wide/from16 v18, p15

    :goto_b
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    move-object/from16 v21, v2

    goto :goto_d

    :cond_d
    move-object/from16 v21, p18

    :goto_d
    const/16 v22, 0x0

    move-object/from16 v3, p0

    .line 32
    invoke-direct/range {v3 .. v22}, Ll3/m0;-><init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;)V

    return-void
.end method

.method public constructor <init>(JJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;)V
    .locals 23

    move-wide/from16 v0, p1

    const-wide/16 v2, 0x10

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 1
    new-instance v2, Lw3/c;

    invoke-direct {v2, v0, v1}, Lw3/c;-><init>(J)V

    :goto_0
    move-object v4, v2

    goto :goto_1

    :cond_0
    sget-object v2, Lw3/n;->a:Lw3/n;

    goto :goto_0

    :goto_1
    const/16 v22, 0x0

    move-object/from16 v3, p0

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-wide/from16 v12, p10

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-wide/from16 v17, p15

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    .line 2
    invoke-direct/range {v3 .. v22}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    return-void
.end method

.method public constructor <init>(Li2/t;FJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V
    .locals 23

    move-object/from16 v0, p1

    move/from16 v1, p2

    .line 3
    sget-object v2, Lw3/n;->a:Lw3/n;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v3, p0

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-wide/from16 v12, p10

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-wide/from16 v17, p15

    move-object/from16 v19, p17

    move-object/from16 v20, p18

    move-object/from16 v21, p19

    move-object/from16 v22, p20

    move-object v4, v2

    goto :goto_1

    .line 4
    :cond_1
    instance-of v3, v0, Li2/c1;

    if-eqz v3, :cond_2

    check-cast v0, Li2/c1;

    .line 5
    iget-wide v3, v0, Li2/c1;->c:J

    .line 6
    invoke-static {v1, v3, v4}, Ls3/d;->p(FJ)J

    move-result-wide v0

    const-wide/16 v3, 0x10

    cmp-long v3, v0, v3

    if-eqz v3, :cond_0

    .line 7
    new-instance v2, Lw3/c;

    invoke-direct {v2, v0, v1}, Lw3/c;-><init>(J)V

    goto :goto_0

    .line 8
    :cond_2
    instance-of v2, v0, Li2/y0;

    if-eqz v2, :cond_3

    new-instance v2, Lw3/b;

    check-cast v0, Li2/y0;

    invoke-direct {v2, v0, v1}, Lw3/b;-><init>(Li2/y0;F)V

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {v3 .. v22}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    return-void

    .line 10
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public constructor <init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Ll3/m0;->a:Lw3/o;

    .line 13
    iput-wide p2, p0, Ll3/m0;->b:J

    .line 14
    iput-object p4, p0, Ll3/m0;->c:Lp3/r;

    .line 15
    iput-object p5, p0, Ll3/m0;->d:Lp3/n;

    .line 16
    iput-object p6, p0, Ll3/m0;->e:Lp3/o;

    .line 17
    iput-object p7, p0, Ll3/m0;->f:Lp3/i;

    .line 18
    iput-object p8, p0, Ll3/m0;->g:Ljava/lang/String;

    .line 19
    iput-wide p9, p0, Ll3/m0;->h:J

    .line 20
    iput-object p11, p0, Ll3/m0;->i:Lw3/a;

    .line 21
    iput-object p12, p0, Ll3/m0;->j:Lw3/p;

    .line 22
    iput-object p13, p0, Ll3/m0;->k:Ls3/b;

    .line 23
    iput-wide p14, p0, Ll3/m0;->l:J

    move-object/from16 p1, p16

    .line 24
    iput-object p1, p0, Ll3/m0;->m:Lw3/l;

    move-object/from16 p1, p17

    .line 25
    iput-object p1, p0, Ll3/m0;->n:Li2/z0;

    move-object/from16 p1, p18

    .line 26
    iput-object p1, p0, Ll3/m0;->o:Ll3/f0;

    move-object/from16 p1, p19

    .line 27
    iput-object p1, p0, Ll3/m0;->p:Lk2/f;

    return-void
.end method

.method public static a(Ll3/m0;JLp3/r;I)Ll3/m0;
    .locals 23

    move-object/from16 v0, p0

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    iget-object v1, v0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v1}, Lw3/o;->b()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    move-wide/from16 v1, p1

    :goto_0
    iget-wide v5, v0, Ll3/m0;->b:J

    and-int/lit8 v3, p4, 0x4

    if-eqz v3, :cond_1

    iget-object v3, v0, Ll3/m0;->c:Lp3/r;

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object/from16 v7, p3

    :goto_1
    iget-object v8, v0, Ll3/m0;->d:Lp3/n;

    iget-object v9, v0, Ll3/m0;->e:Lp3/o;

    and-int/lit8 v3, p4, 0x20

    if-eqz v3, :cond_2

    iget-object v3, v0, Ll3/m0;->f:Lp3/i;

    :goto_2
    move-object v10, v3

    goto :goto_3

    :cond_2
    const/4 v3, 0x0

    goto :goto_2

    :goto_3
    iget-object v11, v0, Ll3/m0;->g:Ljava/lang/String;

    iget-wide v12, v0, Ll3/m0;->h:J

    iget-object v14, v0, Ll3/m0;->i:Lw3/a;

    iget-object v15, v0, Ll3/m0;->j:Lw3/p;

    iget-object v3, v0, Ll3/m0;->k:Ls3/b;

    move-object/from16 v16, v3

    iget-wide v3, v0, Ll3/m0;->l:J

    move-wide/from16 v17, v3

    iget-object v3, v0, Ll3/m0;->m:Lw3/l;

    iget-object v4, v0, Ll3/m0;->n:Li2/z0;

    move-object/from16 v19, v3

    iget-object v3, v0, Ll3/m0;->o:Ll3/f0;

    move-object/from16 v21, v3

    iget-object v3, v0, Ll3/m0;->p:Lk2/f;

    move-object/from16 v22, v3

    new-instance v3, Ll3/m0;

    iget-object v0, v0, Ll3/m0;->a:Lw3/o;

    move-object/from16 p1, v3

    move-object/from16 v20, v4

    invoke-interface {v0}, Lw3/o;->b()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Li2/x;->d(JJ)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_4
    move-object/from16 v3, p1

    move-object v4, v0

    goto :goto_5

    :cond_3
    const-wide/16 v3, 0x10

    cmp-long v0, v1, v3

    if-eqz v0, :cond_4

    new-instance v0, Lw3/c;

    invoke-direct {v0, v1, v2}, Lw3/c;-><init>(J)V

    goto :goto_4

    :cond_4
    sget-object v0, Lw3/n;->a:Lw3/n;

    goto :goto_4

    :goto_5
    invoke-direct/range {v3 .. v22}, Ll3/m0;-><init>(Lw3/o;JLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)V

    return-object v3
.end method


# virtual methods
.method public final b(Ll3/m0;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    iget-wide v1, p0, Ll3/m0;->b:J

    iget-wide v3, p1, Ll3/m0;->b:J

    invoke-static {v1, v2, v3, v4}, Ly3/o;->a(JJ)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget-object v1, p0, Ll3/m0;->c:Lp3/r;

    iget-object v3, p1, Ll3/m0;->c:Lp3/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ll3/m0;->d:Lp3/n;

    iget-object v3, p1, Ll3/m0;->d:Lp3/n;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll3/m0;->e:Lp3/o;

    iget-object v3, p1, Ll3/m0;->e:Lp3/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ll3/m0;->f:Lp3/i;

    iget-object v3, p1, Ll3/m0;->f:Lp3/i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ll3/m0;->g:Ljava/lang/String;

    iget-object v3, p1, Ll3/m0;->g:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Ll3/m0;->h:J

    iget-wide v5, p1, Ll3/m0;->h:J

    invoke-static {v3, v4, v5, v6}, Ly3/o;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Ll3/m0;->i:Lw3/a;

    iget-object v3, p1, Ll3/m0;->i:Lw3/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Ll3/m0;->j:Lw3/p;

    iget-object v3, p1, Ll3/m0;->j:Lw3/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Ll3/m0;->k:Ls3/b;

    iget-object v3, p1, Ll3/m0;->k:Ls3/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-wide v3, p0, Ll3/m0;->l:J

    iget-wide v5, p1, Ll3/m0;->l:J

    invoke-static {v3, v4, v5, v6}, Li2/x;->d(JJ)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Ll3/m0;->o:Ll3/f0;

    iget-object p1, p1, Ll3/m0;->o:Ll3/f0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final c(Ll3/m0;)Z
    .locals 3

    iget-object v0, p0, Ll3/m0;->a:Lw3/o;

    iget-object v1, p1, Ll3/m0;->a:Lw3/o;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll3/m0;->m:Lw3/l;

    iget-object v2, p1, Ll3/m0;->m:Lw3/l;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Ll3/m0;->n:Li2/z0;

    iget-object v2, p1, Ll3/m0;->n:Li2/z0;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Ll3/m0;->p:Lk2/f;

    iget-object p1, p1, Ll3/m0;->p:Lk2/f;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final d(Ll3/m0;)Ll3/m0;
    .locals 25

    move-object/from16 v0, p1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, v0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v1}, Lw3/o;->b()J

    move-result-wide v3

    invoke-interface {v1}, Lw3/o;->c()Li2/t;

    move-result-object v5

    invoke-interface {v1}, Lw3/o;->a()F

    move-result v6

    iget-wide v7, v0, Ll3/m0;->b:J

    iget-object v9, v0, Ll3/m0;->c:Lp3/r;

    iget-object v10, v0, Ll3/m0;->d:Lp3/n;

    iget-object v11, v0, Ll3/m0;->e:Lp3/o;

    iget-object v12, v0, Ll3/m0;->f:Lp3/i;

    iget-object v13, v0, Ll3/m0;->g:Ljava/lang/String;

    iget-wide v14, v0, Ll3/m0;->h:J

    iget-object v1, v0, Ll3/m0;->i:Lw3/a;

    iget-object v2, v0, Ll3/m0;->j:Lw3/p;

    move-object/from16 v16, v1

    iget-object v1, v0, Ll3/m0;->k:Ls3/b;

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Ll3/m0;->l:J

    move-wide/from16 v19, v1

    iget-object v1, v0, Ll3/m0;->m:Lw3/l;

    iget-object v2, v0, Ll3/m0;->n:Li2/z0;

    move-object/from16 v21, v1

    iget-object v1, v0, Ll3/m0;->o:Ll3/f0;

    iget-object v0, v0, Ll3/m0;->p:Lk2/f;

    move-object/from16 v24, v0

    move-object/from16 v23, v1

    move-object/from16 v22, v2

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v24}, Ll3/n0;->a(Ll3/m0;JLi2/t;FJLp3/r;Lp3/n;Lp3/o;Lp3/i;Ljava/lang/String;JLw3/a;Lw3/p;Ls3/b;JLw3/l;Li2/z0;Ll3/f0;Lk2/f;)Ll3/m0;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll3/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll3/m0;

    invoke-virtual {p0, p1}, Ll3/m0;->b(Ll3/m0;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1}, Ll3/m0;->c(Ll3/m0;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    iget-object v0, p0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v0}, Lw3/o;->b()J

    move-result-wide v1

    sget v3, Li2/x;->o:I

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    const/16 v2, 0x1f

    mul-int/2addr v1, v2

    invoke-interface {v0}, Lw3/o;->c()Li2/t;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    add-int/2addr v1, v3

    mul-int/2addr v1, v2

    invoke-interface {v0}, Lw3/o;->a()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    sget-object v1, Ly3/o;->b:[Ly3/p;

    iget-wide v5, p0, Ll3/m0;->b:J

    invoke-static {v0, v5, v6, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Ll3/m0;->c:Lp3/r;

    if-eqz v1, :cond_1

    iget v1, v1, Lp3/r;->w:I

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->d:Lp3/n;

    if-eqz v1, :cond_2

    iget v1, v1, Lp3/n;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v4

    :goto_2
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->e:Lp3/o;

    if-eqz v1, :cond_3

    iget v1, v1, Lp3/o;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    goto :goto_3

    :cond_3
    move v1, v4

    :goto_3
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->f:Lp3/i;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_4

    :cond_4
    move v1, v4

    :goto_4
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->g:Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    goto :goto_5

    :cond_5
    move v1, v4

    :goto_5
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-wide v5, p0, Ll3/m0;->h:J

    invoke-static {v0, v5, v6, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Ll3/m0;->i:Lw3/a;

    if-eqz v1, :cond_6

    iget v1, v1, Lw3/a;->a:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    goto :goto_6

    :cond_6
    move v1, v4

    :goto_6
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->j:Lw3/p;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lw3/p;->hashCode()I

    move-result v1

    goto :goto_7

    :cond_7
    move v1, v4

    :goto_7
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->k:Ls3/b;

    if-eqz v1, :cond_8

    iget-object v1, v1, Ls3/b;->w:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_8

    :cond_8
    move v1, v4

    :goto_8
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-wide v5, p0, Ll3/m0;->l:J

    invoke-static {v0, v5, v6, v2}, Ld;->e(IJI)I

    move-result v0

    iget-object v1, p0, Ll3/m0;->m:Lw3/l;

    if-eqz v1, :cond_9

    iget v1, v1, Lw3/l;->a:I

    goto :goto_9

    :cond_9
    move v1, v4

    :goto_9
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->n:Li2/z0;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Li2/z0;->hashCode()I

    move-result v1

    goto :goto_a

    :cond_a
    move v1, v4

    :goto_a
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->o:Ll3/f0;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_b

    :cond_b
    move v1, v4

    :goto_b
    add-int/2addr v0, v1

    mul-int/2addr v0, v2

    iget-object v1, p0, Ll3/m0;->p:Lk2/f;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :cond_c
    add-int/2addr v0, v4

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SpanStyle(color="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll3/m0;->a:Lw3/o;

    invoke-interface {v1}, Lw3/o;->b()J

    move-result-wide v2

    invoke-static {v2, v3}, Li2/x;->j(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", brush="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lw3/o;->c()Li2/t;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", alpha="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Lw3/o;->a()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", fontSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/m0;->b:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->c:Lp3/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->d:Lp3/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontSynthesis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->e:Lp3/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFamily="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->f:Lp3/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFeatureSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", letterSpacing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/m0;->h:J

    invoke-static {v1, v2}, Ly3/o;->e(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", baselineShift="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->i:Lw3/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textGeometricTransform="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->j:Lw3/p;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", localeList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->k:Ls3/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", background="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Ll3/m0;->l:J

    const-string v3, ", textDecoration="

    invoke-static {v1, v2, v3, v0}, Lev/n;->u(JLjava/lang/String;Ljava/lang/StringBuilder;)V

    iget-object v1, p0, Ll3/m0;->m:Lw3/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shadow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->n:Li2/z0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->o:Ll3/f0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", drawStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll3/m0;->p:Lk2/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
