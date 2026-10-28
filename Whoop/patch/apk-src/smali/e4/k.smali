.class public final Le4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Li4/g;

.field public b:I

.field public final c:I

.field public d:I

.field public e:Lad3/z;

.field public f:I

.field public final g:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Li4/g;

    const/4 v1, 0x0

    new-array v1, v1, [C

    invoke-direct {v0, v1}, Li4/b;-><init>([C)V

    iput-object v0, p0, Le4/k;->a:Li4/g;

    const/16 v0, 0x3e8

    iput v0, p0, Le4/k;->c:I

    iput v0, p0, Le4/k;->d:I

    const/4 v0, 0x0

    iput v0, p0, Le4/k;->f:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le4/k;->g:Ljava/util/ArrayList;

    return-void
.end method

.method public static b(Landroidx/compose/ui/Modifier;Le4/f;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Le4/j;

    invoke-direct {v0, p1, p2}, Le4/j;-><init>(Le4/f;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Le4/q;)Li4/g;
    .locals 5

    invoke-virtual {p1}, Le4/q;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Le4/k;->a:Li4/g;

    invoke-virtual {v0, p1}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v1

    instance-of v2, v1, Li4/g;

    if-eqz v2, :cond_0

    check-cast v1, Li4/g;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    new-instance v1, Li4/g;

    const/4 v2, 0x0

    new-array v2, v2, [C

    invoke-direct {v1, v2}, Li4/b;-><init>([C)V

    invoke-virtual {v0, p1, v1}, Li4/b;->B(Ljava/lang/String;Li4/c;)V

    :cond_1
    invoke-virtual {v0, p1}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    instance-of v2, v1, Li4/g;

    if-eqz v2, :cond_2

    check-cast v1, Li4/g;

    return-object v1

    :cond_2
    new-instance v2, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v3, "no object found for key <"

    const-string v4, ">, found ["

    invoke-static {v3, p1, v4}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {v1}, Li4/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] : "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v2
.end method

.method public final c()Le4/f;
    .locals 3

    iget v0, p0, Le4/k;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Le4/k;->f:I

    iget-object v1, p0, Le4/k;->g:Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le4/f;

    if-nez v0, :cond_0

    new-instance v0, Le4/f;

    iget v2, p0, Le4/k;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v2}, Le4/f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method

.method public final d()Lad3/z;
    .locals 2

    iget-object v0, p0, Le4/k;->e:Lad3/z;

    if-nez v0, :cond_0

    new-instance v0, Lad3/z;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Le4/k;->e:Lad3/z;

    :cond_0
    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Le4/k;->a:Li4/g;

    iget-object v0, v0, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget v0, p0, Le4/k;->c:I

    iput v0, p0, Le4/k;->d:I

    const/4 v0, 0x0

    iput v0, p0, Le4/k;->b:I

    iput v0, p0, Le4/k;->f:I

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Le4/k;

    if-eqz v0, :cond_1

    check-cast p1, Le4/k;

    iget-object p1, p1, Le4/k;->a:Li4/g;

    iget-object v0, p0, Le4/k;->a:Li4/g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Le4/k;->a:Li4/g;

    invoke-virtual {v0}, Li4/b;->hashCode()I

    move-result v0

    return v0
.end method
