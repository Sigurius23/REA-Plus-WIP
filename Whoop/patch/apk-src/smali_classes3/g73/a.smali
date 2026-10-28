.class public final Lg73/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/b;
.implements Lx43/e;
.implements Lhn/r;
.implements Li9/q;
.implements Lib/h;
.implements Lio/sentry/cache/tape/e;
.implements Lng3/q;
.implements Llk/c;
.implements Lm/c;
.implements Lm9/j;
.implements Lme3/b;
.implements Lml/c;


# instance fields
.field public final synthetic w:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg73/a;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 5
    sget-object v0, Lu8/f;->d:Ljava/util/UUID;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg73/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lnk/n;)V
    .locals 0

    const/16 p1, 0x15

    iput p1, p0, Lg73/a;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final o(Lq20/y;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lq20/j;

    if-eqz v0, :cond_0

    const-string p0, "googlepay"

    return-object p0

    :cond_0
    instance-of v0, p0, Lq20/w;

    if-eqz v0, :cond_1

    const-string p0, "savedpm"

    return-object p0

    :cond_1
    instance-of v0, p0, Lq20/m;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/i;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/g;

    if-nez v0, :cond_5

    instance-of v0, p0, Lq20/t;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    if-nez p0, :cond_3

    const-string p0, "unknown"

    return-object p0

    :cond_3
    instance-of p0, p0, Lq20/x;

    if-eqz p0, :cond_4

    const-string p0, "shop_pay"

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    :goto_0
    invoke-static {p0}, Lug/m;->G(Lq20/y;)Z

    move-result p0

    if-eqz p0, :cond_6

    const-string p0, "link"

    return-object p0

    :cond_6
    const-string p0, "newpm"

    return-object p0
.end method

.method public static final p(Lcom/stripe/android/paymentsheet/analytics/EventReporter$Mode;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "mc_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 3

    const-string v0, "tag"

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Could not load "

    const-string v2, ".tag field"

    invoke-static {v1, p1, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p0, v0, p1, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static t(Lj6/b;Landroid/text/Editable;IIZ)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_19

    if-ltz p2, :cond_19

    if-gez p3, :cond_0

    goto/16 :goto_9

    :cond_0
    invoke-static {p1}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result v1

    invoke-static {p1}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v1, v3, :cond_19

    if-eq v2, v3, :cond_19

    if-eq v1, v2, :cond_1

    goto/16 :goto_9

    :cond_1
    const/4 v4, 0x1

    if-eqz p4, :cond_16

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-ltz v1, :cond_b

    if-ge p4, v1, :cond_2

    goto :goto_2

    :cond_2
    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    move p4, v0

    :goto_1
    if-nez p2, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_6

    if-eqz p4, :cond_5

    goto :goto_2

    :cond_5
    move v1, v0

    goto :goto_3

    :cond_6
    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_8

    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_7

    goto :goto_2

    :cond_7
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_8
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_9

    add-int/lit8 p2, p2, -0x1

    goto :goto_1

    :cond_9
    invoke-static {v5}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_a

    goto :goto_2

    :cond_a
    move p4, v4

    goto :goto_1

    :cond_b
    :goto_2
    move v1, v3

    :goto_3
    invoke-static {p3, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-ltz v2, :cond_14

    if-ge p3, v2, :cond_c

    goto :goto_6

    :cond_c
    if-gez p2, :cond_d

    goto :goto_6

    :cond_d
    :goto_4
    move p4, v0

    :goto_5
    if-nez p2, :cond_e

    move p3, v2

    goto :goto_7

    :cond_e
    if-lt v2, p3, :cond_f

    if-eqz p4, :cond_15

    goto :goto_6

    :cond_f
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    if-eqz p4, :cond_11

    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-nez p4, :cond_10

    goto :goto_6

    :cond_10
    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_11
    invoke-static {v5}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v6

    if-nez v6, :cond_12

    add-int/lit8 p2, p2, -0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_12
    invoke-static {v5}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result p4

    if-eqz p4, :cond_13

    goto :goto_6

    :cond_13
    add-int/lit8 v2, v2, 0x1

    move p4, v4

    goto :goto_5

    :cond_14
    :goto_6
    move p3, v3

    :cond_15
    :goto_7
    if-eq v1, v3, :cond_19

    if-ne p3, v3, :cond_17

    goto :goto_9

    :cond_16
    sub-int/2addr v1, p2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v2, p3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_17
    const-class p2, Lh6/y;

    invoke-interface {p1, v1, p3, p2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lh6/y;

    if-eqz p2, :cond_19

    array-length p4, p2

    if-lez p4, :cond_19

    array-length p4, p2

    move v2, v0

    :goto_8
    if-ge v2, p4, :cond_18

    aget-object v3, p2, v2

    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    invoke-interface {p1, v3}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v3, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_18
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p4

    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    move-result p3

    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->beginBatchEdit()Z

    invoke-interface {p1, p2, p3}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    invoke-virtual {p0}, Landroid/view/inputmethod/InputConnectionWrapper;->endBatchEdit()Z

    return v4

    :cond_19
    :goto_9
    return v0
.end method

.method public static v(Lv33/h;)Ln23/g;
    .locals 5

    iget-object v0, p0, Lv33/h;->a:Lstream/video/sfu/models/Error;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v2

    invoke-virtual {v2}, Lstream/video/sfu/models/ErrorCode;->getValue()I

    move-result v2

    invoke-virtual {v0}, Lstream/video/sfu/models/Error;->getCode()Lstream/video/sfu/models/ErrorCode;

    move-result-object v0

    invoke-virtual {v0}, Lstream/video/sfu/models/ErrorCode;->getValue()I

    move-result v0

    new-instance v3, Ln23/c;

    const/16 v4, 0x8

    invoke-direct {v3, v1, v0, v2, v4}, Ln23/c;-><init>(Ljava/lang/String;III)V

    goto :goto_0

    :cond_0
    sget-object v0, Lu33/e;->H:Lu33/e;

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object v3

    :goto_0
    iget-object p0, p0, Lv33/h;->b:Lstream/video/sfu/models/WebsocketReconnectStrategy;

    new-instance v0, Ln23/g;

    new-instance v1, Lx43/m;

    invoke-direct {v1, v3, p0}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final w(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 1

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(I)Landroid/media/MediaCodecInfo;
    .locals 1

    iget v0, p0, Lg73/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-static {p1}, Landroid/media/MediaCodecList;->getCodecInfoAt(I)Landroid/media/MediaCodecInfo;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public b()J
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    iget p3, p0, Lg73/a;->w:I

    packed-switch p3, :pswitch_data_0

    const-string p3, "secure-playback"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "video/avc"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    const-string p3, "secure-playback"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "video/avc"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z
    .locals 0

    iget p1, p0, Lg73/a;->w:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public e()J
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lg73/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    return v0

    :pswitch_0
    invoke-static {}, Landroid/media/MediaCodecList;->getCodecCount()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public g()Z
    .locals 1

    iget v0, p0, Lg73/a;->w:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    new-instance v0, Lap/a;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ExecutorService;

    invoke-direct {v0, v1}, Lap/a;-><init>(Ljava/util/concurrent/ExecutorService;)V

    return-object v0
.end method

.method public h(Lml/d;)V
    .locals 0

    invoke-interface {p1}, Lml/d;->onStart()V

    return-void
.end method

.method public i([B)Ljava/lang/Object;
    .locals 11

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p1, Ljava/io/DataInputStream;

    invoke-direct {p1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readShort()S

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v1

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v3

    if-ltz v3, :cond_3

    const/16 v4, 0x3e8

    if-le v3, v4, :cond_0

    goto :goto_1

    :cond_0
    new-array v4, v3, [Ljava/lang/StackTraceElement;

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v8

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v9

    if-eqz v8, :cond_1

    move-object v9, v0

    :cond_1
    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v8

    new-instance v10, Ljava/lang/StackTraceElement;

    invoke-direct {v10, v6, v7, v9, v8}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    aput-object v10, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lio/sentry/android/core/anr/f;

    invoke-direct {p1, v1, v2, v4}, Lio/sentry/android/core/anr/f;-><init>(J[Ljava/lang/StackTraceElement;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_3
    :goto_1
    return-object v0
.end method

.method public j(Lq83/d;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public k(Lml/d;)V
    .locals 0

    return-void
.end method

.method public l(Lng3/k;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lg73/a;->w:I

    sparse-switch v0, :sswitch_data_0

    invoke-interface {p1, p0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg3/o;

    return-object p1

    :sswitch_0
    sget-object v0, Lng3/p;->a:Lg73/a;

    invoke-interface {p1, v0}, Lng3/k;->g(Lng3/q;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljg3/o;

    if-eqz p1, :cond_0

    instance-of v0, p1, Ljg3/p;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :sswitch_1
    instance-of v0, p1, Ljg3/i;

    if-eqz v0, :cond_1

    check-cast p1, Ljg3/i;

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-static {p1}, Ljg3/p;->o(Lng3/k;)Ljg3/p;

    move-result-object v0
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {p1}, Ljg3/e;->r0(Lng3/k;)Ljg3/e;

    move-result-object v1

    new-instance v2, Ljg3/i;

    invoke-direct {v2, v1, v0}, Ljg3/i;-><init>(Ljg3/e;Ljg3/p;)V
    :try_end_1
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_1 .. :try_end_1} :catch_0

    move-object p1, v2

    goto :goto_1

    :catch_0
    :try_start_2
    invoke-static {p1}, Ljg3/c;->p0(Lng3/k;)Ljg3/c;

    move-result-object v1

    invoke-static {v1, v0}, Ljg3/i;->q0(Ljg3/c;Ljg3/o;)Ljg3/i;

    move-result-object p1
    :try_end_2
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    return-object p1

    :catch_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unable to obtain OffsetDateTime from TemporalAccessor: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_2
    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_2
        0xf -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public log(Ljava/lang/String;)V
    .locals 3

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    sget-object v0, Lfe3/e;->a:Lfe3/e;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lfe3/e;->j(Ljava/lang/String;ILjava/lang/Throwable;)V

    return-void
.end method

.method public m(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lio/sentry/android/core/anr/f;

    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, p1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_0
    invoke-virtual {p2, v0}, Lio/sentry/android/core/anr/f;->a(Ljava/io/DataOutputStream;)V

    invoke-virtual {v0}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public n(Lq83/d;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public next()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public q(Ljava/lang/Object;)Lne3/l;
    .locals 1

    check-cast p1, Lv33/x;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Lv33/x;->a:Lstream/video/sfu/event/SfuRequest;

    invoke-virtual {p1}, Lcom/squareup/wire/l;->encodeByteString()Lne3/l;

    move-result-object p1

    return-object p1
.end method

.method public s([B)Ln23/h;
    .locals 2

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v0, Lstream/video/sfu/event/SfuEvent;->ADAPTER:Lcom/squareup/wire/q;

    invoke-virtual {v0, p1}, Lcom/squareup/wire/q;->decode([B)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lstream/video/sfu/event/SfuEvent;

    invoke-virtual {p1}, Lstream/video/sfu/event/SfuEvent;->getError()Lstream/video/sfu/event/Error;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll33/a;->a(Lstream/video/sfu/event/SfuEvent;)Lv33/w;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type io.getstream.video.android.core.events.ErrorEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lv33/h;

    invoke-static {p1}, Lg73/a;->v(Lv33/h;)Ln23/g;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance v0, Ln23/g;

    new-instance v1, Lx43/n;

    invoke-static {p1}, Ll33/a;->a(Lstream/video/sfu/event/SfuEvent;)Lv33/w;

    move-result-object p1

    invoke-direct {v1, p1}, Lx43/n;-><init>(Lv33/w;)V

    invoke-direct {v0, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_0
    sget-object v0, Lu33/e;->H:Lu33/e;

    const/4 v1, 0x2

    invoke-static {v0, p1, v1}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object p1

    new-instance v0, Ln23/f;

    invoke-direct {v0, p1}, Ln23/f;-><init>(Ln23/e;)V

    return-object v0
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
