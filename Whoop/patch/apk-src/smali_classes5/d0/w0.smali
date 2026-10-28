.class public final Ld0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c0;


# instance fields
.field public final a:Ld0/e2;

.field public final b:Ld0/v0;

.field public final c:J


# direct methods
.method public constructor <init>(Ld0/e2;Ld0/v0;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/w0;->a:Ld0/e2;

    iput-object p2, p0, Ld0/w0;->b:Ld0/v0;

    iput-wide p3, p0, Ld0/w0;->c:J

    return-void
.end method


# virtual methods
.method public final a(Ld0/f2;)Ld0/g2;
    .locals 4

    new-instance v0, Lai/h;

    iget-object v1, p0, Ld0/w0;->a:Ld0/e2;

    invoke-virtual {v1, p1}, Ld0/e2;->a(Ld0/f2;)Ld0/i2;

    move-result-object p1

    iget-object v1, p0, Ld0/w0;->b:Ld0/v0;

    iget-wide v2, p0, Ld0/w0;->c:J

    invoke-direct {v0, p1, v1, v2, v3}, Lai/h;-><init>(Ld0/i2;Ld0/v0;J)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Ld0/w0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ld0/w0;

    iget-object v0, p1, Ld0/w0;->a:Ld0/e2;

    iget-object v2, p0, Ld0/w0;->a:Ld0/e2;

    invoke-virtual {v0, v2}, Ld0/e2;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Ld0/w0;->b:Ld0/v0;

    iget-object v2, p0, Ld0/w0;->b:Ld0/v0;

    if-ne v0, v2, :cond_0

    iget-wide v2, p1, Ld0/w0;->c:J

    iget-wide v4, p0, Ld0/w0;->c:J

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Ld0/w0;->a:Ld0/e2;

    invoke-virtual {v0}, Ld0/e2;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0xd9

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ld0/w0;->b:Ld0/v0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v2, p0, Ld0/w0;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
