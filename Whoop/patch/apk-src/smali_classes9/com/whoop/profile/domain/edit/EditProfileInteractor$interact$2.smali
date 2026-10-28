.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
        "currentState",
        "update",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$2"
    f = "EditProfileInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, v1, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    check-cast p2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->invoke(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->L$0:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->label:I

    if-nez v3, :cond_13

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;

    if-eqz v3, :cond_0

    const v22, 0x7fffd

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getPreserveFormState()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getAvatarUploadSuccess()Z

    move-result v12

    const v22, 0x7fdec

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v3

    const v22, 0x7ffec

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    if-eqz v3, :cond_3

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->getError()Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-result-object v7

    const v22, 0x7ffed

    const/16 v23, 0x0

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

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_3
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;

    if-eqz v3, :cond_7

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getLastFailedFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v1

    :cond_4
    move-object v9, v1

    if-eqz v9, :cond_6

    const v22, 0x7ffbf

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    return-object v1

    :cond_6
    :goto_0
    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "Save rejected - no formState available"

    invoke-interface {v1, v4, v3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v2

    :cond_7
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;

    if-eqz v3, :cond_8

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;->getImageData()[B

    move-result-object v14

    const v22, 0x7f0ff

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_8
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;

    if-eqz v3, :cond_9

    const v22, 0x7e8ff

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_9
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;

    if-eqz v3, :cond_a

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;->getErrorMessage()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;->getImageData()[B

    move-result-object v14

    const v22, 0x7f0ff

    const/16 v23, 0x0

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_a
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;

    if-eqz v3, :cond_b

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationStarted;->getEmail()Ljava/lang/String;

    move-result-object v18

    const v22, 0x71fff

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_b
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;

    if-eqz v3, :cond_c

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;->getResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$EmailValidationCompleted;->getEmail()Ljava/lang/String;

    move-result-object v18

    const v22, 0x71fff

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_c
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;

    if-eqz v3, :cond_d

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;->getUsername()Ljava/lang/String;

    move-result-object v21

    const v22, 0xffff

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_d
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;

    if-eqz v3, :cond_e

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;->getResult()Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;->getUsername()Ljava/lang/String;

    move-result-object v21

    const v22, 0xffff

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_e
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;

    if-eqz v3, :cond_f

    const v22, 0xffff

    const/16 v23, 0x0

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

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_f
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SavingStarted;

    if-nez v3, :cond_12

    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveCompleted;

    if-nez v3, :cond_12

    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveFailed;

    if-eqz v3, :cond_10

    goto :goto_1

    :cond_10
    instance-of v1, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$NoOp;

    if-eqz v1, :cond_11

    goto :goto_1

    :cond_11
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_12
    :goto_1
    return-object v2

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
