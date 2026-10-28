.class final synthetic Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$eventHandler$1;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createStatePlugin(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;
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

    const-string v6, "awaitSyncing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    const-string v5, "awaitSyncing"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$eventHandler$1;->invoke(Lq83/d;)Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->awaitSyncing(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
