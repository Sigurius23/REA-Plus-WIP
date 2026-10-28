.class public final Lrj/h;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Ljava/lang/Integer;

.field public final synthetic y:I

.field public final synthetic z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;ILcom/amplitude/android/engagement/types/SurveyRatingBlock;)V
    .locals 0

    iput-object p1, p0, Lrj/h;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lrj/h;->x:Ljava/lang/Integer;

    iput p3, p0, Lrj/h;->y:I

    iput-object p4, p0, Lrj/h;->z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lrj/h;->x:Ljava/lang/Integer;

    iget v1, p0, Lrj/h;->y:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    iget-object v2, p0, Lrj/h;->z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v2

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v2

    invoke-direct {v0, v3, v1, v2}, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;-><init>(Ljava/lang/String;II)V

    :goto_1
    iget-object v1, p0, Lrj/h;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
