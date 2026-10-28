.class public final Lrm/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final F:Lrm/h0;


# instance fields
.field public final E:F

.field public final w:J

.field public final x:J

.field public final y:J

.field public final z:F


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lrm/h0;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const v7, -0x800001

    move-wide v3, v1

    move-wide v5, v1

    move v8, v7

    invoke-direct/range {v0 .. v8}, Lrm/h0;-><init>(JJJFF)V

    sput-object v0, Lrm/h0;->F:Lrm/h0;

    return-void
.end method

.method public constructor <init>(JJJFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lrm/h0;->w:J

    iput-wide p3, p0, Lrm/h0;->x:J

    iput-wide p5, p0, Lrm/h0;->y:J

    iput p7, p0, Lrm/h0;->z:F

    iput p8, p0, Lrm/h0;->E:F

    return-void
.end method


# virtual methods
.method public final a()Lf9/t;
    .locals 3

    new-instance v0, Lf9/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-wide v1, p0, Lrm/h0;->w:J

    iput-wide v1, v0, Lf9/t;->a:J

    iget-wide v1, p0, Lrm/h0;->x:J

    iput-wide v1, v0, Lf9/t;->b:J

    iget-wide v1, p0, Lrm/h0;->y:J

    iput-wide v1, v0, Lf9/t;->c:J

    iget v1, p0, Lrm/h0;->z:F

    iput v1, v0, Lf9/t;->d:F

    iget v1, p0, Lrm/h0;->E:F

    iput v1, v0, Lf9/t;->e:F

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrm/h0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrm/h0;

    iget-wide v3, p0, Lrm/h0;->w:J

    iget-wide v5, p1, Lrm/h0;->w:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lrm/h0;->x:J

    iget-wide v5, p1, Lrm/h0;->x:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lrm/h0;->y:J

    iget-wide v5, p1, Lrm/h0;->y:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, Lrm/h0;->z:F

    iget v3, p1, Lrm/h0;->z:F

    cmpl-float v1, v1, v3

    if-nez v1, :cond_2

    iget v1, p0, Lrm/h0;->E:F

    iget p1, p1, Lrm/h0;->E:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    iget-wide v0, p0, Lrm/h0;->w:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lrm/h0;->x:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v1, v3

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lrm/h0;->y:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lrm/h0;->z:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lrm/h0;->E:F

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_1

    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    :cond_1
    add-int/2addr v0, v4

    return v0
.end method
