.class public abstract Lsc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsc1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\'\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0001*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001b\u0010\u0017\u001a\u00020\u00038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;",
        "Lz31/d;",
        "displayStatus",
        "Ljb1/a;",
        "reducer",
        "Lz31/e;",
        "l",
        "(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;)Lz31/e;",
        "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;",
        "Lz31/b;",
        "k",
        "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;)Lz31/b;",
        "Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;",
        "Lz31/a;",
        "j",
        "(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;)Lz31/a;",
        "Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;",
        "i",
        "(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;)Lz31/d;",
        "a",
        "Ll83/h;",
        "d",
        "()Ljb1/a;",
        "targetRecommendationNestedReducer",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "targetRecommendationWidgetMapper",
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

    new-instance v0, Ls51/p;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Ls51/p;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lsc1/a;->a:Ll83/h;

    new-instance v0, Ls32/d;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lsc1/a;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;)Lz31/e;
    .locals 0

    invoke-static {p0}, Lsc1/a;->h(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;)Lz31/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Lsc1/a;->f()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsc1/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lsc1/a;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lsc1/a;->b:Llb1/y0;

    return-object v0
.end method

.method private static final f()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ls32/d;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ls32/d;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lsc1/a$b;

    invoke-direct {v2, v0}, Lsc1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;)Lz31/e;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p0, v0, v0, v1, v0}, Lsc1/a;->m(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;ILjava/lang/Object;)Lz31/e;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;)Lz31/d;
    .locals 1

    sget-object v0, Lsc1/a$a;->c:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lz31/d;->EDITED:Lz31/d;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lz31/d;->DISABLED:Lz31/d;

    return-object p0

    :cond_2
    sget-object p0, Lz31/d;->ENABLED:Lz31/d;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;)Lz31/a;
    .locals 1

    sget-object v0, Lsc1/a$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    sget-object p0, Lz31/a;->SECONDARY:Lz31/a;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lz31/a;->PRIMARY:Lz31/a;

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;)Lz31/b;
    .locals 1

    sget-object v0, Lsc1/a$a;->a:[I

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

    sget-object p0, Lz31/b;->UNKNOWN:Lz31/b;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lz31/b;->UPDATE_TARGET:Lz31/b;

    return-object p0

    :cond_2
    sget-object p0, Lz31/b;->START_WORKOUT:Lz31/b;

    return-object p0

    :cond_3
    sget-object p0, Lz31/b;->RESET:Lz31/b;

    return-object p0
.end method

.method public static final l(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;)Lz31/e;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;->getStatus()Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;

    move-result-object p1

    invoke-static {p1}, Lsc1/a;->i(Lcom/whoop/design/models/items/targetrecommendation/WidgetStatus;)Lz31/d;

    move-result-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;->getBody()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {p2, v2}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;->getFooterButtons()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;

    new-instance v2, Lz31/c;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;->getType()Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;

    move-result-object v3

    invoke-static {v3}, Lsc1/a;->k(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonType;)Lz31/b;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;->getStyle()Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;

    move-result-object v5

    invoke-static {v5}, Lsc1/a;->j(Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButtonStyle;)Lz31/a;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/targetrecommendation/WidgetFooterButton;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    invoke-direct {v2, v3, v4, v5, v0}, Lz31/c;-><init>(Lz31/b;Ljava/lang/String;Lz31/a;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p0, Lz31/e;

    invoke-direct {p0, p1, v1, p2}, Lz31/e;-><init>(Lz31/d;Ljava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method public static synthetic m(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;ILjava/lang/Object;)Lz31/e;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-static {}, Lsc1/a;->d()Ljb1/a;

    move-result-object p2

    :cond_1
    invoke-static {p0, p1, p2}, Lsc1/a;->l(Lcom/whoop/design/models/items/targetrecommendation/TargetRecommendationWidgetModel;Lz31/d;Ljb1/a;)Lz31/e;

    move-result-object p0

    return-object p0
.end method
