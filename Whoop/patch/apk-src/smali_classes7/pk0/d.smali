.class public final Lpk0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpk0/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lpk0/d;",
        "",
        "<init>",
        "()V",
        "Lhk0/b;",
        "header",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "Lck0/a;",
        "b",
        "(Lhk0/b;Ljava/nio/ByteBuffer;)Lck0/a;",
        "a",
        "(Ljava/nio/ByteBuffer;)Lck0/a;",
        "Lhk0/m;",
        "d",
        "(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/m;",
        "f",
        "(Ljava/nio/ByteBuffer;)Lhk0/m;",
        "c",
        "(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;",
        "g",
        "e",
        "Lmt0/b;",
        "framedPacket",
        "Llt0/c;",
        "h",
        "(Lmt0/b;)Llt0/c;",
        "Ltr2/n;",
        "Ltr2/n;",
        "logger",
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
.field public static final a:Lpk0/d;

.field private static final b:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpk0/d;

    invoke-direct {v0}, Lpk0/d;-><init>()V

    sput-object v0, Lpk0/d;->a:Lpk0/d;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "Rev2PacketFactory"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Lpk0/d;->b:Ltr2/n;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/nio/ByteBuffer;)Lck0/a;
    .locals 2

    sget-object v0, Luk0/b;->a:Luk0/b;

    const/16 v1, 0x14

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result v1

    invoke-virtual {v0, v1}, Luk0/b;->e(S)I

    move-result v0

    sget-object v1, Llt0/e;->GET_HELLO:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_0

    new-instance v0, Lzj0/k0;

    invoke-direct {v0, p1}, Lzj0/k0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    sget-object v1, Llt0/e;->GET_CLOCK:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_1

    new-instance v0, Lzj0/h0;

    invoke-direct {v0, p1}, Lzj0/h0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_1
    sget-object v1, Llt0/e;->SET_CLOCK:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_2

    new-instance v0, Lzj0/o0;

    invoke-direct {v0, p1}, Lzj0/o0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_2
    sget-object v1, Llt0/e;->SEND_HISTORICAL_DATA:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_3

    new-instance v0, Lzj0/n0;

    invoke-direct {v0, p1}, Lzj0/n0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_3
    sget-object v1, Llt0/e;->HISTORICAL_DATA_RESULT:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_4

    new-instance v0, Lzj0/l0;

    invoke-direct {v0, p1}, Lzj0/l0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_4
    sget-object v1, Llt0/e;->ABORT_HISTORICAL_TRANSMITS:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_5

    new-instance v0, Lzj0/m0;

    invoke-direct {v0, p1}, Lzj0/m0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_5
    sget-object v1, Llt0/e;->GET_DATA_RANGE:Llt0/e;

    invoke-virtual {v1}, Llt0/e;->getValue()I

    move-result v1

    if-ne v0, v1, :cond_6

    new-instance v0, Lzj0/i0;

    invoke-direct {v0, p1}, Lzj0/i0;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_6
    new-instance v0, Lck0/a;

    invoke-direct {v0, p1}, Lck0/a;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method private final b(Lhk0/b;Ljava/nio/ByteBuffer;)Lck0/a;
    .locals 2

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    sget-object p1, Lpk0/d;->b:Ltr2/n;

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p2

    const-string v0, "Rev 2 command response truncated: "

    const-string v1, " bytes, need 32"

    invoke-static {p2, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lhk0/b;->V()Lhk0/p;

    move-result-object p1

    sget-object v0, Lpk0/d$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-direct {p0, p2}, Lpk0/d;->a(Ljava/nio/ByteBuffer;)Lck0/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lck0/a;

    invoke-direct {p1, p2}, Lck0/a;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1
.end method

.method private final c(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;
    .locals 2

    invoke-virtual {p1}, Lhk0/b;->V()Lhk0/p;

    move-result-object v0

    sget-object v1, Lpk0/d$a;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_3

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Lhk0/r;

    invoke-direct {p1, p2}, Lhk0/r;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1

    :cond_1
    new-instance p1, Lhk0/e;

    invoke-direct {p1, p2}, Lhk0/e;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1

    :cond_2
    new-instance p1, Lhk0/f;

    invoke-direct {p1, p2}, Lhk0/f;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1

    :cond_3
    new-instance p1, Lhk0/c;

    invoke-direct {p1, p2}, Lhk0/c;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1

    :cond_4
    new-instance p1, Lhk0/q;

    invoke-direct {p1, p2}, Lhk0/q;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1
.end method

.method private final d(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/m;
    .locals 1

    invoke-virtual {p1}, Lhk0/b;->V()Lhk0/p;

    move-result-object p1

    sget-object v0, Lpk0/d$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    invoke-direct {p0, p2}, Lpk0/d;->f(Ljava/nio/ByteBuffer;)Lhk0/m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lhk0/t;

    invoke-direct {p1, p2}, Lhk0/t;-><init>(Ljava/nio/ByteBuffer;)V

    return-object p1
.end method

.method private final e(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;
    .locals 0

    invoke-virtual {p1}, Lhk0/b;->V()Lhk0/p;

    return-object p1
.end method

.method private final f(Ljava/nio/ByteBuffer;)Lhk0/m;
    .locals 7

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const-string v1, " bytes"

    const/4 v2, 0x0

    const/16 v3, 0x14

    if-gt v0, v3, :cond_0

    sget-object v0, Lpk0/d;->b:Ltr2/n;

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v3

    const-string v4, "Rev 2 metadata packet has no subtype byte: "

    invoke-static {v3, v4, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lhk0/t;

    invoke-direct {v0, p1}, Lhk0/t;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_0
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    sget-object v3, Lhk0/n;->Companion:Lhk0/n$a;

    invoke-virtual {v3, v0}, Lhk0/n$a;->a(I)Lhk0/n;

    move-result-object v3

    sget-object v4, Lpk0/d$a;->c:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-eq v3, v4, :cond_3

    const/4 v4, 0x4

    if-eq v3, v4, :cond_2

    const/4 v1, 0x5

    if-ne v3, v1, :cond_1

    sget-object v1, Lpk0/d;->b:Ltr2/n;

    const-string v3, "Unrecognized Rev 2 metadata subtype: "

    invoke-static {v0, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lhk0/t;

    invoke-direct {v0, p1}, Lhk0/t;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    new-instance v0, Lhk0/g;

    invoke-direct {v0, p1}, Lhk0/g;-><init>(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_3
    new-instance v0, Lhk0/h;

    invoke-direct {v0, p1}, Lhk0/h;-><init>(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_4
    new-instance v0, Lhk0/l;

    invoke-direct {v0, p1}, Lhk0/l;-><init>(Ljava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_5
    new-instance v0, Lhk0/j;

    invoke-direct {v0, p1}, Lhk0/j;-><init>(Ljava/nio/ByteBuffer;)V

    :goto_0
    invoke-virtual {v0}, Lhk0/m;->d0()Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lpk0/d;->b:Ltr2/n;

    invoke-virtual {v0}, Lhk0/m;->b0()Lhk0/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Rev 2 "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " metadata truncated: "

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v3, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lhk0/t;

    invoke-direct {v0, p1}, Lhk0/t;-><init>(Ljava/nio/ByteBuffer;)V

    :cond_6
    return-object v0
.end method

.method private final g(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;
    .locals 0

    invoke-virtual {p1}, Lhk0/b;->V()Lhk0/p;

    return-object p1
.end method


# virtual methods
.method public final h(Lmt0/b;)Llt0/c;
    .locals 3

    const-string v0, "framedPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmt0/b;->c()Ljava/nio/ByteBuffer;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lhk0/u;

    invoke-direct {v0, p1}, Lhk0/u;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {v0}, Lhk0/b;->S()Lhk0/o;

    move-result-object v1

    sget-object v2, Lpk0/d$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    return-object v0

    :pswitch_1
    invoke-direct {p0, v0, p1}, Lpk0/d;->e(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-direct {p0, v0, p1}, Lpk0/d;->g(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-direct {p0, v0, p1}, Lpk0/d;->c(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/b;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-direct {p0, v0, p1}, Lpk0/d;->d(Lhk0/b;Ljava/nio/ByteBuffer;)Lhk0/m;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-direct {p0, v0, p1}, Lpk0/d;->b(Lhk0/b;Ljava/nio/ByteBuffer;)Lck0/a;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
