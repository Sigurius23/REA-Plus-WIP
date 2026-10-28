.class public final Lt21/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u000c\u001a\u0004\u0008\u0011\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000c\u001a\u0004\u0008\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000c\u001a\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0016\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000c\u001a\u0004\u0008\u000b\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u000c\u001a\u0004\u0008\u0006\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lt21/a;",
        "",
        "<init>",
        "()V",
        "Ld0/l;",
        "Ly3/f;",
        "b",
        "Ld0/l;",
        "a",
        "()Ld0/l;",
        "ANIMATION_SPEC",
        "c",
        "F",
        "g",
        "()F",
        "PILL_HEIGHT_NORMAL",
        "d",
        "f",
        "PILL_HEIGHT_ANIMATED",
        "e",
        "ICON_SIZE_NORMAL",
        "ICON_SIZE_ANIMATED",
        "ICON_END_PADDING_NORMAL",
        "h",
        "ICON_END_PADDING_ANIMATED",
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
.field public static final a:Lt21/a;

.field private static final b:Ld0/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/l;"
        }
    .end annotation
.end field

.field private static final c:F

.field private static final d:F

.field private static final e:F

.field private static final f:F

.field private static final g:F

.field private static final h:F

.field public static final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lt21/a;

    invoke-direct {v0}, Lt21/a;-><init>()V

    sput-object v0, Lt21/a;->a:Lt21/a;

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lt21/a;->b:Ld0/l;

    const/16 v0, 0x8

    int-to-float v1, v0

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v3, v1, v2

    sput v3, Lt21/a;->c:F

    const/16 v3, 0x9

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sput v3, Lt21/a;->d:F

    const/4 v3, 0x6

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sput v3, Lt21/a;->e:F

    const/4 v3, 0x7

    int-to-float v3, v3

    mul-float/2addr v3, v2

    sput v3, Lt21/a;->f:F

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    mul-float/2addr v2, v1

    sput v2, Lt21/a;->g:F

    sput v2, Lt21/a;->h:F

    sput v0, Lt21/a;->i:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ld0/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld0/l;"
        }
    .end annotation

    sget-object v0, Lt21/a;->b:Ld0/l;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lt21/a;->h:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, Lt21/a;->g:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, Lt21/a;->f:F

    return v0
.end method

.method public final e()F
    .locals 1

    sget v0, Lt21/a;->e:F

    return v0
.end method

.method public final f()F
    .locals 1

    sget v0, Lt21/a;->d:F

    return v0
.end method

.method public final g()F
    .locals 1

    sget v0, Lt21/a;->c:F

    return v0
.end method
