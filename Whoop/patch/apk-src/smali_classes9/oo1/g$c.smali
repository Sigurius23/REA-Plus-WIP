.class final Loo1/g$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loo1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0082\u0008\u0018\u00002\u00020\u0001B7\u0012\u001a\u0008\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ@\u0010\u000c\u001a\u00020\u00002\u001a\u0008\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R)\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u00040\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001e\u0010\u0012\u00a8\u0006 "
    }
    d2 = {
        "Loo1/g$c;",
        "",
        "",
        "",
        "",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "mapOfExistingMonths",
        "Loo1/f;",
        "domainResult",
        "currentPage",
        "<init>",
        "(Ljava/util/Map;Loo1/f;I)V",
        "a",
        "(Ljava/util/Map;Loo1/f;I)Loo1/g$c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/Map;",
        "e",
        "()Ljava/util/Map;",
        "b",
        "Loo1/f;",
        "d",
        "()Loo1/f;",
        "c",
        "I",
        "hormonal-insights_release"
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
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Loo1/f;

.field private final c:I


# direct methods
.method public constructor <init>(Ljava/util/Map;Loo1/f;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;>;",
            "Loo1/f;",
            "I)V"
        }
    .end annotation

    const-string v0, "mapOfExistingMonths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "domainResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Loo1/g$c;->a:Ljava/util/Map;

    .line 3
    iput-object p2, p0, Loo1/g$c;->b:Loo1/f;

    .line 4
    iput p3, p0, Loo1/g$c;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;Loo1/f;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    sget-object p2, Loo1/f$b;->a:Loo1/f$b;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x3

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Loo1/g$c;-><init>(Ljava/util/Map;Loo1/f;I)V

    return-void
.end method

.method public static synthetic b(Loo1/g$c;Ljava/util/Map;Loo1/f;IILjava/lang/Object;)Loo1/g$c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Loo1/g$c;->a:Ljava/util/Map;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Loo1/g$c;->b:Loo1/f;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Loo1/g$c;->c:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Loo1/g$c;->a(Ljava/util/Map;Loo1/f;I)Loo1/g$c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/Map;Loo1/f;I)Loo1/g$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;>;",
            "Loo1/f;",
            "I)",
            "Loo1/g$c;"
        }
    .end annotation

    const-string v0, "mapOfExistingMonths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "domainResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loo1/g$c;

    invoke-direct {v0, p1, p2, p3}, Loo1/g$c;-><init>(Ljava/util/Map;Loo1/f;I)V

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Loo1/g$c;->c:I

    return v0
.end method

.method public final d()Loo1/f;
    .locals 1

    iget-object v0, p0, Loo1/g$c;->b:Loo1/f;

    return-object v0
.end method

.method public final e()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Loo1/g$c;->a:Ljava/util/Map;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Loo1/g$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Loo1/g$c;

    iget-object v1, p0, Loo1/g$c;->a:Ljava/util/Map;

    iget-object v3, p1, Loo1/g$c;->a:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Loo1/g$c;->b:Loo1/f;

    iget-object v3, p1, Loo1/g$c;->b:Loo1/f;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Loo1/g$c;->c:I

    iget p1, p1, Loo1/g$c;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Loo1/g$c;->a:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Loo1/g$c;->b:Loo1/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Loo1/g$c;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Loo1/g$c;->a:Ljava/util/Map;

    iget-object v1, p0, Loo1/g$c;->b:Loo1/f;

    iget v2, p0, Loo1/g$c;->c:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "DomainDataAccumulator(mapOfExistingMonths="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", domainResult="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentPage="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
