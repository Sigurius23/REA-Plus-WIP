.class public final Lbk1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbk1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00050\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ=\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lbk1/a;",
        "",
        "<init>",
        "()V",
        "Lec3/l;",
        "Ll83/q;",
        "Lxj1/c;",
        "Lyg2/d;",
        "Lsl1/b;",
        "combinedFlow",
        "b",
        "(Lec3/l;)Lec3/l;",
        "healthMonitorDomainFlow",
        "liveHrStateFlow",
        "connectivityTileFlow",
        "a",
        "(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;",
        "health-monitor_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lbk1/a$a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v3}, Lbk1/a$a;-><init>(Lxj1/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lbk1/a$d;

    invoke-direct {v1, v3}, Lbk1/a$d;-><init>(Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v2, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    new-instance v0, Lbk1/a$c;

    invoke-direct {v0, p1}, Lbk1/a$c;-><init>(Lec3/l;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lec3/l;Lec3/l;Lec3/l;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lec3/l;",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "healthMonitorDomainFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveHrStateFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityTileFlow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbk1/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbk1/a$b;-><init>(Lq83/d;)V

    invoke-static {p1, p2, p3, v0}, Lec3/v;->p(Lec3/l;Lec3/l;Lec3/l;Lc93/n;)Lec3/j1;

    move-result-object p1

    invoke-direct {p0, p1}, Lbk1/a;->b(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
