.class public final Lcom/iterable/iterableapi/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final a:Landroid/content/SharedPreferences;

.field public final b:Lcom/iterable/iterableapi/z;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/iterable/iterableapi/o1;->d:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "com.iterable.iterableapi"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "getSharedPreferences(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/o1;->a:Landroid/content/SharedPreferences;

    const-string v2, "iterable-encryption-enabled"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/iterable/iterableapi/o1;->c:Z

    const-string v3, "IterableKeychain"

    if-nez v2, :cond_0

    const-string p1, "SharedPreferences being used without encryption"

    invoke-static {v3, p1}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    new-instance v2, Lcom/iterable/iterableapi/z;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/iterable/iterableapi/k2;->d()Ljava/security/KeyStore;

    move-result-object v4

    const-string v5, "iterable_encryption_key"

    invoke-virtual {v4, v5}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v4, :cond_2

    :try_start_1
    invoke-static {}, Lcom/iterable/iterableapi/k2;->d()Ljava/security/KeyStore;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/KeyStore;->getType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "AndroidKeyStore"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {}, Lcom/iterable/iterableapi/z;->a()Ll83/a0;

    move-result-object v4

    if-eqz v4, :cond_1

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/iterable/iterableapi/z;->b()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_0
    :try_start_2
    const-string v0, "IterableDataEncryptor"

    const-string v1, "Failed to generate key"

    invoke-static {v0, v1, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    throw p1

    :cond_2
    :goto_1
    iput-object v2, p0, Lcom/iterable/iterableapi/o1;->b:Lcom/iterable/iterableapi/z;

    const-string v2, "SharedPreferences being used with encryption"

    invoke-static {v3, v2}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    new-instance v2, Laa3/i1;

    invoke-direct {v2, p1, v0, p0}, Laa3/i1;-><init>(Landroid/content/Context;Landroid/content/SharedPreferences;Lcom/iterable/iterableapi/o1;)V

    const-string p1, "iterable-encrypted-migration-completed"

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_3

    new-instance p1, La0/a1;

    const/16 v0, 0xd

    invoke-direct {p1, p0, v0}, La0/a1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v2, Laa3/i1;->e:Ljava/lang/Object;

    invoke-virtual {v2}, Laa3/i1;->l()V

    const-string p1, "Migration completed"

    invoke-static {v3, p1}, Ldt/b;->Z(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-void

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_3
    return-void

    :goto_2
    const-string v0, "Migration failed, clearing data"

    invoke-static {v3, v0, p1}, Ldt/b;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/o1;->a()V

    return-void

    :catch_2
    move-exception p1

    const-string v0, "Failed to initialize encryption, falling back to plain text"

    invoke-static {v3, v0, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-virtual {p0}, Lcom/iterable/iterableapi/o1;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    const-string v0, "IterableKeychain"

    const-string v1, "Decryption failed, permanently disabling encryption for this device. Please login again."

    invoke-static {v0, v1}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/iterable/iterableapi/o1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-email"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-user-id"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-unknown-user-id"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-auth-token"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "iterable-encryption-enabled"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-boolean v2, p0, Lcom/iterable/iterableapi/o1;->c:Z

    return-void
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "_plaintext"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/iterable/iterableapi/o1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iget-boolean v1, p0, Lcom/iterable/iterableapi/o1;->c:Z

    const/4 v3, 0x0

    if-nez v1, :cond_0

    if-eqz v0, :cond_3

    invoke-interface {v2, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz v0, :cond_1

    invoke-interface {v2, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {v2, p1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/iterable/iterableapi/o1;->b:Lcom/iterable/iterableapi/z;

    if-eqz v0, :cond_3

    new-instance v1, Lcom/iterable/iterableapi/m1;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v0, p1}, Lcom/iterable/iterableapi/m1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Lcom/iterable/iterableapi/o1;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1f4

    invoke-interface {p1, v1, v2, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :cond_3
    :goto_0
    return-object v3

    :catch_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/o1;->a()V

    return-object v3
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-object v0, p0, Lcom/iterable/iterableapi/o1;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "_plaintext"

    if-nez p2, :cond_0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :cond_0
    iget-boolean v2, p0, Lcom/iterable/iterableapi/o1;->c:Z

    const/4 v3, 0x1

    if-nez v2, :cond_1

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :cond_1
    :try_start_0
    iget-object v2, p0, Lcom/iterable/iterableapi/o1;->b:Lcom/iterable/iterableapi/z;

    if-eqz v2, :cond_2

    new-instance v4, Lcom/iterable/iterableapi/n1;

    const/4 v5, 0x0

    invoke-direct {v4, v5, v2, p2}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Lcom/iterable/iterableapi/o1;->d:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v2, v4}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1f4

    invoke-interface {v2, v5, v6, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0, p1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-void

    :catch_0
    invoke-virtual {p0}, Lcom/iterable/iterableapi/o1;->a()V

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
