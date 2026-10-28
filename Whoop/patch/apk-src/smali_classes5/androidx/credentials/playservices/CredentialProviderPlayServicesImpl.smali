.class public final Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm5/i;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008JE\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00162\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u000fH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u001e2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020 0\u000fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R(\u0010%\u001a\u00020$8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008%\u0010&\u0012\u0004\u0008+\u0010,\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*\u00a8\u0006/"
    }
    d2 = {
        "Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;",
        "Lm5/i;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "isGooglePlayServicesAvailable",
        "(Landroid/content/Context;)I",
        "Lm5/n;",
        "request",
        "Landroid/os/CancellationSignal;",
        "cancellationSignal",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Lm5/g;",
        "Lm5/o;",
        "Landroidx/credentials/exceptions/GetCredentialException;",
        "callback",
        "Ll83/a0;",
        "onGetCredential",
        "(Landroid/content/Context;Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V",
        "Lm5/b;",
        "Lm5/c;",
        "Landroidx/credentials/exceptions/CreateCredentialException;",
        "onCreateCredential",
        "(Landroid/content/Context;Lm5/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V",
        "",
        "isAvailableOnDevice",
        "()Z",
        "Lm5/a;",
        "Ljava/lang/Void;",
        "Landroidx/credentials/exceptions/ClearCredentialException;",
        "onClearCredential",
        "(Lm5/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V",
        "Landroid/content/Context;",
        "Lcom/google/android/gms/common/GoogleApiAvailability;",
        "googleApiAvailability",
        "Lcom/google/android/gms/common/GoogleApiAvailability;",
        "getGoogleApiAvailability",
        "()Lcom/google/android/gms/common/GoogleApiAvailability;",
        "setGoogleApiAvailability",
        "(Lcom/google/android/gms/common/GoogleApiAvailability;)V",
        "getGoogleApiAvailability$annotations",
        "()V",
        "Companion",
        "p5/b",
        "credentials-play-services-auth_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lp5/b;

.field public static final MIN_GMS_APK_VERSION:I = 0xdc1f545

.field private static final TAG:Ljava/lang/String; = "PlayServicesImpl"


# instance fields
.field private final context:Landroid/content/Context;

.field private googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;


# direct methods
.method public static synthetic $r8$lambda$DXdUqnt3NaHNieUz1yrHmEmv-IE(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->onClearCredential$lambda$2(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic $r8$lambda$KkkjfkO_ppPgKkxx-IfBnKmqAeg(Lp5/c;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->onClearCredential$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp5/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->context:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/common/GoogleApiAvailability;->getInstance()Lcom/google/android/gms/common/GoogleApiAvailability;

    move-result-object p1

    const-string v0, "getInstance()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    return-void
.end method

.method public static synthetic getGoogleApiAvailability$annotations()V
    .locals 0

    return-void
.end method

.method private final isGooglePlayServicesAvailable(Landroid/content/Context;)I
    .locals 2

    iget-object v0, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    const v1, 0xdc1f545

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/common/GoogleApiAvailability;->isGooglePlayServicesAvailable(Landroid/content/Context;I)I

    move-result p1

    return p1
.end method

.method private static final onClearCredential$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final onClearCredential$lambda$2(Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "$executor"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "$callback"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "e"

    invoke-static {p4, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    new-instance v0, Lev/h;

    const/4 v1, 0x5

    invoke-direct {v0, p4, p2, p3, v1}, Lev/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Lev/h;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final getGoogleApiAvailability()Lcom/google/android/gms/common/GoogleApiAvailability;
    .locals 1

    iget-object v0, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    return-object v0
.end method

.method public isAvailableOnDevice()Z
    .locals 4

    iget-object v0, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->isGooglePlayServicesAvailable(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v2, Lcom/google/android/gms/common/a;

    invoke-direct {v2, v0}, Lcom/google/android/gms/common/a;-><init>(I)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Connection with Google Play Services was not successful. Connection result is: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "PlayServicesImpl"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v1
.end method

.method public onClearCredential(Lm5/a;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm5/a;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "Lm5/g;",
            ")V"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "executor"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->context:Landroid/content/Context;

    new-instance v0, Lip/c;

    invoke-static {p1}, Luo/w;->f(Ljava/lang/Object;)V

    new-instance v1, Lpo/m;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, p1, v1}, Lip/c;-><init>(Landroid/content/Context;Lpo/m;)V

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/h;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "com.google.android.gms.signin"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    sget-object p1, Lcom/google/android/gms/common/api/k;->a:Ljava/util/Set;

    monitor-enter p1

    :try_start_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lto/f;->a()V

    invoke-static {}, Lto/q;->a()Le73/b;

    move-result-object p1

    sget-object v1, Lip/f;->a:Lcom/google/android/gms/common/c;

    filled-new-array {v1}, [Lcom/google/android/gms/common/c;

    move-result-object v1

    iput-object v1, p1, Le73/b;->c:Ljava/lang/Object;

    new-instance v1, Lhm/d;

    const/16 v3, 0xe

    invoke-direct {v1, v0, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p1, Le73/b;->e:Ljava/lang/Object;

    iput-boolean v2, p1, Le73/b;->b:Z

    const/16 v1, 0x612

    iput v1, p1, Le73/b;->d:I

    invoke-virtual {p1}, Le73/b;->g()Lto/j0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/h;->doWrite(Lto/q;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lp5/c;

    invoke-direct {v0, p2, p3, p4}, Lp5/c;-><init>(Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V

    new-instance v1, Lmm/d;

    const/16 v2, 0xe

    invoke-direct {v1, v0, v2}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcq/f;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/ui/utils/a;

    const/4 v5, 0x3

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Lcq/e;)Lcom/google/android/gms/tasks/Task;

    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :catchall_0
    move-exception v0

    move-object p2, v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public onCreateCredential(Landroid/content/Context;Lm5/b;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm5/b;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "Lm5/g;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lm5/d;

    if-eqz v0, :cond_2

    new-instance v0, Ls5/a;

    invoke-direct {v0, p1}, Ls5/a;-><init>(Landroid/content/Context;)V

    check-cast p2, Lm5/d;

    iput-object p3, v0, Ls5/a;->g:Landroid/os/CancellationSignal;

    iput-object p5, v0, Ls5/a;->e:Lm5/g;

    iput-object p4, v0, Ls5/a;->f:Ljava/util/concurrent/Executor;

    invoke-static {p3}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p4

    if-eqz p4, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance p4, Lpo/k;

    iget-object p5, p2, Lm5/d;->d:Ljava/lang/String;

    iget-object p2, p2, Lm5/d;->e:Ljava/lang/String;

    invoke-direct {p4, p5, p2}, Lpo/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lpo/h;

    const/4 p5, 0x0

    const/4 v1, 0x0

    invoke-direct {p2, p4, p5, v1}, Lpo/h;-><init>(Lpo/k;Ljava/lang/String;I)V

    new-instance p4, Landroid/content/Intent;

    const-class p5, Landroidx/credentials/playservices/HiddenActivity;

    invoke-direct {p4, p1, p5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p5, "REQUEST_TYPE"

    invoke-virtual {p4, p5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p2, v0, Ls5/a;->h:Lr5/d;

    const-string p5, "CREATE_PASSWORD"

    invoke-static {p2, p4, p5}, Lq5/b;->b(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1, p4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    new-instance p1, Lm5/k;

    const/4 p2, 0x5

    invoke-direct {p1, v0, p2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3, p1}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Create Credential request is unsupported, not password or publickeycredential"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onGetCredential(Landroid/content/Context;Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lm5/n;",
            "Landroid/os/CancellationSignal;",
            "Ljava/util/concurrent/Executor;",
            "Lm5/g;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Lm5/n;->a:Ljava/util/List;

    const-string v0, "executor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm5/p;

    goto :goto_0

    .line 4
    :cond_1
    new-instance v0, Lr5/e;

    invoke-direct {v0, p1}, Lr5/e;-><init>(Landroid/content/Context;)V

    .line 5
    iput-object p3, v0, Lr5/e;->h:Landroid/os/CancellationSignal;

    .line 6
    iput-object p5, v0, Lr5/e;->f:Lm5/g;

    .line 7
    iput-object p4, v0, Lr5/e;->g:Ljava/util/concurrent/Executor;

    .line 8
    sget-object p4, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:Lp5/b;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p3}, Lp5/b;->a(Landroid/os/CancellationSignal;)Z

    move-result p4

    if-eqz p4, :cond_2

    :goto_1
    return-void

    .line 9
    :cond_2
    new-instance p4, Lpo/d;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Lpo/d;-><init>(Z)V

    .line 10
    new-instance v1, Lpo/a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lpo/a;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    .line 11
    new-instance v7, Lpo/c;

    const/4 v2, 0x0

    invoke-direct {v7, p5, v2, v2}, Lpo/c;-><init>(Z[BLjava/lang/String;)V

    .line 12
    new-instance v8, Lpo/b;

    invoke-direct {v8, p5, v2}, Lpo/b;-><init>(ZLjava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "context.packageManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    const-string v3, "com.google.android.gms"

    .line 15
    invoke-virtual {v2, v3, p5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p5

    iget p5, p5, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 16
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p4

    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lm5/p;

    .line 17
    instance-of p4, p4, Lm5/p;

    if-eqz p4, :cond_3

    .line 18
    new-instance v2, Lpo/d;

    const/4 p4, 0x1

    invoke-direct {v2, p4}, Lpo/d;-><init>(Z)V

    goto :goto_2

    .line 19
    :cond_4
    new-instance p2, Lpo/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v3, v1

    move-object v1, p2

    invoke-direct/range {v1 .. v9}, Lpo/e;-><init>(Lpo/d;Lpo/a;Ljava/lang/String;ZILpo/c;Lpo/b;Z)V

    .line 20
    new-instance p2, Landroid/content/Intent;

    const-class p4, Landroidx/credentials/playservices/HiddenActivity;

    invoke-direct {p2, p1, p4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 21
    const-string p4, "REQUEST_TYPE"

    invoke-virtual {p2, p4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 22
    iget-object p4, v0, Lr5/e;->i:Lr5/d;

    const-string p5, "BEGIN_SIGN_IN"

    invoke-static {p4, p2, p5}, Lq5/b;->b(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 23
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 24
    :catch_0
    new-instance p1, Lm5/k;

    const/4 p2, 0x4

    invoke-direct {p1, v0, p2}, Lm5/k;-><init>(Ljava/lang/Object;I)V

    invoke-static {p3, p1}, Lq5/b;->a(Landroid/os/CancellationSignal;Lc93/a;)V

    return-void
.end method

.method public onGetCredential(Landroid/content/Context;Lm5/r;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 0

    .line 1
    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "pendingGetCredentialHandle"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "executor"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public onPrepareCredential(Lm5/n;Landroid/os/CancellationSignal;Ljava/util/concurrent/Executor;Lm5/g;)V
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "executor"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "callback"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final setGoogleApiAvailability(Lcom/google/android/gms/common/GoogleApiAvailability;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->googleApiAvailability:Lcom/google/android/gms/common/GoogleApiAvailability;

    return-void
.end method
