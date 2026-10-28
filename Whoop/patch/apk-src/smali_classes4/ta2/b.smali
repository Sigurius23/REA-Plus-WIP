.class public final Lta2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lta2/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Lor2/y;",
        "externalLinkNavigator",
        "Landroid/app/Activity;",
        "activity",
        "<init>",
        "(Lj02/o0;Lor2/y;Landroid/app/Activity;)V",
        "Lta2/a$c;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lta2/a$c;)V",
        "Lta2/a;",
        "a",
        "(Lta2/a;)V",
        "Lj02/o0;",
        "Lor2/y;",
        "c",
        "Landroid/app/Activity;",
        "settings_release"
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
.field private final a:Lj02/o0;

.field private final b:Lor2/y;

.field private final c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lj02/o0;Lor2/y;Landroid/app/Activity;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalLinkNavigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta2/b;->a:Lj02/o0;

    iput-object p2, p0, Lta2/b;->b:Lor2/y;

    iput-object p3, p0, Lta2/b;->c:Landroid/app/Activity;

    return-void
.end method

.method private final b(Lta2/a$c;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {p1}, Lta2/a$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "text/plain"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p0, Lta2/b;->c:Landroid/app/Activity;

    sget v1, Lea2/s;->R:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    iget-object v0, p0, Lta2/b;->c:Landroid/app/Activity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public final a(Lta2/a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lta2/a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lta2/a$c;

    invoke-direct {p0, p1}, Lta2/b;->b(Lta2/a$c;)V

    return-void

    :cond_0
    instance-of v0, p1, Lta2/a$a;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lta2/b;->b:Lor2/y;

    iget-object v0, p0, Lta2/b;->c:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lor2/y;->e(Landroid/app/Activity;)V

    return-void

    :cond_1
    instance-of v0, p1, Lta2/a$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lta2/b;->a:Lj02/o0;

    check-cast p1, Lta2/a$b;

    invoke-virtual {p1}, Lta2/a$b;->a()Lj02/m0;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
