.class public final synthetic Lce2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Lce2/b;->w:I

    iput-object p1, p0, Lce2/b;->z:Ljava/lang/Object;

    iput-object p2, p0, Lce2/b;->x:Ljava/lang/Object;

    iput p3, p0, Lce2/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lce2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcy0/c;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ley0/i;->e(Lcy0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcy0/c$c;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ley0/d;->d(Lcy0/c$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Ln0/u;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Ln0/u;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lev2/u;->I(Ln0/u;Ln0/u;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcv1/c$d;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lev1/g;->c(Lcv1/c$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcv1/c;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lev1/f;->b(Lcv1/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcv1/c$b;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lev1/e;->b(Lcv1/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lj31/k;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Leu2/g;->g(Lj31/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcj1/i$c;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lej1/j;->b(Lcj1/i$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcj1/b;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lej1/e;->a(Lcj1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lcj1/d;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lej1/d;->b(Landroidx/compose/ui/Modifier;Lcj1/d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/settings/h;->i(Ljava/util/List;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_a
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lxk1/b;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ldl1/d;->d(Lxk1/b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_b
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lh71/l;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ldk2/n;->a(Lh71/l;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_c
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lj71/c;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ld71/e;->b(Landroidx/compose/ui/Modifier;Lj71/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_d
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lc42/g;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Ld42/d;->a(Lc42/g;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_e
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/StrengthTrainerFragment;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Leb/u0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/weightlifting/StrengthTrainerFragment;->z(Lcom/whoop/weightlifting/StrengthTrainerFragment;Leb/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_f
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lbt1/d$b;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lct1/a;->f(Lbt1/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_10
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/models/PhysiologicalBaseline;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/edit/PhysiologicalBaselineSelectionContentKt;->b(Lcom/whoop/profile/domain/models/PhysiologicalBaseline;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_11
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/domain/models/Gender;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/edit/GenderSelectionContentKt;->b(Lcom/whoop/profile/domain/models/Gender;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_12
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/edit/EditProfileFullScreenModalKt;->d(Lcom/whoop/profile/presentation/edit/EditProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_13
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->w(Lcom/whoop/profile/presentation/ProfileViewState$ProfileDialogState;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_14
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lkd1/o;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt;->y(Lkd1/o;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_15
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt;->f(Lcom/whoop/profile/presentation/ProfileViewState$FullScreenModal;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_16
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/profile/presentation/ProfileViewState;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->b(Lcom/whoop/profile/presentation/ProfileViewState;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_17
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lcom/whoop/bot/settings/CoachSettingsScreenKt;->l(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_18
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function3;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lch0/i1;->a(Lc93/a;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_19
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Ll0/u;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lch0/o0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lch0/q0;->b(Ll0/u;Lch0/o0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1a
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lbe2/d$b;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lce2/c;->i(Lbe2/d$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1b
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lbe2/d$a;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lce2/c;->j(Lbe2/d$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1c
    iget-object v0, p0, Lce2/b;->z:Ljava/lang/Object;

    check-cast v0, Lbe2/d;

    iget-object v1, p0, Lce2/b;->x:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget v2, p0, Lce2/b;->y:I

    invoke-static {v0, v1, v2, p1, p2}, Lce2/c;->f(Lbe2/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
