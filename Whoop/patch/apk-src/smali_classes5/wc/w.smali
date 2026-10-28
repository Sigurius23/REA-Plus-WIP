.class public final Lwc/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Lyc/a;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Lvg/n;

.field public final z:Lug/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    const-string v1, "loginSession"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "platformProvider"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/w;->w:Ljava/lang/String;

    iput-object p2, p0, Lwc/w;->x:Ljava/lang/String;

    iput-object v0, p0, Lwc/w;->y:Lvg/n;

    sget-object p1, Lug/a;->a:Lug/a;

    iput-object p1, p0, Lwc/w;->z:Lug/a;

    const-string p1, "AWS_LOGIN_IN_CACHE_DIRECTORY"

    invoke-virtual {v0, p1}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "login"

    const-string p2, "cache"

    const-string v1, "~"

    const-string v2, ".aws"

    filled-new-array {v1, v2, p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lwc/w;->E:Ljava/lang/String;

    new-instance p1, Lsz/q;

    const/16 p2, 0xc

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0, p2}, Lsz/q;-><init>(Ljava/lang/Object;Lq83/d;I)V

    sget-object p2, Lq83/k;->w:Lq83/k;

    invoke-static {p2, p1}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyc/a;

    iput-object p1, p0, Lwc/w;->F:Lyc/a;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lwc/v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/v;

    iget v1, v0, Lwc/v;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/v;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/v;

    invoke-direct {v0, p0, p2}, Lwc/v;-><init>(Lwc/w;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/v;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/v;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v2, Lwc/w;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {p2, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    new-instance v4, Lwc/f0;

    iget-object v8, p0, Lwc/w;->E:Ljava/lang/String;

    iget-object v9, p0, Lwc/w;->F:Lyc/a;

    iget-object v5, p0, Lwc/w;->w:Ljava/lang/String;

    iget-object v6, p0, Lwc/w;->y:Lvg/n;

    iget-object v7, p0, Lwc/w;->z:Lug/a;

    invoke-direct/range {v4 .. v9}, Lwc/f0;-><init>(Ljava/lang/String;Lvg/n;Lug/a;Ljava/lang/String;Lyc/a;)V

    new-instance v2, Lvv1/c;

    const/4 v5, 0x7

    invoke-direct {v2, p0, v5}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    const/4 v5, 0x0

    invoke-virtual {p2, v5, v2}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    iput v3, v0, Lwc/v;->y:I

    invoke-virtual {v4, p1, v0}, Lwc/f0;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lve/e;

    sget-object p1, Lie/a;->U:Lie/a;

    invoke-static {p2, p1}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lwc/w;->F:Lyc/a;

    invoke-virtual {v0}, Lyc/a;->close()V

    return-void
.end method
