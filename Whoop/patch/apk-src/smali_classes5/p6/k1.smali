.class public final Lp6/k1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lp6/k1;


# instance fields
.field public final a:[J

.field public final b:[Landroid/widget/RemoteViews;

.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lp6/k1;

    const/4 v1, 0x0

    new-array v2, v1, [J

    new-array v1, v1, [Landroid/widget/RemoteViews;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v1, v3}, Lp6/k1;-><init>([J[Landroid/widget/RemoteViews;I)V

    sput-object v0, Lp6/k1;->d:Lp6/k1;

    return-void
.end method

.method public constructor <init>([J[Landroid/widget/RemoteViews;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/k1;->a:[J

    iput-object p2, p0, Lp6/k1;->b:[Landroid/widget/RemoteViews;

    iput p3, p0, Lp6/k1;->c:I

    array-length p1, p1

    array-length v0, p2

    if-ne p1, v0, :cond_3

    const/4 p1, 0x1

    if-lt p3, p1, :cond_2

    new-instance p1, Ljava/util/ArrayList;

    array-length p3, p2

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    array-length p3, p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    aget-object v1, p2, v0

    invoke-virtual {v1}, Landroid/widget/RemoteViews;->getLayoutId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    iget p2, p0, Lp6/k1;->c:I

    if-gt p1, p2, :cond_1

    return-void

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "View type count is set to "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Lp6/k1;->c:I

    const-string v0, ", but the collection contains "

    const-string v1, " different layout ids"

    invoke-static {p2, p3, v0, p1, v1}, Lnh3/a;->i(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "View type count must be >= 1"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "RemoteCollectionItems has different number of ids and views"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
