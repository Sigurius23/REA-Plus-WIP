.class public final Lz7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    packed-switch p1, :pswitch_data_0

    .line 1
    new-instance p1, Ldw/d;

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, -0x1

    .line 2
    invoke-direct {p1, v0, v1, v2}, Ldw/d;-><init>(DI)V

    .line 3
    sget-object v0, Ldw/a;->w:Ldw/a;

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lz7/a;->b:Ljava/lang/Object;

    .line 6
    iput-object v0, p0, Lz7/a;->c:Ljava/lang/Object;

    return-void

    .line 7
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lz7/a;->b:Ljava/lang/Object;

    .line 9
    invoke-static {p1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lz7/a;->d:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>([B)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lz7/a;->b:Ljava/lang/Object;

    .line 12
    new-instance p1, Ljg/r;

    invoke-direct {p1}, Ljg/r;-><init>()V

    iput-object p1, p0, Lz7/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lz7/a;FFLs83/c;)Ljava/lang/Object;
    .locals 11

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p3, Ln53/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Ln53/f;

    iget v1, v0, Ln53/f;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln53/f;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln53/f;

    invoke-direct {v0, p0, p3}, Ln53/f;-><init>(Lz7/a;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Ln53/f;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln53/f;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, Ln53/f;->E:I

    iget-wide p1, v0, Ln53/f;->F:J

    iget v2, v0, Ln53/f;->z:I

    iget v4, v0, Ln53/f;->y:F

    iget v5, v0, Ln53/f;->x:F

    iget-object v6, v0, Ln53/f;->w:Lz7/a;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move p3, v2

    move-wide v9, p1

    move p2, v4

    move p1, v5

    move-wide v4, v9

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v4, 0xc8

    const/16 p3, 0x32

    int-to-long v6, p3

    div-long/2addr v4, v6

    const/4 v2, 0x2

    int-to-long v6, v2

    div-long/2addr v4, v6

    const/4 v2, 0x0

    :goto_1
    iget v6, p0, Lz7/a;->a:I

    add-int/2addr v6, v3

    iput v6, p0, Lz7/a;->a:I

    int-to-float v6, v2

    sub-float v7, p2, p1

    mul-float/2addr v7, v6

    int-to-float v6, p3

    div-float/2addr v7, v6

    add-float/2addr v7, p1

    iget-object v6, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v6, Lec3/h2;

    new-instance v8, Ljava/lang/Float;

    invoke-direct {v8, v7}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x0

    invoke-virtual {v6, v7, v8}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iput-object p0, v0, Ln53/f;->w:Lz7/a;

    iput p1, v0, Ln53/f;->x:F

    iput p2, v0, Ln53/f;->y:F

    iput p3, v0, Ln53/f;->z:I

    iput-wide v4, v0, Ln53/f;->F:J

    iput v2, v0, Ln53/f;->E:I

    iput v3, v0, Ln53/f;->I:I

    invoke-static {v4, v5, v0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_3

    return-object v1

    :cond_3
    move-object v6, p0

    move p0, v2

    :goto_2
    if-eq p0, p3, :cond_4

    add-int/lit8 v2, p0, 0x1

    move-object p0, v6

    goto :goto_1

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static e(Lz7/a;Ljava/lang/String;II)V
    .locals 1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    iget p2, p0, Lz7/a;->a:I

    :cond_0
    new-instance p0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    const-string p3, "Unexpected JSON token at offset "

    const-string v0, "; "

    invoke-static {p2, p3, v0, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method


# virtual methods
.method public b(C)V
    .locals 4

    iget-object v0, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, [B

    iget v1, p0, Lz7/a;->a:I

    aget-byte v0, v0, v1

    int-to-char v0, v0

    if-ne v0, p1, :cond_0

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz7/a;->a:I

    return-void

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unexpected char `"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, "` expected `"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x60

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x4

    invoke-static {p0, p1, v1, v0}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public c()V
    .locals 4

    const/16 v0, 0x5d

    invoke-virtual {p0, v0}, Lz7/a;->b(C)V

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    iget-object v1, v0, Ljg/r;->a:Ljava/util/List;

    invoke-static {v1}, Ldp/d;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljg/q;

    sget-object v2, Ljg/q;->x:Ljg/q;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    sget-object v2, Ljg/q;->y:Ljg/q;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    iget v2, p0, Lz7/a;->a:I

    sub-int/2addr v2, v3

    if-eqz v1, :cond_2

    new-instance v1, Ljg/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Ljg/c;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    const-string v0, "Unexpected close `]` encountered"

    const/4 v1, 0x4

    invoke-static {p0, v0, v2, v1}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public d()V
    .locals 4

    const/16 v0, 0x7d

    invoke-virtual {p0, v0}, Lz7/a;->b(C)V

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    iget-object v1, v0, Ljg/r;->a:Ljava/util/List;

    invoke-static {v1}, Ldp/d;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljg/q;

    sget-object v2, Ljg/q;->z:Ljg/q;

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    sget-object v2, Ljg/q;->E:Ljg/q;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    iget v2, p0, Lz7/a;->a:I

    sub-int/2addr v2, v3

    if-eqz v1, :cond_2

    new-instance v1, Ljg/c;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljg/c;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    const-string v0, "Unexpected close `}` encountered"

    const/4 v1, 0x4

    invoke-static {p0, v0, v2, v1}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    const/4 v0, 0x0

    throw v0
.end method

.method public f()Ljava/lang/Long;
    .locals 11

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lz7/a;->c:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    long-to-double v0, v0

    iget-object v4, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v4, Ldw/d;

    iget v5, v4, Ldw/d;->b:I

    const/4 v6, -0x1

    const-wide/16 v7, 0x0

    if-ne v5, v6, :cond_0

    move-wide v5, v7

    goto :goto_0

    :cond_0
    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    int-to-double v5, v5

    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    iget-wide v9, v4, Ldw/d;->a:D

    mul-double/2addr v5, v9

    :goto_0
    const-wide/16 v9, 0x3e8

    long-to-double v9, v9

    mul-double/2addr v5, v9

    add-double/2addr v5, v0

    long-to-double v0, v2

    sub-double/2addr v5, v0

    cmpg-double v0, v5, v7

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const-wide v0, 0x408f400000000000L    # 1000.0

    div-double/2addr v5, v0

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-long v0, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Ljava/lang/Character;
    .locals 2

    :goto_0
    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    invoke-static {v0}, Lva3/d;->i(C)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lz7/a;->a:I

    add-int/2addr v0, v1

    iput v0, p0, Lz7/a;->a:I

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v0

    return-object v0
.end method

.method public h()C
    .locals 2

    invoke-virtual {p0}, Lz7/a;->m()C

    move-result v0

    iget v1, p0, Lz7/a;->a:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz7/a;->a:I

    return v0
.end method

.method public i()Lcom/squareup/wire/n;
    .locals 6

    invoke-virtual {p0}, Lz7/a;->k()Lcom/squareup/wire/n;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lz7/a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v1, Ljg/r;

    iget-object v2, v1, Ljg/r;->b:Ljava/util/List;

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget-object v5, v1, Ljg/r;->a:Ljava/util/List;

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/List;->clear()V

    return-object v0
.end method

.method public j(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, Lds/w;

    invoke-virtual {v0, p1}, Lds/n;->k(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public k()Lcom/squareup/wire/n;
    .locals 2

    iget-object v0, p0, Lz7/a;->c:Ljava/lang/Object;

    check-cast v0, Lcom/squareup/wire/n;

    if-nez v0, :cond_6

    :try_start_0
    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    iget-object v0, v0, Ljg/r;->a:Ljava/util/List;

    invoke-static {v0}, Ldp/d;->b0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljg/q;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lz7/a;->v()Lcom/squareup/wire/n;

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lz7/a;->x()Lcom/squareup/wire/n;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lz7/a;->w()Lcom/squareup/wire/n;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lz7/a;->u()Lcom/squareup/wire/n;

    move-result-object v0

    goto :goto_0

    :cond_4
    invoke-virtual {p0}, Lz7/a;->t()Lcom/squareup/wire/n;

    move-result-object v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lz7/a;->r()Lcom/squareup/wire/n;

    move-result-object v0
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/serde/DeserializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iput-object v0, p0, Lz7/a;->c:Ljava/lang/Object;

    return-object v0

    :goto_1
    new-instance v1, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    invoke-direct {v1, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/Exception;)V

    throw v1

    :goto_2
    throw v0

    :cond_6
    return-object v0
.end method

.method public l()Ljava/lang/Character;
    .locals 2

    iget-object v0, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, [B

    iget v1, p0, Lz7/a;->a:I

    invoke-static {v1, v0}, Lm83/n;->w0(I[B)Ljava/lang/Byte;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    int-to-char v0, v0

    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public m()C
    .locals 2

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected EOF"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public n(Ljava/lang/StringBuilder;)V
    .locals 2

    :goto_0
    sget-object v0, Ljg/d;->a:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public o(Ljava/lang/String;Lcom/squareup/wire/n;)V
    .locals 1

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p2, v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Lz7/a;->b(C)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p()Ljg/m;
    .locals 4

    invoke-virtual {p0}, Lz7/a;->m()C

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lz7/a;->q()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v1, Ljg/r;

    new-instance v2, Ljg/c;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Ljg/c;-><init>(I)V

    iget-object v1, v1, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljg/m;

    invoke-direct {v1, v0}, Ljg/m;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_0
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    const-string v1, "\""

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public q()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lz7/a;->b:Ljava/lang/Object;

    check-cast v0, [B

    const/16 v1, 0x22

    invoke-virtual {p0, v1}, Lz7/a;->b(C)V

    iget v2, p0, Lz7/a;->a:I

    invoke-virtual {p0}, Lz7/a;->m()C

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x1

    if-eq v3, v1, :cond_6

    const/16 v9, 0x60

    const/16 v10, 0x5c

    if-ne v3, v10, :cond_3

    invoke-virtual {p0}, Lz7/a;->h()C

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v3

    if-eq v3, v1, :cond_2

    const/16 v5, 0x2f

    if-eq v3, v5, :cond_2

    if-eq v3, v10, :cond_2

    const/16 v5, 0x62

    if-eq v3, v5, :cond_2

    const/16 v5, 0x66

    if-eq v3, v5, :cond_2

    const/16 v5, 0x6e

    if-eq v3, v5, :cond_2

    const/16 v5, 0x72

    if-eq v3, v5, :cond_2

    const/16 v5, 0x74

    if-eq v3, v5, :cond_2

    const/16 v5, 0x75

    if-ne v3, v5, :cond_1

    iget v3, p0, Lz7/a;->a:I

    add-int/lit8 v5, v3, 0x4

    array-length v9, v0

    if-ge v5, v9, :cond_0

    iput v5, p0, Lz7/a;->a:I

    goto :goto_1

    :cond_0
    const-string v0, "Unexpected EOF reading escaped unicode string"

    invoke-static {p0, v0, v3, v7}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v6

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid escape character: `"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lz7/a;->a:I

    sub-int/2addr v1, v8

    invoke-static {p0, v0, v1, v7}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v6

    :cond_2
    :goto_1
    move v5, v8

    goto :goto_3

    :cond_3
    sget-object v7, Ljg/d;->a:Ljava/util/Set;

    if-ltz v3, :cond_5

    const/16 v7, 0x20

    if-lt v3, v7, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected control character: `"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p0, v0, v4, v1}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v6

    :cond_5
    :goto_2
    iget v3, p0, Lz7/a;->a:I

    add-int/2addr v3, v8

    iput v3, p0, Lz7/a;->a:I

    :goto_3
    invoke-virtual {p0}, Lz7/a;->m()C

    move-result v3

    goto/16 :goto_0

    :cond_6
    iget v3, p0, Lz7/a;->a:I

    invoke-static {v2, v3, v7, v0}, Lyb3/y;->C(III[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1}, Lz7/a;->b(C)V

    if-eqz v5, :cond_8

    :try_start_0
    invoke-static {v0}, Ljg/d;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    const-string v0, "Invalid escaped string"

    :cond_7
    sub-int/2addr v2, v8

    invoke-static {p0, v0, v2, v7}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v6

    :cond_8
    return-object v0
.end method

.method public r()Lcom/squareup/wire/n;
    .locals 9

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v2

    const/16 v3, 0x7b

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v3}, Lz7/a;->b(C)V

    new-instance v1, Liz0/d;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, Liz0/d;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Ljg/h;->c:Ljg/h;

    return-object v0

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v2

    const/16 v3, 0x5b

    if-ne v2, v3, :cond_3

    invoke-virtual {p0, v3}, Lz7/a;->b(C)V

    new-instance v1, Liz0/d;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Liz0/d;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v0, Ljg/g;->c:Ljg/g;

    return-object v0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v0

    const/16 v2, 0x22

    if-ne v0, v2, :cond_5

    new-instance v0, Ljg/p;

    invoke-virtual {p0}, Lz7/a;->q()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljg/p;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    :goto_2
    const/4 v0, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x6e

    const/16 v4, 0x66

    const/16 v5, 0x74

    const/4 v6, 0x1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v7

    if-eq v7, v5, :cond_16

    :goto_3
    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v7

    if-eq v7, v4, :cond_16

    :goto_4
    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v7

    if-ne v7, v3, :cond_9

    goto/16 :goto_a

    :cond_9
    :goto_5
    const/16 v3, 0x2d

    if-nez v1, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v4

    if-eq v4, v3, :cond_d

    :goto_6
    new-instance v4, Li93/c;

    const/16 v5, 0x30

    const/16 v7, 0x39

    invoke-direct {v4, v5, v7}, Li93/a;-><init>(CC)V

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v5

    invoke-virtual {v4, v5}, Li93/c;->e(C)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_7

    :cond_b
    if-nez v1, :cond_c

    sget-object v0, Ljg/k;->c:Ljg/k;

    return-object v0

    :cond_c
    const-string v7, "false"

    const-string v8, "<number>"

    const-string v2, "{"

    const-string v3, "["

    const-string v4, "\""

    const-string v5, "null"

    const-string v6, "true"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v4

    if-nez v4, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v4}, Ljava/lang/Character;->charValue()C

    move-result v4

    if-ne v4, v3, :cond_f

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_f
    :goto_8
    invoke-virtual {p0, v1}, Lz7/a;->n(Ljava/lang/StringBuilder;)V

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v3

    if-nez v3, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_11

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lz7/a;->n(Ljava/lang/StringBuilder;)V

    :cond_11
    :goto_9
    sget-object v3, Ljg/d;->b:Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v4

    invoke-static {v3, v4}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v3, Ljg/d;->c:Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v4

    invoke-static {v3, v4}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {p0}, Lz7/a;->h()C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_12
    invoke-virtual {p0, v1}, Lz7/a;->n(Ljava/lang/StringBuilder;)V

    :cond_13
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_14

    move v2, v6

    :cond_14
    iget v3, p0, Lz7/a;->a:I

    if-eqz v2, :cond_15

    new-instance v0, Ljg/o;

    invoke-direct {v0, v1}, Ljg/o;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_15
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid number, expected `-` || 0..9, found `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lz7/a;->l()Ljava/lang/Character;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v2, 0x60

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {p0, v1, v3, v2}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v0

    :cond_16
    :goto_a
    invoke-virtual {p0}, Lz7/a;->m()C

    move-result v1

    if-eq v1, v4, :cond_19

    if-eq v1, v3, :cond_18

    if-ne v1, v5, :cond_17

    new-instance v0, Ljg/i;

    invoke-direct {v0, v6}, Ljg/i;-><init>(Z)V

    const-string v1, "true"

    invoke-virtual {p0, v1, v0}, Lz7/a;->o(Ljava/lang/String;Lcom/squareup/wire/n;)V

    return-object v0

    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unable to handle keyword starting with \'"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {p0, v1, v2, v3}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    throw v0

    :cond_18
    const-string v0, "null"

    sget-object v1, Ljg/n;->c:Ljg/n;

    invoke-virtual {p0, v0, v1}, Lz7/a;->o(Ljava/lang/String;Lcom/squareup/wire/n;)V

    return-object v1

    :cond_19
    new-instance v0, Ljg/i;

    invoke-direct {v0, v2}, Ljg/i;-><init>(Z)V

    const-string v1, "false"

    invoke-virtual {p0, v1, v0}, Lz7/a;->o(Ljava/lang/String;Lcom/squareup/wire/n;)V

    return-object v0
.end method

.method public s()V
    .locals 3

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    iget-object v1, v0, Ljg/r;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p0}, Lz7/a;->i()Lcom/squareup/wire/n;

    :goto_0
    iget-object v2, v0, Ljg/r;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v1, :cond_0

    invoke-virtual {p0}, Lz7/a;->i()Lcom/squareup/wire/n;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t()Lcom/squareup/wire/n;
    .locals 3

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lz7/a;->c()V

    sget-object v0, Ljg/j;->c:Ljg/j;

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    new-instance v1, Liz0/d;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Liz0/d;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lz7/a;->r()Lcom/squareup/wire/n;

    move-result-object v0

    return-object v0
.end method

.method public u()Lcom/squareup/wire/n;
    .locals 3

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x5d

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lz7/a;->c()V

    sget-object v0, Ljg/j;->c:Ljg/j;

    return-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v2}, Lz7/a;->b(C)V

    invoke-virtual {p0}, Lz7/a;->r()Lcom/squareup/wire/n;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v1, ","

    const-string v2, "]"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public v()Lcom/squareup/wire/n;
    .locals 3

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x3a

    if-ne v1, v2, :cond_0

    invoke-virtual {p0, v2}, Lz7/a;->b(C)V

    iget-object v0, p0, Lz7/a;->d:Ljava/lang/Object;

    check-cast v0, Ljg/r;

    new-instance v1, Ljg/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljg/c;-><init>(I)V

    iget-object v0, v0, Ljg/r;->b:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lz7/a;->r()Lcom/squareup/wire/n;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, ":"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public w()Lcom/squareup/wire/n;
    .locals 3

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lz7/a;->d()V

    sget-object v0, Ljg/l;->c:Ljg/l;

    return-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x22

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lz7/a;->p()Ljg/m;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v1, "\""

    const-string v2, "}"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public x()Lcom/squareup/wire/n;
    .locals 3

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_1

    invoke-virtual {p0}, Lz7/a;->d()V

    sget-object v0, Ljg/l;->c:Ljg/l;

    return-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v1

    const/16 v2, 0x2c

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v2}, Lz7/a;->b(C)V

    invoke-virtual {p0}, Lz7/a;->g()Ljava/lang/Character;

    invoke-virtual {p0}, Lz7/a;->p()Ljg/m;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v1, ","

    const-string v2, "}"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lz7/a;->y(Ljava/lang/Character;[Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public varargs y(Ljava/lang/Character;[Ljava/lang/String;)V
    .locals 7

    array-length v0, p2

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    const-string v0, " one of"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    new-instance v5, Ljg/c;

    const/4 v1, 0x0

    invoke-direct {v5, v1}, Ljg/c;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v6}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "found `"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "`, expected"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x6

    invoke-static {p0, p1, p2, v0}, Lz7/a;->e(Lz7/a;Ljava/lang/String;II)V

    const/4 p1, 0x0

    throw p1
.end method
