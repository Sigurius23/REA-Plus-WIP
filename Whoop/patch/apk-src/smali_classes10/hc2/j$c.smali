.class final Lhc2/j$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhc2/j;->R()V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.myaccount.MyAccountViewModel$fetchInitialData$6"
    f = "MyAccountViewModel.kt"
    l = {
        0x78
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lhc2/j;


# direct methods
.method public constructor <init>(Lhc2/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhc2/j;",
            "Lq83/d<",
            "-",
            "Lhc2/j$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhc2/j$c;->x:Lhc2/j;

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

    new-instance p1, Lhc2/j$c;

    iget-object v0, p0, Lhc2/j$c;->x:Lhc2/j;

    invoke-direct {p1, v0, p2}, Lhc2/j$c;-><init>(Lhc2/j;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lhc2/j$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lhc2/j$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lhc2/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lhc2/j$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhc2/j$c;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lhc2/j$c;->x:Lhc2/j;

    invoke-static {v2}, Lhc2/j;->L(Lhc2/j;)Lz92/a;

    move-result-object v2

    iput v3, v0, Lhc2/j$c;->w:I

    invoke-interface {v2, v0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast v2, Lcom/whoop/domain/model/User;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/whoop/domain/model/User;->getEmailAddress()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v14, v1

    goto :goto_3

    :cond_4
    :goto_2
    const-string v1, ""

    goto :goto_1

    :goto_3
    iget-object v1, v0, Lhc2/j$c;->x:Lhc2/j;

    invoke-static {v1}, Lhc2/j;->M(Lhc2/j;)Landroidx/lifecycle/t0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhc2/k;

    if-nez v1, :cond_5

    new-instance v15, Lhc2/k;

    const/16 v28, 0xffe

    const/16 v29, 0x0

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

    invoke-direct/range {v15 .. v29}, Lhc2/k;-><init>(Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v15

    goto :goto_4

    :cond_5
    move-object v2, v1

    :goto_4
    const/16 v15, 0x7ff

    const/16 v16, 0x0

    const/4 v3, 0x0

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

    invoke-static/range {v2 .. v16}, Lhc2/k;->b(Lhc2/k;Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;Lcom/whoop/data/remote/domain/response/growth/AffiliateType;ZLcom/whoop/data/remote/domain/response/growth/TrialDetails;Loa2/d;Lhc2/b;ZLy71/o;Ly71/o;Ljava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lhc2/k;

    move-result-object v1

    iget-object v2, v0, Lhc2/j$c;->x:Lhc2/j;

    invoke-static {v2}, Lhc2/j;->M(Lhc2/j;)Landroidx/lifecycle/t0;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/lifecycle/u0;->setValue(Ljava/lang/Object;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
