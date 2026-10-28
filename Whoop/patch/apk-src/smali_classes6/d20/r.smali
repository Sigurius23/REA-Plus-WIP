.class public final Ld20/r;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lb10/b;

.field public final F:Lp30/a;

.field public final G:Lq30/p0;

.field public final H:Ld20/c;

.field public final I:Lev/i;

.field public final J:Lq83/j;

.field public final K:Landroidx/lifecycle/k1;

.field public final L:Z

.field public M:Z

.field public final N:Lyy/f;

.field public final w:Landroid/app/Application;

.field public final x:Ld20/l;

.field public final y:Lb10/z0;

.field public final z:Lyy/j;


# direct methods
.method public constructor <init>(Landroid/app/Application;Ld20/l;Lb10/z0;Lyy/j;Lb10/b;Lp30/a;Lq30/p0;Ld20/c;Lev/i;Lq83/j;Landroidx/lifecycle/k1;Z)V
    .locals 1

    const-string v0, "threeDs2Service"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageVersionRegistry"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeResultProcessor"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Ld20/r;->w:Landroid/app/Application;

    iput-object p2, p0, Ld20/r;->x:Ld20/l;

    iput-object p3, p0, Ld20/r;->y:Lb10/z0;

    iput-object p4, p0, Ld20/r;->z:Lyy/j;

    iput-object p5, p0, Ld20/r;->E:Lb10/b;

    iput-object p6, p0, Ld20/r;->F:Lp30/a;

    iput-object p7, p0, Ld20/r;->G:Lq30/p0;

    iput-object p8, p0, Ld20/r;->H:Ld20/c;

    iput-object p9, p0, Ld20/r;->I:Lev/i;

    iput-object p10, p0, Ld20/r;->J:Lq83/j;

    iput-object p11, p0, Ld20/r;->K:Landroidx/lifecycle/k1;

    iput-boolean p12, p0, Ld20/r;->L:Z

    const-string p1, "key_next_step"

    invoke-virtual {p11, p1}, Landroidx/lifecycle/k1;->a(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ld20/r;->M:Z

    iget-object p1, p2, Ld20/l;->z:Ly00/v7;

    iget-object p1, p1, Ly00/v7;->F:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    const/4 p4, 0x0

    if-lez p3, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p4

    :goto_0
    if-eqz p1, :cond_1

    new-instance p2, Lyy/f;

    const/4 p3, 0x6

    invoke-direct {p2, p1, p4, p3}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_1

    :cond_1
    iget-object p2, p2, Ld20/l;->E:Lyy/f;

    :goto_1
    iput-object p2, p0, Ld20/r;->N:Lyy/f;

    return-void
.end method


# virtual methods
.method public final g(Ly00/g7;Ls83/c;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    instance-of v3, v1, Ld20/n;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ld20/n;

    iget v4, v3, Ld20/n;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ld20/n;->G:I

    :goto_0
    move-object v5, v3

    goto :goto_1

    :cond_0
    new-instance v3, Ld20/n;

    invoke-direct {v3, v0, v1}, Ld20/n;-><init>(Ld20/r;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v1, v5, Ld20/n;->E:Ljava/lang/Object;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v3, v5, Ld20/n;->G:I

    const/4 v4, 0x1

    const/4 v7, 0x2

    if-eqz v3, :cond_3

    if-eq v3, v4, :cond_2

    if-ne v3, v7, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v2, v5, Ld20/n;->z:I

    iget-object v3, v5, Ld20/n;->y:La30/w0;

    iget-object v4, v5, Ld20/n;->x:Ly00/g7;

    iget-object v8, v5, Ld20/n;->w:Ld20/r;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;

    move v11, v2

    move-object v10, v3

    move-object v12, v8

    goto/16 :goto_2

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ld20/r;->x:Ld20/l;

    iget-object v13, v1, Ld20/l;->w:Lq30/q0;

    iget-object v3, v1, Ld20/l;->x:Lux/r;

    iget-object v8, v2, Ly00/g7;->z:Ly00/f7;

    iget-object v10, v8, Ly00/f7;->w:Ljava/lang/String;

    iget-object v8, v0, Ld20/r;->G:Lq30/p0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Ld20/l;->y:Ly00/c8;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v2, Ly00/g7;->x:Ljava/lang/String;

    iget-object v8, v2, Ly00/g7;->z:Ly00/f7;

    iget-object v9, v8, Ly00/f7;->y:Ljava/util/ArrayList;

    iget-object v11, v8, Ly00/f7;->x:Ljava/security/PublicKey;

    iget-object v12, v8, Ly00/f7;->z:Ljava/lang/String;

    iget-object v8, v3, Lux/r;->x:Lux/s;

    iget-object v8, v8, Lux/s;->w:Lm30/h;

    iget-object v9, v0, Ld20/r;->F:Lp30/a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v14, "sdkTransactionId"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "directoryServerID"

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "directoryServerName"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "dsPublicKey"

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "uiCustomization"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v9, Lp30/a;->a:Lq30/p0;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lq30/p0;->a:Ljava/util/Set;

    check-cast v8, Ljava/lang/Iterable;

    const-string v14, "2.2.0"

    invoke-static {v8, v14}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    iget-object v8, v9, Lp30/a;->c:Ld1/j;

    sget-object v14, Lt30/a;->E:Lng3/n;

    iget-object v9, v9, Lp30/a;->b:Ln30/c;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v9}, Lng3/n;->n(Ljava/lang/String;Ln30/d;)Lt30/a;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v8, Ld1/j;->y:Ljava/lang/Object;

    check-cast v1, Lo30/f;

    invoke-virtual {v1}, Lo30/f;->a()Ljava/security/KeyPair;

    move-result-object v14

    new-instance v1, La30/w0;

    iget-object v8, v8, Ld1/j;->x:Ljava/lang/Object;

    move-object v9, v8

    check-cast v9, Lev/i;

    move-object v8, v1

    invoke-direct/range {v8 .. v14}, La30/w0;-><init>(Lev/i;Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lq30/q0;Ljava/security/KeyPair;)V

    iget v3, v3, Lux/r;->w:I

    iput-object v0, v5, Ld20/n;->w:Ld20/r;

    iput-object v2, v5, Ld20/n;->x:Ly00/g7;

    iput-object v1, v5, Ld20/n;->y:La30/w0;

    iput v3, v5, Ld20/n;->z:I

    iput v4, v5, Ld20/n;->G:I

    move v4, v3

    iget-object v3, v0, Ld20/r;->N:Lyy/f;

    invoke-virtual/range {v0 .. v5}, Ld20/r;->j(La30/w0;Ly00/g7;Lyy/f;ILs83/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_4

    goto/16 :goto_7

    :cond_4
    move-object/from16 v12, p0

    move-object v10, v1

    move-object v1, v3

    move v11, v4

    move-object/from16 v4, p1

    :goto_2
    invoke-static {v1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_f

    check-cast v1, Ly00/d7;

    iget-object v13, v4, Ly00/g7;->w:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, v5, Ld20/n;->w:Ld20/r;

    iput-object v0, v5, Ld20/n;->x:Ly00/g7;

    iput-object v0, v5, Ld20/n;->y:La30/w0;

    iput v7, v5, Ld20/n;->G:I

    iget-object v0, v12, Ld20/r;->x:Ld20/l;

    iget-object v2, v12, Ld20/r;->z:Lyy/j;

    iget-object v9, v1, Ly00/d7;->x:Ly00/a7;

    if-eqz v9, :cond_7

    const-string v1, "C"

    iget-object v3, v9, Ly00/a7;->L:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v0, v12, Ld20/r;->J:Lq83/j;

    new-instance v8, Ld20/p;

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Ld20/p;-><init>(Ly00/a7;La30/w0;ILd20/r;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v8, v5}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    :goto_3
    move-object v1, v0

    goto/16 :goto_6

    :cond_5
    check-cast v0, Ld20/h;

    goto :goto_3

    :cond_6
    iget-object v13, v12, Ld20/r;->E:Lb10/b;

    sget-object v14, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->g0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v18, 0x0

    const/16 v19, 0x3e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lyy/j;->a(Lyy/b;)V

    new-instance v1, Ld20/e;

    new-instance v7, Lv10/b;

    iget-object v2, v0, Ld20/l;->y:Ly00/c8;

    invoke-interface {v2}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v8

    iget-object v0, v0, Ld20/l;->E:Lyy/f;

    iget-object v13, v0, Lyy/f;->x:Ljava/lang/String;

    const/16 v14, 0x3e

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v1, v7}, Ld20/e;-><init>(Lv10/b;)V

    goto/16 :goto_6

    :cond_7
    iget-object v3, v1, Ly00/d7;->H:Ljava/lang/String;

    if-eqz v3, :cond_b

    iget-object v13, v12, Ld20/r;->E:Lb10/b;

    sget-object v14, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->m0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/16 v18, 0x0

    const/16 v19, 0x3e

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lyy/j;->a(Lyy/b;)V

    iget-object v1, v0, Ld20/l;->y:Ly00/c8;

    invoke-interface {v1}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v2

    const-string v4, ""

    if-nez v2, :cond_8

    move-object v9, v4

    goto :goto_4

    :cond_8
    move-object v9, v2

    :goto_4
    sget-object v2, Lux/s0;->l:Ljava/util/List;

    invoke-static {v1}, Ls4/g;->i(Ly00/c8;)I

    move-result v10

    invoke-interface {v1}, Ly00/c8;->getClientSecret()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    move-object v11, v4

    goto :goto_5

    :cond_9
    move-object v11, v1

    :goto_5
    iget-boolean v14, v0, Ld20/l;->F:Z

    iget-object v1, v0, Ld20/l;->E:Lyy/f;

    iget-object v1, v1, Lyy/f;->x:Ljava/lang/String;

    iget-object v0, v0, Ld20/l;->G:Ljava/lang/Integer;

    iget-object v2, v12, Ld20/r;->N:Lyy/f;

    iget-object v2, v2, Lyy/f;->w:Ljava/lang/String;

    iget-boolean v4, v12, Ld20/r;->L:Z

    new-instance v15, Lm30/g;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    iget-object v5, v12, Ld20/r;->w:Landroid/app/Application;

    const v7, 0x7f140fd2

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "string"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_a

    iput-object v5, v15, Lm30/g;->G:Ljava/lang/String;

    new-instance v8, Lyx/b;

    const/16 v23, 0x0

    const/16 v24, 0x6200

    const/4 v13, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v22, 0x0

    move-object/from16 v19, v0

    move-object/from16 v16, v1

    move-object/from16 v20, v2

    move-object v12, v3

    move/from16 v21, v4

    invoke-direct/range {v8 .. v24}, Lyx/b;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm30/g;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;ZI)V

    new-instance v0, Ld20/g;

    invoke-direct {v0, v8}, Ld20/g;-><init>(Lyx/b;)V

    goto/16 :goto_3

    :cond_a
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;

    const-string v1, "String must not be null or empty"

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    iget-object v0, v1, Ly00/d7;->G:Ly00/c7;

    if-eqz v0, :cond_c

    iget-object v1, v0, Ly00/c7;->z:Ljava/lang/String;

    const-string v2, "Code: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Ly00/c7;->G:Ljava/lang/String;

    const-string v3, "Detail: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Ly00/c7;->F:Ljava/lang/String;

    const-string v4, "Description: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, v0, Ly00/c7;->E:Ljava/lang/String;

    const-string v4, "Component: "

    invoke-static {v4, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Iterable;

    const/4 v11, 0x0

    const/16 v12, 0x3e

    const-string v8, ", "

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d

    :cond_c
    const-string v0, "Invalid 3DS2 authentication response"

    :cond_d
    new-instance v1, Ld20/e;

    new-instance v7, Lv10/b;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Error encountered during 3DS2 authentication request. "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v10

    const/4 v13, 0x0

    const/16 v14, 0x7b

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v1, v7}, Ld20/e;-><init>(Lv10/b;)V

    :goto_6
    if-ne v1, v6, :cond_e

    :goto_7
    return-object v6

    :cond_e
    :goto_8
    check-cast v1, Ld20/h;

    return-object v1

    :cond_f
    new-instance v1, Ld20/e;

    new-instance v2, Lv10/b;

    sget v3, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0x7b

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {v1, v2}, Ld20/e;-><init>(Lv10/b;)V

    return-object v1

    :cond_10
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;

    const-string v1, "Message version is unsupported: "

    invoke-virtual {v1, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/exceptions/InvalidInputException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(La30/w0;Ly00/g7;Lyy/f;ILs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v1, p5, Ld20/o;

    if-eqz v1, :cond_0

    move-object v1, p5

    check-cast v1, Ld20/o;

    iget v2, v1, Ld20/o;->y:I

    const/high16 v3, -0x80000000

    and-int v5, v2, v3

    if-eqz v5, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Ld20/o;->y:I

    :goto_0
    move-object v7, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ld20/o;

    invoke-direct {v1, p0, p5}, Ld20/o;-><init>(Ld20/r;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Ld20/o;->w:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v7, Ld20/o;->y:I

    const/4 v9, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v9, :cond_1

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Ld20/p;

    const/4 v6, 0x0

    move-object v4, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p3

    move v3, p4

    invoke-direct/range {v0 .. v6}, Ld20/p;-><init>(La30/w0;Ly00/g7;ILd20/r;Lyy/f;Lq83/d;)V

    iput v9, v7, Ld20/o;->y:I

    iget-object v1, p0, Ld20/r;->J:Lq83/j;

    invoke-static {v1, v0, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    return-object v8

    :cond_3
    :goto_2
    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public final l(Ls83/c;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p1, Ld20/q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ld20/q;

    iget v1, v0, Ld20/q;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ld20/q;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Ld20/q;

    invoke-direct {v0, p0, p1}, Ld20/q;-><init>(Ld20/r;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Ld20/q;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ld20/q;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Ld20/q;->w:Ld20/r;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->e0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v9, 0x0

    const/16 v10, 0x3e

    iget-object v4, p0, Ld20/r;->E:Lb10/b;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object p1

    iget-object v2, p0, Ld20/r;->z:Lyy/j;

    invoke-virtual {v2, p1}, Lyy/j;->a(Lyy/b;)V

    :try_start_1
    new-instance p1, Ly00/g7;

    iget-object v2, p0, Ld20/r;->x:Ld20/l;

    iget-object v2, v2, Ld20/l;->z:Ly00/v7;

    invoke-direct {p1, v2}, Ly00/g7;-><init>(Ly00/v7;)V

    iput-object p0, v0, Ld20/q;->w:Ld20/r;

    iput v3, v0, Ld20/q;->z:I

    invoke-virtual {p0, p1, v0}, Ld20/r;->g(Ly00/g7;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v1, p0

    :goto_1
    :try_start_2
    check-cast p1, Ld20/h;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v1, p0

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    iget-object p1, v1, Ld20/r;->z:Lyy/j;

    iget-object v4, v1, Ld20/r;->E:Lb10/b;

    sget-object v5, Lcom/stripe/android/networking/PaymentAnalyticsEvent;->d0:Lcom/stripe/android/networking/PaymentAnalyticsEvent;

    const/4 v9, 0x0

    const/16 v10, 0x3e

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lb10/b;->c(Lb10/b;Lcom/stripe/android/networking/PaymentAnalyticsEvent;Ljava/util/Set;Ljava/lang/String;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory$ThreeDS2UiType;Ljava/lang/String;I)Lyy/b;

    move-result-object v2

    invoke-virtual {p1, v2}, Lyy/j;->a(Lyy/b;)V

    new-instance p1, Ld20/e;

    new-instance v4, Lv10/b;

    sget v2, Lcom/stripe/android/core/exception/StripeException;->E:I

    invoke-static {v0}, Ls4/d;->d(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;

    move-result-object v7

    const/4 v10, 0x0

    const/16 v11, 0x7b

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v11}, Lv10/b;-><init>(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p1, v4}, Ld20/e;-><init>(Lv10/b;)V

    :goto_4
    move-object v0, p1

    check-cast v0, Ld20/h;

    iget-object v0, v1, Ld20/r;->K:Landroidx/lifecycle/k1;

    const-string v2, "key_next_step"

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v4, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-boolean v3, v1, Ld20/r;->M:Z

    return-object p1
.end method
