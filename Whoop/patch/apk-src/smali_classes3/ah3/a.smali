.class public final Lah3/a;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lah3/a;->w:I

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lah3/a;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Chain of Causes for CompositeException In Order Received =>"

    return-object v0

    :pswitch_0
    const-string v0, "Chain of Causes for CompositeException In Order Received =>"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
