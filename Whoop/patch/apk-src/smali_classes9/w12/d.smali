.class public abstract Lw12/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm91/p;",
        "a",
        "Lm91/p;",
        "j",
        "()Lm91/p;",
        "dayZeroHeaderItemViewFactory",
        "Ljb1/a;",
        "b",
        "Ljb1/a;",
        "i",
        "()Ljb1/a;",
        "dayZeroHeaderDesignItemReducer",
        "onboarding-personalization_release"
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
.field private static final a:Lm91/p;

.field private static final b:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw01/e;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lw12/d;->a:Lm91/p;

    new-instance v0, Lw01/e;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lw12/d;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw12/d;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;)Lw12/c;
    .locals 0

    invoke-static {p0}, Lw12/d;->g(Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;)Lw12/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw12/d;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw12/d;->h(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw01/e;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw01/e;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    const-class v1, Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lw12/d$a;

    invoke-direct {v2, v0}, Lw12/d$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;)Lw12/c;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw12/c;

    invoke-virtual {p0}, Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;->getCurrentStep()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/onboardingpersonalization/dayzero/header/models/ConversationProgressBarModel;->getTotalSteps()I

    move-result p0

    invoke-direct {v0, v1, p0}, Lw12/c;-><init>(II)V

    return-object v0
.end method

.method private static final h(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lw12/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lw12/a;

    invoke-direct {v1}, Lw12/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Lw12/d;->b:Ljb1/a;

    return-object v0
.end method

.method public static final j()Lm91/p;
    .locals 1

    sget-object v0, Lw12/d;->a:Lm91/p;

    return-object v0
.end method
