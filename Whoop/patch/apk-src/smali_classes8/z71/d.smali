.class public abstract Lz71/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000f\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0002\u001a\u0004\u0008\t\u0010\u0004\"\u001a\u0010\u000c\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\u00a8\u0006\u000f"
    }
    d2 = {
        "Ly3/f;",
        "a",
        "F",
        "d",
        "()F",
        "HIGHLIGHT_HEAD_STROKE",
        "b",
        "BORDER_STROKE",
        "c",
        "f",
        "OVERLAY_STROKE",
        "e",
        "METER_CANVAS_SIZE",
        "HIGHLIGHT_HEAD_CANVAS_SIZE",
        "HIGHLIGHT_BODY_CANVAS_SIZE",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Lz71/d;->a:F

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lz71/d;->b:F

    const/16 v0, 0xe

    int-to-float v0, v0

    sput v0, Lz71/d;->c:F

    const-wide v0, 0x406db99999999999L    # 237.79999999999998

    double-to-float v0, v0

    sput v0, Lz71/d;->d:F

    const-wide v0, 0x406ebfffffffffffL    # 245.99999999999997

    double-to-float v0, v0

    sput v0, Lz71/d;->e:F

    const-wide v0, 0x406d366666666666L    # 233.7

    double-to-float v0, v0

    sput v0, Lz71/d;->f:F

    return-void
.end method

.method public static final a()F
    .locals 1

    sget v0, Lz71/d;->b:F

    return v0
.end method

.method public static final b()F
    .locals 1

    sget v0, Lz71/d;->f:F

    return v0
.end method

.method public static final c()F
    .locals 1

    sget v0, Lz71/d;->e:F

    return v0
.end method

.method public static final d()F
    .locals 1

    sget v0, Lz71/d;->a:F

    return v0
.end method

.method public static final e()F
    .locals 1

    sget v0, Lz71/d;->d:F

    return v0
.end method

.method public static final f()F
    .locals 1

    sget v0, Lz71/d;->c:F

    return v0
.end method
