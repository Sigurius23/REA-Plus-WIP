.class public final Lp0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/t2;


# instance fields
.field public final w:I

.field public final x:I

.field public final y:Lp1/k1;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(III)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lp0/f0;->w:I

    iput p3, p0, Lp0/f0;->x:I

    div-int v0, p1, p2

    mul-int/2addr v0, p2

    sub-int v1, v0, p3

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v0, p2

    add-int/2addr v0, p3

    invoke-static {v1, v0}, Le93/b;->i0(II)Li93/j;

    move-result-object p2

    sget-object p3, Lp1/v0;->F:Lp1/v0;

    new-instance v0, Lp1/k1;

    invoke-direct {v0, p2, p3}, Lp1/k1;-><init>(Ljava/lang/Object;Lp1/o2;)V

    iput-object v0, p0, Lp0/f0;->y:Lp1/k1;

    iput p1, p0, Lp0/f0;->z:I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 4

    iget v0, p0, Lp0/f0;->z:I

    if-eq p1, v0, :cond_0

    iput p1, p0, Lp0/f0;->z:I

    iget v0, p0, Lp0/f0;->w:I

    div-int/2addr p1, v0

    mul-int/2addr p1, v0

    iget v1, p0, Lp0/f0;->x:I

    sub-int v2, p1, v1

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr p1, v0

    add-int/2addr p1, v1

    invoke-static {v2, p1}, Le93/b;->i0(II)Li93/j;

    move-result-object p1

    iget-object v0, p0, Lp0/f0;->y:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/f0;->y:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li93/j;

    return-object v0
.end method
