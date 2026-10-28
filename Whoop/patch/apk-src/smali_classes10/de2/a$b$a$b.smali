.class final Lde2/a$b$a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde2/a$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "it",
        "",
        "<anonymous>",
        "(Lpg3/v0;)Ljava/lang/Object;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.shepherd.feature.terms.domain.ShepherdSubmitTermsOfUseInteractor$interact$1$1$1$result$2"
    f = "ShepherdSubmitTermsOfUseInteractor.kt"
    l = {
        0x28,
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lde2/a;


# direct methods
.method public constructor <init>(Lde2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde2/a;",
            "Lq83/d<",
            "-",
            "Lde2/a$b$a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lde2/a$b$a$b;->y:Lde2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lde2/a$b$a$b;

    iget-object v0, p0, Lde2/a$b$a$b;->y:Lde2/a;

    invoke-direct {p1, v0, p2}, Lde2/a$b$a$b;-><init>(Lde2/a;Lq83/d;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lpg3/v0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lde2/a$b$a$b;->invoke(Lpg3/v0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lpg3/v0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;",
            "Lq83/d<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lde2/a$b$a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lde2/a$b$a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lde2/a$b$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lde2/a$b$a$b;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_0

    if-ne v1, v2, :cond_1

    :cond_0
    iget-object v0, p0, Lde2/a$b$a$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lde2/a$b$a$b;->y:Lde2/a;

    invoke-static {p1}, Lde2/a;->e(Lde2/a;)Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;

    move-result-object p1

    iget-object v1, p0, Lde2/a$b$a$b;->y:Lde2/a;

    invoke-static {v1}, Lde2/a;->a(Lde2/a;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v4, "android-updated-samd-contract"

    invoke-interface {v1, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    iget-object v1, p0, Lde2/a$b$a$b;->y:Lde2/a;

    invoke-static {v1}, Lde2/a;->d(Lde2/a;)Lcom/whoop/shepherd/domain/ShepherdApi;

    move-result-object v1

    iput-object v4, p0, Lde2/a$b$a$b;->w:Ljava/lang/Object;

    iput v3, p0, Lde2/a$b$a$b;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/shepherd/domain/ShepherdApi;->updateShepherdSettings(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_0

    :cond_3
    return-object p1

    :cond_4
    iget-object v1, p0, Lde2/a$b$a$b;->y:Lde2/a;

    invoke-static {v1}, Lde2/a;->d(Lde2/a;)Lcom/whoop/shepherd/domain/ShepherdApi;

    move-result-object v1

    iput-object v4, p0, Lde2/a$b$a$b;->w:Ljava/lang/Object;

    iput v2, p0, Lde2/a$b$a$b;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/shepherd/domain/ShepherdApi;->updateShepherdSettingsLegacy(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_0
    return-object v0

    :cond_5
    return-object p1
.end method
