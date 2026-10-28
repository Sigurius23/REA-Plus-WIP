.class public abstract Lbj/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;

.field public static final c:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "a"

    const-string v1, "s"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/b;->a:Lwe/o;

    const-string v0, "r"

    const-string v2, "e"

    const-string v3, "o"

    filled-new-array {v1, v2, v3, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/b;->b:Lwe/o;

    const-string v0, "sw"

    const-string v1, "t"

    const-string v2, "fc"

    const-string v4, "sc"

    filled-new-array {v2, v4, v0, v1, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/b;->c:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lso/q;
    .locals 14

    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    sget-object v3, Lbj/b;->a:Lwe/o;

    invoke-virtual {p0, v3}, Lcj/d;->m(Lwe/o;)I

    move-result v3

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_7

    if-eq v3, v6, :cond_0

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcj/d;->beginObject()V

    move-object v8, v0

    move-object v9, v8

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    :goto_1
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Lbj/b;->c:Lwe/o;

    invoke-virtual {p0, v1}, Lcj/d;->m(Lwe/o;)I

    move-result v1

    if-eqz v1, :cond_5

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    const/4 v3, 0x4

    if-eq v1, v3, :cond_1

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_1

    :cond_1
    invoke-static {p0, p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v12

    goto :goto_1

    :cond_2
    invoke-static {p0, p1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v11

    goto :goto_1

    :cond_3
    invoke-static {p0, p1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v10

    goto :goto_1

    :cond_4
    invoke-static {p0, p1}, Lhg3/i;->b0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v9

    goto :goto_1

    :cond_5
    invoke-static {p0, p1}, Lhg3/i;->b0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v8

    goto :goto_1

    :cond_6
    invoke-virtual {p0}, Lcj/d;->endObject()V

    new-instance v7, Lb30/m;

    const/16 v13, 0x1b

    invoke-direct/range {v7 .. v13}, Lb30/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v1, v7

    goto :goto_0

    :cond_7
    invoke-virtual {p0}, Lcj/d;->beginObject()V

    const/4 v2, 0x0

    move-object v3, v0

    move-object v7, v3

    move-object v8, v7

    move v9, v2

    :goto_2
    invoke-virtual {p0}, Lcj/d;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_e

    sget-object v10, Lbj/b;->b:Lwe/o;

    invoke-virtual {p0, v10}, Lcj/d;->m(Lwe/o;)I

    move-result v10

    if-eqz v10, :cond_d

    if-eq v10, v6, :cond_c

    if-eq v10, v5, :cond_b

    if-eq v10, v4, :cond_8

    invoke-virtual {p0}, Lcj/d;->s()V

    invoke-virtual {p0}, Lcj/d;->skipValue()V

    goto :goto_2

    :cond_8
    invoke-virtual {p0}, Lcj/d;->nextInt()I

    move-result v9

    if-eq v9, v6, :cond_a

    if-eq v9, v5, :cond_a

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Unsupported text range units: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p1, v9}, Lqi/i;->a(Ljava/lang/String;)V

    :cond_9
    move v9, v5

    goto :goto_2

    :cond_a
    if-ne v9, v6, :cond_9

    move v9, v6

    goto :goto_2

    :cond_b
    invoke-static {p0, p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v8

    goto :goto_2

    :cond_c
    invoke-static {p0, p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v7

    goto :goto_2

    :cond_d
    invoke-static {p0, p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v3

    goto :goto_2

    :cond_e
    invoke-virtual {p0}, Lcj/d;->endObject()V

    if-nez v3, :cond_f

    if-eqz v7, :cond_f

    new-instance v3, Lxi/a;

    new-instance v4, Lej/a;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v4, v2}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x2

    invoke-direct {v3, v2, v4}, Lxi/a;-><init>(Ljava/util/List;I)V

    :cond_f
    new-instance v2, Lz7/a;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v3, v2, Lz7/a;->b:Ljava/lang/Object;

    iput-object v7, v2, Lz7/a;->c:Ljava/lang/Object;

    iput-object v8, v2, Lz7/a;->d:Ljava/lang/Object;

    iput v9, v2, Lz7/a;->a:I

    goto/16 :goto_0

    :cond_10
    invoke-virtual {p0}, Lcj/d;->endObject()V

    new-instance p0, Lso/q;

    invoke-direct {p0, v1, v2}, Lso/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method
