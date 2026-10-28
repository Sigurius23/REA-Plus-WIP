.class public final Ly31/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u00002\u00020\u0001BA\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\n2\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010!\u001a\u0004\u0008\u0017\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010#\u001a\u0004\u0008$\u0010%R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010&\u001a\u0004\u0008\u001e\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Ly31/a;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lgz0/m0;",
        "icon",
        "",
        "voiceoverText",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "",
        "isEmphasized",
        "modal",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "d",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "c",
        "Ljava/lang/String;",
        "e",
        "Lcom/whoop/navigation/AiAction;",
        "()Lcom/whoop/navigation/AiAction;",
        "Z",
        "f",
        "()Z",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lgz0/m0;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/whoop/navigation/AiAction;

.field private final e:Z

.field private final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V
    .locals 1

    const-string v0, "icon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Ly31/a;->b:Lgz0/m0;

    .line 4
    iput-object p3, p0, Ly31/a;->c:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    .line 6
    iput-boolean p5, p0, Ly31/a;->e:Z

    .line 7
    iput-object p6, p0, Ly31/a;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Ly31/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ZLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final b()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ly31/a;->b:Lgz0/m0;

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ly31/a;->f:Ljava/lang/Object;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ly31/a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly31/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly31/a;

    iget-object v1, p0, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ly31/a;->b:Lgz0/m0;

    iget-object v3, p1, Ly31/a;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ly31/a;->c:Ljava/lang/String;

    iget-object v3, p1, Ly31/a;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    iget-object v3, p1, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Ly31/a;->e:Z

    iget-boolean v3, p1, Ly31/a;->e:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Ly31/a;->f:Ljava/lang/Object;

    iget-object p1, p1, Ly31/a;->f:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Ly31/a;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly31/a;->b:Lgz0/m0;

    invoke-static {v3, v0, v2}, Lhc3/i;->b(Lgz0/m0;II)I

    move-result v0

    iget-object v3, p0, Ly31/a;->c:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Ly31/a;->e:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Ly31/a;->f:Ljava/lang/Object;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Ly31/a;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Ly31/a;->b:Lgz0/m0;

    iget-object v2, p0, Ly31/a;->c:Ljava/lang/String;

    iget-object v3, p0, Ly31/a;->d:Lcom/whoop/navigation/AiAction;

    iget-boolean v4, p0, Ly31/a;->e:Z

    iget-object v5, p0, Ly31/a;->f:Ljava/lang/Object;

    const-string v6, ", icon="

    const-string v7, ", voiceoverText="

    const-string v8, "AiChatTalkTextButtonViewState(title="

    invoke-static {v8, v0, v6, v1, v7}, Ljh3/c;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aiAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEmphasized="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
