.class public final Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\n\u0010\u001a\u001a\u0006\u0012\u0002\u0008\u00030\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001e\u0010#\u001a\u0004\u0018\u00010 *\u0006\u0012\u0002\u0008\u00030\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;",
        "",
        "<init>",
        "()V",
        "Lr93/w;",
        "descriptor",
        "",
        "isKnownBuiltInFunction",
        "(Lr93/w;)Z",
        "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;",
        "mapJvmFunctionSignature",
        "(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;",
        "Lr93/c;",
        "",
        "mapName",
        "(Lr93/c;)Ljava/lang/String;",
        "possiblySubstitutedFunction",
        "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;",
        "mapSignature",
        "(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;",
        "Lr93/n0;",
        "possiblyOverriddenProperty",
        "Lkotlin/reflect/jvm/internal/JvmPropertySignature;",
        "mapPropertySignature",
        "(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;",
        "Ljava/lang/Class;",
        "klass",
        "Lva3/c;",
        "mapJvmClassToKotlinClassId",
        "(Ljava/lang/Class;)Lva3/c;",
        "JAVA_LANG_VOID",
        "Lva3/c;",
        "Lo93/j;",
        "getPrimitiveType",
        "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;",
        "primitiveType",
        "kotlin-reflection"
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
.field public static final INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

.field private static final JAVA_LANG_VOID:Lva3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-direct {v0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    new-instance v0, Lva3/e;

    const-string v1, "java.lang.Void"

    invoke-direct {v0, v1}, Lva3/e;-><init>(Ljava/lang/String;)V

    new-instance v1, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v2

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v1, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->JAVA_LANG_VOID:Lva3/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getPrimitiveType(Ljava/lang/Class;)Lo93/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lo93/j;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ldb3/c;->b(Ljava/lang/String;)Ldb3/c;

    move-result-object p1

    invoke-virtual {p1}, Ldb3/c;->d()Lo93/j;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final isKnownBuiltInFunction(Lr93/w;)Z
    .locals 4

    if-eqz p1, :cond_3

    move-object v0, p1

    check-cast v0, Lu93/n;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    sget-object v2, Lo93/n;->c:Lva3/h;

    invoke-virtual {v1, v2}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lya3/p;->m(Lr93/w;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    sget-object v3, Lo93/n;->a:Lva3/h;

    invoke-virtual {v1, v3}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lya3/p;->m(Lr93/w;)Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    return v2

    :cond_1
    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    sget-object v1, Lq93/a;->b:Lva3/h;

    sget-object v1, Lq93/a;->b:Lva3/h;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1

    :cond_3
    const/16 p1, 0x1c

    invoke-static {p1}, Lya3/p;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method private final mapJvmFunctionSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;
    .locals 4

    new-instance v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    new-instance v1, Lua3/e;

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapName(Lr93/c;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {p1, v3}, Lio/sentry/config/a;->o(Lr93/w;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Lua3/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;-><init>(Lua3/e;)V

    return-object v0
.end method

.method private final mapName(Lr93/c;)Ljava/lang/String;
    .locals 2

    invoke-static {p1}, Lse/g;->z(Lr93/c;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    instance-of v0, p1, Lr93/o0;

    const-string v1, "asString(...)"

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p1

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfa3/w;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lr93/p0;

    if-eqz v0, :cond_1

    invoke-static {p1}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p1

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lfa3/w;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object p1

    invoke-virtual {p1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    return-object v0
.end method


# virtual methods
.method public final mapJvmClassToKotlinClassId(Ljava/lang/Class;)Lva3/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lva3/c;"
        }
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    const-string v0, "getComponentType(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->getPrimitiveType(Ljava/lang/Class;)Lo93/j;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lva3/c;

    sget-object v1, Lo93/n;->k:Lva3/e;

    iget-object p1, p1, Lo93/j;->x:Lva3/h;

    invoke-direct {v0, v1, p1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0

    :cond_0
    sget-object p1, Lo93/m;->g:Lva3/f;

    invoke-virtual {p1}, Lva3/f;->i()Lva3/e;

    move-result-object p1

    new-instance v0, Lva3/c;

    invoke-virtual {p1}, Lva3/e;->b()Lva3/e;

    move-result-object v1

    iget-object p1, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {p1}, Lva3/f;->g()Lva3/h;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object v0

    :cond_1
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->JAVA_LANG_VOID:Lva3/c;

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->getPrimitiveType(Ljava/lang/Class;)Lo93/j;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance p1, Lva3/c;

    sget-object v1, Lo93/n;->k:Lva3/e;

    iget-object v0, v0, Lo93/j;->w:Lva3/h;

    invoke-direct {p1, v1, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    return-object p1

    :cond_3
    invoke-static {p1}, Lx93/c;->a(Ljava/lang/Class;)Lva3/c;

    move-result-object p1

    iget-boolean v0, p1, Lva3/c;->c:Z

    if-nez v0, :cond_4

    sget-object v0, Lq93/d;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lva3/c;->a()Lva3/e;

    move-result-object v0

    const-string v1, "fqName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lq93/d;->h:Ljava/util/HashMap;

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lva3/c;

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method

.method public final mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;
    .locals 6

    const-string v0, "possiblyOverriddenProperty"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lya3/f;->r(Lr93/c;)Lr93/c;

    move-result-object p1

    check-cast p1, Lr93/n0;

    invoke-interface {p1}, Lr93/n0;->a()Lr93/n0;

    move-result-object v1

    const-string p1, "getOriginal(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, v1, Ljb3/s;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v1

    check-cast p1, Ljb3/s;

    iget-object v2, p1, Ljb3/s;->b0:Lqa3/k0;

    sget-object v3, Lta3/l;->d:Lwa3/o;

    const-string v4, "propertySignature"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lta3/f;

    if-eqz v3, :cond_a

    new-instance v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    iget-object v4, p1, Ljb3/s;->c0:Lsa3/f;

    iget-object v5, p1, Ljb3/s;->d0:Lsa3/h;

    invoke-direct/range {v0 .. v5}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;-><init>(Lr93/n0;Lqa3/k0;Lta3/f;Lsa3/f;Lsa3/h;)V

    return-object v0

    :cond_0
    instance-of p1, v1, Lha3/f;

    if-eqz p1, :cond_a

    move-object p1, v1

    check-cast p1, Lha3/f;

    invoke-virtual {p1}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v2

    instance-of v3, v2, Lw93/f;

    if-eqz v3, :cond_1

    check-cast v2, Lw93/f;

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_2

    iget-object v2, v2, Lw93/f;->w:Lx93/r;

    goto :goto_1

    :cond_2
    move-object v2, v0

    :goto_1
    instance-of v3, v2, Lx93/t;

    if-eqz v3, :cond_3

    new-instance p1, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;

    check-cast v2, Lx93/t;

    invoke-virtual {v2}, Lx93/t;->j()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;-><init>(Ljava/lang/reflect/Field;)V

    return-object p1

    :cond_3
    instance-of v3, v2, Lx93/w;

    if-eqz v3, :cond_9

    new-instance v1, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;

    check-cast v2, Lx93/w;

    invoke-virtual {v2}, Lx93/w;->k()Ljava/lang/reflect/Method;

    move-result-object v2

    iget-object p1, p1, Lu93/m0;->Y:Lr93/p0;

    if-eqz p1, :cond_4

    check-cast p1, Lu93/o;

    invoke-virtual {p1}, Lu93/o;->getSource()Lr93/s0;

    move-result-object p1

    goto :goto_2

    :cond_4
    move-object p1, v0

    :goto_2
    instance-of v3, p1, Lw93/f;

    if-eqz v3, :cond_5

    check-cast p1, Lw93/f;

    goto :goto_3

    :cond_5
    move-object p1, v0

    :goto_3
    if-eqz p1, :cond_6

    iget-object p1, p1, Lw93/f;->w:Lx93/r;

    goto :goto_4

    :cond_6
    move-object p1, v0

    :goto_4
    instance-of v3, p1, Lx93/w;

    if-eqz v3, :cond_7

    check-cast p1, Lx93/w;

    goto :goto_5

    :cond_7
    move-object p1, v0

    :goto_5
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lx93/w;->k()Ljava/lang/reflect/Method;

    move-result-object v0

    :cond_8
    invoke-direct {v1, v2, v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    return-object v1

    :cond_9
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Incorrect resolution sequence for Java field "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " (source = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-interface {v1}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapJvmFunctionSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object p1

    invoke-interface {v1}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-direct {p0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapJvmFunctionSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object v0

    :cond_b
    new-instance v1, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;

    invoke-direct {v1, p1, v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;-><init>(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V

    return-object v1
.end method

.method public final mapSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature;
    .locals 8

    const-string v0, "possiblySubstitutedFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lya3/f;->r(Lr93/c;)Lr93/c;

    move-result-object v0

    check-cast v0, Lr93/w;

    invoke-interface {v0}, Lr93/w;->a()Lr93/w;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Ljb3/b;

    if-eqz v1, :cond_9

    move-object v1, v0

    check-cast v1, Ljb3/k;

    invoke-interface {v1}, Ljb3/k;->R()Lwa3/v;

    move-result-object v2

    instance-of v3, v2, Lqa3/c0;

    if-eqz v3, :cond_0

    sget-object v3, Lua3/g;->a:Lwa3/i;

    move-object v3, v2

    check-cast v3, Lqa3/c0;

    invoke-interface {v1}, Ljb3/k;->w()Lsa3/f;

    move-result-object v4

    invoke-interface {v1}, Ljb3/k;->t()Lsa3/h;

    move-result-object v5

    invoke-static {v3, v4, v5}, Lua3/g;->c(Lqa3/c0;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance p1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-direct {p1, v3}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;-><init>(Lua3/e;)V

    return-object p1

    :cond_0
    instance-of v3, v2, Lqa3/o;

    if-eqz v3, :cond_8

    sget-object v3, Lua3/g;->a:Lwa3/i;

    check-cast v2, Lqa3/o;

    invoke-interface {v1}, Ljb3/k;->w()Lsa3/f;

    move-result-object v3

    invoke-interface {v1}, Ljb3/k;->t()Lsa3/h;

    move-result-object v1

    invoke-static {v2, v3, v1}, Lua3/g;->a(Lqa3/o;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object v1

    if-eqz v1, :cond_8

    iget-object v0, v1, Lua3/e;->x:Ljava/lang/String;

    iget-object v2, v1, Lua3/e;->y:Ljava/lang/String;

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    const-string v4, "getContainingDeclaration(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lya3/h;->b(Lr93/k;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance p1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;-><init>(Lua3/e;)V

    return-object p1

    :cond_1
    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lya3/h;->c(Lr93/k;)Z

    move-result v3

    if-eqz v3, :cond_7

    check-cast p1, Lr93/j;

    invoke-interface {p1}, Lr93/j;->O()Z

    move-result v3

    const/4 v4, 0x0

    const-string v5, ")V"

    const-string v6, "constructor-impl"

    const-string v7, "Invalid signature: "

    if-eqz v3, :cond_3

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v2, v5, v4}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Lr93/j;->P()Lr93/e;

    move-result-object p1

    const-string v3, "getConstructedClass(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcb3/e;->f(Lr93/h;)Lva3/c;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lva3/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lua3/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, v5, v4}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "V"

    invoke-static {v2, v3}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "desc"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lua3/e;

    invoke-direct {v1, v0, p1}, Lua3/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-static {v2, p1, v4}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    new-instance p1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;-><init>(Lua3/e;)V

    return-object p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance p1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;

    invoke-direct {p1, v1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;-><init>(Lua3/e;)V

    return-object p1

    :cond_8
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapJvmFunctionSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object p1

    return-object p1

    :cond_9
    instance-of p1, v0, Lha3/e;

    const/4 v1, 0x0

    if-eqz p1, :cond_e

    move-object p1, v0

    check-cast p1, Lha3/e;

    invoke-virtual {p1}, Lu93/o;->getSource()Lr93/s0;

    move-result-object p1

    instance-of v2, p1, Lw93/f;

    if-eqz v2, :cond_a

    check-cast p1, Lw93/f;

    goto :goto_1

    :cond_a
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_b

    iget-object p1, p1, Lw93/f;->w:Lx93/r;

    goto :goto_2

    :cond_b
    move-object p1, v1

    :goto_2
    instance-of v2, p1, Lx93/w;

    if-eqz v2, :cond_c

    move-object v1, p1

    check-cast v1, Lx93/w;

    :cond_c
    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lx93/w;->k()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;-><init>(Ljava/lang/reflect/Method;)V

    return-object v0

    :cond_d
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Incorrect resolution sequence for Java method "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    instance-of p1, v0, Lha3/b;

    const/16 v2, 0x29

    const-string v3, " ("

    if-eqz p1, :cond_13

    move-object p1, v0

    check-cast p1, Lha3/b;

    invoke-virtual {p1}, Lu93/o;->getSource()Lr93/s0;

    move-result-object p1

    instance-of v4, p1, Lw93/f;

    if-eqz v4, :cond_f

    check-cast p1, Lw93/f;

    goto :goto_3

    :cond_f
    move-object p1, v1

    :goto_3
    if-eqz p1, :cond_10

    iget-object v1, p1, Lw93/f;->w:Lx93/r;

    :cond_10
    instance-of p1, v1, Lx93/q;

    if-eqz p1, :cond_11

    new-instance p1, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;

    check-cast v1, Lx93/q;

    invoke-virtual {v1}, Lx93/q;->j()Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    return-object p1

    :cond_11
    instance-of p1, v1, Lx93/n;

    if-eqz p1, :cond_12

    move-object p1, v1

    check-cast p1, Lx93/n;

    iget-object p1, p1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isAnnotation()Z

    move-result v4

    if-eqz v4, :cond_12

    new-instance v0, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;

    invoke-direct {v0, p1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_12
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Incorrect resolution sequence for Java constructor "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_13
    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->isKnownBuiltInFunction(Lr93/w;)Z

    move-result p1

    if-eqz p1, :cond_14

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapJvmFunctionSignature(Lr93/w;)Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object p1

    return-object p1

    :cond_14
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Unknown origin of "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1
.end method
