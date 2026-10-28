.class public final Lcom/iterable/iterableapi/w1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, [Lcom/iterable/iterableapi/s1;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    aget-object p1, p1, v0

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/iterable/iterableapi/s1;->a:Landroid/content/Context;

    iget-boolean v1, p1, Lcom/iterable/iterableapi/s1;->b:Z

    if-nez v1, :cond_0

    const-string v1, "notification"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iget v1, p1, Lcom/iterable/iterableapi/s1;->e:I

    invoke-virtual {p1}, Lcom/iterable/iterableapi/s1;->build()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
