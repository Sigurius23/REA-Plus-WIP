.class public final Le4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/a0;


# instance fields
.field public final w:Le4/f;

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Le4/f;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/i;->w:Le4/f;

    iput-object p2, p0, Le4/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Le4/f;->c:Ljava/lang/Object;

    iput-object p1, p0, Le4/i;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final T()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le4/i;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Le4/i;

    if-eqz v0, :cond_0

    iget-object v0, p0, Le4/i;->w:Le4/f;

    iget-object v0, v0, Le4/f;->c:Ljava/lang/Object;

    check-cast p1, Le4/i;

    iget-object v1, p1, Le4/i;->w:Le4/f;

    iget-object v1, v1, Le4/f;->c:Ljava/lang/Object;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Le4/i;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Le4/i;->x:Lkotlin/jvm/functions/Function1;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Le4/i;->w:Le4/f;

    iget-object v0, v0, Le4/f;->c:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Le4/i;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
