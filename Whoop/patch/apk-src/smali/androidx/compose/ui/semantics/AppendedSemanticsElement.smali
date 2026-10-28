.class public final Landroidx/compose/ui/semantics/AppendedSemanticsElement;
.super La3/h1;
.source "SourceFile"

# interfaces
.implements Li3/m;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La3/h1;",
        "Li3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/semantics/AppendedSemanticsElement;",
        "La3/h1;",
        "Li3/c;",
        "Li3/m;",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final w:Z

.field public final x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    iput-object p2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Li3/c;

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    invoke-direct {v0, v2, v3, v1}, Li3/c;-><init>(Lkotlin/jvm/functions/Function1;ZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;

    iget-boolean v0, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    if-eq v1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    iget-object p1, p1, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    if-eq v0, p1, :cond_3

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Li3/l;
    .locals 2

    new-instance v0, Li3/l;

    invoke-direct {v0}, Li3/l;-><init>()V

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    iput-boolean v1, v0, Li3/l;->y:Z

    iget-object v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 3

    const-string v0, "semantics"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    iget-boolean v1, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "mergeDescendants"

    invoke-virtual {v0, v1, v2}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->i()Li3/l;

    move-result-object v0

    invoke-static {p1, v0}, Li3/n;->a(Lb3/l2;Li3/l;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Li3/c;

    iget-boolean v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->w:Z

    iput-boolean v0, p1, Li3/c;->O:Z

    iget-object v0, p0, Landroidx/compose/ui/semantics/AppendedSemanticsElement;->x:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Li3/c;->Q:Lkotlin/jvm/functions/Function1;

    return-void
.end method
