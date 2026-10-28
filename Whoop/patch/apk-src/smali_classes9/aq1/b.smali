.class public final synthetic Laq1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;I)V
    .locals 0

    iput p2, p0, Laq1/b;->w:I

    iput-object p1, p0, Laq1/b;->x:Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Laq1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laq1/b;->x:Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;

    check-cast p1, Lyn1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->A(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lyn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laq1/b;->x:Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;

    check-cast p1, Lxp1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->B(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lxp1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Laq1/b;->x:Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;

    check-cast p1, Lzp1/a;

    invoke-static {v0, p1}, Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;->C(Lcom/whoop/hormonalinsights/symptompatterns/view/SymptomPatternsFragment;Lzp1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
