.class public final synthetic Lmp0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/b0;


# direct methods
.method public synthetic constructor <init>(Lmp0/b0;I)V
    .locals 0

    iput p2, p0, Lmp0/y;->w:I

    iput-object p1, p0, Lmp0/y;->x:Lmp0/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget v0, p0, Lmp0/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/y;->x:Lmp0/b0;

    invoke-static {v0, p1}, Lmp0/b0;->W(Lmp0/b0;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lmp0/y;->x:Lmp0/b0;

    invoke-static {v0, p1}, Lmp0/b0;->V(Lmp0/b0;Landroid/view/View;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
