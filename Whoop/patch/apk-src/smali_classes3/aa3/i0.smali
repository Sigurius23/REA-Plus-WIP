.class public final Laa3/i0;
.super Laa3/e0;
.source "SourceFile"


# instance fields
.field public final a:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-byte p1, p0, Laa3/i0;->a:B

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ll83/r;

    iget-byte v1, p0, Laa3/i0;->a:B

    invoke-direct {v0, v1}, Ll83/r;-><init>(B)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Laa3/i0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Laa3/i0;

    iget-byte v1, p0, Laa3/i0;->a:B

    iget-byte p1, p1, Laa3/i0;->a:B

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-byte v0, p0, Laa3/i0;->a:B

    invoke-static {v0}, Ljava/lang/Byte;->hashCode(B)I

    move-result v0

    return v0
.end method
