.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->validateEmailField(Ljava/lang/String;)Lec3/l;
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
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
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
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$validateEmailField$1"
    f = "EditProfileInteractor.kt"
    l = {
        0x18b,
        0x18e,
        0x194,
        0x19a,
        0x19d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $email:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
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

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v14, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_4

    if-eq v0, v1, :cond_3

    if-eq v0, v13, :cond_2

    if-eq v0, v12, :cond_1

    if-ne v0, v11, :cond_0

    :goto_0
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v10

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_3

    :cond_3
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto/16 :goto_7

    :cond_6
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    invoke-direct {v0, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;-><init>(Ljava/lang/String;)V

    iput-object v8, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto/16 :goto_6

    :cond_7
    :goto_1
    new-instance v0, Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    invoke-direct {v0, v2}, Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;-><init>(Ljava/lang/String;)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1$apiResult$1;

    iget-object v6, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v4, v6, v0, v14}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1$apiResult$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/domain/edit/CheckEmailAvailabilityRequest;Lq83/d;)V

    iput-object v8, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    iput v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const-string v3, "Failed to validate email"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto/16 :goto_6

    :cond_8
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_c

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf63/c;

    invoke-virtual {v0}, Lf63/c;->a()Lw53/b;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v2

    const-class v3, Ljava/lang/Boolean;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v1, v2}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    iput-object v8, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$2:Ljava/lang/Object;

    iput v13, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    invoke-virtual {v0, v1, p0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_6

    :cond_9
    :goto_3
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_a

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_4

    :cond_a
    move-object v0, v14

    :goto_4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$Available;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$Available;

    goto :goto_5

    :cond_b
    sget-object v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NotAvailable;

    :goto_5
    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;)V

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$2:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$3:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$4:Ljava/lang/Object;

    iput v12, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_d

    goto :goto_6

    :cond_c
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_e

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->$email:Ljava/lang/String;

    sget-object v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult$NetworkError;

    invoke-direct {v0, v1, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;)V

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$0:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$1:Ljava/lang/Object;

    iput-object v14, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->L$2:Ljava/lang/Object;

    iput v11, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateEmailField$1;->label:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_d

    :goto_6
    return-object v9

    :cond_d
    :goto_7
    return-object v10

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
