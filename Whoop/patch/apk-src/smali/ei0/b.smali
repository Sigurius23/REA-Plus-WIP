.class public final Lei0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lei0/b;",
        "Lei0/a;",
        "Lcom/amplitude/android/engagement/a;",
        "amplitudeEngagement",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/amplitude/android/engagement/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lhj/b;",
        "options",
        "Ll83/a0;",
        "a",
        "(Lhj/b;)V",
        "Landroid/content/Intent;",
        "intent",
        "b",
        "(Landroid/content/Intent;)V",
        "Lcom/amplitude/android/engagement/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "amplitude-sdk_release"
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
.field private final a:Lcom/amplitude/android/engagement/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "amplitudeEngagement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lei0/b;->a:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Lei0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public a(Lhj/b;)V
    .locals 2

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lei0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-enable-amplitude-survey-sdk"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lei0/b;->a:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v0, p1}, Lcom/amplitude/android/engagement/a;->a(Lhj/b;)V

    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 7

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lei0/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "android-enable-amplitude-survey-sdk"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lei0/b;->a:Lcom/amplitude/android/engagement/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Lav/b;

    const/16 v3, 0x15

    invoke-direct {v2, p1, v3}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    invoke-virtual {p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v3, "amp-"

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_6

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v5

    :goto_0
    const-string v6, "gs"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    :cond_3
    if-nez v5, :cond_4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-static {v4, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "preview"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {v3, v5}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    new-instance v2, Lhj/s;

    invoke-direct {v2, p1}, Lhj/s;-><init>(I)V

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->H(Lc93/a;)V

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v1, "window.engagement._startNudgeDebug({ nudge: { variantId: "

    const-string v2, " } })"

    invoke-static {p1, v1, v2}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lhj/m;->z:Lhj/m;

    invoke-virtual {v0, p1, v1}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    :cond_6
    :goto_1
    return-void
.end method
