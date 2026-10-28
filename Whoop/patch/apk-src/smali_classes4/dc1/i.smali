.class public abstract Ldc1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldc1/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a%\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;",
        "linePointStyle",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;",
        "theme",
        "Lu61/c;",
        "b",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lu61/c;",
        "Lcom/whoop/design/models/items/graph/plot/line/PointShape;",
        "Lu61/b;",
        "c",
        "(Lcom/whoop/design/models/items/graph/plot/line/PointShape;)Lu61/b;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;)Lu61/c;",
        "design-models_release"
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
.method private static final a(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;)Lu61/c;
    .locals 12

    sget-object v0, Ldc1/i$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/16 v0, 0xe

    const/4 v1, 0x4

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    new-instance v0, Lu61/c;

    sget-object p0, Ldc1/i$m;->w:Ldc1/i$m;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_1
    move p0, v1

    new-instance v1, Lu61/c;

    sget-object v0, Ldc1/i$k;->w:Ldc1/i$k;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    int-to-float v3, p0

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_2
    move p0, v1

    new-instance v2, Lu61/c;

    sget-object v0, Ldc1/i$j;->w:Ldc1/i$j;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    int-to-float v4, p0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_3
    move p0, v1

    new-instance v3, Lu61/c;

    sget-object v0, Ldc1/i$i;->w:Ldc1/i$i;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    int-to-float v5, p0

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_4
    move p0, v1

    new-instance v4, Lu61/c;

    sget-object v0, Ldc1/i$h;->w:Ldc1/i$h;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    int-to-float v6, p0

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_5
    move p0, v1

    new-instance v5, Lu61/c;

    sget-object v0, Ldc1/i$g;->w:Ldc1/i$g;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    int-to-float v7, p0

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_6
    new-instance v6, Lu61/c;

    sget-object p0, Ldc1/i$f;->w:Ldc1/i$f;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_7
    new-instance v0, Lu61/c;

    sget-object p0, Ldc1/i$e;->w:Ldc1/i$e;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_8
    new-instance v1, Lu61/c;

    sget-object p0, Ldc1/i$d;->w:Ldc1/i$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_9
    new-instance v2, Lu61/c;

    sget-object p0, Ldc1/i$c;->w:Ldc1/i$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_a
    new-instance v3, Lu61/c;

    sget-object p0, Ldc1/i$b;->w:Ldc1/i$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_b
    new-instance v4, Lu61/c;

    sget-object p0, Ldc1/i$u;->w:Ldc1/i$u;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_c
    new-instance v5, Lu61/c;

    sget-object p0, Ldc1/i$t;->w:Ldc1/i$t;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :pswitch_d
    new-instance v6, Lu61/c;

    sget-object p0, Ldc1/i$s;->w:Ldc1/i$s;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :pswitch_e
    new-instance v0, Lu61/c;

    sget-object p0, Ldc1/i$r;->w:Ldc1/i$r;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :pswitch_f
    new-instance v1, Lu61/c;

    sget-object p0, Ldc1/i$q;->w:Ldc1/i$q;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :pswitch_10
    new-instance v2, Lu61/c;

    sget-object p0, Ldc1/i$p;->w:Ldc1/i$p;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    int-to-float v4, v0

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :pswitch_11
    new-instance v3, Lu61/c;

    sget-object p0, Ldc1/i$o;->w:Ldc1/i$o;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v4

    int-to-float v5, v0

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :pswitch_12
    new-instance v4, Lu61/c;

    sget-object p0, Ldc1/i$n;->w:Ldc1/i$n;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v5

    int-to-float v6, v0

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :pswitch_13
    new-instance v5, Lu61/c;

    sget-object p0, Ldc1/i$l;->w:Ldc1/i$l;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    int-to-float v7, v0

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final b(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lu61/c;
    .locals 7

    const-string v0, "linePointStyle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->getPointVisibility()Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    sget-object v2, Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;->NONE:Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;

    if-ne v1, v2, :cond_1

    return-object v0

    :cond_1
    invoke-static {p0}, Ldc1/i;->a(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;)Lu61/c;

    move-result-object p0

    if-nez p0, :cond_3

    if-eqz p1, :cond_2

    new-instance v1, Lu61/c;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lu61/c;-><init>(Ly81/e;FLu61/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p0, v1

    goto :goto_1

    :cond_2
    move-object p0, v0

    :goto_1
    if-nez p0, :cond_3

    return-object v0

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->getPointColor()Ly81/f;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lu61/c;->b()Ly81/e;

    move-result-object v0

    :goto_2
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->getPointSize()Lcom/whoop/design/models/items/graph/plot/line/PointSize;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Ldc1/j;->a(Lcom/whoop/design/models/items/graph/plot/line/PointSize;)F

    move-result v1

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Lu61/c;->d()F

    move-result v1

    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;->getPointShape()Lcom/whoop/design/models/items/graph/plot/line/PointShape;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-static {p1}, Ldc1/i;->c(Lcom/whoop/design/models/items/graph/plot/line/PointShape;)Lu61/b;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    invoke-virtual {p0}, Lu61/c;->c()Lu61/b;

    move-result-object p1

    :cond_7
    invoke-virtual {p0, v0, v1, p1}, Lu61/c;->a(Ly81/e;FLu61/b;)Lu61/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/design/models/items/graph/plot/line/PointShape;)Lu61/b;
    .locals 1

    sget-object v0, Ldc1/i$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lu61/b;->DIAMOND:Lu61/b;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lu61/b;->SQUARE:Lu61/b;

    return-object p0

    :cond_2
    sget-object p0, Lu61/b;->DOT:Lu61/b;

    return-object p0

    :cond_3
    sget-object p0, Lu61/b;->CIRCLE:Lu61/b;

    return-object p0
.end method
