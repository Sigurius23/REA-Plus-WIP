.class public final Lfk0/f;
.super Lfk0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfk0/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000c8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0008\u001a\u0004\u0008\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0008\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Lfk0/f;",
        "Lfk0/g;",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Loh2/c;",
        "e",
        "Ll83/h;",
        "a",
        "()Loh2/c;",
        "hardwareVersion",
        "Loh2/b$b;",
        "f",
        "V",
        "()Loh2/b$b;",
        "firmwareVersion",
        "Loh2/e;",
        "g",
        "getSigProcVersion",
        "()Loh2/e;",
        "sigProcVersion",
        "h",
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
.field public static final h:Lfk0/f$a;


# instance fields
.field private final e:Ll83/h;

.field private final f:Ll83/h;

.field private final g:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfk0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfk0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfk0/f;->h:Lfk0/f$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lfk0/g;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance p1, Lfk0/e;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lfk0/e;-><init>(Lfk0/f;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lfk0/f;->e:Ll83/h;

    new-instance p1, Lfk0/e;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lfk0/e;-><init>(Lfk0/f;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lfk0/f;->f:Ll83/h;

    new-instance p1, Lfk0/e;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Lfk0/e;-><init>(Lfk0/f;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lfk0/f;->g:Ll83/h;

    return-void
.end method

.method public static synthetic R(Lfk0/f;)Loh2/b$b;
    .locals 0

    invoke-static {p0}, Lfk0/f;->U(Lfk0/f;)Loh2/b$b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S(Lfk0/f;)Loh2/c;
    .locals 0

    invoke-static {p0}, Lfk0/f;->W(Lfk0/f;)Loh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lfk0/f;)Loh2/e;
    .locals 0

    invoke-static {p0}, Lfk0/f;->X(Lfk0/f;)Loh2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final U(Lfk0/f;)Loh2/b$b;
    .locals 2

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Loh2/b;->a:Loh2/b$a;

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Loh2/b$a;->a(Ljava/nio/ByteBuffer;)Loh2/b$b;

    move-result-object v0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method private static final W(Lfk0/f;)Loh2/c;
    .locals 2

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Loh2/c;->d:Loh2/c$b;

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Loh2/c$b;->b(Ljava/nio/ByteBuffer;)Loh2/c;

    move-result-object v0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method private static final X(Lfk0/f;)Loh2/e;
    .locals 2

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v1, 0x1c

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Loh2/e;->b(Ljava/nio/ByteBuffer;)Loh2/e;

    move-result-object v0

    invoke-virtual {p0}, Lfk0/g;->Q()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method


# virtual methods
.method public final V()Loh2/b$b;
    .locals 1

    iget-object v0, p0, Lfk0/f;->f:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/b$b;

    return-object v0
.end method

.method public final a()Loh2/c;
    .locals 1

    iget-object v0, p0, Lfk0/f;->e:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/c;

    return-object v0
.end method
