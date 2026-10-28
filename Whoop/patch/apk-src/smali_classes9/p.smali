.class public final synthetic Lp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lp;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lp;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Liq0/r;

    invoke-static {p1}, Laq0/q;->j0(Liq0/r;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lad3/g;

    invoke-static {p1}, Lcom/whoop/universalcheckout/features/cart/domain/CartAddIntent$a;->a(Lad3/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-static {p1}, Lan2/a;->a(Lcom/whoop/ui/login/ImportantAppInfo;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lcom/whoop/ui/login/ImportantAppInfo;

    invoke-static {p1}, Lcom/whoop/ui/login/MissingImportantAppInfoException;->a(Lcom/whoop/ui/login/ImportantAppInfo;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-static {p1}, Lam2/o0;->q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lm91/q;

    invoke-static {p1}, Lam2/o0;->S(Lm91/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-static {p1}, Lam2/o0;->v(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p1}, Lam2/o0;->A(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {p1}, Lam2/o0;->J(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lcom/whoop/util/TrendKey;

    invoke-static {p1}, Lam2/o0;->W(Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-static {p1}, Lam2/o0;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lcm2/k;

    invoke-static {p1}, Lam2/w;->i(Lcm2/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lcm2/p;

    invoke-static {p1}, Lam2/k;->j(Lcm2/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lk2/e;

    invoke-static {p1}, Lam0/d;->d(Lk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Ljb1/b;

    invoke-static {p1}, Lag0/b;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Ltb/a;

    invoke-static {p1}, Laa2/f;->o(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Ltb/a;

    invoke-static {p1}, Laa2/f;->n(Ltb/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lh80/b;

    invoke-static {p1}, La90/b;->b(Lh80/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Ljb1/b;

    invoke-static {p1}, La81/s;->a(Ljb1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Ly70/a;

    invoke-static {p1}, La80/m;->d(Ly70/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    invoke-static {p1}, La80/l;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    invoke-static {p1}, La61/c;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    invoke-static {p1}, La61/c;->b(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    invoke-static {p1}, La41/l;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModelFactory;->a(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_18
    check-cast p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelInfoViewModel;->j(Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_19
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModelFactory;->a(Lio/getstream/chat/android/models/Attachment;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1a
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {p1}, Lio/getstream/chat/android/ui/viewmodel/channel/ChannelAttachmentsViewModel;->j(Lio/getstream/chat/android/models/Attachment;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_1b
    invoke-static {p1}, La01/g;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

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
