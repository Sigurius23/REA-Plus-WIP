.class public final Lf80/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0086B\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lf80/e;",
        "",
        "Lf80/a;",
        "helper",
        "Lf80/d;",
        "tracker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lf80/a;Lf80/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lm91/u;",
        "Lh80/g;",
        "c",
        "(Lm91/u;)Lh80/g;",
        "Landroid/content/Context;",
        "context",
        "currentScreen",
        "Lf70/q0;",
        "memberInfo",
        "",
        "skipIfAlreadyAuthenticated",
        "Lf80/c;",
        "a",
        "(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;",
        "Lf80/a;",
        "b",
        "Lf80/d;",
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
.field private final a:Lf80/a;

.field private final b:Lf80/d;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lf80/a;Lf80/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "helper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tracker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf80/e;->a:Lf80/a;

    iput-object p2, p0, Lf80/e;->b:Lf80/d;

    iput-object p3, p0, Lf80/e;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static synthetic b(Lf80/e;Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lf80/e;->a(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lm91/u;)Lh80/g;
    .locals 1

    instance-of v0, p1, Lv80/c;

    if-eqz v0, :cond_0

    sget-object p1, Lh80/g;->CreatePassword:Lh80/g;

    return-object p1

    :cond_0
    instance-of p1, p1, Lb90/g;

    if-eqz p1, :cond_1

    sget-object p1, Lh80/g;->EnterPassword:Lh80/g;

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lm91/u;Lf70/q0;ZLq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm91/u;",
            "Lf70/q0;",
            "Z",
            "Lq83/d<",
            "-",
            "Lf80/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lf80/e$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lf80/e$a;

    iget v1, v0, Lf80/e$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lf80/e$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lf80/e$a;

    invoke-direct {v0, p0, p5}, Lf80/e$a;-><init>(Lf80/e;Lq83/d;)V

    :goto_0
    iget-object p5, v0, Lf80/e$a;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf80/e$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lf80/e$a;->E:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lf80/e$a;->z:Ljava/lang/Object;

    check-cast p1, Lh80/g;

    iget-object p2, v0, Lf80/e$a;->y:Ljava/lang/Object;

    check-cast p2, Lf70/q0;

    iget-object p2, v0, Lf80/e$a;->x:Ljava/lang/Object;

    check-cast p2, Lm91/u;

    iget-object p2, v0, Lf80/e$a;->w:Ljava/lang/Object;

    check-cast p2, Landroid/content/Context;

    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p5}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p5, p0, Lf80/e;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->CREDENTIAL_MANAGER_ANDROID:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p5, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p5

    if-nez p5, :cond_3

    sget-object p1, Lf80/c;->NotAttempted:Lf80/c;

    return-object p1

    :cond_3
    if-eqz p4, :cond_4

    sget-object p1, Lf80/c;->NotAttempted:Lf80/c;

    return-object p1

    :cond_4
    invoke-direct {p0, p2}, Lf80/e;->c(Lm91/u;)Lh80/g;

    move-result-object p2

    if-nez p2, :cond_5

    sget-object p1, Lf80/c;->NotAttempted:Lf80/c;

    return-object p1

    :cond_5
    invoke-virtual {p3}, Lf70/q0;->s()Ld70/e;

    move-result-object p5

    invoke-virtual {p5}, Ld70/e;->a()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object p1, Lf80/c;->NotAttempted:Lf80/c;

    return-object p1

    :cond_6
    iget-object v2, p0, Lf80/e;->a:Lf80/a;

    invoke-virtual {p3}, Lf70/q0;->j()Ld70/c;

    move-result-object p3

    invoke-virtual {p3}, Ld70/c;->a()Ljava/lang/String;

    move-result-object p3

    const/4 v4, 0x0

    iput-object v4, v0, Lf80/e$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Lf80/e$a;->x:Ljava/lang/Object;

    iput-object v4, v0, Lf80/e$a;->y:Ljava/lang/Object;

    iput-object p2, v0, Lf80/e$a;->z:Ljava/lang/Object;

    iput-object v4, v0, Lf80/e$a;->E:Ljava/lang/Object;

    iput-boolean p4, v0, Lf80/e$a;->F:Z

    iput v3, v0, Lf80/e$a;->I:I

    invoke-virtual {v2, p1, p3, p5, v0}, Lf80/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p5

    if-ne p5, v1, :cond_7

    return-object v1

    :cond_7
    move-object p1, p2

    :goto_1
    check-cast p5, Lf80/c;

    iget-object p2, p0, Lf80/e;->b:Lf80/d;

    invoke-virtual {p2, p1, p5}, Lf80/d;->e(Lh80/g;Lf80/c;)V

    return-object p5
.end method
