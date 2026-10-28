.class public abstract Lgw/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final N:Ljava/util/Map;


# instance fields
.field public final E:Ljava/util/Map;

.field public final F:Lxw/b;

.field public final G:Ljava/net/URI;

.field public final H:Lnw/d;

.field public final I:Ljava/net/URI;

.field public final J:Lxw/b;

.field public final K:Lxw/b;

.field public final L:Ljava/util/List;

.field public final M:Ljava/lang/String;

.field public final w:Lgw/a;

.field public final x:Lgw/h;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lgw/c;->N:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lgw/a;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lxw/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgw/c;->w:Lgw/a;

    iput-object p2, p0, Lgw/c;->x:Lgw/h;

    iput-object p3, p0, Lgw/c;->y:Ljava/lang/String;

    const/4 p1, 0x0

    if-eqz p4, :cond_0

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    iput-object p2, p0, Lgw/c;->z:Ljava/util/Set;

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lgw/c;->z:Ljava/util/Set;

    :goto_0
    if-eqz p12, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2, p12}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    iput-object p2, p0, Lgw/c;->E:Ljava/util/Map;

    goto :goto_1

    :cond_1
    sget-object p2, Lgw/c;->N:Ljava/util/Map;

    iput-object p2, p0, Lgw/c;->E:Ljava/util/Map;

    :goto_1
    iput-object p13, p0, Lgw/c;->F:Lxw/b;

    iput-object p5, p0, Lgw/c;->G:Ljava/net/URI;

    iput-object p6, p0, Lgw/c;->H:Lnw/d;

    iput-object p7, p0, Lgw/c;->I:Ljava/net/URI;

    iput-object p8, p0, Lgw/c;->J:Lxw/b;

    iput-object p9, p0, Lgw/c;->K:Lxw/b;

    if-eqz p10, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lgw/c;->L:Ljava/util/List;

    goto :goto_2

    :cond_2
    iput-object p1, p0, Lgw/c;->L:Ljava/util/List;

    :goto_2
    iput-object p11, p0, Lgw/c;->M:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lxw/b;
    .locals 2

    iget-object v0, p0, Lgw/c;->F:Lxw/b;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lgw/c;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    invoke-static {v0}, Lxw/b;->c([B)Lxw/b;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public b()Ljava/util/HashMap;
    .locals 4

    sget-object v0, Lxw/d;->a:Low/m;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lgw/c;->E:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    iget-object v1, p0, Lgw/c;->w:Lgw/a;

    if-eqz v1, :cond_0

    const-string v2, "alg"

    iget-object v1, v1, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lgw/c;->x:Lgw/h;

    if-eqz v1, :cond_1

    const-string v2, "typ"

    iget-object v1, v1, Lgw/h;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lgw/c;->y:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v2, "cty"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lgw/c;->z:Ljava/util/Set;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v1, "crit"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lgw/c;->G:Ljava/net/URI;

    if-eqz v1, :cond_4

    const-string v2, "jku"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lgw/c;->H:Lnw/d;

    if-eqz v1, :cond_5

    const-string v2, "jwk"

    invoke-virtual {v1}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lgw/c;->I:Ljava/net/URI;

    if-eqz v1, :cond_6

    const-string v2, "x5u"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, Lgw/c;->J:Lxw/b;

    if-eqz v1, :cond_7

    const-string v2, "x5t"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Lgw/c;->K:Lxw/b;

    if-eqz v1, :cond_8

    const-string v2, "x5t#S256"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v1, p0, Lgw/c;->L:Ljava/util/List;

    if-eqz v1, :cond_a

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxw/a;

    iget-object v3, v3, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_9
    const-string v1, "x5c"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget-object v1, p0, Lgw/c;->M:Ljava/lang/String;

    if-eqz v1, :cond_b

    const-string v2, "kid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lgw/c;->b()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lxw/d;->j(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
