.class public final synthetic Lim1/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lim1/p0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lim1/p0;->w:I

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/whoop/startactivity/dropdown/DropdownModel;

    invoke-static {p1}, Ljg2/d;->d(Lcom/whoop/startactivity/dropdown/DropdownModel;)Ljg2/b;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Ljg2/d;->a(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lm91/q;

    invoke-static {p1}, Ljg2/d;->c(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ljg2/d;->b(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :pswitch_4
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Ljb1/c;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lm91/u;

    invoke-static {p1}, Ljb1/a;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lk2/c;

    check-cast p1, La3/p0;

    invoke-virtual {p1}, La3/p0;->t0()La3/p;

    move-result-object v2

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v3

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v2, La3/p;->x:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Laj/d;

    const v6, -0x800001

    const/4 v7, 0x0

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v10, 0x1

    invoke-virtual/range {v5 .. v10}, Laj/d;->d(FFFFI)V

    invoke-virtual {p1}, La3/p0;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    return-object v1

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-static {v2, v3, v4}, Ld;->z(La3/p;J)V

    throw p1

    :pswitch_7
    check-cast p1, Li3/z;

    sget p1, Lj1/g;->a:F

    return-object v1

    :pswitch_8
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lj02/b0;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lcom/whoop/navigation/AiAction;->c(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;

    invoke-static {p1}, Lis1/a;->a(Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;)Ljs1/h;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Llb1/z0;

    invoke-static {p1}, Lis1/a;->b(Llb1/z0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lis1/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->b(Lio/getstream/chat/android/client/events/ChatEvent;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_e
    check-cast p1, Lio/getstream/chat/android/models/PushMessage;

    invoke-static {p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationHandlerFactory;->b(Lio/getstream/chat/android/models/PushMessage;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_f
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;->a(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lim1/t0;->F(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lim1/t0;->H(Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lfm1/g;

    invoke-static {p1}, Lim1/t0;->b0(Lfm1/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lem1/t;

    invoke-static {p1}, Lim1/t0;->n(Lem1/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->k(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->N(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->G(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lul1/c;

    invoke-static {p1}, Lim1/t0;->p(Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lem1/o;

    invoke-static {p1}, Lim1/t0;->i(Lem1/o;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {p1}, Lim1/t0;->w(Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lkd1/l;

    invoke-static {p1}, Lim1/t0;->o(Lkd1/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lb11/h;

    invoke-static {p1}, Lim1/t0;->J(Lb11/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Lim1/t0;->d(I)Ll83/a0;

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
