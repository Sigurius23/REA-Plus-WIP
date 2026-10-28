.class public final synthetic Lb9/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu8/y0;


# direct methods
.method public synthetic constructor <init>(Lc9/a;Lu8/y0;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    iput p1, p0, Lb9/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb9/b0;->x:Lu8/y0;

    return-void
.end method

.method public synthetic constructor <init>(Lu8/y0;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lb9/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/b0;->x:Lu8/y0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lb9/b0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc9/b;

    check-cast p1, Lc9/l;

    iget-object v0, p1, Lc9/l;->p:Lab/h0;

    iget-object v1, p0, Lb9/b0;->x:Lu8/y0;

    if-eqz v0, :cond_0

    iget-object v2, v0, Lab/h0;->y:Ljava/lang/Object;

    check-cast v2, Lu8/p;

    iget v3, v2, Lu8/p;->v:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lu8/p;->a()Lu8/o;

    move-result-object v2

    iget v3, v1, Lu8/y0;->a:I

    iput v3, v2, Lu8/o;->t:I

    iget v3, v1, Lu8/y0;->b:I

    iput v3, v2, Lu8/o;->u:I

    new-instance v3, Lu8/p;

    invoke-direct {v3, v2}, Lu8/p;-><init>(Lu8/o;)V

    new-instance v2, Lab/h0;

    iget v4, v0, Lab/h0;->x:I

    iget-object v0, v0, Lab/h0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v5, 0x4

    invoke-direct {v2, v3, v4, v0, v5}, Lab/h0;-><init>(Ljava/lang/Object;ILjava/io/Serializable;I)V

    iput-object v2, p1, Lc9/l;->p:Lab/h0;

    :cond_0
    iget p1, v1, Lu8/y0;->a:I

    return-void

    :pswitch_0
    iget-object v0, p0, Lb9/b0;->x:Lu8/y0;

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0}, Lu8/h0;->onVideoSizeChanged(Lu8/y0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
