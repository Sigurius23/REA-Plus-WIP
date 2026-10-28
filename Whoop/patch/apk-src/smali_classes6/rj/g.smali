.class public final Lrj/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p5, p0, Lrj/g;->w:I

    iput-object p1, p0, Lrj/g;->x:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iput-object p2, p0, Lrj/g;->y:Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    iput-object p3, p0, Lrj/g;->z:Lkotlin/jvm/functions/Function1;

    iput p4, p0, Lrj/g;->E:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lrj/g;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    packed-switch v0, :pswitch_data_0

    iget p2, p0, Lrj/g;->E:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lrj/g;->x:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iget-object v1, p0, Lrj/g;->y:Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    iget-object v2, p0, Lrj/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lrj/j;->l(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget p2, p0, Lrj/g;->E:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    iget-object v0, p0, Lrj/g;->x:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iget-object v1, p0, Lrj/g;->y:Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    iget-object v2, p0, Lrj/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, p1, p2}, Lrj/j;->k(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
