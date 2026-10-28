.class public abstract Lrm/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# static fields
.field public static final F:Lqa/b;


# instance fields
.field public final E:Z

.field public final w:J

.field public final x:J

.field public final y:Z

.field public final z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrm/e0;

    invoke-direct {v0}, Lrm/e0;-><init>()V

    invoke-virtual {v0}, Lrm/e0;->a()Lrm/g0;

    new-instance v0, Lqa/b;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lqa/b;-><init>(I)V

    sput-object v0, Lrm/f0;->F:Lqa/b;

    return-void
.end method

.method public constructor <init>(Lrm/e0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Lrm/e0;->a:J

    iput-wide v0, p0, Lrm/f0;->w:J

    iget-wide v0, p1, Lrm/e0;->b:J

    iput-wide v0, p0, Lrm/f0;->x:J

    iget-boolean v0, p1, Lrm/e0;->c:Z

    iput-boolean v0, p0, Lrm/f0;->y:Z

    iget-boolean v0, p1, Lrm/e0;->d:Z

    iput-boolean v0, p0, Lrm/f0;->z:Z

    iget-boolean p1, p1, Lrm/e0;->e:Z

    iput-boolean p1, p0, Lrm/f0;->E:Z

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lrm/f0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lrm/f0;

    iget-wide v3, p0, Lrm/f0;->w:J

    iget-wide v5, p1, Lrm/f0;->w:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Lrm/f0;->x:J

    iget-wide v5, p1, Lrm/f0;->x:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lrm/f0;->y:Z

    iget-boolean v3, p1, Lrm/f0;->y:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lrm/f0;->z:Z

    iget-boolean v3, p1, Lrm/f0;->z:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Lrm/f0;->E:Z

    iget-boolean p1, p1, Lrm/f0;->E:Z

    if-ne v1, p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 5

    iget-wide v0, p0, Lrm/f0;->w:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v0, v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v3, p0, Lrm/f0;->x:J

    ushr-long v1, v3, v2

    xor-long/2addr v1, v3

    long-to-int v1, v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lrm/f0;->y:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lrm/f0;->z:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lrm/f0;->E:Z

    add-int/2addr v0, v1

    return v0
.end method
