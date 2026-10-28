.class public final Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt;->PhotoSourceActionSheetPreview(Landroidx/compose/runtime/Composer;I)V
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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

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
    and-int/2addr p2, v3

    move-object v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, -0x4881d9fd

    .line 2
    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    .line 3
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    .line 4
    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    .line 5
    sget-object p1, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$1$1;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$1$1;

    .line 6
    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 7
    :cond_1
    move-object v3, p1

    check-cast v3, Lc93/a;

    .line 8
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_2

    .line 9
    sget-object p1, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$2$1;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$2$1;

    .line 10
    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 11
    :cond_2
    move-object v4, p1

    check-cast v4, Lc93/a;

    .line 12
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_3

    .line 13
    sget-object p1, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$3$1;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$3$1;

    .line 14
    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 15
    :cond_3
    move-object v5, p1

    check-cast v5, Lc93/a;

    .line 16
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p2, :cond_4

    .line 17
    sget-object p1, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$4$1;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetPreviewKt$PhotoSourceActionSheetPreview$1$4$1;

    .line 18
    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 19
    :cond_4
    move-object v7, p1

    check-cast v7, Lc93/a;

    const/16 v9, 0x6db6

    const/4 v10, 0x0

    const/4 v6, 0x1

    .line 20
    invoke-static/range {v3 .. v10}, Lcom/whoop/profile/view/edit/avatar/PhotoSourceActionSheetKt;->PhotoSourceActionSheet(Lc93/a;Lc93/a;Lc93/a;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    .line 21
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    return-void

    .line 22
    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method
