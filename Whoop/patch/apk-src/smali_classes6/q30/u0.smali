.class public final Lq30/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh5/u;
.implements Lub3/a;
.implements Luf/f;
.implements Lqq/a;
.implements Ls/w1;
.implements Lud3/v;
.implements Lo8/a;
.implements Lr/w;
.implements Ls/k;
.implements Ls40/e1;
.implements Lsn/t0;
.implements Lcq/d;
.implements Lto/n;


# static fields
.field public static y:Lq30/u0;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lq30/u0;->w:I

    sparse-switch p1, :sswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    .line 2
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-class p1, Ls30/a;

    invoke-static {p1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;)Ljava/util/ServiceLoader;

    move-result-object p1

    const-string v0, "load(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void

    .line 4
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Llo/e;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Llo/e;-><init>(I)V

    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_1
        0xe -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lq30/u0;->w:I

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    const/16 v0, 0x1d

    iput v0, p0, Lq30/u0;->w:I

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    new-instance v0, Lty/f;

    const-string v1, "context"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const-string v2, "getDisplayMetrics(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    invoke-virtual {v3, p1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 12
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    .line 13
    :goto_0
    instance-of v3, p1, Ll83/m;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    move-object p1, v4

    .line 14
    :cond_1
    check-cast p1, Landroid/content/pm/PackageInfo;

    if-eqz p1, :cond_2

    .line 15
    iget-object v4, p1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 16
    :cond_2
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 17
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v3

    int-to-long v5, v3

    .line 18
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 19
    invoke-virtual {p1, v5, v6, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v5

    long-to-int p1, v5

    .line 20
    rem-int/lit8 v3, p1, 0x3c

    const/16 v5, 0x3c

    if-nez v3, :cond_3

    .line 21
    div-int/2addr p1, v5

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 22
    :cond_3
    new-instance v3, Ljava/math/BigDecimal;

    invoke-direct {v3, p1}, Ljava/math/BigDecimal;-><init>(I)V

    const/4 p1, 0x2

    const/4 v6, 0x6

    .line 23
    invoke-virtual {v3, p1, v6}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object v3

    .line 24
    new-instance v7, Ljava/math/BigDecimal;

    invoke-direct {v7, v5}, Ljava/math/BigDecimal;-><init>(I)V

    .line 25
    new-instance v5, Ljava/math/MathContext;

    invoke-direct {v5, p1}, Ljava/math/MathContext;-><init>(I)V

    .line 26
    invoke-virtual {v3, v7, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/MathContext;)Ljava/math/BigDecimal;

    move-result-object v3

    .line 27
    invoke-virtual {v3, p1, v6}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "toString(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    :goto_1
    const-string v3, "timeZone"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object v2, v0, Lty/f;->a:Ljava/lang/String;

    .line 32
    iput-object v4, v0, Lty/f;->b:Ljava/lang/String;

    .line 33
    iput-object p1, v0, Lty/f;->c:Ljava/lang/String;

    .line 34
    iget p1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "w_"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "h_"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "dpi"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lty/f;->d:Ljava/lang/String;

    .line 35
    sget-object p1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v3, "Android "

    const-string v4, " "

    .line 36
    invoke-static {v3, p1, v4, v1, v4}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 37
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lty/f;->e:Ljava/lang/String;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbg/g;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lq30/u0;->w:I

    const-string v0, "hr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lq30/u0;->w:I

    const-string v0, "backUpTarget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq30/u0;->w:I

    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lne/b;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lq30/u0;->w:I

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Lty/b;)Lty/e;
    .locals 21

    move-object/from16 v0, p1

    new-instance v1, Lty/e;

    move-object/from16 v2, p0

    iget-object v3, v2, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v3, Lty/f;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v5, Ll83/k;

    const-string v6, "v2"

    invoke-direct {v5, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v6, "tag"

    const-string v7, "22.6.1"

    invoke-direct {v4, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "src"

    const-string v8, "android-sdk"

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "toString(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "v"

    invoke-static {v8, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    new-instance v9, Ll83/k;

    const-string v10, "c"

    invoke-direct {v9, v10, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v3, Lty/f;->e:Ljava/lang/String;

    invoke-static {v8, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    new-instance v10, Ll83/k;

    const-string v11, "d"

    invoke-direct {v10, v11, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v3, Lty/f;->d:Ljava/lang/String;

    invoke-static {v8, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    new-instance v12, Ll83/k;

    const-string v13, "f"

    invoke-direct {v12, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v7, v3, Lty/f;->c:Ljava/lang/String;

    invoke-static {v8, v7}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    new-instance v8, Ll83/k;

    const-string v13, "g"

    invoke-direct {v8, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v9, v10, v12, v8}, [Ll83/k;

    move-result-object v7

    invoke-static {v7}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    new-instance v8, Ll83/k;

    const-string v9, "a"

    invoke-direct {v8, v9, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    iget-object v9, v0, Lty/b;->x:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    const-string v10, ""

    if-nez v9, :cond_1

    move-object v9, v10

    :cond_1
    new-instance v12, Ll83/k;

    invoke-direct {v12, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v0, :cond_2

    iget-object v9, v0, Lty/b;->y:Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_3

    move-object v9, v10

    :cond_3
    new-instance v13, Ll83/k;

    const-string v11, "e"

    invoke-direct {v13, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, v3, Lty/f;->a:Ljava/lang/String;

    new-instance v14, Ll83/k;

    const-string v11, "k"

    invoke-direct {v14, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v9, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    new-instance v15, Ll83/k;

    const-string v11, "o"

    invoke-direct {v15, v11, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    new-instance v11, Ll83/k;

    const-string v7, "p"

    invoke-direct {v11, v7, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v7, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    new-instance v9, Ll83/k;

    const-string v2, "q"

    invoke-direct {v9, v2, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    new-instance v7, Ll83/k;

    move-object/from16 v17, v9

    const-string v9, "r"

    invoke-direct {v7, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v9, Ll83/k;

    move-object/from16 v18, v7

    const-string v7, "s"

    invoke-direct {v9, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v2, Landroid/os/Build;->TAGS:Ljava/lang/String;

    new-instance v7, Ll83/k;

    move-object/from16 v19, v9

    const-string v9, "t"

    invoke-direct {v7, v9, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v20, v7

    move-object/from16 v16, v11

    filled-new-array/range {v12 .. v20}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, v3, Lty/f;->b:Ljava/lang/String;

    if-eqz v3, :cond_4

    const-string v7, "l"

    invoke-static {v7, v3}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_5

    sget-object v3, Lm83/z;->w:Lm83/z;

    :cond_5
    invoke-static {v2, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v7, "b"

    invoke-direct {v3, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v4, v6, v8, v3}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    if-eqz v0, :cond_6

    iget-object v7, v0, Lty/b;->w:Ljava/lang/String;

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    :goto_3
    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    move-object v10, v7

    :goto_4
    invoke-direct {v1, v10, v2}, Lty/e;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public B()Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, [Ljava/io/File;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public C()Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0
.end method

.method public D(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio sink error"

    invoke-static {v0, v1, p1}, Llo/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Ltm/v;

    iget-object v0, v0, Ltm/v;->f1:Lq3/i;

    iget-object v1, v0, Lq3/i;->w:Ljava/lang/Object;

    check-cast v1, Landroid/os/Handler;

    if-eqz v1, :cond_0

    new-instance v2, Ltm/i;

    const/4 v3, 0x7

    invoke-direct {v2, v0, p1, v3}, Ltm/i;-><init>(Lq3/i;Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public E()V
    .locals 4

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    sub-int/2addr v2, v3

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    return-void
.end method

.method public F()V
    .locals 2

    new-instance v0, Lbq/b;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v1, Lto/v;

    iget-object v1, v1, Lto/v;->r:Lto/f;

    iget-object v1, v1, Lto/f;->N:Ljp/d;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public a()Z
    .locals 5

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, [Lsn/t0;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    invoke-interface {v4}, Lsn/t0;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lq30/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/location/FusedLocationProviderClient;->zzd(Lnp/i;Lcq/i;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Ltp/j;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    new-instance v1, Lcq/q;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p2}, Lcq/q;-><init>(ILcq/i;)V

    invoke-virtual {p1}, Luo/c;->c()V

    if-eqz v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const-string v2, "locationSettingsRequest can\'t be null nor empty."

    invoke-static {p2, v2}, Luo/w;->b(ZLjava/lang/String;)V

    new-instance p2, Lnp/h;

    const-string v2, "com.google.android.gms.location.internal.ISettingsCallbacks"

    const/4 v3, 0x2

    invoke-direct {p2, v2, v3}, Lip/h;-><init>(Ljava/lang/String;I)V

    iput-object v1, p2, Lnp/h;->g:Lcq/q;

    invoke-virtual {p1}, Luo/c;->j()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lnp/e;

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {v1, v0}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v1, p2}, Lnp/l;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p2, 0x0

    invoke-virtual {v1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/16 p2, 0x3f

    invoke-virtual {p1, v1, p2}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Landroid/location/Location;

    check-cast p1, Lnp/i;

    check-cast p2, Lcq/i;

    iget-object p1, p1, Lnp/i;->A:Lcd3/g;

    iget-object p1, p1, Lcd3/g;->E:Ljava/lang/Object;

    check-cast p1, Laj/c;

    iget-object v1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast v1, Lnp/i;

    invoke-virtual {v1}, Luo/c;->c()V

    invoke-virtual {p1}, Laj/c;->a0()Lnp/e;

    move-result-object p1

    invoke-virtual {p1}, Lnp/a;->s()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {v1, v0}, Lnp/l;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    const/16 v0, 0xd

    invoke-virtual {p1, v1, v0}, Lnp/a;->c0(Landroid/os/Parcel;I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcq/i;->b(Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1a
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Luf/w;Lq83/d;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lne/b;

    instance-of v1, p2, Lqe/a;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lqe/a;

    iget v2, v1, Lqe/a;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lqe/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lqe/a;

    check-cast p2, Ls83/c;

    invoke-direct {v1, p0, p2}, Lqe/a;-><init>(Lq30/u0;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lqe/a;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lqe/a;->z:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lqe/a;->w:Luf/w;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "config"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, v0, Lne/b;->z:Ljava/lang/String;

    iget-boolean v3, v0, Lne/b;->M:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iget-boolean v5, v0, Lne/b;->N:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-object v6, v0, Lne/b;->H:Lcg/o;

    if-eqz v6, :cond_3

    iget-object v6, v6, Lcg/o;->h:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    iget-object v7, p1, Luf/w;->a:Ldg/a;

    sget-object v8, Lcf/l;->a:Lgf/a;

    invoke-static {v7, v8}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v0, v0, Lne/b;->G:Ljc/b;

    iput-object p1, v1, Lqe/a;->w:Luf/w;

    iput v4, v1, Lqe/a;->z:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcg/o;->i:Lcg/n;

    if-eqz v6, :cond_6

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-static {v0, v6}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    new-instance v0, Lgf/c;

    invoke-direct {v0}, Lgf/c;-><init>()V

    invoke-static {}, Lbf/b;->e()Lgf/a;

    move-result-object v1

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v4, "<this>"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance v1, Lef/a;

    invoke-direct {v1, p2, v0}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    :goto_2
    move-object p2, v1

    goto/16 :goto_4

    :cond_4
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: Dualstack and custom endpoint are not supported"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: FIPS and custom endpoint are not supported"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-eqz p2, :cond_17

    invoke-static {p2}, Lqe/b;->a(Ljava/lang/String;)Lfe/b;

    move-result-object v1

    if-eqz v1, :cond_17

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "https://cognito-idp-fips."

    const/16 v8, 0x2e

    if-eqz v6, :cond_c

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v1}, Lfe/b;->d()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v1}, Lfe/b;->c()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "us-east-1"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    new-instance p2, Lef/a;

    const-string v1, "https://cognito-idp-fips.us-east-1.amazonaws.com"

    invoke-static {v0, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :cond_7
    const-string v3, "us-east-2"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    new-instance p2, Lef/a;

    const-string v1, "https://cognito-idp-fips.us-east-2.amazonaws.com"

    invoke-static {v0, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :cond_8
    const-string v3, "us-west-1"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance p2, Lef/a;

    const-string v1, "https://cognito-idp-fips.us-west-1.amazonaws.com"

    invoke-static {v0, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :cond_9
    const-string v3, "us-west-2"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    new-instance p2, Lef/a;

    const-string v1, "https://cognito-idp-fips.us-west-2.amazonaws.com"

    invoke-static {v0, v1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_4

    :cond_a
    new-instance v3, Lef/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lfe/b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    invoke-direct {v3, p2}, Lef/a;-><init>(Lcg/o;)V

    :goto_3
    move-object p2, v3

    goto/16 :goto_4

    :cond_b
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "FIPS and DualStack are enabled, but this partition does not support one or both"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v1}, Lfe/b;->d()Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    new-instance v3, Lef/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lfe/b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    invoke-direct {v3, p2}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_3

    :cond_d
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "FIPS is enabled but this partition does not support FIPS"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "https://cognito-idp."

    if-eqz v3, :cond_11

    invoke-virtual {v1}, Lfe/b;->c()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const-string v3, "aws"

    iget-object v4, v1, Lfe/b;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    new-instance v1, Lef/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ".amazonaws.com"

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    invoke-direct {v1, p2}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_2

    :cond_f
    new-instance v3, Lef/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lfe/b;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    invoke-direct {v3, p2}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_3

    :cond_10
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "DualStack is enabled but this partition does not support DualStack"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance v3, Lef/a;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lfe/b;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2

    invoke-direct {v3, p2}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_3

    :goto_4
    if-ne p2, v2, :cond_12

    return-object v2

    :cond_12
    :goto_5
    check-cast p2, Lef/a;

    iget-object v0, p2, Lef/a;->b:Lgf/b;

    sget-object v1, Lbf/b;->c:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v1, p1, Luf/w;->a:Ldg/a;

    sget-object v2, Lbf/c;->z:Lbf/c;

    invoke-static {v1, v2}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_13
    sget-object v1, Lbf/b;->b:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, p1, Luf/w;->a:Ldg/a;

    sget-object v2, Lbf/c;->E:Lbf/c;

    invoke-static {v1, v2}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_14
    sget-object v1, Lwe/f;->d:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-static {v0, v1}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "s3express"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    iget-object v0, p1, Luf/w;->a:Ldg/a;

    sget-object v1, Lie/b;->x:Lie/b;

    invoke-static {v0, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_15
    iget-object v0, p1, Luf/w;->c:Lxf/a;

    invoke-interface {v0}, Lxf/a;->getAttributes()Lgf/b;

    move-result-object v0

    sget-object v1, Lxd/a;->b:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v0

    if-eqz v0, :cond_16

    iget-object p1, p1, Luf/w;->a:Ldg/a;

    sget-object v0, Lbf/c;->G:Lbf/c;

    invoke-static {p1, v0}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_16
    return-object p2

    :cond_17
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: Missing Region"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()J
    .locals 11

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, [Lsn/t0;

    array-length v1, v0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    move-wide v5, v2

    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    if-ge v4, v1, :cond_1

    aget-object v9, v0, v4

    invoke-interface {v9}, Lsn/t0;->d()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-eqz v7, :cond_0

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    cmp-long v0, v5, v2

    if-nez v0, :cond_2

    return-wide v7

    :cond_2
    return-wide v5
.end method

.method public g(Lr/l;Z)V
    .locals 2

    instance-of v0, p1, Lr/d0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lr/d0;

    iget-object v0, v0, Lr/d0;->A:Lr/l;

    invoke-virtual {v0}, Lr/l;->l()Lr/l;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr/l;->d(Z)V

    :cond_0
    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Ls/h;

    iget-object v0, v0, Ls/h;->E:Lr/w;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lr/w;->g(Lr/l;Z)V

    :cond_1
    return-void
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 3

    const-string v0, "hostname"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln20/j;

    const/16 v1, 0x18

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2, v1}, Ln20/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object p1, Lq83/k;->w:Lq83/k;

    invoke-static {p1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public m()J
    .locals 11

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, [Lsn/t0;

    array-length v1, v0

    const-wide v2, 0x7fffffffffffffffL

    const/4 v4, 0x0

    move-wide v5, v2

    :goto_0
    const-wide/high16 v7, -0x8000000000000000L

    if-ge v4, v1, :cond_1

    aget-object v9, v0, v4

    invoke-interface {v9}, Lsn/t0;->m()J

    move-result-wide v9

    cmp-long v7, v9, v7

    if-eqz v7, :cond_0

    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    cmp-long v0, v5, v2

    if-nez v0, :cond_2

    return-wide v7

    :cond_2
    return-wide v5
.end method

.method public n(J)V
    .locals 4

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, [Lsn/t0;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3, p1, p2}, Lsn/t0;->n(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 4

    iget-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->O:Lh5/q1;

    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iput-object p2, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->O:Lh5/q1;

    invoke-virtual {p2}, Lh5/q1;->d()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iput-boolean v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->P:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object v0, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v0}, Lh5/o1;->o()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    :goto_2
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lq4/e;

    iget-object v3, v3, Lq4/e;->a:Lq4/b;

    if-eqz v3, :cond_3

    invoke-virtual {v3, p1, v2, p2}, Lq4/b;->j(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p2

    iget-object v2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {v2}, Lh5/o1;->o()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public bridge synthetic p(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljava/lang/Void;

    iget-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    iget v0, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;->z:I

    iget-object v1, p1, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;->E:Landroid/content/Intent;

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iget-object p1, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public r(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 5

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lq93/p;

    check-cast p1, Lr93/e;

    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object p1

    const-string v1, "getSupertypes(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2}, Llb3/y;->i0()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->d()Lr93/h;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lr93/h;->a()Lr93/h;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    instance-of v4, v2, Lr93/e;

    if-eqz v4, :cond_2

    check-cast v2, Lr93/e;

    goto :goto_2

    :cond_2
    move-object v2, v3

    :goto_2
    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v2}, Lq93/p;->f(Lr93/e;)Lja3/i;

    move-result-object v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public s(Lr/l;)Z
    .locals 3

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Ls/h;

    iget-object v1, v0, Ls/h;->y:Lr/l;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move-object v1, p1

    check-cast v1, Lr/d0;

    iget-object v1, v1, Lr/d0;->B:Lr/n;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ls/h;->E:Lr/w;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lr/w;->s(Lr/l;)Z

    move-result p1

    return p1

    :cond_1
    return v2
.end method

.method public t(Lr/l;Landroid/view/MenuItem;)V
    .locals 0

    iget-object p2, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast p2, Lr/f;

    iget-object p2, p2, Lr/f;->F:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public u(J)Z
    .locals 17

    move-wide/from16 v0, p1

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lq30/u0;->d()J

    move-result-wide v4

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v8, v4, v6

    if-nez v8, :cond_1

    return v3

    :cond_1
    move-object/from16 v8, p0

    iget-object v9, v8, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v9, [Lsn/t0;

    array-length v10, v9

    move v11, v2

    move v12, v11

    :goto_0
    if-ge v11, v10, :cond_5

    aget-object v13, v9, v11

    invoke-interface {v13}, Lsn/t0;->d()J

    move-result-wide v14

    cmp-long v16, v14, v6

    if-eqz v16, :cond_2

    cmp-long v16, v14, v0

    if-gtz v16, :cond_2

    const/16 v16, 0x1

    goto :goto_1

    :cond_2
    move/from16 v16, v2

    :goto_1
    cmp-long v14, v14, v4

    if-eqz v14, :cond_3

    if-eqz v16, :cond_4

    :cond_3
    invoke-interface {v13, v0, v1}, Lsn/t0;->u(J)Z

    move-result v13

    or-int/2addr v12, v13

    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_5
    or-int/2addr v3, v12

    if-nez v12, :cond_0

    return v3
.end method

.method public w()Lro/d;
    .locals 3

    new-instance v0, Lro/d;

    iget-object v1, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/auth/api/signin/internal/SignInHubActivity;

    sget-object v2, Lcom/google/android/gms/common/api/k;->a:Ljava/util/Set;

    monitor-enter v2

    :try_start_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {v0, v1, v2}, Lro/d;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public x(Lr/l;Lr/n;)V
    .locals 7

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lr/f;

    iget-object v1, v0, Lr/f;->F:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, v0, Lr/f;->H:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr/e;

    iget-object v6, v6, Lr/e;->b:Lr/l;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lr/e;

    :cond_3
    new-instance v0, Lh5/w0;

    invoke-direct {v0, p0, v2, p2, p1}, Lh5/w0;-><init>(Lq30/u0;Lr/e;Lr/n;Lr/l;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    invoke-virtual {v1, v0, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public y(IZ)V
    .locals 1

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Llo/e;

    if-eqz p2, :cond_0

    invoke-virtual {v0, p1}, Llo/e;->a(I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public z(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, [Ljava/lang/Object;

    array-length v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lq30/u0;->x:Ljava/lang/Object;

    check-cast v0, Lmm/d;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    const/4 v2, 0x1

    aget-object p1, p1, v2

    iget-object v0, v0, Lmm/d;->x:Ljava/lang/Object;

    check-cast v0, Lm22/b;

    invoke-static {v0, v1, p1}, Lo52/n;->H(Lm22/b;Ljava/lang/Object;Ljava/lang/Object;)Ll83/k;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Array of size 2 expected but got "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
