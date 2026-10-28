.class public final Ld/n0;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:Ld/f1;


# direct methods
.method public constructor <init>(Ld/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/n0;->a:Ld/f1;

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/n0;->a:Ld/f1;

    invoke-virtual {v0, p1}, Ld/f1;->c(Z)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    const/4 v0, 0x7

    invoke-virtual {p1, v0, p2}, Lro/i;->n(IZ)V

    iget-object p2, p0, Ld/n0;->a:Ld/f1;

    iget-object p2, p2, Ld/f1;->a:[B

    const/16 v0, 0x19

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/n0;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/n0;

    iget-object v0, p0, Ld/n0;->a:Ld/f1;

    iget-object p1, p1, Ld/n0;->a:Ld/f1;

    invoke-virtual {v0, p1}, Ld/f1;->g(Ld/b1;)Z

    move-result p1

    return p1
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ld/n0;->a:Ld/f1;

    iget-object v0, v0, Ld/f1;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    not-int v0, v0

    return v0
.end method

.method public final j()Ld/b1;
    .locals 1

    iget-object v0, p0, Ld/n0;->a:Ld/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method

.method public final k()Ld/b1;
    .locals 1

    iget-object v0, p0, Ld/n0;->a:Ld/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p0
.end method
