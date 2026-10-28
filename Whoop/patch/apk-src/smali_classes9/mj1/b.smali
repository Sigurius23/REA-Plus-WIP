.class public final Lmj1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u0008\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\n0\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lmj1/b;",
        "",
        "Leb/a0;",
        "navController",
        "Lor2/y;",
        "externalLinkNavigator",
        "Landroid/app/Activity;",
        "activity",
        "Lj/d;",
        "",
        "",
        "requestPermissionsLauncher",
        "Lhj1/a;",
        "analyticsHelper",
        "<init>",
        "(Leb/a0;Lor2/y;Landroid/app/Activity;Lj/d;Lhj1/a;)V",
        "Lmj1/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lmj1/a;)V",
        "Leb/a0;",
        "b",
        "Lor2/y;",
        "c",
        "Landroid/app/Activity;",
        "d",
        "Lj/d;",
        "e",
        "Lhj1/a;",
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
.field private final a:Leb/a0;

.field private final b:Lor2/y;

.field private final c:Landroid/app/Activity;

.field private final d:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final e:Lhj1/a;


# direct methods
.method public constructor <init>(Leb/a0;Lor2/y;Landroid/app/Activity;Lj/d;Lhj1/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leb/a0;",
            "Lor2/y;",
            "Landroid/app/Activity;",
            "Lj/d;",
            "Lhj1/a;",
            ")V"
        }
    .end annotation

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestPermissionsLauncher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj1/b;->a:Leb/a0;

    iput-object p2, p0, Lmj1/b;->b:Lor2/y;

    iput-object p3, p0, Lmj1/b;->c:Landroid/app/Activity;

    iput-object p4, p0, Lmj1/b;->d:Lj/d;

    iput-object p5, p0, Lmj1/b;->e:Lhj1/a;

    return-void
.end method


# virtual methods
.method public final a(Lmj1/a;)V
    .locals 7

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lmj1/a$a;->a:Lmj1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lmj1/b;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    sget-object v0, Lmj1/a$e;->a:Lmj1/a$e;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lmj1/b;->e:Lhj1/a;

    const-string v0, "Settings"

    invoke-virtual {p1, v0}, Lhj1/a;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lmj1/b;->b:Lor2/y;

    iget-object v2, p0, Lmj1/b;->c:Landroid/app/Activity;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "https://api.prod.whoop.com/url-mapping-service/v1/GOOGLE_HEALTH"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lor2/y;->y(Lor2/y;Landroid/app/Activity;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void

    :cond_1
    sget-object v0, Lmj1/a$d;->a:Lmj1/a$d;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/high16 v1, 0x10000000

    if-eqz v0, :cond_2

    iget-object p1, p0, Lmj1/b;->c:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "market://details?id=com.google.android.apps.healthdata&url=healthconnect%3A%2F%2Fonboarding"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v1, "overlay"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v1, p0, Lmj1/b;->c:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "callerId"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    sget-object v0, Lmj1/a$c;->a:Lmj1/a$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lmj1/b;->d:Lj/d;

    sget-object v0, Lpj1/b;->l:Lpj1/b$a;

    invoke-virtual {v0}, Lpj1/b$a;->a()Ljava/util/Set;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_3
    sget-object v0, Lmj1/a$b;->a:Lmj1/a$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lmj1/b;->c:Landroid/app/Activity;

    new-instance v0, Landroid/content/Intent;

    sget-object v2, Lb7/b;->a:Lb7/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lb7/a;->b:Ljava/lang/String;

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-ge v1, v2, :cond_4

    const-string v1, "com.google.android.apps.healthdata"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_4
    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
