.class public final Lj12/b$f;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.onboarding.overlay.OnboardingOverlayInteractor$interact$lambda$0$$inlined$flatMapLatest$1"
    f = "OnboardingOverlayInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lk12/a;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lj12/b;


# direct methods
.method public constructor <init>(Lq83/d;Lj12/b;Lk12/a;)V
    .locals 0

    iput-object p2, p0, Lj12/b$f;->z:Lj12/b;

    iput-object p3, p0, Lj12/b$f;->E:Lk12/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Boolean;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lj12/b$f;

    iget-object v1, p0, Lj12/b$f;->z:Lj12/b;

    iget-object v2, p0, Lj12/b$f;->E:Lk12/a;

    invoke-direct {v0, p3, v1, v2}, Lj12/b$f;-><init>(Lq83/d;Lj12/b;Lk12/a;)V

    iput-object p1, v0, Lj12/b$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lj12/b$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lj12/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lj12/b$f;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj12/b$f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lj12/b$f;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lj12/b$f;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lj12/b$f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    new-instance v1, Lj12/b$a$a;

    invoke-direct {v1, v3}, Lj12/b$a$a;-><init>(Lcom/whoop/onboarding/overlay/model/FeatureOnboardingOverlayModel;)V

    new-instance v4, La6/u;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_2
    sget-object v1, Lcom/whoop/onboarding/overlay/domain/GetOnboardingOverlays;->INSTANCE:Lcom/whoop/onboarding/overlay/domain/GetOnboardingOverlays;

    new-instance v4, La6/u;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v1, 0x3

    invoke-static {v4, v3, v3, v1, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v1

    iget-object v4, p0, Lj12/b$f;->z:Lj12/b;

    invoke-static {v4}, Lj12/b;->c(Lj12/b;)Lnm0/e;

    move-result-object v4

    new-instance v5, Lj12/b$g;

    invoke-direct {v5, v3, v4}, Lj12/b$g;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v1, v5}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v1

    new-instance v4, Lj12/b$h;

    iget-object v5, p0, Lj12/b$f;->E:Lk12/a;

    invoke-direct {v4, v1, v5}, Lj12/b$h;-><init>(Lec3/l;Lk12/a;)V

    :goto_0
    iput-object v3, p0, Lj12/b$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lj12/b$f;->y:Ljava/lang/Object;

    iput v2, p0, Lj12/b$f;->w:I

    invoke-static {p1, v4, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
