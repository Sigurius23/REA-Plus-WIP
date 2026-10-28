.class public abstract Lkd1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ly3/o;",
        "",
        "scale",
        "a",
        "(JFLandroidx/compose/runtime/Composer;I)J",
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


# direct methods
.method public static final a(JFLandroidx/compose/runtime/Composer;I)J
    .locals 2

    invoke-static {p0, p1}, Ly3/o;->c(J)F

    move-result p0

    sget-object p1, Lb3/v1;->h:Lp1/u2;

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly3/c;

    const-wide v0, 0x100000000L

    invoke-static {p0, v0, v1, p4}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v0

    invoke-virtual {p3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/c;

    invoke-interface {p0}, Ly3/c;->m0()F

    move-result p0

    invoke-static {p2, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    invoke-static {v0, v1}, Lv63/c;->a(J)V

    const-wide p1, 0xff00000000L

    and-long/2addr p1, v0

    invoke-static {v0, v1, p1, p2, p0}, Ld13/a;->d(JJF)J

    move-result-wide p0

    return-wide p0
.end method
