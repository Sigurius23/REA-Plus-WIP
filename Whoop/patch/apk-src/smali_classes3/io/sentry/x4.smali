.class public final synthetic Lio/sentry/x4;
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

    iput p2, p0, Lio/sentry/x4;->w:I

    iput-object p1, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/x4;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_b
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    return-object v0

    :pswitch_c
    iget-object v0, p0, Lio/sentry/x4;->x:Lwe/o;

    invoke-virtual {v0}, Lwe/o;->H()[B

    move-result-object v0

    array-length v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
