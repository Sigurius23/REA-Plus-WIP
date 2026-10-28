.class public final Lbd3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcd3/h;


# instance fields
.field public final w:Z

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lad3/i;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget-object v0, p1, Lad3/i;->i:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lbd3/u;->x:Ljava/lang/String;

    .line 5
    iget-object p1, p1, Lad3/i;->n:Lad3/a;

    .line 6
    sget-object v0, Lad3/a;->w:Lad3/a;

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lbd3/u;->w:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/u;->x:Ljava/lang/String;

    iput-boolean p2, p0, Lbd3/u;->w:Z

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-boolean p1, p0, Lbd3/u;->w:Z

    .line 9
    iput-object p2, p0, Lbd3/u;->x:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public e(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method

.method public k(Lj93/d;Lwc3/c;)V
    .locals 0

    const-string p1, "serializer"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public o(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    const-string p2, "kClass"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public p(Lj93/d;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    return-void
.end method

.method public s(Lj93/d;Lj93/d;Lwc3/c;)V
    .locals 3

    invoke-interface {p3}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p3

    instance-of v0, p3, Lyc3/d;

    const-string v1, "Serializer for "

    if-nez v0, :cond_4

    sget-object v0, Lyc3/i;->a:Lyc3/i;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lbd3/u;->w:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lyc3/l;->b:Lyc3/l;

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    sget-object v2, Lyc3/l;->c:Lyc3/l;

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    instance-of v2, p3, Lyc3/f;

    if-nez v2, :cond_3

    instance-of v2, p3, Lyc3/j;

    if-nez v2, :cond_3

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lyc3/g;->getElementsCount()I

    move-result p3

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p3, :cond_2

    invoke-interface {p1, v0}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lbd3/u;->x:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Polymorphic serializer for "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " has property \'"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " of kind "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " cannot be serialized polymorphically with class discriminator."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " can\'t be registered as a subclass for polymorphic serialization because its kind "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not concrete. To work with multiple hierarchies, register it as a base class."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
