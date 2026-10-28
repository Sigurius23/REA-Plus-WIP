.class public final Lah/b;
.super Lah/c;
.source "SourceFile"


# instance fields
.field public final d:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lah/c;-><init>(I)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lah/b;->d:[B

    return-void

    :cond_0
    iput-object p1, p0, Lah/b;->d:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lah/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/b;

    invoke-super {p0, p1}, Lah/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lah/b;->d:[B

    iget-object v0, v0, Lah/b;->d:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, Lah/c;->hashCode()I

    move-result v0

    iget-object v1, p0, Lah/b;->d:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
