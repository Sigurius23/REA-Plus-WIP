.class public abstract Li63/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/Set;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/ArrayList;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    const/16 v0, 0x3d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v17

    const/16 v0, 0x3b

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v16

    const/16 v0, 0x2c

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v11

    const/16 v0, 0x2a

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    const/16 v0, 0x29

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v8

    const/16 v0, 0x28

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v7

    const/16 v0, 0x27

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    const/16 v0, 0x40

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/16 v0, 0x23

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v19

    const/16 v0, 0x3a

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    const/16 v0, 0x2b

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v22

    const/16 v0, 0x26

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    const/16 v0, 0x24

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v4

    const/16 v0, 0x21

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v18

    const/16 v0, 0x7e

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v21

    const/16 v0, 0x5f

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v20

    const/16 v0, 0x2e

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v24

    const/16 v0, 0x2d

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v23

    new-instance v0, Li93/c;

    const/16 v3, 0x61

    const/16 v10, 0x7a

    invoke-direct {v0, v3, v10}, Li93/a;-><init>(CC)V

    new-instance v12, Li93/c;

    const/16 v13, 0x41

    const/16 v14, 0x5a

    invoke-direct {v12, v13, v14}, Li93/a;-><init>(CC)V

    invoke-static {v0, v12}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v12, Li93/c;

    const/16 v15, 0x30

    const/16 v13, 0x39

    invoke-direct {v12, v15, v13}, Li93/a;-><init>(CC)V

    invoke-static {v0, v12}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v0, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v12, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Character;

    invoke-virtual {v15}, Ljava/lang/Character;->charValue()C

    move-result v15

    int-to-byte v15, v15

    invoke-static {v15}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v15

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v12}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Li63/a;->a:Ljava/util/Set;

    new-instance v0, Li93/c;

    invoke-direct {v0, v3, v10}, Li93/a;-><init>(CC)V

    new-instance v10, Li93/c;

    const/16 v12, 0x41

    invoke-direct {v10, v12, v14}, Li93/a;-><init>(CC)V

    invoke-static {v0, v10}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v10, Li93/c;

    const/16 v12, 0x30

    const/16 v14, 0x39

    invoke-direct {v10, v12, v14}, Li93/a;-><init>(CC)V

    invoke-static {v0, v10}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Li63/a;->b:Ljava/util/Set;

    new-instance v0, Li93/c;

    const/16 v10, 0x66

    invoke-direct {v0, v3, v10}, Li93/a;-><init>(CC)V

    new-instance v3, Li93/c;

    const/16 v10, 0x46

    const/16 v12, 0x41

    invoke-direct {v3, v12, v10}, Li93/a;-><init>(CC)V

    invoke-static {v0, v3}, Lm83/s;->d1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v3, Li93/c;

    const/16 v12, 0x30

    const/16 v14, 0x39

    invoke-direct {v3, v12, v14}, Li93/a;-><init>(CC)V

    invoke-static {v0, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Li63/a;->c:Ljava/util/Set;

    const/16 v0, 0x2f

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const/16 v3, 0x3f

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/16 v10, 0x5b

    invoke-static {v10}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v10

    const/16 v12, 0x5d

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    move-object v14, v10

    move-object v10, v5

    move-object v5, v14

    move-object v14, v9

    move-object v15, v11

    move-object v9, v4

    move-object v11, v6

    move-object v6, v12

    move-object/from16 v4, v19

    move-object/from16 v19, v24

    move-object v12, v7

    move-object v7, v2

    move-object v2, v0

    move v0, v13

    move-object v13, v8

    move-object/from16 v8, v18

    move-object/from16 v18, v23

    filled-new-array/range {v1 .. v22}, [Ljava/lang/Character;

    move-result-object v2

    move-object v3, v2

    move-object v2, v7

    move-object v5, v10

    move-object v6, v11

    move-object v7, v12

    move-object v11, v15

    move-object/from16 v19, v4

    move-object/from16 v18, v8

    move-object v4, v9

    move-object v8, v13

    move-object v9, v14

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Character;

    invoke-virtual {v12}, Ljava/lang/Character;->charValue()C

    move-result v12

    int-to-byte v12, v12

    invoke-static {v12}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sput-object v10, Li63/a;->d:Ljava/util/ArrayList;

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move-object/from16 v3, v18

    move-object/from16 v16, v20

    move-object/from16 v17, v21

    move-object/from16 v10, v22

    move-object/from16 v14, v23

    move-object/from16 v15, v24

    filled-new-array/range {v1 .. v17}, [Ljava/lang/Character;

    move-result-object v1

    invoke-static {v1}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sput-object v1, Li63/a;->e:Ljava/util/Set;

    sget-object v1, Li63/a;->b:Ljava/util/Set;

    const/16 v2, 0x5e

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v25

    const/16 v2, 0x60

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v27

    const/16 v2, 0x7c

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v28

    move-object/from16 v26, v20

    move-object/from16 v29, v21

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    filled-new-array/range {v18 .. v29}, [Ljava/lang/Character;

    move-result-object v2

    move-object/from16 v4, v26

    move-object/from16 v3, v29

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    filled-new-array {v14, v15, v4, v3}, [Ljava/lang/Character;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Character;

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    int-to-byte v1, v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    sput-object v2, Li63/a;->f:Ljava/util/ArrayList;

    return-void
.end method

.method public static final a(B)Ljava/lang/String;
    .locals 4

    and-int/lit16 v0, p0, 0xff

    shr-int/lit8 v0, v0, 0x4

    const/16 v1, 0xa

    if-ltz v0, :cond_0

    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x30

    :goto_0
    int-to-char v0, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x41

    int-to-char v0, v0

    sub-int/2addr v0, v1

    goto :goto_0

    :goto_1
    and-int/lit8 p0, p0, 0xf

    if-ltz p0, :cond_1

    if-ge p0, v1, :cond_1

    add-int/lit8 p0, p0, 0x30

    :goto_2
    int-to-char p0, p0

    goto :goto_3

    :cond_1
    add-int/lit8 p0, p0, 0x41

    int-to-char p0, p0

    sub-int/2addr p0, v1

    goto :goto_2

    :goto_3
    const/4 v1, 0x3

    new-array v1, v1, [C

    const/16 v2, 0x25

    const/4 v3, 0x0

    aput-char v2, v1, v3

    const/4 v2, 0x1

    aput-char v0, v1, v2

    const/4 v0, 0x2

    aput-char p0, v1, v0

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static final b(C)I
    .locals 2

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v1, 0x3a

    if-ge p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x41

    if-gt v0, p0, :cond_1

    const/16 v0, 0x47

    if-ge p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_1
    const/16 v0, 0x61

    if-gt v0, p0, :cond_2

    const/16 v0, 0x67

    if-ge p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static final c(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 14

    move/from16 v1, p2

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_b

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2b

    const/16 v5, 0x25

    if-eq v3, v5, :cond_1

    if-eqz p3, :cond_0

    if-ne v3, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sub-int v3, v1, p1

    const/16 v6, 0xff

    if-le v3, v6, :cond_2

    div-int/lit8 v3, v3, 0x3

    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    if-le v2, p1, :cond_3

    invoke-virtual {v6, p0, p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    :cond_3
    const/4 v0, 0x0

    :goto_2
    if-ge v2, v1, :cond_a

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eqz p3, :cond_4

    if-ne v3, v4, :cond_4

    const/16 v3, 0x20

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    if-ne v3, v5, :cond_9

    if-nez v0, :cond_5

    sub-int v0, v1, v2

    div-int/lit8 v0, v0, 0x3

    new-array v0, v0, [B

    :cond_5
    const/4 v3, 0x0

    move v7, v3

    :goto_4
    if-ge v2, v1, :cond_8

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v8, v5, :cond_8

    add-int/lit8 v8, v2, 0x2

    const-string v9, ", in "

    if-ge v8, v1, :cond_7

    add-int/lit8 v10, v2, 0x1

    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    invoke-static {v11}, Li63/a;->b(C)I

    move-result v11

    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Li63/a;->b(C)I

    move-result v12

    const/4 v13, -0x1

    if-eq v11, v13, :cond_6

    if-eq v12, v13, :cond_6

    add-int/lit8 v8, v7, 0x1

    mul-int/lit8 v11, v11, 0x10

    add-int/2addr v11, v12

    int-to-byte v9, v11

    aput-byte v9, v0, v7

    add-int/lit8 v2, v2, 0x3

    move v7, v8

    goto :goto_4

    :cond_6
    new-instance v0, Lio/ktor/http/URLDecodeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Wrong HEX escape: %"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", at "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/ktor/http/URLDecodeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Lio/ktor/http/URLDecodeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Incomplete trailing HEX escape: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " at "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lio/ktor/http/URLDecodeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v8, Ljava/lang/String;

    move-object/from16 v9, p4

    invoke-direct {v8, v0, v3, v7, v9}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_2

    :cond_9
    move-object/from16 v9, p4

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_3

    :cond_a
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "sb.toString()"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_b
    if-nez p1, :cond_c

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ne v1, v2, :cond_c

    invoke-virtual {p0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_c
    invoke-virtual/range {p0 .. p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string v0, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "charset"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v2, v1}, Li63/a;->c(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(IIILjava/lang/String;Z)Ljava/lang/String;
    .locals 2

    and-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move p0, v1

    :cond_0
    and-int/lit8 v0, p2, 0x2

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    :cond_1
    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_2

    move p4, v1

    :cond_2
    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const-string v0, "<this>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, p0, p1, p4, p2}, Li63/a;->c(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v1

    const-string v2, "UTF_8.newEncoder()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, p0, v2, v3}, Lhg3/i;->H(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lv63/e;

    move-result-object p0

    new-instance v1, Lc0/u0;

    invoke-direct {v1, v0, p1}, Lc0/u0;-><init>(Ljava/lang/StringBuilder;Z)V

    invoke-static {p0, v1}, Li63/a;->h(Lv63/e;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final g(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v2, v3, :cond_5

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-nez p1, :cond_0

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_4

    :cond_0
    sget-object v4, Li63/a;->b:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Li63/a;->e:Ljava/util/Set;

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    const/16 v4, 0x25

    if-ne v3, v4, :cond_2

    add-int/lit8 v4, v2, 0x2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_2

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    sget-object v7, Li63/a;->c:Ljava/util/Set;

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_2
    const v4, 0xd800

    if-gt v4, v3, :cond_3

    const v4, 0xe000

    if-ge v3, v4, :cond_3

    const/4 v3, 0x2

    goto :goto_1

    :cond_3
    const/4 v3, 0x1

    :goto_1
    invoke-virtual {v1}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object v4

    const-string v5, "charset.newEncoder()"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/2addr v3, v2

    invoke-static {v4, p0, v2, v3}, Lhg3/i;->H(Ljava/nio/charset/CharsetEncoder;Ljava/lang/CharSequence;II)Lv63/e;

    move-result-object v2

    new-instance v4, La0/a1;

    const/16 v5, 0x1a

    invoke-direct {v4, v0, v5}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v4}, Li63/a;->h(Lv63/e;Lkotlin/jvm/functions/Function1;)V

    move v2, v3

    goto/16 :goto_0

    :cond_4
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final h(Lv63/e;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lw63/b;->b(Lv63/g;I)Lw63/a;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    :try_start_0
    iget v2, v1, Lio/seon/androidsdk/service/e1;->c:I

    iget v3, v1, Lio/seon/androidsdk/service/e1;->b:I

    if-le v2, v3, :cond_2

    if-eq v3, v2, :cond_1

    add-int/lit8 v2, v3, 0x1

    iput v2, v1, Lio/seon/androidsdk/service/e1;->b:I

    iget-object v2, v1, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/io/EOFException;

    const-string v2, "No readable bytes available."

    invoke-direct {p1, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-static {p0, v1}, Lw63/b;->c(Lv63/g;Lw63/a;)Lw63/a;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_0

    :goto_1
    return-void

    :catchall_1
    move-exception p1

    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_3

    invoke-static {p0, v1}, Lw63/b;->a(Lv63/g;Lw63/a;)V

    :cond_3
    throw p1
.end method
