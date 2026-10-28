.class public final Lmb3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lza3/b;


# instance fields
.field public final E:Ljava/lang/Object;

.field public final w:Llb3/u0;

.field public x:Lc93/a;

.field public final y:Lmb3/i;

.field public final z:Lr93/x0;


# direct methods
.method public constructor <init>(Llb3/u0;Lc93/a;Lmb3/i;Lr93/x0;)V
    .locals 1

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmb3/i;->w:Llb3/u0;

    .line 3
    iput-object p2, p0, Lmb3/i;->x:Lc93/a;

    .line 4
    iput-object p3, p0, Lmb3/i;->y:Lmb3/i;

    .line 5
    iput-object p4, p0, Lmb3/i;->z:Lr93/x0;

    .line 6
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lbg/j;

    const/16 p3, 0x8

    invoke-direct {p2, p0, p3}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lmb3/i;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Llb3/u0;Lg40/d;Lr93/x0;I)V
    .locals 2

    and-int/lit8 v0, p4, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    move-object p3, v1

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, v1, p3}, Lmb3/i;-><init>(Llb3/u0;Lc93/a;Lmb3/i;Lr93/x0;)V

    return-void
.end method

.method public constructor <init>(Llb3/u0;Ljava/util/ArrayList;)V
    .locals 2

    .line 8
    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lg40/d;

    const/16 v1, 0x9

    invoke-direct {v0, p2, v1}, Lg40/d;-><init>(Ljava/util/ArrayList;I)V

    const/4 p2, 0x0

    const/16 v1, 0x8

    invoke-direct {p0, p1, v0, p2, v1}, Lmb3/i;-><init>(Llb3/u0;Lg40/d;Lr93/x0;I)V

    return-void
.end method


# virtual methods
.method public final b()Llb3/u0;
    .locals 1

    iget-object v0, p0, Lmb3/i;->w:Llb3/u0;

    return-object v0
.end method

.method public final c()Lo93/h;
    .locals 2

    iget-object v0, p0, Lmb3/i;->w:Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lr93/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    const-class v2, Lmb3/i;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    return v2

    :cond_2
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lmb3/i;

    iget-object v3, p0, Lmb3/i;->y:Lmb3/i;

    if-nez v3, :cond_3

    move-object v3, p0

    :cond_3
    iget-object v1, v1, Lmb3/i;->y:Lmb3/i;

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v1

    :goto_1
    if-ne v3, p1, :cond_5

    return v0

    :cond_5
    return v2
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getSupertypes()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lmb3/i;->E:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_0
    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lmb3/i;->y:Lmb3/i;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmb3/i;->hashCode()I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CapturedType("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lmb3/i;->w:Llb3/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
