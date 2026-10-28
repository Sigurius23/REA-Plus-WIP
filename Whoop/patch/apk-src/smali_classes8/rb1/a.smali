.class public abstract Lrb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrb1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a%\u0010\t\u001a\u00020\u0008*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0019\u0010\u0012\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a#\u0010\u0019\u001a\u00020\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\"\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u001a\u0010&\u001a\u00020!8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;",
        "Lt01/c;",
        "n",
        "(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;",
        "Lcom/whoop/design/models/items/collapsiblerow/EndItem;",
        "",
        "isExpanded",
        "hasCollapsibleContent",
        "Lt01/k;",
        "m",
        "(Lcom/whoop/design/models/items/collapsiblerow/EndItem;ZZ)Lt01/k;",
        "",
        "formatted",
        "Ll83/k;",
        "l",
        "(Ljava/lang/String;)Ll83/k;",
        "",
        "seconds",
        "i",
        "(Ljava/lang/Float;)Ljava/lang/String;",
        "value",
        "h",
        "(F)Ljava/lang/String;",
        "sliderValue",
        "unit",
        "g",
        "(Ljava/lang/Float;Ljava/lang/String;)Ljava/lang/String;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "k",
        "()Ljb1/a;",
        "collapsibleRowNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "j",
        "()Llb1/y0;",
        "collapsibleRowModelMapper",
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

    new-instance v0, Lr70/b;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lr70/b;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lrb1/a;->a:Ll83/h;

    new-instance v0, Lr61/h;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lrb1/a;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;
    .locals 0

    invoke-static {p0}, Lrb1/a;->e(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrb1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ljb1/a;
    .locals 1

    invoke-static {}, Lrb1/a;->f()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lr61/h;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lr61/h;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lrb1/a$b;

    invoke-direct {v2, v0}, Lrb1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lrb1/a;->n(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Ljava/lang/Float;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const-string p0, "--"

    return-object p0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const/4 v1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v1, "%.1f"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-nez p1, :cond_1

    const-string p1, ""

    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final h(F)Ljava/lang/String;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v1, 0x1

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v1, "%.1f"

    invoke-static {v0, v1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Ljava/lang/Float;)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const-string p0, "--"

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    float-to-int p0, p0

    div-int/lit16 v0, p0, 0xe10

    rem-int/lit16 v1, p0, 0xe10

    div-int/lit8 v1, v1, 0x3c

    rem-int/lit8 p0, p0, 0x3c

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v4, "%02d"

    invoke-static {v2, v4, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {v2, v4, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j()Llb1/y0;
    .locals 1

    sget-object v0, Lrb1/a;->b:Llb1/y0;

    return-object v0
.end method

.method private static final k()Ljb1/a;
    .locals 1

    sget-object v0, Lrb1/a;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method public static final l(Ljava/lang/String;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "formatted"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "--"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x4

    if-lt v0, v2, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x3

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x3a

    if-eq v0, v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {v2, p0}, Lyb3/r;->X(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, p0}, Lyb3/r;->M0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_2
    :goto_0
    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final m(Lcom/whoop/design/models/items/collapsiblerow/EndItem;ZZ)Lt01/k;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object v0, Lt01/j;->FILLED_LIGHT:Lt01/j;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lt01/j;->MUTED:Lt01/j;

    goto :goto_0

    :goto_1
    const/4 v0, 0x1

    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    move v5, v0

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    move v5, p1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getFormat()Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    move-result-object p1

    sget-object p2, Lrb1/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    if-eq p1, v0, :cond_8

    const/4 p2, 0x2

    if-eq p1, p2, :cond_5

    const/4 p2, 0x3

    if-eq p1, p2, :cond_4

    const/4 p2, 0x4

    if-ne p1, p2, :cond_3

    new-instance v0, Lt01/k;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    move-object v1, p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getIcon()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    sget-object v3, Lt01/j;->MUTED:Lt01/j;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lt01/k;-><init>(Ljava/lang/String;Lgz0/m0;Lt01/j;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    new-instance v1, Lt01/k;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getSliderValue()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getUnit()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lrb1/a;->g(Ljava/lang/Float;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lt01/k;-><init>(Ljava/lang/String;Lgz0/m0;Lt01/j;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getSliderValue()Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Lrb1/a;->h(F)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    move-object v2, p0

    goto :goto_5

    :cond_7
    :goto_4
    const-string p0, "--"

    goto :goto_3

    :goto_5
    new-instance v1, Lt01/k;

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x30

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lt01/k;-><init>(Ljava/lang/String;Lgz0/m0;Lt01/j;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getSliderValue()Ljava/lang/Float;

    move-result-object p0

    invoke-static {p0}, Lrb1/a;->i(Ljava/lang/Float;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lrb1/a;->l(Ljava/lang/String;)Ll83/k;

    move-result-object p0

    iget-object p1, p0, Ll83/k;->w:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    iget-object p0, p0, Ll83/k;->x:Ljava/lang/Object;

    move-object v7, p0

    check-cast v7, Ljava/lang/String;

    new-instance v1, Lt01/k;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lt01/k;-><init>(Ljava/lang/String;Lgz0/m0;Lt01/j;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;)Lt01/c;
    .locals 13

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getStatus()Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;->EXPANDED:Lcom/whoop/design/models/items/collapsiblerow/CollapsibleStatus;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v6, v3

    goto :goto_0

    :cond_0
    move v6, v2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getCollapsibleContent()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v12, v0, 0x1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getLeadingItem()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lrb1/a;->k()Ljb1/a;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lm91/c0;

    const/4 v4, 0x3

    const/4 v7, 0x0

    invoke-direct {v0, v7, v7, v4, v1}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    move-object v7, v0

    goto :goto_1

    :cond_2
    move-object v7, v1

    :goto_1
    if-nez v6, :cond_3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getBody()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {}, Lrb1/a;->k()Ljb1/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    :cond_3
    move-object v8, v1

    if-eqz v6, :cond_4

    invoke-static {}, Lrb1/a;->k()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getCollapsibleContent()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_2
    move-object v9, v0

    goto :goto_3

    :cond_4
    sget-object v0, Lm83/y;->w:Lm83/y;

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getEndItem()Lcom/whoop/design/models/items/collapsiblerow/EndItem;

    move-result-object v0

    invoke-static {v0, v6, v12}, Lrb1/a;->m(Lcom/whoop/design/models/items/collapsiblerow/EndItem;ZZ)Lt01/k;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/CollapsibleRowModel;->getEndItem()Lcom/whoop/design/models/items/collapsiblerow/EndItem;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/collapsiblerow/EndItem;->getFormat()Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    move-result-object p0

    sget-object v0, Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;->TEXT:Lcom/whoop/design/models/items/collapsiblerow/EndItemFormat;

    if-ne p0, v0, :cond_5

    move v11, v3

    goto :goto_4

    :cond_5
    move v11, v2

    :goto_4
    new-instance v4, Lt01/c;

    invoke-direct/range {v4 .. v12}, Lt01/c;-><init>(Ljava/lang/String;ZLm91/u;Lm91/u;Ljava/util/List;Lt01/k;ZZ)V

    return-object v4
.end method
