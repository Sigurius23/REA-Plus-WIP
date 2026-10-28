.class public final Lcom/whoop/ui/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lf93/d;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u000cH\u0096\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ,\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u000c2\u0006\u0010\u0010\u001a\u00028\u0000H\u0096\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/ui/b;",
        "",
        "T",
        "Lf93/d;",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "cleanup",
        "<init>",
        "(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V",
        "thisRef",
        "Lj93/z;",
        "property",
        "e",
        "(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;",
        "value",
        "f",
        "(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V",
        "w",
        "Landroidx/fragment/app/m0;",
        "x",
        "Lkotlin/jvm/functions/Function1;",
        "y",
        "Ljava/lang/Object;",
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


# static fields
.field public static final z:I = 0x8


# instance fields
.field private final w:Landroidx/fragment/app/m0;

.field private final x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private y:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cleanup"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/b;->w:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lcom/whoop/ui/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance p2, Lcom/whoop/ui/b$a;

    invoke-direct {p2, p0}, Lcom/whoop/ui/b$a;-><init>(Lcom/whoop/ui/b;)V

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/ui/b;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/b;->x:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/ui/b;)Landroidx/fragment/app/m0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/b;->w:Landroidx/fragment/app/m0;

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/ui/b;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/b;->y:Ljava/lang/Object;

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/ui/b;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/b;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;
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

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ui/b;->y:Ljava/lang/Object;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p2}, Lj93/c;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "\n                AutoClearedValue accessed "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " before it was initialized, after it was set to null, or after\n                this Fragment\'s onDestroyView callback was invoked.\n        "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/fragment/app/m0;",
            "Lj93/z;",
            "TT;)V"
        }
    .end annotation

    const-string v0, "thisRef"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "value"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/whoop/ui/b;->y:Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/fragment/app/m0;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroidx/fragment/app/m0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
