.class public final Lrw/g;
.super Low/z;
.source "SourceFile"


# static fields
.field public static final b:Lrw/g;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lrw/g;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrw/g;-><init>(I)V

    sput-object v0, Lrw/g;->b:Lrw/g;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lrw/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Lww/a;I)Low/p;
    .locals 2

    invoke-static {p1}, Le4/p;->e(I)I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lww/a;->T()V

    sget-object p0, Low/q;->w:Low/q;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-static {p1}, Lvl/b;->B(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Unexpected token: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Low/s;

    invoke-virtual {p0}, Lww/a;->x()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {p1, p0}, Low/s;-><init>(Ljava/lang/Boolean;)V

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Low/s;

    new-instance v0, Lqw/i;

    invoke-direct {v0, p0}, Lqw/i;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Low/s;-><init>(Ljava/lang/Number;)V

    return-object p1

    :cond_3
    new-instance p1, Low/s;

    invoke-virtual {p0}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Low/s;-><init>(Ljava/lang/String;)V

    return-object p1
.end method

.method public static e(Lww/b;Low/p;)V
    .locals 2

    if-eqz p1, :cond_c

    instance-of v0, p1, Low/q;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v0, p1, Low/s;

    if-eqz v0, :cond_5

    if-eqz v0, :cond_4

    check-cast p1, Low/s;

    iget-object v0, p1, Low/s;->w:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Low/s;->c()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p0, p1}, Lww/b;->o0(Ljava/lang/Number;)V

    return-void

    :cond_1
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Low/s;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    invoke-virtual {p0, p1}, Lww/b;->x0(Z)V

    return-void

    :cond_3
    invoke-virtual {p1}, Low/s;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Primitive: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    instance-of v0, p1, Low/o;

    if-eqz v0, :cond_8

    invoke-virtual {p0}, Lww/b;->beginArray()V

    if-eqz v0, :cond_7

    check-cast p1, Low/o;

    iget-object p1, p1, Low/o;->w:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Low/p;

    invoke-static {p0, v0}, Lrw/g;->e(Lww/b;Low/p;)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lww/b;->endArray()V

    return-void

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Array: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    instance-of v0, p1, Low/r;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lww/b;->beginObject()V

    if-eqz v0, :cond_a

    check-cast p1, Low/r;

    iget-object p1, p1, Low/r;->w:Lqw/n;

    invoke-virtual {p1}, Lqw/n;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Lqw/k;

    invoke-virtual {p1}, Lqw/k;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    move-object v0, p1

    check-cast v0, Lqw/l;

    invoke-virtual {v0}, Lqw/l;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Lqw/j;

    invoke-virtual {v0}, Lqw/l;->a()Lqw/m;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lww/b;->i(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Low/p;

    invoke-static {p0, v0}, Lrw/g;->e(Lww/b;Low/p;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p0}, Lww/b;->endObject()V

    return-void

    :cond_a
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Not a JSON Object: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Couldn\'t write "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    :goto_3
    invoke-virtual {p0}, Lww/b;->m()Lww/b;

    return-void
.end method


# virtual methods
.method public final b(Lww/a;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget v0, v1, Lrw/g;->a:I

    const-string v3, "null"

    const/4 v4, 0x5

    const/4 v5, 0x6

    const-string v6, "Lossy conversion from "

    const/4 v7, 0x2

    const-string v8, "Failed parsing \'"

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v11, 0x9

    const/4 v12, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Lww/a;->x()Z

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    return-object v0

    :pswitch_0
    :try_start_0
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_1
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_0

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_0

    :cond_0
    :try_start_1
    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    return-object v12

    :catch_1
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_2
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_1

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    const v3, 0xffff

    if-gt v0, v3, :cond_2

    const/16 v3, -0x8000

    if-lt v0, v3, :cond_2

    int-to-short v0, v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v12

    :goto_1
    return-object v12

    :cond_2
    new-instance v3, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v4, " to short; at path "

    invoke-static {v0, v6, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_2
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_3
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_3

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_2

    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v0
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    const/16 v3, 0xff

    if-gt v0, v3, :cond_4

    const/16 v3, -0x80

    if-lt v0, v3, :cond_4

    int-to-byte v0, v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    :goto_2
    return-object v12

    :cond_4
    new-instance v3, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v4, " to byte; at path "

    invoke-static {v0, v6, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :catch_3
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_4
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_5

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v12

    :goto_3
    return-object v12

    :pswitch_5
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_6

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_4

    :cond_6
    if-ne v0, v5, :cond_7

    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    goto :goto_4

    :cond_7
    invoke-virtual {v2}, Lww/a;->x()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    :goto_4
    return-object v12

    :pswitch_6
    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0}, Ljava/util/BitSet;-><init>()V

    invoke-virtual {v2}, Lww/a;->beginArray()V

    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v3

    move v6, v9

    :goto_5
    if-eq v3, v7, :cond_d

    invoke-static {v3}, Le4/p;->e(I)I

    move-result v8

    if-eq v8, v4, :cond_9

    if-eq v8, v5, :cond_9

    const/4 v11, 0x7

    if-ne v8, v11, :cond_8

    invoke-virtual {v2}, Lww/a;->x()Z

    move-result v3

    goto :goto_6

    :cond_8
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Invalid bitset value type: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lvl/b;->B(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; at path "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v3

    if-nez v3, :cond_a

    move v3, v9

    goto :goto_6

    :cond_a
    if-ne v3, v10, :cond_c

    move v3, v10

    :goto_6
    if-eqz v3, :cond_b

    invoke-virtual {v0, v6}, Ljava/util/BitSet;->set(I)V

    :cond_b
    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v3

    goto :goto_5

    :cond_c
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v4, "Invalid bitset value "

    const-string v5, ", expected 0 or 1; at path "

    invoke-static {v3, v4, v5}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    invoke-virtual {v2}, Lww/a;->endArray()V

    return-object v0

    :pswitch_7
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_e

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_9

    :cond_e
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/util/StringTokenizer;

    const-string v3, "_"

    invoke-direct {v2, v0, v3}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_f
    move-object v0, v12

    :goto_7
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_10
    move-object v3, v12

    :goto_8
    invoke-virtual {v2}, Ljava/util/StringTokenizer;->hasMoreElements()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-virtual {v2}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v12

    :cond_11
    if-nez v3, :cond_12

    if-nez v12, :cond_12

    new-instance v12, Ljava/util/Locale;

    invoke-direct {v12, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    goto :goto_9

    :cond_12
    if-nez v12, :cond_13

    new-instance v12, Ljava/util/Locale;

    invoke-direct {v12, v0, v3}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_13
    new-instance v2, Ljava/util/Locale;

    invoke-direct {v2, v0, v3, v12}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v2

    :goto_9
    return-object v12

    :pswitch_8
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_14

    invoke-virtual {v2}, Lww/a;->T()V

    goto/16 :goto_d

    :cond_14
    invoke-virtual {v2}, Lww/a;->beginObject()V

    move v14, v9

    move v15, v14

    move/from16 v16, v15

    move/from16 v17, v16

    move/from16 v18, v17

    move/from16 v19, v18

    :goto_a
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1b

    invoke-virtual {v2}, Lww/a;->nextName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v8, -0x1

    sparse-switch v6, :sswitch_data_0

    :goto_b
    move v3, v8

    goto :goto_c

    :sswitch_0
    const-string v3, "hourOfDay"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_b

    :cond_15
    move v3, v4

    goto :goto_c

    :sswitch_1
    const-string v6, "month"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_b

    :sswitch_2
    const-string v3, "year"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_b

    :cond_16
    const/4 v3, 0x3

    goto :goto_c

    :sswitch_3
    const-string v3, "second"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_b

    :cond_17
    move v3, v7

    goto :goto_c

    :sswitch_4
    const-string v3, "minute"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_b

    :cond_18
    move v3, v10

    goto :goto_c

    :sswitch_5
    const-string v3, "dayOfMonth"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_b

    :cond_19
    move v3, v9

    :cond_1a
    :goto_c
    packed-switch v3, :pswitch_data_1

    goto :goto_a

    :pswitch_9
    move/from16 v17, v5

    goto :goto_a

    :pswitch_a
    move v15, v5

    goto :goto_a

    :pswitch_b
    move v14, v5

    goto :goto_a

    :pswitch_c
    move/from16 v19, v5

    goto :goto_a

    :pswitch_d
    move/from16 v18, v5

    goto :goto_a

    :pswitch_e
    move/from16 v16, v5

    goto :goto_a

    :cond_1b
    invoke-virtual {v2}, Lww/a;->endObject()V

    new-instance v13, Ljava/util/GregorianCalendar;

    invoke-direct/range {v13 .. v19}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    move-object v12, v13

    :goto_d
    return-object v12

    :pswitch_f
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v3

    :try_start_4
    invoke-static {v3}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_4 .. :try_end_4} :catch_4

    return-object v0

    :catch_4
    move-exception v0

    new-instance v4, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v5, "\' as Currency; at path "

    invoke-static {v8, v3, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_10
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_1c

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_e

    :cond_1c
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v3

    :try_start_5
    invoke-static {v3}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v12
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_5

    :goto_e
    return-object v12

    :catch_5
    move-exception v0

    new-instance v4, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v5, "\' as UUID; at path "

    invoke-static {v8, v3, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_11
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_1d

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_f

    :cond_1d
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v12

    :goto_f
    return-object v12

    :pswitch_12
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_1e

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_10

    :cond_1e
    :try_start_6
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1f

    goto :goto_10

    :cond_1f
    new-instance v12, Ljava/net/URI;

    invoke-direct {v12, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_6

    :goto_10
    return-object v12

    :catch_6
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_13
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_20

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_11

    :cond_20
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_11

    :cond_21
    new-instance v12, Ljava/net/URL;

    invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    :goto_11
    return-object v12

    :pswitch_14
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_22

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_12

    :cond_22
    new-instance v12, Ljava/lang/StringBuffer;

    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    :goto_12
    return-object v12

    :pswitch_15
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "java-lang-class-unsupported"

    const-string v4, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_16
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_23

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_13

    :cond_23
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_13
    return-object v12

    :pswitch_17
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_24

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_14

    :cond_24
    new-instance v12, Lqw/i;

    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Lqw/i;-><init>(Ljava/lang/String;)V

    :goto_14
    return-object v12

    :pswitch_18
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_25

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_15

    :cond_25
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v3

    :try_start_7
    invoke-static {v3}, Lqw/g;->d(Ljava/lang/String;)V

    new-instance v12, Ljava/math/BigInteger;

    invoke-direct {v12, v3}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_7

    :goto_15
    return-object v12

    :catch_7
    move-exception v0

    new-instance v4, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v5, "\' as BigInteger; at path "

    invoke-static {v8, v3, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_19
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_26

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_16

    :cond_26
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v3

    :try_start_8
    invoke-static {v3}, Lqw/g;->i(Ljava/lang/String;)Ljava/math/BigDecimal;

    move-result-object v12
    :try_end_8
    .catch Ljava/lang/NumberFormatException; {:try_start_8 .. :try_end_8} :catch_8

    :goto_16
    return-object v12

    :catch_8
    move-exception v0

    new-instance v4, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v5, "\' as BigDecimal; at path "

    invoke-static {v8, v3, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    :pswitch_1a
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_27

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_17

    :cond_27
    const/16 v3, 0x8

    if-ne v0, v3, :cond_28

    invoke-virtual {v2}, Lww/a;->x()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v12

    goto :goto_17

    :cond_28
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v12

    :goto_17
    return-object v12

    :pswitch_1b
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_29

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_18

    :cond_29
    invoke-virtual {v2}, Lww/a;->nextString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v10, :cond_2a

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    :goto_18
    return-object v12

    :cond_2a
    new-instance v3, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    const-string v4, "Expecting character, got: "

    const-string v5, "; at "

    invoke-static {v4, v0, v5}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2, v10}, Lww/a;->k(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    :pswitch_1c
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_2b

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_19

    :cond_2b
    invoke-virtual {v2}, Lww/a;->nextDouble()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    :goto_19
    return-object v12

    :pswitch_1d
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_2c

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_1a

    :cond_2c
    invoke-virtual {v2}, Lww/a;->nextDouble()D

    move-result-wide v2

    double-to-float v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    :goto_1a
    return-object v12

    :pswitch_1e
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    if-ne v0, v11, :cond_2d

    invoke-virtual {v2}, Lww/a;->T()V

    goto :goto_1b

    :cond_2d
    :try_start_9
    invoke-virtual {v2}, Lww/a;->nextLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_9

    :goto_1b
    return-object v12

    :catch_9
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :pswitch_1f
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lww/a;->beginArray()V

    :goto_1c
    invoke-virtual {v2}, Lww/a;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2e

    :try_start_a
    invoke-virtual {v2}, Lww/a;->nextInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_1c

    :catch_a
    move-exception v0

    new-instance v2, Lcom/nimbusds/jose/shaded/gson/JsonSyntaxException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    :cond_2e
    invoke-virtual {v2}, Lww/a;->endArray()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-instance v3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-direct {v3, v2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;-><init>(I)V

    :goto_1d
    if-ge v9, v2, :cond_2f

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v3, v9, v4}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->set(II)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_1d

    :cond_2f
    return-object v3

    :pswitch_20
    invoke-virtual {v2}, Lww/a;->skipValue()V

    return-object v12

    :pswitch_21
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v0

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v3

    if-eqz v3, :cond_31

    if-eq v3, v7, :cond_30

    move-object v3, v12

    goto :goto_1e

    :cond_30
    invoke-virtual {v2}, Lww/a;->beginObject()V

    new-instance v3, Low/r;

    invoke-direct {v3}, Low/r;-><init>()V

    goto :goto_1e

    :cond_31
    invoke-virtual {v2}, Lww/a;->beginArray()V

    new-instance v3, Low/o;

    invoke-direct {v3}, Low/o;-><init>()V

    :goto_1e
    if-nez v3, :cond_32

    invoke-static {v2, v0}, Lrw/g;->d(Lww/a;I)Low/p;

    move-result-object v0

    goto/16 :goto_25

    :cond_32
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    :cond_33
    :goto_1f
    invoke-virtual {v2}, Lww/a;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3a

    instance-of v4, v3, Low/r;

    if-eqz v4, :cond_34

    invoke-virtual {v2}, Lww/a;->nextName()Ljava/lang/String;

    move-result-object v4

    goto :goto_20

    :cond_34
    move-object v4, v12

    :goto_20
    invoke-virtual {v2}, Lww/a;->o0()I

    move-result v5

    invoke-static {v5}, Le4/p;->e(I)I

    move-result v6

    if-eqz v6, :cond_36

    if-eq v6, v7, :cond_35

    move-object v6, v12

    goto :goto_21

    :cond_35
    invoke-virtual {v2}, Lww/a;->beginObject()V

    new-instance v6, Low/r;

    invoke-direct {v6}, Low/r;-><init>()V

    goto :goto_21

    :cond_36
    invoke-virtual {v2}, Lww/a;->beginArray()V

    new-instance v6, Low/o;

    invoke-direct {v6}, Low/o;-><init>()V

    :goto_21
    if-eqz v6, :cond_37

    move v8, v10

    goto :goto_22

    :cond_37
    move v8, v9

    :goto_22
    if-nez v6, :cond_38

    invoke-static {v2, v5}, Lrw/g;->d(Lww/a;I)Low/p;

    move-result-object v6

    :cond_38
    instance-of v5, v3, Low/o;

    if-eqz v5, :cond_39

    move-object v4, v3

    check-cast v4, Low/o;

    iget-object v4, v4, Low/o;->w:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    :cond_39
    move-object v5, v3

    check-cast v5, Low/r;

    iget-object v5, v5, Low/r;->w:Lqw/n;

    invoke-virtual {v5, v4, v6}, Lqw/n;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_23
    if-eqz v8, :cond_33

    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    move-object v3, v6

    goto :goto_1f

    :cond_3a
    instance-of v4, v3, Low/o;

    if-eqz v4, :cond_3b

    invoke-virtual {v2}, Lww/a;->endArray()V

    goto :goto_24

    :cond_3b
    invoke-virtual {v2}, Lww/a;->endObject()V

    :goto_24
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3c

    move-object v0, v3

    :goto_25
    return-object v0

    :cond_3c
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Low/p;

    goto :goto_1f

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x4667c053 -> :sswitch_5
        -0x400459ec -> :sswitch_4
        -0x3604bb8c -> :sswitch_3
        0x38883d -> :sswitch_2
        0x6342280 -> :sswitch_1
        0x3ab9c2c1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public final c(Lww/b;Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, Lrw/g;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Lww/b;->x0(Z)V

    return-void

    :pswitch_0
    check-cast p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    return-void

    :pswitch_1
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    :goto_0
    return-void

    :pswitch_2
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Number;->shortValue()S

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    :goto_1
    return-void

    :pswitch_3
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_2

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    :goto_2
    return-void

    :pswitch_4
    check-cast p2, Ljava/lang/Boolean;

    if-nez p2, :cond_3

    const-string p2, "null"

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_3
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_5
    check-cast p2, Ljava/lang/Boolean;

    if-nez p2, :cond_4

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_5

    :cond_4
    invoke-virtual {p1}, Lww/b;->F0()V

    invoke-virtual {p1}, Lww/b;->b()V

    iget-object p1, p1, Lww/b;->w:Ljava/io/Writer;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "true"

    goto :goto_4

    :cond_5
    const-string p2, "false"

    :goto_4
    invoke-virtual {p1, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_6
    check-cast p2, Ljava/util/BitSet;

    invoke-virtual {p1}, Lww/b;->beginArray()V

    invoke-virtual {p2}, Ljava/util/BitSet;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v0, :cond_6

    invoke-virtual {p2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lww/b;->b0(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_6
    invoke-virtual {p1}, Lww/b;->endArray()V

    return-void

    :pswitch_7
    check-cast p2, Ljava/util/Locale;

    if-nez p2, :cond_7

    const/4 p2, 0x0

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_7
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_8
    check-cast p2, Ljava/util/Calendar;

    if-nez p2, :cond_8

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_8

    :cond_8
    invoke-virtual {p1}, Lww/b;->beginObject()V

    const-string v0, "year"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    const-string v0, "month"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    const-string v0, "dayOfMonth"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    const-string v0, "hourOfDay"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/16 v0, 0xb

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    const-string v0, "minute"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/16 v0, 0xc

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    const-string v0, "second"

    invoke-virtual {p1, v0}, Lww/b;->i(Ljava/lang/String;)V

    const/16 v0, 0xd

    invoke-virtual {p2, v0}, Ljava/util/Calendar;->get(I)I

    move-result p2

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    invoke-virtual {p1}, Lww/b;->endObject()V

    :goto_8
    return-void

    :pswitch_9
    check-cast p2, Ljava/util/Currency;

    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_a
    check-cast p2, Ljava/util/UUID;

    if-nez p2, :cond_9

    const/4 p2, 0x0

    goto :goto_9

    :cond_9
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_9
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_b
    check-cast p2, Ljava/net/InetAddress;

    if-nez p2, :cond_a

    const/4 p2, 0x0

    goto :goto_a

    :cond_a
    invoke-virtual {p2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object p2

    :goto_a
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_c
    check-cast p2, Ljava/net/URI;

    if-nez p2, :cond_b

    const/4 p2, 0x0

    goto :goto_b

    :cond_b
    invoke-virtual {p2}, Ljava/net/URI;->toASCIIString()Ljava/lang/String;

    move-result-object p2

    :goto_b
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_d
    check-cast p2, Ljava/net/URL;

    if-nez p2, :cond_c

    const/4 p2, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {p2}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object p2

    :goto_c
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_e
    check-cast p2, Ljava/lang/StringBuffer;

    if-nez p2, :cond_d

    const/4 p2, 0x0

    goto :goto_d

    :cond_d
    invoke-virtual {p2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_d
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_f
    check-cast p2, Ljava/lang/Class;

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempted to serialize java.lang.Class: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ". Forgot to register a type adapter?\nSee "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "java-lang-class-unsupported"

    const-string v1, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_10
    check-cast p2, Ljava/lang/StringBuilder;

    if-nez p2, :cond_e

    const/4 p2, 0x0

    goto :goto_e

    :cond_e
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_e
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_11
    check-cast p2, Lqw/i;

    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    return-void

    :pswitch_12
    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    return-void

    :pswitch_13
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    return-void

    :pswitch_14
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_15
    check-cast p2, Ljava/lang/Character;

    if-nez p2, :cond_f

    const/4 p2, 0x0

    goto :goto_f

    :cond_f
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_f
    invoke-virtual {p1, p2}, Lww/b;->p0(Ljava/lang/String;)V

    return-void

    :pswitch_16
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_10

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_10

    :cond_10
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lww/b;->a0(D)V

    :goto_10
    return-void

    :pswitch_17
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_11

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_12

    :cond_11
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_12

    goto :goto_11

    :cond_12
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    :goto_11
    invoke-virtual {p1, p2}, Lww/b;->o0(Ljava/lang/Number;)V

    :goto_12
    return-void

    :pswitch_18
    check-cast p2, Ljava/lang/Number;

    if-nez p2, :cond_13

    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    goto :goto_13

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lww/b;->b0(J)V

    :goto_13
    return-void

    :pswitch_19
    check-cast p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    invoke-virtual {p1}, Lww/b;->beginArray()V

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_14
    if-ge v1, v0, :cond_14

    invoke-virtual {p2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {p1, v2, v3}, Lww/b;->b0(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_14

    :cond_14
    invoke-virtual {p1}, Lww/b;->endArray()V

    return-void

    :pswitch_1a
    invoke-virtual {p1}, Lww/b;->m()Lww/b;

    return-void

    :pswitch_1b
    check-cast p2, Low/p;

    invoke-static {p1, p2}, Lrw/g;->e(Lww/b;Low/p;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lrw/g;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "AnonymousOrNonStaticLocalClassAdapter"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
