.class public final Lij1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lij1/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "Lb7/b;",
        "a",
        "()Lb7/b;",
        "",
        "b",
        "()Z",
        "c",
        "Landroid/content/Context;",
        "Ltr2/n;",
        "health-connect_release"
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

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij1/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lij1/a;->b:Ltr2/n;

    return-void
.end method


# virtual methods
.method public final a()Lb7/b;
    .locals 5

    invoke-virtual {p0}, Lij1/a;->b()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lij1/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    sget-object v0, Lb7/b;->a:Lb7/a;

    iget-object v2, p0, Lij1/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lb7/a;->a(Lb7/a;Landroid/content/Context;)Lb7/b;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    iget-object v2, p0, Lij1/a;->b:Ltr2/n;

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Google Health Connect Client not available"

    invoke-interface {v2, v4, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_0
    return-object v1
.end method

.method public final b()Z
    .locals 2

    sget-object v0, Lb7/b;->a:Lb7/a;

    iget-object v1, p0, Lij1/a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lb7/a;->c(Lb7/a;Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 3

    sget-object v0, Lb7/b;->a:Lb7/a;

    iget-object v1, p0, Lij1/a;->a:Landroid/content/Context;

    const/4 v2, 0x2

    invoke-static {v0, v1}, Lb7/a;->c(Lb7/a;Landroid/content/Context;)I

    move-result v0

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
