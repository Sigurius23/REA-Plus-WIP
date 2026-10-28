.class public final Lb51/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb51/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0011\"\u0004\u0008\u0015\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u0010\u001a\u0004\u0008\u0016\u0010\u0011\"\u0004\u0008\u0017\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0010\u001a\u0004\u0008\u0019\u0010\u0011\"\u0004\u0008\u001a\u0010\u0013\u00a8\u0006\u001b"
    }
    d2 = {
        "Lb51/b;",
        "Lb51/a;",
        "",
        "x",
        "y",
        "width",
        "height",
        "<init>",
        "(FFFF)V",
        "",
        "px",
        "py",
        "",
        "c",
        "(II)Z",
        "a",
        "F",
        "()F",
        "setX",
        "(F)V",
        "b",
        "setY",
        "getWidth",
        "setWidth",
        "d",
        "getHeight",
        "setHeight",
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
.field private a:F

.field private b:F

.field private c:F

.field private d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lb51/b;->a:F

    .line 3
    iput p2, p0, Lb51/b;->b:F

    .line 4
    iput p3, p0, Lb51/b;->c:F

    .line 5
    iput p4, p0, Lb51/b;->d:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lb51/b;-><init>(FFFF)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lb51/b;->a:F

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lb51/b;->b:F

    return v0
.end method

.method public c(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lb51/a;->c(II)Z

    move-result p1

    return p1
.end method

.method public getHeight()F
    .locals 1

    iget v0, p0, Lb51/b;->d:F

    return v0
.end method

.method public getWidth()F
    .locals 1

    iget v0, p0, Lb51/b;->c:F

    return v0
.end method
