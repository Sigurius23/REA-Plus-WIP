.class public final Lc2/d;
.super Lc2/k;
.source "SourceFile"


# instance fields
.field public final a:Lad3/z;

.field public final b:Li3/r;

.field public final c:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final d:Lj3/b;

.field public final e:Ljava/lang/String;

.field public final f:Landroid/graphics/Rect;

.field public final g:Landroid/view/autofill/AutofillId;

.field public final h:La0/h0;

.field public i:Z


# direct methods
.method public constructor <init>(Lad3/z;Li3/r;Landroidx/compose/ui/platform/AndroidComposeView;Lj3/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/d;->a:Lad3/z;

    iput-object p2, p0, Lc2/d;->b:Li3/r;

    iput-object p3, p0, Lc2/d;->c:Landroidx/compose/ui/platform/AndroidComposeView;

    iput-object p4, p0, Lc2/d;->d:Lj3/b;

    iput-object p5, p0, Lc2/d;->e:Ljava/lang/String;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lc2/d;->f:Landroid/graphics/Rect;

    const/4 p1, 0x1

    invoke-virtual {p3, p1}, Landroid/view/View;->setImportantForAutofill(I)V

    invoke-virtual {p3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, p0, Lc2/d;->g:Landroid/view/autofill/AutofillId;

    new-instance p1, La0/h0;

    invoke-direct {p1}, La0/h0;-><init>()V

    iput-object p1, p0, Lc2/d;->h:La0/h0;

    return-void

    :cond_0
    const-string p1, "Required value was null."

    invoke-static {p1}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1
.end method
