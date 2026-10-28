.class public final Lc2/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lc2/c;->w:I

    iput-object p2, p0, Lc2/c;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc2/c;->y:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lc2/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lq0/r;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    move-object v4, p3

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    const-string p3, "$this$HorizontalPager"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lc2/c;->x:Ljava/lang/Object;

    check-cast p1, Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/Nudge;->getSteps()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/amplitude/android/engagement/types/NudgeStep;

    new-instance v1, Lsj/l;

    iget-object p3, p0, Lc2/c;->y:Ljava/lang/Object;

    check-cast p3, Lmj/n;

    invoke-direct {v1, p1, v0, p2, p3}, Lsj/l;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILc93/a;)V

    const/high16 p1, 0x3f800000    # 1.0f

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object p2, Lb2/e;->x:Lb2/m;

    const/4 p3, 0x0

    invoke-static {p2, p3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p2

    invoke-static {v4}, Lp1/x;->t(Landroidx/compose/runtime/Composer;)I

    move-result p3

    move-object p4, v4

    check-cast p4, Lp1/q;

    invoke-virtual {p4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v3, La3/l;->a:La3/k;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {p4}, Lp1/q;->i0()V

    iget-boolean v5, p4, Lp1/q;->S:Z

    if-eqz v5, :cond_0

    invoke-virtual {p4, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_0
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v4, p2, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v2, p4, Lp1/q;->S:Z

    if-nez v2, :cond_1

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-static {p3, p4, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v4, p2, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xc48

    const/4 v6, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static/range {v0 .. v6}, Ls2/h;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    const/4 p1, 0x1

    invoke-virtual {p4, p1}, Lp1/q;->q(Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    iget-object v0, p0, Lc2/c;->x:Ljava/lang/Object;

    check-cast v0, Lc2/d;

    iget-object v1, v0, Lc2/d;->f:Landroid/graphics/Rect;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object p1, v0, Lc2/d;->a:Lad3/z;

    iget-object p2, v0, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object p3, p0, Lc2/c;->y:Ljava/lang/Object;

    check-cast p3, La3/n0;

    iget p3, p3, La3/n0;->x:I

    iget-object p4, v0, Lc2/d;->f:Landroid/graphics/Rect;

    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p1, p2, p3, p4}, Landroid/view/autofill/AutofillManager;->requestAutofill(Landroid/view/View;ILandroid/graphics/Rect;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
