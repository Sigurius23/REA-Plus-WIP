.class public abstract Ll51/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a%\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ln0/u;",
        "listState",
        "Ly3/f;",
        "collapsedBottomInsetDp",
        "Ll51/f;",
        "b",
        "(Ln0/u;FLandroidx/compose/runtime/Composer;II)Ll51/f;",
        "Lp1/a1;",
        "consumedOffsetPx",
        "",
        "maxConsumePx",
        "Lt2/a;",
        "a",
        "(Ln0/u;Lp1/a1;I)Lt2/a;",
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
.method public static final a(Ln0/u;Lp1/a1;I)Lt2/a;
    .locals 1

    const-string v0, "listState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumedOffsetPx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll51/e$a;

    invoke-direct {v0, p0, p2, p1}, Ll51/e$a;-><init>(Ln0/u;ILp1/a1;)V

    return-object v0
.end method

.method public static final b(Ln0/u;FLandroidx/compose/runtime/Composer;II)Ll51/f;
    .locals 7

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 p0, 0x3

    invoke-static {v1, v1, p2, p0}, Ln0/x;->a(IILandroidx/compose/runtime/Composer;I)Ln0/u;

    move-result-object p0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    int-to-float p1, v1

    :cond_1
    sget-object p4, Lb3/v1;->h:Lp1/u2;

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ly3/c;

    sget-object v0, Ll51/g;->j:Ll51/g$a;

    invoke-virtual {v0}, Ll51/g$a;->b()F

    move-result v2

    invoke-interface {p4, v2}, Ly3/c;->F(F)I

    move-result v2

    invoke-virtual {v0}, Ll51/g$a;->a()F

    move-result v0

    add-float/2addr v0, p1

    invoke-interface {p4, v0}, Ly3/c;->F(F)I

    move-result p1

    sub-int/2addr v2, p1

    const/4 p1, 0x1

    if-ge v2, p1, :cond_2

    move v2, p1

    :cond_2
    invoke-virtual {p2, v2}, Lp1/q;->e(I)Z

    move-result p4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez p4, :cond_3

    if-ne v0, v3, :cond_4

    :cond_3
    invoke-static {v1, p2}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v0

    :cond_4
    check-cast v0, Lp1/a1;

    and-int/lit8 p4, p3, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v4, 0x4

    if-le p4, v4, :cond_5

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    and-int/lit8 v5, p3, 0x6

    if-ne v5, v4, :cond_7

    :cond_6
    move v5, p1

    goto :goto_0

    :cond_7
    move v5, v1

    :goto_0
    invoke-virtual {p2, v2}, Lp1/q;->e(I)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_8

    if-ne v6, v3, :cond_9

    :cond_8
    invoke-static {p0, v0, v2}, Ll51/e;->a(Ln0/u;Lp1/a1;I)Lt2/a;

    move-result-object v6

    invoke-virtual {p2, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lt2/a;

    if-le p4, v4, :cond_a

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_b

    :cond_a
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v4, :cond_c

    :cond_b
    move v1, p1

    :cond_c
    invoke-virtual {p2, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, v1

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p1, p3

    invoke-virtual {p2, v2}, Lp1/q;->e(I)Z

    move-result p3

    or-int/2addr p1, p3

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_d

    if-ne p3, v3, :cond_e

    :cond_d
    new-instance p3, Ll51/f;

    invoke-direct {p3, p0, v6, v0, v2}, Ll51/f;-><init>(Ln0/u;Lt2/a;Lp1/a1;I)V

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast p3, Ll51/f;

    return-object p3
.end method
