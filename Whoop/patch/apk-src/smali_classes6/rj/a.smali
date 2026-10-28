.class public final Lrj/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/types/SurveyListBlock;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lcom/amplitude/android/engagement/types/SurveyResponseSelect;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p6, p0, Lrj/a;->w:I

    iput-object p1, p0, Lrj/a;->x:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iput-object p2, p0, Lrj/a;->y:Ljava/util/List;

    iput-object p3, p0, Lrj/a;->z:Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iput-object p4, p0, Lrj/a;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lrj/a;->F:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lrj/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lrj/a;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v6

    iget-object v1, p0, Lrj/a;->x:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iget-object v2, p0, Lrj/a;->y:Ljava/util/List;

    iget-object v3, p0, Lrj/a;->z:Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object v4, p0, Lrj/a;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v1 .. v6}, Lrj/j;->g(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget p1, p0, Lrj/a;->F:I

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v5

    iget-object v0, p0, Lrj/a;->x:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iget-object v1, p0, Lrj/a;->y:Ljava/util/List;

    iget-object v2, p0, Lrj/a;->z:Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object v3, p0, Lrj/a;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lrj/j;->e(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
