.class public final Lz40/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final o:Ll83/p;


# instance fields
.field public final a:Lkr/e;

.field public final b:Lz40/f;

.field public final c:Lb9/a;

.field public d:Lc4/q;

.field public e:Lz40/e;

.field public f:Lz40/e;

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:Lb50/c;

.field public final j:Ljava/util/List;

.field public k:I

.field public final l:Lz40/k;

.field public final m:Lz40/k;

.field public final n:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lz40/h;->w:Lz40/h;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lz40/l;->o:Ll83/p;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc33/f;Ljava/util/ArrayList;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioFocusChangeListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "context.applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkr/e;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    new-instance v2, Lz40/f;

    const-string v3, "audio"

    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_c

    check-cast v3, Landroid/media/AudioManager;

    invoke-direct {v2, p1, v0, v3, p2}, Lz40/f;-><init>(Landroid/content/Context;Lkr/e;Landroid/media/AudioManager;Landroid/media/AudioManager$OnAudioFocusChangeListener;)V

    new-instance p2, Lb9/a;

    invoke-direct {p2, p1, v0}, Lb9/a;-><init>(Landroid/content/Context;Lkr/e;)V

    sget v3, Lb50/c;->K:I

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    new-instance v5, Lb50/c;

    invoke-direct {v5, p1, v0, v3, v2}, Lb50/c;-><init>(Landroid/content/Context;Lkr/e;Landroid/bluetooth/BluetoothAdapter;Lz40/f;)V

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lkr/e;

    invoke-direct {v3, v1}, Lkr/e;-><init>(I)V

    iput-object v3, p0, Lz40/l;->a:Lkr/e;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lz40/l;->h:Ljava/util/ArrayList;

    const/4 v3, 0x3

    iput v3, p0, Lz40/l;->k:I

    new-instance v3, Lz40/k;

    invoke-direct {v3, p0}, Lz40/k;-><init>(Lz40/l;)V

    iput-object v3, p0, Lz40/l;->l:Lz40/k;

    new-instance v3, Lz40/k;

    invoke-direct {v3, p0}, Lz40/k;-><init>(Lz40/l;)V

    iput-object v3, p0, Lz40/l;->m:Lz40/k;

    iput-object v1, p0, Lz40/l;->n:Ljava/util/ArrayList;

    iput-object v0, p0, Lz40/l;->a:Lkr/e;

    iput-object v2, p0, Lz40/l;->b:Lz40/f;

    iput-object p2, p0, Lz40/l;->c:Lb9/a;

    new-instance p2, Lty/c;

    const/16 v0, 0x1d

    invoke-direct {p2, p3, v0}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p2}, Lse/a;->J(Lm83/b0;)Ljava/util/Map;

    move-result-object p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-static {}, Lz40/i;->a()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {}, Lz40/i;->a()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-static {p2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    const/4 v0, 0x0

    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-ltz v0, :cond_4

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {p2, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    move v0, v2

    goto :goto_2

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_5
    :goto_3
    invoke-static {}, Lz40/i;->a()Ljava/util/List;

    move-result-object p2

    :cond_6
    iput-object p2, p0, Lz40/l;->j:Ljava/util/List;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p3

    iget p3, p3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v0, 0x1e

    if-le p3, v0, :cond_8

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt p3, v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p3

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {p1, v1, p3, v0}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    if-nez p1, :cond_9

    goto :goto_5

    :cond_8
    :goto_4
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p3

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    const-string v1, "android.permission.BLUETOOTH"

    invoke-virtual {p1, v1, p3, v0}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    if-nez p1, :cond_9

    :goto_5
    move-object v4, v5

    :cond_9
    iput-object v4, p0, Lz40/l;->i:Lb50/c;

    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p2, p3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Preferred device list = "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "message"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget v0, p0, Lz40/l;->k:I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    iget-object v0, p0, Lz40/l;->e:Lz40/e;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lz40/l;->b(Lz40/e;)V

    return-void

    :cond_2
    iput v1, p0, Lz40/l;->k:I

    iget-object v0, p0, Lz40/l;->b:Lz40/f;

    iget-object v3, v0, Lz40/f;->c:Landroid/media/AudioManager;

    iget-object v4, v0, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v3}, Landroid/media/AudioManager;->getMode()I

    move-result v5

    iput v5, v0, Lz40/f;->e:I

    invoke-virtual {v3}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    move-result v5

    iput-boolean v5, v0, Lz40/f;->f:Z

    invoke-virtual {v3}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    move-result v3

    iput-boolean v3, v0, Lz40/f;->g:Z

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    iget-object v3, v0, Lz40/f;->d:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    new-instance v5, Landroid/media/AudioAttributes$Builder;

    invoke-direct {v5}, Landroid/media/AudioAttributes$Builder;-><init>()V

    invoke-virtual {v5, v1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    move-result-object v5

    invoke-virtual {v5}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    move-result-object v5

    new-instance v6, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v6, v1}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    invoke-virtual {v6, v5}, Landroid/media/AudioFocusRequest$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/media/AudioFocusRequest$Builder;->setAcceptsDelayedFocusGain(Z)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/media/AudioFocusRequest$Builder;->setOnAudioFocusChangeListener(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioFocusRequest$Builder;->build()Landroid/media/AudioFocusRequest;

    move-result-object v1

    const-string v2, "Builder(AudioManager.AUD\u2026ner)\n            .build()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Lz40/f;->h:Landroid/media/AudioFocusRequest;

    invoke-virtual {v4, v1}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioFocusRequest;)I

    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Landroid/media/AudioManager;->setMode(I)V

    iget-object v0, p0, Lz40/l;->e:Lz40/e;

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lz40/l;->b(Lz40/e;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final b(Lz40/e;)V
    .locals 5

    instance-of v0, p1, Lz40/a;

    const/4 v1, 0x0

    iget-object v2, p0, Lz40/l;->i:Lb50/c;

    iget-object v3, p0, Lz40/l;->b:Lz40/f;

    if-eqz v0, :cond_2

    invoke-virtual {v3, v1}, Lz40/f;->a(Z)V

    if-eqz v2, :cond_5

    iget-object p1, v2, Lb50/c;->H:Lx30/s0;

    sget-object v0, Lb50/b;->e:Lb50/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v2, Lb50/c;->H:Lx30/s0;

    sget-object v0, Lb50/b;->d:Lb50/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v2, Lb50/c;->x:Lkr/e;

    iget-object v0, v2, Lb50/c;->H:Lx30/s0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot activate when in the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " state"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "message"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, v2, Lb50/c;->I:Lb50/a;

    invoke-virtual {p1}, Lb3/b;->m()V

    return-void

    :cond_2
    instance-of v0, p1, Lz40/b;

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lz40/d;

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v3, v1}, Lz40/f;->a(Z)V

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lb50/c;->a()V

    return-void

    :cond_4
    instance-of p1, p1, Lz40/c;

    if-eqz p1, :cond_5

    invoke-virtual {v3, v4}, Lz40/f;->a(Z)V

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lb50/c;->a()V

    :cond_5
    return-void
.end method

.method public final c()V
    .locals 5

    const/4 v0, 0x3

    iput v0, p0, Lz40/l;->k:I

    const/4 v0, 0x0

    iget-object v1, p0, Lz40/l;->i:Lb50/c;

    if-eqz v1, :cond_0

    iput-object v0, v1, Lb50/c;->z:Lz40/k;

    iget-object v2, v1, Lb50/c;->y:Landroid/bluetooth/BluetoothAdapter;

    const/4 v3, 0x1

    iget-object v4, v1, Lb50/c;->F:Landroid/bluetooth/BluetoothHeadset;

    invoke-virtual {v2, v3, v4}, Landroid/bluetooth/BluetoothAdapter;->closeProfileProxy(ILandroid/bluetooth/BluetoothProfile;)V

    iget-boolean v2, v1, Lb50/c;->G:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb50/c;->w:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v2, 0x0

    iput-boolean v2, v1, Lb50/c;->G:Z

    :cond_0
    iget-object v1, p0, Lz40/l;->c:Lb9/a;

    iput-object v0, v1, Lb9/a;->d:Ljava/lang/Object;

    iget-object v2, v1, Lb9/a;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iput-object v0, p0, Lz40/l;->d:Lc4/q;

    return-void
.end method

.method public final d(Ljava/lang/String;)V
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    iget-object v2, p0, Lz40/l;->h:Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz40/e;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lz40/l;->e:Lz40/e;

    new-instance v3, Lz40/g;

    invoke-direct {v3, v0, v1}, Lz40/g;-><init>(Ljava/util/ArrayList;Lz40/e;)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lz40/l;->j:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v4, 0x2

    iget-object v5, p0, Lz40/l;->i:Lb50/c;

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    const-class v8, Lz40/a;

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    if-eqz v5, :cond_1

    iget-object v1, v5, Lb50/c;->H:Lx30/s0;

    sget-object v4, Lb50/b;->f:Lb50/b;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    if-nez p1, :cond_2

    invoke-virtual {v5}, Lb50/c;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, p1

    :goto_2
    if-eqz v1, :cond_3

    new-instance v6, Lz40/a;

    invoke-direct {v6, v1}, Lz40/a;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    new-instance v6, Lz40/a;

    const-string v1, "Bluetooth"

    invoke-direct {v6, v1}, Lz40/a;-><init>(Ljava/lang/String;)V

    :cond_4
    :goto_3
    if-eqz v6, :cond_1

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const-class v5, Lz40/d;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    iget-boolean v1, p0, Lz40/l;->g:Z

    if-eqz v1, :cond_1

    new-instance v1, Lz40/d;

    invoke-direct {v1}, Lz40/d;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    const-class v5, Lz40/b;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    iget-object v6, p0, Lz40/l;->b:Lz40/f;

    if-eqz v5, :cond_7

    iget-object v1, v6, Lz40/f;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v4, "android.hardware.telephony"

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lz40/l;->g:Z

    if-nez v1, :cond_1

    new-instance v1, Lz40/b;

    invoke-direct {v1}, Lz40/b;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    const-class v5, Lz40/c;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v6, Lz40/f;->b:Lkr/e;

    iget-object v1, v6, Lz40/f;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v5, "android.hardware.audio.output"

    invoke-virtual {v1, v5}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v6, Lz40/f;->c:Landroid/media/AudioManager;

    invoke-virtual {v1, v4}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v1

    const-string v5, "devices"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v5, v1

    :goto_4
    if-ge v7, v5, :cond_1

    aget-object v6, v1, v7

    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v6

    if-ne v6, v4, :cond_8

    goto :goto_5

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_9
    :goto_5
    new-instance v1, Lz40/c;

    invoke-direct {v1}, Lz40/c;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Available AudioDevice list updated: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lz40/l;->n:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lz40/l;->a:Lkr/e;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz40/l;->f:Lz40/e;

    const/4 v1, 0x1

    if-eqz p1, :cond_d

    instance-of v8, p1, Lz40/a;

    if-eqz v8, :cond_e

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lz40/e;

    instance-of v9, v9, Lz40/a;

    if-eqz v9, :cond_b

    goto :goto_6

    :cond_c
    move-object v8, v6

    :goto_6
    check-cast v8, Lz40/e;

    if-eqz v8, :cond_d

    iput-object v8, p0, Lz40/l;->f:Lz40/e;

    move p1, v1

    goto :goto_7

    :cond_d
    move p1, v7

    goto :goto_7

    :cond_e
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    :goto_7
    if-nez p1, :cond_f

    iput-object v6, p0, Lz40/l;->f:Lz40/e;

    :cond_f
    iget-object p1, p0, Lz40/l;->f:Lz40/e;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Current user selected AudioDevice = "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz40/l;->f:Lz40/e;

    if-eqz p1, :cond_10

    move-object v6, p1

    goto :goto_8

    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_12

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "mutableAudioDevices[0]"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lz40/e;

    instance-of p1, v6, Lz40/a;

    if-eqz p1, :cond_12

    if-eqz v5, :cond_11

    iget-object p1, v5, Lb50/c;->H:Lx30/s0;

    sget-object v0, Lb50/b;->d:Lb50/b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v1, :cond_11

    move v7, v1

    :cond_11
    if-eqz v7, :cond_12

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lz40/e;

    :cond_12
    :goto_8
    iput-object v6, p0, Lz40/l;->e:Lz40/e;

    iget p1, p0, Lz40/l;->k:I

    if-ne p1, v4, :cond_13

    invoke-virtual {p0}, Lz40/l;->a()V

    :cond_13
    new-instance p1, Lz40/g;

    iget-object v0, p0, Lz40/l;->e:Lz40/e;

    invoke-direct {p1, v2, v0}, Lz40/g;-><init>(Ljava/util/ArrayList;Lz40/e;)V

    invoke-virtual {p1, v3}, Lz40/g;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    iget-object p1, p0, Lz40/l;->d:Lc4/q;

    if-eqz p1, :cond_14

    iget-object v0, p0, Lz40/l;->e:Lz40/e;

    invoke-virtual {p1, v2, v0}, Lc4/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    return-void
.end method
