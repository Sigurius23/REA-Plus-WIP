.class public final Lc63/a;
.super Lf63/c;
.source "SourceFile"


# instance fields
.field public final w:Lw53/b;

.field public final x:Lio/ktor/utils/io/q;

.field public final y:Lf63/c;

.field public final z:Lq83/j;


# direct methods
.method public constructor <init>(Lw53/b;Lio/ktor/utils/io/q;Lf63/c;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "origin"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc63/a;->w:Lw53/b;

    iput-object p2, p0, Lc63/a;->x:Lio/ktor/utils/io/q;

    iput-object p3, p0, Lc63/a;->y:Lf63/c;

    invoke-interface {p3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lc63/a;->z:Lq83/j;

    return-void
.end method


# virtual methods
.method public final a()Lw53/b;
    .locals 1

    iget-object v0, p0, Lc63/a;->w:Lw53/b;

    return-object v0
.end method

.method public final b()Lio/ktor/utils/io/q;
    .locals 1

    iget-object v0, p0, Lc63/a;->x:Lio/ktor/utils/io/q;

    return-object v0
.end method

.method public final c()Lq63/b;
    .locals 1

    iget-object v0, p0, Lc63/a;->y:Lf63/c;

    invoke-virtual {v0}, Lf63/c;->c()Lq63/b;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lq63/b;
    .locals 1

    iget-object v0, p0, Lc63/a;->y:Lf63/c;

    invoke-virtual {v0}, Lf63/c;->d()Lq63/b;

    move-result-object v0

    return-object v0
.end method

.method public final e()Li63/v;
    .locals 1

    iget-object v0, p0, Lc63/a;->y:Lf63/c;

    invoke-virtual {v0}, Lf63/c;->e()Li63/v;

    move-result-object v0

    return-object v0
.end method

.method public final f()Li63/u;
    .locals 1

    iget-object v0, p0, Lc63/a;->y:Lf63/c;

    invoke-virtual {v0}, Lf63/c;->f()Li63/u;

    move-result-object v0

    return-object v0
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lc63/a;->z:Lq83/j;

    return-object v0
.end method

.method public final getHeaders()Li63/m;
    .locals 1

    iget-object v0, p0, Lc63/a;->y:Lf63/c;

    invoke-interface {v0}, Li63/s;->getHeaders()Li63/m;

    move-result-object v0

    return-object v0
.end method
