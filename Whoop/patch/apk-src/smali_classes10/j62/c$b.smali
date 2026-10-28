.class public final Lj62/c$b;
.super Lj62/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj62/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lj62/c$b;",
        "Lj62/c;",
        "Lcom/whoop/referafriend/domain/models/RafHubDomainState;",
        "screen",
        "",
        "source",
        "Lj62/f;",
        "modal",
        "<init>",
        "(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)V",
        "a",
        "(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)Lj62/c$b;",
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
        "Lcom/whoop/referafriend/domain/models/RafHubDomainState;",
        "d",
        "()Lcom/whoop/referafriend/domain/models/RafHubDomainState;",
        "b",
        "Ljava/lang/String;",
        "e",
        "c",
        "Lj62/f;",
        "()Lj62/f;",
        "refer-a-friend_release"
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
.field private final a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

.field private final b:Ljava/lang/String;

.field private final c:Lj62/f;


# direct methods
.method public constructor <init>(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)V
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lj62/c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    iput-object p2, p0, Lj62/c$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lj62/c$b;->c:Lj62/f;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lj62/c$b;-><init>(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)V

    return-void
.end method

.method public static synthetic b(Lj62/c$b;Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;ILjava/lang/Object;)Lj62/c$b;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lj62/c$b;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lj62/c$b;->c:Lj62/f;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lj62/c$b;->a(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)Lj62/c$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)Lj62/c$b;
    .locals 1

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj62/c$b;

    invoke-direct {v0, p1, p2, p3}, Lj62/c$b;-><init>(Lcom/whoop/referafriend/domain/models/RafHubDomainState;Ljava/lang/String;Lj62/f;)V

    return-object v0
.end method

.method public final c()Lj62/f;
    .locals 1

    iget-object v0, p0, Lj62/c$b;->c:Lj62/f;

    return-object v0
.end method

.method public final d()Lcom/whoop/referafriend/domain/models/RafHubDomainState;
    .locals 1

    iget-object v0, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lj62/c$b;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj62/c$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lj62/c$b;

    iget-object v1, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    iget-object v3, p1, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lj62/c$b;->b:Ljava/lang/String;

    iget-object v3, p1, Lj62/c$b;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lj62/c$b;->c:Lj62/f;

    iget-object p1, p1, Lj62/c$b;->c:Lj62/f;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/RafHubDomainState;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lj62/c$b;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lj62/c$b;->c:Lj62/f;

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
    .locals 5

    iget-object v0, p0, Lj62/c$b;->a:Lcom/whoop/referafriend/domain/models/RafHubDomainState;

    iget-object v1, p0, Lj62/c$b;->b:Ljava/lang/String;

    iget-object v2, p0, Lj62/c$b;->c:Lj62/f;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Loaded(screen="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", source="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", modal="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
