.class public final Leu/q;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Leu/q;->w:I

    iput-object p1, p0, Leu/q;->x:Ljava/lang/Object;

    iput-object p2, p0, Leu/q;->y:Ljava/lang/Object;

    iput-object p3, p0, Leu/q;->z:Ljava/lang/Object;

    iput-object p4, p0, Leu/q;->E:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Leu/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/String;

    const-string v0, "newText"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leu/q;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-instance v1, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;

    iget-object v2, p0, Leu/q;->y:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Leu/q;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, p0, Leu/q;->E:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-direct {v1, v2, v3, v4, p1}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lp1/i0;

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Leu/q;->x:Ljava/lang/Object;

    check-cast p1, Lup/c;

    iget-object v0, p0, Leu/q;->y:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    new-instance v1, Leu/k;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0, p1}, Leu/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Leu/s;

    invoke-direct {v0, p1}, Leu/s;-><init>(Lup/c;)V

    iget-object p1, p0, Leu/q;->z:Ljava/lang/Object;

    check-cast p1, Landroidx/lifecycle/x;

    invoke-virtual {p1, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    iget-object v2, p0, Leu/q;->E:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    new-instance v3, Leu/p;

    invoke-direct {v3, p1, v1, v2, v0}, Leu/p;-><init>(Landroidx/lifecycle/x;Leu/k;Landroid/content/Context;Leu/s;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
