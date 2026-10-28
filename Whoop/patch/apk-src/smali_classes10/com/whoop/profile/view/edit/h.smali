.class public final synthetic Lcom/whoop/profile/view/edit/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Lg1/y3;

.field public final synthetic G:Lp1/c1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lp1/c1;

.field public final synthetic L:Lp1/c1;

.field public final synthetic M:Lp1/c1;

.field public final synthetic N:Lp1/c1;

.field public final synthetic w:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

.field public final synthetic x:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

.field public final synthetic y:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/h;->w:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/h;->x:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/h;->y:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/h;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/h;->E:Lbc3/c0;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/h;->F:Lg1/y3;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/h;->G:Lp1/c1;

    iput-object p8, p0, Lcom/whoop/profile/view/edit/h;->H:Lp1/c1;

    iput-object p9, p0, Lcom/whoop/profile/view/edit/h;->I:Lp1/c1;

    iput-object p10, p0, Lcom/whoop/profile/view/edit/h;->J:Lp1/c1;

    iput-object p11, p0, Lcom/whoop/profile/view/edit/h;->K:Lp1/c1;

    iput-object p12, p0, Lcom/whoop/profile/view/edit/h;->L:Lp1/c1;

    iput-object p13, p0, Lcom/whoop/profile/view/edit/h;->M:Lp1/c1;

    iput-object p14, p0, Lcom/whoop/profile/view/edit/h;->N:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-object v1, v0, Lcom/whoop/profile/view/edit/h;->w:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iget-object v2, v0, Lcom/whoop/profile/view/edit/h;->x:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v3, v0, Lcom/whoop/profile/view/edit/h;->y:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v4, v0, Lcom/whoop/profile/view/edit/h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lcom/whoop/profile/view/edit/h;->E:Lbc3/c0;

    iget-object v6, v0, Lcom/whoop/profile/view/edit/h;->F:Lg1/y3;

    iget-object v7, v0, Lcom/whoop/profile/view/edit/h;->G:Lp1/c1;

    iget-object v8, v0, Lcom/whoop/profile/view/edit/h;->H:Lp1/c1;

    iget-object v9, v0, Lcom/whoop/profile/view/edit/h;->I:Lp1/c1;

    iget-object v10, v0, Lcom/whoop/profile/view/edit/h;->J:Lp1/c1;

    iget-object v11, v0, Lcom/whoop/profile/view/edit/h;->K:Lp1/c1;

    iget-object v12, v0, Lcom/whoop/profile/view/edit/h;->L:Lp1/c1;

    iget-object v13, v0, Lcom/whoop/profile/view/edit/h;->M:Lp1/c1;

    iget-object v14, v0, Lcom/whoop/profile/view/edit/h;->N:Lp1/c1;

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->l(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
