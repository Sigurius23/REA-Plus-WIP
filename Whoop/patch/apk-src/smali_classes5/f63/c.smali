.class public abstract Lf63/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li63/s;
.implements Lbc3/c0;


# virtual methods
.method public abstract a()Lw53/b;
.end method

.method public abstract b()Lio/ktor/utils/io/q;
.end method

.method public abstract c()Lq63/b;
.end method

.method public abstract d()Lq63/b;
.end method

.method public abstract e()Li63/v;
.end method

.method public abstract f()Li63/u;
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpResponse["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lf63/c;->a()Lw53/b;

    move-result-object v1

    invoke-virtual {v1}, Lw53/b;->c()Le63/b;

    move-result-object v1

    invoke-interface {v1}, Le63/b;->getUrl()Li63/e0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lf63/c;->e()Li63/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
