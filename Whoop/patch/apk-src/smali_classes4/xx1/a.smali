.class public final Lxx1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lxx1/a;",
        "",
        "Leb/a0;",
        "navController",
        "Lor2/k1;",
        "shareUtil",
        "<init>",
        "(Leb/a0;Lor2/k1;)V",
        "Landroid/content/Context;",
        "context",
        "",
        "policyCtaUrl",
        "Ll83/a0;",
        "a",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "Lxx1/b;",
        "navigationEvent",
        "b",
        "(Lxx1/b;)V",
        "filePath",
        "c",
        "(Ljava/lang/String;Landroid/content/Context;)V",
        "Leb/a0;",
        "Lor2/k1;",
        "membership_release"
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

.field private final b:Lor2/k1;


# direct methods
.method public constructor <init>(Leb/a0;Lor2/k1;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shareUtil"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxx1/a;->a:Leb/a0;

    iput-object p2, p0, Lxx1/a;->b:Lor2/k1;

    return-void
.end method

.method private final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final b(Lxx1/b;)V
    .locals 1

    const-string v0, "navigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lxx1/b$a;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lxx1/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lxx1/b$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxx1/a;->a:Leb/a0;

    iget-object v0, v0, Leb/a0;->a:Landroid/content/Context;

    check-cast p1, Lxx1/b$b;

    invoke-virtual {p1}, Lxx1/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lxx1/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lxx1/b$c;

    if-eqz v0, :cond_2

    check-cast p1, Lxx1/b$c;

    invoke-virtual {p1}, Lxx1/b$c;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lxx1/a;->a:Leb/a0;

    iget-object v0, v0, Leb/a0;->a:Landroid/content/Context;

    invoke-virtual {p0, p1, v0}, Lxx1/a;->c(Ljava/lang/String;Landroid/content/Context;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final c(Ljava/lang/String;Landroid/content/Context;)V
    .locals 7

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lxx1/a;->b:Lor2/k1;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lor2/k1;->b(Lor2/k1;Ljava/io/File;Landroid/content/Context;Landroid/content/IntentSender;ILjava/lang/Object;)V

    return-void
.end method
