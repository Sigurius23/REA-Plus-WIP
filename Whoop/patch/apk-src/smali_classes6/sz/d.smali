.class public final Lsz/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsz/q0;


# instance fields
.field public final a:Lsz/g;

.field public final b:Lux/j;

.field public final c:Z

.field public final d:Z

.field public final e:Lsz/e;

.field public final f:Lb20/f;

.field public final g:Lqy/d;

.field public final h:Lux/q;

.field public final i:Ll83/p;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lsz/g;Lux/j;ZZLb20/f;Lqy/d;Lux/a;Lux/b;)V
    .locals 12

    .line 12
    new-instance v6, Lsz/e;

    invoke-direct {v6, p1}, Lsz/e;-><init>(Landroid/content/Context;)V

    .line 13
    sget-object v11, Lm83/y;->w:Lm83/y;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    .line 14
    invoke-direct/range {v0 .. v11}, Lsz/d;-><init>(Landroid/content/Context;Lsz/g;Lux/j;ZZLsz/e;Lb20/f;Lqy/d;Lux/a;Lux/b;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lsz/g;Lux/j;ZZLsz/e;Lb20/f;Lqy/d;Lux/a;Lux/b;Ljava/util/List;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "environment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardBrandFilter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardFundingFilter"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalEnabledNetworks"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lsz/d;->a:Lsz/g;

    .line 3
    iput-object p3, p0, Lsz/d;->b:Lux/j;

    .line 4
    iput-boolean p4, p0, Lsz/d;->c:Z

    .line 5
    iput-boolean p5, p0, Lsz/d;->d:Z

    .line 6
    iput-object p6, p0, Lsz/d;->e:Lsz/e;

    .line 7
    iput-object p7, p0, Lsz/d;->f:Lb20/f;

    .line 8
    iput-object p8, p0, Lsz/d;->g:Lqy/d;

    .line 9
    new-instance p2, Lcd/a;

    invoke-direct {p2, p1}, Lcd/a;-><init>(Landroid/content/Context;)V

    .line 10
    new-instance p1, Lux/q;

    const/4 p6, 0x2

    move-object p4, p9

    move-object p5, p10

    move-object p3, p11

    invoke-direct/range {p1 .. p6}, Lux/q;-><init>(Lcd/a;Ljava/util/List;Lux/a;Lux/b;I)V

    iput-object p1, p0, Lsz/d;->h:Lux/q;

    .line 11
    new-instance p1, Lsc0/c;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lsz/d;->i:Ll83/p;

    return-void
.end method

.method public static final a(Lsz/d;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p1, Lsz/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lsz/c;

    iget v1, v0, Lsz/c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/c;

    invoke-direct {v0, p0, p1}, Lsz/c;-><init>(Lsz/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lsz/c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/c;->E:I

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-object p0, v0, Lsz/c;->x:Lsz/d;

    iget-object v0, v0, Lsz/c;->w:Lsz/d;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lsz/d;->h:Lux/q;

    iget-object v2, p0, Lsz/d;->b:Lux/j;

    iget-boolean v6, p0, Lsz/d;->c:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-boolean v7, p0, Lsz/d;->d:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {p1, v2, v6, v7}, Lux/q;->b(Lux/j;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "isReadyToPayRequestJson cannot be null!"

    new-instance v6, Ldq/f;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v2}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v6, Ldq/f;->F:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v6

    :goto_1
    invoke-static {v6}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_7

    check-cast v6, Ldq/f;

    :try_start_2
    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object p1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/16 v2, 0x1e

    invoke-static {v2, p1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    new-instance p1, Ls40/c0;

    const/4 v2, 0x3

    invoke-direct {p1, p0, v6, v4, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v0, Lsz/c;->w:Lsz/d;

    iput-object p0, v0, Lsz/c;->x:Lsz/d;

    iput v5, v0, Lsz/c;->E:I

    invoke-static {v7, v8, p1, v0}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne p1, v1, :cond_3

    goto/16 :goto_6

    :cond_3
    move-object v0, p0

    :goto_2
    :try_start_3
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_3

    :cond_4
    iget-object p0, p0, Lsz/d;->f:Lb20/f;

    sget-object p1, Lb20/c;->F:Lb20/c;

    const/4 v1, 0x6

    invoke-static {p0, p1, v4, v4, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    const/4 p0, 0x0

    :goto_3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :catchall_2
    move-exception p1

    move-object v0, p0

    move-object p0, p1

    :goto_4
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_5
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v1, v0, Lsz/d;->f:Lb20/f;

    sget-object v2, Lb20/c;->E:Lb20/c;

    sget v5, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v5

    invoke-static {v1, v2, v5, v4, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    iget-object v1, v0, Lsz/d;->g:Lqy/d;

    const-string v2, "Google Pay check failed."

    invoke-virtual {v1, v2, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    instance-of v1, p0, Ll83/m;

    if-eqz v1, :cond_6

    move-object p0, p1

    :cond_6
    move-object v1, p0

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    iget-object p1, v0, Lsz/d;->g:Lqy/d;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Google Pay ready? "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lqy/d;->c(Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    iget-object v0, p0, Lsz/d;->f:Lb20/f;

    sget-object v1, Lb20/e;->F:Lb20/e;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {p1}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v2

    invoke-static {v0, v1, v2, v4, v3}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    iget-object p0, p0, Lsz/d;->g:Lqy/d;

    const-string v0, "Google Pay json parsing failed."

    invoke-virtual {p0, v0, p1}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_6
    return-object v1
.end method
