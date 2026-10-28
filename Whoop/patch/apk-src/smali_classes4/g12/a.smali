.class public final Lg12/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u000f\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lg12/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lor2/k0;",
        "intentProvider",
        "Lg12/b;",
        "callbackBus",
        "<init>",
        "(Landroid/content/Context;Lor2/k0;Lg12/b;)V",
        "Lcom/whoop/domain/model/WhoopUri;",
        "url",
        "Ll83/a0;",
        "b",
        "(Lcom/whoop/domain/model/WhoopUri;)V",
        "a",
        "Landroid/content/Context;",
        "Lor2/k0;",
        "c",
        "Lg12/b;",
        "Lec3/t1;",
        "",
        "d",
        "Lec3/t1;",
        "()Lec3/t1;",
        "urlOpens",
        "oauth-integration_release"
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

.field private final b:Lor2/k0;

.field private final c:Lg12/b;

.field private final d:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lor2/k0;Lg12/b;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbackBus"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg12/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lg12/a;->b:Lor2/k0;

    iput-object p3, p0, Lg12/a;->c:Lg12/b;

    invoke-virtual {p3}, Lg12/b;->b()Lec3/t1;

    move-result-object p1

    iput-object p1, p0, Lg12/a;->d:Lec3/t1;

    return-void
.end method


# virtual methods
.method public a()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lg12/a;->d:Lec3/t1;

    return-object v0
.end method

.method public b(Lcom/whoop/domain/model/WhoopUri;)V
    .locals 2

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg12/a;->b:Lor2/k0;

    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1, p1}, Lor2/k0;->a(Ljava/lang/String;Lcom/whoop/domain/model/WhoopUri;)Landroid/content/Intent;

    move-result-object p1

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lg12/a;->a:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
