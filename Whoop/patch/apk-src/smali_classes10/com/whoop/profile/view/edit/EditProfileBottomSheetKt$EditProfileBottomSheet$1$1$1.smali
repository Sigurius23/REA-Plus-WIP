.class final Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->EditProfileBottomSheet(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lc93/m;Lkotlin/jvm/functions/Function1;Lg1/z3;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.profile.view.edit.EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1"
    f = "EditProfileBottomSheet.kt"
    l = {
        0x63
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $avatarCropBounds$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $avatarIsInCropMode$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $avatarSelectedImageUri$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $currentBottomSheet$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $modalBottomSheetState:Lg1/y3;

.field final synthetic $overrideUnitSystem$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg1/y3;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$modalBottomSheetState:Lg1/y3;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$currentBottomSheet$delegate:Lp1/c1;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$overrideUnitSystem$delegate:Lp1/c1;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarIsInCropMode$delegate:Lp1/c1;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarSelectedImageUri$delegate:Lp1/c1;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarCropBounds$delegate:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$modalBottomSheetState:Lg1/y3;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$currentBottomSheet$delegate:Lp1/c1;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$overrideUnitSystem$delegate:Lp1/c1;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarIsInCropMode$delegate:Lp1/c1;

    iget-object v5, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarSelectedImageUri$delegate:Lp1/c1;

    iget-object v6, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarCropBounds$delegate:Lp1/c1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;-><init>(Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$modalBottomSheetState:Lg1/y3;

    iput v2, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->label:I

    invoke-virtual {p1, p0}, Lg1/y3;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$currentBottomSheet$delegate:Lp1/c1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->access$EditProfileBottomSheet$lambda$2(Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;)V

    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$overrideUnitSystem$delegate:Lp1/c1;

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->access$EditProfileBottomSheet$lambda$5(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarIsInCropMode$delegate:Lp1/c1;

    const/4 v1, 0x0

    invoke-static {p1, v1}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->access$EditProfileBottomSheet$lambda$17(Lp1/c1;Z)V

    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarSelectedImageUri$delegate:Lp1/c1;

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->access$EditProfileBottomSheet$lambda$20(Lp1/c1;Landroid/net/Uri;)V

    iget-object p1, p0, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt$EditProfileBottomSheet$1$1$1;->$avatarCropBounds$delegate:Lp1/c1;

    invoke-static {p1, v0}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->access$EditProfileBottomSheet$lambda$23(Lp1/c1;Landroid/graphics/Rect;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
