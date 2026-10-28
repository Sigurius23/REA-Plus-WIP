.class public final Lmw0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lmw0/j;",
        "",
        "Lhw0/f;",
        "horizontalHeartZoneBarGraphReducer",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Lhw0/f;Ljb1/a;)V",
        "Ljw0/f;",
        "domainState",
        "Lmw0/i;",
        "c",
        "(Ljw0/f;)Lmw0/i;",
        "a",
        "Lhw0/f;",
        "b",
        "Ljb1/a;",
        "core-details_release"
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
.field private final a:Lhw0/f;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lhw0/f;Ljb1/a;)V
    .locals 1

    const-string v0, "horizontalHeartZoneBarGraphReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmw0/j;->a:Lhw0/f;

    .line 3
    iput-object p2, p0, Lmw0/j;->b:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lhw0/f;Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lmm1/h;

    const/16 p3, 0x1b

    invoke-direct {p2, p3}, Lmm1/h;-><init>(I)V

    invoke-static {p2}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lmw0/j;-><init>(Lhw0/f;Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmw0/j;->b(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Ljw0/f;)Lmw0/i;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljw0/f$a;

    if-eqz v0, :cond_0

    check-cast p1, Ljw0/f$a;

    invoke-static {p1}, Lmw0/k;->a(Ljw0/f$a;)Lmw0/i;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Ljw0/f$c;->a:Ljw0/f$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lmw0/i$d;->a:Lmw0/i$d;

    return-object p1

    :cond_1
    instance-of v0, p1, Ljw0/f$d;

    if-eqz v0, :cond_2

    check-cast p1, Ljw0/f$d;

    iget-object v0, p0, Lmw0/j;->a:Lhw0/f;

    iget-object v1, p0, Lmw0/j;->b:Ljb1/a;

    invoke-static {p1, v0, v1}, Lmw0/k;->j(Ljw0/f$d;Lhw0/f;Ljb1/a;)Lmw0/i$a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljw0/f$b;

    if-eqz v0, :cond_3

    check-cast p1, Ljw0/f$b;

    iget-object v0, p0, Lmw0/j;->a:Lhw0/f;

    invoke-static {p1, v0}, Lmw0/k;->i(Ljw0/f$b;Lhw0/f;)Lmw0/i;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
