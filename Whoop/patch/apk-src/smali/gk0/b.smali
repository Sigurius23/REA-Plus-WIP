.class public final Lgk0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzj0/f0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgk0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u001f\u0008\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000c\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lgk0/b;",
        "Lzj0/f0;",
        "Lkotlin/Function1;",
        "",
        "Llt0/a;",
        "commandNumberLookup",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Ljava/nio/ByteBuffer;",
        "payload",
        "a",
        "(Ljava/nio/ByteBuffer;)Llt0/a;",
        "d",
        "(Ljava/nio/ByteBuffer;)B",
        "Lwj0/b;",
        "b",
        "(Ljava/nio/ByteBuffer;)Lwj0/b;",
        "",
        "c",
        "()I",
        "Lkotlin/jvm/functions/Function1;",
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
.field public static final c:Lgk0/b$a;

.field private static final d:Lgk0/b;

.field private static final e:Lgk0/b;


# instance fields
.field private final b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lgk0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lgk0/b;->c:Lgk0/b$a;

    new-instance v0, Lgk0/b;

    new-instance v1, Lf0/q1;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lf0/q1;-><init>(I)V

    invoke-direct {v0, v1}, Lgk0/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lgk0/b;->d:Lgk0/b;

    new-instance v0, Lgk0/b;

    new-instance v1, Lf0/q1;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Lf0/q1;-><init>(I)V

    invoke-direct {v0, v1}, Lgk0/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v0, Lgk0/b;->e:Lgk0/b;

    return-void
.end method

.method private constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgk0/b;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic e(B)Llt0/a;
    .locals 0

    invoke-static {p0}, Lgk0/b;->h(B)Llt0/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(B)Llt0/a;
    .locals 0

    invoke-static {p0}, Lgk0/b;->g(B)Llt0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(B)Llt0/a;
    .locals 1

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    invoke-virtual {v0, p0}, Llt0/a$a;->a(B)Llt0/l;

    move-result-object p0

    return-object p0
.end method

.method private static final h(B)Llt0/a;
    .locals 1

    sget-object v0, Llt0/a;->k:Llt0/a$a;

    invoke-virtual {v0, p0}, Llt0/a$a;->b(B)Llt0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i()Lgk0/b;
    .locals 1

    sget-object v0, Lgk0/b;->e:Lgk0/b;

    return-object v0
.end method

.method public static final synthetic j()Lgk0/b;
    .locals 1

    sget-object v0, Lgk0/b;->d:Lgk0/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;)Llt0/a;
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lgk0/b;->b:Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llt0/a;

    return-object p1
.end method

.method public b(Ljava/nio/ByteBuffer;)Lwj0/b;
    .locals 2

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwj0/b;->Companion:Lwj0/b$a;

    const/4 v1, 0x4

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    invoke-virtual {v0, p1}, Lwj0/b$a;->a(B)Lwj0/b;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public d(Ljava/nio/ByteBuffer;)B
    .locals 1

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get(I)B

    move-result p1

    return p1
.end method
