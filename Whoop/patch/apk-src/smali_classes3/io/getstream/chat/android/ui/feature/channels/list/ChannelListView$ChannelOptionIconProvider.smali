.class public interface abstract Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ChannelOptionIconProvider"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00e6\u0080\u0001\u0018\u0000 \u00062\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u0006J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u00a6\u0002\u00a8\u0006\u0007\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Channel;",
        "Landroid/graphics/drawable/Drawable;",
        "invoke",
        "channel",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;

.field public static final DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;->$$INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider$Companion;

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->DEFAULT:Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;

    return-void
.end method

.method private static DEFAULT$lambda$0(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Channel;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelOptionIconProvider;->DEFAULT$lambda$0(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public abstract invoke(Lio/getstream/chat/android/models/Channel;)Landroid/graphics/drawable/Drawable;
.end method

.method public abstract synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
.end method
