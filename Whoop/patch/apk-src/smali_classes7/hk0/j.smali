.class public final Lhk0/j;
.super Lhk0/m;
.source "SourceFile"

# interfaces
.implements Ldk0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001\u0013B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0012\u001a\u0004\u0008\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006\'"
    }
    d2 = {
        "Lhk0/j;",
        "Lhk0/m;",
        "Ldk0/e;",
        "Ljava/nio/ByteBuffer;",
        "buffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "",
        "d0",
        "()Z",
        "Lhk0/n;",
        "g",
        "Lhk0/n;",
        "b0",
        "()Lhk0/n;",
        "subtype",
        "Loh2/c;",
        "h",
        "Ll83/h;",
        "a",
        "()Loh2/c;",
        "hardwareVersion",
        "Loh2/b;",
        "i",
        "d",
        "()Loh2/b;",
        "firmwareVersion",
        "Loh2/e;",
        "j",
        "f",
        "()Loh2/e;",
        "sigProcVersion",
        "",
        "k",
        "Ljava/lang/String;",
        "K",
        "()Ljava/lang/String;",
        "packetName",
        "l",
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

.annotation runtime Ll83/c;
.end annotation


# static fields
.field public static final l:Lhk0/j$a;


# instance fields
.field private final g:Lhk0/n;

.field private final h:Ll83/h;

.field private final i:Ll83/h;

.field private final j:Ll83/h;

.field private final k:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhk0/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/j;->l:Lhk0/j$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lhk0/m;-><init>(Ljava/nio/ByteBuffer;)V

    sget-object p1, Lhk0/n;->HISTORY_START:Lhk0/n;

    iput-object p1, p0, Lhk0/j;->g:Lhk0/n;

    new-instance p1, Lhk0/i;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lhk0/i;-><init>(Lhk0/j;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lhk0/j;->h:Ll83/h;

    new-instance p1, Lhb1/l;

    const/16 v0, 0xb

    invoke-direct {p1, v0}, Lhb1/l;-><init>(I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lhk0/j;->i:Ll83/h;

    new-instance p1, Lhk0/i;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lhk0/i;-><init>(Lhk0/j;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lhk0/j;->j:Ll83/h;

    const-string p1, "Rev2HistoryStartMetadataPacket"

    iput-object p1, p0, Lhk0/j;->k:Ljava/lang/String;

    return-void
.end method

.method public static synthetic e0(Lhk0/j;)Loh2/c;
    .locals 0

    invoke-static {p0}, Lhk0/j;->i0(Lhk0/j;)Loh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lhk0/j;)Loh2/e;
    .locals 0

    invoke-static {p0}, Lhk0/j;->j0(Lhk0/j;)Loh2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0()Loh2/b$b;
    .locals 1

    invoke-static {}, Lhk0/j;->h0()Loh2/b$b;

    move-result-object v0

    return-object v0
.end method

.method private static final h0()Loh2/b$b;
    .locals 9

    new-instance v0, Loh2/b$b;

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v8}, Loh2/b$b;-><init>(JJJJ)V

    return-object v0
.end method

.method private static final i0(Lhk0/j;)Loh2/c;
    .locals 2

    sget-object v0, Loh2/c;->d:Loh2/c$b;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lhk0/m;->Z(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {v0, p0}, Loh2/c$b;->b(Ljava/nio/ByteBuffer;)Loh2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lhk0/j;)Loh2/e;
    .locals 1

    const/16 v0, 0x1c

    invoke-virtual {p0, v0}, Lhk0/m;->Z(I)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0}, Loh2/e;->b(Ljava/nio/ByteBuffer;)Loh2/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhk0/j;->k:Ljava/lang/String;

    return-object v0
.end method

.method public a()Loh2/c;
    .locals 1

    iget-object v0, p0, Lhk0/j;->h:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/c;

    return-object v0
.end method

.method public b0()Lhk0/n;
    .locals 1

    iget-object v0, p0, Lhk0/j;->g:Lhk0/n;

    return-object v0
.end method

.method public d()Loh2/b;
    .locals 1

    iget-object v0, p0, Lhk0/j;->i:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/b;

    return-object v0
.end method

.method public d0()Z
    .locals 2

    invoke-virtual {p0}, Llt0/c;->M()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    const/16 v1, 0x34

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Loh2/e;
    .locals 2

    iget-object v0, p0, Lhk0/j;->j:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Loh2/e;

    return-object v0
.end method
