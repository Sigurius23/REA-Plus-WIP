.class public final Li63/d;
.super Li63/j;
.source "SourceFile"


# static fields
.field public static final f:Li63/d;


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li63/d;

    const-string v1, "*"

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v1, v2}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sput-object v0, Li63/d;->f:Li63/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4}, Li63/j;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 2
    iput-object p1, p0, Li63/d;->d:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Li63/d;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 2

    const-string v0, "contentType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentSubtype"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parameters"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-direct {p0, p1, p2, v0, p3}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li63/d;

    if-eqz v0, :cond_0

    check-cast p1, Li63/d;

    iget-object v0, p1, Li63/d;->d:Ljava/lang/String;

    iget-object v1, p0, Li63/d;->d:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li63/d;->e:Ljava/lang/String;

    iget-object v1, p1, Li63/d;->e:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li63/j;->c:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    iget-object p1, p1, Li63/j;->c:Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Li63/d;)Z
    .locals 6

    const-string v0, "pattern"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Li63/d;->e:Ljava/lang/String;

    iget-object v1, p1, Li63/d;->d:Ljava/lang/String;

    const-string v2, "*"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_0

    iget-object v3, p0, Li63/d;->d:Ljava/lang/String;

    invoke-static {v1, v3, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    return v4

    :cond_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Li63/d;->e:Ljava/lang/String;

    invoke-static {v0, v1, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    return v4

    :cond_1
    iget-object p1, p1, Li63/j;->c:Ljava/util/Collection;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li63/i;

    iget-object v1, v0, Li63/i;->a:Ljava/lang/String;

    iget-object v0, v0, Li63/i;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    move v0, v5

    goto :goto_1

    :cond_3
    iget-object v1, p0, Li63/j;->c:Ljava/util/Collection;

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    :cond_4
    move v0, v4

    goto :goto_1

    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li63/i;

    iget-object v3, v3, Li63/i;->b:Ljava/lang/String;

    invoke-static {v3, v0, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_0

    :cond_7
    invoke-virtual {p0, v1}, Li63/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_8
    invoke-static {v1, v0, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    :goto_1
    if-nez v0, :cond_2

    return v4

    :cond_9
    return v5
.end method

.method public final g(Ljava/lang/String;)Li63/d;
    .locals 6

    iget-object v0, p0, Li63/j;->c:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const-string v2, "charset"

    if-eqz v1, :cond_3

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    instance-of v4, v1, Ljava/util/Collection;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li63/i;

    iget-object v5, v4, Li63/i;->a:Ljava/lang/String;

    invoke-static {v5, v2, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v4, v4, Li63/i;->b:Ljava/lang/String;

    invoke-static {v4, p1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li63/i;

    iget-object v4, v1, Li63/i;->a:Ljava/lang/String;

    invoke-static {v4, v2, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, v1, Li63/i;->b:Ljava/lang/String;

    invoke-static {v1, p1, v3}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    return-object p0

    :cond_3
    :goto_1
    new-instance v1, Li63/d;

    iget-object v3, p0, Li63/j;->b:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    check-cast v0, Ljava/util/Collection;

    new-instance v4, Li63/i;

    invoke-direct {v4, v2, p1}, Li63/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    iget-object v0, p0, Li63/d;->d:Ljava/lang/String;

    iget-object v2, p0, Li63/d;->e:Ljava/lang/String;

    invoke-direct {v1, v0, v2, v3, p1}, Li63/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public final hashCode()I
    .locals 5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget-object v1, p0, Li63/d;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    mul-int/lit8 v3, v1, 0x1f

    iget-object v4, p0, Li63/d;->e:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    add-int/2addr v0, v1

    iget-object v1, p0, Li63/j;->c:Ljava/util/Collection;

    check-cast v1, Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method
