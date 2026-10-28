.class public final Lu81/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lu81/c;",
        "",
        "<init>",
        "()V",
        "",
        "currentZoom",
        "Lt81/e;",
        "zoomToggleState",
        "a",
        "(FLt81/e;)F",
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
.field public static final a:Lu81/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu81/c;

    invoke-direct {v0}, Lu81/c;-><init>()V

    sput-object v0, Lu81/c;->a:Lu81/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(FLt81/e;)F
    .locals 1

    const-string v0, "zoomToggleState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lt81/e;->a()F

    move-result v0

    cmpl-float p1, p1, v0

    if-ltz p1, :cond_0

    invoke-virtual {p2}, Lt81/e;->b()F

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p2}, Lt81/e;->a()F

    move-result p1

    return p1
.end method
