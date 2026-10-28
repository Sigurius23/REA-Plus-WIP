.class public final synthetic Lb9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(ZI)V
    .locals 0

    iput p2, p0, Lb9/w;->w:I

    iput-boolean p1, p0, Lb9/w;->x:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lb9/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lb9/w;->x:Z

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->onSkipSilenceEnabledChanged(Z)V

    return-void

    :pswitch_0
    iget-boolean v0, p0, Lb9/w;->x:Z

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->onShuffleModeEnabledChanged(Z)V

    return-void

    :pswitch_1
    iget-boolean v0, p0, Lb9/w;->x:Z

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0}, Lu8/h0;->onSkipSilenceEnabledChanged(Z)V

    return-void

    :pswitch_2
    iget-boolean v0, p0, Lb9/w;->x:Z

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0}, Lu8/h0;->onShuffleModeEnabledChanged(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
