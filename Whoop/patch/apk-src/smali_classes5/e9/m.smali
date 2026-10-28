.class public final Le9/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/z0;


# instance fields
.field public E:Lf9/g;

.field public F:Z

.field public G:I

.field public H:J

.field public final w:Lu8/p;

.field public final x:Lea/b;

.field public y:[J

.field public z:Z


# direct methods
.method public constructor <init>(Lf9/g;Lu8/p;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le9/m;->w:Lu8/p;

    iput-object p1, p0, Le9/m;->E:Lf9/g;

    new-instance p2, Lea/b;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lea/b;-><init>(I)V

    iput-object p2, p0, Le9/m;->x:Lea/b;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Le9/m;->H:J

    iget-object p2, p1, Lf9/g;->b:[J

    iput-object p2, p0, Le9/m;->y:[J

    invoke-virtual {p0, p1, p3}, Le9/m;->a(Lf9/g;Z)V

    return-void
.end method


# virtual methods
.method public final a(Lf9/g;Z)V
    .locals 8

    iget v0, p0, Le9/m;->G:I

    const/4 v1, 0x1

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    iget-object v4, p0, Le9/m;->y:[J

    sub-int/2addr v0, v1

    aget-wide v4, v4, v0

    :goto_0
    iput-boolean p2, p0, Le9/m;->z:Z

    iput-object p1, p0, Le9/m;->E:Lf9/g;

    iget-object p1, p1, Lf9/g;->b:[J

    iput-object p1, p0, Le9/m;->y:[J

    iget-wide v6, p0, Le9/m;->H:J

    cmp-long p2, v6, v2

    if-eqz p2, :cond_2

    invoke-static {p1, v6, v7, v1}, Lx8/t;->a([JJZ)I

    move-result p1

    iput p1, p0, Le9/m;->G:I

    iget-boolean p2, p0, Le9/m;->z:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Le9/m;->y:[J

    array-length p2, p2

    if-ne p1, p2, :cond_1

    move-wide v2, v6

    :cond_1
    iput-wide v2, p0, Le9/m;->H:J

    return-void

    :cond_2
    cmp-long p2, v4, v2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    invoke-static {p1, v4, v5, p2}, Lx8/t;->a([JJZ)I

    move-result p1

    iput p1, p0, Le9/m;->G:I

    :cond_3
    return-void
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final j(J)I
    .locals 3

    iget v0, p0, Le9/m;->G:I

    iget-object v1, p0, Le9/m;->y:[J

    const/4 v2, 0x1

    invoke-static {v1, p1, p2, v2}, Lx8/t;->a([JJZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Le9/m;->G:I

    sub-int p2, p1, p2

    iput p1, p0, Le9/m;->G:I

    return p2
.end method

.method public final l(Lqg3/d;La9/e;I)I
    .locals 6

    iget v0, p0, Le9/m;->G:I

    iget-object v1, p0, Le9/m;->y:[J

    array-length v1, v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, -0x4

    const/4 v4, 0x4

    if-eqz v1, :cond_1

    iget-boolean v5, p0, Le9/m;->z:Z

    if-nez v5, :cond_1

    iput v4, p2, La9/a;->x:I

    return v3

    :cond_1
    and-int/lit8 v5, p3, 0x2

    if-nez v5, :cond_6

    iget-boolean v5, p0, Le9/m;->F:Z

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p1, -0x3

    return p1

    :cond_3
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_4

    add-int/lit8 p1, v0, 0x1

    iput p1, p0, Le9/m;->G:I

    :cond_4
    and-int/lit8 p1, p3, 0x4

    if-nez p1, :cond_5

    iget-object p1, p0, Le9/m;->E:Lf9/g;

    iget-object p1, p1, Lf9/g;->a:[Lea/a;

    aget-object p1, p1, v0

    iget-object p3, p0, Le9/m;->x:Lea/b;

    invoke-virtual {p3, p1}, Lea/b;->a(Lea/a;)[B

    move-result-object p1

    array-length p3, p1

    invoke-virtual {p2, p3}, La9/e;->q(I)V

    iget-object p3, p2, La9/e;->E:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_5
    iget-object p1, p0, Le9/m;->y:[J

    aget-wide v0, p1, v0

    iput-wide v0, p2, La9/e;->G:J

    iput v2, p2, La9/a;->x:I

    return v3

    :cond_6
    :goto_1
    iget-object p2, p0, Le9/m;->w:Lu8/p;

    iput-object p2, p1, Lqg3/d;->y:Ljava/lang/Object;

    iput-boolean v2, p0, Le9/m;->F:Z

    const/4 p1, -0x5

    return p1
.end method
