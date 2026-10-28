.class public final synthetic Lio/sentry/a6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/q6;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/q6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/a6;->w:I

    iput-object p1, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lqt/e;Lio/sentry/q6;)V
    .locals 0

    .line 2
    const/4 p1, 0x3

    iput p1, p0, Lio/sentry/a6;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    return-void
.end method


# virtual methods
.method public final j()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/a6;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "androidx.core.view.ScrollingView"

    iget-object v1, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    invoke-static {v1, v0}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    invoke-static {v0}, Lio/sentry/q6;->b(Lio/sentry/q6;)Lio/sentry/z;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lio/sentry/i2;

    invoke-direct {v1, v0}, Lio/sentry/i2;-><init>(Lio/sentry/q6;)V

    return-object v1

    :pswitch_2
    iget-object v0, p0, Lio/sentry/a6;->x:Lio/sentry/q6;

    invoke-static {v0}, Lio/sentry/q6;->a(Lio/sentry/q6;)Lio/sentry/y;

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
