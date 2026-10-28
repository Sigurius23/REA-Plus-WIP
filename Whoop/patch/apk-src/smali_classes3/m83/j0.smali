.class public final Lm83/j0;
.super Lm83/e;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm83/j0;->w:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lm83/j0;->w:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm83/j0;->w:Ljava/util/List;

    invoke-static {p1, p0}, Lm83/s;->m0(ILjava/util/List;)I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    new-instance v0, Lm83/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm83/h0;-><init>(Lm83/j0;I)V

    return-object v0
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 2

    .line 1
    new-instance v0, Lm83/h0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lm83/h0;-><init>(Lm83/j0;I)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 2
    new-instance v0, Lm83/h0;

    invoke-direct {v0, p0, p1}, Lm83/h0;-><init>(Lm83/j0;I)V

    return-object v0
.end method
