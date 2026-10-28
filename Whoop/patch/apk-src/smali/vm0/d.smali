.class public final Lvm0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lvm0/d;",
        "",
        "Liy1/c;",
        "metricWriter",
        "Lec3/t1;",
        "Lvm0/k;",
        "events",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Liy1/c;Lec3/t1;Lbc3/c0;)V",
        "a",
        "Liy1/c;",
        "Lbc3/k1;",
        "b",
        "Lbc3/k1;",
        "collector",
        "cache_release"
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
.field private final a:Liy1/c;

.field private final b:Lbc3/k1;


# direct methods
.method public constructor <init>(Liy1/c;Lec3/t1;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liy1/c;",
            "Lec3/t1;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "metricWriter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "events"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvm0/d;->a:Liy1/c;

    new-instance p1, Lvm0/d$a;

    const/4 v0, 0x0

    invoke-direct {p1, p2, p0, v0}, Lvm0/d$a;-><init>(Lec3/t1;Lvm0/d;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p3, v0, v0, p1, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lvm0/d;->b:Lbc3/k1;

    return-void
.end method

.method public static final synthetic a(Lvm0/d;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lvm0/d;->a:Liy1/c;

    return-object p0
.end method
