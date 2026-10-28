.class public final Lx20/w;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final w:Lx20/s;

.field public final x:Lf30/e;

.field public final y:Lec3/h2;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Lx20/s;Lf30/e;Lx20/f;Landroidx/lifecycle/k1;)V
    .locals 8

    iget-wide v0, p1, Lx20/s;->b:J

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lx20/w;->w:Lx20/s;

    iput-object p2, p0, Lx20/w;->x:Lf30/e;

    new-instance v2, Lx20/p;

    iget-wide v3, p1, Lx20/s;->b:J

    iget v5, p1, Lx20/s;->d:I

    iget-object p1, p1, Lx20/s;->f:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    :goto_0
    move v7, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    sget-object v6, Lx20/o;->w:Lx20/o;

    invoke-direct/range {v2 .. v7}, Lx20/p;-><init>(JILx20/o;Z)V

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lx20/w;->y:Lec3/h2;

    iput-object p1, p0, Lx20/w;->z:Lec3/h2;

    const-string p1, "KEY_CURRENT_POLLING_START_TIME"

    invoke-virtual {p4, p1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    if-nez p2, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p4, p3, p1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {v0, v1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p3

    add-long/2addr p3, p1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    sub-long/2addr p3, p1

    sget-object p1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p3, p4, p1}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p1

    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {p2}, Lkotlin/time/Duration$Companion;->getZERO-UwyO8pc()J

    move-result-wide p2

    invoke-static {p2, p3}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object p2

    invoke-static {p1, p2}, Lq83/g;->M(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Lkotlin/time/Duration;

    invoke-virtual {p1}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lx20/q;

    const/4 p3, 0x0

    invoke-direct {p2, p0, v0, v1, p3}, Lx20/q;-><init>(Lx20/w;JLq83/d;)V

    const/4 p4, 0x3

    invoke-static {p1, p3, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lx20/r;

    const/4 v2, 0x0

    invoke-direct {p2, p0, p3, v2}, Lx20/r;-><init>(Lx20/w;Lq83/d;I)V

    invoke-static {p1, p3, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Lx20/q;

    invoke-direct {p2, v0, v1, p0, p3}, Lx20/q;-><init>(JLx20/w;Lq83/d;)V

    invoke-static {p1, p3, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object p1

    new-instance p2, Ls40/c0;

    const/16 v0, 0x19

    invoke-direct {p2, p0, p3, v0}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, p3, p3, p2, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final g(Lx20/w;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lx20/t;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx20/t;

    iget v1, v0, Lx20/t;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx20/t;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx20/t;

    invoke-direct {v0, p0, p1}, Lx20/t;-><init>(Lx20/w;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lx20/t;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx20/t;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lx20/t;->w:Lx20/w;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lx20/w;->x:Lf30/e;

    iget-object v2, p1, Lf30/e;->e:Lbc3/c2;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v3}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_4
    iput-object v3, p1, Lf30/e;->e:Lbc3/c2;

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x3

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    iput-object p0, v0, Lx20/t;->w:Lx20/w;

    iput v5, v0, Lx20/t;->z:I

    invoke-static {v6, v7, v0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iput-object v3, v0, Lx20/t;->w:Lx20/w;

    iput v4, v0, Lx20/t;->z:I

    invoke-virtual {p0, v0}, Lx20/w;->l(Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final j()V
    .locals 8

    :cond_0
    iget-object v0, p0, Lx20/w;->y:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lx20/p;

    sget-object v5, Lx20/o;->z:Lx20/o;

    const/4 v6, 0x0

    const/4 v7, 0x3

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lx20/w;->x:Lf30/e;

    iget-object v1, v0, Lf30/e;->e:Lbc3/c2;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iput-object v2, v0, Lf30/e;->e:Lbc3/c2;

    return-void
.end method

.method public final l(Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p1, Lx20/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lx20/v;

    iget v1, v0, Lx20/v;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lx20/v;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lx20/v;

    invoke-direct {v0, p0, p1}, Lx20/v;-><init>(Lx20/w;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lx20/v;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lx20/v;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lx20/v;->w:Lx20/w;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lx20/v;->w:Lx20/w;

    iput v3, v0, Lx20/v;->z:I

    iget-object p1, p0, Lx20/w;->x:Lf30/e;

    invoke-virtual {p1, v0}, Lf30/e;->a(Ls83/c;)Ljava/lang/Enum;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Lcom/stripe/android/model/StripeIntent$Status;

    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne p1, v1, :cond_5

    iget-object p1, v0, Lx20/w;->y:Lec3/h2;

    :cond_4
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx20/p;

    sget-object v4, Lx20/o;->x:Lx20/o;

    const/4 v5, 0x0

    const/16 v6, 0xb

    const-wide/16 v2, 0x0

    invoke-static/range {v1 .. v6}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_5
    iget-object p1, v0, Lx20/w;->y:Lec3/h2;

    :cond_6
    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx20/p;

    sget-object v4, Lx20/o;->y:Lx20/o;

    const/4 v5, 0x0

    const/16 v6, 0xb

    const-wide/16 v2, 0x0

    invoke-static/range {v1 .. v6}, Lx20/p;->a(Lx20/p;JLx20/o;ZI)Lx20/p;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
