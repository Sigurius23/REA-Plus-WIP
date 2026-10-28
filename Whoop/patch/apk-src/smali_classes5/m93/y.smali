.class public abstract Lm93/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm93/g;


# instance fields
.field public final a:Ljava/lang/reflect/Member;

.field public final b:Ljava/lang/reflect/Type;

.field public final c:Ljava/lang/Class;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm93/y;->a:Ljava/lang/reflect/Member;

    iput-object p2, p0, Lm93/y;->b:Ljava/lang/reflect/Type;

    iput-object p3, p0, Lm93/y;->c:Ljava/lang/Class;

    if-eqz p3, :cond_0

    new-instance p1, Lkotlin/jvm/internal/k0;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-virtual {p1, p3}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-virtual {p1, p4}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    iget-object p1, p1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/reflect/Type;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p4}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lm93/y;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lm93/y;->d:Ljava/util/List;

    return-object v0
.end method

.method public final bridge b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c([Ljava/lang/Object;)V
    .locals 3

    const-string v0, "args"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lge3/g;->z(Lm93/g;)I

    move-result v0

    array-length v1, p1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Callable expects "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lge3/g;->z(Lm93/g;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " arguments, but "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length p1, p1

    const-string v2, " were provided."

    invoke-static {v1, p1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lm93/y;->a:Ljava/lang/reflect/Member;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "An object member requires the object instance passed as the first argument."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getMember()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lm93/y;->a:Ljava/lang/reflect/Member;

    return-object v0
.end method

.method public final getReturnType()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, Lm93/y;->b:Ljava/lang/reflect/Type;

    return-object v0
.end method
