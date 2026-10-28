.class public final Lzp2/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzp2/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzp2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\u000c\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Lzp2/g$b;",
        "Lzp2/g;",
        "Lzp2/k;",
        "progressResult",
        "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;",
        "contentModelV2",
        "",
        "submittedTimeCapsuleText",
        "<init>",
        "(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)V",
        "b",
        "(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)Lzp2/g$b;",
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
        "Lzp2/k;",
        "()Lzp2/k;",
        "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;",
        "d",
        "()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;",
        "c",
        "Ljava/lang/String;",
        "e",
        "user-journey_release"
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
.field private final a:Lzp2/k;

.field private final b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)V
    .locals 1

    const-string v0, "progressResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentModelV2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzp2/g$b;->a:Lzp2/k;

    iput-object p2, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    iput-object p3, p0, Lzp2/g$b;->c:Ljava/lang/String;

    return-void
.end method

.method public static synthetic c(Lzp2/g$b;Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;ILjava/lang/Object;)Lzp2/g$b;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lzp2/g$b;->a:Lzp2/k;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lzp2/g$b;->c:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lzp2/g$b;->b(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)Lzp2/g$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Lzp2/k;
    .locals 1

    iget-object v0, p0, Lzp2/g$b;->a:Lzp2/k;

    return-object v0
.end method

.method public final b(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)Lzp2/g$b;
    .locals 1

    const-string v0, "progressResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentModelV2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzp2/g$b;

    invoke-direct {v0, p1, p2, p3}, Lzp2/g$b;-><init>(Lzp2/k;Lcom/whoop/user/journey/model/UserJourneyContentModelV2;Ljava/lang/String;)V

    return-object v0
.end method

.method public final d()Lcom/whoop/user/journey/model/UserJourneyContentModelV2;
    .locals 1

    iget-object v0, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lzp2/g$b;->c:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lzp2/g$b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lzp2/g$b;

    iget-object v1, p0, Lzp2/g$b;->a:Lzp2/k;

    iget-object v3, p1, Lzp2/g$b;->a:Lzp2/k;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    iget-object v3, p1, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lzp2/g$b;->c:Ljava/lang/String;

    iget-object p1, p1, Lzp2/g$b;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lzp2/g$b;->a:Lzp2/k;

    invoke-virtual {v0}, Lzp2/k;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    invoke-virtual {v1}, Lcom/whoop/user/journey/model/UserJourneyContentModelV2;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lzp2/g$b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lzp2/g$b;->a:Lzp2/k;

    iget-object v1, p0, Lzp2/g$b;->b:Lcom/whoop/user/journey/model/UserJourneyContentModelV2;

    iget-object v2, p0, Lzp2/g$b;->c:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "V2(progressResult="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", contentModelV2="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", submittedTimeCapsuleText="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v2, v0, v3}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
