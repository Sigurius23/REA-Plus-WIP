.class public final Lzr/z0;
.super Lzr/j0;
.source "SourceFile"


# instance fields
.field public final transient E:Lzr/a1;

.field public final transient z:Lzr/b1;


# direct methods
.method public constructor <init>(Lzr/b1;Lzr/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lzr/z0;->z:Lzr/b1;

    iput-object p2, p0, Lzr/z0;->E:Lzr/a1;

    return-void
.end method


# virtual methods
.method public final a()Lzr/g0;
    .locals 1

    iget-object v0, p0, Lzr/z0;->E:Lzr/a1;

    return-object v0
.end method

.method public final c(I[Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lzr/z0;->E:Lzr/a1;

    invoke-virtual {v0, p1, p2}, Lzr/g0;->c(I[Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lzr/z0;->z:Lzr/b1;

    invoke-virtual {v0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o()Lzr/k1;
    .locals 2

    iget-object v0, p0, Lzr/z0;->E:Lzr/a1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lzr/g0;->o(I)Lzr/e0;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lzr/z0;->z:Lzr/b1;

    iget v0, v0, Lzr/b1;->F:I

    return v0
.end method
