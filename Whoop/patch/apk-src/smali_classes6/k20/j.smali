.class public final Lk20/j;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lk20/j;->w:I

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ll83/k;

    const-string v1, "selected_lpm"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    new-instance p1, Ll83/k;

    const-string v1, "link_context"

    invoke-direct {p1, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    filled-new-array {v0, p1}, [Ll83/k;

    move-result-object p1

    .line 5
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk20/j;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lk20/j;->w:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ll83/k;

    const-string v1, "implementation"

    const-string v2, "google_pay"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "error_message"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object p1

    .line 11
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk20/j;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lk20/m;Ly00/i;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lk20/j;->w:I

    const-string v0, "selectedBrand"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iget-object p1, p1, Lk20/m;->w:Ljava/lang/String;

    .line 14
    new-instance v0, Ll83/k;

    const-string v1, "cbc_event_source"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    iget-object p1, p2, Ly00/i;->w:Ljava/lang/String;

    .line 16
    new-instance p2, Ll83/k;

    const-string v1, "selected_card_brand"

    invoke-direct {p2, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    filled-new-array {v0, p2}, [Ll83/k;

    move-result-object p1

    .line 18
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk20/j;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt20/s;)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lk20/j;->w:I

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iget-object v0, p1, Lt20/s;->c:Ly00/c8;

    if-eqz v0, :cond_0

    .line 21
    invoke-interface {v0}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    new-instance v1, Ll83/k;

    const-string v2, "intent_id"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    iget-object v0, p1, Lt20/s;->b:Ljava/lang/String;

    .line 24
    new-instance v2, Ll83/k;

    const-string v3, "link_account_session_id"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    iget-object p1, p1, Lt20/s;->a:Ljava/lang/String;

    .line 26
    new-instance v0, Ll83/k;

    const-string v3, "fc_sdk_result"

    invoke-direct {v0, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    filled-new-array {v1, v2, v0}, [Ll83/k;

    move-result-object p1

    .line 28
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk20/j;->x:Ljava/lang/Object;

    return-void
.end method

.method private final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lk20/j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method private final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lk20/j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method private final f()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lk20/j;->x:Ljava/lang/Object;

    return-object v0
.end method

.method private final g()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lk20/j;->x:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/j;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "mc_carousel_payment_method_tapped"

    return-object v0

    :pswitch_0
    const-string v0, "mc_cardscan_api_check_failed"

    return-object v0

    :pswitch_1
    const-string v0, "mc_cbc_selected"

    return-object v0

    :pswitch_2
    const-string v0, "stripe_android.bankaccountcollector.finished"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lk20/j;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-direct {p0}, Lk20/j;->g()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-direct {p0}, Lk20/j;->f()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-direct {p0}, Lk20/j;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct {p0}, Lk20/j;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
