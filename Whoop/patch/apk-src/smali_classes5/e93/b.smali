.class public abstract Le93/b;
.super Ljava/lang/Object;


# static fields
.field public static a:La00/g;

.field public static b:Z

.field public static c:Ljava/lang/reflect/Method;


# direct methods
.method public static final A(F)F
    .locals 4

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0x1ffffffffL

    and-long/2addr v0, v2

    const/4 v2, 0x3

    int-to-long v2, v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    const v1, 0x2a510554

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    mul-float v1, v0, v0

    div-float v1, p0, v1

    sub-float v1, v0, v1

    const v2, 0x3eaaaaab

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    mul-float v1, v0, v0

    div-float/2addr p0, v1

    sub-float p0, v0, p0

    mul-float/2addr p0, v2

    sub-float/2addr v0, p0

    return v0
.end method

.method public static B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final C(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p0, Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    check-cast p0, Lorg/json/JSONObject;

    invoke-static {p0}, Le93/b;->g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Lorg/json/JSONArray;

    if-eqz v0, :cond_2

    check-cast p0, Lorg/json/JSONArray;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Le93/b;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    instance-of v0, p0, Ljava/math/BigDecimal;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/math/BigDecimal;

    invoke-virtual {p0}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_3
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 p0, 0x0

    :cond_4
    return-object p0
.end method

.method public static D(Lq83/h;Lq83/i;)Lq83/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final E(Lsa3/f;I)Lva3/c;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lsa3/f;->b(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, p1}, Lsa3/f;->a(I)Z

    move-result p0

    invoke-static {v0, p0}, Lva3/b;->d(Ljava/lang/String;Z)Lva3/c;

    move-result-object p0

    return-object p0
.end method

.method public static final F(Lsa3/f;I)Lva3/h;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lva3/h;->d(Ljava/lang/String;)Lva3/h;

    move-result-object p0

    return-object p0
.end method

.method public static G(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3

    sget-object v0, Leb/j1;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_2

    const-class v1, Leb/h1;

    invoke-virtual {p0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Leb/h1;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Leb/h1;->value()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "No @Navigator.Name annotation found for "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v1
.end method

.method public static H(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 3

    const-string v0, "tint"

    invoke-static {p1, v0}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v1, p1, Landroid/util/TypedValue;->type:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_0

    iget p0, p1, Landroid/util/TypedValue;->data:I

    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    invoke-static {p1, p0, p2}, Lu4/c;->c(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to resolve attribute at index 1: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static I(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lae3/k;
    .locals 3

    invoke-static {p1, p3}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0, p4, p1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v1, p1, Landroid/util/TypedValue;->type:I

    const/16 v2, 0x1c

    if-lt v1, v2, :cond_0

    const/16 v2, 0x1f

    if-gt v1, v2, :cond_0

    iget p0, p1, Landroid/util/TypedValue;->data:I

    new-instance p1, Lae3/k;

    invoke-direct {p1, p3, p3, p0}, Lae3/k;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p1

    :cond_0
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p0, p4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p0

    :try_start_0
    invoke-static {p1, p0, p2}, Lae3/k;->b(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Lae3/k;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "ComplexColorCompat"

    const-string p2, "Failed to inflate ComplexColor."

    invoke-static {p1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object p0, p3

    :goto_0
    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    new-instance p0, Lae3/k;

    invoke-direct {p0, p3, p3, v0}, Lae3/k;-><init>(Landroid/graphics/Shader;Landroid/content/res/ColorStateList;I)V

    return-object p0
.end method

.method public static J(Lhb3/a0;ZZLjava/lang/Boolean;ZLaj/d;Lsa3/e;)Lw93/b;
    .locals 4

    const-string v0, "container"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast v0, Lr93/s0;

    const-string v1, "metadataVersion"

    invoke-static {p6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lqa3/j;->y:Lqa3/j;

    const/4 v2, 0x0

    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    instance-of p1, p0, Lhb3/y;

    if-eqz p1, :cond_0

    move-object p1, p0

    check-cast p1, Lhb3/y;

    iget-object v3, p1, Lhb3/y;->H:Lqa3/j;

    if-ne v3, v1, :cond_0

    iget-object p0, p1, Lhb3/y;->G:Lva3/c;

    const-string p1, "DefaultImpls"

    invoke-static {p1}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object p1

    invoke-virtual {p0, p1}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object p0

    invoke-static {p5, p0, p6}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    instance-of p1, p0, Lhb3/z;

    if-eqz p1, :cond_4

    instance-of p1, v0, Loa3/h;

    if-eqz p1, :cond_1

    move-object p1, v0

    check-cast p1, Loa3/h;

    goto :goto_0

    :cond_1
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Loa3/h;->b()Ldb3/b;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_4

    new-instance p0, Lva3/e;

    invoke-virtual {p1}, Ldb3/b;->d()Ljava/lang/String;

    move-result-object p1

    const-string p2, "getInternalName(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x2f

    const/16 p3, 0x2e

    invoke-static {p1, p2, p3}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance p1, Lva3/c;

    invoke-virtual {p0}, Lva3/e;->b()Lva3/e;

    move-result-object p2

    iget-object p0, p0, Lva3/e;->a:Lva3/f;

    invoke-virtual {p0}, Lva3/f;->g()Lva3/h;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {p5, p1, p6}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "isConst should not be null for property (container="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    if-eqz p2, :cond_7

    instance-of p1, p0, Lhb3/y;

    if-eqz p1, :cond_7

    move-object p1, p0

    check-cast p1, Lhb3/y;

    iget-object p2, p1, Lhb3/y;->H:Lqa3/j;

    sget-object p3, Lqa3/j;->F:Lqa3/j;

    if-ne p2, p3, :cond_7

    iget-object p1, p1, Lhb3/y;->F:Lhb3/y;

    if-eqz p1, :cond_7

    iget-object p2, p1, Lhb3/y;->H:Lqa3/j;

    sget-object p3, Lqa3/j;->x:Lqa3/j;

    if-eq p2, p3, :cond_5

    sget-object p3, Lqa3/j;->z:Lqa3/j;

    if-eq p2, p3, :cond_5

    if-eqz p4, :cond_7

    if-eq p2, v1, :cond_5

    sget-object p3, Lqa3/j;->E:Lqa3/j;

    if-ne p2, p3, :cond_7

    :cond_5
    iget-object p0, p1, Lhb3/a0;->z:Ljava/lang/Object;

    check-cast p0, Lr93/s0;

    instance-of p1, p0, Loa3/q;

    if-eqz p1, :cond_6

    check-cast p0, Loa3/q;

    goto :goto_2

    :cond_6
    move-object p0, v2

    :goto_2
    if-eqz p0, :cond_9

    iget-object p0, p0, Loa3/q;->w:Lw93/b;

    return-object p0

    :cond_7
    instance-of p0, p0, Lhb3/z;

    if-eqz p0, :cond_9

    instance-of p0, v0, Loa3/h;

    if-eqz p0, :cond_9

    check-cast v0, Loa3/h;

    invoke-virtual {v0}, Loa3/h;->c()Lw93/b;

    move-result-object p0

    if-nez p0, :cond_8

    invoke-virtual {v0}, Loa3/h;->a()Lva3/c;

    move-result-object p0

    invoke-static {p5, p0, p6}, Lds/p;->D(Laj/d;Lva3/c;Lsa3/e;)Lw93/b;

    move-result-object p0

    :cond_8
    return-object p0

    :cond_9
    return-object v2
.end method

.method public static K(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    const-string v0, "default"

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "IterablePushNotificationUtil"

    if-nez v1, :cond_0

    const-string p0, "handlePushAction: extras == null, can\'t handle push action"

    invoke-static {v2, p0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v1, :cond_1

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iput-object v3, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    const-string v1, "initializeForPush: Application context set for background push handling"

    const-string v3, "IterableApi"

    invoke-static {v3, v1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance v6, Lcom/iterable/iterableapi/u1;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v6, v1}, Lcom/iterable/iterableapi/u1;-><init>(Landroid/os/Bundle;)V

    const-string v1, "actionIdentifier"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    :try_start_0
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v8, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v6}, Lcom/iterable/iterableapi/u1;->c()Lcom/iterable/iterableapi/c;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v1, :cond_2

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-string v3, "uri"
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    const-string v9, "type"

    const-string v10, "openUrl"

    invoke-virtual {v7, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v9, "data"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v7}, Lcom/iterable/iterableapi/c;->b(Lorg/json/JSONObject;)Lcom/iterable/iterableapi/c;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :goto_0
    move-object v4, v1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0

    :cond_2
    move-object v4, v1

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    :cond_3
    :try_start_4
    invoke-virtual {v8, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v6, v3}, Lcom/iterable/iterableapi/u1;->a(Ljava/lang/String;)Lcom/iterable/iterableapi/t1;

    move-result-object v0

    iget-object v4, v0, Lcom/iterable/iterableapi/t1;->f:Lcom/iterable/iterableapi/c;

    iget-boolean v5, v0, Lcom/iterable/iterableapi/t1;->d:Z

    iget-object v0, v0, Lcom/iterable/iterableapi/t1;->c:Ljava/lang/String;

    const-string v1, "textInput"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p1}, Landroidx/core/app/RemoteInput;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "userInput"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "userText"

    invoke-virtual {v8, v1, v0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_4
    :goto_1
    move-object v7, v4

    move v0, v5

    goto :goto_3

    :goto_2
    const-string v1, "Encountered an exception while trying to handle the push action"

    invoke-static {v2, v1, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    :goto_3
    new-instance v4, La00/g;

    const/4 v9, 0x7

    move-object v5, p1

    invoke-direct/range {v4 .. v9}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sput-object v4, Le93/b;->a:La00/g;

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p1, p1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-eqz p1, :cond_5

    invoke-static {p0}, Le93/b;->V(Landroid/content/Context;)Z

    move-result p1

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    :goto_4
    if-eqz v0, :cond_6

    if-nez p1, :cond_6

    invoke-static {p0}, Lup/d;->w(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/high16 v0, 0x34000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_6
    return-void
.end method

.method public static L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "http://schemas.android.com/apk/res/android"

    invoke-interface {p0, v0, p1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static M(Landroid/content/pm/PackageManager;)Z
    .locals 2

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "AFTN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "amazon.hardware.fire_tv"

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

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

.method public static final N(Ljava/lang/String;)Z
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v2, v0, :cond_3

    const/4 v3, 0x5

    if-ge v0, v3, :cond_3

    move v0, v1

    :goto_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v0, v3, :cond_2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-gt v4, v3, :cond_0

    const/16 v4, 0x3a

    if-ge v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const/16 v4, 0x61

    if-gt v4, v3, :cond_1

    const/16 v4, 0x67

    if-ge v3, v4, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x41

    if-gt v4, v3, :cond_3

    const/16 v4, 0x47

    if-ge v3, v4, :cond_3

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2

    :cond_3
    return v1
.end method

.method public static final O(FFF)F
    .locals 1

    const/4 v0, 0x1

    int-to-float v0, v0

    sub-float/2addr v0, p2

    mul-float/2addr v0, p0

    mul-float/2addr p2, p1

    add-float/2addr p2, v0

    return p2
.end method

.method public static final P(FII)I
    .locals 4

    sub-int/2addr p2, p1

    int-to-double v0, p2

    float-to-double v2, p0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int p0, v0

    add-int/2addr p1, p0

    return p1
.end method

.method public static Q(Lq83/h;Lq83/i;)Lq83/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p0, Lq83/k;->w:Lq83/k;

    :cond_0
    return-object p0
.end method

.method public static R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0, p2, p3}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    invoke-virtual {p1, p2, p3, p0, p0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Ljava/lang/String;)Lbg/h;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    const/16 v2, 0x2e

    aput-char v2, v0, v1

    const/4 v2, 0x6

    invoke-static {p0, v0, v1, v2}, Lyb3/r;->x0(Ljava/lang/CharSequence;[CII)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, -0x1

    :goto_1
    if-ltz v1, :cond_4

    const/16 v2, 0x100

    if-ge v1, v2, :cond_4

    goto :goto_0

    :cond_2
    :goto_2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ls7/a;->q(Ljava/lang/String;)B

    move-result v1

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-static {v0}, Lm83/s;->z1(Ljava/util/ArrayList;)[B

    move-result-object p0

    new-instance v0, Lbg/h;

    invoke-direct {v0, p0}, Lbg/h;-><init>([B)V

    return-object v0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static T(Lq83/h;Lq83/j;)Lq83/j;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq83/k;->w:Lq83/k;

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lp0/w0;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lp0/w0;-><init>(I)V

    invoke-interface {p1, p0, v0}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq83/j;

    return-object p0
.end method

.method public static U(Lorg/json/JSONObject;Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/b;)V
    .locals 4

    const-string v0, "IterableUtilImpl"

    const-string v1, "brand"

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "manufacturer"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "systemName"

    sget-object v2, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "systemVersion"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "sdkVersion"

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "deviceId"

    invoke-virtual {p0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "appPackageName"

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const/4 p2, 0x0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "Error while retrieving app version"

    invoke-static {v0, v3, v2}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    move-object v2, p2

    :goto_0
    const-string v3, "appVersion"

    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v1, "Error while retrieving app version code"

    invoke-static {v0, v1, p1}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_1
    const-string p1, "appBuild"

    invoke-virtual {p0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "3.6.6"

    const-string p2, "iterableSdkVersion"

    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz p3, :cond_4

    iget p1, p3, Lcom/iterable/iterableapi/b;->c:I

    if-eqz p1, :cond_4

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const/4 v1, 0x1

    if-eq p1, v1, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-ne p1, v1, :cond_0

    const-string p1, "native"

    goto :goto_2

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    const-string p1, "reactnative"

    goto :goto_2

    :cond_2
    const-string p1, "flutter"

    :goto_2
    const-string v1, "frameworkType"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object p1, p3, Lcom/iterable/iterableapi/b;->b:Ljava/lang/String;

    if-eqz p1, :cond_3

    goto :goto_3

    :cond_3
    const-string p1, "unknown"

    :goto_3
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "mobileFrameworkInfo"

    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    return-void
.end method

.method public static V(Landroid/content/Context;)Z
    .locals 11

    sget-object v0, Le93/b;->a:La00/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object v2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v3, v0, La00/g;->x:Ljava/lang/Object;

    check-cast v3, Landroid/content/Intent;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v3, "itbl"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Lup/d;->E(Landroid/os/Bundle;)Z

    :cond_0
    sget-object v2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v3, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v3, Lcom/iterable/iterableapi/u1;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lcom/iterable/iterableapi/q;

    invoke-virtual {v3}, Lcom/iterable/iterableapi/u1;->b()I

    move-result v5

    invoke-virtual {v3}, Lcom/iterable/iterableapi/u1;->e()I

    move-result v6

    invoke-virtual {v3}, Lcom/iterable/iterableapi/u1;->d()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v5, v6, v3}, Lcom/iterable/iterableapi/q;-><init>(IILjava/lang/String;)V

    iget-object v2, v2, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v2, :cond_1

    const-string v1, "IterableApi"

    const-string v2, "setAttributionInfo: Iterable SDK is not initialized with a context."

    invoke-static {v1, v2}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string v3, "com.iterable.iterableapi"

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-virtual {v4}, Lcom/iterable/iterableapi/q;->h()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "itbl_attribution_info_object"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x5265c00

    add-long/2addr v2, v4

    const-string v4, "itbl_attribution_info_expiration"

    invoke-interface {v1, v4, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    sget-object v6, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/u1;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/u1;->b()I

    move-result v8

    iget-object v1, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/u1;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/u1;->e()I

    move-result v9

    iget-object v1, v0, La00/g;->y:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/u1;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/u1;->d()Ljava/lang/String;

    move-result-object v7

    iget-object v1, v0, La00/g;->E:Ljava/lang/Object;

    move-object v10, v1

    check-cast v10, Lorg/json/JSONObject;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lcom/iterable/iterableapi/h;

    invoke-direct/range {v5 .. v10}, Lcom/iterable/iterableapi/h;-><init>(Lcom/iterable/iterableapi/k;Ljava/lang/String;IILorg/json/JSONObject;)V

    invoke-static {v7}, Lcom/iterable/iterableapi/k;->j(Ljava/lang/String;)Ljava/lang/String;

    sget-object v1, Lcom/iterable/iterableapi/u;->a:Lcom/iterable/iterableapi/l1;

    invoke-virtual {v5}, Lcom/iterable/iterableapi/h;->run()V

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/c;

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lug/m;->y(Landroid/content/Context;Lcom/iterable/iterableapi/c;I)Z

    move-result p0

    if-eqz p0, :cond_2

    const/4 v0, 0x0

    sput-object v0, Le93/b;->a:La00/g;

    :cond_2
    return p0

    :cond_3
    return v1
.end method

.method public static W(D)I
    .locals 2

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    cmpl-double v0, p0, v0

    if-lez v0, :cond_0

    const p0, 0x7fffffff

    return p0

    :cond_0
    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    cmpg-double v0, p0, v0

    if-gez v0, :cond_1

    const/high16 p0, -0x80000000

    return p0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    long-to-int p0, p0

    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot round NaN value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static X(F)I
    .locals 1

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot round NaN value."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Y(D)J
    .locals 1

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Math;->round(D)J

    move-result-wide p0

    return-wide p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot round NaN value."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Z(Lc93/m;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    new-instance v0, La6/q;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La6/q;-><init>(Lc93/m;Lq83/d;)V

    sget-object p0, Lq83/k;->w:Lq83/k;

    invoke-static {p0, v0}, Lbc3/f0;->E(Lq83/j;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Lue/a;
    .locals 2

    const-string v0, "id"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lue/a;

    sget-object v1, Lgf/i;->w:Lgf/i;

    invoke-direct {v0, p0, v1}, Lue/a;-><init>(Ljava/lang/String;Lgf/b;)V

    return-object v0
.end method

.method public static a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;
    .locals 8

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget-object p2, Li2/w0;->a:Li2/v0;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p8, 0x4

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    int-to-float p2, v0

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-lez p2, :cond_1

    const/4 p2, 0x1

    move p3, p2

    goto :goto_0

    :cond_1
    move p3, v0

    :cond_2
    :goto_0
    move v3, p3

    and-int/lit8 p2, p8, 0x8

    if-eqz p2, :cond_3

    sget-wide p4, Li2/h0;->a:J

    :cond_3
    move-wide v4, p4

    and-int/lit8 p2, p8, 0x10

    if-eqz p2, :cond_4

    sget-wide p2, Li2/h0;->a:J

    move-wide v6, p2

    goto :goto_1

    :cond_4
    move-wide v6, p6

    :goto_1
    int-to-float p2, v0

    invoke-static {p1, p2}, Ljava/lang/Float;->compare(FF)I

    move-result p2

    if-gtz p2, :cond_6

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    return-object p0

    :cond_6
    :goto_2
    new-instance v0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    move v1, p1

    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;-><init>(FLi2/a1;ZJJ)V

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move-object/from16 v9, p7

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_0
    move-object v0, p0

    and-int/lit8 p0, p9, 0x2

    if-eqz p0, :cond_1

    invoke-static {}, Lg1/m5;->a()Lp1/u2;

    move-result-object p0

    move-object p1, v9

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/l5;

    invoke-virtual {p0}, Lg1/l5;->b()Lt0/a;

    move-result-object p1

    :cond_1
    move-object v1, p1

    and-int/lit8 p0, p9, 0x4

    if-eqz p0, :cond_2

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    move-object p1, v9

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->h()J

    move-result-wide p2

    :cond_2
    move-wide v2, p2

    invoke-static {v2, v3, v9}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v4

    and-int/lit8 p0, p9, 0x10

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    move-object v6, p0

    goto :goto_0

    :cond_3
    move-object/from16 v6, p4

    :goto_0
    and-int/lit8 p0, p9, 0x20

    if-eqz p0, :cond_4

    const/4 p0, 0x1

    int-to-float p0, p0

    move v7, p0

    goto :goto_1

    :cond_4
    move/from16 v7, p5

    :goto_1
    const p0, 0x3ffffe

    and-int v10, p8, p0

    const/4 v11, 0x0

    move-object/from16 v8, p6

    invoke-static/range {v0 .. v11}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method

.method public static final b0(Ljava/nio/ByteBuffer;II)Ljava/nio/ByteBuffer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    const-string v0, "myDuplicate$lambda$1"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    add-int/2addr p1, p2

    invoke-virtual {p0, p1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object p0

    const-string p1, "mySlice$lambda$2"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static c(F)F
    .locals 4

    const v0, 0x3d25aee6    # 0.04045f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const v0, 0x414eb852    # 12.92f

    div-float/2addr p0, v0

    return p0

    :cond_0
    const v0, 0x3d6147ae    # 0.055f

    add-float/2addr p0, v0

    const v0, 0x3f870a3d    # 1.055f

    div-float/2addr p0, v0

    float-to-double v0, p0

    const-wide v2, 0x4003333340000000L    # 2.4000000953674316

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float p0, v0

    return p0
.end method

.method public static final c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    instance-of v1, p3, Ls83/a;

    if-nez v1, :cond_0

    invoke-static {p3, p2, p0}, Lge3/g;->Z(Lc93/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_0
    const/4 v1, 0x2

    invoke-static {v1, p3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p3, p2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catch Lkotlinx/coroutines/DispatchException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    new-instance p3, Lbc3/w;

    invoke-direct {p3, p2, v0}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    move-object p2, p3

    :goto_1
    sget-object p3, Lr83/a;->w:Lr83/a;

    if-ne p2, p3, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p2}, Lbc3/t1;->M(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lbc3/f0;->e:Lhc3/x;

    if-ne v0, v1, :cond_2

    :goto_2
    return-object p3

    :cond_2
    invoke-virtual {p0}, Lhc3/u;->c0()V

    instance-of p3, v0, Lbc3/w;

    if-eqz p3, :cond_5

    if-nez p1, :cond_4

    move-object p1, v0

    check-cast p1, Lbc3/w;

    iget-object p1, p1, Lbc3/w;->a:Ljava/lang/Throwable;

    instance-of p3, p1, Lkotlinx/coroutines/TimeoutCancellationException;

    if-eqz p3, :cond_4

    check-cast p1, Lkotlinx/coroutines/TimeoutCancellationException;

    iget-object p1, p1, Lkotlinx/coroutines/TimeoutCancellationException;->w:Lbc3/k1;

    if-ne p1, p0, :cond_4

    instance-of p0, p2, Lbc3/w;

    if-nez p0, :cond_3

    goto :goto_3

    :cond_3
    check-cast p2, Lbc3/w;

    iget-object p0, p2, Lbc3/w;->a:Ljava/lang/Throwable;

    throw p0

    :cond_4
    check-cast v0, Lbc3/w;

    iget-object p0, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    throw p0

    :cond_5
    invoke-static {v0}, Lbc3/f0;->I(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_3
    return-object p2

    :goto_4
    new-instance p2, Lbc3/w;

    iget-object p1, p1, Lkotlinx/coroutines/DispatchException;->w:Ljava/lang/Throwable;

    invoke-direct {p2, p1, v0}, Lbc3/w;-><init>(Ljava/lang/Throwable;Z)V

    invoke-virtual {p0, p2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    throw p1
.end method

.method public static final varargs d([Lp3/x;)Lp3/l;
    .locals 1

    new-instance v0, Lp3/l;

    invoke-static {p0}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lp3/l;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static d0(ILi93/j;)Li93/h;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Le93/b;->h(ZLjava/lang/Number;)V

    iget v0, p1, Li93/h;->w:I

    iget v1, p1, Li93/h;->x:I

    iget p1, p1, Li93/h;->y:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    neg-int p0, p0

    :goto_1
    new-instance p1, Li93/h;

    invoke-direct {p1, v0, v1, p0}, Li93/h;-><init>(III)V

    return-object p1
.end method

.method public static final e()Lj0/j;
    .locals 1

    new-instance v0, Lj0/j;

    invoke-direct {v0}, Lj0/j;-><init>()V

    return-object v0
.end method

.method public static final e0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Le93/b;->f0(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/Collection;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Le93/b;->e0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_4

    check-cast p0, [Ljava/lang/Object;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-static {p0}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object p0

    :goto_1
    invoke-virtual {p0}, La0/i1;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Le93/b;->e0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_3
    return-object v0

    :cond_4
    return-object p0
.end method

.method public static f(F)F
    .locals 4

    const v0, 0x3b4d2e1c    # 0.0031308f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    const v0, 0x414eb852    # 12.92f

    mul-float/2addr p0, v0

    return p0

    :cond_0
    float-to-double v0, p0

    const-wide v2, 0x3fdaaaaaa0000000L    # 0.4166666567325592

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide v2, 0x3ff0e147a0000000L    # 1.0549999475479126

    mul-double/2addr v0, v2

    const-wide v2, 0x3fac28f5c0000000L    # 0.054999999701976776

    sub-double/2addr v0, v2

    double-to-float p0, v0

    return p0
.end method

.method public static final f0(Ljava/util/Map;)Lorg/json/JSONObject;
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Le93/b;->e0(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public static final varargs g([Ll83/k;)Landroid/os/Bundle;
    .locals 9

    new-instance v0, Landroid/os/Bundle;

    array-length v1, p0

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(I)V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1d

    aget-object v3, p0, v2

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    if-nez v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_0
    instance-of v5, v3, Ljava/lang/Boolean;

    if-eqz v5, :cond_1

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto/16 :goto_1

    :cond_1
    instance-of v5, v3, Ljava/lang/Byte;

    if-eqz v5, :cond_2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->byteValue()B

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByte(Ljava/lang/String;B)V

    goto/16 :goto_1

    :cond_2
    instance-of v5, v3, Ljava/lang/Character;

    if-eqz v5, :cond_3

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putChar(Ljava/lang/String;C)V

    goto/16 :goto_1

    :cond_3
    instance-of v5, v3, Ljava/lang/Double;

    if-eqz v5, :cond_4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    goto/16 :goto_1

    :cond_4
    instance-of v5, v3, Ljava/lang/Float;

    if-eqz v5, :cond_5

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    goto/16 :goto_1

    :cond_5
    instance-of v5, v3, Ljava/lang/Integer;

    if-eqz v5, :cond_6

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    goto/16 :goto_1

    :cond_6
    instance-of v5, v3, Ljava/lang/Long;

    if-eqz v5, :cond_7

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    goto/16 :goto_1

    :cond_7
    instance-of v5, v3, Ljava/lang/Short;

    if-eqz v5, :cond_8

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->shortValue()S

    move-result v3

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShort(Ljava/lang/String;S)V

    goto/16 :goto_1

    :cond_8
    instance-of v5, v3, Landroid/os/Bundle;

    if-eqz v5, :cond_9

    check-cast v3, Landroid/os/Bundle;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto/16 :goto_1

    :cond_9
    instance-of v5, v3, Ljava/lang/CharSequence;

    if-eqz v5, :cond_a

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :cond_a
    instance-of v5, v3, Landroid/os/Parcelable;

    if-eqz v5, :cond_b

    check-cast v3, Landroid/os/Parcelable;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto/16 :goto_1

    :cond_b
    instance-of v5, v3, [Z

    if-eqz v5, :cond_c

    check-cast v3, [Z

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putBooleanArray(Ljava/lang/String;[Z)V

    goto/16 :goto_1

    :cond_c
    instance-of v5, v3, [B

    if-eqz v5, :cond_d

    check-cast v3, [B

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    goto/16 :goto_1

    :cond_d
    instance-of v5, v3, [C

    if-eqz v5, :cond_e

    check-cast v3, [C

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharArray(Ljava/lang/String;[C)V

    goto/16 :goto_1

    :cond_e
    instance-of v5, v3, [D

    if-eqz v5, :cond_f

    check-cast v3, [D

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putDoubleArray(Ljava/lang/String;[D)V

    goto/16 :goto_1

    :cond_f
    instance-of v5, v3, [F

    if-eqz v5, :cond_10

    check-cast v3, [F

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putFloatArray(Ljava/lang/String;[F)V

    goto/16 :goto_1

    :cond_10
    instance-of v5, v3, [I

    if-eqz v5, :cond_11

    check-cast v3, [I

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    goto/16 :goto_1

    :cond_11
    instance-of v5, v3, [J

    if-eqz v5, :cond_12

    check-cast v3, [J

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    goto/16 :goto_1

    :cond_12
    instance-of v5, v3, [S

    if-eqz v5, :cond_13

    check-cast v3, [S

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putShortArray(Ljava/lang/String;[S)V

    goto/16 :goto_1

    :cond_13
    instance-of v5, v3, [Ljava/lang/Object;

    const/16 v6, 0x22

    const-string v7, " for key \""

    if-eqz v5, :cond_18

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-class v8, Landroid/os/Parcelable;

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_14

    check-cast v3, [Landroid/os/Parcelable;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto/16 :goto_1

    :cond_14
    const-class v8, Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_15

    check-cast v3, [Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    goto :goto_1

    :cond_15
    const-class v8, Ljava/lang/CharSequence;

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_16

    check-cast v3, [Ljava/lang/CharSequence;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putCharSequenceArray(Ljava/lang/String;[Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_16
    const-class v8, Ljava/io/Serializable;

    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_17

    check-cast v3, Ljava/io/Serializable;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_1

    :cond_17
    invoke-virtual {v5}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal value array type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    instance-of v5, v3, Ljava/io/Serializable;

    if-eqz v5, :cond_19

    check-cast v3, Ljava/io/Serializable;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_1

    :cond_19
    instance-of v5, v3, Landroid/os/IBinder;

    if-eqz v5, :cond_1a

    check-cast v3, Landroid/os/IBinder;

    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    goto :goto_1

    :cond_1a
    instance-of v5, v3, Landroid/util/Size;

    if-eqz v5, :cond_1b

    check-cast v3, Landroid/util/Size;

    invoke-static {v0, v4, v3}, Lv8/b;->M(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/Size;)V

    goto :goto_1

    :cond_1b
    instance-of v5, v3, Landroid/util/SizeF;

    if-eqz v5, :cond_1c

    check-cast v3, Landroid/util/SizeF;

    invoke-static {v0, v4, v3}, Lv8/b;->N(Landroid/os/Bundle;Ljava/lang/String;Landroid/util/SizeF;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal value type "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    return-object v0
.end method

.method public static final g0(Lorg/json/JSONObject;)Ljava/util/LinkedHashMap;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    const-string v2, "this.keys()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "key"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Le93/b;->C(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final h(ZLjava/lang/Number;)V
    .locals 2

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Step must be positive, was: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static h0(J)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x20

    shr-long v0, p0, v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    cmpg-float p1, v1, p1

    const/16 v1, 0x29

    if-nez p1, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "CornerRadius.circular("

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-static {p1}, Lkotlin/jvm/internal/j;->S(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v2, "CornerRadius.elliptical("

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v0}, Lkotlin/jvm/internal/j;->S(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Lkotlin/jvm/internal/j;->S(F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final i(II)V
    .locals 3

    if-lez p0, :cond_0

    if-lez p1, :cond_0

    return-void

    :cond_0
    const-string v0, " must be greater than zero."

    if-eq p0, p1, :cond_1

    const-string v1, "Both size "

    const-string v2, " and step "

    invoke-static {p0, p1, v1, v2, v0}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string p1, "size "

    invoke-static {p0, p1, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i0(II)Li93/j;
    .locals 2

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, Li93/j;->z:Li93/j;

    sget-object p0, Li93/j;->z:Li93/j;

    return-object p0

    :cond_0
    new-instance v0, Li93/j;

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    invoke-direct {v0, p0, p1, v1}, Li93/h;-><init>(III)V

    return-object v0
.end method

.method public static j(FF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    return p1

    :cond_0
    return p0
.end method

.method public static j0(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    new-instance p0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p0, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0
.end method

.method public static k(Ly3/f;Ly3/f;)Ljava/lang/Comparable;
    .locals 1

    invoke-virtual {p0, p1}, Ly3/f;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    return-object p1

    :cond_0
    return-object p0
.end method

.method public static l(DDD)D
    .locals 1

    cmpl-double v0, p2, p4

    if-gtz v0, :cond_2

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmpl-double p2, p0, p4

    if-lez p2, :cond_1

    return-wide p4

    :cond_1
    return-wide p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot coerce value to an empty range: maximum "

    const-string v0, " is less than minimum "

    invoke-static {p1, p4, p5, v0}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static m(FFF)F
    .locals 2

    cmpl-float v0, p1, p2

    if-gtz v0, :cond_2

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    return p1

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(III)I
    .locals 2

    if-gt p1, p2, :cond_2

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(ILi93/g;)I
    .locals 2

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Li93/f;

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    check-cast p1, Li93/f;

    invoke-static {p0, p1}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_0
    invoke-interface {p1}, Li93/g;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_1
    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-le p0, v0, :cond_2

    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    :cond_2
    return p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p(JJJ)J
    .locals 1

    cmp-long v0, p2, p4

    if-gtz v0, :cond_2

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmp-long p2, p0, p4

    if-lez p2, :cond_1

    return-wide p4

    :cond_1
    return-wide p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot coerce value to an empty range: maximum "

    const-string v0, " is less than minimum "

    invoke-static {p4, p5, p1, v0}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/16 p4, 0x2e

    invoke-static {p1, p2, p3, p4}, Lb9/y;->o(Ljava/lang/StringBuilder;JC)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static q(JLi93/m;)J
    .locals 2

    instance-of v0, p2, Li93/f;

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    check-cast p2, Li93/f;

    invoke-static {p0, p2}, Le93/b;->r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-virtual {p2}, Li93/m;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Li93/m;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    invoke-virtual {p2}, Li93/m;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0

    :cond_1
    invoke-virtual {p2}, Li93/m;->d()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-lez v0, :cond_2

    invoke-virtual {p2}, Li93/m;->d()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    :cond_2
    return-wide p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Cannot coerce value to an empty range: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static r(Ljava/lang/Comparable;Li93/f;)Ljava/lang/Comparable;
    .locals 2

    const-string v0, "range"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Li93/g;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Li93/f;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0, p0}, Li93/f;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0, p0}, Li93/f;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, p0, v0}, Li93/f;->a(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object p0

    :cond_1
    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p0, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_4

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_3

    return-object p1

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {p0, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_4

    return-object p2

    :cond_4
    return-object p0
.end method

.method public static t(Leb/s0;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx1/b;I)V
    .locals 3

    and-int/lit8 v0, p8, 0x2

    sget-object v1, Lm83/y;->w:Lm83/y;

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 v0, p8, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move-object p3, v2

    :cond_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    move-object p4, v2

    :cond_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    move-object p5, p3

    :cond_3
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_4

    move-object p6, p4

    :cond_4
    new-instance p8, Lgb/j;

    iget-object v0, p0, Leb/s0;->f:Leb/j1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v2, Lgb/i;

    invoke-static {v2}, Le93/b;->G(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v0

    check-cast v0, Lgb/i;

    invoke-direct {p8, v0, p1, p7}, Lgb/j;-><init>(Lgb/i;Ljava/lang/String;Lx1/b;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/f;

    iget-object p7, p2, Leb/f;->a:Ljava/lang/String;

    iget-object p2, p2, Leb/f;->b:Leb/l;

    const-string v0, "name"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p8, Leb/o0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p7, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/f0;

    const-string p7, "navDeepLink"

    invoke-static {p2, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p7, p8, Leb/o0;->e:Ljava/lang/Object;

    check-cast p7, Ljava/util/ArrayList;

    invoke-virtual {p7, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    iput-object p3, p8, Lgb/j;->h:Lkotlin/jvm/functions/Function1;

    iput-object p4, p8, Lgb/j;->i:Lkotlin/jvm/functions/Function1;

    iput-object p5, p8, Lgb/j;->j:Lkotlin/jvm/functions/Function1;

    iput-object p6, p8, Lgb/j;->k:Lkotlin/jvm/functions/Function1;

    iget-object p0, p0, Leb/s0;->h:Ljava/util/ArrayList;

    invoke-virtual {p8}, Lgb/j;->a()Leb/n0;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V
    .locals 5

    and-int/lit8 p4, p4, 0x2

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p4, :cond_0

    move-object p2, v0

    :cond_0
    new-instance p4, Lgb/h;

    iget-object v1, p0, Leb/s0;->f:Leb/j1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v2, Lgb/i;

    invoke-static {v2}, Le93/b;->G(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Leb/j1;->b(Ljava/lang/String;)Leb/i1;

    move-result-object v1

    check-cast v1, Lgb/i;

    new-instance v2, Lc2/q;

    const/4 v3, 0x2

    invoke-direct {v2, p3, v3}, Lc2/q;-><init>(Ljava/lang/Object;I)V

    new-instance p3, Lx1/b;

    const/4 v3, 0x1

    const v4, 0x1cdc15aa

    invoke-direct {p3, v2, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {p4, v1, p3}, Lgb/h;-><init>(Lgb/i;Lx1/b;)V

    invoke-virtual {p4, p1}, Leb/n0;->o(Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/f;

    iget-object p3, p2, Leb/f;->a:Ljava/lang/String;

    iget-object p2, p2, Leb/f;->b:Leb/l;

    const-string v1, "argumentName"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p4, Leb/n0;->G:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/f0;

    invoke-virtual {p4, p2}, Leb/n0;->a(Leb/f0;)V

    goto :goto_1

    :cond_2
    iget-object p0, p0, Leb/s0;->h:Ljava/util/ArrayList;

    invoke-virtual {p0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static v(Ljava/io/Serializable;)[J
    .locals 4

    instance-of v0, p0, [I

    if-eqz v0, :cond_1

    check-cast p0, [I

    array-length v0, p0

    new-array v0, v0, [J

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget v2, p0, v1

    int-to-long v2, v2

    aput-wide v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    instance-of v0, p0, [J

    if-eqz v0, :cond_2

    check-cast p0, [J

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final w(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)V
    .locals 4

    const-string v0, "$this$copyTo"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/nio/Buffer;->isReadOnly()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/nio/Buffer;->isReadOnly()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v1

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p0

    add-int/2addr p0, p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    add-int/2addr v3, v1

    invoke-static {v2, p0, p2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v0

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object p0

    add-int/2addr v0, p2

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static x(Landroid/content/Context;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string v0, "IterablePushNotificationUtil"

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final y(JJ)Z
    .locals 0

    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static z(FII)I
    .locals 7

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_1

    :goto_0
    return p1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p0, v0

    if-ltz v0, :cond_2

    return p2

    :cond_2
    shr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    shr-int/lit8 v2, p1, 0x10

    and-int/lit16 v2, v2, 0xff

    int-to-float v2, v2

    div-float/2addr v2, v1

    shr-int/lit8 v3, p1, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    div-float/2addr v3, v1

    and-int/lit16 p1, p1, 0xff

    int-to-float p1, p1

    div-float/2addr p1, v1

    shr-int/lit8 v4, p2, 0x18

    and-int/lit16 v4, v4, 0xff

    int-to-float v4, v4

    div-float/2addr v4, v1

    shr-int/lit8 v5, p2, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-float v5, v5

    div-float/2addr v5, v1

    shr-int/lit8 v6, p2, 0x8

    and-int/lit16 v6, v6, 0xff

    int-to-float v6, v6

    div-float/2addr v6, v1

    and-int/lit16 p2, p2, 0xff

    int-to-float p2, p2

    div-float/2addr p2, v1

    invoke-static {v2}, Le93/b;->c(F)F

    move-result v2

    invoke-static {v3}, Le93/b;->c(F)F

    move-result v3

    invoke-static {p1}, Le93/b;->c(F)F

    move-result p1

    invoke-static {v5}, Le93/b;->c(F)F

    move-result v5

    invoke-static {v6}, Le93/b;->c(F)F

    move-result v6

    invoke-static {p2}, Le93/b;->c(F)F

    move-result p2

    invoke-static {v4, v0, p0, v0}, Lb9/y;->a(FFFF)F

    move-result v0

    invoke-static {v5, v2, p0, v2}, Lb9/y;->a(FFFF)F

    move-result v2

    invoke-static {v6, v3, p0, v3}, Lb9/y;->a(FFFF)F

    move-result v3

    invoke-static {p2, p1, p0, p1}, Lb9/y;->a(FFFF)F

    move-result p0

    mul-float/2addr v0, v1

    invoke-static {v2}, Le93/b;->f(F)F

    move-result p1

    mul-float/2addr p1, v1

    invoke-static {v3}, Le93/b;->f(F)F

    move-result p2

    mul-float/2addr p2, v1

    invoke-static {p0}, Le93/b;->f(F)F

    move-result p0

    mul-float/2addr p0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    or-int/2addr p1, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p1, p2

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    or-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public abstract k0([BII)V
.end method
