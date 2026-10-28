.class public final Lug1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lug1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lug1/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u001dB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001fR\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010!R\u0014\u0010%\u001a\u00020\u00138VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lug1/h;",
        "Lug1/g;",
        "Lbc3/z;",
        "dispatcher",
        "<init>",
        "(Lbc3/z;)V",
        "Ljava/io/InputStream;",
        "inputStream",
        "",
        "useFileLength",
        "Ll83/a0;",
        "l",
        "(Ljava/io/InputStream;Z)V",
        "Ljava/io/File;",
        "file",
        "b",
        "(Ljava/io/File;ZLq83/d;)Ljava/lang/Object;",
        "Ljava/nio/ByteBuffer;",
        "destBuffer",
        "",
        "destOffset",
        "byteCount",
        "e",
        "(Ljava/nio/ByteBuffer;IILq83/d;)Ljava/lang/Object;",
        "c",
        "(Lq83/d;)Ljava/lang/Object;",
        "position",
        "d",
        "(ILq83/d;)Ljava/lang/Object;",
        "a",
        "Lbc3/z;",
        "Ljava/io/InputStream;",
        "fileInputStream",
        "I",
        "imageLength",
        "getLength",
        "()I",
        "length",
        "firmware-update-service_release"
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
.field public static final e:Lug1/h$a;


# instance fields
.field private final a:Lbc3/z;

.field private b:Ljava/io/InputStream;

.field private c:Ljava/io/InputStream;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lug1/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lug1/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lug1/h;->e:Lug1/h$a;

    return-void
.end method

.method public constructor <init>(Lbc3/z;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lug1/h;->a:Lbc3/z;

    return-void
.end method

.method public constructor <init>(Lbc3/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, Lbc3/q0;->a:Lkc3/e;

    .line 3
    sget-object p1, Lkc3/d;->w:Lkc3/d;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lug1/h;-><init>(Lbc3/z;)V

    return-void
.end method

.method public static final synthetic f(Lug1/h;)Ljava/io/InputStream;
    .locals 0

    iget-object p0, p0, Lug1/h;->c:Ljava/io/InputStream;

    return-object p0
.end method

.method public static final synthetic g(Lug1/h;)I
    .locals 0

    iget p0, p0, Lug1/h;->d:I

    return p0
.end method

.method public static final synthetic h(Lug1/h;)Ljava/io/InputStream;
    .locals 0

    iget-object p0, p0, Lug1/h;->b:Ljava/io/InputStream;

    return-object p0
.end method

.method public static final synthetic i(Lug1/h;Ljava/io/InputStream;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lug1/h;->l(Ljava/io/InputStream;Z)V

    return-void
.end method

.method public static final synthetic j(Lug1/h;Ljava/io/InputStream;)V
    .locals 0

    iput-object p1, p0, Lug1/h;->c:Ljava/io/InputStream;

    return-void
.end method

.method public static final synthetic k(Lug1/h;Ljava/io/InputStream;)V
    .locals 0

    iput-object p1, p0, Lug1/h;->b:Ljava/io/InputStream;

    return-void
.end method

.method private final l(Ljava/io/InputStream;Z)V
    .locals 3

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result p1

    iput p1, p0, Lug1/h;->d:I

    return-void

    :cond_0
    const/16 p2, 0x200

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2, p2}, Ljava/io/InputStream;->read([BII)I

    const/4 p1, 0x4

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    iput p1, p0, Lug1/h;->d:I

    return-void
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lug1/h$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lug1/h$e;-><init>(Lug1/h;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/io/File;ZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lug1/h;->a:Lbc3/z;

    new-instance v1, Lug1/h$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lug1/h$c;-><init>(Lug1/h;Ljava/io/File;ZLq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public c(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lug1/h$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lug1/h$b;-><init>(Lug1/h;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lug1/h$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lug1/h$f;-><init>(Lug1/h;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public e(Ljava/nio/ByteBuffer;IILq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/ByteBuffer;",
            "II",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lug1/h;->b:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lug1/h$d;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v1 .. v6}, Lug1/h$d;-><init>(Lug1/h;Ljava/nio/ByteBuffer;IILq83/d;)V

    invoke-static {v0, v1, p4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Use open() to initialise input stream"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getLength()I
    .locals 1

    iget v0, p0, Lug1/h;->d:I

    add-int/lit16 v0, v0, 0x200

    return v0
.end method
