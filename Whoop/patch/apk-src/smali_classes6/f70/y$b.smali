.class final Lf70/y$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/y;->c(Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lf70/e$b;",
        "<anonymous>",
        "(Lbc3/c0;)Lf70/e$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.activation.domain.interactors.activation.EnterEmailFetcher$fetchEnterEmailScreen$2"
    f = "EnterEmailFetcher.kt"
    l = {
        0x2a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lf70/y;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lf70/y;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/y;",
            "Lq83/d<",
            "-",
            "Lf70/y$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/y$b;->E:Lf70/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lf70/y$b;

    iget-object v0, p0, Lf70/y$b;->E:Lf70/y;

    invoke-direct {p1, v0, p2}, Lf70/y$b;-><init>(Lf70/y;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lf70/e$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lf70/y$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/y$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf70/y$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf70/y$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lf70/y$b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lf70/y$b;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v0, Lf70/y$b;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lf70/y$b;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v1

    move-object v9, v3

    move-object/from16 v3, p1

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lf70/y$b;->E:Lf70/y;

    invoke-static {v2}, Lf70/y;->a(Lf70/y;)Landroid/content/Context;

    move-result-object v2

    sget v4, Lx60/b;->t:I

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    iget-object v4, v0, Lf70/y$b;->E:Lf70/y;

    invoke-static {v4}, Lf70/y;->a(Lf70/y;)Landroid/content/Context;

    move-result-object v4

    sget v5, Lx60/b;->s:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "getString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v0, Lf70/y$b;->E:Lf70/y;

    invoke-static {v6}, Lf70/y;->a(Lf70/y;)Landroid/content/Context;

    move-result-object v6

    sget v7, Lx60/b;->o:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lf70/y$b;->E:Lf70/y;

    invoke-static {v5}, Lf70/y;->b(Lf70/y;)Lcom/whoop/data/datastore/EmailDataStoreHelper;

    move-result-object v5

    iput-object v6, v0, Lf70/y$b;->w:Ljava/lang/Object;

    iput-object v2, v0, Lf70/y$b;->x:Ljava/lang/Object;

    iput-object v4, v0, Lf70/y$b;->y:Ljava/lang/Object;

    iput v3, v0, Lf70/y$b;->z:I

    invoke-virtual {v5, v0}, Lcom/whoop/data/datastore/EmailDataStoreHelper;->getEmail(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2

    return-object v1

    :cond_2
    move-object v9, v6

    move-object v6, v4

    goto :goto_0

    :goto_1
    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    new-instance v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    const/16 v13, 0x10

    const/4 v14, 0x0

    const-string v8, "EMAIL"

    const-string v11, "EMAIL"

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v14, Lcom/whoop/design/models/ProgressButtonModel;

    sget-object v9, Lcom/whoop/design/models/ProgressButtonModel$ButtonType;->FILLED:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    sget-object v10, Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;->IN_PROGRESS:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    sget-object v12, Ly81/f;->BRAND_WHITE:Ly81/f;

    iget-object v1, v0, Lf70/y$b;->E:Lf70/y;

    invoke-static {v1}, Lf70/y;->a(Lf70/y;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lx60/b;->L:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v20, 0x7e0

    const/16 v21, 0x0

    const-string v11, "ARROW_FORWARD"

    move-object v8, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v21}, Lcom/whoop/design/models/ProgressButtonModel;-><init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    move-object v14, v8

    const-string v8, "https://d3feqk8jsfbag1.cloudfront.net/home/accountActivation/Mail.png"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "ENTER_YOUR_EMAIL"

    const-string v13, "email_only"

    const/16 v16, 0x430

    invoke-direct/range {v4 .. v17}, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/activation/domain/models/EmailDialogInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lf70/e$b;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Ln70/e;

    sget-object v11, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ENTER_YOUR_EMAIL:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/16 v13, 0x14

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v23, 0x1fffc

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v5 .. v24}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
