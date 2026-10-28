.class public final Lsz/p0;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lux/q;

.field public final F:Lsz/q0;

.field public final G:Landroidx/lifecycle/k1;

.field public final H:Lec3/h2;

.field public final I:Lec3/r1;

.field public final w:Ldq/p;

.field public final x:Lyy/f;

.field public final y:Lsz/l0;

.field public final z:Lb10/z0;


# direct methods
.method public constructor <init>(Ldq/p;Lyy/f;Lsz/l0;Lb10/z0;Lux/q;Lsz/q0;Landroidx/lifecycle/k1;)V
    .locals 1

    const-string v0, "paymentsClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayJsonFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayRepository"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lsz/p0;->w:Ldq/p;

    iput-object p2, p0, Lsz/p0;->x:Lyy/f;

    iput-object p3, p0, Lsz/p0;->y:Lsz/l0;

    iput-object p4, p0, Lsz/p0;->z:Lb10/z0;

    iput-object p5, p0, Lsz/p0;->E:Lux/q;

    iput-object p6, p0, Lsz/p0;->F:Lsz/q0;

    iput-object p7, p0, Lsz/p0;->G:Landroidx/lifecycle/k1;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lsz/p0;->H:Lec3/h2;

    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lsz/p0;->I:Lec3/r1;

    return-void
.end method


# virtual methods
.method public final g(Ldq/l;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lsz/n0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lsz/n0;

    iget v1, v0, Lsz/n0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lsz/n0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lsz/n0;

    invoke-direct {v0, p0, p2}, Lsz/n0;-><init>(Lsz/p0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lsz/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lsz/n0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lorg/json/JSONObject;

    iget-object p1, p1, Ldq/l;->G:Ljava/lang/String;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lsz/p0;->y:Lsz/l0;

    iget-object p1, p1, Lsz/l0;->H:Ly00/n;

    invoke-static {p2, p1}, Lt9/p;->i(Lorg/json/JSONObject;Ly00/n;)Ly00/d5;

    move-result-object p1

    iput v3, v0, Lsz/n0;->y:I

    iget-object p2, p0, Lsz/p0;->z:Lb10/z0;

    iget-object v2, p0, Lsz/p0;->x:Lyy/f;

    invoke-virtual {p2, p1, v2, v0}, Lb10/z0;->p(Ly00/d5;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-nez p2, :cond_4

    check-cast p1, Ly00/o4;

    new-instance p2, Lsz/e0;

    invoke-direct {p2, p1}, Lsz/e0;-><init>(Ly00/o4;)V

    return-object p2

    :cond_4
    new-instance p1, Lsz/f0;

    instance-of v0, p2, Lcom/stripe/android/core/exception/APIConnectionException;

    if-eqz v0, :cond_5

    const/4 v3, 0x3

    goto :goto_2

    :cond_5
    instance-of v0, p2, Lcom/stripe/android/core/exception/InvalidRequestException;

    if-eqz v0, :cond_6

    const/4 v3, 0x2

    :cond_6
    :goto_2
    invoke-direct {p1, v3, p2}, Lsz/f0;-><init>(ILjava/lang/Throwable;)V

    return-object p1
.end method

.method public final j(Ls83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lsz/o0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lsz/o0;

    iget v3, v2, Lsz/o0;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lsz/o0;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lsz/o0;

    invoke-direct {v2, v0, v1}, Lsz/o0;-><init>(Lsz/p0;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lsz/o0;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lsz/o0;->z:I

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lsz/o0;->w:Lsz/p0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v0, v2, Lsz/o0;->w:Lsz/p0;

    iput v7, v2, Lsz/o0;->z:I

    iget-object v1, v0, Lsz/p0;->F:Lsz/q0;

    check-cast v1, Lsz/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ls40/c0;

    const/4 v8, 0x2

    invoke-direct {v4, v1, v6, v8}, Ls40/c0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v4}, Lec3/s1;-><init>(Lc93/m;)V

    invoke-static {v1, v2}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_4

    :cond_4
    move-object v4, v0

    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v4, Lsz/p0;->w:Ldq/p;

    iget-object v8, v4, Lsz/p0;->E:Lux/q;

    iget-object v4, v4, Lsz/p0;->y:Lsz/l0;

    const-string v9, "args"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v4, Lsz/l0;->w:Lsz/c0;

    iget-wide v10, v4, Lsz/l0;->y:J

    iget-object v12, v9, Lsz/c0;->x:Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v13}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v7}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-nez v12, :cond_5

    iget-object v12, v9, Lsz/c0;->x:Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->CANADA:Ljava/util/Locale;

    invoke-virtual {v13}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13, v7}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_6

    :cond_5
    const-wide/16 v12, 0x0

    cmp-long v12, v10, v12

    if-nez v12, :cond_6

    new-instance v13, Lux/p;

    iget-object v14, v4, Lsz/l0;->x:Ljava/lang/String;

    sget-object v15, Lux/o;->x:Lux/o;

    iget-object v10, v9, Lsz/c0;->x:Ljava/lang/String;

    iget-object v11, v4, Lsz/l0;->E:Ljava/lang/String;

    iget-object v12, v4, Lsz/l0;->z:Ljava/lang/String;

    sget-object v20, Lux/n;->x:Lux/n;

    const-string v5, "currencyCode"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v18, 0x0

    move-object/from16 v16, v10

    move-object/from16 v17, v11

    move-object/from16 v19, v12

    invoke-direct/range {v13 .. v20}, Lux/p;-><init>(Ljava/lang/String;Lux/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lux/n;)V

    goto :goto_2

    :cond_6
    new-instance v14, Lux/p;

    iget-object v15, v4, Lsz/l0;->x:Ljava/lang/String;

    sget-object v16, Lux/o;->y:Lux/o;

    iget-object v5, v9, Lsz/c0;->x:Ljava/lang/String;

    iget-object v12, v4, Lsz/l0;->E:Ljava/lang/String;

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v19

    iget-object v10, v4, Lsz/l0;->z:Ljava/lang/String;

    sget-object v21, Lux/n;->x:Lux/n;

    move-object/from16 v17, v5

    move-object/from16 v20, v10

    move-object/from16 v18, v12

    invoke-direct/range {v14 .. v21}, Lux/p;-><init>(Ljava/lang/String;Lux/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lux/n;)V

    move-object v13, v14

    :goto_2
    new-instance v10, Lux/k;

    iget-object v5, v9, Lsz/c0;->y:Ljava/lang/String;

    new-instance v11, Lux/m;

    iget-boolean v4, v4, Lsz/l0;->I:Z

    if-eqz v4, :cond_7

    sget-object v4, Lux/l;->y:Lux/l;

    goto :goto_3

    :cond_7
    sget-object v4, Lux/l;->x:Lux/l;

    :goto_3
    invoke-direct {v11, v4}, Lux/m;-><init>(Lux/l;)V

    invoke-direct {v10, v5, v11}, Lux/k;-><init>(Ljava/lang/String;Lux/m;)V

    iget-object v4, v9, Lsz/c0;->E:Lsz/b0;

    invoke-static {v4}, Ls4/g;->e(Lsz/b0;)Lux/j;

    move-result-object v11

    iget-boolean v12, v9, Lsz/c0;->z:Z

    iget-boolean v4, v9, Lsz/c0;->G:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    move-object v9, v13

    move-object v13, v4

    invoke-static/range {v8 .. v13}, Lux/q;->c(Lux/q;Lux/p;Lux/k;Lux/j;ZLjava/lang/Boolean;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ldq/m;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-boolean v7, v5, Ldq/m;->I:Z

    const-string v7, "paymentDataRequestJson cannot be null!"

    invoke-static {v4, v7}, Luo/w;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v5, Ldq/m;->J:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ldq/p;->c(Ldq/m;)Lcom/google/android/gms/tasks/Task;

    move-result-object v1

    const-string v4, "loadPaymentData(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v6, v2, Lsz/o0;->w:Lsz/p0;

    const/4 v4, 0x2

    iput v4, v2, Lsz/o0;->z:I

    invoke-static {v1, v2}, Ls4/i;->c(Lcom/google/android/gms/tasks/Task;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_4
    return-object v3

    :cond_8
    return-object v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Google Pay is unavailable."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
