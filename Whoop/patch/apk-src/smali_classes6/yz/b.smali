.class public final Lyz/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lyy/j;

.field public final b:Lb10/b;

.field public final c:Lb20/f;

.field public final d:Lq83/j;

.field public final e:Lqy/d;

.field public final f:Lbz/c;


# direct methods
.method public constructor <init>(Lyy/j;Lb10/b;Lb20/f;Lq83/j;Lqy/d;Lbz/c;)V
    .locals 1

    const-string v0, "analyticsRequestExecutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentAnalyticsRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "durationProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyz/b;->a:Lyy/j;

    iput-object p2, p0, Lyz/b;->b:Lb10/b;

    iput-object p3, p0, Lyz/b;->c:Lb20/f;

    iput-object p4, p0, Lyz/b;->d:Lq83/j;

    iput-object p5, p0, Lyz/b;->e:Lqy/d;

    iput-object p6, p0, Lyz/b;->f:Lbz/c;

    return-void
.end method


# virtual methods
.method public final a(Ldz/i;Ljava/util/Map;)V
    .locals 7

    invoke-interface {p1}, Lyy/a;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Link event: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lyz/b;->e:Lqy/d;

    invoke-virtual {v1, v0}, Lqy/d;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lyz/b;->d:Lq83/j;

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0

    new-instance v1, Lay/u;

    const/16 v6, 0x1a

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "error_message"

    invoke-static {p1}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    sget-object v0, Lyz/c;->x:Lyz/c;

    invoke-virtual {p0, v0, p1}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method

.method public final c(Lyz/f;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const-string p1, "verified"

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    const-string p1, "requiresVerification"

    goto :goto_0

    :cond_2
    const-string p1, "requiresSignUp"

    :goto_0
    const-string v0, "sessionState"

    invoke-static {v0, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    sget-object v0, Lb20/e;->E:Lb20/e;

    const/4 v1, 0x6

    iget-object v2, p0, Lyz/b;->c:Lb20/f;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v3, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    sget-object v0, Lyz/c;->N:Lyz/c;

    invoke-virtual {p0, v0, p1}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method

.method public final d()V
    .locals 4

    sget-object v0, Lbz/b;->y:Lbz/b;

    iget-object v1, p0, Lyz/b;->f:Lbz/c;

    check-cast v1, Lbz/a;

    invoke-virtual {v1, v0}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    sget-object v1, Lyz/c;->L:Lyz/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v2

    sget-object v0, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v2, v3, v0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v2

    double-to-float v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    new-instance v2, Ll83/k;

    const-string v3, "duration"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v1, v0}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method

.method public final e(Ljava/lang/Throwable;)V
    .locals 3

    instance-of v0, p1, Lcom/stripe/android/core/exception/APIException;

    const/4 v1, 0x0

    const-string v2, "error_message"

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/stripe/android/core/exception/APIException;

    iget-object v0, v0, Lcom/stripe/android/core/exception/StripeException;->w:Lqy/f;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lqy/f;->x:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v2, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    :cond_0
    if-nez v1, :cond_1

    invoke-static {p1}, Ls4/b;->k(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    :cond_1
    invoke-static {p1}, Lb20/a;->a(Ljava/lang/Throwable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    sget-object v0, Lyz/c;->M:Lyz/c;

    invoke-virtual {p0, v0, p1}, Lyz/b;->a(Ldz/i;Ljava/util/Map;)V

    return-void
.end method
