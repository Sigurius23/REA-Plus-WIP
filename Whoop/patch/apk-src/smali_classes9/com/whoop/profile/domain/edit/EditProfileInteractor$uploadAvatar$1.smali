.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->uploadAvatar([B)Lec3/l;
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
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$uploadAvatar$1"
    f = "EditProfileInteractor.kt"
    l = {
        0x175,
        0x178,
        0x17a,
        0x17b,
        0x17f,
        0x184
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $imageData:[B

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>([BLcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

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

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;-><init>([BLcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string v0, "Avatar upload failed: "

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lpr2/d;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lpr2/d;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    invoke-direct {p1, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploading;-><init>([B)V

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_0
    :try_start_2
    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getAvatarService$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lpr2/b;

    move-result-object p1

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-interface {p1, v3, p0}, Lpr2/b;->b([BLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    check-cast p1, Lpr2/d;

    instance-of v3, p1, Lpr2/d$b;

    if-eqz v3, :cond_3

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getBootstrapUserSignIn$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lpd1/a;

    move-result-object p1

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-virtual {p1, p0}, Lpd1/a;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    goto :goto_4

    :cond_2
    :goto_2
    new-instance p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;

    const-string v0, ""

    invoke-direct {p1, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadSuccess;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-interface {v1, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_3
    instance-of v3, p1, Lpr2/d$a;

    if-eqz v3, :cond_4

    new-instance v3, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;

    check-cast p1, Lpr2/d$a;

    invoke-virtual {p1}, Lpr2/d$a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    invoke-direct {v3, p1, v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;-><init>(Ljava/lang/String;[B)V

    iput-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-interface {v1, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_3
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v0}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v5, "Exception during avatar upload"

    invoke-interface {v0, v5, p1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Failed to upload avatar: "

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->$imageData:[B

    invoke-direct {v0, p1, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$AvatarUploadError;-><init>(Ljava/lang/String;[B)V

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->L$1:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$uploadAvatar$1;->label:I

    invoke-interface {v1, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_4
    return-object v2

    :cond_5
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
