.class public final synthetic Lf0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:J

.field public final synthetic G:J

.field public final synthetic H:Lk2/i;

.field public final synthetic w:Z

.field public final synthetic x:Li2/t;

.field public final synthetic y:J

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(ZLi2/t;JFFJJLk2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lf0/q;->w:Z

    iput-object p2, p0, Lf0/q;->x:Li2/t;

    iput-wide p3, p0, Lf0/q;->y:J

    iput p5, p0, Lf0/q;->z:F

    iput p6, p0, Lf0/q;->E:F

    iput-wide p7, p0, Lf0/q;->F:J

    iput-wide p9, p0, Lf0/q;->G:J

    iput-object p11, p0, Lf0/q;->H:Lk2/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    check-cast v0, Lk2/c;

    move-object v2, v0

    check-cast v2, La3/p0;

    invoke-virtual {v2}, La3/p0;->a()V

    iget-object v0, v2, La3/p0;->w:Lk2/b;

    iget-boolean v3, v1, Lf0/q;->w:Z

    move v4, v3

    iget-object v3, v1, Lf0/q;->x:Li2/t;

    iget-wide v8, v1, Lf0/q;->y:J

    if-eqz v4, :cond_0

    const/4 v11, 0x0

    const/16 v12, 0xf6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    goto/16 :goto_1

    :cond_0
    const/16 v4, 0x20

    shr-long v5, v8, v4

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    iget v6, v1, Lf0/q;->z:F

    cmpg-float v5, v5, v6

    if-gez v5, :cond_1

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    shr-long v4, v5, v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    iget v11, v1, Lf0/q;->E:F

    sub-float v13, v4, v11

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    sub-float v14, v4, v11

    iget-object v4, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v4}, La3/p;->A()J

    move-result-wide v5

    invoke-virtual {v4}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v4, La3/p;->x:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Laj/d;

    const/4 v15, 0x0

    move v12, v11

    invoke-virtual/range {v10 .. v15}, Laj/d;->d(FFFFI)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v11, 0x0

    const/16 v12, 0xf6

    move-wide v13, v5

    move-object v6, v4

    const-wide/16 v4, 0x0

    move-object v10, v6

    const-wide/16 v6, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    :try_start_1
    invoke-static/range {v2 .. v12}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v15, v13, v14}, Ld;->z(La3/p;J)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v15, v4

    move-wide v13, v5

    :goto_0
    invoke-static {v15, v13, v14}, Ld;->z(La3/p;J)V

    throw v0

    :cond_1
    invoke-static {v6, v8, v9}, Lge3/g;->T(FJ)J

    move-result-wide v8

    const/4 v10, 0x0

    const/16 v12, 0xd0

    iget-wide v4, v1, Lf0/q;->F:J

    iget-wide v6, v1, Lf0/q;->G:J

    iget-object v11, v1, Lf0/q;->H:Lk2/i;

    invoke-static/range {v2 .. v12}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
