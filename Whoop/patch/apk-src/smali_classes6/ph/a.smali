.class public final Lph/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/e;


# instance fields
.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/16 p1, 0x64

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lph/a;->b:I

    if-lez p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lch/j;Lmh/k;)Lph/f;
    .locals 2

    instance-of v0, p2, Lmh/o;

    if-nez v0, :cond_0

    new-instance v0, Lph/d;

    invoke-direct {v0, p1, p2}, Lph/d;-><init>(Lch/j;Lmh/k;)V

    return-object v0

    :cond_0
    move-object v0, p2

    check-cast v0, Lmh/o;

    iget-object v0, v0, Lmh/o;->c:Ldh/g;

    sget-object v1, Ldh/g;->w:Ldh/g;

    if-ne v0, v1, :cond_1

    new-instance v0, Lph/d;

    invoke-direct {v0, p1, p2}, Lph/d;-><init>(Lch/j;Lmh/k;)V

    return-object v0

    :cond_1
    new-instance v0, Lph/b;

    iget v1, p0, Lph/a;->b:I

    invoke-direct {v0, p1, p2, v1}, Lph/b;-><init>(Lch/j;Lmh/k;I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lph/a;

    if-eqz v1, :cond_1

    check-cast p1, Lph/a;

    iget p1, p1, Lph/a;->b:I

    iget v1, p0, Lph/a;->b:I

    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lph/a;->b:I

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
