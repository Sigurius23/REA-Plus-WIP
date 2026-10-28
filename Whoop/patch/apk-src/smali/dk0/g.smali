.class public final Ldk0/g;
.super Ldk0/i;
.source "SourceFile"

# interfaces
.implements Ldk0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldk0/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001b\u0010\u000c\u001a\u00020\u00078VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\t\u001a\u0004\u0008\u000e\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Ldk0/g;",
        "Ldk0/i;",
        "Ldk0/e;",
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
        "Loh2/b;",
        "f",
        "d",
        "()Loh2/b;",
        "firmwareVersion",
        "Loh2/e;",
        "g",
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
.field public static final h:Ldk0/g$a;


# instance fields
.field private final e:Ll83/h;

.field private final f:Ll83/h;

.field private final g:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldk0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldk0/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldk0/g;->h:Ldk0/g$a;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ldk0/i;-><init>(Ljava/nio/ByteBuffer;)V

    new-instance p1, Ldk0/f;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Ldk0/f;-><init>(Ldk0/g;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ldk0/g;->e:Ll83/h;

    new-instance p1, Ldk0/f;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Ldk0/f;-><init>(Ldk0/g;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ldk0/g;->f:Ll83/h;

    new-instance p1, Ldk0/f;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v0}, Ldk0/f;-><init>(Ldk0/g;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ldk0/g;->g:Ll83/h;

    return-void
.end method

.method public static synthetic T(Ldk0/g;)Loh2/c;
    .locals 0

    invoke-static {p0}, Ldk0/g;->X(Ldk0/g;)Loh2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Ldk0/g;)Loh2/e;
    .locals 0

    invoke-static {p0}, Ldk0/g;->Y(Ldk0/g;)Loh2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Ldk0/g;)Loh2/b$b;
    .locals 0

    invoke-static {p0}, Ldk0/g;->W(Ldk0/g;)Loh2/b$b;

    move-result-object p0

    return-object p0
.end method

.method private static final W(Ldk0/g;)Loh2/b$b;
    .locals 2

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Loh2/b;->a:Loh2/b$a;

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Loh2/b$a;->a(Ljava/nio/ByteBuffer;)Loh2/b$b;

    move-result-object v0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method private static final X(Ldk0/g;)Loh2/c;
    .locals 2

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    sget-object v0, Loh2/c;->d:Loh2/c$b;

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Loh2/c$b;->b(Ljava/nio/ByteBuffer;)Loh2/c;

    move-result-object v0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method

.method private static final Y(Ldk0/g;)Loh2/e;
    .locals 2

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/16 v1, 0x1c

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {v0}, Loh2/e;->b(Ljava/nio/ByteBuffer;)Loh2/e;

    move-result-object v0

    invoke-virtual {p0}, Ldk0/i;->R()Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-object v0
.end method


# virtual methods
.method public a()Loh2/c;
    .locals 1

    iget-object v0, p0, Ldk0/g;->e:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/c;

    return-object v0
.end method

.method public d()Loh2/b;
    .locals 1

    iget-object v0, p0, Ldk0/g;->f:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loh2/b;

    return-object v0
.end method

.method public f()Loh2/e;
    .locals 2

    iget-object v0, p0, Ldk0/g;->g:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Loh2/e;

    return-object v0
.end method
