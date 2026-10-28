.class public final Lud3/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lud3/e0;

.field public final b:Ljava/lang/String;

.field public final c:Lud3/d0;

.field public final d:Lud3/v0;

.field public final e:Lv63/c;

.field public f:Lud3/h;


# direct methods
.method public constructor <init>(Lud3/n0;)V
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lud3/n0;->a:Lud3/e0;

    if-eqz v0, :cond_0

    iput-object v0, p0, Lud3/o0;->a:Lud3/e0;

    iget-object v0, p1, Lud3/n0;->b:Ljava/lang/String;

    iput-object v0, p0, Lud3/o0;->b:Ljava/lang/String;

    iget-object v0, p1, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    invoke-virtual {v0}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    iput-object v0, p0, Lud3/o0;->c:Lud3/d0;

    iget-object v0, p1, Lud3/n0;->d:Lud3/v0;

    iput-object v0, p0, Lud3/o0;->d:Lud3/v0;

    iget-object p1, p1, Lud3/n0;->e:Lv63/c;

    iput-object p1, p0, Lud3/o0;->e:Lv63/c;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "url == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Lud3/h;
    .locals 1

    iget-object v0, p0, Lud3/o0;->f:Lud3/h;

    if-nez v0, :cond_0

    sget-object v0, Lud3/h;->n:Lud3/h;

    iget-object v0, p0, Lud3/o0;->c:Lud3/d0;

    invoke-static {v0}, Lq83/g;->O(Lud3/d0;)Lud3/h;

    move-result-object v0

    iput-object v0, p0, Lud3/o0;->f:Lud3/h;

    :cond_0
    return-object v0
.end method

.method public final b()Lud3/n0;
    .locals 2

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lud3/o0;->a:Lud3/e0;

    iput-object v1, v0, Lud3/n0;->a:Lud3/e0;

    iget-object v1, p0, Lud3/o0;->b:Ljava/lang/String;

    iput-object v1, v0, Lud3/n0;->b:Ljava/lang/String;

    iget-object v1, p0, Lud3/o0;->d:Lud3/v0;

    iput-object v1, v0, Lud3/n0;->d:Lud3/v0;

    iget-object v1, p0, Lud3/o0;->e:Lv63/c;

    iput-object v1, v0, Lud3/n0;->e:Lv63/c;

    iget-object v1, p0, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v1}, Lud3/d0;->d()Lkotlin/jvm/internal/k0;

    move-result-object v1

    iput-object v1, v0, Lud3/n0;->c:Lkotlin/jvm/internal/k0;

    return-object v0
.end method

.method public final c(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lud3/o0;->e:Lv63/c;

    invoke-virtual {v1, p1}, Lv63/c;->d(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {v1}, Lud3/d0;->size()I

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, ", headers=["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_2

    check-cast v3, Ll83/k;

    iget-object v5, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    if-lez v2, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lwd3/f;->m(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v3, "\u2588\u2588"

    :cond_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v2, v4

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_3
    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    sget-object v1, Lwd3/a;->a:Lwd3/a;

    iget-object v2, p0, Lud3/o0;->e:Lv63/c;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_5
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
