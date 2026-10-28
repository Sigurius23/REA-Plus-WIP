.class public final Ltg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltg/e;


# static fields
.field public static final g:Ltg/g;

.field public static final h:Ltg/g;

.field public static final i:Ltg/g;

.field public static final j:Ltg/g;

.field public static final k:Ltg/g;

.field public static final l:Ltg/g;

.field public static final m:Ltg/g;

.field public static final n:Ltg/g;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:Ljava/util/LinkedHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Li93/c;

    const/16 v1, 0x41

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Li93/a;-><init>(CC)V

    new-instance v1, Li93/c;

    const/16 v2, 0x61

    const/16 v3, 0x7a

    invoke-direct {v1, v2, v3}, Li93/a;-><init>(CC)V

    invoke-static {v0, v1}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Li93/c;

    const/16 v2, 0x30

    const/16 v3, 0x39

    invoke-direct {v1, v2, v3}, Li93/a;-><init>(CC)V

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    const/16 v1, 0x2d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/16 v2, 0x2e

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/16 v3, 0x5f

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/16 v4, 0x7e

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    filled-new-array {v1, v2, v3, v4}, [Ljava/lang/Character;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    const/16 v1, 0x21

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/16 v1, 0x24

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/16 v1, 0x26

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    const/16 v1, 0x27

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    const/16 v1, 0x28

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    const/16 v1, 0x29

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    const/16 v1, 0x2a

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    const/16 v1, 0x2b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    const/16 v1, 0x2c

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v1, 0x3b

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v1, 0x3d

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    filled-new-array/range {v2 .. v12}, [Ljava/lang/Character;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v1

    const/16 v2, 0x3a

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/16 v3, 0x40

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Character;

    move-result-object v3

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v1, v3}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v3

    const/16 v5, 0x2f

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    const/16 v6, 0x3f

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    filled-new-array {v5, v6}, [Ljava/lang/Character;

    move-result-object v5

    invoke-static {v5}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v3, v5}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v5

    filled-new-array {v4, v12}, [Ljava/lang/Character;

    move-result-object v4

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v5, v4}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    new-instance v6, Ltg/g;

    const-string v7, "host"

    invoke-static {v2, v0}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v2

    invoke-direct {v6, v7, v2}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v6, Ltg/g;->g:Ltg/g;

    new-instance v2, Ltg/g;

    const-string v6, "user info"

    invoke-direct {v2, v6, v1}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v2, Ltg/g;->h:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "path"

    invoke-direct {v1, v2, v3}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->i:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "query string"

    invoke-direct {v1, v2, v4}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->j:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "fragment"

    invoke-direct {v1, v2, v5}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->k:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "form URL"

    invoke-direct {v1, v2, v0}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->l:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "Smithy label"

    invoke-direct {v1, v2, v0}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->m:Ltg/g;

    new-instance v1, Ltg/g;

    const-string v2, "SigV4"

    invoke-direct {v1, v2, v0}, Ltg/g;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    sput-object v1, Ltg/g;->n:Ltg/g;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/Set;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltg/g;->b:Ljava/lang/String;

    iput-object p2, p0, Ltg/g;->c:Ljava/util/Set;

    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Ltg/g;->d:Ljava/util/Map;

    const/4 p1, 0x0

    const/16 p2, 0x80

    invoke-static {p1, p2}, Le93/b;->i0(II)Li93/j;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    move-object v1, p1

    check-cast v1, Li93/i;

    iget-boolean v1, v1, Li93/i;->y:Z

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lm83/e0;

    invoke-virtual {v1}, Lm83/e0;->nextInt()I

    move-result v1

    int-to-char v1, v1

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ltg/g;->c:Ljava/util/Set;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    const/16 v2, 0x10

    if-ge p2, v2, :cond_3

    move p2, v2

    :cond_3
    invoke-direct {p1, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "%"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    and-int/lit16 v5, v3, 0xff

    shr-int/lit8 v5, v5, 0x4

    const-string v6, "0123456789ABCDEF"

    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    iget-object p2, p0, Ltg/g;->d:Ljava/util/Map;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    invoke-static {p1, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iput-object p1, p0, Ltg/g;->e:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Ltg/g;->c:Ljava/util/Set;

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    if-ge v1, v2, :cond_6

    move v1, v2

    :cond_6
    invoke-direct {p2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    iget-object p1, p0, Ltg/g;->d:Ljava/util/Map;

    invoke-static {p2, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    if-ge p2, v2, :cond_8

    goto :goto_5

    :cond_8
    move v2, p2

    :goto_5
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_9
    iput-object p2, p0, Ltg/g;->f:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "decoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-static {p1}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-byte v3, p1, v2

    int-to-char v4, v3

    iget-object v5, p0, Ltg/g;->c:Ljava/util/Set;

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    iget-object v5, p0, Ltg/g;->e:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    and-int/lit16 v4, v3, 0xff

    const/16 v5, 0x25

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    shr-int/lit8 v4, v4, 0x4

    const-string v5, "0123456789ABCDEF"

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v3, v3, 0xf

    invoke-virtual {v5, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    const-string v0, "encoded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v0, 0x0

    const/4 v2, 0x0

    move v3, v2

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_6

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x25

    if-ne v4, v5, :cond_4

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    div-int/lit8 v0, v0, 0x3

    new-array v0, v0, [B

    :cond_1
    move v6, v2

    :goto_1
    add-int/lit8 v7, v3, 0x2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v7, v8, :cond_3

    if-ne v4, v5, :cond_3

    add-int/lit8 v7, v3, 0x1

    add-int/lit8 v8, v3, 0x3

    invoke-virtual {p1, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-string v9, "substring(...)"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x10

    invoke-static {v9, v7}, Lyb3/y;->P(ILjava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v3

    int-to-byte v3, v3

    add-int/lit8 v7, v6, 0x1

    aput-byte v3, v0, v6

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v8, v3, :cond_2

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :cond_2
    move v6, v7

    move v3, v8

    goto :goto_1

    :cond_3
    const/4 v7, 0x5

    invoke-static {v2, v6, v7, v0}, Lyb3/y;->C(III[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    if-eq v3, v6, :cond_0

    if-ne v4, v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    iget-object v5, p0, Ltg/g;->f:Ljava/util/LinkedHashMap;

    invoke-static {v4}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Character;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Character;->charValue()C

    move-result v4

    :cond_5
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltg/g;->b:Ljava/lang/String;

    return-object v0
.end method
