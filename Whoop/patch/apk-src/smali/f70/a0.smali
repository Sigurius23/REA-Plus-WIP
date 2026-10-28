.class public final Lf70/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0080@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lf70/a0;",
        "",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "authServiceApiV2",
        "Lh80/c;",
        "analyticsHelper",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;)V",
        "Lf70/d$x;",
        "action",
        "Lf70/e;",
        "b",
        "(Lf70/d$x;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/service/network/AuthServiceApiV2;",
        "Lh80/c;",
        "c",
        "Ltr2/n;",
        "activation_release"
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
.field private final a:Lcom/whoop/service/network/AuthServiceApiV2;

.field private final b:Lh80/c;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;)V
    .locals 1

    const-string v0, "authServiceApiV2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf70/a0;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    .line 3
    iput-object p2, p0, Lf70/a0;->b:Lh80/c;

    .line 4
    iput-object p3, p0, Lf70/a0;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "ForgotPasswordSubmissionHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lf70/a0;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lf70/a0;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 0

    iget-object p0, p0, Lf70/a0;->a:Lcom/whoop/service/network/AuthServiceApiV2;

    return-object p0
.end method


# virtual methods
.method public final b(Lf70/d$x;Lq83/d;)Ljava/lang/Object;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf70/d$x;",
            "Lq83/d<",
            "-",
            "Lf70/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lf70/a0$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lf70/a0$a;

    iget v4, v3, Lf70/a0$a;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lf70/a0$a;->z:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lf70/a0$a;

    invoke-direct {v3, v0, v2}, Lf70/a0$a;-><init>(Lf70/a0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lf70/a0$a;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lf70/a0$a;->z:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v1, v9, Lf70/a0$a;->w:Ljava/lang/Object;

    check-cast v1, Lf70/d$x;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v4, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v0, Lf70/a0;->c:Ltr2/n;

    new-instance v8, Lf70/a0$b;

    const/4 v6, 0x0

    invoke-direct {v8, v0, v1, v6}, Lf70/a0$b;-><init>(Lf70/a0;Lf70/d$x;Lq83/d;)V

    iput-object v1, v9, Lf70/a0$a;->w:Ljava/lang/Object;

    iput v5, v9, Lf70/a0$a;->z:I

    const/4 v7, 0x0

    const/4 v10, 0x6

    const/4 v11, 0x0

    move-object v5, v2

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_3

    return-object v3

    :cond_3
    :goto_2
    check-cast v2, Lu02/a;

    instance-of v3, v2, Lu02/a$b;

    if-eqz v3, :cond_5

    iget-object v1, v0, Lf70/a0;->b:Lh80/c;

    new-instance v3, Lh80/b$a;

    const-string v4, "reset_password_email_fail"

    const-string v5, "authentication"

    const-string v6, "forgot_password"

    const-string v7, "inline_error"

    invoke-direct {v3, v6, v7, v4, v5}, Lh80/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lh80/c;->p(Lh80/b;)V

    check-cast v2, Lu02/a$b;

    invoke-static {v2}, Ls70/a;->a(Lu02/a$b;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, Ls70/a;->b()Lf70/e$b;

    move-result-object v1

    return-object v1

    :cond_4
    new-instance v2, Lf70/e$b;

    sget-object v7, Lf70/b0;->ERROR:Lf70/b0;

    const v20, 0x1ffef

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    invoke-direct/range {v2 .. v21}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_5
    instance-of v2, v2, Lu02/a$c;

    if-eqz v2, :cond_6

    new-instance v3, Lf70/e$b;

    new-instance v4, Ln70/e;

    new-instance v9, Ln70/d$a;

    sget-object v2, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->CHECK_INBOX:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-virtual {v1}, Lf70/d$x;->b()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "fromPostPairing"

    invoke-static {v5, v6}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    invoke-direct {v9, v2, v5}, Ln70/d$a;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)V

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v11}, Ln70/e;-><init>(IIILcom/whoop/activation/view/navigation/ActivationFlowDestination;Ln70/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lf70/q0;

    invoke-virtual {v1}, Lf70/d$x;->a()Ld70/c;

    move-result-object v6

    const v36, 0x3ffffffe    # 1.9999998f

    const/16 v37, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

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

    invoke-direct/range {v5 .. v37}, Lf70/q0;-><init>(Ld70/c;Ld70/e;Ld70/d;Ld70/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ld70/b;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp90/e;Lr80/a;Lcom/whoop/activation/domain/models/steps/CommitmentType;Ljava/lang/Integer;Ljava/util/List;ZZZLjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/domain/model/UnitSystem;IZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v21, 0x1fff5

    move-object v7, v5

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v22}, Lf70/e$b;-><init>(Ljava/util/List;Ln70/e;Ljava/util/List;Lf70/q0;Lf70/b0;ZLf70/n0;ZLcom/whoop/domain/model/AuthMaterial;ZZLcom/whoop/activation/domain/interactors/activation/SubscriptionError;Ljava/util/Map;Lcom/whoop/activation/iajf/domain/SignUpSource;Ljava/util/List;Lf70/u0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
