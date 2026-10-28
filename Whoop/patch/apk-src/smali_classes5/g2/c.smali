.class public final Lg2/c;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements Lg2/e;


# instance fields
.field public O:Lkotlin/jvm/functions/Function1;

.field public P:Lg2/w;


# virtual methods
.method public final k(Lg2/w;)V
    .locals 1

    iget-object v0, p0, Lg2/c;->P:Lg2/w;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lg2/c;->P:Lg2/w;

    iget-object v0, p0, Lg2/c;->O:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
