.class public final synthetic Ll9/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ll9/s0;


# direct methods
.method public synthetic constructor <init>(Ll9/s0;I)V
    .locals 0

    iput p2, p0, Ll9/n0;->w:I

    iput-object p1, p0, Ll9/n0;->x:Ll9/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Ll9/n0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll9/n0;->x:Ll9/s0;

    iget-boolean v1, v0, Ll9/s0;->o0:Z

    if-nez v1, :cond_0

    iget-object v1, v0, Ll9/s0;->R:Ll9/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1, v0}, Ll9/a1;->b(Ll9/b1;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Ll9/n0;->x:Ll9/s0;

    invoke-virtual {v0}, Ll9/s0;->z()V

    return-void

    :pswitch_1
    iget-object v0, p0, Ll9/n0;->x:Ll9/s0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll9/s0;->i0:Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
