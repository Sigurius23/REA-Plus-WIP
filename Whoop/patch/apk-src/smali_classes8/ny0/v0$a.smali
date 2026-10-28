.class public final Lny0/v0$a;
.super Lny0/v0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lny0/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lny0/v0$a;",
        "Lny0/v0;",
        "Ll0/k1;",
        "padding",
        "<init>",
        "(Ll0/k1;)V",
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


# instance fields
.field private final d:Ll0/k1;


# direct methods
.method public constructor <init>(Ll0/k1;)V
    .locals 7

    const-string v0, "padding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->D()Lb91/a;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    .line 3
    invoke-direct/range {v1 .. v6}, Lny0/v0;-><init>(Lb91/a;Lb91/a;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, v1, Lny0/v0$a;->d:Ll0/k1;

    return-void
.end method

.method public constructor <init>(Ll0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const-wide/high16 p1, 0x3ff8000000000000L    # 1.5

    double-to-float p1, p1

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float/2addr p1, p2

    const/4 p2, 0x0

    const/4 p3, 0x2

    .line 1
    invoke-static {p1, p2, p3}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Lny0/v0$a;-><init>(Ll0/k1;)V

    return-void
.end method


# virtual methods
.method public a()Ll0/k1;
    .locals 1

    iget-object v0, p0, Lny0/v0$a;->d:Ll0/k1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lny0/v0$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lny0/v0$a;

    iget-object v1, p0, Lny0/v0$a;->d:Ll0/k1;

    iget-object p1, p1, Lny0/v0$a;->d:Ll0/k1;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lny0/v0$a;->d:Ll0/k1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lny0/v0$a;->d:Ll0/k1;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "MediumNumberState(padding="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
