.class final Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate$preview$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
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
    c = "live.hms.video.sdk.SDKDelegate$preview$2$1$1$onTimeout$1$1"
    f = "SDKDelegate.kt"
    l = {
        0x592
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

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

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {v0, v1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->L$0:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lbc3/c0;

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->label:I

    const-wide/16 v1, 0xbb8

    invoke-static {v1, v2, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getStore$p(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    new-instance v3, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;

    const/4 v4, -0x1

    invoke-direct {v3, v4}, Llive/hms/video/connection/stats/quality/HMSNetworkQuality;-><init>(I)V

    invoke-virtual {p1, v3}, Llive/hms/video/sdk/models/HMSPeer;->setNetworkQuality$lib_release(Llive/hms/video/connection/stats/quality/HMSNetworkQuality;)V

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    new-instance v4, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1$1$1;

    invoke-direct {v4, v2, p1, v1}, Llive/hms/video/sdk/SDKDelegate$preview$2$1$1$onTimeout$1$1$1$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Llive/hms/video/sdk/models/HMSLocalPeer;Lq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v3, v1, v4, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    return-object v1
.end method
