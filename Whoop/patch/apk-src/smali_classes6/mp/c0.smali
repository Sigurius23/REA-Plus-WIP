.class public final Lmp/c0;
.super Lmp/p;
.source "SourceFile"


# instance fields
.field public final transient z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lmp/c0;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)I
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lmp/c0;->z:Ljava/lang/Object;

    aput-object v1, p1, v0

    const/4 p1, 0x1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lmp/c0;->z:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e()Lmp/e0;
    .locals 2

    new-instance v0, Lmp/u;

    iget-object v1, p0, Lmp/c0;->z:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lmp/u;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lmp/c0;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lmp/u;

    iget-object v1, p0, Lmp/c0;->z:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lmp/u;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final l()Lmp/n;
    .locals 3

    iget-object v0, p0, Lmp/c0;->z:Ljava/lang/Object;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x1

    if-ge v1, v2, :cond_1

    sget-object v2, Lmp/n;->x:Lmp/j;

    aget-object v2, v0, v1

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "at index "

    invoke-static {v1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v2, v0}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lmp/c0;->z:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "["

    const-string v2, "]"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
