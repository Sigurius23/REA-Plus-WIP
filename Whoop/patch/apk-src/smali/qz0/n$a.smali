.class public final Lqz0/n$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0004\u001a\u0004\u0008\t\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "qz0/n$a",
        "Ly3/c;",
        "",
        "w",
        "F",
        "getDensity",
        "()F",
        "density",
        "x",
        "m0",
        "fontScale",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:F

.field private final x:F


# direct methods
.method public constructor <init>(Ly3/c;Ljava/lang/Float;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Ly3/c;->getDensity()F

    move-result v0

    iput v0, p0, Lqz0/n$a;->w:F

    invoke-interface {p1}, Ly3/c;->m0()F

    move-result p1

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Lqz0/n$a;->x:F

    return-void
.end method


# virtual methods
.method public bridge D0(J)J
    .locals 0

    invoke-super {p0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge F(F)I
    .locals 0

    invoke-super {p0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public bridge K(J)F
    .locals 0

    invoke-super {p0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public bridge e0(I)F
    .locals 0

    invoke-super {p0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public f0(F)F
    .locals 1

    invoke-interface {p0}, Ly3/c;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public getDensity()F
    .locals 1

    iget v0, p0, Lqz0/n$a;->w:F

    return v0
.end method

.method public bridge h(F)J
    .locals 2

    invoke-super {p0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge i(J)J
    .locals 0

    invoke-super {p0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public bridge l(J)F
    .locals 0

    invoke-super {p0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public m0()F
    .locals 1

    iget v0, p0, Lqz0/n$a;->x:F

    return v0
.end method

.method public bridge q(F)J
    .locals 2

    invoke-super {p0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public q0(F)F
    .locals 1

    invoke-interface {p0}, Ly3/c;->getDensity()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method
