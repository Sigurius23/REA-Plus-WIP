.class public final Lbk0/a;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbk0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0010\n\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 42\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0008R\u0011\u0010\u001d\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010!\u001a\u00020\u001e8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010%\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0011\u0010\'\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010$R\u0011\u0010+\u001a\u00020(8F\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*R\u0011\u0010/\u001a\u00020,8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0011\u00101\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0008R\u0011\u00103\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u00082\u0010\u0008\u00a8\u00065"
    }
    d2 = {
        "Lbk0/a;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "G",
        "()Ljava/lang/String;",
        "toString",
        "Lpt0/a;",
        "f",
        "Lpt0/a;",
        "Y",
        "()Lpt0/a;",
        "colorWay",
        "",
        "g",
        "J",
        "getBoardId",
        "()J",
        "boardId",
        "h",
        "Ljava/lang/String;",
        "getVersionHash",
        "versionHash",
        "",
        "b0",
        "()S",
        "revision",
        "Lws0/a;",
        "X",
        "()Lws0/a;",
        "batteryLevel",
        "",
        "d0",
        "()Z",
        "isCharging",
        "c0",
        "isBeingCharged",
        "Loh2/c;",
        "a",
        "()Loh2/c;",
        "hardwareVersion",
        "Loh2/b;",
        "d",
        "()Loh2/b;",
        "firmwareVersion",
        "Z",
        "deviceName",
        "a0",
        "deviceSerial",
        "i",
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
.field private static final i:Lbk0/a$a;


# instance fields
.field private final f:Lpt0/a;

.field private final g:J

.field private final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbk0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbk0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lbk0/a;->i:Lbk0/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 4

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p1, Lpt0/a;->Companion:Lpt0/a$a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-virtual {p1, v0}, Lpt0/a$a;->a(B)Lpt0/a;

    move-result-object p1

    iput-object p1, p0, Lbk0/a;->f:Lpt0/a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Luk0/b;->b(B)S

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lbk0/a;->g:J

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const-string v0, "array(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v0

    add-int/lit8 v0, v0, 0x1d

    new-instance v1, Ljava/lang/String;

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const/16 v3, 0x19

    invoke-direct {v1, p1, v0, v3, v2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const/4 p1, 0x0

    invoke-static {v1, p1}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbk0/a;->h:Ljava/lang/String;

    return-void
.end method

.method private final G()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Puffin HelloResponsePacket:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lbk0/a;->b0()S

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nRevision: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->X()Lws0/a;

    move-result-object v1

    invoke-virtual {v1}, Lws0/a;->a()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nBattery Level: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbk0/a;->f:Lpt0/a;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nColorWay: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->d0()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nisCharging: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->c0()Z

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nisBeingCharged: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->a()Loh2/c;

    move-result-object v1

    invoke-virtual {v1}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nHardware Version: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->d()Loh2/b;

    move-result-object v1

    invoke-interface {v1}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nFirmware Version: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lbk0/a;->h:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nVersion Hash: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->Z()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nDeviceName: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lbk0/a;->a0()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\nDeviceSerial: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final X()Lws0/a;
    .locals 3

    new-instance v0, Lws0/a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {v0, v1}, Lws0/a;-><init>(I)V

    return-object v0
.end method

.method public final Y()Lpt0/a;
    .locals 1

    iget-object v0, p0, Lbk0/a;->f:Lpt0/a;

    return-object v0
.end method

.method public final Z()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "array(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    add-int/lit8 v1, v1, 0x36

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const/16 v4, 0x10

    invoke-direct {v2, v0, v1, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a()Loh2/c;
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Loh2/c;->d:Loh2/c$b;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Loh2/c$b;->b(Ljava/nio/ByteBuffer;)Loh2/c;

    move-result-object v0

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method public final a0()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const-string v1, "array(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v1

    add-int/lit8 v1, v1, 0x46

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const/16 v4, 0x10

    invoke-direct {v2, v0, v1, v4, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const/4 v0, 0x0

    invoke-static {v2, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b0()S
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-static {v0}, Luk0/b;->b(B)S

    move-result v0

    return v0
.end method

.method public final c0()Z
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Loh2/b;
    .locals 9

    new-instance v0, Loh2/b$b;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v1

    invoke-static {v1}, Luk0/b;->b(B)S

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v4, 0x11

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v3

    invoke-static {v3}, Luk0/b;->b(B)S

    move-result v3

    int-to-long v3, v3

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v6, 0x15

    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v5

    invoke-static {v5}, Luk0/b;->b(B)S

    move-result v5

    int-to-long v5, v5

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v8, 0x19

    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v7

    invoke-static {v7}, Luk0/b;->d(I)J

    move-result-wide v7

    invoke-direct/range {v0 .. v8}, Loh2/b$b;-><init>(JJJJ)V

    return-object v0
.end method

.method public final d0()Z
    .locals 2

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lbk0/a;->G()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
