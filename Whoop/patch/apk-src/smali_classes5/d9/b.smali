.class public final Ld9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ld9/b;

.field public static final d:Lzr/w0;

.field public static final e:Lzr/b1;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld9/b;

    sget-object v1, Ld9/a;->d:Ld9/a;

    invoke-static {v1}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    invoke-direct {v0, v1}, Ld9/b;-><init>(Lzr/w0;)V

    sput-object v0, Ld9/b;->c:Ld9/b;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x3

    invoke-static {v3, v0}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-static {v3, v0}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    sput-object v0, Ld9/b;->d:Lzr/w0;

    new-instance v0, Lab/h0;

    const/4 v3, 0x4

    invoke-direct {v0, v3}, Lab/h0;-><init>(I)V

    invoke-virtual {v0, v1, v2}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v3, 0xa

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x12

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v1}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lab/h0;->t(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lab/h0;->i()Lzr/b1;

    move-result-object v0

    sput-object v0, Ld9/b;->e:Lzr/b1;

    return-void
.end method

.method public constructor <init>(Lzr/w0;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Ld9/b;->a:Landroid/util/SparseArray;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p1, Lzr/w0;->z:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld9/a;

    iget-object v3, p0, Ld9/b;->a:Landroid/util/SparseArray;

    iget v4, v2, Ld9/a;->a:I

    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_1
    iget-object v1, p0, Ld9/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Ld9/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld9/a;

    iget v1, v1, Ld9/a;->b:I

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iput p1, p0, Ld9/b;->b:I

    return-void
.end method

.method public static a([II)Lzr/w0;
    .locals 4

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p0, :cond_0

    new-array p0, v1, [I

    :cond_0
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    aget v2, p0, v1

    new-instance v3, Ld9/a;

    invoke-direct {v3, v2, p1}, Ld9/a;-><init>(II)V

    invoke-virtual {v0, v3}, Lzr/a0;->a(Ljava/lang/Object;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;Lu8/d;Lro/i;)Ld9/b;
    .locals 12

    invoke-static {p0}, Lv8/b;->r(Landroid/content/Context;)Landroid/media/AudioManager;

    move-result-object v0

    const/16 v1, 0x21

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    sget p3, Lx8/t;->a:I

    if-lt p3, v1, :cond_1

    invoke-static {v0, p2}, Lc4/v;->b(Landroid/media/AudioManager;Lu8/d;)Lro/i;

    move-result-object p3

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    :goto_0
    sget v2, Lx8/t;->a:I

    const-string v3, "android.hardware.type.automotive"

    const/16 v4, 0x17

    if-lt v2, v1, :cond_3

    invoke-static {p0}, Lx8/t;->I(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_2

    if-lt v2, v4, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    :cond_2
    invoke-static {v0, p2}, Lc4/v;->a(Landroid/media/AudioManager;Lu8/d;)Ld9/b;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v5, 0x4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-lt v2, v4, :cond_8

    if-nez p3, :cond_4

    invoke-virtual {v0, v6}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object p3

    goto :goto_1

    :cond_4
    new-array v0, v7, [Landroid/media/AudioDeviceInfo;

    iget-object p3, p3, Lro/i;->x:Ljava/lang/Object;

    check-cast p3, Landroid/media/AudioDeviceInfo;

    aput-object p3, v0, v8

    move-object p3, v0

    :goto_1
    new-instance v0, Lzr/i0;

    invoke-direct {v0, v5}, Lzr/a0;-><init>(I)V

    const/16 v9, 0x8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v10, 0x7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v9, v10}, [Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lzr/a0;->d(I)V

    iget-object v10, v0, Lzr/a0;->a:[Ljava/lang/Object;

    iget v11, v0, Lzr/a0;->b:I

    invoke-static {v9, v8, v10, v11, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v9, v0, Lzr/a0;->b:I

    add-int/2addr v9, v6

    iput v9, v0, Lzr/a0;->b:I

    const/16 v9, 0x1f

    if-lt v2, v9, :cond_5

    const/16 v9, 0x1a

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/16 v10, 0x1b

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v9, v10}, [Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lzr/q;->b(I[Ljava/lang/Object;)V

    invoke-virtual {v0, v6}, Lzr/a0;->d(I)V

    iget-object v10, v0, Lzr/a0;->a:[Ljava/lang/Object;

    iget v11, v0, Lzr/a0;->b:I

    invoke-static {v9, v8, v10, v11, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v9, v0, Lzr/a0;->b:I

    add-int/2addr v9, v6

    iput v9, v0, Lzr/a0;->b:I

    :cond_5
    if-lt v2, v1, :cond_6

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzr/a0;->a(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v0}, Lzr/i0;->f()Lzr/j0;

    move-result-object v0

    array-length v1, p3

    move v2, v8

    :goto_2
    if-ge v2, v1, :cond_8

    aget-object v9, p3, v2

    invoke-virtual {v9}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v0, v9}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    sget-object p0, Ld9/b;->c:Ld9/b;

    return-object p0

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    new-instance p3, Lzr/i0;

    invoke-direct {p3, v5}, Lzr/a0;-><init>(I)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lzr/a0;->a(Ljava/lang/Object;)V

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x1d

    const/16 v2, 0xa

    if-lt v0, v1, :cond_a

    invoke-static {p0}, Lx8/t;->I(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_9

    if-lt v0, v4, :cond_a

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    :cond_9
    invoke-static {p2}, La4/a;->q(Lu8/d;)Lzr/w0;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p0}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    new-instance p0, Ld9/b;

    invoke-virtual {p3}, Lzr/i0;->f()Lzr/j0;

    move-result-object p1

    invoke-static {p1}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-static {p1, v2}, Ld9/b;->a([II)Lzr/w0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld9/b;-><init>(Lzr/w0;)V

    return-object p0

    :cond_a
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string p2, "use_external_surround_sound_flag"

    invoke-static {p0, p2, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    if-ne p2, v7, :cond_b

    move p2, v7

    goto :goto_3

    :cond_b
    move p2, v8

    :goto_3
    if-nez p2, :cond_c

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "Amazon"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "Xiaomi"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    const-string v0, "external_surround_sound_enabled"

    invoke-static {p0, v0, v8}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v7, :cond_d

    sget-object p0, Ld9/b;->d:Lzr/w0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p0}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    :cond_d
    if-eqz p1, :cond_f

    if-nez p2, :cond_f

    const-string p0, "android.media.extra.AUDIO_PLUG_STATE"

    invoke-virtual {p1, p0, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-ne p0, v7, :cond_f

    const-string p0, "android.media.extra.ENCODINGS"

    invoke-virtual {p1, p0}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    move-result-object p0

    if-eqz p0, :cond_e

    invoke-static {p0}, Lvd/f;->i([I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, p0}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    :cond_e
    new-instance p0, Ld9/b;

    invoke-virtual {p3}, Lzr/i0;->f()Lzr/j0;

    move-result-object p2

    invoke-static {p2}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object p2

    const-string p3, "android.media.extra.MAX_CHANNEL_COUNT"

    invoke-virtual {p1, p3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p2, p1}, Ld9/b;->a([II)Lzr/w0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld9/b;-><init>(Lzr/w0;)V

    return-object p0

    :cond_f
    new-instance p0, Ld9/b;

    invoke-virtual {p3}, Lzr/i0;->f()Lzr/j0;

    move-result-object p1

    invoke-static {p1}, Lvd/f;->S(Ljava/util/Collection;)[I

    move-result-object p1

    invoke-static {p1, v2}, Ld9/b;->a([II)Lzr/w0;

    move-result-object p1

    invoke-direct {p0, p1}, Ld9/b;-><init>(Lzr/w0;)V

    return-object p0
.end method

.method public static c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    const-string v1, "android.media.action.HDMI_AUDIO_PLUG"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Ld9/b;->b(Landroid/content/Context;Landroid/content/Intent;Lu8/d;Lro/i;)Ld9/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Lu8/d;Lu8/p;)Landroid/util/Pair;
    .locals 13

    iget-object v0, p2, Lu8/p;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p2, Lu8/p;->k:Ljava/lang/String;

    invoke-static {v0, v1}, Lu8/d0;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    sget-object v2, Ld9/b;->e:Lzr/b1;

    invoke-virtual {v2, v1}, Lzr/b1;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v1, 0x7

    const/4 v3, 0x6

    const/16 v4, 0x8

    const/16 v5, 0x12

    iget-object v6, p0, Ld9/b;->a:Landroid/util/SparseArray;

    if-ne v0, v5, :cond_1

    invoke-static {v6, v5}, Lx8/t;->i(Landroid/util/SparseArray;I)Z

    move-result v7

    if-nez v7, :cond_1

    move v0, v3

    goto :goto_0

    :cond_1
    if-ne v0, v4, :cond_2

    invoke-static {v6, v4}, Lx8/t;->i(Landroid/util/SparseArray;I)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_2
    const/16 v7, 0x1e

    if-ne v0, v7, :cond_4

    invoke-static {v6, v7}, Lx8/t;->i(Landroid/util/SparseArray;I)Z

    move-result v7

    if-nez v7, :cond_4

    :cond_3
    move v0, v1

    :cond_4
    :goto_0
    invoke-static {v6, v0}, Lx8/t;->i(Landroid/util/SparseArray;I)Z

    move-result v7

    if-nez v7, :cond_5

    goto/16 :goto_6

    :cond_5
    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld9/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v7, v6, Ld9/a;->b:I

    iget-object v8, v6, Ld9/a;->c:Lzr/j0;

    iget v9, p2, Lu8/p;->D:I

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, -0x1

    if-eq v9, v12, :cond_b

    if-ne v0, v5, :cond_6

    goto :goto_2

    :cond_6
    iget-object p1, p2, Lu8/p;->n:Ljava/lang/String;

    const-string p2, "audio/vnd.dts.uhd;profile=p2"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget p1, Lx8/t;->a:I

    const/16 p2, 0x21

    if-ge p1, p2, :cond_7

    const/16 p1, 0xa

    if-le v9, p1, :cond_10

    goto/16 :goto_6

    :cond_7
    if-nez v8, :cond_8

    if-gt v9, v7, :cond_a

    move v11, v10

    goto :goto_1

    :cond_8
    invoke-static {v9}, Lx8/t;->q(I)I

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v8, p1}, Lzr/b0;->contains(Ljava/lang/Object;)Z

    move-result v11

    :cond_a
    :goto_1
    if-nez v11, :cond_10

    goto :goto_6

    :cond_b
    :goto_2
    iget p2, p2, Lu8/p;->E:I

    if-eq p2, v12, :cond_c

    goto :goto_3

    :cond_c
    const p2, 0xbb80

    :goto_3
    iget v5, v6, Ld9/a;->a:I

    if-eqz v8, :cond_d

    goto :goto_4

    :cond_d
    sget v6, Lx8/t;->a:I

    const/16 v7, 0x1d

    if-lt v6, v7, :cond_e

    invoke-static {v5, p2, p1}, La4/a;->s(IILu8/d;)I

    move-result v7

    goto :goto_4

    :cond_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v2, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_f

    move-object p2, p1

    :cond_f
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    :goto_4
    move v9, v7

    :cond_10
    sget p1, Lx8/t;->a:I

    const/16 p2, 0x1c

    if-gt p1, p2, :cond_12

    if-ne v9, v1, :cond_11

    move v3, v4

    goto :goto_5

    :cond_11
    const/4 p2, 0x3

    if-eq v9, p2, :cond_13

    const/4 p2, 0x4

    if-eq v9, p2, :cond_13

    const/4 p2, 0x5

    if-ne v9, p2, :cond_12

    goto :goto_5

    :cond_12
    move v3, v9

    :cond_13
    :goto_5
    const/16 p2, 0x1a

    if-gt p1, p2, :cond_14

    const-string p1, "fugu"

    sget-object p2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_14

    if-ne v3, v10, :cond_14

    const/4 v3, 0x2

    :cond_14
    invoke-static {v3}, Lx8/t;->q(I)I

    move-result p1

    if-nez p1, :cond_15

    :goto_6
    const/4 p1, 0x0

    return-object p1

    :cond_15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1

    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ld9/b;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ld9/b;

    iget-object v0, p0, Ld9/b;->a:Landroid/util/SparseArray;

    iget-object v1, p1, Ld9/b;->a:Landroid/util/SparseArray;

    invoke-static {v0, v1}, Lx8/t;->j(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p0, Ld9/b;->b:I

    iget p1, p1, Ld9/b;->b:I

    if-ne v0, p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ld9/b;->a:Landroid/util/SparseArray;

    invoke-static {v0}, Lx8/t;->k(Landroid/util/SparseArray;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ld9/b;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AudioCapabilities[maxChannelCount="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ld9/b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", audioProfiles="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ld9/b;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
