.class public final Lpj/f0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/Nudge;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/NudgeStep;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;II)V
    .locals 0

    iput p4, p0, Lpj/f0;->w:I

    iput-object p1, p0, Lpj/f0;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iput-object p2, p0, Lpj/f0;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lpj/f0;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    const/16 p2, 0x49

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lpj/f0;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lpj/f0;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static {v0, v1, p1, p2}, Lx43/j;->i(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/16 p2, 0x49

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lpj/f0;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lpj/f0;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static {v0, v1, p1, p2}, Lx43/j;->i(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    const/16 p2, 0x49

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lpj/f0;->x:Lcom/amplitude/android/engagement/types/Nudge;

    iget-object v1, p0, Lpj/f0;->y:Lcom/amplitude/android/engagement/types/NudgeStep;

    invoke-static {v0, v1, p1, p2}, Lx43/j;->i(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
