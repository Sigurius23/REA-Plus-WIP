.class public final Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt;->EditProfileBottomSheetPreview(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $bottomSheetType$inlined:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

.field final synthetic $initialSheetValue$inlined:Lg1/z3;


# direct methods
.method public constructor <init>(Lg1/z3;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;->$initialSheetValue$inlined:Lg1/z3;

    iput-object p2, p0, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;->$bottomSheetType$inlined:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, -0x37834299

    .line 2
    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    .line 3
    sget-object v1, Lcom/whoop/profile/samples/EditProfileSamples;->INSTANCE:Lcom/whoop/profile/samples/EditProfileSamples;

    invoke-virtual {v1}, Lcom/whoop/profile/samples/EditProfileSamples;->getSampleEditProfileViewState()Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    move-result-object v4

    .line 4
    new-instance v5, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 5
    new-instance v13, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v12, v13

    const-string v13, "test@example.com"

    invoke-direct/range {v12 .. v20}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    new-instance v13, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v20, 0x3e

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const-string v14, "testuser"

    invoke-direct/range {v13 .. v21}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    new-instance v14, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v21, 0x3e

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const-string v15, "John"

    invoke-direct/range {v14 .. v22}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    new-instance v15, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v22, 0x3e

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const-string v16, "Doe"

    invoke-direct/range {v15 .. v23}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    new-instance v16, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v23, 0x3e

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v22, 0x0

    const-string v17, "175"

    invoke-direct/range {v16 .. v24}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    new-instance v17, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v24, 0x3e

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const-string v18, "70"

    invoke-direct/range {v17 .. v25}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    new-instance v18, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v25, 0x3e

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v24, 0x0

    const-string v19, "metric"

    invoke-direct/range {v18 .. v26}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    new-instance v19, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v26, 0x3e

    const/16 v27, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const-string v20, "MALE"

    invoke-direct/range {v19 .. v27}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    new-instance v20, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v27, 0x3e

    const/16 v28, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const-string v21, "MALE"

    invoke-direct/range {v20 .. v28}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    new-instance v21, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v28, 0x3e

    const/16 v29, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    const-string v22, "US"

    invoke-direct/range {v21 .. v29}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    new-instance v22, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v29, 0x3e

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    const-string v23, "CA"

    invoke-direct/range {v22 .. v30}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    new-instance v23, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v30, 0x3e

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    const-string v24, "1990-01-01"

    invoke-direct/range {v23 .. v31}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    new-instance v24, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v31, 0x3e

    const/16 v32, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const-string v25, "San Francisco"

    invoke-direct/range {v24 .. v32}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v25, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v21

    move-object/from16 v21, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v17

    move-object/from16 v17, v16

    move-object/from16 v16, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v5

    .line 18
    invoke-direct/range {v12 .. v25}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;-><init>(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V

    .line 19
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    .line 20
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_1

    .line 21
    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$1$1;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$1$1;

    .line 22
    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 23
    :cond_1
    move-object v6, v1

    check-cast v6, Lc93/m;

    .line 24
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_2

    .line 25
    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$2$1;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$1$2$1;

    .line 26
    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 27
    :cond_2
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 28
    iget-object v8, v0, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;->$initialSheetValue$inlined:Lg1/z3;

    .line 29
    iget-object v9, v0, Lcom/whoop/profile/presentation/edit/EditProfileBottomSheetPreviewKt$EditProfileBottomSheetPreview$$inlined$WhoopPreviewTheme$1;->$bottomSheetType$inlined:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    sget-object v1, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->INSTANCE:Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/ComposableSingletons$EditProfileBottomSheetPreviewKt;->getLambda$259284293$profile_release()Lkotlin/jvm/functions/Function3;

    move-result-object v10

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x3

    const v2, 0x186d80

    or-int v12, v1, v2

    const/4 v13, 0x0

    .line 30
    invoke-static/range {v4 .. v13}, Lcom/whoop/profile/view/edit/EditProfileBottomSheetKt;->EditProfileBottomSheet(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lc93/m;Lkotlin/jvm/functions/Function1;Lg1/z3;Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 31
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    return-void

    .line 32
    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    return-void
.end method
