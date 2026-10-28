.class public final Lbm2/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001e\u001a\u0004\u0008\u001a\u0010\u0011R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u001e\u001a\u0004\u0008\u001f\u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010 \u001a\u0004\u0008\u0016\u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lbm2/s0;",
        "",
        "Lbm2/m1;",
        "style",
        "",
        "widthPercent",
        "",
        "lowerBound",
        "upperBound",
        "Lcom/whoop/design/util/TextResource;",
        "displayValue",
        "<init>",
        "(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lbm2/m1;",
        "c",
        "()Lbm2/m1;",
        "b",
        "F",
        "e",
        "()F",
        "I",
        "d",
        "Lcom/whoop/design/util/TextResource;",
        "()Lcom/whoop/design/util/TextResource;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final f:I


# instance fields
.field private final a:Lbm2/m1;

.field private final b:F

.field private final c:I

.field private final d:I

.field private final e:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lbm2/s0;->f:I

    return-void
.end method

.method public constructor <init>(Lbm2/m1;FIILcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayValue"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2/s0;->a:Lbm2/m1;

    iput p2, p0, Lbm2/s0;->b:F

    iput p3, p0, Lbm2/s0;->c:I

    iput p4, p0, Lbm2/s0;->d:I

    iput-object p5, p0, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lbm2/s0;->c:I

    return v0
.end method

.method public final c()Lbm2/m1;
    .locals 1

    iget-object v0, p0, Lbm2/s0;->a:Lbm2/m1;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lbm2/s0;->d:I

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lbm2/s0;->b:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lbm2/s0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lbm2/s0;

    iget-object v1, p0, Lbm2/s0;->a:Lbm2/m1;

    iget-object v3, p1, Lbm2/s0;->a:Lbm2/m1;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lbm2/s0;->b:F

    iget v3, p1, Lbm2/s0;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lbm2/s0;->c:I

    iget v3, p1, Lbm2/s0;->c:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lbm2/s0;->d:I

    iget v3, p1, Lbm2/s0;->d:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lbm2/s0;->a:Lbm2/m1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lbm2/s0;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lbm2/s0;->c:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lbm2/s0;->d:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lbm2/s0;->a:Lbm2/m1;

    iget v1, p0, Lbm2/s0;->b:F

    iget v2, p0, Lbm2/s0;->c:I

    iget v3, p0, Lbm2/s0;->d:I

    iget-object v4, p0, Lbm2/s0;->e:Lcom/whoop/design/util/TextResource;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SegmentsViewState(style="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", widthPercent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", lowerBound="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", upperBound="

    const-string v1, ", displayValue="

    invoke-static {v5, v2, v0, v3, v1}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lq63/c;->k(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
