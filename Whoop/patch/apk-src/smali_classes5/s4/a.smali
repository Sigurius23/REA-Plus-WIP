.class public abstract Ls4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static a(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;
    .locals 6

    const-string v0, "e"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_0

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :cond_1
    const-string p1, "Stripe"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/stripe/android/core/exception/APIConnectionException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, ": "

    const-string v3, ". Please check your internet connection and try again. If this problem persists, you should check Stripe\'s service status at https://status.stripe.com/, or let us know at support@stripe.com."

    const-string v4, "IOException during API request to "

    invoke-static {v4, p1, v2, v1, v3}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lcom/stripe/android/core/exception/APIConnectionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lur/d;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p0, v0

    :cond_0
    new-instance v0, Lur/d;

    new-instance v1, Lur/g;

    invoke-direct {v1, p0}, Lur/g;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lur/d;-><init>(Lur/g;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/String;Lcom/squareup/wire/x;Ljava/lang/ClassLoader;I)Ltx/h;
    .locals 15

    and-int/lit8 v0, p4, 0x8

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    move-object v6, v0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    const-string v0, "$Builder"

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1
    instance-of v1, v0, Ll83/m;

    const/4 v7, 0x0

    if-eqz v1, :cond_1

    move-object v0, v7

    :cond_1
    check-cast v0, Ljava/lang/Class;

    if-nez v0, :cond_2

    const-class v0, Lcom/squareup/wire/g;

    :cond_2
    move-object v5, v0

    new-instance v11, Lr5/c;

    const/16 v0, 0x8

    invoke-direct {v11, v0, v5, p0}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    const-string v1, "messageType.declaredFields"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v9, v8

    const/4 v1, 0x0

    move v10, v1

    :goto_2
    if-ge v10, v9, :cond_6

    aget-object v4, v8, v10

    const-class v1, Lcom/squareup/wire/a0;

    invoke-virtual {v4, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/squareup/wire/a0;

    if-eqz v2, :cond_3

    invoke-interface {v2}, Lcom/squareup/wire/a0;->tag()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-instance v1, Ltx/b;

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ltx/b;-><init>(Lcom/squareup/wire/a0;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/ClassLoader;)V

    invoke-interface {v0, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Lcom/squareup/wire/n;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "messageField.name"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "_keys"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v1, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.collections.Set<com.squareup.wire.OneOf.Key<*>>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0

    :cond_5
    :goto_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_6
    new-instance v1, Ltx/h;

    new-instance v8, Lb30/m;

    invoke-static {p0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v12

    const-string p0, "unmodifiableMap(fields)"

    invoke-static {v12, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p1

    move-object/from16 v14, p2

    move-object v10, v5

    invoke-direct/range {v8 .. v14}, Lb30/m;-><init>(Lj93/d;Ljava/lang/Class;Lr5/c;Ljava/util/Map;Ljava/lang/String;Lcom/squareup/wire/x;)V

    invoke-direct {v1, v8}, Ltx/h;-><init>(Lb30/m;)V

    return-object v1
.end method

.method public static d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;
    .locals 2

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    new-instance p2, Ln23/c;

    iget-object v0, p0, Lu33/e;->x:Ljava/lang/String;

    iget p0, p0, Lu33/e;->w:I

    const/4 v1, -0x1

    invoke-direct {p2, v0, p0, v1, p1}, Ln23/c;-><init>(Ljava/lang/String;IILjava/lang/Throwable;)V

    return-object p2
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0}, Lbp/c;->a(Landroid/content/Context;)Laj/d;

    move-result-object p0

    iget-object p0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p0, Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 v0, 0x80

    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    const/4 p1, -0x1

    if-eqz p0, :cond_1

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz p0, :cond_1

    const-string v0, "com.google.android.gms.version"

    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0

    :cond_1
    :goto_1
    return p1
.end method

.method public static final f(La3/x0;)La3/x0;
    .locals 2

    iget-object p0, p0, La3/x0;->O:Landroidx/compose/ui/node/NodeCoordinator;

    iget-object p0, p0, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    :goto_0
    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, La3/n0;->G:La3/n0;

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, v0, La3/n0;->G:La3/n0;

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, La3/n0;->G()La3/n0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, La3/n0;->G:La3/n0;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p0, p0, La3/n0;->e0:La3/l1;

    iget-object p0, p0, La3/l1;->e:Ljava/lang/Object;

    check-cast p0, Landroidx/compose/ui/node/NodeCoordinator;

    invoke-virtual {p0}, Landroidx/compose/ui/node/NodeCoordinator;->e1()La3/x0;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static g(Ljava/lang/String;)V
    .locals 5

    sget-object v0, Lhj/u;->w:Lhj/u;

    invoke-virtual {v0}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "PlayStoreHandler: No current activity available for app review."

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {v0}, Ls4/a;->b(Landroid/content/Context;)Lur/d;

    move-result-object v1

    invoke-virtual {v1}, Lur/d;->b()Lcq/u;

    move-result-object v2

    new-instance v3, Lbc/i;

    const/16 v4, 0x10

    invoke-direct {v3, v1, v0, p0, v4}, Lbc/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lcq/u;->addOnCompleteListener(Lcq/d;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static h(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 7

    const-string v0, "PlayStoreHandler:Play Store listing opened via "

    const-string v1, "PlayStoreHandler: Play Store listing opened via "

    new-instance v2, Landroid/content/Intent;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x1

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    const-string v5, "market://details?id=%s"

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v2, v5, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    new-instance v3, Landroid/content/Intent;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v6, "https://play.google.com/store/apps/details?id=%s"

    invoke-static {v6, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v3, v5, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/16 v4, 0x2e

    :try_start_0
    invoke-virtual {p0, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object v5, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :try_start_1
    invoke-virtual {p0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    sget-object p0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/crypto/tink/internal/l0;->a0([Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    sget-object p0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v0, "PlayStoreHandler: Failed to open Play Store for package: "

    invoke-static {v4, v0, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static i(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;
    .locals 6

    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_0

    if-nez p3, :cond_0

    invoke-static {p0}, Ls4/c;->obtainAndCheckReceiverPermission(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    move-result-object p0

    return-object p0

    :cond_0
    and-int/lit8 v5, p5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lw63/a;Lx63/f;)V
    .locals 1

    const-string v0, "pool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lw63/a;->g()Lw63/a;

    move-result-object v0

    invoke-virtual {p0, p1}, Lw63/a;->j(Lx63/f;)V

    move-object p0, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final k(Lw63/a;)J
    .locals 4

    const-wide/16 v0, 0x0

    :cond_0
    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    iget v3, p0, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    add-long/2addr v0, v2

    invoke-virtual {p0}, Lw63/a;->h()Lw63/a;

    move-result-object p0

    if-nez p0, :cond_0

    return-wide v0
.end method

.method public static l(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static final n(Lio/getstream/video/android/core/filter/FilterObject;)Ljava/util/Map;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lw33/c;

    if-eqz v0, :cond_0

    check-cast p0, Lw33/c;

    iget-object v0, p0, Lw33/c;->a:Ljava/lang/String;

    iget-object p0, p0, Lw33/c;->b:Ljava/util/Set;

    new-instance v1, Ll83/k;

    const-string v2, "$in"

    invoke-direct {v1, v2, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-static {v0, p0}, Ly00/t7;->o(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
