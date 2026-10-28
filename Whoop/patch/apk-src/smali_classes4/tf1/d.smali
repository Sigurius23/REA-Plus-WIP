.class public final Ltf1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ltf1/b;",
        "Ltf1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00032\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00142\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Ltf1/d;",
        "Lod1/g;",
        "Ltf1/b;",
        "Ltf1/c;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lu02/c;",
        "apiClient",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lu02/c;Ltr2/n;)V",
        "previousState",
        "action",
        "h",
        "(Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;",
        "g",
        "(Ltf1/c;Lq83/d;)Ljava/lang/Object;",
        "",
        "manualRefresh",
        "Lec3/l;",
        "j",
        "(Z)Lec3/l;",
        "Lpm0/a$c;",
        "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;",
        "cacheResult",
        "i",
        "(Lpm0/a$c;)Ltf1/c;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Lu02/c;",
        "c",
        "Ltr2/n;",
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


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lu02/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Lu02/c;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltf1/d;->a:Lnm0/e;

    .line 3
    iput-object p2, p0, Ltf1/d;->b:Lu02/c;

    .line 4
    iput-object p3, p0, Ltf1/d;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lu02/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "FeedbackSurveyInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ltf1/d;-><init>(Lnm0/e;Lu02/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Ltf1/d;Ltf1/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltf1/d;->g(Ltf1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltf1/d;)Lu02/c;
    .locals 0

    iget-object p0, p0, Ltf1/d;->b:Lu02/c;

    return-object p0
.end method

.method public static final synthetic e(Ltf1/d;Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltf1/d;->h(Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Ltf1/d;Lpm0/a$c;)Ltf1/c;
    .locals 0

    invoke-direct {p0, p1}, Ltf1/d;->i(Lpm0/a$c;)Ltf1/c;

    move-result-object p0

    return-object p0
.end method

.method private final g(Ltf1/c;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf1/c;",
            "Lq83/d<",
            "-",
            "Ltf1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltf1/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltf1/d$a;

    iget v1, v0, Ltf1/d$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltf1/d$a;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ltf1/d$a;

    invoke-direct {v0, p0, p2}, Ltf1/d$a;-><init>(Ltf1/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ltf1/d$a;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ltf1/d$a;->E:I

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-ne v1, v2, :cond_2

    iget-object p1, v6, Ltf1/d$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/feedbacksurvey/domain/CancelSubscriptionRequest;

    iget-object p1, v6, Ltf1/d$a;->w:Ljava/lang/Object;

    check-cast p1, Ltf1/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p1

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lcom/whoop/feedbacksurvey/domain/CancelSubscriptionRequest;

    new-instance v1, Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;

    invoke-virtual {p1}, Ltf1/c;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ltf1/c;->d()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v3, v4}, Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p2, v1}, Lcom/whoop/feedbacksurvey/domain/CancelSubscriptionRequest;-><init>(Lcom/whoop/feedbacksurvey/domain/models/CancelSubscriptionRequestBody;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Ltf1/d;->c:Ltr2/n;

    new-instance v5, Ltf1/d$b;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p2, v4}, Ltf1/d$b;-><init>(Ltf1/d;Lcom/whoop/feedbacksurvey/domain/CancelSubscriptionRequest;Lq83/d;)V

    iput-object p1, v6, Ltf1/d$a;->w:Ljava/lang/Object;

    iput-object v4, v6, Ltf1/d$a;->x:Ljava/lang/Object;

    iput v3, v6, Ltf1/d$a;->E:I

    const/4 v3, 0x0

    const-string v4, "Failed to cancel subscription"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    return-object v0

    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    if-eqz p1, :cond_4

    sget-object v4, Ltf1/a$a;->a:Ltf1/a$a;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, p2, Lu02/a$b$a;

    if-eqz p1, :cond_5

    new-instance v4, Ltf1/a$e;

    sget-object p1, Lwf1/a$d;->a:Lwf1/a$d;

    invoke-direct {v4, p1}, Ltf1/a$e;-><init>(Lwf1/a;)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, p2, Lu02/a$b$b;

    if-eqz p1, :cond_6

    new-instance v4, Ltf1/a$d;

    sget-object p1, Lwf1/a$d;->a:Lwf1/a$d;

    invoke-direct {v4, p1}, Ltf1/a$d;-><init>(Lwf1/a;)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf1/c;",
            "Ltf1/b;",
            "Lq83/d<",
            "-",
            "Ltf1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltf1/b$b;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p2, Ltf1/b$a;

    if-eqz v0, :cond_1

    invoke-direct {p0, p1, p3}, Ltf1/d;->g(Ltf1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p3, p2, Ltf1/b$c;

    if-eqz p3, :cond_2

    check-cast p2, Ltf1/b$c;

    invoke-virtual {p2}, Ltf1/b$c;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v7, 0x3d

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v8}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v0, p1

    instance-of p1, p2, Ltf1/b$d;

    if-eqz p1, :cond_3

    check-cast p2, Ltf1/b$d;

    invoke-virtual {p2}, Ltf1/b$d;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0
.end method

.method private final i(Lpm0/a$c;)Ltf1/c;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpm0/a$c<",
            "Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;",
            ">;)",
            "Ltf1/c;"
        }
    .end annotation

    invoke-static {p1}, Lpm0/b;->a(Lpm0/a$b;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance v0, Ltf1/c;

    new-instance v3, Ltf1/a$e;

    sget-object p1, Lwf1/a$i;->a:Lwf1/a$i;

    invoke-direct {v3, p1}, Ltf1/a$e;-><init>(Lwf1/a;)V

    const/16 v7, 0x3b

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Ltf1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance v1, Ltf1/c;

    new-instance v4, Ltf1/a$d;

    sget-object p1, Lwf1/a$i;->a:Lwf1/a$i;

    invoke-direct {v4, p1}, Ltf1/a$d;-><init>(Lwf1/a;)V

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Ltf1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final j(Z)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/feedbacksurvey/domain/GetFeedbackSurveyRequest;

    invoke-direct {v0}, Lcom/whoop/feedbacksurvey/domain/GetFeedbackSurveyRequest;-><init>()V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const-string v0, "FEEDBACK_SURVEY_SCOPE"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v0, v3, v2, v3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Ltf1/d;->a:Lnm0/e;

    new-instance v2, Ltf1/d$i;

    invoke-direct {v2, v3, v1}, Ltf1/d$i;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Ltf1/d$j;

    invoke-direct {v1, v0, p1, p0}, Ltf1/d$j;-><init>(Lec3/l;ZLtf1/d;)V

    return-object v1
.end method

.method public static synthetic k(Ltf1/d;ZILjava/lang/Object;)Lec3/l;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Ltf1/d;->j(Z)Lec3/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltf1/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ltf1/d$c;-><init>(Lq83/d;Ltf1/d;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Ltf1/c;

    sget-object v5, Ltf1/a$c;->a:Ltf1/a$c;

    const/16 v9, 0x3b

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Ltf1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ltf1/d$g;

    invoke-direct {v0, p0, v1}, Ltf1/d$g;-><init>(Ltf1/d;Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
