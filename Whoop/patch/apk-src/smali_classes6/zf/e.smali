.class public final Lzf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/t;


# instance fields
.field public final w:Lne3/n0;


# direct methods
.method public constructor <init>(Lne3/n0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzf/e;->w:Lne3/n0;

    return-void
.end method


# virtual methods
.method public final Y(Lyf/k;J)V
    .locals 1

    iget-object v0, p0, Lzf/e;->w:Lne3/n0;

    iget-object p1, p1, Lyf/k;->w:Lne3/h;

    invoke-interface {v0, p1, p2, p3}, Lne3/n0;->write(Lne3/h;J)V

    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lzf/e;->w:Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lzf/e;->w:Lne3/n0;

    invoke-interface {v0}, Lne3/n0;->flush()V

    return-void
.end method
