.class public final Ltk0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Loj0/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltk0/g$a;,
        Ltk0/g$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 +2\u00020\u0001:\u0002# B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u0010*\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ#\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00170\u000c2\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\r0\'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Ltk0/g;",
        "Loj0/a;",
        "Ltk0/d;",
        "platformScanner",
        "Ltk0/e;",
        "preconditions",
        "Ltr2/n;",
        "logger",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Ltk0/d;Ltk0/e;Ltr2/n;Lbc3/c0;)V",
        "Lec3/l;",
        "Ltk0/g$b;",
        "l",
        "()Lec3/l;",
        "Lcom/whoop/ble/api/scan/ScanFailure;",
        "failure",
        "",
        "k",
        "(Lcom/whoop/ble/api/scan/ScanFailure;)J",
        "Ltk0/f;",
        "report",
        "Lmj0/e;",
        "m",
        "(Ltk0/f;)Lmj0/e;",
        "",
        "n",
        "(Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;",
        "",
        "Lnj0/f;",
        "filter",
        "a",
        "(Ljava/util/Set;)Lec3/l;",
        "Ltk0/d;",
        "b",
        "Ltk0/e;",
        "c",
        "Ltr2/n;",
        "Lec3/t1;",
        "d",
        "Lec3/t1;",
        "shared",
        "e",
        "whoop-ble-transport_release"
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
.field private static final e:Ltk0/g$a;

.field private static final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ltk0/d;

.field private final b:Ltk0/e;

.field private final c:Ltr2/n;

.field private final d:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltk0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltk0/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltk0/g;->e:Ltk0/g$a;

    sget-object v0, Lnj0/f;->a:Lnj0/f$a;

    invoke-virtual {v0}, Lnj0/f$a;->b()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnj0/f;

    invoke-interface {v2}, Lnj0/f;->c()Ljava/util/UUID;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ltk0/g;->f:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ltk0/d;Ltk0/e;Ltr2/n;Lbc3/c0;)V
    .locals 2

    const-string v0, "platformScanner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preconditions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk0/g;->a:Ltk0/d;

    iput-object p2, p0, Ltk0/g;->b:Ltk0/e;

    iput-object p3, p0, Ltk0/g;->c:Ltr2/n;

    new-instance p1, Ltk0/g$e;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Ltk0/g$e;-><init>(Ltk0/g;Lq83/d;)V

    new-instance p2, Lec3/s1;

    invoke-direct {p2, p1}, Lec3/s1;-><init>(Lc93/m;)V

    const-wide/16 v0, 0x1388

    const/4 p1, 0x2

    invoke-static {p1, v0, v1}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p2, p4, p1, p3}, Lec3/v;->L(Lec3/l;Lbc3/c0;Lec3/a2;I)Lec3/q1;

    move-result-object p1

    iput-object p1, p0, Ltk0/g;->d:Lec3/t1;

    return-void
.end method

.method public static final synthetic b()Ltk0/g$a;
    .locals 1

    sget-object v0, Ltk0/g;->e:Ltk0/g$a;

    return-object v0
.end method

.method public static final synthetic c(Ltk0/g;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltk0/g;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Ltk0/g;)Ltk0/d;
    .locals 0

    iget-object p0, p0, Ltk0/g;->a:Ltk0/d;

    return-object p0
.end method

.method public static final synthetic e(Ltk0/g;)Ltk0/e;
    .locals 0

    iget-object p0, p0, Ltk0/g;->b:Ltk0/e;

    return-object p0
.end method

.method public static final synthetic f()Ljava/util/Set;
    .locals 1

    sget-object v0, Ltk0/g;->f:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic g(Ltk0/g;Lcom/whoop/ble/api/scan/ScanFailure;)J
    .locals 0

    invoke-direct {p0, p1}, Ltk0/g;->k(Lcom/whoop/ble/api/scan/ScanFailure;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic h(Ltk0/g;)Lec3/l;
    .locals 0

    invoke-direct {p0}, Ltk0/g;->l()Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Ltk0/g;Ltk0/f;)Lmj0/e;
    .locals 0

    invoke-direct {p0, p1}, Ltk0/g;->m(Ltk0/f;)Lmj0/e;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Ltk0/g;Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;
    .locals 0

    invoke-direct {p0, p1}, Ltk0/g;->n(Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;

    move-result-object p0

    return-object p0
.end method

.method private final k(Lcom/whoop/ble/api/scan/ScanFailure;)J
    .locals 2

    instance-of p1, p1, Lcom/whoop/ble/api/scan/ScanFailure$Rejected;

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x7530

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x1b58

    return-wide v0
.end method

.method private final l()Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ltk0/g$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ltk0/g$d;-><init>(Ltk0/g;Lq83/d;)V

    new-instance v1, Lec3/s1;

    invoke-direct {v1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object v1
.end method

.method private final m(Ltk0/f;)Lmj0/e;
    .locals 10

    invoke-virtual {p1}, Ltk0/f;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    sget-object v1, Lnj0/f;->a:Lnj0/f$a;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/UUID;

    invoke-virtual {v1, v2}, Lnj0/f$a;->a(Ljava/util/UUID;)Lnj0/f;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_1
    move-object v8, v3

    :goto_0
    if-nez v8, :cond_2

    return-object v3

    :cond_2
    new-instance v4, Lmj0/e;

    invoke-virtual {p1}, Ltk0/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lmj0/f;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ltk0/f;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    const-string v0, ""

    :cond_3
    move-object v6, v0

    invoke-virtual {p1}, Ltk0/f;->c()I

    move-result v7

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v9}, Lmj0/e;-><init>(Ljava/lang/String;Ljava/lang/String;ILnj0/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private final n(Ljava/lang/Throwable;)Lcom/whoop/ble/api/scan/ScanFailure;
    .locals 1

    instance-of v0, p1, Lcom/whoop/ble/api/scan/ScanFailure;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/ble/api/scan/ScanFailure;

    return-object p1

    :cond_0
    instance-of v0, p1, Ljava/lang/SecurityException;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;->w:Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;

    return-object p1

    :cond_1
    new-instance v0, Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;

    invoke-direct {v0, p1}, Lcom/whoop/ble/api/scan/ScanFailure$Unexpected;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Set;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Lnj0/f;",
            ">;)",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltk0/g;->d:Lec3/t1;

    new-instance v1, Ltk0/g$c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, p1}, Ltk0/g$c;-><init>(Lec3/l;Lq83/d;Ljava/util/Set;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v1}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method
