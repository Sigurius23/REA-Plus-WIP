.class public abstract Lo71/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lcom/whoop/domain/model/UnitSystem;",
        "unit",
        "c",
        "(ILcom/whoop/domain/model/UnitSystem;)I",
        "d",
        "design_release"
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
.method public static final synthetic a(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 0

    invoke-static {p0, p1}, Lo71/g;->c(ILcom/whoop/domain/model/UnitSystem;)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 0

    invoke-static {p0, p1}, Lo71/g;->d(ILcom/whoop/domain/model/UnitSystem;)I

    move-result p0

    return p0
.end method

.method private static final c(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 0

    invoke-static {p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ld21/a;->a:Ld21/a;

    invoke-virtual {p1, p0}, Ld21/a;->a(I)I

    move-result p0

    :cond_0
    return p0
.end method

.method private static final d(ILcom/whoop/domain/model/UnitSystem;)I
    .locals 0

    invoke-static {p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p1

    if-eqz p1, :cond_0

    return p0

    :cond_0
    sget-object p1, Ld21/a;->a:Ld21/a;

    invoke-virtual {p1, p0}, Ld21/a;->p(I)I

    move-result p0

    return p0
.end method
