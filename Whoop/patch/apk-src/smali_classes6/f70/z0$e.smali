.class final Lf70/z0$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/z0;->g(Lf70/e$b;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/domain/model/AuthMaterial;"
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
    c = "com.whoop.activation.domain.interactors.activation.SignUpHelper$signUpCase$response$1"
    f = "SignUpHelper.kt"
    l = {
        0x6f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lf70/z0;

.field final synthetic y:Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

.field final synthetic z:Lcom/whoop/domain/model/WhoopStrapInfo;


# direct methods
.method public constructor <init>(Lf70/z0;Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/z0;",
            "Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "Lq83/d<",
            "-",
            "Lf70/z0$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/z0$e;->x:Lf70/z0;

    iput-object p2, p0, Lf70/z0$e;->y:Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

    iput-object p3, p0, Lf70/z0$e;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

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

    new-instance v0, Lf70/z0$e;

    iget-object v1, p0, Lf70/z0$e;->x:Lf70/z0;

    iget-object v2, p0, Lf70/z0$e;->y:Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

    iget-object v3, p0, Lf70/z0$e;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    invoke-direct {v0, v1, v2, v3, p1}, Lf70/z0$e;-><init>(Lf70/z0;Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Lcom/whoop/domain/model/WhoopStrapInfo;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lf70/z0$e;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/whoop/domain/model/AuthMaterial;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lf70/z0$e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/z0$e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lf70/z0$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lf70/z0$e;->w:I

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

    iget-object p1, p0, Lf70/z0$e;->x:Lf70/z0;

    invoke-static {p1}, Lf70/z0;->b(Lf70/z0;)Lcom/whoop/activation/domain/ActivationApi;

    move-result-object p1

    iget-object v1, p0, Lf70/z0$e;->y:Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;

    iget-object v3, p0, Lf70/z0$e;->z:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    :cond_2
    const-string v3, ""

    :cond_3
    iput v2, p0, Lf70/z0$e;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/activation/domain/ActivationApi;->signUp(Lcom/whoop/activation/domain/models/ActivationFlowSignupBody;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method
