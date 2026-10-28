.class final Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->roleChangeAccept(Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.SDKDelegate$roleChangeAccept$1"
    f = "SDKDelegate.kt"
    l = {
        0x6a2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

.field final synthetic $hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Llive/hms/video/sdk/models/HMSRoleChangeRequest;",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-direct {p1, v0, v1, v2, p2}, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSRoleChangeRequest;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object p1

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoleChangeRequest;->getToken$lib_release()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSRoleChangeRequest;->getSuggestedRole()Llive/hms/video/sdk/models/role/HMSRole;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsRoleChangeRequest:Llive/hms/video/sdk/models/HMSRoleChangeRequest;

    invoke-virtual {v4}, Llive/hms/video/sdk/models/HMSRoleChangeRequest;->getRequestedBy()Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v4

    iput v2, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->label:I

    invoke-interface {p1, v1, v3, v4, p0}, Llive/hms/video/transport/ITransport;->roleChangeAccept(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeer;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$roleChangeAccept$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
