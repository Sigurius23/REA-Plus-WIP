.class public final Lio/sentry/android/replay/j;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JLjava/lang/Object;I)V
    .locals 0

    iput p5, p0, Lio/sentry/android/replay/j;->w:I

    iput-wide p2, p0, Lio/sentry/android/replay/j;->x:J

    iput-object p1, p0, Lio/sentry/android/replay/j;->y:Ljava/lang/Object;

    iput-object p4, p0, Lio/sentry/android/replay/j;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Lio/sentry/android/replay/j;->w:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v2, p1

    check-cast v2, Lk2/e;

    const-string v0, "$this$Canvas"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v7

    const/4 v11, 0x0

    const/16 v12, 0x7a

    iget-wide v3, v1, Lio/sentry/android/replay/j;->x:J

    const-wide/16 v5, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    iget-object v0, v1, Lio/sentry/android/replay/j;->y:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    iget-object v3, v1, Lio/sentry/android/replay/j;->z:Ljava/lang/Object;

    check-cast v3, Ly3/c;

    iget v4, v0, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    invoke-interface {v3, v4}, Ly3/c;->q0(F)F

    move-result v4

    const/high16 v5, 0x41400000    # 12.0f

    sub-float/2addr v4, v5

    iget v6, v0, Landroid/graphics/Rect;->top:I

    int-to-float v6, v6

    invoke-interface {v3, v6}, Ly3/c;->q0(F)F

    move-result v6

    sub-float/2addr v6, v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    invoke-interface {v3, v7}, Ly3/c;->q0(F)F

    move-result v7

    const/4 v8, 0x2

    int-to-float v8, v8

    mul-float/2addr v5, v8

    add-float/2addr v7, v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-float v0, v0

    invoke-interface {v3, v0}, Ly3/c;->q0(F)F

    move-result v0

    add-float/2addr v0, v5

    sget-wide v8, Li2/x;->m:J

    invoke-static {v4, v6}, Lge3/g;->c(FF)J

    move-result-wide v5

    invoke-static {v7, v0}, Ljc/x;->b(FF)J

    move-result-wide v3

    const/high16 v0, 0x41000000    # 8.0f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v10, v7

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v12, v0

    const/16 v0, 0x20

    shl-long/2addr v10, v0

    const-wide v14, 0xffffffffL

    and-long/2addr v12, v14

    or-long/2addr v10, v12

    const/4 v12, 0x0

    const/16 v13, 0x70

    move-wide/from16 v16, v8

    move-wide v7, v3

    move-wide/from16 v3, v16

    move-wide v9, v10

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/capture/i;

    iget-object v2, v1, Lio/sentry/android/replay/j;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/capture/f;

    const-string v3, "it"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/s6;

    iget-object v3, v0, Lio/sentry/s6;->U:Ljava/util/Date;

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    iget-wide v5, v1, Lio/sentry/android/replay/j;->x:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_3

    invoke-virtual {v2}, Lio/sentry/android/replay/capture/c;->h()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v2, v3}, Lio/sentry/android/replay/capture/c;->k(I)V

    iget-object v3, v0, Lio/sentry/s6;->P:Ljava/io/File;

    const-string v4, "Failed to delete replay segment: %s"

    iget-object v2, v2, Lio/sentry/android/replay/capture/f;->r:Lio/sentry/q6;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v0, v5, v4, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v5, v0, v4, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_0
    iget-object v0, v1, Lio/sentry/android/replay/j;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    const/4 v2, 0x1

    iput-boolean v2, v0, Lkotlin/jvm/internal/b0;->w:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/l;

    const-string v2, "it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v2, v0, Lio/sentry/android/replay/l;->b:J

    iget-wide v4, v1, Lio/sentry/android/replay/j;->x:J

    cmp-long v2, v2, v4

    if-gez v2, :cond_4

    iget-object v2, v1, Lio/sentry/android/replay/j;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/k;

    iget-object v0, v0, Lio/sentry/android/replay/l;->a:Ljava/io/File;

    invoke-virtual {v2, v0}, Lio/sentry/android/replay/k;->h(Ljava/io/File;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_4
    iget-object v2, v1, Lio/sentry/android/replay/j;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez v3, :cond_5

    iget-object v0, v0, Lio/sentry/android/replay/l;->c:Ljava/lang/String;

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :cond_5
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_2
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
