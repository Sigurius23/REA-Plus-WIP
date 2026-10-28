.class public final synthetic Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/channels/list/ChannelListView$ChannelLongClickListener;


# instance fields
.field public final synthetic a:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/c;->a:Lc93/a;

    return-void
.end method


# virtual methods
.method public final onLongClick(Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/c;->a:Lc93/a;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListListenerContainerImpl;->f(Lc93/a;Lio/getstream/chat/android/models/Channel;)Z

    move-result p1

    return p1
.end method
