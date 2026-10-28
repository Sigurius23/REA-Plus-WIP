.class public final Lzf/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/u;


# instance fields
.field public final w:Lne3/j;


# direct methods
.method public constructor <init>(Lne3/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/f;->w:Lne3/j;

    return-void
.end method


# virtual methods
.method public final c0(Lyf/k;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lzf/f;->w:Lne3/j;

    iget-object p1, p1, Lyf/k;->w:Lne3/h;

    invoke-interface {v0, p1, p2, p3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lzf/f;->w:Lne3/j;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
