.class public final Landroidx/lifecycle/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/lifecycle/x;

.field public final synthetic y:Landroidx/lifecycle/i2;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/x;Landroidx/lifecycle/i2;I)V
    .locals 0

    iput p3, p0, Landroidx/lifecycle/g2;->w:I

    iput-object p1, p0, Landroidx/lifecycle/g2;->x:Landroidx/lifecycle/x;

    iput-object p2, p0, Landroidx/lifecycle/g2;->y:Landroidx/lifecycle/i2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/g2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/g2;->x:Landroidx/lifecycle/x;

    iget-object v1, p0, Landroidx/lifecycle/g2;->y:Landroidx/lifecycle/i2;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/g2;->x:Landroidx/lifecycle/x;

    iget-object v1, p0, Landroidx/lifecycle/g2;->y:Landroidx/lifecycle/i2;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
