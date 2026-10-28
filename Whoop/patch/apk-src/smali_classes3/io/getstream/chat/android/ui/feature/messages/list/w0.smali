.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/w0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->$$delegatedProperties:[Lj93/z;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/w0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelClickListener;->onUnreadLabelClick()V

    return-void
.end method
