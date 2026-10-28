.class public final Lw71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lw71/c;",
        "",
        "<init>",
        "()V",
        "Ly3/f;",
        "b",
        "F",
        "()F",
        "subQuestionStart",
        "c",
        "a",
        "nonSubQuestionStart",
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
.field public static final a:Lw71/c;

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw71/c;

    invoke-direct {v0}, Lw71/c;-><init>()V

    sput-object v0, Lw71/c;->a:Lw71/c;

    const/4 v0, 0x1

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lw71/c;->b:F

    const/4 v0, 0x0

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lw71/c;->c:F

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

    sget v0, Lw71/c;->c:F

    return v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lw71/c;->b:F

    return v0
.end method
