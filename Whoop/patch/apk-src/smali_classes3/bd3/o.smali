.class public final Lbd3/o;
.super Lva3/d;
.source "SourceFile"


# instance fields
.field public final a:Lbd3/a;

.field public final b:Lcd3/f;


# direct methods
.method public constructor <init>(Lbd3/a;Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/o;->a:Lbd3/a;

    iget-object p1, p2, Lad3/c;->b:Lcd3/f;

    iput-object p1, p0, Lbd3/o;->b:Lcd3/f;

    return-void
.end method


# virtual methods
.method public final decodeByte()B
    .locals 5

    iget-object v0, p0, Lbd3/o;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-static {v1}, Ls7/a;->q(Ljava/lang/String;)B

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    const-string v2, "Failed to parse type \'UByte\' for input \'"

    const/16 v3, 0x27

    invoke-static {v3, v2, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v4
.end method

.method public final decodeElementIndex(Lyc3/g;)I
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "unsupported"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final decodeInt()I
    .locals 5

    iget-object v0, p0, Lbd3/o;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0xa

    invoke-static {v3, v1}, Ls7/a;->r(ILjava/lang/String;)Ll83/t;

    move-result-object v3

    if-eqz v3, :cond_0

    iget v0, v3, Ll83/t;->w:I

    return v0

    :cond_0
    invoke-static {v1}, Lyb3/y;->H(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v3, "Failed to parse type \'UInt\' for input \'"

    const/16 v4, 0x27

    invoke-static {v4, v3, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v2, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final decodeLong()J
    .locals 5

    iget-object v0, p0, Lbd3/o;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Ls7/a;->s(Ljava/lang/String;)Ll83/v;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-wide v0, v3, Ll83/v;->w:J

    return-wide v0

    :cond_0
    invoke-static {v1}, Lyb3/y;->H(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v3, "Failed to parse type \'ULong\' for input \'"

    const/16 v4, 0x27

    invoke-static {v4, v3, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v2, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final decodeShort()S
    .locals 5

    iget-object v0, p0, Lbd3/o;->a:Lbd3/a;

    invoke-virtual {v0}, Lbd3/a;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "<this>"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0xa

    invoke-static {v3, v1}, Ls7/a;->r(ILjava/lang/String;)Ll83/t;

    move-result-object v3

    if-eqz v3, :cond_1

    iget v3, v3, Ll83/t;->w:I

    const v4, 0xffff

    invoke-static {v3, v4}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v4

    if-lez v4, :cond_0

    goto :goto_0

    :cond_0
    int-to-short v3, v3

    new-instance v4, Ll83/y;

    invoke-direct {v4, v3}, Ll83/y;-><init>(S)V

    goto :goto_1

    :cond_1
    :goto_0
    move-object v4, v2

    :goto_1
    if-eqz v4, :cond_2

    iget-short v0, v4, Ll83/y;->w:S

    return v0

    :cond_2
    invoke-static {v1}, Lyb3/y;->H(Ljava/lang/String;)V

    throw v2
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v3, "Failed to parse type \'UShort\' for input \'"

    const/16 v4, 0x27

    invoke-static {v4, v3, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v2, v4}, Lbd3/a;->r(Lbd3/a;Ljava/lang/String;ILjava/lang/String;I)V

    throw v2
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Lbd3/o;->b:Lcd3/f;

    return-object v0
.end method
