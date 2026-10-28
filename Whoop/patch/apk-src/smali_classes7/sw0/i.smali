.class public final Lsw0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ@\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u0013R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\"\u001a\u0004\u0008\u001e\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lsw0/i;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "groupPriority",
        "",
        "Lsw0/j;",
        "toggles",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "emptyState",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lsw0/i;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "e",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "I",
        "d",
        "c",
        "Ljava/util/List;",
        "f",
        "()Ljava/util/List;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "()Lcom/whoop/design/models/DesignSystemModel;",
        "custombottomsheet_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:I

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/design/models/DesignSystemModel;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput p2, p0, Lsw0/i;->b:I

    .line 4
    iput-object p3, p0, Lsw0/i;->c:Ljava/util/List;

    .line 5
    iput-object p4, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V

    return-void
.end method

.method public static synthetic b(Lsw0/i;Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILjava/lang/Object;)Lsw0/i;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lsw0/i;->b:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lsw0/i;->c:Ljava/util/List;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lsw0/i;->a(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lsw0/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)Lsw0/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")",
            "Lsw0/i;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toggles"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lsw0/i;

    invoke-direct {v0, p1, p2, p3, p4}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;)V

    return-object v0
.end method

.method public final c()Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    iget-object v0, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    return-object v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lsw0/i;->b:I

    return v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsw0/i;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsw0/i;

    iget-object v1, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lsw0/i;->b:I

    iget v3, p1, Lsw0/i;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsw0/i;->c:Ljava/util/List;

    iget-object v3, p1, Lsw0/i;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    iget-object p1, p1, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lsw0/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lsw0/i;->c:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lsw0/i;->b:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lsw0/i;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lsw0/i;->a:Lcom/whoop/design/util/TextResource;

    iget v1, p0, Lsw0/i;->b:I

    iget-object v2, p0, Lsw0/i;->c:Ljava/util/List;

    iget-object v3, p0, Lsw0/i;->d:Lcom/whoop/design/models/DesignSystemModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "GroupedTogglesDomainState(title="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", groupPriority="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", toggles="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", emptyState="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
