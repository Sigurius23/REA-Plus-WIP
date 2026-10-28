.class public final Lqc/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Los/a;

.field public static final z:Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lic/m0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public e:Lic/g;

.field public final f:Lic/g;

.field public g:J

.field public h:J

.field public i:J

.field public j:Lic/e;

.field public final k:I

.field public l:Lic/a;

.field public m:J

.field public n:J

.field public final o:J

.field public final p:J

.field public q:Z

.field public r:Lic/i0;

.field public final s:I

.field public final t:I

.field public u:J

.field public v:I

.field public final w:I

.field public x:Ljava/lang/String;

.field public final y:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "WorkSpec"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tagWithPrefix(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lqc/q;->z:Ljava/lang/String;

    new-instance v0, Los/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Los/a;-><init>(I)V

    sput-object v0, Lqc/q;->A:Los/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V
    .locals 4

    move-object/from16 v0, p13

    move-object/from16 v1, p15

    move-object/from16 v2, p25

    const-string v3, "id"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "state"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "workerClassName"

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "inputMergerClassName"

    invoke-static {p4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "input"

    invoke-static {p5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "output"

    invoke-static {p6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "constraints"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "backoffPolicy"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "outOfQuotaPolicy"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lqc/q;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lqc/q;->b:Lic/m0;

    .line 4
    iput-object p3, p0, Lqc/q;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lqc/q;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lqc/q;->e:Lic/g;

    .line 7
    iput-object p6, p0, Lqc/q;->f:Lic/g;

    .line 8
    iput-wide p7, p0, Lqc/q;->g:J

    .line 9
    iput-wide p9, p0, Lqc/q;->h:J

    move-wide p1, p11

    .line 10
    iput-wide p1, p0, Lqc/q;->i:J

    .line 11
    iput-object v0, p0, Lqc/q;->j:Lic/e;

    move/from16 p1, p14

    .line 12
    iput p1, p0, Lqc/q;->k:I

    .line 13
    iput-object v1, p0, Lqc/q;->l:Lic/a;

    move-wide/from16 p1, p16

    .line 14
    iput-wide p1, p0, Lqc/q;->m:J

    move-wide/from16 p1, p18

    .line 15
    iput-wide p1, p0, Lqc/q;->n:J

    move-wide/from16 p1, p20

    .line 16
    iput-wide p1, p0, Lqc/q;->o:J

    move-wide/from16 p1, p22

    .line 17
    iput-wide p1, p0, Lqc/q;->p:J

    move/from16 p1, p24

    .line 18
    iput-boolean p1, p0, Lqc/q;->q:Z

    .line 19
    iput-object v2, p0, Lqc/q;->r:Lic/i0;

    move/from16 p1, p26

    .line 20
    iput p1, p0, Lqc/q;->s:I

    move/from16 p1, p27

    .line 21
    iput p1, p0, Lqc/q;->t:I

    move-wide/from16 p1, p28

    .line 22
    iput-wide p1, p0, Lqc/q;->u:J

    move/from16 p1, p30

    .line 23
    iput p1, p0, Lqc/q;->v:I

    move/from16 p1, p31

    .line 24
    iput p1, p0, Lqc/q;->w:I

    move-object/from16 p1, p32

    .line 25
    iput-object p1, p0, Lqc/q;->x:Ljava/lang/String;

    move-object/from16 p1, p33

    .line 26
    iput-object p1, p0, Lqc/q;->y:Ljava/lang/Boolean;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IJIILjava/lang/String;Ljava/lang/Boolean;I)V
    .locals 36

    move/from16 v0, p33

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 27
    sget-object v1, Lic/m0;->w:Lic/m0;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 28
    const-class v1, Landroidx/work/OverwritingInputMerger;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    .line 29
    sget-object v1, Lic/g;->b:Lic/g;

    move-object v7, v1

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    .line 30
    sget-object v1, Lic/g;->b:Lic/g;

    move-object v8, v1

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_4

    move-wide v9, v2

    goto :goto_4

    :cond_4
    move-wide/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-wide v11, v2

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p9

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-wide v13, v2

    goto :goto_6

    :cond_6
    move-wide/from16 v13, p11

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    .line 31
    sget-object v1, Lic/e;->j:Lic/e;

    move-object v15, v1

    goto :goto_7

    :cond_7
    move-object/from16 v15, p13

    :goto_7
    and-int/lit16 v1, v0, 0x400

    const/4 v5, 0x0

    if-eqz v1, :cond_8

    move/from16 v16, v5

    goto :goto_8

    :cond_8
    move/from16 v16, p14

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    .line 32
    sget-object v1, Lic/a;->w:Lic/a;

    move-object/from16 v17, v1

    goto :goto_9

    :cond_9
    move-object/from16 v17, p15

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    const-wide/16 v18, 0x7530

    goto :goto_a

    :cond_a
    move-wide/from16 v18, p16

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    const-wide/16 v20, -0x1

    if-eqz v1, :cond_b

    move-wide/from16 v22, v20

    goto :goto_b

    :cond_b
    move-wide/from16 v22, p18

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    goto :goto_c

    :cond_c
    move-wide/from16 v2, p20

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-wide/from16 v24, v20

    goto :goto_d

    :cond_d
    move-wide/from16 v24, p22

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move/from16 v26, v5

    goto :goto_e

    :cond_e
    move/from16 v26, p24

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    .line 33
    sget-object v1, Lic/i0;->w:Lic/i0;

    move-object/from16 v27, v1

    goto :goto_f

    :cond_f
    move-object/from16 v27, p25

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move/from16 v28, v5

    goto :goto_10

    :cond_10
    move/from16 v28, p26

    :goto_10
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    const-wide v20, 0x7fffffffffffffffL

    move-wide/from16 v30, v20

    goto :goto_11

    :cond_11
    move-wide/from16 v30, p27

    :goto_11
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_12

    move/from16 v32, v5

    goto :goto_12

    :cond_12
    move/from16 v32, p29

    :goto_12
    const/high16 v1, 0x400000

    and-int/2addr v1, v0

    if-eqz v1, :cond_13

    const/16 v1, -0x100

    move/from16 v33, v1

    goto :goto_13

    :cond_13
    move/from16 v33, p30

    :goto_13
    const/high16 v1, 0x800000

    and-int/2addr v1, v0

    if-eqz v1, :cond_14

    const/4 v1, 0x0

    move-object/from16 v34, v1

    goto :goto_14

    :cond_14
    move-object/from16 v34, p31

    :goto_14
    const/high16 v1, 0x1000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_15

    .line 34
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v35, v0

    goto :goto_15

    :cond_15
    move-object/from16 v35, p32

    :goto_15
    const/16 v29, 0x0

    move-object/from16 v5, p3

    move-wide/from16 v20, v22

    move-wide/from16 v22, v2

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    .line 35
    invoke-direct/range {v2 .. v35}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static b(Lqc/q;Ljava/lang/String;Lic/m0;Ljava/lang/String;Lic/g;IJIIJII)Lqc/q;
    .locals 37

    move-object/from16 v0, p0

    move/from16 v1, p13

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lqc/q;->a:Ljava/lang/String;

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v2, v1, 0x2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lqc/q;->b:Lic/m0;

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v2, v1, 0x4

    if-eqz v2, :cond_2

    iget-object v2, v0, Lqc/q;->c:Ljava/lang/String;

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    iget-object v7, v0, Lqc/q;->d:Ljava/lang/String;

    and-int/lit8 v2, v1, 0x10

    if-eqz v2, :cond_3

    iget-object v2, v0, Lqc/q;->e:Lic/g;

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p4

    :goto_3
    iget-object v9, v0, Lqc/q;->f:Lic/g;

    iget-wide v10, v0, Lqc/q;->g:J

    iget-wide v12, v0, Lqc/q;->h:J

    iget-wide v14, v0, Lqc/q;->i:J

    iget-object v2, v0, Lqc/q;->j:Lic/e;

    and-int/lit16 v3, v1, 0x400

    if-eqz v3, :cond_4

    iget v3, v0, Lqc/q;->k:I

    move/from16 v17, v3

    goto :goto_4

    :cond_4
    move/from16 v17, p5

    :goto_4
    iget-object v3, v0, Lqc/q;->l:Lic/a;

    move-wide/from16 v18, v10

    iget-wide v10, v0, Lqc/q;->m:J

    move-wide/from16 v20, v10

    and-int/lit16 v10, v1, 0x2000

    if-eqz v10, :cond_5

    iget-wide v10, v0, Lqc/q;->n:J

    move-wide/from16 p1, v10

    goto :goto_5

    :cond_5
    move-wide/from16 p1, p6

    :goto_5
    iget-wide v10, v0, Lqc/q;->o:J

    move-wide/from16 v23, v10

    iget-wide v10, v0, Lqc/q;->p:J

    iget-boolean v1, v0, Lqc/q;->q:Z

    move/from16 v27, v1

    iget-object v1, v0, Lqc/q;->r:Lic/i0;

    const/high16 v16, 0x40000

    and-int v16, p13, v16

    move-wide/from16 v25, v10

    if-eqz v16, :cond_6

    iget v10, v0, Lqc/q;->s:I

    move/from16 v29, v10

    goto :goto_6

    :cond_6
    move/from16 v29, p8

    :goto_6
    const/high16 v10, 0x80000

    and-int v10, p13, v10

    if-eqz v10, :cond_7

    iget v10, v0, Lqc/q;->t:I

    move/from16 v30, v10

    goto :goto_7

    :cond_7
    move/from16 v30, p9

    :goto_7
    const/high16 v10, 0x100000

    and-int v10, p13, v10

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lqc/q;->u:J

    move-wide/from16 v31, v10

    goto :goto_8

    :cond_8
    move-wide/from16 v31, p10

    :goto_8
    const/high16 v10, 0x200000

    and-int v10, p13, v10

    if-eqz v10, :cond_9

    iget v10, v0, Lqc/q;->v:I

    move/from16 v33, v10

    goto :goto_9

    :cond_9
    move/from16 v33, p12

    :goto_9
    iget v10, v0, Lqc/q;->w:I

    iget-object v11, v0, Lqc/q;->x:Ljava/lang/String;

    move/from16 v34, v10

    iget-object v10, v0, Lqc/q;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "id"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerClassName"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inputMergerClassName"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "output"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constraints"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backoffPolicy"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outOfQuotaPolicy"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v36, v10

    move-object/from16 v35, v11

    move-wide/from16 v10, v18

    move-object/from16 v18, v3

    new-instance v3, Lqc/q;

    move-object/from16 v28, v1

    move-object/from16 v16, v2

    move-wide/from16 v19, v20

    move-wide/from16 v21, p1

    invoke-direct/range {v3 .. v36}, Lqc/q;-><init>(Ljava/lang/String;Lic/m0;Ljava/lang/String;Ljava/lang/String;Lic/g;Lic/g;JJJLic/e;ILic/a;JJJJZLic/i0;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    return-object v3
.end method


# virtual methods
.method public final a()J
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lqc/q;->b:Lic/m0;

    sget-object v2, Lic/m0;->w:Lic/m0;

    if-ne v1, v2, :cond_0

    iget v1, v0, Lqc/q;->k:I

    if-lez v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    move v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget-object v4, v0, Lqc/q;->l:Lic/a;

    iget-wide v5, v0, Lqc/q;->m:J

    iget-wide v7, v0, Lqc/q;->n:J

    invoke-virtual {v0}, Lqc/q;->c()Z

    move-result v10

    iget-wide v11, v0, Lqc/q;->g:J

    iget-wide v13, v0, Lqc/q;->i:J

    move v3, v2

    iget-wide v1, v0, Lqc/q;->h:J

    move-wide v15, v1

    iget-wide v1, v0, Lqc/q;->u:J

    move-wide/from16 v17, v1

    move v2, v3

    iget v3, v0, Lqc/q;->k:I

    iget v9, v0, Lqc/q;->s:I

    invoke-static/range {v2 .. v18}, Lge3/g;->j(ZILic/a;JJIZJJJJ)J

    move-result-wide v1

    return-wide v1
.end method

.method public final c()Z
    .locals 4

    iget-wide v0, p0, Lqc/q;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d(J)V
    .locals 9

    const-wide/32 v0, 0x112a880

    cmp-long v0, p1, v0

    sget-object v1, Lqc/q;->z:Ljava/lang/String;

    if-lez v0, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v2, "Backoff delay duration exceeds maximum value"

    invoke-virtual {v0, v1, v2}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-wide/16 v2, 0x2710

    cmp-long v0, p1, v2

    if-gez v0, :cond_1

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v2, "Backoff delay duration less than minimum value"

    invoke-virtual {v0, v1, v2}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-wide/16 v5, 0x2710

    const-wide/32 v7, 0x112a880

    move-wide v3, p1

    invoke-static/range {v3 .. v8}, Le93/b;->p(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lqc/q;->m:J

    return-void
.end method

.method public final e(J)V
    .locals 6

    const-wide/32 v0, 0xdbba0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    sget-object v4, Lqc/q;->z:Ljava/lang/String;

    const-string v5, "Interval duration lesser than minimum allowed value; Changed to 900000"

    invoke-virtual {v3, v4, v5}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-gez v2, :cond_1

    move-wide v3, v0

    goto :goto_0

    :cond_1
    move-wide v3, p1

    :goto_0
    if-gez v2, :cond_2

    move-wide p1, v0

    :cond_2
    invoke-virtual {p0, v3, v4, p1, p2}, Lqc/q;->f(JJ)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lqc/q;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lqc/q;

    iget-object v1, p0, Lqc/q;->a:Ljava/lang/String;

    iget-object v3, p1, Lqc/q;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lqc/q;->b:Lic/m0;

    iget-object v3, p1, Lqc/q;->b:Lic/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lqc/q;->c:Ljava/lang/String;

    iget-object v3, p1, Lqc/q;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lqc/q;->d:Ljava/lang/String;

    iget-object v3, p1, Lqc/q;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lqc/q;->e:Lic/g;

    iget-object v3, p1, Lqc/q;->e:Lic/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lqc/q;->f:Lic/g;

    iget-object v3, p1, Lqc/q;->f:Lic/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lqc/q;->g:J

    iget-wide v5, p1, Lqc/q;->g:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lqc/q;->h:J

    iget-wide v5, p1, Lqc/q;->h:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lqc/q;->i:J

    iget-wide v5, p1, Lqc/q;->i:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lqc/q;->j:Lic/e;

    iget-object v3, p1, Lqc/q;->j:Lic/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lqc/q;->k:I

    iget v3, p1, Lqc/q;->k:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lqc/q;->l:Lic/a;

    iget-object v3, p1, Lqc/q;->l:Lic/a;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lqc/q;->m:J

    iget-wide v5, p1, Lqc/q;->m:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_e

    return v2

    :cond_e
    iget-wide v3, p0, Lqc/q;->n:J

    iget-wide v5, p1, Lqc/q;->n:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_f

    return v2

    :cond_f
    iget-wide v3, p0, Lqc/q;->o:J

    iget-wide v5, p1, Lqc/q;->o:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_10

    return v2

    :cond_10
    iget-wide v3, p0, Lqc/q;->p:J

    iget-wide v5, p1, Lqc/q;->p:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lqc/q;->q:Z

    iget-boolean v3, p1, Lqc/q;->q:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lqc/q;->r:Lic/i0;

    iget-object v3, p1, Lqc/q;->r:Lic/i0;

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget v1, p0, Lqc/q;->s:I

    iget v3, p1, Lqc/q;->s:I

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget v1, p0, Lqc/q;->t:I

    iget v3, p1, Lqc/q;->t:I

    if-eq v1, v3, :cond_15

    return v2

    :cond_15
    iget-wide v3, p0, Lqc/q;->u:J

    iget-wide v5, p1, Lqc/q;->u:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lqc/q;->v:I

    iget v3, p1, Lqc/q;->v:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lqc/q;->w:I

    iget v3, p1, Lqc/q;->w:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget-object v1, p0, Lqc/q;->x:Ljava/lang/String;

    iget-object v3, p1, Lqc/q;->x:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    return v2

    :cond_19
    iget-object v1, p0, Lqc/q;->y:Ljava/lang/Boolean;

    iget-object p1, p1, Lqc/q;->y:Ljava/lang/Boolean;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1a

    return v2

    :cond_1a
    return v0
.end method

.method public final f(JJ)V
    .locals 10

    const-wide/32 v0, 0xdbba0

    cmp-long v2, p1, v0

    sget-object v3, Lqc/q;->z:Ljava/lang/String;

    if-gez v2, :cond_0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v4

    const-string v5, "Interval duration lesser than minimum allowed value; Changed to 900000"

    invoke-virtual {v4, v3, v5}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-gez v2, :cond_1

    goto :goto_0

    :cond_1
    move-wide v0, p1

    :goto_0
    iput-wide v0, p0, Lqc/q;->h:J

    const-wide/32 v0, 0x493e0

    cmp-long v0, p3, v0

    if-gez v0, :cond_2

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    const-string v1, "Flex duration lesser than minimum allowed value; Changed to 300000"

    invoke-virtual {v0, v3, v1}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iget-wide v0, p0, Lqc/q;->h:J

    cmp-long v0, p3, v0

    if-lez v0, :cond_3

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Flex duration greater than interval duration; Changed to "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-wide/32 v6, 0x493e0

    iget-wide v8, p0, Lqc/q;->h:J

    move-wide v4, p3

    invoke-static/range {v4 .. v9}, Le93/b;->p(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Lqc/q;->i:J

    return-void
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, Lqc/q;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lqc/q;->b:Lic/m0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lqc/q;->c:Ljava/lang/String;

    invoke-static {v2, v1, v0}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lqc/q;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lqc/q;->e:Lic/g;

    invoke-virtual {v2}, Lic/g;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lqc/q;->f:Lic/g;

    invoke-virtual {v0}, Lic/g;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lqc/q;->g:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->h:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->i:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-object v2, p0, Lqc/q;->j:Lic/e;

    invoke-virtual {v2}, Lic/e;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lqc/q;->k:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lqc/q;->l:Lic/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-wide v3, p0, Lqc/q;->m:J

    invoke-static {v2, v3, v4, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->n:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->o:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->p:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget-boolean v2, p0, Lqc/q;->q:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lqc/q;->r:Lic/i0;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lqc/q;->s:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lqc/q;->t:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lqc/q;->u:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Lqc/q;->v:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lqc/q;->w:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lqc/q;->x:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lqc/q;->y:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{WorkSpec: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqc/q;->a:Ljava/lang/String;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
