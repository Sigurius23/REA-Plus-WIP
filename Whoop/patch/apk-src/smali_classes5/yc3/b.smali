.class public final Lyc3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc3/g;


# instance fields
.field public final a:Lyc3/h;

.field public final b:Lj93/d;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyc3/h;Lj93/d;)V
    .locals 1

    const-string v0, "kClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyc3/b;->a:Lyc3/h;

    iput-object p2, p0, Lyc3/b;->b:Lj93/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Lyc3/h;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3c

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x3e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lyc3/b;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lyc3/b;

    if-eqz v0, :cond_0

    check-cast p1, Lyc3/b;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v1, p1, Lyc3/b;->a:Lyc3/h;

    invoke-virtual {v0, v1}, Lyc3/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Lyc3/b;->b:Lj93/d;

    iget-object v0, p0, Lyc3/b;->b:Lj93/d;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->d:Ljava/util/List;

    return-object v0
.end method

.method public final getElementAnnotations(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->h:[Ljava/util/List;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementDescriptor(I)Lyc3/g;
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->g:[Lyc3/g;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementIndex(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    invoke-virtual {v0, p1}, Lyc3/h;->getElementIndex(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final getElementName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->f:[Ljava/lang/String;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final getElementsCount()I
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget v0, v0, Lyc3/h;->c:I

    return v0
.end method

.method public final getKind()Lyc3/k;
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->b:Lyc3/k;

    return-object v0
.end method

.method public final getSerialName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyc3/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lyc3/b;->b:Lj93/d;

    invoke-interface {v0}, Lj93/d;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lyc3/b;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isElementOptional(I)Z
    .locals 1

    iget-object v0, p0, Lyc3/b;->a:Lyc3/h;

    iget-object v0, v0, Lyc3/h;->i:[Z

    aget-boolean p1, v0, p1

    return p1
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isNullable()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContextDescriptor(kClass: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lyc3/b;->b:Lj93/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", original: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyc3/b;->a:Lyc3/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
