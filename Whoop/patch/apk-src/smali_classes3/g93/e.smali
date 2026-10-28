.class public final Lg93/e;
.super Lg93/d;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public E:I

.field public F:I

.field public G:I

.field public H:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(II)V
    .locals 3

    not-int v0, p1

    shl-int/lit8 v1, p1, 0xa

    ushr-int/lit8 v2, p2, 0x4

    xor-int/2addr v1, v2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg93/e;->y:I

    iput p2, p0, Lg93/e;->z:I

    const/4 v2, 0x0

    iput v2, p0, Lg93/e;->E:I

    iput v2, p0, Lg93/e;->F:I

    iput v0, p0, Lg93/e;->G:I

    iput v1, p0, Lg93/e;->H:I

    or-int/2addr p1, p2

    or-int/2addr p1, v0

    if-eqz p1, :cond_1

    :goto_0
    const/16 p1, 0x40

    if-ge v2, p1, :cond_0

    invoke-virtual {p0}, Lg93/e;->f()I

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Initial state must have at least one non-zero element."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    invoke-virtual {p0}, Lg93/e;->f()I

    move-result v0

    invoke-static {v0, p1}, Lo73/a;->a0(II)I

    move-result p1

    return p1
.end method

.method public final f()I
    .locals 3

    iget v0, p0, Lg93/e;->y:I

    ushr-int/lit8 v1, v0, 0x2

    xor-int/2addr v0, v1

    iget v1, p0, Lg93/e;->z:I

    iput v1, p0, Lg93/e;->y:I

    iget v1, p0, Lg93/e;->E:I

    iput v1, p0, Lg93/e;->z:I

    iget v1, p0, Lg93/e;->F:I

    iput v1, p0, Lg93/e;->E:I

    iget v1, p0, Lg93/e;->G:I

    iput v1, p0, Lg93/e;->F:I

    shl-int/lit8 v2, v0, 0x1

    xor-int/2addr v0, v2

    xor-int/2addr v0, v1

    shl-int/lit8 v1, v1, 0x4

    xor-int/2addr v0, v1

    iput v0, p0, Lg93/e;->G:I

    iget v1, p0, Lg93/e;->H:I

    const v2, 0x587c5

    add-int/2addr v1, v2

    iput v1, p0, Lg93/e;->H:I

    add-int/2addr v0, v1

    return v0
.end method
