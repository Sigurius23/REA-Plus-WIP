.class public final synthetic Lbs1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lds1/k;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lv41/f$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lbs1/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs1/u;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbs1/u;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lbs1/u;->F:Ljava/lang/Object;

    iput-object p4, p0, Lbs1/u;->G:Ljava/lang/Object;

    iput-object p5, p0, Lbs1/u;->H:Ljava/lang/Object;

    iput-object p6, p0, Lbs1/u;->y:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lbs1/u;->z:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lbs1/u;->I:Ljava/lang/Object;

    iput-object p9, p0, Lbs1/u;->J:Ljava/lang/Object;

    iput-object p10, p0, Lbs1/u;->K:Ljava/lang/Object;

    iput-object p11, p0, Lbs1/u;->L:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lj0/i;Lg2/i;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lbs1/u;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbs1/u;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbs1/u;->F:Ljava/lang/Object;

    iput-object p3, p0, Lbs1/u;->G:Ljava/lang/Object;

    iput-object p4, p0, Lbs1/u;->x:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lbs1/u;->y:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lbs1/u;->H:Ljava/lang/Object;

    iput-object p7, p0, Lbs1/u;->I:Ljava/lang/Object;

    iput-object p8, p0, Lbs1/u;->J:Ljava/lang/Object;

    iput-object p9, p0, Lbs1/u;->z:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lbs1/u;->K:Ljava/lang/Object;

    iput-object p11, p0, Lbs1/u;->L:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lbs1/u;->w:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Lbs1/u;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lj0/i;

    iget-object v1, v0, Lbs1/u;->F:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Lg2/i;

    iget-object v1, v0, Lbs1/u;->G:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v1, v0, Lbs1/u;->H:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v1, v0, Lbs1/u;->I:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Ltr2/n;

    iget-object v1, v0, Lbs1/u;->J:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lc93/m;

    iget-object v1, v0, Lbs1/u;->K:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lc93/a;

    iget-object v1, v0, Lbs1/u;->L:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lc93/a;

    move-object/from16 v13, p1

    check-cast v13, Lc93/m;

    move-object/from16 v14, p2

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v5, v0, Lbs1/u;->x:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lbs1/u;->y:Lkotlin/jvm/functions/Function1;

    iget-object v10, v0, Lbs1/u;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v2 .. v15}, Lcom/whoop/profile/view/edit/EditProfileContentKt;->h(Lj0/i;Lg2/i;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ltr2/n;Lc93/m;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    :pswitch_0
    iget-object v1, v0, Lbs1/u;->E:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lds1/k;

    iget-object v1, v0, Lbs1/u;->F:Ljava/lang/Object;

    move-object v4, v1

    check-cast v4, Lbc3/c0;

    iget-object v1, v0, Lbs1/u;->G:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lg1/y3;

    iget-object v1, v0, Lbs1/u;->H:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lv41/f$a;

    iget-object v1, v0, Lbs1/u;->I:Ljava/lang/Object;

    move-object v9, v1

    check-cast v9, Lp1/c1;

    iget-object v1, v0, Lbs1/u;->J:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lp1/c1;

    iget-object v1, v0, Lbs1/u;->K:Ljava/lang/Object;

    move-object v11, v1

    check-cast v11, Lp1/c1;

    iget-object v1, v0, Lbs1/u;->L:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lp1/c1;

    move-object/from16 v13, p1

    check-cast v13, Ll0/y;

    move-object/from16 v14, p2

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v3, v0, Lbs1/u;->x:Lkotlin/jvm/functions/Function1;

    iget-object v7, v0, Lbs1/u;->y:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lbs1/u;->z:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v2 .. v15}, Lbs1/c0;->y(Lds1/k;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;Lv41/f$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Lp1/c1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
