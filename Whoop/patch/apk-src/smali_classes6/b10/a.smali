.class public final synthetic Lb10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk83/a;
.implements Lcom/mapbox/maps/PlaybackFinished;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lb10/a;->w:I

    iput-object p1, p0, Lb10/a;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb10/a;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lb10/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb10/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lb10/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lb10/a;->x:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public run()V
    .locals 1

    iget-object v0, p0, Lb10/a;->x:Lc93/a;

    invoke-static {v0}, Lcom/mapbox/maps/MapboxMapRecorder;->a(Lc93/a;)V

    return-void
.end method
