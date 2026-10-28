.class public final Lk20/n;
.super Lk20/t;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lhy/h;)V
    .locals 5

    const/4 v0, 0x4

    iput v0, p0, Lk20/n;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Lhy/h;->b()Ly00/q1;

    move-result-object v0

    .line 3
    iget-object v0, v0, Ly00/q1;->w:Ljava/lang/String;

    .line 4
    new-instance v1, Ll83/k;

    const-string v2, "experiment_retrieved"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p1}, Lhy/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 6
    new-instance v2, Ll83/k;

    const-string v3, "arb_id"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {p1}, Lhy/h;->c()Ljava/lang/String;

    move-result-object v0

    .line 8
    new-instance v3, Ll83/k;

    const-string v4, "assignment_group"

    invoke-direct {v3, v4, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    filled-new-array {v1, v2, v3}, [Ll83/k;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    .line 11
    iget-object p1, p1, Lhy/h;->d:Ljava/util/Map;

    .line 12
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 13
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 15
    check-cast v2, Ljava/util/Map$Entry;

    .line 16
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "dimensions-"

    .line 17
    invoke-static {v3, v4}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 19
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v0, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    const/4 v0, 0x6

    iput v0, p0, Lk20/n;->w:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 27
    new-instance v1, Ll83/k;

    const-string v2, "error_message"

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    new-instance v0, Ll83/k;

    const-string v2, "payment_method_type"

    invoke-direct {v0, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    filled-new-array {v1, v0}, [Ll83/k;

    move-result-object p1

    .line 30
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    .line 31
    invoke-static {p2}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lk20/n;->w:I

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    invoke-static {p1}, Lse/b;->C(Ljava/lang/Throwable;)La30/e1;

    move-result-object v0

    invoke-virtual {v0}, La30/e1;->a()Ljava/lang/String;

    move-result-object v0

    .line 34
    const-string v1, "error_message"

    invoke-static {v1, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 35
    invoke-static {p1}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>(Lkotlin/time/Duration;I)V
    .locals 2

    iput p2, p0, Lk20/n;->w:I

    packed-switch p2, :pswitch_data_0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 41
    new-instance p2, Ll83/k;

    const-string v0, "implementation"

    const-string v1, "google_pay"

    invoke-direct {p2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 43
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void

    .line 44
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 46
    new-instance p2, Ll83/k;

    const-string v0, "implementation"

    const-string v1, "google_pay"

    invoke-direct {p2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    invoke-static {p2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 48
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lkotlin/time/Duration;Ljava/lang/Throwable;I)V
    .locals 2

    iput p3, p0, Lk20/n;->w:I

    packed-switch p3, :pswitch_data_0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-static {p1}, Lvd/f;->C(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p1

    .line 51
    new-instance p3, Ll83/k;

    const-string v0, "implementation"

    const-string v1, "google_pay"

    invoke-direct {p3, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 53
    :goto_0
    new-instance v0, Ll83/k;

    const-string v1, "error_message"

    invoke-direct {v0, v1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    filled-new-array {p3, v0}, [Ll83/k;

    move-result-object p2

    .line 55
    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    .line 56
    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void

    .line 57
    :pswitch_0
    const-string p3, "error"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    .line 59
    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    .line 60
    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p1}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p1, v0

    .line 61
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 62
    :goto_1
    new-instance p3, Ll83/k;

    const-string v0, "duration"

    invoke-direct {p3, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    invoke-static {p2}, Lse/b;->C(Ljava/lang/Throwable;)La30/e1;

    move-result-object p1

    invoke-virtual {p1}, La30/e1;->a()Ljava/lang/String;

    move-result-object p1

    .line 64
    new-instance v0, Ll83/k;

    const-string v1, "error_message"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 65
    filled-new-array {p3, v0}, [Ll83/k;

    move-result-object p1

    .line 66
    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    .line 67
    invoke-static {p2}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ly00/i;Ljava/lang/Throwable;)V
    .locals 2

    const/4 v0, 0x7

    iput v0, p0, Lk20/n;->w:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    if-eqz p1, :cond_0

    .line 70
    const-string v1, "selected_card_brand"

    .line 71
    iget-object p1, p1, Ly00/i;->w:Ljava/lang/String;

    .line 72
    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    :cond_0
    const-string p1, "error_message"

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    .line 75
    invoke-static {p2}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p1, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk20/n;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "mc_update_card_failed"

    return-object v0

    :pswitch_0
    const-string v0, "mc_set_default_payment_method_failed"

    return-object v0

    :pswitch_1
    const-string v0, "mc_load_failed"

    return-object v0

    :pswitch_2
    const-string v0, "elements.experiment_exposure"

    return-object v0

    :pswitch_3
    const-string v0, "mc_elements_session_load_failed"

    return-object v0

    :pswitch_4
    const-string v0, "mc_cardscan_success"

    return-object v0

    :pswitch_5
    const-string v0, "mc_cardscan_failed"

    return-object v0

    :pswitch_6
    const-string v0, "mc_cardscan_cancel"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

    iget v0, p0, Lk20/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lk20/n;->x:Ljava/util/LinkedHashMap;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
