.class public final Lko/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/l;


# instance fields
.field public final w:Lko/l;

.field public x:J

.field public y:Landroid/net/Uri;


# direct methods
.method public constructor <init>(Lko/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lko/i0;->w:Lko/l;

    sget-object p1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iput-object p1, p0, Lko/i0;->y:Landroid/net/Uri;

    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0}, Lko/l;->close()V

    return-void
.end method

.method public final getResponseHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0}, Lko/l;->getResponseHeaders()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0}, Lko/l;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final read([BII)I
    .locals 2

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0, p1, p2, p3}, Lko/i;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    iget-wide p2, p0, Lko/i0;->x:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lko/i0;->x:J

    :cond_0
    return p1
.end method

.method public final y(Lko/j0;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0, p1}, Lko/l;->y(Lko/j0;)V

    return-void
.end method

.method public final z(Lko/n;)J
    .locals 3

    iget-object v0, p1, Lko/n;->a:Landroid/net/Uri;

    iput-object v0, p0, Lko/i0;->y:Landroid/net/Uri;

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iget-object v0, p0, Lko/i0;->w:Lko/l;

    invoke-interface {v0, p1}, Lko/l;->z(Lko/n;)J

    move-result-wide v1

    invoke-interface {v0}, Lko/l;->getUri()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lko/i0;->y:Landroid/net/Uri;

    invoke-interface {v0}, Lko/l;->getResponseHeaders()Ljava/util/Map;

    return-wide v1
.end method
