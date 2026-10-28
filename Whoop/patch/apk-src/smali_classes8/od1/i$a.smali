.class public final Lod1/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lod1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u00002\u00020\u0001B;\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0017\u001a\u0004\u0008\u0019\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001a\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001b\u001a\u0004\u0008\u001d\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lod1/i$a;",
        "Lod1/i;",
        "",
        "Lod1/a;",
        "allList",
        "mostRecentList",
        "Ln82/a;",
        "pageType",
        "selectedScreenType",
        "<init>",
        "(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)V",
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
        "()Ljava/util/List;",
        "b",
        "c",
        "Ln82/a;",
        "()Ln82/a;",
        "d",
        "select-activity_release"
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
            "Lod1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lod1/a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ln82/a;

.field private final d:Ln82/a;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;",
            "Ln82/a;",
            "Ln82/a;",
            ")V"
        }
    .end annotation

    const-string v0, "allList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mostRecentList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lod1/i$a;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lod1/i$a;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, Lod1/i$a;->c:Ln82/a;

    .line 5
    iput-object p4, p0, Lod1/i$a;->d:Ln82/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget-object p3, Ln82/a;->ALL:Ln82/a;

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    sget-object p4, Ln82/a;->ALL:Ln82/a;

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lod1/i$a;-><init>(Ljava/util/List;Ljava/util/List;Ln82/a;Ln82/a;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lod1/i$a;->a:Ljava/util/List;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lod1/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lod1/i$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ln82/a;
    .locals 1

    iget-object v0, p0, Lod1/i$a;->c:Ln82/a;

    return-object v0
.end method

.method public final d()Ln82/a;
    .locals 1

    iget-object v0, p0, Lod1/i$a;->d:Ln82/a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lod1/i$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lod1/i$a;

    iget-object v1, p0, Lod1/i$a;->a:Ljava/util/List;

    iget-object v3, p1, Lod1/i$a;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lod1/i$a;->b:Ljava/util/List;

    iget-object v3, p1, Lod1/i$a;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lod1/i$a;->c:Ln82/a;

    iget-object v3, p1, Lod1/i$a;->c:Ln82/a;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lod1/i$a;->d:Ln82/a;

    iget-object p1, p1, Lod1/i$a;->d:Ln82/a;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lod1/i$a;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lod1/i$a;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lod1/i$a;->c:Ln82/a;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lod1/i$a;->d:Ln82/a;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lod1/i$a;->a:Ljava/util/List;

    iget-object v1, p0, Lod1/i$a;->b:Ljava/util/List;

    iget-object v2, p0, Lod1/i$a;->c:Ln82/a;

    iget-object v3, p0, Lod1/i$a;->d:Ln82/a;

    const-string v4, ", mostRecentList="

    const-string v5, ", pageType="

    const-string v6, "InitialFetch(allList="

    invoke-static {v6, v4, v0, v5, v1}, Ly00/t7;->j(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedScreenType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
