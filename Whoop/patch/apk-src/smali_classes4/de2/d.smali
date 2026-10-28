.class public final Lde2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00172\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lde2/d;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lde2/e;",
        "termsOfUseRepository",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lde2/e;)V",
        "Lde2/c;",
        "domainState",
        "d",
        "(Lde2/c;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "",
        "selected",
        "g",
        "(Lde2/c;Ljava/lang/String;Z)Lde2/c;",
        "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;",
        "e",
        "()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;",
        "Lec3/l;",
        "Lde2/b;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lde2/e;",
        "shepherd_release"
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
.field private final a:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final b:Ltr2/n;

.field private final c:Lde2/e;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Ltr2/n;Lde2/e;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "termsOfUseRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde2/d;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p2, p0, Lde2/d;->b:Ltr2/n;

    iput-object p3, p0, Lde2/d;->c:Lde2/e;

    return-void
.end method

.method public static final synthetic a(Lde2/d;Lde2/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lde2/d;->d(Lde2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lde2/d;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lde2/d;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method public static final synthetic c(Lde2/d;Lde2/c;Ljava/lang/String;Z)Lde2/c;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lde2/d;->g(Lde2/c;Ljava/lang/String;Z)Lde2/c;

    move-result-object p0

    return-object p0
.end method

.method private final d(Lde2/c;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde2/c;",
            "Lq83/d<",
            "-",
            "Lde2/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lde2/d$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lde2/d$a;

    iget v3, v2, Lde2/d$a;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lde2/d$a;->z:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lde2/d$a;

    invoke-direct {v2, v0, v1}, Lde2/d$a;-><init>(Lde2/d;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lde2/d$a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lde2/d$a;->z:I

    const/4 v4, 0x1

    const/4 v11, 0x0

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v8, Lde2/d$a;->w:Ljava/lang/Object;

    check-cast v2, Lde2/c;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v3, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v0, Lde2/d;->b:Ltr2/n;

    new-instance v7, Lde2/d$b;

    invoke-direct {v7, v0, v11}, Lde2/d$b;-><init>(Lde2/d;Lq83/d;)V

    move-object/from16 v12, p1

    iput-object v12, v8, Lde2/d$a;->w:Ljava/lang/Object;

    iput v4, v8, Lde2/d$a;->z:I

    const/4 v5, 0x0

    const-string v6, "Failed to fetch terms of use screen"

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v4, v1

    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, v12

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v3, v1, Lu02/a$b;

    if-eqz v3, :cond_4

    sget-object v1, Lde2/f$a;->a:Lde2/f$a;

    const/4 v3, 0x2

    invoke-static {v2, v1, v11, v3, v11}, Lde2/c;->b(Lde2/c;Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;ILjava/lang/Object;)Lde2/c;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v3, v1, Lu02/a$c;

    if-eqz v3, :cond_5

    sget-object v3, Lde2/f$b;->a:Lde2/f$b;

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;->getAcknowledgeAllToggle()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;

    move-result-object v6

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;->copy$default(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;

    move-result-object v13

    const/16 v16, 0x37f

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;->copy$default(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lde2/c;->a(Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;)Lde2/c;

    move-result-object v1

    return-object v1

    :cond_5
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final e()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;
    .locals 5

    new-instance v0, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    const-string v1, "AGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;-><init>(Ljava/lang/String;Z)V

    new-instance v1, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    const-string v3, "LOCATION"

    invoke-direct {v1, v3, v2}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;-><init>(Ljava/lang/String;Z)V

    new-instance v2, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    const-string v3, "PREVIOUS_AFIB"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4}, Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;-><init>(Ljava/lang/String;Z)V

    filled-new-array {v0, v1, v2}, [Lcom/whoop/shepherd/feature/terms/domain/models/TermsOfUseCriteriaItem;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    invoke-direct {v1, v0}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;-><init>(Ljava/util/List;)V

    return-object v1
.end method

.method private final g(Lde2/c;Ljava/lang/String;Z)Lde2/c;
    .locals 17

    move-object/from16 v0, p1

    invoke-virtual {v0}, Lde2/c;->c()Lde2/f;

    move-result-object v1

    sget-object v2, Lde2/f$b;->a:Lde2/f$b;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v1, p0

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Lde2/c;->d()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;->getAcknowledgeAllToggle()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;->getId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, p2

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move/from16 v6, p3

    invoke-static/range {v3 .. v8}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;->copy$default(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;

    move-result-object v3

    :cond_2
    move-object v12, v3

    if-nez v12, :cond_3

    goto :goto_0

    :cond_3
    move-object/from16 v1, p0

    iget-object v3, v1, Lde2/d;->c:Lde2/e;

    invoke-virtual {v12}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;->getSelected()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-direct {v1}, Lde2/d;->e()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;

    move-result-object v4

    goto :goto_1

    :cond_4
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v4}, Lde2/e;->b(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;)V

    invoke-virtual {v0}, Lde2/c;->d()Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    move-result-object v4

    const/16 v15, 0x37f

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;->copy$default(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/shepherd/feature/terms/domain/models/SupportedRegionPicker;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsToggleItem;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lde2/c;->a(Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;)Lde2/c;

    move-result-object v0

    :goto_2
    return-object v0
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lde2/c;

    sget-object v1, Lde2/f$c;->a:Lde2/f$c;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lde2/c;-><init>(Lde2/f;Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lde2/d$c;

    invoke-direct {v1, p0, v3}, Lde2/d$c;-><init>(Lde2/d;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
