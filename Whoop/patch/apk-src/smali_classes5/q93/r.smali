.class public final Lq93/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr93/j0;


# instance fields
.field public final a:Lkb3/k;

.field public final b:Lu93/e0;

.field public c:Lhb3/i;

.field public final d:Landroidx/lifecycle/h2;


# direct methods
.method public constructor <init>(Lkb3/k;Laj/d;Lu93/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq93/r;->a:Lkb3/k;

    iput-object p3, p0, Lq93/r;->b:Lu93/e0;

    new-instance p2, Ldc3/s;

    const/4 p3, 0x3

    invoke-direct {p2, p0, p3}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lq93/r;->d:Landroidx/lifecycle/h2;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;Ljava/util/ArrayList;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq93/r;->d:Landroidx/lifecycle/h2;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Lva3/e;)Z
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq93/r;->d:Landroidx/lifecycle/h2;

    iget-object v1, v0, Landroidx/lifecycle/h2;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lkb3/j;->x:Lkb3/j;

    if-eq v1, v2, :cond_0

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/g0;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lq93/r;->c(Lva3/e;)Lib3/c;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lva3/e;)Lib3/c;
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lo93/n;->j:Lva3/h;

    const-string v1, "segment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1, v0}, Lva3/f;->h(Lva3/h;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sget-object v0, Lib3/a;->m:Lib3/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lib3/a;->a(Lva3/e;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lib3/d;->a(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lq93/r;->a:Lkb3/k;

    iget-object v2, p0, Lq93/r;->b:Lu93/e0;

    invoke-static {p1, v1, v2, v0}, Lj93/l0;->t(Lva3/e;Lkb3/k;Lr93/b0;Ljava/io/InputStream;)Lib3/c;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "fqName"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method
