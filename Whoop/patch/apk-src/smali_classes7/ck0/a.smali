.class public Lck0/a;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lck0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u0017\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\"\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lck0/a;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "f",
        "Ljava/lang/String;",
        "K",
        "()Ljava/lang/String;",
        "packetName",
        "Lhk0/b;",
        "g",
        "Lhk0/b;",
        "header",
        "",
        "h",
        "I",
        "getCommandId",
        "()I",
        "commandId",
        "i",
        "Y",
        "state",
        "X",
        "()Ljava/nio/ByteBuffer;",
        "",
        "a0",
        "()Z",
        "isSuccess",
        "Lfk2/a;",
        "Z",
        "()Lfk2/a;",
        "timeStamp",
        "j",
        "a",
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


# static fields
.field public static final j:Lck0/a$a;


# instance fields
.field private final f:Ljava/lang/String;

.field private final g:Lhk0/b;

.field private final h:I

.field private final i:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lck0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lck0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lck0/a;->j:Lck0/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lst0/v;->MONUMENT:Lst0/v;

    invoke-direct {p0, p1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;)V

    const-string v0, "Rev2CommandResponsePacket"

    iput-object v0, p0, Lck0/a;->f:Ljava/lang/String;

    new-instance v0, Lhk0/b;

    invoke-direct {v0, p1}, Lhk0/b;-><init>(Ljava/nio/ByteBuffer;)V

    iput-object v0, p0, Lck0/a;->g:Lhk0/b;

    sget-object v0, Luk0/b;->a:Luk0/b;

    const/16 v1, 0x14

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    iput v0, p0, Lck0/a;->h:I

    const/16 v0, 0x1a

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    and-int/lit16 p1, p1, 0xff

    iput p1, p0, Lck0/a;->i:I

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lck0/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final X()Ljava/nio/ByteBuffer;
    .locals 1

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final Y()I
    .locals 1

    iget v0, p0, Lck0/a;->i:I

    return v0
.end method

.method public final Z()Lfk2/a;
    .locals 1

    iget-object v0, p0, Lck0/a;->g:Lhk0/b;

    invoke-virtual {v0}, Lhk0/b;->X()Lfk2/a;

    move-result-object v0

    return-object v0
.end method

.method public final a0()Z
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v0

    sget-object v1, Lwj0/b;->SUCCESS:Lwj0/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
