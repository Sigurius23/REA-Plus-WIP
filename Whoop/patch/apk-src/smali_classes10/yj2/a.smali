.class public final Lyj2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0018\u001a\u0004\u0008\u0014\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lyj2/a;",
        "",
        "Lwj2/b;",
        "domainResult",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendarState",
        "<init>",
        "(Lwj2/b;Lh91/b;)V",
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
        "Lwj2/b;",
        "b",
        "()Lwj2/b;",
        "Lh91/b;",
        "()Lh91/b;",
        "tilt-graph_release"
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
.field public static final c:I


# instance fields
.field private final a:Lwj2/b;

.field private final b:Lh91/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lh91/b;->k:I

    sput v0, Lyj2/a;->c:I

    return-void
.end method

.method public constructor <init>(Lwj2/b;Lh91/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwj2/b;",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyj2/a;->a:Lwj2/b;

    iput-object p2, p0, Lyj2/a;->b:Lh91/b;

    return-void
.end method


# virtual methods
.method public final a()Lh91/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyj2/a;->b:Lh91/b;

    return-object v0
.end method

.method public final b()Lwj2/b;
    .locals 1

    iget-object v0, p0, Lyj2/a;->a:Lwj2/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lyj2/a;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lyj2/a;

    iget-object v1, p0, Lyj2/a;->a:Lwj2/b;

    iget-object v3, p1, Lyj2/a;->a:Lwj2/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lyj2/a;->b:Lh91/b;

    iget-object p1, p1, Lyj2/a;->b:Lh91/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lyj2/a;->a:Lwj2/b;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lyj2/a;->b:Lh91/b;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lh91/b;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lyj2/a;->a:Lwj2/b;

    iget-object v1, p0, Lyj2/a;->b:Lh91/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "TiltGraphCombinedDomainState(domainResult="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", calendarState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
