.class public final synthetic Ly40/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ly40/d;


# direct methods
.method public synthetic constructor <init>(Ly40/d;I)V
    .locals 0

    iput p2, p0, Ly40/c;->w:I

    iput-object p1, p0, Ly40/c;->x:Ly40/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Ly40/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly40/c;->x:Ly40/d;

    iget-object v0, v0, Ly40/d;->x:Lu40/h;

    invoke-interface {v0}, Lu40/h;->m()V

    return-void

    :pswitch_0
    iget-object v0, p0, Ly40/c;->x:Ly40/d;

    iget-object v0, v0, Ly40/d;->x:Lu40/h;

    invoke-interface {v0}, Lu40/h;->h()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
