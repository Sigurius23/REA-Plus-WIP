.class public final synthetic Las1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;I)V
    .locals 0

    iput p2, p0, Las1/d;->w:I

    iput-object p1, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Las1/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->W(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->C(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->R(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->K(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->b0(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Las1/d;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->S(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
