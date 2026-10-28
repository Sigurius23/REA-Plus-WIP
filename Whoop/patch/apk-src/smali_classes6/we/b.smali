.class public final Lwe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/u;


# instance fields
.field public final w:Lyf/u;

.field public final x:Lq83/j;

.field public final y:Ld9/p;


# direct methods
.method public constructor <init>(Lyf/u;Lwe/o;Lwe/g;[BLmf/d;Lq83/j;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousSignature"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineContext"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwe/b;->w:Lyf/u;

    iput-object p6, p0, Lwe/b;->x:Lq83/j;

    move-object p6, p1

    new-instance p1, Ld9/p;

    move-object v0, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    new-instance p2, Lty/c;

    invoke-direct {p2, v0}, Lty/c;-><init>(Lyf/u;)V

    invoke-direct/range {p1 .. p6}, Ld9/p;-><init>(Lty/c;Lwe/o;Lwe/g;[BLmf/d;)V

    iput-object p1, p0, Lwe/b;->y:Ld9/p;

    return-void
.end method


# virtual methods
.method public final c0(Lyf/k;J)J
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-ltz v0, :cond_1

    new-instance v0, Lsz/q;

    const/4 v1, 0x0

    const/16 v2, 0xd

    invoke-direct {v0, p0, v1, v2}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iget-object v1, p0, Lwe/b;->x:Lq83/j;

    invoke-static {v1, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_0
    iget-object v0, p0, Lwe/b;->y:Ld9/p;

    iget-object v0, v0, Ld9/p;->g:Ljava/lang/Object;

    check-cast v0, Lyf/k;

    invoke-virtual {v0, p1, p2, p3}, Lyf/k;->c0(Lyf/k;J)J

    move-result-wide p1

    return-wide p1

    :cond_1
    const-string p1, "Invalid limit ("

    const-string v0, ") must be >= 0L"

    invoke-static {p2, p3, p1, v0}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lwe/b;->w:Lyf/u;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method
