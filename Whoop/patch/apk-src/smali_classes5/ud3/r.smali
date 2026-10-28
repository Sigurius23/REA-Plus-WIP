.class public final Lud3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lud3/r;

.field public static final f:Lud3/r;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:[Ljava/lang/String;

.field public final d:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    sget-object v0, Lud3/o;->r:Lud3/o;

    sget-object v1, Lud3/o;->s:Lud3/o;

    sget-object v2, Lud3/o;->t:Lud3/o;

    sget-object v3, Lud3/o;->l:Lud3/o;

    sget-object v4, Lud3/o;->n:Lud3/o;

    sget-object v5, Lud3/o;->m:Lud3/o;

    sget-object v6, Lud3/o;->o:Lud3/o;

    sget-object v7, Lud3/o;->q:Lud3/o;

    sget-object v8, Lud3/o;->p:Lud3/o;

    filled-new-array/range {v0 .. v8}, [Lud3/o;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    sget-object v10, Lud3/o;->j:Lud3/o;

    sget-object v11, Lud3/o;->k:Lud3/o;

    sget-object v12, Lud3/o;->h:Lud3/o;

    sget-object v13, Lud3/o;->i:Lud3/o;

    sget-object v14, Lud3/o;->f:Lud3/o;

    sget-object v15, Lud3/o;->g:Lud3/o;

    sget-object v16, Lud3/o;->e:Lud3/o;

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    filled-new-array/range {v1 .. v16}, [Lud3/o;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Leb/k;

    invoke-direct {v1}, Leb/k;-><init>()V

    move-object/from16 v2, v17

    check-cast v2, Ljava/util/Collection;

    const/4 v3, 0x0

    new-array v4, v3, [Lud3/o;

    invoke-interface {v2, v4}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lud3/o;

    array-length v4, v2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lud3/o;

    invoke-virtual {v1, v2}, Leb/k;->d([Lud3/o;)V

    sget-object v2, Lud3/c1;->y:Lud3/c1;

    sget-object v4, Lud3/c1;->z:Lud3/c1;

    filled-new-array {v2, v4}, [Lud3/c1;

    move-result-object v5

    invoke-virtual {v1, v5}, Leb/k;->g([Lud3/c1;)V

    const/4 v5, 0x1

    iput-boolean v5, v1, Leb/k;->b:Z

    invoke-virtual {v1}, Leb/k;->b()Lud3/r;

    new-instance v1, Leb/k;

    invoke-direct {v1}, Leb/k;-><init>()V

    check-cast v0, Ljava/util/Collection;

    new-array v6, v3, [Lud3/o;

    invoke-interface {v0, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lud3/o;

    array-length v7, v6

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Lud3/o;

    invoke-virtual {v1, v6}, Leb/k;->d([Lud3/o;)V

    filled-new-array {v2, v4}, [Lud3/c1;

    move-result-object v6

    invoke-virtual {v1, v6}, Leb/k;->g([Lud3/c1;)V

    iput-boolean v5, v1, Leb/k;->b:Z

    invoke-virtual {v1}, Leb/k;->b()Lud3/r;

    move-result-object v1

    sput-object v1, Lud3/r;->e:Lud3/r;

    new-instance v1, Leb/k;

    invoke-direct {v1}, Leb/k;-><init>()V

    new-array v6, v3, [Lud3/o;

    invoke-interface {v0, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lud3/o;

    array-length v6, v0

    invoke-static {v0, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lud3/o;

    invoke-virtual {v1, v0}, Leb/k;->d([Lud3/o;)V

    sget-object v0, Lud3/c1;->E:Lud3/c1;

    sget-object v6, Lud3/c1;->F:Lud3/c1;

    filled-new-array {v2, v4, v0, v6}, [Lud3/c1;

    move-result-object v0

    invoke-virtual {v1, v0}, Leb/k;->g([Lud3/c1;)V

    iput-boolean v5, v1, Leb/k;->b:Z

    invoke-virtual {v1}, Leb/k;->b()Lud3/r;

    new-instance v0, Lud3/r;

    const/4 v1, 0x0

    invoke-direct {v0, v3, v3, v1, v1}, Lud3/r;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lud3/r;->f:Lud3/r;

    return-void
.end method

.method public constructor <init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lud3/r;->a:Z

    iput-boolean p2, p0, Lud3/r;->b:Z

    iput-object p3, p0, Lud3/r;->c:[Ljava/lang/String;

    iput-object p4, p0, Lud3/r;->d:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;Z)V
    .locals 9

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v1, p0, Lud3/r;->c:[Ljava/lang/String;

    if-eqz v1, :cond_0

    sget-object v2, Lud3/o;->c:Lud3/n;

    invoke-static {v1, v0, v2}, Lwd3/f;->l([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lud3/r;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v2

    const-string v3, "getEnabledProtocols(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lp83/a;->w:Lp83/a;

    invoke-static {v2, v1, v3}, Lwd3/f;->l([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v3, Lud3/o;->c:Lud3/n;

    sget-object v4, Lwd3/f;->a:[B

    array-length v4, v2

    const/4 v5, 0x0

    :goto_1
    const/4 v6, -0x1

    if-ge v5, v4, :cond_3

    aget-object v7, v2, v5

    const-string v8, "TLS_FALLBACK_SCSV"

    invoke-virtual {v3, v7, v8}, Lud3/n;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_2
    if-eqz p2, :cond_4

    if-eq v5, v6, :cond_4

    aget-object p2, v2, v5

    const-string v2, "get(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v2, v0

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "copyOf(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    add-int/lit8 v2, v2, -0x1

    aput-object p2, v0, v2

    :cond_4
    new-instance p2, Leb/k;

    invoke-direct {p2, p0}, Leb/k;-><init>(Lud3/r;)V

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p2, v0}, Leb/k;->c([Ljava/lang/String;)V

    array-length v0, v1

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-virtual {p2, v0}, Leb/k;->f([Ljava/lang/String;)V

    invoke-virtual {p2}, Leb/k;->b()Lud3/r;

    move-result-object p2

    invoke-virtual {p2}, Lud3/r;->c()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p2, Lud3/r;->d:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    :cond_5
    invoke-virtual {p2}, Lud3/r;->b()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object p2, p2, Lud3/r;->c:[Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    :cond_6
    return-void
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lud3/r;->c:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Lud3/o;->b:Lud3/t;

    invoke-virtual {v5, v4}, Lud3/t;->c(Ljava/lang/String;)Lud3/o;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 6

    iget-object v0, p0, Lud3/r;->d:[Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    array-length v2, v0

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v0, v3

    sget-object v5, Lud3/c1;->x:Lud3/t;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lud3/t;->d(Ljava/lang/String;)Lud3/c1;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lud3/r;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne p1, p0, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lud3/r;

    iget-boolean v0, p1, Lud3/r;->a:Z

    iget-boolean v1, p0, Lud3/r;->a:Z

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_5

    iget-object v0, p0, Lud3/r;->c:[Ljava/lang/String;

    iget-object v1, p1, Lud3/r;->c:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lud3/r;->d:[Ljava/lang/String;

    iget-object v1, p1, Lud3/r;->d:[Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-boolean v0, p0, Lud3/r;->b:Z

    iget-boolean p1, p1, Lud3/r;->b:Z

    if-eq v0, p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lud3/r;->a:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iget-object v1, p0, Lud3/r;->c:[Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    const/16 v2, 0x20f

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x1f

    iget-object v1, p0, Lud3/r;->d:[Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    :cond_1
    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    iget-boolean v0, p0, Lud3/r;->b:Z

    xor-int/lit8 v0, v0, 0x1

    add-int/2addr v2, v0

    return v2

    :cond_2
    const/16 v0, 0x11

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-boolean v0, p0, Lud3/r;->a:Z

    if-nez v0, :cond_0

    const-string v0, "ConnectionSpec()"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConnectionSpec(cipherSuites="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lud3/r;->b()Ljava/util/ArrayList;

    move-result-object v1

    const-string v2, "[all enabled]"

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tlsVersions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lud3/r;->c()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", supportsTlsExtensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lud3/r;->b:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
