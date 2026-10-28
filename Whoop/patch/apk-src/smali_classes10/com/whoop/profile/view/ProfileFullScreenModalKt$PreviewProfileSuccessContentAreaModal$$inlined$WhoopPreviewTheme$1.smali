.class public final Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileFullScreenModalKt;->PreviewProfileSuccessContentAreaModal(Landroidx/compose/runtime/Composer;I)V
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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    const p1, -0x6cd80548

    .line 2
    invoke-virtual {v6, p1}, Lp1/q;->e0(I)V

    .line 3
    sget-object p1, Lcom/whoop/profile/samples/ProfileSamples;->INSTANCE:Lcom/whoop/profile/samples/ProfileSamples;

    invoke-virtual {p1}, Lcom/whoop/profile/samples/ProfileSamples;->getSampleSuccessViewState()Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v3

    .line 4
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    .line 5
    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    .line 6
    sget-object p1, Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$1$1$1;->INSTANCE:Lcom/whoop/profile/view/ProfileFullScreenModalKt$PreviewProfileSuccessContentAreaModal$1$1$1;

    .line 7
    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    .line 8
    :cond_1
    move-object v5, p1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v7, 0x180

    const/4 v8, 0x2

    const/4 v4, 0x0

    .line 9
    invoke-static/range {v3 .. v8}, Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/presentation/ProfileViewState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    .line 10
    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    return-void

    .line 11
    :cond_2
    invoke-virtual {v6}, Lp1/q;->X()V

    return-void
.end method
