.class public final Lr9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lr9/n;

.field public final b:Lx8/p;

.field public final c:Lr9/p;

.field public final d:Ljava/util/ArrayDeque;

.field public final e:Lu8/p;

.field public f:J

.field public final g:Lr9/r;

.field public final h:Ljava/util/concurrent/Executor;

.field public i:Lr9/m;


# direct methods
.method public constructor <init>(Lr9/n;Lx8/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/c;->a:Lr9/n;

    iput-object p2, p1, Lr9/n;->l:Lx8/p;

    iput-object p2, p0, Lr9/c;->b:Lx8/p;

    new-instance p2, Lr9/p;

    new-instance v0, Lq3/i;

    invoke-direct {v0, p0}, Lq3/i;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, v0, p1}, Lr9/p;-><init>(Lq3/i;Lr9/n;)V

    iput-object p2, p0, Lr9/c;->c:Lr9/p;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lr9/c;->d:Ljava/util/ArrayDeque;

    new-instance p1, Lu8/o;

    invoke-direct {p1}, Lu8/o;-><init>()V

    new-instance p2, Lu8/p;

    invoke-direct {p2, p1}, Lu8/p;-><init>(Lu8/o;)V

    iput-object p2, p0, Lr9/c;->e:Lu8/p;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lr9/c;->f:J

    sget-object p1, Lr9/r;->a:Lr9/r;

    iput-object p1, p0, Lr9/c;->g:Lr9/r;

    new-instance p1, Lm5/e;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lm5/e;-><init>(I)V

    iput-object p1, p0, Lr9/c;->h:Ljava/util/concurrent/Executor;

    new-instance p1, Lr9/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr9/c;->i:Lr9/m;

    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 4

    iget-wide p3, p0, Lr9/c;->f:J

    cmp-long p3, p1, p3

    if-eqz p3, :cond_1

    iget-object p3, p0, Lr9/c;->c:Lr9/p;

    iget-object p4, p3, Lr9/p;->e:Llo/w;

    iget-wide v0, p3, Lr9/p;->g:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p3, v0, v2

    if-nez p3, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p4, v0, v1, p3}, Llo/w;->a(JLjava/lang/Object;)V

    iput-wide p1, p0, Lr9/c;->f:J

    :cond_1
    return-void
.end method
