.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->validateUsernameField(Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$validateUsernameField$1"
    f = "EditProfileInteractor.kt"
    l = {
        0x1a6,
        0x1ab,
        0x1b1,
        0x1bf,
        0x1c2,
        0x1cb
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $username:Ljava/lang/String;

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
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

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

    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_8

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;

    iget-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;

    goto :goto_0

    :pswitch_3
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lu02/a;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_3

    :pswitch_4
    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    move-object v10, p0

    goto/16 :goto_c

    :cond_0
    new-instance p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    invoke-direct {p1, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationStarted;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    move-object v10, p0

    goto/16 :goto_b

    :cond_1
    :goto_1
    new-instance p1, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    invoke-direct {p1, v2}, Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;-><init>(Ljava/lang/String;)V

    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getLogger$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1$apiResult$1;

    iget-object v2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v9, v2, p1, v4}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1$apiResult$1;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/domain/edit/CheckUsernameAvailabilityRequest;Lq83/d;)V

    iput-object v0, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    const/4 v7, 0x0

    const-string v8, "Failed to validate username"

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto/16 :goto_b

    :cond_2
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    if-eqz v2, :cond_b

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf63/c;

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    const-class v2, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v2

    iput-object v0, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    invoke-virtual {p1, v2, p0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_b

    :cond_3
    :goto_3
    instance-of v2, p1, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;

    if-eqz v2, :cond_4

    check-cast p1, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;

    goto :goto_4

    :cond_4
    move-object p1, v4

    :goto_4
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getStatus()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "toLowerCase(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    move-object v2, v4

    :goto_5
    const-string v5, "success"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$Available;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_6
    const-string v5, "error"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_7
    if-nez v2, :cond_8

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    invoke-direct {v2, v4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_6

    :cond_9
    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    :goto_6
    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    invoke-direct {v2, v4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;-><init>(Ljava/lang/String;)V

    :goto_7
    new-instance p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;

    iget-object v5, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    invoke-direct {p1, v5, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;)V

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$3:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$4:Ljava/lang/Object;

    const/4 v2, 0x4

    iput v2, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    goto :goto_b

    :cond_b
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_10

    iget-object v2, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-static {v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$getErrorBodyParser$p(Lcom/whoop/profile/domain/edit/EditProfileInteractor;)Lw02/a;

    move-result-object v2

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object p1

    sget-object v5, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->Companion:Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody$Companion;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody$Companion;->serializer()Lwc3/c;

    move-result-object v5

    check-cast v5, Lwc3/b;

    iput-object v0, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    const/4 v6, 0x5

    iput v6, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    invoke-virtual {v2, p1, v5, p0}, Lw02/a;->a(Ljava/lang/Exception;Lwc3/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    goto :goto_b

    :cond_c
    :goto_8
    check-cast p1, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lcom/whoop/profile/domain/edit/models/UsernameCheckV2ResponseBody;->getText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_9

    :cond_d
    move-object p1, v4

    :goto_9
    if-eqz p1, :cond_e

    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;

    invoke-direct {v2, p1}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NotAvailable;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :cond_e
    new-instance v2, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;

    invoke-direct {v2, v4}, Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult$NetworkError;-><init>(Ljava/lang/String;)V

    :goto_a
    new-instance p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;

    iget-object v5, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->$username:Ljava/lang/String;

    invoke-direct {p1, v5, v2}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$UsernameValidationCompleted;-><init>(Ljava/lang/String;Lcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;)V

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$0:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$1:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$2:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$3:Ljava/lang/Object;

    iput-object v4, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->L$4:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v10, Lcom/whoop/profile/domain/edit/EditProfileInteractor$validateUsernameField$1;->label:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_f

    :goto_b
    return-object v1

    :cond_f
    :goto_c
    return-object v3

    :cond_10
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
