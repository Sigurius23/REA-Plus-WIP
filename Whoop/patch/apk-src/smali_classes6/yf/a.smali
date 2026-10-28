.class public final Lyf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/l;


# instance fields
.field public final w:Lne3/h0;


# direct methods
.method public constructor <init>(Lne3/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/a;->w:Lne3/h0;

    return-void
.end method


# virtual methods
.method public final C(Lyf/u;)J
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-static {p1}, Ls30/b;->x(Lyf/u;)Lne3/p0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lne3/h0;->N0(Lne3/p0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final Y(Lyf/k;J)V
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    iget-object p1, p1, Lyf/k;->w:Lne3/h;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h0;->write(Lne3/h;J)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->close()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->e()Lne3/i;

    return-void
.end method

.method public final f()Lyf/k;
    .locals 2

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    iget-object v0, v0, Lne3/h0;->x:Lne3/h;

    new-instance v1, Lyf/k;

    invoke-direct {v1, v0}, Lyf/k;-><init>(Lne3/h;)V

    return-object v1
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    return-void
.end method

.method public final isOpen()Z
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->isOpen()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    invoke-virtual {v0, p1}, Lne3/h0;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final z(ILjava/lang/String;)V
    .locals 2

    const-string v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyf/a;->w:Lne3/h0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lne3/h0;->L0(IILjava/lang/String;)Lne3/i;

    return-void
.end method
