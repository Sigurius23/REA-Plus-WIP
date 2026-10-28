.class public final Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$$inlined$flatMapLatest$1"
    f = "EditProfileInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/profile/domain/edit/EditProfileDomainAction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, p3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction;

    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$Refresh;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_2

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v1, v5, v2, v4}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->handleRefresh$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor;ZILjava/lang/Object;)Lec3/l;

    move-result-object v1

    goto/16 :goto_1

    :cond_2
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;

    if-eqz v3, :cond_3

    new-instance v3, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$SaveProfile;->getFormState()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$SaveRequested;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    new-instance v1, La6/u;

    const/4 v5, 0x1

    invoke-direct {v1, v3, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto/16 :goto_1

    :cond_3
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateEmailField;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$validateEmailField(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto/16 :goto_1

    :cond_4
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ValidateUsernameField;->getUsername()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$validateUsernameField(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_5
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$ClearUsernameValidation;

    if-eqz v3, :cond_6

    sget-object v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ClearUsernameValidation;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_6
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RefreshAfterAvatarUpload;

    if-eqz v3, :cond_7

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v1, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$handleRefresh(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Z)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_7
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$UploadAvatar;->getImageData()[B

    move-result-object v1

    invoke-static {v3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$uploadAvatar(Lcom/whoop/profile/domain/edit/EditProfileInteractor;[B)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_8
    sget-object v3, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$RetryAvatarUpload;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;

    const-string v3, "No upload data available for retry"

    new-array v5, v5, [B

    invoke-direct {v1, v3, v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;-><init>(Ljava/lang/String;[B)V

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_9
    sget-object v3, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$DeleteAvatar;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$deleteCurrentUserAvatarFlow(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_a
    sget-object v3, Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;->INSTANCE:Lcom/whoop/profile/domain/edit/EditProfileDomainAction$NoOp;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    new-array v1, v5, [Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;

    new-instance v3, Lbm/g;

    const/4 v5, 0x3

    invoke-direct {v3, v1, v5}, Lbm/g;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :goto_1
    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$1;->label:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    return-object v0

    :cond_b
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
