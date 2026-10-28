.class final Lcom/whoop/healthspan/domain/b$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/healthspan/domain/b;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.healthspan.domain.HealthspanInteractor$interact$1$2"
    f = "HealthspanInteractor.kt"
    l = {
        0x23,
        0x24
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/healthspan/domain/b;

.field final synthetic z:Lcom/whoop/healthspan/domain/a;


# direct methods
.method public constructor <init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/healthspan/domain/b;",
            "Lcom/whoop/healthspan/domain/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/healthspan/domain/b$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/healthspan/domain/b$k;->y:Lcom/whoop/healthspan/domain/b;

    iput-object p2, p0, Lcom/whoop/healthspan/domain/b$k;->z:Lcom/whoop/healthspan/domain/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/healthspan/domain/b$k;

    iget-object v1, p0, Lcom/whoop/healthspan/domain/b$k;->y:Lcom/whoop/healthspan/domain/b;

    iget-object v2, p0, Lcom/whoop/healthspan/domain/b$k;->z:Lcom/whoop/healthspan/domain/a;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/healthspan/domain/b$k;-><init>(Lcom/whoop/healthspan/domain/b;Lcom/whoop/healthspan/domain/a;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/healthspan/domain/b$k;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/healthspan/domain/b$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/healthspan/domain/b$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/healthspan/domain/b$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/healthspan/domain/b$k;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/whoop/healthspan/domain/b$k;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/healthspan/domain/b$k;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/healthspan/domain/b$k;->y:Lcom/whoop/healthspan/domain/b;

    invoke-static {p1}, Lcom/whoop/healthspan/domain/b;->h(Lcom/whoop/healthspan/domain/b;)Lxm0/b;

    move-result-object p1

    iput-object v0, p0, Lcom/whoop/healthspan/domain/b$k;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/healthspan/domain/b$k;->w:I

    const-string v2, "HealthTabRefreshScope"

    invoke-virtual {p1, v2, p0}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v4, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;

    iget-object p1, p0, Lcom/whoop/healthspan/domain/b$k;->z:Lcom/whoop/healthspan/domain/a;

    check-cast p1, Lcom/whoop/healthspan/domain/a$f;

    invoke-virtual {p1}, Lcom/whoop/healthspan/domain/a$f;->a()I

    move-result v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/healthspan/domain/HealthspanDomainResult$OnboardingStepCompleted;-><init>(IZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/healthspan/domain/b$k;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/healthspan/domain/b$k;->w:I

    invoke-interface {v0, v4, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
