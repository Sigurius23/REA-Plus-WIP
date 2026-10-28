.class public interface abstract Lmb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract d(Lub/a;)V
.end method

.method public f(Ltb/a;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lwb/a;

    if-eqz v0, :cond_0

    check-cast p1, Lwb/a;

    iget-object p1, p1, Lwb/a;->w:Lub/a;

    invoke-interface {p0, p1}, Lmb/a;->d(Lub/a;)V

    :cond_0
    return-void
.end method
