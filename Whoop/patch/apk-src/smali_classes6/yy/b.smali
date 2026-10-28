.class public final Lyy/b;
.super Lyy/m0;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Ljava/util/LinkedHashMap;

.field public final c:Lyy/k0;

.field public final d:Li93/j;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyy/b;->a:Ljava/util/LinkedHashMap;

    iput-object p2, p0, Lyy/b;->b:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Lyy/q;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, Lyy/q;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Lyv0/h;

    const/16 p1, 0xa

    invoke-direct {v4, p1}, Lyv0/h;-><init>(I)V

    const/16 v5, 0x1e

    const-string v1, "&"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    sget-object v0, Lyy/k0;->x:Lyy/k0;

    iput-object v0, p0, Lyy/b;->c:Lyy/k0;

    sget-object v0, Lyy/l0;->x:Lyy/l0;

    new-instance v0, Li93/j;

    const/4 v1, 0x1

    const/16 v2, 0x1ad

    invoke-direct {v0, v2, v2, v1}, Li93/h;-><init>(III)V

    iput-object v0, p0, Lyy/b;->d:Li93/j;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    move-object p2, p1

    :cond_1
    const-string p1, "https://q.stripe.com"

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "?"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lyy/b;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lyy/b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lyy/b;

    iget-object v0, p0, Lyy/b;->a:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lyy/b;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lyy/b;->b:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Lyy/b;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final getHeaders()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lyy/b;->b:Ljava/util/LinkedHashMap;

    return-object v0
.end method

.method public final getMethod()Lyy/k0;
    .locals 1

    iget-object v0, p0, Lyy/b;->c:Lyy/k0;

    return-object v0
.end method

.method public final getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lyy/b;->d:Li93/j;

    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lyy/b;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lyy/b;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lyy/b;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnalyticsRequest(params="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lyy/b;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", headers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyy/b;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
