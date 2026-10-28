.class public final Ld0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/l;


# instance fields
.field public final a:Ld0/l;

.field public final b:J


# direct methods
.method public constructor <init>(Ld0/c0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/j1;->a:Ld0/l;

    iput-wide p2, p0, Ld0/j1;->b:J

    return-void
.end method


# virtual methods
.method public final a(Ld0/f2;)Ld0/g2;
    .locals 3

    iget-object v0, p0, Ld0/j1;->a:Ld0/l;

    invoke-interface {v0, p1}, Ld0/l;->a(Ld0/f2;)Ld0/g2;

    move-result-object p1

    new-instance v0, Ld0/k1;

    iget-wide v1, p0, Ld0/j1;->b:J

    invoke-direct {v0, p1, v1, v2}, Ld0/k1;-><init>(Ld0/g2;J)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Ld0/j1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Ld0/j1;

    iget-wide v2, p1, Ld0/j1;->b:J

    iget-wide v4, p0, Ld0/j1;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-object p1, p1, Ld0/j1;->a:Ld0/l;

    iget-object v0, p0, Ld0/j1;->a:Ld0/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Ld0/j1;->a:Ld0/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Ld0/j1;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
