.class final Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/EditProfileScreenKt;->EditProfileScreen(Leb/a0;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.profile.view.edit.EditProfileScreenKt$EditProfileScreen$4$1"
    f = "EditProfileScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $formState$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $viewState$delegate:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lp1/t2;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$viewState$delegate:Lp1/t2;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$formState$delegate:Lp1/c1;

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

    new-instance p1, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$viewState$delegate:Lp1/t2;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$formState$delegate:Lp1/c1;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;-><init>(Lp1/t2;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->label:I

    if-nez v1, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$viewState$delegate:Lp1/t2;

    invoke-static {v1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->access$EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getShowUsernameField()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$viewState$delegate:Lp1/t2;

    invoke-static {v1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->access$EditProfileScreen$lambda$1(Lp1/t2;)Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;->getUsernameValidationState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValidating()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$formState$delegate:Lp1/c1;

    invoke-static {v1}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->access$EditProfileScreen$lambda$3(Lp1/c1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v1, v0, Lcom/whoop/profile/view/edit/EditProfileScreenKt$EditProfileScreen$4$1;->$formState$delegate:Lp1/c1;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v4

    const/16 v11, 0x1f

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-static/range {v4 .. v12}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v4

    const/16 v16, 0x1ffd

    const/16 v17, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v2 .. v17}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whoop/profile/view/edit/EditProfileScreenKt;->access$EditProfileScreen$lambda$4(Lp1/c1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;)V

    :cond_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
