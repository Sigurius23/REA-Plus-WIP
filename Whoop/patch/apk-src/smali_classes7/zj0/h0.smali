.class public final Lzj0/h0;
.super Lck0/a;
.source "SourceFile"

# interfaces
.implements Lzj0/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/h0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001cB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0014\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lzj0/h0;",
        "Lck0/a;",
        "Lzj0/g;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "d0",
        "()Z",
        "",
        "toString",
        "()Ljava/lang/String;",
        "k",
        "Ljava/lang/String;",
        "K",
        "packetName",
        "",
        "b0",
        "()J",
        "epochSeconds",
        "c0",
        "epochSubseconds",
        "Lfk2/a;",
        "getTime",
        "()Lfk2/a;",
        "time",
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
.field public static final l:Lzj0/h0$a;


# instance fields
.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzj0/h0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/h0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/h0;->l:Lzj0/h0$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lck0/a;-><init>(Ljava/nio/ByteBuffer;)V

    const-string p1, "Rev2GetClockResponsePacket"

    iput-object p1, p0, Lzj0/h0;->k:Ljava/lang/String;

    return-void
.end method

.method private final d0()Z
    .locals 2

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x27

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzj0/h0;->k:Ljava/lang/String;

    return-object v0
.end method

.method public final b0()J
    .locals 2

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x21

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    invoke-static {v0}, Luk0/b;->d(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c0()J
    .locals 3

    sget-object v0, Luk0/b;->a:Luk0/b;

    invoke-virtual {p0}, Lck0/a;->X()Ljava/nio/ByteBuffer;

    move-result-object v1

    const/16 v2, 0x25

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public getTime()Lfk2/a;
    .locals 5

    invoke-virtual {p0}, Lck0/a;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lzj0/h0;->d0()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lfk2/a;

    invoke-virtual {p0}, Lzj0/h0;->b0()J

    move-result-wide v1

    invoke-virtual {p0}, Lzj0/h0;->c0()J

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lfk2/a;-><init>(JJ)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lzj0/h0;->K()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->V()Lwj0/b;

    move-result-object v1

    invoke-virtual {p0}, Lzj0/h0;->getTime()Lfk2/a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lfk2/a;->i()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (Result: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " Time: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
