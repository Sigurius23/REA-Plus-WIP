.class public final Lh4/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[I

.field public b:[I

.field public c:I

.field public d:[I

.field public e:[F

.field public f:I

.field public g:[I

.field public h:[Ljava/lang/String;

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v1, v0, [I

    iput-object v1, p0, Lh4/b;->a:[I

    new-array v1, v0, [I

    iput-object v1, p0, Lh4/b;->b:[I

    const/4 v1, 0x0

    iput v1, p0, Lh4/b;->c:I

    new-array v2, v0, [I

    iput-object v2, p0, Lh4/b;->d:[I

    new-array v0, v0, [F

    iput-object v0, p0, Lh4/b;->e:[F

    iput v1, p0, Lh4/b;->f:I

    const/4 v0, 0x5

    new-array v2, v0, [I

    iput-object v2, p0, Lh4/b;->g:[I

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lh4/b;->h:[Ljava/lang/String;

    iput v1, p0, Lh4/b;->i:I

    return-void
.end method


# virtual methods
.method public final a(FI)V
    .locals 3

    iget v0, p0, Lh4/b;->f:I

    iget-object v1, p0, Lh4/b;->d:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lh4/b;->d:[I

    iget-object v0, p0, Lh4/b;->e:[F

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v0

    iput-object v0, p0, Lh4/b;->e:[F

    :cond_0
    iget-object v0, p0, Lh4/b;->d:[I

    iget v1, p0, Lh4/b;->f:I

    aput p2, v0, v1

    iget-object p2, p0, Lh4/b;->e:[F

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh4/b;->f:I

    aput p1, p2, v1

    return-void
.end method

.method public final b(II)V
    .locals 3

    iget v0, p0, Lh4/b;->c:I

    iget-object v1, p0, Lh4/b;->a:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lh4/b;->a:[I

    iget-object v0, p0, Lh4/b;->b:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lh4/b;->b:[I

    :cond_0
    iget-object v0, p0, Lh4/b;->a:[I

    iget v1, p0, Lh4/b;->c:I

    aput p1, v0, v1

    iget-object p1, p0, Lh4/b;->b:[I

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh4/b;->c:I

    aput p2, p1, v1

    return-void
.end method

.method public final c(ILjava/lang/String;)V
    .locals 3

    iget v0, p0, Lh4/b;->i:I

    iget-object v1, p0, Lh4/b;->g:[I

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lh4/b;->g:[I

    iget-object v0, p0, Lh4/b;->h:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lh4/b;->h:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lh4/b;->g:[I

    iget v1, p0, Lh4/b;->i:I

    aput p1, v0, v1

    iget-object p1, p0, Lh4/b;->h:[Ljava/lang/String;

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Lh4/b;->i:I

    aput-object p2, p1, v1

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TypedBundle{mCountInt="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lh4/b;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCountFloat="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh4/b;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCountString="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh4/b;->i:I

    const-string v2, ", mCountBoolean=0}"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
