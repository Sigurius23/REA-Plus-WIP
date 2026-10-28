.class public abstract Lpb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;",
        "Lf51/l;",
        "f",
        "(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;)Lf51/l;",
        "Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;",
        "Lf51/m;",
        "g",
        "(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;)Lf51/m;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "impactMagnitudeQuestionsMapper",
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

    new-instance v0, Lnm1/g;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lpb1/d;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;)Lf51/k;
    .locals 0

    invoke-static {p0}, Lpb1/d;->e(Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;)Lf51/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpb1/d;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Lpb1/d;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lnm1/g;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lpb1/d$a;

    invoke-direct {v2, v0}, Lpb1/d$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;)Lf51/k;
    .locals 3

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;->getMagnitudeQuestions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;

    invoke-static {v2}, Lpb1/d;->f(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;)Lf51/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/ImpactMagnitudeQuestionsModel;->getAdditionalInfoText()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    new-instance v0, Lf51/k;

    invoke-direct {v0, v1, p0}, Lf51/k;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;)Lf51/l;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionGroup;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;

    invoke-static {v2}, Lpb1/d;->g(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;)Lf51/m;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lf51/l;

    invoke-direct {p0, v0, v1}, Lf51/l;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;)Lf51/m;
    .locals 4

    new-instance v0, Lf51/m;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;->getQuestionTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;->getQuestionMagnitude()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v3, Llb1/h2;->a:Llb1/h2;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/behaviordetails/MagnitudeQuestionItem;->getQuestionStyle()Lcom/whoop/design/models/items/ImpactStyle;

    move-result-object p0

    invoke-virtual {v3, p0}, Llb1/h2;->d(Lcom/whoop/design/models/items/ImpactStyle;)Ly81/f;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lf51/m;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    return-object v0
.end method
