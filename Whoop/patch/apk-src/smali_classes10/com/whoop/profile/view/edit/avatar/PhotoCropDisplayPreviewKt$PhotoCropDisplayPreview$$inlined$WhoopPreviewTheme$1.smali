.class public final Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt$PhotoCropDisplayPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt;->PhotoCropDisplayPreview(Landroidx/compose/runtime/Composer;I)V
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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt$PhotoCropDisplayPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    const p2, -0x161349a0

    .line 2
    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    .line 3
    const-string p2, "https://example.com/image.jpg"

    .line 4
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    .line 5
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    .line 6
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    .line 7
    sget-object v0, Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt$PhotoCropDisplayPreview$1$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/PhotoCropDisplayPreviewKt$PhotoCropDisplayPreview$1$1$1;

    .line 8
    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 9
    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0x30

    .line 10
    invoke-static {p2, v0, p1, v1, v3}, Lcom/whoop/profile/view/edit/avatar/AvatarEditBottomSheetKt;->PhotoCropDisplay(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 11
    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    return-void

    .line 12
    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    return-void
.end method
