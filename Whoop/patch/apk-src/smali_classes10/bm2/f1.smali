.class public final synthetic Lbm2/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic M:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Enum;Lcom/whoop/design/util/TextResource;Ljava/lang/Enum;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/Enum;III)V
    .locals 0

    .line 1
    iput p13, p0, Lbm2/f1;->w:I

    iput-object p1, p0, Lbm2/f1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbm2/f1;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbm2/f1;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbm2/f1;->I:Ljava/lang/Object;

    iput-object p5, p0, Lbm2/f1;->G:Ljava/lang/Object;

    iput-object p6, p0, Lbm2/f1;->J:Ljava/lang/Object;

    iput-object p7, p0, Lbm2/f1;->K:Ljava/lang/Object;

    iput-object p8, p0, Lbm2/f1;->H:Ljava/lang/Object;

    iput-object p9, p0, Lbm2/f1;->L:Ljava/lang/Object;

    iput-object p10, p0, Lbm2/f1;->M:Ljava/lang/Object;

    iput p11, p0, Lbm2/f1;->x:I

    iput p12, p0, Lbm2/f1;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V
    .locals 0

    .line 2
    iput p13, p0, Lbm2/f1;->w:I

    iput-object p1, p0, Lbm2/f1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lbm2/f1;->E:Ljava/lang/Object;

    iput-object p3, p0, Lbm2/f1;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbm2/f1;->G:Ljava/lang/Object;

    iput-object p5, p0, Lbm2/f1;->H:Ljava/lang/Object;

    iput-object p6, p0, Lbm2/f1;->I:Ljava/lang/Object;

    iput-object p7, p0, Lbm2/f1;->J:Ljava/lang/Object;

    iput-object p8, p0, Lbm2/f1;->K:Ljava/lang/Object;

    iput-object p9, p0, Lbm2/f1;->L:Ljava/lang/Object;

    iput-object p10, p0, Lbm2/f1;->M:Ljava/lang/Object;

    iput p11, p0, Lbm2/f1;->x:I

    iput p12, p0, Lbm2/f1;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lbm2/f1;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/profile/navigation/ProfileActionRouter;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Leb/u0;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ltr2/n;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Landroidx/fragment/app/r0;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/Integer;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ljava/lang/Integer;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ljava/lang/String;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->c(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lv41/j0;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lv41/l0;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ly81/e;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ly81/e;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lv41/k0;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lv41/l;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lv41/j0;Lcom/whoop/design/util/TextResource;Lv41/l0;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lv41/k0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_1
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lqi0/d;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lqi0/a;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lcom/whoop/analytics/ScreenAnalyticEventModel;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lcom/whoop/navigation/CachePolicyModel;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lcom/whoop/archv2/feature/domain/m;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lc93/m;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lui0/n;->i(Lqi0/d;Lqi0/a;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Ljava/lang/String;Lcom/whoop/navigation/CachePolicyModel;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/archv2/feature/domain/m;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_2
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lj02/x0;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Leb/a0;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Leb/a0;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Landroidx/fragment/app/r0;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Leb/q;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lto2/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_3
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Leb/u0;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Leb/a0;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Landroidx/fragment/app/r0;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lj02/x0;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Ljava/lang/String;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lcom/whoop/universalcheckout/features/a;->f(Leb/u0;Leb/a0;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_4
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Ltr2/n;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lc93/m;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/m;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lc93/a;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lc93/a;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lcom/whoop/profile/view/edit/EditProfileFieldsContentKt;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_5
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Ltr2/n;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lc93/m;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc93/m;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lkotlin/jvm/functions/Function1;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lc93/a;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lc93/a;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->m(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_6
    iget-object v1, v0, Lbm2/f1;->z:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->E:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->I:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lbm2/u0;

    iget-object v1, v0, Lbm2/f1;->G:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->J:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lul2/b;

    iget-object v1, v0, Lbm2/f1;->K:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ly81/e;

    iget-object v1, v0, Lbm2/f1;->H:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lcom/whoop/design/util/TextResource;

    iget-object v1, v0, Lbm2/f1;->L:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Ly81/e;

    iget-object v1, v0, Lbm2/f1;->M:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lbm2/v0;

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget v12, v0, Lbm2/f1;->x:I

    iget v13, v0, Lbm2/f1;->y:I

    invoke-static/range {v2 .. v15}, Lbm2/k1;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/u0;Lcom/whoop/design/util/TextResource;Lul2/b;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Lbm2/v0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

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
