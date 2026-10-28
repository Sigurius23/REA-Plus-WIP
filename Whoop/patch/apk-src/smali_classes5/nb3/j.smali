.class public final Lnb3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb3/q0;


# instance fields
.field public final w:Lnb3/k;

.field public final x:[Ljava/lang/String;

.field public final y:Ljava/lang/String;


# direct methods
.method public varargs constructor <init>(Lnb3/k;[Ljava/lang/String;)V
    .locals 1

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb3/j;->w:Lnb3/k;

    iput-object p2, p0, Lnb3/j;->x:[Ljava/lang/String;

    sget-object v0, Lnb3/b;->w:[Lnb3/b;

    iget-object p1, p1, Lnb3/k;->w:Ljava/lang/String;

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "[Error type: %s]"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lnb3/j;->y:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final c()Lo93/h;
    .locals 1

    sget-object v0, Lo93/e;->f:Ll83/p;

    invoke-static {}, Lce/w;->M()Lo93/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lr93/h;
    .locals 1

    sget-object v0, Lnb3/l;->a:Lnb3/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lnb3/l;->c:Lnb3/a;

    return-object v0
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

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb3/j;->y:Ljava/lang/String;

    return-object v0
.end method
