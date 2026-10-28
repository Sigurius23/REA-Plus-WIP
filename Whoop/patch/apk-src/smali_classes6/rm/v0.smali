.class public final Lrm/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final t:Lsn/v;


# instance fields
.field public final a:Lrm/o1;

.field public final b:Lsn/v;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lcom/google/android/exoplayer2/ExoPlaybackException;

.field public final g:Z

.field public final h:Lsn/x0;

.field public final i:Lio/x;

.field public final j:Ljava/util/List;

.field public final k:Lsn/v;

.field public final l:Z

.field public final m:I

.field public final n:Lrm/w0;

.field public final o:Z

.field public final p:Z

.field public volatile q:J

.field public volatile r:J

.field public volatile s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsn/v;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lsn/v;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lrm/v0;->t:Lsn/v;

    return-void
.end method

.method public constructor <init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/v0;->a:Lrm/o1;

    iput-object p2, p0, Lrm/v0;->b:Lsn/v;

    iput-wide p3, p0, Lrm/v0;->c:J

    iput-wide p5, p0, Lrm/v0;->d:J

    iput p7, p0, Lrm/v0;->e:I

    iput-object p8, p0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iput-boolean p9, p0, Lrm/v0;->g:Z

    iput-object p10, p0, Lrm/v0;->h:Lsn/x0;

    iput-object p11, p0, Lrm/v0;->i:Lio/x;

    iput-object p12, p0, Lrm/v0;->j:Ljava/util/List;

    iput-object p13, p0, Lrm/v0;->k:Lsn/v;

    iput-boolean p14, p0, Lrm/v0;->l:Z

    iput p15, p0, Lrm/v0;->m:I

    move-object/from16 p1, p16

    iput-object p1, p0, Lrm/v0;->n:Lrm/w0;

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lrm/v0;->q:J

    move-wide/from16 p1, p19

    iput-wide p1, p0, Lrm/v0;->r:J

    move-wide/from16 p1, p21

    iput-wide p1, p0, Lrm/v0;->s:J

    move/from16 p1, p23

    iput-boolean p1, p0, Lrm/v0;->o:Z

    move/from16 p1, p24

    iput-boolean p1, p0, Lrm/v0;->p:Z

    return-void
.end method

.method public static i(Lio/x;)Lrm/v0;
    .locals 25

    new-instance v0, Lrm/v0;

    sget-object v10, Lsn/x0;->z:Lsn/x0;

    sget-object v12, Lzr/w0;->E:Lzr/w0;

    sget-object v16, Lrm/w0;->z:Lrm/w0;

    const/16 v23, 0x0

    const/16 v24, 0x0

    sget-object v1, Lrm/o1;->w:Lrm/l1;

    sget-object v2, Lrm/v0;->t:Lsn/v;

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    move-object v13, v2

    move-object/from16 v11, p0

    invoke-direct/range {v0 .. v24}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    return-object v0
.end method


# virtual methods
.method public final a(Lsn/v;)Lrm/v0;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    iget v14, v0, Lrm/v0;->m:I

    move-object/from16 v16, v1

    iget-object v1, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v23, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move/from16 v25, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v18

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-wide/from16 v22, v23

    move/from16 v24, v1

    move-object/from16 v1, v16

    move/from16 v16, v14

    move-object/from16 v14, p1

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final b(Lsn/v;JJJJLsn/x0;Lio/x;Ljava/util/List;)Lrm/v0;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    iget v3, v0, Lrm/v0;->m:I

    iget-object v4, v0, Lrm/v0;->n:Lrm/w0;

    iget-wide v5, v0, Lrm/v0;->q:J

    iget-boolean v7, v0, Lrm/v0;->o:Z

    iget-boolean v11, v0, Lrm/v0;->p:Z

    move-wide/from16 v22, p2

    move-wide/from16 v20, p8

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v16, v3

    move-object/from16 v17, v4

    move-wide/from16 v18, v5

    move/from16 v24, v7

    move/from16 v25, v11

    move-object/from16 v3, p1

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    return-object v1
.end method

.method public final c(Z)Lrm/v0;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    move-object/from16 v16, v1

    iget v1, v0, Lrm/v0;->m:I

    move/from16 v17, v1

    iget-object v1, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v19, v1

    move-object/from16 v18, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v22, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v24, v1

    iget-boolean v1, v0, Lrm/v0;->p:Z

    move-object/from16 v2, v18

    move-wide/from16 v26, v24

    move/from16 v24, p1

    move/from16 v25, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v19

    move-wide/from16 v18, v20

    move-wide/from16 v20, v22

    move-wide/from16 v22, v26

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final d(IZ)Lrm/v0;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-object v15, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v16, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move/from16 v24, v1

    move/from16 v25, v2

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    move/from16 v16, p1

    move-object/from16 v17, v15

    move/from16 v15, p2

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final e(Lcom/google/android/exoplayer2/ExoPlaybackException;)Lrm/v0;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    iget v9, v0, Lrm/v0;->m:I

    move-object/from16 v16, v1

    iget-object v1, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v23, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move/from16 v25, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v18

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-wide/from16 v22, v23

    move/from16 v24, v1

    move-object/from16 v1, v16

    move/from16 v16, v9

    move-object/from16 v9, p1

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final f(Lrm/w0;)Lrm/v0;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    move-object/from16 v16, v1

    iget v1, v0, Lrm/v0;->m:I

    move/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v23, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move-wide/from16 v26, v23

    move/from16 v24, v1

    move-object/from16 v1, v16

    move/from16 v16, v18

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-wide/from16 v22, v26

    move/from16 v25, v2

    move-object/from16 v2, v17

    move-object/from16 v17, p1

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final g(I)Lrm/v0;
    .locals 26

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v2, v0, Lrm/v0;->a:Lrm/o1;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    iget v8, v0, Lrm/v0;->m:I

    move-object/from16 v16, v1

    iget-object v1, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v18, v1

    move-object/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v23, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move/from16 v25, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v18

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-wide/from16 v22, v23

    move/from16 v24, v1

    move-object/from16 v1, v16

    move/from16 v16, v8

    move/from16 v8, p1

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final h(Lrm/o1;)Lrm/v0;
    .locals 28

    move-object/from16 v0, p0

    new-instance v1, Lrm/v0;

    iget-object v3, v0, Lrm/v0;->b:Lsn/v;

    iget-wide v4, v0, Lrm/v0;->c:J

    iget-wide v6, v0, Lrm/v0;->d:J

    iget v8, v0, Lrm/v0;->e:I

    iget-object v9, v0, Lrm/v0;->f:Lcom/google/android/exoplayer2/ExoPlaybackException;

    iget-boolean v10, v0, Lrm/v0;->g:Z

    iget-object v11, v0, Lrm/v0;->h:Lsn/x0;

    iget-object v12, v0, Lrm/v0;->i:Lio/x;

    iget-object v13, v0, Lrm/v0;->j:Ljava/util/List;

    iget-object v14, v0, Lrm/v0;->k:Lsn/v;

    iget-boolean v15, v0, Lrm/v0;->l:Z

    iget v2, v0, Lrm/v0;->m:I

    move-object/from16 v16, v1

    iget-object v1, v0, Lrm/v0;->n:Lrm/w0;

    move-object/from16 v18, v1

    move/from16 v17, v2

    iget-wide v1, v0, Lrm/v0;->q:J

    move-wide/from16 v19, v1

    iget-wide v1, v0, Lrm/v0;->r:J

    move-wide/from16 v21, v1

    iget-wide v1, v0, Lrm/v0;->s:J

    move-wide/from16 v23, v1

    iget-boolean v1, v0, Lrm/v0;->o:Z

    iget-boolean v2, v0, Lrm/v0;->p:Z

    move-wide/from16 v26, v23

    move/from16 v24, v1

    move-object/from16 v1, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    move-wide/from16 v18, v19

    move-wide/from16 v20, v21

    move-wide/from16 v22, v26

    move/from16 v25, v2

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v25}, Lrm/v0;-><init>(Lrm/o1;Lsn/v;JJILcom/google/android/exoplayer2/ExoPlaybackException;ZLsn/x0;Lio/x;Ljava/util/List;Lsn/v;ZILrm/w0;JJJZZ)V

    move-object/from16 v16, v1

    return-object v16
.end method
