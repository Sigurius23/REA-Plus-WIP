.class final Lvc2/b$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvc2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.switchPlan.domain.SwitchBillingPlanModalInteractor$switchBillingPlan$1$response$1"
    f = "SwitchBillingPlanModalInteractor.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lvc2/b;

.field final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvc2/b$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvc2/b$c$a;->x:Lvc2/b;

    iput-object p2, p0, Lvc2/b$c$a;->y:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lvc2/b$c$a;

    iget-object v1, p0, Lvc2/b$c$a;->x:Lvc2/b;

    iget-object v2, p0, Lvc2/b$c$a;->y:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lvc2/b$c$a;-><init>(Lvc2/b;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lvc2/b$c$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lvc2/b$c$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvc2/b$c$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lvc2/b$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lvc2/b$c$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvc2/b$c$a;->x:Lvc2/b;

    invoke-static {p1}, Lvc2/b;->d(Lvc2/b;)Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;

    move-result-object p1

    new-instance v1, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;

    iget-object v3, p0, Lvc2/b$c$a;->y:Ljava/lang/String;

    const-string v4, "app"

    invoke-direct {v1, v3, v4}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput v2, p0, Lvc2/b$c$a;->w:I

    invoke-interface {p1, v1, p0}, Lcom/whoop/settings/accountheader/api/NativeAccountHeaderApi;->switchBillingPlan(Lcom/whoop/settings/accountheader/model/SwitchBillingPlanRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
