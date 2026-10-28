.class public final Ldb/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le53/c;
.implements Lh6/p;
.implements Luc3/e;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldb/j0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 4

    iput p2, p0, Ldb/j0;->w:I

    sparse-switch p2, :sswitch_data_0

    const-string p2, "token"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void

    .line 6
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void

    .line 9
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result p2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    const-string v1, "]  PID: ["

    const-string v2, "] "

    .line 10
    const-string v3, "UID: ["

    invoke-static {p2, v0, v3, v1, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void

    .line 12
    :sswitch_2
    const-string p2, "expected"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void

    .line 14
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "userId should not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_3
        0xc -> :sswitch_2
        0xd -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 2
    iput p2, p0, Ldb/j0;->w:I

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Ldb/j0;->w:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    .line 26
    check-cast p2, Landroid/security/keystore/KeyGenParameterSpec;

    return-void
.end method

.method public constructor <init>(Lu00/e;Ljava/lang/String;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Ldb/j0;->w:I

    const-string p1, "apiKey"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p2, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lzd3/x;)V
    .locals 5

    const/16 v0, 0x11

    iput v0, p0, Ldb/j0;->w:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, "gcm.n.title"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    invoke-virtual {p1, v0}, Lzd3/x;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    invoke-virtual {p1, v0}, Lzd3/x;->h(Ljava/lang/String;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    array-length v2, v0

    new-array v2, v2, [Ljava/lang/String;

    move v3, v1

    .line 32
    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_1

    .line 33
    aget-object v4, v0, v3

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 34
    :cond_1
    :goto_1
    const-string v0, "gcm.n.body"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ldb/j0;->x:Ljava/lang/String;

    .line 35
    invoke-virtual {p1, v0}, Lzd3/x;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    invoke-virtual {p1, v0}, Lzd3/x;->h(Ljava/lang/String;)[Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_3

    .line 37
    :cond_2
    array-length v2, v0

    new-array v2, v2, [Ljava/lang/String;

    .line 38
    :goto_2
    array-length v3, v0

    if-ge v1, v3, :cond_3

    .line 39
    aget-object v3, v0, v1

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 40
    :cond_3
    :goto_3
    const-string v0, "gcm.n.icon"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    const-string v0, "gcm.n.sound2"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 43
    const-string v0, "gcm.n.sound"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    :cond_4
    const-string v0, "gcm.n.tag"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    const-string v0, "gcm.n.color"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    const-string v0, "gcm.n.click_action"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    const-string v0, "gcm.n.android_channel_id"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    const-string v0, "gcm.n.link_android"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 49
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 50
    const-string v0, "gcm.n.link"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 51
    :cond_5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 52
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 53
    :cond_6
    const-string v0, "gcm.n.image"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    const-string v0, "gcm.n.ticker"

    invoke-virtual {p1, v0}, Lzd3/x;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    const-string v0, "gcm.n.notification_priority"

    invoke-virtual {p1, v0}, Lzd3/x;->e(Ljava/lang/String;)Ljava/lang/Integer;

    .line 56
    const-string v0, "gcm.n.visibility"

    invoke-virtual {p1, v0}, Lzd3/x;->e(Ljava/lang/String;)Ljava/lang/Integer;

    .line 57
    const-string v0, "gcm.n.notification_count"

    invoke-virtual {p1, v0}, Lzd3/x;->e(Ljava/lang/String;)Ljava/lang/Integer;

    .line 58
    const-string v0, "gcm.n.sticky"

    invoke-virtual {p1, v0}, Lzd3/x;->c(Ljava/lang/String;)Z

    .line 59
    const-string v0, "gcm.n.local_only"

    invoke-virtual {p1, v0}, Lzd3/x;->c(Ljava/lang/String;)Z

    .line 60
    const-string v0, "gcm.n.default_sound"

    invoke-virtual {p1, v0}, Lzd3/x;->c(Ljava/lang/String;)Z

    .line 61
    const-string v0, "gcm.n.default_vibrate_timings"

    invoke-virtual {p1, v0}, Lzd3/x;->c(Ljava/lang/String;)Z

    .line 62
    const-string v0, "gcm.n.default_light_settings"

    invoke-virtual {p1, v0}, Lzd3/x;->c(Ljava/lang/String;)Z

    .line 63
    invoke-virtual {p1}, Lzd3/x;->j()Ljava/lang/Long;

    .line 64
    invoke-virtual {p1}, Lzd3/x;->g()[I

    .line 65
    invoke-virtual {p1}, Lzd3/x;->m()[J

    return-void
.end method

.method public static k(Led3/a;)Ldb/j0;
    .locals 6

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Led3/a;->L(I)V

    invoke-virtual {p0}, Led3/a;->y()I

    move-result v0

    shr-int/lit8 v1, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    const/4 v2, 0x5

    shl-int/2addr v0, v2

    invoke-virtual {p0}, Led3/a;->y()I

    move-result p0

    shr-int/lit8 p0, p0, 0x3

    and-int/lit8 p0, p0, 0x1f

    or-int/2addr p0, v0

    const/4 v0, 0x4

    if-eq v1, v0, :cond_3

    if-eq v1, v2, :cond_3

    const/4 v0, 0x7

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    if-ne v1, v0, :cond_1

    const-string v0, "hev1"

    goto :goto_1

    :cond_1
    const/16 v0, 0x9

    if-ne v1, v0, :cond_2

    const-string v0, "avc3"

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    const-string v0, "dvhe"

    :goto_1
    const/16 v2, 0xa

    const-string v3, ".0"

    if-ge p0, v2, :cond_4

    move-object v2, v3

    goto :goto_2

    :cond_4
    const-string v2, "."

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x18

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    add-int/2addr v5, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ldb/j0;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ldb/j0;-><init>(Ljava/lang/String;IZ)V

    return-object v0
.end method

.method public static l(Lx8/n;)Ldb/j0;
    .locals 6

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lx8/n;->G(I)V

    invoke-virtual {p0}, Lx8/n;->t()I

    move-result v0

    shr-int/lit8 v1, v0, 0x1

    and-int/lit8 v0, v0, 0x1

    const/4 v2, 0x5

    shl-int/2addr v0, v2

    invoke-virtual {p0}, Lx8/n;->t()I

    move-result p0

    shr-int/lit8 p0, p0, 0x3

    and-int/lit8 p0, p0, 0x1f

    or-int/2addr p0, v0

    const/4 v0, 0x4

    const/16 v3, 0xa

    if-eq v1, v0, :cond_3

    if-eq v1, v2, :cond_3

    const/4 v0, 0x7

    if-eq v1, v0, :cond_3

    const/16 v0, 0x8

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x9

    if-ne v1, v0, :cond_1

    const-string v0, "dvav"

    goto :goto_1

    :cond_1
    if-ne v1, v3, :cond_2

    const-string v0, "dav1"

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    return-object p0

    :cond_3
    :goto_0
    const-string v0, "dvhe"

    :goto_1
    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    const-string v4, ".0"

    if-ge v1, v3, :cond_4

    move-object v5, v4

    goto :goto_2

    :cond_4
    move-object v5, v2

    :goto_2
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    if-ge p0, v3, :cond_5

    move-object v2, v4

    :cond_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ldb/j0;

    const/16 v1, 0xb

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Ldb/j0;-><init>(Ljava/lang/String;IZ)V

    return-object v0
.end method

.method public static varargs s(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    array-length v0, p2

    if-lez v0, :cond_0

    :try_start_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "PlayCore"

    const-string v3, "Unable to format "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, ", "

    invoke-static {v0, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, " ["

    const-string v1, "]"

    invoke-static {p1, v0, p2, v1}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    :goto_0
    const-string p2, " : "

    invoke-static {p0, p2, p1}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;IILh6/x;)Z
    .locals 0

    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    iget-object p2, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-static {p1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p4, Lh6/x;->c:I

    and-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x4

    iput p1, p4, Lh6/x;->c:I

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public b()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldb/j0;->x:Ljava/lang/String;

    const/16 v2, 0x27

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/StringBuilder;Ljava/util/Iterator;)V
    .locals 2

    :try_start_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/CharSequence;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/CharSequence;

    goto :goto_2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_2
    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method

.method public d()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public e(Ls83/c;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-object p1
.end method

.method public f()Ldw/e;
    .locals 10

    new-instance v0, Ldw/e;

    new-instance v1, Lc5/l;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lc5/l;-><init>(I)V

    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-wide/16 v6, 0x5

    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iget-object v2, p0, Ldb/j0;->x:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-direct {v0, v1, v3, v2}, Ldw/e;-><init>(Lc5/l;Ljava/util/concurrent/ThreadPoolExecutor;Ljava/lang/String;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public g()Loe/a;
    .locals 1

    new-instance v0, Loe/a;

    invoke-direct {v0, p0}, Loe/a;-><init>(Ldb/j0;)V

    return-object v0
.end method

.method public h()Lre/l0;
    .locals 1

    new-instance v0, Lre/l0;

    invoke-direct {v0, p0}, Lre/l0;-><init>(Ldb/j0;)V

    return-object v0
.end method

.method public i()Ly00/c;
    .locals 7

    new-instance v0, Ly00/c;

    iget-object v5, p0, Ldb/j0;->x:Ljava/lang/String;

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldb/j0;->x:Ljava/lang/String;

    return-object v0
.end method

.method public m(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public p(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ldb/j0;->x:Ljava/lang/String;

    return-void
.end method

.method public varargs q(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x4

    const-string v1, "PlayCore"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ldb/j0;->s(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public varargs r(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x5

    const-string v1, "PlayCore"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ldb/j0;->s(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Ldb/j0;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MasterKey{keyAlias="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldb/j0;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", isKeyStoreBacked="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :try_start_0
    const-string v2, "AndroidKeyStore"

    invoke-static {v2}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    invoke-virtual {v2, v1}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/security/KeyStoreException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "}"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method
