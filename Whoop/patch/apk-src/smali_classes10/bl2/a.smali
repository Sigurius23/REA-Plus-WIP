.class public final synthetic Lbl2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;I)V
    .locals 0

    iput p2, p0, Lbl2/a;->w:I

    iput-object p1, p0, Lbl2/a;->x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbl2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbl2/a;->x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;->y(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbl2/a;->x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;->A(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbl2/a;->x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    check-cast p1, Lbl2/e;

    invoke-static {v0, p1}, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;->C(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;Lbl2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lbl2/a;->x:Lcom/whoop/training/activitydetection/ActivityDetectionFragment;

    check-cast p1, Lbl2/b;

    invoke-static {v0, p1}, Lcom/whoop/training/activitydetection/ActivityDetectionFragment;->B(Lcom/whoop/training/activitydetection/ActivityDetectionFragment;Lbl2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
