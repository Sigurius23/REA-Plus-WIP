.class public final Lud3/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/List;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud3/e0;->a:Ljava/lang/String;

    iput-object p2, p0, Lud3/e0;->b:Ljava/lang/String;

    iput-object p3, p0, Lud3/e0;->c:Ljava/lang/String;

    iput-object p4, p0, Lud3/e0;->d:Ljava/lang/String;

    iput p5, p0, Lud3/e0;->e:I

    iput-object p6, p0, Lud3/e0;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Lud3/e0;->g:Ljava/util/List;

    iput-object p8, p0, Lud3/e0;->h:Ljava/lang/String;

    iput-object p9, p0, Lud3/e0;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lud3/e0;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lud3/e0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x4

    iget-object v2, p0, Lud3/e0;->i:Ljava/lang/String;

    const/16 v3, 0x3a

    const/4 v4, 0x0

    invoke-static {v2, v3, v0, v4, v1}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x40

    const/4 v3, 0x6

    invoke-static {v2, v1, v4, v4, v3}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lud3/e0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    iget-object v3, p0, Lud3/e0;->i:Ljava/lang/String;

    const/16 v4, 0x2f

    invoke-static {v3, v4, v0, v1, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    const-string v1, "?#"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0, v2, v3, v1}, Lwd3/f;->f(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v3, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/util/ArrayList;
    .locals 7

    iget-object v0, p0, Lud3/e0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    iget-object v3, p0, Lud3/e0;->i:Ljava/lang/String;

    const/16 v4, 0x2f

    invoke-static {v3, v4, v0, v1, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    const-string v1, "?#"

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v0, v2, v3, v1}, Lwd3/f;->f(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    if-ge v0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v4, v0, v1, v3}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v5

    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v6, "substring(...)"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v0, v5

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public final d()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lud3/e0;->g:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/16 v0, 0x3f

    const/4 v1, 0x6

    iget-object v2, p0, Lud3/e0;->i:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v3, v1}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x23

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v1, v0, v3, v2}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lud3/e0;->b:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    iget-object v0, p0, Lud3/e0;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

    const-string v1, ":@"

    iget-object v2, p0, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v0, v3, v2, v1}, Lwd3/f;->f(IILjava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "substring(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lud3/e0;

    if-eqz v0, :cond_0

    check-cast p1, Lud3/e0;

    iget-object p1, p1, Lud3/e0;->i:Ljava/lang/String;

    iget-object v0, p0, Lud3/e0;->i:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lud3/e0;->a:Ljava/lang/String;

    const-string v1, "https"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final g()Lcom/iterable/iterableapi/v;
    .locals 6

    new-instance v0, Lcom/iterable/iterableapi/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/v;-><init>(I)V

    iget-object v1, v0, Lcom/iterable/iterableapi/v;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lud3/e0;->a:Ljava/lang/String;

    iput-object v2, v0, Lcom/iterable/iterableapi/v;->b:Ljava/lang/String;

    invoke-virtual {p0}, Lud3/e0;->e()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/iterable/iterableapi/v;->d:Ljava/lang/Object;

    invoke-virtual {p0}, Lud3/e0;->a()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lcom/iterable/iterableapi/v;->e:Ljava/lang/Object;

    iget-object v3, p0, Lud3/e0;->d:Ljava/lang/String;

    iput-object v3, v0, Lcom/iterable/iterableapi/v;->f:Ljava/lang/Object;

    const-string v3, "scheme"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "http"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_0

    const/16 v2, 0x50

    goto :goto_0

    :cond_0
    const-string v3, "https"

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x1bb

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v3, p0, Lud3/e0;->e:I

    if-eq v3, v2, :cond_2

    move v4, v3

    :cond_2
    iput v4, v0, Lcom/iterable/iterableapi/v;->c:I

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Lud3/e0;->c()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lud3/e0;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    const-string v4, " \"\'<>#"

    const/16 v5, 0x53

    invoke-static {v3, v1, v3, v5, v4}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/iterable/iterableapi/v;->e(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    iput-object v1, v0, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    iget-object v1, p0, Lud3/e0;->h:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/16 v1, 0x23

    const/4 v2, 0x6

    iget-object v4, p0, Lud3/e0;->i:Ljava/lang/String;

    invoke-static {v4, v1, v3, v3, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v4, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    const-string v1, "substring(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    iput-object v2, v0, Lcom/iterable/iterableapi/v;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final h(Ljava/lang/String;)Lcom/iterable/iterableapi/v;
    .locals 2

    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    new-instance v0, Lcom/iterable/iterableapi/v;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/v;-><init>(I)V

    invoke-virtual {v0, p0, p1}, Lcom/iterable/iterableapi/v;->d(Lud3/e0;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lud3/e0;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lud3/e0;->g:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1, v0}, Lud3/t;->b(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 6

    const-string v0, "/..."

    invoke-virtual {p0, v0}, Lud3/e0;->h(Ljava/lang/String;)Lcom/iterable/iterableapi/v;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v1, 0x0

    const-string v2, ""

    const/16 v3, 0x7b

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    invoke-static {v1, v2, v1, v3, v4}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v0, Lcom/iterable/iterableapi/v;->d:Ljava/lang/Object;

    invoke-static {v1, v2, v1, v3, v4}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/iterable/iterableapi/v;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v0

    iget-object v0, v0, Lud3/e0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Ljava/net/URI;
    .locals 12

    invoke-virtual {p0}, Lud3/e0;->g()Lcom/iterable/iterableapi/v;

    move-result-object v0

    iget-object v1, v0, Lcom/iterable/iterableapi/v;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lcom/iterable/iterableapi/v;->f:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "replaceAll(...)"

    const-string v4, ""

    const-string v5, "compile(...)"

    const/4 v6, 0x0

    if-eqz v2, :cond_0

    const-string v7, "[\"<>^`{|}]"

    invoke-static {v7}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_0
    iput-object v2, v0, Lcom/iterable/iterableapi/v;->f:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v7, 0x0

    move v8, v7

    :goto_1
    if-ge v8, v2, :cond_1

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, "[]"

    const/16 v11, 0x63

    invoke-static {v7, v9, v7, v11, v10}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v8, v9}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/iterable/iterableapi/v;->h:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v8, v7

    :goto_2
    if-ge v8, v2, :cond_3

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_2

    const-string v10, "\\^`{|}"

    const/16 v11, 0x43

    invoke-static {v7, v9, v7, v11, v10}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_2
    move-object v9, v6

    :goto_3
    invoke-interface {v1, v8, v9}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    iget-object v1, v0, Lcom/iterable/iterableapi/v;->i:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, " \"#<>\\^`{|}"

    const/16 v6, 0x23

    invoke-static {v7, v1, v7, v6, v2}, Lke3/a;->a(ILjava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_4
    iput-object v6, v0, Lcom/iterable/iterableapi/v;->i:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    :try_start_1
    const-string v2, "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "input"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0

    :catch_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lud3/e0;->i:Ljava/lang/String;

    return-object v0
.end method
