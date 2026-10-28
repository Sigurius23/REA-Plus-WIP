.class public abstract Llb1/s3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/s3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ProgressStyle;",
        "style",
        "Ly81/f;",
        "b",
        "(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;",
        "c",
        "d",
        "a",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/s3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    return-object p0

    :cond_0
    sget-object p0, Ly81/f;->BLACK_20:Ly81/f;

    return-object p0
.end method

.method public static final b(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/s3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p0

    :cond_3
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/s3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p0

    :cond_3
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :cond_4
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/items/ProgressStyle;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/s3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :cond_2
    sget-object p0, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    return-object p0

    :cond_3
    sget-object p0, Ly81/f;->STRAIN:Ly81/f;

    return-object p0

    :cond_4
    sget-object p0, Ly81/f;->BRAND_WHITE:Ly81/f;

    return-object p0
.end method
