.class public final synthetic Lrm/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrm/v0;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lrm/v0;II)V
    .locals 0

    iput p3, p0, Lrm/n;->w:I

    iput-object p1, p0, Lrm/n;->x:Lrm/v0;

    iput p2, p0, Lrm/n;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lrm/n;->w:I

    check-cast p1, Lrm/z0;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrm/n;->x:Lrm/v0;

    iget-boolean v0, v0, Lrm/v0;->l:Z

    iget v1, p0, Lrm/n;->y:I

    invoke-interface {p1, v0, v1}, Lrm/z0;->onPlayWhenReadyChanged(ZI)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrm/n;->x:Lrm/v0;

    iget-object v0, v0, Lrm/v0;->a:Lrm/o1;

    iget v0, p0, Lrm/n;->y:I

    invoke-interface {p1, v0}, Lrm/z0;->g(I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
