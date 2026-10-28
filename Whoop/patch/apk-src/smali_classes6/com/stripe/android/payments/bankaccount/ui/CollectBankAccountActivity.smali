.class public final Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;
.super Lm/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;",
        "Lm/m;",
        "<init>",
        "()V",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic z:I


# instance fields
.field public final w:Ll83/p;

.field public x:Lkz/o;

.field public final y:Landroidx/lifecycle/y1;


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Lm/m;-><init>()V

    new-instance v0, La20/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La20/a;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->w:Ll83/p;

    new-instance v0, La20/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, La20/a;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V

    new-instance v1, Landroidx/lifecycle/y1;

    const-class v2, La20/j;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, La20/c;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, La20/c;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V

    new-instance v4, La20/c;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, La20/c;-><init>(Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;I)V

    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object v1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->y:Landroidx/lifecycle/y1;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->w:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz10/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz10/e;->f()Lw10/d;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    new-instance p1, Lz10/q;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Configuration not provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lz10/q;-><init>(Ljava/lang/Throwable;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Lz10/f;

    invoke-direct {v1, p1}, Lz10/f;-><init>(Lz10/r;)V

    new-instance p1, Ll83/k;

    const-string v2, "com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result"

    invoke-direct {p1, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Le93/b;->g([Ll83/k;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    move-result-object p1

    const/4 v0, -0x1

    invoke-virtual {p0, v0, p1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_1
    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz10/e;

    const-string v0, "Required value was null."

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lz10/e;->h()Lf20/b;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lz10/e;->f()Lw10/d;

    move-result-object p1

    new-instance v3, La1/e;

    iget-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->y:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, La20/j;

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v4, 0x1

    const-class v6, La20/j;

    const-string v7, "onConnectionsForInstantDebitsResult"

    const-string v8, "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V"

    invoke-direct/range {v3 .. v10}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v4, La1/e;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, La20/j;

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v5, 0x1

    const-class v7, La20/j;

    const-string v8, "onConnectionsForACHResult"

    const-string v9, "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V"

    invoke-direct/range {v4 .. v11}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lw10/a;

    if-eqz v0, :cond_2

    invoke-static {v2, p0}, Lf20/c;->a(Lf20/b;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance v0, Lay/y;

    const-string v2, "intentBuilder"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;

    invoke-direct {v2, p1}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Lg20/q;

    const/4 v4, 0x1

    invoke-direct {p1, v3, v4}, Lg20/q;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v2, p1}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    const-string v2, "activityResultLauncher"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lay/y;->a:Lj/d;

    goto :goto_2

    :cond_2
    instance-of v0, p1, Lw10/b;

    if-nez v0, :cond_4

    instance-of p1, p1, Lw10/c;

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    :goto_1
    new-instance p1, Ly10/d;

    invoke-direct {p1, v4}, Ly10/d;-><init>(La1/e;)V

    invoke-static {v2, p0}, Lf20/c;->a(Lf20/b;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    new-instance v2, Lkz/j;

    const-string v3, "intentBuilder"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;

    invoke-direct {v3, v0}, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataContract;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Laq0/o;

    const/16 v4, 0x9

    invoke-direct {v0, p1, v4}, Laq0/o;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v3, v0}, Lg/l;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object p1

    invoke-direct {v2, p1}, Lkz/j;-><init>(Lj/d;)V

    move-object v0, v2

    :goto_2
    iput-object v0, p0, Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;->x:Lkz/o;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v0, La20/b;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v2, Le;

    invoke-direct {v2, p1, v0, v1}, Le;-><init>(Landroidx/lifecycle/b0;Lc93/m;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v1, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
