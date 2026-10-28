.class final Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/SDKDelegate;->bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;)V
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
    c = "live.hms.video.sdk.SDKDelegate$bulkRoleChangeRequest$1"
    f = "SDKDelegate.kt"
    l = {
        0x685
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $force:Z

.field final synthetic $hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

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

.field final synthetic this$0:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKDelegate;Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKDelegate;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            ">;",
            "Llive/hms/video/sdk/models/role/HMSRole;",
            "Z",
            "Llive/hms/video/sdk/HMSActionResultListener;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iput-object p2, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$ofRoles:Ljava/util/List;

    iput-object p3, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

    iput-boolean p4, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$force:Z

    iput-object p5, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;

    iget-object v1, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    iget-object v2, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$ofRoles:Ljava/util/List;

    iget-object v3, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

    iget-boolean v4, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$force:Z

    iget-object v5, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;-><init>(Llive/hms/video/sdk/SDKDelegate;Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v8, p0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p1, v0

    move-object v8, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->this$0:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {p1}, Llive/hms/video/sdk/SDKDelegate;->access$getTransportLayer(Llive/hms/video/sdk/SDKDelegate;)Llive/hms/video/transport/ITransport;

    move-result-object v3

    iget-object v4, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$ofRoles:Ljava/util/List;

    iget-object v5, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$toRole:Llive/hms/video/sdk/models/role/HMSRole;

    iget-boolean v6, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$force:Z

    iget-object v7, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    iput v2, p0, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->label:I
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v8, p0

    :try_start_2
    invoke-interface/range {v3 .. v8}, Llive/hms/video/transport/ITransport;->bulkRoleChangeRequest(Ljava/util/List;Llive/hms/video/sdk/models/role/HMSRole;ZLlive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, v8, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {p1}, Llive/hms/video/sdk/HMSActionResultListener;->onSuccess()V
    :try_end_2
    .catch Llive/hms/video/error/HMSException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object v8, p0

    goto :goto_1

    :goto_2
    iget-object v0, v8, Llive/hms/video/sdk/SDKDelegate$bulkRoleChangeRequest$1;->$hmsActionResultListener:Llive/hms/video/sdk/HMSActionResultListener;

    invoke-interface {v0, p1}, Llive/hms/video/sdk/IErrorListener;->onError(Llive/hms/video/error/HMSException;)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
