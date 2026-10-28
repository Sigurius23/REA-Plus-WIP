.class final synthetic Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController;-><init>(Ljava/lang/String;Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lc93/p;"
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberViewController$state$1$1$5;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V"

    const/4 v5, 0x4

    const/4 v1, 0x6

    const-class v2, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Lio/getstream/chat/android/models/Member;",
            "Lio/getstream/chat/android/models/Channel;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    .line 1
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    check-cast p2, Lio/getstream/chat/android/models/Member;

    check-cast p3, Lio/getstream/chat/android/models/Channel;

    check-cast p4, Ljava/util/List;

    check-cast p5, Ljava/util/List;

    check-cast p6, Lq83/d;

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    .line 3
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoMemberData;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/Channel;Ljava/util/List;Ljava/util/List;)V

    return-object p1
.end method
