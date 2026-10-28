.class public final Le63/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li63/e0;

.field public final b:Li63/t;

.field public final c:Li63/o;

.field public final d:Lj63/d;

.field public final e:Lbc3/k1;

.field public final f:Lo63/f;

.field public final g:Ljava/util/Set;


# direct methods
.method public constructor <init>(Li63/e0;Li63/t;Li63/o;Lj63/d;Lbc3/k1;Lo63/f;)V
    .locals 1

    const-string v0, "method"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executionContext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le63/e;->a:Li63/e0;

    iput-object p2, p0, Le63/e;->b:Li63/t;

    iput-object p3, p0, Le63/e;->c:Li63/o;

    iput-object p4, p0, Le63/e;->d:Lj63/d;

    iput-object p5, p0, Le63/e;->e:Lbc3/k1;

    iput-object p6, p0, Le63/e;->f:Lo63/f;

    sget-object p1, Ly53/e;->a:Lo63/a;

    invoke-virtual {p6, p1}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    :cond_1
    iput-object p1, p0, Le63/e;->g:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    sget-object v0, La63/h0;->d:La63/g0;

    iget-object v1, p0, Le63/e;->f:Lo63/f;

    sget-object v2, Ly53/e;->a:Lo63/a;

    invoke-virtual {v1, v2}, Lo63/f;->d(Lo63/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HttpRequestData(url="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le63/e;->a:Li63/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Le63/e;->b:Li63/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
