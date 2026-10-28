.class public final Lrf/h;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public final E:Lgf/c;

.field public final y:Lud3/a1;

.field public final z:Lqg/d;


# direct methods
.method public constructor <init>(Lud3/a1;Lqg/d;Lgf/c;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "counter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/h;->y:Lud3/a1;

    iput-object p2, p0, Lrf/h;->z:Lqg/d;

    iput-object p3, p0, Lrf/h;->E:Lgf/c;

    return-void
.end method


# virtual methods
.method public final d1()Lne3/j;
    .locals 4

    new-instance v0, Lrf/j;

    iget-object v1, p0, Lrf/h;->y:Lud3/a1;

    invoke-virtual {v1}, Lud3/a1;->d1()Lne3/j;

    move-result-object v1

    iget-object v2, p0, Lrf/h;->z:Lqg/d;

    iget-object v3, p0, Lrf/h;->E:Lgf/c;

    invoke-direct {v0, v1, v2, v3}, Lrf/j;-><init>(Lne3/j;Lqg/d;Lgf/c;)V

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-object v0, p0, Lrf/h;->y:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lrf/h;->y:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v0

    return-object v0
.end method
