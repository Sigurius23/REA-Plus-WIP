.class public final Lmj/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/NudgeStep;

.field public final synthetic z:Lmj/n;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;II)V
    .locals 1

    iput p5, p0, Lmj/k;->w:I

    const/4 v0, 0x2

    packed-switch p5, :pswitch_data_0

    .line 1
    iput-object p1, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p3, p0, Lmj/k;->z:Lmj/n;

    iput p4, p0, Lmj/k;->E:I

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void

    .line 2
    :pswitch_0
    iput-object p1, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p3, p0, Lmj/k;->z:Lmj/n;

    iput p4, p0, Lmj/k;->E:I

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/Nudge;ILmj/n;I)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, Lmj/k;->w:I

    .line 3
    iput-object p1, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iput-object p2, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput p3, p0, Lmj/k;->E:I

    iput-object p4, p0, Lmj/k;->z:Lmj/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lmj/k;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p2, p0, Lmj/k;->E:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v2, p0, Lmj/k;->z:Lmj/n;

    invoke-static {v0, v1, v2, p1, p2}, Lvp/c;->s(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p2, p0, Lmj/k;->E:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object v2, p0, Lmj/k;->z:Lmj/n;

    invoke-static {v0, v1, v2, p1, p2}, Lvp/c;->s(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0xb

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    iget-object p2, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Lcom/amplitude/android/engagement/types/NudgeStep;->getFormFactor()Lcom/amplitude/android/engagement/types/FormFactor;

    move-result-object v0

    instance-of v1, v0, Lcom/amplitude/android/engagement/types/ModalFormFactor;

    iget-object v5, p0, Lmj/k;->z:Lmj/n;

    iget-object v2, p0, Lmj/k;->x:Lcom/amplitude/android/engagement/types/Nudge;

    const/4 v8, 0x0

    if-eqz v1, :cond_2

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x484e8afd    # 211499.95f

    invoke-virtual {v6, p1}, Lp1/q;->f0(I)V

    iget v4, p0, Lmj/k;->E:I

    const/16 v7, 0x48

    iget-object v3, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static/range {v2 .. v7}, Lvd/f;->b(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    instance-of v1, v0, Lcom/amplitude/android/engagement/types/PopoverFormFactor;

    if-eqz v1, :cond_3

    move-object v6, p1

    check-cast v6, Lp1/q;

    const p1, 0x484e8b9e

    invoke-virtual {v6, p1}, Lp1/q;->f0(I)V

    iget v4, p0, Lmj/k;->E:I

    const/16 v7, 0x48

    iget-object v3, p0, Lmj/k;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static/range {v2 .. v7}, Lx30/s0;->g(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    instance-of v1, v0, Lcom/amplitude/android/engagement/types/BannerFormFactor;

    const/16 v3, 0x48

    if-eqz v1, :cond_4

    check-cast p1, Lp1/q;

    const v0, 0x484e8c40    # 211505.0f

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    invoke-static {v2, p2, v5, p1, v3}, Lv8/b;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_4
    instance-of v1, v0, Lcom/amplitude/android/engagement/types/PinFormFactor;

    if-eqz v1, :cond_5

    check-cast p1, Lp1/q;

    const v0, 0x484e8cc7

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    invoke-static {v2, p2, v5, p1, v3}, Lvp/c;->s(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_5
    instance-of v0, v0, Lcom/amplitude/android/engagement/types/TooltipFormFactor;

    if-eqz v0, :cond_6

    check-cast p1, Lp1/q;

    const v0, 0x484e8d4f

    invoke-virtual {p1, v0}, Lp1/q;->f0(I)V

    invoke-static {v2, p2, p1, v3}, Lx43/j;->i(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v8}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_6
    check-cast p1, Lp1/q;

    const p2, 0x484e8dac

    invoke-virtual {p1, p2}, Lp1/q;->f0(I)V

    invoke-virtual {p1, v8}, Lp1/q;->q(Z)V

    :cond_7
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
