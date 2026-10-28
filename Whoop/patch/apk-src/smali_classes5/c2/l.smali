.class public final Lc2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public b:Lh2/c;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/l;->a:Ljava/util/List;

    const/4 p1, 0x0

    iput-object p1, p0, Lc2/l;->b:Lh2/c;

    iput-object p2, p0, Lc2/l;->c:Lkotlin/jvm/functions/Function1;

    sget-object p1, Li3/n;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result p1

    iput p1, p0, Lc2/l;->d:I

    return-void
.end method


# virtual methods
.method public final a()Lh2/c;
    .locals 1

    iget-object v0, p0, Lc2/l;->b:Lh2/c;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lc2/l;->d:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc2/l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc2/l;

    iget-object v1, p1, Lc2/l;->a:Ljava/util/List;

    iget-object v3, p0, Lc2/l;->a:Ljava/util/List;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc2/l;->b:Lh2/c;

    iget-object v3, p1, Lc2/l;->b:Lh2/c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc2/l;->c:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Lc2/l;->c:Lkotlin/jvm/functions/Function1;

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lc2/l;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc2/l;->b:Lh2/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lh2/c;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lc2/l;->c:Lkotlin/jvm/functions/Function1;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_1
    add-int/2addr v0, v2

    return v0
.end method
