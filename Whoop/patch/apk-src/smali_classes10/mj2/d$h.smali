.class final Lmj2/d$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmj2/d;->g(Lcom/whoop/stress/domain/model/StressSession;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lnj2/t;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.stress.reducer.StressSessionViewStateReducer$refresh$1"
    f = "StressSessionViewStateReducer.kt"
    l = {
        0x40
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/stress/domain/model/StressSession;

.field final synthetic J:Lmj2/d;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/stress/domain/model/StressSession;Lmj2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/stress/domain/model/StressSession;",
            "Lmj2/d;",
            "Lq83/d<",
            "-",
            "Lmj2/d$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmj2/d$h;->I:Lcom/whoop/stress/domain/model/StressSession;

    iput-object p2, p0, Lmj2/d$h;->J:Lmj2/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmj2/d$h;->h(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ljb1/b;)Ll83/a0;
    .locals 2

    const-class v0, Ld41/h;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lmj2/d$h$a;

    invoke-direct {v1}, Lmj2/d$h$a;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lmj2/d$h;

    iget-object v1, p0, Lmj2/d$h;->I:Lcom/whoop/stress/domain/model/StressSession;

    iget-object v2, p0, Lmj2/d$h;->J:Lmj2/d;

    invoke-direct {v0, v1, v2, p2}, Lmj2/d$h;-><init>(Lcom/whoop/stress/domain/model/StressSession;Lmj2/d;Lq83/d;)V

    iput-object p1, v0, Lmj2/d$h;->H:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lmj2/d$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmj2/d$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmj2/d$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmj2/d$h;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    move-object/from16 v0, p0

    iget-object v1, v0, Lmj2/d$h;->H:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lmj2/d$h;->G:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lmj2/d$h;->E:Ljava/lang/Object;

    check-cast v1, Lnj2/b;

    iget-object v1, v0, Lmj2/d$h;->z:Ljava/lang/Object;

    check-cast v1, Ld41/h;

    iget-object v1, v0, Lmj2/d$h;->y:Ljava/lang/Object;

    check-cast v1, Lnj2/b;

    iget-object v1, v0, Lmj2/d$h;->x:Ljava/lang/Object;

    check-cast v1, Ljb1/a;

    iget-object v1, v0, Lmj2/d$h;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/stress/domain/model/StressSession;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lmj2/d$h;->I:Lcom/whoop/stress/domain/model/StressSession;

    iget-object v5, v0, Lmj2/d$h;->J:Lmj2/d;

    new-instance v6, Lmj2/e;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lmj2/e;-><init>(I)V

    invoke-static {v6}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getInstruction()Lcom/whoop/stress/domain/model/StressInstruction;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/stress/domain/model/StressInstruction;->getVideo()Lcom/whoop/design/models/items/ArticleTileModel;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    instance-of v7, v6, Ld41/h;

    const/4 v8, 0x0

    if-eqz v7, :cond_2

    check-cast v6, Ld41/h;

    move-object/from16 v17, v6

    goto :goto_0

    :cond_2
    move-object/from16 v17, v8

    :goto_0
    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getCustomization()Lcom/whoop/stress/domain/model/StressCustomization;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/StressCustomization;->getCycle()Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v5, v6}, Lmj2/d;->b(Lmj2/d;Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;

    move-result-object v6

    move-object/from16 v20, v6

    goto :goto_1

    :cond_3
    move-object/from16 v20, v8

    :goto_1
    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getCustomization()Lcom/whoop/stress/domain/model/StressCustomization;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/StressCustomization;->getSpeed()Lcom/whoop/stress/domain/model/StressCustomizationOptions;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v5, v6}, Lmj2/d;->b(Lmj2/d;Lcom/whoop/stress/domain/model/StressCustomizationOptions;)Lnj2/b;

    move-result-object v5

    move-object/from16 v19, v5

    goto :goto_2

    :cond_4
    move-object/from16 v19, v8

    :goto_2
    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getDuration()Lcom/whoop/stress/domain/model/StressDuration;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressDuration;->getTitle()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_5
    move-object v5, v8

    :goto_3
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getDuration()Lcom/whoop/stress/domain/model/StressDuration;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressDuration;->getSuffix()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v5, v8

    :goto_4
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getDuration()Lcom/whoop/stress/domain/model/StressDuration;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressDuration;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_7
    move-object v5, v8

    :goto_5
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getInstruction()Lcom/whoop/stress/domain/model/StressInstruction;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/stress/domain/model/StressInstruction;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getInstruction()Lcom/whoop/stress/domain/model/StressInstruction;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/stress/domain/model/StressInstruction;->getDescription()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getInstruction()Lcom/whoop/stress/domain/model/StressInstruction;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/stress/domain/model/StressInstruction;->getAdditionalInstructions()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_8

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v7, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/stress/domain/model/StressAdditionalInstruction;

    new-instance v21, Lnj2/g;

    invoke-virtual {v7}, Lcom/whoop/stress/domain/model/StressAdditionalInstruction;->getTitle()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v7}, Lcom/whoop/stress/domain/model/StressAdditionalInstruction;->getDescription()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v21 .. v26}, Lnj2/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v21

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    move-object v9, v8

    :cond_9
    new-instance v4, Lnj2/g;

    invoke-direct {v4, v5, v6, v9}, Lnj2/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getButtonDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v9, Lnj2/q;

    move-object/from16 v16, v4

    invoke-direct/range {v9 .. v20}, Lnj2/q;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lnj2/g;Ld41/h;Lcom/whoop/design/util/TextResource;Lnj2/b;Lnj2/b;)V

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressSession;->getIntervention()Lcom/whoop/stress/domain/model/StressIntervention;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/StressIntervention;->getDisclaimerScreen()Lcom/whoop/stress/domain/model/DisclaimerScreen;

    move-result-object v3

    if-eqz v3, :cond_a

    new-instance v10, Lnj2/h;

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getNavigationTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v12, Lkd1/o$c;

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getImageUrl()Ljava/lang/String;

    move-result-object v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v12 .. v18}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getAlert()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v3}, Lcom/whoop/stress/domain/model/DisclaimerScreen;->getButton()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-direct/range {v10 .. v16}, Lnj2/h;-><init>(Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v27, v10

    goto :goto_7

    :cond_a
    move-object/from16 v27, v8

    :goto_7
    new-instance v21, Lnj2/t;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x52

    const/16 v30, 0x0

    move-object/from16 v24, v9

    invoke-direct/range {v21 .. v30}, Lnj2/t;-><init>(ZZLnj2/q;Lnj2/k;Lnj2/s;Lnj2/h;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v21

    iput-object v8, v0, Lmj2/d$h;->H:Ljava/lang/Object;

    iput-object v8, v0, Lmj2/d$h;->w:Ljava/lang/Object;

    iput-object v8, v0, Lmj2/d$h;->x:Ljava/lang/Object;

    iput-object v8, v0, Lmj2/d$h;->y:Ljava/lang/Object;

    iput-object v8, v0, Lmj2/d$h;->z:Ljava/lang/Object;

    iput-object v8, v0, Lmj2/d$h;->E:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v0, Lmj2/d$h;->F:I

    const/4 v4, 0x1

    iput v4, v0, Lmj2/d$h;->G:I

    invoke-interface {v1, v3, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    return-object v2

    :cond_b
    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
