.class public final Lt23/c1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lt23/e1;

.field public w:I

.field public x:I

.field public y:Lt23/e1;

.field public z:I


# direct methods
.method public constructor <init>(Lt23/e1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lt23/c1;->E:Lt23/e1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1

    new-instance p1, Lt23/c1;

    iget-object v0, p0, Lt23/c1;->E:Lt23/e1;

    invoke-direct {p1, v0, p2}, Lt23/c1;-><init>(Lt23/e1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lt23/c1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lt23/c1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lt23/c1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lt23/c1;->z:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    iget-object v4, p0, Lt23/c1;->E:Lt23/e1;

    const/4 v5, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v5, :cond_0

    iget v1, p0, Lt23/c1;->x:I

    iget v6, p0, Lt23/c1;->w:I

    iget-object v7, p0, Lt23/c1;->y:Lt23/e1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x5

    const/4 v1, 0x0

    move v6, p1

    move-object v7, v4

    :goto_0
    if-ge v1, v6, :cond_6

    add-int/lit8 p1, v1, 0x1

    int-to-long v8, p1

    const-wide/16 v10, 0x3e8

    mul-long/2addr v8, v10

    const-wide/16 v10, 0xbb8

    cmp-long p1, v8, v10

    if-gez p1, :cond_2

    move-wide v8, v10

    :cond_2
    iput-object v7, p0, Lt23/c1;->y:Lt23/e1;

    iput v6, p0, Lt23/c1;->w:I

    iput v1, p0, Lt23/c1;->x:I

    iput v5, p0, Lt23/c1;->z:I

    invoke-static {v8, v9, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    iget-object p1, v7, Lt23/e1;->o:Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt23/v0;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lt23/v0;->c:Ljava/util/List;

    iget-object v8, v7, Lt23/e1;->a:Lt23/x1;

    iget-object v8, v8, Lt23/x1;->b:Lt23/c0;

    iget-object v8, v8, Lt23/c0;->p:Lt23/s0;

    iget-object v8, v8, Lt23/s0;->J:Lec3/h2;

    invoke-virtual {v8}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/android/video/generated/models/CallSettingsResponse;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lio/getstream/android/video/generated/models/CallSettingsResponse;->getVideo()Lio/getstream/android/video/generated/models/VideoSettingsResponse;

    move-result-object v8

    goto :goto_2

    :cond_4
    move-object v8, v3

    :goto_2
    invoke-virtual {v7, p1, v8}, Lt23/e1;->i(Ljava/util/List;Lio/getstream/android/video/generated/models/VideoSettingsResponse;)Lorg/webrtc/CameraEnumerationAndroid$CaptureFormat;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v0, v7, Lt23/e1;->p:Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v3, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-virtual {v7}, Lt23/e1;->j()V

    return-object v2

    :cond_5
    add-int/2addr v1, v5

    goto :goto_0

    :cond_6
    invoke-virtual {v4}, Lt23/e1;->g()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v4, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "Resolution selection failed after 5 retries"

    invoke-interface {p1, v4, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object v2
.end method
