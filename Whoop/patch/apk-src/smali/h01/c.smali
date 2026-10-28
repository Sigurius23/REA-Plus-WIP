.class public final Lh01/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lh01/c;",
        "",
        "<init>",
        "()V",
        "Ly3/f;",
        "b",
        "F",
        "()F",
        "maxHeight",
        "Ld0/e2;",
        "Ly3/l;",
        "c",
        "Ld0/e2;",
        "a",
        "()Ld0/e2;",
        "animationSpec",
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
.field public static final a:Lh01/c;

.field private static final b:F

.field private static final c:Ld0/e2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lh01/c;

    invoke-direct {v0}, Lh01/c;-><init>()V

    sput-object v0, Lh01/c;->a:Lh01/c;

    const/16 v0, 0x2d

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lh01/c;->b:F

    new-instance v0, Ld0/e2;

    const/4 v1, 0x0

    const/4 v2, 0x6

    const/16 v3, 0x96

    invoke-direct {v0, v3, v1, v2}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lh01/c;->c:Ld0/e2;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ld0/e2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld0/e2;"
        }
    .end annotation

    sget-object v0, Lh01/c;->c:Ld0/e2;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lh01/c;->b:F

    return v0
.end method
