.class public abstract Llb1/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/design/models/items/Spacing;",
        "Ly3/f;",
        "i",
        "(Lcom/whoop/design/models/items/Spacing;)F",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "h",
        "()Ljb1/a;",
        "columnNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "columnMapper",
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
.field private static final a:Ll83/h;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj02/w;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Llb1/g0;->a:Ll83/h;

    new-instance v0, Llb1/v;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/g0;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ColumnModel;)Ln51/h;
    .locals 0

    invoke-static {p0}, Llb1/g0;->e(Lcom/whoop/design/models/items/ColumnModel;)Ln51/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Llb1/g0;->f()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/g0;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/v;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/v;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/ColumnModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/g0$b;

    invoke-direct {v2, v0}, Llb1/g0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/ColumnModel;)Ln51/h;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Llb1/g0;->h()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnModel;->getSpacing()Lcom/whoop/design/models/items/Spacing;

    move-result-object v0

    invoke-static {v0}, Llb1/g0;->i(Lcom/whoop/design/models/items/Spacing;)F

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnModel;->getHorizontalAlignment()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    const-string v6, "LEADING"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    sget-object v0, Lb2/e;->M:Lb2/k;

    goto :goto_1

    :cond_1
    const-string v6, "TRAILING"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lb2/e;->O:Lb2/k;

    goto :goto_1

    :cond_2
    sget-object v0, Lb2/e;->N:Lb2/k;

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnModel;->getItemEntrance()Lcom/whoop/design/models/items/ColumnItemEntrance;

    move-result-object p0

    if-eqz p0, :cond_b

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnItemEntrance;->getType()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ln51/c;->values()[Ln51/c;

    move-result-object v8

    array-length v9, v8

    move v10, v7

    :goto_2
    if-ge v10, v9, :cond_4

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_4
    move-object v11, v5

    :goto_3
    if-nez v11, :cond_6

    :cond_5
    sget-object v11, Ln51/c;->STAGGERED:Ln51/c;

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ColumnItemEntrance;->getAnimation()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_9

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ln51/b;->values()[Ln51/b;

    move-result-object v1

    array-length v6, v1

    :goto_4
    if-ge v7, v6, :cond_8

    aget-object v8, v1, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move-object v5, v8

    goto :goto_5

    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_8
    :goto_5
    if-nez v5, :cond_a

    :cond_9
    sget-object v5, Ln51/b;->APPEAR_FROM_TOP:Ln51/b;

    :cond_a
    new-instance p0, Ln51/a;

    invoke-direct {p0, v11, v5}, Ln51/a;-><init>(Ln51/c;Ln51/b;)V

    move-object v6, p0

    goto :goto_6

    :cond_b
    move-object v6, v5

    :goto_6
    new-instance v1, Ln51/h;

    const/4 v7, 0x0

    move-object v5, v0

    invoke-direct/range {v1 .. v7}, Ln51/h;-><init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final f()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/g0;->b:Llb1/y0;

    return-object v0
.end method

.method private static final h()Ljb1/a;
    .locals 1

    sget-object v0, Llb1/g0;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method public static final i(Lcom/whoop/design/models/items/Spacing;)F
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/g0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v1, 0x2

    const/16 v2, 0x8

    if-eq p0, v1, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v1, 0x4

    if-eq p0, v1, :cond_1

    const/4 v0, 0x5

    if-ne p0, v0, :cond_0

    int-to-float p0, v1

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    int-to-float p0, v0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_2
    int-to-float p0, v1

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_3
    int-to-float p0, v0

    int-to-float v0, v2

    mul-float/2addr p0, v0

    return p0

    :cond_4
    const/4 p0, 0x0

    int-to-float p0, p0

    return p0
.end method
