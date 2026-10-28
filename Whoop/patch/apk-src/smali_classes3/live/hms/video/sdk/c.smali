.class public final synthetic Llive/hms/video/sdk/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llive/hms/video/sdk/SDKDelegate;


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/sdk/SDKDelegate;I)V
    .locals 0

    iput p2, p0, Llive/hms/video/sdk/c;->w:I

    iput-object p1, p0, Llive/hms/video/sdk/c;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/video/sdk/c;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->q(Llive/hms/video/sdk/SDKDelegate;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Llive/hms/video/sdk/c;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->f(Llive/hms/video/sdk/SDKDelegate;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Llive/hms/video/sdk/c;->x:Llive/hms/video/sdk/SDKDelegate;

    invoke-static {v0}, Llive/hms/video/sdk/SDKDelegate;->e(Llive/hms/video/sdk/SDKDelegate;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
