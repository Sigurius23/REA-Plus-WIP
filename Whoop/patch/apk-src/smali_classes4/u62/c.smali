.class public final Lu62/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lu62/c;",
        "",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lit0/b;",
        "firmwareFeatureFlagSyncService",
        "Lel1/b;",
        "historySyncStatusHook",
        "<init>",
        "(Lci2/b;Lit0/b;Lel1/b;)V",
        "Lu62/a;",
        "fetchRemoteStatus",
        "",
        "a",
        "(Lu62/a;Lq83/d;)Ljava/lang/Object;",
        "Lci2/b;",
        "getWhoopStrapProvider",
        "()Lci2/b;",
        "Lec3/f2;",
        "Lit0/a;",
        "b",
        "Lec3/f2;",
        "currentFirmwareFeatureFlagState",
        "Lec3/l;",
        "Lel1/a;",
        "c",
        "Lec3/l;",
        "historySyncStatus",
        "Ljk0/d;",
        "()Ljk0/d;",
        "currentWhoopStrap",
        "remote-device-config_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final a:Lci2/b;

.field private final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final c:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lci2/b;Lit0/b;Lel1/b;)V
    .locals 1

    const-string v0, "whoopStrapProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firmwareFeatureFlagSyncService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "historySyncStatusHook"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu62/c;->a:Lci2/b;

    invoke-virtual {p2}, Lit0/b;->a()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lu62/c;->b:Lec3/f2;

    invoke-virtual {p3}, Lel1/b;->a()Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lu62/c;->c:Lec3/l;

    return-void
.end method

.method private final b()Ljk0/d;
    .locals 1

    iget-object v0, p0, Lu62/c;->a:Lci2/b;

    invoke-interface {v0}, Lci2/b;->c()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljk0/d;

    return-object v0
.end method


# virtual methods
.method public final a(Lu62/a;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu62/a;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lu62/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lu62/c$a;

    iget v1, v0, Lu62/c$a;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu62/c$a;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu62/c$a;

    invoke-direct {v0, p0, p2}, Lu62/c$a;-><init>(Lu62/c;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lu62/c$a;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lu62/c$a;->F:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lu62/c$a;->y:I

    iget v1, v0, Lu62/c$a;->x:I

    iget-object v0, v0, Lu62/c$a;->w:Ljava/lang/Object;

    check-cast v0, Lu62/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move v2, p1

    move-object p1, v0

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lu62/c;->b()Ljk0/d;

    move-result-object p2

    if-eqz p2, :cond_3

    move p2, v4

    goto :goto_1

    :cond_3
    move p2, v3

    :goto_1
    iget-object v2, p0, Lu62/c;->b:Lec3/f2;

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v5, Lit0/a;->RUNNING:Lit0/a;

    if-ne v2, v5, :cond_4

    move v2, v4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_2
    iget-object v5, p0, Lu62/c;->c:Lec3/l;

    iput-object p1, v0, Lu62/c$a;->w:Ljava/lang/Object;

    iput p2, v0, Lu62/c$a;->x:I

    iput v2, v0, Lu62/c$a;->y:I

    iput v4, v0, Lu62/c$a;->F:I

    invoke-static {v5, v0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    return-object v1

    :cond_5
    move v1, p2

    move-object p2, v0

    :goto_3
    sget-object v0, Lel1/a;->IN_PROGRESS:Lel1/a;

    if-ne p2, v0, :cond_6

    move p2, v4

    goto :goto_4

    :cond_6
    move p2, v3

    :goto_4
    sget-object v0, Lu62/a;->FETCHED:Lu62/a;

    if-eq p1, v0, :cond_8

    sget-object v0, Lu62/a;->CACHED:Lu62/a;

    if-ne p1, v0, :cond_7

    goto :goto_5

    :cond_7
    move p1, v3

    goto :goto_6

    :cond_8
    :goto_5
    move p1, v4

    :goto_6
    if-eqz v1, :cond_9

    if-nez v2, :cond_9

    if-nez p2, :cond_9

    if-eqz p1, :cond_9

    move v3, v4

    :cond_9
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
