.class public final synthetic Lcom/whoop/profile/presentation/edit/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

.field public final synthetic y:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    iput p9, p0, Lcom/whoop/profile/presentation/edit/d;->w:I

    iput-object p1, p0, Lcom/whoop/profile/presentation/edit/d;->x:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iput-object p2, p0, Lcom/whoop/profile/presentation/edit/d;->y:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iput-object p3, p0, Lcom/whoop/profile/presentation/edit/d;->z:Lc93/m;

    iput-object p4, p0, Lcom/whoop/profile/presentation/edit/d;->E:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/profile/presentation/edit/d;->F:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/profile/presentation/edit/d;->G:Ljava/lang/String;

    iput p7, p0, Lcom/whoop/profile/presentation/edit/d;->H:I

    iput p8, p0, Lcom/whoop/profile/presentation/edit/d;->I:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lcom/whoop/profile/presentation/edit/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/d;->x:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/d;->y:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/d;->z:Lc93/m;

    iget-object v4, p0, Lcom/whoop/profile/presentation/edit/d;->E:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/profile/presentation/edit/d;->F:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/profile/presentation/edit/d;->G:Ljava/lang/String;

    iget v7, p0, Lcom/whoop/profile/presentation/edit/d;->H:I

    iget v8, p0, Lcom/whoop/profile/presentation/edit/d;->I:I

    invoke-static/range {v1 .. v10}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->c(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lcom/whoop/profile/presentation/edit/d;->x:Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;

    iget-object v1, p0, Lcom/whoop/profile/presentation/edit/d;->y:Lcom/whoop/profile/presentation/edit/EditProfileViewState;

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/d;->z:Lc93/m;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/d;->E:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/profile/presentation/edit/d;->F:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/profile/presentation/edit/d;->G:Ljava/lang/String;

    iget v6, p0, Lcom/whoop/profile/presentation/edit/d;->H:I

    iget v7, p0, Lcom/whoop/profile/presentation/edit/d;->I:I

    invoke-static/range {v0 .. v9}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->a(Lcom/whoop/profile/presentation/edit/EditProfileViewState$BottomSheetType;Lcom/whoop/profile/presentation/edit/EditProfileViewState;Lc93/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
