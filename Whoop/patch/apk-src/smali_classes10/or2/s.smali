.class public final Lor2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0011\u001a\u00020\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00172\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008 \u0010!J\r\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\'R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lor2/s;",
        "",
        "Leb/a0;",
        "underlyingNavController",
        "Lor2/t;",
        "currentDestinationHoldingStore",
        "<init>",
        "(Leb/a0;Lor2/t;)V",
        "",
        "resId",
        "Ll83/a0;",
        "b",
        "(I)V",
        "Landroid/os/Bundle;",
        "args",
        "Leb/x0;",
        "navOptions",
        "c",
        "(ILandroid/os/Bundle;Leb/x0;)V",
        "",
        "deepLink",
        "h",
        "(Ljava/lang/String;)V",
        "Landroid/net/Uri;",
        "d",
        "(Landroid/net/Uri;)V",
        "e",
        "(Landroid/net/Uri;Leb/x0;)V",
        "Leb/p0;",
        "directions",
        "f",
        "(Leb/p0;)V",
        "g",
        "(Leb/p0;Leb/x0;)V",
        "",
        "i",
        "()Z",
        "a",
        "Leb/a0;",
        "Lor2/t;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
        "feature_release"
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
.field private final a:Leb/a0;

.field private final b:Lor2/t;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Leb/a0;Lor2/t;)V
    .locals 1

    const-string v0, "underlyingNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentDestinationHoldingStore"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/s;->a:Leb/a0;

    iput-object p2, p0, Lor2/s;->b:Lor2/t;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "CurrentDestinationCheckingNavController"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lor2/s;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lor2/s;)Leb/a0;
    .locals 0

    iget-object p0, p0, Lor2/s;->a:Leb/a0;

    return-object p0
.end method


# virtual methods
.method public final b(I)V
    .locals 5

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string v0, "Could not navigate - current nav controller destination is null"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v3, v3, Leb/n0;->H:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v1

    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v3}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, v1, v1}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v4, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, v1, v1}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " != currentDestinationId: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final c(ILandroid/os/Bundle;Leb/x0;)V
    .locals 4

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string p2, "Could not navigate - current nav controller destination is null"

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v1, v3, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v1}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " != currentDestinationId: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final d(Landroid/net/Uri;)V
    .locals 5

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string v0, "Could not navigate - current nav controller destination is null"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v1, v3, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v1}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " != currentDestinationId: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final e(Landroid/net/Uri;Leb/x0;)V
    .locals 4

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string p2, "Could not navigate - current nav controller destination is null"

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v1, v3, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v1}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " != currentDestinationId: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final f(Leb/p0;)V
    .locals 5

    const-string v0, "directions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string v0, "Could not navigate - current nav controller destination is null"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v1, v3, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v1}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->v(Leb/p0;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0, p1}, Leb/a0;->v(Leb/p0;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " != currentDestinationId: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final g(Leb/p0;Leb/x0;)V
    .locals 4

    const-string v0, "directions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->i()Leb/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Leb/n0;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    const-string p2, "Could not navigate - current nav controller destination is null"

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0}, Lor2/t;->g()Ljava/lang/Integer;

    move-result-object v0

    iget-object v3, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v3}, Leb/a0;->i()Leb/n0;

    move-result-object v3

    if-eqz v3, :cond_2

    iget v1, v3, Leb/n0;->H:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v0, :cond_3

    iget-object v0, p0, Lor2/s;->b:Lor2/t;

    invoke-virtual {v0, v1}, Lor2/t;->j(Ljava/lang/Integer;)V

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Leb/p0;->a()I

    move-result v1

    invoke-interface {p1}, Leb/p0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_4

    invoke-static {p0}, Lor2/s;->a(Lor2/s;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Leb/p0;->a()I

    move-result v1

    invoke-interface {p1}, Leb/p0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Leb/a0;->p(ILandroid/os/Bundle;Leb/x0;)V

    return-void

    :cond_4
    iget-object p1, p0, Lor2/s;->c:Ltr2/n;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "Failed to safely navigate, savedCurrentDestinationId: "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " != currentDestinationId: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public final h(Ljava/lang/String;)V
    .locals 1

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lor2/s;->d(Landroid/net/Uri;)V

    return-void
.end method

.method public final i()Z
    .locals 1

    iget-object v0, p0, Lor2/s;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    move-result v0

    return v0
.end method
