.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/h0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final onSuggestPollOptionClick(Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/h0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->d0(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Poll;)Z

    move-result p1

    return p1
.end method
