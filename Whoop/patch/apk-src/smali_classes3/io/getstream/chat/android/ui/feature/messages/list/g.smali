.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;


# instance fields
.field public final synthetic a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/g;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    return-void
.end method


# virtual methods
.method public final onPollCloseClick(Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/g;->a:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->T(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/models/Poll;)Z

    move-result p1

    return p1
.end method
