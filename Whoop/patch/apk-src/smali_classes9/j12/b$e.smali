.class final Lj12/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj12/b;->j(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lk12/b;",
        "domainResult",
        "Lj12/b$a;",
        "action",
        "<anonymous>",
        "(Lk12/b;Lj12/b$a;)Lk12/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$2"
    f = "OnboardingOverlayInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj12/b;


# direct methods
.method public constructor <init>(Lj12/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj12/b;",
            "Lq83/d<",
            "-",
            "Lj12/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj12/b$e;->z:Lj12/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lk12/b;Lj12/b$a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk12/b;",
            "Lj12/b$a;",
            "Lq83/d<",
            "-",
            "Lk12/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lj12/b$e;

    iget-object v1, p0, Lj12/b$e;->z:Lj12/b;

    invoke-direct {v0, v1, p3}, Lj12/b$e;-><init>(Lj12/b;Lq83/d;)V

    iput-object p1, v0, Lj12/b$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj12/b$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj12/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk12/b;

    check-cast p2, Lj12/b$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lj12/b$e;->f(Lk12/b;Lj12/b$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lj12/b$e;->x:Ljava/lang/Object;

    check-cast v0, Lk12/b;

    iget-object v1, p0, Lj12/b$e;->y:Ljava/lang/Object;

    check-cast v1, Lj12/b$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lj12/b$e;->w:I

    if-nez v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lj12/b$a$a;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lk12/b;

    check-cast v1, Lj12/b$a$a;

    invoke-virtual {v1}, Lj12/b$a$a;->a()Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;

    move-result-object v0

    invoke-direct {p1, v0, v3, v2, v4}, Lk12/b;-><init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_0
    sget-object p1, Lj12/b$a$b;->a:Lj12/b$a$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lj12/b$e;->z:Lj12/b;

    invoke-static {p1, v0}, Lj12/b;->h(Lj12/b;Lk12/b;)Lk12/b;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lj12/b$a$c;->a:Lj12/b$a$c;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lk12/b;

    invoke-direct {p1, v4, v3, v2, v4}, Lk12/b;-><init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
