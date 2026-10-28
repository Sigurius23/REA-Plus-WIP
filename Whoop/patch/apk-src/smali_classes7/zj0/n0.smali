.class public final Lzj0/n0;
.super Lck0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/n0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u000c\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u0008R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lzj0/n0;",
        "Lck0/a;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "k",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "",
        "c0",
        "()Ljava/lang/Integer;",
        "flashStatusValue",
        "Lzj0/g0;",
        "b0",
        "()Lzj0/g0;",
        "flashStatus",
        "l",
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
.field public static final l:Lzj0/n0$a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/n0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/n0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/n0;->l:Lzj0/n0$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lck0/a;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "Rev2HistorySendResponsePacket"

    iput-object p1, p0, Lzj0/n0;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/n0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final b0()Lzj0/g0;
    .locals 2

    invoke-virtual {p0}, Lzj0/n0;->c0()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lzj0/g0;->Companion:Lzj0/g0$a;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Lzj0/g0$a;->a(I)Lzj0/g0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lzj0/g0;->UNKNOWN:Lzj0/g0;

    return-object v0
.end method

.method public final c0()Ljava/lang/Integer;
    .locals 2

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x20

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lzj0/n0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v1

    invoke-virtual {p0}, Lzj0/n0;->b0()Lzj0/g0;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Result: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " FlashStatus: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
