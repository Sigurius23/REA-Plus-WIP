.class public final Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;
.super Lkotlin/reflect/jvm/internal/JvmPropertySignature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/JvmPropertySignature;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "KotlinProperty"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;",
        "Lkotlin/reflect/jvm/internal/JvmPropertySignature;",
        "Lr93/n0;",
        "descriptor",
        "Lqa3/k0;",
        "proto",
        "Lta3/f;",
        "signature",
        "Lsa3/f;",
        "nameResolver",
        "Lsa3/h;",
        "typeTable",
        "<init>",
        "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V",
        "",
        "getManglingSuffix",
        "()Ljava/lang/String;",
        "asString",
        "Lr93/n0;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;",
        "Lqa3/k0;",
        "getProto",
        "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;",
        "Lta3/f;",
        "getSignature",
        "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;",
        "Lsa3/f;",
        "getNameResolver",
        "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;",
        "Lsa3/h;",
        "getTypeTable",
        "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;",
        "string",
        "Ljava/lang/String;",
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


# instance fields
.field private final descriptor:Lr93/n0;

.field private final nameResolver:Lsa3/f;

.field private final proto:Lqa3/k0;

.field private final signature:Lta3/f;

.field private final string:Ljava/lang/String;

.field private final typeTable:Lsa3/h;


# direct methods
.method public constructor <init>(Lr93/n0;Lqa3/k0;Lta3/f;Lsa3/f;Lsa3/h;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->proto:Lqa3/k0;

    iput-object p3, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->signature:Lta3/f;

    iput-object p4, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->nameResolver:Lsa3/f;

    iput-object p5, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->typeTable:Lsa3/h;

    invoke-virtual {p3}, Lta3/f;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p3, Lta3/f;->E:Lta3/d;

    iget p1, p1, Lta3/d;->y:I

    invoke-interface {p4, p1}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p3, Lta3/f;->E:Lta3/d;

    iget p2, p2, Lta3/d;->z:I

    invoke-interface {p4, p2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p3, 0x1

    invoke-static {p2, p4, p5, p3}, Lua3/g;->b(Lqa3/k0;Lsa3/f;Lsa3/h;Z)Lua3/d;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p1, p2, Lua3/d;->x:Ljava/lang/String;

    iget-object p2, p2, Lua3/d;->y:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lfa3/w;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getManglingSuffix()Ljava/lang/String;

    move-result-object p1

    const-string p4, "()"

    invoke-static {p3, p1, p4, p2}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->string:Ljava/lang/String;

    return-void

    :cond_1
    new-instance p2, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "No field signature for property: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method private final getManglingSuffix()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    invoke-interface {v1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v1

    sget-object v2, Lr93/q;->d:Lr93/p;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "$"

    if-eqz v1, :cond_1

    instance-of v1, v0, Ljb3/h;

    if-eqz v1, :cond_1

    check-cast v0, Ljb3/h;

    iget-object v0, v0, Ljb3/h;->E:Lqa3/k;

    sget-object v1, Lta3/l;->g:Lwa3/o;

    const-string v3, "classModuleName"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->nameResolver:Lsa3/f;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-interface {v1, v0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "main"

    :goto_0
    invoke-static {v0}, Lva3/i;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    invoke-interface {v1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v1

    sget-object v3, Lr93/q;->a:Lr93/p;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    instance-of v0, v0, Lr93/g0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljb3/s;

    iget-object v0, v0, Ljb3/s;->f0:Ljb3/j;

    instance-of v1, v0, Loa3/h;

    if-eqz v1, :cond_2

    check-cast v0, Loa3/h;

    invoke-virtual {v0}, Loa3/h;->b()Ldb3/b;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Loa3/h;->d()Lva3/h;

    move-result-object v0

    invoke-virtual {v0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    const-string v0, ""

    return-object v0
.end method


# virtual methods
.method public asString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->string:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptor()Lr93/n0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->descriptor:Lr93/n0;

    return-object v0
.end method

.method public final getNameResolver()Lsa3/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->nameResolver:Lsa3/f;

    return-object v0
.end method

.method public final getProto()Lqa3/k0;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->proto:Lqa3/k0;

    return-object v0
.end method

.method public final getSignature()Lta3/f;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->signature:Lta3/f;

    return-object v0
.end method

.method public final getTypeTable()Lsa3/h;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->typeTable:Lsa3/h;

    return-object v0
.end method
