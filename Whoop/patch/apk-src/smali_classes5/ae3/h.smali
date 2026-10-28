.class public abstract Lae3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lne3/l;

.field public static final b:Lne3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lne3/l;->z:Lne3/k;

    const-string v0, "\"\\"

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lae3/h;->a:Lne3/l;

    const-string v0, "\t ,="

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    sput-object v0, Lae3/h;->b:Lne3/l;

    return-void
.end method

.method public static final a(Lud3/x0;)Z
    .locals 4

    iget-object v0, p0, Lud3/x0;->w:Lud3/o0;

    iget-object v0, v0, Lud3/o0;->b:Ljava/lang/String;

    const-string v1, "HEAD"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lud3/x0;->z:I

    const/16 v1, 0x64

    if-lt v0, v1, :cond_1

    const/16 v1, 0xc8

    if-lt v0, v1, :cond_2

    :cond_1
    const/16 v1, 0xcc

    if-eq v0, v1, :cond_2

    const/16 v1, 0x130

    if-eq v0, v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lwd3/h;->e(Lud3/x0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_5

    iget-object p0, p0, Lud3/x0;->F:Lud3/d0;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p0, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    const/4 p0, 0x0

    :cond_3
    const-string v0, "chunked"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final b(Lne3/h;Ljava/util/ArrayList;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x0

    :goto_0
    move-object v3, v2

    :goto_1
    if-nez v3, :cond_0

    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    invoke-static {v0}, Lae3/h;->c(Lne3/h;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    move-result v4

    invoke-static {v0}, Lae3/h;->c(Lne3/h;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    invoke-virtual {v0}, Lne3/h;->o()Z

    move-result v0

    if-nez v0, :cond_1

    goto/16 :goto_6

    :cond_1
    new-instance v0, Lud3/m;

    sget-object v2, Lm83/z;->w:Lm83/z;

    invoke-direct {v0, v3, v2}, Lud3/m;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    invoke-static {v0}, Lwd3/f;->p(Lne3/h;)I

    move-result v6

    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    move-result v7

    if-nez v4, :cond_4

    if-nez v7, :cond_3

    invoke-virtual {v0}, Lne3/h;->o()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    new-instance v4, Lud3/m;

    invoke-static {v5}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "="

    invoke-static {v6, v7}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const-string v6, "singletonMap(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v3, v5}, Lud3/m;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Lwd3/f;->p(Lne3/h;)I

    move-result v7

    add-int/2addr v7, v6

    :goto_2
    if-nez v5, :cond_5

    invoke-static {v0}, Lae3/h;->c(Lne3/h;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    move-result v6

    if-nez v6, :cond_10

    invoke-static {v0}, Lwd3/f;->p(Lne3/h;)I

    move-result v6

    move v7, v6

    :cond_5
    if-eqz v7, :cond_10

    const/4 v6, 0x1

    if-le v7, v6, :cond_6

    goto/16 :goto_6

    :cond_6
    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_6

    :cond_7
    invoke-virtual {v0}, Lne3/h;->o()Z

    move-result v6

    if-nez v6, :cond_c

    const-wide/16 v8, 0x0

    invoke-virtual {v0, v8, v9}, Lne3/h;->s(J)B

    move-result v6

    const/16 v8, 0x22

    if-ne v6, v8, :cond_c

    invoke-virtual {v0}, Lne3/h;->readByte()B

    move-result v6

    if-ne v6, v8, :cond_b

    new-instance v6, Lne3/h;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    :goto_3
    sget-object v9, Lae3/h;->a:Lne3/l;

    invoke-virtual {v0, v9}, Lne3/h;->f0(Lne3/l;)J

    move-result-wide v9

    const-wide/16 v11, -0x1

    cmp-long v11, v9, v11

    if-nez v11, :cond_8

    :goto_4
    move-object v6, v2

    goto :goto_5

    :cond_8
    invoke-virtual {v0, v9, v10}, Lne3/h;->s(J)B

    move-result v11

    if-ne v11, v8, :cond_9

    invoke-virtual {v6, v0, v9, v10}, Lne3/h;->write(Lne3/h;J)V

    invoke-virtual {v0}, Lne3/h;->readByte()B

    invoke-virtual {v6}, Lne3/h;->S0()Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_9
    iget-wide v11, v0, Lne3/h;->x:J

    const-wide/16 v13, 0x1

    add-long v15, v9, v13

    cmp-long v11, v11, v15

    if-nez v11, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v6, v0, v9, v10}, Lne3/h;->write(Lne3/h;J)V

    invoke-virtual {v0}, Lne3/h;->readByte()B

    invoke-virtual {v6, v0, v13, v14}, Lne3/h;->write(Lne3/h;J)V

    goto :goto_3

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-static {v0}, Lae3/h;->c(Lne3/h;)Ljava/lang/String;

    move-result-object v6

    :goto_5
    if-nez v6, :cond_d

    goto :goto_6

    :cond_d
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v0}, Lae3/h;->e(Lne3/h;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v0}, Lne3/h;->o()Z

    move-result v5

    if-nez v5, :cond_f

    :goto_6
    return-void

    :cond_f
    move-object v5, v2

    goto/16 :goto_2

    :cond_10
    new-instance v6, Lud3/m;

    invoke-direct {v6, v3, v4}, Lud3/m;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v3, v5

    goto/16 :goto_1
.end method

.method public static final c(Lne3/h;)Ljava/lang/String;
    .locals 4

    sget-object v0, Lae3/h;->b:Lne3/l;

    invoke-virtual {p0, v0}, Lne3/h;->f0(Lne3/l;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    iget-wide v0, p0, Lne3/h;->x:J

    :cond_0
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0, v1, v2}, Lne3/h;->M0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final d(Lud3/t;Lud3/e0;Lud3/d0;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lud3/t;->w:Lud3/t;

    if-ne p0, v0, :cond_0

    return-void

    :cond_0
    sget-object p0, Lud3/s;->k:Ljava/util/regex/Pattern;

    invoke-static {p1, p2}, Lrg/j;->k(Lud3/e0;Lud3/d0;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    return-void
.end method

.method public static final e(Lne3/h;)Z
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lne3/h;->o()Z

    move-result v1

    if-nez v1, :cond_2

    const-wide/16 v1, 0x0

    invoke-virtual {p0, v1, v2}, Lne3/h;->s(J)B

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lne3/h;->readByte()B

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    if-eq v1, v2, :cond_1

    const/16 v2, 0x9

    if-ne v1, v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Lne3/h;->readByte()B

    goto :goto_0

    :cond_2
    return v0
.end method
