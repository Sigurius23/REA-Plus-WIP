.class public final Lnw/k;
.super Lnw/d;
.source "SourceFile"


# static fields
.field public static final T:Ljava/util/Set;


# instance fields
.field public final O:Lnw/a;

.field public final P:Lxw/b;

.field public final Q:[B

.field public final R:Lxw/b;

.field public final S:[B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Lnw/a;->H:Lnw/a;

    sget-object v2, Lnw/a;->I:Lnw/a;

    sget-object v3, Lnw/a;->J:Lnw/a;

    sget-object v4, Lnw/a;->K:Lnw/a;

    filled-new-array {v1, v2, v3, v4}, [Lnw/a;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lnw/k;->T:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lnw/a;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 16

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    .line 1
    sget-object v1, Lnw/h;->E:Lnw/h;

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    invoke-direct/range {v0 .. v13}, Lnw/d;-><init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    .line 2
    const-string v1, "The curve must not be null"

    invoke-static {v14, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 3
    sget-object v1, Lnw/k;->T:Ljava/util/Set;

    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    iput-object v14, v0, Lnw/k;->O:Lnw/a;

    .line 5
    const-string v1, "The x parameter must not be null"

    invoke-static {v15, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v15, v0, Lnw/k;->P:Lxw/b;

    .line 6
    invoke-virtual {v15}, Lxw/a;->a()[B

    move-result-object v1

    iput-object v1, v0, Lnw/k;->Q:[B

    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lnw/k;->R:Lxw/b;

    .line 8
    iput-object v1, v0, Lnw/k;->S:[B

    return-void

    .line 9
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown / unsupported curve: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 16

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    .line 10
    sget-object v1, Lnw/h;->E:Lnw/h;

    move-object/from16 v0, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    invoke-direct/range {v0 .. v13}, Lnw/d;-><init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    .line 11
    const-string v1, "The curve must not be null"

    invoke-static {v14, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    sget-object v1, Lnw/k;->T:Ljava/util/Set;

    invoke-interface {v1, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 13
    iput-object v14, v0, Lnw/k;->O:Lnw/a;

    .line 14
    const-string v1, "The x parameter must not be null"

    invoke-static {v15, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v15, v0, Lnw/k;->P:Lxw/b;

    .line 15
    invoke-virtual {v15}, Lxw/a;->a()[B

    move-result-object v1

    iput-object v1, v0, Lnw/k;->Q:[B

    move-object/from16 v1, p3

    .line 16
    iput-object v1, v0, Lnw/k;->R:Lxw/b;

    .line 17
    invoke-virtual {v1}, Lxw/a;->a()[B

    move-result-object v1

    iput-object v1, v0, Lnw/k;->S:[B

    return-void

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown / unsupported curve: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lnw/k;->R:Lxw/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Ljava/util/HashMap;
    .locals 3

    invoke-super {p0}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lnw/k;->O:Lnw/a;

    iget-object v1, v1, Lnw/a;->w:Ljava/lang/String;

    const-string v2, "crv"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/k;->P:Lxw/b;

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "x"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/k;->R:Lxw/b;

    if-eqz v1, :cond_0

    const-string v2, "d"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnw/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    invoke-super {p0, p1}, Lnw/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    check-cast p1, Lnw/k;

    iget-object v1, p0, Lnw/k;->O:Lnw/a;

    iget-object v3, p1, Lnw/k;->O:Lnw/a;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/k;->P:Lxw/b;

    iget-object v3, p1, Lnw/k;->P:Lxw/b;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/k;->Q:[B

    iget-object v3, p1, Lnw/k;->Q:[B

    invoke-static {v1, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/k;->R:Lxw/b;

    iget-object v3, p1, Lnw/k;->R:Lxw/b;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/k;->S:[B

    iget-object p1, p1, Lnw/k;->S:[B

    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    return v2
.end method

.method public final hashCode()I
    .locals 4

    invoke-super {p0}, Lnw/d;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lnw/k;->P:Lxw/b;

    iget-object v2, p0, Lnw/k;->R:Lxw/b;

    iget-object v3, p0, Lnw/k;->O:Lnw/a;

    filled-new-array {v0, v3, v1, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnw/k;->Q:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lnw/k;->S:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method
