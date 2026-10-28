.class public abstract Lgb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a%\u0010\u0008\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Li2/t;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Li2/t;",
        "Landroidx/compose/ui/Modifier;",
        "Li2/a1;",
        "shape",
        "Ly3/f;",
        "width",
        "a",
        "(Landroidx/compose/ui/Modifier;Li2/a1;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
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
.method public static final a(Landroidx/compose/ui/Modifier;Li2/a1;FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p4, "$this$floatingElementBorder"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "shape"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p4, p5, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    int-to-float p2, p2

    :cond_0
    const/4 p4, 0x0

    invoke-static {p3, p4}, Lgb1/i;->b(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object p3

    invoke-static {p2, p0, p3, p1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Landroidx/compose/runtime/Composer;I)Li2/t;
    .locals 6

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v1, p0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p1, 0x3f000000    # 0.5f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v1, p0, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->a1()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    sget-wide v4, Li2/x;->m:J

    new-instance p1, Li2/x;

    invoke-direct {p1, v4, v5}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v1, v2}, [Ll83/k;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object p0

    return-object p0
.end method
