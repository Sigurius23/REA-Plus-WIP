.class public final Low/l;
.super Low/z;
.source "SourceFile"


# instance fields
.field public a:Low/z;


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Low/l;->a:Low/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Low/z;->b(Lww/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Low/l;->a:Low/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Low/z;->c(Lww/b;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Adapter for type with cyclic dependency has been used before dependency has been resolved"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
