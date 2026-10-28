.class public final Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrh/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B-\u0008\u0016\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u00060\u000cj\u0002`\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u001c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;",
        "Lrh/u;",
        "Lkotlin/Function1;",
        "Lrh/m;",
        "Ll83/a0;",
        "builder",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "",
        "Lxh/i;",
        "interceptors",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V",
        "Landroid/content/Context;",
        "Lcoil3/PlatformContext;",
        "context",
        "Lrh/n;",
        "newImageLoader",
        "(Landroid/content/Context;)Lrh/n;",
        "Lkotlin/jvm/functions/Function1;",
        "Ljava/util/List;",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "fileManager",
        "Lio/getstream/chat/android/client/internal/file/StreamFileManager;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final builder:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

.field private interceptors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lxh/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lxh/i;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "interceptors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "builder"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 13
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->interceptors:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 10
    new-instance p2, Lny0/m;

    const/16 p3, 0xc

    invoke-direct {p2, p3}, Lny0/m;-><init>(I)V

    .line 11
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->builder:Lkotlin/jvm/functions/Function1;

    .line 4
    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->interceptors:Ljava/util/List;

    .line 5
    new-instance p1, Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 8
    new-instance p1, Lny0/m;

    const/16 p2, 0xd

    invoke-direct {p1, p2}, Lny0/m;-><init>(I)V

    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lrh/m;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final _init_$lambda$1(Lrh/m;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lrh/m;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->_init_$lambda$1(Lrh/m;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lrh/m;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->_init_$lambda$0(Lrh/m;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Landroid/content/Context;)Lai/f;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->newImageLoader$lambda$2(Landroid/content/Context;)Lai/d;

    move-result-object p0

    check-cast p0, Lai/f;

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;Landroid/content/Context;)Lth/h;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->newImageLoader$lambda$3(Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;Landroid/content/Context;)Lth/a;

    move-result-object p0

    check-cast p0, Lth/h;

    return-object p0
.end method

.method private static final newImageLoader$lambda$2(Landroid/content/Context;)Lai/d;
    .locals 3

    new-instance v0, Lro/i;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lro/i;-><init>(I)V

    const-wide/high16 v1, 0x3fd0000000000000L    # 0.25

    invoke-virtual {v0, p0, v1, v2}, Lro/i;->w(Landroid/content/Context;D)V

    invoke-virtual {v0}, Lro/i;->p()Lai/f;

    move-result-object p0

    return-object p0
.end method

.method private static final newImageLoader$lambda$3(Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;Landroid/content/Context;)Lth/a;
    .locals 7

    sget-object v0, Lne3/p;->w:Lne3/a0;

    sget-object v1, Lne3/e0;->x:Ljava/lang/String;

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->fileManager:Lio/getstream/chat/android/client/internal/file/StreamFileManager;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/file/StreamFileManager;->getImageCache(Landroid/content/Context;)Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object p0

    const-wide/32 v3, 0xa00000

    :try_start_0
    invoke-virtual {p0}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->mkdir()Z

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Landroid/os/StatFs;

    invoke-direct {v1, p1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v5

    invoke-virtual {v1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    mul-long/2addr v1, v5

    long-to-double v1, v1

    const-wide v5, 0x3f947ae147ae147bL    # 0.02

    mul-double/2addr v5, v1

    double-to-long v1, v5

    const-wide/32 v5, 0xfa00000

    invoke-static/range {v1 .. v6}, Le93/b;->p(JJJ)J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Lth/h;

    invoke-direct {p1, v3, v4, v0, p0}, Lth/h;-><init>(JLne3/p;Lne3/e0;)V

    return-object p1
.end method


# virtual methods
.method public final newImageLoader(Landroid/content/Context;)Lrh/n;
    .locals 14

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lrh/m;

    invoke-direct {v0, p1}, Lrh/m;-><init>(Landroid/content/Context;)V

    new-instance v1, Lal0/f;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lal0/f;-><init>(Landroid/content/Context;I)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v1

    iput-object v1, v0, Lrh/m;->c:Ll83/p;

    sget-object v1, Lfi/k;->a:Lf93/a;

    sget-object v1, Lfi/k;->f:Lf93/a;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v3, v0, Lrh/m;->f:Lrh/h;

    invoke-virtual {v3, v1, v2}, Lrh/h;->a(Lf93/a;Ljava/lang/Object;)V

    sget-object v1, Lfi/j;->a:Lf93/a;

    new-instance v1, Lji/a;

    const/16 v2, 0xc8

    invoke-direct {v1, v2}, Lji/a;-><init>(I)V

    sget-object v2, Lfi/k;->a:Lf93/a;

    invoke-virtual {v3, v2, v1}, Lrh/h;->a(Lf93/a;Ljava/lang/Object;)V

    new-instance v1, Lmi2/o;

    const/16 v2, 0x15

    invoke-direct {v1, v2, p0, p1}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, v0, Lrh/m;->d:Ll83/p;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->interceptors:Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lxh/i;

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v5, Lbi/j;

    new-instance v6, Ldf2/a;

    const/16 v7, 0x8

    invoke-direct {v6, v7}, Ldf2/a;-><init>(I)V

    invoke-direct {v5, v6}, Lbi/j;-><init>(Ldf2/a;)V

    const-class v6, Lrh/y;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    new-instance v7, Lqt2/e;

    const/16 v8, 0x10

    invoke-direct {v7, v8, v5, v6}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lvh/a;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lvh/a;-><init>(Z)V

    new-instance v6, Lrh/c;

    const/4 v7, 0x0

    invoke-direct {v6, v5, v7}, Lrh/c;-><init>(Lsh/j;I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lli/f;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lrh/c;

    invoke-direct {v6, v5, v7}, Lrh/c;-><init>(Lsh/j;I)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v8, Lrh/d;

    invoke-static {p1}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    invoke-static {v1}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-static {v2}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-static {v3}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-static {v4}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lrh/d;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iput-object v8, v0, Lrh/m;->e:Lrh/d;

    iget-object p1, p0, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->builder:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lrh/m;->a()Lrh/t;

    move-result-object p1

    return-object p1
.end method
