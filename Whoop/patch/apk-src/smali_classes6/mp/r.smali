.class public final Lmp/r;
.super Lmp/p;
.source "SourceFile"


# instance fields
.field public final synthetic z:Lmp/s;


# direct methods
.method public constructor <init>(Lmp/s;)V
    .locals 0

    iput-object p1, p0, Lmp/r;->z:Lmp/s;

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    iget-object v0, p0, Lmp/r;->z:Lmp/s;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmp/s;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final e()Lmp/e0;
    .locals 2

    invoke-virtual {p0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmp/n;->n(I)Lmp/j;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lmp/r;->z:Lmp/s;

    invoke-virtual {v0}, Lmp/o;->a()Lmp/p;

    move-result-object v0

    invoke-static {v0}, Lmp/b;->b(Lmp/p;)I

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lmp/n;->n(I)Lmp/j;

    move-result-object v0

    return-object v0
.end method

.method public final m()Lmp/n;
    .locals 1

    new-instance v0, Lmp/q;

    invoke-direct {v0, p0}, Lmp/q;-><init>(Lmp/r;)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lmp/r;->z:Lmp/s;

    iget-object v0, v0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
