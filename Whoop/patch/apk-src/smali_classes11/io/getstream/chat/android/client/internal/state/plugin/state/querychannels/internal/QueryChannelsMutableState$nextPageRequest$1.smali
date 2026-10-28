.class final Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "currentRequest",
        "currentOffset",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.internal.state.plugin.state.querychannels.internal.QueryChannelsMutableState$nextPageRequest$1"
    f = "QueryChannelsMutableState.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic I$0:I

.field synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;ILq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;

    const/4 v1, 0x3

    .line 1
    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->I$0:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->invoke(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->I$0:I

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    const/16 v11, 0x1fd

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->copy$default(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
