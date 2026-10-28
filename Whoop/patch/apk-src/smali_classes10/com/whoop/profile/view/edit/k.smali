.class public final synthetic Lcom/whoop/profile/view/edit/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

.field public final synthetic F:Landroid/content/Context;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lp1/c1;

.field public final synthetic J:Lp1/c1;

.field public final synthetic K:Lp1/c1;

.field public final synthetic L:Lp1/c1;

.field public final synthetic M:Lp1/c1;

.field public final synthetic N:Lp1/c1;

.field public final synthetic O:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

.field public final synthetic w:Lp1/c1;

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lg1/y3;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lbc3/c0;Lg1/y3;Lc93/m;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileViewState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/k;->w:Lp1/c1;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/k;->x:Lbc3/c0;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/k;->y:Lg1/y3;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/k;->z:Lc93/m;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/k;->E:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/k;->F:Landroid/content/Context;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/k;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/whoop/profile/view/edit/k;->H:Lp1/c1;

    iput-object p9, p0, Lcom/whoop/profile/view/edit/k;->I:Lp1/c1;

    iput-object p10, p0, Lcom/whoop/profile/view/edit/k;->J:Lp1/c1;

    iput-object p11, p0, Lcom/whoop/profile/view/edit/k;->K:Lp1/c1;

    iput-object p12, p0, Lcom/whoop/profile/view/edit/k;->L:Lp1/c1;

    iput-object p13, p0, Lcom/whoop/profile/view/edit/k;->M:Lp1/c1;

    iput-object p14, p0, Lcom/whoop/profile/view/edit/k;->N:Lp1/c1;

    iput-object p15, p0, Lcom/whoop/profile/view/edit/k;->O:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Ll0/y;

    move-object/from16 v17, p2

    check-cast v17, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v18

    iget-object v1, v0, Lcom/whoop/profile/view/edit/k;->w:Lp1/c1;

    iget-object v2, v0, Lcom/whoop/profile/view/edit/k;->x:Lbc3/c0;

    iget-object v3, v0, Lcom/whoop/profile/view/edit/k;->y:Lg1/y3;

    iget-object v4, v0, Lcom/whoop/profile/view/edit/k;->z:Lc93/m;

    iget-object v5, v0, Lcom/whoop/profile/view/edit/k;->E:Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v6, v0, Lcom/whoop/profile/view/edit/k;->F:Landroid/content/Context;

    iget-object v7, v0, Lcom/whoop/profile/view/edit/k;->G:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lcom/whoop/profile/view/edit/k;->H:Lp1/c1;

    iget-object v9, v0, Lcom/whoop/profile/view/edit/k;->I:Lp1/c1;

    iget-object v10, v0, Lcom/whoop/profile/view/edit/k;->J:Lp1/c1;

    iget-object v11, v0, Lcom/whoop/profile/view/edit/k;->K:Lp1/c1;

    iget-object v12, v0, Lcom/whoop/profile/view/edit/k;->L:Lp1/c1;

    iget-object v13, v0, Lcom/whoop/profile/view/edit/k;->M:Lp1/c1;

    iget-object v14, v0, Lcom/whoop/profile/view/edit/k;->N:Lp1/c1;

    iget-object v15, v0, Lcom/whoop/profile/view/edit/k;->O:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    invoke-static/range {v1 .. v18}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->d(Lp1/c1;Lbc3/c0;Lg1/y3;Lc93/m;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method
