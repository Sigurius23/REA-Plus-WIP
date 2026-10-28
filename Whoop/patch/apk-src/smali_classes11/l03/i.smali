.class public abstract Ll03/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "",
        "batteryPercentage",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V",
        "widget_release"
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
.method public static synthetic a(Ljava/lang/Integer;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll03/i;->c(Ljava/lang/Integer;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x7c40d61a

    invoke-virtual {v6, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v0, :cond_2

    move v0, v2

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    and-int/2addr p1, v2

    invoke-virtual {v6, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz p0, :cond_3

    const p1, 0x7d14e683

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "%"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_3
    move-object v1, p1

    goto :goto_4

    :cond_3
    const p1, 0x6f63cae7

    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    sget-object p1, Ln6/h;->b:Lp1/u2;

    invoke-virtual {v6, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    sget v0, Ld03/b;->b:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :goto_4
    sget v0, Lgy0/a;->T4:I

    invoke-static {p0}, Lo03/a;->c(Ljava/lang/Integer;)J

    move-result-wide v2

    invoke-static {p0}, Lo03/a;->d(Ljava/lang/Integer;)I

    move-result v4

    const/16 p1, 0x18

    int-to-float p1, p1

    invoke-static {p1}, Ls2/d;->t(F)Ln6/o;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lk03/n;->u(ILjava/lang/String;JILn6/o;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Lj11/h;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lj11/h;-><init>(Ljava/lang/Integer;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(Ljava/lang/Integer;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ll03/i;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ll03/i;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
