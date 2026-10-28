.class public final Lkk0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkk0/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 !2\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0013\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\r\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0003R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\u000c\u0012\n \u001a*\u0004\u0018\u00010\u00000\u00000\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00000\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u001fR\u0011\u0010#\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lkk0/b;",
        "",
        "<init>",
        "()V",
        "",
        "status",
        "Ll83/a0;",
        "l",
        "(B)V",
        "chargeStatus",
        "c",
        "(Lkk0/b;)V",
        "Lxg3/g;",
        "f",
        "()Lxg3/g;",
        "",
        "g",
        "Lec3/l;",
        "e",
        "()Lec3/l;",
        "k",
        "j",
        "a",
        "B",
        "chargePackStatus",
        "Lze1/d;",
        "kotlin.jvm.PlatformType",
        "b",
        "Lze1/d;",
        "changedObservable",
        "Lec3/o1;",
        "Lec3/o1;",
        "strapChargeStatusFlow",
        "d",
        "()Z",
        "isCharging",
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
.field public static final d:Lkk0/b$a;


# instance fields
.field private a:B

.field private final b:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "Lkk0/b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkk0/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkk0/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkk0/b;->d:Lkk0/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    const-string v1, "createSingle(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lkk0/b;->b:Lze1/d;

    sget-object v0, Ldc3/a;->x:Ldc3/a;

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v2, v3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lkk0/b;->c:Lec3/o1;

    return-void
.end method

.method public static synthetic a(Lkk0/b;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lkk0/b;->h(Lkk0/b;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkf0/d;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lkk0/b;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkk0/b;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "obj"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkk0/b;->d()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final c(Lkk0/b;)V
    .locals 1

    const-string v0, "chargeStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-byte p1, p1, Lkk0/b;->a:B

    invoke-virtual {p0, p1}, Lkk0/b;->l(B)V

    return-void
.end method

.method public final d()Z
    .locals 2

    iget-byte v0, p0, Lkk0/b;->a:B

    const/4 v1, 0x1

    and-int/2addr v0, v1

    int-to-byte v0, v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lkk0/b;->c:Lec3/o1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    new-instance v1, Lkk0/b$b;

    invoke-direct {v1, v0}, Lkk0/b$b;-><init>(Lec3/l;)V

    return-object v1
.end method

.method public final f()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lkk0/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkk0/b;->b:Lze1/d;

    return-object v0
.end method

.method public final g()Lxg3/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkk0/b;->b:Lze1/d;

    new-instance v1, Lkf0/d;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Lkf0/d;-><init>(I)V

    new-instance v2, Lhn/p;

    const/16 v3, 0x17

    invoke-direct {v2, v1, v3}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->x(Lbh3/g;)Lxg3/g;

    move-result-object v0

    const-string v1, "map(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final j()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lkk0/b;->l(B)V

    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lkk0/b;->l(B)V

    return-void
.end method

.method public final l(B)V
    .locals 0

    iput-byte p1, p0, Lkk0/b;->a:B

    iget-object p1, p0, Lkk0/b;->b:Lze1/d;

    invoke-virtual {p1, p0}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lkk0/b;->c:Lec3/o1;

    invoke-interface {p1, p0}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method
