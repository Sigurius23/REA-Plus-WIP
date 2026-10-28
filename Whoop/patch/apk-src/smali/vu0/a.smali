.class public final Lvu0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvu0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lvu0/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lx82/j;",
        "stringsContextProvider",
        "<init>",
        "(Landroid/content/Context;Lx82/j;)V",
        "Lb12/c;",
        "bucket",
        "",
        "c",
        "(Lb12/c;)Ljava/lang/String;",
        "",
        "batteryLevel",
        "Lst0/v;",
        "strapGen",
        "b",
        "(ILst0/v;)Ljava/lang/String;",
        "a",
        "f",
        "(Lst0/v;)Ljava/lang/String;",
        "streakValue",
        "e",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "d",
        "Landroid/content/Context;",
        "Lx82/j;",
        "g",
        "()Landroid/content/Context;",
        "stringsContext",
        "connectivity-notifications_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lx82/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx82/j;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stringsContextProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvu0/a;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lvu0/a;->b:Lx82/j;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lx82/j;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lx82/j;

    invoke-direct {p2}, Lx82/j;-><init>()V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvu0/a;-><init>(Landroid/content/Context;Lx82/j;)V

    return-void
.end method

.method private final g()Landroid/content/Context;
    .locals 2

    iget-object v0, p0, Lvu0/a;->b:Lx82/j;

    iget-object v1, p0, Lvu0/a;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lx82/j;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(ILst0/v;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0xa

    const/4 v1, 0x5

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lst0/v;->isGen4()Z

    move-result p2

    const/4 v2, 0x1

    if-ne p2, v2, :cond_2

    if-gt p1, v1, :cond_0

    const-string p1, "Less than 4 hours"

    return-object p1

    :cond_0
    if-gt p1, v0, :cond_1

    const-string p1, "Less than 12 hours"

    return-object p1

    :cond_1
    const-string p1, "Less than 24 hours"

    return-object p1

    :cond_2
    if-gt p1, v1, :cond_3

    const-string p1, "Less than 5%"

    return-object p1

    :cond_3
    if-gt p1, v0, :cond_4

    const-string p1, "Less than 10%"

    return-object p1

    :cond_4
    const-string p1, "Less than 20%"

    return-object p1
.end method

.method public final b(ILst0/v;)Ljava/lang/String;
    .locals 4

    const/16 v0, 0xa

    const/4 v1, 0x5

    const-string v2, "getString(...)"

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lst0/v;->isGen4()Z

    move-result p2

    const/4 v3, 0x1

    if-ne p2, v3, :cond_2

    if-ge p1, v1, :cond_0

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->l:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    if-ge p1, v0, :cond_1

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->n:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->k:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    if-ge p1, v1, :cond_3

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->j:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_3
    if-ge p1, v0, :cond_4

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->h:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_4
    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget p2, Luv0/c;->i:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final c(Lb12/c;)Ljava/lang/String;
    .locals 2

    const-string v0, "bucket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvu0/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const-string v1, "getString(...)"

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget v0, Luv0/c;->o:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget v0, Luv0/c;->o:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget v0, Luv0/c;->m:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final d(Lst0/v;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lst0/v;->isGen4()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "Less than 12 hours streak"

    return-object p1

    :cond_0
    const-string p1, "Less than 5% streak"

    return-object p1
.end method

.method public final e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "streakValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object v0

    sget v1, Luv0/c;->s:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final f(Lst0/v;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lst0/v;->isGen4()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget v0, Luv0/c;->t:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-direct {p0}, Lvu0/a;->g()Landroid/content/Context;

    move-result-object p1

    sget v0, Luv0/c;->u:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method
