.class public final Lpr0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u00002\u00020\u0001B=\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJF\u0010\r\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001f\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008!\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lpr0/b;",
        "",
        "",
        "isLoading",
        "isError",
        "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;",
        "data",
        "",
        "initialPath",
        "Lpr0/d;",
        "paginationState",
        "<init>",
        "(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)V",
        "a",
        "(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)Lpr0/b;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "g",
        "()Z",
        "b",
        "f",
        "c",
        "Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;",
        "()Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;",
        "d",
        "Ljava/lang/String;",
        "e",
        "Lpr0/d;",
        "()Lpr0/d;",
        "community-highlights-container-arch-mini_release"
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
.field private final a:Z

.field private final b:Z

.field private final c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

.field private final d:Ljava/lang/String;

.field private final e:Lpr0/d;


# direct methods
.method public constructor <init>(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)V
    .locals 1

    const-string v0, "paginationState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lpr0/b;->a:Z

    .line 3
    iput-boolean p2, p0, Lpr0/b;->b:Z

    .line 4
    iput-object p3, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    .line 5
    iput-object p4, p0, Lpr0/b;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lpr0/b;->e:Lpr0/d;

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    .line 7
    sget-object p5, Lpr0/d$c;->a:Lpr0/d$c;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    .line 8
    invoke-direct/range {p2 .. p7}, Lpr0/b;-><init>(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)V

    return-void
.end method

.method public static synthetic b(Lpr0/b;ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;ILjava/lang/Object;)Lpr0/b;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lpr0/b;->a:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lpr0/b;->b:Z

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lpr0/b;->d:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lpr0/b;->e:Lpr0/d;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lpr0/b;->a(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)Lpr0/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)Lpr0/b;
    .locals 7

    const-string v0, "paginationState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpr0/b;

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lpr0/b;-><init>(ZZLcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;Ljava/lang/String;Lpr0/d;)V

    return-object v1
.end method

.method public final c()Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;
    .locals 1

    iget-object v0, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lpr0/b;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Lpr0/d;
    .locals 1

    iget-object v0, p0, Lpr0/b;->e:Lpr0/d;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lpr0/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lpr0/b;

    iget-boolean v1, p0, Lpr0/b;->a:Z

    iget-boolean v3, p1, Lpr0/b;->a:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lpr0/b;->b:Z

    iget-boolean v3, p1, Lpr0/b;->b:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    iget-object v3, p1, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lpr0/b;->d:Ljava/lang/String;

    iget-object v3, p1, Lpr0/b;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lpr0/b;->e:Lpr0/d;

    iget-object p1, p1, Lpr0/b;->e:Lpr0/d;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Lpr0/b;->b:Z

    return v0
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lpr0/b;->a:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lpr0/b;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lpr0/b;->b:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lpr0/b;->d:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lpr0/b;->e:Lpr0/d;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lpr0/b;->a:Z

    iget-boolean v1, p0, Lpr0/b;->b:Z

    iget-object v2, p0, Lpr0/b;->c:Lcom/whoop/communityhighlightscontainer/domain/model/CommunityHighlightsContainerResponse;

    iget-object v3, p0, Lpr0/b;->d:Ljava/lang/String;

    iget-object v4, p0, Lpr0/b;->e:Lpr0/d;

    const-string v5, ", isError="

    const-string v6, ", data="

    const-string v7, "CommunityHighlightsContainerDomainState(isLoading="

    invoke-static {v7, v5, v6, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", initialPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", paginationState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
