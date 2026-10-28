.class public final Lh20/m1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg32/n;

.field public final b:Lro/i;


# direct methods
.method public constructor <init>(Lg32/n;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/m1;->a:Lg32/n;

    new-instance p1, Lro/i;

    const/16 v0, 0x16

    invoke-direct {p1, v0}, Lro/i;-><init>(I)V

    iput-object p1, p0, Lh20/m1;->b:Lro/i;

    return-void
.end method


# virtual methods
.method public final a(Lp1/q;)Lh20/r3;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const v1, -0x3c66c00c

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    iget-object v1, v0, Lh20/m1;->b:Lro/i;

    iget-object v1, v1, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lh20/b;

    new-instance v7, Ld10/b;

    invoke-direct {v7, v1}, Ld10/b;-><init>(Lh20/b;)V

    const v1, 0x2cc2f1f8

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    new-array v1, v8, [Ljava/lang/Object;

    const v2, -0x1de70f2f

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v2, v9, :cond_0

    new-instance v2, Lh00/d0;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lh00/d0;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v3, v2

    check-cast v3, Lc93/a;

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    const/16 v5, 0xc00

    const/4 v6, 0x6

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "rememberSaveable(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-static {v1, v7, v4, v8}, Le4/a;->k(Ljava/lang/String;Ld10/b;Landroidx/compose/runtime/Composer;I)V

    const v2, -0x1de6fab0

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    iget-object v15, v0, Lh20/m1;->a:Lg32/n;

    invoke-virtual {v4, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2

    if-ne v3, v9, :cond_1

    goto :goto_0

    :cond_1
    move-object v12, v15

    goto :goto_1

    :cond_2
    :goto_0
    new-instance v10, Lg40/f4;

    const/16 v16, 0x0

    const/16 v17, 0x5

    const/4 v11, 0x1

    const-class v13, Lh20/c4;

    const-string v14, "onPaymentSheetResult"

    move-object v12, v15

    const-string v15, "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V"

    invoke-direct/range {v10 .. v17}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v10

    :goto_1
    check-cast v3, Lj93/g;

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    invoke-static {v3, v4}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    new-instance v3, Lcom/stripe/android/paymentsheet/PaymentSheetContract;

    invoke-direct {v3}, Lcom/stripe/android/paymentsheet/PaymentSheetContract;-><init>()V

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj93/g;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v2, v4, v8}, Lwb3/f;->a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;

    move-result-object v11

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, Lj8/c;->a:Lp1/t1;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Landroidx/lifecycle/g0;

    const v3, -0x1de6d24f

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_3

    new-instance v3, Lh00/d0;

    const/4 v5, 0x6

    invoke-direct {v3, v5}, Lh00/d0;-><init>(I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v3, Lc93/a;

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    invoke-static {v3, v4}, Lce/w;->b0(Lc93/a;Lp1/q;)Landroid/app/Activity;

    move-result-object v3

    const v5, -0x1de6c57e

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    if-ne v6, v9, :cond_5

    :cond_4
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v14, v2

    check-cast v14, Landroid/app/Application;

    new-instance v10, La30/w0;

    move-object/from16 v16, v1

    move-object v15, v12

    move-object v12, v3

    invoke-direct/range {v10 .. v16}, La30/w0;-><init>(Lh/i;Landroid/app/Activity;Landroidx/lifecycle/g0;Landroid/app/Application;Lg32/n;Ljava/lang/String;)V

    new-instance v6, Lh20/r3;

    invoke-direct {v6, v10}, Lh20/r3;-><init>(La30/w0;)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lh20/r3;

    invoke-static {v4, v8, v8, v8}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-object v6
.end method

.method public final b(Lh20/b;)V
    .locals 1

    iget-object v0, p0, Lh20/m1;->b:Lro/i;

    iput-object p1, v0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method
