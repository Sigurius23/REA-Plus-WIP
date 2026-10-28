.class public final Lub3/h;
.super Lm83/j;
.source "SourceFile"


# static fields
.field public static final synthetic y:I


# instance fields
.field public w:Ljava/lang/Object;

.field public x:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lub3/h;->x:I

    return v0
.end method

.method public final add(Ljava/lang/Object;)Z
    .locals 4

    iget v0, p0, Lub3/h;->x:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-object p1, p0, Lub3/h;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_0
    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lub3/h;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    const/4 v2, 0x5

    if-ge v0, v2, :cond_5

    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0, p1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget v2, p0, Lub3/h;->x:I

    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    array-length v2, v0

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "elements"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/LinkedHashSet;

    array-length v3, v0

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-static {v0, v2}, Lm83/n;->S0([Ljava/lang/Object;Ljava/util/HashSet;)V

    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    const-string v0, "copyOf(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, v2

    sub-int/2addr v0, v1

    aput-object p1, v2, v0

    :goto_0
    iput-object v2, p0, Lub3/h;->w:Ljava/lang/Object;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->d(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_6
    :goto_2
    iget p1, p0, Lub3/h;->x:I

    add-int/2addr p1, v1

    iput p1, p0, Lub3/h;->x:I

    return v1
.end method

.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Lub3/h;->x:I

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 2

    invoke-virtual {p0}, Lub3/h;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lub3/h;->a()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    invoke-virtual {p0}, Lub3/h;->a()I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0, p1}, Lm83/n;->a0([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    iget v0, p0, Lub3/h;->x:I

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    new-instance v0, Lub3/g;

    iget-object v1, p0, Lub3/h;->w:Ljava/lang/Object;

    invoke-direct {v0, v1}, Lub3/g;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    const/4 v1, 0x5

    if-ge v0, v1, :cond_2

    new-instance v0, Lm83/t;

    iget-object v1, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, [Ljava/lang/Object;

    invoke-direct {v0, v1}, Lm83/t;-><init>([Ljava/lang/Object;)V

    return-object v0

    :cond_2
    iget-object v0, p0, Lub3/h;->w:Ljava/lang/Object;

    const-string v1, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->d(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
