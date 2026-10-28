.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/util/List;

.field public final synthetic w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

.field public final synthetic x:Z

.field public final synthetic y:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->x:Z

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->y:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->z:Z

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->E:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->z:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->E:Ljava/util/List;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->w:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;

    iget-boolean v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->x:Z

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/b1;->y:Lio/getstream/chat/android/ui/model/MessageListItemWrapper;

    invoke-static {v2, v3, v4, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$handleNewWrapper$1$1;->f(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView;ZLio/getstream/chat/android/ui/model/MessageListItemWrapper;ZLjava/util/List;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
