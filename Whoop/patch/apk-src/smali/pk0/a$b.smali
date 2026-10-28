.class final Lpk0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpk0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0013\u0010\u0015R$\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lpk0/a$b;",
        "",
        "Llt0/i;",
        "frame",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Lpk0/a;Llt0/i;Ljava/nio/ByteBuffer;)V",
        "",
        "data",
        "Ll83/a0;",
        "a",
        "([B)V",
        "",
        "d",
        "()Z",
        "Llt0/i;",
        "c",
        "()Llt0/i;",
        "b",
        "Ljava/nio/ByteBuffer;",
        "()Ljava/nio/ByteBuffer;",
        "value",
        "Z",
        "e",
        "isFailure",
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


# instance fields
.field private final a:Llt0/i;

.field private final b:Ljava/nio/ByteBuffer;

.field private c:Z

.field final synthetic d:Lpk0/a;


# direct methods
.method public constructor <init>(Lpk0/a;Llt0/i;Ljava/nio/ByteBuffer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llt0/i;",
            "Ljava/nio/ByteBuffer;",
            ")V"
        }
    .end annotation

    const-string v0, "frame"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lpk0/a$b;->d:Lpk0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lpk0/a$b;->a:Llt0/i;

    iput-object p3, p0, Lpk0/a$b;->b:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final a([B)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lpk0/a$b;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    array-length v1, p1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lpk0/a$b;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    return-void

    :cond_0
    iget-object p1, p0, Lpk0/a$b;->d:Lpk0/a;

    invoke-static {p1}, Lpk0/a;->c(Lpk0/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Buffer overflow - dumping packet"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpk0/a$b;->c:Z

    return-void
.end method

.method public final b()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lpk0/a$b;->b:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public final c()Llt0/i;
    .locals 1

    iget-object v0, p0, Lpk0/a$b;->a:Llt0/i;

    return-object v0
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Lpk0/a$b;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    iget-object v1, p0, Lpk0/a$b;->a:Llt0/i;

    invoke-virtual {v1}, Llt0/i;->i()I

    move-result v1

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lpk0/a$b;->c:Z

    return v0
.end method
