.class final Lcr1/c$l$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcr1/c$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ll83/a0;",
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
    c = "com.whoop.integrations.domain.IntegrationsInteractor$updatePrivacyControl$1$1"
    f = "IntegrationsInteractor.kt"
    l = {
        0x9a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:I

.field final synthetic x:Lcr1/c;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcr1/c;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcr1/c$l$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcr1/c$l$a;->x:Lcr1/c;

    iput-object p2, p0, Lcr1/c$l$a;->y:Ljava/lang/String;

    iput-object p3, p0, Lcr1/c$l$a;->z:Ljava/lang/String;

    iput-boolean p4, p0, Lcr1/c$l$a;->E:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcr1/c$l$a;

    iget-object v1, p0, Lcr1/c$l$a;->x:Lcr1/c;

    iget-object v2, p0, Lcr1/c$l$a;->y:Ljava/lang/String;

    iget-object v3, p0, Lcr1/c$l$a;->z:Ljava/lang/String;

    iget-boolean v4, p0, Lcr1/c$l$a;->E:Z

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcr1/c$l$a;-><init>(Lcr1/c;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcr1/c$l$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcr1/c$l$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcr1/c$l$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcr1/c$l$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcr1/c$l$a;->w:I

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

    iget-object p1, p0, Lcr1/c$l$a;->x:Lcr1/c;

    invoke-static {p1}, Lcr1/c;->g(Lcr1/c;)Lcom/whoop/integrations/domain/IntegrationsApi;

    move-result-object p1

    iget-object v1, p0, Lcr1/c$l$a;->y:Ljava/lang/String;

    new-instance v3, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;

    new-instance v4, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlUpdate;

    iget-object v5, p0, Lcr1/c$l$a;->z:Ljava/lang/String;

    iget-boolean v6, p0, Lcr1/c$l$a;->E:Z

    invoke-direct {v4, v5, v6}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlUpdate;-><init>(Ljava/lang/String;Z)V

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;-><init>(Ljava/util/List;)V

    iput v2, p0, Lcr1/c$l$a;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/integrations/domain/IntegrationsApi;->updatePrivacyControls(Ljava/lang/String;Lcom/whoop/integrations/domain/models/IntegrationsPrivacyControlsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
