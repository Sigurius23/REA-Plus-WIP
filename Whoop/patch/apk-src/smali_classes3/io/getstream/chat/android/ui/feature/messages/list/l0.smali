.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/l0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/l0;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;->X(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;Lio/getstream/chat/android/models/Message;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
