.class public final synthetic Lp5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/credentials/playservices/HiddenActivity;


# direct methods
.method public synthetic constructor <init>(Landroidx/credentials/playservices/HiddenActivity;I)V
    .locals 0

    iput p2, p0, Lp5/d;->w:I

    iput-object p1, p0, Lp5/d;->x:Landroidx/credentials/playservices/HiddenActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(Ljava/lang/Exception;)V
    .locals 8

    iget v0, p0, Lp5/d;->w:I

    const-string v1, "CREATE_INTERRUPTED"

    const-string v2, "CREATE_UNKNOWN"

    const-string v3, "GET_INTERRUPTED"

    const-string v4, "GET_NO_CREDENTIALS"

    const-string v5, "e"

    const-string v6, "this$0"

    iget-object v7, p0, Lp5/d;->x:Landroidx/credentials/playservices/HiddenActivity;

    packed-switch v0, :pswitch_data_0

    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_0

    sget-object v0, Lq5/b;->b:Ljava/util/Set;

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v1, v1, Lcom/google/android/gms/common/api/Status;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    iget-object v0, v7, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "During begin sign in, failure response from one tap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, v3, p1}, Landroidx/credentials/playservices/HiddenActivity;->a(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_0
    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_1

    sget-object v0, Lq5/b;->b:Ljava/util/Set;

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/common/api/ApiException;

    iget-object v1, v1, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v1, v1, Lcom/google/android/gms/common/api/Status;->w:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    iget-object v0, v7, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "During get sign-in intent, failure response from one tap: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, v3, p1}, Landroidx/credentials/playservices/HiddenActivity;->a(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_1
    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_2

    sget-object v0, Lq5/b;->b:Ljava/util/Set;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/common/api/ApiException;

    iget-object v3, v3, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v3, v3, Lcom/google/android/gms/common/api/Status;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v2

    :goto_2
    iget-object v0, v7, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "During save password, found password failure response from one tap "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, v1, p1}, Landroidx/credentials/playservices/HiddenActivity;->a(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_2
    sget v0, Landroidx/credentials/playservices/HiddenActivity;->y:I

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/google/android/gms/common/api/ApiException;

    if-eqz v0, :cond_3

    sget-object v0, Lq5/b;->b:Ljava/util/Set;

    move-object v3, p1

    check-cast v3, Lcom/google/android/gms/common/api/ApiException;

    iget-object v3, v3, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v3, v3, Lcom/google/android/gms/common/api/Status;->w:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    iget-object v0, v7, Landroidx/credentials/playservices/HiddenActivity;->w:Landroid/os/ResultReceiver;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "During create public key credential, fido registration failure: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, v0, v1, p1}, Landroidx/credentials/playservices/HiddenActivity;->a(Landroid/os/ResultReceiver;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
