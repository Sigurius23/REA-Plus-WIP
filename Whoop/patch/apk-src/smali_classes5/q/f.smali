.class public final Lq/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq/a;
.implements Lsn/a0;
.implements Lvm/e;
.implements Lrv/p;
.implements Lqa/l;
.implements Ltp/u;
.implements Lg40/p0;
.implements Laf3/c0;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lq/f;->w:I

    packed-switch p1, :pswitch_data_0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    new-instance p1, Lg5/e;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lg5/e;-><init>(I)V

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 57
    new-instance p1, La0/f1;

    const/4 v0, 0x0

    .line 58
    invoke-direct {p1, v0}, La0/f1;-><init>(I)V

    .line 59
    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    .line 60
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 61
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void

    .line 62
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 64
    new-instance p1, Lx8/n;

    invoke-direct {p1}, Lx8/n;-><init>()V

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    .line 65
    new-instance p1, Lao/a;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lao/a;-><init>(I)V

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, Lq/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x1a

    iput v0, p0, Lq/f;->w:I

    .line 30
    sget-object v0, Lbz/h;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 31
    const-string v0, "native"

    .line 32
    :cond_0
    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const-string v1, "stripe-mobile-sdk"

    iput-object v1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 35
    const-string v1, "stripe-mobile-sdk-android"

    iput-object v1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 36
    iput-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq/f;->w:I

    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    .line 128
    iput-object p2, p0, Lq/f;->x:Ljava/lang/Object;

    .line 129
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 130
    new-instance p1, La0/f1;

    const/4 p2, 0x0

    .line 131
    invoke-direct {p1, p2}, La0/f1;-><init>(I)V

    .line 132
    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb30/m;Lg9/k;Lz63/h;Ljava/util/Map;Lz40/i;)V
    .locals 0

    const/16 p5, 0x1b

    iput p5, p0, Lq/f;->w:I

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 84
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 85
    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    .line 86
    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb9/b1;Lrm/t0;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lq/f;->w:I

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    .line 153
    iget-object v0, p1, Lb9/b1;->j:Ljava/lang/Object;

    check-cast v0, Lsn/z;

    .line 154
    iput-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    .line 155
    iget-object p1, p1, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    .line 156
    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 157
    iput-object p2, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltp/v;Ltp/g;Ltp/u;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lq/f;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lev/c;Ljava/lang/ref/WeakReference;)V
    .locals 4

    const/4 v0, 0x7

    iput v0, p0, Lq/f;->w:I

    .line 69
    new-instance v0, Lrv/o;

    .line 70
    const-string v1, "mapbox-location-indicator-layer"

    invoke-direct {v0, v1}, Lrv/o;-><init>(Ljava/lang/String;)V

    .line 71
    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v1, v0, Lrv/o;->b:Ljava/util/HashMap;

    const-string v3, "id"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-string v2, "location-indicator"

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lrv/o;->b:Ljava/util/HashMap;

    const-string v3, "type"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    const-string v1, "location-transition"

    invoke-static {}, Lrv/o;->b()Lcom/mapbox/bindgen/Value;

    move-result-object v2

    iget-object v3, v0, Lrv/o;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    const-string v1, "bearing-transition"

    invoke-static {}, Lrv/o;->b()Lcom/mapbox/bindgen/Value;

    move-result-object v2

    iget-object v3, v0, Lrv/o;->b:Ljava/util/HashMap;

    invoke-virtual {v3, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    iget-object v2, v0, Lrv/o;->b:Ljava/util/HashMap;

    const-string v3, "perspective-compensation"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-wide/high16 v2, 0x4010000000000000L    # 4.0

    invoke-direct {v1, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    iget-object v2, v0, Lrv/o;->b:Ljava/util/HashMap;

    const-string v3, "image-pitch-displacement"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    const-string v1, "puckOptions"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "weakContext"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 80
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 81
    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh20/f;Lv00/c0;Lu10/d;La30/w0;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lq/f;->w:I

    const-string v0, "customerStateHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodMetadata"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "updateScreenInteractorFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageInteractorFactory"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 23
    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    .line 24
    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lx43/e;Lb2/z;)V
    .locals 2

    const/16 v0, 0x16

    iput v0, p0, Lq/f;->w:I

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p2, p0, Lq/f;->x:Ljava/lang/Object;

    .line 52
    const-string p2, "Video:Events"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    const/4 p1, 0x0

    const/4 p2, 0x5

    const/4 v0, 0x0

    const/16 v1, 0x64

    .line 53
    invoke-static {v0, v1, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 54
    new-instance p1, Lx43/l;

    invoke-direct {p1, p0}, Lx43/l;-><init>(Lq/f;)V

    invoke-virtual {p3, p1}, Lb2/z;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/e1;

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 10

    const/16 v0, 0x19

    iput v0, p0, Lq/f;->w:I

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    new-instance v0, Lx8/n;

    invoke-direct {v0}, Lx8/n;-><init>()V

    iput-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    .line 89
    new-instance v0, Lx8/n;

    invoke-direct {v0}, Lx8/n;-><init>()V

    iput-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    .line 90
    new-instance v0, Lya/a;

    invoke-direct {v0}, Lya/a;-><init>()V

    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    .line 91
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 92
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    sget v1, Lx8/t;->a:I

    .line 93
    const-string v1, "\\r?\\n"

    const/4 v3, -0x1

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 94
    array-length v1, p1

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, p1, v4

    .line 95
    const-string v6, "palette: "

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/16 v6, 0x9

    .line 96
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, ","

    .line 97
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 98
    array-length v6, v5

    new-array v6, v6, [I

    iput-object v6, v0, Lya/a;->d:[I

    move v6, v2

    .line 99
    :goto_1
    array-length v7, v5

    if-ge v6, v7, :cond_1

    .line 100
    iget-object v7, v0, Lya/a;->d:[I

    aget-object v8, v5, v6

    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x10

    .line 101
    :try_start_0
    invoke-static {v8, v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move v8, v2

    .line 102
    :goto_2
    aput v8, v7, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 103
    :cond_0
    const-string v6, "size: "

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x6

    .line 104
    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    const-string v6, "x"

    .line 105
    invoke-virtual {v5, v6, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 106
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    .line 107
    :try_start_1
    aget-object v6, v5, v2

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v0, Lya/a;->e:I

    const/4 v6, 0x1

    .line 108
    aget-object v5, v5, v6

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    iput v5, v0, Lya/a;->f:I

    .line 109
    iput-boolean v6, v0, Lya/a;->b:Z
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v5

    .line 110
    const-string v6, "VobsubParser"

    const-string v7, "Parsing IDX failed"

    invoke-static {v6, v7, v5}, Lx8/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public constructor <init>(Lo30/d;Ljavax/crypto/SecretKey;Ln30/d;Lq30/n;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq/f;->w:I

    const-string v0, "messageTransformer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "creqExecutorConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 47
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 48
    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    .line 49
    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsn/h;Ljava/lang/Object;)V
    .locals 4

    const/16 v0, 0x8

    iput v0, p0, Lq/f;->w:I

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    .line 134
    iget-object v0, p1, Lsn/a;->c:Lsn/z;

    .line 135
    new-instance v1, Lsn/z;

    .line 136
    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 137
    invoke-direct {v1, v0, v2, v3}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    .line 138
    iput-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    .line 139
    iget-object p1, p1, Lsn/a;->d:Lsn/z;

    .line 140
    new-instance v0, Lsn/z;

    .line 141
    iget-object p1, p1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 142
    invoke-direct {v0, p1, v2, v3}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    .line 143
    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    .line 144
    iput-object p2, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsn/x0;[Z)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lq/f;->w:I

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 160
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 161
    iget p1, p1, Lsn/x0;->w:I

    new-array p2, p1, [Z

    iput-object p2, p0, Lq/f;->z:Ljava/lang/Object;

    .line 162
    new-array p1, p1, [Z

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt9/c0;Landroid/app/Application;)V
    .locals 2

    const/16 v0, 0xf

    iput v0, p0, Lq/f;->w:I

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p0, p0, Lq/f;->y:Ljava/lang/Object;

    .line 120
    iput-object p2, p0, Lq/f;->x:Ljava/lang/Object;

    .line 121
    new-instance v0, Ln20/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ln20/a;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    .line 122
    invoke-static {p2}, Lv03/e;->a(Ljava/lang/Object;)Lv03/e;

    move-result-object p2

    .line 123
    new-instance v0, Lc20/g;

    const/16 v1, 0xf

    invoke-direct {v0, p1, p2, v1}, Lc20/g;-><init>(Ljava/lang/Object;Lv03/e;I)V

    .line 124
    new-instance p2, Lb10/c;

    const/16 v1, 0xc

    invoke-direct {p2, p1, v0, v1}, Lb10/c;-><init>(Ljava/lang/Object;Lv03/d;I)V

    .line 125
    iput-object p2, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lt9/c0;Lu00/e;Lt9/p;Landroid/app/Application;Lec3/w1;Landroidx/lifecycle/k1;Lz10/e;)V
    .locals 0

    const/16 p2, 0x13

    iput p2, p0, Lq/f;->w:I

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p7, p0, Lq/f;->x:Ljava/lang/Object;

    .line 113
    iput-object p4, p0, Lq/f;->y:Ljava/lang/Object;

    .line 114
    new-instance p2, Luy/a;

    const/4 p4, 0x1

    invoke-direct {p2, p1, p4}, Luy/a;-><init>(Lt9/c0;I)V

    .line 115
    invoke-static {p2}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 116
    new-instance p1, Le20/a;

    const/4 p2, 0x5

    sget-object p4, Lx10/a;->a:Ls10/c;

    invoke-direct {p1, p3, p4, p2}, Le20/a;-><init>(Ljava/lang/Object;Lv03/h;I)V

    .line 117
    invoke-static {p1}, Lv03/c;->b(Lv03/h;)Lv03/h;

    move-result-object p1

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu2/y;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lq/f;->w:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    .line 68
    sget-object p1, Lu2/w;->w:Lu2/w;

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx43/e;Lud3/l0;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lq/f;->w:I

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 40
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 41
    const-string p1, "Video:SocketFactory"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 42
    new-instance p1, Lx33/a;

    .line 43
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyy/j;Lb10/b;Lbz/c;Lb20/f;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lq/f;->w:I

    const-string v0, "durationProvider"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 27
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 28
    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    .line 29
    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzr/w0;Lq3/i;Lso/q;Lt9/u;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lq/f;->w:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 146
    invoke-static {p1}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lzr/g0;->x:Lzr/e0;

    .line 147
    sget-object p1, Lzr/w0;->E:Lzr/w0;

    .line 148
    :goto_0
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 149
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 150
    iput-object p3, p0, Lq/f;->z:Ljava/lang/Object;

    .line 151
    iput-object p4, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzy/b;Ljava/util/List;)V
    .locals 2

    const/16 v0, 0x14

    iput v0, p0, Lq/f;->w:I

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    .line 6
    check-cast p2, Ljava/lang/Iterable;

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 9
    check-cast v1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    .line 10
    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getApiValue()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    .line 13
    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 14
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 16
    check-cast v0, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    .line 17
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 19
    :cond_1
    iput-object p2, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public static m0(Lr30/b;ILjava/lang/String;Ljava/lang/String;)Lr30/g;
    .locals 10

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    sget-object p1, Lr30/f;->x:Lng3/n;

    iget-object v2, p0, Lr30/b;->y:Ljava/lang/String;

    iget-object v8, p0, Lr30/b;->z:Lq30/q0;

    iget-object v1, p0, Lr30/b;->x:Ljava/lang/String;

    iget-object v7, p0, Lr30/b;->w:Ljava/lang/String;

    new-instance v0, Lr30/g;

    const-string v6, "CRes"

    const/4 v9, 0x4

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v9}, Lr30/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq30/q0;I)V

    return-object v0
.end method

.method public static q0(Lkotlin/time/Duration;)Ljava/util/Map;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide v0

    sget-object p0, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, p0}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    new-instance v0, Ll83/k;

    const-string v1, "duration"

    invoke-direct {v0, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lm83/z;->w:Lm83/z;

    return-object p0
.end method


# virtual methods
.method public A(ILsn/v;Lsn/m;Ll9/y;Ljava/io/IOException;Z)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p4}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p3, p2, p5, p6}, Lsn/z;->h(Lsn/m;Ll9/y;Ljava/io/IOException;Z)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3, p4, p5, p6}, Lsn/z;->h(Lsn/m;Ll9/y;Ljava/io/IOException;Z)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public A0()V
    .locals 11

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lu2/y;

    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lu2/w;

    sget-object v2, Lu2/w;->x:Lu2/w;

    if-ne v1, v2, :cond_0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    new-instance v1, Lu2/x;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lu2/x;-><init>(Lu2/y;I)V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-wide v5, v3

    invoke-static/range {v3 .. v10}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/MotionEvent;->setSource(I)V

    invoke-virtual {v1, v2}, Lu2/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    sget-object v1, Lu2/w;->w:Lu2/w;

    iput-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    iput-boolean v3, v0, Lu2/y;->y:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public B(Laf3/s;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public B0(Lu2/k;Lu2/l;)V
    .locals 11

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lu2/y;

    iget-object v1, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v3, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    invoke-static {v7}, Lu2/d0;->c(Lu2/r;)Z

    move-result v8

    if-nez v8, :cond_0

    invoke-static {v7}, Lu2/d0;->e(Lu2/r;)Z

    move-result v7

    if-nez v7, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v5

    move v7, v4

    :goto_2
    if-ge v7, v5, :cond_3

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    move v5, v6

    goto :goto_4

    :cond_4
    :goto_3
    move v5, v4

    :goto_4
    iget-boolean v7, v0, Lu2/y;->y:Z

    if-nez v7, :cond_8

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v4

    :goto_5
    if-ge v8, v7, :cond_6

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    invoke-static {v9}, Lu2/d0;->c(Lu2/r;)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-static {v9}, Lu2/d0;->e(Lu2/r;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_6
    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    move v5, v4

    goto :goto_7

    :cond_8
    :goto_6
    move v5, v6

    :goto_7
    iget-object v7, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v7, Lu2/w;

    sget-object v8, Lu2/w;->y:Lu2/w;

    if-eq v7, v8, :cond_d

    sget-object v7, Lu2/l;->w:Lu2/l;

    if-ne p2, v7, :cond_b

    if-eqz v5, :cond_b

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    if-eqz v3, :cond_a

    iget-boolean v7, v0, Lu2/y;->y:Z

    if-eqz v7, :cond_9

    goto :goto_8

    :cond_9
    move v7, v4

    goto :goto_9

    :cond_a
    :goto_8
    move v7, v6

    :goto_9
    invoke-virtual {p0, p1, v7}, Lq/f;->p0(Lu2/k;Z)V

    :cond_b
    sget-object v7, Lu2/l;->x:Lu2/l;

    if-ne p2, v7, :cond_c

    if-eqz v3, :cond_c

    iget-object v7, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v7, Lu2/k;

    invoke-virtual {p1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-boolean v7, v0, Lu2/y;->y:Z

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v4

    :goto_a
    if-ge v8, v7, :cond_c

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    invoke-virtual {v9}, Lu2/r;->a()V

    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_c
    sget-object v7, Lu2/l;->y:Lu2/l;

    if-ne p2, v7, :cond_d

    if-nez v5, :cond_d

    iget-object v5, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v5, Lu2/k;

    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    invoke-virtual {p0, p1, v6}, Lq/f;->p0(Lu2/k;Z)V

    :cond_d
    sget-object v5, Lu2/l;->y:Lu2/l;

    if-ne p2, v5, :cond_12

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result p2

    move v5, v4

    :goto_b
    if-ge v5, p2, :cond_f

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    invoke-static {v6}, Lu2/d0;->e(Lu2/r;)Z

    move-result v6

    if-nez v6, :cond_e

    goto :goto_c

    :cond_e
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_f
    sget-object p2, Lu2/w;->w:Lu2/w;

    iput-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    iput-boolean v4, v0, Lu2/y;->y:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lq/f;->z:Ljava/lang/Object;

    :goto_c
    iget-object p2, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast p2, Lu2/k;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_12

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result p2

    move v3, v4

    :goto_d
    if-ge v3, p2, :cond_11

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu2/r;

    invoke-virtual {v5}, Lu2/r;->l()Z

    move-result v5

    if-eqz v5, :cond_10

    iget-boolean p2, v0, Lu2/y;->y:Z

    if-nez p2, :cond_11

    invoke-virtual {p0, p1}, Lq/f;->S0(Lu2/k;)V

    return-void

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_d

    :cond_11
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result p1

    :goto_e
    if-ge v4, p1, :cond_12

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lu2/r;

    invoke-virtual {p2}, Lu2/r;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_e

    :cond_12
    return-void
.end method

.method public C(Lq30/w0;)V
    .locals 1

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {p1, v0}, Lq30/w0;->b(Lrv/o;)V

    return-void
.end method

.method public C0(Lio/getstream/android/video/generated/models/VideoEvent;)Z
    .locals 5

    invoke-virtual {p0}, Lq/f;->u0()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[send] event: `"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "`"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lx43/e;

    invoke-interface {v0, p1}, Lx43/e;->q(Ljava/lang/Object;)Lne3/l;

    move-result-object p1

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lud3/e1;

    check-cast v0, Lle3/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "bytes"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p1}, Lle3/g;->g(ILne3/l;)Z

    move-result p1

    return p1
.end method

.method public D(Lq/b;)V
    .locals 1

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lq/f;->t0(Lq/b;)Lq/g;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public D0(Lre/f;)V
    .locals 0

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public E(II)V
    .locals 2

    invoke-static {p1}, Lrv/n;->g(I)[F

    move-result-object p1

    invoke-static {p2}, Lrv/n;->g(I)[F

    move-result-object p2

    invoke-static {p1}, Lrv/n;->d([F)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p2}, Lrv/n;->d([F)Ljava/util/ArrayList;

    move-result-object p2

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, p1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string p1, "accuracy-radius-color"

    invoke-virtual {v0, p1, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    new-instance p1, Lcom/mapbox/bindgen/Value;

    invoke-direct {p1, p2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string p2, "accuracy-radius-border-color"

    invoke-virtual {v0, p2, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public E0(Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public F(Laf3/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public F0(Lre/z;)V
    .locals 0

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public G(ILsn/v;Ll9/y;)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p3}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lsn/z;->k(Ll9/y;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3}, Lsn/z;->k(Ll9/y;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public G0(Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public H()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public H0()V
    .locals 1

    const-string v0, "5311fm7hqak9lrnpht6kp2p5uh"

    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    return-void
.end method

.method public I(Laf3/c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public I0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    return-void
.end method

.method public J(Laf3/o;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public J0(Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public K(Lcom/mapbox/bindgen/Value;)V
    .locals 2

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "shadow-image-size"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    const-string v1, "bearing-image-size"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    const-string v1, "top-image-size"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public K0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public L0(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public M()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public M0(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    return-void
.end method

.method public N(Laf3/w;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public N0(Ly2/y;)V
    .locals 0

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public O(Laf3/v;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public O0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq/f;->x:Ljava/lang/Object;

    return-void
.end method

.method public P(Laf3/h;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public P0(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    return-void
.end method

.method public Q(Laf3/l;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public Q0(ILjava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lz63/h;

    iget-object v1, v0, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz p2, :cond_0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-le v2, p1, :cond_0

    if-ltz p1, :cond_0

    if-gt v2, v1, :cond_0

    invoke-static {v0, p2, p1, v2}, Lz63/h;->c(Lz63/h;Ljava/lang/Object;II)V

    :cond_0
    return-void
.end method

.method public R(Laf3/x;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public R0(Laf3/t;I)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lb30/m;

    iget-object v1, v0, Lb30/m;->F:Ljava/lang/Object;

    check-cast v1, Lo20/a;

    iget-object v1, v1, Lo20/a;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz63/e;

    if-eqz p1, :cond_0

    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lg9/k;

    invoke-interface {p1, v0, v1}, Lz63/e;->a(Lb30/m;Lg9/k;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lq/f;->Q0(ILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public S(Laf3/b0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public S0(Lu2/k;)V
    .locals 5

    iget-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, Lu2/w;

    sget-object v1, Lu2/w;->x:Lu2/w;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Ly2/y;

    if-eqz v0, :cond_0

    const-wide/16 v1, 0x0

    invoke-interface {v0, v1, v2}, Ly2/y;->Z(J)J

    move-result-wide v0

    new-instance v2, Lu2/x;

    iget-object v3, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v3, Lu2/y;

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4}, Lu2/x;-><init>(Lu2/y;I)V

    const/4 v3, 0x1

    invoke-static {p1, v0, v1, v2, v3}, Lu2/d0;->n(Lu2/k;JLkotlin/jvm/functions/Function1;Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "layoutCoordinates not set"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object p1, Lu2/w;->y:Lu2/w;

    iput-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    return-void
.end method

.method public T(Lcom/mapbox/geojson/Point;)V
    .locals 5

    const-string v0, "latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/geojson/Point;->latitude()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p1}, Lcom/mapbox/geojson/Point;->longitude()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v0, p1, v1}, [Ljava/lang/Double;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    new-instance v4, Lcom/mapbox/bindgen/Value;

    invoke-direct {v4, v2, v3}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/mapbox/bindgen/Value;

    invoke-direct {p1, v1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string v1, "location"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public T0()Lb10/z0;
    .locals 10

    new-instance v0, Lb10/z0;

    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Landroid/app/Application;

    iget-object v2, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v2, Lz10/e;

    move-object v3, v2

    new-instance v2, Lvv1/c;

    const/16 v4, 0x13

    invoke-direct {v2, v3, v4}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    move-object v4, v3

    sget-object v3, Lb10/d;->x:Lb10/d;

    iget-object v5, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v5, Lv03/h;

    invoke-interface {v5}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq83/j;

    new-instance v6, Lb10/b;

    new-instance v7, Lvv1/c;

    const/16 v8, 0x13

    invoke-direct {v7, v4, v8}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    move-object v4, v5

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-direct {v6, v1, v5, v7}, Lb10/b;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    new-instance v7, Lyy/j;

    iget-object v8, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v8, Lv03/h;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lqy/d;

    iget-object v9, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v9, Lv03/h;

    invoke-interface {v9}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lq83/j;

    invoke-direct {v7, v8, v9}, Lyy/j;-><init>(Lqy/d;Lq83/j;)V

    iget-object v8, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v8, Lv03/h;

    invoke-interface {v8}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lqy/d;

    invoke-direct/range {v0 .. v8}, Lb10/z0;-><init>(Landroid/content/Context;Lc93/a;Lb10/d;Lq83/j;Ljava/util/Set;Lb10/b;Lyy/j;Lqy/d;)V

    return-object v0
.end method

.method public U(Laf3/e;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public U0(Laf3/t;)V
    .locals 2

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz63/b;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lz63/b;->a(Lq/f;Laf3/t;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lq/f;->V0(Laf3/t;)V

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v1, p1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string p1, "slot"

    invoke-virtual {v0, p1, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public V0(Laf3/t;)V
    .locals 1

    iget-object p1, p1, Laf3/t;->b:Laf3/t;

    :goto_0
    if-eqz p1, :cond_0

    iget-object v0, p1, Laf3/t;->e:Laf3/t;

    invoke-virtual {p1, p0}, Laf3/t;->a(Laf3/c0;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public W(Laf3/f;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public X()V
    .locals 2

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lrv/o;

    iget-object v1, v1, Lrv/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleLayer(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_0
    return-void
.end method

.method public Y(Lcom/mapbox/maps/MapboxStyleManager;)V
    .locals 5

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lev/c;

    iget-object v1, v0, Lev/c;->w:Lcom/mapbox/maps/ImageHolder;

    const-string v2, "mapbox-location-top-icon"

    invoke-virtual {p0, p1, v2, v1}, Lq/f;->g0(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lcom/mapbox/maps/ImageHolder;)V

    iget-object v1, v0, Lev/c;->x:Lcom/mapbox/maps/ImageHolder;

    const-string v3, "mapbox-location-bearing-icon"

    invoke-virtual {p0, p1, v3, v1}, Lq/f;->g0(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lcom/mapbox/maps/ImageHolder;)V

    iget-object v1, v0, Lev/c;->y:Lcom/mapbox/maps/ImageHolder;

    const-string v4, "mapbox-location-shadow-icon"

    invoke-virtual {p0, p1, v4, v1}, Lq/f;->g0(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lcom/mapbox/maps/ImageHolder;)V

    iget-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast p1, Lrv/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "top-image"

    invoke-virtual {p1, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v3}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "bearing-image"

    invoke-virtual {p1, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, v4}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "shadow-image"

    invoke-virtual {p1, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    iget v0, v0, Lev/c;->E:F

    float-to-double v0, v0

    new-instance v2, Lcom/mapbox/bindgen/Value;

    invoke-direct {v2, v0, v1}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    const-string v0, "location-indicator-opacity"

    invoke-virtual {p1, v0, v2}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public Z(Lcom/mapbox/maps/Style;)V
    .locals 1

    iput-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, v0, Lrv/o;->c:Lcom/mapbox/maps/MapboxStyleManager;

    return-void
.end method

.method public a(Laf3/i;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public a0(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p4}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lsn/z;->d(Lsn/m;Ll9/y;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3, p4}, Lsn/z;->d(Lsn/m;Ll9/y;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    invoke-virtual {v3}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getApiValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    return-object p1

    :cond_2
    const/4 p1, 0x0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/DropdownItemSpec;->getDisplayText()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b0()V
    .locals 2

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_0

    const-string v1, "mapbox-location-top-icon"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_0
    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_1

    const-string v1, "mapbox-location-bearing-icon"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_1
    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_2

    const-string v1, "mapbox-location-shadow-icon"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->removeStyleImage(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    :cond_2
    return-void
.end method

.method public c()V
    .locals 3

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-string v2, "visible"

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "visibility"

    invoke-virtual {v0, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public c0()I
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x2

    return v0

    :pswitch_0
    const/4 v0, 0x2

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public d(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p4}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lsn/z;->j(Lsn/m;Ll9/y;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3, p4}, Lsn/z;->j(Lsn/m;Ll9/y;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public d0(F)V
    .locals 3

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    float-to-double v1, p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lcom/mapbox/bindgen/Value;

    invoke-direct {p1, v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    const-string v1, "accuracy-radius"

    invoke-virtual {v0, v1, p1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public e0(Laf3/z;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lcom/mapbox/maps/MapboxStyleManager;

    if-eqz v0, :cond_0

    const-string v1, "mapbox-location-indicator-layer"

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/MapboxStyleManager;->styleLayerExists(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f0()V
    .locals 3

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    const-string v2, "none"

    invoke-direct {v1, v2}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/lang/String;)V

    const-string v2, "visibility"

    invoke-virtual {v0, v2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public g()Lg40/o0;
    .locals 2

    new-instance v0, Lg40/n0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg40/n0;-><init>(Z)V

    return-object v0
.end method

.method public g0(Lcom/mapbox/maps/MapboxStyleManager;Ljava/lang/String;Lcom/mapbox/maps/ImageHolder;)V
    .locals 7

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lcom/mapbox/maps/ImageHolder;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v0}, Lcom/mapbox/maps/MapboxStyleManager;->addImage(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;

    return-void

    :cond_0
    iget-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-string v1, "LocationPuck2D"

    if-eqz v0, :cond_7

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lcom/mapbox/maps/ImageHolder;->getDrawableId()Ljava/lang/Integer;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-static {v0, p3}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    const/4 v0, 0x0

    if-nez p3, :cond_1

    :goto_0
    move-object p3, v0

    goto :goto_1

    :cond_1
    instance-of v2, p3, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_2

    check-cast p3, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p3}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p3

    if-nez p3, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    const-string v2, "constantState.newDrawable().mutate()"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v4

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getHeight()I

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {p3, v6, v6, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p3, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    move-object p3, v2

    :goto_1
    if-eqz p3, :cond_4

    invoke-virtual {p1, p2, p3}, Lcom/mapbox/maps/MapboxStyleManager;->addImage(Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    :cond_4
    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    :goto_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "No image holder data for "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x21

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "Could not set 2D puck image as drawable for "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " because there is no Android Context!"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public getLabel()Lzy/c;
    .locals 1

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lzy/b;

    return-object v0
.end method

.method public h(ILsn/v;Ll9/y;)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p3}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p2}, Lsn/z;->b(Ll9/y;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3}, Lsn/z;->b(Ll9/y;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public h0(Laf3/t;)V
    .locals 1

    iget-object p1, p1, Laf3/t;->e:Laf3/t;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lq/f;->r0()V

    iget-object p1, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast p1, Lz63/h;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lz63/h;->a(C)V

    :cond_0
    return-void
.end method

.method public i(Laf3/j;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public i0()Lre/n0;
    .locals 1

    new-instance v0, Lre/n0;

    invoke-direct {v0, p0}, Lre/n0;-><init>(Lq/f;)V

    return-object v0
.end method

.method public j(Laf3/a0;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public j0()Lre/r0;
    .locals 1

    new-instance v0, Lre/r0;

    invoke-direct {v0, p0}, Lre/r0;-><init>(Lq/f;)V

    return-object v0
.end method

.method public k([BIILqa/k;Lx8/d;)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p5

    iget v4, v0, Lq/f;->w:I

    const/4 v5, 0x4

    const/16 v7, 0x78

    const/16 v8, 0xff

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x1

    packed-switch v4, :pswitch_data_0

    iget-object v4, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v4, Lx8/n;

    add-int v13, v2, p3

    invoke-virtual {v4, v13, v1}, Lx8/n;->D(I[B)V

    invoke-virtual {v4, v2}, Lx8/n;->F(I)V

    iget-object v1, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lx8/n;

    iget-object v2, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Lya/a;

    iget-object v13, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v13, Ljava/util/zip/Inflater;

    if-nez v13, :cond_0

    new-instance v13, Ljava/util/zip/Inflater;

    invoke-direct {v13}, Ljava/util/zip/Inflater;-><init>()V

    iput-object v13, v0, Lq/f;->E:Ljava/lang/Object;

    :cond_0
    iget-object v13, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v13, Ljava/util/zip/Inflater;

    sget v14, Lx8/t;->a:I

    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v14

    if-lez v14, :cond_1

    iget-object v14, v4, Lx8/n;->a:[B

    iget v15, v4, Lx8/n;->b:I

    aget-byte v14, v14, v15

    and-int/2addr v8, v14

    if-ne v8, v7, :cond_1

    invoke-static {v4, v1, v13}, Lx8/t;->E(Lx8/n;Lx8/n;Ljava/util/zip/Inflater;)Z

    move-result v7

    if-eqz v7, :cond_1

    iget-object v7, v1, Lx8/n;->a:[B

    iget v1, v1, Lx8/n;->c:I

    invoke-virtual {v4, v1, v7}, Lx8/n;->D(I[B)V

    :cond_1
    iput-boolean v9, v2, Lya/a;->c:Z

    iput-object v10, v2, Lya/a;->g:Landroid/graphics/Rect;

    const/4 v1, -0x1

    iput v1, v2, Lya/a;->h:I

    iput v1, v2, Lya/a;->i:I

    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v7

    if-lt v7, v11, :cond_a

    invoke-virtual {v4}, Lx8/n;->z()I

    move-result v8

    if-eq v8, v7, :cond_2

    goto/16 :goto_3

    :cond_2
    iget-object v7, v2, Lya/a;->d:[I

    if-eqz v7, :cond_8

    iget-boolean v8, v2, Lya/a;->b:Z

    if-nez v8, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-virtual {v4}, Lx8/n;->z()I

    move-result v8

    sub-int/2addr v8, v11

    invoke-virtual {v4, v8}, Lx8/n;->G(I)V

    invoke-virtual {v4}, Lx8/n;->z()I

    move-result v8

    iget-object v13, v2, Lya/a;->a:[I

    :goto_0
    :pswitch_0
    iget v14, v4, Lx8/n;->b:I

    if-ge v14, v8, :cond_8

    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v14

    if-lez v14, :cond_8

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v14

    packed-switch v14, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v14

    if-ge v14, v5, :cond_4

    goto/16 :goto_2

    :cond_4
    invoke-virtual {v4}, Lx8/n;->z()I

    move-result v14

    iput v14, v2, Lya/a;->h:I

    invoke-virtual {v4}, Lx8/n;->z()I

    move-result v14

    iput v14, v2, Lya/a;->i:I

    goto :goto_0

    :pswitch_2
    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v14

    const/4 v15, 0x6

    if-ge v14, v15, :cond_5

    goto/16 :goto_2

    :cond_5
    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v14

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v15

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v16

    shl-int/2addr v14, v5

    shr-int/lit8 v17, v15, 0x4

    or-int v14, v14, v17

    and-int/lit8 v15, v15, 0xf

    shl-int/lit8 v15, v15, 0x8

    or-int v15, v15, v16

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v16

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v17

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v18

    shl-int/lit8 v16, v16, 0x4

    shr-int/lit8 v19, v17, 0x4

    or-int v10, v16, v19

    and-int/lit8 v16, v17, 0xf

    shl-int/lit8 v16, v16, 0x8

    or-int v16, v16, v18

    new-instance v5, Landroid/graphics/Rect;

    add-int/2addr v15, v12

    const/16 v18, 0x3

    add-int/lit8 v6, v16, 0x1

    invoke-direct {v5, v14, v10, v15, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v5, v2, Lya/a;->g:Landroid/graphics/Rect;

    :goto_1
    const/4 v5, 0x4

    const/4 v10, 0x0

    goto :goto_0

    :pswitch_3
    const/16 v18, 0x3

    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v5

    if-lt v5, v11, :cond_8

    iget-boolean v5, v2, Lya/a;->c:Z

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v5

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v6

    aget v10, v13, v18

    shr-int/lit8 v14, v5, 0x4

    invoke-static {v10, v14}, Lya/a;->c(II)I

    move-result v10

    aput v10, v13, v18

    aget v10, v13, v11

    and-int/lit8 v5, v5, 0xf

    invoke-static {v10, v5}, Lya/a;->c(II)I

    move-result v5

    aput v5, v13, v11

    aget v5, v13, v12

    shr-int/lit8 v10, v6, 0x4

    invoke-static {v5, v10}, Lya/a;->c(II)I

    move-result v5

    aput v5, v13, v12

    aget v5, v13, v9

    and-int/lit8 v6, v6, 0xf

    invoke-static {v5, v6}, Lya/a;->c(II)I

    move-result v5

    aput v5, v13, v9

    goto :goto_1

    :pswitch_4
    const/16 v18, 0x3

    invoke-virtual {v4}, Lx8/n;->a()I

    move-result v5

    if-ge v5, v11, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v5

    invoke-virtual {v4}, Lx8/n;->t()I

    move-result v6

    shr-int/lit8 v10, v5, 0x4

    invoke-static {v7, v10}, Lya/a;->a([II)I

    move-result v10

    aput v10, v13, v18

    and-int/lit8 v5, v5, 0xf

    invoke-static {v7, v5}, Lya/a;->a([II)I

    move-result v5

    aput v5, v13, v11

    shr-int/lit8 v5, v6, 0x4

    invoke-static {v7, v5}, Lya/a;->a([II)I

    move-result v5

    aput v5, v13, v12

    and-int/lit8 v5, v6, 0xf

    invoke-static {v7, v5}, Lya/a;->a([II)I

    move-result v5

    aput v5, v13, v9

    iput-boolean v12, v2, Lya/a;->c:Z

    goto :goto_1

    :cond_8
    :goto_2
    iget-object v5, v2, Lya/a;->d:[I

    if-eqz v5, :cond_a

    iget-boolean v5, v2, Lya/a;->b:Z

    if-eqz v5, :cond_a

    iget-boolean v5, v2, Lya/a;->c:Z

    if-eqz v5, :cond_a

    iget-object v5, v2, Lya/a;->g:Landroid/graphics/Rect;

    if-eqz v5, :cond_a

    iget v6, v2, Lya/a;->h:I

    if-eq v6, v1, :cond_a

    iget v6, v2, Lya/a;->i:I

    if-eq v6, v1, :cond_a

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lt v1, v11, :cond_a

    iget-object v1, v2, Lya/a;->g:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-ge v1, v11, :cond_9

    goto/16 :goto_3

    :cond_9
    iget-object v1, v2, Lya/a;->g:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v6

    mul-int/2addr v6, v5

    new-array v5, v6, [I

    new-instance v6, Llo/s;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Llo/s;-><init>(I)V

    iget v7, v2, Lya/a;->h:I

    invoke-virtual {v4, v7}, Lx8/n;->F(I)V

    invoke-virtual {v6, v4}, Llo/s;->p(Lx8/n;)V

    invoke-virtual {v2, v6, v12, v1, v5}, Lya/a;->b(Llo/s;ZLandroid/graphics/Rect;[I)V

    iget v7, v2, Lya/a;->i:I

    invoke-virtual {v4, v7}, Lx8/n;->F(I)V

    invoke-virtual {v6, v4}, Llo/s;->p(Lx8/n;)V

    invoke-virtual {v2, v6, v9, v1, v5}, Lya/a;->b(Llo/s;ZLandroid/graphics/Rect;[I)V

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v6

    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v4, v6, v7}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v12

    iget v4, v1, Landroid/graphics/Rect;->left:I

    int-to-float v4, v4

    iget v5, v2, Lya/a;->e:I

    int-to-float v5, v5

    div-float v16, v4, v5

    iget v4, v1, Landroid/graphics/Rect;->top:I

    int-to-float v4, v4

    iget v5, v2, Lya/a;->f:I

    int-to-float v5, v5

    div-float v13, v4, v5

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v4

    int-to-float v4, v4

    iget v5, v2, Lya/a;->e:I

    int-to-float v5, v5

    div-float v20, v4, v5

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    iget v2, v2, Lya/a;->f:I

    int-to-float v2, v2

    div-float v21, v1, v2

    new-instance v8, Lw8/b;

    const/4 v9, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/high16 v18, -0x80000000

    const v19, -0x800001

    const/16 v22, 0x0

    const/high16 v23, -0x1000000

    const/16 v25, 0x0

    move-object v10, v9

    move-object v11, v9

    move/from16 v24, v18

    invoke-direct/range {v8 .. v25}, Lw8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    move-object v10, v8

    goto :goto_4

    :cond_a
    :goto_3
    const/4 v10, 0x0

    :goto_4
    new-instance v4, Lqa/a;

    if-eqz v10, :cond_b

    invoke-static {v10}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v1

    :goto_5
    move-object v5, v1

    goto :goto_6

    :cond_b
    sget-object v1, Lzr/g0;->x:Lzr/e0;

    sget-object v1, Lzr/w0;->E:Lzr/w0;

    goto :goto_5

    :goto_6
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/32 v8, 0x4c4b40

    invoke-direct/range {v4 .. v9}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    invoke-interface {v3, v4}, Lx8/d;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_5
    const/16 v18, 0x3

    iget-object v4, v0, Lq/f;->z:Ljava/lang/Object;

    check-cast v4, Lao/a;

    iget-object v5, v0, Lq/f;->y:Ljava/lang/Object;

    check-cast v5, Lx8/n;

    iget-object v6, v0, Lq/f;->x:Ljava/lang/Object;

    check-cast v6, Lx8/n;

    add-int v10, v2, p3

    invoke-virtual {v6, v10, v1}, Lx8/n;->D(I[B)V

    invoke-virtual {v6, v2}, Lx8/n;->F(I)V

    iget-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/zip/Inflater;

    if-nez v1, :cond_c

    new-instance v1, Ljava/util/zip/Inflater;

    invoke-direct {v1}, Ljava/util/zip/Inflater;-><init>()V

    iput-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    :cond_c
    iget-object v1, v0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, Ljava/util/zip/Inflater;

    sget v2, Lx8/t;->a:I

    invoke-virtual {v6}, Lx8/n;->a()I

    move-result v2

    if-lez v2, :cond_d

    iget-object v2, v6, Lx8/n;->a:[B

    iget v10, v6, Lx8/n;->b:I

    aget-byte v2, v2, v10

    and-int/2addr v2, v8

    if-ne v2, v7, :cond_d

    invoke-static {v6, v5, v1}, Lx8/t;->E(Lx8/n;Lx8/n;Ljava/util/zip/Inflater;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v5, Lx8/n;->a:[B

    iget v2, v5, Lx8/n;->c:I

    invoke-virtual {v6, v2, v1}, Lx8/n;->D(I[B)V

    :cond_d
    iput v9, v4, Lao/a;->c:I

    iget-object v1, v4, Lao/a;->a:[I

    iget-object v2, v4, Lao/a;->i:Ljava/lang/Object;

    check-cast v2, Lx8/n;

    iput v9, v4, Lao/a;->d:I

    iput v9, v4, Lao/a;->e:I

    iput v9, v4, Lao/a;->f:I

    iput v9, v4, Lao/a;->g:I

    iput v9, v4, Lao/a;->h:I

    invoke-virtual {v2, v9}, Lx8/n;->C(I)V

    iput-boolean v9, v4, Lao/a;->b:Z

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :goto_7
    invoke-virtual {v6}, Lx8/n;->a()I

    move-result v7

    move/from16 v10, v18

    if-lt v7, v10, :cond_21

    iget v7, v6, Lx8/n;->c:I

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v10

    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v13

    iget v14, v6, Lx8/n;->b:I

    add-int/2addr v14, v13

    if-le v14, v7, :cond_e

    invoke-virtual {v6, v7}, Lx8/n;->F(I)V

    move-object/from16 p2, v1

    move v11, v9

    move v0, v12

    const/4 v1, 0x0

    const/16 v17, 0x4

    move v9, v8

    goto/16 :goto_16

    :cond_e
    const/16 v7, 0x80

    if-eq v10, v7, :cond_18

    packed-switch v10, :pswitch_data_2

    :goto_8
    move-object/from16 p2, v1

    move v9, v8

    move v0, v12

    const/16 v17, 0x4

    goto/16 :goto_d

    :pswitch_6
    const/16 v7, 0x13

    if-ge v13, v7, :cond_f

    goto :goto_8

    :cond_f
    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v7

    iput v7, v4, Lao/a;->c:I

    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v7

    iput v7, v4, Lao/a;->d:I

    const/16 v7, 0xb

    invoke-virtual {v6, v7}, Lx8/n;->G(I)V

    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v7

    iput v7, v4, Lao/a;->e:I

    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v7

    iput v7, v4, Lao/a;->f:I

    goto :goto_8

    :pswitch_7
    const/4 v10, 0x4

    if-ge v13, v10, :cond_10

    move/from16 v17, v10

    goto :goto_b

    :cond_10
    const/4 v10, 0x3

    invoke-virtual {v6, v10}, Lx8/n;->G(I)V

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v15

    and-int/2addr v7, v15

    if-eqz v7, :cond_11

    move v7, v12

    goto :goto_9

    :cond_11
    move v7, v9

    :goto_9
    add-int/lit8 v15, v13, -0x4

    if-eqz v7, :cond_14

    const/4 v7, 0x7

    if-ge v15, v7, :cond_12

    const/16 v17, 0x4

    goto :goto_b

    :cond_12
    invoke-virtual {v6}, Lx8/n;->w()I

    move-result v7

    const/4 v15, 0x4

    if-ge v7, v15, :cond_13

    move/from16 v17, v15

    goto :goto_b

    :cond_13
    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v10

    iput v10, v4, Lao/a;->g:I

    invoke-virtual {v6}, Lx8/n;->z()I

    move-result v10

    iput v10, v4, Lao/a;->h:I

    add-int/lit8 v7, v7, -0x4

    invoke-virtual {v2, v7}, Lx8/n;->C(I)V

    add-int/lit8 v7, v13, -0xb

    move/from16 v17, v15

    move v15, v7

    goto :goto_a

    :cond_14
    const/16 v17, 0x4

    :goto_a
    iget v7, v2, Lx8/n;->b:I

    iget v10, v2, Lx8/n;->c:I

    if-ge v7, v10, :cond_15

    if-lez v15, :cond_15

    sub-int/2addr v10, v7

    invoke-static {v15, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v13, v2, Lx8/n;->a:[B

    invoke-virtual {v6, v13, v7, v10}, Lx8/n;->e([BII)V

    add-int/2addr v7, v10

    invoke-virtual {v2, v7}, Lx8/n;->F(I)V

    :cond_15
    :goto_b
    move-object/from16 p2, v1

    move v9, v8

    move v0, v12

    goto/16 :goto_d

    :pswitch_8
    const/16 v17, 0x4

    rem-int/lit8 v10, v13, 0x5

    if-eq v10, v11, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual {v6, v11}, Lx8/n;->G(I)V

    invoke-static {v1, v9}, Ljava/util/Arrays;->fill([II)V

    div-int/lit8 v13, v13, 0x5

    move v10, v9

    :goto_c
    if-ge v10, v13, :cond_17

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v15

    move/from16 p1, v7

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v7

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v16

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v19

    invoke-virtual {v6}, Lx8/n;->t()I

    move-result v20

    int-to-double v11, v7

    add-int/lit8 v7, v16, -0x80

    int-to-double v8, v7

    const-wide v24, 0x3ff66e978d4fdf3bL    # 1.402

    mul-double v24, v24, v8

    move-object v7, v1

    add-double v0, v24, v11

    double-to-int v0, v0

    add-int/lit8 v1, v19, -0x80

    move-object/from16 p2, v7

    move-wide/from16 v24, v8

    int-to-double v7, v1

    const-wide v26, 0x3fd60663c74fb54aL    # 0.34414

    mul-double v26, v26, v7

    sub-double v26, v11, v26

    const-wide v28, 0x3fe6da3c21187e7cL    # 0.71414

    mul-double v24, v24, v28

    move-wide/from16 v28, v7

    sub-double v7, v26, v24

    double-to-int v1, v7

    const-wide v7, 0x3ffc5a1cac083127L    # 1.772

    mul-double v7, v7, v28

    add-double/2addr v7, v11

    double-to-int v7, v7

    shl-int/lit8 v8, v20, 0x18

    const/16 v9, 0xff

    const/4 v11, 0x0

    invoke-static {v0, v11, v9}, Lx8/t;->g(III)I

    move-result v0

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v8

    invoke-static {v1, v11, v9}, Lx8/t;->g(III)I

    move-result v1

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-static {v7, v11, v9}, Lx8/t;->g(III)I

    move-result v1

    or-int/2addr v0, v1

    aput v0, p2, v15

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v0, p0

    move/from16 v7, p1

    move-object/from16 v1, p2

    move v8, v9

    const/4 v9, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x1

    goto :goto_c

    :cond_17
    move-object/from16 p2, v1

    move v9, v8

    move v0, v12

    iput-boolean v0, v4, Lao/a;->b:Z

    :goto_d
    const/4 v11, 0x0

    const/16 v24, 0x0

    goto/16 :goto_15

    :cond_18
    move-object/from16 p2, v1

    move v9, v8

    move v0, v12

    const/16 v17, 0x4

    iget v1, v4, Lao/a;->c:I

    if-eqz v1, :cond_1f

    iget v1, v4, Lao/a;->d:I

    if-eqz v1, :cond_1f

    iget v1, v4, Lao/a;->g:I

    if-eqz v1, :cond_1f

    iget v1, v4, Lao/a;->h:I

    if-eqz v1, :cond_1f

    iget v1, v2, Lx8/n;->c:I

    if-eqz v1, :cond_1f

    iget v7, v2, Lx8/n;->b:I

    if-ne v7, v1, :cond_1f

    iget-boolean v1, v4, Lao/a;->b:Z

    if-nez v1, :cond_19

    goto/16 :goto_13

    :cond_19
    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Lx8/n;->F(I)V

    iget v1, v4, Lao/a;->g:I

    iget v7, v4, Lao/a;->h:I

    mul-int/2addr v1, v7

    new-array v7, v1, [I

    const/4 v11, 0x0

    :cond_1a
    :goto_e
    if-ge v11, v1, :cond_1e

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v8

    if-eqz v8, :cond_1b

    add-int/lit8 v10, v11, 0x1

    aget v8, p2, v8

    aput v8, v7, v11

    :goto_f
    move v11, v10

    goto :goto_e

    :cond_1b
    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v8

    if-eqz v8, :cond_1a

    and-int/lit8 v10, v8, 0x40

    if-nez v10, :cond_1c

    and-int/lit8 v10, v8, 0x3f

    goto :goto_10

    :cond_1c
    and-int/lit8 v10, v8, 0x3f

    shl-int/lit8 v10, v10, 0x8

    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v12

    or-int/2addr v10, v12

    :goto_10
    and-int/lit16 v8, v8, 0x80

    if-nez v8, :cond_1d

    const/16 v23, 0x0

    aget v8, p2, v23

    goto :goto_11

    :cond_1d
    invoke-virtual {v2}, Lx8/n;->t()I

    move-result v8

    aget v8, p2, v8

    :goto_11
    add-int/2addr v10, v11

    invoke-static {v7, v11, v10, v8}, Ljava/util/Arrays;->fill([IIII)V

    goto :goto_f

    :cond_1e
    iget v1, v4, Lao/a;->g:I

    iget v8, v4, Lao/a;->h:I

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v1, v8, v10}, Landroid/graphics/Bitmap;->createBitmap([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v28

    iget v1, v4, Lao/a;->e:I

    int-to-float v1, v1

    iget v7, v4, Lao/a;->c:I

    int-to-float v7, v7

    div-float v32, v1, v7

    iget v1, v4, Lao/a;->f:I

    int-to-float v1, v1

    iget v8, v4, Lao/a;->d:I

    int-to-float v8, v8

    div-float v29, v1, v8

    iget v1, v4, Lao/a;->g:I

    int-to-float v1, v1

    div-float v36, v1, v7

    iget v1, v4, Lao/a;->h:I

    int-to-float v1, v1

    div-float v37, v1, v8

    new-instance v24, Lw8/b;

    const/16 v25, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/high16 v34, -0x80000000

    const v35, -0x800001

    const/16 v38, 0x0

    const/high16 v39, -0x1000000

    const/16 v41, 0x0

    move-object/from16 v26, v25

    move-object/from16 v27, v25

    move/from16 v40, v34

    invoke-direct/range {v24 .. v41}, Lw8/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    :goto_12
    const/4 v11, 0x0

    goto :goto_14

    :cond_1f
    :goto_13
    const/16 v24, 0x0

    goto :goto_12

    :goto_14
    iput v11, v4, Lao/a;->c:I

    iput v11, v4, Lao/a;->d:I

    iput v11, v4, Lao/a;->e:I

    iput v11, v4, Lao/a;->f:I

    iput v11, v4, Lao/a;->g:I

    iput v11, v4, Lao/a;->h:I

    invoke-virtual {v2, v11}, Lx8/n;->C(I)V

    iput-boolean v11, v4, Lao/a;->b:Z

    :goto_15
    invoke-virtual {v6, v14}, Lx8/n;->F(I)V

    move-object/from16 v1, v24

    :goto_16
    if-eqz v1, :cond_20

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_20
    move-object/from16 v1, p2

    move v12, v0

    move v8, v9

    move v9, v11

    const/4 v11, 0x2

    const/16 v18, 0x3

    move-object/from16 v0, p0

    goto/16 :goto_7

    :cond_21
    new-instance v19, Lqa/a;

    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v23, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v20, v5

    invoke-direct/range {v19 .. v24}, Lqa/a;-><init>(Ljava/util/List;JJ)V

    move-object/from16 v0, v19

    invoke-interface {v3, v0}, Lx8/d;->accept(Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x14
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method public k0()Ly00/s4;
    .locals 9

    new-instance v0, Ly00/s4;

    iget-object v1, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    iget-object v3, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Integer;

    iget-object v4, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    const/4 v7, 0x0

    const/16 v8, 0x30

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Ly00/s4;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ly00/r4;I)V

    return-object v0
.end method

.method public l(IFLjava/lang/Float;)V
    .locals 2

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-static {p1}, Lrv/n;->g(I)[F

    move-result-object p1

    const/4 v1, 0x3

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result p3

    aput p3, p1, v1

    float-to-double p2, p2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, p2, p3}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    const-string p2, "emphasis-circle-radius"

    invoke-virtual {v0, p2, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    invoke-static {p1}, Lrv/n;->d([F)Ljava/util/ArrayList;

    move-result-object p1

    new-instance p2, Lcom/mapbox/bindgen/Value;

    invoke-direct {p2, p1}, Lcom/mapbox/bindgen/Value;-><init>(Ljava/util/List;)V

    const-string p1, "emphasis-circle-color"

    invoke-virtual {v0, p1, p2}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public l0(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 6

    invoke-virtual {p0}, Lq/f;->u0()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, ", code: "

    const-string v4, ", reason: "

    const-string v5, "[close], source:"

    invoke-static {p1, v5, p2, v1, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-interface {v0, v2, v3, p2, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast p2, Lud3/e1;

    check-cast p2, Lle3/g;

    invoke-virtual {p2, p1, p3}, Lle3/g;->b(ILjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public m(Laf3/k;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public n(D)V
    .locals 2

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lrv/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lcom/mapbox/bindgen/Value;

    invoke-direct {v1, p1, p2}, Lcom/mapbox/bindgen/Value;-><init>(D)V

    const-string p1, "bearing"

    invoke-virtual {v0, p1, v1}, Lrv/o;->d(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    return-void
.end method

.method public n0(Lrb3/g;Ljava/lang/String;)Lq/f;
    .locals 5

    const-string v0, "connectionConf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lud3/n0;

    invoke-direct {v0}, Lud3/n0;-><init>()V

    invoke-virtual {p1}, Lrb3/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    const-string p1, "Connection"

    const-string v1, "Upgrade"

    invoke-virtual {v0, p1, v1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "websocket"

    invoke-virtual {v0, v1, p1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast p1, Lx33/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lx33/a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "X-Stream-Client"

    invoke-virtual {v0, v1, p1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[createSocket] new web socket: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p1, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance v0, Lq/f;

    iget-object v1, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lx43/e;

    new-instance v2, Lb2/z;

    const/16 v3, 0x19

    invoke-direct {v2, v3, p0, p1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, p2, v1, v2}, Lq/f;-><init>(Ljava/lang/String;Lx43/e;Lb2/z;)V

    return-object v0
.end method

.method public o(Lq/b;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lq/f;->t0(Lq/b;)Lq/g;

    move-result-object p1

    new-instance v1, Lr/s;

    iget-object v2, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    check-cast p2, Lx4/a;

    invoke-direct {v1, v2, p2}, Lr/s;-><init>(Landroid/content/Context;Lx4/a;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public o0(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, La0/f1;

    invoke-virtual {v0, p1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3, p2, p3}, Lq/f;->o0(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Laf3/g;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public p0(Lu2/k;Z)V
    .locals 8

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lu2/y;

    iget-object v1, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0, p1}, Lq/f;->S0(Lu2/k;)V

    return-void

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v3, Ly2/y;

    if-eqz v3, :cond_4

    const-wide/16 v5, 0x0

    invoke-interface {v3, v5, v6}, Ly2/y;->Z(J)J

    move-result-wide v5

    new-instance v3, Lb2/z;

    const/16 v7, 0x18

    invoke-direct {v3, v7, p0, v0}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v5, v6, v3, v4}, Lu2/d0;->n(Lu2/k;JLkotlin/jvm/functions/Function1;Z)V

    iget-object v3, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v3, Lu2/w;

    sget-object v5, Lu2/w;->x:Lu2/w;

    if-ne v3, v5, :cond_3

    if-eqz p2, :cond_2

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result p2

    :goto_1
    if-ge v4, p2, :cond_2

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-virtual {v2}, Lu2/r;->a()V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p1, Lu2/k;->b:Lf1/p1;

    if-eqz p1, :cond_3

    iget-boolean p2, v0, Lu2/y;->y:Z

    xor-int/lit8 p2, p2, 0x1

    iput-boolean p2, p1, Lf1/p1;->x:Z

    :cond_3
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "layoutCoordinates not set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public q(Laf3/n;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public r(Laf3/p;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public r0()V
    .locals 3

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lz63/h;

    iget-object v1, v0, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    if-eq v2, v1, :cond_0

    invoke-virtual {v0, v2}, Lz63/h;->a(C)V

    :cond_0
    return-void
.end method

.method public s()V
    .locals 5

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Ltp/v;

    iget-object v2, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v2, Ltp/g;

    iget-object v3, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v3, Ltp/u;

    const/4 v4, 0x0

    iput-boolean v4, v1, Ltp/v;->w:Z

    invoke-virtual {v0, v2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->removeLocationUpdates(Ltp/g;)Lcom/google/android/gms/tasks/Task;

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ltp/u;->s()V

    :cond_0
    return-void
.end method

.method public s0(Lvz/c;Ljava/util/Map;)V
    .locals 3

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lyy/j;

    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lb10/b;

    invoke-interface {p1}, Lvz/c;->getParams()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    invoke-virtual {v1, p1, p2}, Lb10/b;->a(Lyy/a;Ljava/util/Map;)Lyy/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lyy/j;->a(Lyy/b;)V

    return-void
.end method

.method public t(Lq/b;Landroid/view/Menu;)Z
    .locals 5

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lq/f;->t0(Lq/b;)Lq/g;

    move-result-object p1

    iget-object v1, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, La0/f1;

    invoke-virtual {v1, p2}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Menu;

    if-nez v2, :cond_0

    new-instance v2, Lr/a0;

    iget-object v3, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    move-object v4, p2

    check-cast v4, Lr/l;

    invoke-direct {v2, v3, v4}, Lr/a0;-><init>(Landroid/content/Context;Lr/l;)V

    invoke-virtual {v1, p2, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public t0(Lq/b;)Lq/g;
    .locals 5

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lq/g;

    if-eqz v3, :cond_0

    iget-object v4, v3, Lq/g;->b:Lq/b;

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lq/g;

    iget-object v2, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2, p1}, Lq/g;-><init>(Landroid/content/Context;Lq/b;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v1
.end method

.method public u(Laf3/d;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public u0()Lb23/k;
    .locals 1

    iget-object v0, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public v(Laf3/q;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public v0(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 19

    move-object/from16 v1, p0

    iget-object v0, v1, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Lo30/d;

    iget-object v2, v1, Lq/f;->y:Ljava/lang/Object;

    check-cast v2, Ljavax/crypto/SecretKey;

    move-object v3, v0

    check-cast v3, Lo30/b;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static/range {p1 .. p1}, Lgw/g;->a(Ljava/lang/String;)[Lxw/b;

    move-result-object v0

    array-length v4, v0

    const/4 v5, 0x5

    const/4 v6, 0x0

    if-ne v4, v5, :cond_10

    new-instance v4, Lgw/l;

    aget-object v5, v0, v6

    const/4 v7, 0x1

    aget-object v8, v0, v7

    const/4 v9, 0x2

    aget-object v10, v0, v9

    const/4 v11, 0x3

    aget-object v12, v0, v11

    const/4 v13, 0x4

    aget-object v0, v0, v13

    invoke-direct {v4}, Lgw/g;-><init>()V

    :try_start_0
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Lgw/k;->c(Lxw/b;)Lgw/k;

    move-result-object v5

    iput-object v5, v4, Lgw/l;->x:Lgw/k;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v5, 0x0

    if-eqz v8, :cond_1

    iget-object v6, v8, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    iput-object v8, v4, Lgw/l;->y:Lxw/b;

    goto :goto_1

    :cond_1
    :goto_0
    iput-object v5, v4, Lgw/l;->y:Lxw/b;

    :goto_1
    if-eqz v10, :cond_3

    iget-object v6, v10, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    iput-object v10, v4, Lgw/l;->z:Lxw/b;

    goto :goto_3

    :cond_3
    :goto_2
    iput-object v5, v4, Lgw/l;->z:Lxw/b;

    :goto_3
    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v12, v4, Lgw/l;->E:Lxw/b;

    if-eqz v0, :cond_5

    iget-object v6, v0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    iput-object v0, v4, Lgw/l;->F:Lxw/b;

    goto :goto_5

    :cond_5
    :goto_4
    iput-object v5, v4, Lgw/l;->F:Lxw/b;

    :goto_5
    iput v9, v4, Lgw/l;->G:I

    iget-object v0, v4, Lgw/l;->x:Lgw/k;

    iget-object v0, v0, Lgw/k;->O:Lgw/f;

    const-string v5, "getEncryptionMethod(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    move-result-object v2

    sget-object v5, Lgw/f;->I:Lgw/f;

    if-ne v5, v0, :cond_6

    array-length v0, v2

    iget v5, v5, Lgw/f;->y:I

    div-int/lit8 v5, v5, 0x8

    sub-int/2addr v0, v5

    array-length v5, v2

    invoke-static {v2, v0, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_6

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_6
    new-instance v12, Lhw/a;

    invoke-direct {v12, v2}, Lhw/a;-><init>([B)V

    monitor-enter v4

    :try_start_1
    iget v0, v4, Lgw/l;->G:I

    if-ne v0, v9, :cond_f

    iget-object v0, v4, Lgw/l;->x:Lgw/k;

    iget-object v0, v0, Lgw/k;->Q:Lgw/d;

    if-eqz v0, :cond_8

    iget-object v0, v4, Lgw/l;->E:Lxw/b;

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const v2, 0x186a0

    if-gt v0, v2, :cond_7

    goto :goto_7

    :cond_7
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    const-string v2, "The JWE compressed cipher text exceeds the maximum allowed length of 100000 characters"

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    goto/16 :goto_c

    :cond_8
    :goto_7
    :try_start_2
    new-instance v0, Lgw/r;

    iget-object v13, v4, Lgw/l;->x:Lgw/k;

    iget-object v14, v4, Lgw/l;->y:Lxw/b;

    iget-object v15, v4, Lgw/l;->z:Lxw/b;

    iget-object v2, v4, Lgw/l;->E:Lxw/b;

    iget-object v5, v4, Lgw/l;->F:Lxw/b;

    invoke-virtual {v13}, Lgw/c;->a()Lxw/b;

    move-result-object v6

    iget-object v6, v6, Lxw/a;->w:Ljava/lang/String;

    sget-object v8, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v6, v8}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v18

    move-object/from16 v16, v2

    move-object/from16 v17, v5

    invoke-virtual/range {v12 .. v18}, Lhw/a;->c(Lgw/k;Lxw/b;Lxw/b;Lxw/b;Lxw/b;[B)[B

    move-result-object v2

    invoke-direct {v0, v2}, Lgw/r;-><init>([B)V

    iput-object v0, v4, Lgw/g;->w:Lgw/r;
    :try_end_2
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iput v11, v4, Lgw/l;->G:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v4

    iget-object v0, v4, Lgw/l;->x:Lgw/k;

    invoke-virtual {v0}, Lgw/c;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lo30/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v4, Lgw/l;->z:Lxw/b;

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lo30/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v4, Lgw/l;->E:Lxw/b;

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lo30/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v4, Lgw/l;->F:Lxw/b;

    iget-object v0, v0, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lo30/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v2, Lorg/json/JSONObject;

    iget-object v0, v4, Lgw/g;->w:Lgw/r;

    invoke-virtual {v0}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v4, "acsCounterAtoS"

    iget-boolean v0, v3, Lo30/b;->w:Z

    if-nez v0, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    :try_start_4
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "getString(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_c

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    move-result v0

    iget-byte v4, v3, Lo30/b;->y:B

    if-ne v4, v0, :cond_b

    :goto_9
    iget-byte v0, v3, Lo30/b;->y:B

    add-int/2addr v0, v7

    int-to-byte v0, v0

    iput-byte v0, v3, Lo30/b;->y:B

    if-eqz v0, :cond_a

    return-object v2

    :cond_a
    const-string v0, "ACS to SDK counter is zero"

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_b
    new-instance v2, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v4, Lr30/i;->z:Lr30/i;

    iget-byte v3, v3, Lo30/b;->y:B

    const-string v5, "Counters are not equal. SDK counter: "

    const-string v6, ", ACS counter: "

    invoke-static {v3, v0, v5, v6}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lr30/i;Ljava/lang/String;)V

    throw v2

    :cond_c
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v4}, Lo73/a;->w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_d
    sget v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;->z:I

    invoke-static {v4}, Lo73/a;->x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    move-result-object v0

    throw v0

    :cond_e
    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v2, Lr30/i;->z:Lr30/i;

    const-string v3, "Invalid encryption."

    invoke-direct {v0, v2, v3}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(Lr30/i;Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    goto :goto_b

    :goto_a
    :try_start_5
    new-instance v2, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_b
    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "The JWE object must be in an encrypted state"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_c
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v0

    :catch_2
    move-exception v0

    new-instance v2, Ljava/text/ParseException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid JWE header: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v6}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v2

    :cond_10
    new-instance v0, Ljava/text/ParseException;

    const-string v2, "Unexpected number of Base64URL parts, must be five"

    invoke-direct {v0, v2, v6}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method

.method public w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public w0()I
    .locals 1

    iget-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lz63/h;

    iget-object v0, v0, Lz63/h;->w:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    return v0
.end method

.method public x(ILsn/v;Lsn/m;Ll9/y;)V
    .locals 1

    iget v0, p0, Lq/f;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lq/f;->y0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p0, p4}, Lq/f;->z0(Ll9/y;)Ll9/y;

    move-result-object p2

    invoke-virtual {p1, p3, p2}, Lsn/z;->f(Lsn/m;Ll9/y;)V

    :cond_0
    return-void

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lq/f;->x0(ILsn/v;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p1, Lsn/z;

    invoke-virtual {p1, p3, p4}, Lsn/z;->f(Lsn/m;Ll9/y;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public x0(ILsn/v;)Z
    .locals 9

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lb9/b1;

    iget-object v1, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lrm/t0;

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    iget-object v5, v1, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    iget-object v5, v1, Lrm/t0;->c:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lsn/v;

    iget-wide v5, v5, Lsn/t;->d:J

    iget-wide v7, p2, Lsn/t;->d:J

    cmp-long v5, v5, v7

    if-nez v5, :cond_0

    iget-object v2, p2, Lsn/t;->a:Ljava/lang/Object;

    iget-object v4, v1, Lrm/t0;->b:Ljava/lang/Object;

    invoke-static {v4, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v2

    invoke-virtual {p2, v2}, Lsn/v;->b(Ljava/lang/Object;)Lsn/v;

    move-result-object v2

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    return v3

    :cond_2
    iget p2, v1, Lrm/t0;->d:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast p2, Lsn/z;

    iget v1, p2, Lsn/z;->a:I

    if-ne v1, p1, :cond_3

    iget-object p2, p2, Lsn/z;->b:Lsn/v;

    invoke-static {p2, v2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    :cond_3
    iget-object p2, v0, Lb9/b1;->j:Ljava/lang/Object;

    check-cast p2, Lsn/z;

    new-instance v1, Lsn/z;

    iget-object p2, p2, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1, p2, p1, v2}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iput-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    :cond_4
    iget-object p2, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast p2, Lsn/z;

    iget v1, p2, Lsn/z;->a:I

    const/4 v3, 0x1

    if-ne v1, p1, :cond_6

    iget-object p2, p2, Lsn/z;->b:Lsn/v;

    invoke-static {p2, v2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    return v3

    :cond_6
    :goto_2
    iget-object p2, v0, Lb9/b1;->k:Ljava/lang/Object;

    check-cast p2, Lsn/z;

    new-instance v0, Lsn/z;

    iget-object p2, p2, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, p2, p1, v2}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iput-object v0, p0, Lq/f;->z:Ljava/lang/Object;

    return v3
.end method

.method public y(Laf3/b;)V
    .locals 0

    invoke-virtual {p0, p1}, Lq/f;->U0(Laf3/t;)V

    return-void
.end method

.method public y0(ILsn/v;)Z
    .locals 3

    iget-object v0, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v0, Lsn/h;

    if-eqz p2, :cond_0

    iget-object v1, p0, Lq/f;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1, p2}, Lsn/h;->p(Ljava/lang/Object;Lsn/v;)Lsn/v;

    move-result-object p2

    if-nez p2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p2, 0x0

    :cond_1
    iget-object v1, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lsn/z;

    iget v2, v1, Lsn/z;->a:I

    if-ne v2, p1, :cond_2

    iget-object v1, v1, Lsn/z;->b:Lsn/v;

    invoke-static {v1, p2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    iget-object v1, v0, Lsn/a;->c:Lsn/z;

    new-instance v2, Lsn/z;

    iget-object v1, v1, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2, v1, p1, p2}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iput-object v2, p0, Lq/f;->y:Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lq/f;->z:Ljava/lang/Object;

    check-cast v1, Lsn/z;

    iget v2, v1, Lsn/z;->a:I

    if-ne v2, p1, :cond_4

    iget-object v1, v1, Lsn/z;->b:Lsn/v;

    invoke-static {v1, p2}, Llo/y;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_4
    iget-object v0, v0, Lsn/a;->d:Lsn/z;

    new-instance v1, Lsn/z;

    iget-object v0, v0, Lsn/z;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1, v0, p1, p2}, Lsn/z;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILsn/v;)V

    iput-object v1, p0, Lq/f;->z:Ljava/lang/Object;

    :cond_5
    const/4 p1, 0x1

    return p1
.end method

.method public z(Lq/b;Landroid/view/Menu;)Z
    .locals 5

    iget-object v0, p0, Lq/f;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lq/f;->t0(Lq/b;)Lq/g;

    move-result-object p1

    iget-object v1, p0, Lq/f;->E:Ljava/lang/Object;

    check-cast v1, La0/f1;

    invoke-virtual {v1, p2}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/Menu;

    if-nez v2, :cond_0

    new-instance v2, Lr/a0;

    iget-object v3, p0, Lq/f;->y:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    move-object v4, p2

    check-cast v4, Lr/l;

    invoke-direct {v2, v3, v4}, Lr/a0;-><init>(Landroid/content/Context;Lr/l;)V

    invoke-virtual {v1, p2, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p1, v2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public z0(Ll9/y;)Ll9/y;
    .locals 10

    iget-wide v6, p1, Ll9/y;->e:J

    iget-wide v8, p1, Ll9/y;->f:J

    cmp-long v0, v6, v6

    if-nez v0, :cond_0

    cmp-long v0, v8, v8

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll9/y;

    iget v1, p1, Ll9/y;->a:I

    iget v2, p1, Ll9/y;->b:I

    iget-object v3, p1, Ll9/y;->g:Ljava/lang/Object;

    check-cast v3, Lrm/c0;

    iget v4, p1, Ll9/y;->c:I

    iget-object v5, p1, Ll9/y;->d:Ljava/lang/Object;

    invoke-direct/range {v0 .. v9}, Ll9/y;-><init>(IILjava/lang/Object;ILjava/lang/Object;JJ)V

    return-object v0
.end method
