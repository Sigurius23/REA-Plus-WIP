.class public final Lzx/g;
.super Lzx/i;
.source "SourceFile"


# static fields
.field public static final i:Ljava/util/Set;


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Z

.field public final g:Lzx/a;

.field public final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x2d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Character;

    move-result-object v0

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lzx/g;->i:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 7

    const-string v0, "denormalized"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzx/g;->c:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    sget-object v4, Lzx/g;->i:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {v0, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lzx/g;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lzx/g;->e:I

    const/16 v2, 0x13

    const/4 v3, 0x1

    if-ne v0, v2, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lzx/g;->f:Z

    const-string v0, "cardNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    invoke-static {v0, p1}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-ne v4, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v5

    :goto_2
    if-eqz v2, :cond_4

    new-instance v5, Lzx/a;

    invoke-direct {v5, v2}, Lzx/a;-><init>(Ljava/lang/String;)V

    :cond_4
    iput-object v5, p0, Lzx/g;->g:Lzx/a;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v3

    move v2, v1

    move v4, v3

    :goto_3
    const/4 v5, -0x1

    if-ge v5, v0, :cond_9

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {v5}, Ljava/lang/Character;->getNumericValue(C)I

    move-result v5

    xor-int/lit8 v6, v4, 0x1

    if-nez v4, :cond_7

    mul-int/lit8 v5, v5, 0x2

    :cond_7
    const/16 v4, 0x9

    if-le v5, v4, :cond_8

    add-int/lit8 v5, v5, -0x9

    :cond_8
    add-int/2addr v2, v5

    add-int/lit8 v0, v0, -0x1

    move v4, v6

    goto :goto_3

    :cond_9
    rem-int/lit8 v2, v2, 0xa

    if-nez v2, :cond_a

    move v1, v3

    :cond_a
    :goto_4
    iput-boolean v1, p0, Lzx/g;->h:Z

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 17

    sget-object v0, Lzx/i;->b:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    sget-object v0, Lzx/i;->a:Ljava/util/Set;

    :cond_0
    move-object/from16 v1, p0

    iget-object v2, v1, Lzx/g;->d:Ljava/lang/String;

    move/from16 v3, p1

    invoke-static {v3, v2}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->t1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v6, 0x0

    move v7, v6

    move v8, v7

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "substring(...)"

    const/4 v11, 0x0

    if-eqz v9, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v12, v7, 0x1

    if-ltz v7, :cond_2

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    sub-int/2addr v9, v7

    if-le v5, v9, :cond_1

    invoke-virtual {v2, v8, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v8, v4, v7

    move v8, v9

    :cond_1
    move v7, v12

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v11

    :cond_3
    move v0, v6

    :goto_1
    const/4 v5, -0x1

    if-ge v0, v3, :cond_5

    aget-object v7, v4, v0

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v5

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    if-eq v0, v5, :cond_6

    move-object v11, v7

    :cond_6
    if-eqz v11, :cond_7

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v2, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v2, v4, v0

    :cond_7
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    if-ge v6, v3, :cond_8

    aget-object v0, v4, v6

    if-eqz v0, :cond_8

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    const/4 v15, 0x0

    const/16 v16, 0x3e

    const-string v12, " "

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzx/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzx/g;

    iget-object v1, p0, Lzx/g;->c:Ljava/lang/String;

    iget-object p1, p1, Lzx/g;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lzx/g;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "Unvalidated(denormalized="

    const-string v1, ")"

    iget-object v2, p0, Lzx/g;->c:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
