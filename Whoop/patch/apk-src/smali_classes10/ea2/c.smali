.class public final synthetic Lea2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lea2/c;->w:I

    iput-object p1, p0, Lea2/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    iget v0, p0, Lea2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v0, p1}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->K(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lea2/c;->x:Ljava/lang/Object;

    check-cast p1, Lb9/b;

    const-string v0, "this$0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lb9/b;->y:Ljava/lang/Object;

    check-cast p1, Llo/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_1
    iget-object v0, p0, Lea2/c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    invoke-static {v0, p1}, Lcom/whoop/settings/DebugFragment;->c0(Lbc3/c2;Landroid/content/DialogInterface;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
