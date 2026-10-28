.class public abstract Lr61/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\u001a\u000f\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0016\u001a\u00020\r8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lj71/c;",
        "a",
        "(Landroidx/compose/runtime/Composer;I)Lj71/c;",
        "Lg61/b;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)Lg61/b;",
        "d",
        "Lj71/b$g;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)Lj71/b$g;",
        "Ly81/e;",
        "largeColorKey",
        "smallColorKey",
        "",
        "yPercentTop",
        "yPercentBot",
        "Lj71/b$a;",
        "c",
        "(Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)Lj71/b$a;",
        "F",
        "getLabelOffset",
        "()F",
        "labelOffset",
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


# static fields
.field private static final a:F = 0.03f


# direct methods
.method public static final a(Landroidx/compose/runtime/Composer;I)Lj71/c;
    .locals 24

    move-object/from16 v4, p0

    new-instance v6, Lj71/c;

    new-instance v1, Lj61/h;

    const/4 v0, 0x0

    invoke-static {v4, v0}, Lr61/c;->e(Landroidx/compose/runtime/Composer;I)Lg61/b;

    move-result-object v8

    invoke-static {v4, v0}, Lr61/c;->d(Landroidx/compose/runtime/Composer;I)Lg61/b;

    move-result-object v10

    new-instance v12, Lh2/c;

    const v2, 0x3da3d70a    # 0.08f

    const v3, 0x3ca3d70a    # 0.02f

    invoke-direct {v12, v2, v3, v3, v2}, Lh2/c;-><init>(FFFF)V

    new-instance v15, Lj61/g;

    const-string v2, "Biomarker details graph showing values from April 2023 to April 2025"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const/16 v18, 0xe

    const/16 v19, 0x0

    move-object v13, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x1e6a

    const/16 v23, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    move-object v7, v1

    invoke-direct/range {v7 .. v23}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v0}, Lr61/c;->b(Landroidx/compose/runtime/Composer;I)Lj71/b$g;

    move-result-object v8

    sget-object v0, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    sget-object v1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const v3, 0x3f028f5c    # 0.51f

    const/16 v5, 0xdb6

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v5}, Lr61/c;->c(Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)Lj71/b$a;

    move-result-object v9

    sget-object v0, Ly81/f;->WHITE_5:Ly81/f;

    sget-object v1, Ly81/f;->WHITE_50:Ly81/f;

    const v3, 0x3e570a3d    # 0.21f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static/range {v0 .. v5}, Lr61/c;->c(Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)Lj71/b$a;

    move-result-object v10

    sget-object v0, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    sget-object v1, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const/4 v3, 0x0

    const v2, 0x3e4ccccd    # 0.2f

    invoke-static/range {v0 .. v5}, Lr61/c;->c(Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)Lj71/b$a;

    move-result-object v0

    filled-new-array {v8, v9, v10, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v5, 0xc

    move-object v0, v6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, v7

    invoke-direct/range {v0 .. v6}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final b(Landroidx/compose/runtime/Composer;I)Lj71/b$g;
    .locals 1

    sget-object p1, Lr61/b;->a:Lr61/b;

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lr61/b;->a(Landroidx/compose/runtime/Composer;I)Lj71/b$g;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ly81/e;Ly81/e;FFLandroidx/compose/runtime/Composer;I)Lj71/b$a;
    .locals 19

    sget-object v2, Lj71/a;->TWO_DOTS:Lj71/a;

    new-instance v3, Ll61/c;

    const/16 v9, 0x11

    const/4 v10, 0x0

    const/4 v4, 0x0

    const v5, -0x42333333    # -0.1f

    const/4 v8, 0x0

    move/from16 v6, p2

    move/from16 v7, p3

    invoke-direct/range {v3 .. v10}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Ll61/c;

    const/16 v17, 0x11

    const/16 v18, 0x0

    const/4 v12, 0x0

    const/high16 v13, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    move/from16 v14, p2

    move/from16 v15, p3

    invoke-direct/range {v11 .. v18}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3, v11}, [Ll61/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lk61/a;

    sget-object v3, Li2/t;->b:Li2/s;

    const/16 v4, 0xe

    and-int/lit8 v5, p5, 0xe

    move-object/from16 v6, p0

    move-object/from16 v7, p4

    invoke-interface {v6, v7, v5}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    new-instance v5, Li2/x;

    invoke-direct {v5, v7, v8}, Li2/x;-><init>(J)V

    sget-wide v7, Li2/x;->m:J

    new-instance v9, Li2/x;

    invoke-direct {v9, v7, v8}, Li2/x;-><init>(J)V

    filled-new-array {v5, v9}, [Li2/x;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x0

    invoke-static {v3, v5, v7, v7, v4}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v3

    invoke-static {v3}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v3

    invoke-static {v6}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    new-instance v3, Ll61/d;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    new-instance v11, Ll61/c;

    const v13, -0x42333333    # -0.1f

    invoke-direct/range {v11 .. v18}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v11

    new-instance v11, Ll61/c;

    const v13, -0x423d70a4    # -0.095f

    invoke-direct/range {v11 .. v18}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v11}, [Ll61/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lk61/a;

    invoke-static/range {p1 .. p1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v5

    invoke-static/range {p1 .. p1}, Li91/c;->m(Ly81/e;)Li91/a;

    move-result-object v6

    invoke-direct {v1, v5, v6}, Lk61/a;-><init>(Li91/a;Li91/a;)V

    new-instance v5, Ll61/d;

    invoke-direct {v5, v0, v1, v4}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    filled-new-array {v3, v5}, [Ll61/d;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v0, Lj71/b$a;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const-string v3, "confidence_band"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final d(Landroidx/compose/runtime/Composer;I)Lg61/b;
    .locals 19

    sget-object v4, Lg61/d;->STANDARD:Lg61/d;

    const-string v0, "Apr 24\n2023"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object/from16 v0, p0

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_0

    sget-object v1, Lr61/c$a;->w:Lr61/c$a;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    new-instance v5, Lyy0/c;

    const/16 v12, 0x22

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Apr 12\n2024"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_1

    sget-object v1, Lr61/c$b;->w:Lr61/c$b;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    new-instance v6, Lyy0/c;

    const/16 v13, 0x22

    const/4 v14, 0x0

    const/4 v8, 0x0

    const v10, 0x3e4ccccd    # 0.2f

    const/high16 v11, 0x3f000000    # 0.5f

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Jul 12\n2024"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    sget-object v1, Lr61/c$c;->w:Lr61/c$c;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    new-instance v7, Lyy0/c;

    const/16 v14, 0x22

    const/4 v15, 0x0

    const/4 v9, 0x0

    const v11, 0x3ecccccd    # 0.4f

    const/high16 v12, 0x3f000000    # 0.5f

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Oct 4\n2024"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    sget-object v1, Lr61/c$d;->w:Lr61/c$d;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    new-instance v8, Lyy0/c;

    const/16 v15, 0x22

    const/16 v16, 0x0

    const/4 v10, 0x0

    const v12, 0x3f19999a    # 0.6f

    const/high16 v13, 0x3f000000    # 0.5f

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Jan 12\n2025"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    sget-object v1, Lr61/c$e;->w:Lr61/c$e;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v12

    new-instance v9, Lyy0/c;

    const/16 v16, 0x22

    const/16 v17, 0x0

    const/4 v11, 0x0

    const v13, 0x3f4ccccd    # 0.8f

    const/high16 v14, 0x3f000000    # 0.5f

    const/4 v15, 0x0

    invoke-direct/range {v9 .. v17}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "Apr 2\n2025"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    sget-object v1, Lr61/c$f;->w:Lr61/c$f;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    new-instance v14, Lyy0/c;

    const/16 v17, 0x22

    const/16 v18, 0x0

    const/4 v12, 0x0

    move-object v10, v14

    const/high16 v14, 0x3f800000    # 1.0f

    const/high16 v15, 0x3f000000    # 0.5f

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v7

    move-object v12, v8

    move-object v13, v9

    move-object v14, v10

    move-object v9, v5

    move-object v10, v6

    filled-new-array/range {v9 .. v14}, [Lyy0/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v0, Lg61/b;

    const/16 v9, 0xf4

    const/4 v10, 0x0

    const v1, 0x3da3d70a    # 0.08f

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final e(Landroidx/compose/runtime/Composer;I)Lg61/b;
    .locals 17

    sget-object v4, Lg61/d;->STANDARD:Lg61/d;

    const-string v0, "100"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v0, 0x0

    int-to-float v0, v0

    sget v1, Lr61/c;->a:F

    add-float v10, v0, v1

    move-object/from16 v0, p0

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_0

    sget-object v2, Lr61/c$g;->w:Lr61/c$g;

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    new-instance v5, Lyy0/c;

    const/16 v12, 0x22

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/high16 v9, 0x3f000000    # 0.5f

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "120"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const v2, 0x3e4ccccd    # 0.2f

    add-float v11, v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1

    sget-object v2, Lr61/c$h;->w:Lr61/c$h;

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    new-instance v6, Lyy0/c;

    const/16 v13, 0x22

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "150"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/high16 v2, 0x3f000000    # 0.5f

    add-float v12, v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_2

    sget-object v2, Lr61/c$i;->w:Lr61/c$i;

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v10

    new-instance v7, Lyy0/c;

    const/16 v14, 0x22

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/high16 v11, 0x3f000000    # 0.5f

    const/4 v13, 0x0

    invoke-direct/range {v7 .. v15}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "200"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v13, v2, v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    sget-object v1, Lr61/c$j;->w:Lr61/c$j;

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    new-instance v8, Lyy0/c;

    const/16 v15, 0x22

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/high16 v12, 0x3f000000    # 0.5f

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lyy0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FFLgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v5, v6, v7, v8}, [Lyy0/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v0, Lg61/b;

    const/16 v9, 0xf4

    const v1, 0x3da3d70a    # 0.08f

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
