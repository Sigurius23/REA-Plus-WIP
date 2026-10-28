.class public final Lzf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Lyf/u;


# direct methods
.method public constructor <init>(Lyf/u;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/h;->w:Lyf/u;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lzf/h;->w:Lyf/u;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyf/k;

    invoke-direct {v0, p1}, Lyf/k;-><init>(Lne3/h;)V

    iget-object p1, p0, Lzf/h;->w:Lyf/u;

    invoke-interface {p1, v0, p2, p3}, Lyf/u;->c0(Lyf/k;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method
