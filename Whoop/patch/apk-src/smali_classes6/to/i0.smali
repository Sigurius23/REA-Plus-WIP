.class public final Lto/i0;
.super Laq/c;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/i;
.implements Lcom/google/android/gms/common/api/j;


# static fields
.field public static final n:Ldq/y;


# instance fields
.field public final g:Landroid/content/Context;

.field public final h:Landroid/os/Handler;

.field public final i:Ldq/y;

.field public final j:Ljava/util/Set;

.field public final k:Lcom/google/crypto/tink/internal/k0;

.field public l:Laq/a;

.field public m:Lcd3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lzp/b;->a:Ldq/y;

    sput-object v0, Lto/i0;->n:Ldq/y;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lcom/google/crypto/tink/internal/k0;)V
    .locals 2

    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lip/h;-><init>(Ljava/lang/String;I)V

    iput-object p1, p0, Lto/i0;->g:Landroid/content/Context;

    iput-object p2, p0, Lto/i0;->h:Landroid/os/Handler;

    iput-object p3, p0, Lto/i0;->k:Lcom/google/crypto/tink/internal/k0;

    iget-object p1, p3, Lcom/google/crypto/tink/internal/k0;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lto/i0;->j:Ljava/util/Set;

    sget-object p1, Lto/i0;->n:Ldq/y;

    iput-object p1, p0, Lto/i0;->i:Ldq/y;

    return-void
.end method


# virtual methods
.method public final X(I)V
    .locals 2

    iget-object v0, p0, Lto/i0;->m:Lcd3/g;

    iget-object v1, v0, Lcd3/g;->F:Ljava/lang/Object;

    check-cast v1, Lto/f;

    iget-object v1, v1, Lto/f;->J:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v0, v0, Lcd3/g;->y:Ljava/lang/Object;

    check-cast v0, Lto/a;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lto/v;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lto/v;->n:Z

    if-eqz v1, :cond_0

    new-instance p1, Lcom/google/android/gms/common/a;

    const/16 v1, 0x11

    invoke-direct {p1, v1}, Lcom/google/android/gms/common/a;-><init>(I)V

    invoke-virtual {v0, p1}, Lto/v;->k(Lcom/google/android/gms/common/a;)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lto/v;->X(I)V

    :cond_1
    return-void
.end method

.method public final c0(Lcom/google/android/gms/common/a;)V
    .locals 1

    iget-object v0, p0, Lto/i0;->m:Lcd3/g;

    invoke-virtual {v0, p1}, Lcd3/g;->K(Lcom/google/android/gms/common/a;)V

    return-void
.end method

.method public final n0(Lcd3/g;)V
    .locals 8

    iget-object v0, p0, Lto/i0;->l:Laq/a;

    if-eqz v0, :cond_0

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->e()V

    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v4, p0, Lto/i0;->k:Lcom/google/crypto/tink/internal/k0;

    iput-object v0, v4, Lcom/google/crypto/tink/internal/k0;->w:Ljava/lang/Object;

    iget-object v0, p0, Lto/i0;->h:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v3

    iget-object v1, v4, Lcom/google/crypto/tink/internal/k0;->F:Ljava/lang/Object;

    move-object v5, v1

    check-cast v5, Lzp/a;

    iget-object v1, p0, Lto/i0;->i:Ldq/y;

    iget-object v2, p0, Lto/i0;->g:Landroid/content/Context;

    move-object v7, p0

    move-object v6, p0

    invoke-virtual/range {v1 .. v7}, Ldq/y;->a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/crypto/tink/internal/k0;Ljava/lang/Object;Lcom/google/android/gms/common/api/i;Lcom/google/android/gms/common/api/j;)Lcom/google/android/gms/common/api/d;

    move-result-object v1

    check-cast v1, Laq/a;

    iput-object v1, v6, Lto/i0;->l:Laq/a;

    iput-object p1, v6, Lto/i0;->m:Lcd3/g;

    iget-object p1, v6, Lto/i0;->j:Ljava/util/Set;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, v6, Lto/i0;->l:Laq/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lty/c;

    invoke-direct {v0, p1}, Lty/c;-><init>(Luo/c;)V

    iput-object v0, p1, Luo/c;->i:Luo/b;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Luo/c;->t(ILandroid/os/IInterface;)V

    return-void

    :cond_2
    :goto_0
    new-instance p1, Lbq/b;

    const/16 v1, 0x1c

    invoke-direct {p1, p0, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final o0()V
    .locals 1

    iget-object v0, p0, Lto/i0;->l:Laq/a;

    if-eqz v0, :cond_0

    check-cast v0, Luo/c;

    invoke-virtual {v0}, Luo/c;->e()V

    :cond_0
    return-void
.end method

.method public final s()V
    .locals 9

    iget-object v0, p0, Lto/i0;->l:Laq/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "<<default account>>"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, v0, Laq/a;->A:Lcom/google/crypto/tink/internal/k0;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Landroid/accounts/Account;

    const-string v6, "com.google"

    invoke-direct {v5, v1, v6}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v5, Landroid/accounts/Account;->name:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Luo/c;->c:Landroid/content/Context;

    invoke-static {v1}, Lro/b;->a(Landroid/content/Context;)Lro/b;

    move-result-object v1

    invoke-virtual {v1}, Lro/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    move-result-object v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    move-object v1, v4

    :goto_0
    new-instance v6, Luo/s;

    iget-object v7, v0, Laq/a;->C:Ljava/lang/Integer;

    invoke-static {v7}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x2

    invoke-direct {v6, v8, v5, v7, v1}, Luo/s;-><init>(ILandroid/accounts/Account;ILcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    invoke-virtual {v0}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Laq/d;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    iget-object v5, v0, Lip/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    sget v5, Ljp/a;->a:I

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    const/16 v5, 0x4f45

    invoke-static {v1, v5}, Lvo/c;->s(Landroid/os/Parcel;I)I

    move-result v5

    const/4 v7, 0x4

    invoke-static {v1, v3, v7}, Lvo/c;->r(Landroid/os/Parcel;II)V

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-static {v1, v8, v6, v2}, Lvo/c;->l(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    invoke-static {v1, v5}, Lvo/c;->t(Landroid/os/Parcel;I)V

    invoke-virtual {v1, p0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v0, Lip/a;->g:Landroid/os/IBinder;

    const/16 v6, 0xc

    invoke-interface {v0, v6, v1, v5, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    invoke-virtual {v5}, Landroid/os/Parcel;->readException()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    throw v0
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_1
    const-string v1, "Remote service probably died when signIn is called"

    const-string v5, "SignInClientImpl"

    invoke-static {v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_3
    new-instance v1, Laq/f;

    new-instance v6, Lcom/google/android/gms/common/a;

    const/16 v7, 0x8

    invoke-direct {v6, v7, v4}, Lcom/google/android/gms/common/a;-><init>(ILandroid/app/PendingIntent;)V

    invoke-direct {v1, v3, v6, v4}, Laq/f;-><init>(ILcom/google/android/gms/common/a;Luo/t;)V

    new-instance v3, Lds/s;

    const/16 v4, 0x10

    invoke-direct {v3, p0, v1, v2, v4}, Lds/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iget-object v1, p0, Lto/i0;->h:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    const-string v1, "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException."

    invoke-static {v5, v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-void
.end method
