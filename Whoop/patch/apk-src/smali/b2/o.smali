.class public final Lb2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/Modifier;


# instance fields
.field public final w:Landroidx/compose/ui/Modifier;

.field public final x:Landroidx/compose/ui/Modifier;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/Modifier;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/Modifier;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lkotlin/jvm/functions/Function1;)Z
    .locals 1

    iget-object v0, p0, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, p1}, Landroidx/compose/ui/Modifier;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    invoke-interface {v0, p1}, Landroidx/compose/ui/Modifier;->c(Lkotlin/jvm/functions/Function1;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lb2/o;

    if-eqz v0, :cond_0

    check-cast p1, Lb2/o;

    iget-object v0, p1, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    iget-object p1, p1, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lb2/o;->w:Landroidx/compose/ui/Modifier;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget-object v1, p0, Lb2/o;->x:Landroidx/compose/ui/Modifier;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1f

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, ""

    sget-object v2, Lb2/n;->w:Lb2/n;

    invoke-virtual {p0, v1, v2}, Lb2/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x5d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
