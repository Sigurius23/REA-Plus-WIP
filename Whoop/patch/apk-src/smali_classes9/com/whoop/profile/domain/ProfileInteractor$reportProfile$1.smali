.class final Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor;->reportProfile()Lec3/l;
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
        "Lcom/whoop/profile/domain/ProfileInternalDomainAction;",
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
    c = "com.whoop.profile.domain.ProfileInteractor$reportProfile$1"
    f = "ProfileInteractor.kt"
    l = {
        0xa9,
        0xb1,
        0xb8
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/ProfileInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/ProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {v0, v1, p2}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$0:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->label:I

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v11, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/ProfileReportResult;

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/ReportAvatarRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/ReportAvatarRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v0}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getTargetUserId$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v0}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v3, "Cannot report a profile without a target user id"

    invoke-interface {v0, v3, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;

    sget-object v1, Lcom/whoop/profile/domain/ProfileReportResult;->FAILURE:Lcom/whoop/profile/domain/ProfileReportResult;

    invoke-direct {v0, v1}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;-><init>(Lcom/whoop/profile/domain/ProfileReportResult;)V

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->label:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/whoop/profile/domain/ReportAvatarRequest;

    iget-object v2, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v2}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getTargetUserId$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v3}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getReportedAvatarUrlHolder$p(Lcom/whoop/profile/domain/ProfileInteractor;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Lcom/whoop/profile/domain/ReportAvatarRequest;-><init>(ILjava/lang/String;)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-static {v3}, Lcom/whoop/profile/domain/ProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/ProfileInteractor;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1$apiResult$1;

    iget-object v6, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->this$0:Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-direct {v4, v6, v0, v12}, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1$apiResult$1;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/domain/ReportAvatarRequest;Lq83/d;)V

    iput-object v8, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$0:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$1:Ljava/lang/Object;

    iput v1, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->label:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const-string v3, "Failed to report profile"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_6

    sget-object v0, Lcom/whoop/profile/domain/ProfileReportResult;->SUCCESS:Lcom/whoop/profile/domain/ProfileReportResult;

    goto :goto_1

    :cond_6
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_8

    sget-object v0, Lcom/whoop/profile/domain/ProfileReportResult;->FAILURE:Lcom/whoop/profile/domain/ProfileReportResult;

    :goto_1
    new-instance v1, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;

    invoke-direct {v1, v0}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$UpdateReportResult;-><init>(Lcom/whoop/profile/domain/ProfileReportResult;)V

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$0:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$1:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$2:Ljava/lang/Object;

    iput-object v12, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->L$3:Ljava/lang/Object;

    iput v11, p0, Lcom/whoop/profile/domain/ProfileInteractor$reportProfile$1;->label:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    :goto_2
    return-object v9

    :cond_7
    return-object v10

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
