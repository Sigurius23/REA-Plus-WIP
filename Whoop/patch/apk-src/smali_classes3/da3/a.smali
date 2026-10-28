.class public final Lda3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# instance fields
.field public final w:I

.field public final x:I

.field public final y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lda3/a;

    sget-object v1, Lsa3/e;->g:Lsa3/e;

    iget-object v1, v1, Lsa3/a;->a:[I

    invoke-direct {v0, v1}, Lda3/a;-><init>([I)V

    new-instance v0, Lda3/a;

    sget-object v1, Lsa3/e;->h:Lsa3/e;

    iget-object v1, v1, Lsa3/a;->a:[I

    invoke-direct {v0, v1}, Lda3/a;-><init>([I)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lda3/a;->w:I

    iput p2, p0, Lda3/a;->x:I

    iput p3, p0, Lda3/a;->y:I

    if-ltz p1, :cond_2

    if-ltz p2, :cond_1

    if-ltz p3, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Patch version should be not less than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Minor version should be not less than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 4
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Major version should be not less than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>([I)V
    .locals 3

    const-string v0, "intArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 5
    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    const/4 v2, 0x2

    aget p1, p1, v2

    invoke-direct {p0, v0, v1, p1}, Lda3/a;-><init>(III)V

    return-void
.end method


# virtual methods
.method public final a(Lda3/a;)I
    .locals 2

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lda3/a;->w:I

    iget v1, p1, Lda3/a;->w:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget v0, p0, Lda3/a;->x:I

    iget v1, p1, Lda3/a;->x:I

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    iget v0, p0, Lda3/a;->y:I

    iget p1, p1, Lda3/a;->y:I

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lda3/a;

    invoke-virtual {p0, p1}, Lda3/a;->a(Lda3/a;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lda3/a;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type kotlin.metadata.jvm.JvmMetadataVersion"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lda3/a;

    iget v1, p0, Lda3/a;->w:I

    iget v3, p1, Lda3/a;->w:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lda3/a;->x:I

    iget v3, p1, Lda3/a;->x:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lda3/a;->y:I

    iget p1, p1, Lda3/a;->y:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lda3/a;->w:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lda3/a;->x:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lda3/a;->y:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lda3/a;->w:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lda3/a;->x:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, Lda3/a;->y:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
