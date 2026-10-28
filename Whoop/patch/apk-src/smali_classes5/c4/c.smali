.class public final Lc4/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/types/Nudge;ILmj/a;Lmj/n;I)V
    .locals 0

    const/4 p5, 0x1

    iput p5, p0, Lc4/c;->w:I

    .line 1
    iput-object p1, p0, Lc4/c;->y:Ljava/lang/Object;

    iput p2, p0, Lc4/c;->x:I

    iput-object p3, p0, Lc4/c;->z:Ljava/lang/Object;

    iput-object p4, p0, Lc4/c;->E:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    const/16 p4, 0x8

    iput p4, p0, Lc4/c;->w:I

    .line 2
    iput-object p1, p0, Lc4/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc4/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Lc4/c;->E:Ljava/lang/Object;

    iput p5, p0, Lc4/c;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V
    .locals 0

    .line 3
    iput p5, p0, Lc4/c;->w:I

    iput-object p1, p0, Lc4/c;->y:Ljava/lang/Object;

    iput-object p2, p0, Lc4/c;->z:Ljava/lang/Object;

    iput-object p3, p0, Lc4/c;->E:Ljava/lang/Object;

    iput p4, p0, Lc4/c;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lc4/c;->w:I

    .line 4
    iput-object p1, p0, Lc4/c;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc4/c;->E:Ljava/lang/Object;

    iput-object p3, p0, Lc4/c;->y:Ljava/lang/Object;

    iput p4, p0, Lc4/c;->x:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lc4/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Ly2/u1;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lc93/m;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Ly2/q1;->c(Ly2/u1;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lc4/c;->y:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/NudgeStep;

    iget-object p1, p0, Lc4/c;->z:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lsj/l;

    iget-object p1, p0, Lc4/c;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Landroidx/compose/ui/Modifier;

    const/16 p1, 0x49

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v4

    iget v5, p0, Lc4/c;->x:I

    invoke-static/range {v0 .. v5}, Ls30/b;->a(Lcom/amplitude/android/engagement/types/NudgeStep;Lsj/l;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->n(Lcom/amplitude/android/engagement/types/SurveyTextBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->m(Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->j(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNPS;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->i(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_5
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Llj/e0;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lrj/j;->d(Lcom/amplitude/android/engagement/types/SurveyListBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_6
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lse/g;->d(Ljava/lang/String;Ljava/lang/Integer;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_7
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p1, p0, Lc4/c;->y:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lcom/amplitude/android/engagement/types/Nudge;

    iget-object p1, p0, Lc4/c;->z:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lmj/a;

    iget-object p1, p0, Lc4/c;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lmj/n;

    const/16 p1, 0x209

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget v1, p0, Lc4/c;->x:I

    invoke-static/range {v0 .. v5}, Ldc/a;->e(Lcom/amplitude/android/engagement/types/Nudge;ILmj/a;Lmj/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_8
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-object p2, p0, Lc4/c;->y:Ljava/lang/Object;

    check-cast p2, Lc93/a;

    iget-object v0, p0, Lc4/c;->z:Ljava/lang/Object;

    check-cast v0, Lc4/a0;

    iget-object v1, p0, Lc4/c;->E:Ljava/lang/Object;

    check-cast v1, Lx1/b;

    iget v2, p0, Lc4/c;->x:I

    or-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Lp1/x;->L(I)I

    move-result v2

    invoke-static {p2, v0, v1, p1, v2}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
