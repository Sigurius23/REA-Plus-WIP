.class public final synthetic Lij/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lij/a;->w:I

    iput-object p1, p0, Lij/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lij/a;->y:Ljava/lang/Object;

    iput-object p3, p0, Lij/a;->z:Ljava/lang/Object;

    iput-object p4, p0, Lij/a;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lvr2/b;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Lij/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lij/a;->z:Ljava/lang/Object;

    iput-object p3, p0, Lij/a;->E:Ljava/lang/Object;

    iput-object p4, p0, Lij/a;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Lij/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lij/a;->x:Ljava/lang/Object;

    check-cast v0, Lvr2/b;

    iget-object v1, p0, Lij/a;->z:Ljava/lang/Object;

    check-cast v1, Lorg/joda/time/DateTime;

    iget-object v2, p0, Lij/a;->E:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v3, p0, Lij/a;->y:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lvr2/b;->b(Lvr2/b;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lij/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, Lij/a;->y:Ljava/lang/Object;

    check-cast v1, Lqc/j;

    iget-object v2, p0, Lij/a;->z:Ljava/lang/Object;

    check-cast v2, Lic/b;

    iget-object v3, p0, Lij/a;->E:Ljava/lang/Object;

    check-cast v3, Landroidx/work/impl/WorkDatabase;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljc/i;

    iget-object v6, v1, Lqc/j;->a:Ljava/lang/String;

    invoke-interface {v5, v6}, Ljc/i;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {v2, v3, v0}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lij/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/Window;

    iget-object v1, p0, Lij/a;->y:Ljava/lang/Object;

    check-cast v1, Landroid/view/Window$Callback;

    iget-object v2, p0, Lij/a;->z:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Runnable;

    iget-object v3, p0, Lij/a;->E:Ljava/lang/Object;

    check-cast v3, Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    new-instance v0, Lio/sentry/android/core/internal/util/i;

    invoke-direct {v0, v4, v2}, Lio/sentry/android/core/internal/util/i;-><init>(Landroid/view/View;Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_1
    return-void

    :pswitch_2
    iget-object v0, p0, Lij/a;->x:Ljava/lang/Object;

    check-cast v0, Lij/b;

    iget-object v1, p0, Lij/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lij/a;->z:Ljava/lang/Object;

    check-cast v2, Lkotlinx/serialization/json/JsonObject;

    iget-object v3, p0, Lij/a;->E:Ljava/lang/Object;

    check-cast v3, Lij/f;

    const-string v4, "$msgId"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v4, Lb3/t0;

    const/16 v5, 0xa

    invoke-direct {v4, v5, v3, v1}, Lb3/t0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1, v2, v4}, Lij/b;->a(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lb3/t0;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "Unknown error"

    :cond_2
    invoke-virtual {v3, v1, v0}, Lij/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
