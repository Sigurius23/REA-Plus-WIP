.class public final Ls2/g;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Ls2/f;


# instance fields
.field public O:Lkotlin/jvm/functions/Function1;

.field public P:Lkotlin/jvm/functions/Function1;


# virtual methods
.method public final Q(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Ls2/g;->P:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ls2/c;->a(Landroid/view/KeyEvent;)Ls2/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final Z(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Ls2/g;->O:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ls2/c;->a(Landroid/view/KeyEvent;)Ls2/c;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
