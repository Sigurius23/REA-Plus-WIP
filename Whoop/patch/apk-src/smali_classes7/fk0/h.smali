.class public final Lfk0/h;
.super Lot0/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0008R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0008\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lfk0/h;",
        "Lot0/a;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "e",
        "I",
        "revisionLength",
        "f",
        "revisionOffset",
        "g",
        "stateOfChargeOffset",
        "h",
        "getRevision",
        "()I",
        "revision",
        "Lws0/a;",
        "i",
        "Lws0/a;",
        "T",
        "()Lws0/a;",
        "batteryLevel",
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
.field private final e:I

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Lws0/a;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lot0/a;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 p1, 0x1

    iput p1, p0, Lfk0/h;->e:I

    iget v0, p0, Lfk0/h;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Lfk0/h;->g:I

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget v1, p0, Lfk0/h;->f:I

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    iput p1, p0, Lfk0/h;->h:I

    new-instance p1, Lws0/a;

    invoke-virtual {p0}, Lot0/a;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v0

    invoke-static {v0}, Lws0/b;->a(I)I

    move-result v0

    invoke-direct {p1, v0}, Lws0/a;-><init>(I)V

    iput-object p1, p0, Lfk0/h;->i:Lws0/a;

    return-void
.end method


# virtual methods
.method public final T()Lws0/a;
    .locals 1

    iget-object v0, p0, Lfk0/h;->i:Lws0/a;

    return-object v0
.end method
