.class public final Lrj/e;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Z

.field public final synthetic y:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZLcom/amplitude/android/engagement/types/SurveyRatingBlock;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lrj/e;->w:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lrj/e;->x:Z

    iput-object p3, p0, Lrj/e;->y:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iput p4, p0, Lrj/e;->z:I

    iput-object p5, p0, Lrj/e;->E:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-boolean v0, p0, Lrj/e;->x:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;

    iget-object v1, p0, Lrj/e;->y:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    iget-object v3, p0, Lrj/e;->E:Ljava/lang/String;

    iget v4, p0, Lrj/e;->z:I

    invoke-direct {v0, v2, v4, v1, v3}, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    :goto_0
    iget-object v1, p0, Lrj/e;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
