.class final Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/ExtensionUtilsKt;->withRetry(Lkotlin/jvm/functions/Function1;Lc93/m;Llive/hms/video/transport/models/TransportFailureCategory;Llive/hms/video/sdk/models/EVENT_TYPE;Llive/hms/video/sdk/models/IRetryAttemptTracking;ILq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "R",
        "Lec3/m;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.utils.ExtensionUtilsKt$withRetry$result$1$1"
    f = "ExtensionUtils.kt"
    l = {
        0x52,
        0x55,
        0x55,
        0x57,
        0x57,
        0x59,
        0x59
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $dependencyCheck:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field final synthetic $task:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Llive/hms/video/transport/models/TransportFailureCategory;Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/transport/models/TransportFailureCategory;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    iput-object p2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$dependencyCheck:Lc93/m;

    iput-object p3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$task:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;

    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    iget-object v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$dependencyCheck:Lc93/m;

    iget-object v3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$task:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2, v3, p2}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;-><init>(Llive/hms/video/transport/models/TransportFailureCategory;Lc93/m;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    const/4 v2, 0x0

    const-string v3, "JsonRPCSignal"

    const/4 v4, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_4
    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    if-eqz p1, :cond_5

    iget-object v5, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$dependencyCheck:Lc93/m;

    iput-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {v5, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_0
    check-cast p1, Lbc3/s;

    if-eqz p1, :cond_5

    check-cast p1, Lbc3/t1;

    invoke-virtual {p1}, Lbc3/t1;->isActive()Z

    move-result p1

    if-ne p1, v4, :cond_5

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v4, "Waiting for dependency:: "

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " to complete before trying to send this message"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$dependencyCheck:Lc93/m;

    iget-object v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    iput-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {p1, v4, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    goto :goto_5

    :cond_1
    :goto_1
    check-cast p1, Lbc3/s;

    if-eqz p1, :cond_3

    iput-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_5

    :cond_2
    :goto_2
    check-cast p1, Ljava/lang/Long;

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v4, "Dependency :: "

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$tfcDependency:Llive/hms/video/transport/models/TransportFailureCategory;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " completed"

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$task:Lkotlin/jvm/functions/Function1;

    iput-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_5

    :cond_4
    :goto_3
    iput-object v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_5
    iget-object p1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->$task:Lkotlin/jvm/functions/Function1;

    iput-object v1, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x6

    iput v3, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    iput-object v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x7

    iput v2, p0, Llive/hms/video/utils/ExtensionUtilsKt$withRetry$result$1$1;->label:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_5
    return-object v0

    :cond_7
    :goto_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
