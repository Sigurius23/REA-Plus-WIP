.class public final Lvh0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lvh0/e;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/navigation/e;",
        "navigation",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V",
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
        "c",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "ai-insights_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lgz0/m0;

.field private final c:Lcom/whoop/navigation/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v1

    sput v0, Lvh0/e;->d:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lvh0/e;->b:Lgz0/m0;

    .line 4
    iput-object p3, p0, Lvh0/e;->c:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lvh0/e;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-void
.end method


# virtual methods
.method public final a()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lvh0/e;->b:Lgz0/m0;

    return-object v0
.end method

.method public final b()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lvh0/e;->c:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lvh0/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lvh0/e;

    iget-object v1, p0, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lvh0/e;->b:Lgz0/m0;

    iget-object v3, p1, Lvh0/e;->b:Lgz0/m0;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lvh0/e;->c:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lvh0/e;->c:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvh0/e;->b:Lgz0/m0;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lvh0/e;->c:Lcom/whoop/navigation/e;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lvh0/e;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lvh0/e;->b:Lgz0/m0;

    iget-object v2, p0, Lvh0/e;->c:Lcom/whoop/navigation/e;

    const-string v3, ", icon="

    const-string v4, ", navigation="

    const-string v5, "ScreenButtonViewState(text="

    invoke-static {v5, v0, v3, v1, v4}, Ljh3/c;->k(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-static {v0, v2, v1}, Lte0/d;->o(Ljava/lang/StringBuilder;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
