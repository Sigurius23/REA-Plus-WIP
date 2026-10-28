.class public interface abstract Ln6/o;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
.end method

.method public abstract b(Lov2/f;)Z
.end method

.method public abstract c(Lkotlin/jvm/functions/Function1;)Z
.end method

.method public d(Ln6/o;)Ln6/o;
    .locals 1

    sget-object v0, Ln6/m;->a:Ln6/m;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ln6/g;

    invoke-direct {v0, p0, p1}, Ln6/g;-><init>(Ln6/o;Ln6/o;)V

    return-object v0
.end method
