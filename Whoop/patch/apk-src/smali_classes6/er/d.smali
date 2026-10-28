.class public final Ler/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Ler/b;

.field public final synthetic b:Ler/e;


# direct methods
.method public constructor <init>(Ler/e;Ler/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ler/d;->b:Ler/e;

    iput-object p2, p0, Ler/d;->a:Ler/b;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Ler/d;->b:Ler/e;

    iget-object v0, v0, Ler/c;->a:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ler/d;->a:Ler/b;

    invoke-interface {v0}, Ler/b;->c()V

    :cond_0
    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Ler/d;->a:Ler/b;

    invoke-interface {v0}, Ler/b;->d()V

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 1

    iget-object v0, p0, Ler/d;->b:Ler/e;

    iget-object v0, v0, Ler/c;->a:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_0

    new-instance v0, Lg/a;

    invoke-direct {v0, p1}, Lg/a;-><init>(Landroid/window/BackEvent;)V

    iget-object p1, p0, Ler/d;->a:Ler/b;

    invoke-interface {p1, v0}, Ler/b;->a(Lg/a;)V

    :cond_0
    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 1

    iget-object v0, p0, Ler/d;->b:Ler/e;

    iget-object v0, v0, Ler/c;->a:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_0

    new-instance v0, Lg/a;

    invoke-direct {v0, p1}, Lg/a;-><init>(Landroid/window/BackEvent;)V

    iget-object p1, p0, Ler/d;->a:Ler/b;

    invoke-interface {p1, v0}, Ler/b;->b(Lg/a;)V

    :cond_0
    return-void
.end method
