.class public final Lk20/l;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Map;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lk20/l;->w:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    const-string p1, "implementation"

    const-string v0, "google_pay"

    invoke-static {p1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 3
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    const-string p1, "implementation"

    const-string v0, "google_pay"

    invoke-static {p1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 6
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lk20/l;->w:I

    packed-switch p2, :pswitch_data_0

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-string p2, "error_message"

    .line 9
    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 10
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    .line 11
    :pswitch_1
    const-string p2, "code"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string p2, "selected_lpm"

    .line 14
    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 15
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    .line 16
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const-string p2, "payment_method_type"

    .line 18
    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 19
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    .line 20
    :pswitch_3
    const-string p2, "code"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const-string p2, "selected_lpm"

    .line 23
    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 24
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    .line 25
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string p2, "selected_lpm"

    .line 27
    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 28
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(Lkotlin/time/Duration;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lk20/l;->w:I

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 45
    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    .line 46
    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p1}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p1, v0

    .line 47
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    new-instance v0, Ll83/k;

    const-string v1, "duration"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    new-instance p1, Ll83/k;

    const-string v1, "selected_lpm"

    invoke-direct {p1, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    new-instance p2, Ll83/k;

    const-string v1, "link_context"

    invoke-direct {p2, v1, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    filled-new-array {v0, p1, p2}, [Ll83/k;

    move-result-object p1

    .line 52
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    .line 53
    invoke-static {p1}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ly00/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lk20/l;->w:I

    const-string v0, "cardBrand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    const-string v0, "brand"

    .line 56
    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    .line 57
    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 58
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lk20/l;->w:I

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    const-string v0, "compose"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 64
    invoke-static {p1, v0}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 65
    iput-object p1, p0, Lk20/l;->x:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/l;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "mc_form_shown"

    return-object v0

    :pswitch_0
    const-string v0, "mc_set_default_payment_method"

    return-object v0

    :pswitch_1
    const-string v0, "mc_confirm_button_tapped"

    return-object v0

    :pswitch_2
    const-string v0, "mc_form_interacted"

    return-object v0

    :pswitch_3
    const-string v0, "mc_form_completed"

    return-object v0

    :pswitch_4
    const-string v0, "luxe_serialize_failure"

    return-object v0

    :pswitch_5
    const-string v0, "mc_load_started"

    return-object v0

    :pswitch_6
    const-string v0, "mc_cardscan_scan_started"

    return-object v0

    :pswitch_7
    const-string v0, "mc_cardscan_api_check_succeeded"

    return-object v0

    :pswitch_8
    const-string v0, "mc_disallowed_card_brand"

    return-object v0

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

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lk20/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lk20/l;->x:Ljava/util/Map;

    return-object v0

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
