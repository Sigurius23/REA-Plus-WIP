.class final Lf70/z$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf70/z;->b(Lf70/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.EnterYourPasswordFetcher$fetchEnterPasswordScreen$2"
    f = "EnterYourPasswordFetcher.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lf70/e;

.field final synthetic y:Lf70/z;


# direct methods
.method public constructor <init>(Lf70/e;Lf70/z;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/e;",
            "Lf70/z;",
            "Lq83/d<",
            "-",
            "Lf70/z$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lf70/z$b;->x:Lf70/e;

    iput-object p2, p0, Lf70/z$b;->y:Lf70/z;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lf70/z$b;

    iget-object v0, p0, Lf70/z$b;->x:Lf70/e;

    iget-object v1, p0, Lf70/z$b;->y:Lf70/z;

    invoke-direct {p1, v0, v1, p2}, Lf70/z$b;-><init>(Lf70/e;Lf70/z;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lf70/z$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf70/z$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf70/z$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf70/z$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lf70/z$b;->w:I

    if-nez v1, :cond_5

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lf70/z$b;->x:Lf70/e;

    instance-of v2, v1, Lf70/e$b;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lf70/e$b;

    invoke-virtual {v1}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v1

    invoke-virtual {v1}, Lf70/q0;->j()Ld70/c;

    move-result-object v1

    invoke-virtual {v1}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    new-instance v5, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lx60/b;->r:I

    const/4 v4, 0x2

    invoke-direct {v5, v2, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz v1, :cond_1

    iget-object v2, v0, Lf70/z$b;->y:Lf70/z;

    invoke-static {v2}, Lf70/z;->a(Lf70/z;)Landroid/content/Context;

    move-result-object v2

    sget v6, Lx60/b;->q:I

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v6, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v3

    :goto_1
    iget-object v1, v0, Lf70/z$b;->y:Lf70/z;

    invoke-static {v1}, Lf70/z;->a(Lf70/z;)Landroid/content/Context;

    move-result-object v1

    sget v2, Lx60/b;->p:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    const-string v1, "getString(...)"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;

    const/16 v13, 0x10

    const/4 v14, 0x0

    const-string v8, "SECURE_TEXT"

    const/4 v10, 0x0

    const-string v11, "PASSWORD"

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Lcom/whoop/activation/domain/models/steps/ActivationFlowTextEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lx60/b;->x:I

    invoke-direct {v9, v1, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lcom/whoop/design/models/ProgressButtonModel;

    sget-object v11, Lcom/whoop/design/models/ProgressButtonModel$ButtonType;->PROGRESS:Lcom/whoop/design/models/ProgressButtonModel$ButtonType;

    sget-object v12, Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;->IN_PROGRESS:Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;

    sget-object v14, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lx60/b;->L:I

    invoke-direct {v15, v1, v3, v4, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x7e0

    const/16 v23, 0x0

    const-string v13, "ARROW_FORWARD"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v10 .. v23}, Lcom/whoop/design/models/ProgressButtonModel;-><init>(Lcom/whoop/design/models/ProgressButtonModel$ButtonType;Lcom/whoop/design/models/ProgressButtonModel$ButtonStyle;Ljava/lang/String;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/atom/icon/GlowStyle;Ljava/lang/Float;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;

    const/16 v15, 0x200

    const-string v7, "https://d3feqk8jsfbag1.cloudfront.net/home/accountActivation/Password.png"

    move-object v13, v10

    const/4 v10, 0x0

    const-string v11, "ENTER_YOUR_PASSWORD"

    const-string v12, "enter_password"

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ProgressButtonModel;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lf70/e$b;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Ln70/e;

    sget-object v11, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ENTER_YOUR_PASSWORD:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/16 v13, 0x14

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v14}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lf70/z$b;->x:Lf70/e;

    instance-of v2, v1, Lf70/e$b;

    if-eqz v2, :cond_2

    move-object v3, v1

    check-cast v3, Lf70/e$b;

    :cond_2
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lf70/e$b;->h()Lf70/q0;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v9, v1

    goto :goto_3

    :cond_4
    :goto_2
    new-instance v8, Lf70/q0;

    const v39, 0x3fffffff    # 1.9999999f

    const/16 v40, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v8 .. v40}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v8

    :goto_3
    const v23, 0x1fff4

    const/16 v24, 0x0

    const/4 v8, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v5 .. v24}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_5
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
