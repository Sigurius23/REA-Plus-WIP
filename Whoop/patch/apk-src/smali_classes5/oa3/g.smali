.class public final Loa3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhb3/p;


# static fields
.field public static final b:Loa3/g;

.field public static final c:Loa3/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Loa3/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loa3/g;->b:Loa3/g;

    new-instance v0, Loa3/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loa3/g;->c:Loa3/g;

    return-void
.end method

.method public static varargs a([Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "<init>("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")V"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-array p0, v2, [Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static varargs b(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;
    .locals 6

    const-string v0, "internalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2e

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static varargs d(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;
    .locals 1

    const-string v0, "signatures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "java/lang/"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Loa3/g;->b(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    move-result-object p0

    return-object p0
.end method

.method public static varargs e(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;
    .locals 1

    const-string v0, "java/util/"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Loa3/g;->b(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/LinkedHashSet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c(Lqa3/w0;Ljava/lang/String;Llb3/c0;Llb3/c0;)Llb3/y;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flexibleId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lowerBound"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlin.jvm.PlatformType"

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lnb3/k;->M:Lnb3/k;

    invoke-virtual {p3}, Llb3/c0;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4}, Llb3/c0;->toString()Ljava/lang/String;

    move-result-object p4

    filled-new-array {p2, p3, p4}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p2, Lta3/l;->f:Lwa3/o;

    invoke-virtual {p1, p2}, Lwa3/m;->l(Lwa3/o;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lka3/h;

    invoke-direct {p1, p3, p4}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1

    :cond_1
    invoke-static {p3, p4}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method
