.class public final synthetic Las1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Las1/f;->w:I

    iput-object p1, p0, Las1/f;->y:Ljava/lang/Object;

    iput-boolean p2, p0, Las1/f;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Las1/f;->w:I

    iput-boolean p1, p0, Las1/f;->x:Z

    iput-object p2, p0, Las1/f;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Las1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, [Ll83/k;

    check-cast p1, Lk2/c;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Ly11/c;->f(Z[Ll83/k;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Lx21/a;

    check-cast p1, Landroid/widget/NumberPicker;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Lx21/d;->g(ZLx21/a;Landroid/widget/NumberPicker;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Ln42/b;

    check-cast p1, Ln0/q;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Lo42/k;->h(ZLn42/b;Ln0/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;

    iget-boolean v1, p0, Las1/f;->x:Z

    check-cast p1, Ln23/e;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;->i(Lio/getstream/chat/android/ui/common/feature/messages/list/MessageListController;ZLn23/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    check-cast p1, Lio/getstream/chat/android/client/channel/state/ChannelState;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->c(ZLjava/util/Set;Lio/getstream/chat/android/client/channel/state/ChannelState;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ltb/a;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v0, p1, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->k(Ljava/lang/String;Ltb/a;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Ly2/j1;

    check-cast p1, Ly2/i1;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Lcp0/m1;->i(ZLy2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Lbl2/d;

    iget-boolean v1, p0, Las1/f;->x:Z

    check-cast p1, Lpg3/v0;

    invoke-static {v0, v1, p1}, Lbl2/d;->w(Lbl2/d;ZLpg3/v0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Ly3/c;

    check-cast p1, Lk2/c;

    iget-boolean v1, p0, Las1/f;->x:Z

    invoke-static {v1, v0, p1}, Lb72/b;->j(ZLy3/c;Lk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Las1/f;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iget-boolean v1, p0, Las1/f;->x:Z

    check-cast p1, Lw71/d;

    invoke-static {v0, v1, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->L(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZLw71/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
