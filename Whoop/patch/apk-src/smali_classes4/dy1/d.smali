.class public final Ldy1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldy1/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001/\u0018\u0000 T2\u00020\u0001:\u0001UB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008%\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010)R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010<R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u00120@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u001a\u0010G\u001a\u0008\u0012\u0004\u0012\u0002030D8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010<R$\u0010O\u001a\u00020J2\u0006\u0010K\u001a\u00020J8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008L\u00108\"\u0004\u0008M\u0010NR\u0016\u0010S\u001a\u0004\u0018\u00010P8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010R\u00a8\u0006V"
    }
    d2 = {
        "Ldy1/d;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ldy1/b;",
        "memfaultInitializer",
        "Lbc3/c0;",
        "coroutineScope",
        "Ldw/b;",
        "chunkSenderBuilder",
        "Lju0/a;",
        "memfaultDao",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;)V",
        "Landroidx/lifecycle/g0;",
        "owner",
        "Ll83/a0;",
        "onCreate",
        "(Landroidx/lifecycle/g0;)V",
        "",
        "chunk",
        "y",
        "([BLq83/d;)Ljava/lang/Object;",
        "v",
        "([B)V",
        "z",
        "(Lq83/d;)Ljava/lang/Object;",
        "B",
        "()V",
        "",
        "serialNumber",
        "Ldw/c;",
        "t",
        "(Ljava/lang/String;)Ldw/c;",
        "C",
        "w",
        "Lci2/b;",
        "x",
        "Ldy1/b;",
        "Lbc3/c0;",
        "Ldw/b;",
        "E",
        "Lju0/a;",
        "F",
        "Ltr2/n;",
        "dy1/d$b",
        "G",
        "Ldy1/d$b;",
        "chunkSendCallback",
        "",
        "H",
        "J",
        "debounce",
        "Lmc3/a;",
        "I",
        "Lmc3/a;",
        "mutex",
        "Lbc3/k1;",
        "Lbc3/k1;",
        "memfaultFlowJob",
        "K",
        "connectionStateJob",
        "Lec3/o1;",
        "L",
        "Lec3/o1;",
        "chunksFlow",
        "",
        "M",
        "Ljava/util/List;",
        "processedChunks",
        "N",
        "lastChunkSent",
        "",
        "value",
        "O",
        "A",
        "(I)V",
        "chunksSentRecently",
        "Ljk0/d;",
        "u",
        "()Ljk0/d;",
        "whoopStrap",
        "P",
        "a",
        "memfault_release"
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
.field public static final P:Ldy1/d$a;


# instance fields
.field private final E:Lju0/a;

.field private final F:Ltr2/n;

.field private final G:Ldy1/d$b;

.field private final H:J

.field private final I:Lmc3/a;

.field private J:Lbc3/k1;

.field private K:Lbc3/k1;

.field private final L:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final M:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private N:Lbc3/k1;

.field private O:I

.field private final w:Lci2/b;

.field private final x:Ldy1/b;

.field private final y:Lbc3/c0;

.field private final z:Ldw/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldy1/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldy1/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldy1/d;->P:Ldy1/d$a;

    return-void
.end method

.method public constructor <init>(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memfaultInitializer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chunkSenderBuilder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memfaultDao"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldy1/d;->w:Lci2/b;

    .line 3
    iput-object p2, p0, Ldy1/d;->x:Ldy1/b;

    .line 4
    iput-object p3, p0, Ldy1/d;->y:Lbc3/c0;

    .line 5
    iput-object p4, p0, Ldy1/d;->z:Ldw/b;

    .line 6
    iput-object p5, p0, Ldy1/d;->E:Lju0/a;

    .line 7
    iput-object p6, p0, Ldy1/d;->F:Ltr2/n;

    .line 8
    new-instance p1, Ldy1/d$b;

    invoke-direct {p1, p0}, Ldy1/d$b;-><init>(Ldy1/d;)V

    iput-object p1, p0, Ldy1/d;->G:Ldy1/d$b;

    const-wide/16 p1, 0x1388

    .line 9
    iput-wide p1, p0, Ldy1/d;->H:J

    .line 10
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Ldy1/d;->I:Lmc3/a;

    const/4 p1, 0x7

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 11
    invoke-static {p2, p2, p3, p1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Ldy1/d;->L:Lec3/o1;

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ldy1/d;->M:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    .line 13
    sget-object p3, Lbc3/q0;->a:Lkc3/e;

    .line 14
    sget-object p3, Lkc3/d;->w:Lkc3/d;

    .line 15
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p8

    invoke-virtual {p3, p8}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p3

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p3

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_1

    .line 16
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p6, "NewMemfaultManager"

    invoke-virtual {p3, p6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 17
    invoke-direct/range {v0 .. v6}, Ldy1/d;-><init>(Lci2/b;Ldy1/b;Lbc3/c0;Ldw/b;Lju0/a;Ltr2/n;)V

    return-void
.end method

.method private final A(I)V
    .locals 3

    iput p1, p0, Ldy1/d;->O:I

    iget-object v0, p0, Ldy1/d;->N:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    if-lez p1, :cond_1

    iget-object p1, p0, Ldy1/d;->y:Lbc3/c0;

    new-instance v0, Ldy1/d$c;

    invoke-direct {v0, p0, v1}, Ldy1/d$c;-><init>(Ldy1/d;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Ldy1/d;->N:Lbc3/k1;

    :cond_1
    return-void
.end method

.method private final B()V
    .locals 4

    iget-object v0, p0, Ldy1/d;->J:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Ldy1/d;->y:Lbc3/c0;

    new-instance v2, Ldy1/d$i;

    invoke-direct {v2, p0, v1}, Ldy1/d$i;-><init>(Ldy1/d;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ldy1/d;->J:Lbc3/k1;

    return-void
.end method

.method private final C()V
    .locals 4

    iget-object v0, p0, Ldy1/d;->y:Lbc3/c0;

    new-instance v1, Ldy1/d$j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ldy1/d$j;-><init>(Ldy1/d;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic a(Ldy1/d;)Lec3/o1;
    .locals 0

    iget-object p0, p0, Ldy1/d;->L:Lec3/o1;

    return-object p0
.end method

.method public static final synthetic b(Ldy1/d;)I
    .locals 0

    iget p0, p0, Ldy1/d;->O:I

    return p0
.end method

.method public static final synthetic c(Ldy1/d;)Lbc3/c0;
    .locals 0

    iget-object p0, p0, Ldy1/d;->y:Lbc3/c0;

    return-object p0
.end method

.method public static final synthetic d(Ldy1/d;)J
    .locals 2

    iget-wide v0, p0, Ldy1/d;->H:J

    return-wide v0
.end method

.method public static final synthetic e(Ldy1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ldy1/d;->F:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(Ldy1/d;)Lju0/a;
    .locals 0

    iget-object p0, p0, Ldy1/d;->E:Lju0/a;

    return-object p0
.end method

.method public static final synthetic g(Ldy1/d;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ldy1/d;->M:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic j(Ldy1/d;)Ljk0/d;
    .locals 0

    invoke-direct {p0}, Ldy1/d;->u()Ljk0/d;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Ldy1/d;)Lci2/b;
    .locals 0

    iget-object p0, p0, Ldy1/d;->w:Lci2/b;

    return-object p0
.end method

.method public static final synthetic n(Ldy1/d;)V
    .locals 0

    invoke-direct {p0}, Ldy1/d;->w()V

    return-void
.end method

.method public static final synthetic o(Ldy1/d;[BLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ldy1/d;->y([BLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Ldy1/d;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ldy1/d;->z(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Ldy1/d;I)V
    .locals 0

    invoke-direct {p0, p1}, Ldy1/d;->A(I)V

    return-void
.end method

.method public static final synthetic r(Ldy1/d;)V
    .locals 0

    invoke-direct {p0}, Ldy1/d;->B()V

    return-void
.end method

.method private final t(Ljava/lang/String;)Ldw/c;
    .locals 3

    iget-object v0, p0, Ldy1/d;->x:Ldy1/b;

    invoke-virtual {v0}, Ldy1/b;->a()Ldw/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ldy1/d;->z:Ldw/b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "deviceSerial"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v1, Ldw/b;->b:Ljava/lang/String;

    iput-object v0, v1, Ldw/b;->a:Ldw/e;

    invoke-virtual {v1}, Ldw/b;->a()Ldw/c;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Ldy1/d;->F:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to initialize memfault cloud"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final u()Ljk0/d;
    .locals 1

    iget-object v0, p0, Ldy1/d;->w:Lci2/b;

    invoke-static {v0}, Lih0/d0;->h(Lci2/b;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    return-object v0
.end method

.method private final v([B)V
    .locals 2

    iget-object v0, p0, Ldy1/d;->F:Ltr2/n;

    invoke-static {p1}, Lze1/b;->c([B)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Memfault chunk received - "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final w()V
    .locals 4

    iget-object v0, p0, Ldy1/d;->K:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Ldy1/d;->y:Lbc3/c0;

    new-instance v2, Ldy1/d$d;

    invoke-direct {v2, p0, v1}, Ldy1/d$d;-><init>(Ldy1/d;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Ldy1/d;->K:Lbc3/k1;

    return-void
.end method

.method private final y([BLq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ldy1/d$f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ldy1/d$f;

    iget v1, v0, Ldy1/d$f;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldy1/d$f;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldy1/d$f;

    invoke-direct {v0, p0, p2}, Ldy1/d$f;-><init>(Ldy1/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ldy1/d$f;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldy1/d$f;->I:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Ldy1/d$f;->y:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    check-cast v0, [B

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception p2

    goto/16 :goto_7

    :catch_0
    move-exception p2

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Ldy1/d$f;->F:I

    iget v2, v0, Ldy1/d$f;->E:I

    iget v5, v0, Ldy1/d$f;->z:I

    iget-object v6, v0, Ldy1/d$f;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    iget-object v9, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    check-cast v9, [B

    :try_start_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move p2, p1

    move-object p1, v6

    goto/16 :goto_2

    :catchall_1
    move-exception p2

    move-object p1, v6

    goto/16 :goto_7

    :catch_1
    move-exception p2

    move-object p1, v6

    goto/16 :goto_5

    :cond_3
    iget p1, v0, Ldy1/d$f;->z:I

    iget-object v2, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    iget-object v6, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    check-cast v6, [B

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, v2

    move v2, p1

    move-object p1, v6

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ldy1/d;->I:Lmc3/a;

    iput-object p1, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    iput-object p2, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    iput v7, v0, Ldy1/d$f;->z:I

    iput v6, v0, Ldy1/d$f;->I:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    move v2, v7

    :goto_1
    :try_start_2
    invoke-direct {p0, p1}, Ldy1/d;->v([B)V

    invoke-direct {p0}, Ldy1/d;->u()Ljk0/d;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-interface {v6}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v6, :cond_8

    :try_start_3
    sget-object v9, Lbc3/q0;->a:Lkc3/e;

    sget-object v9, Lkc3/d;->w:Lkc3/d;

    new-instance v10, Ldy1/d$g;

    invoke-direct {v10, p0, v6, p1, v8}, Ldy1/d$g;-><init>(Ldy1/d;Ljava/lang/String;[BLq83/d;)V

    iput-object v8, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    iput-object p2, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    iput-object v8, v0, Ldy1/d$f;->y:Ljava/lang/Object;

    iput v2, v0, Ldy1/d$f;->z:I

    iput v7, v0, Ldy1/d$f;->E:I

    iput v7, v0, Ldy1/d$f;->F:I

    iput v5, v0, Ldy1/d$f;->I:I

    invoke-static {v9, v10, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move-object p1, p2

    move v5, v2

    move p2, v7

    move v2, p2

    :goto_2
    :try_start_4
    iget-object v6, p0, Ldy1/d;->L:Lec3/o1;

    iput-object v8, v0, Ldy1/d$f;->w:Ljava/lang/Object;

    iput-object p1, v0, Ldy1/d$f;->x:Ljava/lang/Object;

    iput-object v8, v0, Ldy1/d$f;->y:Ljava/lang/Object;

    iput v5, v0, Ldy1/d$f;->z:I

    iput v2, v0, Ldy1/d$f;->E:I

    iput p2, v0, Ldy1/d$f;->F:I

    iput v4, v0, Ldy1/d$f;->I:I

    invoke-interface {v6, v3, v0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-ne p2, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    move-object p2, p1

    goto :goto_6

    :catchall_2
    move-exception p1

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    goto :goto_7

    :catch_2
    move-exception p1

    move-object v11, p2

    move-object p2, p1

    move-object p1, v11

    :goto_5
    :try_start_5
    iget-object v0, p0, Ldy1/d;->F:Ltr2/n;

    const-string v1, "Error saving memfault chunk"

    new-array v2, v7, [Lqr2/a$a;

    invoke-interface {v0, v1, p2, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :cond_8
    :goto_6
    invoke-interface {p2, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v3

    :goto_7
    invoke-interface {p1, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method private final z(Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p1, Ldy1/d$h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ldy1/d$h;

    iget v1, v0, Ldy1/d$h;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ldy1/d$h;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Ldy1/d$h;

    invoke-direct {v0, p0, p1}, Ldy1/d$h;-><init>(Ldy1/d;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Ldy1/d$h;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ldy1/d$h;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Ldy1/d$h;->x:Ljava/lang/Object;

    check-cast v1, Ldy1/d;

    iget-object v0, v0, Ldy1/d$h;->w:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Ldy1/d$h;->y:I

    iget-object v4, v0, Ldy1/d$h;->w:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ldy1/d;->I:Lmc3/a;

    iput-object p1, v0, Ldy1/d$h;->w:Ljava/lang/Object;

    iput v5, v0, Ldy1/d$h;->y:I

    iput v4, v0, Ldy1/d$h;->H:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v5

    :goto_1
    :try_start_1
    iget-object v4, p0, Ldy1/d;->E:Lju0/a;

    iput-object p1, v0, Ldy1/d$h;->w:Ljava/lang/Object;

    iput-object v6, v0, Ldy1/d$h;->x:Ljava/lang/Object;

    iput v2, v0, Ldy1/d$h;->y:I

    iput v5, v0, Ldy1/d$h;->z:I

    iput v5, v0, Ldy1/d$h;->E:I

    iput v3, v0, Ldy1/d$h;->H:I

    const/16 v2, 0x64

    invoke-interface {v4, v2, v0}, Lju0/a;->a(ILq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v12, v0

    move-object v0, p1

    move-object p1, v12

    :goto_3
    :try_start_2
    check-cast p1, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v12, v0

    move-object v0, p1

    move-object p1, v12

    :goto_4
    :try_start_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_5
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    iget-object p1, p0, Ldy1/d;->F:Ltr2/n;

    const-string v2, "Error retrieving memfault packets from room"

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {p1, v2, v1, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    :goto_6
    check-cast p1, Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Liu0/a;

    invoke-virtual {v3}, Liu0/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_7

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :catchall_2
    move-exception p1

    goto/16 :goto_c

    :cond_7
    :goto_8
    check-cast v4, Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v3, p0, Ldy1/d;->F:Ltr2/n;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Processing "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " chunks"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v7, v5, [Lqr2/a$a;

    invoke-interface {v3, v4, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, v2}, Ldy1/d;->t(Ljava/lang/String;)Ldw/c;

    move-result-object v2

    if-eqz v2, :cond_b

    iget-object v3, p0, Ldy1/d;->M:Ljava/util/List;

    move-object v4, v1

    check-cast v4, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v4, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Liu0/a;

    invoke-virtual {v9}, Liu0/a;->a()J

    move-result-wide v9

    new-instance v11, Ljava/lang/Long;

    invoke-direct {v11, v9, v10}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_9
    invoke-interface {v3, v7}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liu0/a;

    invoke-virtual {v4}, Liu0/a;->c()[B

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_a
    invoke-virtual {v2, v3}, Ldw/c;->a(Ljava/util/List;)V

    iget-object v1, p0, Ldy1/d;->G:Ldy1/d$b;

    invoke-virtual {v2, v1}, Ldw/c;->b(Ldw/f;)V

    goto/16 :goto_9

    :cond_b
    iget-object v1, p0, Ldy1/d;->F:Ltr2/n;

    const-string v2, "Failed to build chunk sender"

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto/16 :goto_9

    :cond_c
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_c
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public onCreate(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onCreate(Landroidx/lifecycle/g0;)V

    invoke-direct {p0}, Ldy1/d;->C()V

    iget-object p1, p0, Ldy1/d;->y:Lbc3/c0;

    new-instance v0, Ldy1/d$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ldy1/d$e;-><init>(Ldy1/d;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public bridge onDestroy(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onDestroy(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onPause(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onResume(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStart(Landroidx/lifecycle/g0;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/g0;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/lifecycle/DefaultLifecycleObserver;->onStop(Landroidx/lifecycle/g0;)V

    return-void
.end method
