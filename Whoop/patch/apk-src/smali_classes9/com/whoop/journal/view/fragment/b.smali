.class public final synthetic Lcom/whoop/journal/view/fragment/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

.field public final synthetic x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/journal/view/fragment/b;->w:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iput-object p2, p0, Lcom/whoop/journal/view/fragment/b;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    check-cast p2, Ljava/lang/String;

    iget-object p1, p0, Lcom/whoop/journal/view/fragment/b;->w:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iget-object v2, p0, Lcom/whoop/journal/view/fragment/b;->x:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;

    invoke-static {p1, v2, v0, v1, p2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->z(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$b;JLjava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
