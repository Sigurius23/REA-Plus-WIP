.class public abstract Ld40/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld40/n;

.field public static final b:Ld40/n;

.field public static final c:Ld40/o;

.field public static final d:Ld40/s;

.field public static final e:Ld40/k;

.field public static final f:Ld40/c;

.field public static final g:Ld40/a;

.field public static final h:Ld40/a;

.field public static final i:Ld40/f;

.field public static final j:Ld40/f;

.field public static final k:Ld40/b;

.field public static final l:Ld40/b;

.field public static final m:Ld40/e;

.field public static final n:Ld40/d;

.field public static final o:Ld40/g;

.field public static final p:Ld40/g;

.field public static final q:Ld40/m;

.field public static final r:Ld40/h;


# direct methods
.method static constructor <clinit>()V
    .locals 56

    new-instance v0, Ld40/n;

    sget-wide v4, Li2/x;->f:J

    const v1, 0x33787880

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v10

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v12

    sget-wide v7, Li2/x;->b:J

    const-wide v1, 0x99000000L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v14

    const-wide v16, 0x993c3c43L

    invoke-static/range {v16 .. v17}, Li2/w0;->e(J)J

    move-result-wide v16

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v18

    const-wide v1, 0xff007affL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    move-wide v3, v4

    sget-wide v5, Li2/x;->g:J

    const/16 v9, 0xb9e

    invoke-static/range {v1 .. v9}, Lg1/d1;->d(JJJJI)Lg1/c1;

    move-result-object v1

    move-wide/from16 v20, v5

    move-wide v5, v10

    move-wide v9, v12

    move-wide v11, v7

    move-wide/from16 v54, v16

    move-object/from16 v17, v1

    move-wide v1, v3

    move-wide v3, v5

    move-wide v5, v9

    move-wide v9, v14

    move-wide/from16 v13, v54

    move-wide/from16 v15, v18

    invoke-direct/range {v0 .. v17}, Ld40/n;-><init>(JJJJJJJJLg1/c1;)V

    move-wide v9, v3

    move-object/from16 v19, v17

    move-wide v3, v1

    sput-object v0, Ld40/q;->a:Ld40/n;

    new-instance v0, Ld40/n;

    sget-wide v11, Li2/x;->c:J

    const-wide v1, 0xff787880L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v13

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v15

    const-wide v1, 0x99ffffffL

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v17

    const v1, 0x61ffffff

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v22

    const-wide v1, 0xff0074d4L

    invoke-static {v1, v2}, Li2/w0;->e(J)J

    move-result-wide v1

    const-wide v5, 0xff2e2e2eL

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    move-wide v7, v3

    move-wide v3, v5

    move-wide/from16 v5, v20

    invoke-static/range {v1 .. v8}, Lg1/d1;->c(JJJJ)Lg1/c1;

    move-result-object v1

    move-wide v3, v7

    move-wide v5, v11

    move-wide v7, v13

    move-wide v12, v3

    move-wide/from16 v54, v5

    move-wide v4, v3

    move-wide/from16 v2, v54

    move-wide/from16 v54, v15

    move-wide v14, v7

    move-wide v8, v9

    move-wide/from16 v6, v54

    move-wide/from16 v10, v17

    move-wide/from16 v16, v4

    move-object/from16 v18, v1

    move-wide/from16 v24, v8

    move-object v1, v0

    move-wide v8, v4

    move-wide v4, v14

    move-wide/from16 v14, v22

    invoke-direct/range {v1 .. v18}, Ld40/n;-><init>(JJJJJJJJLg1/c1;)V

    move-wide v13, v2

    move-wide v3, v8

    sput-object v1, Ld40/q;->b:Ld40/n;

    new-instance v0, Ld40/o;

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v12, 0x40c00000    # 6.0f

    invoke-direct {v0, v12, v12, v1}, Ld40/o;-><init>(FFF)V

    sput-object v0, Ld40/q;->c:Ld40/o;

    new-instance v26, Ld40/s;

    sget-object v0, Lp3/r;->F:Lp3/r;

    iget v0, v0, Lp3/r;->w:I

    sget-object v1, Lp3/r;->G:Lp3/r;

    iget v1, v1, Lp3/r;->w:I

    sget-object v2, Lp3/r;->I:Lp3/r;

    iget v2, v2, Lp3/r;->w:I

    const/16 v5, 0x9

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v31

    const/16 v5, 0xc

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v33

    const/16 v5, 0xd

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v35

    const/16 v5, 0xe

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v37

    const/16 v5, 0x10

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v39

    const/16 v5, 0x14

    invoke-static {v5}, Lv63/c;->h(I)J

    move-result-wide v41

    const/high16 v30, 0x3f800000    # 1.0f

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move/from16 v27, v0

    move/from16 v28, v1

    move/from16 v29, v2

    invoke-direct/range {v26 .. v50}, Ld40/s;-><init>(IIIFJJJJJJLjava/lang/Integer;Ll3/v0;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;Lp3/i;)V

    move-object/from16 v0, v43

    sput-object v26, Ld40/q;->d:Ld40/s;

    new-instance v15, Ld40/k;

    new-instance v1, Ld40/i;

    move-wide v4, v3

    invoke-virtual/range {v19 .. v19}, Lg1/c1;->f()J

    move-result-wide v2

    sget-wide v6, Li2/x;->m:J

    sget-wide v8, Ld40/r;->a:J

    move-wide v10, v4

    move-wide/from16 v51, v39

    invoke-direct/range {v1 .. v11}, Ld40/i;-><init>(JJJJJ)V

    move-wide v3, v4

    new-instance v2, Ld40/i;

    move-object v10, v1

    move-object v1, v2

    move-wide v4, v3

    invoke-virtual/range {v18 .. v18}, Lg1/c1;->f()J

    move-result-wide v2

    move-object/from16 v16, v10

    move-wide v10, v4

    move-object/from16 v53, v16

    invoke-direct/range {v1 .. v11}, Ld40/i;-><init>(JJJJJ)V

    new-instance v2, Ld40/j;

    const/high16 v3, 0x42400000    # 48.0f

    const/4 v4, 0x0

    invoke-direct {v2, v12, v4, v3}, Ld40/j;-><init>(FFF)V

    new-instance v3, Ld40/l;

    move-wide/from16 v5, v51

    invoke-direct {v3, v5, v6, v0}, Ld40/l;-><init>(JLjava/lang/Integer;)V

    move-object/from16 v10, v53

    invoke-direct {v15, v10, v1, v2, v3}, Ld40/k;-><init>(Ld40/i;Ld40/i;Ld40/j;Ld40/l;)V

    sput-object v15, Ld40/q;->e:Ld40/k;

    new-instance v0, Ld40/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld40/q;->f:Ld40/c;

    new-instance v0, Ld40/a;

    invoke-virtual/range {v19 .. v19}, Lg1/c1;->f()J

    move-result-wide v1

    move-wide/from16 v5, v24

    invoke-direct {v0, v5, v6, v1, v2}, Ld40/a;-><init>(JJ)V

    sput-object v0, Ld40/q;->g:Ld40/a;

    new-instance v0, Ld40/a;

    sget-wide v1, Ld40/r;->b:J

    invoke-virtual/range {v18 .. v18}, Lg1/c1;->f()J

    move-result-wide v7

    invoke-direct {v0, v1, v2, v7, v8}, Ld40/a;-><init>(JJ)V

    sput-object v0, Ld40/q;->h:Ld40/a;

    invoke-virtual/range {v19 .. v19}, Lg1/c1;->f()J

    move-result-wide v9

    move-wide v7, v5

    new-instance v6, Ld40/f;

    move-wide v11, v7

    invoke-direct/range {v6 .. v12}, Ld40/f;-><init>(JJJ)V

    move-object v0, v6

    move-wide v5, v7

    sput-object v0, Ld40/q;->i:Ld40/f;

    invoke-virtual/range {v18 .. v18}, Lg1/c1;->f()J

    move-result-wide v23

    new-instance v20, Ld40/f;

    move-wide/from16 v25, v1

    move-wide/from16 v21, v1

    invoke-direct/range {v20 .. v26}, Ld40/f;-><init>(JJJ)V

    move-wide/from16 v0, v21

    sput-object v20, Ld40/q;->j:Ld40/f;

    new-instance v2, Ld40/b;

    invoke-direct {v2, v5, v6, v13, v14}, Ld40/b;-><init>(JJ)V

    sput-object v2, Ld40/q;->k:Ld40/b;

    new-instance v2, Ld40/b;

    sget-wide v5, Li2/x;->e:J

    invoke-direct {v2, v0, v1, v5, v6}, Ld40/b;-><init>(JJ)V

    sput-object v2, Ld40/q;->l:Ld40/b;

    new-instance v0, Ld40/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld40/q;->m:Ld40/e;

    new-instance v0, Ld40/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ld40/q;->n:Ld40/d;

    new-instance v0, Ld40/g;

    const/high16 v1, 0x42200000    # 40.0f

    const/high16 v2, 0x41a00000    # 20.0f

    invoke-direct {v0, v2, v4, v2, v1}, Ld40/g;-><init>(FFFF)V

    sput-object v0, Ld40/q;->o:Ld40/g;

    new-instance v0, Ld40/g;

    const/high16 v1, 0x41800000    # 16.0f

    const/high16 v3, 0x41200000    # 10.0f

    const/high16 v4, 0x41400000    # 12.0f

    invoke-direct {v0, v1, v2, v4, v3}, Ld40/g;-><init>(FFFF)V

    sput-object v0, Ld40/q;->p:Ld40/g;

    sget-object v0, Ld40/m;->w:Ld40/m;

    sput-object v0, Ld40/q;->q:Ld40/m;

    sget-object v0, Ld40/h;->w:Ld40/h;

    sput-object v0, Ld40/q;->r:Ld40/h;

    return-void
.end method
