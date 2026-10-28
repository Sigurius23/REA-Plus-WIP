.class public final synthetic Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->y:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/presentation/login/JoinTeamActivity;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/Invitation;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->z:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/domain/model/User;

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->x:Ljava/lang/Object;

    check-cast p1, Ldb/v;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->y:Ljava/lang/Object;

    check-cast v0, Lsn/w0;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->z:Ljava/lang/Object;

    check-cast v1, Ljo/q;

    iget-object v2, p1, Ldb/v;->c:Landroid/widget/FrameLayout;

    check-cast v2, Ljo/s;

    iget-object v3, v2, Ljo/s;->r0:Lrm/b1;

    if-nez v3, :cond_0

    goto/16 :goto_1

    :cond_0
    check-cast v3, Lrm/u;

    invoke-virtual {v3}, Lrm/u;->g0()Lio/f;

    move-result-object v3

    iget-object v4, v3, Lio/w;->X:Lio/u;

    iget-object v4, v4, Lio/u;->w:Lzr/b1;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5, v4}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v4, Lio/t;

    iget v6, v1, Ljo/q;->b:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v6

    invoke-direct {v4, v0, v6}, Lio/t;-><init>(Lsn/w0;Ljava/util/List;)V

    iget-object v0, v4, Lio/t;->w:Lsn/w0;

    iget-object v6, v0, Lsn/w0;->y:[Lrm/c0;

    const/4 v7, 0x0

    aget-object v6, v6, v7

    iget-object v6, v6, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v6}, Llo/m;->g(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/t;

    iget-object v9, v9, Lio/t;->w:Lsn/w0;

    iget-object v9, v9, Lsn/w0;->y:[Lrm/c0;

    aget-object v9, v9, v7

    iget-object v9, v9, Lrm/c0;->L:Ljava/lang/String;

    invoke-static {v9}, Llo/m;->g(Ljava/lang/String;)I

    move-result v9

    if-ne v9, v6, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    invoke-virtual {v5, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/u;

    invoke-direct {v0, v5}, Lio/u;-><init>(Ljava/util/Map;)V

    new-instance v4, Ljava/util/HashSet;

    iget-object v5, v3, Lio/w;->Y:Lzr/j0;

    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v5, v1, Ljo/q;->a:Lrm/p1;

    iget v5, v5, Lrm/p1;->y:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v5, v2, Ljo/s;->r0:Lrm/b1;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lio/g;

    invoke-direct {v6, v3}, Lio/g;-><init>(Lio/f;)V

    iput-object v0, v6, Lio/v;->x:Lio/u;

    invoke-virtual {v6, v4}, Lio/g;->c(Ljava/util/Set;)Lio/v;

    invoke-virtual {v6}, Lio/v;->a()Lio/w;

    move-result-object v0

    check-cast v5, Lrm/u;

    invoke-virtual {v5, v0}, Lrm/u;->v0(Lio/w;)V

    iget-object v0, v1, Ljo/q;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ldb/v;->e(Ljava/lang/String;)V

    iget-object p1, v2, Ljo/s;->L0:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Poll;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;->z:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Answer;

    invoke-static {v0, v1, v2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;->A(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollCommentsDialogFragment;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Answer;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
