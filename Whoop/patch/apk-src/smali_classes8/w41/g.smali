.class public abstract Lw41/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Leu/g;",
        "cameraPositionState",
        "Lw41/f;",
        "a",
        "(Leu/g;Landroidx/compose/runtime/Composer;II)Lw41/f;",
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
.method public static final a(Leu/g;Landroidx/compose/runtime/Composer;II)Lw41/f;
    .locals 8

    const/4 v0, 0x1

    and-int/2addr p3, v0

    const/4 v1, 0x0

    if-eqz p3, :cond_0

    move-object v5, p1

    check-cast v5, Lp1/q;

    const p0, -0x71e929de

    invoke-virtual {v5, p0}, Lp1/q;->f0(I)V

    sget-object v3, Leu/g;->h:Lp0/n0;

    new-array v2, v1, [Ljava/lang/Object;

    new-instance v4, Lw41/g$a;

    invoke-direct {v4}, Lw41/g$a;-><init>()V

    const/16 v6, 0x48

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leu/g;

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :cond_0
    and-int/lit8 p3, p2, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 v2, 0x4

    if-le p3, v2, :cond_1

    move-object p3, p1

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    :cond_1
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :cond_3
    :goto_0
    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez v0, :cond_4

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p2, p3, :cond_5

    :cond_4
    new-instance p2, Lw41/f;

    invoke-direct {p2, p0}, Lw41/f;-><init>(Leu/g;)V

    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Lw41/f;

    return-object p2
.end method
