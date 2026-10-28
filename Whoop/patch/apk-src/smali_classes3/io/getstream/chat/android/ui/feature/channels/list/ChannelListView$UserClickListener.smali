.class public interface abstract Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "UserClickListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00e6\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;",
        "",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ll83/a0;",
        "onClick",
        "(Lio/getstream/chat/android/models/User;)V",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;

.field public static final DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;

    return-void
.end method

.method private static DEFAULT$lambda$0(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/User;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$UserClickListener;->DEFAULT$lambda$0(Lio/getstream/chat/android/models/User;)V

    return-void
.end method


# virtual methods
.method public abstract onClick(Lio/getstream/chat/android/models/User;)V
.end method
