.class public final synthetic Las1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ZZILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p3, p0, Las1/h;->w:I

    iput-object p4, p0, Las1/h;->z:Ljava/lang/Object;

    iput-boolean p1, p0, Las1/h;->x:Z

    iput-boolean p2, p0, Las1/h;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/util/List;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Las1/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Las1/h;->x:Z

    iput-boolean p2, p0, Las1/h;->y:Z

    iput-object p3, p0, Las1/h;->z:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Las1/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Las1/h;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-boolean v1, p0, Las1/h;->x:Z

    iget-boolean v2, p0, Las1/h;->y:Z

    invoke-static {v0, v1, v2}, Lo42/k;->m(Lkotlin/jvm/functions/Function1;ZZ)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Las1/h;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-boolean v1, p0, Las1/h;->x:Z

    iget-boolean v2, p0, Las1/h;->y:Z

    invoke-static {v1, v2, v0}, Lcp0/x0;->I(ZZLjava/util/List;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Las1/h;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    iget-boolean v1, p0, Las1/h;->x:Z

    iget-boolean v2, p0, Las1/h;->y:Z

    invoke-static {v0, v1, v2}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->Q(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZZ)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
