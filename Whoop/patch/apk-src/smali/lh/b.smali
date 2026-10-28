.class public final Llh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Lud3/d0;


# direct methods
.method public constructor <init>(Lne3/j0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Llh/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llh/a;-><init>(Llh/b;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Llh/b;->a:Ljava/lang/Object;

    .line 3
    new-instance v1, Llh/a;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Llh/a;-><init>(Llh/b;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Llh/b;->b:Ljava/lang/Object;

    const-wide v0, 0x7fffffffffffffffL

    .line 4
    invoke-virtual {p1, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, Llh/b;->c:J

    .line 6
    invoke-virtual {p1, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v4

    .line 7
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    iput-wide v4, p0, Llh/b;->d:J

    .line 8
    invoke-virtual {p1, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    iput-boolean v3, p0, Llh/b;->e:Z

    .line 10
    invoke-virtual {p1, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 12
    new-instance v4, Lkotlin/jvm/internal/k0;

    const/4 v5, 0x2

    invoke-direct {v4, v5, v2}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    move v5, v2

    :goto_1
    if-ge v5, v3, :cond_2

    .line 13
    invoke-virtual {p1, v0, v1}, Lne3/j0;->M(J)Ljava/lang/String;

    move-result-object v6

    .line 14
    sget-object v7, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    const/16 v7, 0x3a

    const/4 v8, 0x6

    .line 15
    invoke-static {v6, v7, v2, v2, v8}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_1

    .line 16
    invoke-virtual {v6, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v9, "substring(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v8, v6}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 17
    :cond_1
    const-string p1, "Unexpected header: "

    invoke-virtual {p1, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 18
    :cond_2
    invoke-virtual {v4}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object p1

    iput-object p1, p0, Llh/b;->f:Lud3/d0;

    return-void
.end method

.method public constructor <init>(Lud3/x0;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    sget-object v0, Ll83/i;->y:Ll83/i;

    new-instance v1, Llh/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Llh/a;-><init>(Llh/b;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Llh/b;->a:Ljava/lang/Object;

    .line 21
    new-instance v1, Llh/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Llh/a;-><init>(Llh/b;I)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Llh/b;->b:Ljava/lang/Object;

    .line 22
    iget-wide v0, p1, Lud3/x0;->L:J

    .line 23
    iput-wide v0, p0, Llh/b;->c:J

    .line 24
    iget-wide v0, p1, Lud3/x0;->M:J

    .line 25
    iput-wide v0, p0, Llh/b;->d:J

    .line 26
    iget-object v0, p1, Lud3/x0;->E:Lud3/c0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 27
    :goto_0
    iput-boolean v0, p0, Llh/b;->e:Z

    .line 28
    iget-object p1, p1, Lud3/x0;->F:Lud3/d0;

    .line 29
    iput-object p1, p0, Llh/b;->f:Lud3/d0;

    return-void
.end method


# virtual methods
.method public final a(Lne3/h0;)V
    .locals 5

    iget-wide v0, p0, Llh/b;->c:J

    invoke-virtual {p1, v0, v1}, Lne3/h0;->h0(J)Lne3/i;

    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-wide v1, p0, Llh/b;->d:J

    invoke-virtual {p1, v1, v2}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-boolean v1, p0, Llh/b;->e:Z

    if-eqz v1, :cond_0

    const-wide/16 v1, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-virtual {p1, v1, v2}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    iget-object v1, p0, Llh/b;->f:Lud3/d0;

    invoke-virtual {v1}, Lud3/d0;->size()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lne3/h0;->h0(J)Lne3/i;

    invoke-virtual {p1, v0}, Lne3/h0;->writeByte(I)Lne3/i;

    invoke-virtual {v1}, Lud3/d0;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-virtual {v1, v3}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const-string v4, ": "

    invoke-virtual {p1, v4}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v1, v3}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1, v4}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {p1, v0}, Lne3/i;->writeByte(I)Lne3/i;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
