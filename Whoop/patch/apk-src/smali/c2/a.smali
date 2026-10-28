.class public final Lc2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/h;


# instance fields
.field public final a:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final b:Lc2/m;

.field public final c:Landroid/view/autofill/AutofillManager;

.field public final d:Landroid/view/autofill/AutofillId;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;Lc2/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/a;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p2, p0, Lc2/a;->b:Lc2/m;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/autofill/AutofillManager;

    if-eqz p2, :cond_1

    iput-object p2, p0, Lc2/a;->c:Landroid/view/autofill/AutofillManager;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAutofill(I)V

    invoke-virtual {p1}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lc2/a;->d:Landroid/view/autofill/AutofillId;

    return-void

    :cond_0
    const-string p1, "Required value was null."

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Autofill service could not be located."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Lc2/l;)V
    .locals 5

    invoke-virtual {p1}, Lc2/l;->a()Lh2/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc2/l;->b()I

    move-result p1

    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Lh2/c;->a:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v3, v0, Lh2/c;->b:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget v4, v0, Lh2/c;->c:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    iget v0, v0, Lh2/c;->d:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    iget-object v0, p0, Lc2/a;->c:Landroid/view/autofill/AutofillManager;

    iget-object v2, p0, Lc2/a;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v0, v2, p1, v1}, Landroid/view/autofill/AutofillManager;->notifyViewEntered(Landroid/view/View;ILandroid/graphics/Rect;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "requestAutofill called before onChildPositioned()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
