.class public final Lz8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/f;


# instance fields
.field public E:Lz8/a;

.field public F:Lz8/c;

.field public G:Lz8/f;

.field public H:Lz8/o;

.field public I:Lz8/d;

.field public J:Lz8/l;

.field public K:Lz8/f;

.field public final w:Landroid/content/Context;

.field public final x:Ljava/util/ArrayList;

.field public final y:Lz8/f;

.field public z:Lz8/j;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lz8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lz8/h;->w:Landroid/content/Context;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lz8/h;->y:Lz8/f;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lz8/h;->x:Ljava/util/ArrayList;

    return-void
.end method

.method public static b(Lz8/f;Lz8/n;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lz8/f;->addTransferListener(Lz8/n;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Lz8/f;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lz8/h;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz8/n;

    invoke-interface {p1, v1}, Lz8/f;->addTransferListener(Lz8/n;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final addTransferListener(Lz8/n;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lz8/h;->y:Lz8/f;

    invoke-interface {v0, p1}, Lz8/f;->addTransferListener(Lz8/n;)V

    iget-object v0, p0, Lz8/h;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lz8/h;->z:Lz8/j;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->E:Lz8/a;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->F:Lz8/c;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->G:Lz8/f;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->H:Lz8/o;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->I:Lz8/d;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    iget-object v0, p0, Lz8/h;->J:Lz8/l;

    invoke-static {v0, p1}, Lz8/h;->b(Lz8/f;Lz8/n;)V

    return-void
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0}, Lz8/f;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lz8/h;->K:Lz8/f;

    return-void

    :catchall_0
    move-exception v0

    iput-object v1, p0, Lz8/h;->K:Lz8/f;

    throw v0

    :cond_0
    return-void
.end method

.method public final getResponseHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-object v0

    :cond_0
    invoke-interface {v0}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-interface {v0}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final open(Lz8/g;)J
    .locals 6

    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    iget-object v0, p1, Lz8/g;->a:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    sget v3, Lx8/t;->a:I

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    iget-object v5, p0, Lz8/h;->w:Landroid/content/Context;

    if-nez v4, :cond_f

    const-string v4, "file"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v0, "asset"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lz8/h;->E:Lz8/a;

    if-nez v0, :cond_2

    new-instance v0, Lz8/a;

    invoke-direct {v0, v5}, Lz8/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lz8/h;->E:Lz8/a;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_2
    iget-object v0, p0, Lz8/h;->E:Lz8/a;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto/16 :goto_4

    :cond_3
    const-string v0, "content"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lz8/h;->F:Lz8/c;

    if-nez v0, :cond_4

    new-instance v0, Lz8/c;

    invoke-direct {v0, v5}, Lz8/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lz8/h;->F:Lz8/c;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_4
    iget-object v0, p0, Lz8/h;->F:Lz8/c;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto/16 :goto_4

    :cond_5
    const-string v0, "rtmp"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v3, p0, Lz8/h;->y:Lz8/f;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lz8/h;->G:Lz8/f;

    if-nez v0, :cond_6

    :try_start_0
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz8/f;

    iput-object v0, p0, Lz8/h;->G:Lz8/f;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Error instantiating RTMP extension"

    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    const-string v0, "DefaultDataSource"

    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    invoke-static {v0, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lz8/h;->G:Lz8/f;

    if-nez v0, :cond_6

    iput-object v3, p0, Lz8/h;->G:Lz8/f;

    :cond_6
    iget-object v0, p0, Lz8/h;->G:Lz8/f;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto/16 :goto_4

    :cond_7
    const-string v0, "udp"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lz8/h;->H:Lz8/o;

    if-nez v0, :cond_8

    new-instance v0, Lz8/o;

    invoke-direct {v0}, Lz8/o;-><init>()V

    iput-object v0, p0, Lz8/h;->H:Lz8/o;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_8
    iget-object v0, p0, Lz8/h;->H:Lz8/o;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto/16 :goto_4

    :cond_9
    const-string v0, "data"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lz8/h;->I:Lz8/d;

    if-nez v0, :cond_a

    new-instance v0, Lz8/d;

    invoke-direct {v0, v1}, Lz8/b;-><init>(Z)V

    iput-object v0, p0, Lz8/h;->I:Lz8/d;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_a
    iget-object v0, p0, Lz8/h;->I:Lz8/d;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto :goto_4

    :cond_b
    const-string v0, "rawresource"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "android.resource"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_2

    :cond_c
    iput-object v3, p0, Lz8/h;->K:Lz8/f;

    goto :goto_4

    :cond_d
    :goto_2
    iget-object v0, p0, Lz8/h;->J:Lz8/l;

    if-nez v0, :cond_e

    new-instance v0, Lz8/l;

    invoke-direct {v0, v5}, Lz8/l;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lz8/h;->J:Lz8/l;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_e
    iget-object v0, p0, Lz8/h;->J:Lz8/l;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto :goto_4

    :cond_f
    :goto_3
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    const-string v2, "/android_asset/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object v0, p0, Lz8/h;->E:Lz8/a;

    if-nez v0, :cond_10

    new-instance v0, Lz8/a;

    invoke-direct {v0, v5}, Lz8/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lz8/h;->E:Lz8/a;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_10
    iget-object v0, p0, Lz8/h;->E:Lz8/a;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    goto :goto_4

    :cond_11
    iget-object v0, p0, Lz8/h;->z:Lz8/j;

    if-nez v0, :cond_12

    new-instance v0, Lz8/j;

    invoke-direct {v0, v1}, Lz8/b;-><init>(Z)V

    iput-object v0, p0, Lz8/h;->z:Lz8/j;

    invoke-virtual {p0, v0}, Lz8/h;->a(Lz8/f;)V

    :cond_12
    iget-object v0, p0, Lz8/h;->z:Lz8/j;

    iput-object v0, p0, Lz8/h;->K:Lz8/f;

    :goto_4
    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    invoke-interface {v0, p1}, Lz8/f;->open(Lz8/g;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read([BII)I
    .locals 1

    iget-object v0, p0, Lz8/h;->K:Lz8/f;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1, p2, p3}, Lu8/h;->read([BII)I

    move-result p1

    return p1
.end method
