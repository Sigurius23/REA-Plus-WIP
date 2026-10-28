.class public final Luz/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:J

.field public static final synthetic d:I


# instance fields
.field public final a:Lq/f;

.field public final b:Lec3/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 v0, 0x6

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    sput-wide v0, Luz/o;->c:J

    return-void
.end method

.method public constructor <init>(Luz/p;Lq/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Luz/o;->a:Lq/f;

    sget-object p1, Luz/b;->a:Luz/b;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Luz/o;->b:Lec3/h2;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v0, p4

    instance-of v2, v0, Luz/f;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Luz/f;

    iget v3, v2, Luz/f;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Luz/f;->G:I

    :goto_0
    move-object v7, v2

    goto :goto_1

    :cond_0
    new-instance v2, Luz/f;

    invoke-direct {v2, p0, v0}, Luz/f;-><init>(Luz/o;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Luz/f;->E:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v2, v7, Luz/f;->G:I

    const/4 v9, 0x1

    const/4 v10, 0x2

    if-eqz v2, :cond_3

    if-eq v2, v9, :cond_2

    if-ne v2, v10, :cond_1

    iget-boolean v2, v7, Luz/f;->z:Z

    iget-object v3, v7, Luz/f;->y:Luz/t;

    iget-object v4, v7, Luz/f;->x:Ljava/lang/String;

    iget-object v5, v7, Luz/f;->w:Luz/o;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v2, v7, Luz/f;->z:Z

    iget-object v3, v7, Luz/f;->x:Ljava/lang/String;

    iget-object v4, v7, Luz/f;->w:Luz/o;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Luz/o;->a:Lq/f;

    iget-object v0, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lbz/c;

    sget-object v2, Lbz/b;->G:Lbz/b;

    invoke-static {v0, v2}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    iget-object v0, p0, Luz/o;->b:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luz/e;

    invoke-interface {v0}, Luz/e;->b()Z

    move-result v11

    :try_start_1
    sget-wide v12, Luz/o;->c:J

    new-instance v0, Lp33/m;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v5, 0x0

    const/16 v6, 0x8

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    :try_start_2
    invoke-direct/range {v0 .. v6}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iput-object p0, v7, Luz/f;->w:Luz/o;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object/from16 v3, p2

    :try_start_4
    iput-object v3, v7, Luz/f;->x:Ljava/lang/String;

    iput-boolean v11, v7, Luz/f;->z:Z

    iput v9, v7, Luz/f;->G:I

    invoke-static {v12, v13, v0, v7}, Lbc3/k2;->c(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-ne v0, v8, :cond_4

    goto :goto_8

    :cond_4
    move-object v4, p0

    move v2, v11

    :goto_2
    :try_start_5
    check-cast v0, Luz/t;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_3
    move-object v5, v4

    move-object v4, v3

    goto :goto_6

    :catchall_1
    move-exception v0

    :goto_4
    move-object v4, p0

    move v2, v11

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object/from16 v3, p2

    goto :goto_4

    :goto_5
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_3

    :goto_6
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_7

    :cond_5
    new-instance v0, Luz/r;

    invoke-direct {v0, v3}, Luz/r;-><init>(Ljava/lang/Throwable;)V

    :goto_7
    move-object v3, v0

    check-cast v3, Luz/t;

    iget-object v0, v5, Luz/o;->b:Lec3/h2;

    iput-object v5, v7, Luz/f;->w:Luz/o;

    iput-object v4, v7, Luz/f;->x:Ljava/lang/String;

    iput-object v3, v7, Luz/f;->y:Luz/t;

    iput-boolean v2, v7, Luz/f;->z:Z

    iput v10, v7, Luz/f;->G:I

    sget-object v6, Luz/b;->a:Luz/b;

    invoke-virtual {v0, v6, v7}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne v0, v8, :cond_6

    :goto_8
    return-object v8

    :cond_6
    :goto_9
    iget-object v0, v5, Luz/o;->a:Lq/f;

    const-string v5, "siteKey"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v5, Lbz/c;

    sget-object v6, Lbz/b;->G:Lbz/b;

    check-cast v5, Lbz/a;

    invoke-virtual {v5, v6}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v5

    new-instance v6, Lvz/a;

    invoke-direct {v6, v2, v4}, Lvz/a;-><init>(ZLjava/lang/String;)V

    invoke-static {v5}, Lq/f;->q0(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Lq/f;->s0(Lvz/c;Ljava/util/Map;)V

    return-object v3
.end method

.method public final b(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p4, Luz/g;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Luz/g;

    iget v1, v0, Luz/g;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Luz/g;->F:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Luz/g;

    invoke-direct {v0, p0, p4}, Luz/g;-><init>(Luz/o;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Luz/g;->z:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Luz/g;->F:I

    const-string v7, "siteKey"

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Luz/g;->y:Lio/sentry/android/replay/video/d;

    iget-object p2, v6, Luz/g;->x:Ljava/lang/String;

    iget-object p3, v6, Luz/g;->w:Luz/o;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object p4, v0

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Lv40/a;

    invoke-direct {p4}, Lv40/a;-><init>()V

    new-instance v5, Lio/sentry/android/replay/video/d;

    const/4 v1, 0x3

    invoke-direct {v5, v1}, Lio/sentry/android/replay/video/d;-><init>(I)V

    iput-object p4, v5, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p4, p0, Luz/o;->a:Lq/f;

    iget-object v1, p4, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lbz/c;

    sget-object v3, Lbz/b;->F:Lbz/b;

    invoke-static {v1, v3}, Lvd/e;->f0(Lbz/c;Lbz/b;)V

    new-instance v1, Lvz/b;

    const/4 v3, 0x1

    invoke-direct {v1, p2, v3}, Lvz/b;-><init>(Ljava/lang/String;I)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-virtual {p4, v1, v3}, Lq/f;->s0(Lvz/c;Ljava/util/Map;)V

    :try_start_1
    iput-object p0, v6, Luz/g;->w:Luz/o;

    iput-object p2, v6, Luz/g;->x:Ljava/lang/String;

    iput-object v5, v6, Luz/g;->y:Lio/sentry/android/replay/video/d;

    iput v2, v6, Luz/g;->F:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    :try_start_2
    invoke-virtual/range {v1 .. v6}, Luz/o;->c(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/android/replay/video/d;Luz/g;)Ljava/lang/Object;

    move-result-object p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p4, v0, :cond_3

    return-object v0

    :cond_3
    move-object p3, p0

    move-object p2, v3

    move-object p1, v5

    :goto_2
    :try_start_3
    check-cast p4, Luz/t;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object p4, v0

    move-object p3, p0

    move-object p2, v3

    :goto_3
    move-object p1, v5

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object v3, p2

    move-object p4, v0

    move-object p3, p0

    goto :goto_3

    :goto_4
    invoke-static {p4}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p4

    :goto_5
    invoke-static {p4}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_6

    :cond_4
    new-instance p4, Luz/r;

    invoke-direct {p4, v0}, Luz/r;-><init>(Ljava/lang/Throwable;)V

    :goto_6
    check-cast p4, Luz/t;

    instance-of v0, p4, Luz/r;

    if-eqz v0, :cond_6

    iget-object p3, p3, Luz/o;->a:Lq/f;

    iget-object v0, p3, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lb20/f;

    move-object v1, p4

    check-cast v1, Luz/r;

    iget-object v1, v1, Luz/r;->a:Ljava/lang/Throwable;

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p3, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Lbz/c;

    sget-object v3, Lbz/b;->F:Lbz/b;

    check-cast v2, Lbz/a;

    invoke-virtual {v2, v3}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v2

    instance-of v3, v1, Lcom/stripe/hcaptcha/HCaptchaException;

    const/4 v4, 0x6

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    sget-object v3, Lb20/c;->b0:Lb20/c;

    invoke-static {v0, v3, v5, v5, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    goto :goto_7

    :cond_5
    sget-object v3, Lb20/e;->b0:Lb20/e;

    invoke-static {v0, v3, v5, v5, v4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    :goto_7
    new-instance v0, Lvz/a;

    invoke-direct {v0, p2, v1}, Lvz/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {v2}, Lq/f;->q0(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p3, v0, p2}, Lq/f;->s0(Lvz/c;Ljava/util/Map;)V

    goto :goto_8

    :cond_6
    instance-of v0, p4, Luz/s;

    if-eqz v0, :cond_7

    iget-object p3, p3, Luz/o;->a:Lq/f;

    invoke-static {p2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p3, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lbz/c;

    sget-object v1, Lbz/b;->F:Lbz/b;

    check-cast v0, Lbz/a;

    invoke-virtual {v0, v1}, Lbz/a;->a(Lbz/b;)Lkotlin/time/Duration;

    move-result-object v0

    new-instance v1, Lvz/b;

    const/4 v2, 0x2

    invoke-direct {v1, p2, v2}, Lvz/b;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lq/f;->q0(Lkotlin/time/Duration;)Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p3, v1, p2}, Lq/f;->s0(Lvz/c;Ljava/util/Map;)V

    :goto_8
    invoke-virtual {p1}, Lio/sentry/android/replay/video/d;->j()V

    return-object p4

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Lio/sentry/android/replay/video/d;Luz/g;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v1, p4

    new-instance v2, Lbc3/m;

    invoke-static/range {p5 .. p5}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    const/4 v4, 0x1

    invoke-direct {v2, v4, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    new-instance v3, Ls;

    const/16 v4, 0x18

    invoke-direct {v3, v1, v4}, Ls;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Luz/h;

    invoke-direct {v3, v2}, Luz/h;-><init>(Lbc3/m;)V

    iget-object v4, v1, Lio/sentry/android/replay/video/d;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lio/sentry/android/replay/video/d;->o()V

    new-instance v3, Luz/i;

    invoke-direct {v3, v2}, Luz/i;-><init>(Lbc3/m;)V

    iget-object v4, v1, Lio/sentry/android/replay/video/d;->d:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Lio/sentry/android/replay/video/d;->o()V

    sget-object v13, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    new-instance v5, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    const v22, 0x2b7e2

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v5

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, "stripecdn.com"

    const/16 v17, 0x0

    sget-object v18, Luz/j;->w:Luz/j;

    const-wide/16 v19, 0x0

    const/16 v21, 0x1

    move-object/from16 v6, p3

    move-object/from16 v0, p4

    move-object/from16 v28, v2

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v23}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lc93/m;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lio/sentry/android/replay/video/d;->g:Ljava/lang/Object;

    check-cast v3, Lv40/a;

    const-string v4, "activity"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lu40/f;

    new-instance v6, Lsc0/c;

    const/16 v7, 0xf

    invoke-direct {v6, v0, v7}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    new-instance v7, Lsg2/t;

    const/16 v8, 0x17

    invoke-direct {v7, v8, v0, v1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Lrq0/x;

    const/16 v9, 0x1b

    invoke-direct {v8, v0, v9}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v4, v6, v7, v8}, Lu40/f;-><init>(Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :try_start_0
    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->getHideDialog()Z

    move-result v6

    if-eqz v6, :cond_0

    new-instance v6, Ly40/b;
    :try_end_0
    .catch Landroid/util/AndroidRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    const v26, 0x7f7fb

    const/16 v27, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const-wide/16 v23, 0x0

    move-object/from16 v29, v25

    const/16 v25, 0x0

    move-object v2, v5

    move-object v5, v1

    move-object/from16 v1, v29

    :try_start_1
    invoke-static/range {v5 .. v27}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->copy-ZIzw2bI$default(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lc93/m;JZILjava/lang/Object;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v5

    invoke-direct {v1, v2, v5, v3, v4}, Ly40/b;-><init>(Landroidx/fragment/app/r0;Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lv40/a;Lu40/f;)V

    move-object v6, v1

    goto :goto_0

    :catch_0
    move-object v2, v5

    goto :goto_1

    :cond_0
    move-object v2, v5

    const-string v5, "internalConfig"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lu40/c;

    invoke-direct {v6}, Lu40/c;-><init>()V

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v7, "hCaptchaConfig"

    invoke-virtual {v5, v7, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v1, "hCaptchaInternalConfig"

    invoke-virtual {v5, v1, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v1, "hCaptchaDialogListener"

    invoke-virtual {v5, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-virtual {v6, v5}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    :goto_0
    iput-object v6, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;
    :try_end_1
    .catch Landroid/util/AndroidRuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    :goto_1
    new-instance v1, Lcom/stripe/hcaptcha/HCaptchaException;

    sget-object v3, Lu40/d;->H:Lu40/d;

    invoke-direct {v1, v3}, Lcom/stripe/hcaptcha/HCaptchaException;-><init>(Lu40/d;)V

    iget-object v3, v4, Lu40/f;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    iget-object v1, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v1, Lu40/h;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->f:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lu40/h;->j(Landroidx/fragment/app/r0;)V

    const-string v0, "siteKey"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvz/b;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lvz/b;-><init>(Ljava/lang/String;I)V

    sget-object v1, Lm83/z;->w:Lm83/z;

    move-object/from16 v2, p0

    iget-object v3, v2, Luz/o;->a:Lq/f;

    invoke-virtual {v3, v0, v1}, Lq/f;->s0(Lvz/c;Ljava/util/Map;)V

    invoke-virtual/range {v28 .. v28}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v0

    :cond_1
    move-object/from16 v2, p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "verifyWithHCaptcha must not be called before setup."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p4, Luz/n;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Luz/n;

    iget v1, v0, Luz/n;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Luz/n;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Luz/n;

    invoke-direct {v0, p0, p4}, Luz/n;-><init>(Luz/o;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Luz/n;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Luz/n;->G:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Luz/n;->w:Luz/o;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    iget-object p3, v0, Luz/n;->z:Ljava/lang/String;

    iget-object p2, v0, Luz/n;->y:Ljava/lang/String;

    iget-object p1, v0, Luz/n;->x:Landroidx/fragment/app/r0;

    iget-object v2, v0, Luz/n;->w:Luz/o;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, v2

    goto :goto_1

    :cond_4
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Luz/o;->b:Lec3/h2;

    invoke-virtual {p4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Luz/e;

    invoke-interface {v2}, Luz/e;->a()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    iput-object p0, v0, Luz/n;->w:Luz/o;

    iput-object p1, v0, Luz/n;->x:Landroidx/fragment/app/r0;

    iput-object p2, v0, Luz/n;->y:Ljava/lang/String;

    iput-object p3, v0, Luz/n;->z:Ljava/lang/String;

    iput v5, v0, Luz/n;->G:I

    sget-object v2, Luz/c;->a:Luz/c;

    invoke-virtual {p4, v2, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v7, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    iput-object p1, v0, Luz/n;->w:Luz/o;

    iput-object v6, v0, Luz/n;->x:Landroidx/fragment/app/r0;

    iput-object v6, v0, Luz/n;->y:Ljava/lang/String;

    iput-object v6, v0, Luz/n;->z:Ljava/lang/String;

    iput v4, v0, Luz/n;->G:I

    invoke-virtual {p1, p2, p3, p4, v0}, Luz/o;->b(Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_2
    check-cast p4, Luz/t;

    instance-of p2, p4, Luz/r;

    if-eqz p2, :cond_8

    new-instance p2, Luz/a;

    check-cast p4, Luz/r;

    iget-object p3, p4, Luz/r;->a:Ljava/lang/Throwable;

    invoke-direct {p2, p3}, Luz/a;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_8
    instance-of p2, p4, Luz/s;

    if-eqz p2, :cond_a

    new-instance p2, Luz/d;

    check-cast p4, Luz/s;

    iget-object p3, p4, Luz/s;->a:Ljava/lang/String;

    invoke-direct {p2, p3}, Luz/d;-><init>(Ljava/lang/String;)V

    :goto_3
    iget-object p1, p1, Luz/o;->b:Lec3/h2;

    iput-object v6, v0, Luz/n;->w:Luz/o;

    iput v3, v0, Luz/n;->G:I

    invoke-virtual {p1, p2, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v7, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    :goto_5
    return-object v7

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
