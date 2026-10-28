.class public final Lpj/n;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ll83/e;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;II)V
    .locals 0

    .line 1
    iput p6, p0, Lpj/n;->w:I

    iput-object p1, p0, Lpj/n;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpj/n;->y:Ljava/lang/Object;

    iput p3, p0, Lpj/n;->z:I

    iput-object p4, p0, Lpj/n;->E:Ll83/e;

    iput p5, p0, Lpj/n;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lpj/n;->w:I

    .line 2
    iput-object p1, p0, Lpj/n;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpj/n;->y:Ljava/lang/Object;

    iput-object p3, p0, Lpj/n;->E:Ll83/e;

    iput p4, p0, Lpj/n;->z:I

    iput p5, p0, Lpj/n;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lpj/n;->w:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget-object p1, p0, Lpj/n;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Lpj/n;->y:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object p1, p0, Lpj/n;->E:Ll83/e;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lpj/n;->z:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v6, p0, Lpj/n;->F:I

    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/viewinterop/a;->a(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object p1, p0, Lpj/n;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lpj/n;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lpj/n;->E:Ll83/e;

    move-object v3, p1

    check-cast v3, Lmj/n;

    iget p1, p0, Lpj/n;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v2, p0, Lpj/n;->z:I

    invoke-static/range {v0 .. v5}, Lx30/s0;->g(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object p1, p0, Lpj/n;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lpj/n;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lpj/n;->E:Ll83/e;

    move-object v3, p1

    check-cast v3, Lmj/n;

    iget p1, p0, Lpj/n;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v2, p0, Lpj/n;->z:I

    invoke-static/range {v0 .. v5}, Lvd/f;->b(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;ILmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
