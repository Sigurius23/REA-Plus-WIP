.class public final Lq3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxr/l;
.implements Lcq/g;
.implements Lcq/d;
.implements Lxk/d;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq3/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lq3/i;->w:Ljava/lang/Object;

    iput-object p2, p0, Lq3/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 3
    iput-object p1, p0, Lq3/i;->x:Ljava/lang/Object;

    iput-object p2, p0, Lq3/i;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lzr/w0;[I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lq3/i;->w:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Lq3/i;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Lgm/j;

    iget-object v0, v0, Lgm/j;->w:Landroid/content/Context;

    iget-object v1, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v1, Lxr/k;

    invoke-virtual {v1}, Lxr/k;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxr/t;

    new-instance v2, Lng3/n;

    const/16 v3, 0x1c

    invoke-direct {v2, v3}, Lng3/n;-><init>(I)V

    new-instance v3, Lsr/h;

    invoke-direct {v3, v0, v1, v2}, Lsr/h;-><init>(Landroid/content/Context;Lxr/t;Lng3/n;)V

    return-object v3
.end method

.method public b(Ljava/util/List;)Lq3/y;
    .locals 10

    const/4 v1, 0x0

    :try_start_0
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v2, 0x0

    move-object v3, v1

    :goto_0
    if-ge v2, v0, :cond_0

    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq3/h;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    iget-object v3, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v3, Ldn/e;

    invoke-interface {v4, v3}, Lq3/h;->a(Ldn/e;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    add-int/lit8 v2, v2, 0x1

    move-object v3, v4

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v4

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, v3

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast p1, Ldn/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ll3/g;

    iget-object p1, p1, Ldn/e;->F:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/textfield/p;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/p;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast p1, Ldn/e;

    iget v2, p1, Ldn/e;->x:I

    iget p1, p1, Ldn/e;->y:I

    invoke-static {v2, p1}, Lj93/l0;->f(II)J

    move-result-wide v2

    new-instance p1, Ll3/u0;

    invoke-direct {p1, v2, v3}, Ll3/u0;-><init>(J)V

    iget-object v4, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v4, Lq3/y;

    iget-wide v4, v4, Lq3/y;->b:J

    invoke-static {v4, v5}, Ll3/u0;->g(J)Z

    move-result v4

    if-nez v4, :cond_1

    move-object v1, p1

    :cond_1
    if-eqz v1, :cond_2

    iget-wide v1, v1, Ll3/u0;->a:J

    goto :goto_1

    :cond_2
    invoke-static {v2, v3}, Ll3/u0;->e(J)I

    move-result p1

    invoke-static {v2, v3}, Ll3/u0;->f(J)I

    move-result v1

    invoke-static {p1, v1}, Lj93/l0;->f(II)J

    move-result-wide v1

    :goto_1
    iget-object p1, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast p1, Ldn/e;

    invoke-virtual {p1}, Ldn/e;->g()Ll3/u0;

    move-result-object p1

    new-instance v3, Lq3/y;

    invoke-direct {v3, v0, v1, v2, p1}, Lq3/y;-><init>(Ll3/g;JLl3/u0;)V

    iput-object v3, p0, Lq3/i;->w:Ljava/lang/Object;

    return-object v3

    :catch_2
    move-exception v0

    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Error while applying EditCommand batch to buffer (length="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v5, Ldn/e;

    iget-object v5, v5, Ldn/e;->F:Ljava/lang/Object;

    check-cast v5, Lcom/google/android/material/textfield/p;

    invoke-virtual {v5}, Lcom/google/android/material/textfield/p;->c()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", composition="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v5, Ldn/e;

    invoke-virtual {v5}, Ldn/e;->g()Ll3/u0;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", selection="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v5, Ldn/e;

    iget v6, v5, Ldn/e;->x:I

    iget v5, v5, Ldn/e;->y:I

    invoke-static {v6, v5}, Lj93/l0;->f(II)J

    move-result-wide v5

    invoke-static {v5, v6}, Ll3/u0;->h(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "):"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v8, Lq11/c;

    const/4 p1, 0x1

    invoke-direct {v8, p1, v1, p0}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/16 v9, 0x3c

    const-string v5, "\n"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "toString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lzk/d0;

    iget-object v1, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Ldl/s;

    iget-object v2, v0, Lzk/d0;->F:Ldl/s;

    if-eqz v2, :cond_0

    if-ne v2, v1, :cond_0

    iget-object v2, v0, Lzk/d0;->x:Lzk/i;

    iget-object v0, v0, Lzk/d0;->G:Lzk/d;

    iget-object v1, v1, Ldl/s;->c:Lxk/e;

    invoke-interface {v1}, Lxk/e;->d()Lwk/a;

    move-result-object v3

    invoke-virtual {v2, v0, p1, v1, v3}, Lzk/i;->a(Lwk/e;Ljava/lang/Exception;Lxk/e;Lwk/a;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    iget-object v1, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v1, Ltp/q;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public e(Landroid/os/Handler;Lrm/r;Lrm/r;Lrm/r;Lrm/r;)[Lrm/d;
    .locals 11

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    new-instance v2, Lmo/i;

    iget-object v3, p0, Lq3/i;->x:Ljava/lang/Object;

    move-object v6, v3

    check-cast v6, Lg73/d;

    invoke-direct {v2, v1, v6, p1, p2}, Lmo/i;-><init>(Landroid/content/Context;Lhn/j;Landroid/os/Handler;Lrm/r;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Lq30/w0;

    const/16 v2, 0xf

    const/4 v3, 0x0

    invoke-direct {p2, v2, v3}, Lq30/w0;-><init>(IB)V

    sget-object v2, Ltm/f;->c:Ltm/f;

    iput-object v2, p2, Lq30/w0;->x:Ljava/lang/Object;

    sget-object v3, Ltm/t;->a:Ltm/t;

    iput-object v3, p2, Lq30/w0;->z:Ljava/lang/Object;

    new-instance v3, Landroid/content/IntentFilter;

    const-string v4, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v3, v4}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v3

    sget v4, Llo/y;->a:I

    const/16 v5, 0x11

    const/4 v10, 0x0

    if-lt v4, v5, :cond_1

    sget-object v5, Llo/y;->c:Ljava/lang/String;

    const-string v7, "Amazon"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "Xiaomi"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    const-string v7, "external_surround_sound_enabled"

    invoke-static {v5, v7, v10}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_1

    sget-object v2, Ltm/f;->d:Ltm/f;

    goto :goto_0

    :cond_1
    const/16 v5, 0x1d

    const/16 v7, 0x8

    if-lt v4, v5, :cond_3

    invoke-static {v1}, Llo/y;->y(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_2

    const/16 v5, 0x17

    if-lt v4, v5, :cond_3

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v4, "android.hardware.type.automotive"

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    new-instance v2, Ltm/f;

    invoke-static {}, Ltm/e;->a()[I

    move-result-object v1

    invoke-direct {v2, v1, v7}, Ltm/f;-><init>([II)V

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_5

    const-string v1, "android.media.extra.AUDIO_PLUG_STATE"

    invoke-virtual {v3, v1, v10}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v2, Ltm/f;

    const-string v1, "android.media.extra.ENCODINGS"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object v1

    const-string v4, "android.media.extra.MAX_CHANNEL_COUNT"

    invoke-virtual {v3, v4, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    invoke-direct {v2, v1, v3}, Ltm/f;-><init>([II)V

    :cond_5
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v2, p2, Lq30/w0;->x:Ljava/lang/Object;

    iget-object v1, p2, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v1, Lq30/w0;

    if-nez v1, :cond_6

    new-instance v1, Lq30/w0;

    new-array v2, v10, [Ltm/h;

    invoke-direct {v1, v2}, Lq30/w0;-><init>([Ltm/h;)V

    iput-object v1, p2, Lq30/w0;->y:Ljava/lang/Object;

    :cond_6
    new-instance v9, Ltm/s;

    invoke-direct {v9, p2}, Ltm/s;-><init>(Lq30/w0;)V

    iget-object p2, p0, Lq3/i;->w:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Landroid/content/Context;

    new-instance v4, Ltm/v;

    move-object v7, p1

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Ltm/v;-><init>(Landroid/content/Context;Lhn/j;Landroid/os/Handler;Lrm/r;Ltm/s;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance p3, Lxn/i;

    invoke-direct {p3, p4, p2}, Lxn/i;-><init>(Lrm/r;Landroid/os/Looper;)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object p1

    new-instance p2, Lin/f;

    move-object/from16 p3, p5

    invoke-direct {p2, p3, p1}, Lin/f;-><init>(Lrm/r;Landroid/os/Looper;)V

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lno/b;

    invoke-direct {p1}, Lno/b;-><init>()V

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-array p1, v10, [Lrm/d;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lrm/d;

    return-object p1
.end method

.method public f(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lzk/d0;

    iget-object v1, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Ldl/s;

    iget-object v2, v0, Lzk/d0;->F:Ldl/s;

    if-eqz v2, :cond_1

    if-ne v2, v1, :cond_1

    iget-object v2, v0, Lzk/d0;->w:Lzk/g;

    iget-object v2, v2, Lzk/g;->p:Lzk/k;

    if-eqz p1, :cond_0

    iget-object v3, v1, Ldl/s;->c:Lxk/e;

    invoke-interface {v3}, Lxk/e;->d()Lwk/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lzk/k;->a(Lwk/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, v0, Lzk/d0;->E:Ljava/lang/Object;

    iget-object p1, v0, Lzk/d0;->x:Lzk/i;

    invoke-virtual {p1}, Lzk/i;->m()V

    return-void

    :cond_0
    move-object v2, v0

    iget-object v0, v2, Lzk/d0;->x:Lzk/i;

    move-object v3, v1

    iget-object v1, v3, Ldl/s;->a:Lwk/e;

    iget-object v3, v3, Ldl/s;->c:Lxk/e;

    invoke-interface {v3}, Lxk/e;->d()Lwk/a;

    move-result-object v4

    iget-object v5, v2, Lzk/d0;->G:Lzk/d;

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Lzk/i;->c(Lwk/e;Ljava/lang/Object;Lxk/e;Lwk/a;Lwk/e;)V

    :cond_1
    return-void
.end method

.method public g(Lb9/g;)V
    .locals 3

    monitor-enter p1

    monitor-exit p1

    iget-object v0, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lr5/b;

    const/16 v2, 0xe

    invoke-direct {v1, v2, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public h(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p2, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast p2, Landroid/os/Bundle;

    invoke-static {p1, v0, p2}, Ls4/c;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public i(IIII)V
    .locals 3

    iget-object v0, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/cardview/widget/CardView;

    iget-object v1, v0, Landroidx/cardview/widget/CardView;->z:Landroid/graphics/Rect;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v1, v0, Landroidx/cardview/widget/CardView;->y:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p4, v1

    invoke-static {v0, p1, p2, p3, p4}, Landroidx/cardview/widget/CardView;->a(Landroidx/cardview/widget/CardView;IIII)V

    return-void
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object p1, p0, Lq3/i;->w:Ljava/lang/Object;

    check-cast p1, Lvr/i;

    iget-object v0, p0, Lq3/i;->x:Ljava/lang/Object;

    check-cast v0, Lcq/i;

    iget-object v1, p1, Lvr/i;->f:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object p1, p1, Lvr/i;->e:Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
