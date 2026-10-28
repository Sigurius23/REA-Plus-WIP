.class public abstract Lqb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\r\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;",
        "Lp01/b;",
        "f",
        "(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "circularProgressIndicatorMapper",
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

    const-string v1, "CircularProgressIndicatorMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lqb1/a;->a:Ltr2/n;

    new-instance v0, Lq80/f;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lq80/f;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lqb1/a;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;
    .locals 0

    invoke-static {p0}, Lqb1/a;->d(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqb1/a;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq80/f;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lq80/f;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lqb1/a$a;

    invoke-direct {v2, v0}, Lqb1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lqb1/a;->f(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Lqb1/a;->b:Llb1/y0;

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;)Lp01/b;
    .locals 27

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v0

    sget-object v23, Lp01/h;->STEPS:Lp01/h;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTextDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getCurrentStep()I

    move-result v5

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTotalSteps()I

    move-result v4

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v0

    sget-object v3, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getId()Ljava/lang/String;

    move-result-object v24

    new-instance v3, Lp01/b;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const v25, 0x3ffb4

    const/16 v26, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v3 .. v26}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v0

    sget-object v23, Lp01/h;->PERCENTAGE:Lp01/h;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getTextDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getPercentage()D

    move-result-wide v3

    const/16 v5, 0x64

    int-to-double v5, v5

    div-double/2addr v3, v5

    double-to-float v6, v3

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v0

    sget-object v3, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getId()Ljava/lang/String;

    move-result-object v24

    new-instance v3, Lp01/b;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const v25, 0x3ffb3

    const/16 v26, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-direct/range {v3 .. v26}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    sget-object v0, Lqb1/a;->a:Ltr2/n;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "CircularProgressIndicatorModel with id "

    const-string v4, " has no valid current progress"

    invoke-static {v3, v1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lp01/b;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/circularprogressindicator/CircularProgressIndicatorModel;->getId()Ljava/lang/String;

    move-result-object v24

    const v25, 0x7ffff

    const/16 v26, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v3 .. v26}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
