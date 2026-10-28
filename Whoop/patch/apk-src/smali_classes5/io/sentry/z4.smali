.class public final synthetic Lio/sentry/z4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwe/o;


# direct methods
.method public synthetic constructor <init>(Lwe/o;I)V
    .locals 0

    iput p2, p0, Lio/sentry/z4;->w:I

    iput-object p1, p0, Lio/sentry/z4;->x:Lwe/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/z4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/z4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/z4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/z4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/sentry/z4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
