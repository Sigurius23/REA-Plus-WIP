.class public final Lud3/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:J

.field public E:Lzd3/t;

.field public F:Lyd3/d;

.field public a:Lud3/u;

.field public b:Lud3/q;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:Lud3/z;

.field public f:Z

.field public g:Z

.field public h:Lud3/c;

.field public i:Z

.field public j:Z

.field public k:Lud3/t;

.field public l:Lud3/g;

.field public m:Lud3/v;

.field public n:Ljava/net/ProxySelector;

.field public o:Lud3/c;

.field public p:Ljavax/net/SocketFactory;

.field public q:Ljavax/net/ssl/SSLSocketFactory;

.field public r:Ljavax/net/ssl/X509TrustManager;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Ljavax/net/ssl/HostnameVerifier;

.field public v:Lud3/l;

.field public w:Landroidx/room/c1;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lud3/u;

    invoke-direct {v0}, Lud3/u;-><init>()V

    iput-object v0, p0, Lud3/k0;->a:Lud3/u;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lud3/k0;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lud3/k0;->d:Ljava/util/ArrayList;

    sget-object v0, Lud3/a0;->NONE:Lud3/a0;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lvd1/c;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lud3/k0;->e:Lud3/z;

    iput-boolean v2, p0, Lud3/k0;->f:Z

    iput-boolean v2, p0, Lud3/k0;->g:Z

    sget-object v0, Lud3/c;->a:Lud3/b;

    iput-object v0, p0, Lud3/k0;->h:Lud3/c;

    iput-boolean v2, p0, Lud3/k0;->i:Z

    iput-boolean v2, p0, Lud3/k0;->j:Z

    sget-object v1, Lud3/t;->w:Lud3/t;

    iput-object v1, p0, Lud3/k0;->k:Lud3/t;

    sget-object v1, Lud3/v;->v:Lud3/t;

    iput-object v1, p0, Lud3/k0;->m:Lud3/v;

    iput-object v0, p0, Lud3/k0;->o:Lud3/c;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "getDefault(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lud3/k0;->p:Ljavax/net/SocketFactory;

    sget-object v0, Lud3/l0;->H:Ljava/util/List;

    iput-object v0, p0, Lud3/k0;->s:Ljava/util/List;

    sget-object v0, Lud3/l0;->G:Ljava/util/List;

    iput-object v0, p0, Lud3/k0;->t:Ljava/util/List;

    sget-object v0, Lje3/c;->a:Lje3/c;

    iput-object v0, p0, Lud3/k0;->u:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Lud3/l;->c:Lud3/l;

    iput-object v0, p0, Lud3/k0;->v:Lud3/l;

    const/16 v0, 0x2710

    iput v0, p0, Lud3/k0;->y:I

    iput v0, p0, Lud3/k0;->z:I

    iput v0, p0, Lud3/k0;->A:I

    const v0, 0xea60

    iput v0, p0, Lud3/k0;->C:I

    const-wide/16 v0, 0x400

    iput-wide v0, p0, Lud3/k0;->D:J

    return-void
.end method


# virtual methods
.method public final a(Lud3/g0;)V
    .locals 1

    const-string v0, "interceptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lud3/k0;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lud3/k0;->y:I

    return-void
.end method

.method public final c(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interval"

    invoke-static {v0, p1, p2, p3}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lud3/k0;->B:I

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 2

    const-string v0, "protocols"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/util/Collection;

    invoke-static {p1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    sget-object v0, Lud3/m0;->G:Lud3/m0;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lud3/m0;->z:Lud3/m0;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    sget-object v0, Lud3/m0;->y:Lud3/m0;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    sget-object v1, Lud3/m0;->E:Lud3/m0;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v1, p0, Lud3/k0;->t:Ljava/util/List;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iput-object v0, p0, Lud3/k0;->E:Lzd3/t;

    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    const-string v0, "unmodifiableList(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lud3/k0;->t:Ljava/util/List;

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "protocols must not contain null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "protocols must not contain http/1.0: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lud3/k0;->z:I

    return-void
.end method

.method public final f(JLjava/util/concurrent/TimeUnit;)V
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {v0, p1, p2, p3}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p1

    iput p1, p0, Lud3/k0;->A:I

    return-void
.end method
