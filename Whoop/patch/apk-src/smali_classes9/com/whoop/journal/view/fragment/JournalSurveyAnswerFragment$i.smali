.class public final Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i;
.super Lg/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->m1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i",
        "Lg/t;",
        "Ll83/a0;",
        "d",
        "()V",
        "journal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic d:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i;->d:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i;->d:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-static {v0}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->e0(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;)Lcs1/a;

    move-result-object v0

    invoke-virtual {v0}, Lcs1/a;->getViewState()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lds1/k;

    invoke-virtual {v0}, Lds1/k;->f()Lds1/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment$i;->d:Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    invoke-virtual {v0}, Lds1/e;->a()Z

    move-result v2

    invoke-virtual {v0}, Lds1/e;->j()Z

    move-result v0

    invoke-static {v1, v2, v0}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->f0(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZZ)V

    return-void
.end method
