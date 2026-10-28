.class public final Lvf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/d;


# instance fields
.field public final E:Lmf/c;

.field public w:Lmf/r;

.field public final x:Lcg/j;

.field public final y:Lmf/c;

.field public z:Lmf/l;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 7
    sget-object v1, Lmf/r;->w:Lmf/r;

    new-instance v2, Lcg/j;

    invoke-direct {v2}, Lcg/j;-><init>()V

    new-instance v3, Lmf/c;

    const/4 v0, 0x1

    .line 8
    invoke-direct {v3, v0}, Lmf/c;-><init>(I)V

    .line 9
    new-instance v5, Lmf/c;

    const/4 v0, 0x0

    .line 10
    invoke-direct {v5, v0}, Lmf/c;-><init>(I)V

    .line 11
    sget-object v4, Lmf/j;->a:Lmf/j;

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lvf/b;-><init>(Lmf/r;Lcg/j;Lmf/c;Lmf/l;Lmf/c;)V

    return-void
.end method

.method public constructor <init>(Lmf/r;Lcg/j;Lmf/c;Lmf/l;Lmf/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvf/b;->w:Lmf/r;

    .line 3
    iput-object p2, p0, Lvf/b;->x:Lcg/j;

    .line 4
    iput-object p3, p0, Lvf/b;->y:Lmf/c;

    .line 5
    iput-object p4, p0, Lvf/b;->z:Lmf/l;

    .line 6
    iput-object p5, p0, Lvf/b;->E:Lmf/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    new-instance v0, Lvf/b;

    iget-object v1, p0, Lvf/b;->w:Lmf/r;

    iget-object v2, p0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v2}, Lcg/j;->c()Lcg/j;

    move-result-object v2

    iget-object v3, p0, Lvf/b;->y:Lmf/c;

    iget-object v3, v3, La2/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-static {v3}, Lds/p;->A(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    move-object v4, v3

    new-instance v3, Lmf/c;

    const/4 v5, 0x1

    invoke-direct {v3, v5}, Lmf/c;-><init>(I)V

    iget-object v5, v3, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object v4, p0, Lvf/b;->z:Lmf/l;

    iget-object v5, p0, Lvf/b;->E:Lmf/c;

    iget-object v5, v5, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-static {v5}, Lds/p;->A(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v5

    move-object v6, v5

    new-instance v5, Lmf/c;

    const/4 v7, 0x0

    invoke-direct {v5, v7}, Lmf/c;-><init>(I)V

    iget-object v7, v5, La2/a;->x:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7, v6}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-direct/range {v0 .. v5}, Lvf/b;-><init>(Lmf/r;Lcg/j;Lmf/c;Lmf/l;Lmf/c;)V

    return-object v0
.end method

.method public final b()Lvf/h;
    .locals 6

    iget-object v1, p0, Lvf/b;->w:Lmf/r;

    iget-object v0, p0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v0}, Lcg/j;->b()Lcg/o;

    move-result-object v2

    iget-object v0, p0, Lvf/b;->y:Lmf/c;

    iget-object v3, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v0, Lmf/h;->b:Lmf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lmf/g;->c:Lmf/g;

    move-object v3, v0

    goto :goto_0

    :cond_0
    new-instance v3, Lmf/i;

    iget-object v0, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    const-string v4, "values"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v0}, Lgf/u;-><init>(Ljava/util/Map;)V

    :goto_0
    iget-object v4, p0, Lvf/b;->z:Lmf/l;

    iget-object v0, p0, Lvf/b;->E:Lmf/c;

    iget-object v5, v0, La2/a;->x:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v0, Lmf/b;->a:Lmf/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lmf/f;->c:Lmf/f;

    :goto_1
    move-object v5, v0

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lmf/c;->Q()Lmf/d;

    move-result-object v0

    goto :goto_1

    :goto_2
    const-string v0, "method"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvf/h;

    invoke-direct/range {v0 .. v5}, Lvf/h;-><init>(Lmf/r;Lcg/o;Lmf/h;Lmf/l;Lmf/b;)V

    return-object v0
.end method

.method public final c()Lmf/l;
    .locals 1

    iget-object v0, p0, Lvf/b;->z:Lmf/l;

    return-object v0
.end method

.method public final d()Lmf/c;
    .locals 1

    iget-object v0, p0, Lvf/b;->y:Lmf/c;

    return-object v0
.end method

.method public final e()Lmf/r;
    .locals 1

    iget-object v0, p0, Lvf/b;->w:Lmf/r;

    return-object v0
.end method

.method public final f()Lmf/c;
    .locals 1

    iget-object v0, p0, Lvf/b;->E:Lmf/c;

    return-object v0
.end method

.method public final g()Lcg/j;
    .locals 1

    iget-object v0, p0, Lvf/b;->x:Lcg/j;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "HttpRequestBuilder(method="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lvf/b;->w:Lmf/r;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", url="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvf/b;->x:Lcg/j;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", headers="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvf/b;->y:Lmf/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", body="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvf/b;->z:Lmf/l;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", trailingHeaders="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lvf/b;->E:Lmf/c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
