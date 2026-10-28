.class final Llive/hms/video/sdk/HMSSDK$initLogStorage$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/HMSSDK;->initLogStorage()V
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
    c = "live.hms.video.sdk.HMSSDK$initLogStorage$1"
    f = "HMSSDK.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/HMSSDK;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/HMSSDK;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/HMSSDK;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/HMSSDK$initLogStorage$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;

    iget-object v0, p0, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    invoke-direct {p1, v0, p2}, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;-><init>(Llive/hms/video/sdk/HMSSDK;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/HMSSDK$initLogStorage$1;->this$0:Llive/hms/video/sdk/HMSSDK;

    :try_start_0
    invoke-virtual {p1}, Llive/hms/video/sdk/HMSSDK;->getHmsLogSettings()Llive/hms/video/media/settings/HMSLogSettings;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/media/settings/HMSLogSettings;->isLogStorageEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Llive/hms/video/utils/LogUtils;->INSTANCE:Llive/hms/video/utils/LogUtils;

    invoke-virtual {p1}, Llive/hms/video/sdk/HMSSDK;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Llive/hms/video/utils/LogUtils;->checkDirSizeAndRemove(Landroid/content/Context;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/HMSSDK;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/sdk/HMSSDK;->getFrameworkInfo()Llive/hms/video/sdk/models/FrameworkInfo;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Llive/hms/video/utils/LogUtils;->staticFileWriterStart(Landroid/content/Context;Llive/hms/video/sdk/models/FrameworkInfo;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_0
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
