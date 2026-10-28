.class public abstract Lis0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\" \u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00128\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "",
        "expandedHeightPx",
        "collapsedHeightPx",
        "b",
        "(FF)F",
        "",
        "initiallyExpanded",
        "Lis0/m0;",
        "d",
        "(ZLandroidx/compose/runtime/Composer;II)Lis0/m0;",
        "Lkotlin/Function0;",
        "isAtTop",
        "panelState",
        "Lh0/p3;",
        "flingBehavior",
        "Lt2/a;",
        "a",
        "(Lc93/a;Lis0/m0;Lh0/p3;)Lt2/a;",
        "Ld0/e2;",
        "Ld0/e2;",
        "c",
        "()Ld0/e2;",
        "REACTIONS_PANEL_SETTLE_ANIMATION",
        "community-reactions-arch-mini_release"
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
.field private static final a:Ld0/e2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld0/e2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ld0/b0;->a:Ld0/v;

    const/4 v1, 0x2

    const/16 v2, 0x12c

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    sput-object v0, Lis0/n0;->a:Ld0/e2;

    return-void
.end method

.method public static final a(Lc93/a;Lis0/m0;Lh0/p3;)Lt2/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lis0/m0;",
            "Lh0/p3;",
            ")",
            "Lt2/a;"
        }
    .end annotation

    const-string v0, "isAtTop"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "panelState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flingBehavior"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lis0/n0$a;

    invoke-direct {v0, p0, p1, p2}, Lis0/n0$a;-><init>(Lc93/a;Lis0/m0;Lh0/p3;)V

    return-object v0
.end method

.method public static final b(FF)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p1, v0

    invoke-static {p0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p0

    return p0
.end method

.method public static final c()Ld0/e2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ld0/e2;"
        }
    .end annotation

    sget-object v0, Lis0/n0;->a:Ld0/e2;

    return-object v0
.end method

.method public static final d(ZLandroidx/compose/runtime/Composer;II)Lis0/m0;
    .locals 0

    and-int/lit8 p2, p3, 0x1

    if-eqz p2, :cond_0

    const/4 p0, 0x0

    :cond_0
    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_2

    new-instance p2, Lis0/m0;

    if-eqz p0, :cond_1

    sget-object p0, Lis0/b0;->Expanded:Lis0/b0;

    goto :goto_0

    :cond_1
    sget-object p0, Lis0/b0;->Collapsed:Lis0/b0;

    :goto_0
    invoke-direct {p2, p0}, Lis0/m0;-><init>(Lis0/b0;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lis0/m0;

    return-object p2
.end method
