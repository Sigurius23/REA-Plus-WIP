.class public abstract Llb1/n2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a!\u0010\n\u001a\u00020\t*\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a%\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000c*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0003\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\"\u001a\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lw71/y;",
        "m",
        "(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;",
        "j",
        "",
        "Lcom/whoop/design/models/items/JournalQuestionChoice;",
        "",
        "value",
        "",
        "f",
        "(Ljava/util/List;I)Ljava/lang/String;",
        "",
        "i",
        "(Ljava/util/List;)Ljava/util/Map;",
        "Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;",
        "g",
        "(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;)Lw71/y;",
        "l",
        "",
        "k",
        "(Lcom/whoop/design/models/DesignSystemModel;)Ljava/lang/Long;",
        "h",
        "(Ljava/lang/String;)Ljava/lang/Long;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "journalEntryWidgetMapper",
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
.field private static final a:Ltr2/n;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "JournalEntryWidgetMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Llb1/n2;->a:Ltr2/n;

    new-instance v0, Llb1/m;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/n2;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/JournalEntryWidgetModel;)Ll21/c;
    .locals 0

    invoke-static {p0}, Llb1/n2;->e(Lcom/whoop/design/models/items/JournalEntryWidgetModel;)Ll21/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n2;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/n2;->b:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/JournalEntryWidgetModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n2$a;

    invoke-direct {v2, v0}, Llb1/n2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/JournalEntryWidgetModel;)Ll21/c;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getButton()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getTimeQuestion()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v2}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_1

    invoke-static {v2}, Llb1/n2;->l(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getMagnitudeQuestion()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-static {v4}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getAnsweredYesQuestion()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Llb1/n2;->m(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;

    move-result-object v5

    goto :goto_3

    :cond_3
    move-object v5, v0

    :goto_3
    if-eqz v4, :cond_4

    invoke-static {v4}, Llb1/n2;->j(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object v6, v0

    :goto_4
    filled-new-array {v5, v6, v3}, [Lw71/y;

    move-result-object v5

    invoke-static {v5}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v6

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lw71/y;

    if-eqz v7, :cond_5

    invoke-virtual {v6, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_5
    move-object v7, v5

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-le v7, v1, :cond_6

    new-instance v9, Lhy0/e;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v9}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-static {v5, v1}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v6, v5}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v6}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalEntryWidgetModel;->getStatus()Lcom/whoop/design/models/items/JournalEntryStatus;

    move-result-object p0

    sget-object v9, Lcom/whoop/design/models/items/JournalEntryStatus;->COMPLETED:Lcom/whoop/design/models/items/JournalEntryStatus;

    if-ne p0, v9, :cond_7

    :goto_5
    move v9, v1

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    goto :goto_5

    :goto_6
    if-eqz v3, :cond_8

    invoke-static {v2}, Llb1/n2;->k(Lcom/whoop/design/models/DesignSystemModel;)Ljava/lang/Long;

    move-result-object p0

    move-object v10, p0

    goto :goto_7

    :cond_8
    move-object v10, v0

    :goto_7
    instance-of p0, v4, Lcom/whoop/design/models/items/JournalQuestionSliderModel;

    if-eqz p0, :cond_9

    check-cast v4, Lcom/whoop/design/models/items/JournalQuestionSliderModel;

    goto :goto_8

    :cond_9
    move-object v4, v0

    :goto_8
    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/design/models/items/JournalQuestionSliderModel;->getChoices()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-static {p0}, Llb1/n2;->i(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    :cond_a
    if-nez v0, :cond_b

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_b
    move-object v11, v0

    new-instance v4, Ll21/c;

    invoke-direct/range {v4 .. v11}, Ll21/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm91/u;ZLjava/lang/Long;Ljava/util/Map;)V

    return-object v4
.end method

.method private static final f(Ljava/util/List;I)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalQuestionChoice;",
            ">;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/models/items/JournalQuestionChoice;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/JournalQuestionChoice;->getValue()D

    move-result-wide v2

    double-to-int v2, v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionChoice;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionChoice;->getLabel()Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    const-string p0, ""

    return-object p0

    :cond_3
    return-object v1
.end method

.method private static final g(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;)Lw71/y;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getMinimumInclusive()Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getMaximumInclusive()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, v6, v8

    const-string v6, " decimalPlaces="

    const-string v7, " max="

    const/4 v10, 0x0

    if-gtz v0, :cond_6

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    move-result-wide v11

    cmpg-double v0, v11, v8

    if-gtz v0, :cond_6

    const-wide/16 v8, 0x0

    cmpg-double v0, v2, v8

    if-ltz v0, :cond_6

    cmpl-double v0, v2, v4

    if-gtz v0, :cond_6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v0

    if-gez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v0

    invoke-static {v2, v3, v4, v5, v0}, Llb1/v2;->a(DDI)Li93/f;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Llb1/n2;->a:Ltr2/n;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v8

    const-string v9, "Numeric-input range collapses once aligned: min="

    invoke-static {v9, v2, v3, v7}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getInitial()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getInitial()Ljava/lang/Double;

    move-result-object v2

    invoke-interface {v0, v2}, Li93/f;->c(Ljava/lang/Comparable;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getInitial()Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v4

    invoke-static {v2, v3, v4}, Llb1/v2;->b(DI)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    sget-object v2, Llb1/n2;->a:Ltr2/n;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getInitial()Ljava/lang/Double;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Numeric-input initial "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is outside or off the grid of "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_3
    new-instance v4, Lw71/y;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getUnits()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_4

    move-object v8, v2

    goto :goto_0

    :cond_4
    move-object v8, v1

    :goto_0
    new-instance v9, Lw71/f0$b;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getInitial()Ljava/lang/Double;

    move-result-object v10

    invoke-interface {v0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ljava/lang/Double;

    invoke-interface {v0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Ljava/lang/Double;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getUnits()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v14, v2

    goto :goto_1

    :cond_5
    move-object v14, v0

    :goto_1
    invoke-direct/range {v9 .. v14}, Lw71/f0$b;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ILjava/lang/String;)V

    const/16 v15, 0x3b2

    const/16 v16, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_6
    :goto_2
    sget-object v0, Llb1/n2;->a:Ltr2/n;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;->getDecimalPlaces()I

    move-result v8

    const-string v9, "Unusable numeric-input bounds in journal entry widget: min="

    invoke-static {v9, v2, v3, v7}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    return-object v1
.end method

.method private static final h(Ljava/lang/String;)Ljava/lang/Long;
    .locals 3

    :try_start_0
    invoke-static {p0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/BaseDateTime;->getMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    sget-object v1, Llb1/n2;->a:Ltr2/n;

    const-string v2, "Unparseable ISO-8601 instant in journal entry widget: "

    invoke-static {v2, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p0, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final i(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/JournalQuestionChoice;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionChoice;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionChoice;->getValue()D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionChoice;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static final j(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;
    .locals 19

    move-object/from16 v0, p0

    instance-of v1, v0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v3, Lw71/y;

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionStepperModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->getLabel()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Lw71/f0$d;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->getInitial()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    double-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->getMinimumInclusive()D

    move-result-wide v4

    double-to-int v1, v4

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionStepperModel;->getMaximumInclusive()D

    move-result-wide v4

    double-to-int v0, v4

    invoke-direct {v10, v2, v1, v0}, Lw71/f0$d;-><init>(Ljava/lang/Integer;II)V

    const/16 v14, 0x3ba

    const/4 v15, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of v1, v0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;

    invoke-static {v0}, Llb1/n2;->g(Lcom/whoop/design/models/items/JournalQuestionNumericInputModel;)Lw71/y;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lcom/whoop/design/models/items/JournalQuestionSliderModel;

    if-eqz v1, :cond_9

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionSliderModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionSliderModel;->getChoices()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/JournalQuestionChoice;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/JournalQuestionChoice;->getValue()D

    move-result-wide v4

    double-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionSliderModel;->getInitial()Ljava/lang/Double;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    double-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_1
    move-object v5, v1

    goto :goto_2

    :cond_4
    invoke-static {v3}, Lm83/s;->X0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionSliderModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3}, Lm83/s;->X0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    const/4 v6, 0x0

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_3

    :cond_5
    move v4, v6

    :goto_3
    invoke-static {v3}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :cond_6
    move v7, v6

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionSliderModel;->getChoices()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v2}, Llb1/n2;->f(Ljava/util/List;I)Ljava/lang/String;

    move-result-object v2

    :cond_7
    if-nez v2, :cond_8

    const-string v2, ""

    :cond_8
    move-object v9, v2

    new-instance v13, Lw71/f0$e;

    const/4 v8, 0x0

    const/16 v10, 0x8

    const/4 v11, 0x0

    move v6, v4

    move-object v4, v13

    invoke-direct/range {v4 .. v11}, Lw71/f0$e;-><init>(Ljava/lang/Integer;IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lw71/y;

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x3ba

    const/16 v18, 0x0

    move-object v9, v1

    invoke-direct/range {v6 .. v18}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_9
    return-object v2
.end method

.method private static final k(Lcom/whoop/design/models/DesignSystemModel;)Ljava/lang/Long;
    .locals 9

    instance-of v0, p0, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getLowerBound()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getUpperBound()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v0, :cond_1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getInitial()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p0}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v0, v1, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    invoke-static/range {v3 .. v8}, Le93/b;->p(JJJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    return-object v1

    :cond_2
    instance-of v0, p0, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;

    if-eqz v0, :cond_3

    check-cast p0, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;->getInitial()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-static {p0}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v1
.end method

.method private static final l(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;
    .locals 28

    move-object/from16 v0, p0

    instance-of v1, v0, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;

    const-string v2, "h:mm a"

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getLowerBound()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getUpperBound()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v1, :cond_2

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getInitial()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    :goto_0
    move-wide v13, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_0

    :goto_1
    new-instance v15, Lw71/y;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeSliderModel;->getLabel()Ljava/lang/String;

    move-result-object v18

    new-instance v22, Lw71/f0$g;

    new-instance v0, Lorg/joda/time/DateTime;

    invoke-direct {v0, v13, v14}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    move-object/from16 v7, v22

    invoke-direct/range {v7 .. v14}, Lw71/f0$g;-><init>(Lcom/whoop/design/util/TextResource;JJJ)V

    const/16 v26, 0x3ba

    const/16 v27, 0x0

    const/16 v16, 0x2

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v15 .. v27}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v15

    :cond_2
    :goto_2
    return-object v3

    :cond_3
    instance-of v1, v0, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;->getLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/design/models/items/JournalQuestionTimeInputModel;->getInitial()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Llb1/n2;->h(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    new-instance v3, Lorg/joda/time/DateTime;

    invoke-direct {v3, v0, v1}, Lorg/joda/time/DateTime;-><init>(J)V

    invoke-virtual {v3, v2}, Lorg/joda/time/base/AbstractDateTime;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_4
    if-nez v3, :cond_5

    const-string v3, ""

    :cond_5
    new-instance v11, Lw71/f0$f;

    invoke-direct {v11, v3}, Lw71/f0$f;-><init>(Ljava/lang/String;)V

    new-instance v4, Lw71/y;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3ba

    const/16 v16, 0x0

    invoke-direct/range {v4 .. v16}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_6
    return-object v3
.end method

.method private static final m(Lcom/whoop/design/models/DesignSystemModel;)Lw71/y;
    .locals 15

    instance-of v0, p0, Lcom/whoop/design/models/items/JournalQuestionYesNoModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/items/JournalQuestionYesNoModel;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    new-instance v2, Lw71/y;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionYesNoModel;->getLabel()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Lw71/f0$i;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/JournalQuestionYesNoModel;->getInitial()Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {v9, p0}, Lw71/f0$i;-><init>(Ljava/lang/Boolean;)V

    const/16 v13, 0x3ba

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lw71/y;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLw71/f0;Lp01/b;Lcom/whoop/navigation/e;Lv41/f0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
