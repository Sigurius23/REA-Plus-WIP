.class public final Lpj/q;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ll83/e;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;III)V
    .locals 0

    .line 1
    iput p9, p0, Lpj/q;->w:I

    iput-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpj/q;->y:Ljava/lang/Object;

    iput-object p3, p0, Lpj/q;->z:Ljava/lang/Object;

    iput-object p4, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lpj/q;->F:Ljava/lang/Object;

    iput-object p6, p0, Lpj/q;->G:Ll83/e;

    iput p7, p0, Lpj/q;->H:I

    iput p8, p0, Lpj/q;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;II)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lpj/q;->w:I

    .line 2
    iput-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    iput-object p3, p0, Lpj/q;->y:Ljava/lang/Object;

    iput-object p4, p0, Lpj/q;->z:Ljava/lang/Object;

    iput-object p5, p0, Lpj/q;->F:Ljava/lang/Object;

    iput-object p6, p0, Lpj/q;->G:Ll83/e;

    iput p7, p0, Lpj/q;->H:I

    iput p8, p0, Lpj/q;->I:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lpj/q;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ld0/q0;

    iget-object p1, p0, Lpj/q;->y:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lc0/d1;

    iget-object p1, p0, Lpj/q;->z:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lc0/e1;

    iget-object p1, p0, Lpj/q;->F:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object p1, p0, Lpj/q;->G:Ll83/e;

    move-object v6, p1

    check-cast v6, Lx1/b;

    iget p1, p0, Lpj/q;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget v9, p0, Lpj/q;->I:I

    iget-object v2, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->b(Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lpj/q;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lpj/q;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lcom/amplitude/android/engagement/types/PinPointerType;

    iget-object p1, p0, Lpj/q;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/graphics/Rect;

    iget-object p1, p0, Lpj/q;->G:Ll83/e;

    move-object v5, p1

    check-cast v5, Lc93/a;

    iget p1, p0, Lpj/q;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v8, p0, Lpj/q;->I:I

    iget-object v3, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Lvp/c;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lpj/q;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lpj/q;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lcom/amplitude/android/engagement/types/PinPointerType;

    iget-object p1, p0, Lpj/q;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/graphics/Rect;

    iget-object p1, p0, Lpj/q;->G:Ll83/e;

    move-object v5, p1

    check-cast v5, Lc93/a;

    iget p1, p0, Lpj/q;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v8, p0, Lpj/q;->I:I

    iget-object v3, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Lvp/c;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lpj/q;->x:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lpj/q;->y:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lpj/q;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lcom/amplitude/android/engagement/types/PinPointerType;

    iget-object p1, p0, Lpj/q;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Landroid/graphics/Rect;

    iget-object p1, p0, Lpj/q;->G:Ll83/e;

    move-object v5, p1

    check-cast v5, Lc93/a;

    iget p1, p0, Lpj/q;->H:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v7

    iget v8, p0, Lpj/q;->I:I

    iget-object v3, p0, Lpj/q;->E:Landroidx/compose/ui/Modifier;

    invoke-static/range {v0 .. v8}, Lvp/c;->c(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/NudgeStep;Lcom/amplitude/android/engagement/types/PinPointerType;Landroidx/compose/ui/Modifier;Landroid/graphics/Rect;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
