.class public final Lx93/t;
.super Lx93/v;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/reflect/Field;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Field;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx93/t;->a:Ljava/lang/reflect/Field;

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lx93/t;->a:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final j()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lx93/t;->a:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final k()Lma3/e;
    .locals 4

    iget-object v0, p0, Lx93/t;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-string v1, "getGenericType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Ljava/lang/Class;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v0, Lx93/y;

    invoke-direct {v0, v2}, Lx93/y;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_0
    instance-of v2, v0, Ljava/lang/reflect/GenericArrayType;

    if-nez v2, :cond_3

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_2

    new-instance v1, Lx93/d0;

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-direct {v1, v0}, Lx93/d0;-><init>(Ljava/lang/reflect/WildcardType;)V

    return-object v1

    :cond_2
    new-instance v1, Lx93/p;

    invoke-direct {v1, v0}, Lx93/p;-><init>(Ljava/lang/reflect/Type;)V

    return-object v1

    :cond_3
    :goto_0
    new-instance v1, Lx93/h;

    invoke-direct {v1, v0}, Lx93/h;-><init>(Ljava/lang/reflect/Type;)V

    return-object v1
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lx93/t;->a:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->isEnumConstant()Z

    move-result v0

    return v0
.end method
