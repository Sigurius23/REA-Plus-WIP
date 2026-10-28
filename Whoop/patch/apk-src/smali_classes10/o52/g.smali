.class public final synthetic Lo52/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

.field public final synthetic y:Lp92/e;

.field public final synthetic z:Lix/a;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;Lix/a;I)V
    .locals 0

    iput p4, p0, Lo52/g;->w:I

    iput-object p1, p0, Lo52/g;->x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    iput-object p2, p0, Lo52/g;->y:Lp92/e;

    iput-object p3, p0, Lo52/g;->z:Lix/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget v0, p0, Lo52/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/g;->y:Lp92/e;

    iget-object v1, p0, Lo52/g;->z:Lix/a;

    iget-object v2, p0, Lo52/g;->x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v2, v0, v1, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->H(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;Lix/a;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/g;->y:Lp92/e;

    iget-object v1, p0, Lo52/g;->z:Lix/a;

    iget-object v2, p0, Lo52/g;->x:Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;

    invoke-static {v2, v0, v1, p1, p2}, Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;->N(Lcom/whoop/realtime/presentation/RealTimeFinishPromptActivity;Lp92/e;Lix/a;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
