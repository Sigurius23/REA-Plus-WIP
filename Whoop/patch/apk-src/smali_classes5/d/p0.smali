.class public final Ld/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ls30/e;->e([B)I

    move-result v0

    iput v0, p0, Ld/p0;->a:I

    iput-object p1, p0, Ld/p0;->b:[B

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ld/p0;

    if-eqz v0, :cond_0

    check-cast p1, Ld/p0;

    iget-object p1, p1, Ld/p0;->b:[B

    iget-object v0, p0, Ld/p0;->b:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ld/p0;->a:I

    return v0
.end method
