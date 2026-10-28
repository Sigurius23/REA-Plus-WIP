.class public final synthetic Lio/seon/androidsdk/service/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/z0;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/z0;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/x0;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/x0;->b:Lio/seon/androidsdk/service/z0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lio/seon/androidsdk/service/x0;->a:I

    const/4 v1, 0x0

    iget-object v2, p0, Lio/seon/androidsdk/service/x0;->b:Lio/seon/androidsdk/service/z0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v2}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0

    :pswitch_0
    invoke-virtual {v2}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->l:Ljava/lang/Boolean;

    return-object v0

    :pswitch_1
    invoke-virtual {v2}, Lio/seon/androidsdk/service/z0;->l()Lio/seon/androidsdk/service/d1;

    move-result-object v0

    iget-object v0, v0, Lio/seon/androidsdk/service/d1;->g:Lm63/d;

    iget-object v0, v0, Lm63/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0

    :pswitch_2
    :try_start_0
    new-instance v0, Lio/seon/androidsdk/service/w0;

    const/16 v3, 0x1b

    invoke-direct {v0, v2, v3}, Lio/seon/androidsdk/service/w0;-><init>(Lio/seon/androidsdk/service/z0;I)V

    sget-object v3, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, Lio/seon/androidsdk/service/w0;->a()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v0, v1

    :goto_0
    :try_start_2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v2}, Lio/seon/androidsdk/service/z0;->h()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lio/seon/androidsdk/service/z0;->f()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "oasisfeng.island"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_2
    :goto_1
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_2
    return-object v1

    :pswitch_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x1

    :try_start_3
    const-string v2, "android.app.ActivityThread"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "sCurrentActivityThread"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "mInstrumentation"

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Instrumentation;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_3

    :catch_1
    move-exception v2

    :try_start_4
    const-string v3, "Instr"

    invoke-static {v3, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "JUnit"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
