.class public final Lhj/g;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/amplitude/android/engagement/a;


# direct methods
.method public synthetic constructor <init>(Lcom/amplitude/android/engagement/a;I)V
    .locals 0

    iput p2, p0, Lhj/g;->w:I

    iput-object p1, p0, Lhj/g;->x:Lcom/amplitude/android/engagement/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lhj/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lhj/r;

    const/4 v2, 0x1

    iget-object v3, p0, Lhj/g;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {v1, v3, v2}, Lhj/r;-><init>(Lcom/amplitude/android/engagement/a;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    new-instance v0, Lmj/g;

    iget-object v1, p0, Lhj/g;->x:Lcom/amplitude/android/engagement/a;

    invoke-direct {v0, v1}, Lmj/g;-><init>(Lcom/amplitude/android/engagement/a;)V

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AmplitudeEngagement initialized with API key: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhj/g;->x:Lcom/amplitude/android/engagement/a;

    iget-object v1, v1, Lcom/amplitude/android/engagement/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
