.class public abstract Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;
.super Lkotlin/reflect/jvm/internal/DescriptorKCallable;
.source "SourceFile"

# interfaces
.implements Lj93/g;
.implements Lj93/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlin/reflect/jvm/internal/DescriptorKProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Accessor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<PropertyType:",
        "Ljava/lang/Object;",
        "ReturnType:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable<",
        "TReturnType;>;",
        "Lj93/g;",
        "Lj93/r;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u0000*\u0006\u0008\u0001\u0010\u0001 \u0001*\u0006\u0008\u0002\u0010\u0002 \u00012\u0008\u0012\u0004\u0012\u00028\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u00042\u0008\u0012\u0004\u0012\u00028\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00088&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00188VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001aR\u0014\u0010\"\u001a\u00020\u001f8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;",
        "PropertyType",
        "ReturnType",
        "Lkotlin/reflect/jvm/internal/DescriptorKCallable;",
        "Lj93/r;",
        "Lj93/g;",
        "<init>",
        "()V",
        "Lkotlin/reflect/jvm/internal/DescriptorKProperty;",
        "getProperty",
        "()Lkotlin/reflect/jvm/internal/DescriptorKProperty;",
        "property",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "getContainer",
        "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "Lm93/g;",
        "getDefaultCaller",
        "()Lm93/g;",
        "defaultCaller",
        "",
        "getRawBoundReceiver",
        "()Ljava/lang/Object;",
        "rawBoundReceiver",
        "",
        "isInline",
        "()Z",
        "isExternal",
        "isOperator",
        "isInfix",
        "isSuspend",
        "Lr93/m0;",
        "getDescriptor",
        "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;",
        "descriptor",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lkotlin/reflect/jvm/internal/DescriptorKCallable;-><init>()V

    return-void
.end method


# virtual methods
.method public getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultCaller()Lm93/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract getDescriptor()Lr93/m0;
.end method

.method public abstract synthetic getName()Ljava/lang/String;
.end method

.method public abstract synthetic getProperty()Lj93/z;
.end method

.method public abstract getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/jvm/internal/DescriptorKProperty<",
            "TPropertyType;>;"
        }
    .end annotation
.end method

.method public getRawBoundReceiver()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getProperty()Lkotlin/reflect/jvm/internal/DescriptorKProperty;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty;->getRawBoundReceiver()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object v0

    check-cast v0, Lu93/k0;

    iget-boolean v0, v0, Lu93/k0;->G:Z

    return v0
.end method

.method public isInfix()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object v0

    check-cast v0, Lu93/k0;

    iget-boolean v0, v0, Lu93/k0;->J:Z

    return v0
.end method

.method public isOperator()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/DescriptorKProperty$Accessor;->getDescriptor()Lr93/m0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method
