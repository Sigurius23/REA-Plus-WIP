.class public final synthetic Las1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

.field public final synthetic y:Lcom/whoop/journal/view/fragment/c;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Lcom/whoop/journal/view/fragment/c;I)V
    .locals 0

    iput p3, p0, Las1/i;->w:I

    iput-object p1, p0, Las1/i;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iput-object p2, p0, Las1/i;->y:Lcom/whoop/journal/view/fragment/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Las1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Las1/i;->y:Lcom/whoop/journal/view/fragment/c;

    check-cast p1, Lcom/whoop/navigation/e;

    iget-object v1, p0, Las1/i;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->F(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Lcom/whoop/journal/view/fragment/c;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Las1/i;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iget-object v1, p0, Las1/i;->y:Lcom/whoop/journal/view/fragment/c;

    invoke-static {v0, v1, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->P(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Lcom/whoop/journal/view/fragment/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
