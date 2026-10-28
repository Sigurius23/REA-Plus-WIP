.class public final synthetic Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lad3/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final synthetic a:[Ljava/lang/String;


# direct methods
.method public constructor <init>([Ljava/lang/String;)V
    .locals 1

    const-string v0, "names"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer$a;->a:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic annotationType()Ljava/lang/Class;
    .locals 1

    const-class v0, Lad3/u;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lad3/u;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lad3/u;

    invoke-interface {p0}, Lad3/u;->names()[Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lad3/u;->names()[Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer$a;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    const v1, 0x17afccb8

    xor-int/2addr v0, v1

    return v0
.end method

.method public final synthetic names()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer$a;->a:[Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel$$serializer$a;->a:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "@kotlinx.serialization.json.JsonNames(names="

    const-string v2, ")"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
