.class public abstract Llb1/w3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/w3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ProgressMetricRowModel;",
        "Ld31/c;",
        "g",
        "(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;",
        "Lcom/whoop/design/models/CircularProgressStyle;",
        "Llb1/e0;",
        "c",
        "(Lcom/whoop/design/models/CircularProgressStyle;)Llb1/e0;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "progressMetricRowMapper",
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


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/j3;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/w3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/w3;->e(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;
    .locals 0

    invoke-static {p0}, Llb1/w3;->f(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/design/models/CircularProgressStyle;)Llb1/e0;
    .locals 8

    if-nez p0, :cond_0

    sget-object p0, Lcom/whoop/design/models/CircularProgressStyle;->ACTIVITY_SNAPSHOT:Lcom/whoop/design/models/CircularProgressStyle;

    :cond_0
    sget-object v0, Llb1/w3$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    new-instance v1, Llb1/e0;

    sget-object v2, Ly81/f;->STRAIN:Ly81/f;

    sget-object v3, Ly81/f;->WHITE_10:Ly81/f;

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object p0

    invoke-virtual {p0}, Lb91/d;->z()Lb91/a;

    move-result-object v4

    sget-object v5, Ly81/f;->BRAND_WHITE:Ly81/f;

    const/16 p0, 0x16

    int-to-float p0, p0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v6, p0, v0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Llb1/e0;-><init>(Ly81/f;Ly81/f;Lb91/a;Ly81/f;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/w3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final e(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/j3;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Llb1/j3;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ProgressMetricRowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/w3$b;

    invoke-direct {v2, v0}, Llb1/w3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/w3;->g(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/ProgressMetricRowModel;)Ld31/c;
    .locals 29

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ProgressMetricRowModel;->getStyle()Lcom/whoop/design/models/CircularProgressStyle;

    move-result-object v0

    invoke-static {v0}, Llb1/w3;->c(Lcom/whoop/design/models/CircularProgressStyle;)Llb1/e0;

    move-result-object v0

    new-instance v1, Ld31/c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ProgressMetricRowModel;->getProgress()F

    move-result v2

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v2, v3, v4}, Le93/b;->m(FFF)F

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ProgressMetricRowModel;->getProgressDisplay()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    move-object v9, v2

    invoke-virtual {v0}, Llb1/e0;->c()Lb91/a;

    move-result-object v10

    invoke-virtual {v0}, Llb1/e0;->b()Ly81/f;

    move-result-object v11

    sget-object v25, Lp01/h;->PERCENTAGE:Lp01/h;

    invoke-virtual {v0}, Llb1/e0;->a()Ly81/f;

    move-result-object v13

    invoke-virtual {v0}, Llb1/e0;->a()Ly81/f;

    move-result-object v14

    invoke-virtual {v0}, Llb1/e0;->e()Ly81/f;

    move-result-object v15

    invoke-virtual {v0}, Llb1/e0;->d()F

    move-result v18

    new-instance v5, Lp01/b;

    const v27, 0xbec43

    const/16 v28, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v5 .. v28}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ProgressMetricRowModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/ProgressMetricRowModel;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-direct {v1, v5, v0, v2}, Ld31/c;-><init>(Lp01/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method
