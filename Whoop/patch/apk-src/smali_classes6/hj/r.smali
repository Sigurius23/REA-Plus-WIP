.class public final synthetic Lhj/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;I)V
    .locals 0

    iput p2, p0, Lhj/r;->w:I

    iput-object p1, p0, Lhj/r;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lhj/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhj/r;->x:Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v1, "window.engagement._.messageBus.publish(\'user_inactive\')"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhj/r;->x:Lcom/amplitude/android/engagement/a;

    iget-object v0, v0, Lcom/amplitude/android/engagement/a;->d:Lij/m;

    const-string v1, "window.engagement._.messageBus.publish(\'rage_click\')"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
