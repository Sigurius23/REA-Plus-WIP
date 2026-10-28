.class public Lro/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lai/k;
.implements Li63/e;
.implements Lbh3/i;
.implements Lcq/f;
.implements Ld0/s;
.implements Lto/n;


# static fields
.field public static y:Lro/i;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FFLd0/r;)V
    .locals 5

    const/16 v0, 0x14

    iput v0, p0, Lro/i;->w:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p3}, Ld0/r;->b()I

    move-result v0

    new-array v1, v0, [Ld0/g0;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 24
    new-instance v3, Ld0/g0;

    invoke-virtual {p3, v2}, Ld0/r;->a(I)F

    move-result v4

    invoke-direct {v3, p1, p2, v4}, Ld0/g0;-><init>(FFF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 25
    :cond_0
    iput-object v1, p0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lro/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lro/i;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lro/b;->a(Landroid/content/Context;)Lro/b;

    move-result-object p1

    iput-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    .line 4
    invoke-virtual {p1}, Lro/b;->b()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 5
    const-string v0, "defaultGoogleSignInAccount"

    invoke-virtual {p1, v0}, Lro/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "googleSignInOptions"

    .line 7
    invoke-static {v1, v0}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lro/b;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 8
    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->b(Ljava/lang/String;)Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v4/media/session/p;)V
    .locals 2

    const/4 v0, 0x4

    iput v0, p0, Lro/i;->w:I

    .line 12
    iget-object p2, p2, Landroid/support/v4/media/session/p;->a:Landroid/support/v4/media/session/l;

    .line 13
    iget-object p2, p2, Landroid/support/v4/media/session/l;->b:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 15
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 17
    new-instance v0, Landroid/support/v4/media/session/g;

    .line 18
    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/f;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 19
    iput-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroid/support/v4/media/session/f;

    invoke-direct {v0, p1, p2}, Landroid/support/v4/media/session/f;-><init>(Landroid/content/Context;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    iput-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    :goto_0
    return-void

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sessionToken must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lcq/l;Lcq/g;)V
    .locals 0

    const/16 p1, 0x10

    iput p1, p0, Lro/i;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 2

    const/16 v0, 0x8

    iput v0, p0, Lro/i;->w:I

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Lbd3/j;

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v1}, Lbd3/j;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lro/i;->w:I

    iput-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(I)Lro/i;
    .locals 2

    new-instance v0, Lro/i;

    invoke-static {p0}, Lse/b;->W(I)[B

    move-result-object p0

    invoke-static {p0}, Lct/a;->a([B)Lct/a;

    move-result-object p0

    const/16 v1, 0x12

    invoke-direct {v0, p0, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static declared-synchronized G(Landroid/content/Context;)Lro/i;
    .locals 3

    const-class v0, Lro/i;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lro/i;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v2, Lro/i;->y:Lro/i;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_0

    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :cond_0
    :try_start_3
    new-instance v2, Lro/i;

    invoke-direct {v2, p0}, Lro/i;-><init>(Landroid/content/Context;)V

    sput-object v2, Lro/i;->y:Lro/i;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :goto_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw p0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p0
.end method

.method public static b(IZ)I
    .locals 2

    const/16 v0, 0x80

    if-ge p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    move v1, p0

    :goto_0
    ushr-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    add-int/2addr v0, p1

    add-int/2addr v0, p0

    return v0
.end method

.method public static r([BLfs/p;)Lro/i;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lro/i;

    invoke-static {p0}, Lct/a;->a([B)Lct/a;

    move-result-object p0

    const/16 v0, 0x12

    invoke-direct {p1, p0, v0}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Ljava/math/BigInteger;)Lro/i;
    .locals 2

    new-instance v0, Lro/i;

    const/16 v1, 0x11

    invoke-direct {v0, p0, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method


# virtual methods
.method public B()V
    .locals 5

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lbd3/j;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lbd3/f;->c:Lbd3/f;

    iget-object v0, v0, Lbd3/j;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v2, "array(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v1

    :try_start_0
    iget v2, v1, Landroidx/glance/appwidget/protobuf/l;->a:I

    array-length v3, v0

    add-int/2addr v3, v2

    sget v4, Lbd3/e;->a:I

    if-ge v3, v4, :cond_0

    array-length v3, v0

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    iput v2, v1, Landroidx/glance/appwidget/protobuf/l;->a:I

    iget-object v2, v1, Landroidx/glance/appwidget/protobuf/l;->b:Ljava/lang/Object;

    check-cast v2, Lm83/m;

    invoke-virtual {v2, v0}, Lm83/m;->addLast(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1

    throw v0
.end method

.method public C(Lau/e;)V
    .locals 0

    iput-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    return-void
.end method

.method public D()V
    .locals 7

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, La1/k;

    if-eqz v0, :cond_3

    iget-boolean v1, v0, Lb2/v;->N:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, La1/k;->U:Lbc3/c2;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lbc3/t1;->isActive()Z

    move-result v1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lb1/i;->b:Lp1/b0;

    invoke-static {v0, v1}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb1/g;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v3

    sget-object v4, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, La1/h;

    const/4 v6, 0x0

    invoke-direct {v5, v0, v1, v6}, La1/h;-><init>(La1/k;Lb1/g;Lq83/d;)V

    invoke-static {v3, v6, v4, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, La1/k;->U:Lbc3/c2;

    :cond_2
    :goto_0
    return-void

    :cond_3
    const-string v0, "ToolbarRequester is not initialized."

    invoke-static {v0}, Lk0/a;->d(Ljava/lang/String;)Ljava/lang/Void;

    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public E()I
    .locals 1

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lct/a;

    iget-object v0, v0, Lct/a;->a:[B

    array-length v0, v0

    return v0
.end method

.method public F(Lfs/p;)[B
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Lct/a;

    invoke-virtual {p1}, Lct/a;->b()[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "SecretKeyAccess required"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized H()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lro/b;

    iget-object v1, v0, Lro/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, v0, Lro/b;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Li63/d;)Z
    .locals 1

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Li63/d;

    invoke-virtual {p1, v0}, Li63/d;->f(Li63/d;)Z

    move-result p1

    return p1
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lro/i;->w:I

    sget-object v1, Lcom/google/android/gms/common/api/Status;->G:Lcom/google/android/gms/common/api/Status;

    const/4 v2, 0x1

    const-string v3, "WalletClientImpl"

    check-cast p1, Lsp/k;

    check-cast p2, Lcq/i;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ldq/i;

    invoke-virtual {p1}, Lsp/k;->u()Landroid/os/Bundle;

    move-result-object v1

    new-instance v4, Lsp/j;

    invoke-direct {v4, v2, p2}, Lsp/j;-><init>(ILcq/i;)V

    :try_start_0
    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lsp/h;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    iget-object v2, p1, Lip/a;->h:Ljava/lang/String;

    invoke-virtual {p2, v2}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v1}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v4}, Lsp/a;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v0, 0x18

    invoke-virtual {p1, p2, v0}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "RemoteException during getPaymentCardRecognitionIntent"

    invoke-static {v3, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ldq/m;

    invoke-virtual {p1}, Lsp/k;->u()Landroid/os/Bundle;

    move-result-object v4

    const-string v5, "com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT"

    invoke-virtual {v4, v5, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    new-instance v2, Lsp/j;

    const/4 v5, 0x2

    invoke-direct {v2, v5, p2}, Lsp/j;-><init>(ILcq/i;)V

    :try_start_1
    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lsp/h;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object p2

    iget-object v5, p1, Lip/a;->h:Ljava/lang/String;

    invoke-virtual {p2, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {p2, v0}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v4}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {p2, v2}, Lsp/a;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v0, 0x13

    invoke-virtual {p1, p2, v0}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string p2, "RemoteException getting payment data"

    invoke-static {v3, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    sget p1, Ldq/a;->a:I

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/Status;->b()Z

    move-result p1

    iget-object p2, v2, Lsp/j;->g:Lcq/i;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    invoke-static {v1}, Ls3/d;->g(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/ApiException;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcq/i;->a(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ldq/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lsp/j;

    const/4 v4, 0x0

    invoke-direct {v2, v4, p2}, Lsp/j;-><init>(ILcq/i;)V

    :try_start_2
    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p2

    check-cast p2, Lsp/h;

    invoke-virtual {p1}, Lsp/k;->u()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    iget-object v5, p2, Lip/a;->h:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-static {v4, v0}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v4, p1}, Lsp/a;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v4, v2}, Lsp/a;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xe

    invoke-virtual {p2, v4, p1}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    const-string p2, "RemoteException during isReadyToPay"

    invoke-static {v3, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object p2, v2, Lsp/j;->g:Lcq/i;

    invoke-static {v1, p1, p2}, Ls3/d;->q(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lcq/i;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1b
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()Ld/r;
    .locals 3

    new-instance v0, Ld/r;

    iget-object v1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public d(I)V
    .locals 6

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x80

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_0
    const/4 v2, 0x5

    new-array v3, v2, [B

    :goto_0
    add-int/lit8 v4, v2, -0x1

    int-to-byte v5, p1

    aput-byte v5, v3, v4

    ushr-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    rsub-int/lit8 p1, v4, 0x5

    add-int/lit8 v2, v2, -0x2

    or-int/2addr p1, v1

    int-to-byte p1, p1

    aput-byte p1, v3, v2

    rsub-int/lit8 p1, v4, 0x6

    invoke-virtual {v0, v3, v2, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void

    :cond_1
    move v2, v4

    goto :goto_0
.end method

.method public e(II)V
    .locals 5

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ljava/io/ByteArrayOutputStream;

    const/16 v1, 0x1f

    if-ge p2, v1, :cond_0

    or-int/2addr p1, p2

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_0
    const/4 v2, 0x6

    new-array v2, v2, [B

    and-int/lit8 v3, p2, 0x7f

    int-to-byte v3, v3

    const/4 v4, 0x5

    aput-byte v3, v2, v4

    :goto_0
    const/16 v3, 0x7f

    if-le p2, v3, :cond_1

    ushr-int/lit8 p2, p2, 0x7

    add-int/lit8 v4, v4, -0x1

    and-int/lit8 v3, p2, 0x7f

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, -0x1

    or-int/2addr p1, v1

    int-to-byte p1, p1

    aput-byte p1, v2, v4

    rsub-int/lit8 p1, v4, 0x6

    invoke-virtual {v0, v2, v4, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public f(IZ[B)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lro/i;->n(IZ)V

    array-length p1, p3

    invoke-virtual {p0, p1}, Lro/i;->d(I)V

    array-length p1, p3

    iget-object p2, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/ByteArrayOutputStream;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public g(Lai/b;Lrh/j;Ljava/util/Map;J)V
    .locals 7

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lai/j;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lai/j;->o(Lai/b;Lrh/j;Ljava/util/Map;J)V

    return-void
.end method

.method public get(I)Ld0/d0;
    .locals 1

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, [Ld0/g0;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public getSize()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public h(ZI[Ld/q;)V
    .locals 0

    invoke-virtual {p0, p2, p1}, Lro/i;->n(IZ)V

    iget-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/io/ByteArrayOutputStream;

    const/16 p2, 0x80

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p0, p3}, Lro/i;->i([Ld/q;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public i([Ld/q;)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-interface {v2}, Ld/q;->d()Ld/b1;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public j([Ld/b1;)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(Lai/b;)Lai/c;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public l()Ld/z0;
    .locals 3

    new-instance v0, Ld/z0;

    iget-object v1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayOutputStream;

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public m(J)V
    .locals 0

    return-void
.end method

.method public n(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p2, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    :cond_0
    return-void
.end method

.method public o(IILwm/j;)V
    .locals 23

    move/from16 v0, p1

    move/from16 v1, p2

    move-object/from16 v2, p0

    move-object/from16 v3, p3

    iget-object v4, v2, Lro/i;->x:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lbn/d;

    iget-object v4, v5, Lbn/d;->b:Lbn/e;

    iget-object v6, v5, Lbn/d;->c:Landroid/util/SparseArray;

    iget-object v7, v5, Lbn/d;->i:Led3/a;

    iget-object v8, v5, Lbn/d;->g:Led3/a;

    const/16 v9, 0xa1

    const/16 v10, 0xa3

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x4

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v0, v9, :cond_b

    if-eq v0, v10, :cond_b

    const/16 v4, 0xa5

    if-eq v0, v4, :cond_8

    const/16 v4, 0x41ed

    if-eq v0, v4, :cond_5

    const/16 v4, 0x4255

    if-eq v0, v4, :cond_4

    const/16 v4, 0x47e2

    if-eq v0, v4, :cond_3

    const/16 v4, 0x53ab

    if-eq v0, v4, :cond_2

    const/16 v4, 0x63a2

    if-eq v0, v4, :cond_1

    const/16 v4, 0x7672

    if-ne v0, v4, :cond_0

    invoke-virtual {v5, v0}, Lbn/d;->c(I)V

    iget-object v0, v5, Lbn/d;->u:Lbn/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lbn/c;->v:[B

    invoke-interface {v3, v4, v15, v1}, Lwm/j;->readFully([BII)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v3, 0x1a

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Unexpected id: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {v5, v0}, Lbn/d;->c(I)V

    iget-object v0, v5, Lbn/d;->u:Lbn/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lbn/c;->k:[B

    invoke-interface {v3, v4, v15, v1}, Lwm/j;->readFully([BII)V

    return-void

    :cond_2
    iget-object v0, v7, Led3/a;->a:[B

    invoke-static {v0, v15}, Ljava/util/Arrays;->fill([BB)V

    iget-object v0, v7, Led3/a;->a:[B

    rsub-int/lit8 v4, v1, 0x4

    invoke-interface {v3, v0, v4, v1}, Lwm/j;->readFully([BII)V

    invoke-virtual {v7, v15}, Led3/a;->K(I)V

    invoke-virtual {v7}, Led3/a;->z()J

    move-result-wide v0

    long-to-int v0, v0

    iput v0, v5, Lbn/d;->w:I

    return-void

    :cond_3
    new-array v4, v1, [B

    invoke-interface {v3, v4, v15, v1}, Lwm/j;->readFully([BII)V

    invoke-virtual {v5, v0}, Lbn/d;->c(I)V

    iget-object v0, v5, Lbn/d;->u:Lbn/c;

    new-instance v1, Lwm/r;

    invoke-direct {v1, v14, v15, v15, v4}, Lwm/r;-><init>(III[B)V

    iput-object v1, v0, Lbn/c;->j:Lwm/r;

    return-void

    :cond_4
    invoke-virtual {v5, v0}, Lbn/d;->c(I)V

    iget-object v0, v5, Lbn/d;->u:Lbn/c;

    new-array v4, v1, [B

    iput-object v4, v0, Lbn/c;->i:[B

    invoke-interface {v3, v4, v15, v1}, Lwm/j;->readFully([BII)V

    return-void

    :cond_5
    invoke-virtual {v5, v0}, Lbn/d;->c(I)V

    iget-object v0, v5, Lbn/d;->u:Lbn/c;

    iget v4, v0, Lbn/c;->g:I

    const v5, 0x64767643

    if-eq v4, v5, :cond_7

    const v5, 0x64766343

    if-ne v4, v5, :cond_6

    goto :goto_0

    :cond_6
    invoke-interface {v3, v1}, Lwm/j;->n(I)V

    return-void

    :cond_7
    :goto_0
    new-array v4, v1, [B

    iput-object v4, v0, Lbn/c;->N:[B

    invoke-interface {v3, v4, v15, v1}, Lwm/j;->readFully([BII)V

    return-void

    :cond_8
    iget v0, v5, Lbn/d;->G:I

    if-eq v0, v12, :cond_9

    goto/16 :goto_12

    :cond_9
    iget v0, v5, Lbn/d;->M:I

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbn/c;

    iget v4, v5, Lbn/d;->P:I

    iget-object v5, v5, Lbn/d;->n:Led3/a;

    if-ne v4, v13, :cond_a

    const-string v4, "V_VP9"

    iget-object v0, v0, Lbn/c;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v5, v1}, Led3/a;->H(I)V

    iget-object v0, v5, Led3/a;->a:[B

    invoke-interface {v3, v0, v15, v1}, Lwm/j;->readFully([BII)V

    return-void

    :cond_a
    invoke-interface {v3, v1}, Lwm/j;->n(I)V

    return-void

    :cond_b
    iget v7, v5, Lbn/d;->G:I

    const/16 v9, 0x8

    if-nez v7, :cond_c

    invoke-virtual {v4, v3, v15, v14, v9}, Lbn/e;->b(Lwm/j;ZZI)J

    move-result-wide v10

    long-to-int v10, v10

    iput v10, v5, Lbn/d;->M:I

    iget v4, v4, Lbn/e;->c:I

    iput v4, v5, Lbn/d;->N:I

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v10, v5, Lbn/d;->I:J

    iput v14, v5, Lbn/d;->G:I

    invoke-virtual {v8, v15}, Led3/a;->H(I)V

    :cond_c
    iget v4, v5, Lbn/d;->M:I

    invoke-virtual {v6, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lbn/c;

    if-nez v6, :cond_d

    iget v0, v5, Lbn/d;->N:I

    sub-int v0, v1, v0

    invoke-interface {v3, v0}, Lwm/j;->n(I)V

    iput v15, v5, Lbn/d;->G:I

    return-void

    :cond_d
    iget-object v4, v6, Lbn/c;->X:Lwm/s;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v5, Lbn/d;->G:I

    if-ne v4, v14, :cond_22

    const/4 v4, 0x3

    invoke-virtual {v5, v3, v4}, Lbn/d;->f(Lwm/j;I)V

    iget-object v10, v8, Led3/a;->a:[B

    aget-byte v10, v10, v12

    and-int/lit8 v10, v10, 0x6

    shr-int/2addr v10, v14

    const/16 v11, 0xff

    if-nez v10, :cond_10

    iput v14, v5, Lbn/d;->K:I

    iget-object v10, v5, Lbn/d;->L:[I

    if-nez v10, :cond_e

    new-array v10, v14, [I

    goto :goto_1

    :cond_e
    array-length v13, v10

    if-lt v13, v14, :cond_f

    goto :goto_1

    :cond_f
    array-length v10, v10

    mul-int/2addr v10, v12

    invoke-static {v10, v14}, Ljava/lang/Math;->max(II)I

    move-result v10

    new-array v10, v10, [I

    :goto_1
    iput-object v10, v5, Lbn/d;->L:[I

    iget v13, v5, Lbn/d;->N:I

    sub-int/2addr v1, v13

    sub-int/2addr v1, v4

    aput v1, v10, v15

    :goto_2
    move/from16 v17, v14

    move/from16 v19, v15

    goto/16 :goto_b

    :cond_10
    invoke-virtual {v5, v3, v13}, Lbn/d;->f(Lwm/j;I)V

    iget-object v7, v8, Led3/a;->a:[B

    aget-byte v7, v7, v4

    and-int/2addr v7, v11

    add-int/2addr v7, v14

    iput v7, v5, Lbn/d;->K:I

    move/from16 v17, v13

    iget-object v13, v5, Lbn/d;->L:[I

    if-nez v13, :cond_11

    new-array v13, v7, [I

    goto :goto_3

    :cond_11
    array-length v9, v13

    if-lt v9, v7, :cond_12

    goto :goto_3

    :cond_12
    array-length v9, v13

    mul-int/2addr v9, v12

    invoke-static {v9, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    new-array v13, v7, [I

    :goto_3
    iput-object v13, v5, Lbn/d;->L:[I

    if-ne v10, v12, :cond_13

    iget v4, v5, Lbn/d;->N:I

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x4

    iget v4, v5, Lbn/d;->K:I

    div-int/2addr v1, v4

    invoke-static {v13, v15, v4, v1}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_2

    :cond_13
    if-ne v10, v14, :cond_16

    move v4, v15

    move v7, v4

    move/from16 v13, v17

    :goto_4
    iget v9, v5, Lbn/d;->K:I

    sub-int/2addr v9, v14

    if-ge v4, v9, :cond_15

    iget-object v9, v5, Lbn/d;->L:[I

    aput v15, v9, v4

    :goto_5
    add-int/lit8 v9, v13, 0x1

    invoke-virtual {v5, v3, v9}, Lbn/d;->f(Lwm/j;I)V

    iget-object v10, v8, Led3/a;->a:[B

    aget-byte v10, v10, v13

    and-int/2addr v10, v11

    iget-object v13, v5, Lbn/d;->L:[I

    aget v16, v13, v4

    add-int v16, v16, v10

    aput v16, v13, v4

    if-eq v10, v11, :cond_14

    add-int v7, v7, v16

    add-int/lit8 v4, v4, 0x1

    move v13, v9

    goto :goto_4

    :cond_14
    move v13, v9

    goto :goto_5

    :cond_15
    iget-object v4, v5, Lbn/d;->L:[I

    iget v10, v5, Lbn/d;->N:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v13

    sub-int/2addr v1, v7

    aput v1, v4, v9

    goto :goto_2

    :cond_16
    if-ne v10, v4, :cond_21

    move v4, v15

    move v7, v4

    move/from16 v13, v17

    :goto_6
    iget v9, v5, Lbn/d;->K:I

    sub-int/2addr v9, v14

    if-ge v4, v9, :cond_1e

    iget-object v9, v5, Lbn/d;->L:[I

    aput v15, v9, v4

    add-int/lit8 v9, v13, 0x1

    invoke-virtual {v5, v3, v9}, Lbn/d;->f(Lwm/j;I)V

    iget-object v10, v8, Led3/a;->a:[B

    aget-byte v10, v10, v13

    if-eqz v10, :cond_1d

    move/from16 v17, v14

    move v10, v15

    :goto_7
    const/16 v14, 0x8

    if-ge v10, v14, :cond_19

    rsub-int/lit8 v14, v10, 0x7

    shl-int v14, v17, v14

    move/from16 v19, v15

    iget-object v15, v8, Led3/a;->a:[B

    aget-byte v15, v15, v13

    and-int/2addr v15, v14

    if-eqz v15, :cond_18

    add-int v15, v9, v10

    invoke-virtual {v5, v3, v15}, Lbn/d;->f(Lwm/j;I)V

    iget-object v12, v8, Led3/a;->a:[B

    aget-byte v12, v12, v13

    and-int/2addr v12, v11

    not-int v13, v14

    and-int/2addr v12, v13

    int-to-long v12, v12

    :goto_8
    if-ge v9, v15, :cond_17

    const/16 v18, 0x8

    shl-long v12, v12, v18

    iget-object v14, v8, Led3/a;->a:[B

    add-int/lit8 v20, v9, 0x1

    aget-byte v9, v14, v9

    and-int/2addr v9, v11

    move-wide/from16 v21, v12

    int-to-long v11, v9

    or-long v12, v21, v11

    move/from16 v9, v20

    const/16 v11, 0xff

    goto :goto_8

    :cond_17
    if-lez v4, :cond_1a

    mul-int/lit8 v10, v10, 0x7

    add-int/lit8 v10, v10, 0x6

    const-wide/16 v20, 0x1

    shl-long v9, v20, v10

    sub-long v9, v9, v20

    sub-long/2addr v12, v9

    goto :goto_9

    :cond_18
    add-int/lit8 v10, v10, 0x1

    move/from16 v15, v19

    const/16 v11, 0xff

    const/4 v12, 0x2

    goto :goto_7

    :cond_19
    move/from16 v19, v15

    const-wide/16 v12, 0x0

    move v15, v9

    :cond_1a
    :goto_9
    const-wide/32 v9, -0x80000000

    cmp-long v9, v12, v9

    if-ltz v9, :cond_1c

    const-wide/32 v9, 0x7fffffff

    cmp-long v9, v12, v9

    if-gtz v9, :cond_1c

    long-to-int v9, v12

    iget-object v10, v5, Lbn/d;->L:[I

    if-nez v4, :cond_1b

    goto :goto_a

    :cond_1b
    add-int/lit8 v11, v4, -0x1

    aget v11, v10, v11

    add-int/2addr v9, v11

    :goto_a
    aput v9, v10, v4

    add-int/2addr v7, v9

    add-int/lit8 v4, v4, 0x1

    move v13, v15

    move/from16 v14, v17

    move/from16 v15, v19

    const/16 v11, 0xff

    const/4 v12, 0x2

    goto/16 :goto_6

    :cond_1c
    const-string v0, "EBML lacing sample size out of range."

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_1d
    const/4 v1, 0x0

    const-string v0, "No valid varint length mask found"

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_1e
    move/from16 v17, v14

    move/from16 v19, v15

    iget-object v4, v5, Lbn/d;->L:[I

    iget v10, v5, Lbn/d;->N:I

    sub-int/2addr v1, v10

    sub-int/2addr v1, v13

    sub-int/2addr v1, v7

    aput v1, v4, v9

    :goto_b
    iget-object v1, v8, Led3/a;->a:[B

    aget-byte v4, v1, v19

    const/16 v18, 0x8

    shl-int/lit8 v4, v4, 0x8

    aget-byte v1, v1, v17

    const/16 v14, 0xff

    and-int/2addr v1, v14

    or-int/2addr v1, v4

    iget-wide v9, v5, Lbn/d;->B:J

    int-to-long v11, v1

    invoke-virtual {v5, v11, v12}, Lbn/d;->k(J)J

    move-result-wide v11

    add-long/2addr v11, v9

    iput-wide v11, v5, Lbn/d;->H:J

    iget v1, v6, Lbn/c;->d:I

    const/4 v4, 0x2

    if-eq v1, v4, :cond_20

    const/16 v7, 0xa3

    if-ne v0, v7, :cond_1f

    iget-object v1, v8, Led3/a;->a:[B

    aget-byte v1, v1, v4

    const/16 v8, 0x80

    and-int/2addr v1, v8

    if-ne v1, v8, :cond_1f

    goto :goto_c

    :cond_1f
    move/from16 v1, v19

    goto :goto_d

    :cond_20
    :goto_c
    move/from16 v1, v17

    :goto_d
    iput v1, v5, Lbn/d;->O:I

    iput v4, v5, Lbn/d;->G:I

    move/from16 v1, v19

    iput v1, v5, Lbn/d;->J:I

    :goto_e
    const/16 v7, 0xa3

    goto :goto_f

    :cond_21
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x24

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unexpected lacing value: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object v0

    throw v0

    :cond_22
    move/from16 v17, v14

    goto :goto_e

    :goto_f
    if-ne v0, v7, :cond_24

    :goto_10
    iget v0, v5, Lbn/d;->J:I

    iget v1, v5, Lbn/d;->K:I

    if-ge v0, v1, :cond_23

    iget-object v1, v5, Lbn/d;->L:[I

    aget v0, v1, v0

    invoke-virtual {v5, v3, v6, v0}, Lbn/d;->l(Lwm/j;Lbn/c;I)I

    move-result v10

    iget-wide v0, v5, Lbn/d;->H:J

    iget v4, v5, Lbn/d;->J:I

    iget v7, v6, Lbn/c;->e:I

    mul-int/2addr v4, v7

    div-int/lit16 v4, v4, 0x3e8

    int-to-long v7, v4

    add-long/2addr v7, v0

    iget v9, v5, Lbn/d;->O:I

    const/4 v11, 0x0

    invoke-virtual/range {v5 .. v11}, Lbn/d;->d(Lbn/c;JIII)V

    iget v0, v5, Lbn/d;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Lbn/d;->J:I

    goto :goto_10

    :cond_23
    const/4 v1, 0x0

    iput v1, v5, Lbn/d;->G:I

    return-void

    :cond_24
    :goto_11
    iget v0, v5, Lbn/d;->J:I

    iget v1, v5, Lbn/d;->K:I

    if-ge v0, v1, :cond_25

    iget-object v1, v5, Lbn/d;->L:[I

    aget v4, v1, v0

    invoke-virtual {v5, v3, v6, v4}, Lbn/d;->l(Lwm/j;Lbn/c;I)I

    move-result v4

    aput v4, v1, v0

    iget v0, v5, Lbn/d;->J:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v5, Lbn/d;->J:I

    goto :goto_11

    :cond_25
    :goto_12
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Lcq/g;

    invoke-interface {p1}, Lcq/g;->d()V

    return-void
.end method

.method public p()Lai/f;
    .locals 5

    new-instance v0, Lai/j;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lai/j;-><init>(IZ)V

    iget-object v1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lai/a;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lai/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_0

    new-instance v3, Ld1/j;

    invoke-direct {v3, v1, v2, v0}, Ld1/j;-><init>(JLai/j;)V

    goto :goto_0

    :cond_0
    new-instance v3, Lro/i;

    const/4 v1, 0x2

    invoke-direct {v3, v0, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    :goto_0
    new-instance v1, Lai/f;

    invoke-direct {v1, v3, v0}, Lai/f;-><init>(Lai/k;Lai/j;)V

    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "maxSizeBytesFactory == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public q()Lau/f;
    .locals 2

    new-instance v0, Lau/f;

    iget-object v1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v1, Lau/e;

    invoke-direct {v0, v1}, Lau/f;-><init>(Lau/e;)V

    return-object v0
.end method

.method public t(Lai/b;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public u(Lfs/p;)Ljava/math/BigInteger;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ljava/math/BigInteger;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "SecretKeyAccess required"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(IJ)V
    .locals 10

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lbn/d;

    const/16 v1, 0x5031

    const/16 v2, 0x37

    const/4 v3, 0x0

    const-string v4, " not supported"

    if-eq p1, v1, :cond_16

    const/16 v1, 0x5032

    const-wide/16 v5, 0x1

    if-eq p1, v1, :cond_14

    const/16 v1, 0x32

    const/4 v2, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    sparse-switch p1, :sswitch_data_0

    const/4 v1, -0x1

    packed-switch p1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->C:I

    return-void

    :pswitch_1
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->B:I

    return-void

    :pswitch_2
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput-boolean v9, p1, Lbn/c;->x:Z

    long-to-int p1, p2

    invoke-static {p1}, Lmo/b;->a(I)I

    move-result p1

    if-eq p1, v1, :cond_17

    iget-object p2, v0, Lbn/d;->u:Lbn/c;

    iput p1, p2, Lbn/c;->y:I

    return-void

    :pswitch_3
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    long-to-int p1, p2

    if-eq p1, v9, :cond_2

    const/16 p2, 0x10

    const/4 p3, 0x6

    if-eq p1, p2, :cond_1

    const/16 p2, 0x12

    const/4 v2, 0x7

    if-eq p1, p2, :cond_0

    if-eq p1, p3, :cond_2

    if-eq p1, v2, :cond_2

    move v7, v1

    goto :goto_0

    :cond_0
    move v7, v2

    goto :goto_0

    :cond_1
    move v7, p3

    :cond_2
    :goto_0
    if-eq v7, v1, :cond_17

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v7, p1, Lbn/c;->z:I

    return-void

    :pswitch_4
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    long-to-int p1, p2

    if-eq p1, v9, :cond_4

    if-eq p1, v8, :cond_3

    goto/16 :goto_1

    :cond_3
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v9, p1, Lbn/c;->A:I

    return-void

    :cond_4
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v8, p1, Lbn/c;->A:I

    return-void

    :sswitch_0
    iput-wide p2, v0, Lbn/d;->r:J

    return-void

    :sswitch_1
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->e:I

    return-void

    :sswitch_2
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    long-to-int p1, p2

    if-eqz p1, :cond_8

    if-eq p1, v9, :cond_7

    if-eq p1, v8, :cond_6

    if-eq p1, v7, :cond_5

    goto/16 :goto_1

    :cond_5
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v7, p1, Lbn/c;->r:I

    return-void

    :cond_6
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v8, p1, Lbn/c;->r:I

    return-void

    :cond_7
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v9, p1, Lbn/c;->r:I

    return-void

    :cond_8
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v2, p1, Lbn/c;->r:I

    return-void

    :sswitch_3
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->P:I

    return-void

    :sswitch_4
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput-wide p2, p1, Lbn/c;->S:J

    return-void

    :sswitch_5
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput-wide p2, p1, Lbn/c;->R:J

    return-void

    :sswitch_6
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->f:I

    return-void

    :sswitch_7
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    cmp-long p2, p2, v5

    if-nez p2, :cond_9

    move v2, v9

    :cond_9
    iput-boolean v2, p1, Lbn/c;->U:Z

    return-void

    :sswitch_8
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->p:I

    return-void

    :sswitch_9
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->q:I

    return-void

    :sswitch_a
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->o:I

    return-void

    :sswitch_b
    long-to-int p2, p2

    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    if-eqz p2, :cond_d

    if-eq p2, v9, :cond_c

    if-eq p2, v7, :cond_b

    const/16 p1, 0xf

    if-eq p2, p1, :cond_a

    goto/16 :goto_1

    :cond_a
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v7, p1, Lbn/c;->w:I

    return-void

    :cond_b
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v9, p1, Lbn/c;->w:I

    return-void

    :cond_c
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v8, p1, Lbn/c;->w:I

    return-void

    :cond_d
    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    iput v2, p1, Lbn/c;->w:I

    return-void

    :sswitch_c
    iget-wide v1, v0, Lbn/d;->q:J

    add-long/2addr p2, v1

    iput-wide p2, v0, Lbn/d;->x:J

    return-void

    :sswitch_d
    cmp-long p1, p2, v5

    if-nez p1, :cond_e

    goto/16 :goto_1

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v0, 0x38

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "AESSettingsCipherMode "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_e
    const-wide/16 v0, 0x5

    cmp-long p1, p2, v0

    if-nez p1, :cond_f

    goto/16 :goto_1

    :cond_f
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v0, 0x31

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "ContentEncAlgo "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_f
    cmp-long p1, p2, v5

    if-nez p1, :cond_10

    goto/16 :goto_1

    :cond_10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "EBMLReadVersion "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_10
    cmp-long p1, p2, v5

    if-ltz p1, :cond_11

    const-wide/16 v0, 0x2

    cmp-long p1, p2, v0

    if-gtz p1, :cond_11

    goto/16 :goto_1

    :cond_11
    new-instance p1, Ljava/lang/StringBuilder;

    const/16 v0, 0x35

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "DocTypeReadVersion "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_11
    const-wide/16 v5, 0x3

    cmp-long p1, p2, v5

    if-nez p1, :cond_12

    goto/16 :goto_1

    :cond_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "ContentCompAlgo "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_12
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->g:I

    return-void

    :sswitch_13
    iput-boolean v9, v0, Lbn/d;->Q:Z

    return-void

    :sswitch_14
    iget-boolean v1, v0, Lbn/d;->E:Z

    if-nez v1, :cond_17

    invoke-virtual {v0, p1}, Lbn/d;->a(I)V

    iget-object p1, v0, Lbn/d;->D:Llo/k;

    invoke-virtual {p1, p2, p3}, Llo/k;->a(J)V

    iput-boolean v9, v0, Lbn/d;->E:Z

    return-void

    :sswitch_15
    long-to-int p1, p2

    iput p1, v0, Lbn/d;->P:I

    return-void

    :sswitch_16
    invoke-virtual {v0, p2, p3}, Lbn/d;->k(J)J

    move-result-wide p1

    iput-wide p1, v0, Lbn/d;->B:J

    return-void

    :sswitch_17
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->c:I

    return-void

    :sswitch_18
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->n:I

    return-void

    :sswitch_19
    invoke-virtual {v0, p1}, Lbn/d;->a(I)V

    iget-object p1, v0, Lbn/d;->C:Llo/k;

    invoke-virtual {v0, p2, p3}, Lbn/d;->k(J)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Llo/k;->a(J)V

    return-void

    :sswitch_1a
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->m:I

    return-void

    :sswitch_1b
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->O:I

    return-void

    :sswitch_1c
    invoke-virtual {v0, p2, p3}, Lbn/d;->k(J)J

    move-result-wide p1

    iput-wide p1, v0, Lbn/d;->I:J

    return-void

    :sswitch_1d
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    cmp-long p2, p2, v5

    if-nez p2, :cond_13

    move v2, v9

    :cond_13
    iput-boolean v2, p1, Lbn/c;->V:Z

    return-void

    :sswitch_1e
    invoke-virtual {v0, p1}, Lbn/d;->c(I)V

    iget-object p1, v0, Lbn/d;->u:Lbn/c;

    long-to-int p2, p2

    iput p2, p1, Lbn/c;->d:I

    return-void

    :cond_14
    cmp-long p1, p2, v5

    if-nez p1, :cond_15

    goto :goto_1

    :cond_15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "ContentEncodingScope "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :cond_16
    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_18

    :cond_17
    :goto_1
    return-void

    :cond_18
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "ContentEncodingOrder "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p1

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x83 -> :sswitch_1e
        0x88 -> :sswitch_1d
        0x9b -> :sswitch_1c
        0x9f -> :sswitch_1b
        0xb0 -> :sswitch_1a
        0xb3 -> :sswitch_19
        0xba -> :sswitch_18
        0xd7 -> :sswitch_17
        0xe7 -> :sswitch_16
        0xee -> :sswitch_15
        0xf1 -> :sswitch_14
        0xfb -> :sswitch_13
        0x41e7 -> :sswitch_12
        0x4254 -> :sswitch_11
        0x4285 -> :sswitch_10
        0x42f7 -> :sswitch_f
        0x47e1 -> :sswitch_e
        0x47e8 -> :sswitch_d
        0x53ac -> :sswitch_c
        0x53b8 -> :sswitch_b
        0x54b0 -> :sswitch_a
        0x54b2 -> :sswitch_9
        0x54ba -> :sswitch_8
        0x55aa -> :sswitch_7
        0x55ee -> :sswitch_6
        0x56aa -> :sswitch_5
        0x56bb -> :sswitch_4
        0x6264 -> :sswitch_3
        0x7671 -> :sswitch_2
        0x23e383 -> :sswitch_1
        0x2ad7b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x55b9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w(Landroid/content/Context;D)V
    .locals 2

    const-wide/16 v0, 0x0

    cmpg-double v0, v0, p2

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double v0, p2, v0

    if-gtz v0, :cond_0

    new-instance v0, Lai/a;

    invoke-direct {v0, p1, p2, p3}, Lai/a;-><init>(Landroid/content/Context;D)V

    iput-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "percent must be in the range [0.0, 1.0]."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public x(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Ld9/a0;

    iget-object v0, v0, Ld9/a0;->d1:Lio/sentry/internal/debugmeta/c;

    iget-object v1, v0, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ld9/h;

    const/16 v3, 0x8

    invoke-direct {v2, v0, p1, v3}, Ld9/h;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public y(Lq30/w0;)V
    .locals 2

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lev/i;

    iput-object p1, v0, Lev/i;->a:Ljava/lang/Object;

    iget-object p1, v0, Lev/i;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcp/f;

    invoke-interface {v1}, Lcp/f;->b()V

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lev/i;->c:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedList;

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    const/4 p1, 0x0

    iput-object p1, v0, Lev/i;->b:Ljava/lang/Object;

    return-void
.end method

.method public z(FFFFF)V
    .locals 3

    iget-object v0, p0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Lc23/o;

    invoke-virtual {v0}, Lc23/o;->d()F

    move-result v1

    iget v2, v0, Lc23/o;->F:F

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {v1, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    iget-object p1, v0, Lc23/o;->M:Landroid/graphics/Matrix;

    invoke-virtual {p1, p4, p5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v0}, Lc23/o;->a()V

    return-void
.end method
