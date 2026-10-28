.class public abstract Lnj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:[Lj93/z;

.field public static final b:Li3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lnj/c;

    const-string v2, "amplitudeViewTagProperty"

    const-string v3, "getAmplitudeViewTagProperty(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    new-array v1, v4, [Lj93/z;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    sput-object v1, Lnj/c;->a:[Lj93/z;

    new-instance v0, Li3/y;

    const-string v1, "AmplitudeViewTagKey"

    invoke-direct {v0, v1}, Li3/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Lnj/c;->b:Li3/y;

    return-void
.end method

.method public static final a(Landroid/view/View;Landroid/content/Context;Landroid/graphics/Rect;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v1, p2}, Landroid/graphics/Rect;->intersects(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    new-instance v2, Lnj/b;

    invoke-direct {v2, v3, v1}, Lnj/b;-><init>(ILandroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v4, "context"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lj43/a;

    const/16 v5, 0x14

    invoke-direct {v4, v2, v5}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lvj/b;

    invoke-direct {v2, v1}, Lvj/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v2}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    instance-of v1, p0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_8

    move-object v1, p0

    check-cast v1, Landroid/view/ViewGroup;

    const/4 v2, 0x0

    move v4, v2

    move v5, v4

    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-ge v5, v6, :cond_4

    move v6, v3

    goto :goto_1

    :cond_4
    move v6, v2

    :goto_1
    if-eqz v6, :cond_8

    add-int/lit8 v6, v5, 0x1

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_7

    add-int/lit8 v7, v4, 0x1

    if-ltz v4, :cond_6

    invoke-virtual {v5}, Landroid/view/View;->isShown()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v5, p1, p2, p3}, Lnj/c;->a(Landroid/view/View;Landroid/content/Context;Landroid/graphics/Rect;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    move v5, v6

    move v4, v7

    goto :goto_0

    :cond_6
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const-string v1, "androidx.compose.ui.platform.AndroidComposeView"

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_9

    sget-object p2, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Entering Compose view hierarchy for "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    :try_start_0
    const-class p2, Landroidx/compose/ui/platform/AndroidComposeView;

    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    const-string v1, "semanticsOwner"

    invoke-virtual {p2, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsOwner"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Li3/r;

    iget-object p0, p0, Li3/r;->a:La3/n0;

    invoke-static {p0, v3}, Li3/s;->a(La3/n0;Z)Li3/p;

    move-result-object p0

    invoke-static {p0, p1, p3}, Lnj/c;->b(Li3/p;Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    sget-object p1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Error finding target component in Compose layout "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/crypto/tink/internal/l0;->K([Ljava/lang/Object;)V

    :cond_9
    :goto_2
    return-object v0
.end method

.method public static final b(Li3/p;Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x7

    invoke-static {v1, p0}, Li3/p;->j(ILi3/p;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v2, 0x1

    if-ltz v2, :cond_0

    check-cast v3, Li3/p;

    invoke-static {v3, p1, p2}, Lnj/c;->b(Li3/p;Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move v2, v5

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_1
    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object v1

    iget-object v1, v1, Li3/l;->w:La0/v0;

    sget-object v2, Lnj/c;->b:Li3/y;

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v1, v4

    :cond_2
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Li3/p;->k()Li3/l;

    move-result-object v1

    iget-object v1, v1, Li3/l;->w:La0/v0;

    invoke-virtual {v1, v2}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    move-object v4, v1

    :goto_1
    check-cast v4, Ljava/lang/String;

    invoke-static {v4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance p2, Lj43/a;

    const/4 v1, 0x3

    invoke-direct {p2, p0, v1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    new-instance p0, Lvj/b;

    invoke-direct {p0, p1}, Lvj/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2, p0}, Lj43/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Rect;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    return-object v0
.end method
