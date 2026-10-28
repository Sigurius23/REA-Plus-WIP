.class public final Lhj/q;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;I)V
    .locals 0

    iput p2, p0, Lhj/q;->w:I

    iput-object p1, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lhj/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lij/q;->a:Lad3/r;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->i(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    iget-object v0, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    invoke-static {v0, p1}, Ldc/a;->M(Lcom/amplitude/android/engagement/a;Lkotlinx/serialization/json/JsonObject;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, [Ljava/lang/Object;

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    sget-object v1, Lwj/b;->a:Lad3/r;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lcom/amplitude/android/engagement/types/Nudge;->Companion:Lcom/amplitude/android/engagement/types/q0;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/q0;->serializer()Lwc3/c;

    move-result-object v2

    check-cast v2, Lwc3/b;

    invoke-virtual {v1, v2, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to deserialize from JSON string: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    if-nez v0, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v2, "Closing step "

    const-string v3, " of nudge "

    invoke-static {p1, v2, v3}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iget-object v1, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    new-instance v2, La8/c;

    const/16 v3, 0x18

    invoke-direct {v2, v3, v1, v0}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lhj/e;

    const/4 v2, 0x1

    iget-object v3, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {v1, v3, p1, v2}, Lhj/e;-><init>(Lcom/amplitude/android/engagement/a;Ljava/lang/String;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v1, "Rage tap detected ("

    const-string v2, " taps)"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lhj/r;

    const/4 v1, 0x0

    iget-object v2, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {v0, v2, v1}, Lhj/r;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Lkj/g;

    const-string v0, "tapData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhj/q;->x:Lcom/amplitude/android/engagement/a;

    iget-object v1, v0, Lcom/amplitude/android/engagement/a;->l:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkj/e;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Lkj/g;->a()J

    move-result-wide v2

    iget-wide v4, v1, Lkj/e;->c:J

    sub-long/2addr v2, v4

    const-wide/16 v6, 0x0

    cmp-long v4, v4, v6

    const-wide/16 v5, 0x3e8

    if-lez v4, :cond_4

    cmp-long v2, v2, v5

    if-gtz v2, :cond_3

    iget v2, v1, Lkj/e;->d:F

    iget v3, v1, Lkj/e;->e:F

    invoke-virtual {p1}, Lkj/g;->b()F

    move-result v4

    invoke-virtual {p1}, Lkj/g;->c()F

    move-result v7

    sub-float/2addr v2, v4

    sub-float/2addr v3, v7

    mul-float/2addr v2, v2

    mul-float/2addr v3, v3

    add-float/2addr v3, v2

    float-to-double v2, v3

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    const/high16 v3, 0x42480000    # 50.0f

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lkj/e;->a()V

    :cond_4
    :goto_2
    iget v2, v1, Lkj/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lkj/e;->b:I

    invoke-virtual {p1}, Lkj/g;->a()J

    move-result-wide v2

    iput-wide v2, v1, Lkj/e;->c:J

    invoke-virtual {p1}, Lkj/g;->b()F

    move-result v2

    iput v2, v1, Lkj/e;->d:F

    invoke-virtual {p1}, Lkj/g;->c()F

    move-result v2

    iput v2, v1, Lkj/e;->e:F

    iget v2, v1, Lkj/e;->b:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-lt v2, v4, :cond_6

    if-lt v2, v4, :cond_5

    iget-object v4, v1, Lkj/e;->a:Lhj/q;

    if-eqz v4, :cond_5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v4, v2}, Lhj/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    invoke-virtual {v1}, Lkj/e;->a()V

    goto :goto_3

    :cond_6
    iget-object v2, v1, Lkj/e;->g:Lio/sentry/c7;

    if-eqz v2, :cond_7

    iget-object v4, v1, Lkj/e;->f:Landroid/os/Handler;

    if-eqz v4, :cond_7

    invoke-virtual {v4, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_7
    iput-object v3, v1, Lkj/e;->f:Landroid/os/Handler;

    iput-object v3, v1, Lkj/e;->g:Lio/sentry/c7;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, v1, Lkj/e;->f:Landroid/os/Handler;

    new-instance v4, Lio/sentry/c7;

    const/16 v7, 0x16

    invoke-direct {v4, v1, v7}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    iput-object v4, v1, Lkj/e;->g:Lio/sentry/c7;

    invoke-virtual {v2, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_3
    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->m:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/d;

    iget-boolean v1, v0, Lkj/d;->b:Z

    if-nez v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, v0, Lkj/d;->d:Lio/sentry/c7;

    if-eqz v1, :cond_9

    iget-object v2, v0, Lkj/d;->c:Landroid/os/Handler;

    if-eqz v2, :cond_9

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_9
    iput-object v3, v0, Lkj/d;->c:Landroid/os/Handler;

    iput-object v3, v0, Lkj/d;->d:Lio/sentry/c7;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, v0, Lkj/d;->c:Landroid/os/Handler;

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0x15

    invoke-direct {v2, v0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v0, Lkj/d;->d:Lio/sentry/c7;

    const-wide/16 v3, 0x1388

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_4
    sget-object v0, Lcom/amplitude/android/engagement/a;->n:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkj/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lhj/u;->w:Lhj/u;

    invoke-virtual {v1}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    new-instance v2, Landroidx/fragment/app/d;

    const/16 v3, 0xe

    invoke-direct {v2, v1, v0, p1, v3}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
