.class public final Lcom/whoop/profile/view/components/StreaksTileKt$PreviewStreaksTile$$inlined$WhoopPreviewTheme$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/components/StreaksTileKt;->PreviewStreaksTile(Landroidx/compose/runtime/Composer;I)V
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

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/components/StreaksTileKt$PreviewStreaksTile$$inlined$WhoopPreviewTheme$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 10

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

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, -0x1f146394

    .line 2
    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    .line 3
    sget-object p1, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    .line 4
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    .line 5
    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, v7, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->o()J

    move-result-wide v4

    .line 6
    sget-object p2, Li2/w0;->a:Li2/v0;

    .line 7
    invoke-static {p1, v4, v5, p2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v3

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p2, v0

    .line 8
    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    int-to-float p2, v2

    mul-float/2addr p2, v0

    .line 9
    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object p2

    .line 10
    sget-object v0, Lb2/e;->M:Lb2/k;

    const/4 v3, 0x6

    .line 11
    invoke-static {p2, v0, v7, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    .line 12
    iget-wide v3, v7, Lp1/q;->T:J

    .line 13
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    .line 14
    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    .line 15
    invoke-static {v7, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    .line 16
    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    sget-object v4, La3/k;->b:La3/j;

    .line 18
    invoke-virtual {v7}, Lp1/q;->i0()V

    .line 19
    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    .line 20
    invoke-virtual {v7, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    .line 22
    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    .line 23
    invoke-static {v7, v4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 24
    sget-object p2, La3/k;->f:La3/i;

    .line 25
    invoke-static {v7, p2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    .line 26
    sget-object p2, La3/k;->j:La3/i;

    .line 27
    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_2

    .line 28
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 29
    :cond_2
    invoke-static {v0, v7, v0, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    .line 30
    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    .line 31
    invoke-static {v7, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p1, -0x6cdc4b41

    .line 32
    invoke-virtual {v7, p1}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/profile/view/components/StreaksTileKt;->getSampleStreaksTileStates()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Lcom/whoop/profile/view/components/StreaksTileViewState;

    const/4 v8, 0x0

    const/4 v9, 0x5

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 34
    invoke-static/range {v4 .. v9}, Lcom/whoop/profile/view/components/StreaksTileKt;->StreaksTile(Landroidx/compose/ui/Modifier;Lcom/whoop/profile/view/components/StreaksTileViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    .line 35
    :cond_4
    invoke-static {v7, v1, v2, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-void

    .line 36
    :cond_5
    invoke-virtual {v7}, Lp1/q;->X()V

    return-void
.end method
