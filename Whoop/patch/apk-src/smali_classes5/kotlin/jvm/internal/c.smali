.class public abstract Lkotlin/jvm/internal/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/c;
.implements Ljava/io/Serializable;


# static fields
.field public static final NO_RECEIVER:Ljava/lang/Object;


# instance fields
.field private final isTopLevel:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/Class;

.field protected final receiver:Ljava/lang/Object;

.field private transient reflected:Lj93/c;

.field private final signature:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/b;->w:Lkotlin/jvm/internal/b;

    sput-object v0, Lkotlin/jvm/internal/c;->NO_RECEIVER:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    iput-object p2, p0, Lkotlin/jvm/internal/c;->owner:Ljava/lang/Class;

    iput-object p3, p0, Lkotlin/jvm/internal/c;->name:Ljava/lang/String;

    iput-object p4, p0, Lkotlin/jvm/internal/c;->signature:Ljava/lang/String;

    iput-boolean p5, p0, Lkotlin/jvm/internal/c;->isTopLevel:Z

    return-void
.end method


# virtual methods
.method public varargs call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lj93/c;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public callBy(Ljava/util/Map;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0, p1}, Lj93/c;->callBy(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public compute()Lj93/c;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->reflected:Lj93/c;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->computeReflected()Lj93/c;

    move-result-object v0

    iput-object v0, p0, Lkotlin/jvm/internal/c;->reflected:Lj93/c;

    :cond_0
    return-object v0
.end method

.method public abstract computeReflected()Lj93/c;
.end method

.method public getAnnotations()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/annotation/Annotation;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/b;->getAnnotations()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getBoundReceiver()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOwner()Lj93/f;
    .locals 3

    iget-object v0, p0, Lkotlin/jvm/internal/c;->owner:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-boolean v1, p0, Lkotlin/jvm/internal/c;->isTopLevel:Z

    if-eqz v1, :cond_1

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinPackage(Ljava/lang/Class;Ljava/lang/String;)Lj93/f;

    move-result-object v0

    return-object v0

    :cond_1
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    return-object v0
.end method

.method public getParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/q;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->getParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public abstract getReflected()Lj93/c;
.end method

.method public getReturnType()Lj93/a0;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->getReturnType()Lj93/a0;

    move-result-object v0

    return-object v0
.end method

.method public getSignature()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/c;->signature:Ljava/lang/String;

    return-object v0
.end method

.method public getTypeParameters()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj93/b0;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getVisibility()Lj93/f0;
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->getVisibility()Lj93/f0;

    move-result-object v0

    return-object v0
.end method

.method public isAbstract()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->isAbstract()Z

    move-result v0

    return v0
.end method

.method public isFinal()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->isFinal()Z

    move-result v0

    return v0
.end method

.method public isOpen()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->isOpen()Z

    move-result v0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    invoke-virtual {p0}, Lkotlin/jvm/internal/c;->getReflected()Lj93/c;

    move-result-object v0

    invoke-interface {v0}, Lj93/c;->isSuspend()Z

    move-result v0

    return v0
.end method
