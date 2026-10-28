.class public final Lio/getstream/chat/android/models/ChannelData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00f3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003\u0012\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014\u0012\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f\u0012\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008!\u0010\"J\\\u0010F\u001a\u00020G2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020I0\u001f2\u000c\u0010J\u001a\u0008\u0012\u0004\u0012\u00020I0\u001f2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001f2\u000c\u0010L\u001a\u0008\u0012\u0004\u0012\u00020M0\u001f2\u000c\u0010N\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001f2\u0006\u0010O\u001a\u00020\n2\u0006\u0010P\u001a\u00020\u000cJ\u000e\u0010Q\u001a\u00020\u000c2\u0006\u0010R\u001a\u00020\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0008H\u00c6\u0003J\t\u0010X\u001a\u00020\nH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000cH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u0010]\u001a\u00020\nH\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014H\u00c6\u0003J\u000f\u0010`\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010=J\u000b\u0010d\u001a\u0004\u0018\u00010\u001dH\u00c6\u0003J\u000f\u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001fH\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u00fe\u0001\u0010g\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00032\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00142\u000e\u0008\u0002\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f2\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u000c2\u0008\u0010j\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010k\u001a\u00020\nH\u00d6\u0001J\t\u0010l\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010$R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010$R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010-R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010/R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010/R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010+R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010$R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00109R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008:\u0010;R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010>\u001a\u0004\u0008<\u0010=R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@R\u0017\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u001f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010BR\u0013\u0010 \u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008C\u0010/R\u0011\u0010D\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008E\u0010$\u00a8\u0006m"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ChannelData;",
        "",
        "id",
        "",
        "type",
        "name",
        "image",
        "createdBy",
        "Lio/getstream/chat/android/models/User;",
        "cooldown",
        "",
        "frozen",
        "",
        "createdAt",
        "Ljava/util/Date;",
        "updatedAt",
        "deletedAt",
        "memberCount",
        "team",
        "extraData",
        "",
        "ownCapabilities",
        "",
        "membership",
        "Lio/getstream/chat/android/models/Member;",
        "draft",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "messageCount",
        "pushPreference",
        "Lio/getstream/chat/android/models/PushPreference;",
        "filterTags",
        "",
        "lastMessageAt",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V",
        "getId",
        "()Ljava/lang/String;",
        "getType",
        "getName",
        "getImage",
        "getCreatedBy",
        "()Lio/getstream/chat/android/models/User;",
        "getCooldown",
        "()I",
        "getFrozen",
        "()Z",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "getUpdatedAt",
        "getDeletedAt",
        "getMemberCount",
        "getTeam",
        "getExtraData",
        "()Ljava/util/Map;",
        "getOwnCapabilities",
        "()Ljava/util/Set;",
        "getMembership",
        "()Lio/getstream/chat/android/models/Member;",
        "getDraft",
        "()Lio/getstream/chat/android/models/DraftMessage;",
        "getMessageCount",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getPushPreference",
        "()Lio/getstream/chat/android/models/PushPreference;",
        "getFilterTags",
        "()Ljava/util/List;",
        "getLastMessageAt",
        "cid",
        "getCid",
        "toChannel",
        "Lio/getstream/chat/android/models/Channel;",
        "messages",
        "Lio/getstream/chat/android/models/Message;",
        "cachedLatestMessages",
        "members",
        "reads",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "watchers",
        "watcherCount",
        "insideSearch",
        "isUserAbleTo",
        "channelCapability",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)Lio/getstream/chat/android/models/ChannelData;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final cooldown:I

.field private final createdAt:Ljava/util/Date;

.field private final createdBy:Lio/getstream/chat/android/models/User;

.field private final deletedAt:Ljava/util/Date;

.field private final draft:Lio/getstream/chat/android/models/DraftMessage;

.field private final extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final filterTags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final frozen:Z

.field private final id:Ljava/lang/String;

.field private final image:Ljava/lang/String;

.field private final lastMessageAt:Ljava/util/Date;

.field private final memberCount:I

.field private final membership:Lio/getstream/chat/android/models/Member;

.field private final messageCount:Ljava/lang/Integer;

.field private final name:Ljava/lang/String;

.field private final ownCapabilities:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final pushPreference:Lio/getstream/chat/android/models/PushPreference;

.field private final team:Ljava/lang/String;

.field private final type:Ljava/lang/String;

.field private final updatedAt:Ljava/util/Date;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "IZ",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Member;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p12

    move-object/from16 v1, p13

    move-object/from16 v2, p14

    move-object/from16 v3, p19

    const-string v4, "id"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "type"

    invoke-static {p2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "name"

    invoke-static {p3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "image"

    invoke-static {p4, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "createdBy"

    invoke-static {p5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "team"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "extraData"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "ownCapabilities"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "filterTags"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    .line 7
    iput p6, p0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    .line 8
    iput-boolean p7, p0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    .line 9
    iput-object p8, p0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    .line 10
    iput-object p9, p0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    .line 11
    iput-object p10, p0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    move/from16 p1, p11

    .line 12
    iput p1, p0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    .line 13
    iput-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    .line 14
    iput-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    .line 15
    iput-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    move-object/from16 p1, p15

    .line 16
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 p1, p16

    .line 17
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 p1, p17

    .line 18
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    move-object/from16 p1, p18

    .line 19
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    .line 20
    iput-object v3, p0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    move-object/from16 p1, p20

    .line 21
    iput-object p1, p0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 36

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x4

    .line 22
    const-string v2, ""

    if-eqz v1, :cond_0

    move-object v6, v2

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    move-object v7, v2

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_2

    .line 23
    new-instance v8, Lio/getstream/chat/android/models/User;

    const v34, 0x1ffffff

    const/16 v35, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v8 .. v35}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move v9, v3

    goto :goto_3

    :cond_3
    move/from16 v9, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move v10, v3

    goto :goto_4

    :cond_4
    move/from16 v10, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    const/4 v4, 0x0

    if-eqz v1, :cond_5

    move-object v11, v4

    goto :goto_5

    :cond_5
    move-object/from16 v11, p8

    :goto_5
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_6

    move-object v12, v4

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    move-object v13, v4

    goto :goto_7

    :cond_7
    move-object/from16 v13, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    move v14, v3

    goto :goto_8

    :cond_8
    move/from16 v14, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v15, v2

    goto :goto_9

    :cond_9
    move-object/from16 v15, p12

    :goto_9
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_a

    .line 24
    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object/from16 v16, v1

    goto :goto_a

    :cond_a
    move-object/from16 v16, p13

    :goto_a
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_b

    .line 25
    sget-object v1, Lm83/a0;->w:Lm83/a0;

    move-object/from16 v17, v1

    goto :goto_b

    :cond_b
    move-object/from16 v17, p14

    :goto_b
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_c

    move-object/from16 v18, v4

    goto :goto_c

    :cond_c
    move-object/from16 v18, p15

    :goto_c
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v19, v4

    goto :goto_d

    :cond_d
    move-object/from16 v19, p16

    :goto_d
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v20, v4

    goto :goto_e

    :cond_e
    move-object/from16 v20, p17

    :goto_e
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v21, v4

    goto :goto_f

    :cond_f
    move-object/from16 v21, p18

    :goto_f
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    .line 26
    sget-object v1, Lm83/y;->w:Lm83/y;

    move-object/from16 v22, v1

    goto :goto_10

    :cond_10
    move-object/from16 v22, p19

    :goto_10
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    move-object/from16 v23, v4

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v4, p1

    goto :goto_11

    :cond_11
    move-object/from16 v23, p20

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    .line 27
    :goto_11
    invoke-direct/range {v3 .. v23}, Lio/getstream/chat/android/models/ChannelData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    :goto_13
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_14

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    goto :goto_13

    :goto_14
    invoke-virtual/range {p1 .. p21}, Lio/getstream/chat/android/models/ChannelData;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    return v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final component15()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final component16()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final component17()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component18()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final component19()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component20()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    return v0
.end method

.method public final component8()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final component9()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)Lio/getstream/chat/android/models/ChannelData;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "IZ",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/models/Member;",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Ljava/lang/Integer;",
            "Lio/getstream/chat/android/models/PushPreference;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Date;",
            ")",
            "Lio/getstream/chat/android/models/ChannelData;"
        }
    .end annotation

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "image"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdBy"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "team"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filterTags"

    move-object/from16 v1, p19

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/ChannelData;

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/ChannelData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/models/ChannelData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    iget v3, p1, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    iget v3, p1, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    iget-object p1, p1, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getCid()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const-string v0, ""

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    const-string v2, ":"

    invoke-static {v0, v2, v1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCooldown()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    return v0
.end method

.method public final getCreatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getCreatedBy()Lio/getstream/chat/android/models/User;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    return-object v0
.end method

.method public final getDeletedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getDraft()Lio/getstream/chat/android/models/DraftMessage;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    return-object v0
.end method

.method public final getExtraData()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    return-object v0
.end method

.method public final getFilterTags()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    return-object v0
.end method

.method public final getFrozen()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    return v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastMessageAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    return-object v0
.end method

.method public final getMemberCount()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    return v0
.end method

.method public final getMembership()Lio/getstream/chat/android/models/Member;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    return-object v0
.end method

.method public final getMessageCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getOwnCapabilities()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    return-object v0
.end method

.method public final getPushPreference()Lio/getstream/chat/android/models/PushPreference;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    return-object v0
.end method

.method public final getTeam()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    invoke-static {v2, v0, v1}, Ld13/a;->b(Lio/getstream/chat/android/models/User;II)I

    move-result v0

    iget v2, p0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lio/getstream/chat/android/models/DraftMessage;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Lio/getstream/chat/android/models/PushPreference;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public final isUserAbleTo(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "channelCapability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final toChannel(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZ)Lio/getstream/chat/android/models/Channel;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;IZ)",
            "Lio/getstream/chat/android/models/Channel;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "messages"

    move-object/from16 v14, p1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cachedLatestMessages"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "members"

    move-object/from16 v15, p3

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reads"

    move-object/from16 v3, p4

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "watchers"

    move-object/from16 v4, p5

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    iget-boolean v8, v0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    iget-object v9, v0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    iget-object v11, v0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    iget-object v7, v0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    iget v12, v0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    iget-object v13, v0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    move-object/from16 v35, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    move-object/from16 v19, v13

    iget v13, v0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    move-object/from16 v27, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 v28, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v31, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    move-object/from16 v33, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v34, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    new-instance v2, Lio/getstream/chat/android/models/Channel;

    const/16 v39, 0x0

    const/16 v40, 0x0

    move/from16 v24, v12

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    sget-object v32, Lm83/y;->w:Lm83/y;

    const v38, 0xda8200

    move-object/from16 v29, p2

    move-object/from16 v17, p4

    move-object/from16 v16, p5

    move/from16 v30, p7

    move-object/from16 v36, v1

    move-object/from16 v37, v7

    move/from16 v7, p6

    invoke-direct/range {v2 .. v40}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/models/ChannelData;->id:Ljava/lang/String;

    iget-object v2, v0, Lio/getstream/chat/android/models/ChannelData;->type:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/ChannelData;->name:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/ChannelData;->image:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/ChannelData;->createdBy:Lio/getstream/chat/android/models/User;

    iget v6, v0, Lio/getstream/chat/android/models/ChannelData;->cooldown:I

    iget-boolean v7, v0, Lio/getstream/chat/android/models/ChannelData;->frozen:Z

    iget-object v8, v0, Lio/getstream/chat/android/models/ChannelData;->createdAt:Ljava/util/Date;

    iget-object v9, v0, Lio/getstream/chat/android/models/ChannelData;->updatedAt:Ljava/util/Date;

    iget-object v10, v0, Lio/getstream/chat/android/models/ChannelData;->deletedAt:Ljava/util/Date;

    iget v11, v0, Lio/getstream/chat/android/models/ChannelData;->memberCount:I

    iget-object v12, v0, Lio/getstream/chat/android/models/ChannelData;->team:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/chat/android/models/ChannelData;->extraData:Ljava/util/Map;

    iget-object v14, v0, Lio/getstream/chat/android/models/ChannelData;->ownCapabilities:Ljava/util/Set;

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->membership:Lio/getstream/chat/android/models/Member;

    move-object/from16 v16, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->draft:Lio/getstream/chat/android/models/DraftMessage;

    move-object/from16 v17, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->messageCount:Ljava/lang/Integer;

    move-object/from16 v18, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->pushPreference:Lio/getstream/chat/android/models/PushPreference;

    move-object/from16 v19, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->filterTags:Ljava/util/List;

    move-object/from16 v20, v15

    iget-object v15, v0, Lio/getstream/chat/android/models/ChannelData;->lastMessageAt:Ljava/util/Date;

    const-string v0, ", type="

    move-object/from16 v21, v15

    const-string v15, ", name="

    move-object/from16 v22, v14

    const-string v14, "ChannelData(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", image="

    const-string v2, ", createdBy="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cooldown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", frozen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deletedAt="

    const-string v2, ", memberCount="

    invoke-static {v0, v9, v1, v10, v2}, Lhc3/i;->n(Ljava/lang/StringBuilder;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    const-string v1, ", team="

    const-string v2, ", extraData="

    invoke-static {v11, v1, v12, v2, v0}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ownCapabilities="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", membership="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", draft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", messageCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pushPreference="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", filterTags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lastMessageAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
