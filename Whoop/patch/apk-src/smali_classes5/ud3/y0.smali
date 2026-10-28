.class public final Lud3/y0;
.super Ljava/io/Reader;
.source "SourceFile"


# instance fields
.field public final w:Lne3/j;

.field public final x:Ljava/nio/charset/Charset;

.field public y:Z

.field public z:Ljava/io/InputStreamReader;


# direct methods
.method public constructor <init>(Lne3/j;Ljava/nio/charset/Charset;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    iput-object p1, p0, Lud3/y0;->w:Lne3/j;

    iput-object p2, p0, Lud3/y0;->x:Ljava/nio/charset/Charset;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lud3/y0;->y:Z

    iget-object v0, p0, Lud3/y0;->z:Ljava/io/InputStreamReader;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lud3/y0;->w:Lne3/j;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final read([CII)I
    .locals 4

    const-string v0, "cbuf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lud3/y0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lud3/y0;->z:Ljava/io/InputStreamReader;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/InputStreamReader;

    iget-object v1, p0, Lud3/y0;->w:Lne3/j;

    invoke-interface {v1}, Lne3/j;->i1()Ljava/io/InputStream;

    move-result-object v2

    iget-object v3, p0, Lud3/y0;->x:Ljava/nio/charset/Charset;

    invoke-static {v1, v3}, Lwd3/h;->f(Lne3/j;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, Lud3/y0;->z:Ljava/io/InputStreamReader;

    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    move-result p1

    return p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
