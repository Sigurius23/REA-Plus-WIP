.class public final synthetic Lr9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq3/i;


# direct methods
.method public synthetic constructor <init>(Lq3/i;I)V
    .locals 0

    iput p2, p0, Lr9/b;->w:I

    iput-object p1, p0, Lr9/b;->x:Lq3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lr9/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lr9/b;->x:Lq3/i;

    iget-object v0, v0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lr9/c;

    iget-object v0, v0, Lr9/c;->g:Lr9/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_0
    iget-object v0, p0, Lr9/b;->x:Lq3/i;

    iget-object v0, v0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lr9/c;

    iget-object v0, v0, Lr9/c;->g:Lr9/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
