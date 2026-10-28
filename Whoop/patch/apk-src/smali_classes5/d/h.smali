.class public final Ld/h;
.super Ld/b1;
.source "SourceFile"


# instance fields
.field public final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/h;->a:[B

    return-void
.end method


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/h;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/h;->a:[B

    const/16 v1, 0x12

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final g(Ld/b1;)Z
    .locals 1

    instance-of v0, p1, Ld/h;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ld/h;

    iget-object v0, p0, Ld/h;->a:[B

    iget-object p1, p1, Ld/h;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ld/h;->a:[B

    invoke-static {v0}, Ls30/e;->e([B)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ld/h;->a:[B

    invoke-static {v0}, Lwg/c;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
