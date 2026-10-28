.class public final Lg20/r;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# static fields
.field public static final O:Ljava/util/List;


# instance fields
.field public final E:Lb20/g;

.field public final F:Lu03/a;

.field public final G:Lu03/a;

.field public final H:Lyy/j;

.field public final I:Lb10/b;

.field public final J:Lq83/j;

.field public final K:Landroidx/lifecycle/k1;

.field public final L:Z

.field public final M:Lbz/c;

.field public final N:Lec3/h2;

.field public final w:Z

.field public final x:Lb10/z0;

.field public final y:Lc20/a;

.field public final z:Lv10/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "payment_method"

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lg20/r;->O:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(ZLb10/z0;Lc20/a;Lv10/a;Lb20/g;Lu03/a;Lu03/a;Lyy/j;Lb10/b;Lq83/j;Landroidx/lifecycle/k1;ZLbz/c;)V
    .locals 1

    const-string v0, "nextActionHandlerRegistry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultReturnUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazyPaymentIntentFlowResultProcessor"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lazySetupIntentFlowResultProcessor"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-boolean p1, p0, Lg20/r;->w:Z

    iput-object p2, p0, Lg20/r;->x:Lb10/z0;

    iput-object p3, p0, Lg20/r;->y:Lc20/a;

    iput-object p4, p0, Lg20/r;->z:Lv10/a;

    iput-object p5, p0, Lg20/r;->E:Lb20/g;

    iput-object p6, p0, Lg20/r;->F:Lu03/a;

    iput-object p7, p0, Lg20/r;->G:Lu03/a;

    iput-object p8, p0, Lg20/r;->H:Lyy/j;

    iput-object p9, p0, Lg20/r;->I:Lb10/b;

    iput-object p10, p0, Lg20/r;->J:Lq83/j;

    iput-object p11, p0, Lg20/r;->K:Landroidx/lifecycle/k1;

    iput-boolean p12, p0, Lg20/r;->L:Z

    iput-object p13, p0, Lg20/r;->M:Lbz/c;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lg20/r;->N:Lec3/h2;

    return-void
.end method

.method public static final g(Lg20/r;Ly00/s;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lg20/r;->E:Lb20/g;

    iget-object v1, p0, Lg20/r;->x:Lb10/z0;

    instance-of v2, p3, Lg20/n;

    if-eqz v2, :cond_0

    move-object v2, p3

    check-cast v2, Lg20/n;

    iget v3, v2, Lg20/n;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lg20/n;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lg20/n;

    invoke-direct {v2, p0, p3}, Lg20/n;-><init>(Lg20/r;Ls83/c;)V

    :goto_0
    iget-object p0, v2, Lg20/n;->w:Ljava/lang/Object;

    sget-object p3, Lr83/a;->w:Lr83/a;

    iget v3, v2, Lg20/n;->y:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_3

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_2

    :cond_1
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ll83/n;

    iget-object p0, p0, Ll83/n;->w:Ljava/lang/Object;

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ly00/s;->v0(Ljava/lang/String;)V

    invoke-interface {p1}, Ly00/s;->w0()Ly00/s;

    move-result-object p0

    instance-of p1, p0, Ly00/q;

    sget-object p2, Lg20/r;->O:Ljava/util/List;

    if-eqz p1, :cond_5

    check-cast p0, Ly00/q;

    invoke-virtual {v0}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyy/f;

    iput v5, v2, Lg20/n;->y:I

    invoke-virtual {v1, p0, p1, p2, v2}, Lb10/z0;->h(Ly00/q;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p3, :cond_4

    goto :goto_1

    :cond_4
    return-object p0

    :cond_5
    instance-of p1, p0, Ly00/r;

    if-eqz p1, :cond_7

    check-cast p0, Ly00/r;

    invoke-virtual {v0}, Lb20/g;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyy/f;

    iput v4, v2, Lg20/n;->y:I

    invoke-virtual {v1, p0, p1, p2, v2}, Lb10/z0;->j(Ly00/r;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, p3, :cond_6

    :goto_1
    return-object p3

    :cond_6
    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static l(Lg20/r;Lg20/d;Ly00/c8;Ljava/util/Map;I)V
    .locals 7

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x4

    sget-object v0, Lm83/z;->w:Lm83/z;

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    iget-object p4, p0, Lg20/r;->N:Lec3/h2;

    invoke-virtual {p4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    iget-object v2, p0, Lg20/r;->K:Landroidx/lifecycle/k1;

    const-string v3, "confirm_action_requested"

    invoke-virtual {v2, v3}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x1

    :goto_0
    if-eqz v2, :cond_4

    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->R:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    goto :goto_1

    :cond_4
    sget-object v2, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->T:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    :goto_1
    instance-of v3, p1, Lg20/b;

    if-eqz v3, :cond_5

    const-string v3, "succeeded"

    goto :goto_2

    :cond_5
    instance-of v3, p1, Lg20/a;

    if-eqz v3, :cond_6

    const-string v3, "canceled"

    goto :goto_2

    :cond_6
    instance-of v3, p1, Lg20/c;

    if-eqz v3, :cond_b

    const-string v3, "failed"

    :goto_2
    if-eqz p2, :cond_7

    invoke-interface {p2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    const-string v5, "_secret_"

    invoke-static {v4, v5}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_7
    move-object v4, v1

    :goto_3
    new-instance v5, Ll83/k;

    const-string v6, "intent_id"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v6, "status"

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p2, :cond_8

    invoke-interface {p2}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p2

    if-eqz p2, :cond_8

    iget-object p2, p2, Ly00/o4;->E:Ly00/f4;

    if-eqz p2, :cond_8

    iget-object p2, p2, Ly00/f4;->w:Ljava/lang/String;

    goto :goto_4

    :cond_8
    move-object p2, v1

    :goto_4
    new-instance v3, Ll83/k;

    const-string v6, "payment_method_type"

    invoke-direct {v3, v6, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v3}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lcom/squareup/wire/n;->y(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    instance-of v3, p1, Lg20/c;

    if-eqz v3, :cond_9

    sget v3, Lcom/stripe/android/core/exception/StripeException;->E:I

    move-object v3, p1

    check-cast v3, Lg20/c;

    iget-object v3, v3, Lg20/c;->w:Ljava/lang/Throwable;

    invoke-static {v3}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v3

    invoke-static {v3}, Lb20/a;->b(Lcom/stripe/android/core/exception/StripeException;)Ljava/util/Map;

    move-result-object v3

    goto :goto_5

    :cond_9
    move-object v3, v0

    :goto_5
    iget-object v4, p0, Lg20/r;->M:Lbz/c;

    sget-object v5, Lbz/b;->H:Lbz/b;

    check-cast v4, Lbz/a;

    invoke-virtual {v4, v5}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v4

    invoke-static {v4, v5}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v5, "duration"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    :cond_a
    iget-object v4, p0, Lg20/r;->H:Lyy/j;

    iget-object p0, p0, Lg20/r;->I:Lb10/b;

    invoke-static {p3, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-static {p2, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-static {p2, v0}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {p0, v2, p2}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p0

    invoke-virtual {v4, p0}, Lyy/j;->a(Lyy/b;)V

    invoke-virtual {p4, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_b
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final j(Ljava/lang/String;Ls40/a;)V
    .locals 7

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg20/r;->K:Landroidx/lifecycle/k1;

    const-string v1, "key_has_started"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lb2/y;

    const/16 v6, 0x9

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
