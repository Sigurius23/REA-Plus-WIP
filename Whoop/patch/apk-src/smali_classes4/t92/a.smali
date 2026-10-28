.class public final synthetic Lt92/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt92/b;


# direct methods
.method public synthetic constructor <init>(Lt92/b;I)V
    .locals 0

    iput p2, p0, Lt92/a;->w:I

    iput-object p1, p0, Lt92/a;->x:Lt92/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lt92/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lt92/a;->x:Lt92/b;

    invoke-static {v0}, Lt92/b;->g1(Lt92/b;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lt92/a;->x:Lt92/b;

    invoke-static {v0}, Lt92/b;->h1(Lt92/b;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
