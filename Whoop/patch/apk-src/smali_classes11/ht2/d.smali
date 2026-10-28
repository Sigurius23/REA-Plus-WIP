.class public final synthetic Lht2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lht2/d;->w:I

    iput-object p1, p0, Lht2/d;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lht2/d;->w:I

    const-string v1, "_connection"

    const/4 v2, 0x1

    const/4 v3, 0x0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, p0, Lht2/d;->x:Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Lqy0/f;->i(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ltb/a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, v2, v5}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {v0}, Ltb/c;->e1()Z

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    throw p1

    :pswitch_1
    check-cast p1, Ltb/a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT name FROM workname WHERE work_spec_id=?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_1
    invoke-interface {p1, v2, v5}, Ltb/c;->L(ILjava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v3}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_2
    check-cast p1, Ltb/a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_2
    invoke-interface {p1, v2, v5}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    long-to-int v0, v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    move v2, v3

    :goto_2
    move v3, v2

    goto :goto_3

    :catchall_2
    move-exception v0

    goto :goto_4

    :cond_2
    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_3
    check-cast p1, Ltb/a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    :try_start_3
    invoke-interface {p1, v2, v5}, Ltb/c;->L(ILjava/lang/String;)V

    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1, v3}, Ltb/c;->getLong(I)J

    move-result-wide v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    long-to-int v0, v0

    if-eqz v0, :cond_3

    goto :goto_5

    :cond_3
    move v2, v3

    :goto_5
    move v3, v2

    goto :goto_6

    :catchall_3
    move-exception v0

    goto :goto_7

    :cond_4
    :goto_6
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :goto_7
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw v0

    :pswitch_4
    check-cast p1, Lw6/a;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object p1, p1, Lw6/a;->a:Ljava/util/LinkedHashMap;

    sget-object v1, Lw6/c;->a:Lt9/c0;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v4

    :pswitch_5
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Lm41/e;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Li3/z;

    sget-object v0, Li3/w;->a:[Lj93/z;

    sget-object v0, Li3/u;->K:Li3/y;

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v5}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    return-object v4

    :pswitch_7
    check-cast p1, Li3/z;

    invoke-static {p1, v2}, Li3/w;->f(Li3/z;I)V

    invoke-static {v5, p1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_8
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Llq2/s;->a(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Llq2/s;->d(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    sget-object v0, Li3/u;->s:Li3/y;

    sget-object v1, Li3/w;->a:[Lj93/z;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    return-object v4

    :pswitch_b
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_c
    check-cast p1, Li3/z;

    invoke-static {p1, v3}, Li3/w;->f(Li3/z;I)V

    invoke-static {v5, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_d
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Li3/w;->g(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_e
    check-cast p1, Li3/z;

    new-instance v0, Ll3/g;

    invoke-direct {v0, v5}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Li3/w;->l(Li3/z;Ll3/g;)V

    invoke-static {p1, v3}, Li3/w;->i(Li3/z;I)V

    return-object v4

    :pswitch_f
    check-cast p1, Li3/z;

    new-instance v0, Ll3/g;

    invoke-direct {v0, v5}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Li3/w;->l(Li3/z;Ll3/g;)V

    invoke-static {p1, v3}, Li3/w;->i(Li3/z;I)V

    return-object v4

    :pswitch_10
    check-cast p1, Li3/z;

    invoke-static {p1, v3}, Li3/w;->f(Li3/z;I)V

    invoke-static {v5, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_11
    check-cast p1, Li3/z;

    invoke-static {v5, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    return-object v4

    :pswitch_12
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;

    invoke-static {v5, p1}, Lio/getstream/chat/android/ui/feature/messages/ChannelActivity;->o(Ljava/lang/String;Lio/getstream/chat/android/ui/feature/messages/ChannelFragment$Builder;)V

    return-object v4

    :pswitch_13
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v5, p1}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerController;->a(Ljava/lang/String;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/models/LinkPreview;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Ltb/a;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->c(Ljava/lang/String;Ltb/a;)V

    return-object v4

    :pswitch_15
    check-cast p1, Ltb/a;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->a(Ljava/lang/String;Ltb/a;)V

    return-object v4

    :pswitch_16
    check-cast p1, Ltb/a;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->A(Ljava/lang/String;Ltb/a;)V

    return-object v4

    :pswitch_17
    check-cast p1, Ltb/a;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->H(Ljava/lang/String;Ltb/a;)V

    return-object v4

    :pswitch_18
    check-cast p1, Ltb/a;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->g(Ljava/lang/String;Ltb/a;)V

    return-object v4

    :pswitch_19
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/ChatClient;->j(Ljava/lang/String;Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Ljava/util/List;

    invoke-static {v5, p1}, Lio/getstream/chat/android/client/ChatClient;->d(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Landroid/webkit/WebView;

    invoke-static {v5, p1}, Lif0/c;->d(Ljava/lang/String;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Landroidx/compose/ui/Modifier;

    invoke-static {p1, v5}, Lht2/e;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
