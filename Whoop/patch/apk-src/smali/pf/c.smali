.class public abstract Lpf/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:J

.field public static b:Ljava/lang/reflect/Method;

.field public static c:Ljava/lang/reflect/Method;

.field public static d:Ljava/lang/reflect/Method;


# direct methods
.method public static final A(Landroid/content/ComponentCallbacks;)Lxf3/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lof3/a;

    if-eqz v0, :cond_0

    check-cast p0, Lof3/a;

    invoke-interface {p0}, Lof3/a;->getKoin()Lnf3/a;

    move-result-object p0

    iget-object p0, p0, Lnf3/a;->a:Lwf3/a;

    iget-object p0, p0, Lwf3/a;->d:Lxf3/c;

    return-object p0

    :cond_0
    sget-object p0, Lpf3/a;->b:Lnf3/a;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lnf3/a;->a:Lwf3/a;

    iget-object p0, p0, Lwf3/a;->d:Lxf3/c;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "KoinApplication has not been started"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static B(Ljava/lang/Throwable;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv83/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getSuppressed()[Ljava/lang/Throwable;

    move-result-object p0

    const-string v0, "getSuppressed(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object v0, Lu83/a;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_3

    check-cast p0, [Ljava/lang/Throwable;

    invoke-static {p0}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final C(Lkb3/l;Lj93/z;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static D(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    instance-of v0, p0, Ljava/lang/reflect/InvocationTargetException;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to call "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " via reflection"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Trace"

    invoke-static {v0, p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public static E()Z
    .locals 6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {}, Lac/a;->c()Z

    move-result v0

    return v0

    :cond_0
    const-string v0, "isTagEnabled"

    const-class v1, Landroid/os/Trace;

    :try_start_0
    sget-object v2, Lpf/c;->b:Ljava/lang/reflect/Method;

    const/4 v3, 0x0

    if-nez v2, :cond_1

    const-string v2, "TRACE_TAG_APP"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v4

    sput-wide v4, Lpf/c;->a:J

    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lpf/c;->b:Ljava/lang/reflect/Method;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v1, Lpf/c;->b:Ljava/lang/reflect/Method;

    sget-wide v4, Lpf/c;->a:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :goto_1
    invoke-static {v1, v0}, Lpf/c;->D(Ljava/lang/Exception;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public static final F(Lkotlin/jvm/internal/q;)V
    .locals 3

    sget-object p0, Lsa3/d;->p:Lsa3/c;

    const-string v0, "MEMBER_KIND"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Laa3/l1;->y:Lt83/b;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, La0/i1;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :goto_0
    invoke-virtual {v1}, La0/i1;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-virtual {v1}, La0/i1;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Laa3/l1;

    iget-object p0, p0, Laa3/l1;->w:Lba3/h;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final G(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Leb/l;

    if-eqz v2, :cond_1

    iget-boolean v3, v2, Leb/l;->b:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_0

    iget-boolean v2, v2, Leb/l;->c:Z

    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    return-object v0
.end method

.method public static final H(Lkotlin/jvm/internal/q;)Lzt/q;
    .locals 5

    sget-object v0, Lsa3/d;->e:Lsa3/c;

    const-string v1, "MODALITY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Laa3/m1;->G:Lt83/b;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, La0/i1;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :goto_0
    invoke-virtual {v3}, La0/i1;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laa3/m1;

    iget-object v4, v4, Laa3/m1;->w:Lba3/h;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lzt/q;

    invoke-direct {v3, p0, v0, v1, v2}, Lzt/q;-><init>(Lkotlin/jvm/internal/q;Lq1/j0;Lt83/a;Ljava/util/ArrayList;)V

    return-object v3
.end method

.method public static final I(ILandroidx/compose/runtime/Composer;I)Ln2/a;
    .locals 9

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->e:Lp1/u2;

    invoke-virtual {p1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg3/d;

    monitor-enter v2

    :try_start_0
    iget-object v3, v2, Lg3/d;->a:La0/g0;

    invoke-virtual {v3, p0}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/TypedValue;

    const/4 v4, 0x1

    if-nez v3, :cond_0

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1, p0, v3, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    iget-object v5, v2, Lg3/d;->a:La0/g0;

    invoke-virtual {v5, p0}, La0/g0;->d(I)I

    move-result v6

    iget-object v7, v5, La0/s;->c:[Ljava/lang/Object;

    aget-object v8, v7, v6

    iget-object v5, v5, La0/s;->b:[I

    aput p0, v5, v6

    aput-object v3, v7, v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_4

    :cond_0
    :goto_0
    monitor-exit v2

    iget-object v2, v3, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_6

    const-string v7, ".xml"

    invoke-static {v2, v7}, Lyb3/r;->Y(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v7

    if-ne v7, v4, :cond_6

    const p2, -0x699b5122

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p2

    iget v0, v3, Landroid/util/TypedValue;->changingConfigurations:I

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->d:Lp1/u2;

    invoke-virtual {p1, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg3/c;

    new-instance v3, Lg3/b;

    invoke-direct {v3, p2, p0}, Lg3/b;-><init>(Landroid/content/res/Resources$Theme;I)V

    iget-object v7, v2, Lg3/c;->a:Ljava/util/HashMap;

    invoke-virtual {v7, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/ref/WeakReference;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg3/a;

    :cond_1
    if-nez v5, :cond_5

    invoke-virtual {v1, p0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    :goto_1
    const/4 v7, 0x2

    if-eq v5, v7, :cond_2

    if-eq v5, v4, :cond_2

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    goto :goto_1

    :cond_2
    if-ne v5, v7, :cond_4

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "vector"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {p2, v1, p0, v0}, Lts/o;->D(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lg3/a;

    move-result-object v5

    iget-object p0, v2, Lg3/c;->a:Ljava/util/HashMap;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    :goto_2
    iget-object p0, v5, Lg3/a;->a:Lo2/e;

    invoke-static {p0, p1}, Lo2/a;->c(Lo2/e;Landroidx/compose/runtime/Composer;)Landroidx/compose/ui/graphics/vector/VectorPainter;

    move-result-object p0

    invoke-virtual {p1, v6}, Lp1/q;->q(Z)V

    return-object p0

    :cond_6
    const v3, -0x6998f1f8

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {p1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v7, p2, 0xe

    xor-int/lit8 v7, v7, 0x6

    const/4 v8, 0x4

    if-le v7, v8, :cond_7

    invoke-virtual {p1, p0}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_7
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v8, :cond_8

    goto :goto_3

    :cond_8
    move v4, v6

    :cond_9
    :goto_3
    or-int p2, v3, v4

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p2, v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_a

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v0, p2, :cond_b

    :cond_a
    :try_start_1
    invoke-virtual {v1, p0, v5}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    const-string p2, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    new-instance v0, Li2/g;

    invoke-direct {v0, p0}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Li2/g;

    new-instance p0, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    invoke-direct {p0, v0}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;)V

    invoke-virtual {p1, v6}, Lp1/q;->q(Z)V

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Landroidx/compose/ui/res/ResourceResolutionException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Error attempting to load resource: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p0, p2}, Landroidx/compose/ui/res/ResourceResolutionException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p1

    :goto_4
    monitor-exit v2

    throw p0
.end method

.method public static J(ILe4/s;La3/p;Li4/a;)V
    .locals 6

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-nez p0, :cond_0

    invoke-virtual {p1, v1}, Le4/s;->e(I)Lj4/g;

    move-result-object p0

    check-cast p0, Lk4/h;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Le4/s;->e(I)Lj4/g;

    move-result-object p0

    check-cast p0, Lk4/i;

    :goto_0
    invoke-virtual {p3, v1}, Li4/b;->n(I)Li4/c;

    move-result-object v2

    instance-of v3, v2, Li4/a;

    if-eqz v3, :cond_8

    check-cast v2, Li4/a;

    iget-object v3, v2, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v3, v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const/4 v3, 0x0

    move v4, v3

    :goto_1
    iget-object v5, v2, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_2

    invoke-virtual {v2, v4}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {p0, v5}, Lj4/g;->q([Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    iget-object v2, p3, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-le v2, v0, :cond_8

    invoke-virtual {p3, v0}, Li4/b;->n(I)Li4/c;

    move-result-object p3

    instance-of v0, p3, Li4/g;

    if-nez v0, :cond_3

    goto/16 :goto_4

    :cond_3
    check-cast p3, Li4/g;

    invoke-virtual {p3}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "style"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-static {p2, p1, p3, p0, v2}, Lpf/c;->K(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p3, v2}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v2

    instance-of v4, v2, Li4/a;

    if-eqz v4, :cond_5

    move-object v4, v2

    check-cast v4, Li4/a;

    iget-object v5, v4, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v5, v1, :cond_5

    invoke-virtual {v4, v3}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1}, Li4/b;->p(I)F

    move-result v4

    invoke-virtual {p0, v4}, Lk4/c;->u(F)V

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Li4/c;->c()Ljava/lang/String;

    move-result-object v2

    :goto_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "packed"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    const-string v4, "spread_inside"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Lj4/i;->w:Lj4/i;

    invoke-virtual {p0, v2}, Lk4/c;->z(Lj4/i;)V

    goto :goto_2

    :cond_6
    sget-object v2, Lj4/i;->x:Lj4/i;

    invoke-virtual {p0, v2}, Lk4/c;->z(Lj4/i;)V

    goto :goto_2

    :cond_7
    sget-object v2, Lj4/i;->y:Lj4/i;

    invoke-virtual {p0, v2}, Lk4/c;->z(Lj4/i;)V

    goto :goto_2

    :cond_8
    :goto_4
    return-void
.end method

.method public static K(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    iget-boolean v7, v1, Le4/s;->b:Z

    invoke-virtual {v2, v4}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v8

    instance-of v9, v8, Li4/a;

    if-eqz v9, :cond_0

    check-cast v8, Li4/a;

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    const-string v9, "start"

    const-string v11, "end"

    const-string v12, "top"

    const-string v13, "bottom"

    const-string v14, "baseline"

    const-string v15, "parent"

    const/4 v10, 0x1

    if-eqz v8, :cond_1e

    iget-object v5, v8, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-le v5, v10, :cond_1e

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v10}, Li4/b;->t(I)Li4/c;

    move-result-object v5

    instance-of v10, v5, Li4/h;

    if-eqz v10, :cond_1

    invoke-virtual {v5}, Li4/c;->c()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    iget-object v5, v8, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v16, 0x0

    move/from16 v17, v7

    const/4 v7, 0x2

    if-le v5, v7, :cond_2

    invoke-virtual {v8, v7}, Li4/b;->t(I)Li4/c;

    move-result-object v5

    invoke-virtual {v0, v5}, La3/p;->v(Li4/c;)F

    move-result v5

    iget-object v7, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v7, v5}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v5

    goto :goto_2

    :cond_2
    move/from16 v5, v16

    :goto_2
    iget-object v7, v8, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    move/from16 p2, v5

    const/4 v5, 0x3

    if-le v7, v5, :cond_3

    invoke-virtual {v8, v5}, Li4/b;->t(I)Li4/c;

    move-result-object v7

    invoke-virtual {v0, v7}, La3/p;->v(Li4/c;)F

    move-result v5

    iget-object v7, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v7, v5}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v5

    goto :goto_3

    :cond_3
    move/from16 v5, v16

    :goto_3
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v1, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    :goto_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    const-string v7, "right"

    sparse-switch v6, :sswitch_data_0

    :goto_5
    const/4 v4, -0x1

    goto :goto_6

    :sswitch_0
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_5

    :cond_5
    const/4 v4, 0x7

    goto :goto_6

    :sswitch_1
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    const/4 v4, 0x6

    goto :goto_6

    :sswitch_2
    const-string v6, "left"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    const/4 v4, 0x5

    goto :goto_6

    :sswitch_3
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    const/4 v4, 0x4

    goto :goto_6

    :sswitch_4
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto :goto_5

    :cond_9
    const/4 v4, 0x3

    goto :goto_6

    :sswitch_5
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    goto :goto_5

    :cond_a
    const/4 v4, 0x2

    goto :goto_6

    :sswitch_6
    const-string v6, "circular"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_5

    :cond_b
    const/4 v4, 0x1

    goto :goto_6

    :sswitch_7
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    goto :goto_5

    :cond_c
    const/4 v4, 0x0

    :goto_6
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_f

    :pswitch_0
    move/from16 v1, v17

    :goto_7
    const/4 v0, 0x1

    goto/16 :goto_10

    :pswitch_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    goto/16 :goto_10

    :pswitch_2
    const/4 v0, 0x1

    :goto_8
    const/4 v1, 0x1

    goto/16 :goto_10

    :pswitch_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    :goto_9
    const/4 v0, -0x1

    goto :goto_a

    :sswitch_8
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto :goto_9

    :cond_d
    const/4 v0, 0x2

    goto :goto_a

    :sswitch_9
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_9

    :cond_e
    const/4 v0, 0x1

    goto :goto_a

    :sswitch_a
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    :goto_a
    packed-switch v0, :pswitch_data_1

    goto/16 :goto_f

    :pswitch_4
    invoke-virtual {v3, v2}, Lj4/b;->p(Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_5
    const/16 v0, 0xa

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->S:Ljava/lang/Object;

    goto/16 :goto_f

    :pswitch_6
    iget-object v0, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0xb

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->T:Lj4/b;

    goto/16 :goto_f

    :pswitch_7
    xor-int/lit8 v0, v17, 0x1

    move v1, v0

    goto :goto_7

    :pswitch_8
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    :goto_b
    const/4 v0, -0x1

    goto :goto_c

    :sswitch_b
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto :goto_b

    :cond_10
    const/4 v0, 0x2

    goto :goto_c

    :sswitch_c
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_b

    :cond_11
    const/4 v0, 0x1

    goto :goto_c

    :sswitch_d
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto :goto_b

    :cond_12
    const/4 v0, 0x0

    :goto_c
    packed-switch v0, :pswitch_data_2

    goto/16 :goto_f

    :pswitch_9
    const/16 v0, 0xc

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->U:Ljava/lang/Object;

    goto/16 :goto_f

    :pswitch_a
    invoke-virtual {v3, v2}, Lj4/b;->e(Ljava/lang/Object;)V

    goto/16 :goto_f

    :pswitch_b
    iget-object v0, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0xe

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->W:Lj4/b;

    goto/16 :goto_f

    :pswitch_c
    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Li4/b;->n(I)Li4/c;

    move-result-object v6

    invoke-virtual {v0, v6}, La3/p;->v(Li4/c;)F

    move-result v4

    iget-object v6, v8, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v12, 0x2

    if-le v6, v12, :cond_13

    invoke-virtual {v8, v12}, Li4/b;->t(I)Li4/c;

    move-result-object v6

    invoke-virtual {v0, v6}, La3/p;->v(Li4/c;)F

    move-result v0

    iget-object v1, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v1, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v16

    :cond_13
    move/from16 v0, v16

    invoke-virtual {v3, v2}, Lj4/b;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v3, Lj4/b;->a0:Ljava/lang/Object;

    iput v4, v3, Lj4/b;->b0:F

    iput v0, v3, Lj4/b;->c0:F

    const/16 v0, 0x14

    iput v0, v3, Lj4/b;->j0:I

    goto :goto_f

    :pswitch_d
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    :goto_d
    const/4 v0, -0x1

    goto :goto_e

    :sswitch_e
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_14
    const/4 v0, 0x2

    goto :goto_e

    :sswitch_f
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_d

    :cond_15
    const/4 v0, 0x1

    goto :goto_e

    :sswitch_10
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    :goto_e
    packed-switch v0, :pswitch_data_3

    goto :goto_f

    :pswitch_e
    iget-object v0, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0x10

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->Y:Ljava/lang/Object;

    goto :goto_f

    :pswitch_f
    iget-object v0, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0x11

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->Z:Ljava/lang/Object;

    goto :goto_f

    :pswitch_10
    iget-object v0, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    iget-object v0, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0xf

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->X:Ljava/lang/Object;

    :goto_f
    const/4 v0, 0x0

    goto/16 :goto_8

    :goto_10
    if-eqz v0, :cond_1d

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_4

    :goto_11
    const/4 v15, -0x1

    goto :goto_12

    :sswitch_11
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto :goto_11

    :cond_17
    const/4 v15, 0x2

    goto :goto_12

    :sswitch_12
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_11

    :cond_18
    const/4 v15, 0x1

    goto :goto_12

    :sswitch_13
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_11

    :cond_19
    const/4 v15, 0x0

    :goto_12
    packed-switch v15, :pswitch_data_4

    const/4 v0, 0x1

    goto :goto_13

    :pswitch_11
    move/from16 v0, v17

    goto :goto_13

    :pswitch_12
    const/4 v0, 0x0

    goto :goto_13

    :pswitch_13
    xor-int/lit8 v0, v17, 0x1

    :goto_13
    if-eqz v1, :cond_1b

    if-eqz v0, :cond_1a

    const/4 v4, 0x1

    iput v4, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->J:Ljava/lang/Object;

    goto :goto_14

    :cond_1a
    const/4 v7, 0x2

    iput v7, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->K:Ljava/lang/Object;

    goto :goto_14

    :cond_1b
    if-eqz v0, :cond_1c

    const/4 v0, 0x3

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->L:Ljava/lang/Object;

    goto :goto_14

    :cond_1c
    const/4 v0, 0x4

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->M:Ljava/lang/Object;

    :cond_1d
    :goto_14
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v3, v0}, Lj4/b;->l(Ljava/lang/Float;)Lj4/b;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj4/b;->n(Ljava/lang/Float;)V

    return-void

    :cond_1e
    move/from16 v17, v7

    const/4 v0, 0x3

    const/4 v7, 0x2

    invoke-virtual {v2, v4}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_27

    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-virtual {v1, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    goto :goto_15

    :cond_1f
    invoke-virtual {v1, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    :goto_15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_5

    :goto_16
    const/4 v5, -0x1

    goto :goto_17

    :sswitch_14
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_16

    :cond_20
    const/4 v5, 0x4

    goto :goto_17

    :sswitch_15
    invoke-virtual {v4, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_21

    goto :goto_16

    :cond_21
    move v5, v0

    goto :goto_17

    :sswitch_16
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_22

    goto :goto_16

    :cond_22
    move v5, v7

    goto :goto_17

    :sswitch_17
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    goto :goto_16

    :cond_23
    const/4 v5, 0x1

    goto :goto_17

    :sswitch_18
    invoke-virtual {v4, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_16

    :cond_24
    const/4 v5, 0x0

    :goto_17
    packed-switch v5, :pswitch_data_5

    goto :goto_18

    :pswitch_14
    if-eqz v17, :cond_25

    const/4 v4, 0x1

    iput v4, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->J:Ljava/lang/Object;

    return-void

    :cond_25
    const/4 v0, 0x4

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->M:Ljava/lang/Object;

    return-void

    :pswitch_15
    invoke-virtual {v3, v2}, Lj4/b;->p(Ljava/lang/Object;)V

    return-void

    :pswitch_16
    const/4 v0, 0x4

    if-eqz v17, :cond_26

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->M:Ljava/lang/Object;

    return-void

    :cond_26
    const/4 v4, 0x1

    iput v4, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->J:Ljava/lang/Object;

    return-void

    :pswitch_17
    invoke-virtual {v3, v2}, Lj4/b;->e(Ljava/lang/Object;)V

    return-void

    :pswitch_18
    iget-object v0, v3, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    iget-object v0, v2, Lj4/b;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Le4/s;->a(Ljava/lang/Object;)V

    const/16 v0, 0xf

    iput v0, v3, Lj4/b;->j0:I

    iput-object v2, v3, Lj4/b;->X:Ljava/lang/Object;

    :cond_27
    :goto_18
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_7
        -0x594af961 -> :sswitch_6
        -0x527265d5 -> :sswitch_5
        0x188db -> :sswitch_4
        0x1c155 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x669119bb -> :sswitch_a
        -0x527265d5 -> :sswitch_9
        0x1c155 -> :sswitch_8
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x669119bb -> :sswitch_d
        -0x527265d5 -> :sswitch_c
        0x1c155 -> :sswitch_b
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x669119bb -> :sswitch_10
        -0x527265d5 -> :sswitch_f
        0x1c155 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        0x188db -> :sswitch_13
        0x677c21c -> :sswitch_12
        0x68ac462 -> :sswitch_11
    .end sparse-switch

    :pswitch_data_4
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x669119bb -> :sswitch_18
        -0x527265d5 -> :sswitch_17
        0x188db -> :sswitch_16
        0x1c155 -> :sswitch_15
        0x68ac462 -> :sswitch_14
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch
.end method

.method public static L(Li4/g;Ljava/lang/String;Le4/s;Lcom/whoop/data/repositories/c;)Lj4/f;
    .locals 3

    invoke-virtual {p0, p1}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Lj4/f;->b(I)Lj4/f;

    move-result-object v1

    instance-of v2, v0, Li4/h;

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Li4/c;->c()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lpf/c;->M(Ljava/lang/String;)Lj4/f;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v2, v0, Li4/e;

    if-eqz v2, :cond_1

    invoke-virtual {p0, p1}, Li4/b;->q(Ljava/lang/String;)F

    move-result p0

    invoke-virtual {p3, p0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Le4/s;->c(Ljava/lang/Float;)I

    move-result p0

    invoke-static {p0}, Lj4/f;->b(I)Lj4/f;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of p0, v0, Li4/g;

    if-eqz p0, :cond_6

    check-cast v0, Li4/g;

    const-string p0, "value"

    invoke-virtual {v0, p0}, Li4/b;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lpf/c;->M(Ljava/lang/String;)Lj4/f;

    move-result-object v1

    :cond_2
    const-string p0, "min"

    invoke-virtual {v0, p0}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object p0

    if-eqz p0, :cond_4

    instance-of p1, p0, Li4/e;

    if-eqz p1, :cond_3

    check-cast p0, Li4/e;

    invoke-virtual {p0}, Li4/e;->d()F

    move-result p0

    invoke-virtual {p3, p0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Le4/s;->c(Ljava/lang/Float;)I

    move-result p0

    if-ltz p0, :cond_4

    iput p0, v1, Lj4/f;->a:I

    goto :goto_0

    :cond_3
    instance-of p0, p0, Li4/h;

    if-eqz p0, :cond_4

    const/4 p0, -0x2

    iput p0, v1, Lj4/f;->a:I

    :cond_4
    :goto_0
    const-string p0, "max"

    invoke-virtual {v0, p0}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object p0

    if-eqz p0, :cond_6

    instance-of p1, p0, Li4/e;

    if-eqz p1, :cond_5

    check-cast p0, Li4/e;

    invoke-virtual {p0}, Li4/e;->d()F

    move-result p0

    invoke-virtual {p3, p0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    invoke-virtual {p2, p0}, Le4/s;->c(Ljava/lang/Float;)I

    move-result p0

    iget p1, v1, Lj4/f;->b:I

    if-ltz p1, :cond_6

    iput p0, v1, Lj4/f;->b:I

    return-object v1

    :cond_5
    instance-of p0, p0, Li4/h;

    if-eqz p0, :cond_6

    iget-boolean p0, v1, Lj4/f;->g:Z

    if-eqz p0, :cond_6

    sget-object p0, Lj4/f;->i:Ljava/lang/String;

    iput-object p0, v1, Lj4/f;->f:Ljava/lang/String;

    const p0, 0x7fffffff

    iput p0, v1, Lj4/f;->b:I

    :cond_6
    return-object v1
.end method

.method public static M(Ljava/lang/String;)Lj4/f;
    .locals 6

    const/4 v0, 0x0

    invoke-static {v0}, Lj4/f;->b(I)Lj4/f;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "wrap"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_1
    const-string v2, "spread"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_2
    const-string v2, "parent"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    move v4, v3

    goto :goto_0

    :sswitch_3
    const-string v2, "preferWrap"

    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move v4, v0

    :goto_0
    sget-object v2, Lj4/f;->i:Ljava/lang/String;

    sget-object v5, Lj4/f;->j:Ljava/lang/String;

    packed-switch v4, :pswitch_data_0

    const-string v2, "%"

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v1, 0x25

    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p0, v1

    new-instance v1, Lj4/f;

    sget-object v2, Lj4/f;->l:Ljava/lang/String;

    invoke-direct {v1, v2}, Lj4/f;-><init>(Ljava/lang/String;)V

    iput p0, v1, Lj4/f;->c:F

    iput-boolean v3, v1, Lj4/f;->g:Z

    iput v0, v1, Lj4/f;->b:I

    return-object v1

    :cond_4
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lj4/f;

    sget-object v1, Lj4/f;->m:Ljava/lang/String;

    invoke-direct {v0, v1}, Lj4/f;-><init>(Ljava/lang/String;)V

    iput-object p0, v0, Lj4/f;->e:Ljava/lang/String;

    iput-object v5, v0, Lj4/f;->f:Ljava/lang/String;

    iput-boolean v3, v0, Lj4/f;->g:Z

    return-object v0

    :cond_5
    return-object v1

    :pswitch_0
    new-instance p0, Lj4/f;

    invoke-direct {p0, v2}, Lj4/f;-><init>(Ljava/lang/String;)V

    return-object p0

    :pswitch_1
    invoke-static {v5}, Lj4/f;->c(Ljava/lang/String;)Lj4/f;

    move-result-object p0

    return-object p0

    :pswitch_2
    new-instance p0, Lj4/f;

    sget-object v0, Lj4/f;->k:Ljava/lang/String;

    invoke-direct {p0, v0}, Lj4/f;-><init>(Ljava/lang/String;)V

    return-object p0

    :pswitch_3
    invoke-static {v2}, Lj4/f;->c(Ljava/lang/String;)Lj4/f;

    move-result-object p0

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x57099186 -> :sswitch_3
        -0x3b54f756 -> :sswitch_2
        -0x35630e8d -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static N(ILe4/s;Ljava/lang/String;Li4/g;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual {v2}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual/range {p1 .. p2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-nez p0, :cond_0

    invoke-virtual {v0, v5, v1}, Le4/s;->d(ILjava/lang/String;)Lk4/g;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v6, v1}, Le4/s;->d(ILjava/lang/String;)Lk4/g;

    :goto_0
    iget-boolean v1, v0, Le4/s;->b:Z

    if-nez v1, :cond_2

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v5

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v6

    :goto_2
    iget-object v4, v4, Lj4/b;->c:Ljava/lang/Object;

    check-cast v4, Lk4/g;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v8, v5

    move v9, v6

    const/4 v10, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v13

    const-string v14, "start"

    const-string v15, "right"

    const/16 v16, 0x2

    const-string v7, "left"

    const-string v12, "end"

    sparse-switch v13, :sswitch_data_0

    :goto_4
    const/4 v13, -0x1

    goto :goto_5

    :sswitch_0
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    goto :goto_4

    :cond_3
    const/4 v13, 0x4

    goto :goto_5

    :sswitch_1
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    goto :goto_4

    :cond_4
    const/4 v13, 0x3

    goto :goto_5

    :sswitch_2
    invoke-virtual {v11, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    goto :goto_4

    :cond_5
    move/from16 v13, v16

    goto :goto_5

    :sswitch_3
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_4

    :cond_6
    move v13, v6

    goto :goto_5

    :sswitch_4
    const-string v13, "percent"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_7

    goto :goto_4

    :cond_7
    move v13, v5

    :goto_5
    packed-switch v13, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    invoke-virtual {v2, v11}, Li4/b;->q(Ljava/lang/String;)F

    move-result v7

    iget-object v9, v0, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v9, v7}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    move v9, v1

    goto :goto_3

    :pswitch_1
    invoke-virtual {v2, v11}, Li4/b;->q(Ljava/lang/String;)F

    move-result v7

    iget-object v9, v0, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v9, v7}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    move v9, v5

    goto :goto_3

    :pswitch_2
    invoke-virtual {v2, v11}, Li4/b;->q(Ljava/lang/String;)F

    move-result v7

    iget-object v9, v0, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v9, v7}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    move v9, v6

    goto :goto_3

    :pswitch_3
    invoke-virtual {v2, v11}, Li4/b;->q(Ljava/lang/String;)F

    move-result v7

    iget-object v9, v0, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v9, v7}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v10

    xor-int/lit8 v9, v1, 0x1

    goto/16 :goto_3

    :pswitch_4
    invoke-virtual {v2, v11}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v8

    instance-of v13, v8, Li4/a;

    if-eqz v13, :cond_8

    check-cast v8, Li4/a;

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    if-nez v8, :cond_9

    invoke-virtual {v2, v11}, Li4/b;->q(Ljava/lang/String;)F

    move-result v10

    move v8, v6

    move v9, v8

    goto/16 :goto_3

    :cond_9
    iget-object v11, v8, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-le v11, v6, :cond_e

    invoke-virtual {v8, v5}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v6}, Li4/b;->p(I)F

    move-result v8

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_1

    :goto_7
    const/4 v12, -0x1

    goto :goto_8

    :sswitch_5
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto :goto_7

    :cond_a
    const/4 v12, 0x3

    goto :goto_8

    :sswitch_6
    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_7

    :cond_b
    move/from16 v12, v16

    goto :goto_8

    :sswitch_7
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_7

    :cond_c
    move v12, v6

    goto :goto_8

    :sswitch_8
    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto :goto_7

    :cond_d
    move v12, v5

    :goto_8
    packed-switch v12, :pswitch_data_1

    :goto_9
    move v10, v8

    :cond_e
    move v8, v6

    goto/16 :goto_3

    :pswitch_5
    move v9, v1

    goto :goto_9

    :pswitch_6
    move v9, v5

    goto :goto_9

    :pswitch_7
    move v9, v6

    move v10, v8

    move v8, v9

    goto/16 :goto_3

    :pswitch_8
    xor-int/lit8 v9, v1, 0x1

    goto :goto_9

    :cond_f
    if-eqz v8, :cond_11

    if-eqz v9, :cond_10

    const/4 v0, -0x1

    iput v0, v4, Lk4/g;->d:I

    iput v0, v4, Lk4/g;->e:I

    iput v10, v4, Lk4/g;->f:F

    return-void

    :cond_10
    const/4 v0, -0x1

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v10

    iput v0, v4, Lk4/g;->d:I

    iput v0, v4, Lk4/g;->e:I

    iput v1, v4, Lk4/g;->f:F

    return-void

    :cond_11
    const/4 v0, -0x1

    if-eqz v9, :cond_12

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v4, Lk4/g;->a:Le4/s;

    invoke-virtual {v2, v1}, Le4/s;->c(Ljava/lang/Float;)I

    move-result v1

    iput v1, v4, Lk4/g;->d:I

    iput v0, v4, Lk4/g;->e:I

    const/4 v1, 0x0

    iput v1, v4, Lk4/g;->f:F

    return-void

    :cond_12
    const/4 v1, 0x0

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iput v0, v4, Lk4/g;->d:I

    iget-object v0, v4, Lk4/g;->a:Le4/s;

    invoke-virtual {v0, v2}, Le4/s;->c(Ljava/lang/Float;)I

    move-result v0

    iput v0, v4, Lk4/g;->e:I

    iput v1, v4, Lk4/g;->f:F

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x28779bbb -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x188db -> :sswitch_8
        0x32a007 -> :sswitch_7
        0x677c21c -> :sswitch_6
        0x68ac462 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public static O(Le4/s;La3/p;Ljava/lang/String;Li4/g;)V
    .locals 2

    invoke-virtual {p0, p2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object p2

    iget-object v0, p2, Lj4/b;->d0:Lj4/f;

    sget-object v1, Lj4/f;->i:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lj4/f;

    invoke-direct {v0, v1}, Lj4/f;-><init>(Ljava/lang/String;)V

    iput-object v0, p2, Lj4/b;->d0:Lj4/f;

    :cond_0
    iget-object v0, p2, Lj4/b;->e0:Lj4/f;

    if-nez v0, :cond_1

    new-instance v0, Lj4/f;

    invoke-direct {v0, v1}, Lj4/f;-><init>(Ljava/lang/String;)V

    iput-object v0, p2, Lj4/b;->e0:Lj4/f;

    :cond_1
    invoke-virtual {p3}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p1, p0, p3, p2, v1}, Lpf/c;->k(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final P(Lba3/h;)V
    .locals 2

    sget v0, Lba3/d;->w:I

    iget v0, p0, Lba3/h;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lba3/h;->c:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    const-string v1, " was passed"

    invoke-static {v0, p0, v1}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final Q(Lx1/b;Ls83/c;)V
    .locals 4

    instance-of v0, p1, Lp6/h0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lp6/h0;

    iget v1, v0, Lp6/h0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/h0;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/h0;

    invoke-direct {v0, p1}, Lp6/h0;-><init>(Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lp6/h0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lp6/h0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p0

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    sget-object v1, Lp6/t;->w:Lp6/t;

    invoke-interface {p1, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Lp6/n;

    if-eqz p1, :cond_3

    iput v2, v0, Lp6/h0;->x:I

    invoke-virtual {p1, p0, v0}, Lp6/n;->a(Lc93/m;Ls83/c;)V

    return-void

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static R(Ljava/io/InputStream;)Lra3/a;
    .locals 3

    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance p0, Li93/j;

    const/4 v1, 0x1

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    invoke-direct {p0, v1, v2, v1}, Li93/h;-><init>(III)V

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    move-object v2, p0

    check-cast v2, Li93/i;

    iget-boolean v2, v2, Li93/i;->y:Z

    if-eqz v2, :cond_0

    move-object v2, p0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object p0

    array-length v0, p0

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    new-instance v0, Lra3/a;

    invoke-direct {v0, p0}, Lra3/a;-><init>([I)V

    return-object v0
.end method

.method public static S(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final T(Llb3/y;)Z
    .locals 2

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lya3/h;->b(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lya3/h;->e(Lr93/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lr93/e;

    invoke-static {v0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    sget-object v1, Lo93/n;->h:Lva3/e;

    invoke-virtual {v0, v1}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Lya3/h;->g(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object p0

    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object p0

    instance-of v0, p0, Lr93/x0;

    if-eqz v0, :cond_2

    check-cast p0, Lr93/x0;

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {p0}, Lio/sentry/config/a;->E(Lr93/x0;)Llb3/y;

    move-result-object p0

    invoke-static {p0}, Lpf/c;->T(Llb3/y;)Z

    move-result p0

    if-eqz p0, :cond_4

    :goto_1
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_2
    const/4 p0, 0x0

    return p0
.end method

.method public static U(Lio/sentry/r4;Lwe/o;Lio/sentry/v0;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    if-eqz v0, :cond_0

    const-string v0, "event_id"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_0
    const-string v0, "contexts"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    if-eqz v0, :cond_1

    const-string v0, "sdk"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->y:Lio/sentry/protocol/t;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_1
    iget-object v0, p0, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    if-eqz v0, :cond_2

    const-string v0, "request"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->z:Lio/sentry/protocol/q;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_2
    iget-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "tags"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->E:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_3
    iget-object v0, p0, Lio/sentry/r4;->F:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v0, "release"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->F:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_4
    iget-object v0, p0, Lio/sentry/r4;->G:Ljava/lang/String;

    if-eqz v0, :cond_5

    const-string v0, "environment"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->G:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_5
    iget-object v0, p0, Lio/sentry/r4;->H:Ljava/lang/String;

    if-eqz v0, :cond_6

    const-string v0, "platform"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->H:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_6
    iget-object v0, p0, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-eqz v0, :cond_7

    const-string v0, "user"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_7
    iget-object v0, p0, Lio/sentry/r4;->K:Ljava/lang/String;

    if-eqz v0, :cond_8

    const-string v0, "server_name"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->K:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_8
    iget-object v0, p0, Lio/sentry/r4;->L:Ljava/lang/String;

    if-eqz v0, :cond_9

    const-string v0, "dist"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->L:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :cond_9
    iget-object v0, p0, Lio/sentry/r4;->M:Ljava/util/List;

    if-eqz v0, :cond_a

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    const-string v0, "breadcrumbs"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->M:Ljava/util/List;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_a
    iget-object v0, p0, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    if-eqz v0, :cond_b

    const-string v0, "debug_meta"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object v0, p0, Lio/sentry/r4;->N:Lio/sentry/protocol/d;

    invoke-virtual {p1, p2, v0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_b
    iget-object v0, p0, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "extra"

    invoke-virtual {p1, v0}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    iget-object p0, p0, Lio/sentry/r4;->O:Ljava/util/AbstractMap;

    invoke-virtual {p1, p2, p0}, Lwe/o;->Y(Lio/sentry/v0;Ljava/lang/Object;)Lwe/o;

    :cond_c
    return-void
.end method

.method public static V(Landroid/view/Window;Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x23

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Le3/c;->f(Landroid/view/Window;Z)V

    return-void

    :cond_0
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lb5/a;->k(Landroid/view/Window;Z)V

    return-void

    :cond_1
    invoke-static {p0, p1}, Lo73/a;->X(Landroid/view/Window;Z)V

    return-void
.end method

.method public static W(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    new-instance v1, Ljava/io/PrintWriter;

    invoke-direct {v1, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    invoke-virtual {p0, v1}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    invoke-virtual {v1}, Ljava/io/PrintWriter;->flush()V

    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "toString(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static X(Lic/g;)[B
    .locals 4

    const-string v0, "data"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lic/g;->a:Ljava/util/HashMap;

    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, -0x5411

    :try_start_1
    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {p0}, Ljava/util/HashMap;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v3, v2}, Lpf/c;->Y(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I

    move-result p0

    const/16 v2, 0x2800

    if-gt p0, v2, :cond_1

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :cond_1
    :try_start_3
    const-string p0, "Data cannot occupy more than 10240 bytes when serialized"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {v1, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    move-exception p0

    invoke-static {}, Lic/h;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    const-string v2, "Error in Data#toByteArray: "

    invoke-virtual {v1, v0, v2, p0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0
.end method

.method public static final Y(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto/16 :goto_9

    :cond_0
    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    goto/16 :goto_9

    :cond_1
    instance-of v3, v1, Ljava/lang/Byte;

    if-eqz v3, :cond_2

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->byteValue()B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto/16 :goto_9

    :cond_2
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_3

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto/16 :goto_9

    :cond_3
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_4

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeLong(J)V

    goto/16 :goto_9

    :cond_4
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_5

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeFloat(F)V

    goto/16 :goto_9

    :cond_5
    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_6

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/io/DataOutputStream;->writeDouble(D)V

    goto/16 :goto_9

    :cond_6
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_7

    const/4 v2, 0x7

    invoke-virtual {v0, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    goto/16 :goto_9

    :cond_7
    instance-of v3, v1, [Ljava/lang/Object;

    const-string v4, "Unsupported value type "

    if-eqz v3, :cond_25

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-class v6, [Ljava/lang/Boolean;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0xe

    const/16 v8, 0xd

    const/16 v9, 0xc

    const/16 v10, 0xb

    const/16 v11, 0xa

    const/16 v12, 0x9

    const/16 v13, 0x8

    if-eqz v6, :cond_8

    move v3, v13

    goto :goto_0

    :cond_8
    const-class v6, [Ljava/lang/Byte;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    move v3, v12

    goto :goto_0

    :cond_9
    const-class v6, [Ljava/lang/Integer;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    move v3, v11

    goto :goto_0

    :cond_a
    const-class v6, [Ljava/lang/Long;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    move v3, v10

    goto :goto_0

    :cond_b
    const-class v6, [Ljava/lang/Float;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    move v3, v9

    goto :goto_0

    :cond_c
    const-class v6, [Ljava/lang/Double;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    move v3, v8

    goto :goto_0

    :cond_d
    const-class v6, [Ljava/lang/String;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_24

    move v3, v7

    :goto_0
    invoke-virtual {v0, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    array-length v4, v1

    invoke-virtual {v0, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    array-length v4, v1

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_23

    aget-object v6, v1, v5

    const/4 v14, 0x0

    if-ne v3, v13, :cond_10

    instance-of v15, v6, Ljava/lang/Boolean;

    if-eqz v15, :cond_e

    move-object v14, v6

    check-cast v14, Ljava/lang/Boolean;

    :cond_e
    if-eqz v14, :cond_f

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_2

    :cond_f
    move v6, v2

    :goto_2
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeBoolean(Z)V

    goto/16 :goto_8

    :cond_10
    if-ne v3, v12, :cond_13

    instance-of v15, v6, Ljava/lang/Byte;

    if-eqz v15, :cond_11

    move-object v14, v6

    check-cast v14, Ljava/lang/Byte;

    :cond_11
    if-eqz v14, :cond_12

    invoke-virtual {v14}, Ljava/lang/Byte;->byteValue()B

    move-result v6

    goto :goto_3

    :cond_12
    move v6, v2

    :goto_3
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeByte(I)V

    goto/16 :goto_8

    :cond_13
    if-ne v3, v11, :cond_16

    instance-of v15, v6, Ljava/lang/Integer;

    if-eqz v15, :cond_14

    move-object v14, v6

    check-cast v14, Ljava/lang/Integer;

    :cond_14
    if-eqz v14, :cond_15

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_4

    :cond_15
    move v6, v2

    :goto_4
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeInt(I)V

    goto :goto_8

    :cond_16
    if-ne v3, v10, :cond_19

    instance-of v15, v6, Ljava/lang/Long;

    if-eqz v15, :cond_17

    move-object v14, v6

    check-cast v14, Ljava/lang/Long;

    :cond_17
    if-eqz v14, :cond_18

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    goto :goto_5

    :cond_18
    const-wide/16 v14, 0x0

    :goto_5
    invoke-virtual {v0, v14, v15}, Ljava/io/DataOutputStream;->writeLong(J)V

    goto :goto_8

    :cond_19
    if-ne v3, v9, :cond_1c

    instance-of v15, v6, Ljava/lang/Float;

    if-eqz v15, :cond_1a

    move-object v14, v6

    check-cast v14, Ljava/lang/Float;

    :cond_1a
    if-eqz v14, :cond_1b

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_6

    :cond_1b
    const/4 v6, 0x0

    :goto_6
    invoke-virtual {v0, v6}, Ljava/io/DataOutputStream;->writeFloat(F)V

    goto :goto_8

    :cond_1c
    if-ne v3, v8, :cond_1f

    instance-of v15, v6, Ljava/lang/Double;

    if-eqz v15, :cond_1d

    move-object v14, v6

    check-cast v14, Ljava/lang/Double;

    :cond_1d
    if-eqz v14, :cond_1e

    invoke-virtual {v14}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    goto :goto_7

    :cond_1e
    const-wide/16 v14, 0x0

    :goto_7
    invoke-virtual {v0, v14, v15}, Ljava/io/DataOutputStream;->writeDouble(D)V

    goto :goto_8

    :cond_1f
    if-ne v3, v7, :cond_22

    instance-of v15, v6, Ljava/lang/String;

    if-eqz v15, :cond_20

    move-object v14, v6

    check-cast v14, Ljava/lang/String;

    :cond_20
    if-nez v14, :cond_21

    const-string v14, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    :cond_21
    invoke-virtual {v0, v14}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    :cond_22
    :goto_8
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_23
    :goto_9
    invoke-virtual/range {p0 .. p1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V

    return-void

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-interface {v1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static Z(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Ld0/z1;Landroidx/compose/ui/Modifier;Ld0/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    iget-object v0, v1, Ld0/z1;->a:Lal/a;

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    const v7, -0x6fe6665e

    invoke-virtual {v4, v7}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_1
    move v7, v6

    :goto_1
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    :cond_3
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    or-int/lit16 v7, v7, 0xc00

    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_7

    invoke-virtual {v4, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x4000

    goto :goto_4

    :cond_6
    const/16 v9, 0x2000

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    and-int/lit16 v9, v7, 0x2493

    const/16 v10, 0x2492

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_8

    move v9, v11

    goto :goto_5

    :cond_8
    move v9, v12

    :goto_5
    and-int/lit8 v10, v7, 0x1

    invoke-virtual {v4, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_9

    sget-object v9, Lc0/d;->E:Lc0/d;

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v10, :cond_a

    new-instance v13, Lz1/p;

    invoke-direct {v13}, Lz1/p;-><init>()V

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v13, v14}, Lz1/p;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v13, Lz1/p;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v10, :cond_b

    sget-object v14, La0/d1;->a:[J

    new-instance v14, La0/v0;

    invoke-direct {v14}, La0/v0;-><init>()V

    invoke-virtual {v4, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v14, La0/v0;

    iget-object v15, v1, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v0}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    const v0, 0x1324f7c8

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lz1/p;->size()I

    move-result v0

    if-ne v0, v11, :cond_d

    invoke-virtual {v13, v12}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_6

    :cond_c
    const v0, 0x1329ebe0

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    :goto_6
    const v0, 0x1327049a

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v7, 0xe

    const/4 v7, 0x4

    if-ne v0, v7, :cond_e

    move v0, v11

    goto :goto_7

    :cond_e
    move v0, v12

    :goto_7
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_f

    if-ne v7, v10, :cond_10

    :cond_f
    new-instance v7, La0/a1;

    const/16 v0, 0xc

    invoke-direct {v7, v1, v0}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v7}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14}, La0/v0;->a()V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_11
    const v0, 0x132a0320

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v14, v0}, La0/v0;->b(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    const v0, 0x132af01b

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    move v7, v12

    :goto_a
    move-object v8, v0

    check-cast v8, Ln83/b;

    invoke-virtual {v8}, Ln83/b;->hasNext()Z

    move-result v10

    const/4 v11, -0x1

    if-eqz v10, :cond_13

    invoke-virtual {v8}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v9, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v9, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    goto :goto_b

    :cond_12
    add-int/lit8 v7, v7, 0x1

    const/4 v11, 0x1

    goto :goto_a

    :cond_13
    move v7, v11

    :goto_b
    if-ne v7, v11, :cond_14

    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v0}, Lz1/p;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_14
    invoke-virtual {v15}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v13, v7, v0}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :goto_c
    invoke-virtual {v14}, La0/v0;->a()V

    invoke-virtual {v13}, Lz1/p;->size()I

    move-result v0

    move v7, v12

    :goto_d
    if-ge v7, v0, :cond_15

    invoke-virtual {v13, v7}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v8

    new-instance v10, Lc0/o0;

    invoke-direct {v10, v1, v3, v8, v5}, Lc0/o0;-><init>(Ld0/z1;Ld0/c0;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    const v11, -0x37b2e7f5

    invoke-static {v11, v4, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    invoke-virtual {v14, v8, v10}, La0/v0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_d

    :cond_15
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_16
    const v0, 0x133645e0

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    :goto_e
    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v4, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_f
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v4, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_18

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_19

    :cond_18
    invoke-static {v7, v4, v7, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v4, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x4e3e53b8

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lz1/p;->size()I

    move-result v0

    move v7, v12

    :goto_10
    if-ge v7, v0, :cond_1b

    invoke-virtual {v13, v7}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v8

    const v10, 0x45d4d0b9

    invoke-interface {v9, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v4, v10, v11}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v14, v8}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc93/m;

    if-nez v8, :cond_1a

    const v8, 0x74c5d4d0

    invoke-virtual {v4, v8}, Lp1/q;->e0(I)V

    :goto_11
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1a
    const v10, 0x45d4d551

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v8, v4, v10}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :goto_12
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_10

    :cond_1b
    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1c
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v9, p3

    :goto_13
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lc0/p0;

    move-object v4, v9

    invoke-direct/range {v0 .. v6}, Lc0/p0;-><init>(Ld0/z1;Landroidx/compose/ui/Modifier;Ld0/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final a0(Lp6/g0;Landroid/content/Context;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lp6/i0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lp6/i0;

    iget v1, v0, Lp6/i0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/i0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/i0;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lp6/i0;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/i0;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lp6/i0;->y:Ljava/util/Iterator;

    iget-object p1, v0, Lp6/i0;->x:Landroid/content/Context;

    iget-object v2, v0, Lp6/i0;->w:Lp6/g0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p1, v0, Lp6/i0;->x:Landroid/content/Context;

    iget-object p0, v0, Lp6/i0;->w:Lp6/g0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lp6/n0;

    invoke-direct {p2, p1}, Lp6/n0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iput-object p0, v0, Lp6/i0;->w:Lp6/g0;

    iput-object p1, v0, Lp6/i0;->x:Landroid/content/Context;

    iput v4, v0, Lp6/i0;->E:I

    invoke-virtual {p2, v2, v0}, Lp6/n0;->b(Ljava/lang/Class;Lq83/d;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p0

    move-object p0, p2

    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln6/l;

    iput-object v2, v0, Lp6/i0;->w:Lp6/g0;

    iput-object p1, v0, Lp6/i0;->x:Landroid/content/Context;

    iput-object p0, v0, Lp6/i0;->y:Ljava/util/Iterator;

    iput v3, v0, Lp6/i0;->E:I

    invoke-virtual {v2, p1, p2, v0}, Lp6/g0;->p(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x1e970fed

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_5

    invoke-virtual {v12, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    :goto_4
    and-int/lit8 v2, p7, 0x4

    if-eqz v2, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_5

    :cond_8
    const/16 v4, 0x80

    :goto_5
    or-int/2addr v0, v4

    :goto_6
    and-int/lit8 v4, p7, 0x8

    if-eqz v4, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x800

    goto :goto_7

    :cond_b
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v0, v7

    :goto_8
    and-int/lit16 v7, v6, 0x6000

    move-object/from16 v11, p4

    if-nez v7, :cond_d

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/16 v7, 0x4000

    goto :goto_9

    :cond_c
    const/16 v7, 0x2000

    :goto_9
    or-int/2addr v0, v7

    :cond_d
    and-int/lit16 v7, v0, 0x2493

    const/16 v8, 0x2492

    const/4 v9, 0x0

    if-eq v7, v8, :cond_e

    const/4 v7, 0x1

    goto :goto_a

    :cond_e
    move v7, v9

    :goto_a
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_12

    if-eqz v1, :cond_f

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_f
    move-object v8, p1

    if-eqz v2, :cond_10

    const/4 p1, 0x7

    const/4 v1, 0x0

    invoke-static {v9, v9, v1, p1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    goto :goto_b

    :cond_10
    move-object p1, v3

    :goto_b
    if-eqz v4, :cond_11

    const-string v1, "Crossfade"

    goto :goto_c

    :cond_11
    move-object v1, v5

    :goto_c
    and-int/lit8 v2, v0, 0xe

    shr-int/lit8 v3, v0, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    invoke-static {p0, v1, v12, v2, v9}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v7

    const v2, 0xe3f0

    and-int v13, v0, v2

    const/4 v10, 0x0

    move-object v9, p1

    invoke-static/range {v7 .. v13}, Lpf/c;->a(Ld0/z1;Landroidx/compose/ui/Modifier;Ld0/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move-object v4, v1

    move-object v2, v8

    move-object v3, v9

    goto :goto_d

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, p1

    move-object v4, v5

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_13

    new-instance v0, Lc0/m0;

    move-object v1, p0

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lc0/m0;-><init>(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final b0(Lba3/h;)V
    .locals 2

    sget v0, Lba3/g;->w:I

    iget v0, p0, Lba3/h;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lba3/h;->c:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    const-string v1, " was passed"

    invoke-static {v0, p0, v1}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v2, p1

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x441d0e20

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    move-object/from16 v10, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, p9, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v1, v6

    :goto_4
    and-int/lit8 v6, p9, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v1, v9

    :goto_6
    and-int/lit8 v9, p9, 0x10

    if-eqz v9, :cond_b

    or-int/lit16 v1, v1, 0x6000

    :cond_a
    move-object/from16 v11, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v11, v8, 0x6000

    if-nez v11, :cond_a

    move-object/from16 v11, p4

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/16 v12, 0x4000

    goto :goto_7

    :cond_c
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v1, v12

    :goto_8
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_e

    or-int/2addr v1, v13

    :cond_d
    move/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int/2addr v13, v8

    if-nez v13, :cond_d

    move/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v14, 0x10000

    :goto_9
    or-int/2addr v1, v14

    :goto_a
    and-int/lit8 v14, p9, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_11

    or-int/2addr v1, v15

    :cond_10
    move-object/from16 v15, p6

    goto :goto_c

    :cond_11
    and-int/2addr v15, v8

    if-nez v15, :cond_10

    move-object/from16 v15, p6

    invoke-virtual {v0, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_b

    :cond_12
    const/high16 v16, 0x80000

    :goto_b
    or-int v1, v1, v16

    :goto_c
    const v16, 0x92493

    and-int v4, v1, v16

    move/from16 v16, v1

    const v1, 0x92492

    move/from16 v17, v3

    const/4 v3, 0x0

    const/4 v15, 0x1

    if-eq v4, v1, :cond_13

    move v1, v15

    goto :goto_d

    :cond_13
    move v1, v3

    :goto_d
    and-int/lit8 v4, v16, 0x1

    invoke-virtual {v0, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_21

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v17, :cond_14

    move-object v5, v1

    :cond_14
    if-eqz v6, :cond_15

    sget-object v4, Lb2/e;->E:Lb2/m;

    move-object v11, v4

    goto :goto_e

    :cond_15
    move-object v11, v7

    :goto_e
    if-eqz v9, :cond_16

    sget-object v4, Ly2/j;->b:Ly2/b1;

    move/from16 v18, v12

    move-object v12, v4

    move/from16 v4, v18

    goto :goto_f

    :cond_16
    move v4, v12

    move-object/from16 v12, p4

    :goto_f
    if-eqz v4, :cond_17

    const/high16 v4, 0x3f800000    # 1.0f

    move v13, v4

    :cond_17
    if-eqz v14, :cond_18

    const/4 v4, 0x0

    move-object v14, v4

    goto :goto_10

    :cond_18
    move-object/from16 v14, p6

    :goto_10
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_1c

    const v6, 0x71340604

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    and-int/lit8 v6, v16, 0x70

    const/16 v7, 0x20

    if-ne v6, v7, :cond_19

    move v6, v15

    goto :goto_11

    :cond_19
    move v6, v3

    :goto_11
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1a

    if-ne v7, v4, :cond_1b

    :cond_1a
    new-instance v7, Le61/g;

    const/4 v6, 0x1

    invoke-direct {v7, v2, v6}, Le61/g;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1c
    const v6, 0x71367242

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    :goto_12
    invoke-interface {v5, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->s(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move v1, v15

    const/4 v15, 0x2

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/draw/a;->d(Landroidx/compose/ui/Modifier;Ln2/a;Lb2/h;Ly2/k;FLi2/y;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_1d

    sget-object v6, Lf0/s0;->a:Lf0/s0;

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v6, Ly2/r0;

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_1e

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_13
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_1f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    :cond_1f
    invoke-static {v4, v0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move-object v3, v5

    move-object v4, v11

    move-object v5, v12

    move-object v7, v14

    :goto_14
    move v6, v13

    goto :goto_15

    :cond_21
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, v5

    move-object v4, v7

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    goto :goto_14

    :goto_15
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_22

    new-instance v0, Lf0/r0;

    move-object/from16 v1, p0

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lf0/r0;-><init>(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final c0(Lj93/d;Landroidx/lifecycle/f2;Ljava/lang/String;Landroidx/lifecycle/a2;Ll8/c;Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/w1;
    .locals 1

    const-string p5, "extras"

    const-string v0, "store"

    if-eqz p3, :cond_0

    invoke-interface {p1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, Landroidx/lifecycle/d2;

    invoke-direct {p5, p1, p3, p4}, Landroidx/lifecycle/d2;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    goto :goto_0

    :cond_0
    instance-of p3, p1, Landroidx/lifecycle/r;

    if-eqz p3, :cond_1

    invoke-interface {p1}, Landroidx/lifecycle/f2;->getViewModelStore()Landroidx/lifecycle/e2;

    move-result-object p3

    check-cast p1, Landroidx/lifecycle/r;

    invoke-interface {p1}, Landroidx/lifecycle/r;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/a2;

    move-result-object p1

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p5, Landroidx/lifecycle/d2;

    invoke-direct {p5, p3, p1, p4}, Landroidx/lifecycle/d2;-><init>(Landroidx/lifecycle/e2;Landroidx/lifecycle/a2;Ll8/c;)V

    goto :goto_0

    :cond_1
    const/4 p3, 0x0

    const/4 p4, 0x6

    invoke-static {p1, p3, p4}, Lqt/e;->f(Landroidx/lifecycle/f2;Landroidx/lifecycle/n1;I)Landroidx/lifecycle/d2;

    move-result-object p5

    :goto_0
    iget-object p1, p5, Landroidx/lifecycle/d2;->a:Ljava/lang/Object;

    check-cast p1, Lzt/q;

    const-string p3, "modelClass"

    if-eqz p2, :cond_2

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    const-string p3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    invoke-virtual {p3, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lzt/q;->w(Ljava/lang/String;Lj93/d;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Local and anonymous classes can not be ViewModels"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_0

    sget-object p2, Lb2/t;->w:Lb2/t;

    :cond_0
    move-object v2, p2

    sget-object v3, Lb2/e;->E:Lb2/m;

    and-int/lit8 p2, p6, 0x20

    if-eqz p2, :cond_1

    const/high16 p2, 0x3f800000    # 1.0f

    :goto_0
    move v5, p2

    goto :goto_1

    :cond_1
    const/high16 p2, 0x3f000000    # 0.5f

    goto :goto_0

    :goto_1
    and-int/lit8 p2, p6, 0x40

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    :cond_2
    move-object v6, p3

    invoke-static {p0, p4}, Lo2/a;->c(Lo2/e;Landroidx/compose/runtime/Composer;)Landroidx/compose/ui/graphics/vector/VectorPainter;

    move-result-object p0

    and-int/lit8 p2, p5, 0x70

    const/16 p3, 0x8

    or-int/2addr p2, p3

    and-int/lit16 p3, p5, 0x380

    or-int/2addr p2, p3

    const p3, 0xe000

    and-int/2addr p3, p5

    or-int/2addr p2, p3

    const/high16 p3, 0x70000

    and-int/2addr p3, p5

    or-int v8, p2, p3

    const/4 v9, 0x0

    sget-object v4, Ly2/j;->b:Ly2/b1;

    move-object v0, p0

    move-object v1, p1

    move-object v7, p4

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final d0(Lkotlin/jvm/internal/q;)Lzt/q;
    .locals 5

    sget-object v0, Lsa3/d;->d:Lsa3/c;

    const-string v1, "VISIBILITY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Laa3/n1;->z:Lt83/b;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v3, La0/i1;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, La0/i1;-><init>(Ljava/lang/Object;I)V

    :goto_0
    invoke-virtual {v3}, La0/i1;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Laa3/n1;

    iget-object v4, v4, Laa3/n1;->w:Lba3/h;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v3, Lzt/q;

    invoke-direct {v3, p0, v0, v1, v2}, Lzt/q;-><init>(Lkotlin/jvm/internal/q;Lq1/j0;Lt83/a;Ljava/util/ArrayList;)V

    return-object v3
.end method

.method public static final e(Li2/g;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V
    .locals 10

    sget-object v3, Lb2/e;->E:Lb2/m;

    and-int/lit8 v0, p6, 0x10

    if-eqz v0, :cond_0

    sget-object p3, Ly2/j;->b:Ly2/b1;

    :cond_0
    move-object v4, p3

    move-object v7, p4

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_2

    :cond_1
    const/4 p3, 0x1

    invoke-static {p0, p3}, Lts/o;->a(Li2/g;I)Landroidx/compose/ui/graphics/painter/BitmapPainter;

    move-result-object p4

    invoke-virtual {v7, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v0, p4

    check-cast v0, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    const p0, 0x3ffff0

    and-int v8, p5, p0

    const/4 v9, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final e0(Li63/d;Ljava/nio/charset/Charset;)Li63/d;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Li63/d;->d:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "application"

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li63/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "json"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {p1}, Lu63/a;->c(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Li63/d;->g(Ljava/lang/String;)Li63/d;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;Landroidx/compose/runtime/Composer;III)V
    .locals 14

    move-object/from16 v9, p2

    move/from16 v10, p9

    const-string v0, "progress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x3fca9b16

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit16 v0, v10, 0x100

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object/from16 v4, p3

    :goto_0
    and-int/lit16 v0, v10, 0x1000

    if-eqz v0, :cond_1

    move-object v6, v3

    goto :goto_1

    :cond_1
    move-object/from16 v6, p5

    :goto_1
    const v0, -0x1d58f75c

    invoke-virtual {v11, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_2

    new-instance v5, Lqi/w;

    invoke-direct {v5}, Lqi/w;-><init>()V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    check-cast v5, Lqi/w;

    invoke-virtual {v11, v0}, Lp1/q;->f0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_3

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    check-cast v0, Landroid/graphics/Matrix;

    const v8, 0x44faf204

    invoke-virtual {v11, v8}, Lp1/q;->f0(I)V

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_4

    if-ne v13, v7, :cond_5

    :cond_4
    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object v8, v13

    check-cast v8, Lp1/c1;

    const v3, 0xb09311d

    invoke-virtual {v11, v3}, Lp1/q;->f0(I)V

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lqi/i;->b()F

    move-result v3

    const/4 v7, 0x0

    cmpg-float v3, v3, v7

    if-nez v3, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    invoke-static {}, Ldj/i;->c()F

    move-result v3

    iget-object v7, p0, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v7, v3

    iget-object v13, p0, Lqi/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v13, v3

    invoke-static {v9, v7, v13}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move-object v3, v0

    new-instance v0, Lui/k;

    move-object v1, v6

    move-object v6, v4

    move-object v4, v5

    move-object v5, v1

    move-object v1, p0

    move-object v7, p1

    move-object/from16 v2, p4

    invoke-direct/range {v0 .. v8}, Lui/k;-><init>(Lqi/i;Ly2/k;Landroid/graphics/Matrix;Lqi/w;Ljava/util/Map;Lui/z;Lc93/a;Lp1/c1;)V

    move-object v4, v6

    move-object v6, v5

    invoke-static {v13, v0, v11, v12}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-nez v11, :cond_7

    return-void

    :cond_7
    new-instance v0, Lui/j;

    const/4 v10, 0x1

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    move-object v3, v9

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lui/j;-><init>(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;IIII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_8
    :goto_2
    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-nez v12, :cond_9

    move-object/from16 v3, p2

    goto :goto_3

    :cond_9
    new-instance v0, Lui/j;

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lui/j;-><init>(Lqi/i;Lc93/a;Landroidx/compose/ui/Modifier;Lui/z;Ly2/k;Ljava/util/Map;IIII)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :goto_3
    shr-int/lit8 v0, p7, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v3, v11, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public static final f0(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Landroidx/room/b1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Landroidx/room/b1;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    sget-object v2, Landroidx/room/t1;->x:Landroidx/room/s1;

    invoke-interface {p1, v2}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Landroidx/room/t1;

    if-eqz p1, :cond_0

    iget-object v1, p1, Landroidx/room/t1;->w:Lq83/f;

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p1, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {p1, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    :try_start_0
    invoke-virtual {p0}, Landroidx/room/z0;->getTransactionExecutor()Ljava/util/concurrent/Executor;

    move-result-object p2

    new-instance v1, Landroidx/room/a1;

    invoke-direct {v1, p1, p0, v0}, Landroidx/room/a1;-><init>(Lbc3/m;Landroidx/room/z0;Landroidx/room/b1;)V

    invoke-interface {p2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to acquire a thread to perform the database transaction."

    invoke-direct {p2, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p1, p2}, Lbc3/m;->cancel(Ljava/lang/Throwable;)Z

    :goto_0
    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method

.method public static g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eq p0, p1, :cond_3

    sget-object v0, Lv83/a;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    sget-object v0, Lu83/a;->a:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public static final h(Lxf3/c;)Landroid/app/Application;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-class v0, Landroid/app/Application;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/Application;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Lb83/c;

    const-string v0, "Can\'t resolve Application instance. Please use androidContext() function in your KoinApplication configuration."

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lb83/c;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static final i(Lxf3/c;)Landroid/content/Context;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-class v0, Landroid/content/Context;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    new-instance p0, Lb83/c;

    const-string v0, "Can\'t resolve Context instance. Please use androidContext() function in your KoinApplication configuration."

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lb83/c;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static final j(ILjava/lang/StringBuilder;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    const-string v1, "?"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, p0, -0x1

    if-ge v0, v1, :cond_0

    const-string v1, ","

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static k(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    const/16 v8, 0x10

    const/16 v9, 0x8

    const/4 v11, 0x4

    const/4 v12, 0x2

    const/4 v13, 0x6

    const/4 v14, 0x1

    const/4 v15, -0x1

    sparse-switch v7, :sswitch_data_0

    :goto_0
    move v7, v15

    goto/16 :goto_1

    :sswitch_0
    const-string v7, "visibility"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    const/16 v7, 0x17

    goto/16 :goto_1

    :sswitch_1
    const-string v7, "centerHorizontally"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    const/16 v7, 0x16

    goto/16 :goto_1

    :sswitch_2
    const-string v7, "hWeight"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_0

    :cond_2
    const/16 v7, 0x15

    goto/16 :goto_1

    :sswitch_3
    const-string v7, "width"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_0

    :cond_3
    const/16 v7, 0x14

    goto/16 :goto_1

    :sswitch_4
    const-string v7, "vBias"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_0

    :cond_4
    const/16 v7, 0x13

    goto/16 :goto_1

    :sswitch_5
    const-string v7, "hBias"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_0

    :cond_5
    const/16 v7, 0x12

    goto/16 :goto_1

    :sswitch_6
    const-string v7, "alpha"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_0

    :cond_6
    const/16 v7, 0x11

    goto/16 :goto_1

    :sswitch_7
    const-string v7, "vWeight"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_7

    goto :goto_0

    :cond_7
    move v7, v8

    goto/16 :goto_1

    :sswitch_8
    const-string v7, "hRtlBias"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_0

    :cond_8
    const/16 v7, 0xf

    goto/16 :goto_1

    :sswitch_9
    const-string v7, "scaleY"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_0

    :cond_9
    const/16 v7, 0xe

    goto/16 :goto_1

    :sswitch_a
    const-string v7, "scaleX"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v7, 0xd

    goto/16 :goto_1

    :sswitch_b
    const-string v7, "pivotY"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v7, 0xc

    goto/16 :goto_1

    :sswitch_c
    const-string v7, "pivotX"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v7, 0xb

    goto/16 :goto_1

    :sswitch_d
    const-string v7, "motion"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v7, 0xa

    goto/16 :goto_1

    :sswitch_e
    const-string v7, "height"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v7, 0x9

    goto/16 :goto_1

    :sswitch_f
    const-string v7, "translationZ"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    goto/16 :goto_0

    :cond_f
    move v7, v9

    goto/16 :goto_1

    :sswitch_10
    const-string v7, "translationY"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_10

    goto/16 :goto_0

    :cond_10
    const/4 v7, 0x7

    goto :goto_1

    :sswitch_11
    const-string v7, "translationX"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    goto/16 :goto_0

    :cond_11
    move v7, v13

    goto :goto_1

    :sswitch_12
    const-string v7, "rotationZ"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    goto/16 :goto_0

    :cond_12
    const/4 v7, 0x5

    goto :goto_1

    :sswitch_13
    const-string v7, "rotationY"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    goto/16 :goto_0

    :cond_13
    move v7, v11

    goto :goto_1

    :sswitch_14
    const-string v7, "rotationX"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    goto/16 :goto_0

    :cond_14
    const/4 v7, 0x3

    goto :goto_1

    :sswitch_15
    const-string v7, "custom"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_15

    goto/16 :goto_0

    :cond_15
    move v7, v12

    goto :goto_1

    :sswitch_16
    const-string v7, "center"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto/16 :goto_0

    :cond_16
    move v7, v14

    goto :goto_1

    :sswitch_17
    const-string v7, "centerVertically"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto/16 :goto_0

    :cond_17
    move v7, v5

    :goto_1
    const-string v10, "parent"

    packed-switch v7, :pswitch_data_0

    invoke-static/range {p0 .. p4}, Lpf/c;->K(La3/p;Le4/s;Li4/g;Lj4/b;Ljava/lang/String;)V

    return-void

    :pswitch_0
    invoke-virtual {v2, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    :goto_2
    move v12, v15

    goto :goto_3

    :sswitch_18
    const-string v1, "visible"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_2

    :sswitch_19
    const-string v1, "gone"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_2

    :cond_18
    move v12, v14

    goto :goto_3

    :sswitch_1a
    const-string v1, "invisible"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto :goto_2

    :cond_19
    move v12, v5

    :cond_1a
    :goto_3
    packed-switch v12, :pswitch_data_1

    goto/16 :goto_d

    :pswitch_1
    iput v5, v3, Lj4/b;->I:I

    return-void

    :pswitch_2
    iput v9, v3, Lj4/b;->I:I

    return-void

    :pswitch_3
    iput v11, v3, Lj4/b;->I:I

    const/4 v0, 0x0

    iput v0, v3, Lj4/b;->F:F

    return-void

    :pswitch_4
    invoke-virtual {v2, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {v1, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    goto :goto_4

    :cond_1b
    invoke-virtual {v1, v0}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    :goto_4
    invoke-virtual {v3, v0}, Lj4/b;->o(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lj4/b;->i(Ljava/lang/Object;)V

    return-void

    :pswitch_5
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->f:F

    return-void

    :pswitch_6
    iget-object v0, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-static {v2, v4, v1, v0}, Lpf/c;->L(Li4/g;Ljava/lang/String;Le4/s;Lcom/whoop/data/repositories/c;)Lj4/f;

    move-result-object v0

    iput-object v0, v3, Lj4/b;->d0:Lj4/f;

    return-void

    :pswitch_7
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->i:F

    return-void

    :pswitch_8
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->h:F

    return-void

    :pswitch_9
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->F:F

    return-void

    :pswitch_a
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->g:F

    return-void

    :pswitch_b
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v2

    invoke-virtual {v0, v2}, La3/p;->v(Li4/c;)F

    move-result v0

    iget-boolean v1, v1, Le4/s;->b:Z

    if-nez v1, :cond_1c

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v0, v1, v0

    :cond_1c
    iput v0, v3, Lj4/b;->h:F

    return-void

    :pswitch_c
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->H:F

    return-void

    :pswitch_d
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->G:F

    return-void

    :pswitch_e
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->y:F

    return-void

    :pswitch_f
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->x:F

    return-void

    :pswitch_10
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v1, v0, Li4/g;

    if-nez v1, :cond_1d

    goto/16 :goto_d

    :cond_1d
    check-cast v0, Li4/g;

    new-instance v1, Lh4/b;

    invoke-direct {v1}, Lh4/b;-><init>()V

    invoke-virtual {v0}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1e
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_29

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_2

    :goto_6
    move v6, v15

    goto :goto_7

    :sswitch_1b
    const-string v6, "relativeTo"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    goto :goto_6

    :cond_1f
    move v6, v11

    goto :goto_7

    :sswitch_1c
    const-string v6, "pathArc"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_20

    goto :goto_6

    :cond_20
    const/4 v6, 0x3

    goto :goto_7

    :sswitch_1d
    const-string v6, "quantize"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_21

    goto :goto_6

    :cond_21
    move v6, v12

    goto :goto_7

    :sswitch_1e
    const-string v6, "easing"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    goto :goto_6

    :cond_22
    move v6, v14

    goto :goto_7

    :sswitch_1f
    const-string v6, "stagger"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_23

    goto :goto_6

    :cond_23
    move v6, v5

    :goto_7
    packed-switch v6, :pswitch_data_2

    goto :goto_5

    :pswitch_11
    const/16 v6, 0x25d

    invoke-virtual {v0, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v6, v4}, Lh4/b;->c(ILjava/lang/String;)V

    goto :goto_5

    :pswitch_12
    invoke-virtual {v0, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v20, "below"

    const-string v21, "above"

    const-string v16, "none"

    const-string v17, "startVertical"

    const-string v18, "startHorizontal"

    const-string v19, "flip"

    filled-new-array/range {v16 .. v21}, [Ljava/lang/String;

    move-result-object v6

    move v7, v5

    :goto_8
    if-ge v7, v13, :cond_25

    aget-object v8, v6, v7

    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_24

    goto :goto_9

    :cond_24
    add-int/lit8 v7, v7, 0x1

    goto :goto_8

    :cond_25
    move v7, v15

    :goto_9
    if-ne v7, v15, :cond_26

    sget-object v6, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "0 pathArc = \'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\'"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_26
    const/16 v4, 0x25f

    invoke-virtual {v1, v4, v7}, Lh4/b;->b(II)V

    goto/16 :goto_5

    :pswitch_13
    invoke-virtual {v0, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    instance-of v7, v6, Li4/a;

    const/16 v8, 0x262

    if-eqz v7, :cond_27

    check-cast v6, Li4/a;

    iget-object v4, v6, Li4/b;->E:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v4, :cond_1e

    invoke-virtual {v6, v5}, Li4/b;->r(I)I

    move-result v7

    invoke-virtual {v1, v8, v7}, Lh4/b;->b(II)V

    if-le v4, v14, :cond_1e

    const/16 v7, 0x263

    invoke-virtual {v6, v14}, Li4/b;->v(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Lh4/b;->c(ILjava/lang/String;)V

    if-le v4, v12, :cond_1e

    const/16 v4, 0x25a

    invoke-virtual {v6, v12}, Li4/b;->p(I)F

    move-result v6

    invoke-virtual {v1, v6, v4}, Lh4/b;->a(FI)V

    goto/16 :goto_5

    :cond_27
    invoke-virtual {v0, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v6

    if-eqz v6, :cond_28

    invoke-virtual {v6}, Li4/c;->e()I

    move-result v4

    invoke-virtual {v1, v8, v4}, Lh4/b;->b(II)V

    goto/16 :goto_5

    :cond_28
    new-instance v1, Landroidx/constraintlayout/core/parser/CLParsingException;

    const-string v2, "no int found for key <"

    const-string v3, ">, found ["

    invoke-static {v2, v4, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Li4/c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Landroidx/constraintlayout/core/parser/CLParsingException;-><init>(Ljava/lang/String;Li4/c;)V

    throw v1

    :pswitch_14
    const/16 v6, 0x25b

    invoke-virtual {v0, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v6, v4}, Lh4/b;->c(ILjava/lang/String;)V

    goto/16 :goto_5

    :pswitch_15
    const/16 v6, 0x258

    invoke-virtual {v0, v4}, Li4/b;->q(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v1, v4, v6}, Lh4/b;->a(FI)V

    goto/16 :goto_5

    :cond_29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_16
    iget-object v0, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-static {v2, v4, v1, v0}, Lpf/c;->L(Li4/g;Ljava/lang/String;Le4/s;Lcom/whoop/data/repositories/c;)Lj4/f;

    move-result-object v0

    iput-object v0, v3, Lj4/b;->e0:Lj4/f;

    return-void

    :pswitch_17
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v2

    invoke-virtual {v0, v2}, La3/p;->v(Li4/c;)F

    move-result v0

    iget-object v1, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v1, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    iput v0, v3, Lj4/b;->E:F

    return-void

    :pswitch_18
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v2

    invoke-virtual {v0, v2}, La3/p;->v(Li4/c;)F

    move-result v0

    iget-object v1, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v1, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    iput v0, v3, Lj4/b;->D:F

    return-void

    :pswitch_19
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v2

    invoke-virtual {v0, v2}, La3/p;->v(Li4/c;)F

    move-result v0

    iget-object v1, v1, Le4/s;->a:Lcom/whoop/data/repositories/c;

    invoke-virtual {v1, v0}, Lcom/whoop/data/repositories/c;->e(F)F

    move-result v0

    iput v0, v3, Lj4/b;->C:F

    return-void

    :pswitch_1a
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->B:F

    return-void

    :pswitch_1b
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->A:F

    return-void

    :pswitch_1c
    invoke-virtual {v2, v4}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v1

    invoke-virtual {v0, v1}, La3/p;->v(Li4/c;)F

    move-result v0

    iput v0, v3, Lj4/b;->z:F

    return-void

    :pswitch_1d
    invoke-virtual {v2, v4}, Li4/b;->u(Ljava/lang/String;)Li4/c;

    move-result-object v0

    instance-of v1, v0, Li4/g;

    if-eqz v1, :cond_2a

    check-cast v0, Li4/g;

    goto :goto_a

    :cond_2a
    const/4 v0, 0x0

    :goto_a
    if-nez v0, :cond_2b

    goto :goto_d

    :cond_2b
    invoke-virtual {v0}, Li4/b;->A()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2c
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_31

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Li4/b;->o(Ljava/lang/String;)Li4/c;

    move-result-object v4

    instance-of v5, v4, Li4/e;

    if-eqz v5, :cond_2e

    invoke-virtual {v4}, Li4/c;->d()F

    move-result v4

    iget-object v5, v3, Lj4/b;->i0:Ljava/util/HashMap;

    if-nez v5, :cond_2d

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, v3, Lj4/b;->i0:Ljava/util/HashMap;

    :cond_2d
    iget-object v5, v3, Lj4/b;->i0:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_2e
    instance-of v5, v4, Li4/h;

    if-eqz v5, :cond_2c

    invoke-virtual {v4}, Li4/c;->c()Ljava/lang/String;

    move-result-object v4

    const-string v5, "#"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const-wide/16 v6, -0x1

    if-eqz v5, :cond_30

    invoke-virtual {v4, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v13, :cond_2f

    const-string v5, "FF"

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_2f
    invoke-static {v4, v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v4

    goto :goto_c

    :cond_30
    move-wide v4, v6

    :goto_c
    cmp-long v6, v4, v6

    if-eqz v6, :cond_2c

    long-to-int v4, v4

    iget-object v5, v3, Lj4/b;->h0:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_31
    :goto_d
    return-void

    :pswitch_1e
    invoke-virtual {v2, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    invoke-virtual {v1, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    goto :goto_e

    :cond_32
    invoke-virtual {v1, v0}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    :goto_e
    invoke-virtual {v3, v0}, Lj4/b;->o(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lj4/b;->i(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lj4/b;->p(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lj4/b;->e(Ljava/lang/Object;)V

    return-void

    :pswitch_1f
    invoke-virtual {v2, v4}, Li4/b;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_33

    invoke-virtual {v1, v6}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    goto :goto_f

    :cond_33
    invoke-virtual {v1, v0}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v0

    :goto_f
    invoke-virtual {v3, v0}, Lj4/b;->p(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Lj4/b;->e(Ljava/lang/Object;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x565a8e48 -> :sswitch_17
        -0x514d33ab -> :sswitch_16
        -0x5069748f -> :sswitch_15
        -0x4a771f66 -> :sswitch_14
        -0x4a771f65 -> :sswitch_13
        -0x4a771f64 -> :sswitch_12
        -0x490b9c39 -> :sswitch_11
        -0x490b9c38 -> :sswitch_10
        -0x490b9c37 -> :sswitch_f
        -0x48c76ed9 -> :sswitch_e
        -0x3fad404a -> :sswitch_d
        -0x3ae243aa -> :sswitch_c
        -0x3ae243a9 -> :sswitch_b
        -0x3621dfb2 -> :sswitch_a
        -0x3621dfb1 -> :sswitch_9
        -0xec32145 -> :sswitch_8
        -0x3aa8172 -> :sswitch_7
        0x589b15e -> :sswitch_6
        0x5d92341 -> :sswitch_5
        0x69e6c4f -> :sswitch_4
        0x6be2dc6 -> :sswitch_3
        0x17be4100 -> :sswitch_2
        0x53b069a6 -> :sswitch_1
        0x73b66312 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x715b4053 -> :sswitch_1a
        0x30809f -> :sswitch_19
        0x1bd1f072 -> :sswitch_18
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x7119f053 -> :sswitch_1f
        -0x4e19c2d5 -> :sswitch_1e
        -0x4c979acf -> :sswitch_1d
        -0x2f2d1013 -> :sswitch_1c
        -0xe1f7d99 -> :sswitch_1b
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch
.end method

.method public static l(Lub/f;[Ljava/lang/Object;)V
    .locals 4

    if-nez p1, :cond_0

    goto/16 :goto_2

    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_c

    aget-object v2, p1, v1

    add-int/lit8 v1, v1, 0x1

    if-nez v2, :cond_1

    invoke-interface {p0, v1}, Lub/f;->u(I)V

    goto :goto_0

    :cond_1
    instance-of v3, v2, [B

    if-eqz v3, :cond_2

    check-cast v2, [B

    invoke-interface {p0, v1, v2}, Lub/f;->q(I[B)V

    goto :goto_0

    :cond_2
    instance-of v3, v2, Ljava/lang/Float;

    if-eqz v3, :cond_3

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {p0, v2, v3, v1}, Lub/f;->t(DI)V

    goto :goto_0

    :cond_3
    instance-of v3, v2, Ljava/lang/Double;

    if-eqz v3, :cond_4

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-interface {p0, v2, v3, v1}, Lub/f;->t(DI)V

    goto :goto_0

    :cond_4
    instance-of v3, v2, Ljava/lang/Long;

    if-eqz v3, :cond_5

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-interface {p0, v1, v2, v3}, Lub/f;->p(IJ)V

    goto :goto_0

    :cond_5
    instance-of v3, v2, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-long v2, v2

    invoke-interface {p0, v1, v2, v3}, Lub/f;->p(IJ)V

    goto :goto_0

    :cond_6
    instance-of v3, v2, Ljava/lang/Short;

    if-eqz v3, :cond_7

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->shortValue()S

    move-result v2

    int-to-long v2, v2

    invoke-interface {p0, v1, v2, v3}, Lub/f;->p(IJ)V

    goto :goto_0

    :cond_7
    instance-of v3, v2, Ljava/lang/Byte;

    if-eqz v3, :cond_8

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->byteValue()B

    move-result v2

    int-to-long v2, v2

    invoke-interface {p0, v1, v2, v3}, Lub/f;->p(IJ)V

    goto :goto_0

    :cond_8
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_9

    check-cast v2, Ljava/lang/String;

    invoke-interface {p0, v1, v2}, Lub/f;->n0(ILjava/lang/String;)V

    goto :goto_0

    :cond_9
    instance-of v3, v2, Ljava/lang/Boolean;

    if-eqz v3, :cond_b

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_a

    const-wide/16 v2, 0x1

    goto :goto_1

    :cond_a
    const-wide/16 v2, 0x0

    :goto_1
    invoke-interface {p0, v1, v2, v3}, Lub/f;->p(IJ)V

    goto/16 :goto_0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot bind "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " at index "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    :goto_2
    return-void
.end method

.method public static final m(Li63/d;)Ljava/nio/charset/Charset;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "charset"

    invoke-virtual {p0, v0}, Li63/j;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static n(ZLjava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "Argument must not be null"

    invoke-static {p0, v0}, Lpf/c;->p(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static p(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final q(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p0}, Landroidx/room/z0;->inCompatibilityMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->isOpenInternal$room_runtime()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/room/z0;->inTransaction()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, Landroidx/room/d1;->w:Landroidx/room/d1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0, p1, p2}, Lpf/c;->f0(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static r(Lqa3/j1;)Lsa3/j;
    .locals 2

    const-string v0, "table"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqa3/j1;->x:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lsa3/j;->b:Lsa3/j;

    return-object p0

    :cond_0
    new-instance v0, Lsa3/j;

    iget-object p0, p0, Lqa3/j1;->x:Ljava/util/List;

    const-string v1, "getRequirementList(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lsa3/j;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static t([B)Lic/g;
    .locals 7

    const-string v0, "Error in Data#fromByteArray: "

    const-string v1, "bytes"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v1, p0

    const/16 v2, 0x2800

    if-gt v1, v2, :cond_7

    array-length v1, p0

    if-nez v1, :cond_0

    sget-object p0, Lic/g;->b:Lic/g;

    return-object p0

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    :try_start_0
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const/4 p0, 0x2

    new-array p0, p0, [B

    invoke-virtual {v2, p0}, Ljava/io/InputStream;->read([B)I

    const/16 v3, -0x5313

    int-to-byte v3, v3

    const v4, 0xffffac

    int-to-byte v4, v4

    const/4 v5, 0x0

    aget-byte v6, p0, v5

    if-ne v6, v4, :cond_1

    const/4 v4, 0x1

    aget-byte p0, p0, v4

    if-ne p0, v3, :cond_1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    invoke-virtual {v2}, Ljava/io/ByteArrayInputStream;->reset()V

    if-eqz v4, :cond_3

    new-instance p0, Ljava/io/ObjectInputStream;

    invoke-direct {p0, v2}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readInt()I

    move-result v2

    :goto_1
    if-ge v5, v2, :cond_2

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readUTF()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :cond_2
    :try_start_2
    invoke-virtual {p0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p0

    goto :goto_5

    :catch_1
    move-exception p0

    goto :goto_6

    :goto_2
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-static {p0, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_3
    new-instance p0, Ljava/io/DataInputStream;

    invoke-direct {p0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_0

    :try_start_5
    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    const/16 v3, -0x5411

    if-ne v2, v3, :cond_6

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readShort()S

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    :goto_3
    if-ge v5, v2, :cond_4

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v3

    invoke-static {p0, v3}, Lpf/c;->u(Ljava/io/DataInputStream;B)Ljava/io/Serializable;

    move-result-object v3

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :catchall_2
    move-exception v2

    goto :goto_4

    :cond_4
    :try_start_6
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_7

    :cond_5
    :try_start_7
    const-string v3, "Unsupported version number: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_6
    const-string v3, "Magic number doesn\'t match: "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/IllegalStateException;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :goto_4
    :try_start_8
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v3

    :try_start_9
    invoke-static {p0, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_0

    :goto_5
    invoke-static {}, Lic/h;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    invoke-virtual {v3, v2, v0, p0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_6
    invoke-static {}, Lic/h;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v3

    invoke-virtual {v3, v2, v0, p0}, Lic/w;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_7
    new-instance p0, Lic/g;

    invoke-direct {p0, v1}, Lic/g;-><init>(Ljava/util/LinkedHashMap;)V

    return-object p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Data cannot occupy more than 10240 bytes when serialized"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final u(Ljava/io/DataInputStream;B)Ljava/io/Serializable;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 v1, 0x2

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_2
    const/4 v1, 0x3

    if-ne p1, v1, :cond_3

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 v1, 0x4

    if-ne p1, v1, :cond_4

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_4
    const/4 v1, 0x5

    if-ne p1, v1, :cond_5

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_5
    const/4 v1, 0x6

    if-ne p1, v1, :cond_6

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_6
    const/4 v1, 0x7

    if-ne p1, v1, :cond_7

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v1, :cond_9

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Boolean;

    :goto_0
    if-ge v2, p1, :cond_8

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readBoolean()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    return-object v0

    :cond_9
    const/16 v1, 0x9

    if-ne p1, v1, :cond_b

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Byte;

    :goto_1
    if-ge v2, p1, :cond_a

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readByte()B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_a
    return-object v0

    :cond_b
    const/16 v1, 0xa

    if-ne p1, v1, :cond_d

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Integer;

    :goto_2
    if-ge v2, p1, :cond_c

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_c
    return-object v0

    :cond_d
    const/16 v1, 0xb

    if-ne p1, v1, :cond_f

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Long;

    :goto_3
    if-ge v2, p1, :cond_e

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_e
    return-object v0

    :cond_f
    const/16 v1, 0xc

    if-ne p1, v1, :cond_11

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Float;

    :goto_4
    if-ge v2, p1, :cond_10

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readFloat()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_10
    return-object v0

    :cond_11
    const/16 v1, 0xd

    if-ne p1, v1, :cond_13

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v0, p1, [Ljava/lang/Double;

    :goto_5
    if-ge v2, p1, :cond_12

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readDouble()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_12
    return-object v0

    :cond_13
    const/16 v1, 0xe

    if-ne p1, v1, :cond_16

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readInt()I

    move-result p1

    new-array v1, p1, [Ljava/lang/String;

    :goto_6
    if-ge v2, p1, :cond_15

    invoke-virtual {p0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;

    move-result-object v3

    const-string v4, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_14

    move-object v3, v0

    :cond_14
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_15
    return-object v1

    :cond_16
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unsupported type "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final v(Lba3/h;)V
    .locals 2

    sget v0, Lba3/c;->w:I

    iget v0, p0, Lba3/h;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lba3/h;->c:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    const-string v0, "BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but "

    const-string v1, " was passed"

    invoke-static {v0, p0, v1}, Ld;->n(Ljava/lang/String;Lba3/h;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final w(Landroid/graphics/Bitmap;)I
    .locals 3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v1, v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    sget-object v0, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_1

    :cond_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    const/4 v2, 0x2

    if-ne p0, v0, :cond_1

    :goto_0
    move p0, v2

    goto :goto_1

    :cond_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGBA_F16:Landroid/graphics/Bitmap$Config;

    if-ne p0, v0, :cond_3

    const/16 p0, 0x8

    goto :goto_1

    :cond_3
    const/4 p0, 0x4

    :goto_1
    mul-int/2addr v1, p0

    return v1

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot obtain size for recycled bitmap: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " x "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] + "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final x(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 4

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v0

    sget-object v1, Lm3/n;->a:Lm3/l;

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    cmpg-float v1, v0, v2

    if-gez v1, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v1

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v1

    sub-float/2addr v1, v0

    const-string v2, "\u2026"

    invoke-virtual {p2, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p2

    add-float/2addr p2, v1

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lo3/c;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    :goto_0
    if-ne p1, v3, :cond_1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    const/high16 p2, 0x40000000    # 2.0f

    div-float/2addr p0, p2

    :goto_1
    add-float/2addr p0, p1

    return p0

    :cond_1
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    goto :goto_1

    :cond_2
    return v2
.end method

.method public static final y(Landroid/text/Layout;ILandroid/graphics/Paint;)F
    .locals 3

    sget-object v0, Lm3/n;->a:Lm3/l;

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphDirection(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v2

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineStart(I)I

    move-result v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getEllipsisStart(I)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Landroid/text/Layout;->getPrimaryHorizontal(I)F

    move-result v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result v2

    sub-float/2addr v2, v0

    const-string v0, "\u2026"

    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result p2

    add-float/2addr p2, v2

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getParagraphAlignment(I)Landroid/text/Layout$Alignment;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lo3/c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v1, v1, v0

    :goto_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    const/high16 p1, 0x40000000    # 2.0f

    div-float/2addr p0, p1

    :goto_1
    sub-float/2addr v0, p0

    return v0

    :cond_1
    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, p1}, Landroid/text/Layout;->getLineRight(I)F

    move-result p1

    sub-float/2addr v0, p1

    invoke-virtual {p0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    int-to-float p0, p0

    sub-float/2addr p0, p2

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static final z(Lmg/g;)Lmg/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lmg/d;->a:Lmg/c;

    iget-object p0, p0, Lmg/c;->a:Ljava/lang/Object;

    check-cast p0, Lmg/h;

    return-object p0
.end method
