.class public final synthetic Lsy2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

.field public final synthetic w:I

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;I)V
    .locals 0

    .line 1
    iput p6, p0, Lsy2/r;->w:I

    iput-object p1, p0, Lsy2/r;->x:Lp1/c1;

    iput-object p2, p0, Lsy2/r;->E:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsy2/r;->z:Ljava/lang/String;

    iput-object p4, p0, Lsy2/r;->y:Lp1/c1;

    iput-object p5, p0, Lsy2/r;->F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsy2/r;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy2/r;->x:Lp1/c1;

    iput-object p2, p0, Lsy2/r;->y:Lp1/c1;

    iput-object p3, p0, Lsy2/r;->z:Ljava/lang/String;

    iput-object p4, p0, Lsy2/r;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lsy2/r;->F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lsy2/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Lsy2/r;->F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object v1, p0, Lsy2/r;->x:Lp1/c1;

    iget-object v2, p0, Lsy2/r;->E:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lsy2/r;->z:Ljava/lang/String;

    iget-object v4, p0, Lsy2/r;->y:Lp1/c1;

    invoke-static/range {v1 .. v6}, Lsy2/t;->a(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v4, p0, Lsy2/r;->F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object v5, p1

    check-cast v5, Landroid/webkit/WebView;

    iget-object v0, p0, Lsy2/r;->x:Lp1/c1;

    iget-object v1, p0, Lsy2/r;->y:Lp1/c1;

    iget-object v2, p0, Lsy2/r;->z:Ljava/lang/String;

    iget-object v3, p0, Lsy2/r;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lsy2/t;->f(Lp1/c1;Lp1/c1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Landroid/webkit/WebView;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v4, p0, Lsy2/r;->F:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-object v5, p1

    check-cast v5, Ljava/lang/Integer;

    iget-object v0, p0, Lsy2/r;->x:Lp1/c1;

    iget-object v1, p0, Lsy2/r;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lsy2/r;->z:Ljava/lang/String;

    iget-object v3, p0, Lsy2/r;->y:Lp1/c1;

    invoke-static/range {v0 .. v5}, Lsy2/t;->n(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/Integer;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
