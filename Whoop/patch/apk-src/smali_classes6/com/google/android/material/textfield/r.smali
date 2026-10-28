.class public abstract Lcom/google/android/material/textfield/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final b:Lcom/google/android/material/textfield/q;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/google/android/material/internal/CheckableImageButton;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/google/android/material/textfield/q;->w:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object v0, p0, Lcom/google/android/material/textfield/r;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iput-object p1, p0, Lcom/google/android/material/textfield/r;->b:Lcom/google/android/material/textfield/q;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/r;->c:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/material/textfield/q;->G:Lcom/google/android/material/internal/CheckableImageButton;

    iput-object p1, p0, Lcom/google/android/material/textfield/r;->d:Lcom/google/android/material/internal/CheckableImageButton;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public e()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f()Landroid/view/View$OnClickListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public g()Landroid/view/View$OnFocusChangeListener;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Lcom/google/android/material/textfield/k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public i(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public j()Z
    .locals 1

    instance-of v0, p0, Lcom/google/android/material/textfield/l;

    return v0
.end method

.method public k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public l(Landroid/widget/EditText;)V
    .locals 0

    return-void
.end method

.method public m(Li5/f;)V
    .locals 0

    return-void
.end method

.method public n(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    return-void
.end method

.method public o(Z)V
    .locals 0

    return-void
.end method

.method public final p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/r;->b:Lcom/google/android/material/textfield/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/q;->f(Z)V

    return-void
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public r()V
    .locals 0

    return-void
.end method
