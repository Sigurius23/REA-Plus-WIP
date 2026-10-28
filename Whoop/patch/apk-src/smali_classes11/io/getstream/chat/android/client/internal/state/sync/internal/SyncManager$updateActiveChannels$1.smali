.class final Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->updateActiveChannels(ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.sync.internal.SyncManager"
    f = "SyncManager.kt"
    l = {
        0x1e7,
        0x1f1,
        0x1f3,
        0x1fc
    }
    m = "updateActiveChannels"
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field I$2:I

.field I$3:I

.field I$4:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$14:Ljava/lang/Object;

.field L$15:Ljava/lang/Object;

.field L$16:Ljava/lang/Object;

.field L$17:Ljava/lang/Object;

.field L$18:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field Z$0:Z

.field Z$1:Z

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->result:Ljava/lang/Object;

    iget p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->label:I

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager$updateActiveChannels$1;->this$0:Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->access$updateActiveChannels(Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;ZLjava/util/Set;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
