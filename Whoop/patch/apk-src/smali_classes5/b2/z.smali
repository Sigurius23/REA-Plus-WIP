.class public final Lb2/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lb2/z;->w:I

    iput-object p2, p0, Lb2/z;->x:Ljava/lang/Object;

    iput-object p3, p0, Lb2/z;->y:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lb2/z;->w:I

    const/4 v2, -0x1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Landroid/net/ConnectivityManager;

    const-string v2, "$this$callWithSecurityExceptionHandling"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Landroid/net/NetworkRequest;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-virtual {v0, v2, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ln23/e;

    const-string v2, "parseChatError"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Video:VideoParser"

    sget-object v4, Lb23/i;->a:Lb23/i;

    sget-object v4, Lb23/i;->d:Lb23/e;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v6, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lb23/i;->c:Lb23/j;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "[decode#recover] raw: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v2, v7, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Ld1/j;

    iget-object v4, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const-class v6, Lx43/j;

    invoke-virtual {v2, v4, v6}, Ld1/j;->v(Ljava/lang/String;Ljava/lang/Class;)Ln23/h;

    move-result-object v2

    instance-of v4, v2, Ln23/g;

    if-nez v4, :cond_2

    instance-of v2, v2, Ln23/f;

    if-eqz v2, :cond_1

    sget-object v2, Lu33/e;->G:Lu33/e;

    invoke-static {v0}, Lse/h;->B(Ln23/e;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object v0

    new-instance v2, Lx43/m;

    invoke-direct {v2, v0, v5}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    return-object v2

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    check-cast v2, Ln23/g;

    iget-object v0, v2, Ln23/g;->a:Ljava/lang/Object;

    invoke-static {v0}, Lnh3/a;->d(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    move-result-object v0

    throw v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lud3/f1;

    const-string v2, "it"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lq/f;

    iget-object v2, v2, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Lud3/l0;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Lud3/o0;

    invoke-virtual {v2, v3, v0}, Lud3/l0;->c(Lud3/o0;Lud3/f1;)Lle3/g;

    move-result-object v0

    return-object v0

    :pswitch_2
    const-string v0, "onTouchEvent"

    move-object/from16 v2, p1

    check-cast v2, Landroid/view/MotionEvent;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Lu2/y;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    if-nez v4, :cond_5

    iget-object v4, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v4, Lq/f;

    iget-object v3, v3, Lu2/y;->w:Lb4/e;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2}, Lb4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lu2/w;->x:Lu2/w;

    goto :goto_0

    :cond_3
    sget-object v0, Lu2/w;->y:Lu2/w;

    :goto_0
    iput-object v0, v4, Lq/f;->y:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :cond_5
    iget-object v3, v3, Lu2/y;->w:Lb4/e;

    if-eqz v3, :cond_6

    invoke-virtual {v3, v2}, Lb4/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_6
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v5

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    const-string v2, "newText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    iget-object v4, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v4, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0, v0}, Lcom/amplitude/android/engagement/types/SurveyResponseText;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    const-string v2, "newText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    iget-object v4, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v4, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0, v0}, Lcom/amplitude/android/engagement/types/SurveyResponseText;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_5
    move-object/from16 v0, p1

    check-cast v0, Landroid/content/Context;

    const-string v3, "it"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/webkit/WebView;

    iget-object v3, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4}, Landroid/webkit/WebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v2, Landroid/webkit/WebViewClient;

    invoke-direct {v2}, Landroid/webkit/WebViewClient;-><init>()V

    invoke-virtual {v0, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v0, v3}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Landroid/content/Context;

    const-string v3, "it"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/media3/ui/PlayerView;

    iget-object v3, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3, v5}, Landroidx/media3/ui/PlayerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/media3/exoplayer/ExoPlayer;

    invoke-virtual {v0, v3}, Landroidx/media3/ui/PlayerView;->setPlayer(Lu8/j0;)V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v6}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Ly2/y;

    const-string v2, "coordinates"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Ly3/c;

    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-interface {v2, v3}, Ly3/c;->e0(I)F

    move-result v3

    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v4

    const/16 v0, 0x20

    shr-long/2addr v4, v0

    long-to-int v0, v4

    invoke-interface {v2, v0}, Ly3/c;->e0(I)F

    move-result v0

    iget-object v2, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v2, Lp1/c1;

    float-to-int v0, v0

    float-to-int v3, v3

    invoke-static {v0, v3}, Lv63/b;->a(II)J

    move-result-wide v3

    new-instance v0, Ly3/l;

    invoke-direct {v0, v3, v4}, Ly3/l;-><init>(J)V

    invoke-interface {v2, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Li2/g0;

    const-string v2, "$this$graphicsLayer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    check-cast v0, Li2/x0;

    invoke-virtual {v0, v3}, Li2/x0;->p(F)V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v0, v2}, Li2/x0;->r(F)V

    iget-object v2, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v0, v2}, Li2/x0;->a(F)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    sget-object v0, Lhj/v;->E:Lhj/v;

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v3, Lmj/g;

    iget-object v3, v3, Lmj/g;->a:Lcom/amplitude/android/engagement/a;

    iget-object v4, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v4, Lp1/c1;

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v6}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    const/4 v4, 0x4

    if-eqz v2, :cond_8

    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    iget-object v6, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v6, Lhj/v;

    iget v6, v6, Lhj/v;->w:I

    if-le v4, v6, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "AmplitudeEngagement.sdk[internal]#restartDebugSession()"

    invoke-virtual {v2, v0, v4}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_2
    iget-object v0, v3, Lcom/amplitude/android/engagement/a;->i:Lec3/h2;

    invoke-virtual {v0, v5}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, v3, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v2, "globalThis.nudgeActions.restartDebugSession()"

    invoke-virtual {v0, v2, v5}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    goto :goto_4

    :cond_8
    sget-object v2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    iget-object v6, v2, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    check-cast v6, Lhj/v;

    iget v6, v6, Lhj/v;->w:I

    if-le v4, v6, :cond_9

    goto :goto_3

    :cond_9
    const-string v4, "AmplitudeEngagement.sdk[internal]#stopDebugSession()"

    invoke-virtual {v2, v0, v4}, Lcom/google/crypto/tink/internal/l0;->Z(Lhj/v;Ljava/lang/String;)V

    :goto_3
    iget-object v0, v3, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v2, "globalThis.nudgeActions.stopDebugSession()"

    invoke-virtual {v0, v2, v5}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/capture/k;

    iget-object v3, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/replay/capture/o;

    const-string v4, "segment"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v0, Lio/sentry/android/replay/capture/i;

    if-eqz v4, :cond_a

    check-cast v0, Lio/sentry/android/replay/capture/i;

    iget-object v4, v3, Lio/sentry/android/replay/capture/o;->s:Lio/sentry/d1;

    invoke-static {v0, v4}, Lio/sentry/android/replay/capture/i;->b(Lio/sentry/android/replay/capture/i;Lio/sentry/d1;)V

    :cond_a
    invoke-virtual {v3, v2}, Lio/sentry/android/replay/capture/c;->k(I)V

    iget-object v0, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Lge3/g;->r(Ljava/io/File;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/rrweb/b;

    const-string v2, "event"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v2, v0, Lio/sentry/rrweb/b;->x:J

    iget-object v4, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/Date;

    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_b

    iget-object v2, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/capture/k;

    const-string v2, "segment"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/capture/f;

    iget-object v3, v2, Lio/sentry/android/replay/capture/f;->v:Ljava/util/ArrayList;

    iget-object v2, v2, Lio/sentry/android/replay/capture/f;->s:Lio/sentry/d1;

    invoke-static {v3}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/capture/i;

    :goto_5
    if-eqz v4, :cond_c

    invoke-static {v4, v2}, Lio/sentry/android/replay/capture/i;->b(Lio/sentry/android/replay/capture/i;Lio/sentry/d1;)V

    invoke-static {v3}, Lm83/s;->k1(Ljava/util/ArrayList;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/capture/i;

    const-wide/16 v5, 0x64

    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_5

    :cond_c
    instance-of v3, v0, Lio/sentry/android/replay/capture/i;

    if-eqz v3, :cond_d

    check-cast v0, Lio/sentry/android/replay/capture/i;

    invoke-static {v0, v2}, Lio/sentry/android/replay/capture/i;->b(Lio/sentry/android/replay/capture/i;Lio/sentry/d1;)V

    iget-object v2, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v2, La0/a1;

    iget-object v0, v0, Lio/sentry/android/replay/capture/i;->a:Lio/sentry/s6;

    iget-object v0, v0, Lio/sentry/s6;->U:Ljava/util/Date;

    const-string v3, "getTimestamp(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, La0/a1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lz43/b;

    const-string v2, "$this$invoke"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Li53/j;

    iput-object v2, v0, Lz43/b;->a:Ljava/lang/Object;

    new-instance v2, Lh53/h;

    iget-object v5, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v5, Lqg3/d;

    invoke-direct {v2, v5, v4}, Lh53/h;-><init>(Lqg3/d;I)V

    iput-object v2, v0, Lz43/b;->c:Lkotlin/jvm/internal/m;

    iget-object v0, v0, Lz43/b;->b:Ljava/util/LinkedHashMap;

    const-class v2, Li53/b;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    sget-object v8, Lh53/i;->x:Lh53/i;

    const-class v9, Li53/k;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->y:Lh53/i;

    const-class v10, Li53/l;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->z:Lh53/i;

    const-class v11, Li53/r;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v12, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->E:Lh53/i;

    const-class v12, Li53/n;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v13, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->F:Lh53/i;

    const-class v13, Li53/q;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v14, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->G:Lh53/i;

    const-class v14, Li53/m;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v15, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v8, Lh53/i;->H:Lh53/i;

    const-class v15, Li53/o;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v8}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->I:Lh53/i;

    const-class v8, Li53/p;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/a;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lh53/i;->J:Lh53/i;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->K:Lh53/i;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->L:Lh53/i;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->M:Lh53/i;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->N:Lh53/i;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->O:Lh53/i;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->P:Lh53/i;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/g;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lh53/i;->Q:Lh53/i;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->R:Lh53/i;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/f;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lh53/i;->S:Lh53/i;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->T:Lh53/i;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->U:Lh53/i;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lh53/h;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Lh53/h;-><init>(Lqg3/d;I)V

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->V:Lh53/i;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->W:Lh53/i;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/h;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lh53/i;->X:Lh53/i;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->Y:Lh53/i;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->Z:Lh53/i;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->a0:Lh53/i;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->b0:Lh53/i;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->c0:Lh53/i;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lh53/i;->d0:Lh53/i;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/c;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Lh53/h;

    invoke-direct {v6, v5, v3}, Lh53/h;-><init>(Lqg3/d;I)V

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/i;->e0:Lh53/i;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/e;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lh53/j;->x:Lh53/j;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->y:Lh53/j;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->z:Lh53/j;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->E:Lh53/j;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->F:Lh53/j;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->G:Lh53/j;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->H:Lh53/j;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->I:Lh53/j;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Li53/d;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lh53/j;->J:Lh53/j;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lh53/j;->K:Lh53/j;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Lfv/a;

    const-string v1, "$this$cameraAnimationsPlugin"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lcom/mapbox/maps/CameraOptions;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Lfv/p;

    check-cast v0, Lfv/h;

    invoke-virtual {v0, v2, v3, v5}, Lfv/h;->h(Lcom/mapbox/maps/CameraOptions;Lfv/p;Landroid/animation/AnimatorListenerAdapter;)Lcom/mapbox/common/Cancelable;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Lz43/b;

    const-string v2, "$this$invoke"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lg53/m;

    iput-object v2, v0, Lz43/b;->a:Ljava/lang/Object;

    new-instance v2, Lf53/o;

    iget-object v5, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v5, Lio/sentry/internal/debugmeta/c;

    invoke-direct {v2, v5, v4}, Lf53/o;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    iput-object v2, v0, Lz43/b;->c:Lkotlin/jvm/internal/m;

    iget-object v0, v0, Lz43/b;->b:Ljava/util/LinkedHashMap;

    const-class v2, Lg53/l;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    sget-object v7, Lf53/n;->z:Lf53/n;

    const-class v8, Lg53/n;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->E:Lf53/n;

    const-class v9, Lg53/o;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v10, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->F:Lf53/n;

    const-class v10, Lg53/w;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v11, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->G:Lf53/n;

    const-class v11, Lg53/r;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v12, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->H:Lf53/n;

    const-class v12, Lg53/v;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v13, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->I:Lf53/n;

    const-class v13, Lg53/q;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v14, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->J:Lf53/n;

    const-class v14, Lg53/s;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lf53/n;->K:Lf53/n;

    const-class v15, Lg53/u;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v3, v7}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/d;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lf53/n;->L:Lf53/n;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->M:Lf53/n;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->N:Lf53/n;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->O:Lf53/n;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->P:Lf53/n;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->Q:Lf53/n;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->R:Lf53/n;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->S:Lf53/n;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/c;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lf53/n;->T:Lf53/n;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->U:Lf53/n;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->V:Lf53/n;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->W:Lf53/n;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->X:Lf53/n;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->Y:Lf53/n;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->Z:Lf53/n;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/i;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lf53/n;->a0:Lf53/n;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->b0:Lf53/n;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->c0:Lf53/n;

    const-class v7, Lg53/t;

    invoke-virtual {v4, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/h;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lf53/n;->d0:Lf53/n;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/n;->e0:Lf53/n;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->x:Lf53/p;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->y:Lf53/p;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->z:Lf53/p;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->E:Lf53/p;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->F:Lf53/p;

    const-class v7, Lg53/p;

    invoke-virtual {v4, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/j;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v6, Lf53/p;->G:Lf53/p;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->H:Lf53/p;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->I:Lf53/p;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->J:Lf53/p;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->K:Lf53/p;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->L:Lf53/p;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Lf53/p;->M:Lf53/p;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/e;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Lf53/o;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Lf53/o;-><init>(Lio/sentry/internal/debugmeta/c;I)V

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v3, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->N:Lf53/p;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/g;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lf53/p;->O:Lf53/p;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->P:Lf53/p;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->Q:Lf53/p;

    invoke-virtual {v4, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->R:Lf53/p;

    invoke-virtual {v4, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->S:Lf53/p;

    invoke-virtual {v4, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->T:Lf53/p;

    invoke-virtual {v4, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->U:Lf53/p;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/p;->V:Lf53/p;

    invoke-virtual {v4, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Lg53/f;

    invoke-virtual {v4, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lf53/n;->x:Lf53/n;

    invoke-virtual {v4, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lf53/n;->y:Lf53/n;

    invoke-virtual {v4, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v3, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Lx43/k;

    const-string v1, "listener"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lf53/j;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Lg53/m;

    check-cast v3, Lg53/k;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v2, v3, Lg53/e;

    if-eqz v2, :cond_e

    const/4 v2, 0x1

    goto :goto_6

    :cond_e
    instance-of v2, v3, Lg53/i;

    :goto_6
    if-eqz v2, :cond_f

    sget-object v2, Lu33/a;->w:Lu33/a;

    goto :goto_7

    :cond_f
    instance-of v2, v3, Lg53/h;

    if-eqz v2, :cond_10

    sget-object v2, Lu33/c;->w:Lu33/c;

    goto :goto_7

    :cond_10
    instance-of v2, v3, Lg53/f;

    if-eqz v2, :cond_11

    new-instance v2, Lu33/d;

    const/4 v7, 0x1

    invoke-direct {v2, v7}, Lu33/d;-><init>(I)V

    goto :goto_7

    :cond_11
    instance-of v2, v3, Lg53/g;

    if-eqz v2, :cond_12

    new-instance v2, Lu33/b;

    check-cast v3, Lg53/g;

    iget-object v3, v3, Lg53/g;->a:Ln23/c;

    invoke-direct {v2, v3}, Lu33/b;-><init>(Ln23/c;)V

    goto :goto_7

    :cond_12
    instance-of v2, v3, Lg53/j;

    if-eqz v2, :cond_13

    sget-object v2, Lu33/d;->x:Lu33/d;

    :goto_7
    invoke-virtual {v0, v2}, Lx43/k;->f(Ls40/e0;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v0, Leu/g;

    iget-object v2, v0, Leu/g;->d:Ljava/lang/Object;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Llo/r;

    monitor-enter v2

    :try_start_0
    iget-object v4, v0, Leu/g;->f:Leu/d;

    if-ne v4, v3, :cond_14

    iput-object v5, v0, Leu/g;->f:Leu/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    goto :goto_9

    :cond_14
    :goto_8
    monitor-exit v2

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_9
    monitor-exit v2

    throw v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Leb/q;

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Leb/i1;

    const-string v3, "backStackEntry"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Leb/q;->x:Leb/n0;

    if-eqz v3, :cond_15

    goto :goto_a

    :cond_15
    move-object v3, v5

    :goto_a
    if-nez v3, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual {v0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v4

    iget-object v6, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v6, Leb/x0;

    invoke-virtual {v2, v3, v4, v6}, Leb/i1;->c(Leb/n0;Landroid/os/Bundle;Leb/x0;)Leb/n0;

    move-result-object v4

    if-nez v4, :cond_17

    goto :goto_b

    :cond_17
    invoke-virtual {v4, v3}, Leb/n0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    move-object v5, v0

    goto :goto_b

    :cond_18
    invoke-virtual {v2}, Leb/i1;->b()Leb/t;

    move-result-object v2

    invoke-virtual {v0}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v4, v0}, Leb/n0;->c(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    iget-object v2, v2, Leb/t;->h:Leb/a0;

    iget-object v3, v2, Leb/a0;->a:Landroid/content/Context;

    invoke-virtual {v2}, Leb/a0;->l()Landroidx/lifecycle/w;

    move-result-object v5

    iget-object v2, v2, Leb/a0;->q:Leb/b0;

    invoke-static {v3, v4, v0, v5, v2}, Lio/sentry/hints/j;->o(Landroid/content/Context;Leb/n0;Landroid/os/Bundle;Landroidx/lifecycle/w;Leb/b0;)Leb/q;

    move-result-object v5

    :goto_b
    return-object v5

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Leb/y0;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Leb/a0;

    const-string v6, "$this$navOptions"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Leb/y0;->a:Leb/w0;

    iput v4, v6, Leb/w0;->g:I

    iput v4, v6, Leb/w0;->h:I

    iput v2, v6, Leb/w0;->i:I

    iput v2, v6, Leb/w0;->j:I

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Leb/n0;

    instance-of v6, v2, Leb/r0;

    if-eqz v6, :cond_1c

    sget v6, Leb/n0;->K:I

    invoke-static {v2}, Lts/o;->y(Leb/n0;)Lxb3/i;

    move-result-object v2

    invoke-interface {v2}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Leb/n0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v7

    if-eqz v7, :cond_1a

    iget-object v7, v7, Leb/n0;->x:Leb/r0;

    goto :goto_c

    :cond_1a
    move-object v7, v5

    :goto_c
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_d

    :cond_1b
    sget v2, Leb/r0;->P:I

    invoke-virtual {v3}, Leb/a0;->k()Leb/r0;

    move-result-object v2

    sget-object v3, Leb/v;->F:Leb/v;

    invoke-static {v2, v3}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object v2

    invoke-static {v2}, Lxb3/k;->z(Lxb3/i;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/n0;

    iget v2, v2, Leb/n0;->H:I

    iput v2, v0, Leb/y0;->d:I

    iput-boolean v4, v0, Leb/y0;->f:Z

    new-instance v2, Leb/k1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x1

    iput-boolean v7, v2, Leb/k1;->b:Z

    iget-boolean v3, v2, Leb/k1;->a:Z

    iput-boolean v3, v0, Leb/y0;->f:Z

    iget-boolean v2, v2, Leb/k1;->b:Z

    iput-boolean v2, v0, Leb/y0;->g:Z

    :cond_1c
    :goto_d
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Lp1/i0;

    iget-object v0, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v0, Lc4/f0;

    iget-object v2, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v2, Lc4/i0;

    invoke-virtual {v0, v2}, Lc4/f0;->setPositionProvider(Lc4/i0;)V

    invoke-virtual {v0}, Lc4/f0;->n()V

    new-instance v0, Lc4/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, La3/n0;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    invoke-interface {v0, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2, v0}, La3/n0;->E0(Landroidx/compose/ui/Modifier;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Lb01/f;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Lb01/f;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Landroid/view/View;

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getNextFocusForwardId()I

    move-result v3

    new-instance v6, Lb3/y;

    const/4 v7, 0x1

    invoke-direct {v6, v3, v7}, Lb3/y;-><init>(II)V

    move-object v3, v5

    :goto_e
    invoke-static {v0, v6, v3}, Ldp/d;->B(Landroid/view/View;Lkotlin/jvm/functions/Function1;Landroid/view/View;)Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_1f

    if-ne v0, v2, :cond_1d

    goto :goto_f

    :cond_1d
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-eqz v3, :cond_20

    instance-of v7, v3, Landroid/view/View;

    if-nez v7, :cond_1e

    goto :goto_10

    :cond_1e
    check-cast v3, Landroid/view/View;

    move-object/from16 v16, v3

    move-object v3, v0

    move-object/from16 v0, v16

    goto :goto_e

    :cond_1f
    :goto_f
    move-object v5, v3

    :cond_20
    :goto_10
    iget-object v0, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    if-ne v5, v0, :cond_21

    const/4 v4, 0x1

    :cond_21
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    iget-object v0, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v0, Lb3/i2;

    iget-object v2, v0, Lb3/i2;->c:Ljava/lang/Object;

    monitor-enter v2

    const/4 v7, 0x1

    :try_start_1
    iput-boolean v7, v0, Lb3/i2;->e:Z

    iget-object v3, v0, Lb3/i2;->d:Lr1/c;

    iget-object v6, v3, Lr1/c;->w:[Ljava/lang/Object;

    iget v3, v3, Lr1/c;->y:I

    :goto_11
    if-ge v4, v3, :cond_23

    aget-object v7, v6, v4

    check-cast v7, La3/r2;

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq3/o;

    if-eqz v7, :cond_22

    iget-object v8, v7, Lq3/o;->b:Ld1/p;

    if-eqz v8, :cond_22

    invoke-virtual {v7, v8}, Lq3/o;->a(Ld1/p;)V

    iput-object v5, v7, Lq3/o;->b:Ld1/p;

    :cond_22
    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :catchall_1
    move-exception v0

    goto :goto_12

    :cond_23
    iget-object v0, v0, Lb3/i2;->d:Lr1/c;

    invoke-virtual {v0}, Lr1/c;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v2

    iget-object v0, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v0, Lb3/x0;

    iget-object v0, v0, Lb3/x0;->x:Lq3/z;

    iget-object v2, v0, Lq3/z;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, v0, Lq3/z;->a:Lq3/t;

    invoke-interface {v0}, Lq3/t;->b()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_12
    monitor-exit v2

    throw v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Lbc3/c0;

    new-instance v0, Lb3/i2;

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Ld1/o;

    new-instance v3, Lav/b;

    iget-object v4, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v4, Lb3/x0;

    const/4 v7, 0x1

    invoke-direct {v3, v4, v7}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v2, v3}, Lb3/i2;-><init>(Ld1/o;Lav/b;)V

    return-object v0

    :pswitch_1a
    move-object/from16 v0, p1

    check-cast v0, Ly2/i1;

    iget-object v2, v1, Lb2/z;->x:Ljava/lang/Object;

    check-cast v2, Ly2/j1;

    iget-object v3, v1, Lb2/z;->y:Ljava/lang/Object;

    check-cast v3, Lb2/a0;

    iget v3, v3, Lb2/a0;->O:F

    invoke-virtual {v0, v2, v4, v4, v3}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
