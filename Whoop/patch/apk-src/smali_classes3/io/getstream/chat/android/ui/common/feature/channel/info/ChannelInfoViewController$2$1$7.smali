.class final synthetic Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatClient;Lec3/l;Lio/getstream/chat/android/client/channel/ChannelClient;Lec3/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lc93/n;"
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
.field public static final INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;->INSTANCE:Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewController$2$1$7;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-string v4, "<init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V"

    const/4 v5, 0x4

    const/4 v1, 0x4

    const-class v2, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    const-string v3, "<init>"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;Z",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance p4, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    invoke-direct {p4, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;-><init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V

    return-object p4
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    check-cast p2, Ljava/util/List;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    check-cast p4, Lq83/d;

    .line 3
    new-instance p4, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;

    invoke-direct {p4, p1, p2, p3}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelBaseData;-><init>(Lio/getstream/chat/android/models/ChannelData;Ljava/util/List;Z)V

    return-object p4
.end method
