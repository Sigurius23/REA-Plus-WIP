.class public final Ldg/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgf/l;
.implements Lbc3/c0;


# instance fields
.field public final synthetic w:Lgf/c;

.field public final x:Lbc3/l1;

.field public final y:Lgf/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ldg/a;->w:Lgf/c;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v1

    iput-object v1, p0, Ldg/a;->x:Lbc3/l1;

    iput-object v0, p0, Ldg/a;->y:Lgf/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ldg/a;->w:Lgf/c;

    iget-object v0, v0, Lgf/c;->w:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lgf/a;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldg/a;->w:Lgf/c;

    invoke-virtual {v0, p1}, Lgf/c;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lgf/a;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldg/a;->w:Lgf/c;

    invoke-virtual {v0, p1, p2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lgf/a;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldg/a;->w:Lgf/c;

    invoke-virtual {v0, p1}, Lgf/c;->d(Lgf/a;)Z

    move-result p1

    return p1
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Ldg/a;->x:Lbc3/l1;

    return-object v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Ldg/a;->w:Lgf/c;

    iget-object v0, v0, Lgf/c;->w:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method
