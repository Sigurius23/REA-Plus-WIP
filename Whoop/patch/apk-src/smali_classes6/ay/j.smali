.class public final Lay/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lay/i;


# instance fields
.field public final a:Lkr/e;

.field public final b:Lu00/e;

.field public final c:Lay/t;

.field public final d:Lqy/d;

.field public final e:Lb20/f;

.field public final f:Lec3/w1;

.field public final g:Lec3/w1;


# direct methods
.method public constructor <init>(Lkr/e;Lu00/e;Lay/t;Lqy/d;Lb20/f;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lay/j;->a:Lkr/e;

    iput-object p2, p0, Lay/j;->b:Lu00/e;

    iput-object p3, p0, Lay/j;->c:Lay/t;

    iput-object p4, p0, Lay/j;->d:Lqy/d;

    iput-object p5, p0, Lay/j;->e:Lb20/f;

    const/4 p1, 0x0

    const/4 p2, 0x6

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lay/j;->f:Lec3/w1;

    iput-object p1, p0, Lay/j;->g:Lec3/w1;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[ConfirmationChallenge] "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lay/j;->d:Lqy/d;

    invoke-virtual {v0, p1}, Lqy/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public getInitParams()Ljava/lang/String;
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    iget-object v1, p0, Lay/j;->c:Lay/t;

    iget-object v2, v1, Lay/t;->w:Ljava/lang/String;

    const-string v3, "publishableKey"

    invoke-virtual {v0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, v1, Lay/t;->y:Ly00/c8;

    invoke-interface {v1}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    const-string v2, "clientSecret"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Returning init params: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lay/j;->a(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public onError(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lay/j;->f:Lec3/w1;

    const-string v1, "errorMessage"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Error from bridge: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lay/j;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lay/j;->b:Lu00/e;

    invoke-virtual {p1, v1}, Lu00/e;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p1

    check-cast p1, Lay/c;

    new-instance v1, Lay/a;

    iget-object p1, p1, Lay/c;->w:Ljava/lang/String;

    invoke-direct {v1, p1}, Lay/a;-><init>(Ljava/lang/String;)V

    new-instance p1, Lay/e;

    invoke-direct {p1, v1}, Lay/e;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v1, Lb20/e;->a0:Lb20/e;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    iget-object v5, p0, Lay/j;->e:Lb20/f;

    invoke-static {v5, v1, v2, v3, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v1, Lay/e;

    invoke-direct {v1, p1}, Lay/e;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public onReady()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "Bridge is ready"

    invoke-virtual {p0, v0}, Lay/j;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lay/j;->f:Lec3/w1;

    sget-object v1, Lay/f;->a:Lay/f;

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lay/j;->f:Lec3/w1;

    const-string v1, "paymentIntentJson"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Payment intent success: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lay/j;->a(Ljava/lang/String;)V

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lay/j;->a:Lkr/e;

    invoke-virtual {p1, v1}, Lkr/e;->m(Lorg/json/JSONObject;)Lvy/b;

    move-result-object p1

    check-cast p1, Lay/d;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lay/d;->w:Ljava/lang/String;

    if-nez p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lay/j;->c:Lay/t;

    iget-object p1, p1, Lay/t;->y:Ly00/c8;

    invoke-interface {p1}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    :cond_1
    new-instance v1, Lay/g;

    invoke-direct {v1, p1}, Lay/g;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "Missing client secret"

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object v1, Lb20/e;->Z:Lb20/e;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x4

    iget-object v5, p0, Lay/j;->e:Lb20/f;

    invoke-static {v5, v1, v2, v3, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    new-instance v1, Lay/e;

    invoke-direct {v1, p1}, Lay/e;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method
