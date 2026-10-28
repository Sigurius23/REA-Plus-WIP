.class public final Le63/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li63/z;

.field public b:Li63/t;

.field public final c:Li63/n;

.field public d:Ljava/lang/Object;

.field public e:Lbc3/e2;

.field public final f:Lo63/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Li63/z;

    invoke-direct {v0}, Li63/z;-><init>()V

    iput-object v0, p0, Le63/d;->a:Li63/z;

    sget-object v0, Li63/t;->b:Li63/t;

    iput-object v0, p0, Le63/d;->b:Li63/t;

    new-instance v0, Li63/n;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lal/a;-><init>(I)V

    iput-object v0, p0, Le63/d;->c:Li63/n;

    sget-object v0, Lg63/c;->a:Lg63/c;

    iput-object v0, p0, Le63/d;->d:Ljava/lang/Object;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Le63/d;->e:Lbc3/e2;

    new-instance v0, Lo63/f;

    invoke-direct {v0}, Lo63/f;-><init>()V

    iput-object v0, p0, Le63/d;->f:Lo63/f;

    return-void
.end method


# virtual methods
.method public final a(Ls63/a;)V
    .locals 2

    iget-object v0, p0, Le63/d;->f:Lo63/f;

    if-eqz p1, :cond_0

    sget-object v1, Le63/h;->a:Lo63/a;

    invoke-virtual {v0, v1, p1}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object p1, Le63/h;->a:Lo63/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "key"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lo63/f;->c()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Le63/d;)V
    .locals 8

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Le63/d;->e:Lbc3/e2;

    iput-object v0, p0, Le63/d;->e:Lbc3/e2;

    iget-object v0, p1, Le63/d;->b:Li63/t;

    iput-object v0, p0, Le63/d;->b:Li63/t;

    iget-object v0, p1, Le63/d;->d:Ljava/lang/Object;

    iput-object v0, p0, Le63/d;->d:Ljava/lang/Object;

    iget-object v0, p1, Le63/d;->f:Lo63/f;

    sget-object v1, Le63/h;->a:Lo63/a;

    invoke-virtual {v0, v1}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls63/a;

    invoke-virtual {p0, v1}, Le63/d;->a(Ls63/a;)V

    iget-object v1, p1, Le63/d;->a:Li63/z;

    iget-object v2, p0, Le63/d;->a:Li63/z;

    const-string v3, "<this>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "url"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Li63/z;->a:Li63/b0;

    const-string v5, "<set-?>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Li63/z;->a:Li63/b0;

    iget-object v4, v1, Li63/z;->b:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Li63/z;->b:Ljava/lang/String;

    iget v4, v1, Li63/z;->c:I

    iput v4, v2, Li63/z;->c:I

    iget-object v4, v1, Li63/z;->h:Ljava/util/List;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Li63/z;->h:Ljava/util/List;

    iget-object v4, v1, Li63/z;->e:Ljava/lang/String;

    iput-object v4, v2, Li63/z;->e:Ljava/lang/String;

    iget-object v4, v1, Li63/z;->f:Ljava/lang/String;

    iput-object v4, v2, Li63/z;->f:Ljava/lang/String;

    new-instance v4, Li63/x;

    const/4 v6, 0x3

    invoke-direct {v4, v6}, Lal/a;-><init>(I)V

    iget-object v6, v1, Li63/z;->i:Li63/x;

    invoke-static {v4, v6}, Landroidx/room/c1;->g(Lo63/n;Lo63/n;)V

    iput-object v4, v2, Li63/z;->i:Li63/x;

    new-instance v6, Laj/c;

    const/16 v7, 0xd

    invoke-direct {v6, v4, v7}, Laj/c;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v2, Li63/z;->j:Laj/c;

    iget-object v4, v1, Li63/z;->g:Ljava/lang/String;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, v2, Li63/z;->g:Ljava/lang/String;

    iget-boolean v1, v1, Li63/z;->d:Z

    iput-boolean v1, v2, Li63/z;->d:Z

    iget-object v1, v2, Li63/z;->h:Ljava/util/List;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v2, Li63/z;->h:Ljava/util/List;

    iget-object v1, p0, Le63/d;->c:Li63/n;

    iget-object p1, p1, Le63/d;->c:Li63/n;

    invoke-static {v1, p1}, Landroidx/room/c1;->g(Lo63/n;Lo63/n;)V

    iget-object p1, p0, Le63/d;->f:Lo63/f;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "other"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lo63/f;->c()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo63/a;

    const-string v3, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lo63/f;->b(Lo63/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lo63/f;->e(Lo63/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method
