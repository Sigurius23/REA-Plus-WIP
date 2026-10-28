.class final Ld01/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0008R\u0017\u0010\u0014\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0006\u001a\u0004\u0008\u0013\u0010\u0008R\u0017\u0010\u0015\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0008R\u0017\u0010\u0016\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0006\u001a\u0004\u0008\u0012\u0010\u0008R\u0017\u0010\u0018\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0006\u001a\u0004\u0008\u0017\u0010\u0008R\u0017\u0010\u0019\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u001a\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u001d\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0006\u001a\u0004\u0008\u001c\u0010\u0008\u00a8\u0006\u001e"
    }
    d2 = {
        "Ld01/b;",
        "",
        "<init>",
        "()V",
        "Ly3/f;",
        "b",
        "F",
        "g",
        "()F",
        "minHeightDp",
        "c",
        "d",
        "horizontalPadding",
        "k",
        "verticalPadding",
        "e",
        "h",
        "rowSpacing",
        "f",
        "i",
        "titleSubtitleSpacing",
        "leadingIconSize",
        "leadingImageSize",
        "j",
        "trailingIconSize",
        "avatarStackDiameter",
        "avatarStackOverlap",
        "l",
        "a",
        "avatarStackBorder",
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


# static fields
.field public static final a:Ld01/b;

.field private static final b:F

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field private static final i:F

.field private static final j:F

.field private static final k:F

.field private static final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Ld01/b;

    invoke-direct {v0}, Ld01/b;-><init>()V

    sput-object v0, Ld01/b;->a:Ld01/b;

    const/16 v0, 0x3c

    int-to-float v0, v0

    sput v0, Ld01/b;->b:F

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Ld01/b;->c:F

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v2

    mul-float v2, v0, v1

    sput v2, Ld01/b;->d:F

    const/4 v2, 0x3

    int-to-float v2, v2

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    sput v2, Ld01/b;->e:F

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v4

    mul-float/2addr v4, v3

    sput v4, Ld01/b;->f:F

    const/4 v4, 0x6

    int-to-float v4, v4

    mul-float/2addr v4, v3

    sput v4, Ld01/b;->g:F

    mul-float/2addr v1, v3

    sput v1, Ld01/b;->h:F

    mul-float/2addr v3, v3

    sput v3, Ld01/b;->i:F

    sput v4, Ld01/b;->j:F

    sput v2, Ld01/b;->k:F

    sput v0, Ld01/b;->l:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    sget v0, Ld01/b;->l:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, Ld01/b;->j:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, Ld01/b;->k:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, Ld01/b;->c:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, Ld01/b;->g:F

    return v0
.end method

.method public final f()F
    .locals 1

    sget v0, Ld01/b;->h:F

    return v0
.end method

.method public final g()F
    .locals 1

    sget v0, Ld01/b;->b:F

    return v0
.end method

.method public final h()F
    .locals 1

    sget v0, Ld01/b;->e:F

    return v0
.end method

.method public final i()F
    .locals 1

    sget v0, Ld01/b;->f:F

    return v0
.end method

.method public final j()F
    .locals 1

    sget v0, Ld01/b;->i:F

    return v0
.end method

.method public final k()F
    .locals 1

    sget v0, Ld01/b;->d:F

    return v0
.end method
