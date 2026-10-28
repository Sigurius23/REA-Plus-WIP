.class public final synthetic Lcom/whoop/profile/presentation/edit/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:Z

.field public final synthetic z:Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;


# direct methods
.method public synthetic constructor <init>(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p6, p0, Lcom/whoop/profile/presentation/edit/c;->w:I

    iput p1, p0, Lcom/whoop/profile/presentation/edit/c;->x:F

    iput-boolean p2, p0, Lcom/whoop/profile/presentation/edit/c;->y:Z

    iput-object p3, p0, Lcom/whoop/profile/presentation/edit/c;->z:Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    iput-object p4, p0, Lcom/whoop/profile/presentation/edit/c;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lcom/whoop/profile/presentation/edit/c;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lcom/whoop/profile/presentation/edit/c;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v1, p0, Lcom/whoop/profile/presentation/edit/c;->x:F

    iget-boolean v2, p0, Lcom/whoop/profile/presentation/edit/c;->y:Z

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/c;->z:Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    iget-object v4, p0, Lcom/whoop/profile/presentation/edit/c;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lcom/whoop/profile/presentation/edit/c;->F:I

    invoke-static/range {v1 .. v7}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->g(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v0, p0, Lcom/whoop/profile/presentation/edit/c;->x:F

    iget-boolean v1, p0, Lcom/whoop/profile/presentation/edit/c;->y:Z

    iget-object v2, p0, Lcom/whoop/profile/presentation/edit/c;->z:Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    iget-object v3, p0, Lcom/whoop/profile/presentation/edit/c;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lcom/whoop/profile/presentation/edit/c;->F:I

    invoke-static/range {v0 .. v6}, Lcom/whoop/profile/presentation/edit/HeightWeightContentKt;->b(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
