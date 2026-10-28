.class final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/n;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0005H\n"
    }
    d2 = {
        "<anonymous>",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;",
        "data3",
        "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;",
        "mutedUsers",
        "",
        "Lio/getstream/chat/android/models/Mute;",
        "blockedUserIds",
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
    c = "io.getstream.chat.android.ui.common.feature.channel.info.ChannelInfoViewController$2$1$8"
    f = "ChannelInfoViewController.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x4

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;

    const/4 v1, 0x4

    .line 1
    invoke-direct {v0, v1, p4}, Ls83/i;-><init>(ILq83/d;)V

    .line 2
    iput-object p1, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$2:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/util/List;

    check-cast p4, Lq83/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->invoke(Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$1:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/util/List;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->L$2:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/util/List;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$8;->label:I

    if-nez v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v2, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;->getChannelData()Lio/getstream/chat/android/models/ChannelData;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;->getMembers()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;->isMuted()Z

    move-result v5

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoData;-><init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;ZLjava/util/List;Ljava/util/List;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
