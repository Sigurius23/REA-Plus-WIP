.class public final Lsc3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/n;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/h;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 3

    new-instance v0, Ltc3/a;

    iget-object v1, p0, Lsc3/h;->a:Ljava/lang/String;

    const-string v2, "string"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 10

    iget-object v0, p0, Lsc3/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    if-nez v1, :cond_0

    move-object v0, v2

    goto/16 :goto_9

    :cond_0
    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lrc3/b;->b(C)Z

    move-result v4

    const-string v5, ""

    const-string v6, "substring(...)"

    if-eqz v4, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    move v7, v3

    :goto_0
    if-ge v7, v4, :cond_2

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Lrc3/b;->b(C)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v0, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_1
    new-instance v7, Luc3/a;

    invoke-direct {v7, v4}, Luc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v7, Luc3/f;

    invoke-direct {v7, v4}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v7}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    move v7, v3

    :goto_2
    if-ge v7, v4, :cond_4

    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Lrc3/b;->b(C)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_4
    move-object v0, v5

    :cond_5
    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_b

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v7, 0x1

    sub-int/2addr v4, v7

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lrc3/b;->b(C)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v4

    :goto_4
    const/4 v8, -0x1

    if-ge v8, v4, :cond_7

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9}, Lrc3/b;->b(C)Z

    move-result v9

    if-nez v9, :cond_6

    invoke-static {v4, v0, v7, v3, v6}, Lih0/d0;->i(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_6
    add-int/lit8 v4, v4, -0x1

    goto :goto_4

    :cond_7
    :goto_5
    new-instance v3, Luc3/m;

    invoke-direct {v3, v5}, Luc3/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Lyb3/r;->c0(Ljava/lang/CharSequence;)I

    move-result v3

    :goto_6
    if-ge v8, v3, :cond_9

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lrc3/b;->b(C)Z

    move-result v4

    if-nez v4, :cond_8

    add-int/2addr v3, v7

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_7

    :cond_8
    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    :cond_9
    :goto_7
    new-instance v3, Luc3/a;

    invoke-direct {v3, v0}, Luc3/a;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v3, Luc3/f;

    invoke-direct {v3, v0}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    new-instance v3, Luc3/m;

    invoke-direct {v3, v0}, Luc3/m;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_8
    invoke-static {v1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object v0

    :goto_9
    new-instance v1, Luc3/l;

    invoke-direct {v1, v0, v2}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lsc3/h;

    if-eqz v0, :cond_0

    check-cast p1, Lsc3/h;

    iget-object p1, p1, Lsc3/h;->a:Ljava/lang/String;

    iget-object v0, p0, Lsc3/h;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lsc3/h;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConstantFormatStructure("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lsc3/h;->a:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
