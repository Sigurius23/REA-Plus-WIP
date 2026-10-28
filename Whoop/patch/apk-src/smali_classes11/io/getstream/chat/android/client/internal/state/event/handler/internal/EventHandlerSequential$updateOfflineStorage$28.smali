.class final synthetic Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$28;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->updateOfflineStorage(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    const-string v5, "getPoll"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->getPoll(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential$updateOfflineStorage$28;->invoke(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1
.end method
