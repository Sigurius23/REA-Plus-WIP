.class public final Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/HmsTypedActionResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/polls/network/HmsPollsStartManager$manage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/HmsTypedActionResultListener<",
        "Ljava/util/List<",
        "+",
        "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "live/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1",
        "Llive/hms/video/sdk/HmsTypedActionResultListener;",
        "",
        "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
        "result",
        "Ll83/a0;",
        "onSuccess",
        "(Ljava/util/List;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $aPoll:Llive/hms/video/polls/models/HmsPoll;

.field final synthetic $deferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/polls/network/HmsPollsStartManager;


# direct methods
.method public constructor <init>(Llive/hms/video/polls/network/HmsPollsStartManager;Llive/hms/video/polls/models/HmsPoll;Lbc3/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/polls/network/HmsPollsStartManager;",
            "Llive/hms/video/polls/models/HmsPoll;",
            "Lbc3/s;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    iput-object p2, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$aPoll:Llive/hms/video/polls/models/HmsPoll;

    iput-object p3, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$deferred:Lbc3/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-virtual {p1}, Llive/hms/video/polls/network/HmsPollsStartManager;->getTAG()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error while fetching responses of "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$aPoll:Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$deferred:Lbc3/s;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->onSuccess(Ljava/util/List;)V

    return-void
.end method

.method public onSuccess(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Llive/hms/video/polls/models/network/HMSPollQuestionResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->this$0:Llive/hms/video/polls/network/HmsPollsStartManager;

    invoke-virtual {p1}, Llive/hms/video/polls/network/HmsPollsStartManager;->getTAG()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fetched my responses for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$aPoll:Llive/hms/video/polls/models/HmsPoll;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Llive/hms/video/polls/network/HmsPollsStartManager$manage$1$validPolls$1$1;->$deferred:Lbc3/s;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast p1, Lbc3/t;

    .line 4
    invoke-virtual {p1, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    return-void
.end method
