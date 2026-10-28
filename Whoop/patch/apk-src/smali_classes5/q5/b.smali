.class public abstract Lq5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq5/a;

.field public static final b:Ljava/util/Set;

.field public static final c:I

.field public static final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq5/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq5/b;->a:Lq5/a;

    const/4 v0, 0x7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x14

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lq5/b;->b:Ljava/util/Set;

    const/4 v0, 0x1

    sput v0, Lq5/b;->c:I

    return-void
.end method

.method public static final a(Landroid/os/CancellationSignal;Lc93/a;)V
    .locals 1

    const-string v0, "onResultOrException"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 1

    const-string v0, "resultReceiver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "TYPE"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "ACTIVITY_REQUEST_CODE"

    sget v0, Lq5/b;->c:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    const-string v0, "obtain()"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0}, Landroid/os/ResultReceiver;->writeToParcel(Landroid/os/Parcel;I)V

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    sget-object p0, Landroid/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/os/ResultReceiver;

    invoke-virtual {p2}, Landroid/os/Parcel;->recycle()V

    const-string p2, "RESULT_RECEIVER"

    invoke-virtual {p1, p2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/high16 p0, 0x10000

    invoke-virtual {p1, p0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    return-void
.end method

.method public static c(Landroid/os/Bundle;Lc93/m;Ljava/util/concurrent/Executor;Lm5/g;Landroid/os/CancellationSignal;)Z
    .locals 2

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "FAILURE_RESPONSE"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const-string v0, "EXCEPTION_TYPE"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "EXCEPTION_MESSAGE"

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    new-instance p1, Lev/h;

    const/4 v0, 0x6

    invoke-direct {p1, p2, p3, p0, v0}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p4, p1}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    const/4 p0, 0x1

    return p0
.end method
