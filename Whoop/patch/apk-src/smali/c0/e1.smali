.class public abstract Lc0/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc0/f1;

.field public static final b:Lc0/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lc0/f1;

    new-instance v1, Lc0/u1;

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {v0, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    sput-object v0, Lc0/e1;->a:Lc0/f1;

    new-instance v0, Lc0/f1;

    new-instance v1, Lc0/u1;

    const/16 v7, 0x2f

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;Ljava/util/LinkedHashMap;I)V

    invoke-direct {v0, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    sput-object v0, Lc0/e1;->b:Lc0/f1;

    return-void
.end method


# virtual methods
.method public final a(Lc0/e1;)Lc0/f1;
    .locals 8

    new-instance v0, Lc0/f1;

    new-instance v1, Lc0/u1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object v2, p1, Lc0/u1;->a:Lc0/g1;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Lc0/f1;

    iget-object v2, v2, Lc0/f1;->c:Lc0/u1;

    iget-object v2, v2, Lc0/u1;->a:Lc0/g1;

    :cond_0
    iget-object v3, p1, Lc0/u1;->b:Lc0/s1;

    if-nez v3, :cond_1

    move-object v3, p0

    check-cast v3, Lc0/f1;

    iget-object v3, v3, Lc0/f1;->c:Lc0/u1;

    iget-object v3, v3, Lc0/u1;->b:Lc0/s1;

    :cond_1
    iget-object v4, p1, Lc0/u1;->c:Lc0/k0;

    if-nez v4, :cond_2

    move-object v4, p0

    check-cast v4, Lc0/f1;

    iget-object v4, v4, Lc0/f1;->c:Lc0/u1;

    iget-object v4, v4, Lc0/u1;->c:Lc0/k0;

    :cond_2
    iget-object v5, p1, Lc0/u1;->d:Lc0/l1;

    if-nez v5, :cond_3

    move-object v5, p0

    check-cast v5, Lc0/f1;

    iget-object v5, v5, Lc0/f1;->c:Lc0/u1;

    iget-object v5, v5, Lc0/u1;->d:Lc0/l1;

    :cond_3
    iget-boolean v6, p1, Lc0/u1;->e:Z

    if-nez v6, :cond_5

    move-object v6, p0

    check-cast v6, Lc0/f1;

    iget-object v6, v6, Lc0/f1;->c:Lc0/u1;

    iget-boolean v6, v6, Lc0/u1;->e:Z

    if-eqz v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v6, 0x1

    :goto_1
    move-object v7, p0

    check-cast v7, Lc0/f1;

    iget-object v7, v7, Lc0/f1;->c:Lc0/u1;

    iget-object v7, v7, Lc0/u1;->f:Ljava/util/Map;

    iget-object p1, p1, Lc0/u1;->f:Ljava/util/Map;

    invoke-static {v7, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lc0/u1;-><init>(Lc0/g1;Lc0/s1;Lc0/k0;Lc0/l1;ZLjava/util/Map;)V

    invoke-direct {v0, v1}, Lc0/f1;-><init>(Lc0/u1;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lc0/e1;

    if-eqz v0, :cond_0

    check-cast p1, Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    move-object v0, p0

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    move-object v0, p0

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    invoke-virtual {v0}, Lc0/u1;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    sget-object v0, Lc0/e1;->a:Lc0/f1;

    invoke-virtual {p0, v0}, Lc0/e1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ExitTransition.None"

    return-object v0

    :cond_0
    sget-object v0, Lc0/e1;->b:Lc0/f1;

    invoke-virtual {p0, v0}, Lc0/e1;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "ExitTransition.KeepUntilTransitionsFinished"

    return-object v0

    :cond_1
    move-object v0, p0

    check-cast v0, Lc0/f1;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ExitTransition: \nFade - "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    iget-object v2, v0, Lc0/u1;->a:Lc0/g1;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lc0/g1;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nSlide - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lc0/u1;->b:Lc0/s1;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lc0/s1;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v3

    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nShrink - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lc0/k0;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v3

    :goto_2
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nScale - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, Lc0/u1;->d:Lc0/l1;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lc0/l1;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ",\nKeepUntilTransitionsFinished - "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, v0, Lc0/u1;->e:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
