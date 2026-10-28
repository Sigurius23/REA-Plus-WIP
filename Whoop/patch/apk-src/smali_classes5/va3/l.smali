.class public abstract Lva3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;)Lva3/c;
    .locals 2

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->h:Lva3/e;

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static final b(Ljava/lang/String;)Lva3/c;
    .locals 2

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->a:Lva3/e;

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/String;)Lva3/c;
    .locals 2

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->c:Lva3/e;

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static final d(Ljava/util/LinkedHashMap;)V
    .locals 3

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final e(Lva3/h;)Lva3/c;
    .locals 3

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->l:Lva3/c;

    iget-object v2, v1, Lva3/c;->a:Lva3/e;

    invoke-virtual {p0}, Lva3/h;->c()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1}, Lva3/c;->f()Lva3/h;

    move-result-object v1

    invoke-virtual {v1}, Lva3/h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v2, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static final f(Ljava/lang/String;)Lva3/c;
    .locals 2

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->b:Lva3/e;

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static final g(Lva3/c;)Lva3/c;
    .locals 3

    new-instance v0, Lva3/c;

    sget-object v1, Lva3/k;->a:Lva3/e;

    sget-object v1, Lva3/k;->a:Lva3/e;

    invoke-virtual {p0}, Lva3/c;->f()Lva3/h;

    move-result-object p0

    invoke-virtual {p0}, Lva3/h;->c()Ljava/lang/String;

    move-result-object p0

    const-string v2, "U"

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0
.end method

.method public static h(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    instance-of p2, p1, Ljava/lang/CharSequence;

    :goto_0
    if-eqz p2, :cond_2

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void

    :cond_2
    instance-of p2, p1, Ljava/lang/Character;

    if-eqz p2, :cond_3

    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public static final i(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    .locals 0

    if-eqz p0, :cond_1

    if-nez p1, :cond_0

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public static j()Z
    .locals 6

    const-string v0, "delivery_metrics_exported_to_big_query_enabled"

    const/4 v1, 0x0

    :try_start_0
    invoke-static {}, Ldt/g;->b()Ldt/g;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object v2

    invoke-virtual {v2}, Ldt/g;->a()V

    iget-object v2, v2, Ldt/g;->a:Landroid/content/Context;

    const-string v3, "com.google.firebase.messaging"

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "export_to_big_query"

    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x80

    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v2, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    return v0

    :catch_0
    :cond_1
    return v1

    :catch_1
    const-string v0, "FirebaseMessaging"

    const-string v2, "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return v1
.end method

.method public static final k(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/b;Ljava/lang/String;)Lwc3/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->findPolymorphicSerializerOrNull(Lzc3/b;Ljava/lang/String;)Lwc3/b;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getBaseClass()Lj93/d;

    move-result-object p0

    invoke-static {p2, p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializerKt;->throwSubtypeNotRegistered(Ljava/lang/String;Lj93/d;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final l(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/e;Ljava/lang/Object;)Lwc3/j;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->findPolymorphicSerializerOrNull(Lzc3/e;Ljava/lang/Object;)Lwc3/j;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getBaseClass()Lj93/d;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializerKt;->throwSubtypeNotRegistered(Lj93/d;Lj93/d;)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static m(IIII)J
    .locals 4

    const v0, 0x3fffe

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    const v1, 0x7fffffff

    if-ne p3, v1, :cond_0

    move p3, v1

    goto :goto_0

    :cond_0
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    :goto_0
    if-ne p3, v1, :cond_1

    move v2, p2

    goto :goto_1

    :cond_1
    move v2, p3

    :goto_1
    const/16 v3, 0x1fff

    if-ge v2, v3, :cond_2

    goto :goto_2

    :cond_2
    const/16 v0, 0x7fff

    if-ge v2, v0, :cond_3

    const v0, 0xfffe

    goto :goto_2

    :cond_3
    const v0, 0xffff

    if-ge v2, v0, :cond_4

    const/16 v0, 0x7ffe

    goto :goto_2

    :cond_4
    const v0, 0x3ffff

    if-ge v2, v0, :cond_6

    const/16 v0, 0x1ffe

    :goto_2
    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_3
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    move-result p0

    invoke-static {p0, v1, p2, p3}, Ly3/b;->a(IIII)J

    move-result-wide p0

    return-wide p0

    :cond_6
    invoke-static {v2}, Ly3/b;->l(I)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static n(IIII)J
    .locals 4

    const v0, 0x3fffe

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    const v1, 0x7fffffff

    if-ne p1, v1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    if-ne p1, v1, :cond_1

    move v2, p0

    goto :goto_1

    :cond_1
    move v2, p1

    :goto_1
    const/16 v3, 0x1fff

    if-ge v2, v3, :cond_2

    goto :goto_2

    :cond_2
    const/16 v0, 0x7fff

    if-ge v2, v0, :cond_3

    const v0, 0xfffe

    goto :goto_2

    :cond_3
    const v0, 0xffff

    if-ge v2, v0, :cond_4

    const/16 v0, 0x7ffe

    goto :goto_2

    :cond_4
    const v0, 0x3ffff

    if-ge v2, v0, :cond_6

    const/16 v0, 0x1ffe

    :goto_2
    if-ne p3, v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_3
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p0, p1, p2, v1}, Ly3/b;->a(IIII)J

    move-result-wide p0

    return-wide p0

    :cond_6
    invoke-static {v2}, Ly3/b;->l(I)Ljava/lang/Void;

    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static o(Landroid/content/Intent;)V
    .locals 9

    invoke-static {p0}, Lva3/l;->q(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "_nr"

    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-static {v1, v0}, Lva3/l;->p(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const-string v1, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lva3/l;->j()Z

    move-result v1

    goto :goto_1

    :cond_2
    :goto_0
    move v1, v0

    :goto_1
    if-eqz v1, :cond_18

    sget-object v1, Lcom/google/firebase/messaging/FirebaseMessaging;->l:Lst/a;

    invoke-interface {v1}, Lst/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldm/e;

    const-string v2, "FirebaseMessaging"

    if-nez v1, :cond_3

    const-string p0, "TransportFactory is null. Skip exporting message delivery metrics to Big Query"

    invoke-static {v2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    const/4 v3, 0x0

    if-nez p0, :cond_4

    goto/16 :goto_7

    :cond_4
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_5

    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_5
    invoke-static {}, Lau/e;->a()Lau/a;

    move-result-object v5

    const-string v6, "google.ttl"

    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/Integer;

    if-eqz v7, :cond_6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_6
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_7

    :try_start_0
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Invalid TTL: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_2
    invoke-virtual {v5, v0}, Lau/a;->m(I)V

    invoke-virtual {v5}, Lau/a;->e()V

    const-string v0, "google.to"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_3

    :cond_8
    :try_start_1
    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_7

    :try_start_2
    sget-object v6, Ltt/c;->m:Ljava/lang/Object;

    const-class v6, Ltt/d;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->d:Lgt/g;

    invoke-interface {v0, v6}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltt/c;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_6

    :try_start_3
    invoke-virtual {v0}, Ltt/c;->c()Lcq/u;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_7

    :goto_3
    invoke-virtual {v5, v0}, Lau/a;->f(Ljava/lang/String;)V

    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object v0

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v0, Ldt/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lau/a;->i(Ljava/lang/String;)V

    invoke-virtual {v5}, Lau/a;->k()V

    invoke-static {v4}, Lzd3/x;->n(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lau/c;->z:Lau/c;

    goto :goto_4

    :cond_9
    sget-object v0, Lau/c;->y:Lau/c;

    :goto_4
    invoke-virtual {v5, v0}, Lau/a;->h(Lau/c;)V

    const-string v0, "google.message_id"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    const-string v0, "message_id"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_a
    if-eqz v0, :cond_b

    invoke-virtual {v5, v0}, Lau/a;->g(Ljava/lang/String;)V

    :cond_b
    const-string v0, "from"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    const-string v6, "/topics/"

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_c

    move-object v3, v0

    :cond_c
    if-eqz v3, :cond_d

    invoke-virtual {v5, v3}, Lau/a;->l(Ljava/lang/String;)V

    :cond_d
    const-string v0, "collapse_key"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v5, v0}, Lau/a;->c(Ljava/lang/String;)V

    :cond_e
    const-string v0, "google.c.a.m_l"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v5, v0}, Lau/a;->b(Ljava/lang/String;)V

    :cond_f
    const-string v0, "google.c.a.c_l"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v5, v0}, Lau/a;->d(Ljava/lang/String;)V

    :cond_10
    const-string v0, "google.c.sender.id"

    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    const-wide/16 v6, 0x0

    if-eqz v3, :cond_11

    :try_start_4
    invoke-virtual {v4, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    const-string v3, "error parsing project number"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_11
    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object v0

    iget-object v3, v0, Ldt/g;->c:Ldt/i;

    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v4, v3, Ldt/i;->e:Ljava/lang/String;

    if-eqz v4, :cond_12

    :try_start_5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_6

    :catch_2
    move-exception v4

    const-string v8, "error parsing sender ID"

    invoke-static {v2, v8, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_12
    invoke-virtual {v0}, Ldt/g;->a()V

    iget-object v0, v3, Ldt/i;->b:Ljava/lang/String;

    const-string v3, "1:"

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "error parsing app ID"

    if-nez v3, :cond_13

    :try_start_6
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_6

    :catch_3
    move-exception v0

    invoke-static {v2, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    :cond_13
    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v3, v0

    const/4 v8, 0x2

    if-ge v3, v8, :cond_14

    :goto_5
    move-wide v3, v6

    goto :goto_6

    :cond_14
    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_5

    :cond_15
    :try_start_7
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_4

    goto :goto_6

    :catch_4
    move-exception v0

    invoke-static {v2, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_5

    :goto_6
    cmp-long v0, v3, v6

    if-lez v0, :cond_16

    invoke-virtual {v5, v3, v4}, Lau/a;->j(J)V

    :cond_16
    invoke-virtual {v5}, Lau/a;->a()Lau/e;

    move-result-object v3

    :goto_7
    if-nez v3, :cond_17

    goto :goto_9

    :cond_17
    :try_start_8
    const-string v0, "google.product_id"

    const v4, 0x6ab2d1f

    invoke-virtual {p0, v0, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Ldm/b;->a(Ljava/lang/Integer;)Ldm/b;

    move-result-object p0

    invoke-static {}, Ldm/c;->a()Ldm/c;

    move-result-object v0

    new-instance v4, Lux/f0;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lux/f0;-><init>(I)V

    check-cast v1, Lgm/p;

    invoke-virtual {v1, v0, v4}, Lgm/p;->a(Ldm/c;Lux/f0;)La33/d;

    move-result-object v0

    invoke-static {}, Lau/f;->a()Lro/i;

    move-result-object v1

    invoke-virtual {v1, v3}, Lro/i;->C(Lau/e;)V

    invoke-virtual {v1}, Lro/i;->q()Lau/f;

    move-result-object v1

    invoke-static {v1, p0}, Ldm/a;->a(Lau/f;Ldm/b;)Ldm/a;

    move-result-object p0

    invoke-virtual {v0, p0}, La33/d;->O(Ldm/a;)V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_9

    :catch_5
    move-exception p0

    const-string v0, "Failed to send big query analytics payload."

    invoke-static {v2, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_9

    :catch_6
    move-exception p0

    goto :goto_8

    :catch_7
    move-exception p0

    :goto_8
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_18
    :goto_9
    return-void
.end method

.method public static p(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 5

    const-string v0, "FirebaseMessaging"

    :try_start_0
    invoke-static {}, Ldt/g;->b()Ldt/g;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez p0, :cond_0

    new-instance p0, Landroid/os/Bundle;

    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "google.c.a.c_id"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "_nmid"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v2, "google.c.a.c_l"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "_nmn"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-string v2, "google.c.a.m_l"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "label"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string v2, "google.c.a.m_c"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "message_channel"

    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string v2, "from"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    const-string v4, "/topics/"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_6

    const-string v4, "_nt"

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    const-string v2, "google.c.a.ts"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    :try_start_1
    const-string v4, "_nmt"

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v4, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const-string v4, "Error while parsing timestamp in GCM event"

    invoke-static {v0, v4, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_7
    :goto_1
    const-string v2, "google.c.a.udt"

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_8
    if-eqz v3, :cond_9

    :try_start_2
    const-string v2, "_ndt"

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    :catch_1
    move-exception v2

    const-string v3, "Error while parsing use_device_time in GCM event"

    invoke-static {v0, v3, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_9
    :goto_2
    invoke-static {p0}, Lzd3/x;->n(Landroid/os/Bundle;)Z

    move-result p0

    if-eqz p0, :cond_a

    const-string p0, "display"

    goto :goto_3

    :cond_a
    const-string p0, "data"

    :goto_3
    const-string v2, "_nr"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    const-string v2, "_nf"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    const-string v2, "_nmc"

    invoke-virtual {v1, v2, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_c
    const/4 p0, 0x3

    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_d

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v2, "Logging to scion event="

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " scionPayload="

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    invoke-static {}, Ldt/g;->b()Ldt/g;

    move-result-object p0

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object p0, p0, Ldt/g;->d:Lgt/g;

    const-class p1, Let/a;

    invoke-interface {p0, p1}, Lgt/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lr;->t(Ljava/lang/Object;)V

    const-string p0, "Unable to log event: analytics library is missing"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_2
    const-string p0, "Default FirebaseApp has not been initialized. Skip logging event to GA."

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static q(Landroid/content/Intent;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const-string v1, "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"

    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    if-nez p0, :cond_1

    return v0

    :cond_1
    const-string v0, "google.c.a.e"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    :goto_0
    return v0
.end method
