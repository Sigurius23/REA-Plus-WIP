.class public final Lf1/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/j;
.implements Lxg3/i;
.implements Lmb3/c;
.implements Lwy/b;


# instance fields
.field public final synthetic w:I

.field public x:Z

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf1/p1;->w:I

    packed-switch p1, :pswitch_data_0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 11
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lf1/p1;->w:I

    iput-object p2, p0, Lf1/p1;->y:Ljava/lang/Object;

    iput-object p3, p0, Lf1/p1;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Lrm/r;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lf1/p1;->w:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 26
    new-instance p1, Lrm/a;

    invoke-direct {p1, p0, p2, p3}, Lrm/a;-><init>(Lf1/p1;Landroid/os/Handler;Lrm/r;)V

    iput-object p1, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;ZLc93/m;Lh/k;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lf1/p1;->w:I

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-boolean p2, p0, Lf1/p1;->x:Z

    .line 37
    sget-object p2, Ldc3/a;->w:Ldc3/a;

    const/4 v0, 0x4

    const/4 v1, -0x2

    invoke-static {v1, v0, p2}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p2

    iput-object p2, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 38
    new-instance p2, Lb2/y;

    const/4 v0, 0x0

    invoke-direct {p2, p4, p3, p0, v0}, Lb2/y;-><init>(Lh/k;Lc93/m;Lf1/p1;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p1, v0, v0, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf1/s1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/p1;->w:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lf1/p1;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lf1/p1;->x:Z

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lf1/p1;->w:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lf1/p1;->x:Z

    .line 30
    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/sentry/r2;Z)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lf1/p1;->w:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 22
    iput-object p2, p0, Lf1/p1;->z:Ljava/lang/Object;

    .line 23
    iput-boolean p3, p0, Lf1/p1;->x:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lf1/p1;->w:I

    .line 3
    :try_start_0
    const-string v1, "com.google.android.libraries.places.api.Places"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    .line 4
    :goto_0
    const-string v1, "autocompleteCountries"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, Lf1/p1;->z:Ljava/lang/Object;

    .line 8
    iput-boolean v0, p0, Lf1/p1;->x:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/HashMap;ZLjava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lf1/p1;->w:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 33
    iput-boolean p2, p0, Lf1/p1;->x:Z

    .line 34
    iput-object p3, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr93/b;Lr93/b;Z)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lf1/p1;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p3, p0, Lf1/p1;->x:Z

    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    iput-object p2, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ly00/b2;Z)V
    .locals 2

    const/16 v0, 0xc

    iput v0, p0, Lf1/p1;->w:I

    .line 14
    new-instance v0, Lyo0/c;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lyo0/c;-><init>(I)V

    .line 15
    const-string v1, "params"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    .line 18
    iput-boolean p2, p0, Lf1/p1;->x:Z

    .line 19
    iput-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    return-void
.end method

.method public static e(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\nSee "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "r8-abstract-class"

    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static w(Ljava/io/BufferedInputStream;J)V
    .locals 4

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    invoke-virtual {p0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v2

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/EOFException;

    const-string p1, "Unexpected end of stream while skipping bytes"

    invoke-direct {p0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sub-long/2addr p1, v2

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Llb3/q0;Llb3/q0;)Z
    .locals 5

    iget-boolean v0, p0, Lf1/p1;->x:Z

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Lr93/b;

    iget-object v2, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v2, Lr93/b;

    const-string v3, "c1"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "c2"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    invoke-interface {p2}, Llb3/q0;->d()Lr93/h;

    move-result-object p2

    instance-of v3, p1, Lr93/x0;

    if-eqz v3, :cond_2

    instance-of v3, p2, Lr93/x0;

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lr93/x0;

    check-cast p2, Lr93/x0;

    new-instance v3, Lu10/f;

    const/4 v4, 0x6

    invoke-direct {v3, v4, v1, v2}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lya3/d;->a:Lya3/d;

    invoke-virtual {v1, p1, p2, v0, v3}, Lya3/d;->b(Lr93/x0;Lr93/x0;ZLc93/m;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(JLf1/v;I)Z
    .locals 7

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    move-object v1, p0

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, v0, Lf1/s1;->l:Lg2/s;

    if-eqz v1, :cond_3

    invoke-static {v1}, Lg2/s;->c(Lg2/s;)V

    :cond_3
    iput-wide p1, v0, Lf1/s1;->o:J

    const/4 p1, -0x1

    iput p1, v0, Lf1/s1;->t:I

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lf1/s1;->h(Z)V

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v2

    iget-wide v3, v0, Lf1/s1;->o:J

    const/4 v5, 0x1

    move-object v1, p0

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lf1/p1;->x(Lq3/y;JZLf1/v;)J

    move-result-wide p2

    const/4 v0, 0x2

    if-lt p4, v0, :cond_4

    iput-boolean p1, v1, Lf1/p1;->x:Z

    new-instance p4, Ll3/u0;

    invoke-direct {p4, p2, p3}, Ll3/u0;-><init>(J)V

    iput-object p4, v1, Lf1/p1;->y:Ljava/lang/Object;

    :cond_4
    return p1

    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public c(J)Z
    .locals 7

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lso/q;

    iget-object v0, v0, Lso/q;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lu2/t;

    iget-wide v5, v5, Lu2/t;->a:J

    invoke-static {v5, v6, p1, p2}, Lu2/q;->a(JJ)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lu2/t;

    if-eqz v4, :cond_2

    iget-boolean p1, v4, Lu2/t;->h:Z

    return p1

    :cond_2
    return v2
.end method

.method public d()V
    .locals 3

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "onBack cancelled"

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ldc3/h;->h(Ljava/lang/Throwable;Z)Z

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public f(Lpl/b;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    check-cast p1, Lpl/e;

    invoke-virtual {p1}, Lpl/e;->c()V

    :cond_3
    return v0
.end method

.method public g()V
    .locals 2

    iget-boolean v0, p0, Lf1/p1;->x:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ll3/u0;

    invoke-static {v0, v1}, Lf1/s1;->a(Lf1/s1;Ll3/u0;)V

    :cond_0
    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ldc3/h;->r(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public i(Ljava/io/BufferedInputStream;ILjava/io/File;)Lio/sentry/android/core/x0;
    .locals 9

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lio/sentry/android/core/w0;

    invoke-direct {v2, p1, p2}, Lio/sentry/android/core/w0;-><init>(Ljava/io/BufferedInputStream;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p1, Ljava/io/InputStreamReader;

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, v2, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    new-instance p2, Lio/sentry/g2;

    invoke-direct {p2, p1}, Lio/sentry/g2;-><init>(Ljava/io/Reader;)V

    iget-object v3, p2, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {p2}, Lio/sentry/g2;->beginObject()V

    move-object v4, v1

    move-object v5, v4

    :cond_0
    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v6

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v6, v7, :cond_4

    invoke-virtual {v3}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    const v8, 0x3492916

    if-eq v7, v8, :cond_2

    const v8, 0x6fbd6873

    if-eq v7, v8, :cond_1

    goto :goto_0

    :cond_1
    const-string v7, "platform"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p2}, Lio/sentry/g2;->w0()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_2
    const-string v7, "timestamp"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    invoke-virtual {p2, v5}, Lio/sentry/g2;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v5

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p2}, Lio/sentry/g2;->skipValue()V

    :goto_1
    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    :cond_4
    const-string p2, "native"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_5

    if-eqz v5, :cond_5

    new-instance p2, Lio/sentry/android/core/x0;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-direct {p2, p3, v3, v4}, Lio/sentry/android/core/x0;-><init>(Ljava/io/File;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, p2

    :cond_5
    :try_start_3
    invoke-virtual {p1}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    invoke-virtual {v2}, Lio/sentry/android/core/w0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    return-object v1

    :catchall_1
    move-exception p1

    goto :goto_6

    :catchall_2
    move-exception p1

    goto :goto_4

    :goto_2
    :try_start_5
    invoke-virtual {p1}, Ljava/io/Reader;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    :try_start_6
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :goto_4
    :try_start_7
    invoke-virtual {v2}, Lio/sentry/android/core/w0;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception p2

    :try_start_8
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_6
    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    const-string v2, "Error parsing event JSON from: %s"

    invoke-interface {p2, v0, p1, v2, p3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public j(Lvw/a;Z)Lqw/o;
    .locals 9

    iget-object v0, p1, Lvw/a;->b:Ljava/lang/reflect/Type;

    iget-object p1, p1, Lvw/a;->a:Ljava/lang/Class;

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_17

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_16

    const-class v1, Ljava/util/EnumSet;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Lqw/a;

    invoke-direct {v1, v2, v0}, Lqw/a;-><init>(ILjava/lang/reflect/Type;)V

    goto :goto_0

    :cond_0
    const-class v1, Ljava/util/EnumMap;

    if-ne p1, v1, :cond_1

    new-instance v1, Lqw/a;

    invoke-direct {v1, v3, v0}, Lqw/a;-><init>(ILjava/lang/reflect/Type;)V

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    iget-object v1, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v1}, Lqw/g;->f(Ljava/util/ArrayList;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v1

    const/4 v5, 0x2

    if-eqz v1, :cond_3

    :catch_0
    move-object v1, v4

    goto :goto_2

    :cond_3
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v6, Ltw/c;->a:Ls30/b;

    :try_start_1
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v6, v4

    goto :goto_1

    :catch_1
    move-exception v6

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failed making constructor \'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ltw/c;->b(Ljava/lang/reflect/Constructor;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Ltw/c;->e(Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_1
    if-eqz v6, :cond_4

    new-instance v1, Lcom/mapbox/common/movement/a;

    invoke-direct {v1, v6, v5}, Lcom/mapbox/common/movement/a;-><init>(Ljava/lang/String;I)V

    goto :goto_2

    :cond_4
    new-instance v6, Lmm/d;

    const/16 v7, 0x1a

    invoke-direct {v6, v1, v7}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    move-object v1, v6

    :goto_2
    if-eqz v1, :cond_5

    return-object v1

    :cond_5
    const-class v1, Ljava/util/Collection;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v6, 0x4

    const/4 v7, 0x3

    if-eqz v1, :cond_9

    const-class v0, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v4, Lqa/b;

    const/4 v0, 0x7

    invoke-direct {v4, v0}, Lqa/b;-><init>(I)V

    goto/16 :goto_5

    :cond_6
    const-class v0, Ljava/util/LinkedHashSet;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v4, Lqa/b;

    const/16 v0, 0x8

    invoke-direct {v4, v0}, Lqa/b;-><init>(I)V

    goto/16 :goto_5

    :cond_7
    const-class v0, Ljava/util/TreeSet;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v4, Lqa/b;

    const/16 v0, 0x9

    invoke-direct {v4, v0}, Lqa/b;-><init>(I)V

    goto/16 :goto_5

    :cond_8
    const-class v0, Ljava/util/ArrayDeque;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v4, Lqa/b;

    invoke-direct {v4, v5}, Lqa/b;-><init>(I)V

    goto/16 :goto_5

    :cond_9
    const-class v1, Ljava/util/Map;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_10

    const-class v1, Lqw/n;

    invoke-virtual {p1, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_c

    instance-of v1, v0, Ljava/lang/reflect/ParameterizedType;

    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v1, v0

    if-nez v1, :cond_b

    goto :goto_4

    :cond_b
    aget-object v0, v0, v2

    invoke-static {v0}, Lqw/g;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/String;

    if-ne v0, v1, :cond_c

    :goto_3
    new-instance v4, Lqa/b;

    invoke-direct {v4, v3}, Lqa/b;-><init>(I)V

    goto :goto_5

    :cond_c
    :goto_4
    const-class v0, Ljava/util/LinkedHashMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v4, Lqa/b;

    invoke-direct {v4, v7}, Lqa/b;-><init>(I)V

    goto :goto_5

    :cond_d
    const-class v0, Ljava/util/TreeMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_e

    new-instance v4, Lqa/b;

    invoke-direct {v4, v6}, Lqa/b;-><init>(I)V

    goto :goto_5

    :cond_e
    const-class v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_f

    new-instance v4, Lqa/b;

    const/4 v0, 0x5

    invoke-direct {v4, v0}, Lqa/b;-><init>(I)V

    goto :goto_5

    :cond_f
    const-class v0, Ljava/util/concurrent/ConcurrentSkipListMap;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_10

    new-instance v4, Lqa/b;

    const/4 v0, 0x6

    invoke-direct {v4, v0}, Lqa/b;-><init>(I)V

    :cond_10
    :goto_5
    if-eqz v4, :cond_11

    return-object v4

    :cond_11
    invoke-static {p1}, Lf1/p1;->e(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance p1, Lcom/mapbox/common/movement/a;

    invoke-direct {p1, v0, v7}, Lcom/mapbox/common/movement/a;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_12
    const-string v0, "Unable to create instance of "

    if-nez p2, :cond_13

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; Register an InstanceCreator or a TypeAdapter for this type."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lcom/mapbox/common/movement/a;

    invoke-direct {p2, p1, v6}, Lcom/mapbox/common/movement/a;-><init>(Ljava/lang/String;I)V

    return-object p2

    :cond_13
    iget-boolean p2, p0, Lf1/p1;->x:Z

    if-eqz p2, :cond_14

    new-instance p2, Lmm/d;

    const/16 v0, 0x19

    invoke-direct {p2, p1, v0}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    goto :goto_6

    :cond_14
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p1

    array-length p1, p1

    if-nez p1, :cond_15

    const-string p1, " Or adjust your R8 configuration to keep the no-args constructor of the class."

    invoke-static {p2, p1}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_15
    new-instance p1, Lcom/mapbox/common/movement/a;

    invoke-direct {p1, p2, v3}, Lcom/mapbox/common/movement/a;-><init>(Ljava/lang/String;I)V

    move-object p2, p1

    :goto_6
    return-object p2

    :cond_16
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_17
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public k()La0/y;
    .locals 1

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, La0/y;

    return-object v0
.end method

.method public l()Landroid/view/MotionEvent;
    .locals 1

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lso/q;

    iget-object v0, v0, Lso/q;->x:Ljava/lang/Object;

    check-cast v0, Landroid/view/MotionEvent;

    return-object v0
.end method

.method public m(Lorg/json/JSONObject;)Lvy/b;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "payment_method_preference"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Ls/s;->m(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Ls/s;->o(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v5, "object"

    invoke-static {v5, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_1

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    const/16 v16, 0x0

    goto/16 :goto_3f

    :cond_2
    const-string v2, "country_code"

    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "unactivated_payment_method_types"

    invoke-virtual {v1, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    const-string v8, "payment_method_specs"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v11, v8

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    :goto_1
    const-string v8, "external_payment_method_data"

    invoke-virtual {v1, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v8

    move-object v12, v8

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    const-string v8, "ordered_payment_method_types"

    invoke-virtual {v3, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    const-string v9, "ordered_payment_method_types_and_wallets"

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    sget-object v10, Lm83/y;->w:Lm83/y;

    const/4 v13, 0x0

    if-eqz v9, :cond_6

    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v14

    invoke-static {v13, v14}, Le93/b;->i0(II)Li93/j;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    const/16 v16, 0x0

    const/16 v4, 0xa

    invoke-static {v14, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v15, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v14}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    move-object v14, v4

    check-cast v14, Li93/i;

    iget-boolean v14, v14, Li93/i;->y:Z

    if-eqz v14, :cond_5

    move-object v14, v4

    check-cast v14, Lm83/e0;

    invoke-virtual {v14}, Lm83/e0;->nextInt()I

    move-result v14

    invoke-virtual {v9, v14}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v14, v15

    goto :goto_4

    :cond_6
    const/16 v16, 0x0

    move-object v14, v10

    :goto_4
    const-string v4, "flags"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    sget-object v9, Lm83/z;->w:Lm83/z;

    const-string v15, "keys(...)"

    if-eqz v4, :cond_b

    new-instance v13, Ljava/util/LinkedHashMap;

    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v18, v9

    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v9

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_a

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v9

    move-object/from16 v9, v19

    check-cast v9, Ljava/lang/String;

    move-object/from16 v19, v10

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    sget-object v21, Ly00/s1;->K:Lt83/b;

    invoke-virtual/range {v21 .. v21}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_6
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_8

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v4

    move-object/from16 v4, v22

    check-cast v4, Ly00/s1;

    iget-object v4, v4, Ly00/s1;->w:Ljava/lang/String;

    invoke-virtual {v4, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_7

    :cond_7
    move-object/from16 v4, v23

    goto :goto_6

    :cond_8
    move-object/from16 v23, v4

    move-object/from16 v22, v16

    :goto_7
    move-object/from16 v4, v22

    check-cast v4, Ly00/s1;

    if-eqz v4, :cond_9

    instance-of v9, v10, Ljava/lang/Boolean;

    if-eqz v9, :cond_9

    invoke-interface {v13, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    move-object/from16 v10, v19

    move-object/from16 v9, v20

    move-object/from16 v4, v23

    goto :goto_5

    :cond_a
    move-object/from16 v19, v10

    invoke-static {v13}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    goto :goto_8

    :cond_b
    move-object/from16 v18, v9

    move-object/from16 v19, v10

    move-object/from16 v4, v18

    :goto_8
    const-string v9, "session_id"

    invoke-virtual {v1, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "config_id"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26

    const-string v10, "customer"

    invoke-virtual {v1, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v13

    move-object/from16 v20, v11

    sget-object v11, Ly00/s1;->E:Ly00/s1;

    invoke-interface {v4, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v21, v4

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const-string v11, "optJSONObject(...)"

    if-nez v13, :cond_c

    move-object/from16 v35, v2

    move-object/from16 v36, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move-object/from16 v45, v8

    move-object/from16 v27, v9

    move-object/from16 v24, v11

    move-object/from16 v22, v12

    move-object/from16 v23, v14

    move-object/from16 v25, v15

    :goto_9
    move-object/from16 v5, v16

    goto/16 :goto_1f

    :cond_c
    if-eqz v4, :cond_11

    const-string v4, "payment_methods_with_link_details"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    move-object/from16 v22, v12

    if-eqz v4, :cond_f

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v12

    move-object/from16 v23, v14

    const/4 v14, 0x0

    invoke-static {v14, v12}, Le93/b;->i0(II)Li93/j;

    move-result-object v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move-object/from16 v24, v12

    :goto_a
    move-object/from16 v12, v24

    check-cast v12, Li93/i;

    iget-boolean v12, v12, Li93/i;->y:Z

    if-eqz v12, :cond_e

    move-object/from16 v12, v24

    check-cast v12, Lm83/e0;

    invoke-virtual {v12}, Lm83/e0;->nextInt()I

    move-result v12

    move-object/from16 v25, v15

    sget-object v15, Lz00/a;->G:Lz00/a;

    invoke-virtual {v4, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v15, v12}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v12

    if-eqz v12, :cond_d

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_d
    move-object/from16 v15, v25

    goto :goto_a

    :cond_e
    :goto_b
    move-object/from16 v25, v15

    goto :goto_c

    :cond_f
    move-object/from16 v23, v14

    move-object/from16 v14, v19

    goto :goto_b

    :cond_10
    :goto_c
    move-object/from16 v27, v9

    goto :goto_e

    :cond_11
    move-object/from16 v22, v12

    move-object/from16 v23, v14

    move-object/from16 v25, v15

    const-string v4, "payment_methods"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v12

    const/4 v14, 0x0

    invoke-static {v14, v12}, Le93/b;->i0(II)Li93/j;

    move-result-object v12

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_d
    move-object v15, v12

    check-cast v15, Li93/i;

    iget-boolean v15, v15, Li93/i;->y:Z

    if-eqz v15, :cond_10

    move-object v15, v12

    check-cast v15, Lm83/e0;

    invoke-virtual {v15}, Lm83/e0;->nextInt()I

    move-result v15

    move-object/from16 v24, v12

    new-instance v12, Lz00/a;

    move-object/from16 v27, v9

    const/16 v9, 0x1d

    invoke-direct {v12, v9}, Lz00/a;-><init>(I)V

    invoke-virtual {v4, v15}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v12, v9}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v12, v24

    move-object/from16 v9, v27

    goto :goto_d

    :cond_12
    move-object/from16 v14, v19

    goto :goto_c

    :goto_e
    const-string v4, "customer_session"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_13

    :goto_f
    move-object/from16 v35, v2

    move-object/from16 v36, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move-object/from16 v45, v8

    move-object/from16 v24, v11

    :goto_10
    move-object/from16 v2, v16

    goto/16 :goto_1d

    :cond_13
    const-string v9, "id"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    if-nez v29, :cond_14

    goto :goto_f

    :cond_14
    const-string v9, "livemode"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v30

    const-string v9, "api_key"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v31

    if-nez v31, :cond_15

    goto :goto_f

    :cond_15
    const-string v9, "api_key_expiry"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v32

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v33

    if-nez v33, :cond_16

    goto :goto_f

    :cond_16
    const-string v9, "components"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_17

    move-object/from16 v35, v2

    move-object/from16 v36, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move-object/from16 v45, v8

    move-object/from16 v24, v11

    move-object/from16 v34, v16

    goto/16 :goto_1c

    :cond_17
    const-string v9, "mobile_payment_element"

    invoke-virtual {v4, v9}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    const-string v10, "payment_method_remove_last"

    const-string v12, "enabled"

    const-string v15, "partial"

    move-object/from16 v24, v11

    const-string v11, "payment_method_remove"

    move-object/from16 v35, v2

    const-string v2, "features"

    sget-object v28, Ly00/i1;->w:Ly00/i1;

    if-nez v9, :cond_19

    :cond_18
    :goto_11
    move-object/from16 v36, v5

    move-object/from16 v37, v6

    move-object/from16 v38, v7

    move-object/from16 v45, v8

    move-object/from16 v5, v28

    goto/16 :goto_18

    :cond_19
    invoke-virtual {v9, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v34

    if-eqz v34, :cond_18

    invoke-virtual {v9, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    if-nez v9, :cond_1a

    goto :goto_11

    :cond_1a
    move-object/from16 v36, v5

    const-string v5, "payment_method_save"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v37, v6

    invoke-virtual {v9, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v38, v7

    invoke-static {v10, v9}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1b

    sget-object v7, Ly00/m1;->y:Ly00/m1;

    :goto_12
    move-object/from16 v42, v7

    goto :goto_13

    :cond_1b
    invoke-virtual {v7, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1c

    sget-object v7, Ly00/m1;->w:Ly00/m1;

    goto :goto_12

    :cond_1c
    sget-object v7, Ly00/m1;->x:Ly00/m1;

    goto :goto_12

    :goto_13
    const-string v7, "payment_method_set_as_default"

    invoke-virtual {v9, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v45, v8

    const-string v8, "payment_method_save_allow_redisplay_override"

    invoke-virtual {v9, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ly00/r3;->F:Lt83/b;

    invoke-virtual {v9}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_1e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 v34, v9

    move-object/from16 v9, v28

    check-cast v9, Ly00/r3;

    iget-object v9, v9, Ly00/r3;->w:Ljava/lang/String;

    invoke-virtual {v9, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1d

    goto :goto_15

    :cond_1d
    move-object/from16 v9, v34

    goto :goto_14

    :cond_1e
    move-object/from16 v28, v16

    :goto_15
    move-object/from16 v43, v28

    check-cast v43, Ly00/r3;

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v40

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    sget-object v5, Ly00/l1;->w:Ly00/l1;

    :goto_16
    move-object/from16 v41, v5

    goto :goto_17

    :cond_1f
    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    sget-object v5, Ly00/l1;->x:Ly00/l1;

    goto :goto_16

    :cond_20
    sget-object v5, Ly00/l1;->y:Ly00/l1;

    goto :goto_16

    :goto_17
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v44

    new-instance v39, Ly00/j1;

    invoke-direct/range {v39 .. v44}, Ly00/j1;-><init>(ZLy00/l1;Ly00/m1;Ly00/r3;Z)V

    move-object/from16 v5, v39

    :goto_18
    const-string v6, "customer_sheet"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    sget-object v6, Ly00/f1;->w:Ly00/f1;

    if-nez v4, :cond_21

    goto :goto_1b

    :cond_21
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_27

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_22

    goto :goto_1b

    :cond_22
    invoke-virtual {v2, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v10, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_23

    sget-object v6, Ly00/m1;->y:Ly00/m1;

    goto :goto_19

    :cond_23
    invoke-virtual {v6, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_24

    sget-object v6, Ly00/m1;->w:Ly00/m1;

    goto :goto_19

    :cond_24
    sget-object v6, Ly00/m1;->x:Ly00/m1;

    :goto_19
    const-string v7, "payment_method_sync_default"

    invoke-virtual {v2, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v7, Ly00/g1;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_25

    sget-object v4, Ly00/l1;->w:Ly00/l1;

    goto :goto_1a

    :cond_25
    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_26

    sget-object v4, Ly00/l1;->x:Ly00/l1;

    goto :goto_1a

    :cond_26
    sget-object v4, Ly00/l1;->y:Ly00/l1;

    :goto_1a
    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-direct {v7, v4, v6, v2}, Ly00/g1;-><init>(Ly00/l1;Ly00/m1;Z)V

    move-object v6, v7

    :cond_27
    :goto_1b
    new-instance v2, Ly00/n1;

    invoke-direct {v2, v5, v6}, Ly00/n1;-><init>(Ly00/k1;Ly00/h1;)V

    move-object/from16 v34, v2

    :goto_1c
    if-nez v34, :cond_28

    goto/16 :goto_10

    :cond_28
    new-instance v28, Ly00/o1;

    invoke-direct/range {v28 .. v34}, Ly00/o1;-><init>(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ly00/n1;)V

    move-object/from16 v2, v28

    :goto_1d
    if-nez v2, :cond_29

    goto/16 :goto_9

    :cond_29
    const-string v4, "default_payment_method"

    invoke-virtual {v13, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_2a

    goto :goto_1e

    :cond_2a
    move-object/from16 v4, v16

    :goto_1e
    new-instance v5, Ly00/p1;

    invoke-direct {v5, v14, v4, v2}, Ly00/p1;-><init>(Ljava/util/List;Ljava/lang/String;Ly00/o1;)V

    :goto_1f
    const-string v2, "link_settings"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v4, "link_funding_sources"

    if-eqz v2, :cond_2b

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    goto :goto_20

    :cond_2b
    move-object/from16 v6, v16

    :goto_20
    invoke-static/range {v36 .. v36}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v7, Lc93/a;

    iget-boolean v8, v0, Lf1/p1;->x:Z

    iget-object v9, v0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v9, Ly00/b2;

    invoke-interface {v9}, Ly00/b2;->getType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-nez v3, :cond_2c

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :cond_2c
    if-eqz v45, :cond_2d

    const-string v10, "payment_method_types"

    move-object/from16 v11, v45

    invoke-virtual {v3, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2d
    move-object/from16 v11, v37

    move-object/from16 v10, v38

    invoke-virtual {v3, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v3, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-object/from16 v10, v35

    move-object/from16 v4, v36

    invoke-virtual {v3, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    instance-of v4, v9, Ly00/y1;

    if-eqz v4, :cond_2e

    new-instance v4, Lz00/a;

    const/16 v7, 0x1c

    invoke-direct {v4, v7}, Lz00/a;-><init>(I)V

    invoke-virtual {v4, v3}, Lz00/a;->c(Lorg/json/JSONObject;)Ly00/l3;

    move-result-object v3

    :goto_21
    move-object v13, v3

    move-object/from16 v10, v27

    goto :goto_23

    :cond_2e
    instance-of v4, v9, Ly00/a2;

    if-eqz v4, :cond_2f

    new-instance v4, Lz00/g;

    const/4 v7, 0x1

    invoke-direct {v4, v7}, Lz00/g;-><init>(I)V

    invoke-virtual {v4, v3}, Lz00/g;->a(Lorg/json/JSONObject;)Ly00/g6;

    move-result-object v3

    goto :goto_21

    :cond_2f
    instance-of v4, v9, Ly00/w1;

    if-eqz v4, :cond_56

    check-cast v9, Ly00/w1;

    iget-object v4, v9, Ly00/w1;->x:Ly00/a1;

    iget-object v4, v4, Ly00/a1;->w:Ly00/z0;

    instance-of v9, v4, Ly00/w0;

    if-eqz v9, :cond_30

    new-instance v9, Lb9/b;

    check-cast v4, Ly00/w0;

    move-object/from16 v10, v27

    invoke-direct {v9, v10, v4, v8, v7}, Lb9/b;-><init>(Ljava/lang/String;Ly00/w0;ZLc93/a;)V

    invoke-virtual {v9, v3}, Lb9/b;->w(Lorg/json/JSONObject;)Ly00/l3;

    move-result-object v3

    :goto_22
    move-object v13, v3

    goto :goto_23

    :cond_30
    move-object/from16 v10, v27

    instance-of v9, v4, Ly00/y0;

    if-eqz v9, :cond_55

    new-instance v9, Lb9/b;

    check-cast v4, Ly00/y0;

    invoke-direct {v9, v10, v4, v8, v7}, Lb9/b;-><init>(Ljava/lang/String;Ly00/y0;ZLc93/a;)V

    invoke-virtual {v9, v3}, Lb9/b;->x(Lorg/json/JSONObject;)Ly00/g6;

    move-result-object v3

    goto :goto_22

    :goto_23
    const-string v3, "experiments_data"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_36

    const-string v4, "arb_id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v7, "optString(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "experiment_assignments"

    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_35

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v8

    move-object/from16 v9, v25

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_24
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_34

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v3, v11}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    sget-object v14, Ly00/q1;->I:Lt83/b;

    invoke-virtual {v14}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_25
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_32

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v0, v15

    check-cast v0, Ly00/q1;

    iget-object v0, v0, Ly00/q1;->w:Ljava/lang/String;

    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_31

    goto :goto_26

    :cond_31
    move-object/from16 v0, p0

    goto :goto_25

    :cond_32
    move-object/from16 v15, v16

    :goto_26
    check-cast v15, Ly00/q1;

    if-eqz v15, :cond_33

    instance-of v0, v12, Ljava/lang/String;

    if-eqz v0, :cond_33

    invoke-interface {v7, v15, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_33
    move-object/from16 v0, p0

    goto :goto_24

    :cond_34
    invoke-static {v7}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    goto :goto_27

    :cond_35
    move-object/from16 v9, v25

    move-object/from16 v0, v18

    :goto_27
    new-instance v3, Ly00/r1;

    invoke-direct {v3, v4, v0}, Ly00/r1;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_28

    :cond_36
    move-object/from16 v9, v25

    move-object/from16 v3, v16

    :goto_28
    const-string v0, "custom_payment_method_data"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-nez v0, :cond_37

    goto :goto_2c

    :cond_37
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    const/4 v14, 0x0

    invoke-static {v14, v4}, Le93/b;->i0(II)Li93/j;

    move-result-object v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_29
    move-object v8, v4

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_3d

    move-object v8, v4

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    invoke-virtual {v0, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    move-object/from16 v11, v24

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "type"

    invoke-static {v12, v8}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_38

    goto :goto_2a

    :cond_38
    const-string v14, "error"

    invoke-static {v14, v8}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_39

    new-instance v8, Ly00/d1;

    invoke-direct {v8, v12, v14}, Ly00/d1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2b

    :cond_39
    const-string v14, "display_name"

    invoke-static {v14, v8}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_3a

    goto :goto_2a

    :cond_3a
    const-string v15, "logo_url"

    invoke-static {v15, v8}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_3b

    :goto_2a
    const/4 v8, 0x0

    goto :goto_2b

    :cond_3b
    new-instance v15, Ly00/c1;

    invoke-direct {v15, v12, v14, v8}, Ly00/c1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v15

    :goto_2b
    if-eqz v8, :cond_3c

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3c
    move-object/from16 v24, v11

    goto :goto_29

    :cond_3d
    move-object/from16 v19, v7

    :goto_2c
    const-string v0, "card_brand_choice"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_3e

    move-object/from16 v7, v16

    const/4 v14, 0x0

    goto :goto_2e

    :cond_3e
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v7, "preferred_networks"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    if-eqz v7, :cond_40

    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v8

    const/4 v14, 0x0

    :goto_2d
    if-ge v14, v8, :cond_40

    invoke-virtual {v7, v14}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_3f

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3f
    add-int/lit8 v14, v14, 0x1

    goto :goto_2d

    :cond_40
    new-instance v7, Ly00/b1;

    const-string v8, "eligible"

    const/4 v14, 0x0

    invoke-virtual {v0, v8, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v7, v0, v4}, Ly00/b1;-><init>(ZLjava/util/List;)V

    :goto_2e
    const-string v0, "google_pay_preference"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "merchant_country"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v8, "merchant_logo_url"

    invoke-static {v8, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v11, "passive_captcha"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_42

    const-string v12, "site_key"

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v15

    if-nez v15, :cond_41

    move-object/from16 v15, v16

    goto :goto_2f

    :cond_41
    new-instance v15, Ly00/c3;

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v14, "getString(...)"

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "rqdata"

    invoke-static {v14, v11}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v15, v12, v11}, Ly00/c3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2f
    move-object/from16 v25, v15

    goto :goto_30

    :cond_42
    move-object/from16 v25, v16

    :goto_30
    const-string v11, "account_id"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    const-string v11, "merchant_id"

    invoke-virtual {v1, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    if-eqz v13, :cond_57

    const/4 v14, 0x1

    if-eqz v2, :cond_43

    const-string v1, "link_mobile_disable_signup"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_43

    move/from16 v34, v14

    goto :goto_31

    :cond_43
    const/16 v34, 0x0

    :goto_31
    if-eqz v2, :cond_44

    const-string v1, "link_passthrough_mode_enabled"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_44

    move/from16 v31, v14

    goto :goto_32

    :cond_44
    const/16 v31, 0x0

    :goto_32
    if-eqz v2, :cond_45

    const-string v1, "link_mobile_use_attestation_endpoints"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_45

    move/from16 v36, v14

    goto :goto_33

    :cond_45
    const/16 v36, 0x0

    :goto_33
    if-eqz v2, :cond_46

    const-string v1, "link_mobile_disable_rux_in_flow_controller"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_46

    move/from16 v38, v14

    goto :goto_34

    :cond_46
    const/16 v38, 0x0

    :goto_34
    if-eqz v2, :cond_47

    const-string v1, "link_mobile_suppress_2fa_modal"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_47

    move/from16 v37, v14

    goto :goto_35

    :cond_47
    const/16 v37, 0x0

    :goto_35
    if-eqz v2, :cond_48

    const-string v1, "link_enable_displayable_default_values_in_ece"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_48

    move/from16 v39, v14

    goto :goto_36

    :cond_48
    const/16 v39, 0x0

    :goto_36
    if-eqz v2, :cond_49

    const-string v1, "link_mobile_skip_wallet_in_flow_controller"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_49

    move/from16 v40, v14

    goto :goto_37

    :cond_49
    const/16 v40, 0x0

    :goto_37
    if-eqz v2, :cond_4a

    const-string v1, "link_sign_up_opt_in_feature_enabled"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_4a

    move/from16 v41, v14

    goto :goto_38

    :cond_4a
    const/16 v41, 0x0

    :goto_38
    if-eqz v2, :cond_4b

    const-string v1, "link_sign_up_opt_in_initial_value"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v14, :cond_4b

    move/from16 v42, v14

    goto :goto_39

    :cond_4b
    const/16 v42, 0x0

    :goto_39
    if-eqz v2, :cond_4e

    const-string v1, "link_mode"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_4e

    sget-object v11, Ly00/p2;->z:Lt83/b;

    invoke-virtual {v11}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_4c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v15, v12

    check-cast v15, Ly00/p2;

    iget-object v15, v15, Ly00/p2;->w:Ljava/lang/String;

    invoke-virtual {v15, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4c

    goto :goto_3a

    :cond_4d
    move-object/from16 v12, v16

    :goto_3a
    check-cast v12, Ly00/p2;

    move-object/from16 v32, v12

    goto :goto_3b

    :cond_4e
    move-object/from16 v32, v16

    :goto_3b
    if-eqz v2, :cond_51

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4f
    :goto_3c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_50

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    instance-of v15, v12, Ljava/lang/Boolean;

    if-eqz v15, :cond_4f

    invoke-interface {v1, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3c

    :cond_50
    invoke-static {v1}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v9

    move-object/from16 v33, v9

    goto :goto_3d

    :cond_51
    move-object/from16 v33, v18

    :goto_3d
    if-eqz v2, :cond_52

    const-string v1, "link_supported_payment_methods_onboarding_enabled"

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    goto :goto_3e

    :cond_52
    move-object/from16 v1, v16

    :goto_3e
    invoke-static {v1}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v43

    new-instance v29, Ly00/t1;

    invoke-static {v6}, Lwy/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v30

    const/16 v35, 0x0

    invoke-direct/range {v29 .. v43}, Ly00/t1;-><init>(Ljava/util/List;ZLy00/p2;Ljava/util/Map;ZLy00/n2;ZZZZZZZLjava/util/List;)V

    const-string v1, "disabled"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v14

    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v10}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_53

    move-object/from16 v16, v10

    :cond_53
    if-nez v16, :cond_54

    const-string v1, "toString(...)"

    invoke-static {v1}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    :cond_54
    move-object/from16 v24, v16

    new-instance v9, Ly00/u1;

    move-object/from16 v12, v22

    const/16 v22, 0x0

    move-object/from16 v16, v3

    move-object/from16 v18, v4

    move-object/from16 v17, v5

    move-object/from16 v11, v20

    move-object/from16 v15, v21

    move-object/from16 v14, v23

    move-object/from16 v10, v29

    move/from16 v21, v0

    move-object/from16 v20, v7

    move-object/from16 v23, v19

    move-object/from16 v19, v8

    invoke-direct/range {v9 .. v28}, Ly00/u1;-><init>(Ly00/t1;Ljava/lang/String;Ljava/lang/String;Ly00/c8;Ljava/util/List;Ljava/util/Map;Ly00/r1;Ly00/p1;Ljava/lang/String;Ljava/lang/String;Ly00/b1;ZLjava/lang/Throwable;Ljava/util/List;Ljava/lang/String;Ly00/c3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v9

    :cond_55
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_56
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_57
    :goto_3f
    return-object v16
.end method

.method public n(JLf1/v;)Z
    .locals 8

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lf1/s1;

    invoke-virtual {v0}, Lf1/s1;->j()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v1

    iget-object v1, v1, Lq3/y;->a:Ll3/g;

    iget-object v1, v1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lf1/s1;->d:Lu0/s0;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lu0/s0;->d()Lu0/p1;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    const/4 v6, 0x0

    move-object v2, p0

    move-wide v4, p1

    move-object v7, p3

    invoke-virtual/range {v2 .. v7}, Lf1/p1;->x(Lq3/y;JZLf1/v;)J

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public o()Z
    .locals 1

    iget-boolean v0, p0, Lf1/p1;->x:Z

    return v0
.end method

.method public p()Z
    .locals 1

    iget-boolean v0, p0, Lf1/p1;->x:Z

    return v0
.end method

.method public q()Ljava/util/Properties;
    .locals 6

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lio/sentry/r2;

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance v4, Ljava/io/BufferedInputStream;

    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V

    invoke-virtual {v3, v4}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v3

    :catchall_0
    move-exception v3

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v4

    :try_start_4
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v3

    :cond_0
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-nez v4, :cond_1

    iget-boolean v3, p0, Lf1/p1;->x:Z

    if-eqz v3, :cond_2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Failed to load Sentry configuration since it is not a file or does not exist: %s"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lio/sentry/r2;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2

    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Failed to load Sentry configuration since it is not readable: %s"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lio/sentry/r2;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_2
    return-object v2

    :goto_1
    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Failed to load Sentry configuration from file: %s"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v4, v3, v5, v1}, Lio/sentry/r2;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method

.method public r(Ljava/lang/String;)Lai/j;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/ByteArrayInputStream;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance p1, Lio/sentry/g2;

    invoke-direct {p1, v1}, Lio/sentry/g2;-><init>(Ljava/io/Reader;)V

    iget-object v2, p1, Lio/sentry/g2;->w:Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {p1}, Lio/sentry/g2;->beginObject()V

    const/4 v3, -0x1

    move-object v4, v0

    :cond_0
    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v6, :cond_4

    invoke-virtual {v2}, Lio/sentry/vendor/gson/stream/a;->nextName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    const v7, -0x41f1c51a

    if-eq v6, v7, :cond_2

    const v7, 0x368f3a

    if-eq v6, v7, :cond_1

    goto :goto_0

    :cond_1
    const-string v6, "type"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lio/sentry/g2;->w0()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    const-string v6, "length"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1}, Lio/sentry/g2;->nextInt()I

    move-result v3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {p1}, Lio/sentry/g2;->skipValue()V

    :goto_1
    if-eqz v4, :cond_0

    if-ltz v3, :cond_0

    :cond_4
    if-ltz v3, :cond_5

    new-instance p1, Lai/j;

    invoke-direct {p1, v4, v3}, Lai/j;-><init>(Ljava/lang/Object;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v1}, Ljava/io/Reader;->close()V

    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object v0

    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Error parsing item header"

    invoke-interface {v1, v2, p1, v4, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public request(J)V
    .locals 2

    iget-boolean v0, p0, Lf1/p1;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_4

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lf1/p1;->x:Z

    iget-object p1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast p1, Lxg3/s;

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    iget-object p2, p0, Lf1/p1;->z:Ljava/lang/Object;

    :try_start_0
    invoke-interface {p1, p2}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lxg3/s;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0, p1, p2}, Ldt/b;->X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "n >= required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public s()V
    .locals 5

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, Ltl/l;->d(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpl/b;

    check-cast v1, Lpl/e;

    invoke-virtual {v1}, Lpl/e;->e()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v1, Lpl/e;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v3, v1, Lpl/e;->z:I

    const/4 v4, 0x6

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lpl/e;->c()V

    iget-boolean v2, p0, Lf1/p1;->x:Z

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lpl/e;->a()V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_3
    return-void
.end method

.method public t(Lg/a;)V
    .locals 1

    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ldc3/h;

    invoke-interface {v0, p1}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lf1/p1;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{numRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isPaused="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lf1/p1;->x:Z

    const-string v2, "}"

    invoke-static {v0, v1, v2}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public u()V
    .locals 3

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    check-cast v0, Lrm/a;

    iget-object v1, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    iget-boolean v2, p0, Lf1/p1;->x:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/p1;->x:Z

    :cond_0
    return-void
.end method

.method public v()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/p1;->x:Z

    return-void
.end method

.method public x(Lq3/y;JZLf1/v;)J
    .locals 9

    iget-object v0, p0, Lf1/p1;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lf1/s1;

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v7, p5

    invoke-static/range {v1 .. v8}, Lf1/s1;->c(Lf1/s1;Lq3/y;JZZLf1/v;Z)J

    move-result-wide p1

    iget-object p3, p0, Lf1/p1;->y:Ljava/lang/Object;

    check-cast p3, Ll3/u0;

    invoke-static {p1, p2, p3}, Ll3/u0;->a(JLjava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    const/4 p3, 0x0

    iput-boolean p3, p0, Lf1/p1;->x:Z

    :cond_0
    invoke-static {p1, p2}, Ll3/u0;->c(J)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p3, Lu0/g0;->y:Lu0/g0;

    goto :goto_0

    :cond_1
    sget-object p3, Lu0/g0;->x:Lu0/g0;

    :goto_0
    invoke-virtual {v1, p3}, Lf1/s1;->p(Lu0/g0;)V

    return-wide p1
.end method
