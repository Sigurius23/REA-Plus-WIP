.class public final Lnt0/a;
.super Lnt0/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnt0/a$a;,
        Lnt0/a$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 %2\u00020\u0001:\u0001&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020\r8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006\'"
    }
    d2 = {
        "Lnt0/a;",
        "Lnt0/h;",
        "Lst0/v;",
        "strapGen",
        "Llt0/m;",
        "receivedPacket",
        "Llt0/b;",
        "dataPacket",
        "<init>",
        "(Lst0/v;Llt0/m;Llt0/b;)V",
        "Ll83/r;",
        "n0",
        "(Llt0/b;)B",
        "",
        "firstByteOffset",
        "numSamples",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "",
        "g0",
        "(IILjava/nio/ByteBuffer;)[S",
        "o0",
        "h0",
        "(Llt0/b;)[S",
        "i0",
        "j0",
        "k0",
        "l0",
        "m0",
        "Lnt0/i;",
        "p0",
        "(Llt0/b;)Lnt0/i;",
        "v",
        "I",
        "c0",
        "()I",
        "expectedPacketLength",
        "w",
        "a",
        "connectivity-core_release"
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
.field public static final w:Lnt0/a$a;


# instance fields
.field private final v:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lnt0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lnt0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lnt0/a;->w:Lnt0/a$a;

    return-void
.end method

.method public constructor <init>(Lst0/v;Llt0/m;Llt0/b;)V
    .locals 1

    const-string v0, "strapGen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedPacket"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dataPacket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p2, p3, v0}, Lnt0/h;-><init>(Llt0/m;Llt0/b;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object p2, Lnt0/a$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "R10 is not a Castle packet type; Castle uses Rev2PacketType. Check dispatch site."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const/4 p1, 0x0

    goto :goto_0

    :pswitch_2
    const/16 p1, 0x78c

    goto :goto_0

    :pswitch_3
    const/16 p1, 0x788

    :goto_0
    iput p1, p0, Lnt0/a;->v:I

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final g0(IILjava/nio/ByteBuffer;)[S
    .locals 0

    new-array p2, p2, [S

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p2
.end method

.method private final h0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x55

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->g0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final i0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x11d

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->g0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final j0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x1e5

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->g0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final k0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x2b0

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->o0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final l0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x378

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->o0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final m0(Llt0/b;)[S
    .locals 2

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x64

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v1, 0x440

    invoke-direct {p0, v1, v0, p1}, Lnt0/a;->o0(IILjava/nio/ByteBuffer;)[S

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [S

    return-object p1
.end method

.method private final n0(Llt0/b;)B
    .locals 1

    invoke-virtual {p1}, Llt0/b;->a0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object p1

    const/16 v0, 0x11

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final o0(IILjava/nio/ByteBuffer;)[S
    .locals 0

    new-array p2, p2, [S

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-object p2
.end method


# virtual methods
.method public c0()I
    .locals 1

    iget v0, p0, Lnt0/a;->v:I

    return v0
.end method

.method public final p0(Llt0/b;)Lnt0/i;
    .locals 15

    const-string v0, "dataPacket"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnt0/i;

    invoke-virtual/range {p1 .. p1}, Llt0/c;->L()Llt0/c$a;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Llt0/b;->V()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Llt0/b;->W()J

    move-result-wide v5

    invoke-direct/range {p0 .. p1}, Lnt0/a;->n0(Llt0/b;)B

    move-result v7

    invoke-direct/range {p0 .. p1}, Lnt0/a;->h0(Llt0/b;)[S

    move-result-object v8

    invoke-direct/range {p0 .. p1}, Lnt0/a;->i0(Llt0/b;)[S

    move-result-object v9

    invoke-direct/range {p0 .. p1}, Lnt0/a;->j0(Llt0/b;)[S

    move-result-object v10

    invoke-direct/range {p0 .. p1}, Lnt0/a;->k0(Llt0/b;)[S

    move-result-object v11

    invoke-direct/range {p0 .. p1}, Lnt0/a;->l0(Llt0/b;)[S

    move-result-object v12

    invoke-direct/range {p0 .. p1}, Lnt0/a;->m0(Llt0/b;)[S

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v14}, Lnt0/i;-><init>(Llt0/c$a;JJB[S[S[S[S[S[SLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
