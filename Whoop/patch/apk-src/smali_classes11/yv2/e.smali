.class public abstract Lyv2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\"\u001a\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;",
        "Ljava/time/LocalDate;",
        "today",
        "Lzv2/f;",
        "m",
        "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;)Lzv2/f;",
        "Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;",
        "Lzv2/b;",
        "k",
        "(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lzv2/b;",
        "",
        "l",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Ljb1/a;",
        "b",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "oneRepMaxMeasurementDesignItemReducer",
        "Lm91/p;",
        "c",
        "Lm91/p;",
        "f",
        "()Lm91/p;",
        "oneRepMaxMeasurementDesignItemViewFactory",
        "weightlifting_release"
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

.field private static final b:Ljb1/a;

.field private static final c:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "OneRepMaxMeasurementReducer"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lyv2/e;->a:Ltr2/n;

    new-instance v0, Lyv0/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyv2/e;->b:Ljb1/a;

    new-instance v0, Lyv0/h;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lyv2/e;->c:Lm91/p;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyv2/e;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyv2/e;->j(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)Lzv2/f;
    .locals 0

    invoke-static {p0}, Lyv2/e;->i(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)Lzv2/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyv2/e;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lyv2/e;->b:Ljb1/a;

    return-object v0
.end method

.method public static final f()Lm91/p;
    .locals 1

    sget-object v0, Lyv2/e;->c:Lm91/p;

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyv0/h;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyv0/h;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lyv0/h;-><init>(I)V

    const-class v1, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyv2/e$a;

    invoke-direct {v2, v0}, Lyv2/e$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)Lzv2/f;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lyv2/e;->n(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;ILjava/lang/Object;)Lzv2/f;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lzv2/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lzv2/c;

    invoke-direct {v1}, Lzv2/c;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lzv2/b;
    .locals 6

    new-instance v0, Lzv2/b;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->getDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->getPrimaryButton()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->getSecondaryButton()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;->getValuePrompt()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lzv2/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final l(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {p0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p0
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v1, Lyv2/e;->a:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Unparseable one rep max date string"

    invoke-interface {v1, v3, p0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final m(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;)Lzv2/f;
    .locals 23

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "today"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getMinimumDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyv2/e;->l(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getDate()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v3}, Lyv2/e;->l(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    const/4 v5, 0x0

    if-nez v1, :cond_1

    sget-object v6, Lyv2/e;->a:Ltr2/n;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getMinimumDate()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Unparseable one rep max minimum_date: "

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v8, v5, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getDate()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_2

    if-nez v3, :cond_2

    sget-object v6, Lyv2/e;->a:Ltr2/n;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getDate()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Unparseable one rep max date: "

    invoke-static {v8, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v6, v7, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    if-nez v1, :cond_3

    move-object v1, v0

    :cond_3
    filled-new-array {v1, v3}, [Ljava/time/LocalDate;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->X0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/time/LocalDate;

    if-nez v1, :cond_4

    move-object v1, v0

    :cond_4
    invoke-virtual {v1, v0}, Ljava/time/LocalDate;->isAfter(Ljava/time/chrono/ChronoLocalDate;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v1, v0

    :cond_5
    if-nez v3, :cond_6

    move-object v3, v0

    :cond_6
    invoke-static {v3, v1, v0}, Le93/b;->s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/time/LocalDate;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->getDeleteButtonTitle()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    move-object v5, v4

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->getDeleteConfirmDialog()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;

    move-result-object v6

    if-eqz v6, :cond_9

    if-eqz v5, :cond_8

    goto :goto_2

    :cond_8
    move-object v6, v4

    :goto_2
    if-eqz v6, :cond_9

    invoke-static {v6}, Lyv2/e;->k(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lzv2/b;

    move-result-object v6

    move-object/from16 v21, v6

    goto :goto_3

    :cond_9
    move-object/from16 v21, v4

    :goto_3
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getExerciseSummary()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;->getTitleDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getExerciseSummary()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxExerciseSummary;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getDateSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxDateSection;->getDatePrompt()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v10, "toString(...)"

    invoke-static {v1, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getValueTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getValue()Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_a

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    :cond_a
    move-object v12, v4

    :goto_4
    if-nez v12, :cond_b

    const-string v12, ""

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getUnit()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getMinValue()I

    move-result v14

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getMaxValue()I

    move-result v15

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getValueSection()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxValueSection;->getErrorMessage()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->getCaption()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_c

    invoke-static/range {v17 .. v17}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_c

    goto :goto_5

    :cond_c
    move-object/from16 v17, v4

    :goto_5
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->getSaveButtonTitle()Ljava/lang/String;

    move-result-object v18

    if-eqz v21, :cond_d

    move-object/from16 v19, v5

    goto :goto_6

    :cond_d
    move-object/from16 v19, v4

    :goto_6
    invoke-virtual {v2}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;->getFooter()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxFooter;->getSaveConfirmDialog()Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;

    move-result-object v4

    invoke-static {v4}, Lyv2/e;->k(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxConfirmDialog;)Lzv2/b;

    move-result-object v20

    new-instance v2, Lzv2/f;

    move-object v4, v9

    move-object v9, v3

    move-object v3, v6

    move-object v6, v4

    move-object/from16 v22, p0

    move-object v4, v7

    move-object v5, v8

    move-object v8, v0

    move-object v7, v1

    invoke-direct/range {v2 .. v22}, Lzv2/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzv2/b;Lzv2/b;Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;)V

    return-object v2
.end method

.method public static synthetic n(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;ILjava/lang/Object;)Lzv2/f;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p1

    const-string p2, "now(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-static {p0, p1}, Lyv2/e;->m(Lcom/whoop/weightlifting/feature/onerepmax/manualentry/models/OneRepMaxMeasurementModel;Ljava/time/LocalDate;)Lzv2/f;

    move-result-object p0

    return-object p0
.end method
