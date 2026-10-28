.class public abstract Lwb3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/a;
.implements Log/j;


# static fields
.field public static volatile a:Laj/d;

.field public static volatile b:Laj/c;


# direct methods
.method public static B(Ljava/util/Collection;)Li93/j;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li93/j;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    const/4 v1, 0x1

    sub-int/2addr p0, v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, p0, v1}, Li93/h;-><init>(III)V

    return-object v0
.end method

.method public static C(Ljava/util/List;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final D(Landroidx/fragment/app/m0;Lvf3/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const/4 v5, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v3, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0
.end method

.method public static E(Landroid/content/Context;)Ljava/io/File;
    .locals 5

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, ".font"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x64

    if-ge v2, v3, :cond_2

    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_1

    return-object v3

    :catch_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static F(Landroid/content/Context;)Z
    .locals 3

    const-string v0, "The application context is required."

    invoke-static {p0, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p0, v2, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final G(II)I
    .locals 0

    shr-int/2addr p0, p1

    and-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static final H(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "method"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "POST"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PATCH"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "PUT"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "DELETE"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "MOVE"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;
    .locals 7

    const-string v0, "tracer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "executor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Landroidx/lifecycle/u0;

    sget-object v0, Lic/e0;->b:Lic/c0;

    invoke-direct {v6, v0}, Landroidx/lifecycle/p0;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lic/g0;

    move-object v3, p0

    move-object v4, p1

    move-object v2, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lic/g0;-><init>(Ljava/util/concurrent/Executor;Lic/y;Ljava/lang/String;Lc93/a;Landroidx/lifecycle/u0;)V

    invoke-static {v1}, Lj93/l0;->z(Ld4/j;)Ld4/l;

    move-result-object p0

    new-instance p1, Lic/f0;

    invoke-direct {p1, v6, p0}, Lic/f0;-><init>(Landroidx/lifecycle/u0;Ld4/l;)V

    return-object p1
.end method

.method public static J(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "singletonList(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static varargs K([Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-lez v0, :cond_0

    invoke-static {p0}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static L(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final M(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    sget-object v0, Lb2/q;->w:Lb2/q;

    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p0, Lp1/q;

    const v0, 0x48ae8da7

    invoke-virtual {p0, v0}, Lp1/q;->f0(I)V

    new-instance v0, Lb2/r;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb2/r;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-interface {p1, v1, v0}, Landroidx/compose/ui/Modifier;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/compose/ui/Modifier;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public static final N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    check-cast p0, Lp1/q;

    const v0, 0x1a365f2c

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    invoke-static {p0, p1}, Lwb3/f;->M(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    return-object p1
.end method

.method public static O(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;
    .locals 8

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const/4 v1, 0x0

    :try_start_0
    const-string v0, "r"

    invoke-virtual {p0, p1, v0, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;

    move-result-object p0

    if-nez p0, :cond_0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v6

    sget-object v3, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    const-wide/16 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-object v0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    move-object p1, v0

    :try_start_6
    invoke-virtual {v2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_1
    :try_start_7
    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception v0

    move-object p0, v0

    :try_start_8
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    :catch_0
    :cond_1
    return-object v1
.end method

.method public static varargs P([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "elements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Lm83/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lm83/l;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static varargs R([Ljava/lang/String;)Lud3/d0;
    .locals 6

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    const-string v0, "inputNamesAndValues"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p0

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    if-nez v0, :cond_3

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v0, v4

    if-eqz v5, :cond_0

    aget-object v5, p0, v4

    invoke-static {v5}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Headers cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    array-length p0, v0

    add-int/lit8 p0, p0, -0x1

    invoke-static {v3, p0, v1}, Lj93/l0;->F(III)I

    move-result p0

    if-ltz p0, :cond_2

    :goto_1
    aget-object v1, v0, v3

    add-int/lit8 v2, v3, 0x1

    aget-object v2, v0, v2

    invoke-static {v1}, Lva3/b;->e(Ljava/lang/String;)V

    invoke-static {v2, v1}, Lva3/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    if-eq v3, p0, :cond_2

    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :cond_2
    new-instance p0, Lud3/d0;

    invoke-direct {p0, v0}, Lud3/d0;-><init>([Ljava/lang/String;)V

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected alternating header names and values"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final U(Ljava/util/List;)Ljava/util/List;
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static V(Ljava/lang/String;)Lbg/e;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "host"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Le93/b;->S(Ljava/lang/String;)Lbg/h;

    move-result-object v1

    const/4 v2, 0x6

    const/16 v3, 0x2e

    const-string v4, "<this>"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v1, :cond_0

    goto/16 :goto_b

    :cond_0
    new-array v1, v6, [C

    const/16 v7, 0x25

    aput-char v7, v1, v5

    invoke-static {v0, v1, v5, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-le v8, v10, :cond_2

    :cond_1
    :goto_0
    move-object v1, v9

    goto/16 :goto_b

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-ne v8, v10, :cond_3

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_1

    invoke-static {v8, v7, v5}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v7

    if-nez v7, :cond_1

    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ne v7, v10, :cond_4

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    move-object/from16 v20, v7

    goto :goto_1

    :cond_4
    move-object/from16 v20, v9

    :goto_1
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v7, "::"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    const/16 v8, 0x8

    const/4 v11, 0x7

    if-le v7, v10, :cond_5

    :goto_2
    move-object v1, v9

    goto/16 :goto_7

    :cond_5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ne v7, v6, :cond_6

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const-string v7, ":"

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7, v2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_7

    :cond_6
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    const-string v12, ""

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/16 v13, 0x3a

    sget-object v14, Lm83/y;->w:Lm83/y;

    if-eqz v7, :cond_7

    move-object v7, v14

    goto :goto_3

    :cond_7
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/CharSequence;

    new-array v15, v6, [C

    aput-char v13, v15, v5

    invoke-static {v7, v15, v5, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v7

    :goto_3
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    goto :goto_4

    :cond_8
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    new-array v12, v6, [C

    aput-char v13, v12, v5

    invoke-static {v1, v12, v5, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v14

    :goto_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    add-int/2addr v12, v1

    if-ne v12, v8, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v14}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_a

    invoke-static {v1, v3, v5}, Lyb3/r;->T(Ljava/lang/CharSequence;CZ)Z

    move-result v1

    if-ne v1, v6, :cond_a

    move v1, v11

    goto :goto_5

    :cond_a
    move v1, v8

    :goto_5
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v12

    sub-int/2addr v1, v12

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v12

    sub-int/2addr v1, v12

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v12

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v12, v7}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    move v7, v5

    :goto_6
    if-ge v7, v1, :cond_b

    const-string v13, "0"

    invoke-virtual {v12, v13}, Ln83/c;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_b
    check-cast v14, Ljava/util/Collection;

    invoke-virtual {v12, v14}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v12}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v1

    :goto_7
    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v7, v11, :cond_d

    goto/16 :goto_0

    :cond_d
    move v7, v5

    :goto_8
    if-ge v7, v2, :cond_f

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v12}, Le93/b;->N(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_e

    goto/16 :goto_0

    :cond_e
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_f
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    const/16 v12, 0xa

    if-ne v7, v11, :cond_13

    invoke-interface {v1, v5, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ls7/a;->t(Ljava/lang/String;)S

    move-result v10

    new-instance v11, Ll83/y;

    invoke-direct {v11, v10}, Ll83/y;-><init>(S)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_10
    new-instance v12, Ll83/y;

    invoke-direct {v12, v5}, Ll83/y;-><init>(S)V

    new-instance v13, Ll83/y;

    invoke-direct {v13, v5}, Ll83/y;-><init>(S)V

    new-instance v14, Ll83/y;

    invoke-direct {v14, v5}, Ll83/y;-><init>(S)V

    new-instance v15, Ll83/y;

    invoke-direct {v15, v5}, Ll83/y;-><init>(S)V

    new-instance v7, Ll83/y;

    invoke-direct {v7, v5}, Ll83/y;-><init>(S)V

    new-instance v10, Ll83/y;

    const/4 v11, -0x1

    invoke-direct {v10, v11}, Ll83/y;-><init>(S)V

    move-object/from16 v16, v7

    move-object/from16 v17, v10

    filled-new-array/range {v12 .. v17}, [Ll83/y;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto/16 :goto_0

    :cond_11
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Le93/b;->S(Ljava/lang/String;)Lbg/h;

    move-result-object v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    invoke-virtual {v1}, Lbg/h;->U()Lbg/k;

    move-result-object v1

    goto/16 :goto_b

    :cond_13
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    if-eq v7, v8, :cond_14

    goto/16 :goto_0

    :cond_14
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Le93/b;->N(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Le93/b;->N(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_15

    goto/16 :goto_0

    :cond_15
    check-cast v1, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v1, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ls7/a;->t(Ljava/lang/String;)S

    move-result v8

    new-instance v9, Ll83/y;

    invoke-direct {v9, v8}, Ll83/y;-><init>(S)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_16
    new-instance v1, Lbg/k;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/y;

    iget-short v12, v8, Ll83/y;->w:S

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/y;

    iget-short v13, v8, Ll83/y;->w:S

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/y;

    iget-short v14, v8, Ll83/y;->w:S

    const/4 v8, 0x3

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/y;

    iget-short v15, v8, Ll83/y;->w:S

    const/4 v8, 0x4

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll83/y;

    iget-short v8, v8, Ll83/y;->w:S

    const/4 v9, 0x5

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll83/y;

    iget-short v9, v9, Ll83/y;->w:S

    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll83/y;

    iget-short v10, v10, Ll83/y;->w:S

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll83/y;

    iget-short v7, v7, Ll83/y;->w:S

    move-object v11, v1

    move/from16 v19, v7

    move/from16 v16, v8

    move/from16 v17, v9

    move/from16 v18, v10

    invoke-direct/range {v11 .. v20}, Lbg/k;-><init>(SSSSSSSSLjava/lang/String;)V

    :goto_b
    if-eqz v1, :cond_17

    new-instance v0, Lbg/d;

    invoke-direct {v0, v1}, Lbg/d;-><init>(Landroidx/room/c1;)V

    return-object v0

    :cond_17
    new-array v1, v6, [C

    aput-char v3, v1, v5

    invoke-static {v0, v1, v5, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_18

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_18

    goto :goto_d

    :cond_18
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_19
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v6, v3, :cond_1b

    const/16 v7, 0x40

    if-ge v3, v7, :cond_1b

    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-static {v6, v2}, Lyb3/r;->W(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move v3, v5

    :goto_c
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v3, v7, :cond_19

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    move-result v8

    if-nez v8, :cond_1a

    const/16 v8, 0x2d

    if-ne v7, v8, :cond_1b

    :cond_1a
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_1b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, " is not a valid inet host"

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    :goto_d
    new-instance v1, Lbg/c;

    invoke-direct {v1, v0}, Lbg/c;-><init>(Ljava/lang/String;)V

    return-object v1
.end method

.method public static W(ILjava/lang/String;)Li63/w;
    .locals 10

    and-int/lit8 p0, p0, 0x8

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    move v6, p0

    goto :goto_0

    :cond_0
    move v6, v0

    :goto_0
    invoke-static {p1}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result p0

    if-gez p0, :cond_1

    sget-object p0, Li63/w;->b:Li63/l;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Li63/g;->c:Li63/g;

    return-object p0

    :cond_1
    sget-object p0, Li63/w;->b:Li63/l;

    new-instance v1, Li63/x;

    const/4 p0, 0x3

    invoke-direct {v1, p0}, Lal/a;-><init>(I)V

    invoke-static {p1}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result p0

    const/16 v7, 0x3e8

    const/4 v8, -0x1

    if-ltz p0, :cond_5

    move v3, v0

    move v5, v3

    move v4, v8

    :goto_1
    if-ne v0, v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v2, 0x26

    if-ne v9, v2, :cond_3

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lwb3/f;->e(Li63/x;Ljava/lang/String;IIIZ)V

    add-int/lit8 p1, v5, 0x1

    add-int/lit8 v0, v0, 0x1

    move v3, p1

    move v4, v8

    goto :goto_2

    :cond_3
    move-object v2, p1

    const/16 p1, 0x3d

    if-ne v9, p1, :cond_4

    if-ne v4, v8, :cond_4

    move v4, v5

    :cond_4
    :goto_2
    if-eq v5, p0, :cond_6

    add-int/lit8 v5, v5, 0x1

    move-object p1, v2

    goto :goto_1

    :cond_5
    move-object v2, p1

    move v3, v0

    move v4, v8

    :cond_6
    if-ne v0, v7, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    invoke-static/range {v1 .. v6}, Lwb3/f;->e(Li63/x;Ljava/lang/String;IIIZ)V

    :goto_3
    new-instance p0, Li63/y;

    iget-object p1, v1, Lal/a;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo63/o;-><init>(Ljava/util/Map;)V

    return-object p0
.end method

.method public static final X(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "method"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "GET"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HEAD"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final Y(Lp1/i2;Lp1/c;I)V
    .locals 2

    :goto_0
    iget v0, p0, Lp1/i2;->v:I

    if-le p2, v0, :cond_0

    iget v1, p0, Lp1/i2;->u:I

    if-lt p2, v1, :cond_1

    :cond_0
    if-nez v0, :cond_2

    if-nez p2, :cond_2

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p0}, Lp1/i2;->L()V

    iget v0, p0, Lp1/i2;->v:I

    invoke-virtual {p0, v0}, Lp1/i2;->x(I)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lp1/c;->p()V

    :cond_3
    invoke-virtual {p0}, Lp1/i2;->j()V

    goto :goto_0
.end method

.method public static final Z(II)V
    .locals 4

    const-string v0, ")."

    if-ltz p1, :cond_1

    if-gt p1, p0, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "toIndex ("

    const-string v3, ") is greater than size ("

    invoke-static {p1, p0, v2, v3, v0}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v1, "fromIndex (0) is greater than toIndex ("

    invoke-static {p1, v1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a0(Lk/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lh/i;
    .locals 12

    invoke-static {p0, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    invoke-static {p1, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v5

    const/4 p1, 0x0

    new-array v6, p1, [Ljava/lang/Object;

    sget-object v8, Lh/c;->x:Lh/c;

    const/16 v10, 0xc00

    const/4 v11, 0x6

    const/4 v7, 0x0

    move-object v9, p2

    invoke-static/range {v6 .. v11}, Ly1/k;->e([Ljava/lang/Object;Ly1/j;Lc93/a;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    invoke-static {v9}, Lh/g;->a(Landroidx/compose/runtime/Composer;)Lj/k;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v2

    move-object p2, v9

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p1, p3, :cond_0

    new-instance p1, Lh/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    move-object v1, p1

    check-cast v1, Lh/a;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, p3, :cond_1

    new-instance p1, Lh/i;

    invoke-direct {p1, v1}, Lh/i;-><init>(Lh/a;)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Lh/i;

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3

    if-ne v4, p3, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v4

    move-object v4, p0

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v0, Lh/b;

    move-object v4, p0

    invoke-direct/range {v0 .. v5}, Lh/b;-><init>(Lh/a;Lj/j;Ljava/lang/String;Lk/b;Lp1/c1;)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v4, v0, p2}, Lp1/x;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    return-object p1

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final b([Ljava/lang/Object;IILm83/h;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    mul-int/lit8 v1, p2, 0x3

    add-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    if-lez v1, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int v2, p1, v1

    aget-object v2, p0, v2

    if-ne v2, p3, :cond_1

    const-string v2, "(this Collection)"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string p0, "]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b0(II[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    if-ge p0, p1, :cond_0

    const/4 v0, 0x0

    aput-object v0, p2, p0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final c(Lj93/d;)Ljava/util/List;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwb3/e;->x:Lwb3/e;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    sget-object v0, Lwb3/e;->y:Lwb3/e;

    invoke-static {p0, v0}, Lxb3/k;->u(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object p0

    invoke-static {p0}, Lxb3/k;->E(Lxb3/i;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static c0()V
    .locals 2

    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Count overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d0()V
    .locals 2

    new-instance v0, Ljava/lang/ArithmeticException;

    const-string v1, "Index overflow has happened."

    invoke-direct {v0, v1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(Li63/x;Ljava/lang/String;IIIZ)V
    .locals 4

    const/4 v0, -0x1

    const/16 v1, 0xc

    const/4 v2, 0x0

    const-string v3, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    if-ne p3, v0, :cond_1

    invoke-static {p2, p4, p1}, Lwb3/f;->h0(IILjava/lang/String;)I

    move-result p2

    invoke-static {p2, p4, p1}, Lwb3/f;->g0(IILjava/lang/String;)I

    move-result p3

    if-le p3, p2, :cond_4

    if-eqz p5, :cond_0

    invoke-static {p2, p3, v1, p1, v2}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object p2, Lm83/y;->w:Lm83/y;

    invoke-virtual {p0, p1, p2}, Lal/a;->E(Ljava/lang/String;Ljava/lang/Iterable;)V

    return-void

    :cond_1
    invoke-static {p2, p3, p1}, Lwb3/f;->h0(IILjava/lang/String;)I

    move-result p2

    invoke-static {p2, p3, p1}, Lwb3/f;->g0(IILjava/lang/String;)I

    move-result v0

    if-le v0, p2, :cond_4

    if-eqz p5, :cond_2

    invoke-static {p2, v0, v1, p1, v2}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    const/4 v0, 0x1

    add-int/2addr p3, v0

    invoke-static {p3, p4, p1}, Lwb3/f;->h0(IILjava/lang/String;)I

    move-result p3

    invoke-static {p3, p4, p1}, Lwb3/f;->g0(IILjava/lang/String;)I

    move-result p4

    if-eqz p5, :cond_3

    const/16 p5, 0x8

    invoke-static {p3, p4, p5, p1, v0}, Li63/a;->e(IIILjava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    invoke-virtual {p1, p3, p4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {p0, p2, p1}, Lal/a;->s0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public static final e0(Ljava/lang/Object;Ljava/lang/Object;)Ll83/k;
    .locals 1

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static varargs f([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    array-length v0, p0

    if-nez v0, :cond_0

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Lm83/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lm83/l;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public static f0(Lio/sentry/d1;Ljava/lang/String;Ljava/util/List;Lio/sentry/l1;)La3/p;
    .locals 6

    invoke-interface {p0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->isTraceSampling()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lio/sentry/q6;->getTracePropagationTargets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    :goto_0
    move v3, v5

    goto :goto_1

    :cond_2
    :try_start_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v3, :cond_7

    invoke-interface {p0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object p1

    if-eqz p3, :cond_5

    invoke-interface {p3}, Lio/sentry/l1;->k()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-interface {p3}, Lio/sentry/l1;->b()Lio/sentry/w6;

    move-result-object p0

    invoke-interface {p3, p2}, Lio/sentry/l1;->n(Ljava/util/List;)Lhc3/x;

    move-result-object p2

    invoke-virtual {p1}, Lio/sentry/q6;->isPropagateTraceparent()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p3}, Lio/sentry/l1;->t()Lio/sentry/e7;

    move-result-object p1

    new-instance v2, La3/p;

    iget-object p3, p1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    iget-object p1, p1, Lio/sentry/e7;->x:Lio/sentry/h7;

    iget-object v0, p0, Lio/sentry/w6;->c:Ljava/lang/Boolean;

    const/16 v1, 0xa

    invoke-direct {v2, p3, p1, v0, v1}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    :cond_4
    new-instance p1, La3/p;

    const/16 p3, 0xb

    invoke-direct {p1, p0, p2, v2, p3}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p1

    :cond_5
    new-instance p3, Laj/d;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object v2, p3, Laj/d;->w:Ljava/lang/Object;

    new-instance v0, Lbu/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p3, p1}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p0, v0}, Lio/sentry/d1;->s(Lio/sentry/e4;)V

    iget-object p0, p3, Laj/d;->w:Ljava/lang/Object;

    check-cast p0, La3/p;

    if-eqz p0, :cond_7

    iget-object p3, p0, La3/p;->z:Ljava/lang/Object;

    check-cast p3, Lio/sentry/c;

    iget-object v0, p0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/h7;

    iget-object p0, p0, La3/p;->x:Ljava/lang/Object;

    check-cast p0, Lio/sentry/protocol/v;

    invoke-static {p3, p2}, Lhc3/x;->a(Lio/sentry/c;Ljava/util/List;)Lhc3/x;

    move-result-object p2

    new-instance p3, Lio/sentry/w6;

    invoke-direct {p3, p0, v0, v2}, Lio/sentry/w6;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lio/sentry/q6;->isPropagateTraceparent()Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, La3/p;

    const/16 v1, 0xa

    invoke-direct {p1, p0, v0, v2, v1}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v2, p1

    :cond_6
    new-instance p0, La3/p;

    const/16 p1, 0xb

    invoke-direct {p0, p3, p2, v2, p1}, La3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object p0

    :cond_7
    return-object v2
.end method

.method public static g(Lec3/l;)Lw73/f;
    .locals 2

    new-instance v0, Lcom/whoop/data/repositories/c;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lw73/f;

    invoke-direct {p0, v0}, Lw73/f;-><init>(Lcom/whoop/data/repositories/c;)V

    return-object p0
.end method

.method public static final g0(IILjava/lang/String;)I
    .locals 1

    :goto_0
    if-le p1, p0, :cond_0

    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public static final h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ldc3/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldc3/r;

    iget v1, v0, Ldc3/r;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldc3/r;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldc3/r;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldc3/r;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldc3/r;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ldc3/r;->w:Lc93/a;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    sget-object v2, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {p2, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p2

    if-ne p2, p0, :cond_4

    :try_start_1
    iput-object p1, v0, Ldc3/r;->w:Lc93/a;

    iput v3, v0, Ldc3/r;->y:I

    new-instance p2, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p2, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    new-instance v0, Ldc3/s;

    const/4 v2, 0x0

    invoke-direct {v0, p2, v2}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    check-cast p0, Ldc3/t;

    invoke-virtual {p0, v0}, Ldc3/t;->c0(Ldc3/s;)V

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_2
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "awaitClose() can only be invoked from the producer context"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final h0(IILjava/lang/String;)I
    .locals 1

    :goto_0
    if-ge p0, p1, :cond_0

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static i(Ljava/util/List;Ljava/lang/Comparable;)I
    .locals 4

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1, v0}, Lwb3/f;->Z(II)V

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Comparable;

    invoke-static {v3, p1}, Lq83/g;->q(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method public static final j(ILjava/lang/StringBuilder;)V
    .locals 6

    if-gtz p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_1

    const-string v2, "?"

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, ","

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static k(Ln83/c;)Ln83/c;
    .locals 1

    invoke-virtual {p0}, Ln83/c;->j()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln83/c;->y:Z

    iget v0, p0, Ln83/c;->x:I

    if-lez v0, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ln83/c;->z:Ln83/c;

    return-object p0
.end method

.method public static final l(F)I
    .locals 2

    float-to-double v0, p0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p0, v0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0
.end method

.method public static m(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(I)V
    .locals 0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static p(Landroid/util/TypedValue;Leb/g1;Leb/g1;Ljava/lang/String;Ljava/lang/String;)Leb/g1;
    .locals 2

    if-eqz p1, :cond_1

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p2, " but found "

    const-string v0, ": "

    const-string v1, "Type is "

    invoke-static {v1, p3, p2, p4, v0}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget p0, p0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    return-object p2

    :cond_2
    return-object p1
.end method

.method public static q(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;
    .locals 11

    const/4 v9, 0x0

    const v10, 0x7e7ff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v7, p1

    invoke-static/range {v0 .. v10}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 11

    const/4 v9, 0x0

    const v10, 0x7efff

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public static final u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Lb2/p;

    invoke-direct {v0, p1}, Lb2/p;-><init>(Lkotlin/jvm/functions/Function3;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static v(Ljava/io/File;Landroid/content/res/Resources;I)Z
    .locals 0

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {p0, p1}, Lwb3/f;->w(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p1}, Lwb3/f;->t(Ljava/io/Closeable;)V

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lwb3/f;->t(Ljava/io/Closeable;)V

    throw p0
.end method

.method public static w(Ljava/io/File;Ljava/io/InputStream;)Z
    .locals 5

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskWrites()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p0, 0x400

    :try_start_1
    new-array p0, p0, [B

    :goto_0
    invoke-virtual {p1, p0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_0

    invoke-virtual {v3, p0, v1, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception p0

    move-object v2, v3

    goto :goto_1

    :cond_0
    invoke-static {v3}, Lwb3/f;->t(Ljava/io/Closeable;)V

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    const/4 p0, 0x1

    return p0

    :catchall_1
    move-exception p0

    goto :goto_2

    :catch_1
    move-exception p0

    :goto_1
    :try_start_2
    const-string p1, "TypefaceCompatUtil"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error copying resource contents to temp file: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-static {v2}, Lwb3/f;->t(Ljava/io/Closeable;)V

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return v1

    :goto_2
    invoke-static {v2}, Lwb3/f;->t(Ljava/io/Closeable;)V

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p0
.end method

.method public static x()Ln83/c;
    .locals 2

    new-instance v0, Ln83/c;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ln83/c;-><init>(I)V

    return-object v0
.end method

.method public static y(Lio/sentry/c;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Lio/sentry/c;
    .locals 1

    if-nez p0, :cond_0

    new-instance p0, Lio/sentry/c;

    sget-object v0, Lio/sentry/t2;->w:Lio/sentry/t2;

    invoke-direct {p0, v0}, Lio/sentry/c;-><init>(Lio/sentry/v0;)V

    :cond_0
    iget-object v0, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    if-nez v0, :cond_2

    iget-object v0, p0, Lio/sentry/c;->c:Ljava/lang/Double;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, v0

    :goto_0
    invoke-static {p1, p3, p2}, Lts/o;->e(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object p1

    iget-boolean p2, p0, Lio/sentry/c;->f:Z

    if-eqz p2, :cond_2

    iput-object p1, p0, Lio/sentry/c;->d:Ljava/lang/Double;

    :cond_2
    iget-boolean p1, p0, Lio/sentry/c;->f:Z

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lio/sentry/c;->g:Z

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/sentry/c;->f:Z

    :cond_3
    return-object p0
.end method

.method public static z(Lo63/m;Lc93/m;)V
    .locals 2

    invoke-interface {p0}, Lo63/m;->b()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {p1, v1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public abstract A()Lcf/j;
.end method

.method public abstract Q(Lcf/k;)Lcf/i;
.end method

.method public abstract S(Ljava/lang/Throwable;)V
.end method

.method public abstract T(Lzt/q;)V
.end method

.method public a(Ljava/lang/String;)Log/g;
    .locals 0

    sget-object p1, Log/f;->a:Log/d;

    return-object p1
.end method

.method public build()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lwb3/f;->A()Lcf/j;

    move-result-object v0

    invoke-interface {v0}, Lvg/a;->build()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcf/k;

    invoke-virtual {p0, v0}, Lwb3/f;->Q(Lcf/k;)Lcf/i;

    move-result-object v0

    return-object v0
.end method
