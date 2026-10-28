.class public final Lad3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyc3/g;


# static fields
.field public static final b:Lad3/a0;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lad3/a0;

    invoke-direct {v0}, Lad3/a0;-><init>()V

    sput-object v0, Lad3/a0;->b:Lad3/a0;

    const-string v0, "kotlinx.serialization.json.JsonObject"

    sput-object v0, Lad3/a0;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-static {v0, v1}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v0

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    iput-object v0, p0, Lad3/a0;->a:Lyc3/g;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getElementAnnotations(I)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0, p1}, Lyc3/g;->getElementAnnotations(I)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getElementDescriptor(I)Lyc3/g;
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0, p1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object p1

    return-object p1
.end method

.method public final getElementIndex(Ljava/lang/String;)I
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0, p1}, Lyc3/g;->getElementIndex(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final getElementName(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0, p1}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final getElementsCount()I
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getElementsCount()I

    move-result v0

    return v0
.end method

.method public final getKind()Lyc3/k;
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    return-object v0
.end method

.method public final getSerialName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lad3/a0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final isElementOptional(I)Z
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0, p1}, Lyc3/g;->isElementOptional(I)Z

    move-result p1

    return p1
.end method

.method public final isInline()Z
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->isInline()Z

    move-result v0

    return v0
.end method

.method public final isNullable()Z
    .locals 1

    iget-object v0, p0, Lad3/a0;->a:Lyc3/g;

    invoke-interface {v0}, Lyc3/g;->isNullable()Z

    move-result v0

    return v0
.end method
