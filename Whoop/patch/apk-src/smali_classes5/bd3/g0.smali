.class public final Lbd3/g0;
.super Lzc3/a;
.source "SourceFile"

# interfaces
.implements Lad3/p;


# instance fields
.field public final a:Lbd3/k;

.field public final b:Lad3/c;

.field public final c:Lbd3/l0;

.field public final d:[Lad3/p;

.field public final e:Lcd3/f;

.field public final f:Lad3/i;

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lbd3/k;Lad3/c;Lbd3/l0;[Lad3/p;)V
    .locals 1

    const-string v0, "composer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd3/g0;->a:Lbd3/k;

    iput-object p2, p0, Lbd3/g0;->b:Lad3/c;

    iput-object p3, p0, Lbd3/g0;->c:Lbd3/l0;

    iput-object p4, p0, Lbd3/g0;->d:[Lad3/p;

    iget-object p1, p2, Lad3/c;->b:Lcd3/f;

    iput-object p1, p0, Lbd3/g0;->e:Lcd3/f;

    iget-object p1, p2, Lad3/c;->a:Lad3/i;

    iput-object p1, p0, Lbd3/g0;->f:Lad3/i;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p4, :cond_1

    aget-object p2, p4, p1

    if-nez p2, :cond_0

    if-eq p2, p0, :cond_1

    :cond_0
    aput-object p0, p4, p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lad3/c;
    .locals 1

    iget-object v0, p0, Lbd3/g0;->b:Lad3/c;

    return-object v0
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/c;
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/g0;->b:Lad3/c;

    invoke-static {v0, p1}, Lbd3/q;->u(Lad3/c;Lyc3/g;)Lbd3/l0;

    move-result-object v1

    iget-char v2, v1, Lbd3/l0;->w:C

    iget-object v3, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v3, v2}, Lbd3/k;->g(C)V

    invoke-virtual {v3}, Lbd3/k;->a()V

    iget-object v2, p0, Lbd3/g0;->h:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-object v4, p0, Lbd3/g0;->i:Ljava/lang/String;

    if-nez v4, :cond_0

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v4

    :cond_0
    invoke-virtual {v3}, Lbd3/k;->b()V

    invoke-virtual {p0, v2}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    const/16 p1, 0x3a

    invoke-virtual {v3, p1}, Lbd3/k;->g(C)V

    invoke-virtual {v3}, Lbd3/k;->n()V

    invoke-virtual {p0, v4}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lbd3/g0;->h:Ljava/lang/String;

    iput-object p1, p0, Lbd3/g0;->i:Ljava/lang/String;

    :cond_1
    iget-object p1, p0, Lbd3/g0;->c:Lbd3/l0;

    if-ne p1, v1, :cond_2

    return-object p0

    :cond_2
    iget-object p1, p0, Lbd3/g0;->d:[Lad3/p;

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget-object v2, p1, v2

    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    new-instance v2, Lbd3/g0;

    invoke-direct {v2, v3, v0, v1, p1}, Lbd3/g0;-><init>(Lbd3/k;Lad3/c;Lbd3/l0;[Lad3/p;)V

    return-object v2
.end method

.method public final c(Lkotlinx/serialization/json/JsonElement;)V
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/g0;->h:Ljava/lang/String;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbd3/g0;->i:Ljava/lang/String;

    invoke-static {v0, p1}, Lbd3/q;->w(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    sget-object v0, Lad3/n;->a:Lad3/n;

    invoke-virtual {p0, v0, p1}, Lbd3/g0;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeBoolean(Z)V
    .locals 1

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    iget-object v0, v0, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbd3/v;->p(Ljava/lang/String;)V

    return-void
.end method

.method public final encodeByte(B)V
    .locals 1

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v0, p1}, Lbd3/k;->f(B)V

    return-void
.end method

.method public final encodeChar(C)V
    .locals 0

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void
.end method

.method public final encodeDouble(D)V
    .locals 6

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    iget-object v1, p0, Lbd3/g0;->a:Lbd3/k;

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbd3/v;->p(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lbd3/g0;->f:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->j:Z

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide v4, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iget-object p2, v1, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p2, Lbd3/v;

    invoke-virtual {p2}, Lbd3/v;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lbd3/q;->a(Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final encodeElement(Lyc3/g;I)Z
    .locals 7

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/g0;->c:Lbd3/l0;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const/16 v1, 0x2c

    iget-object v2, p0, Lbd3/g0;->a:Lbd3/k;

    const/4 v3, 0x1

    if-eq v0, v3, :cond_7

    const/16 v4, 0x3a

    const/4 v5, 0x0

    const/4 v6, 0x2

    if-eq v0, v6, :cond_4

    const/4 v6, 0x3

    if-eq v0, v6, :cond_1

    iget-boolean v0, v2, Lbd3/k;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {v2, v1}, Lbd3/k;->g(C)V

    :cond_0
    invoke-virtual {v2}, Lbd3/k;->b()V

    iget-object v0, p0, Lbd3/g0;->b:Lad3/c;

    invoke-static {p1, v0, p2}, Lbd3/q;->m(Lyc3/g;Lad3/c;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Lbd3/k;->g(C)V

    invoke-virtual {v2}, Lbd3/k;->n()V

    return v3

    :cond_1
    if-nez p2, :cond_2

    iput-boolean v3, p0, Lbd3/g0;->g:Z

    :cond_2
    if-ne p2, v3, :cond_3

    invoke-virtual {v2, v1}, Lbd3/k;->g(C)V

    invoke-virtual {v2}, Lbd3/k;->n()V

    iput-boolean v5, p0, Lbd3/g0;->g:Z

    :cond_3
    return v3

    :cond_4
    iget-boolean p1, v2, Lbd3/k;->b:Z

    if-nez p1, :cond_6

    rem-int/2addr p2, v6

    if-nez p2, :cond_5

    invoke-virtual {v2, v1}, Lbd3/k;->g(C)V

    invoke-virtual {v2}, Lbd3/k;->b()V

    move v5, v3

    goto :goto_0

    :cond_5
    invoke-virtual {v2, v4}, Lbd3/k;->g(C)V

    invoke-virtual {v2}, Lbd3/k;->n()V

    :goto_0
    iput-boolean v5, p0, Lbd3/g0;->g:Z

    return v3

    :cond_6
    iput-boolean v3, p0, Lbd3/g0;->g:Z

    invoke-virtual {v2}, Lbd3/k;->b()V

    return v3

    :cond_7
    iget-boolean p1, v2, Lbd3/k;->b:Z

    if-nez p1, :cond_8

    invoke-virtual {v2, v1}, Lbd3/k;->g(C)V

    :cond_8
    invoke-virtual {v2}, Lbd3/k;->b()V

    return v3
.end method

.method public final encodeEnum(Lyc3/g;I)V
    .locals 1

    const-string v0, "enumDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void
.end method

.method public final encodeFloat(F)V
    .locals 3

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    iget-object v1, p0, Lbd3/g0;->a:Lbd3/k;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, v1, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lbd3/v;->p(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lbd3/g0;->f:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->j:Z

    if-nez v0, :cond_2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v2

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v0, v1, Lbd3/k;->c:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-virtual {v0}, Lbd3/v;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lbd3/q;->a(Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_2
    :goto_1
    return-void
.end method

.method public final encodeInline(Lyc3/g;)Lzc3/e;
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lbd3/h0;->b(Lyc3/g;)Z

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Lbd3/g0;->c:Lbd3/l0;

    iget-object v3, p0, Lbd3/g0;->b:Lad3/c;

    iget-object v4, p0, Lbd3/g0;->a:Lbd3/k;

    if-eqz v0, :cond_1

    instance-of p1, v4, Lbd3/m;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, v4, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p1, Lbd3/v;

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    new-instance v4, Lbd3/m;

    invoke-direct {v4, p1, v0}, Lbd3/m;-><init>(Lbd3/v;Z)V

    :goto_0
    new-instance p1, Lbd3/g0;

    invoke-direct {p1, v4, v3, v2, v1}, Lbd3/g0;-><init>(Lbd3/k;Lad3/c;Lbd3/l0;[Lad3/p;)V

    return-object p1

    :cond_1
    invoke-static {p1}, Lbd3/h0;->a(Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of p1, v4, Lbd3/l;

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, v4, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p1, Lbd3/v;

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    new-instance v4, Lbd3/l;

    invoke-direct {v4, p1, v0}, Lbd3/l;-><init>(Lbd3/v;Z)V

    :goto_1
    new-instance p1, Lbd3/g0;

    invoke-direct {p1, v4, v3, v2, v1}, Lbd3/g0;-><init>(Lbd3/k;Lad3/c;Lbd3/l0;[Lad3/p;)V

    return-object p1

    :cond_3
    iget-object v0, p0, Lbd3/g0;->h:Ljava/lang/String;

    if-eqz v0, :cond_4

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lbd3/g0;->i:Ljava/lang/String;

    return-object p0

    :cond_4
    invoke-super {p0, p1}, Lzc3/a;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1
.end method

.method public final encodeInt(I)V
    .locals 1

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v0, p1}, Lbd3/k;->h(I)V

    return-void
.end method

.method public final encodeLong(J)V
    .locals 1

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v0, p1, p2}, Lbd3/k;->i(J)V

    return-void
.end method

.method public final encodeNull()V
    .locals 2

    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    const-string v1, "null"

    invoke-virtual {v0, v1}, Lbd3/k;->j(Ljava/lang/String;)V

    return-void
.end method

.method public final encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_1

    iget-object v0, p0, Lbd3/g0;->f:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->f:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3, p4}, Lzc3/a;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/g0;->b:Lad3/c;

    iget-object v1, v0, Lad3/c;->a:Lad3/i;

    instance-of v2, p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz v2, :cond_0

    iget-object v1, v1, Lad3/i;->n:Lad3/a;

    sget-object v3, Lad3/a;->w:Lad3/a;

    if-eq v1, v3, :cond_4

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lad3/i;->n:Lad3/a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_4

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v0, 0x2

    if-ne v1, v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_2
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v1

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    sget-object v3, Lyc3/l;->d:Lyc3/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    :goto_0
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {v0, v1}, Lbd3/q;->j(Lad3/c;Lyc3/g;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v2, :cond_7

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz p2, :cond_6

    invoke-static {v1, p0, p2}, Lva3/l;->l(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/e;Ljava/lang/Object;)Lwc3/j;

    move-result-object v1

    if-eqz v0, :cond_5

    invoke-static {p1, v1, v0}, Lbd3/q;->e(Lwc3/j;Lwc3/j;Ljava/lang/String;)V

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p1

    invoke-static {p1}, Lbd3/q;->i(Lyc3/k;)V

    :cond_5
    move-object p1, v1

    goto :goto_3

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Value for serializer "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;->getDescriptor()Lyc3/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " should always be non-null. Please report issue to the kotlinx.serialization tracker."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    :goto_3
    if-eqz v0, :cond_8

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    iput-object v0, p0, Lbd3/g0;->h:Ljava/lang/String;

    iput-object v1, p0, Lbd3/g0;->i:Ljava/lang/String;

    :cond_8
    invoke-interface {p1, p0, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeShort(S)V
    .locals 1

    iget-boolean v0, p0, Lbd3/g0;->g:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lbd3/g0;->encodeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v0, p1}, Lbd3/k;->k(S)V

    return-void
.end method

.method public final encodeString(Ljava/lang/String;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {v0, p1}, Lbd3/k;->l(Ljava/lang/String;)V

    return-void
.end method

.method public final endStructure(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbd3/g0;->a:Lbd3/k;

    invoke-virtual {p1}, Lbd3/k;->o()V

    invoke-virtual {p1}, Lbd3/k;->c()V

    iget-object v0, p0, Lbd3/g0;->c:Lbd3/l0;

    iget-char v0, v0, Lbd3/l0;->x:C

    invoke-virtual {p1, v0}, Lbd3/k;->g(C)V

    return-void
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Lbd3/g0;->e:Lcd3/f;

    return-object v0
.end method

.method public final shouldEncodeElementDefault(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbd3/g0;->f:Lad3/i;

    iget-boolean p1, p1, Lad3/i;->a:Z

    return p1
.end method
