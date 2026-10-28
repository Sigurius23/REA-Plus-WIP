.class public final Lzj0/o;
.super Lzj0/h;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u0017\u0010\u000f\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u001e\u00a8\u0006\""
    }
    d2 = {
        "Lzj0/o;",
        "Lzj0/h;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "f",
        "S",
        "getRevision",
        "()S",
        "revision",
        "",
        "g",
        "Z",
        "isBatteryPackInstalled",
        "()Z",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "h",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "hardwareFamily",
        "Lpt0/a;",
        "i",
        "Lpt0/a;",
        "getColorWay",
        "()Lpt0/a;",
        "colorWay",
        "",
        "X",
        "()Ljava/lang/String;",
        "btAddress",
        "Y",
        "deviceName",
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
.field private final f:S

.field private final g:Z

.field private final h:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

.field private final i:Lpt0/a;


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Lzj0/h;-><init>(Ljava/nio/ByteBuffer;Lst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Luk0/b;->b(B)S

    move-result p1

    iput-short p1, p0, Lzj0/o;->f:S

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    iput-boolean v0, p0, Lzj0/o;->g:Z

    sget-object p1, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->Companion:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x1a

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-virtual {p1, v0}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;->a(B)Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object p1

    iput-object p1, p0, Lzj0/o;->h:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    sget-object p1, Lpt0/a;->Companion:Lpt0/a$a;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x1b

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    invoke-virtual {p1, v0}, Lpt0/a$a;->a(B)Lpt0/a;

    move-result-object p1

    iput-object p1, p0, Lzj0/o;->i:Lpt0/a;

    return-void
.end method


# virtual methods
.method public final X()Ljava/lang/String;
    .locals 7

    const/4 v0, 0x6

    new-array v1, v0, [B

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-static {v1}, Lze1/b;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->S(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ":"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Y()Ljava/lang/String;
    .locals 4

    const/16 v0, 0x10

    new-array v1, v0, [B

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v1, v3, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    invoke-virtual {p0}, Lzj0/h;->S()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-static {v1}, Luk0/d;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final Z()Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 1

    iget-object v0, p0, Lzj0/o;->h:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    return-object v0
.end method
