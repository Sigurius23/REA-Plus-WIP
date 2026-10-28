.class public abstract Lf20/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lf20/b;Landroid/content/Context;)Lkotlin/jvm/functions/Function1;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    new-instance p0, Lh32/b;

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lh32/b;-><init>(Landroid/content/Context;I)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    invoke-static {p1}, Lcom/stripe/android/financialconnections/FinancialConnectionsSheetKt;->intentBuilder(Landroid/content/Context;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method
