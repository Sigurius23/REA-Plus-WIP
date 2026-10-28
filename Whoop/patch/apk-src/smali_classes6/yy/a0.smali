.class public final Lyy/a0;
.super Lyy/e0;
.source "SourceFile"


# static fields
.field public static final b:Lyy/a0;

.field public static final c:Ljava/lang/String;

.field public static final d:Lm83/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyy/a0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lyy/a0;->b:Lyy/a0;

    const-string v0, "AndroidBindings/22.6.1"

    const-string v1, "Stripe/v1 "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lyy/a0;->c:Ljava/lang/String;

    sget-object v0, Lm83/z;->w:Lm83/z;

    sput-object v0, Lyy/a0;->d:Lm83/z;

    return-void
.end method


# virtual methods
.method public final c()Ljava/util/Map;
    .locals 1

    sget-object v0, Lyy/a0;->d:Lm83/z;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    sget-object v0, Lyy/a0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 7

    invoke-static {}, Lyy/e0;->b()Ljava/util/LinkedHashMap;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "\":\""

    const-string v5, "\""

    invoke-static {v5, v3, v4, v2, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "{"

    const-string v2, "}"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lyy/a0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x13ede933

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Analytics"

    return-object v0
.end method
