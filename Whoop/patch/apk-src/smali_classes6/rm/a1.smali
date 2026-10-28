.class public final Lrm/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/f;


# instance fields
.field public final E:I

.field public final F:J

.field public final G:J

.field public final H:I

.field public final I:I

.field public final w:Ljava/lang/Object;

.field public final x:I

.field public final y:Lrm/k0;

.field public final z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;ILrm/k0;Ljava/lang/Object;IJJII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/a1;->w:Ljava/lang/Object;

    iput p2, p0, Lrm/a1;->x:I

    iput-object p3, p0, Lrm/a1;->y:Lrm/k0;

    iput-object p4, p0, Lrm/a1;->z:Ljava/lang/Object;

    iput p5, p0, Lrm/a1;->E:I

    iput-wide p6, p0, Lrm/a1;->F:J

    iput-wide p8, p0, Lrm/a1;->G:J

    iput p10, p0, Lrm/a1;->H:I

    iput p11, p0, Lrm/a1;->I:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    const-class v2, Lrm/a1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lrm/a1;

    iget v2, p0, Lrm/a1;->x:I

    iget v3, p1, Lrm/a1;->x:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lrm/a1;->E:I

    iget v3, p1, Lrm/a1;->E:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Lrm/a1;->F:J

    iget-wide v4, p1, Lrm/a1;->F:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget-wide v2, p0, Lrm/a1;->G:J

    iget-wide v4, p1, Lrm/a1;->G:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    iget v2, p0, Lrm/a1;->H:I

    iget v3, p1, Lrm/a1;->H:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Lrm/a1;->I:I

    iget v3, p1, Lrm/a1;->I:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lrm/a1;->w:Ljava/lang/Object;

    iget-object v3, p1, Lrm/a1;->w:Ljava/lang/Object;

    invoke-static {v2, v3}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/a1;->z:Ljava/lang/Object;

    iget-object v3, p1, Lrm/a1;->z:Ljava/lang/Object;

    invoke-static {v2, v3}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lrm/a1;->y:Lrm/k0;

    iget-object p1, p1, Lrm/a1;->y:Lrm/k0;

    invoke-static {v2, p1}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 10

    iget v0, p0, Lrm/a1;->x:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v0, p0, Lrm/a1;->E:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-wide v0, p0, Lrm/a1;->F:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    iget-wide v0, p0, Lrm/a1;->G:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    iget v0, p0, Lrm/a1;->H:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    iget v0, p0, Lrm/a1;->I:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    iget-object v1, p0, Lrm/a1;->w:Ljava/lang/Object;

    iget-object v3, p0, Lrm/a1;->y:Lrm/k0;

    iget-object v4, p0, Lrm/a1;->z:Ljava/lang/Object;

    filled-new-array/range {v1 .. v9}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
