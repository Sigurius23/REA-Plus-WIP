.class public final Lwb2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J4\u0010\u0008\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0014\u001a\u0004\u0008\u0018\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0014\u001a\u0004\u0008\u0019\u0010\u0016\u00a8\u0006\u001a"
    }
    d2 = {
        "Lwb2/a;",
        "",
        "Ly71/o;",
        "advancedLabsItem",
        "shopMenuItem",
        "smsSettingsMenuItem",
        "<init>",
        "(Ly71/o;Ly71/o;Ly71/o;)V",
        "a",
        "(Ly71/o;Ly71/o;Ly71/o;)Lwb2/a;",
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
        "Ly71/o;",
        "c",
        "()Ly71/o;",
        "b",
        "d",
        "e",
        "settings_release"
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
.field private final a:Ly71/o;

.field private final b:Ly71/o;

.field private final c:Ly71/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ly71/o;->q:I

    sput v0, Lwb2/a;->d:I

    return-void
.end method

.method public constructor <init>(Ly71/o;Ly71/o;Ly71/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lwb2/a;->a:Ly71/o;

    .line 3
    iput-object p2, p0, Lwb2/a;->b:Ly71/o;

    .line 4
    iput-object p3, p0, Lwb2/a;->c:Ly71/o;

    return-void
.end method

.method public synthetic constructor <init>(Ly71/o;Ly71/o;Ly71/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 5
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lwb2/a;-><init>(Ly71/o;Ly71/o;Ly71/o;)V

    return-void
.end method

.method public static synthetic b(Lwb2/a;Ly71/o;Ly71/o;Ly71/o;ILjava/lang/Object;)Lwb2/a;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lwb2/a;->a:Ly71/o;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lwb2/a;->b:Ly71/o;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lwb2/a;->c:Ly71/o;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lwb2/a;->a(Ly71/o;Ly71/o;Ly71/o;)Lwb2/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ly71/o;Ly71/o;Ly71/o;)Lwb2/a;
    .locals 1

    new-instance v0, Lwb2/a;

    invoke-direct {v0, p1, p2, p3}, Lwb2/a;-><init>(Ly71/o;Ly71/o;Ly71/o;)V

    return-object v0
.end method

.method public final c()Ly71/o;
    .locals 1

    iget-object v0, p0, Lwb2/a;->a:Ly71/o;

    return-object v0
.end method

.method public final d()Ly71/o;
    .locals 1

    iget-object v0, p0, Lwb2/a;->b:Ly71/o;

    return-object v0
.end method

.method public final e()Ly71/o;
    .locals 1

    iget-object v0, p0, Lwb2/a;->c:Ly71/o;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lwb2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lwb2/a;

    iget-object v1, p0, Lwb2/a;->a:Ly71/o;

    iget-object v3, p1, Lwb2/a;->a:Ly71/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lwb2/a;->b:Ly71/o;

    iget-object v3, p1, Lwb2/a;->b:Ly71/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lwb2/a;->c:Ly71/o;

    iget-object p1, p1, Lwb2/a;->c:Ly71/o;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lwb2/a;->a:Ly71/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ly71/o;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lwb2/a;->b:Ly71/o;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ly71/o;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lwb2/a;->c:Ly71/o;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ly71/o;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lwb2/a;->a:Ly71/o;

    iget-object v1, p0, Lwb2/a;->b:Ly71/o;

    iget-object v2, p0, Lwb2/a;->c:Ly71/o;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SettingsLandingState(advancedLabsItem="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", shopMenuItem="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", smsSettingsMenuItem="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
