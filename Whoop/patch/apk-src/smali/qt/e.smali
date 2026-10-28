.class public final Lqt/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/i;
.implements Landroidx/databinding/d;
.implements Ll8/b;
.implements Lcom/google/crypto/tink/shaded/protobuf/g;
.implements Lik/c;
.implements Lvg/g;
.implements Lgl/l;
.implements Lgl/a0;
.implements Lfg3/a;
.implements Lio/sentry/util/e;


# static fields
.field public static x:Lqt/e;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqt/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkb3/k;)V
    .locals 3

    const/16 p1, 0x10

    iput p1, p0, Lqt/e;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object p1, Lkb3/k;->d:Ljava/lang/String;

    .line 4
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x2

    const/4 v2, 0x3

    invoke-direct {p1, v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    return-void
.end method

.method public static final c(Lxb3/i;Z)Ljava/lang/String;
    .locals 3

    sget v0, Lcg/i;->y:I

    sget-object v0, Lcg/h;->w:Lcg/h;

    if-nez p1, :cond_1

    const-string p1, "<this>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "?"

    :goto_1
    new-instance v0, La11/g;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    const/16 v1, 0x1c

    const-string v2, "&"

    invoke-static {p0, v2, p1, v0, v1}, Lxb3/k;->y(Lxb3/i;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lne3/l;[Lne3/l;I)Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->b:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    add-int v5, v4, v2

    div-int/lit8 v5, v5, 0x2

    :goto_1
    const/16 v6, 0xa

    const/4 v7, -0x1

    if-le v5, v7, :cond_0

    invoke-virtual {v0, v5}, Lne3/l;->i(I)B

    move-result v8

    if-eq v8, v6, :cond_0

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v5, 0x1

    const/4 v9, 0x1

    move v10, v9

    :goto_2
    add-int v11, v8, v10

    invoke-virtual {v0, v11}, Lne3/l;->i(I)B

    move-result v12

    if-eq v12, v6, :cond_1

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_1
    sub-int v6, v11, v8

    move/from16 v12, p2

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_3
    if-eqz v10, :cond_2

    const/16 v10, 0x2e

    const/4 v15, 0x0

    goto :goto_4

    :cond_2
    aget-object v15, v1, v12

    invoke-virtual {v15, v13}, Lne3/l;->i(I)B

    move-result v15

    sget-object v16, Lwd3/f;->a:[B

    and-int/lit16 v15, v15, 0xff

    move/from16 v18, v15

    move v15, v10

    move/from16 v10, v18

    :goto_4
    add-int v3, v8, v14

    invoke-virtual {v0, v3}, Lne3/l;->i(I)B

    move-result v3

    sget-object v17, Lwd3/f;->a:[B

    and-int/lit16 v3, v3, 0xff

    sub-int/2addr v10, v3

    if-nez v10, :cond_5

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v13, v13, 0x1

    if-eq v14, v6, :cond_5

    aget-object v3, v1, v12

    invoke-virtual {v3}, Lne3/l;->d()I

    move-result v3

    if-ne v3, v13, :cond_4

    array-length v3, v1

    sub-int/2addr v3, v9

    if-ne v12, v3, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move v13, v7

    move v10, v9

    goto :goto_3

    :cond_4
    move v10, v15

    goto :goto_3

    :cond_5
    :goto_5
    if-gez v10, :cond_6

    :goto_6
    move v2, v5

    goto :goto_0

    :cond_6
    if-lez v10, :cond_7

    :goto_7
    add-int/lit8 v4, v11, 0x1

    goto :goto_0

    :cond_7
    sub-int v3, v6, v14

    aget-object v7, v1, v12

    invoke-virtual {v7}, Lne3/l;->d()I

    move-result v7

    sub-int/2addr v7, v13

    add-int/lit8 v12, v12, 0x1

    array-length v9, v1

    :goto_8
    if-ge v12, v9, :cond_8

    aget-object v10, v1, v12

    invoke-virtual {v10}, Lne3/l;->d()I

    move-result v10

    add-int/2addr v7, v10

    add-int/lit8 v12, v12, 0x1

    goto :goto_8

    :cond_8
    if-ge v7, v3, :cond_9

    goto :goto_6

    :cond_9
    if-le v7, v3, :cond_a

    goto :goto_7

    :cond_a
    add-int/2addr v6, v8

    invoke-virtual {v0, v8, v6}, Lne3/l;->o(II)Lne3/l;

    move-result-object v0

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Lne3/l;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_b
    const/4 v0, 0x0

    return-object v0
.end method

.method public static f(Landroidx/lifecycle/f2;Landroidx/lifecycle/n1;I)Landroidx/lifecycle/d2;
    .locals 1

    and-int/lit8 p2, p2, 0x2

    const-string v0, "owner"

    if-eqz p2, :cond_1

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p0, Landroidx/lifecycle/r;

    if-eqz p1, :cond_0

    move-object p1, p0

    check-cast p1, Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Ln8/b;->a:Ln8/b;

    :cond_1
    :goto_0
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p0, Landroidx/lifecycle/r;

    if-eqz p2, :cond_2

    move-object p2, p0

    check-cast p2, Landroidx/lifecycle/r;

    invoke-interface {p2}, Landroidx/lifecycle/r;->getDefaultViewModelCreationExtras()Ll8/c;

    move-result-object p2

    goto :goto_1

    :cond_2
    sget-object p2, Ll8/a;->b:Ll8/a;

    :goto_1
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/lifecycle/d2;

    invoke-interface {p0}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p0

    invoke-direct {v0, p0, p1, p2}, Landroidx/lifecycle/d2;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    return-object v0
.end method

.method public static h(Lio/sentry/v0;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lqt/e;->o(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static n(Lio/sentry/q6;Ljava/lang/String;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0, p1}, Lqt/e;->h(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static o(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    :try_start_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    if-eqz p0, :cond_0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to initialize "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v1, p1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception v0

    if-eqz p0, :cond_0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to load (UnsatisfiedLinkError) "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v1, p1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    if-eqz p0, :cond_0

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Class not available: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p0, v0, p1, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public a([BII)[B
    .locals 2

    new-array v0, p3, [B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public b(Ljava/lang/String;)Lfg3/b;
    .locals 0

    sget-object p1, Lhg3/b;->w:Lhg3/b;

    return-object p1
.end method

.method public e(Landroid/media/MediaMetadataRetriever;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lqt/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/nio/ByteBuffer;

    new-instance v0, Lgl/z;

    invoke-direct {v0, p2}, Lgl/z;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p1, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/media/MediaDataSource;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
    .end packed-switch
.end method

.method public g(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lqt/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lfg/k;

    new-instance v1, Lfg/j;

    new-instance v2, Lfg/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v3, 0xa

    sget-object v4, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v3

    iput-wide v3, v2, Lfg/i;->a:J

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    iput-wide v3, v2, Lfg/i;->b:D

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    iput-wide v3, v2, Lfg/i;->c:D

    const/16 v3, 0x14

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v3

    iput-wide v3, v2, Lfg/i;->d:J

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v2}, Lfg/j;-><init>(Lfg/i;)V

    invoke-direct {v0, v1}, Lfg/k;-><init>(Lfg/j;)V

    return-object v0

    :pswitch_0
    new-instance v0, Leg/o;

    new-instance v1, Lae3/k;

    new-instance v2, Leg/k;

    invoke-direct {v2}, Leg/k;-><init>()V

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v2}, Lae3/k;-><init>(Leg/k;)V

    invoke-direct {v0, v1}, Leg/o;-><init>(Lae3/k;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lal/b;Landroid/graphics/Bitmap;)V
    .locals 0

    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lio/sentry/android/core/j0;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l(Lgj/d;)Lik/b;
    .locals 10

    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "amplitude-events-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lgj/g;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lgj/g;->b:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    new-instance v4, Ldk/f;

    iget-object v5, v0, Lgj/g;->e:Ljava/lang/String;

    iget-object v1, v0, Lgj/g;->g:Lbu/c;

    invoke-virtual {v1, p1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object v6

    const-string v1, "sharedPreferences"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/io/File;

    invoke-virtual {v0}, Lgj/g;->a()Ljava/io/File;

    move-result-object v0

    const-string v1, "events"

    invoke-direct {v8, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object v9, p1, Lgj/d;->n:Lwe/o;

    invoke-direct/range {v4 .. v9}, Ldk/f;-><init>(Ljava/lang/String;Lfk/a;Landroid/content/SharedPreferences;Ljava/io/File;Lwe/o;)V

    return-object v4
.end method

.method public m(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)Landroidx/databinding/d0;
    .locals 2

    iget v0, p0, Lqt/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Landroidx/databinding/v;

    invoke-direct {v0, p1, p2, p3}, Landroidx/databinding/v;-><init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v0}, Landroidx/databinding/v;->d()Landroidx/databinding/d0;

    move-result-object p1

    return-object p1

    :pswitch_0
    new-instance v0, Landroidx/databinding/y;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/databinding/y;-><init>(Landroidx/databinding/a0;ILjava/lang/ref/ReferenceQueue;I)V

    invoke-virtual {v0}, Landroidx/databinding/y;->d()Landroidx/databinding/d0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public p(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
    .locals 10

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Lcom/google/firebase/components/ComponentRegistrar;->getComponents()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgt/b;

    iget-object v3, v1, Lgt/b;->a:Ljava/lang/String;

    if-eqz v3, :cond_0

    new-instance v8, Lbu/d;

    const/4 v2, 0x1

    invoke-direct {v8, v2, v3, v1}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Lgt/b;

    iget-object v4, v1, Lgt/b;->b:Ljava/util/Set;

    iget-object v5, v1, Lgt/b;->c:Ljava/util/Set;

    iget v6, v1, Lgt/b;->d:I

    iget v7, v1, Lgt/b;->e:I

    iget-object v9, v1, Lgt/b;->g:Ljava/util/Set;

    invoke-direct/range {v2 .. v9}, Lgt/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;IILgt/e;Ljava/util/Set;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lqt/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "CompositionErrorContext"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
