.class public abstract Lmp/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final w:Ljava/lang/Object;

.field public static volatile x:Lmp/a;

.field public static final y:Lmp/a1;

.field public static final z:Lmp/a1;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lmp/b;->w:Ljava/lang/Object;

    new-instance v0, Lmp/a1;

    const-string v1, "id"

    invoke-direct {v0, v1}, Lmp/a1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lmp/b;->y:Lmp/a1;

    new-instance v0, Lmp/a1;

    const-string v1, "type"

    invoke-direct {v0, v1}, Lmp/a1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lmp/b;->z:Lmp/a1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(II)I
    .locals 4

    sget-object v0, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_3

    div-int v1, p0, p1

    mul-int v2, p1, v1

    sub-int v2, p0, v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    xor-int/2addr p0, p1

    sget-object v3, Lmp/o0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    shr-int/lit8 p0, p0, 0x1f

    or-int/lit8 p0, p0, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :pswitch_0
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    sub-int/2addr p1, v0

    sub-int/2addr v0, p1

    if-nez v0, :cond_1

    sget-object p0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    sget-object p0, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    goto :goto_1

    :cond_1
    if-lez v0, :cond_2

    goto :goto_0

    :pswitch_1
    if-lez p0, :cond_2

    goto :goto_0

    :pswitch_2
    if-gez p0, :cond_2

    :goto_0
    :pswitch_3
    add-int/2addr v1, p0

    :cond_2
    :goto_1
    :pswitch_4
    return v1

    :pswitch_5
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "mode was UNNECESSARY, but rounding was necessary"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string p1, "/ by zero"

    invoke-direct {p0, p1}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Lmp/p;)I
    .locals 3

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static varargs c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    if-nez v3, :cond_0

    const-string v0, "null"

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v8, v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "@"

    invoke-static {v0, v4, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.google.common.base.Strings"

    invoke-static {v3}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v6, "lenientToString"

    const-string v5, "Exception during lenientFormat for "

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "com.google.common.base.Strings"

    invoke-virtual/range {v3 .. v8}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, " threw "

    const-string v5, ">"

    const-string v6, "<"

    invoke-static {v6, v0, v4, v3, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    mul-int/lit8 v0, v0, 0x10

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/2addr v2, v0

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_3

    const-string v4, "%s"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    aget-object v1, p1, v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v4, 0x2

    move v9, v1

    move v1, v0

    move v0, v9

    goto :goto_2

    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-ge v1, v2, :cond_5

    const-string p0, " ["

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p0, v1, 0x1

    aget-object v0, p1, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_4
    array-length v0, p1

    if-ge p0, v0, :cond_4

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, p0, 0x1

    aget-object p0, p1, p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move p0, v0

    goto :goto_4

    :cond_4
    const/16 p0, 0x5d

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static d(Lmp/t0;)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lmp/t0;->e()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lmp/t0;->e()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Lmp/t0;->a(I)B

    move-result v2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_3

    const/16 v3, 0x27

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-eq v2, v3, :cond_1

    packed-switch v2, :pswitch_data_0

    const/16 v4, 0x20

    if-lt v2, v4, :cond_0

    const/16 v4, 0x7e

    if-gt v2, v4, :cond_0

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x6

    and-int/lit8 v3, v3, 0x3

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    ushr-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x7

    add-int/lit8 v3, v3, 0x30

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    and-int/lit8 v2, v2, 0x7

    add-int/lit8 v2, v2, 0x30

    int-to-char v2, v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_0
    const-string v2, "\\r"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_1
    const-string v2, "\\f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_2
    const-string v2, "\\v"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_3
    const-string v2, "\\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_4
    const-string v2, "\\t"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_5
    const-string v2, "\\b"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    const-string v2, "\\a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v2, "\\\\"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v2, "\\\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    const-string v2, "\\\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(II)V
    .locals 2

    if-ltz p0, :cond_1

    if-lt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index"

    if-ltz p0, :cond_3

    if-gez p1, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "negative size: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must be less than size (%s)"

    invoke-static {p1, p0}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "null value in entry: "

    const-string v1, "=null"

    invoke-static {v0, p0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "null key in entry: null="

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(Ljava/lang/StringBuilder;Ljava/util/Iterator;Lg73/a;)V
    .locals 2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lg73/a;->w(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    const-string v0, " : "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lg73/a;->w(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, ",\n  "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lg73/a;->w(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lg73/a;->w(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, p1, :cond_1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    return v1

    :cond_1
    return v0
.end method

.method public static i(Ljava/util/Comparator;Ljava/util/Collection;)Z
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Ljava/util/SortedSet;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/SortedSet;

    invoke-interface {p1}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lmp/w;->x:Lmp/w;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lmp/d0;

    if-eqz v0, :cond_2

    check-cast p1, Lmp/d0;

    check-cast p1, Lmp/t;

    iget-object p1, p1, Lmp/t;->z:Ljava/util/Comparator;

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static varargs j([[B)[B
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_0

    aget-object v3, p0, v1

    array-length v3, v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-array v1, v2, [B

    move v2, v0

    move v4, v2

    :goto_1
    if-ge v2, v3, :cond_1

    aget-object v5, p0, v2

    array-length v6, v5

    invoke-static {v5, v0, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public static final k(Lmp/d1;)Lmp/b1;
    .locals 10

    const-string v0, "Unidentifiable major type: "

    :try_start_0
    invoke-virtual {p0}, Lmp/d1;->k()Lmp/c1;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v1, :cond_10

    :try_start_1
    iget-byte v2, v1, Lmp/c1;->a:B

    iget-byte v1, v1, Lmp/c1;->b:B

    const/16 v3, -0x80

    const-wide/16 v4, 0x3e8

    const/4 v6, 0x0

    if-eq v2, v3, :cond_d

    const/16 v3, -0x60

    if-eq v2, v3, :cond_6

    const/16 v3, -0x40

    if-eq v2, v3, :cond_5

    const/16 v3, -0x20

    if-eq v2, v3, :cond_4

    if-eqz v2, :cond_2

    const/16 v3, 0x20

    if-eq v2, v3, :cond_2

    const/16 v3, 0x40

    if-eq v2, v3, :cond_1

    const/16 v3, 0x60

    if-ne v2, v3, :cond_0

    invoke-virtual {p0, v3}, Lmp/d1;->J(B)V

    new-instance v0, Ljava/lang/String;

    invoke-virtual {p0}, Lmp/d1;->a0()[B

    move-result-object p0

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, p0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p0

    int-to-long v2, p0

    invoke-static {v1, v2, v3}, Lmp/b;->l(BJ)V

    new-instance p0, Lmp/a1;

    invoke-direct {p0, v0}, Lmp/a1;-><init>(Ljava/lang/String;)V

    return-object p0

    :catch_0
    move-exception p0

    goto/16 :goto_5

    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhj;

    shr-int/lit8 v1, v2, 0x5

    and-int/lit8 v1, v1, 0x7

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_1
    :try_start_3
    invoke-virtual {p0, v3}, Lmp/d1;->J(B)V

    invoke-virtual {p0}, Lmp/d1;->a0()[B

    move-result-object p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    array-length v0, p0

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lmp/b;->l(BJ)V

    new-instance v1, Lmp/x0;

    invoke-static {v0, p0}, Lmp/t0;->l(I[B)Lmp/t0;

    move-result-object p0

    invoke-direct {v1, p0}, Lmp/x0;-><init>(Lmp/t0;)V

    return-object v1

    :cond_2
    invoke-virtual {p0}, Lmp/d1;->h()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p0, v2, v4

    if-lez p0, :cond_3

    move-wide v4, v2

    goto :goto_0

    :cond_3
    not-long v4, v2

    :goto_0
    invoke-static {v1, v4, v5}, Lmp/b;->l(BJ)V

    new-instance p0, Lmp/y0;

    invoke-direct {p0, v2, v3}, Lmp/y0;-><init>(J)V

    return-object p0

    :cond_4
    invoke-virtual {p0}, Lmp/d1;->m()Z

    move-result p0

    new-instance v0, Lmp/w0;

    invoke-direct {v0, p0}, Lmp/w0;-><init>(Z)V

    return-object v0

    :cond_5
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhj;

    const-string v0, "Tags are currently unsupported"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lmp/d1;->i()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-gtz v0, :cond_c

    invoke-static {v1, v2, v3}, Lmp/b;->l(BJ)V

    long-to-int v0, v2

    new-array v1, v0, [Lio/sentry/internal/debugmeta/c;

    const/4 v4, 0x0

    move v5, v6

    :goto_1
    int-to-long v7, v5

    cmp-long v7, v7, v2

    if-gez v7, :cond_9

    invoke-static {p0}, Lmp/b;->k(Lmp/d1;)Lmp/b1;

    move-result-object v7

    if-eqz v4, :cond_8

    invoke-interface {v7, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v8

    if-lez v8, :cond_7

    goto :goto_2

    :cond_7
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nCurrent key: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_2
    new-instance v4, Lio/sentry/internal/debugmeta/c;

    invoke-static {p0}, Lmp/b;->k(Lmp/d1;)Lmp/b1;

    move-result-object v8

    const/16 v9, 0x19

    invoke-direct {v4, v9, v7, v8}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    aput-object v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    move-object v4, v7

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/util/TreeMap;

    invoke-direct {p0}, Ljava/util/TreeMap;-><init>()V

    :goto_3
    if-ge v6, v0, :cond_b

    aget-object v2, v1, v6
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_1

    :try_start_7
    iget-object v3, v2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v3, Lmp/b1;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_0

    :try_start_8
    invoke-virtual {p0, v3}, Ljava/util/TreeMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_1

    if-nez v3, :cond_a

    :try_start_9
    iget-object v3, v2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast v3, Lmp/b1;

    iget-object v2, v2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast v2, Lmp/b1;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_9 .. :try_end_9} :catch_0

    :try_start_a
    invoke-virtual {p0, v3, v2}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_a
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v0, "Attempted to add duplicate key to canonical CBOR Map."

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance v0, Lmp/z0;

    invoke-static {p0}, Lmp/s;->b(Ljava/util/TreeMap;)Lmp/s;

    move-result-object p0

    invoke-direct {v0, p0}, Lmp/z0;-><init>(Lmp/s;)V

    return-object v0

    :cond_c
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhj;

    const-string v0, "Parser being asked to read a large CBOR map"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    invoke-virtual {p0}, Lmp/d1;->b()J

    move-result-wide v2

    cmp-long v0, v2, v4

    if-gtz v0, :cond_f

    invoke-static {v1, v2, v3}, Lmp/b;->l(BJ)V

    long-to-int v0, v2

    new-array v0, v0, [Lmp/b1;

    :goto_4
    int-to-long v4, v6

    cmp-long v1, v4, v2

    if-gez v1, :cond_e

    invoke-static {p0}, Lmp/b;->k(Lmp/d1;)Lmp/b1;

    move-result-object v1

    aput-object v1, v0, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_e
    new-instance p0, Lmp/v0;

    invoke-static {v0}, Lmp/n;->m([Ljava/lang/Object;)Lmp/y;

    move-result-object v0

    invoke-direct {p0, v0}, Lmp/v0;-><init>(Lmp/y;)V

    return-object p0

    :cond_f
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhj;

    const-string v0, "Parser being asked to read a large CBOR array"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    move-exception p0

    :goto_5
    new-instance v0, Lcom/google/android/gms/internal/fido/zzhj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fido/zzhj;-><init>(Ljava/lang/Exception;)V

    throw v0

    :cond_10
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhj;

    const-string v0, "Parser being asked to parse an empty input stream"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_2
    move-exception p0

    new-instance v0, Lcom/google/android/gms/internal/fido/zzhj;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/fido/zzhj;-><init>(Ljava/lang/Exception;)V

    throw v0
.end method

.method public static final l(BJ)V
    .locals 3

    const-string v0, "Integer value "

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-wide v1, 0x100000000L

    cmp-long p0, p1, v1

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v1, " after add info could have been represented in 0-4 additional bytes, but used 8"

    invoke-static {p1, p2, v0, v1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    const-wide/32 v1, 0x10000

    cmp-long p0, p1, v1

    if-ltz p0, :cond_1

    goto :goto_0

    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v1, " after add info could have been represented in 0-2 additional bytes, but used 4"

    invoke-static {p1, p2, v0, v1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_2
    const-wide/16 v1, 0x100

    cmp-long p0, p1, v1

    if-ltz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v1, " after add info could have been represented in 0-1 additional bytes, but used 2"

    invoke-static {p1, p2, v0, v1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_3
    const-wide/16 v1, 0x18

    cmp-long p0, p1, v1

    if-ltz p0, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance p0, Lcom/google/android/gms/internal/fido/zzhf;

    const-string v1, " after add info could have been represented in 0 additional bytes, but used 1"

    invoke-static {p1, p2, v0, v1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static m(III)V
    .locals 1

    if-ltz p0, :cond_1

    if-lt p1, p0, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    if-ltz p0, :cond_4

    if-gt p0, p2, :cond_4

    if-ltz p1, :cond_3

    if-le p1, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "end index (%s) must not be less than start index (%s)"

    invoke-static {p1, p0}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    :goto_1
    const-string p0, "end index"

    invoke-static {p1, p2, p0}, Lmp/b;->n(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_4
    const-string p1, "start index"

    invoke-static {p0, p2, p1}, Lmp/b;->n(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static n(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-gez p0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be greater than size (%s)"

    invoke-static {p1, p0}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "negative size: "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
