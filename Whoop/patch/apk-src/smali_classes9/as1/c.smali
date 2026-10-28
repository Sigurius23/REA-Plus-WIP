.class public final synthetic Las1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;I)V
    .locals 0

    iput p2, p0, Las1/c;->w:I

    iput-object p1, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Las1/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->G(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lds1/a;

    iget-object v0, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->A(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZLds1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->J(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {p1, v0, v1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->Z(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;JLjava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iget-object v0, p0, Las1/c;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->M(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
