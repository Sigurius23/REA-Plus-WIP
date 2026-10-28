.class public final Leh/f;
.super Lne3/r;
.source "SourceFile"


# instance fields
.field public final w:La6/i;

.field public x:Z


# direct methods
.method public constructor <init>(Lne3/n0;La6/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lne3/r;-><init>(Lne3/n0;)V

    iput-object p2, p0, Leh/f;->w:La6/i;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lne3/r;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Leh/f;->x:Z

    iget-object v1, p0, Leh/f;->w:La6/i;

    invoke-virtual {v1, v0}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final flush()V
    .locals 2

    :try_start_0
    invoke-super {p0}, Lne3/r;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    iput-boolean v1, p0, Leh/f;->x:Z

    iget-object v1, p0, Leh/f;->w:La6/i;

    invoke-virtual {v1, v0}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final write(Lne3/h;J)V
    .locals 1

    iget-boolean v0, p0, Leh/f;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, p3}, Lne3/h;->skip(J)V

    return-void

    :cond_0
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Lne3/r;->write(Lne3/h;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Leh/f;->x:Z

    iget-object p2, p0, Leh/f;->w:La6/i;

    invoke-virtual {p2, p1}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
