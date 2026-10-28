.class public final Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/EditProfileContentKt;->EditProfileContentPreview(Landroidx/compose/runtime/Composer;I)V
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


# direct methods
.method public constructor <init>()V
    .locals 0

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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 35

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_7

    const v0, -0x1f6f6e15

    .line 2
    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    .line 3
    new-instance v13, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    const/16 v23, 0x1ff

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v13 .. v24}, Lcom/whoop/profile/presentation/edit/EditProfileViewState;-><init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileDialogState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Lcom/whoop/profile/presentation/edit/EditProfileViewState$AvatarViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EmailValidationViewState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    new-instance v14, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    .line 5
    new-instance v15, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v10, 0x3e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v4, ""

    move-object v3, v15

    invoke-direct/range {v3 .. v11}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    new-instance v16, Lcom/whoop/profile/view/edit/form/FieldState;

    const-string v4, ""

    move-object/from16 v3, v16

    invoke-direct/range {v3 .. v11}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    new-instance v17, Lcom/whoop/profile/view/edit/form/FieldState;

    const-string v4, ""

    move-object/from16 v3, v17

    invoke-direct/range {v3 .. v11}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    new-instance v18, Lcom/whoop/profile/view/edit/form/FieldState;

    const-string v4, ""

    move-object/from16 v3, v18

    invoke-direct/range {v3 .. v11}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    new-instance v3, Lcom/whoop/profile/view/edit/form/FieldState;

    const-string v4, ""

    invoke-direct/range {v3 .. v11}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    new-instance v19, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v26, 0x3e

    const/16 v27, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v20, ""

    invoke-direct/range {v19 .. v27}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    new-instance v20, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v27, 0x3e

    const/16 v28, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const-string v21, ""

    invoke-direct/range {v20 .. v28}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    new-instance v21, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v28, 0x3e

    const/16 v29, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    const-string v22, ""

    invoke-direct/range {v21 .. v29}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    new-instance v22, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v29, 0x3e

    const/16 v30, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    const-string v23, ""

    invoke-direct/range {v22 .. v30}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 14
    new-instance v23, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v30, 0x3e

    const/16 v31, 0x0

    const/16 v25, 0x0

    const/16 v29, 0x0

    const-string v24, ""

    invoke-direct/range {v23 .. v31}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    new-instance v24, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v31, 0x3e

    const/16 v32, 0x0

    const/16 v26, 0x0

    const/16 v30, 0x0

    const-string v25, ""

    invoke-direct/range {v24 .. v32}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    new-instance v25, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v32, 0x3e

    const/16 v33, 0x0

    const/16 v27, 0x0

    const/16 v31, 0x0

    const-string v26, ""

    invoke-direct/range {v25 .. v33}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    new-instance v26, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v33, 0x3e

    const/16 v34, 0x0

    const/16 v28, 0x0

    const/16 v32, 0x0

    const-string v27, ""

    invoke-direct/range {v26 .. v34}, Lcom/whoop/profile/view/edit/form/FieldState;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v27, v26

    move-object/from16 v26, v25

    move-object/from16 v25, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v21

    move-object/from16 v21, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v3

    .line 18
    invoke-direct/range {v14 .. v27}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;-><init>(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V

    .line 19
    sget-object v5, Lor2/f1;->b:Lor2/f1;

    .line 20
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    .line 21
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    .line 22
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$1$1;

    .line 23
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 24
    :cond_1
    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 25
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_2

    .line 26
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$2$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$2$1;

    .line 27
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 28
    :cond_2
    move-object v7, v0

    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 29
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    .line 30
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$3$1;

    .line 31
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 32
    :cond_3
    move-object v8, v0

    check-cast v8, Lc93/m;

    .line 33
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    .line 34
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$4$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$4$1;

    .line 35
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 36
    :cond_4
    move-object v9, v0

    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 37
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    .line 38
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$5$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$5$1;

    .line 39
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 40
    :cond_5
    move-object v10, v0

    check-cast v10, Lc93/a;

    .line 41
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    .line 42
    sget-object v0, Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$6$1;->INSTANCE:Lcom/whoop/profile/view/edit/EditProfileContentKt$EditProfileContentPreview$1$6$1;

    .line 43
    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 44
    :cond_6
    move-object v11, v0

    check-cast v11, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    const v1, 0x6db6c00

    or-int/2addr v0, v1

    move-object v4, v14

    const/4 v14, 0x0

    move-object v3, v13

    move v13, v0

    .line 45
    invoke-static/range {v3 .. v14}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->EditProfileContent(Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    .line 46
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    return-void

    .line 47
    :cond_7
    invoke-virtual {v12}, Lp1/q;->X()V

    return-void
.end method
