.class public final Lad3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc3/g;


# instance fields
.field public final a:Ll83/p;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lad3/o;->a:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lad3/o;->a:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc3/g;

    return-object v0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getElementAnnotations(I)Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getElementDescriptor(I)Lyc3/g;
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    return-object p1
.end method

.method public final getElementIndex(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lyc3/g;->getElementIndex(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final getElementName(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementsCount()I
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result v0

    return v0
.end method

.method public final getKind()Lyc3/k;
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    return-object v0
.end method

.method public final getSerialName()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isElementOptional(I)Z
    .locals 1

    invoke-virtual {p0}, Lad3/o;->a()Lyc3/g;

    move-result-object v0

    invoke-interface {v0, p1}, Lyc3/g;->isElementOptional(I)Z

    move-result p1

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
