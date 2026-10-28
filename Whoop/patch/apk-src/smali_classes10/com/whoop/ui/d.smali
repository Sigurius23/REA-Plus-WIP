.class public final Lcom/whoop/ui/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;",
        "Lf93/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J$\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00042\n\u0010\u000e\u001a\u0006\u0012\u0002\u0008\u00030\u0013H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/ui/d;",
        "Landroid/view/View;",
        "T",
        "Lf93/c;",
        "Landroidx/fragment/app/m0;",
        "",
        "id",
        "fragment",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "cleanup",
        "<init>",
        "(ILandroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V",
        "",
        "property",
        "",
        "e",
        "(Ljava/lang/String;)Ljava/lang/Void;",
        "thisRef",
        "Lj93/z;",
        "f",
        "(Landroidx/fragment/app/m0;Lj93/z;)Landroid/view/View;",
        "w",
        "I",
        "x",
        "Landroidx/fragment/app/m0;",
        "y",
        "Lkotlin/jvm/functions/Function1;",
        "z",
        "Landroid/view/View;",
        "_value",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:I

.field private final x:Landroidx/fragment/app/m0;

.field private final y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private z:Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILandroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/fragment/app/m0;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cleanup"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/ui/d;->w:I

    iput-object p2, p0, Lcom/whoop/ui/d;->x:Landroidx/fragment/app/m0;

    iput-object p3, p0, Lcom/whoop/ui/d;->y:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p2}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance p2, Lcom/whoop/ui/d$a;

    invoke-direct {p2, p0}, Lcom/whoop/ui/d$a;-><init>(Lcom/whoop/ui/d;)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/ui/d;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/d;->y:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/ui/d;)Landroidx/fragment/app/m0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/d;->x:Landroidx/fragment/app/m0;

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/ui/d;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/d;->z:Landroid/view/View;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/ui/d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/d;->z:Landroid/view/View;

    return-void
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/Void;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\n                AutoClearedView accessed "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " before this Fragment\'s View was\n                created or after this Fragment\'s onDestroyView callback was invoked.\n        "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public f(Landroidx/fragment/app/m0;Lj93/z;)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Lj93/z;",
            ")TT;"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "property"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/d;->z:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    iget p2, p0, Lcom/whoop/ui/d;->w:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/whoop/ui/d;->x:Landroidx/fragment/app/m0;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    if-eqz p1, :cond_1

    iget p2, p0, Lcom/whoop/ui/d;->w:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, "unknown"

    :cond_2
    const-string p2, "AutoClearedView failed to find view with id "

    const-string v0, " in this Fragment\'s root view"

    invoke-static {p2, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    iput-object p1, p0, Lcom/whoop/ui/d;->z:Landroid/view/View;

    return-object p1

    :cond_4
    invoke-interface {p2}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/d;->e(Ljava/lang/String;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/fragment/app/m0;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/d;->f(Landroidx/fragment/app/m0;Lj93/z;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
