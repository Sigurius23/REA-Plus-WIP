.class public final Ld41/j$d;
.super Ld41/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld41/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001a\u001a\u0004\u0008\u001d\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001a\u001a\u0004\u0008\u0016\u0010\u001cR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001a\u001a\u0004\u0008\u001e\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Ld41/j$d;",
        "Ld41/j;",
        "Lkd1/o;",
        "image",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subText",
        "body",
        "tag",
        "<init>",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
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
        "Lkd1/o;",
        "b",
        "()Lkd1/o;",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
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
.field private final a:Lkd1/o;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lcom/whoop/design/util/TextResource;


# direct methods
.method public constructor <init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "image"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Ld41/j;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Ld41/j$d;->a:Lkd1/o;

    .line 3
    iput-object p2, p0, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move-object p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Ld41/j$d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final b()Lkd1/o;
    .locals 1

    iget-object v0, p0, Ld41/j$d;->a:Lkd1/o;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ld41/j$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ld41/j$d;

    iget-object v1, p0, Ld41/j$d;->a:Lkd1/o;

    iget-object v3, p1, Ld41/j$d;->a:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ld41/j$d;->a:Lkd1/o;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

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

    iget-object v2, p0, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

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
    .locals 8

    iget-object v0, p0, Ld41/j$d;->a:Lkd1/o;

    iget-object v1, p0, Ld41/j$d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Ld41/j$d;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Ld41/j$d;->d:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Ld41/j$d;->e:Lcom/whoop/design/util/TextResource;

    const-string v5, ", title="

    const-string v6, ", subText="

    const-string v7, "Video(image="

    invoke-static {v7, v1, v0, v5, v6}, Lvl/b;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    const-string v5, ", tag="

    invoke-static {v0, v2, v1, v3, v5}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lq63/c;->k(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
