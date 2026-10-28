.class public final Lz8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/f;


# instance fields
.field public final w:Lz8/f;

.field public x:J

.field public y:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lz8/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lz8/m;->w:Lz8/f;

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lz8/m;->y:Landroid/net/Uri;

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final addTransferListener(Lz8/n;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    invoke-interface {v0, p1}, Lz8/f;->addTransferListener(Lz8/n;)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    invoke-interface {v0}, Lz8/f;->close()V

    return-void
.end method

.method public final getResponseHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    invoke-interface {v0}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    invoke-interface {v0}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final open(Lz8/g;)J
    .locals 3

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    iget-object v1, p1, Lz8/g;->a:Landroid/net/Uri;

    iput-object v1, p0, Lz8/m;->y:Landroid/net/Uri;

    sget-object v1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :try_start_0
    invoke-interface {v0, p1}, Lz8/f;->open(Lz8/g;)J

    move-result-wide v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lz8/m;->y:Landroid/net/Uri;

    :cond_0
    invoke-interface {v0}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    return-wide v1

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lz8/f;->getUri()Landroid/net/Uri;

    move-result-object v1

    if-eqz v1, :cond_1

    iput-object v1, p0, Lz8/m;->y:Landroid/net/Uri;

    :cond_1
    invoke-interface {v0}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    throw p1
.end method

.method public final read([BII)I
    .locals 2

    iget-object v0, p0, Lz8/m;->w:Lz8/f;

    invoke-interface {v0, p1, p2, p3}, Lu8/h;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lz8/m;->x:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lz8/m;->x:J

    :cond_0
    return p1
.end method
