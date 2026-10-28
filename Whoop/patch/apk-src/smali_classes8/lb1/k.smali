.class public abstract Llb1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AnimatedSequenceModel;",
        "Lwz0/e;",
        "g",
        "(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "animatedSequenceMapper",
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

    new-instance v0, Ll60/a;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Ll60/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;
    .locals 0

    invoke-static {p0}, Llb1/k;->e(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll60/a;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Ll60/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AnimatedSequenceModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k$a;

    invoke-direct {v2, v0}, Llb1/k$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/k;->g(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/k;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/AnimatedSequenceModel;)Lwz0/e;
    .locals 9

    new-instance v0, Ll60/a;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Ll60/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->getSteps()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/AnimatedSequenceStepModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/AnimatedSequenceStepModel;->getLottieUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/AnimatedSequenceStepModel;->getContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v0, v6}, Ljb1/a;->i(Lcom/whoop/design/models/DesignSystemModel;)Lm91/o;

    move-result-object v4

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AnimatedSequenceStepModel;->getMinDurationMs()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/design/models/items/AnimatedSequenceStepModel;->getOnStepCompleteInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v2

    new-instance v7, Lwz0/f;

    invoke-direct {v7, v5, v4, v6, v2}, Lwz0/f;-><init>(Lv41/r0;Lm91/o;Ljava/lang/Long;Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->getRepeatMode()Lcom/whoop/design/models/celebration/AnimationModeModel;

    move-result-object v0

    invoke-static {v0}, Llb1/h1;->a(Lcom/whoop/design/models/celebration/AnimationModeModel;)Li51/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->getHeight()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_1
    move v5, v1

    goto :goto_2

    :cond_2
    invoke-static {}, Lwz0/d;->R()F

    move-result v1

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->getWidth()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    new-instance v4, Ly3/f;

    invoke-direct {v4, v1}, Ly3/f;-><init>(F)V

    :cond_3
    move-object v6, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/AnimatedSequenceModel;->getOnCompleteInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    new-instance v2, Lwz0/e;

    const/4 v8, 0x0

    move-object v4, v0

    invoke-direct/range {v2 .. v8}, Lwz0/e;-><init>(Ljava/util/List;Li51/a;FLy3/f;Lcom/whoop/navigation/models/GenericInteraction;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
