.class public abstract Lcg/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/Set;

.field public static final c:Lcg/p;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    new-array v0, v0, [Lcg/t;

    const/4 v1, 0x0

    sget-object v2, Lcg/r;->d:Lcg/r;

    aput-object v2, v0, v1

    sget-object v2, Lcg/s;->d:Lcg/s;

    const/4 v3, 0x1

    aput-object v2, v0, v3

    sget-object v2, Lcg/q;->d:Lcg/q;

    const/4 v3, 0x2

    aput-object v2, v0, v3

    invoke-static {v0}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcg/t;->b:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcg/t;

    iget v2, v2, Lcg/t;->a:I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    new-instance v0, Lcg/p;

    invoke-direct {v0, v1}, Lcg/t;-><init>(I)V

    sput-object v0, Lcg/t;->c:Lcg/p;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcg/t;->a:I

    return-void
.end method


# virtual methods
.method public final a(Lcg/t;)Z
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lcg/t;->a:I

    iget p1, p1, Lcg/t;->a:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lcg/t;

    if-eqz v0, :cond_0

    check-cast p1, Lcg/t;

    iget p1, p1, Lcg/t;->a:I

    iget v0, p0, Lcg/t;->a:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lcg/t;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    sget-object v0, Lcg/t;->b:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcg/t;

    invoke-virtual {p0, v3}, Lcg/t;->a(Lcg/t;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, "|"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
