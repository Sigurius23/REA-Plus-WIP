.class public final synthetic Lio/sentry/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/y1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/g2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/g2;I)V
    .locals 0

    iput p2, p0, Lio/sentry/w1;->w:I

    iput-object p1, p0, Lio/sentry/w1;->x:Lio/sentry/g2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/w1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/w1;->x:Lio/sentry/g2;

    iget-object v1, v0, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v1}, Lio/sentry/vendor/gson/stream/a;->s()Z

    move-result v1

    invoke-virtual {v0}, Lio/sentry/g2;->h()V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/w1;->x:Lio/sentry/g2;

    invoke-virtual {v0}, Lio/sentry/g2;->nextString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
