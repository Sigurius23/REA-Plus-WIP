.class final Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/google/gson/JsonObject;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.signal.jsonrpc.JSONRpcSignal$bulkRoleChangeRequest$2"
    f = "JSONRpcSignal.kt"
    l = {
        0x11b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $force:Z

.field final synthetic $ofRoles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $toRole:Llive/hms/video/sdk/models/role/HMSRole;

.field label:I

.field final synthetic this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;


# direct methods
.method public constructor <init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;ZLlive/hms/video/sdk/models/role/HMSRole;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;Z",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iput-object p2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$ofRoles:Ljava/util/List;

    iput-boolean p3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$force:Z

    iput-object p4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

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

    new-instance v0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;

    iget-object v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    iget-object v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$ofRoles:Ljava/util/List;

    iget-boolean v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$force:Z

    iget-object v4, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;-><init>(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Ljava/util/List;ZLlive/hms/video/sdk/models/role/HMSRole;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Lcom/google/gson/JsonObject;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->label:I

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

    iget-object p1, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->this$0:Llive/hms/video/signal/jsonrpc/JSONRpcSignal;

    sget-object v1, Llive/hms/video/signal/HMSSignalMethod;->ROLE_CHANGE_REQUEST:Llive/hms/video/signal/HMSSignalMethod;

    iget-object v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$ofRoles:Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v5}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-boolean v3, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$force:Z

    iget-object v5, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

    invoke-virtual {v5}, Llive/hms/video/sdk/models/role/HMSRole;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;

    invoke-direct {v6, v4, v3, v5}, Llive/hms/video/signal/jsonrpc/models/HMSParams$BulkRoleChangeRequest;-><init>(Ljava/util/List;ZLjava/lang/String;)V

    iput v2, p0, Llive/hms/video/signal/jsonrpc/JSONRpcSignal$bulkRoleChangeRequest$2;->label:I

    const-class v2, Lcom/google/gson/JsonObject;

    invoke-static {p1, v1, v6, v2, p0}, Llive/hms/video/signal/jsonrpc/JSONRpcSignal;->access$call(Llive/hms/video/signal/jsonrpc/JSONRpcSignal;Llive/hms/video/signal/HMSSignalMethod;Llive/hms/video/signal/jsonrpc/models/HMSParams;Ljava/lang/Class;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
