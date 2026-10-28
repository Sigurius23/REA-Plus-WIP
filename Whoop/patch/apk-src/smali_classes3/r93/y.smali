.class public abstract Lr93/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbd3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbd3/e0;

    const-string v1, "InvalidModuleNotifier"

    invoke-direct {v0, v1}, Lbd3/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lr93/y;->a:Lbd3/e0;

    return-void
.end method

.method public static final a(Lr93/k;)Lr93/h;
    .locals 1

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    if-eqz v0, :cond_2

    instance-of p0, p0, Lr93/g0;

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    instance-of p0, p0, Lr93/g0;

    if-nez p0, :cond_1

    invoke-static {v0}, Lr93/y;->a(Lr93/k;)Lr93/h;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p0, v0, Lr93/h;

    if-eqz p0, :cond_2

    check-cast v0, Lr93/h;

    return-object v0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(Lr93/e;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/e;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->x:Lr93/a0;

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lr93/e;->getKind()Lr93/f;

    move-result-object p0

    sget-object v0, Lr93/f;->y:Lr93/f;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Lu93/e0;)V
    .locals 3

    sget-object v0, Lr93/y;->a:Lbd3/e0;

    invoke-virtual {p0, v0}, Lu93/e0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/descriptors/InvalidModuleException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Accessing invalid module descriptor "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "message"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static final d(Lr93/b0;Lva3/e;)Lr93/e;
    .locals 5

    sget-object v0, Lz93/c;->w:Lz93/c;

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "fqName"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1}, Lva3/f;->c()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lva3/e;->b()Lva3/e;

    move-result-object v2

    invoke-interface {p0, v2}, Lr93/b0;->F(Lva3/e;)Lr93/k0;

    move-result-object v2

    check-cast v2, Lu93/a0;

    iget-object v2, v2, Lu93/a0;->H:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/k;

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object v4

    invoke-virtual {v2, v4, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v2

    instance-of v4, v2, Lr93/e;

    if-eqz v4, :cond_1

    check-cast v2, Lr93/e;

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p1}, Lva3/e;->b()Lva3/e;

    move-result-object p1

    invoke-static {p0, p1}, Lr93/y;->d(Lr93/b0;Lva3/e;)Lr93/e;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-interface {p0}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {v1}, Lva3/f;->g()Lva3/h;

    move-result-object p1

    invoke-interface {p0, p1, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p0

    goto :goto_1

    :cond_3
    move-object p0, v3

    :goto_1
    instance-of p1, p0, Lr93/e;

    if-eqz p1, :cond_4

    check-cast p0, Lr93/e;

    return-object p0

    :cond_4
    :goto_2
    return-object v3
.end method
