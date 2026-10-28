.class public final Lc20/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc20/c;

.field public final b:Ljava/util/Map;

.field public final c:Z

.field public final d:Ll83/p;

.field public e:Lj/d;

.field public f:Lj/d;


# direct methods
.method public constructor <init>(Lc20/c;Ljava/util/Map;ZLandroid/content/Context;)V
    .locals 1

    const-string v0, "noOpIntentNextActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentNextActionHandlers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc20/a;->a:Lc20/c;

    iput-object p2, p0, Lc20/a;->b:Ljava/util/Map;

    iput-boolean p3, p0, Lc20/a;->c:Z

    new-instance p1, Lbs1/v;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p0, p4}, Lbs1/v;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lc20/a;->d:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Ln83/i;
    .locals 2

    new-instance v0, Ln83/i;

    invoke-direct {v0}, Ln83/i;-><init>()V

    iget-object v1, p0, Lc20/a;->a:Lc20/c;

    invoke-virtual {v0, v1}, Ln83/i;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lc20/a;->b:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lc20/a;->d:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln83/i;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lc20/e;
    .locals 4

    instance-of v0, p1, Ly00/c8;

    if-eqz v0, :cond_3

    check-cast p1, Ly00/c8;

    invoke-interface {p1}, Ly00/c8;->z()Z

    move-result v0

    const-string v1, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<Actionable of com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry.getNextActionHandler>"

    iget-object v2, p0, Lc20/a;->a:Lc20/c;

    if-nez v0, :cond_0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :cond_0
    iget-object v0, p0, Lc20/a;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v3, p0, Lc20/a;->b:Ljava/util/Map;

    invoke-static {v3, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {p1}, Ly00/c8;->m()Ly00/b8;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc20/e;

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, p1

    :cond_2
    :goto_0
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No suitable PaymentNextActionHandler for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
