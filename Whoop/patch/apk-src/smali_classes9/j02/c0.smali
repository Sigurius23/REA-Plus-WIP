.class public final Lj02/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm02/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lj02/c0;",
        "Lm02/a;",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "context",
        "Ll83/a0;",
        "b",
        "(Landroid/content/Context;)V",
        "Landroid/net/Uri;",
        "deepLinkUri",
        "a",
        "(Landroid/content/Context;Landroid/net/Uri;)V",
        "Landroid/os/Bundle;",
        "arguments",
        "Landroid/app/PendingIntent;",
        "c",
        "(Landroid/content/Context;Landroid/os/Bundle;)Landroid/app/PendingIntent;",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deepLinkUri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const p2, 0x10008000

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhj0/q;

    const-class v1, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v0, p1, v1}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0}, Lhj0/q;->b()Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->a()Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->c()Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    return-void
.end method

.method public c(Landroid/content/Context;Landroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Leb/j0;

    invoke-direct {v0, p1}, Leb/j0;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/content/ComponentName;

    const-class v2, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {v1, p1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p1, v0, Leb/j0;->b:Landroid/content/Intent;

    invoke-virtual {p1, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    sget p1, Lhi0/g;->a:I

    invoke-virtual {v0, p1}, Leb/j0;->g(I)V

    sget p1, Lhi0/e;->c0:I

    invoke-static {v0, p1}, Leb/j0;->f(Leb/j0;I)V

    invoke-virtual {v0, p2}, Leb/j0;->e(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Leb/j0;->b()Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method
