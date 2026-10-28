.class public final Lkj2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u001a\u001a\u0004\u0008\u001b\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lkj2/g;",
        "",
        "Lnj2/l;",
        "monitor",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/domain/calendar/CalendarDomainState;",
        "calendar",
        "<init>",
        "(Lnj2/l;Lh91/b;)V",
        "a",
        "()Lnj2/l;",
        "b",
        "()Lh91/b;",
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
        "Lnj2/l;",
        "getMonitor",
        "Lh91/b;",
        "getCalendar",
        "stress_release"
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
.field private final a:Lnj2/l;

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

    sput v0, Lkj2/g;->c:I

    return-void
.end method

.method public constructor <init>(Lnj2/l;Lh91/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnj2/l;",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "monitor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj2/g;->a:Lnj2/l;

    iput-object p2, p0, Lkj2/g;->b:Lh91/b;

    return-void
.end method


# virtual methods
.method public final a()Lnj2/l;
    .locals 1

    iget-object v0, p0, Lkj2/g;->a:Lnj2/l;

    return-object v0
.end method

.method public final b()Lh91/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkj2/g;->b:Lh91/b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lkj2/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lkj2/g;

    iget-object v1, p0, Lkj2/g;->a:Lnj2/l;

    iget-object v3, p1, Lkj2/g;->a:Lnj2/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lkj2/g;->b:Lh91/b;

    iget-object p1, p1, Lkj2/g;->b:Lh91/b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lkj2/g;->a:Lnj2/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lkj2/g;->b:Lh91/b;

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

    iget-object v0, p0, Lkj2/g;->a:Lnj2/l;

    iget-object v1, p0, Lkj2/g;->b:Lh91/b;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "StressCombinedState(monitor="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", calendar="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
