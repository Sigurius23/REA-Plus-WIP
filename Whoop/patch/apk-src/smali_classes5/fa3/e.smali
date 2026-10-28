.class public abstract Lfa3/e;
.super Lfa3/g0;
.source "SourceFile"


# static fields
.field public static final synthetic l:I


# direct methods
.method public static final a(Lr93/w;)Lr93/w;
    .locals 2

    const-string v0, "functionDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lfa3/e;->b(Lva3/h;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object v0, Lfa3/d;->x:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    check-cast p0, Lr93/w;

    return-object p0
.end method

.method public static b(Lva3/h;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfa3/g0;->e:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
