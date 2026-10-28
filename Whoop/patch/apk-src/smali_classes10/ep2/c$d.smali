.class public final Lep2/c$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lep2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001c\u001a\u0004\u0008\u001e\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001f\u001a\u0004\u0008\u0017\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lep2/c$d;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "Lep2/c$a;",
        "items",
        "Lm91/u;",
        "stickyArea",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "closeInteraction",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "c",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "universal-checkout_release"
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

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lep2/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lep2/c$a;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stickyArea"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lep2/c$d;->b:Ljava/util/List;

    iput-object p3, p0, Lep2/c$d;->c:Ljava/util/List;

    iput-object p4, p0, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lep2/c$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lep2/c$d;->b:Ljava/util/List;

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lep2/c$d;->c:Ljava/util/List;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lep2/c$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lep2/c$d;

    iget-object v1, p0, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lep2/c$d;->b:Ljava/util/List;

    iget-object v3, p1, Lep2/c$d;->b:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lep2/c$d;->c:Ljava/util/List;

    iget-object v3, p1, Lep2/c$d;->c:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lep2/c$d;->b:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lep2/c$d;->c:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v1, p0, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lep2/c$d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lep2/c$d;->b:Ljava/util/List;

    iget-object v2, p0, Lep2/c$d;->c:Ljava/util/List;

    iget-object v3, p0, Lep2/c$d;->d:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v4, ", items="

    const-string v5, ", stickyArea="

    const-string v6, "ScreenContent(title="

    invoke-static {v0, v6, v4, v5, v1}, Lte0/d;->p(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", closeInteraction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
