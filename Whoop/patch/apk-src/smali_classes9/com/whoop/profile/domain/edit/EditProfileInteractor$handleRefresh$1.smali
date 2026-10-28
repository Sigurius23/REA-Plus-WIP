.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->handleRefresh(Z)Lec3/l;
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
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$handleRefresh$1"
    f = "EditProfileInteractor.kt"
    l = {
        0x1e8,
        0x1ed,
        0x1f3,
        0x1f5,
        0x1f7,
        0x200,
        0x20a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $preserveFormState:Z

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    iput-boolean p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->$preserveFormState:Z

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

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    iget-boolean v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->$preserveFormState:Z

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;ZLq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v5, p0

    const-class v8, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lec3/m;

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    const/4 v11, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_1
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    :goto_0
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/GetEditProfileRequest;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :pswitch_2
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    goto :goto_0

    :pswitch_3
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/GetEditProfileRequest;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v0, p1

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/GetEditProfileRequest;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object/from16 v0, p1

    goto :goto_2

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_0

    goto/16 :goto_8

    :cond_0
    :goto_1
    :try_start_3
    new-instance v0, Lcom/whoop/profile/domain/edit/GetEditProfileRequest;

    invoke-direct {v0}, Lcom/whoop/profile/domain/edit/GetEditProfileRequest;-><init>()V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v2

    const-string v3, "Failed to refresh profile"

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1$apiResult$1;

    iget-object v6, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v4, v6, v0, v11}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1$apiResult$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/domain/edit/GetEditProfileRequest;Lq83/d;)V

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    move-object v0, v1

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_5

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf63/c;

    invoke-virtual {v0}, Lf63/c;->a()Lw53/b;

    move-result-object v0

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v1

    invoke-static {v1}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v1, v2}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-virtual {v0, v1, v5}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_2

    goto/16 :goto_8

    :cond_2
    :goto_3
    instance-of v1, v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    goto :goto_4

    :cond_3
    move-object v0, v11

    :goto_4
    if-eqz v0, :cond_4

    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;

    iget-boolean v2, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->$preserveFormState:Z

    invoke-direct {v1, v0, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Z)V

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-interface {v9, v1, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    goto/16 :goto_8

    :cond_4
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    new-instance v12, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v14, Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;

    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v12}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;-><init>(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    const/4 v1, 0x5

    iput v1, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    goto/16 :goto_8

    :cond_5
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_7

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object v0

    instance-of v0, v0, Lretrofit2/HttpException;

    if-eqz v0, :cond_6

    new-instance v12, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v14, Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;

    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_6
    new-instance v12, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v14, Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;

    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    invoke-direct {v0, v12}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;-><init>(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V

    iput-object v9, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    const/4 v1, 0x6

    iput v1, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    goto :goto_8

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :goto_6
    iget-object v1, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "Exception during refresh profile"

    invoke-interface {v1, v3, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    instance-of v0, v0, Lretrofit2/HttpException;

    if-eqz v0, :cond_8

    new-instance v12, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v14, Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$RequestFailed;

    const/16 v18, 0x1d

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v19}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_8
    new-instance v13, Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    sget-object v15, Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDialogType$NetworkError;

    const/16 v19, 0x1d

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v13 .. v20}, Lcom/whoop/profile/domain/edit/EditProfileDomainState;-><init>(Lcom/whoop/profile/domain/edit/models/EditProfileResponse;Lcom/whoop/profile/domain/edit/EditProfileDialogType;Lcom/whoop/profile/domain/edit/EditProfileDomainState$AvatarDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationDomainState;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationDomainState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v13

    :goto_7
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    invoke-direct {v0, v12}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;-><init>(Lcom/whoop/profile/domain/edit/EditProfileDomainState;)V

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$0:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$1:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$2:Ljava/lang/Object;

    iput-object v11, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->L$3:Ljava/lang/Object;

    const/4 v1, 0x7

    iput v1, v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$handleRefresh$1;->label:I

    invoke-interface {v9, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    :goto_8
    return-object v10

    :cond_9
    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
