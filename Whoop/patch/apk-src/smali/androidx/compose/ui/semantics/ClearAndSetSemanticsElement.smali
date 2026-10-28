.class public final Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;
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
        "Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;",
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
.field public final w:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final create()Lb2/v;
    .locals 4

    new-instance v0, Li3/c;

    const/4 v1, 0x1

    iget-object v2, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Li3/c;-><init>(Lkotlin/jvm/functions/Function1;ZZ)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;

    iget-object p1, p1, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final i()Li3/l;
    .locals 2

    new-instance v0, Li3/l;

    invoke-direct {v0}, Li3/l;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Li3/l;->y:Z

    const/4 v1, 0x1

    iput-boolean v1, v0, Li3/l;->z:Z

    iget-object v1, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final inspectableProperties(Lb3/l2;)V
    .locals 1

    const-string v0, "clearAndSetSemantics"

    invoke-virtual {p1, v0}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->i()Li3/l;

    move-result-object v0

    invoke-static {p1, v0}, Li3/n;->a(Lb3/l2;Li3/l;)V

    return-void
.end method

.method public final update(Lb2/v;)V
    .locals 1

    check-cast p1, Li3/c;

    iget-object v0, p0, Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;->w:Lkotlin/jvm/functions/Function1;

    iput-object v0, p1, Li3/c;->Q:Lkotlin/jvm/functions/Function1;

    return-void
.end method
