.class public final Ltx/b;
.super Ltx/c;
.source "SourceFile"


# static fields
.field public static final o:Lyb3/p;


# instance fields
.field public final b:Ljava/lang/reflect/Field;

.field public final c:Ljava/lang/ClassLoader;

.field public final d:Lcom/squareup/wire/z;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z

.field public final l:Lkotlin/jvm/internal/m;

.field public final m:Lkotlin/jvm/internal/m;

.field public final n:Lkotlin/jvm/internal/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyb3/p;

    const-string v1, "^is[^a-z].*$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Ltx/b;->o:Lyb3/p;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/wire/a0;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 6

    invoke-direct {p0}, Ltx/c;-><init>()V

    iput-object p3, p0, Ltx/b;->b:Ljava/lang/reflect/Field;

    iput-object p5, p0, Ltx/b;->c:Ljava/lang/ClassLoader;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->label()Lcom/squareup/wire/z;

    move-result-object p5

    iput-object p5, p0, Ltx/b;->d:Lcom/squareup/wire/z;

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p5

    const-string v0, "messageField.name"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p5, p0, Ltx/b;->e:Ljava/lang/String;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->jsonName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ltx/b;->f:Ljava/lang/String;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->declaredName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/squareup/wire/a0;->declaredName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    iput-object v1, p0, Ltx/b;->g:Ljava/lang/String;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->tag()I

    move-result v0

    iput v0, p0, Ltx/b;->h:I

    invoke-interface {p1}, Lcom/squareup/wire/a0;->keyAdapter()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltx/b;->i:Ljava/lang/String;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->adapter()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ltx/b;->j:Ljava/lang/String;

    invoke-interface {p1}, Lcom/squareup/wire/a0;->redacted()Z

    move-result v0

    iput-boolean v0, p0, Ltx/b;->k:Z

    const-class v0, Lcom/squareup/wire/g;

    invoke-virtual {p4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const-string v2, "No builder field "

    const/16 v3, 0x2e

    if-eqz v1, :cond_1

    new-instance v1, Ltx/a;

    invoke-direct {v1, p1}, Ltx/a;-><init>(Lcom/squareup/wire/a0;)V

    goto :goto_2

    :cond_1
    invoke-interface {p1}, Lcom/squareup/wire/a0;->label()Lcom/squareup/wire/z;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/squareup/wire/z;->z:Lcom/squareup/wire/z;

    if-ne v1, v4, :cond_2

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    :try_start_0
    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {p4, p5, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v4, Lc4/e;

    const/16 v5, 0xb

    invoke-direct {v4, v1, v5}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    :goto_1
    move-object v1, v4

    goto :goto_2

    :catch_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "No builder method "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x28

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x29

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-virtual {p4, p5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_2

    new-instance v4, Lc4/e;

    const/16 v5, 0xc

    invoke-direct {v4, v1, v5}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :goto_2
    iput-object v1, p0, Ltx/b;->l:Lkotlin/jvm/internal/m;

    invoke-virtual {p4, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p4, Ld8/a;

    const/16 p5, 0xc

    invoke-direct {p4, p1, p5}, Ld8/a;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_3
    :try_start_2
    invoke-virtual {p4, p5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_2 .. :try_end_2} :catch_1

    new-instance p4, Lj43/a;

    const/16 p5, 0xd

    invoke-direct {p4, p1, p5}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    :goto_3
    iput-object p4, p0, Ltx/b;->m:Lkotlin/jvm/internal/m;

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isPrivate(I)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p3, "fieldName"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p3, Ltx/b;->o:Lyb3/p;

    invoke-virtual {p3, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_4

    :cond_4
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "get"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_5

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p5, 0x0

    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    move-result p5

    invoke-static {p5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p5, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p5

    const-string v0, "this as java.lang.String).toUpperCase(Locale.ROOT)"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 p5, 0x1

    invoke-virtual {p1, p5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string p5, "this as java.lang.String).substring(startIndex)"

    invoke-static {p1, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_5
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_4
    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-instance p2, Lj43/a;

    const/16 p3, 0xe

    invoke-direct {p2, p1, p3}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    goto :goto_5

    :cond_6
    new-instance p2, Lj43/a;

    const/16 p1, 0xf

    invoke-direct {p2, p0, p1}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    :goto_5
    iput-object p2, p0, Ltx/b;->n:Lkotlin/jvm/internal/m;

    return-void

    :catch_1
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :catch_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lcom/squareup/wire/l;

    iget-object v0, p0, Ltx/b;->n:Lkotlin/jvm/internal/m;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lcom/squareup/wire/j;

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltx/b;->d:Lcom/squareup/wire/z;

    invoke-virtual {v0}, Lcom/squareup/wire/z;->a()Z

    move-result v0

    iget-object v1, p0, Ltx/b;->l:Lkotlin/jvm/internal/m;

    const/16 v2, 0x2e

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1}, Ltx/b;->c(Lcom/squareup/wire/j;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string p1, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    instance-of v4, v0, Ljava/util/List;

    if-eqz v4, :cond_1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected a list type, got "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object v0, p0, Ltx/b;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_8

    invoke-virtual {p0, p1}, Ltx/b;->c(Lcom/squareup/wire/j;)Ljava/lang/Object;

    move-result-object v0

    instance-of v4, v0, Ljava/util/Map;

    if-eqz v4, :cond_5

    instance-of v5, v0, Ld93/a;

    if-eqz v5, :cond_4

    instance-of v5, v0, Ld93/e;

    if-eqz v5, :cond_5

    :cond_4
    check-cast v0, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void

    :cond_5
    if-eqz v4, :cond_6

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    check-cast p2, Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v1, p1, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    :cond_7
    new-instance p1, Ljava/lang/ClassCastException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Expected a map type, got "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-interface {v1, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Lcom/squareup/wire/j;)Ljava/lang/Object;
    .locals 1

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ltx/b;->m:Lkotlin/jvm/internal/m;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
