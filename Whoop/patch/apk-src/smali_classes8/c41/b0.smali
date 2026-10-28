.class public abstract Lc41/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/b0$a;,
        Lc41/b0$b;,
        Lc41/b0$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u000b\u000f\u0010B9\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u000b\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u0012\u0010\u000eR\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000c\u001a\u0004\u0008\u000f\u0010\u000e\u0082\u0001\u0003\u0013\u0014\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lc41/b0;",
        "",
        "Ly3/f;",
        "tileHeight",
        "imageTileWidth",
        "paddingBetweenTileAndImage",
        "imageCornerRadius",
        "titleBarCornerRadius",
        "imageSize",
        "<init>",
        "(FFFFFF)V",
        "a",
        "F",
        "e",
        "()F",
        "b",
        "c",
        "d",
        "f",
        "Lc41/b0$a;",
        "Lc41/b0$b;",
        "Lc41/b0$c;",
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
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F


# direct methods
.method private constructor <init>(FFFFFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lc41/b0;->a:F

    .line 4
    iput p2, p0, Lc41/b0;->b:F

    .line 5
    iput p3, p0, Lc41/b0;->c:F

    .line 6
    iput p4, p0, Lc41/b0;->d:F

    .line 7
    iput p5, p0, Lc41/b0;->e:F

    .line 8
    iput p6, p0, Lc41/b0;->f:F

    return-void
.end method

.method public synthetic constructor <init>(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lc41/b0;-><init>(FFFFFF)V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget v0, p0, Lc41/b0;->d:F

    return v0
.end method

.method public final b()F
    .locals 1

    iget v0, p0, Lc41/b0;->f:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Lc41/b0;->b:F

    return v0
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Lc41/b0;->c:F

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lc41/b0;->a:F

    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lc41/b0;->e:F

    return v0
.end method
