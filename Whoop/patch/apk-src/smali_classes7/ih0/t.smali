.class public final synthetic Lih0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lih0/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lih0/t;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->h(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->i(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->a(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->e(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->c(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->f(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->k(Ljava/util/List;)Lio/getstream/chat/android/models/User;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->h(Lio/getstream/chat/android/client/api/models/QueryChannelsResult;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->g(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/models/SearchMessagesResult;

    invoke-static {p1}, Lio/getstream/chat/android/client/ChatClient;->a(Lio/getstream/chat/android/models/SearchMessagesResult;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->h(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->S(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lim1/h;->b(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lkb1/e;

    invoke-static {p1}, Lim1/f;->c(Lkb1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lim1/f;->a(I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lxs0/a;

    invoke-static {p1}, Lij0/a;->b(Lxs0/a;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lih2/b;->h(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lgh1/b;

    invoke-static {p1}, Lih1/i;->d(Lgh1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lih1/h;->b(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, Lih1/h;->c(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lah0/c;

    invoke-static {p1}, Lih0/e0;->e(Lah0/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lc0/q;

    invoke-static {p1}, Lih0/e0;->E(Lc0/q;)Lc0/l0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Li3/z;

    invoke-static {p1}, Lih0/e0;->f(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Li3/z;

    invoke-static {p1}, Lih0/e0;->F(Li3/z;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    invoke-static {p1}, Lih0/e0;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Lih0/e0;->U(Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lih0/d;

    invoke-static {p1}, Lih0/e0;->b(Lih0/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Ljava/util/Set;

    invoke-static {p1}, Lih0/e0;->d0(Ljava/util/Set;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    invoke-static {p1}, Lih0/e0;->J(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

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
