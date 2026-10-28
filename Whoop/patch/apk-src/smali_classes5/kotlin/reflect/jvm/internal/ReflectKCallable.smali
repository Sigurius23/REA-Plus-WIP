.class public interface abstract Lkotlin/reflect/jvm/internal/ReflectKCallable;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj93/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0002J3\u0010\t\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u000c\u0010\u0008\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u0007H&\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00128&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\u0008\u00030\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00168&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0018\u00a8\u0006\u001c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/ReflectKCallable;",
        "R",
        "Lj93/c;",
        "",
        "Lj93/q;",
        "",
        "args",
        "Lq83/d;",
        "continuationArgument",
        "callDefaultMethod",
        "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "getContainer",
        "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;",
        "container",
        "getRawBoundReceiver",
        "()Ljava/lang/Object;",
        "rawBoundReceiver",
        "",
        "getReceiverParameters",
        "()Ljava/util/List;",
        "receiverParameters",
        "Lm93/g;",
        "getCaller",
        "()Lm93/g;",
        "caller",
        "getDefaultCaller",
        "defaultCaller",
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


# virtual methods
.method public varargs abstract synthetic call([Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract synthetic callBy(Ljava/util/Map;)Ljava/lang/Object;
.end method

.method public abstract callDefaultMethod(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/q;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lq83/d<",
            "*>;)TR;"
        }
    .end annotation
.end method

.method public abstract synthetic getAnnotations()Ljava/util/List;
.end method

.method public abstract getCaller()Lm93/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation
.end method

.method public abstract getContainer()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;
.end method

.method public abstract getDefaultCaller()Lm93/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm93/g;"
        }
    .end annotation
.end method

.method public abstract synthetic getName()Ljava/lang/String;
.end method

.method public abstract synthetic getParameters()Ljava/util/List;
.end method

.method public abstract getRawBoundReceiver()Ljava/lang/Object;
.end method

.method public abstract getReceiverParameters()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/q;",
            ">;"
        }
    .end annotation
.end method

.method public abstract synthetic getReturnType()Lj93/a0;
.end method

.method public abstract synthetic getTypeParameters()Ljava/util/List;
.end method

.method public abstract synthetic getVisibility()Lj93/f0;
.end method

.method public abstract synthetic isAbstract()Z
.end method

.method public abstract synthetic isFinal()Z
.end method

.method public abstract synthetic isOpen()Z
.end method

.method public abstract synthetic isSuspend()Z
.end method
