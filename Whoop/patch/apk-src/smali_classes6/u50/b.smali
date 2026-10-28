.class public final Lu50/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lu50/b;",
        "",
        "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "model",
        "Lu50/e;",
        "status",
        "",
        "exchangeInFlight",
        "<init>",
        "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)V",
        "a",
        "(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)Lu50/b;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "d",
        "()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;",
        "b",
        "Lu50/e;",
        "e",
        "()Lu50/e;",
        "c",
        "Z",
        "()Z",
        "access_release"
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
.field public static final d:I


# instance fields
.field private final a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

.field private final b:Lu50/e;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/FeatureListModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/TitleSubTitleModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/ImageUrlModel;->$stable:I

    or-int/2addr v0, v1

    sget v1, Lcom/whoop/design/models/items/NavigationBarModel;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lu50/b;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)V
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    .line 3
    iput-object p2, p0, Lu50/b;->b:Lu50/e;

    .line 4
    iput-boolean p3, p0, Lu50/b;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 5
    sget-object p2, Lu50/e$e;->a:Lu50/e$e;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lu50/b;-><init>(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)V

    return-void
.end method

.method public static synthetic b(Lu50/b;Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;ZILjava/lang/Object;)Lu50/b;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lu50/b;->b:Lu50/e;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lu50/b;->c:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lu50/b;->a(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)Lu50/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)Lu50/b;
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu50/b;

    invoke-direct {v0, p1, p2, p3}, Lu50/b;-><init>(Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;Lu50/e;Z)V

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lu50/b;->c:Z

    return v0
.end method

.method public final d()Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;
    .locals 1

    iget-object v0, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    return-object v0
.end method

.method public final e()Lu50/e;
    .locals 1

    iget-object v0, p0, Lu50/b;->b:Lu50/e;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lu50/b;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lu50/b;

    iget-object v1, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    iget-object v3, p1, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lu50/b;->b:Lu50/e;

    iget-object v3, p1, Lu50/b;->b:Lu50/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lu50/b;->c:Z

    iget-boolean p1, p1, Lu50/b;->c:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lu50/b;->b:Lu50/e;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-boolean v0, p0, Lu50/b;->c:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lu50/b;->a:Lcom/whoop/access/omronauth/domain/models/OmronAuthModel;

    iget-object v1, p0, Lu50/b;->b:Lu50/e;

    iget-boolean v2, p0, Lu50/b;->c:Z

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "OmronAuthDomainState(model="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", exchangeInFlight="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v3, v2, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
