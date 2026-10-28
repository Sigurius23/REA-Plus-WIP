.class public final Ls40/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls40/b1;->a:Landroid/content/Context;

    const p1, 0x1010435

    invoke-virtual {p0, p1}, Ls40/b1;->a(I)Landroid/util/TypedValue;

    move-result-object p1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    iput p1, p0, Ls40/b1;->b:I

    const p1, 0x1010429

    invoke-virtual {p0, p1}, Ls40/b1;->a(I)Landroid/util/TypedValue;

    move-result-object p1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    iput p1, p0, Ls40/b1;->c:I

    const p1, 0x1010036

    invoke-virtual {p0, p1}, Ls40/b1;->a(I)Landroid/util/TypedValue;

    move-result-object p1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    iput p1, p0, Ls40/b1;->d:I

    const p1, 0x1010038

    invoke-virtual {p0, p1}, Ls40/b1;->a(I)Landroid/util/TypedValue;

    move-result-object p1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    iput p1, p0, Ls40/b1;->e:I

    const p1, 0x1010433

    invoke-virtual {p0, p1}, Ls40/b1;->a(I)Landroid/util/TypedValue;

    move-result-object p1

    iget p1, p1, Landroid/util/TypedValue;->data:I

    iput p1, p0, Ls40/b1;->f:I

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/util/TypedValue;
    .locals 3

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Ls40/b1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    return-object v0
.end method
