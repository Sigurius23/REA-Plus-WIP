.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;
.super Lk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;",
        "Lk/b;",
        "Lkz/c;",
        "Ljz/k;",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lkz/c;

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 1

    if-eqz p2, :cond_5

    const-string p1, "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lkz/h;

    if-eqz p1, :cond_5

    instance-of p2, p1, Lkz/e;

    if-eqz p2, :cond_0

    sget-object p1, Ljz/g;->w:Ljz/g;

    return-object p1

    :cond_0
    instance-of p2, p1, Lkz/g;

    if-eqz p2, :cond_1

    new-instance p2, Ljz/j;

    check-cast p1, Lkz/g;

    iget-object p1, p1, Lkz/g;->w:Ljava/lang/Throwable;

    invoke-direct {p2, p1}, Ljz/j;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_1
    instance-of p2, p1, Lkz/f;

    if-eqz p2, :cond_4

    check-cast p1, Lkz/f;

    iget-object p2, p1, Lkz/f;->x:Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;

    if-nez p2, :cond_2

    new-instance p1, Ljz/j;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "FinancialConnectionsSession is not set"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljz/j;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_2
    iget-object p1, p1, Lkz/f;->y:Ly00/g8;

    if-nez p1, :cond_3

    new-instance p1, Ljz/j;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "PaymentAccount is not set on FinancialConnectionsSession"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljz/j;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_3
    new-instance v0, Ljz/i;

    invoke-direct {v0, p2, p1}, Ljz/i;-><init>(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Ly00/g8;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljz/j;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to retrieve a ConnectionsSheetResult."

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ljz/j;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method
