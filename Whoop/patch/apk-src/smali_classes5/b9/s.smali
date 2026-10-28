.class public final synthetic Lb9/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    iput p3, p0, Lb9/s;->w:I

    iput p1, p0, Lb9/s;->x:I

    iput p2, p0, Lb9/s;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lb9/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lb9/s;->y:I

    check-cast p1, Lrm/z0;

    iget v1, p0, Lb9/s;->x:I

    invoke-interface {p1, v1, v0}, Lrm/z0;->onSurfaceSizeChanged(II)V

    return-void

    :pswitch_0
    iget v0, p0, Lb9/s;->y:I

    check-cast p1, Lu8/h0;

    iget v1, p0, Lb9/s;->x:I

    invoke-interface {p1, v1, v0}, Lu8/h0;->onSurfaceSizeChanged(II)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
