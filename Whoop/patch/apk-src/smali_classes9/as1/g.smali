.class public final synthetic Las1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZZ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Las1/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Las1/g;->x:Z

    iput-object p1, p0, Las1/g;->z:Ljava/lang/Object;

    iput-boolean p3, p0, Las1/g;->y:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p3, p0, Las1/g;->w:I

    iput-object p4, p0, Las1/g;->z:Ljava/lang/Object;

    iput-boolean p1, p0, Las1/g;->x:Z

    iput-boolean p2, p0, Las1/g;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Las1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Las1/g;->z:Ljava/lang/Object;

    check-cast v0, Lf1/m;

    check-cast p1, Li3/z;

    invoke-interface {v0}, Lf1/m;->a()J

    move-result-wide v3

    sget-object v0, Lf1/p0;->c:Li3/y;

    new-instance v1, Lf1/o0;

    iget-boolean v2, p0, Las1/g;->x:Z

    if-eqz v2, :cond_0

    sget-object v2, Lu0/f0;->x:Lu0/f0;

    goto :goto_0

    :cond_0
    sget-object v2, Lu0/f0;->y:Lu0/f0;

    :goto_0
    iget-boolean v5, p0, Las1/g;->y:Z

    if-eqz v5, :cond_1

    sget-object v5, Lf1/n0;->w:Lf1/n0;

    goto :goto_1

    :cond_1
    sget-object v5, Lf1/n0;->y:Lf1/n0;

    :goto_1
    const-wide v6, 0x7fffffff7fffffffL

    and-long/2addr v6, v3

    const-wide v8, 0x7fc000007fc00000L    # 2.247117487993712E307

    cmp-long v6, v6, v8

    if-eqz v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    invoke-direct/range {v1 .. v6}, Lf1/o0;-><init>(Lu0/f0;JLf1/n0;Z)V

    check-cast p1, Li3/l;

    invoke-virtual {p1, v0, v1}, Li3/l;->e(Li3/y;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Las1/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Li3/z;

    const-string v1, "$this$semantics"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "PaymentSheetSavedPaymentOption"

    invoke-static {v1, p1}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    iget-boolean v1, p0, Las1/g;->x:Z

    invoke-static {v1, p1}, Li3/w;->j(ZLi3/z;)V

    new-instance v1, Ll3/g;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-direct {v1, v3, v0, v2}, Ll3/g;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, v1}, Li3/w;->l(Li3/z;Ll3/g;)V

    iget-boolean v0, p0, Las1/g;->y:Z

    if-nez v0, :cond_3

    invoke-static {p1}, Li3/w;->a(Li3/z;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Las1/g;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-boolean v1, p0, Las1/g;->x:Z

    iget-boolean v2, p0, Las1/g;->y:Z

    invoke-static {v0, v1, v2, p1}, Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;->a0(Lcom/whoop/journal/view/fragment/JournalSurveyAnswerFragment;ZZZ)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
