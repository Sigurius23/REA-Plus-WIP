.class final Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;
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
    c = "com.whoop.profile.view.edit.avatar.AvatarEditBottomSheetKt$PhotoCropDisplay$2$1"
    f = "AvatarEditBottomSheet.kt"
    l = {
        0x42
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $imageSize$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $imageUri:Landroid/net/Uri;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$context:Landroid/content/Context;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageUri:Landroid/net/Uri;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageSize$delegate:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$context:Landroid/content/Context;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageUri:Landroid/net/Uri;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageSize$delegate:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;-><init>(Landroid/content/Context;Landroid/net/Uri;Lp1/c1;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lmh/j;

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lbh/e;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$context:Landroid/content/Context;

    invoke-static {p1}, Lkotlin/jvm/internal/j;->x(Landroid/content/Context;)Lbh/j;

    move-result-object p1

    new-instance v1, Lmh/h;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$context:Landroid/content/Context;

    invoke-direct {v1, v4}, Lmh/h;-><init>(Landroid/content/Context;)V

    iget-object v4, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageUri:Landroid/net/Uri;

    iput-object v4, v1, Lmh/h;->c:Ljava/lang/Object;

    sget-object v4, Lnh/h;->c:Lnh/h;

    invoke-virtual {v1, v4}, Lmh/h;->e(Lnh/h;)V

    invoke-virtual {v1}, Lmh/h;->a()Lmh/j;

    move-result-object v1

    iput-object v3, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->label:I

    invoke-virtual {p1, v1, p0}, Lbh/j;->b(Lmh/j;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lmh/k;

    invoke-virtual {p1}, Lmh/k;->a()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageSize$delegate:Lp1/c1;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    int-to-long v1, v1

    const/16 v4, 0x20

    shl-long/2addr v1, v4

    int-to-long v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v1, v4

    new-instance p1, Ly3/l;

    invoke-direct {p1, v1, v2}, Ly3/l;-><init>(J)V

    invoke-static {v0, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$9(Lp1/c1;Ly3/l;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    iget-object p1, p0, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt$PhotoCropDisplay$2$1;->$imageSize$delegate:Lp1/c1;

    invoke-static {p1, v3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->access$PhotoCropDisplay$lambda$9(Lp1/c1;Ly3/l;)V

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
