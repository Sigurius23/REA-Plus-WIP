.class public final Ldd0/a$e;
.super Ldd0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\n\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0013\u001a\u0004\u0008\u0012\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Ldd0/a$e;",
        "Ldd0/a;",
        "",
        "pageIndex",
        "checkboxIndex",
        "",
        "isChecked",
        "<init>",
        "(IIZ)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "I",
        "b",
        "c",
        "Z",
        "()Z",
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
.field private final a:I

.field private final b:I

.field private final c:Z


# direct methods
.method public constructor <init>(IIZ)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ldd0/a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput p1, p0, Ldd0/a$e;->a:I

    iput p2, p0, Ldd0/a$e;->b:I

    iput-boolean p3, p0, Ldd0/a$e;->c:Z

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Ldd0/a$e;->b:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Ldd0/a$e;->a:I

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Ldd0/a$e;->c:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ldd0/a$e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ldd0/a$e;

    iget v1, p0, Ldd0/a$e;->a:I

    iget v3, p1, Ldd0/a$e;->a:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Ldd0/a$e;->b:I

    iget v3, p1, Ldd0/a$e;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Ldd0/a$e;->c:Z

    iget-boolean p1, p1, Ldd0/a$e;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ldd0/a$e;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Ldd0/a$e;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v1, p0, Ldd0/a$e;->c:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Ldd0/a$e;->a:I

    iget v1, p0, Ldd0/a$e;->b:I

    iget-boolean v2, p0, Ldd0/a$e;->c:Z

    const-string v3, ", checkboxIndex="

    const-string v4, ", isChecked="

    const-string v5, "UpdateCheckboxState(pageIndex="

    invoke-static {v0, v1, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
