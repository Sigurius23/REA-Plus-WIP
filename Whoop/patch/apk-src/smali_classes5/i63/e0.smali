.class public final Li63/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li63/b0;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ll83/p;

.field public final i:Ll83/p;


# direct methods
.method public constructor <init>(Li63/b0;Ljava/lang/String;ILjava/util/ArrayList;Li63/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "protocol"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p5, "fragment"

    invoke-static {p6, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li63/e0;->a:Li63/b0;

    iput-object p2, p0, Li63/e0;->b:Ljava/lang/String;

    iput p3, p0, Li63/e0;->c:I

    iput-object p4, p0, Li63/e0;->d:Ljava/util/ArrayList;

    iput-object p7, p0, Li63/e0;->e:Ljava/lang/String;

    iput-object p8, p0, Li63/e0;->f:Ljava/lang/String;

    iput-object p9, p0, Li63/e0;->g:Ljava/lang/String;

    if-ltz p3, :cond_0

    const/high16 p1, 0x10000

    if-ge p3, p1, :cond_0

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    :goto_0
    new-instance p1, Li63/d0;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance p1, Li63/d0;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance p1, Li63/d0;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance p1, Li63/d0;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Li63/e0;->h:Ll83/p;

    new-instance p1, Li63/d0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Li63/e0;->i:Ll83/p;

    new-instance p1, Li63/d0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Li63/d0;-><init>(Li63/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "port must be between 0 and 65535, or 0 if not set"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Li63/e0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li63/e0;

    iget-object v2, p0, Li63/e0;->g:Ljava/lang/String;

    iget-object p1, p1, Li63/e0;->g:Ljava/lang/String;

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Li63/e0;->g:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li63/e0;->g:Ljava/lang/String;

    return-object v0
.end method
