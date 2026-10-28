.class public interface abstract Lnf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Lxf/f;)Lxf/c;
    .locals 1

    const-string v0, "identityProviderConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lxf/f;->j(Ljava/lang/String;)Lxf/c;

    move-result-object p1

    return-object p1
.end method

.method public abstract b()Lnf/i;
.end method

.method public abstract c()Ljava/lang/String;
.end method
