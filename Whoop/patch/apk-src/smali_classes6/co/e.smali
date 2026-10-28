.class public final Lco/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn/e;


# instance fields
.field public final w:Ljava/util/ArrayList;

.field public final x:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lco/e;->w:Ljava/util/ArrayList;

    iput-object p2, p0, Lco/e;->x:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(J)I
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    sget p2, Llo/y;->a:I

    iget-object p2, p0, Lco/e;->x:Ljava/util/ArrayList;

    invoke-static {p2, p1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    not-int p1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v1, :cond_1

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Comparable;

    invoke-interface {v2, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-ge p1, p2, :cond_2

    return p1

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public d(J)Ljava/util/List;
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    iget-object v0, p0, Lco/e;->x:Ljava/util/ArrayList;

    invoke-static {v0, p1, p2}, Llo/y;->c(Ljava/util/List;Ljava/lang/Long;Z)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1

    :cond_0
    iget-object p2, p0, Lco/e;->w:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public h(I)J
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-static {v2}, Llo/a;->e(Z)V

    iget-object v2, p0, Lco/e;->x:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge p1, v3, :cond_1

    move v0, v1

    :cond_1
    invoke-static {v0}, Llo/a;->e(Z)V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lco/e;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method
