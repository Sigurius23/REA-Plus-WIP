.class public final Ljg2/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljg2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0087\u0008\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u000cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0015\u001a\u0004\u0008\u0017\u0010\u000cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0014\u0010\u001aR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Ljg2/b$a;",
        "",
        "",
        "id",
        "label",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V",
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
        "Ljava/lang/String;",
        "b",
        "d",
        "c",
        "Lgz0/m0;",
        "()Lgz0/m0;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "start-activity_release"
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
.field public static final e:I


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Lgz0/m0;

.field private final d:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Ljg2/b$a;->e:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljg2/b$a;->a:Ljava/lang/String;

    iput-object p2, p0, Ljg2/b$a;->b:Ljava/lang/String;

    iput-object p3, p0, Ljg2/b$a;->c:Lgz0/m0;

    iput-object p4, p0, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-void
.end method


# virtual methods
.method public final a()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ljg2/b$a;->c:Lgz0/m0;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljg2/b$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ljg2/b$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljg2/b$a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ljg2/b$a;

    iget-object v1, p0, Ljg2/b$a;->a:Ljava/lang/String;

    iget-object v3, p1, Ljg2/b$a;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Ljg2/b$a;->b:Ljava/lang/String;

    iget-object v3, p1, Ljg2/b$a;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Ljg2/b$a;->c:Lgz0/m0;

    iget-object v3, p1, Ljg2/b$a;->c:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object p1, p1, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Ljg2/b$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Ljg2/b$a;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Ljg2/b$a;->c:Lgz0/m0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Ljg2/b$a;->a:Ljava/lang/String;

    iget-object v1, p0, Ljg2/b$a;->b:Ljava/lang/String;

    iget-object v2, p0, Ljg2/b$a;->c:Lgz0/m0;

    iget-object v3, p0, Ljg2/b$a;->d:Lcom/whoop/navigation/models/GenericInteraction;

    const-string v4, ", label="

    const-string v5, ", icon="

    const-string v6, "Option(id="

    invoke-static {v6, v0, v4, v1, v5}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", interaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
