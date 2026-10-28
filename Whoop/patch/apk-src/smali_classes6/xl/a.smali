.class public final Lxl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/o1;
.implements Lh5/u;
.implements Li20/u0;
.implements Ln3/d;
.implements Lno/nordicsemi/android/ble/d0;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 8

    iput p1, p0, Lxl/a;->w:I

    sparse-switch p1, :sswitch_data_0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Ljava/util/TreeSet;

    invoke-direct {p1}, Ljava/util/TreeSet;-><init>()V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 29
    :try_start_0
    const-class p1, Lxl/a;

    invoke-virtual {p1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    const-string v0, "leap_second_dates.csv"

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    :try_start_1
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    const-string v2, "leap_second_dates.csv was not found on the classpath"

    invoke-static {p1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :cond_0
    :goto_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 33
    iget-object v2, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/TreeSet;

    invoke-static {v0}, Ljava/time/YearMonth;->parse(Ljava/lang/CharSequence;)Ljava/time/YearMonth;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_1

    .line 34
    :cond_1
    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 35
    iget-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/TreeSet;

    invoke-virtual {p1}, Ljava/util/TreeSet;->last()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/time/YearMonth;

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_3

    .line 36
    :goto_1
    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_6
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_3
    if-eqz p1, :cond_2

    :try_start_7
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_8
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_2
    :goto_4
    throw v1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 37
    :goto_5
    new-instance v0, Ljava/io/UncheckedIOException;

    invoke-direct {v0, p1}, Ljava/io/UncheckedIOException;-><init>(Ljava/io/IOException;)V

    throw v0

    .line 38
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    new-instance v1, Lm43/b;

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 40
    invoke-direct/range {v1 .. v7}, Lm43/b;-><init>(Lio/getstream/video/android/model/StreamCallId;Ljava/lang/Integer;La30/w0;Li43/b;ZLjava/lang/Long;)V

    .line 41
    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 42
    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    .line 43
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    .line 46
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    return-void

    .line 48
    :sswitch_3
    new-instance p1, La33/d;

    const/16 v0, 0x9

    invoke-direct {p1, v0}, La33/d;-><init>(I)V

    const/16 v0, 0xa

    new-array v0, v0, [J

    const/4 v1, 0x7

    invoke-direct {p0, v1, p1, v0}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 49
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 51
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_4
        0x7 -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxl/a;->w:I

    iput-object p2, p0, Lxl/a;->x:Ljava/lang/Object;

    iput-object p3, p0, Lxl/a;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 2
    iput p1, p0, Lxl/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxl/a;->w:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 65
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;Lb9/c0;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lxl/a;->w:I

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_0

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 60
    :goto_0
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 61
    iput-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 5

    const/16 v0, 0x11

    iput v0, p0, Lxl/a;->w:I

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 71
    new-instance v0, Lj6/i;

    invoke-direct {v0, p1}, Lj6/i;-><init>(Landroid/widget/EditText;)V

    iput-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    .line 72
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 73
    sget-object v0, Lj6/a;->b:Lj6/a;

    if-nez v0, :cond_1

    .line 74
    sget-object v0, Lj6/a;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 75
    :try_start_0
    sget-object v1, Lj6/a;->b:Lj6/a;

    if-nez v1, :cond_0

    .line 76
    new-instance v1, Lj6/a;

    .line 77
    invoke-direct {v1}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    :try_start_1
    const-string v2, "android.text.DynamicLayout$ChangeWatcher"

    .line 79
    const-class v3, Lj6/a;

    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    sput-object v2, Lj6/a;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :catchall_0
    :try_start_2
    sput-object v1, Lj6/a;->b:Lj6/a;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 81
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 82
    :cond_1
    :goto_2
    sget-object v0, Lj6/a;->b:Lj6/a;

    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method

.method public constructor <init>(Landroidx/viewpager/widget/ViewPager;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lxl/a;->w:I

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    .line 85
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/crypto/tink/internal/k0;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 0

    const/16 p3, 0x18

    iput p3, p0, Lxl/a;->w:I

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/iterable/iterableapi/q;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lxl/a;->w:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 17
    sget-object p1, Llg/a;->E:Llg/a;

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/wire/n;Lib/m;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lxl/a;->w:I

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 53
    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    .line 54
    iput-object p2, p0, Lxl/a;->x:Ljava/lang/Object;

    return-void

    .line 55
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "DataSource.Factory must be provided"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lgm/r;Lq30/w0;)V
    .locals 1

    const/16 v0, 0x19

    iput v0, p0, Lxl/a;->w:I

    const-string v0, "apiRequestFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 14
    iput-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;I)V
    .locals 0

    iput p2, p0, Lxl/a;->w:I

    packed-switch p2, :pswitch_data_0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lt9/k0;

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    .line 21
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [Lwm/s;

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lk83/a;Li20/p0;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lxl/a;->w:I

    const-string v0, "autoCompleteViewModelSubcomponentFactoryProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 68
    iput-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln30/d;)V
    .locals 2

    const/16 v0, 0x17

    iput v0, p0, Lxl/a;->w:I

    .line 3
    const-string v0, "errorReporter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 6
    :try_start_0
    const-string p1, "EC"

    invoke-static {p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    .line 8
    :goto_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Ln30/d;

    check-cast v1, Ln30/c;

    invoke-virtual {v1, v0}, Ln30/c;->c(Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "getOrElse(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/security/KeyFactory;

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void

    .line 11
    :cond_1
    new-instance p1, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {p1, v0}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public constructor <init>(Lno/nordicsemi/android/ble/k0;Landroid/os/Handler;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lxl/a;->w:I

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    iput-object p2, p0, Lxl/a;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lup/c;La0/a1;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lxl/a;->w:I

    const-string v0, "mapView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    .line 26
    iput-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([F)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lxl/a;->w:I

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 87
    new-array p1, p1, [I

    iput-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public static q(Lxl/a;Lqg3/d;)V
    .locals 5

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, La33/d;

    iget-object v1, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, [J

    iget-object v2, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, La33/d;

    iget-object v3, v2, La33/d;->x:Ljava/lang/Object;

    check-cast v3, [J

    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, [J

    invoke-static {v1, v3, p1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object v1, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v1, [J

    iget-object v3, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v3, [J

    iget-object v4, v2, La33/d;->z:Ljava/lang/Object;

    check-cast v4, [J

    invoke-static {v1, v3, v4}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object v0, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v0, [J

    invoke-static {v0, v4, p1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object p0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast p0, [J

    iget-object p1, v2, La33/d;->x:Ljava/lang/Object;

    check-cast p1, [J

    iget-object v0, v2, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    invoke-static {p0, p1, v0}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    return-void
.end method

.method public static u(II)I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v1, p0, :cond_2

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    if-le v2, p1, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v2, v4

    if-le v2, p1, :cond_3

    add-int/2addr v3, v4

    :cond_3
    return v3
.end method


# virtual methods
.method public A()[C
    .locals 8

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/q;

    const-string v1, ";"

    const-string v2, "trying to read a char/entity reference"

    invoke-virtual {v0, v1, v2}, Lcom/iterable/iterableapi/q;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "trying to read the end of a char/entity reference"

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v2}, Lcom/iterable/iterableapi/q;->a(ILjava/lang/String;)V

    sget-object v2, Llg/f;->a:Lyb3/p;

    invoke-virtual {v2, v1}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lrv/n;->f(I)[C

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v2, Llg/f;->b:Lyb3/p;

    invoke-virtual {v2, v1}, Lyb3/p;->d(Ljava/lang/CharSequence;)Lyb3/n;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lyb3/n;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Lyb3/l;

    invoke-virtual {v0, v3}, Lyb3/l;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/16 v1, 0x10

    invoke-static {v1}, Lva3/d;->c(I)V

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Lrv/n;->f(I)[C

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v2, Llg/f;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, [C

    return-object v2

    :cond_2
    const-string v2, "Unknown reference \'"

    const/16 v4, 0x27

    invoke-static {v4, v2, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v2, v0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v2, v2, -0x3

    const/4 v4, 0x0

    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v4, v0, Lcom/iterable/iterableapi/q;->b:I

    sub-int/2addr v4, v3

    iget v5, v0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, 0x3

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget-object v5, v0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const-string v6, "substring(...)"

    invoke-static {v4, v5, v3, v2, v6}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Llg/e;->a:Lyb3/p;

    const-string v6, "\u00b7"

    invoke-virtual {v5, v3, v6}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget v5, v0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v5, v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, " "

    invoke-static {v5, v7}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "At offset "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (showing range "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "):\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public B()Lkg/f;
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/q;

    iget-object v2, v1, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget v3, v1, Lcom/iterable/iterableapi/q;->b:I

    const-string v4, "looking for the start of a tag"

    invoke-virtual {v1, v4}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v4

    const/16 v5, 0x3c

    const-string v6, "Unexpected character \'"

    const-string v7, "):\n"

    const-string v9, " (showing range "

    const-string v10, "At offset "

    const-string v12, " "

    const-string v13, "\u00b7"

    const-string v14, "substring(...)"

    if-ne v4, v5, :cond_11

    const-string v4, "!--"

    invoke-virtual {v1, v4}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Lxl/a;->C()V

    invoke-virtual {v0}, Lxl/a;->x()Lkg/f;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v1

    :cond_0
    const-string v4, "/"

    invoke-virtual {v1, v4}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v4

    const/16 v5, 0x3e

    const-string v11, "looking for the end of a tag"

    if-eqz v4, :cond_4

    iget-object v4, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Luf/c0;

    check-cast v4, Llg/c;

    const/16 v16, 0x1

    iget-object v8, v4, Llg/c;->x:Lkg/d;

    invoke-virtual {v0}, Lxl/a;->z()Lkg/d;

    move-result-object v15

    invoke-virtual {v15, v8}, Lkg/d;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3

    invoke-virtual {v0}, Lxl/a;->D()V

    invoke-virtual {v1, v11}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v8

    if-ne v8, v5, :cond_2

    iget-object v1, v4, Llg/c;->y:Llg/c;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, Llg/a;->z:Llg/a;

    :goto_0
    iput-object v1, v0, Lxl/a;->y:Ljava/lang/Object;

    new-instance v1, Lkg/b;

    iget v2, v4, Llg/c;->E:I

    invoke-direct {v1, v2, v15}, Lkg/b;-><init>(ILkg/d;)V

    return-object v1

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, "\' while looking for the end of a tag"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v3, v3, -0x1

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v6, v6, 0x3

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v6, v16

    invoke-static {v3, v2, v6, v5, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unexpected \'/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\' tag while looking for \'/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "\' tag"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v3, v6

    iget v8, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v8, v8, 0x3

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v2, v6, v5, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    iget-object v4, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Luf/c0;

    instance-of v6, v4, Llg/c;

    if-eqz v6, :cond_5

    check-cast v4, Llg/c;

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_6

    invoke-static {v4}, Llg/c;->r0(Llg/c;)Llg/c;

    move-result-object v4

    goto :goto_2

    :cond_6
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v0}, Lxl/a;->z()Lkg/d;

    move-result-object v6

    invoke-virtual {v0}, Lxl/a;->D()V

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    :goto_3
    invoke-virtual {v1, v11}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v8

    move/from16 v18, v3

    const/16 v3, 0x2f

    if-eq v8, v3, :cond_8

    if-eq v8, v5, :cond_7

    const-string v3, "looking for the beginning of an attribute"

    invoke-virtual {v1, v3}, Lcom/iterable/iterableapi/q;->f(Ljava/lang/String;)V

    invoke-virtual {v0}, Lxl/a;->y()Ll83/k;

    move-result-object v3

    iget-object v8, v3, Ll83/k;->w:Ljava/lang/Object;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    invoke-interface {v15, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lxl/a;->D()V

    move/from16 v3, v18

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    goto :goto_4

    :cond_8
    const/4 v3, 0x1

    :goto_4
    sget-object v8, Llg/f;->a:Lyb3/p;

    invoke-static {v15}, Lm83/g0;->h0(Ljava/util/Map;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    move/from16 v20, v3

    const-string v3, "xmlns"

    if-eqz v19, :cond_c

    move-object/from16 v19, v8

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v0, v8

    check-cast v0, Ll83/k;

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lkg/d;

    move-object/from16 v21, v7

    iget-object v7, v0, Lkg/d;->a:Ljava/lang/String;

    iget-object v0, v0, Lkg/d;->b:Ljava/lang/String;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    if-eqz v0, :cond_a

    :cond_9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    :cond_a
    invoke-virtual {v15, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_6
    move-object/from16 v0, p0

    move-object/from16 v8, v19

    move/from16 v3, v20

    move-object/from16 v7, v21

    goto :goto_5

    :cond_c
    move-object/from16 v21, v7

    invoke-static {v5}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v15, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/k;

    new-instance v15, Lkg/c;

    move-object/from16 v19, v0

    iget-object v0, v8, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v8, v8, Ll83/k;->w:Ljava/lang/Object;

    check-cast v8, Lkg/d;

    move-object/from16 v22, v7

    iget-object v7, v8, Lkg/d;->a:Ljava/lang/String;

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_d

    const/4 v7, 0x0

    goto :goto_8

    :cond_d
    iget-object v7, v8, Lkg/d;->a:Ljava/lang/String;

    :goto_8
    invoke-direct {v15, v0, v7}, Lkg/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v19

    move-object/from16 v7, v22

    goto :goto_7

    :cond_e
    move-object/from16 v19, v0

    move-object/from16 v0, v19

    check-cast v0, Ljava/util/Map;

    if-eqz v20, :cond_10

    invoke-virtual {v1, v11}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v3

    const/16 v7, 0x3e

    if-ne v3, v7, :cond_f

    new-instance v1, Llg/b;

    invoke-direct {v1, v6, v4}, Llg/b;-><init>(Lkg/d;Llg/c;)V

    :goto_9
    move-object/from16 v3, p0

    goto :goto_a

    :cond_f
    iget v0, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v0, v0, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v6, 0x1

    add-int/lit8 v3, v18, -0x1

    iget v4, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v4, v4, 0x3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v2, v6, v0, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Llg/e;->a:Lyb3/p;

    invoke-virtual {v4, v2, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v4, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v4, v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v0, v21

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unexpected characters while looking for the end of a tag\n"

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    new-instance v1, Llg/c;

    const/4 v2, 0x0

    invoke-direct {v1, v6, v4, v2}, Llg/c;-><init>(Lkg/d;Llg/c;Z)V

    goto :goto_9

    :goto_a
    iput-object v1, v3, Lxl/a;->y:Ljava/lang/Object;

    new-instance v2, Lkg/a;

    invoke-virtual {v1}, Luf/c0;->Q()I

    move-result v1

    invoke-direct {v2, v1, v6, v0, v5}, Lkg/a;-><init>(ILkg/d;Ljava/util/Map;Ljava/util/List;)V

    return-object v2

    :cond_11
    move/from16 v18, v3

    move-object v3, v0

    move-object v0, v7

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "\' while looking for the start of a tag"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v6, 0x1

    add-int/lit8 v7, v18, -0x1

    iget v8, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v8, v8, 0x3

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-static {v7, v2, v6, v5, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v4, v0}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public C()V
    .locals 8

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/q;

    iget-object v1, v0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget v2, v0, Lcom/iterable/iterableapi/q;->c:I

    const/4 v3, 0x4

    const-string v4, "-->"

    const/4 v5, 0x0

    invoke-static {v1, v4, v2, v5, v3}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v2

    const/4 v3, 0x3

    if-ltz v2, :cond_0

    add-int/2addr v3, v2

    invoke-virtual {v0, v3}, Lcom/iterable/iterableapi/q;->g(I)Ljava/lang/String;

    iput v3, v0, Lcom/iterable/iterableapi/q;->c:I

    return-void

    :cond_0
    const-string v2, "Unexpected end-of-doc while "

    const-string v4, "looking for the end of a comment"

    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v4, v0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v4, v3

    invoke-static {v5, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget v5, v0, Lcom/iterable/iterableapi/q;->b:I

    const/4 v6, 0x1

    sub-int/2addr v5, v6

    iget v7, v0, Lcom/iterable/iterableapi/q;->c:I

    add-int/2addr v7, v3

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    const-string v5, "substring(...)"

    invoke-static {v3, v1, v6, v4, v5}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v5, Llg/e;->a:Lyb3/p;

    const-string v6, "\u00b7"

    invoke-virtual {v5, v1, v6}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget v5, v0, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v5, v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, " "

    invoke-static {v5, v7}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "At offset "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " (showing range "

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "):\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0xa

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2, v1}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public D()V
    .locals 3

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/q;

    :goto_0
    iget v1, v0, Lcom/iterable/iterableapi/q;->c:I

    iget v2, v0, Lcom/iterable/iterableapi/q;->b:I

    if-ge v1, v2, :cond_1

    iget-object v2, v0, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    const/16 v2, 0xd

    if-eq v1, v2, :cond_0

    const/16 v2, 0xa

    if-eq v1, v2, :cond_0

    const/16 v2, 0x9

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget v1, v0, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lcom/iterable/iterableapi/q;->c:I

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public E(Ljz/f;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Loz/c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Loz/c;

    iget v1, v0, Loz/c;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loz/c;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Loz/c;

    invoke-direct {v0, p0, p3}, Loz/c;-><init>(Lxl/a;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Loz/c;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loz/c;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast p3, Lgm/r;

    iget-object v2, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, Lq30/w0;

    const-string v4, "<this>"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lyy/f;

    new-instance v5, Loz/a;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v6}, Loz/a;-><init>(Ljz/f;I)V

    new-instance v6, Loz/a;

    const/4 v7, 0x1

    invoke-direct {v6, p1, v7}, Loz/a;-><init>(Ljz/f;I)V

    invoke-direct {v4, v5, v6}, Lyy/f;-><init>(Lc93/a;Lc93/a;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ll83/k;

    const-string v7, "locale"

    invoke-direct {v6, v7, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v7, Ll83/k;

    const-string v8, "fullscreen"

    invoke-direct {v7, v8, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v8, Ll83/k;

    const-string v9, "hide_close_button"

    invoke-direct {v8, v9, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v9, "application_id"

    invoke-direct {v5, v9, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p2, Ll83/k;

    const-string v9, "mobile_sdk_type"

    const-string v10, "fc_lite"

    invoke-direct {p2, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v7, v8, v5, p2}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p2

    new-instance v5, Ll83/k;

    const-string v7, "mobile"

    invoke-direct {v5, v7, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p1, Ljz/f;->w:Ljava/lang/String;

    new-instance p2, Ll83/k;

    const-string v7, "client_secret"

    invoke-direct {p2, v7, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v6, v5, p2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    const/16 p2, 0x8

    const-string v5, "https://api.stripe.com/v1/financial_connections/sessions/synchronize"

    invoke-static {v2, v5, v4, p1, p2}, Lq30/w0;->n(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/lite/repository/model/b;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/lite/repository/model/b;->serializer()Lwc3/c;

    move-result-object p2

    iput v3, v0, Loz/c;->y:I

    invoke-virtual {p3, p1, p2, v0}, Lgm/r;->C(Lyy/g;Lwc3/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public F(I)Lt9/k0;
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget v1, v1, v0

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast p1, [Ll9/y0;

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unmatched track of type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BaseMediaChunkOutput"

    invoke-static {v0, p1}, Lx8/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lt9/m;

    invoke-direct {p1}, Lt9/m;-><init>()V

    return-object p1
.end method

.method public G(Landroid/view/View;[F)V
    .locals 4

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, [F

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/View;

    invoke-virtual {p0, v1, p2}, Lxl/a;->G(Landroid/view/View;[F)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    int-to-float v1, v1

    neg-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    neg-float v2, v2

    invoke-static {v0}, Li2/l0;->d([F)V

    invoke-static {v0, v1, v2}, Li2/l0;->g([FFF)V

    invoke-static {p2, v0}, Lb3/o0;->n([F[F)V

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0}, Li2/l0;->d([F)V

    invoke-static {v0, v1, v2}, Li2/l0;->g([FFF)V

    invoke-static {p2, v0}, Lb3/o0;->n([F[F)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, [I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v2

    int-to-float v2, v2

    neg-float v2, v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v3

    int-to-float v3, v3

    neg-float v3, v3

    invoke-static {v0}, Li2/l0;->d([F)V

    invoke-static {v0, v2, v3}, Li2/l0;->g([FFF)V

    invoke-static {p2, v0}, Lb3/o0;->n([F[F)V

    const/4 v2, 0x0

    aget v2, v1, v2

    int-to-float v2, v2

    const/4 v3, 0x1

    aget v1, v1, v3

    int-to-float v1, v1

    invoke-static {v0}, Li2/l0;->d([F)V

    invoke-static {v0, v2, v1}, Li2/l0;->g([FFF)V

    invoke-static {p2, v0}, Lb3/o0;->n([F[F)V

    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1, v0}, Li2/w0;->B(Landroid/graphics/Matrix;[F)V

    invoke-static {p2, v0}, Lb3/o0;->n([F[F)V

    :cond_1
    return-void
.end method

.method public H(Lu8/y0;)V
    .locals 3

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    new-instance v1, Lr5/b;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0, p1}, Lr5/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public I(Lva3/h;Ljava/lang/String;)Lgm/r;
    .locals 2

    const-string v0, "desc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v0, "asString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loa3/r;

    const/16 v1, 0x23

    invoke-static {v1, p1, p2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Loa3/r;-><init>(Ljava/lang/String;)V

    new-instance p1, Lgm/r;

    invoke-direct {p1, p0, v0}, Lgm/r;-><init>(Lxl/a;Loa3/r;)V

    return-object p1
.end method

.method public J(Lva3/h;Ljava/lang/String;)Loa3/b;
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loa3/b;

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "asString(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loa3/r;

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Loa3/r;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p0, v1}, Loa3/b;-><init>(Lxl/a;Loa3/r;)V

    return-object v0
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lno/nordicsemi/android/ble/k0;

    iget-object v0, v0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-interface {v0, p1}, Lno/nordicsemi/android/ble/d0;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(I)I
    .locals 3

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    :cond_0
    iget-object v1, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/textfield/p;

    invoke-virtual {v1, p1}, Lcom/google/android/material/textfield/p;->j(I)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne p1, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v1

    if-nez v1, :cond_0

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public c(I)I
    .locals 1

    :cond_0
    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/p;->k(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_0

    return p1
.end method

.method public create(Ljava/lang/Class;Ll8/c;)Li20/v0;
    .locals 3

    const-string p1, "extras"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast p1, Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp20/c;

    invoke-static {p2}, Lup/d;->K(Ll8/c;)Landroid/app/Application;

    move-result-object p2

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Li20/p0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lp20/c;->a:Lkr/j;

    new-instance v1, Li20/v0;

    iget-object v2, p1, Lkr/j;->l:Ljava/lang/Object;

    check-cast v2, Lv03/h;

    invoke-interface {v2}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly30/e;

    iget-object p1, p1, Lkr/j;->k:Ljava/lang/Object;

    check-cast p1, Lv03/h;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj20/c;

    invoke-direct {v1, v2, v0, p1, p2}, Li20/v0;-><init>(Ly30/e;Li20/p0;Lj20/c;Landroid/app/Application;)V

    return-object v1
.end method

.method public d(I)I
    .locals 2

    :cond_0
    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/p;->j(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    return v0

    :cond_1
    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_0

    return p1
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public f(I)I
    .locals 2

    :cond_0
    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/p;

    invoke-virtual {v0, p1}, Lcom/google/android/material/textfield/p;->k(I)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v0

    if-nez v0, :cond_0

    return p1

    :cond_1
    return v0
.end method

.method public g(Ljava/lang/Runnable;J)V
    .locals 1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lno/nordicsemi/android/ble/k0;

    iget-object v0, v0, Lno/nordicsemi/android/ble/k0;->a:Ljc/x;

    invoke-interface {v0, p1, p2, p3}, Lno/nordicsemi/android/ble/d0;->g(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public h(Landroid/view/View;[F)V
    .locals 0

    invoke-static {p2}, Li2/l0;->d([F)V

    invoke-virtual {p0, p1, p2}, Lxl/a;->G(Landroid/view/View;[F)V

    return-void
.end method

.method public i()Landroidx/lifecycle/h;
    .locals 3

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Lib/m;

    iget-object v1, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Lcom/squareup/wire/n;

    new-instance v2, Lev/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v1, v2, Lev/i;->h:Ljava/lang/Object;

    iput-object v0, v2, Lev/i;->i:Ljava/lang/Object;

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, v2}, Landroidx/lifecycle/h;-><init>(Lev/i;)V

    iput-object v0, v2, Lev/i;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, v2, Lev/i;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, v2, Lev/i;->c:Ljava/lang/Object;

    new-instance v0, Landroidx/fragment/app/m;

    const/4 v1, 0x4

    invoke-direct {v0, v2, v1}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iput-object v0, v2, Lev/i;->d:Ljava/lang/Object;

    new-instance v0, Lg73/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lg73/a;-><init>(I)V

    iput-object v0, v2, Lev/i;->g:Ljava/lang/Object;

    iget-object v0, v2, Lev/i;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/h;

    return-object v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    iput-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    return-void
.end method

.method public k(JLed3/a;)V
    .locals 4

    invoke-virtual {p3}, Led3/a;->a()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Led3/a;->i()I

    move-result v0

    invoke-virtual {p3}, Led3/a;->i()I

    move-result v1

    invoke-virtual {p3}, Led3/a;->y()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, [Lwm/s;

    invoke-static {p1, p2, p3, v0}, Ls4/d;->c(JLed3/a;[Lwm/s;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public l(JLx8/n;)V
    .locals 4

    invoke-virtual {p3}, Lx8/n;->a()I

    move-result v0

    const/16 v1, 0x9

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Lx8/n;->g()I

    move-result v0

    invoke-virtual {p3}, Lx8/n;->g()I

    move-result v1

    invoke-virtual {p3}, Lx8/n;->t()I

    move-result v2

    const/16 v3, 0x1b2

    if-ne v0, v3, :cond_1

    const v0, 0x47413934

    if-ne v1, v0, :cond_1

    const/4 v0, 0x3

    if-ne v2, v0, :cond_1

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, [Lt9/k0;

    invoke-static {p1, p2, p3, v0}, Lt9/a;->e(JLx8/n;[Lt9/k0;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public m(Lt9/q;Lab/l0;)V
    .locals 9

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, [Lt9/k0;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_2

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lt9/q;->o(II)Lt9/k0;

    move-result-object v3

    iget-object v4, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu8/p;

    iget-object v5, v4, Lu8/p;->n:Ljava/lang/String;

    const-string v6, "application/cea-608"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "application/cea-708"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, 0x1

    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Invalid closed caption MIME type provided: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lva3/g;->e(ZLjava/lang/String;)V

    new-instance v6, Lu8/o;

    invoke-direct {v6}, Lu8/o;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v7, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iput-object v7, v6, Lu8/o;->a:Ljava/lang/String;

    const-string v7, "video/mp2t"

    invoke-static {v7}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lu8/o;->l:Ljava/lang/String;

    invoke-static {v5}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v6, Lu8/o;->m:Ljava/lang/String;

    iget v5, v4, Lu8/p;->e:I

    iput v5, v6, Lu8/o;->e:I

    iget-object v5, v4, Lu8/p;->d:Ljava/lang/String;

    iput-object v5, v6, Lu8/o;->d:Ljava/lang/String;

    iget v5, v4, Lu8/p;->I:I

    iput v5, v6, Lu8/o;->H:I

    iget-object v4, v4, Lu8/p;->q:Ljava/util/List;

    iput-object v4, v6, Lu8/o;->p:Ljava/util/List;

    invoke-static {v6, v3}, Ljh3/c;->w(Lu8/o;Lt9/k0;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public n(Lwm/k;Lab/l0;)V
    .locals 10

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, [Lwm/s;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_3

    invoke-virtual {p2}, Lab/l0;->c()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget v3, p2, Lab/l0;->e:I

    const/4 v4, 0x3

    invoke-interface {p1, v3, v4}, Lwm/k;->o(II)Lwm/s;

    move-result-object v3

    iget-object v4, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrm/c0;

    iget-object v5, v4, Lrm/c0;->L:Ljava/lang/String;

    const-string v6, "application/cea-608"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    const-string v6, "application/cea-708"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v6, v1

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, 0x1

    :goto_2
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const-string v9, "Invalid closed caption mime type provided: "

    if-eqz v8, :cond_2

    invoke-virtual {v9, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_2
    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, v9}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_3
    invoke-static {v6, v7}, Llo/a;->f(ZLjava/lang/String;)V

    new-instance v6, Lrm/b0;

    invoke-direct {v6}, Lrm/b0;-><init>()V

    invoke-virtual {p2}, Lab/l0;->h()V

    iget-object v7, p2, Lab/l0;->f:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iput-object v7, v6, Lrm/b0;->a:Ljava/lang/String;

    iput-object v5, v6, Lrm/b0;->k:Ljava/lang/String;

    iget v5, v4, Lrm/c0;->z:I

    iput v5, v6, Lrm/b0;->d:I

    iget-object v5, v4, Lrm/c0;->y:Ljava/lang/String;

    iput-object v5, v6, Lrm/b0;->c:Ljava/lang/String;

    iget v5, v4, Lrm/c0;->d0:I

    iput v5, v6, Lrm/b0;->C:I

    iget-object v4, v4, Lrm/c0;->N:Ljava/util/List;

    iput-object v4, v6, Lrm/b0;->m:Ljava/util/List;

    new-instance v4, Lrm/c0;

    invoke-direct {v4, v6}, Lrm/c0;-><init>(Lrm/b0;)V

    invoke-interface {v3, v4}, Lwm/s;->a(Lrm/c0;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget v3, v0, Lxl/a;->w:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v3, Landroidx/viewpager/widget/ViewPager;

    invoke-static/range {p1 .. p2}, Lh5/p0;->i(Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object v1

    iget-object v2, v1, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v2}, Lh5/o1;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Rect;

    invoke-virtual {v1}, Lh5/q1;->b()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v1}, Lh5/q1;->d()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v1}, Lh5/q1;->c()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v1}, Lh5/q1;->a()I

    move-result v4

    iput v4, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v6, v1}, Lh5/p0;->b(Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object v6

    invoke-virtual {v6}, Lh5/q1;->b()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->left:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->left:I

    invoke-virtual {v6}, Lh5/q1;->d()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->top:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->top:I

    invoke-virtual {v6}, Lh5/q1;->c()I

    move-result v7

    iget v8, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v7, v8}, Ljava/lang/Math;->min(II)I

    move-result v7

    iput v7, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {v6}, Lh5/q1;->a()I

    move-result v6

    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    iput v6, v2, Landroid/graphics/Rect;->bottom:I

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v5, v2, Landroid/graphics/Rect;->right:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v3, v4, v5, v2}, Lh5/q1;->f(IIII)Lh5/q1;

    move-result-object v1

    :goto_1
    return-object v1

    :pswitch_0
    iget-object v3, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, Lcom/iterable/iterableapi/g1;

    iget-object v4, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v4, Lcr/p;

    iget v5, v4, Lcr/p;->a:I

    iget v6, v4, Lcr/p;->b:I

    iget v4, v4, Lcr/p;->c:I

    iget-object v7, v2, Lh5/q1;->a:Lh5/o1;

    const/4 v8, 0x7

    invoke-virtual {v7, v8}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v8

    const/16 v9, 0x20

    invoke-virtual {v7, v9}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v7

    iget-object v9, v3, Lcom/iterable/iterableapi/g1;->x:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v10, v8, Lv4/b;->b:I

    iget v11, v8, Lv4/b;->c:I

    iget v12, v8, Lv4/b;->a:I

    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-static {v1}, Lcr/m;->f(Landroid/view/View;)Z

    move-result v10

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v13

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v14

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v15

    iget-boolean v0, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Lh5/q1;->a()I

    move-result v13

    iput v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    add-int/2addr v13, v4

    :cond_2
    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    if-eqz v4, :cond_4

    if-eqz v10, :cond_3

    move v4, v6

    goto :goto_2

    :cond_3
    move v4, v5

    :goto_2
    add-int v14, v4, v12

    :cond_4
    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    if-eqz v4, :cond_6

    if-eqz v10, :cond_5

    goto :goto_3

    :cond_5
    move v5, v6

    :goto_3
    add-int v15, v5, v11

    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v5, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    const/4 v6, 0x1

    if-eqz v5, :cond_7

    iget v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v5, v12, :cond_7

    iput v12, v4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v5, v6

    goto :goto_4

    :cond_7
    const/4 v5, 0x0

    :goto_4
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v10, :cond_8

    iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v10, v11, :cond_8

    iput v11, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v5, v6

    :cond_8
    iget-boolean v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v10, :cond_9

    iget v10, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v8, v8, Lv4/b;->b:I

    if-eq v10, v8, :cond_9

    iput v8, v4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_5

    :cond_9
    move v6, v5

    :goto_5
    if-eqz v6, :cond_a

    invoke-virtual {v1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    invoke-virtual {v1, v14, v4, v15, v13}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean v1, v3, Lcom/iterable/iterableapi/g1;->w:Z

    if-eqz v1, :cond_b

    iget v3, v7, Lv4/b;->d:I

    iput v3, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_b
    if-nez v0, :cond_c

    if-eqz v1, :cond_d

    :cond_c
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->d0()V

    :cond_d
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lhg/i;)V
    .locals 2

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p1, Lhg/i;->b:I

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public s()Lio/getstream/video/android/model/StreamCallId;
    .locals 1

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm43/b;

    iget-object v0, v0, Lm43/b;->a:Lio/getstream/video/android/model/StreamCallId;

    return-object v0
.end method

.method public t(Ljz/f;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Loz/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Loz/b;

    iget v1, v0, Loz/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Loz/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Loz/b;

    invoke-direct {v0, p0, p2}, Loz/b;-><init>(Lxl/a;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Loz/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Loz/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast p2, Lq30/w0;

    const-string v2, "<this>"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lyy/f;

    new-instance v4, Loz/a;

    const/4 v5, 0x0

    invoke-direct {v4, p1, v5}, Loz/a;-><init>(Ljz/f;I)V

    new-instance v5, Loz/a;

    const/4 v6, 0x1

    invoke-direct {v5, p1, v6}, Loz/a;-><init>(Ljz/f;I)V

    invoke-direct {v2, v4, v5}, Lyy/f;-><init>(Lc93/a;Lc93/a;)V

    const-string v4, "client_secret"

    iget-object p1, p1, Ljz/f;->w:Ljava/lang/String;

    invoke-static {v4, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    const/16 v4, 0x8

    const-string v5, "https://api.stripe.com/v1/link_account_sessions/session_receipt"

    invoke-static {p2, v5, v2, p1, v4}, Lq30/w0;->m(Lq30/w0;Ljava/lang/String;Lyy/f;Ljava/util/Map;I)Lyy/g;

    move-result-object p1

    iget-object p2, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast p2, Lgm/r;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;->Companion:Lcom/stripe/android/financialconnections/model/w;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/w;->serializer()Lwc3/c;

    move-result-object v2

    iput v3, v0, Loz/b;->y:I

    invoke-virtual {p2, p1, v2, v0}, Lgm/r;->C(Lyy/g;Lwc3/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lxl/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NetworkBody{body="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lxl/a;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", warnings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public x()Lkg/f;
    .locals 10

    sget-object v0, Llg/a;->y:Llg/a;

    iget-object v1, p0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/q;

    iget-object v2, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, Luf/c0;

    sget-object v3, Llg/a;->z:Llg/a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    instance-of v4, v2, Llg/b;

    if-eqz v4, :cond_2

    check-cast v2, Llg/b;

    iget-object v0, v2, Llg/b;->y:Llg/c;

    if-eqz v0, :cond_1

    move-object v3, v0

    :cond_1
    iput-object v3, p0, Lxl/a;->y:Ljava/lang/Object;

    new-instance v0, Lkg/b;

    iget v1, v2, Llg/b;->z:I

    iget-object v2, v2, Llg/b;->x:Lkg/d;

    invoke-direct {v0, v1, v2}, Lkg/b;-><init>(ILkg/d;)V

    return-object v0

    :cond_2
    instance-of v3, v2, Llg/c;

    const/16 v4, 0x20

    const/16 v5, 0xd

    const/16 v6, 0xa

    const/16 v7, 0x9

    const/4 v8, 0x1

    if-eqz v3, :cond_b

    const-string v0, "<"

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "<![CDATA["

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lxl/a;->B()Lkg/f;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    const-string v0, "reading text node"

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v0

    if-eq v0, v7, :cond_a

    if-eq v0, v6, :cond_a

    if-eq v0, v5, :cond_a

    if-eq v0, v4, :cond_a

    const/16 v2, 0x26

    const/4 v9, 0x0

    if-eq v0, v2, :cond_9

    const/16 v2, 0x3c

    if-eq v0, v2, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    const-string v0, "!--"

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lxl/a;->C()V

    goto :goto_0

    :cond_5
    const-string v0, "![CDATA["

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "]]>"

    const-string v2, "trying to read CDATA content"

    invoke-virtual {v1, v0, v2}, Lcom/iterable/iterableapi/q;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x3

    const-string v8, "trying to read end of CATA"

    invoke-virtual {v1, v2, v8}, Lcom/iterable/iterableapi/q;->a(ILjava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    move v8, v9

    goto :goto_0

    :cond_6
    const-string v0, "looking for the beginning of a tag"

    invoke-virtual {v1, v0}, Lcom/iterable/iterableapi/q;->f(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, Luf/c0;

    check-cast v2, Llg/c;

    iget-boolean v3, v2, Llg/c;->z:Z

    const-string v4, "</"

    invoke-virtual {v1, v4}, Lcom/iterable/iterableapi/q;->c(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v2}, Llg/c;->r0(Llg/c;)Llg/c;

    move-result-object v2

    iput-object v2, p0, Lxl/a;->y:Ljava/lang/Object;

    if-eqz v8, :cond_8

    if-nez v3, :cond_7

    if-nez v1, :cond_8

    :cond_7
    invoke-virtual {p0}, Lxl/a;->x()Lkg/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0

    :cond_8
    new-instance v1, Lkg/e;

    iget v2, v2, Llg/c;->E:I

    invoke-direct {v1, v2, v0}, Lkg/e;-><init>(ILjava/lang/String;)V

    return-object v1

    :cond_9
    invoke-virtual {p0}, Lxl/a;->A()[C

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_a
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_b
    sget-object v3, Llg/a;->E:Llg/a;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-virtual {p0}, Lxl/a;->D()V

    :goto_2
    const-string v2, "<?"

    invoke-virtual {v1, v2}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    :goto_3
    iget v2, v1, Lcom/iterable/iterableapi/q;->c:I

    iget v3, v1, Lcom/iterable/iterableapi/q;->b:I

    if-ge v2, v3, :cond_c

    iget-object v3, v1, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v2, v7, :cond_c

    if-eq v2, v6, :cond_c

    if-eq v2, v5, :cond_c

    if-eq v2, v4, :cond_c

    iget v2, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/2addr v2, v8

    iput v2, v1, Lcom/iterable/iterableapi/q;->c:I

    goto :goto_3

    :cond_c
    invoke-virtual {p0}, Lxl/a;->D()V

    :goto_4
    const-string v2, "?>"

    invoke-virtual {v1, v2}, Lcom/iterable/iterableapi/q;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {p0}, Lxl/a;->y()Ll83/k;

    invoke-virtual {p0}, Lxl/a;->D()V

    goto :goto_4

    :cond_d
    invoke-virtual {p0}, Lxl/a;->D()V

    goto :goto_2

    :cond_e
    iput-object v0, p0, Lxl/a;->y:Ljava/lang/Object;

    invoke-virtual {p0}, Lxl/a;->x()Lkg/f;

    move-result-object v0

    return-object v0

    :cond_f
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual {p0}, Lxl/a;->D()V

    invoke-virtual {p0}, Lxl/a;->B()Lkg/f;

    move-result-object v0

    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public y()Ll83/k;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lxl/a;->z()Lkg/d;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lxl/a;->D()V

    move-object/from16 v1, p0

    iget-object v2, v1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v2, Lcom/iterable/iterableapi/q;

    iget v3, v2, Lcom/iterable/iterableapi/q;->b:I

    iget-object v4, v2, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    const-string v5, "trying to read attribute equals"

    invoke-virtual {v2, v5}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v5

    const/16 v6, 0x3d

    const-string v7, "):\n"

    const-string v9, " (showing range "

    const-string v10, "At offset "

    const-string v12, " "

    const-string v13, "\u00b7"

    const-string v14, "substring(...)"

    const/4 v15, 0x0

    const-string v8, "Unexpected \'"

    const/4 v11, 0x1

    if-ne v5, v6, :cond_5

    invoke-virtual {v1}, Lxl/a;->D()V

    const-string v5, "trying to read attribute value"

    invoke-virtual {v2, v5}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v5

    const/16 v6, 0x27

    if-eq v5, v6, :cond_1

    const/16 v6, 0x22

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, "\' while trying to read attribute value"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v5, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v3, v11

    iget v6, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v6, v6, 0x3

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v4, v11, v5, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v4, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v6, v2, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v2, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    :goto_1
    const-string v8, "trying to read a string"

    invoke-virtual {v2, v8}, Lcom/iterable/iterableapi/q;->d(Ljava/lang/String;)C

    move-result v8

    move/from16 v16, v11

    const/16 v11, 0x26

    if-ne v8, v11, :cond_2

    invoke-virtual {v1}, Lxl/a;->A()[C

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    const/16 v11, 0x3c

    if-eq v8, v11, :cond_4

    if-eq v8, v5, :cond_3

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    move/from16 v11, v16

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v3

    :cond_4
    iget v0, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v0, v0, -0x3

    invoke-static {v15, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/lit8 v3, v3, -0x1

    iget v5, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, 0x3

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    move/from16 v5, v16

    invoke-static {v3, v4, v5, v0, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Llg/e;->a:Lyb3/p;

    invoke-virtual {v5, v4, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v5, v2, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v5, v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v5, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x5e

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v2, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Unexpected \'<\' while trying to read a string\n"

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, "\' while trying to read attribute equals"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v5, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    invoke-static {v15, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v3, v6

    iget v8, v2, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v8, v8, 0x3

    invoke-static {v3, v8}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v4, v6, v5, v14}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v4, v13}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v6, v2, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v12}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v2, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x2d

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0xa

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v0, v3}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public z()Lkg/d;
    .locals 36

    move-object/from16 v0, p0

    iget-object v1, v0, Lxl/a;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/q;

    iget-object v2, v1, Lcom/iterable/iterableapi/q;->a:Ljava/lang/String;

    iget v3, v1, Lcom/iterable/iterableapi/q;->b:I

    iget v4, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x61

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v6

    const-string v7, "):\n"

    const-string v8, " (showing range "

    const-string v9, "At offset "

    const-string v11, " "

    const-string v12, "\u00b7"

    const-string v13, "substring(...)"

    const/16 v15, 0x5a

    const/16 v5, 0x41

    const/16 v10, 0x7a

    const/4 v14, 0x1

    if-gtz v6, :cond_0

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v6

    if-lez v6, :cond_b

    :cond_0
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v6

    if-gtz v6, :cond_1

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v6

    if-lez v6, :cond_b

    :cond_1
    const/16 v6, 0x3a

    if-eq v4, v6, :cond_b

    const/16 v6, 0x5f

    if-eq v4, v6, :cond_b

    const/16 v6, 0xc0

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_2

    const/16 v6, 0xd6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_2
    const/16 v6, 0xd8

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_3

    const/16 v6, 0xf6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_3
    const/16 v6, 0xf8

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_4

    const/16 v6, 0x2ff

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_4
    const/16 v6, 0x370

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_5

    const/16 v6, 0x37d

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_5
    const/16 v6, 0x37f

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_6

    const/16 v6, 0x1fff

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_6
    const/16 v6, 0x200c

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_7

    const/16 v6, 0x200d

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_7
    const/16 v6, 0x2070

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_8

    const/16 v6, 0x218f

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_8
    const/16 v6, 0x2c00

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_9

    const/16 v6, 0x2fef

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-lez v35, :cond_b

    :cond_9
    const/16 v6, 0x3001

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_a

    const v6, 0xd7ff

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v35

    if-gtz v35, :cond_a

    goto :goto_0

    :cond_a
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Found \'"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v4, "\' but expected a valid XML start name character"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int/2addr v3, v14

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v6, v6, 0x3

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v2, v14, v5, v13}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v12}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v11}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_b
    :goto_0
    iget v4, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/2addr v4, v14

    :goto_1
    if-ge v4, v3, :cond_1b

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v14, 0x61

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v16

    if-gtz v16, :cond_d

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v16

    if-lez v16, :cond_c

    goto :goto_2

    :cond_c
    const v5, 0xd7ff

    goto/16 :goto_3

    :cond_d
    :goto_2
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v16

    if-gtz v16, :cond_e

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v16

    if-lez v16, :cond_c

    :cond_e
    const/16 v5, 0x30

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-gtz v5, :cond_f

    const/16 v5, 0x39

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-lez v5, :cond_c

    :cond_f
    const/16 v5, 0x3a

    if-eq v6, v5, :cond_c

    const/16 v5, 0x2d

    if-eq v6, v5, :cond_c

    const/16 v5, 0x2e

    if-eq v6, v5, :cond_c

    const/16 v5, 0x5f

    if-eq v6, v5, :cond_c

    const/16 v5, 0xb7

    if-eq v6, v5, :cond_c

    const/16 v5, 0xc0

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v33

    if-gtz v33, :cond_10

    const/16 v5, 0xd6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v32

    if-lez v32, :cond_c

    :cond_10
    const/16 v5, 0xd8

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v31

    if-gtz v31, :cond_11

    const/16 v5, 0xf6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v30

    if-lez v30, :cond_c

    :cond_11
    const/16 v5, 0xf8

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v29

    if-gtz v29, :cond_12

    const/16 v5, 0x2ff

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v28

    if-lez v28, :cond_c

    :cond_12
    const/16 v5, 0x300

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-gtz v5, :cond_13

    const/16 v5, 0x36f

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-lez v5, :cond_c

    :cond_13
    const/16 v5, 0x370

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v27

    if-gtz v27, :cond_14

    const/16 v5, 0x37d

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v26

    if-lez v26, :cond_c

    :cond_14
    const/16 v5, 0x37f

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v25

    if-gtz v25, :cond_15

    const/16 v5, 0x1fff

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v24

    if-lez v24, :cond_c

    :cond_15
    const/16 v5, 0x200c

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v23

    if-gtz v23, :cond_16

    const/16 v5, 0x200d

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v22

    if-lez v22, :cond_c

    :cond_16
    const/16 v5, 0x203f

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-gtz v5, :cond_17

    const/16 v5, 0x2040

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v5

    if-lez v5, :cond_c

    :cond_17
    const/16 v5, 0x2070

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v21

    if-gtz v21, :cond_18

    const/16 v5, 0x218f

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v20

    if-lez v20, :cond_c

    :cond_18
    const/16 v5, 0x2c00

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v19

    if-gtz v19, :cond_19

    const/16 v5, 0x2fef

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v18

    if-lez v18, :cond_c

    :cond_19
    const/16 v5, 0x3001

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v17

    if-gtz v17, :cond_1b

    const v5, 0xd7ff

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v6

    if-lez v6, :cond_1a

    goto :goto_4

    :cond_1a
    :goto_3
    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0x41

    const/4 v14, 0x1

    goto/16 :goto_1

    :cond_1b
    :goto_4
    invoke-virtual {v1, v4}, Lcom/iterable/iterableapi/q;->g(I)Ljava/lang/String;

    move-result-object v5

    iput v4, v1, Lcom/iterable/iterableapi/q;->c:I

    const/4 v4, 0x1

    new-array v6, v4, [C

    const/4 v4, 0x0

    const/16 v34, 0x3a

    aput-char v34, v6, v4

    const/4 v10, 0x6

    invoke-static {v5, v6, v4, v10}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v6

    move-object v4, v6

    check-cast v4, Ljava/lang/Iterable;

    instance-of v10, v4, Ljava/util/Collection;

    const/16 v14, 0x27

    const-string v15, "Cannot understand qualified name \'"

    if-eqz v10, :cond_1c

    move-object v10, v4

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1c

    goto/16 :goto_6

    :cond_1c
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_1d

    goto :goto_5

    :cond_1d
    invoke-static {v14, v15, v5}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget v5, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v5, v5, -0x3

    const/4 v6, 0x0

    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    const/4 v6, 0x1

    sub-int/2addr v3, v6

    iget v10, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v10, v10, 0x3

    invoke-static {v3, v10}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v2, v6, v5, v13}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v12}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v11}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v4, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1e
    :goto_6
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    const/4 v10, 0x1

    if-eq v4, v10, :cond_20

    const/4 v14, 0x2

    if-ne v4, v14, :cond_1f

    new-instance v1, Lkg/d;

    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v4, 0x0

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lkg/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1f
    const/4 v4, 0x0

    const/16 v6, 0x27

    invoke-static {v6, v15, v5}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v6, v6, -0x3

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v4

    sub-int/2addr v3, v10

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    add-int/lit8 v6, v6, 0x3

    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v3, v2, v10, v4, v13}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Llg/e;->a:Lyb3/p;

    invoke-virtual {v6, v2, v12}, Lyb3/p;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget v6, v1, Lcom/iterable/iterableapi/q;->c:I

    sub-int/2addr v6, v4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v6, v11}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v6, 0x5e

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v1, Lcom/iterable/iterableapi/q;->c:I

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0xa

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v5, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v2, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_20
    new-instance v1, Lkg/d;

    const/4 v4, 0x0

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lkg/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
