.class public final Loh2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lof3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Loh2/b$a;",
        "Lof3/a;",
        "<init>",
        "()V",
        "Ljava/nio/ByteBuffer;",
        "",
        "d",
        "(Ljava/nio/ByteBuffer;)J",
        "",
        "raw",
        "Loh2/b;",
        "b",
        "(Ljava/lang/String;)Loh2/b;",
        "buffer",
        "Loh2/b$b;",
        "a",
        "(Ljava/nio/ByteBuffer;)Loh2/b$b;",
        "Lnh2/a;",
        "x",
        "Ll83/h;",
        "c",
        "()Lnh2/a;",
        "firmwareVersionAnalytics",
        "connectivity-data-packets-model_release"
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
.field static final synthetic w:Loh2/b$a;

.field private static final x:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Loh2/b$a;

    invoke-direct {v0}, Loh2/b$a;-><init>()V

    sput-object v0, Loh2/b$a;->w:Loh2/b$a;

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Loh2/b$a$a;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3, v3}, Loh2/b$a$a;-><init>(Lof3/a;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    sput-object v0, Loh2/b$a;->x:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c()Lnh2/a;
    .locals 1

    sget-object v0, Loh2/b$a;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnh2/a;

    return-object v0
.end method

.method private final d(Ljava/nio/ByteBuffer;)J
    .locals 4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p1

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Loh2/b$b;
    .locals 10

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance v0, Loh2/b$b;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Loh2/b$a;->d(Ljava/nio/ByteBuffer;)J

    move-result-wide v1

    invoke-direct {p0, p1}, Loh2/b$a;->d(Ljava/nio/ByteBuffer;)J

    move-result-wide v3

    invoke-direct {p0, p1}, Loh2/b$a;->d(Ljava/nio/ByteBuffer;)J

    move-result-wide v5

    invoke-direct {p0, p1}, Loh2/b$a;->d(Ljava/nio/ByteBuffer;)J

    move-result-wide v7

    invoke-direct/range {v0 .. v8}, Loh2/b$b;-><init>(JJJJ)V
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-direct {p0}, Loh2/b$a;->c()Lnh2/a;

    move-result-object p1

    sget-object v0, Loh2/b$c;->PARSING_ERROR:Loh2/b$c;

    invoke-interface {p1, v0}, Lnh2/a;->a(Loh2/b$c;)V

    new-instance v1, Loh2/b$b;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    invoke-direct/range {v1 .. v9}, Loh2/b$b;-><init>(JJJJ)V

    return-object v1
.end method

.method public final b(Ljava/lang/String;)Loh2/b;
    .locals 2

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Loh2/b$a;->c()Lnh2/a;

    move-result-object p1

    sget-object v0, Loh2/b$c;->EMPTY:Loh2/b$c;

    invoke-interface {p1, v0}, Lnh2/a;->a(Loh2/b$c;)V

    new-instance p1, Loh2/b$e;

    const-string v1, "0.0.0.0"

    invoke-direct {p1, v1, v0}, Loh2/b$e;-><init>(Ljava/lang/String;Loh2/b$c;)V

    return-object p1

    :cond_0
    new-instance v0, Loh2/b$d;

    invoke-direct {v0, p1}, Loh2/b$d;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge getKoin()Lnf3/a;
    .locals 1

    invoke-static {p0}, Lts/o;->A(Lof3/a;)Lnf3/a;

    move-result-object v0

    return-object v0
.end method
