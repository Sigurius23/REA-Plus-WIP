.class public abstract Lp1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/e1;

.field public static final b:Lp1/e1;

.field public static final c:Lp1/e1;

.field public static final d:Lp1/e1;

.field public static final e:Lp1/e1;

.field public static final f:La3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp1/e1;

    const-string v1, "provider"

    invoke-direct {v0, v1}, Lp1/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp1/r;->a:Lp1/e1;

    new-instance v0, Lp1/e1;

    invoke-direct {v0, v1}, Lp1/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp1/r;->b:Lp1/e1;

    new-instance v0, Lp1/e1;

    const-string v1, "compositionLocalMap"

    invoke-direct {v0, v1}, Lp1/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp1/r;->c:Lp1/e1;

    new-instance v0, Lp1/e1;

    const-string v1, "providers"

    invoke-direct {v0, v1}, Lp1/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp1/r;->d:Lp1/e1;

    new-instance v0, Lp1/e1;

    const-string v1, "reference"

    invoke-direct {v0, v1}, Lp1/e1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lp1/r;->e:Lp1/e1;

    new-instance v0, La3/e0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, La3/e0;-><init>(I)V

    sput-object v0, Lp1/r;->f:La3/e0;

    return-void
.end method

.method public static final a(IILjava/util/List;)V
    .locals 1

    invoke-static {p0, p2}, Lp1/r;->e(ILjava/util/List;)I

    move-result p0

    if-gez p0, :cond_0

    add-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/o0;

    iget v0, v0, Lp1/o0;->b:I

    if-ge v0, p1, :cond_1

    invoke-interface {p2, p0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp1/o0;

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final b(Lp1/e2;Ljava/util/ArrayList;I)V
    .locals 3

    invoke-virtual {p0, p2}, Lp1/e2;->l(I)Z

    move-result v0

    iget-object v1, p0, Lp1/e2;->b:[I

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lp1/e2;->n(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    add-int/lit8 v0, p2, 0x1

    mul-int/lit8 v2, p2, 0x5

    add-int/lit8 v2, v2, 0x3

    aget v2, v1, v2

    add-int/2addr v2, p2

    :goto_0
    if-ge v0, v2, :cond_1

    invoke-static {p0, p1, v0}, Lp1/r;->b(Lp1/e2;Ljava/util/ArrayList;I)V

    mul-int/lit8 p2, v0, 0x5

    add-int/lit8 p2, p2, 0x3

    aget p2, v1, p2

    add-int/2addr v0, p2

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final c(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroidx/compose/runtime/ComposeRuntimeError;

    const-string v1, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    const-string v2, "). Please report to Google or use https://goo.gle/compose-feedback"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/compose/runtime/ComposeRuntimeError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(Ljava/lang/String;)Ljava/lang/Void;
    .locals 3

    new-instance v0, Landroidx/compose/runtime/ComposeRuntimeError;

    const-string v1, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API ("

    const-string v2, "). Please report to Google or use https://goo.gle/compose-feedback"

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Landroidx/compose/runtime/ComposeRuntimeError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final e(ILjava/util/List;)I
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :goto_0
    if-gt v1, v0, :cond_2

    add-int v2, v1, v0

    ushr-int/lit8 v2, v2, 0x1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp1/o0;

    iget v3, v3, Lp1/o0;->b:I

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v3

    if-gez v3, :cond_0

    add-int/lit8 v1, v2, 0x1

    goto :goto_0

    :cond_0
    if-lez v3, :cond_1

    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_1
    return v2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    neg-int p0, v1

    return p0
.end method

.method public static final f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Lp1/q0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lp1/q0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lp1/q0;->a()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lp1/q0;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {v0}, Lp1/q0;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lp1/r;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-virtual {v0}, Lp1/q0;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1, p2}, Lp1/r;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :cond_2
    return-object p0

    :cond_3
    return-object v1
.end method

.method public static final g(Lp1/i2;ILjava/lang/Object;)V
    .locals 2

    invoke-virtual {p0, p1}, Lp1/i2;->h(I)I

    move-result p1

    iget-object p0, p0, Lp1/i2;->c:[Ljava/lang/Object;

    aget-object v0, p0, p1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    aput-object v1, p0, p1

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Slot table is out of sync (expected "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", got "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lp1/r;->c(Ljava/lang/String;)V

    return-void
.end method
