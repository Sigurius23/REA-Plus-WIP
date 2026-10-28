.class public final synthetic Lo52/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewStub$OnInflateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lo52/t;->a:I

    iput-object p1, p0, Lo52/t;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInflate(Landroid/view/ViewStub;Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lo52/t;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/t;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/StartActivityActivity;

    invoke-static {v0, p1, p2}, Lcom/whoop/realtime/presentation/StartActivityActivity;->I(Lcom/whoop/realtime/presentation/StartActivityActivity;Landroid/view/ViewStub;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/t;->b:Ljava/lang/Object;

    check-cast v0, Lo52/w;

    invoke-static {v0, p1, p2}, Lo52/w;->M(Lo52/w;Landroid/view/ViewStub;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
