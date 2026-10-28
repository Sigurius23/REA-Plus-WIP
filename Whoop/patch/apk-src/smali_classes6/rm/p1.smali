.class public final Lrm/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# instance fields
.field public final w:Lsn/w0;

.field public final x:[I

.field public final y:I

.field public final z:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lsn/w0;[II[Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget v0, p1, Lsn/w0;->w:I

    array-length v1, p2

    if-ne v0, v1, :cond_0

    array-length v1, p4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->e(Z)V

    iput-object p1, p0, Lrm/p1;->w:Lsn/w0;

    invoke-virtual {p2}, [I->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    iput-object p1, p0, Lrm/p1;->x:[I

    iput p3, p0, Lrm/p1;->y:I

    invoke-virtual {p4}, [Z->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    iput-object p1, p0, Lrm/p1;->z:[Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lrm/p1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lrm/p1;

    iget v2, p0, Lrm/p1;->y:I

    iget v3, p1, Lrm/p1;->y:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lrm/p1;->w:Lsn/w0;

    iget-object v3, p1, Lrm/p1;->w:Lsn/w0;

    invoke-virtual {v2, v3}, Lsn/w0;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/p1;->x:[I

    iget-object v3, p1, Lrm/p1;->x:[I

    invoke-static {v2, v3}, Ljava/util/Arrays;->equals([I[I)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/p1;->z:[Z

    iget-object p1, p1, Lrm/p1;->z:[Z

    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Z[Z)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lrm/p1;->w:Lsn/w0;

    invoke-virtual {v0}, Lsn/w0;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lrm/p1;->x:[I

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lrm/p1;->y:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lrm/p1;->z:[Z

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
