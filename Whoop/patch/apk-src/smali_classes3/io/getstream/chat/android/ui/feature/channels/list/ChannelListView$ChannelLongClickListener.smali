.class public interface abstract Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ChannelLongClickListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00e6\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;",
        "",
        "onLongClick",
        "",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "Companion",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;

.field public static final DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;

    return-void
.end method

.method private static DEFAULT$lambda$0(Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;->DEFAULT$lambda$0(Lio/getstream/chat/android/models/Channel;)Z

    return-void
.end method


# virtual methods
.method public abstract onLongClick(Lio/getstream/chat/android/models/Channel;)Z
.end method
