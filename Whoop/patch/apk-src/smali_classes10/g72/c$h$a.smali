.class final Lg72/c$h$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg72/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sage.onboarding.domain.SageOnboardingInteractor$performSave$1$response$1"
    f = "SageOnboardingInteractor.kt"
    l = {
        0x97,
        0x9f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lg72/c;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Z

.field final synthetic z:Lg72/b$e;


# direct methods
.method public constructor <init>(ZLg72/b$e;Lg72/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lg72/b$e;",
            "Lg72/c;",
            "Lq83/d<",
            "-",
            "Lg72/c$h$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lg72/c$h$a;->y:Z

    iput-object p2, p0, Lg72/c$h$a;->z:Lg72/b$e;

    iput-object p3, p0, Lg72/c$h$a;->E:Lg72/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg72/c$h$a;

    iget-boolean v1, p0, Lg72/c$h$a;->y:Z

    iget-object v2, p0, Lg72/c$h$a;->z:Lg72/b$e;

    iget-object v3, p0, Lg72/c$h$a;->E:Lg72/c;

    invoke-direct {v0, v1, v2, v3, p1}, Lg72/c$h$a;-><init>(ZLg72/b$e;Lg72/c;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lg72/c$h$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lg72/c$h$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg72/c$h$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lg72/c$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg72/c$h$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lg72/c$h$a;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lg72/c$h$a;->y:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lg72/c$h$a;->z:Lg72/b$e;

    invoke-virtual {p1}, Lg72/b$e;->b()Lg72/f;

    move-result-object p1

    invoke-virtual {p1}, Lg72/f;->b()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v2, p0, Lg72/c$h$a;->E:Lg72/c;

    invoke-static {v2}, Lg72/c;->d(Lg72/c;)Lcom/whoop/sage/domain/SageApi;

    move-result-object v2

    new-instance v4, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;

    iget-object v5, p0, Lg72/c$h$a;->z:Lg72/b$e;

    invoke-virtual {v5}, Lg72/b$e;->b()Lg72/f;

    move-result-object v5

    invoke-virtual {v5}, Lg72/f;->c()Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, p1, v5, v1}, Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    iput-object v1, p0, Lg72/c$h$a;->w:Ljava/lang/Object;

    iput v3, p0, Lg72/c$h$a;->x:I

    invoke-interface {v2, v4, p0}, Lcom/whoop/sage/domain/SageApi;->saveSageOnboarding(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_4
    iget-object p1, p0, Lg72/c$h$a;->E:Lg72/c;

    invoke-static {p1}, Lg72/c;->d(Lg72/c;)Lcom/whoop/sage/domain/SageApi;

    move-result-object p1

    new-instance v3, Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;

    iget-object v4, p0, Lg72/c$h$a;->z:Lg72/b$e;

    invoke-virtual {v4}, Lg72/b$e;->b()Lg72/f;

    move-result-object v4

    invoke-virtual {v4}, Lg72/f;->c()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4, v1}, Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;-><init>(Ljava/util/List;Ljava/lang/String;)V

    iput v2, p0, Lg72/c$h$a;->x:I

    invoke-interface {p1, v3, p0}, Lcom/whoop/sage/domain/SageApi;->saveSageManualMeasurement(Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    check-cast p1, Lpg3/v0;

    return-object p1
.end method
