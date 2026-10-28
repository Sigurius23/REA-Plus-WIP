.class public final Le4/j;
.super Lb3/m2;
.source "SourceFile"

# interfaces
.implements Ly2/g1;


# instance fields
.field public final x:Le4/f;

.field public final y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Le4/f;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le4/j;->x:Le4/f;

    iput-object p2, p0, Le4/j;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Le4/j;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Le4/j;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    iget-object v1, p1, Le4/j;->y:Lkotlin/jvm/functions/Function1;

    :cond_1
    iget-object p1, p0, Le4/j;->y:Lkotlin/jvm/functions/Function1;

    if-ne p1, v1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final g()Ljava/lang/Object;
    .locals 3

    new-instance v0, Le4/i;

    iget-object v1, p0, Le4/j;->x:Le4/f;

    iget-object v2, p0, Le4/j;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2}, Le4/i;-><init>(Le4/f;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Le4/j;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
