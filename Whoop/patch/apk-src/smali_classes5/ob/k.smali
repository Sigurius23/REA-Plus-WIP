.class public final Lob/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V
    .locals 1

    const-string v0, "foreignKeys"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/k;->a:Ljava/lang/String;

    iput-object p2, p0, Lob/k;->b:Ljava/lang/Object;

    iput-object p3, p0, Lob/k;->c:Ljava/util/Set;

    iput-object p4, p0, Lob/k;->d:Ljava/util/Set;

    return-void
.end method

.method public static final a(Ljava/lang/String;Ltb/a;)Lob/k;
    .locals 0

    invoke-static {p0, p1}, Lse/h;->S(Ljava/lang/String;Ltb/a;)Lob/k;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lob/k;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lob/k;

    iget-object v0, p1, Lob/k;->a:Ljava/lang/String;

    iget-object v1, p0, Lob/k;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lob/k;->b:Ljava/lang/Object;

    iget-object v1, p1, Lob/k;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lob/k;->c:Ljava/util/Set;

    iget-object v1, p1, Lob/k;->c:Ljava/util/Set;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    iget-object v0, p0, Lob/k;->d:Ljava/util/Set;

    if-eqz v0, :cond_6

    iget-object p1, p1, Lob/k;->d:Ljava/util/Set;

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lob/k;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lob/k;->b:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lte0/d;->c(IILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lob/k;->c:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n            |TableInfo {\n            |    name = \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lob/k;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\',\n            |    columns = {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/k;->b:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Lb2/d;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lb2/d;-><init>(I)V

    invoke-static {v1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Ltx/f;->K(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            |    foreignKeys = {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/k;->c:Ljava/util/Set;

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Ltx/f;->K(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            |    indices = {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lob/k;->d:Ljava/util/Set;

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Lb2/d;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lb2/d;-><init>(I)V

    invoke-static {v1, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    sget-object v1, Lm83/y;->w:Lm83/y;

    :goto_0
    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Ltx/f;->K(Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n            |}\n        "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/s;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
