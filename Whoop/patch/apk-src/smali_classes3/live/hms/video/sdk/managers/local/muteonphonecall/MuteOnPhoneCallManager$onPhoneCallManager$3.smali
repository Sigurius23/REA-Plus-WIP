.class final Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->onPhoneCallManager(Lkotlin/jvm/functions/Function1;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lec3/m;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "",
        "exception",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;Ljava/lang/Throwable;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.managers.local.muteonphonecall.MuteOnPhoneCallManager$onPhoneCallManager$3"
    f = "MuteOnPhoneCallManager.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p1, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-direct {p1, v0, p3}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lq83/d;)V

    iput-object p2, p1, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->L$0:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->invoke(Lec3/m;Ljava/lang/Throwable;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->label:I

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getTAG$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Got coroutine exception "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    throw p1
.end method
