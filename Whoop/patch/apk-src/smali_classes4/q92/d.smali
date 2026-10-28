.class public abstract Lq92/d;
.super Llk0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq92/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "Lq92/d;",
        "Llk0/a;",
        "Landroid/os/Handler;",
        "handler",
        "<init>",
        "(Landroid/os/Handler;)V",
        "Lnk0/a$a;",
        "packetRunnable",
        "Ll83/a0;",
        "w",
        "(Lnk0/a$a;)V",
        "Lzj0/h;",
        "commandResponsePacket",
        "f",
        "(Lzj0/h;)V",
        "",
        "E",
        "Ljava/lang/String;",
        "TAG",
        "Loh3/d;",
        "F",
        "Lq92/b;",
        "y",
        "()Loh3/d;",
        "log",
        "G",
        "a",
        "core_release"
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
.field private static final G:Lq92/d$a;

.field static final synthetic H:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field private static final I:[Lnk0/a$a;


# instance fields
.field private final E:Ljava/lang/String;

.field private final F:Lq92/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lq92/d;

    const-string v2, "log"

    const-string v3, "getLog()Ltimber/log/Timber$Tree;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lq92/d;->H:[Lj93/z;

    new-instance v0, Lq92/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lq92/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lq92/d;->G:Lq92/d$a;

    const/16 v0, 0x100

    new-array v0, v0, [Lnk0/a$a;

    sput-object v0, Lq92/d;->I:[Lnk0/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lq92/d;-><init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Llk0/a;-><init>(Landroid/os/Handler;)V

    .line 3
    const-string p1, "SequencedWhoopStrapCommandResponseCallback"

    iput-object p1, p0, Lq92/d;->E:Ljava/lang/String;

    .line 4
    new-instance v0, Lq92/b;

    invoke-direct {v0, p1}, Lq92/b;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lq92/d;->F:Lq92/b;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Handler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lq92/d;-><init>(Landroid/os/Handler;)V

    return-void
.end method

.method public static synthetic t(Lnk0/a$a;B)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lq92/d;->x(Lnk0/a$a;B)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u()Llk0/a$a;
    .locals 1

    sget-object v0, Llk0/a;->z:Llk0/a$a;

    return-object v0
.end method

.method public static final synthetic v()[Lnk0/a$a;
    .locals 1

    sget-object v0, Lq92/d;->I:[Lnk0/a$a;

    return-object v0
.end method

.method private static final x(Lnk0/a$a;B)Ll83/a0;
    .locals 1

    and-int/lit16 p1, p1, 0xff

    sget-object v0, Lq92/d;->I:[Lnk0/a$a;

    aput-object p0, v0, p1

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final y()Loh3/d;
    .locals 3

    iget-object v0, p0, Lq92/d;->F:Lq92/b;

    sget-object v1, Lq92/d;->H:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lq92/b;->a(Ljava/lang/Object;Lj93/z;)Loh3/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lzj0/h;

    invoke-virtual {p0, p1}, Lq92/d;->f(Lzj0/h;)V

    return-void
.end method

.method public f(Lzj0/h;)V
    .locals 2

    const-string v0, "commandResponsePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq92/d;->G:Lq92/d$a;

    invoke-direct {p0}, Lq92/d;->y()Loh3/d;

    move-result-object v1

    invoke-virtual {v0, p0, p1, v1}, Lq92/d$a;->a(Lq92/d;Lzj0/h;Loh3/d;)V

    return-void
.end method

.method public final w(Lnk0/a$a;)V
    .locals 2

    if-eqz p1, :cond_0

    new-instance v0, Lpf/b;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lnk0/a$a;->c(Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method
