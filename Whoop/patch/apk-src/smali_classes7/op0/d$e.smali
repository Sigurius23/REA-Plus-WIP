.class final Lop0/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lop0/d;->i(Lcom/whoop/data/onboarding/FeatureEducationType;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/whoop/educationModels/FeatureEducationDto;",
        "featureEducation",
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/educationModels/FeatureEducationDto;)Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingRepository$markFeatureEducationAsComplete$3"
    f = "SleepCoachOnBoardingRepository.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lop0/d;


# direct methods
.method public constructor <init>(Lop0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lop0/d;",
            "Lq83/d<",
            "-",
            "Lop0/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lop0/d$e;->y:Lop0/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lop0/d$e;

    iget-object v1, p0, Lop0/d$e;->y:Lop0/d;

    invoke-direct {v0, v1, p2}, Lop0/d$e;-><init>(Lop0/d;Lq83/d;)V

    iput-object p1, v0, Lop0/d$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/educationModels/FeatureEducationDto;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/educationModels/FeatureEducationDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lop0/d$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lop0/d$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lop0/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/educationModels/FeatureEducationDto;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lop0/d$e;->f(Lcom/whoop/educationModels/FeatureEducationDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lop0/d$e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/educationModels/FeatureEducationDto;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lop0/d$e;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lop0/d$e;->y:Lop0/d;

    invoke-virtual {p1}, Lop0/d;->f()Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;

    move-result-object p1

    new-instance v2, Lcom/whoop/educationModels/CompleteFeatureEducationBody;

    invoke-virtual {v0}, Lcom/whoop/educationModels/FeatureEducationDto;->getStoryId()I

    move-result v0

    invoke-direct {v2, v0, v3}, Lcom/whoop/educationModels/CompleteFeatureEducationBody;-><init>(IZ)V

    const/4 v0, 0x0

    iput-object v0, p0, Lop0/d$e;->x:Ljava/lang/Object;

    iput v3, p0, Lop0/d$e;->w:I

    invoke-interface {p1, v2, p0}, Lcom/whoop/onboarding/story/domain/network/FeatureEducationApi;->completeFeatureEducation(Lcom/whoop/educationModels/CompleteFeatureEducationBody;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    return-object p1
.end method
