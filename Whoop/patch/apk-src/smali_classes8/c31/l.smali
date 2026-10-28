.class public abstract Lc31/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u0017\u0010\u0008\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0004\u00a8\u0006\t"
    }
    d2 = {
        "Ly3/f;",
        "a",
        "F",
        "b",
        "()F",
        "CIRCLE_SIZE",
        "CIRCLE_RADIUS",
        "c",
        "STROKE_WIDTH",
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


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x48

    int-to-float v0, v0

    sput v0, Lc31/l;->a:F

    const/16 v0, 0x24

    int-to-float v0, v0

    sput v0, Lc31/l;->b:F

    const/4 v0, 0x6

    int-to-float v0, v0

    sput v0, Lc31/l;->c:F

    return-void
.end method

.method public static final a()F
    .locals 1

    sget v0, Lc31/l;->b:F

    return v0
.end method

.method public static final b()F
    .locals 1

    sget v0, Lc31/l;->a:F

    return v0
.end method

.method public static final c()F
    .locals 1

    sget v0, Lc31/l;->c:F

    return v0
.end method
