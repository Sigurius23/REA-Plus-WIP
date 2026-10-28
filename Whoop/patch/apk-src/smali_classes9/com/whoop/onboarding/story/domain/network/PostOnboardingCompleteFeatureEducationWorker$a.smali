.class public final Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;",
        "",
        "<init>",
        "()V",
        "",
        "featureId",
        "Lic/a0;",
        "a",
        "(I)Lic/a0;",
        "Lic/p0;",
        "workManager",
        "Lic/e0;",
        "b",
        "(Lic/p0;I)Lic/e0;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "KEY_ID",
        "onboarding-story-domain_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;-><init>()V

    return-void
.end method

.method private final a(I)Lic/a0;
    .locals 13

    new-instance v0, Lrc/e;

    sget-object v0, Lic/x;->w:Lic/x;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v3, Lic/x;->x:Lic/x;

    new-instance v2, Lrc/e;

    const/4 v1, 0x0

    invoke-direct {v2, v1}, Lrc/e;-><init>(Landroid/net/NetworkRequest;)V

    sget-object v1, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-string v4, "timeUnit"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x1

    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v10

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v12

    new-instance v1, Lic/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, -0x1

    invoke-direct/range {v1 .. v12}, Lic/e;-><init>(Lrc/e;Lic/x;ZZZZJJLjava/util/Set;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v2, "featureId"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lic/g;

    invoke-direct {p1, v0}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    invoke-static {p1}, Lpf/c;->X(Lic/g;)[B

    new-instance v0, Lic/z;

    const-class v2, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker;

    invoke-direct {v0, v2}, Lic/q0;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Lic/q0;->h(Lic/g;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1, v1}, Lic/q0;->f(Lic/e;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    sget-object v0, Lic/a;->x:Lic/a;

    const-wide/16 v1, 0x2710

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2, v3}, Lic/q0;->e(Lic/a;JLjava/util/concurrent/TimeUnit;)Lic/q0;

    move-result-object p1

    check-cast p1, Lic/z;

    invoke-virtual {p1}, Lic/q0;->b()Lic/r0;

    move-result-object p1

    check-cast p1, Lic/a0;

    return-object p1
.end method


# virtual methods
.method public final b(Lic/p0;I)Lic/e0;
    .locals 2

    const-string v0, "workManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lic/l;->w:Lic/l;

    invoke-direct {p0, p2}, Lcom/whoop/onboarding/story/domain/network/PostOnboardingCompleteFeatureEducationWorker$a;->a(I)Lic/a0;

    move-result-object p2

    const-string v1, "post-onboarding-complete-feature-education-work"

    invoke-virtual {p1, v1, v0, p2}, Lic/p0;->e(Ljava/lang/String;Lic/l;Lic/a0;)Lic/e0;

    move-result-object p1

    return-object p1
.end method
