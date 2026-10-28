.class public final Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;
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
        "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;",
        "Lk/b;",
        "Lkz/b;",
        "Lkz/n;",
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


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "intentBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;->a:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Lkz/b;

    const-string p1, "input"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsContract;->a:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    return-object p1
.end method

.method public final parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 3

    if-eqz p2, :cond_4

    const-string p1, "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lkz/h;

    if-eqz p1, :cond_4

    instance-of p2, p1, Lkz/e;

    if-eqz p2, :cond_0

    sget-object p1, Lkz/k;->w:Lkz/k;

    return-object p1

    :cond_0
    instance-of p2, p1, Lkz/g;

    if-eqz p2, :cond_1

    new-instance p2, Lkz/m;

    check-cast p1, Lkz/g;

    iget-object p1, p1, Lkz/g;->w:Ljava/lang/Throwable;

    invoke-direct {p2, p1}, Lkz/m;-><init>(Ljava/lang/Throwable;)V

    return-object p2

    :cond_1
    instance-of p2, p1, Lkz/f;

    if-eqz p2, :cond_3

    check-cast p1, Lkz/f;

    iget-object p1, p1, Lkz/f;->w:Lkz/p;

    if-nez p1, :cond_2

    new-instance p1, Lkz/m;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Instant debits result is missing"

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lkz/m;-><init>(Ljava/lang/Throwable;)V

    return-object p1

    :cond_2
    new-instance p2, Lkz/l;

    iget-object v0, p1, Lkz/p;->w:Ljava/lang/String;

    iget-object v1, p1, Lkz/p;->x:Ljava/lang/String;

    iget-object v2, p1, Lkz/p;->y:Ljava/lang/String;

    iget-boolean p1, p1, Lkz/p;->z:Z

    invoke-direct {p2, v0, v1, v2, p1}, Lkz/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object p2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Lkz/m;

    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to retrieve a ConnectionsSheetResult."

    invoke-direct {p2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lkz/m;-><init>(Ljava/lang/Throwable;)V

    return-object p1
.end method
