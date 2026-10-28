.class public final Ll01/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ@\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008 \u0010&\u00a8\u0006\'"
    }
    d2 = {
        "Ll01/d;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "showDivider",
        "Ll01/e;",
        "style",
        "",
        "Ll01/c;",
        "items",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)Ll01/d;",
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
        "Lcom/whoop/design/util/TextResource;",
        "g",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Z",
        "e",
        "()Z",
        "c",
        "Ll01/e;",
        "f",
        "()Ll01/e;",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
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
.field public static final e:I = 0x8


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Z

.field private final c:Ll01/e;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll01/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Ll01/e;",
            "Ljava/util/List<",
            "Ll01/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-boolean p2, p0, Ll01/d;->b:Z

    .line 4
    iput-object p3, p0, Ll01/d;->c:Ll01/e;

    .line 5
    iput-object p4, p0, Ll01/d;->d:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Ll01/d;-><init>(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Ll01/d;Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;ILjava/lang/Object;)Ll01/d;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-boolean p2, p0, Ll01/d;->b:Z

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Ll01/d;->c:Ll01/e;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Ll01/d;->d:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Ll01/d;->a(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)Ll01/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)Ll01/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Ll01/e;",
            "Ljava/util/List<",
            "Ll01/c;",
            ">;)",
            "Ll01/d;"
        }
    .end annotation

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll01/d;

    invoke-direct {v0, p1, p2, p3, p4}, Ll01/d;-><init>(Lcom/whoop/design/util/TextResource;ZLl01/e;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll01/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ll01/d;->d:Ljava/util/List;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Ll01/d;->b:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll01/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll01/d;

    iget-object v1, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ll01/d;->b:Z

    iget-boolean v3, p1, Ll01/d;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ll01/d;->c:Ll01/e;

    iget-object v3, p1, Ll01/d;->c:Ll01/e;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ll01/d;->d:Ljava/util/List;

    iget-object p1, p1, Ll01/d;->d:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ll01/e;
    .locals 1

    iget-object v0, p0, Ll01/d;->c:Ll01/e;

    return-object v0
.end method

.method public final g()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Ll01/d;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ll01/d;->c:Ll01/e;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Ll01/d;->d:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Ll01/d;->a:Lcom/whoop/design/util/TextResource;

    iget-boolean v1, p0, Ll01/d;->b:Z

    iget-object v2, p0, Ll01/d;->c:Ll01/e;

    iget-object v3, p0, Ll01/d;->d:Ljava/util/List;

    const-string v4, ", showDivider="

    const-string v5, ", style="

    const-string v6, "FeatureListState(title="

    invoke-static {v6, v0, v4, v1, v5}, Lq63/c;->p(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
