.class public final Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheetContentPreview$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileBottomSheetKt;->ProfileBottomSheetContentPreview(Landroidx/compose/runtime/Composer;I)V
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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileBottomSheetKt$ProfileBottomSheetContentPreview$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const p2, 0x5b3da7e6

    .line 2
    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    .line 3
    sget-object p2, Lb2/t;->w:Lb2/t;

    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    .line 5
    invoke-static {p2}, Lgb1/b0;->T(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    int-to-float v0, v3

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v0, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    .line 6
    invoke-static {p2, v0, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object p2

    .line 7
    sget-object v0, Lb2/e;->N:Lb2/k;

    .line 8
    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v4, 0x30

    .line 9
    invoke-static {v3, v0, p1, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    .line 10
    iget-wide v3, p1, Lp1/q;->T:J

    .line 11
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    .line 12
    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    .line 13
    invoke-static {p1, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    .line 14
    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    sget-object v5, La3/k;->b:La3/j;

    .line 16
    invoke-virtual {p1}, Lp1/q;->i0()V

    .line 17
    iget-boolean v6, p1, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    .line 18
    invoke-virtual {p1, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lp1/q;->s0()V

    .line 20
    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    .line 21
    invoke-static {p1, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 22
    sget-object v0, La3/k;->f:La3/i;

    .line 23
    invoke-static {p1, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 24
    sget-object v0, La3/k;->j:La3/i;

    .line 25
    iget-boolean v4, p1, Lp1/q;->S:Z

    if-nez v4, :cond_2

    .line 26
    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 27
    :cond_2
    invoke-static {v3, p1, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    .line 28
    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    .line 29
    invoke-static {p1, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 30
    new-instance p2, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;

    .line 31
    new-instance v0, Lkd1/o$a;

    sget v3, Lgy0/a;->D0:I

    invoke-direct {v0, v3}, Lkd1/o$a;-><init>(I)V

    .line 32
    const-string v3, "Special Feature"

    .line 33
    const-string v4, "This is a generic bottom sheet that can be used to display additional information about any profile feature."

    .line 34
    invoke-direct {p2, v0, v3, v4}, Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;-><init>(Lkd1/o;Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Lkd1/o;->a:I

    .line 35
    invoke-static {p2, p1, v0}, Lcom/whoop/profile/view/ProfileBottomSheetKt;->access$ProfileBottomSheetContent(Lcom/whoop/profile/presentation/ProfileViewState$BottomSheet;Landroidx/compose/runtime/Composer;I)V

    .line 36
    invoke-virtual {p1, v2}, Lp1/q;->q(Z)V

    .line 37
    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-void

    .line 38
    :cond_4
    invoke-virtual {p1}, Lp1/q;->X()V

    return-void
.end method
