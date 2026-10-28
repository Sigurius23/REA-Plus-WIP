.class public final Lf1/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/a1;


# static fields
.field public static final l:Lp0/n0;


# instance fields
.field public a:Z

.field public final b:Ljava/util/ArrayList;

.field public final c:La0/k0;

.field public final d:Ljava/util/concurrent/atomic/AtomicLong;

.field public e:Lf1/c0;

.field public f:Las1/j;

.field public g:Ld30/k;

.field public h:Lf1/d0;

.field public i:Lf1/c0;

.field public j:Lf1/c0;

.field public final k:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ldw1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Ldw1/a;-><init>(I)V

    new-instance v1, Lev2/b;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lev2/b;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Lf1/b1;->l:Lp0/n0;

    return-void
.end method

.method public constructor <init>(J)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lf1/b1;->b:Ljava/util/ArrayList;

    sget-object v0, La0/w;->a:La0/k0;

    new-instance v0, La0/k0;

    invoke-direct {v0}, La0/k0;-><init>()V

    iput-object v0, p0, Lf1/b1;->c:La0/k0;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lf1/b1;->d:Ljava/util/concurrent/atomic/AtomicLong;

    sget-object p1, La0/w;->a:La0/k0;

    const-string p2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lf1/b1;->k:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()La0/k0;
    .locals 1

    iget-object v0, p0, Lf1/b1;->k:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/k0;

    return-object v0
.end method

.method public final b()J
    .locals 5

    iget-object v0, p0, Lf1/b1;->d:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, Lf1/b1;->i:Lf1/c0;

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lf1/c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final d(Ly2/y;JJLf1/v;Z)Z
    .locals 1

    iget-object v0, p0, Lf1/b1;->g:Ld30/k;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ld30/k;->x:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    invoke-virtual {v0, p1, p2, p3}, Lf1/w0;->b(Ly2/y;J)J

    move-result-wide p2

    invoke-virtual {v0, p1, p4, p5}, Lf1/w0;->b(Ly2/y;J)J

    move-result-wide p4

    invoke-virtual {v0, p7}, Lf1/w0;->l(Z)V

    move-object p7, p6

    const/4 p6, 0x0

    move-object p1, v0

    invoke-virtual/range {p1 .. p7}, Lf1/w0;->o(JJZLf1/v;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Ly2/y;)Ljava/util/ArrayList;
    .locals 3

    iget-boolean v0, p0, Lf1/b1;->a:Z

    iget-object v1, p0, Lf1/b1;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Lej1/h;

    const/16 v2, 0xc

    invoke-direct {v0, p1, v2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    new-instance p1, Lea2/l;

    const/4 v2, 0x1

    invoke-direct {p1, v0, v2}, Lea2/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, p1}, Lm83/w;->l0(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf1/b1;->a:Z

    :cond_0
    return-object v1
.end method

.method public final f(Lf1/l;)Lf1/l;
    .locals 5

    iget-wide v0, p1, Lf1/l;->a:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "The selectable contains an invalid id: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v2, p0, Lf1/b1;->c:La0/k0;

    invoke-virtual {v2, v0, v1}, La0/k0;->b(J)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Another selectable with the id: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ".selectableId has already subscribed."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v2, v0, v1, p1}, La0/k0;->h(JLjava/lang/Object;)V

    iget-object v0, p0, Lf1/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/b1;->a:Z

    return-object p1
.end method

.method public final g(Lf1/l;)V
    .locals 3

    iget-wide v0, p1, Lf1/l;->a:J

    iget-object v2, p0, Lf1/b1;->c:La0/k0;

    invoke-virtual {v2, v0, v1}, La0/k0;->b(J)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lf1/b1;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-wide v0, p1, Lf1/l;->a:J

    invoke-virtual {v2, v0, v1}, La0/k0;->g(J)Ljava/lang/Object;

    iget-object p1, p0, Lf1/b1;->j:Lf1/c0;

    if-eqz p1, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1, v0}, Lf1/c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method
