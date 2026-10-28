.class public final Lny0/v0$d;
.super Lny0/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny0/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lny0/v0$d;",
        "Lny0/v0;",
        "Lny0/e1;",
        "widthType",
        "Ll0/k1;",
        "padding",
        "<init>",
        "(Lny0/e1;Ll0/k1;)V",
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
        "d",
        "Lny0/e1;",
        "e",
        "()Lny0/e1;",
        "Ll0/k1;",
        "a",
        "()Ll0/k1;",
        "design_release"
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
.field private final d:Lny0/e1;

.field private final e:Ll0/k1;


# direct methods
.method public constructor <init>(Lny0/e1;Ll0/k1;)V
    .locals 7

    const-string v0, "widthType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 2
    invoke-direct/range {v1 .. v6}, Lny0/v0;-><init>(Lb91/a;Lb91/a;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, v1, Lny0/v0$d;->d:Lny0/e1;

    .line 4
    iput-object p2, v1, Lny0/v0$d;->e:Ll0/k1;

    return-void
.end method

.method public constructor <init>(Lny0/e1;Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    int-to-float p2, p2

    const/16 p3, 0x8

    int-to-float p3, p3

    mul-float/2addr p2, p3

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float p4, v0

    mul-float/2addr p4, p3

    .line 5
    new-instance p3, Ll0/l1;

    invoke-direct {p3, p2, p4, p2, p4}, Ll0/l1;-><init>(FFFF)V

    move-object p2, p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lny0/v0$d;-><init>(Lny0/e1;Ll0/k1;)V

    return-void
.end method


# virtual methods
.method public a()Ll0/k1;
    .locals 1

    iget-object v0, p0, Lny0/v0$d;->e:Ll0/k1;

    return-object v0
.end method

.method public final e()Lny0/e1;
    .locals 1

    iget-object v0, p0, Lny0/v0$d;->d:Lny0/e1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lny0/v0$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lny0/v0$d;

    iget-object v1, p0, Lny0/v0$d;->d:Lny0/e1;

    iget-object v3, p1, Lny0/v0$d;->d:Lny0/e1;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lny0/v0$d;->e:Ll0/k1;

    iget-object p1, p1, Lny0/v0$d;->e:Ll0/k1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lny0/v0$d;->d:Lny0/e1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lny0/v0$d;->e:Ll0/k1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lny0/v0$d;->d:Lny0/e1;

    iget-object v1, p0, Lny0/v0$d;->e:Ll0/k1;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SmallTextState(widthType="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", padding="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
