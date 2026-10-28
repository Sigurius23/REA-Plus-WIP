.class public final Lxf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u0010\r\u001a\u00020\u0007*\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lxf1/a;",
        "",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Ljb1/a;)V",
        "Ltf1/a$b;",
        "Lwf1/c;",
        "c",
        "(Ltf1/a$b;)Lwf1/c;",
        "Ltf1/c;",
        "Lwf1/c$b;",
        "dialog",
        "d",
        "(Ltf1/c;Lwf1/c$b;)Lwf1/c;",
        "",
        "spacing",
        "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;",
        "domainResult",
        "b",
        "(Ltf1/c;)Lwf1/c;",
        "Ljb1/a;",
        "feedback-survey_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ljb1/a;->c:I

    sput v0, Lxf1/a;->b:I

    return-void
.end method

.method public constructor <init>(Ljb1/a;)V
    .locals 1

    const-string v0, "reducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lxf1/a;->a:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    invoke-static {}, Lxf1/b;->b()Ljb1/a;

    move-result-object p1

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lxf1/a;-><init>(Ljb1/a;)V

    return-void
.end method

.method private final a(Ljava/lang/String;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;->NORMAL:Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;->COMPACT:Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;->COMPACT:Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;

    return-object p1
.end method

.method private final c(Ltf1/a$b;)Lwf1/c;
    .locals 10

    instance-of v0, p1, Ltf1/a$c;

    if-eqz v0, :cond_0

    new-instance v1, Lwf1/c;

    new-instance v2, Lwf1/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lwf1/c$c;-><init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lwf1/c;-><init>(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Ltf1/a$d;

    if-eqz v0, :cond_1

    new-instance v1, Lwf1/c;

    new-instance v2, Lwf1/c$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    check-cast p1, Ltf1/a$d;

    invoke-virtual {p1}, Ltf1/a$d;->a()Lwf1/a;

    move-result-object v4

    sget-object v6, Lwf1/a$f;->a:Lwf1/a$f;

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lwf1/c$c;-><init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lwf1/c;-><init>(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Ltf1/a$e;

    if-eqz v0, :cond_2

    new-instance v1, Lwf1/c;

    new-instance v2, Lwf1/c$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    check-cast p1, Ltf1/a$e;

    invoke-virtual {p1}, Ltf1/a$e;->a()Lwf1/a;

    move-result-object v4

    sget-object v6, Lwf1/a$f;->a:Lwf1/a$f;

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lwf1/c$c;-><init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lwf1/c;-><init>(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    instance-of p1, p1, Ltf1/a$a;

    if-eqz p1, :cond_3

    new-instance v0, Lwf1/c;

    new-instance v1, Lwf1/c$c;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->a()Lsz0/q0;

    move-result-object v2

    sget-object v3, Lwf1/a$f;->a:Lwf1/a$f;

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lwf1/c$c;-><init>(Lsz0/q0;Lwf1/a;Lwf1/a;Lwf1/a;Lwf1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lwf1/c;-><init>(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final d(Ltf1/c;Lwf1/c$b;)Lwf1/c;
    .locals 10

    invoke-virtual {p1}, Ltf1/c;->h()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;->getStickyButtons()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;->getText()Ljava/lang/String;

    move-result-object v1

    :cond_1
    sget-object v2, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyStickyModel;->getItems()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, p0, Lxf1/a;->a:Ljb1/a;

    invoke-virtual {v3, v0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    move-object v0, v2

    :cond_3
    new-instance v3, Lwf1/c$e;

    invoke-direct {v3, v1, v0}, Lwf1/c$e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1}, Ltf1/c;->h()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :cond_5
    invoke-virtual {p1}, Ltf1/c;->h()Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;->getSections()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;

    invoke-virtual {v4}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;->getInsetBottom()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-direct {p0, v5}, Lxf1/a;->a(Ljava/lang/String;)Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;

    move-result-object v5

    if-nez v5, :cond_7

    :cond_6
    sget-object v5, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;->COMPACT:Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;

    :cond_7
    new-instance v6, Lwf1/c$a;

    iget-object v7, p0, Lxf1/a;->a:Ljb1/a;

    invoke-virtual {v4}, Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v6, v4, v5}, Lwf1/c$a;-><init>(Ljava/util/List;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveySectionSpacingType;)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    invoke-virtual {p1}, Ltf1/c;->f()Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Ltf1/c;->e()Z

    move-result p1

    if-eqz p1, :cond_9

    const/4 p1, 0x1

    goto :goto_2

    :cond_9
    const/4 p1, 0x0

    :goto_2
    new-instance v7, Lwf1/c$d;

    invoke-direct {v7, v0, v2, p1, v3}, Lwf1/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLwf1/c$e;)V

    new-instance v4, Lwf1/c;

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v6, 0x0

    move-object v5, p2

    invoke-direct/range {v4 .. v9}, Lwf1/c;-><init>(Lwf1/c$b;Lwf1/c$c;Lwf1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method


# virtual methods
.method public final b(Ltf1/c;)Lwf1/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ltf1/c;->c()Ltf1/a;

    move-result-object v0

    instance-of v0, v0, Ltf1/a$b;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ltf1/c;->c()Ltf1/a;

    move-result-object p1

    check-cast p1, Ltf1/a$b;

    invoke-direct {p0, p1}, Lxf1/a;->c(Ltf1/a$b;)Lwf1/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lxf1/a;->d(Ltf1/c;Lwf1/c$b;)Lwf1/c;

    move-result-object p1

    return-object p1
.end method
