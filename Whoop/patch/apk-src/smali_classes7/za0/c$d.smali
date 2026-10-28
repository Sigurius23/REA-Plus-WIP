.class public final Lza0/c$d;
.super Lza0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lza0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ4\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lza0/c$d;",
        "Lza0/c;",
        "",
        "biomarkerId",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "response",
        "",
        "dismissedCardIds",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V",
        "a",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)Lza0/c$d;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "c",
        "b",
        "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "e",
        "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
        "Ljava/util/Set;",
        "d",
        "()Ljava/util/Set;",
        "advanced-labs_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "biomarkerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissedCardIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lza0/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lza0/c$d;->a:Ljava/lang/String;

    iput-object p2, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    iput-object p3, p0, Lza0/c$d;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 2
    sget-object p3, Lm83/a0;->w:Lm83/a0;

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lza0/c$d;-><init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V

    return-void
.end method

.method public static synthetic b(Lza0/c$d;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;ILjava/lang/Object;)Lza0/c$d;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lza0/c$d;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lza0/c$d;->c:Ljava/util/Set;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lza0/c$d;->a(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)Lza0/c$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)Lza0/c$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lza0/c$d;"
        }
    .end annotation

    const-string v0, "biomarkerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissedCardIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza0/c$d;

    invoke-direct {v0, p1, p2, p3}, Lza0/c$d;-><init>(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Ljava/util/Set;)V

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lza0/c$d;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lza0/c$d;->c:Ljava/util/Set;

    return-object v0
.end method

.method public final e()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;
    .locals 1

    iget-object v0, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lza0/c$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lza0/c$d;

    iget-object v1, p0, Lza0/c$d;->a:Ljava/lang/String;

    iget-object v3, p1, Lza0/c$d;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    iget-object v3, p1, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lza0/c$d;->c:Ljava/util/Set;

    iget-object p1, p1, Lza0/c$d;->c:Ljava/util/Set;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lza0/c$d;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lza0/c$d;->c:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lza0/c$d;->a:Ljava/lang/String;

    iget-object v1, p0, Lza0/c$d;->b:Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;

    iget-object v2, p0, Lza0/c$d;->c:Ljava/util/Set;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Success(biomarkerId="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", response="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissedCardIds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
