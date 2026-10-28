.class public final Lcom/google/android/material/textfield/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-array p1, p1, [Lna/p;

    iput-object p1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 30
    iput p1, p0, Lcom/google/android/material/textfield/p;->c:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput p1, p0, Lcom/google/android/material/textfield/p;->b:I

    .line 15
    iput-object p3, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    .line 16
    iput p2, p0, Lcom/google/android/material/textfield/p;->c:I

    .line 17
    iput-object p4, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/PendingIntent;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    .line 19
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p1

    const-string v0, "pendingIntent.intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/p;-><init>(Landroid/content/IntentSender;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/IntentSender;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    const-string v0, "intentSender"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/textfield/q;Ls/m2;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    .line 22
    iput-object p1, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    .line 23
    iget-object p1, p2, Ls/m2;->x:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 25
    iput p2, p0, Lcom/google/android/material/textfield/p;->b:I

    const/16 p2, 0x34

    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 27
    iput p1, p0, Lcom/google/android/material/textfield/p;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;ILjava/util/Locale;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/material/textfield/p;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    const-string v0, "input start index is outside the CharSequence"

    .line 5
    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    if-ltz p2, :cond_1

    .line 6
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_1

    goto :goto_1

    .line 7
    :cond_1
    const-string v0, "input end index is outside the CharSequence"

    .line 8
    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    .line 9
    :goto_1
    invoke-static {p3}, Ljava/text/BreakIterator;->getWordInstance(Ljava/util/Locale;)Ljava/text/BreakIterator;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    const/16 v0, -0x32

    const/4 v1, 0x0

    .line 10
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/p;->b:I

    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    add-int/lit8 v1, p2, 0x32

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/textfield/p;->c:I

    .line 12
    new-instance v0, Lm3/d;

    invoke-direct {v0, p2, p1}, Lm3/d;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {p3, v0}, Ljava/text/BreakIterator;->setText(Ljava/text/CharacterIterator;)V

    return-void
.end method


# virtual methods
.method public a()Lj/l;
    .locals 5

    new-instance v0, Lj/l;

    iget-object v1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/IntentSender;

    iget-object v2, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v2, Landroid/content/Intent;

    iget v3, p0, Lcom/google/android/material/textfield/p;->b:I

    iget v4, p0, Lcom/google/android/material/textfield/p;->c:I

    invoke-direct {v0, v1, v2, v3, v4}, Lj/l;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    return-object v0
.end method

.method public b(I)V
    .locals 5

    iget v0, p0, Lcom/google/android/material/textfield/p;->b:I

    iget v1, p0, Lcom/google/android/material/textfield/p;->c:I

    const/4 v2, 0x0

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-nez v2, :cond_1

    const-string v2, ". Valid range is ["

    const-string v3, " , "

    const-string v4, "Invalid offset: "

    invoke-static {p1, v0, v4, v2, v3}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x5d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lr3/a;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public c()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, La0/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lcom/google/android/material/textfield/p;->c:I

    iget v3, p0, Lcom/google/android/material/textfield/p;->b:I

    sub-int/2addr v2, v3

    sub-int/2addr v1, v2

    iget v2, v0, La0/i;->b:I

    invoke-virtual {v0}, La0/i;->c()I

    move-result v0

    sub-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public d(I)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    iget v1, p0, Lcom/google/android/material/textfield/p;->b:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget v3, p0, Lcom/google/android/material/textfield/p;->c:I

    if-gt p1, v3, :cond_2

    if-gt v1, p1, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v2

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lh6/j;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v1

    invoke-virtual {v1}, Lh6/j;->c()I

    move-result v3

    if-ne v3, v2, :cond_2

    invoke-virtual {v1, p1, v0}, Lh6/j;->b(ILjava/lang/CharSequence;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    :goto_0
    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public e(I)Z
    .locals 2

    iget v0, p0, Lcom/google/android/material/textfield/p;->b:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/google/android/material/textfield/p;->c:I

    if-gt p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    move-result p1

    invoke-static {p1}, Lup/d;->G(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f(I)Z
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->b(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->isBoundary(I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    const/4 v0, 0x1

    if-lez p1, :cond_1

    iget-object v1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    sub-int/2addr v1, v0

    if-ge p1, v1, :cond_1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->g(I)Z

    move-result v1

    if-nez v1, :cond_2

    add-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->g(I)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public g(I)Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    add-int/lit8 v1, p1, -0x1

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object v2

    sget-object v3, Ljava/lang/Character$UnicodeBlock;->HIRAGANA:Ljava/lang/Character$UnicodeBlock;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object v2

    sget-object v4, Ljava/lang/Character$UnicodeBlock;->KATAKANA:Ljava/lang/Character$UnicodeBlock;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {v0, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character$UnicodeBlock;->of(C)Ljava/lang/Character$UnicodeBlock;

    move-result-object p1

    sget-object v0, Ljava/lang/Character$UnicodeBlock;->KATAKANA:Ljava/lang/Character$UnicodeBlock;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public h(I)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    iget v1, p0, Lcom/google/android/material/textfield/p;->b:I

    iget v2, p0, Lcom/google/android/material/textfield/p;->c:I

    if-ge p1, v2, :cond_2

    if-gt v1, p1, :cond_2

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isLetterOrDigit(I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Lh6/j;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v1

    invoke-virtual {v1}, Lh6/j;->c()I

    move-result v3

    if-ne v3, v2, :cond_2

    invoke-virtual {v1, p1, v0}, Lh6/j;->b(ILjava/lang/CharSequence;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    :goto_0
    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public i(I)Z
    .locals 2

    iget v0, p0, Lcom/google/android/material/textfield/p;->b:I

    iget v1, p0, Lcom/google/android/material/textfield/p;->c:I

    if-ge p1, v1, :cond_0

    if-gt v0, p1, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result p1

    invoke-static {p1}, Lup/d;->G(I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public j(I)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->b(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->following(I)I

    move-result p1

    add-int/lit8 v0, p1, -0x1

    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->g(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->j(I)I

    move-result p1

    :cond_0
    return p1
.end method

.method public k(I)I
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->b(I)V

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, Ljava/text/BreakIterator;

    invoke-virtual {v0, p1}, Ljava/text/BreakIterator;->preceding(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->g(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/p;->k(I)I

    move-result p1

    :cond_0
    return p1
.end method

.method public l(IILjava/lang/String;)V
    .locals 8

    if-gt p1, p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "start index must be less than or equal to end index: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " > "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_0
    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "start must be non-negative, but was "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lr3/a;->a(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, La0/i;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit16 v0, v0, 0x80

    const/16 v2, 0xff

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-array v2, v0, [C

    const/16 v3, 0x40

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget-object v5, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, p2

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v5, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    sub-int v6, p1, v4

    const-string v7, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v6, p1, v2, v1}, Ljava/lang/String;->getChars(II[CI)V

    iget-object p1, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    sub-int v5, v0, v3

    add-int/2addr v3, p2

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, v3, v2, v5}, Ljava/lang/String;->getChars(II[CI)V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {p3, v1, p1, v2, v4}, Ljava/lang/String;->getChars(II[CI)V

    new-instance p1, La0/i;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v4

    const/4 p3, 0x2

    invoke-direct {p1, p3}, La0/i;-><init>(I)V

    iput v0, p1, La0/i;->b:I

    iput-object v2, p1, La0/i;->e:Ljava/lang/Object;

    iput p2, p1, La0/i;->c:I

    iput v5, p1, La0/i;->d:I

    iput-object p1, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    iput v6, p0, Lcom/google/android/material/textfield/p;->b:I

    iput v3, p0, Lcom/google/android/material/textfield/p;->c:I

    return-void

    :cond_2
    iget v2, p0, Lcom/google/android/material/textfield/p;->b:I

    sub-int v3, p1, v2

    sub-int v2, p2, v2

    if-ltz v3, :cond_8

    iget v4, v0, La0/i;->b:I

    invoke-virtual {v0}, La0/i;->c()I

    move-result v5

    sub-int/2addr v4, v5

    if-le v2, v4, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    sub-int p2, v2, v3

    sub-int/2addr p1, p2

    invoke-virtual {v0}, La0/i;->c()I

    move-result p2

    if-gt p1, p2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, La0/i;->c()I

    move-result p2

    sub-int/2addr p1, p2

    iget p2, v0, La0/i;->b:I

    :goto_2
    mul-int/lit8 p2, p2, 0x2

    iget v4, v0, La0/i;->b:I

    sub-int v4, p2, v4

    if-ge v4, p1, :cond_5

    goto :goto_2

    :cond_5
    new-array p1, p2, [C

    iget-object v4, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v4, [C

    iget v5, v0, La0/i;->c:I

    invoke-static {v4, p1, v1, v1, v5}, Lm83/n;->f0([C[CIII)V

    iget v4, v0, La0/i;->b:I

    iget v5, v0, La0/i;->d:I

    sub-int/2addr v4, v5

    sub-int v6, p2, v4

    iget-object v7, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v7, [C

    add-int/2addr v4, v5

    invoke-static {v7, p1, v6, v5, v4}, Lm83/n;->f0([C[CIII)V

    iput-object p1, v0, La0/i;->e:Ljava/lang/Object;

    iput p2, v0, La0/i;->b:I

    iput v6, v0, La0/i;->d:I

    :goto_3
    iget p1, v0, La0/i;->c:I

    if-ge v3, p1, :cond_6

    if-gt v2, p1, :cond_6

    sub-int p2, p1, v2

    iget-object v4, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v4, [C

    iget v5, v0, La0/i;->d:I

    sub-int/2addr v5, p2

    invoke-static {v4, v4, v5, v2, p1}, Lm83/n;->f0([C[CIII)V

    iput v3, v0, La0/i;->c:I

    iget p1, v0, La0/i;->d:I

    sub-int/2addr p1, p2

    iput p1, v0, La0/i;->d:I

    goto :goto_4

    :cond_6
    if-ge v3, p1, :cond_7

    if-lt v2, p1, :cond_7

    invoke-virtual {v0}, La0/i;->c()I

    move-result p1

    add-int/2addr p1, v2

    iput p1, v0, La0/i;->d:I

    iput v3, v0, La0/i;->c:I

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, La0/i;->c()I

    move-result p1

    add-int/2addr p1, v3

    invoke-virtual {v0}, La0/i;->c()I

    move-result p2

    add-int/2addr p2, v2

    iget v2, v0, La0/i;->d:I

    sub-int v3, p1, v2

    iget-object v4, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v4, [C

    iget v5, v0, La0/i;->c:I

    invoke-static {v4, v4, v5, v2, p1}, Lm83/n;->f0([C[CIII)V

    iget p1, v0, La0/i;->c:I

    add-int/2addr p1, v3

    iput p1, v0, La0/i;->c:I

    iput p2, v0, La0/i;->d:I

    :goto_4
    iget-object p1, v0, La0/i;->e:Ljava/lang/Object;

    check-cast p1, [C

    iget p2, v0, La0/i;->c:I

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p3, v1, v2, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    iget p1, v0, La0/i;->c:I

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, v0, La0/i;->c:I

    return-void

    :cond_8
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/p;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/material/textfield/p;->b:I

    iput v0, p0, Lcom/google/android/material/textfield/p;->c:I

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/material/textfield/p;->l(IILjava/lang/String;)V

    return-void
.end method

.method public m(Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    return-void
.end method

.method public n(II)V
    .locals 0

    iput p1, p0, Lcom/google/android/material/textfield/p;->c:I

    iput p2, p0, Lcom/google/android/material/textfield/p;->b:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget v0, p0, Lcom/google/android/material/textfield/p;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/google/android/material/textfield/p;->e:Ljava/lang/Object;

    check-cast v0, La0/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget v3, p0, Lcom/google/android/material/textfield/p;->b:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    iget-object v2, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v2, [C

    iget v3, v0, La0/i;->c:I

    invoke-virtual {v1, v2, v4, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget-object v2, v0, La0/i;->e:Ljava/lang/Object;

    check-cast v2, [C

    iget v3, v0, La0/i;->d:I

    iget v0, v0, La0/i;->b:I

    sub-int/2addr v0, v3

    invoke-virtual {v1, v2, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/google/android/material/textfield/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget v2, p0, Lcom/google/android/material/textfield/p;->c:I

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v1, v0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method
