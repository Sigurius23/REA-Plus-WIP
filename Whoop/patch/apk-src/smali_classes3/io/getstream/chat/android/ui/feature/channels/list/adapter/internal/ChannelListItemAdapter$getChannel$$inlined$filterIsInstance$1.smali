.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->getChannel$stream_chat_android_ui_components_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
