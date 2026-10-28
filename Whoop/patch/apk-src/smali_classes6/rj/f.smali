.class public final Lrj/f;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Z

.field public final synthetic z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ZLcom/amplitude/android/engagement/types/SurveyRatingBlock;II)V
    .locals 0

    iput p5, p0, Lrj/f;->w:I

    iput-object p1, p0, Lrj/f;->x:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lrj/f;->y:Z

    iput-object p3, p0, Lrj/f;->z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    iput p4, p0, Lrj/f;->E:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lrj/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lrj/f;->y:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    iget-object v1, p0, Lrj/f;->z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    iget v3, p0, Lrj/f;->E:I

    invoke-direct {v0, v2, v3, v1}, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;-><init>(Ljava/lang/String;II)V

    :goto_0
    iget-object v1, p0, Lrj/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-boolean v0, p0, Lrj/f;->y:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;

    iget-object v1, p0, Lrj/f;->z:Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    iget v3, p0, Lrj/f;->E:I

    invoke-direct {v0, v2, v3, v1}, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;-><init>(Ljava/lang/String;II)V

    :goto_1
    iget-object v1, p0, Lrj/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
