.class public final Lzf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Lyf/t;


# direct methods
.method public constructor <init>(Lyf/t;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/g;->w:Lyf/t;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lzf/g;->w:Lyf/t;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lzf/g;->w:Lyf/t;

    invoke-interface {v0}, Lyf/t;->flush()V

    return-void
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyf/k;

    invoke-direct {v0, p1}, Lyf/k;-><init>(Lne3/h;)V

    iget-object p1, p0, Lzf/g;->w:Lyf/t;

    invoke-interface {p1, v0, p2, p3}, Lyf/t;->Y(Lyf/k;J)V

    return-void
.end method
