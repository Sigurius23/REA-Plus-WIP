.class public final Lsp1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lsp1/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Leb/a0;Lj02/o0;)V",
        "Lsp1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lsp1/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "hormonal-insights_release"
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

.field private final b:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsp1/b;->a:Leb/a0;

    iput-object p2, p0, Lsp1/b;->b:Lj02/o0;

    return-void
.end method


# virtual methods
.method public final a(Lsp1/a;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lsp1/a$a;->a:Lsp1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lsp1/a$b;->a:Lsp1/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of v0, p1, Lsp1/a$c;

    if-eqz v0, :cond_5

    check-cast p1, Lsp1/a$c;

    invoke-virtual {p1}, Lsp1/a$c;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lsp1/a$c;->a()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PREGNANCY"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    const-string v0, "MCI"

    :goto_0
    const-string p1, "android-app://com.whoop/mciOnboarding?feature="

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_2

    :cond_4
    :goto_1
    const-string p1, "android-app://com.whoop/mciOnboarding"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_2
    const-string v0, "uri"

    const/4 v1, 0x0

    invoke-static {p1, v0, p1, v1, v1}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object p1

    iget-object v0, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lsp1/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_5
    instance-of v0, p1, Lsp1/a$e;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lsp1/b;->b:Lj02/o0;

    check-cast p1, Lsp1/a$e;

    invoke-virtual {p1}, Lsp1/a$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_6
    instance-of v0, p1, Lsp1/a$d;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lsp1/b;->b:Lj02/o0;

    new-instance v1, Lj02/m0$w1;

    check-cast p1, Lsp1/a$d;

    invoke-virtual {p1}, Lsp1/a$d;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "PREGNANCY_INSIGHTS_DATA_PRIVACY"

    const-string v3, "Hormonal Settings"

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj02/m0$w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
