.class public final Llq2/p$a$c;
.super Llq2/p$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llq2/p$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B3\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\t\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001c\u001a\u0004\u0008\u001e\u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Llq2/p$a$c;",
        "Llq2/p$a;",
        "",
        "Li2/x;",
        "colors",
        "",
        "circleAlpha",
        "Llq2/p$b;",
        "direction",
        "circleCenterYOffsetFraction",
        "<init>",
        "(Ljava/util/List;FLlq2/p$b;F)V",
        "",
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
        "a",
        "Ljava/util/List;",
        "d",
        "()Ljava/util/List;",
        "b",
        "F",
        "()F",
        "c",
        "Llq2/p$b;",
        "e",
        "()Llq2/p$b;",
        "user-journey_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation
.end field

.field private final b:F

.field private final c:Llq2/p$b;

.field private final d:F


# direct methods
.method public constructor <init>(Ljava/util/List;FLlq2/p$b;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li2/x;",
            ">;F",
            "Llq2/p$b;",
            "F)V"
        }
    .end annotation

    const-string v0, "colors"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Llq2/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Llq2/p$a$c;->a:Ljava/util/List;

    .line 3
    iput p2, p0, Llq2/p$a$c;->b:F

    .line 4
    iput-object p3, p0, Llq2/p$a$c;->c:Llq2/p$b;

    .line 5
    iput p4, p0, Llq2/p$a$c;->d:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FLlq2/p$b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const p2, 0x3ecccccd    # 0.4f

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 6
    sget-object p3, Llq2/p$b;->Normal:Llq2/p$b;

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const p4, 0x3df5c28f    # 0.12f

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Llq2/p$a$c;-><init>(Ljava/util/List;FLlq2/p$b;F)V

    return-void
.end method


# virtual methods
.method public final b()F
    .locals 1

    iget v0, p0, Llq2/p$a$c;->b:F

    return v0
.end method

.method public final c()F
    .locals 1

    iget v0, p0, Llq2/p$a$c;->d:F

    return v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li2/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llq2/p$a$c;->a:Ljava/util/List;

    return-object v0
.end method

.method public final e()Llq2/p$b;
    .locals 1

    iget-object v0, p0, Llq2/p$a$c;->c:Llq2/p$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llq2/p$a$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llq2/p$a$c;

    iget-object v1, p0, Llq2/p$a$c;->a:Ljava/util/List;

    iget-object v3, p1, Llq2/p$a$c;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llq2/p$a$c;->b:F

    iget v3, p1, Llq2/p$a$c;->b:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llq2/p$a$c;->c:Llq2/p$b;

    iget-object v3, p1, Llq2/p$a$c;->c:Llq2/p$b;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llq2/p$a$c;->d:F

    iget p1, p1, Llq2/p$a$c;->d:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llq2/p$a$c;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llq2/p$a$c;->b:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Llq2/p$a$c;->c:Llq2/p$b;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Llq2/p$a$c;->d:F

    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Llq2/p$a$c;->a:Ljava/util/List;

    iget v1, p0, Llq2/p$a$c;->b:F

    iget-object v2, p0, Llq2/p$a$c;->c:Llq2/p$b;

    iget v3, p0, Llq2/p$a$c;->d:F

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MultiGlowBottom(colors="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", circleAlpha="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", direction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", circleCenterYOffsetFraction="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
