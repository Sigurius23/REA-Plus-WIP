.class public Lu00/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lal/b;
.implements Lat/v;
.implements Lwy/b;
.implements Lbl/a;
.implements Lcq/h;
.implements Lq83/i;
.implements Ldg3/b;
.implements Ldp/a;
.implements Lp9/m;
.implements Lvg/g;


# static fields
.field public static final synthetic x:Lu00/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lu00/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    sput-object v0, Lu00/e;->x:Lu00/e;

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 0

    const/16 p1, 0x1c

    iput p1, p0, Lu00/e;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lu00/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    const/16 p1, 0xe

    iput p1, p0, Lu00/e;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Z)V
    .locals 0

    .line 2
    const/4 p1, 0x5

    iput p1, p0, Lu00/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static p(Ljava/lang/Boolean;Ljava/lang/String;ZLq20/a;ZLjava/util/List;Lsz/c0;Lc93/a;Lc93/a;ZLjava/util/List;Lcom/stripe/android/model/DisplayablePaymentDetails;ZLux/b;Lux/a;I)La30/n1;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p6

    move/from16 v2, p15

    and-int/lit16 v3, v2, 0x800

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v4

    goto :goto_0

    :cond_0
    move-object/from16 v3, p11

    :goto_0
    and-int/lit16 v2, v2, 0x1000

    const/4 v5, 0x0

    if-eqz v2, :cond_1

    move v2, v5

    goto :goto_1

    :cond_1
    move/from16 v2, p12

    :goto_1
    sget-object v6, Lh20/n1;->w:Lh20/n1;

    const-string v7, "walletsAllowedInHeader"

    move-object/from16 v11, p10

    invoke-static {v11, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cardFundingFilter"

    move-object/from16 v14, p13

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cardBrandFilter"

    move-object/from16 v15, p14

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v8, p0

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    new-instance v7, La30/m1;

    if-eqz v3, :cond_2

    invoke-static {v3, v2}, Ls2/e;->f0(Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lq00/o;

    move-result-object v2

    goto :goto_2

    :cond_2
    move-object v2, v4

    :goto_2
    if-eqz v2, :cond_3

    new-instance v0, Lh00/q;

    invoke-direct {v0, v2}, Lh00/q;-><init>(Lq00/o;)V

    goto :goto_3

    :cond_3
    if-eqz v0, :cond_4

    new-instance v2, Lh00/r;

    invoke-direct {v2, v0}, Lh00/r;-><init>(Ljava/lang/String;)V

    move-object v0, v2

    goto :goto_3

    :cond_4
    sget-object v0, Lh00/p;->a:Lh00/p;

    :goto_3
    invoke-direct {v7, v0, v6}, La30/m1;-><init>(Lse/h;Lh20/n1;)V

    move-object v9, v7

    goto :goto_4

    :cond_5
    move-object v9, v4

    :goto_4
    if-eqz v1, :cond_6

    iget-boolean v5, v1, Lsz/c0;->G:Z

    :cond_6
    if-eqz v1, :cond_7

    iget-object v0, v1, Lsz/c0;->H:Ljava/util/List;

    goto :goto_5

    :cond_7
    move-object v0, v4

    :goto_5
    if-nez v0, :cond_8

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_8
    if-eqz v1, :cond_b

    iget-object v1, v1, Lsz/c0;->E:Lsz/b0;

    new-instance v2, Lux/j;

    iget-boolean v3, v1, Lsz/b0;->w:Z

    iget-object v6, v1, Lsz/b0;->x:Lsz/a0;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_a

    const/4 v7, 0x1

    if-ne v6, v7, :cond_9

    sget-object v6, Lux/i;->y:Lux/i;

    goto :goto_6

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_a
    sget-object v6, Lux/i;->x:Lux/i;

    :goto_6
    iget-boolean v1, v1, Lsz/b0;->y:Z

    invoke-direct {v2, v3, v6, v1}, Lux/j;-><init>(ZLux/i;Z)V

    goto :goto_7

    :cond_b
    move-object v2, v4

    :goto_7
    new-instance v1, La30/l1;

    move-object/from16 v3, p3

    invoke-direct {v1, v3, v5, v2, v0}, La30/l1;-><init>(Lq20/a;ZLux/j;Ljava/util/List;)V

    if-eqz p2, :cond_c

    move-object v10, v1

    goto :goto_8

    :cond_c
    move-object v10, v4

    :goto_8
    if-nez v9, :cond_e

    if-eqz v10, :cond_d

    goto :goto_9

    :cond_d
    return-object v4

    :cond_e
    :goto_9
    invoke-static/range {p5 .. p5}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ly00/f4;->G:Lt9/c0;

    const-string v1, "card"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    if-nez p9, :cond_f

    const v0, 0x7f14108e

    :goto_a
    move v13, v0

    goto :goto_b

    :cond_f
    invoke-static/range {p5 .. p5}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_10

    if-nez p9, :cond_10

    const v0, 0x7f14108d

    goto :goto_a

    :cond_10
    invoke-static/range {p5 .. p5}, Lm83/s;->r1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    if-eqz p9, :cond_11

    const v0, 0x7f141090

    goto :goto_a

    :cond_11
    const v0, 0x7f14108f

    goto :goto_a

    :goto_b
    new-instance v8, La30/n1;

    move/from16 v12, p4

    move-object/from16 v16, p7

    move-object/from16 v17, p8

    invoke-direct/range {v8 .. v17}, La30/n1;-><init>(La30/m1;La30/l1;Ljava/util/List;ZILux/b;Lux/a;Lc93/a;Lc93/a;)V

    return-object v8
.end method

.method public static q()Lg/d0;
    .locals 4

    new-instance v0, Lg/d0;

    const/4 v1, 0x2

    sget-object v2, Lg/c0;->y:Lg/c0;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v3, v1, v2}, Lg/d0;-><init>(IIILkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public static t(FFFF)Landroid/graphics/Path;
    .locals 1

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    invoke-virtual {v0, p0, p1}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {v0, p2, p3}, Landroid/graphics/Path;->lineTo(FF)V

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Landroid/net/Uri;Lko/m;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/io/BufferedReader;

    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p1, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lx8/t;->M(Ljava/lang/String;)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public d(Landroid/content/Context;Ljava/lang/String;Z)I
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    const-string v2, "Failed to retrieve remote module version: "

    const-string v3, "Failed to load module via V2: "

    :try_start_0
    const-class v6, Ldp/b;

    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    sget-object v0, Ldp/b;->c:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-nez v0, :cond_9

    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-class v7, Lcom/google/android/gms/dynamite/DynamiteModule$DynamiteLoaderClassLoader;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v7, "sClassLoader"

    invoke-virtual {v0, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v7

    monitor-enter v7
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v0, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/ClassLoader;

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    if-ne v11, v12, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    if-eqz v11, :cond_1

    :try_start_4
    invoke-static {v11}, Ldp/b;->f(Ljava/lang/ClassLoader;)V
    :try_end_4
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_0
    :try_start_5
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto/16 :goto_3

    :cond_1
    invoke-static {v1}, Ldp/b;->d(Landroid/content/Context;)Z

    move-result v11

    if-nez v11, :cond_2

    monitor-exit v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    monitor-exit v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return v10

    :catchall_1
    move-exception v0

    goto/16 :goto_10

    :cond_2
    :try_start_7
    sget-boolean v11, Ldp/b;->e:Z

    if-nez v11, :cond_8

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v11, v9}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v12
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v12, :cond_3

    goto :goto_2

    :cond_3
    :try_start_8
    invoke-static {v1, v4, v5, v8}, Ldp/b;->e(Landroid/content/Context;Ljava/lang/String;ZZ)I

    move-result v12

    sget-object v13, Ldp/b;->d:Ljava/lang/String;

    if-eqz v13, :cond_7

    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {}, Ldp/d;->d0()Ljava/lang/ClassLoader;

    move-result-object v13

    if-eqz v13, :cond_5

    goto :goto_0

    :cond_5
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x1d

    if-lt v13, v14, :cond_6

    new-instance v13, Ldalvik/system/DelegateLastClassLoader;

    sget-object v14, Ldp/b;->d:Ljava/lang/String;

    invoke-static {v14}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Ldalvik/system/DelegateLastClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    goto :goto_0

    :cond_6
    new-instance v13, Ldp/e;

    sget-object v14, Ldp/b;->d:Ljava/lang/String;

    invoke-static {v14}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Ldalvik/system/PathClassLoader;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    :goto_0
    invoke-static {v13}, Ldp/b;->f(Ljava/lang/ClassLoader;)V

    invoke-virtual {v0, v9, v13}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sput-object v11, Ldp/b;->c:Ljava/lang/Boolean;
    :try_end_8
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :try_start_9
    monitor-exit v7
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    monitor-exit v6
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    return v12

    :cond_7
    :goto_1
    :try_start_b
    monitor-exit v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    monitor-exit v6
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    return v12

    :catch_1
    :try_start_d
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual {v0, v9, v11}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_8
    :goto_2
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual {v0, v9, v11}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_3
    monitor-exit v7

    goto :goto_6

    :goto_4
    monitor-exit v7
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :try_start_e
    throw v0
    :try_end_e
    .catch Ljava/lang/ClassNotFoundException; {:try_start_e .. :try_end_e} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_e .. :try_end_e} :catch_3
    .catch Ljava/lang/NoSuchFieldException; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_5

    :catch_4
    move-exception v0

    :goto_5
    :try_start_f
    const-string v7, "DynamiteModule"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    add-int/lit8 v11, v11, 0x1e

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v11}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_6
    sput-object v0, Ldp/b;->c:Ljava/lang/Boolean;

    :cond_9
    monitor-exit v6
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    :try_start_10
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    if-eqz v0, :cond_a

    :try_start_11
    invoke-static {v1, v4, v5, v10}, Ldp/b;->e(Landroid/content/Context;Ljava/lang/String;ZZ)I

    move-result v10
    :try_end_11
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    goto/16 :goto_e

    :catchall_2
    move-exception v0

    move-object v2, v0

    goto/16 :goto_11

    :catch_5
    move-exception v0

    :try_start_12
    const-string v3, "DynamiteModule"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x2a

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_e

    :cond_a
    const-string v11, "Failed to retrieve remote module version: "

    invoke-static {v1}, Ldp/b;->g(Landroid/content/Context;)Ldp/g;

    move-result-object v2
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    if-nez v2, :cond_b

    goto/16 :goto_e

    :cond_b
    :try_start_13
    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v0

    const/4 v3, 0x6

    invoke-virtual {v2, v0, v3}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    const/4 v0, 0x3

    if-lt v3, v0, :cond_12

    sget-object v0, Ldp/b;->h:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldp/f;

    if-eqz v3, :cond_c

    iget-object v3, v3, Ldp/f;->a:Landroid/database/Cursor;

    if-eqz v3, :cond_c

    invoke-interface {v3, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v10

    goto/16 :goto_e

    :cond_c
    new-instance v3, Lcp/b;

    invoke-direct {v3, v1}, Lcp/b;-><init>(Ljava/lang/Object;)V

    sget-object v6, Ldp/b;->i:Lat/b;

    invoke-virtual {v6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v2 .. v7}, Ldp/g;->o0(Lcp/b;Ljava/lang/String;ZJ)Lcp/a;

    move-result-object v2

    invoke-static {v2}, Lcp/b;->c0(Lcp/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/database/Cursor;
    :try_end_13
    .catch Landroid/os/RemoteException; {:try_start_13 .. :try_end_13} :catch_7
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    if-eqz v2, :cond_11

    :try_start_14
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_9

    :cond_d
    invoke-interface {v2, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    if-lez v3, :cond_f

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp/f;

    if-eqz v0, :cond_e

    iget-object v4, v0, Ldp/f;->a:Landroid/database/Cursor;

    if-nez v4, :cond_e

    iput-object v2, v0, Ldp/f;->a:Landroid/database/Cursor;
    :try_end_14
    .catch Landroid/os/RemoteException; {:try_start_14 .. :try_end_14} :catch_6
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    goto :goto_7

    :cond_e
    move v8, v10

    :goto_7
    if-eqz v8, :cond_f

    goto :goto_8

    :cond_f
    move-object v9, v2

    :goto_8
    if-eqz v9, :cond_10

    :try_start_15
    invoke-interface {v9}, Landroid/database/Cursor;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    :cond_10
    move v10, v3

    goto/16 :goto_e

    :catchall_3
    move-exception v0

    goto :goto_a

    :catch_6
    move-exception v0

    goto :goto_b

    :cond_11
    :goto_9
    :try_start_16
    const-string v0, "DynamiteModule"

    const-string v3, "Failed to retrieve remote module version."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_16
    .catch Landroid/os/RemoteException; {:try_start_16 .. :try_end_16} :catch_6
    .catchall {:try_start_16 .. :try_end_16} :catchall_3

    if-eqz v2, :cond_14

    :try_start_17
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    goto/16 :goto_e

    :goto_a
    move-object v9, v2

    goto/16 :goto_f

    :goto_b
    move-object v9, v2

    goto :goto_d

    :catchall_4
    move-exception v0

    goto/16 :goto_f

    :catch_7
    move-exception v0

    goto :goto_d

    :cond_12
    const/4 v6, 0x2

    if-ne v3, v6, :cond_13

    :try_start_18
    const-string v0, "DynamiteModule"

    const-string v3, "IDynamite loader version = 2, no high precision latency measurement."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcp/b;

    invoke-direct {v0, v1}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    invoke-static {v3, v0}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v3, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x5

    invoke-virtual {v2, v3, v0}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    :goto_c
    move v10, v2

    goto :goto_e

    :cond_13
    const-string v3, "DynamiteModule"

    const-string v6, "IDynamite loader version < 2, falling back to getModuleVersion2"

    invoke-static {v3, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v3, Lcp/b;

    invoke-direct {v3, v1}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v6

    invoke-static {v6, v3}, Llp/h;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v6, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v2, v6, v0}, Lip/a;->c0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    move-result v2

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_18
    .catch Landroid/os/RemoteException; {:try_start_18 .. :try_end_18} :catch_7
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    goto :goto_c

    :goto_d
    :try_start_19
    const-string v2, "DynamiteModule"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x2a

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_4

    if-eqz v9, :cond_14

    :try_start_1a
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_14
    :goto_e
    return v10

    :goto_f
    if-eqz v9, :cond_15

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_15
    throw v0
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_2

    :goto_10
    :try_start_1b
    monitor-exit v6
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    :try_start_1c
    throw v0
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_2

    :goto_11
    :try_start_1d
    invoke-static {v1}, Luo/w;->f(Ljava/lang/Object;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_8

    goto :goto_12

    :catch_8
    move-exception v0

    const-string v1, "CrashUtils"

    const-string v3, "Error adding exception to DropBox!"

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_12
    throw v2
.end method

.method public e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu00/e;->w:I

    packed-switch v0, :pswitch_data_0

    if-nez p2, :cond_0

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_0
    if-nez p2, :cond_1

    invoke-static {p1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    move-result-object p1

    :goto_1
    return-object p1

    :pswitch_1
    if-nez p2, :cond_2

    invoke-static {p1}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-static {p1, p2}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/crypto/KeyAgreement;

    move-result-object p1

    :goto_2
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Leg/f;

    new-instance v1, Leg/b;

    new-instance v2, Leg/a;

    invoke-direct {v2}, Leg/a;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v2}, Leg/b;-><init>(Leg/a;)V

    invoke-direct {v0, v1}, Leg/f;-><init>(Leg/b;)V

    return-object v0
.end method

.method public h(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public synthetic i(Ljava/lang/Object;)Lcq/u;
    .locals 0

    check-cast p1, Ljava/util/Map;

    sget p1, Lcom/google/android/gms/common/GoogleApiAvailability;->GOOGLE_PLAY_SERVICES_VERSION_CODE:I

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->d(Ljava/lang/Object;)Lcq/u;

    move-result-object p1

    return-object p1
.end method

.method public j(Lwk/e;Lz63/d;)V
    .locals 0

    return-void
.end method

.method public k(Landroid/content/Context;Ljava/lang/String;)I
    .locals 0

    invoke-static {p1, p2}, Ldp/b;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public l(Ljava/lang/CharSequence;II)Ldg3/a;
    .locals 6

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v1, p2, 0x3

    if-ge v1, v0, :cond_a

    add-int/lit8 v0, p2, 0x1

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    const/16 v2, 0x2f

    if-ne v0, v2, :cond_a

    add-int/lit8 v0, p2, 0x2

    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    if-eq v0, v2, :cond_0

    goto :goto_3

    :cond_0
    add-int/lit8 p2, p2, -0x1

    const/4 v0, -0x1

    move v2, v0

    move v3, v2

    :goto_0
    if-lt p2, p3, :cond_6

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const/16 v5, 0x41

    if-lt v4, v5, :cond_1

    const/16 v5, 0x5a

    if-le v4, v5, :cond_2

    :cond_1
    const/16 v5, 0x61

    if-lt v4, v5, :cond_3

    const/16 v5, 0x7a

    if-gt v4, v5, :cond_3

    :cond_2
    move v2, p2

    goto :goto_1

    :cond_3
    const/16 v5, 0x30

    if-lt v4, v5, :cond_4

    const/16 v5, 0x39

    if-gt v4, v5, :cond_4

    move v3, p2

    goto :goto_1

    :cond_4
    const/16 v5, 0x2b

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2d

    if-eq v4, v5, :cond_5

    const/16 v5, 0x2e

    if-eq v4, v5, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_6
    :goto_2
    if-lez v2, :cond_7

    add-int/lit8 p2, v2, -0x1

    if-ne p2, v3, :cond_7

    move v2, v0

    :cond_7
    if-ne v2, v0, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {v1, p1}, Lx43/j;->x(ILjava/lang/CharSequence;)I

    move-result p1

    if-ne p1, v0, :cond_9

    goto :goto_3

    :cond_9
    new-instance p2, Ldg3/a;

    sget-object p3, Lcg3/c;->w:Lcg3/c;

    add-int/lit8 p1, p1, 0x1

    invoke-direct {p2, p3, v2, p1}, Ldg3/a;-><init>(Lcg3/c;II)V

    return-object p2

    :cond_a
    :goto_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public m(Lorg/json/JSONObject;)Lvy/b;
    .locals 4

    const-string v0, "message"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const-string v1, "type"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const-string v3, "code"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    move-object v2, p1

    :cond_2
    new-instance p1, Lay/c;

    invoke-direct {p1, v0, v1, v2}, Lay/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public n(Lwk/e;)Ljava/io/File;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public o(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public r(Landroidx/room/z0;Landroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Landroidx/room/c;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Landroidx/room/c;

    iget v1, v0, Landroidx/room/c;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/c;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/c;

    invoke-direct {v0, p0, p4}, Landroidx/room/c;-><init>(Lu00/e;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Landroidx/room/c;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Landroidx/room/c;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Landroidx/room/c;->y:Ljava/util/concurrent/Callable;

    iget-object p2, v0, Landroidx/room/c;->x:Landroid/os/CancellationSignal;

    iget-object p1, v0, Landroidx/room/c;->w:Landroidx/room/z0;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-virtual {p1}, Landroidx/room/z0;->inTransaction()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    iput-object p1, v0, Landroidx/room/c;->w:Landroidx/room/z0;

    iput-object p2, v0, Landroidx/room/c;->x:Landroid/os/CancellationSignal;

    iput-object p3, v0, Landroidx/room/c;->y:Ljava/util/concurrent/Callable;

    iput v4, v0, Landroidx/room/c;->G:I

    const/4 p4, 0x0

    invoke-static {p1, p4, v0}, Lge3/g;->A(Landroidx/room/z0;ZLs83/c;)Lq83/j;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p4, Lq83/j;

    iput-object p1, v0, Landroidx/room/c;->w:Landroidx/room/z0;

    iput-object p2, v0, Landroidx/room/c;->x:Landroid/os/CancellationSignal;

    iput-object p3, v0, Landroidx/room/c;->y:Ljava/util/concurrent/Callable;

    iput-object p4, v0, Landroidx/room/c;->z:Lq83/j;

    iput v3, v0, Landroidx/room/c;->G:I

    new-instance v2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v2}, Lbc3/m;->s()V

    invoke-virtual {p1}, Landroidx/room/z0;->getCoroutineScope()Lbc3/c0;

    move-result-object p1

    new-instance v0, Landroidx/room/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v0, p3, v2, v5, v4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p1, p4, v5, v0, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    new-instance p3, Landroidx/room/d;

    const/4 p4, 0x0

    invoke-direct {p3, p4, p2, p1}, Landroidx/room/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p3}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method

.method public s(Landroidx/room/z0;ZLjava/util/concurrent/Callable;Lq83/d;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Landroidx/room/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Landroidx/room/b;

    iget v1, v0, Landroidx/room/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/room/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/room/b;

    invoke-direct {v0, p0, p4}, Landroidx/room/b;-><init>(Lu00/e;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Landroidx/room/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Landroidx/room/b;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p3, v0, Landroidx/room/b;->w:Ljava/util/concurrent/Callable;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-virtual {p1}, Landroidx/room/z0;->inTransaction()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-interface {p3}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    iput-object p3, v0, Landroidx/room/b;->w:Ljava/util/concurrent/Callable;

    iput v4, v0, Landroidx/room/b;->z:I

    invoke-static {p1, p2, v0}, Lge3/g;->A(Landroidx/room/z0;ZLs83/c;)Lq83/j;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p4, Lq83/j;

    new-instance p1, La13/h;

    const/4 p2, 0x1

    const/4 v2, 0x0

    invoke-direct {p1, p3, v2, p2}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v2, v0, Landroidx/room/b;->w:Ljava/util/concurrent/Callable;

    iput v3, v0, Landroidx/room/b;->z:I

    invoke-static {p4, p1, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    return-object p1
.end method
