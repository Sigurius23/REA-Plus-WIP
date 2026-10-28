.class public final Leb/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Leb/k;->a:Z

    return-void
.end method

.method public constructor <init>(Lud3/r;)V
    .locals 1

    const-string v0, "connectionSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget-boolean v0, p1, Lud3/r;->a:Z

    .line 5
    iput-boolean v0, p0, Leb/k;->a:Z

    .line 6
    iget-object v0, p1, Lud3/r;->c:[Ljava/lang/String;

    .line 7
    iput-object v0, p0, Leb/k;->c:Ljava/lang/Object;

    .line 8
    iget-object v0, p1, Lud3/r;->d:[Ljava/lang/String;

    .line 9
    iput-object v0, p0, Leb/k;->d:Ljava/lang/Object;

    .line 10
    iget-boolean p1, p1, Lud3/r;->b:Z

    .line 11
    iput-boolean p1, p0, Leb/k;->b:Z

    return-void
.end method

.method public static h(Leb/k;Landroid/net/Network;ZZI)V
    .locals 1

    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_0

    iget-boolean p2, p0, Leb/k;->a:Z

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    iget-boolean p3, p0, Leb/k;->b:Z

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p4, p0, Leb/k;->c:Ljava/lang/Object;

    check-cast p4, Landroid/net/Network;

    invoke-virtual {p4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    iget-boolean p1, p0, Leb/k;->a:Z

    if-ne p1, p2, :cond_4

    iget-boolean p1, p0, Leb/k;->b:Z

    if-eq p1, p3, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p2, p0, Leb/k;->a:Z

    iput-boolean p3, p0, Leb/k;->b:Z

    if-eqz p1, :cond_6

    iget-object p0, p0, Leb/k;->d:Ljava/lang/Object;

    check-cast p0, Lad3/z;

    if-eqz p2, :cond_5

    if-nez p3, :cond_5

    iget-object p0, p0, Lad3/z;->x:Ljava/lang/Object;

    check-cast p0, Lgj/d;

    iget-object p1, p0, Lgj/d;->k:Lfk/a;

    const-string p2, "AndroidNetworkListener, onNetworkAvailable."

    invoke-interface {p1, p2}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object p1, p0, Lgj/d;->a:Lgj/g;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object p2, p1, Lgj/g;->p:Ljava/lang/Boolean;

    iget-object p1, p0, Lgj/d;->c:Lbc3/c0;

    iget-object p2, p0, Lgj/d;->d:Lbc3/z;

    new-instance p3, Landroidx/room/z1;

    const/4 p4, 0x6

    const/4 v0, 0x0

    invoke-direct {p3, p0, v0, p4}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 p0, 0x2

    invoke-static {p1, p2, v0, p3, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_5
    invoke-virtual {p0}, Lad3/z;->q()V

    :cond_6
    :goto_2
    return-void
.end method


# virtual methods
.method public a()Leb/l;
    .locals 5

    iget-object v0, p0, Leb/k;->c:Ljava/lang/Object;

    check-cast v0, Leb/g1;

    if-nez v0, :cond_10

    iget-object v0, p0, Leb/k;->d:Ljava/lang/Object;

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    sget-object v0, Leb/g1;->b:Leb/a1;

    goto/16 :goto_2

    :cond_0
    instance-of v1, v0, [I

    if-eqz v1, :cond_1

    sget-object v0, Leb/g1;->d:Leb/z0;

    goto/16 :goto_2

    :cond_1
    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_2

    sget-object v0, Leb/g1;->f:Leb/a1;

    goto/16 :goto_2

    :cond_2
    instance-of v1, v0, [J

    if-eqz v1, :cond_3

    sget-object v0, Leb/g1;->g:Leb/z0;

    goto/16 :goto_2

    :cond_3
    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_4

    sget-object v0, Leb/g1;->i:Leb/a1;

    goto/16 :goto_2

    :cond_4
    instance-of v1, v0, [F

    if-eqz v1, :cond_5

    sget-object v0, Leb/g1;->j:Leb/z0;

    goto/16 :goto_2

    :cond_5
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_6

    sget-object v0, Leb/g1;->l:Leb/a1;

    goto/16 :goto_2

    :cond_6
    instance-of v1, v0, [Z

    if-eqz v1, :cond_7

    sget-object v0, Leb/g1;->m:Leb/z0;

    goto/16 :goto_2

    :cond_7
    instance-of v1, v0, Ljava/lang/String;

    if-nez v1, :cond_f

    if-nez v0, :cond_8

    goto/16 :goto_1

    :cond_8
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, [Ljava/lang/Object;

    instance-of v1, v1, [Ljava/lang/String;

    if-eqz v1, :cond_9

    sget-object v0, Leb/g1;->p:Leb/z0;

    goto/16 :goto_2

    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-class v2, Landroid/os/Parcelable;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_a

    new-instance v1, Leb/c1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Leb/c1;-><init>(Ljava/lang/Class;)V

    :goto_0
    move-object v0, v1

    goto/16 :goto_2

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-class v2, Ljava/io/Serializable;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_b

    new-instance v1, Leb/e1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v0}, Leb/e1;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_b
    instance-of v1, v0, Landroid/os/Parcelable;

    if-eqz v1, :cond_c

    new-instance v1, Leb/d1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, Leb/d1;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_c
    instance-of v1, v0, Ljava/lang/Enum;

    if-eqz v1, :cond_d

    new-instance v1, Leb/b1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, Leb/b1;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_d
    instance-of v1, v0, Ljava/io/Serializable;

    if-eqz v1, :cond_e

    new-instance v1, Leb/f1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-direct {v1, v0}, Leb/f1;-><init>(Ljava/lang/Class;)V

    goto :goto_0

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Object of type "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " is not supported for navigation arguments."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    :goto_1
    sget-object v0, Leb/g1;->o:Leb/a1;

    :cond_10
    :goto_2
    new-instance v1, Leb/l;

    iget-boolean v2, p0, Leb/k;->a:Z

    iget-object v3, p0, Leb/k;->d:Ljava/lang/Object;

    iget-boolean v4, p0, Leb/k;->b:Z

    invoke-direct {v1, v0, v2, v3, v4}, Leb/l;-><init>(Leb/g1;ZLjava/lang/Object;Z)V

    return-object v1
.end method

.method public b()Lud3/r;
    .locals 5

    new-instance v0, Lud3/r;

    iget-boolean v1, p0, Leb/k;->a:Z

    iget-boolean v2, p0, Leb/k;->b:Z

    iget-object v3, p0, Leb/k;->c:Ljava/lang/Object;

    check-cast v3, [Ljava/lang/String;

    iget-object v4, p0, Leb/k;->d:Ljava/lang/Object;

    check-cast v4, [Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lud3/r;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    return-object v0
.end method

.method public varargs c([Ljava/lang/String;)V
    .locals 1

    const-string v0, "cipherSuites"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Leb/k;->a:Z

    if-eqz v0, :cond_1

    array-length v0, p1

    if-eqz v0, :cond_0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Leb/k;->c:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one cipher suite is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs d([Lud3/o;)V
    .locals 5

    const-string v0, "cipherSuites"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Leb/k;->a:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    iget-object v4, v4, Lud3/o;->a:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Leb/k;->c([Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no cipher suites for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e()Lgk/a;
    .locals 1

    iget-object v0, p0, Leb/k;->d:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgk/a;

    return-object v0
.end method

.method public varargs f([Ljava/lang/String;)V
    .locals 1

    const-string v0, "tlsVersions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Leb/k;->a:Z

    if-eqz v0, :cond_1

    array-length v0, p1

    if-eqz v0, :cond_0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, [Ljava/lang/String;

    iput-object p1, p0, Leb/k;->d:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "At least one TLS version is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public varargs g([Lud3/c1;)V
    .locals 5

    const-string v0, "tlsVersions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Leb/k;->a:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p1, v3

    iget-object v4, v4, Lud3/c1;->w:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v2, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Leb/k;->f([Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "no TLS versions for cleartext connections"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
