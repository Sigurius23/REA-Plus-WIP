.class public abstract Lcom/whoop/startactivity/goals/targetcard/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "h",
        "()Ljb1/a;",
        "targetCardNestedReducer",
        "b",
        "Ljb1/a;",
        "f",
        "targetCardDesignItemReducer",
        "Lm91/p;",
        "c",
        "Lm91/p;",
        "g",
        "()Lm91/p;",
        "targetCardDesignItemViewFactory",
        "start-activity_release"
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

.field private static final b:Ljb1/a;

.field private static final c:Lm91/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll72/f;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Ll72/f;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->a:Ll83/h;

    new-instance v0, Llc0/g;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llc0/g;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->b:Ljb1/a;

    new-instance v0, Llc0/g;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llc0/g;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    sput-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->c:Lm91/p;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/startactivity/goals/targetcard/a;->j(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ljb1/a;
    .locals 1

    invoke-static {}, Lcom/whoop/startactivity/goals/targetcard/a;->m()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/startactivity/goals/targetcard/a;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;)Llg2/b;
    .locals 0

    invoke-static {p0}, Lcom/whoop/startactivity/goals/targetcard/a;->k(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;)Llg2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/startactivity/goals/targetcard/a;->l(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Ljb1/a;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->b:Ljb1/a;

    return-object v0
.end method

.method public static final g()Lm91/p;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->c:Lm91/p;

    return-object v0
.end method

.method private static final h()Ljb1/a;
    .locals 1

    sget-object v0, Lcom/whoop/startactivity/goals/targetcard/a;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llc0/g;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llc0/g;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llc0/g;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Llc0/g;-><init>(I)V

    const-class v1, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/startactivity/goals/targetcard/a$a;

    invoke-direct {v2, v0}, Lcom/whoop/startactivity/goals/targetcard/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;)Llg2/b;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llg2/b;

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getHeader()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getHeader()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;->getShowToggle()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getHeader()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;->isToggleOn()Z

    move-result v4

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getHeader()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getHeader()Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel$TargetCardHeader;->getEndIconAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    invoke-static {}, Lcom/whoop/startactivity/goals/targetcard/a;->h()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getBody()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-static {}, Lcom/whoop/startactivity/goals/targetcard/a;->h()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getFooter()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0, v8}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getToggleOnInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getToggleOffInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;->getOnAppearInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v11

    invoke-direct/range {v1 .. v11}, Llg2/b;-><init>(Ljava/lang/String;ZZLgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v1
.end method

.method private static final l(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Llg2/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Llg2/a;

    invoke-direct {v1}, Llg2/a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Ljb1/a;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method
