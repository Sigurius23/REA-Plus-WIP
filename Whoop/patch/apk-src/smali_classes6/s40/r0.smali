.class public final Ls40/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/a2;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lqy/d;Lyx/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls40/r0;->a:I

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Ls40/r0;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Ls40/r0;->c:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, Ls40/r0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq30/k;Lq30/g0;Ln30/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls40/r0;->a:I

    const-string v0, "challengeActionHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ls40/r0;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Ls40/r0;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Ls40/r0;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w1;
    .locals 6

    iget v0, p0, Ls40/r0;->a:I

    iget-object v1, p0, Ls40/r0;->d:Ljava/lang/Object;

    iget-object v2, p0, Ls40/r0;->c:Ljava/lang/Object;

    iget-object v3, p0, Ls40/r0;->b:Ljava/lang/Object;

    const-string v4, "modelClass"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lt30/g;

    check-cast v3, Lq30/k;

    check-cast v2, Lq30/g0;

    check-cast v1, Ln30/d;

    invoke-direct {p1, v3, v2, v1}, Lt30/g;-><init>(Lq30/k;Lq30/g0;Ln30/d;)V

    return-object p1

    :pswitch_0
    new-instance p1, Ls40/t0;

    check-cast v1, Lyx/b;

    new-instance v0, Lyy/j;

    check-cast v2, Lqy/d;

    sget-object v4, Lbc3/q0;->a:Lkc3/e;

    sget-object v4, Lkc3/d;->w:Lkc3/d;

    invoke-direct {v0, v2, v4}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    new-instance v2, Lb10/b;

    check-cast v3, Landroid/app/Application;

    iget-object v4, v1, Lyx/b;->L:Ljava/lang/String;

    const-string v5, "PaymentAuthWebViewActivity"

    invoke-static {v5}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v2, v3, v5, v4}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Ljava/lang/String;)V

    invoke-direct {p1, v1, v0, v2}, Ls40/t0;-><init>(Lyx/b;Lyy/j;Lb10/b;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
