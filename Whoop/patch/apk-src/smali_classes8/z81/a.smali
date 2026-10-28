.class final Lz81/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0005\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lz81/a;",
        "",
        "<init>",
        "()V",
        "Ly81/e;",
        "b",
        "Ly81/e;",
        "a",
        "()Ly81/e;",
        "color",
        "Li2/t0;",
        "c",
        "Li2/t0;",
        "()Li2/t0;",
        "pathEffect",
        "Ly3/f;",
        "d",
        "F",
        "()F",
        "cornerRadius",
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
.field public static final a:Lz81/a;

.field private static final b:Ly81/e;

.field private static final c:Li2/t0;

.field private static final d:F


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lz81/a;

    invoke-direct {v0}, Lz81/a;-><init>()V

    sput-object v0, Lz81/a;->a:Lz81/a;

    sget-object v0, Ly81/f;->WHITE_30:Ly81/f;

    sput-object v0, Lz81/a;->b:Ly81/e;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    new-instance v1, Li2/k;

    new-instance v2, Landroid/graphics/DashPathEffect;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v1, v2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    sput-object v1, Lz81/a;->c:Li2/t0;

    const/4 v0, 0x0

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lz81/a;->d:F

    return-void

    :array_0
    .array-data 4
        0x41000000    # 8.0f
        0x40800000    # 4.0f
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ly81/e;
    .locals 1

    sget-object v0, Lz81/a;->b:Ly81/e;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lz81/a;->d:F

    return v0
.end method

.method public final c()Li2/t0;
    .locals 1

    sget-object v0, Lz81/a;->c:Li2/t0;

    return-object v0
.end method
