.class public final Lt81/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lt81/a;",
        "",
        "<init>",
        "()V",
        "Lh2/b;",
        "anchorPoint",
        "",
        "currentZoom",
        "targetZoom",
        "",
        "currentScrollPosition",
        "",
        "startVerticalAxisSize",
        "a",
        "(JFFID)I",
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
.field public static final a:Lt81/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt81/a;

    invoke-direct {v0}, Lt81/a;-><init>()V

    sput-object v0, Lt81/a;->a:Lt81/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JFFID)I
    .locals 0

    const/16 p6, 0x20

    shr-long/2addr p1, p6

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    mul-float/2addr p3, p1

    int-to-float p2, p5

    sub-float/2addr p3, p2

    mul-float/2addr p1, p4

    sub-float/2addr p1, p3

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return p1
.end method
