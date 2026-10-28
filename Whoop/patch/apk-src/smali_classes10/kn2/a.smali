.class public final synthetic Lkn2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/views/ConnectingAnimationView;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/views/ConnectingAnimationView;I)V
    .locals 0

    iput p2, p0, Lkn2/a;->w:I

    iput-object p1, p0, Lkn2/a;->x:Lcom/whoop/ui/views/ConnectingAnimationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lkn2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lkn2/a;->x:Lcom/whoop/ui/views/ConnectingAnimationView;

    invoke-static {v0}, Lcom/whoop/ui/views/ConnectingAnimationView;->a(Lcom/whoop/ui/views/ConnectingAnimationView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lkn2/a;->x:Lcom/whoop/ui/views/ConnectingAnimationView;

    invoke-static {v0}, Lcom/whoop/ui/views/ConnectingAnimationView;->b(Lcom/whoop/ui/views/ConnectingAnimationView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
