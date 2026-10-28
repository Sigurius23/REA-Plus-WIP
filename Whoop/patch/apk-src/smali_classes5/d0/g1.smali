.class public final Ld0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/y;


# instance fields
.field public final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld0/g1;->a:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ld0/f2;)Ld0/g2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ld0/g1;->a(Ld0/f2;)Ld0/i2;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ld0/f2;)Ld0/i2;
    .locals 2

    .line 2
    new-instance p1, Ld0/o2;

    iget v0, p0, Ld0/g1;->a:I

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ld0/o2;-><init>(II)V

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ld0/g1;

    if-eqz v0, :cond_0

    check-cast p1, Ld0/g1;

    iget p1, p1, Ld0/g1;->a:I

    iget v0, p0, Ld0/g1;->a:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Ld0/g1;->a:I

    return v0
.end method
