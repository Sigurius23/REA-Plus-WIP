.class public abstract Lah/c;
.super Lah/d;
.source "SourceFile"


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, Lah/d;-><init>(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lah/c;->c:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lah/c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lah/c;

    invoke-super {p0, p1}, Lah/d;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lah/c;->c:Z

    iget-boolean v0, v0, Lah/c;->c:Z

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 2

    invoke-super {p0}, Lah/d;->hashCode()I

    move-result v0

    iget-boolean v1, p0, Lah/c;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method
