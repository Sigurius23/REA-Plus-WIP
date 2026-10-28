.class public final Lmw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lmw2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;",
        "progressIndicator",
        "Llw2/d;",
        "d",
        "(Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)Llw2/d;",
        "Liw2/b;",
        "domainResult",
        "Llw2/c;",
        "b",
        "(Liw2/b;)Llw2/c;",
        "what-to-expect_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmw2/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final d(Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)Llw2/d;
    .locals 28

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getCurrentStep()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getTotalSteps()I

    move-result v5

    sget-object v24, Lp01/h;->STEPS:Lp01/h;

    const/16 v0, 0x50

    int-to-float v0, v0

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v15

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v16

    new-instance v2, Lp01/b;

    const v26, 0xb83f4

    const/16 v27, 0x0

    const/4 v7, 0x0

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/high16 v18, 0x41900000    # 18.0f

    const/high16 v19, 0x41600000    # 14.0f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v25, 0x0

    move/from16 v17, v0

    move-object v4, v2

    invoke-direct/range {v4 .. v27}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getTotalSteps()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getCurrentStep()I

    move-result v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v4, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getCurrentStep()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;->getCircularProgressIndicator()Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whattoexpect/domain/models/CurrentProgressSteps;->getTotalSteps()I

    move-result v0

    const-string v1, "/"

    invoke-static {v0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v1, Llw2/d;

    invoke-direct/range {v1 .. v6}, Llw2/d;-><init>(Lp01/b;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final b(Liw2/b;)Llw2/c;
    .locals 14

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Liw2/b$b;->a:Liw2/b$b;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Llw2/c;

    const/16 v11, 0x1fc

    const/4 v12, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Llw2/c;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Ls21/h;Llw2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    sget-object v0, Liw2/b$a;->a:Liw2/b$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Llw2/c;

    const/16 v11, 0x1fc

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Llw2/c;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Ls21/h;Llw2/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Liw2/b$c;

    if-eqz v0, :cond_4

    new-instance v0, Lmm1/h;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lmm1/h;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    check-cast p1, Liw2/b$c;

    invoke-virtual {p1}, Liw2/b$c;->c()Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getToolbarTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getDailyProgress()Lcom/whoop/whattoexpect/domain/models/DailyProgress;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance v8, Lcom/whoop/whattoexpect/domain/models/DailyProgress;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/whattoexpect/domain/models/DailyProgress;-><init>(Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    move-object v8, v2

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getItems()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {p1}, Liw2/b$c;->d()Ls21/h;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;->getProgressIndicator()Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-direct {p0, p1}, Lmw2/a;->d(Lcom/whoop/whattoexpect/domain/models/ProgressIndicator;)Llw2/d;

    move-result-object p1

    :goto_1
    move-object v11, p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    new-instance v2, Llw2/c;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v11}, Llw2/c;-><init>(ZZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/whattoexpect/domain/models/DailyProgress;Ljava/util/List;Ls21/h;Llw2/d;)V

    return-object v2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
