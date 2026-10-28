.class public final Lrj/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lrj/p;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lcom/amplitude/android/engagement/types/SurveyListBlock;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;ILrj/p;I)V
    .locals 0

    iput p5, p0, Lrj/c;->w:I

    iput-object p1, p0, Lrj/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lrj/c;->y:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    iput p3, p0, Lrj/c;->z:I

    iput-object p4, p0, Lrj/c;->E:Lrj/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lrj/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "newText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object v1, p0, Lrj/c;->y:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lrj/c;->E:Lrj/p;

    iget-object v2, v2, Lrj/p;->a:Ljava/lang/String;

    iget v3, p0, Lrj/c;->z:I

    invoke-direct {v0, v1, v3, v2, p1}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lrj/c;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lrj/c;->x:Lkotlin/jvm/functions/Function1;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object p1, p0, Lrj/c;->y:Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p0, Lrj/c;->E:Lrj/p;

    iget-object v4, p1, Lrj/p;->a:Ljava/lang/String;

    const/16 v6, 0x8

    const/4 v7, 0x0

    iget v3, p0, Lrj/c;->z:I

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
