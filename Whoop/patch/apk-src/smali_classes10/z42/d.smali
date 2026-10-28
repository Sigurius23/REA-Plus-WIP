.class public final Lz42/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lys0/a$b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B+\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u0012\u0010\u001bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lz42/d;",
        "Lys0/a$b;",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "coroutineScope",
        "Lq83/j;",
        "limitedParallelismContext",
        "Lus0/a;",
        "backgroundUsageAggregator",
        "<init>",
        "(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;)V",
        "",
        "data",
        "Ll83/a0;",
        "a",
        "([B)V",
        "Ltr2/n;",
        "b",
        "Lbc3/c0;",
        "c",
        "Lq83/j;",
        "d",
        "Lus0/a;",
        "Lec3/o1;",
        "e",
        "Lec3/o1;",
        "()Lec3/o1;",
        "puffinMemfaultResponseFlow",
        "",
        "f",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "puffin_release"
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
.field private final a:Ltr2/n;

.field private final b:Lbc3/c0;

.field private final c:Lq83/j;

.field private final d:Lus0/a;

.field private final e:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "limitedParallelismContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundUsageAggregator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lz42/d;->a:Ltr2/n;

    .line 3
    iput-object p2, p0, Lz42/d;->b:Lbc3/c0;

    .line 4
    iput-object p3, p0, Lz42/d;->c:Lq83/j;

    .line 5
    iput-object p4, p0, Lz42/d;->d:Lus0/a;

    .line 6
    sget-object p1, Ldc3/a;->x:Ldc3/a;

    const/4 p2, 0x2

    const/16 p3, 0x64

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lz42/d;->e:Lec3/o1;

    .line 7
    const-string p1, "memfaultCharacteristicNotifCallback"

    iput-object p1, p0, Lz42/d;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 8
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "PuffinMemfaultCharacteristicCallback"

    invoke-virtual {p1, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 9
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    const/4 p5, 0x2

    const/4 p6, 0x1

    const/4 v0, 0x0

    .line 10
    invoke-static {p3, p6, v0, p5, v0}, Lbc3/z;->limitedParallelism$default(Lbc3/z;ILjava/lang/String;ILjava/lang/Object;)Lbc3/z;

    move-result-object p3

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lz42/d;-><init>(Ltr2/n;Lbc3/c0;Lq83/j;Lus0/a;)V

    return-void
.end method


# virtual methods
.method public a([B)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz42/d;->d:Lus0/a;

    sget-object v1, Lus0/b;->PUFFIN_PACKET_RECEIVED:Lus0/b;

    invoke-interface {v0, v1}, Lus0/a;->m(Lus0/b;)V

    iget-object v0, p0, Lz42/d;->a:Ltr2/n;

    invoke-static {p1}, Lze1/b;->c([B)Ljava/lang/String;

    move-result-object v1

    const-string v2, "memfaultCharacteristicNotifCallback = "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lz42/d;->b:Lbc3/c0;

    iget-object v1, p0, Lz42/d;->c:Lq83/j;

    new-instance v2, Lz42/d$a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lz42/d$a;-><init>(Lz42/d;[BLq83/d;)V

    const/4 p1, 0x2

    invoke-static {v0, v1, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final b()Lec3/o1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/o1;"
        }
    .end annotation

    iget-object v0, p0, Lz42/d;->e:Lec3/o1;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lz42/d;->f:Ljava/lang/String;

    return-object v0
.end method
