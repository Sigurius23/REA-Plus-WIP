.class public final Lhc3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/f2;


# instance fields
.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/ThreadLocal;

.field public final y:Lhc3/a0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc3/z;->w:Ljava/lang/Object;

    iput-object p2, p0, Lhc3/z;->x:Ljava/lang/ThreadLocal;

    new-instance p1, Lhc3/a0;

    invoke-direct {p1, p2}, Lhc3/a0;-><init>(Ljava/lang/ThreadLocal;)V

    iput-object p1, p0, Lhc3/z;->y:Lhc3/a0;

    return-void
.end method


# virtual methods
.method public final J(Lq83/j;)Ljava/lang/Object;
    .locals 2

    iget-object p1, p0, Lhc3/z;->x:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lhc3/z;->w:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    iget-object v0, p0, Lhc3/z;->y:Lhc3/a0;

    invoke-virtual {v0, p1}, Lhc3/a0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    iget-object v0, p0, Lhc3/z;->y:Lhc3/a0;

    return-object v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    iget-object v0, p0, Lhc3/z;->y:Lhc3/a0;

    invoke-virtual {v0, p1}, Lhc3/a0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lq83/k;->w:Lq83/k;

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ThreadLocal(value="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhc3/z;->w:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", threadLocal = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lhc3/z;->x:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x(Lq83/j;Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lhc3/z;->x:Ljava/lang/ThreadLocal;

    invoke-virtual {p1, p2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
