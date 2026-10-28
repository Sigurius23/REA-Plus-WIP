.class final Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetKt$PhotoCropDisplay$3$1"
    f = "AvatarEditBottomSheet.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $imageSize$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $offset$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $onCropBoundsChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $scale$delegate:Lp1/z0;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lp1/c1;",
            "Lp1/z0;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$onCropBoundsChanged:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$imageSize$delegate:Lp1/c1;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$scale$delegate:Lp1/z0;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$offset$delegate:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$onCropBoundsChanged:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$imageSize$delegate:Lp1/c1;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$scale$delegate:Lp1/z0;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$offset$delegate:Lp1/c1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/z0;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->label:I

    if-nez v1, :cond_2

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$imageSize$delegate:Lp1/c1;

    invoke-static {v1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$8(Lp1/c1;)Ly3/l;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v3, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$onCropBoundsChanged:Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$scale$delegate:Lp1/z0;

    iget-object v5, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$offset$delegate:Lp1/c1;

    iget-wide v6, v1, Ly3/l;->a:J

    const/16 v1, 0x20

    shr-long v8, v6, v1

    long-to-int v8, v8

    int-to-float v9, v8

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v10

    div-float v10, v9, v10

    const-wide v11, 0xffffffffL

    and-long/2addr v6, v11

    long-to-int v6, v6

    int-to-float v7, v6

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v13

    div-float v13, v7, v13

    const/high16 v14, 0x437c0000    # 252.0f

    div-float v15, v9, v14

    div-float v14, v7, v14

    const/high16 v16, 0x40000000    # 2.0f

    div-float v9, v9, v16

    invoke-static {v5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v17

    move-wide/from16 v19, v11

    shr-long v11, v17, v1

    long-to-int v1, v11

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    mul-float/2addr v1, v15

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v11

    div-float/2addr v1, v11

    sub-float/2addr v9, v1

    div-float v7, v7, v16

    invoke-static {v5}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$5(Lp1/c1;)J

    move-result-wide v11

    and-long v11, v11, v19

    long-to-int v1, v11

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    mul-float/2addr v1, v14

    invoke-static {v4}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$2(Lp1/z0;)F

    move-result v4

    div-float/2addr v1, v4

    sub-float/2addr v7, v1

    invoke-static {v10, v13}, Ljava/lang/Math;->min(FF)F

    move-result v1

    div-float v1, v1, v16

    sub-float v4, v9, v1

    float-to-int v4, v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v8}, Le93/b;->n(III)I

    move-result v4

    sub-float v10, v7, v1

    float-to-int v10, v10

    invoke-static {v10, v5, v6}, Le93/b;->n(III)I

    move-result v10

    add-float/2addr v9, v1

    float-to-int v9, v9

    invoke-static {v9, v5, v8}, Le93/b;->n(III)I

    move-result v8

    add-float/2addr v7, v1

    float-to-int v1, v7

    invoke-static {v1, v5, v6}, Le93/b;->n(III)I

    move-result v1

    if-le v8, v4, :cond_0

    if-le v1, v10, :cond_0

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v4, v10, v8, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$3$1;->$onCropBoundsChanged:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
