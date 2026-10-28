.class public final Lud3/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lud3/e0;

.field public b:Ljava/lang/String;

.field public c:Lkotlin/jvm/internal/k0;

.field public d:Lud3/v0;

.field public e:Lv63/c;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwd3/a;->a:Lwd3/a;

    iput-object v0, p0, Lud3/n0;->e:Lv63/c;

    const-string v0, "GET"

    iput-object v0, p0, Lud3/n0;->b:Ljava/lang/String;

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    iput-object v0, p0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v0, p1, p2}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lud3/h;)V
    .locals 2

    const-string v0, "cacheControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lud3/h;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const-string v1, "Cache-Control"

    if-nez v0, :cond_0

    iget-object p1, p0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {p1, v1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p0, v1, p1}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lva3/b;->e(Ljava/lang/String;)V

    invoke-static {p2, p1}, Lva3/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/k0;->j(Ljava/lang/String;)V

    invoke-static {v0, p1, p2}, Lva3/b;->b(Lkotlin/jvm/internal/k0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Lud3/d0;)V
    .locals 1

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object p1

    iput-object p1, p0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    return-void
.end method

.method public final e(Ljava/lang/String;Lud3/v0;)V
    .locals 2

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_3

    const-string v0, "method "

    if-nez p2, :cond_1

    const-string v1, "POST"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PUT"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PATCH"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PROPPATCH"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "QUERY"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "REPORT"

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string p2, " must have a request body."

    invoke-static {v0, p1, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    invoke-static {p1}, Lwb3/f;->X(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_0
    iput-object p1, p0, Lud3/n0;->b:Ljava/lang/String;

    iput-object p2, p0, Lud3/n0;->d:Lud3/v0;

    return-void

    :cond_2
    const-string p2, " must not have a request body."

    invoke-static {v0, p1, p2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "method.isEmpty() == true"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Ljava/lang/String;)V
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ws:"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    const-string v2, "substring(...)"

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "wss:"

    invoke-static {p1, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "https:"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/iterable/iterableapi/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/v;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object p1

    iput-object p1, p0, Lud3/n0;->a:Lud3/e0;

    return-void
.end method
