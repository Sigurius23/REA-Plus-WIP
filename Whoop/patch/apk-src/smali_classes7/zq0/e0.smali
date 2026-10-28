.class final Lzq0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc4/i0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lzq0/e0;",
        "Lc4/i0;",
        "<init>",
        "()V",
        "Ly3/k;",
        "anchorBounds",
        "Ly3/l;",
        "windowSize",
        "Ly3/m;",
        "layoutDirection",
        "popupContentSize",
        "Ly3/j;",
        "i",
        "(Ly3/k;JLy3/m;J)J",
        "community-everyday-stats_release"
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
.field public static final w:Lzq0/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzq0/e0;

    invoke-direct {v0}, Lzq0/e0;-><init>()V

    sput-object v0, Lzq0/e0;->w:Lzq0/e0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Ly3/k;JLy3/m;J)J
    .locals 4

    const-string v0, "anchorBounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutDirection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget p4, p1, Ly3/k;->c:I

    const/16 v0, 0x20

    shr-long v1, p5, v0

    long-to-int v1, v1

    sub-int/2addr p4, v1

    iget v1, p1, Ly3/k;->d:I

    const-wide v2, 0xffffffffL

    and-long/2addr p5, v2

    long-to-int p5, p5

    add-int p6, v1, p5

    and-long/2addr p2, v2

    long-to-int p2, p2

    if-gt p6, p2, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p1, Ly3/k;->b:I

    sub-int v1, p1, p5

    :goto_0
    int-to-long p1, p4

    shl-long/2addr p1, v0

    int-to-long p3, v1

    and-long/2addr p3, v2

    or-long/2addr p1, p3

    return-wide p1
.end method
