.class public final Lb3/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/h0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb3/q0;->a:I

    iput-object p1, p0, Lb3/q0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 2

    iget v0, p0, Lb3/q0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/q0;->b:Ljava/lang/Object;

    check-cast v0, Lh/k;

    invoke-virtual {v0}, Lg/t;->h()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3/q0;->b:Ljava/lang/Object;

    check-cast v0, Lh/a;

    iget-object v0, v0, Lh/a;->a:Lj/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/i;->b()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Launcher has not been initialized"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    iget-object v0, p0, Lb3/q0;->b:Ljava/lang/Object;

    check-cast v0, Lb3/y1;

    iget-object v0, v0, Lb3/y1;->x:Lb3/a2;

    invoke-virtual {v0}, Lb3/a2;->invoke()Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
