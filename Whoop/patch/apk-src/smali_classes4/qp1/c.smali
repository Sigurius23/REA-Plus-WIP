.class public final Lqp1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lqp1/c;",
        "",
        "<init>",
        "()V",
        "Lec3/l;",
        "Lqp1/e;",
        "hormonalDomainState",
        "Lqp1/a;",
        "fertilityDomainState",
        "Lqp1/b;",
        "a",
        "(Lec3/l;Lec3/l;)Lec3/l;",
        "hormonal-insights_release"
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


# virtual methods
.method public final a(Lec3/l;Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "hormonalDomainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fertilityDomainState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lqp1/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqp1/c$a;-><init>(Lq83/d;)V

    new-instance v2, Lec3/a0;

    invoke-direct {v2, v0, p2}, Lec3/a0;-><init>(Lc93/m;Lec3/l;)V

    new-instance p2, Lqp1/c$b;

    invoke-direct {p2, v1}, Lqp1/c$b;-><init>(Lq83/d;)V

    new-instance v0, Lec3/l1;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v2, p2, v1}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    return-object v0
.end method
