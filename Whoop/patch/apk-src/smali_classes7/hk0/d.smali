.class public abstract Lhk0/d;
.super Lhk0/b;
.source "SourceFile"

# interfaces
.implements Llt0/f;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lhk0/d;",
        "Lhk0/b;",
        "Llt0/f;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Llt0/g;",
        "g",
        "()Llt0/g;",
        "formatRevision",
        "connectivity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/b;-><init>(Ljava/nio/ByteBuffer;)V

    return-void
.end method


# virtual methods
.method public g()Llt0/g;
    .locals 2

    new-instance v0, Llt0/g$c;

    invoke-virtual {p0}, Lhk0/b;->V()Lhk0/p;

    move-result-object v1

    invoke-direct {v0, v1}, Llt0/g$c;-><init>(Lhk0/p;)V

    return-object v0
.end method
