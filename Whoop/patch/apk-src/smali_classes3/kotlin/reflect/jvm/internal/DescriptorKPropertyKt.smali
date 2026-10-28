.class public final Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\'\u0010\u0004\u001a\u0006\u0012\u0002\u0008\u00030\u0003*\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\"\u0010\u000c\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;",
        "",
        "isGetter",
        "Lm93/g;",
        "computeCallerForAccessor",
        "(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;",
        "Lr93/n0;",
        "isJvmFieldPropertyInCompanionObject",
        "(Lr93/n0;)Z",
        "",
        "getBoundReceiver",
        "(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;",
        "boundReceiver",
        "kotlin-reflection"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic access$computeCallerForAccessor(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;

    move-result-object p0

    return-object p0
.end method

.method private static final computeCallerForAccessor(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;Z)Lm93/g;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
            "**>;Z)",
            "Lm93/g;"
        }
    .end annotation

    sget-object v0, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->Companion:Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Companion;->getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection()Lyb3/p;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getSignature()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lm93/c0;->a:Lm93/c0;

    return-object p0

    :cond_0
    sget-object v0, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->INSTANCE:Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;->mapPropertySignature(Lr93/n0;)Lkotlin/reflect/jvm/internal/JvmPropertySignature;

    move-result-object v0

    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    const/4 v2, 0x0

    if-eqz v1, :cond_e

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getSignature()Lta3/f;

    move-result-object v1

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Lta3/f;->i()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v1, v1, Lta3/f;->E:Lta3/d;

    goto :goto_0

    :cond_1
    move-object v1, v3

    goto :goto_0

    :cond_2
    iget v4, v1, Lta3/f;->x:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_1

    iget-object v1, v1, Lta3/f;->F:Lta3/d;

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getNameResolver()Lsa3/f;

    move-result-object v4

    iget v5, v1, Lta3/d;->y:I

    invoke-interface {v4, v5}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;->getNameResolver()Lsa3/f;

    move-result-object v0

    iget v1, v1, Lta3/d;->z:I

    invoke-interface {v0, v1}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findMethodBySignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v3

    :cond_3
    if-nez v3, :cond_8

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-static {v0}, Lya3/h;->d(Lr93/b1;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-interface {v0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v0

    sget-object v1, Lr93/q;->d:Lr93/p;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object p1

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object p1

    invoke-static {p1}, Lhg3/i;->p0(Lr93/k;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-static {p1, v0}, Lhg3/i;->R(Ljava/lang/Class;Lr93/c;)Ljava/lang/reflect/Method;

    move-result-object p1

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Lm93/z;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm93/z;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_4
    new-instance v0, Lm93/a0;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm93/b0;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    goto/16 :goto_3

    :cond_5
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Underlying property of inline class "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " should have a field"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getJavaField()Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p0, p1, v0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$computeFieldCaller(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;ZLjava/lang/reflect/Field;)Lm93/y;

    move-result-object v0

    goto/16 :goto_3

    :cond_7
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No accessors or field is found for property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result p1

    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result p1

    if-nez p1, :cond_a

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lm93/s;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v3, v0}, Lm93/s;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    :goto_1
    move-object v0, p1

    goto/16 :goto_3

    :cond_9
    new-instance p1, Lm93/w;

    const/4 v0, 0x0

    invoke-direct {p1, v3, v0}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    goto :goto_1

    :cond_a
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isJvmStaticProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_b

    new-instance p1, Lm93/t;

    invoke-direct {p1, v3}, Lm93/t;-><init>(Ljava/lang/reflect/Method;)V

    goto :goto_1

    :cond_b
    new-instance p1, Lm93/w;

    const/4 v0, 0x1

    invoke-direct {p1, v3, v0}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    goto :goto_1

    :cond_c
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_d

    new-instance p1, Lm93/u;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p1, v3, v2, v0}, Lm93/u;-><init>(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V

    goto :goto_1

    :cond_d
    new-instance p1, Lm93/w;

    const/4 v0, 0x2

    invoke-direct {p1, v3, v0}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    goto :goto_1

    :cond_e
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;

    if-eqz v1, :cond_f

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;->getField()Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$computeFieldCaller(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;ZLjava/lang/reflect/Field;)Lm93/y;

    move-result-object v0

    goto :goto_3

    :cond_f
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;

    if-eqz v1, :cond_13

    if-eqz p1, :cond_10

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;->getGetterMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    goto :goto_2

    :cond_10
    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;->getSetterMethod()Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_12

    :goto_2
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_11

    new-instance v0, Lm93/s;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lm93/s;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    goto :goto_3

    :cond_11
    new-instance v0, Lm93/w;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    :goto_3
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object p0

    invoke-static {v0, p0, v2}, Lhg3/i;->B(Lm93/g;Lr93/c;Z)Lm93/g;

    move-result-object p0

    return-object p0

    :cond_12
    new-instance p0, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "No source found for setter of Java method property: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;->getGetterMethod()Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_13
    instance-of v1, v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;

    if-eqz v1, :cond_18

    if-eqz p1, :cond_14

    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;->getGetterSignature()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object p1

    goto :goto_4

    :cond_14
    check-cast v0, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;->getSetterSignature()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;

    move-result-object p1

    if-eqz p1, :cond_17

    :goto_4
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;->getMethodDesc()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;->findMethodBySignature(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result v0

    if-eqz v0, :cond_15

    new-instance v0, Lm93/s;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {v0, p1, p0}, Lm93/s;-><init>(Ljava/lang/reflect/Method;Ljava/lang/Object;)V

    return-object v0

    :cond_15
    new-instance p0, Lm93/w;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lm93/w;-><init>(Ljava/lang/reflect/Method;I)V

    return-object p0

    :cond_16
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No accessor found for property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_17
    new-instance p1, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No setter found for property "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lkotlin/reflect/jvm/internal/KotlinReflectionInternalError;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final computeCallerForAccessor$computeFieldCaller(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;ZLjava/lang/reflect/Field;)Lm93/y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
            "**>;Z",
            "Ljava/lang/reflect/Field;",
            ")",
            "Lm93/y;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->isJvmFieldPropertyInCompanionObject(Lr93/n0;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_6

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isJvmStaticProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_2

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lm93/l;

    invoke-direct {p0, p2, v2}, Lm93/n;-><init>(Ljava/lang/reflect/Field;Z)V

    return-object p0

    :cond_1
    new-instance p0, Lm93/m;

    const/4 p1, 0x1

    invoke-direct {p0, p2, v1, p1}, Lm93/m;-><init>(Ljava/lang/reflect/Field;ZI)V

    return-object p0

    :cond_2
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Lm93/p;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result p0

    invoke-direct {p1, p2, p0, v2}, Lm93/r;-><init>(Ljava/lang/reflect/Field;ZZ)V

    return-object p1

    :cond_3
    new-instance p1, Lm93/q;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result p0

    const/4 v0, 0x1

    invoke-direct {p1, p2, p0, v1, v0}, Lm93/q;-><init>(Ljava/lang/reflect/Field;ZZI)V

    return-object p1

    :cond_4
    if-eqz p1, :cond_5

    new-instance p0, Lm93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p2, v2, p1}, Lm93/m;-><init>(Ljava/lang/reflect/Field;ZI)V

    return-object p0

    :cond_5
    new-instance p1, Lm93/q;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result p0

    const/4 v0, 0x2

    invoke-direct {p1, p2, p0, v2, v0}, Lm93/q;-><init>(Ljava/lang/reflect/Field;ZZI)V

    return-object p1

    :cond_6
    :goto_0
    const-string v0, "field"

    if-eqz p1, :cond_8

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lm93/k;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, p0}, Lm93/k;-><init>(Ljava/lang/reflect/Field;Ljava/lang/Object;)V

    return-object p1

    :cond_7
    new-instance p0, Lm93/m;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-direct {p0, p2, v1, p1}, Lm93/m;-><init>(Ljava/lang/reflect/Field;ZI)V

    return-object p0

    :cond_8
    invoke-static {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallableKt;->isBound(Lkotlin/reflect/jvm/internal/ReflectKCallable;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lm93/o;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result v0

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p2, v0, p0}, Lm93/o;-><init>(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V

    return-object p1

    :cond_9
    new-instance p1, Lm93/q;

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/DescriptorKPropertyKt;->computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z

    move-result p0

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p1, p2, p0, v1, v0}, Lm93/q;-><init>(Ljava/lang/reflect/Field;ZZI)V

    return-object p1
.end method

.method private static final computeCallerForAccessor$isJvmStaticProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
            "**>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object p0

    invoke-interface {p0}, Ls93/a;->getAnnotations()Ls93/i;

    move-result-object p0

    invoke-static {}, Lkotlin/reflect/jvm/internal/UtilKt;->getJVM_STATIC()Lva3/e;

    move-result-object v0

    invoke-interface {p0, v0}, Ls93/i;->J(Lva3/e;)Z

    move-result p0

    return p0
.end method

.method private static final computeCallerForAccessor$isNotNullProperty(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
            "**>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getDescriptor()Lr93/n0;

    move-result-object p0

    invoke-interface {p0}, Lr93/z0;->getType()Llb3/y;

    move-result-object p0

    invoke-static {p0}, Llb3/d1;->e(Llb3/y;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static final getBoundReceiver(Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor<",
            "**>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object p0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getBoundReceiver()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final isJvmFieldPropertyInCompanionObject(Lr93/n0;)Z
    .locals 2

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    const-string v1, "getContainingDeclaration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lya3/f;->k(Lr93/k;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lr93/k;->g()Lr93/k;

    move-result-object v0

    sget-object v1, Lr93/f;->x:Lr93/f;

    invoke-static {v0, v1}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lr93/f;->E:Lr93/f;

    invoke-static {v0, v1}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    instance-of v0, p0, Ljb3/s;

    if-eqz v0, :cond_3

    check-cast p0, Ljb3/s;

    iget-object p0, p0, Ljb3/s;->b0:Lqa3/k0;

    invoke-static {p0}, Lua3/g;->d(Lqa3/k0;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method
