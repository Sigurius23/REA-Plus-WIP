.class public final Let1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Let1/b;",
        "",
        "Leb/a0;",
        "fragmentNavController",
        "Lj02/o0;",
        "navigator",
        "Lss1/a;",
        "analytics",
        "<init>",
        "(Leb/a0;Lj02/o0;Lss1/a;)V",
        "Let1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Let1/a;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Lss1/a;",
        "labrador_release"
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

.field private final c:Lss1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lss1/a;)V
    .locals 1

    const-string v0, "fragmentNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Let1/b;->a:Leb/a0;

    iput-object p2, p0, Let1/b;->b:Lj02/o0;

    iput-object p3, p0, Let1/b;->c:Lss1/a;

    return-void
.end method


# virtual methods
.method public final a(Let1/a;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Let1/a$c;->a:Let1/a$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Let1/b;->b:Lj02/o0;

    new-instance v0, Lj02/m0$f3;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const-string v1, "ECG_EDUCATION"

    const-string v2, "ARTICLE"

    const-string v3, "Labrador details"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_0
    sget-object v0, Let1/a$a;->a:Let1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Let1/b;->c:Lss1/a;

    invoke-virtual {p1}, Lss1/a;->f()V

    const-string p1, "android-app://com.whoop/labradorAboutFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Let1/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_1
    sget-object v0, Let1/a$b;->a:Let1/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Let1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Let1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    const-string p1, "android-app://com.whoop/labradorResultsFragment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v0, p0, Let1/b;->a:Leb/a0;

    invoke-virtual {v0, p1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
