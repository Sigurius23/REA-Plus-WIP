.class public final Lgt0/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgt0/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgt0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J$\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0017\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lgt0/h$g;",
        "Lgt0/h;",
        "Lbt0/c;",
        "progressPercentage",
        "",
        "isForeground",
        "<init>",
        "(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(IZ)Lgt0/h$g;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "I",
        "getProgressPercentage-UefM2is",
        "c",
        "Z",
        "()Z",
        "connectivity-core_release"
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
.field private final b:I

.field private final c:Z


# direct methods
.method private constructor <init>(IZ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lgt0/h$g;->b:I

    iput-boolean p2, p0, Lgt0/h$g;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(IZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lgt0/h$g;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lgt0/h$g;-><init>(IZ)V

    return-void
.end method

.method public static synthetic b(Lgt0/h$g;IZILjava/lang/Object;)Lgt0/h$g;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lgt0/h$g;->b:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lgt0/h$g;->c:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lgt0/h$g;->a(IZ)Lgt0/h$g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(IZ)Lgt0/h$g;
    .locals 2

    new-instance v0, Lgt0/h$g;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lgt0/h$g;-><init>(IZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lgt0/h$g;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lgt0/h$g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lgt0/h$g;

    iget v1, p0, Lgt0/h$g;->b:I

    iget v3, p1, Lgt0/h$g;->b:I

    invoke-static {v1, v3}, Lbt0/c;->b(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lgt0/h$g;->c:Z

    iget-boolean p1, p1, Lgt0/h$g;->c:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lgt0/h$g;->b:I

    invoke-static {v0}, Lbt0/c;->c(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lgt0/h$g;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lgt0/h$g;->b:I

    invoke-static {v0}, Lbt0/c;->d(I)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lgt0/h$g;->c:Z

    const-string v2, ", isForeground="

    const-string v3, ")"

    const-string v4, "UpdateInProgress(progressPercentage="

    invoke-static {v4, v0, v2, v3, v1}, Lnh3/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
