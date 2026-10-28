.class public final Ll30/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lai/j;

.field public final b:Lq30/p0;

.field public final c:Landroid/util/DisplayMetrics;

.field public final d:Ljava/lang/String;

.field public final e:Landroid/telephony/TelephonyManager;

.field public final f:I

.field public final g:Landroid/media/AudioManager;

.field public final h:Landroid/content/pm/PackageManager;

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lai/j;Lq30/p0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll30/e;->a:Lai/j;

    iput-object p3, p0, Ll30/e;->b:Lq30/p0;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const-string p3, "getDisplayMetrics(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ll30/e;->c:Landroid/util/DisplayMetrics;

    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll30/e;->d:Ljava/lang/String;

    const-string p2, "phone"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/telephony/TelephonyManager;

    iput-object p2, p0, Ll30/e;->e:Landroid/telephony/TelephonyManager;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string p3, "secure_frp_mode"

    const/4 v0, 0x0

    invoke-static {p2, p3, v0}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p2

    iput p2, p0, Ll30/e;->f:I

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string p3, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/media/AudioManager;

    iput-object p2, p0, Ll30/e;->g:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Ll30/e;->h:Landroid/content/pm/PackageManager;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    iput p1, p0, Ll30/e;->i:I

    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string p2, "yyyyMMddHHmmss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll30/e;->j:Ljava/lang/String;

    const-class p1, Landroid/os/Build$VERSION_CODES;

    invoke-virtual {p1}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object p1

    const-string p2, "getFields(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p2, p1

    :goto_0
    if-ge v0, p2, :cond_1

    aget-object p3, p1, v0

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p3, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result p3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 p3, -0x1

    :goto_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ne p3, v2, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-nez v1, :cond_2

    const-string v1, "UNKNOWN"

    :cond_2
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iget p2, p0, Ll30/e;->i:I

    const-string p3, " "

    const-string v0, " API "

    const-string v2, "Android "

    invoke-static {v2, v1, p3, p1, v0}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll30/e;->k:Ljava/lang/String;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result p1

    div-int/lit16 p1, p1, 0x3e8

    div-int/lit8 p1, p1, 0x3c

    iput p1, p0, Ll30/e;->l:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq30/q0;Ls83/c;)Ljava/io/Serializable;
    .locals 8

    instance-of v0, p3, Ll30/d;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ll30/d;

    iget v1, v0, Ll30/d;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ll30/d;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Ll30/d;

    invoke-direct {v0, p0, p3}, Ll30/d;-><init>(Ll30/e;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ll30/d;->H:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ll30/d;->J:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Ll30/d;->G:I

    iget-object p2, v0, Ll30/d;->F:Ljava/lang/String;

    iget-object v1, v0, Ll30/d;->E:[Ll83/k;

    iget-object v2, v0, Ll30/d;->z:[Ll83/k;

    iget-object v4, v0, Ll30/d;->y:Lq30/q0;

    iget-object v5, v0, Ll30/d;->x:Ljava/lang/String;

    iget-object v0, v0, Ll30/d;->w:Ll30/e;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const/16 p3, 0xd

    new-array p3, p3, [Ll83/k;

    sget-object v2, Ll30/f;->x:Ll30/f;

    new-instance v2, Ll83/k;

    const-string v4, "C001"

    const-string v5, "Android"

    invoke-direct {v2, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x0

    aput-object v2, p3, v4

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v5, "||"

    invoke-static {v2, v5, v4}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "C002"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v4, p3, v3

    new-instance v2, Ll83/k;

    const-string v4, "C003"

    iget-object v5, p0, Ll30/e;->k:Ljava/lang/String;

    invoke-direct {v2, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v4, 0x2

    aput-object v2, p3, v4

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v5, Ll83/k;

    const-string v6, "C004"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x3

    aput-object v5, p3, v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    filled-new-array {v2}, [Ljava/util/Locale;

    move-result-object v2

    sget-object v5, Lb5/g;->b:Lb5/g;

    new-instance v5, Landroid/os/LocaleList;

    invoke-direct {v5, v2}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    invoke-static {v5}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v2

    invoke-virtual {v2}, Lb5/g;->e()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    const-string v6, "C005"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x4

    aput-object v5, p3, v2

    iget v2, p0, Ll30/e;->l:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    const-string v6, "C006"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aput-object v5, p3, v2

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-object v5, p0, Ll30/e;->c:Landroid/util/DisplayMetrics;

    iget v6, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v6}, Ljava/lang/Integer;-><init>(I)V

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v5}, Ljava/lang/Integer;-><init>(I)V

    filled-new-array {v7, v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%sx%s"

    invoke-static {v2, v5, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "C008"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x6

    aput-object v4, p3, v2

    iput-object p0, v0, Ll30/d;->w:Ll30/e;

    iput-object p1, v0, Ll30/d;->x:Ljava/lang/String;

    iput-object p2, v0, Ll30/d;->y:Lq30/q0;

    iput-object p3, v0, Ll30/d;->z:[Ll83/k;

    iput-object p3, v0, Ll30/d;->E:[Ll83/k;

    const-string v2, "C014"

    iput-object v2, v0, Ll30/d;->F:Ljava/lang/String;

    const/4 v4, 0x7

    iput v4, v0, Ll30/d;->G:I

    iput v3, v0, Ll30/d;->J:I

    iget-object v5, p0, Ll30/e;->a:Lai/j;

    invoke-virtual {v5, v0}, Lai/j;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v5, p1

    move-object v1, p3

    move p1, v4

    move-object v4, p2

    move-object p3, v0

    move-object p2, v2

    move-object v0, p0

    move-object v2, v1

    :goto_1
    check-cast p3, Ll30/a;

    iget-object p3, p3, Ll30/a;->w:Ljava/lang/String;

    new-instance v6, Ll83/k;

    invoke-direct {v6, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v6, v1, p1

    sget-object p1, Ll30/f;->x:Ll30/f;

    iget-object p1, v0, Ll30/e;->b:Lq30/p0;

    iget p1, v0, Ll30/e;->i:I

    iget-object p2, v0, Ll30/e;->e:Landroid/telephony/TelephonyManager;

    new-instance p3, Ll83/k;

    const-string v1, "C015"

    const-string v6, "2.2.0"

    invoke-direct {p3, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x8

    aput-object p3, v2, v1

    new-instance p3, Ll83/k;

    const-string v1, "C016"

    invoke-direct {p3, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x9

    aput-object p3, v2, v1

    iget-object p3, v0, Ll30/e;->j:Ljava/lang/String;

    new-instance v1, Ll83/k;

    const-string v5, "C017"

    invoke-direct {v1, v5, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p3, 0xa

    aput-object v1, v2, p3

    iget-object p3, v4, Lq30/q0;->w:Ljava/lang/String;

    new-instance v1, Ll83/k;

    const-string v4, "C018"

    invoke-direct {v1, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p3, 0xb

    aput-object v1, v2, p3

    iget-object p3, v0, Ll30/e;->d:Ljava/lang/String;

    new-instance v1, Ll83/k;

    const-string v4, "A137"

    invoke-direct {v1, v4, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 p3, 0xc

    aput-object v1, v2, p3

    invoke-static {v2}, Lm83/g0;->V([Ll83/k;)Ljava/util/HashMap;

    move-result-object p3

    const/16 v1, 0x1c

    if-lt p1, v1, :cond_4

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSimCarrierId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "A138"

    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSimCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "A139"

    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const/16 v1, 0x1d

    if-lt p1, v1, :cond_5

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "A141"

    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "A142"

    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Ll30/e;->h:Landroid/content/pm/PackageManager;

    const-string v2, "android.hardware.telephony.ims"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->isRttSupported()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "A150"

    invoke-virtual {p3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const/16 v1, 0x1e

    if-lt p1, v1, :cond_7

    invoke-virtual {p2}, Landroid/telephony/TelephonyManager;->getSubscriptionId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    const-string v1, "A145"

    invoke-virtual {p3, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p2, v0, Ll30/e;->f:I

    if-ne p2, v3, :cond_6

    const-string p2, "true"

    goto :goto_2

    :cond_6
    const-string p2, "false"

    :goto_2
    const-string v1, "A151"

    invoke-virtual {p3, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const/16 p2, 0x1f

    if-lt p1, p2, :cond_8

    const-string p2, "A153"

    sget-object v1, Landroid/os/Build;->SKU:Ljava/lang/String;

    invoke-virtual {p3, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "A154"

    sget-object v1, Landroid/os/Build;->SOC_MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p3, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "A155"

    sget-object v1, Landroid/os/Build;->SOC_MODEL:Ljava/lang/String;

    invoke-virtual {p3, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    const/16 p2, 0x21

    if-lt p1, p2, :cond_9

    iget-object p1, v0, Ll30/e;->g:Landroid/media/AudioManager;

    invoke-virtual {p1}, Landroid/media/AudioManager;->isRampingRingerEnabled()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string p2, "A152"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    return-object p3
.end method
