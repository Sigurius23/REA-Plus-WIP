.class public final Lsr/c;
.super Lxr/u;
.source "SourceFile"


# instance fields
.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/room/b0;Landroid/os/IBinder;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lsr/c;->x:I

    .line 1
    iput-object p2, p0, Lsr/c;->y:Ljava/lang/Object;

    iput-object p1, p0, Lsr/c;->z:Ljava/lang/Object;

    invoke-direct {p0}, Lxr/u;-><init>()V

    return-void
.end method

.method public constructor <init>(Lsr/h;Lcq/i;Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lsr/c;->x:I

    .line 2
    iput-object p3, p0, Lsr/c;->y:Ljava/lang/Object;

    iput-object p1, p0, Lsr/c;->z:Ljava/lang/Object;

    invoke-direct {p0, p2}, Lxr/u;-><init>(Lcq/i;)V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 13

    iget v0, p0, Lsr/c;->x:I

    iget-object v1, p0, Lsr/c;->y:Ljava/lang/Object;

    iget-object v2, p0, Lsr/c;->z:Ljava/lang/Object;

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast v2, Landroidx/room/b0;

    iget-object v0, v2, Landroidx/room/b0;->x:Ljava/lang/Object;

    check-cast v0, Lxr/b;

    iget-object v2, v0, Lxr/b;->i:Lng3/o;

    check-cast v1, Landroid/os/IBinder;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lxr/q;->g:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v2, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    invoke-interface {v1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v4, v2, Lxr/r;

    if-eqz v4, :cond_1

    move-object v1, v2

    check-cast v1, Lxr/r;

    goto :goto_0

    :cond_1
    new-instance v2, Lxr/p;

    invoke-direct {v2, v1}, Lxr/p;-><init>(Landroid/os/IBinder;)V

    move-object v1, v2

    :goto_0
    iput-object v1, v0, Lxr/b;->n:Lxr/r;

    iget-object v1, v0, Lxr/b;->b:Lxr/t;

    const-string v2, "linkToDeath"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v4}, Lxr/t;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :try_start_0
    iget-object v2, v0, Lxr/b;->n:Lxr/r;

    check-cast v2, Lxr/p;

    iget-object v2, v2, Lxr/p;->f:Landroid/os/IBinder;

    iget-object v4, v0, Lxr/b;->k:Lvr/f;

    invoke-interface {v2, v4, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    new-array v4, v3, [Ljava/lang/Object;

    const-string v5, "linkToDeath failed"

    invoke-virtual {v1, v2, v5, v4}, Lxr/t;->a(Landroid/os/RemoteException;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    iput-boolean v3, v0, Lxr/b;->g:Z

    iget-object v1, v0, Lxr/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_2

    :cond_2
    iget-object v0, v0, Lxr/b;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    :pswitch_0
    check-cast v1, Landroid/content/Context;

    check-cast v2, Lsr/h;

    iget-object v0, v2, Lsr/h;->c:Lcq/i;

    sget-object v2, Lxr/c;->a:Lxr/t;

    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.android.vending"

    const/16 v4, 0x40

    invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v2, :cond_a

    iget-boolean v2, v2, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-eqz v2, :cond_a

    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    sget-object v4, Lxr/c;->a:Lxr/t;

    const/4 v5, 0x5

    const-string v6, "PlayCore"

    if-eqz v2, :cond_9

    array-length v7, v2

    if-nez v7, :cond_3

    goto/16 :goto_6

    :cond_3
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move v9, v3

    :goto_3
    if-ge v9, v7, :cond_7

    aget-object v10, v2, v9

    invoke-virtual {v10}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v10

    :try_start_2
    const-string v11, "SHA-256"

    invoke-static {v11}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v11
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_1

    invoke-virtual {v11, v10}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v11}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v10

    const/16 v11, 0xb

    invoke-static {v10, v11}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v10

    goto :goto_4

    :catch_1
    const-string v10, ""

    :goto_4
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v11, "8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    sget-object v11, Landroid/os/Build;->TAGS:Ljava/lang/String;

    const-string v12, "dev-keys"

    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_4

    const-string v12, "test-keys"

    invoke-virtual {v11, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_5

    :cond_4
    const-string v11, "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_6
    iget v3, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    goto :goto_7

    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    const-string v7, ", "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Play Store package certs are not valid. Found these sha256 certs: ["

    const-string v7, "]."

    invoke-static {v2, v1, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_a

    iget-object v4, v4, Lxr/t;->a:Ljava/lang/String;

    invoke-static {v4, v1, v2}, Lxr/t;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_7

    :cond_9
    :goto_6
    new-array v1, v3, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v4, Lxr/t;->a:Ljava/lang/String;

    const-string v4, "Play Store package is not signed -- possibly self-built package. Could not verify."

    invoke-static {v2, v4, v1}, Lxr/t;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :catch_2
    :cond_a
    :goto_7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcq/i;->d(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
