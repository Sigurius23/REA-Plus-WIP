.class public abstract Lz41/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lb51/c;",
        "Lk2/e;",
        "drawScope",
        "La51/h;",
        "particle",
        "Ll83/a0;",
        "a",
        "(Lb51/c;Lk2/e;La51/h;)V",
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
.method public static final a(Lb51/c;Lk2/e;La51/h;)V
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "drawScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "particle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, La51/h;->b()I

    move-result v0

    int-to-float v0, v0

    const/16 v1, 0xff

    int-to-float v1, v1

    div-float v8, v0, v1

    invoke-virtual {p2}, La51/h;->f()F

    move-result v0

    invoke-virtual {p2}, La51/h;->f()F

    move-result v1

    invoke-virtual {p2}, La51/h;->e()Lb51/d;

    move-result-object v2

    invoke-virtual {v2}, Lb51/d;->c()F

    move-result v2

    invoke-virtual {p2}, La51/h;->e()Lb51/d;

    move-result-object v3

    invoke-virtual {v3}, Lb51/d;->d()F

    move-result v3

    sget-object v4, Lb51/c$a;->a:Lb51/c$a;

    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-wide v5, 0xffffffffL

    const/16 v7, 0x20

    if-eqz v4, :cond_0

    const/4 p0, 0x2

    int-to-float p0, p0

    div-float/2addr v0, p0

    move v9, v3

    invoke-virtual {p2}, La51/h;->c()J

    move-result-wide v3

    add-float/2addr v2, v0

    add-float p0, v9, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v1, p2

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v9, p0

    shl-long/2addr v1, v7

    and-long/2addr v5, v9

    or-long v6, v1, v5

    const/4 v9, 0x0

    const/16 v10, 0x70

    move-object v2, p1

    move v5, v0

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    return-void

    :cond_0
    move v9, v2

    move-object v2, p1

    move p1, v9

    move v9, v3

    sget-object v3, Lb51/c$b;->a:Lb51/c$b;

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, La51/h;->c()J

    move-result-wide v3

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long p0, p0

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v9, p2

    shl-long/2addr p0, v7

    and-long/2addr v9, v5

    or-long/2addr p0, v9

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v9, p2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p2

    int-to-long v0, p2

    shl-long/2addr v9, v7

    and-long/2addr v0, v5

    or-long/2addr v0, v9

    const/4 v11, 0x0

    const/16 v12, 0x70

    const/4 v10, 0x0

    move-wide v5, p0

    move v9, v8

    move-wide v7, v0

    invoke-static/range {v2 .. v12}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    return-void

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
