.class public final Lf70/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0080@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lf70/y;",
        "",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "emailDataStoreHelper",
        "Landroid/content/Context;",
        "context",
        "Ls82/a;",
        "seonManager",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/datastore/EmailDataStoreHelper;Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lf70/e;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/data/datastore/EmailDataStoreHelper;",
        "b",
        "Landroid/content/Context;",
        "Ls82/a;",
        "d",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "activation_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lcom/whoop/data/datastore/EmailDataStoreHelper;

.field private final b:Landroid/content/Context;

.field private final c:Ls82/a;

.field private final d:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "emailDataStoreHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "seonManager"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf70/y;->a:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    iput-object p2, p0, Lf70/y;->b:Landroid/content/Context;

    iput-object p3, p0, Lf70/y;->c:Ls82/a;

    iput-object p4, p0, Lf70/y;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static final synthetic a(Lf70/y;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lf70/y;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lf70/y;)Lcom/whoop/data/datastore/EmailDataStoreHelper;
    .locals 0

    iget-object p0, p0, Lf70/y;->a:Lcom/whoop/data/datastore/EmailDataStoreHelper;

    return-object p0
.end method


# virtual methods
.method public final c(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lf70/y$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lf70/y$a;

    iget v1, v0, Lf70/y$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf70/y$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf70/y$a;

    invoke-direct {v0, p0, p1}, Lf70/y$a;-><init>(Lf70/y;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lf70/y$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/y$a;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lf70/y;->d:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->ANDROID_SEON_LOGIN:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lf70/y;->c:Ls82/a;

    iput v4, v0, Lf70/y$a;->y:I

    invoke-virtual {p1, v0}, Ls82/a;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    new-instance p1, Lf70/y$b;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lf70/y$b;-><init>(Lf70/y;Lq83/d;)V

    iput v3, v0, Lf70/y$a;->y:I

    const-wide/16 v2, 0x3e8

    invoke-static {v2, v3, p1, v0}, Lor2/p0;->a(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method
