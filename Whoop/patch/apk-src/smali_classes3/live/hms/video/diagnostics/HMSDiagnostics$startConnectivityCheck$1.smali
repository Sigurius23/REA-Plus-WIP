.class final Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/diagnostics/HMSDiagnostics;->startConnectivityCheck(Ljava/lang/String;Llive/hms/video/diagnostics/ConnectivityCheckListener;J)V
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
    c = "live.hms.video.diagnostics.HMSDiagnostics$startConnectivityCheck$1"
    f = "HMSDiagnostics.kt"
    l = {
        0x122
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $region:Ljava/lang/String;

.field final synthetic $timeInMillis:J

.field label:I

.field final synthetic this$0:Llive/hms/video/diagnostics/HMSDiagnostics;


# direct methods
.method public constructor <init>(Ljava/lang/String;Llive/hms/video/diagnostics/HMSDiagnostics;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Llive/hms/video/diagnostics/HMSDiagnostics;",
            "J",
            "Lq83/d<",
            "-",
            "Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$region:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iput-wide p3, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$timeInMillis:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$region:Ljava/lang/String;

    iget-object v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iget-wide v3, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$timeInMillis:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;-><init>(Ljava/lang/String;Llive/hms/video/diagnostics/HMSDiagnostics;JLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->label:I

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
    sget-object p1, Llive/hms/video/diagnostics/DiagnosticTokenService;->INSTANCE:Llive/hms/video/diagnostics/DiagnosticTokenService;

    iget-object v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$region:Ljava/lang/String;

    iput v2, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->label:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, p0}, Llive/hms/video/diagnostics/DiagnosticTokenService;->getDiagnosticRoomToken(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;

    invoke-virtual {p1}, Llive/hms/video/diagnostics/models/DiagnosticTokenResponse;->getToken()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    iget-wide v1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->$timeInMillis:J

    invoke-static {v0, p1, v1, v2}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$joinConnectivityTestRoom(Llive/hms/video/diagnostics/HMSDiagnostics;Ljava/lang/String;J)V
    :try_end_1
    .catch Llive/hms/video/error/HMSException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error in getting token from Diagnostic API :: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDiagnostic"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {v0}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$getResult$p(Llive/hms/video/diagnostics/HMSDiagnostics;)Llive/hms/video/diagnostics/models/ConnectivityCheckResult;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->getErrors()Ljava/util/List;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.util.ArrayList<live.hms.video.error.HMSException>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Llive/hms/video/diagnostics/HMSDiagnostics$startConnectivityCheck$1;->this$0:Llive/hms/video/diagnostics/HMSDiagnostics;

    invoke-static {p1}, Llive/hms/video/diagnostics/HMSDiagnostics;->access$handleTestCompletion(Llive/hms/video/diagnostics/HMSDiagnostics;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
