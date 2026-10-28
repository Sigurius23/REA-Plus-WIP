.class public final Lcq/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/g;
.implements Lcq/b;
.implements Ltp/u;


# instance fields
.field public final synthetic w:I

.field public final x:Lcq/i;


# direct methods
.method public synthetic constructor <init>(ILcq/i;)V
    .locals 0

    iput p1, p0, Lcq/q;->w:I

    iput-object p2, p0, Lcq/q;->x:Lcq/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcq/q;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    iget-object v1, p0, Lcq/q;->x:Lcq/i;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/location/Location;

    invoke-virtual {v1, p1}, Lcq/i;->d(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {v1, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    :cond_1
    :goto_0
    iget-object p1, v1, Lcq/i;->a:Lcq/u;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    iget-object v1, p0, Lcq/q;->x:Lcq/i;

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {v1, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcq/i;->d(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    iget-object p1, v1, Lcq/i;->a:Lcq/u;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lvo/a;)V
    .locals 3

    iget v0, p0, Lcq/q;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    const/4 v0, 0x0

    iget-object v1, p0, Lcq/q;->x:Lcq/i;

    invoke-static {p1, v0, v1}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    return-void

    :pswitch_0
    check-cast p1, Ltp/l;

    iget-object v0, p1, Ltp/l;->w:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result v1

    iget-object v2, p0, Lcq/q;->x:Lcq/i;

    if-eqz v1, :cond_0

    new-instance v0, Ltp/k;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Ltp/k;->a:Ltp/l;

    invoke-virtual {v2, v0}, Lcq/i;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lcom/google/android/gms/common/api/Status;->y:Landroid/app/PendingIntent;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/google/android/gms/common/api/ResolvableApiException;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v2, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/google/android/gms/common/api/ApiException;

    invoke-direct {p1, v0}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {v2, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcq/q;->x:Lcq/i;

    iget-object v0, v0, Lcq/i;->a:Lcq/u;

    invoke-virtual {v0}, Lcq/u;->d()V

    return-void
.end method

.method public s()V
    .locals 2

    iget-object v0, p0, Lcq/q;->x:Lcq/i;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void
.end method
