.class public Lbd3/t;
.super Lkotlinx/serialization/internal/NamedValueEncoder;
.source "SourceFile"

# interfaces
.implements Lad3/p;


# instance fields
.field public final a:Lad3/c;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lad3/i;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public final synthetic f:I

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad3/c;Lkotlin/jvm/functions/Function1;C)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkotlinx/serialization/internal/NamedValueEncoder;-><init>()V

    .line 2
    iput-object p1, p0, Lbd3/t;->a:Lad3/c;

    .line 3
    iput-object p2, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    .line 4
    iget-object p1, p1, Lad3/c;->a:Lad3/i;

    .line 5
    iput-object p1, p0, Lbd3/t;->c:Lad3/i;

    return-void
.end method

.method public constructor <init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lbd3/t;->f:I

    packed-switch p3, :pswitch_data_0

    const-string p3, "json"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "nodeConsumer"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 6
    invoke-direct {p0, p1, p2, p3}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;C)V

    .line 7
    const-string p1, "primitive"

    invoke-virtual {p0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->pushTag(Ljava/lang/Object;)V

    return-void

    .line 8
    :pswitch_0
    const-string p3, "json"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "nodeConsumer"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;C)V

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lbd3/t;->g:Ljava/lang/Object;

    return-void

    .line 11
    :pswitch_1
    const-string p3, "json"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "nodeConsumer"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    .line 12
    invoke-direct {p0, p1, p2, p3}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;C)V

    .line 13
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lbd3/t;->g:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Lad3/c;
    .locals 1

    iget-object v0, p0, Lbd3/t;->a:Lad3/c;

    return-object v0
.end method

.method public b()Lkotlinx/serialization/json/JsonElement;
    .locals 2

    iget v0, p0, Lbd3/t;->f:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlinx/serialization/json/JsonArray;

    iget-object v1, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    iget-object v1, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-direct {v0, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast v0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final beginStructure(Lyc3/g;)Lzc3/c;
    .locals 5

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTagOrNull()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    goto :goto_0

    :cond_0
    new-instance v0, La1/b;

    const/16 v1, 0x13

    invoke-direct {v0, p0, v1}, La1/b;-><init>(Ljava/lang/Object;I)V

    :goto_0
    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v1

    sget-object v2, Lyc3/l;->b:Lyc3/l;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, p0, Lbd3/t;->a:Lad3/c;

    if-nez v2, :cond_6

    instance-of v2, v1, Lyc3/d;

    if-eqz v2, :cond_1

    goto :goto_2

    :cond_1
    sget-object v2, Lyc3/l;->c:Lyc3/l;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Lyc3/g;->getElementDescriptor(I)Lyc3/g;

    move-result-object v1

    iget-object v2, v3, Lad3/c;->b:Lcd3/f;

    invoke-static {v1, v2}, Lbd3/q;->g(Lyc3/g;Lcd3/f;)Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v2

    instance-of v4, v2, Lyc3/f;

    if-nez v4, :cond_4

    sget-object v4, Lyc3/j;->a:Lyc3/j;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, v3, Lad3/c;->a:Lad3/i;

    iget-boolean v2, v2, Lad3/i;->d:Z

    if-eqz v2, :cond_3

    new-instance v1, Lbd3/t;

    const/4 v2, 0x2

    invoke-direct {v1, v3, v0, v2}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    goto :goto_3

    :cond_3
    invoke-static {v1}, Lbd3/q;->b(Lyc3/g;)Lkotlinx/serialization/json/internal/JsonEncodingException;

    move-result-object p1

    throw p1

    :cond_4
    :goto_1
    new-instance v1, Lbd3/z;

    const-string v2, "nodeConsumer"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-direct {v1, v3, v0, v2}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    const/4 v0, 0x1

    iput-boolean v0, v1, Lbd3/z;->i:Z

    goto :goto_3

    :cond_5
    new-instance v1, Lbd3/t;

    const/4 v2, 0x1

    invoke-direct {v1, v3, v0, v2}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    goto :goto_3

    :cond_6
    :goto_2
    new-instance v1, Lbd3/t;

    const/4 v2, 0x2

    invoke-direct {v1, v3, v0, v2}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    :goto_3
    iget-object v0, p0, Lbd3/t;->d:Ljava/lang/String;

    if-eqz v0, :cond_a

    instance-of v2, v1, Lbd3/z;

    if-eqz v2, :cond_8

    move-object v2, v1

    check-cast v2, Lbd3/z;

    const-string v3, "key"

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lbd3/z;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    iget-object v0, p0, Lbd3/t;->e:Ljava/lang/String;

    if-nez v0, :cond_7

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    :cond_7
    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    const-string v0, "value"

    invoke-virtual {v2, v0, p1}, Lbd3/z;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lbd3/t;->e:Ljava/lang/String;

    if-nez v2, :cond_9

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v2

    :cond_9
    invoke-static {v2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    :goto_4
    const/4 p1, 0x0

    iput-object p1, p0, Lbd3/t;->d:Ljava/lang/String;

    iput-object p1, p0, Lbd3/t;->e:Ljava/lang/String;

    :cond_a
    return-object v1
.end method

.method public final c(Lkotlinx/serialization/json/JsonElement;)V
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/t;->d:Ljava/lang/String;

    if-eqz v0, :cond_1

    instance-of v0, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lbd3/t;->e:Ljava/lang/String;

    invoke-static {v0, p1}, Lbd3/q;->w(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    sget-object v0, Lad3/n;->a:Lad3/n;

    invoke-virtual {p0, v0, p1}, Lbd3/t;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method

.method public final composeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "parentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "childName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V
    .locals 1

    iget v0, p0, Lbd3/t;->f:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :pswitch_1
    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primitive"

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lbd3/t;->g:Ljava/lang/Object;

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-nez p1, :cond_0

    iput-object p2, p0, Lbd3/t;->g:Ljava/lang/Object;

    iget-object p1, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Primitive element was already recorded. Does call to .encodeXxx happen more than once?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This output can only consume primitives with \'primitive\' tag"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public elementName(Lyc3/g;I)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lbd3/t;->f:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbd3/t;->a:Lad3/c;

    invoke-static {p1, v0, p2}, Lbd3/q;->m(Lyc3/g;Lad3/c;I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final encodeInline(Lyc3/g;)Lzc3/e;
    .locals 4

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTagOrNull()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbd3/t;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbd3/t;->e:Ljava/lang/String;

    :cond_0
    invoke-super {p0, p1}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lbd3/t;

    iget-object v1, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    iget-object v3, p0, Lbd3/t;->a:Lad3/c;

    invoke-direct {v0, v3, v1, v2}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p1}, Lbd3/t;->encodeInline(Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1
.end method

.method public final encodeNotNullMark()V
    .locals 0

    return-void
.end method

.method public final encodeNull()V
    .locals 2

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTagOrNull()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    sget-object v1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {p0, v0, v1}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lbd3/t;->f:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p4, :cond_0

    iget-object v0, p0, Lbd3/t;->c:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->f:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V
    .locals 4

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlinx/serialization/internal/TaggedEncoder;->getCurrentTagOrNull()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lbd3/t;->a:Lad3/c;

    if-nez v0, :cond_1

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    iget-object v2, v1, Lad3/c;->b:Lcd3/f;

    invoke-static {v0, v2}, Lbd3/q;->g(Lyc3/g;Lcd3/f;)Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v2

    instance-of v2, v2, Lyc3/f;

    if-nez v2, :cond_0

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v2, Lyc3/j;->a:Lyc3/j;

    if-ne v0, v2, :cond_1

    :cond_0
    new-instance v0, Lbd3/t;

    iget-object v2, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lbd3/t;-><init>(Lad3/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, p1, p2}, Lbd3/t;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, v1, Lad3/c;->a:Lad3/i;

    instance-of v2, p1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz v2, :cond_2

    iget-object v0, v0, Lad3/i;->n:Lad3/a;

    sget-object v3, Lad3/a;->w:Lad3/a;

    if-eq v0, v3, :cond_6

    goto :goto_0

    :cond_2
    iget-object v0, v0, Lad3/i;->n:Lad3/a;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v3, 0x1

    if-eq v0, v3, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-interface {v0}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object v0

    sget-object v3, Lyc3/l;->a:Lyc3/l;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    sget-object v3, Lyc3/l;->d:Lyc3/l;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    :goto_0
    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {v1, v0}, Lbd3/q;->j(Lad3/c;Lyc3/g;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v0, 0x0

    :goto_2
    if-eqz v2, :cond_9

    move-object v1, p1

    check-cast v1, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;

    if-eqz p2, :cond_8

    invoke-static {v1, p0, p2}, Lva3/l;->l(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lzc3/e;Ljava/lang/Object;)Lwc3/j;

    move-result-object v1

    if-eqz v0, :cond_7

    invoke-static {p1, v1, v0}, Lbd3/q;->e(Lwc3/j;Lwc3/j;Ljava/lang/String;)V

    invoke-interface {v1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object p1

    invoke-interface {p1}, Lyc3/g;->getKind()Lyc3/k;

    move-result-object p1

    invoke-static {p1}, Lbd3/q;->i(Lyc3/k;)V

    :cond_7
    move-object p1, v1

    goto :goto_3

    :cond_8
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

    :cond_9
    :goto_3
    if-eqz v0, :cond_a

    invoke-interface {p1}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-interface {v1}, Lyc3/g;->getSerialName()Ljava/lang/String;

    move-result-object v1

    iput-object v0, p0, Lbd3/t;->d:Ljava/lang/String;

    iput-object v1, p0, Lbd3/t;->e:Ljava/lang/String;

    :cond_a
    invoke-interface {p1, p0, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method

.method public final encodeTaggedBoolean(Ljava/lang/Object;Z)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->a(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedByte(Ljava/lang/Object;B)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedChar(Ljava/lang/Object;C)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedDouble(Ljava/lang/Object;D)V
    .locals 4

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    iget-object v0, p0, Lbd3/t;->c:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->j:Z

    if-nez v0, :cond_1

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v0

    const-wide v2, 0x7fefffffffffffffL    # Double.MAX_VALUE

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-virtual {p0}, Lbd3/t;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "output"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlinx/serialization/json/internal/JsonEncodingException;

    invoke-static {p2, p1, p3}, Lbd3/q;->y(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/internal/JsonEncodingException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final encodeTaggedEnum(Ljava/lang/Object;Lyc3/g;I)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enumDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lyc3/g;->getElementName(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedFloat(Ljava/lang/Object;F)V
    .locals 2

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    iget-object v0, p0, Lbd3/t;->c:Lad3/i;

    iget-boolean v0, v0, Lad3/i;->j:Z

    if-nez v0, :cond_1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p0}, Lbd3/t;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "output"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkotlinx/serialization/json/internal/JsonEncodingException;

    invoke-static {p2, p1, v0}, Lbd3/q;->y(Ljava/lang/Number;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lkotlinx/serialization/json/internal/JsonEncodingException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    return-void
.end method

.method public final encodeTaggedInline(Ljava/lang/Object;Lyc3/g;)Lzc3/e;
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inlineDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lbd3/h0;->b(Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Lbd3/c;

    invoke-direct {p2, p0, p1}, Lbd3/c;-><init>(Lbd3/t;Ljava/lang/String;)V

    return-object p2

    :cond_0
    invoke-static {p2}, Lbd3/h0;->a(Lyc3/g;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lbd3/c;

    invoke-direct {v0, p0, p1, p2}, Lbd3/c;-><init>(Lbd3/t;Ljava/lang/String;Lyc3/g;)V

    return-object v0

    :cond_1
    invoke-super {p0, p1, p2}, Lkotlinx/serialization/internal/TaggedEncoder;->encodeTaggedInline(Ljava/lang/Object;Lyc3/g;)Lzc3/e;

    move-result-object p1

    return-object p1
.end method

.method public final encodeTaggedInt(Ljava/lang/Object;I)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedLong(Ljava/lang/Object;J)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedNull(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {p0, p1, v0}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedShort(Ljava/lang/Object;S)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->b(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedString(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final encodeTaggedValue(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/String;

    const-string v0, "tag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lbd3/t;->d(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public final endEncode(Lyc3/g;)V
    .locals 1

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbd3/t;->b:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lbd3/t;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final getSerializersModule()Lcd3/f;
    .locals 1

    iget-object v0, p0, Lbd3/t;->a:Lad3/c;

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    return-object v0
.end method

.method public final shouldEncodeElementDefault(Lyc3/g;I)Z
    .locals 0

    const-string p2, "descriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lbd3/t;->c:Lad3/i;

    iget-boolean p1, p1, Lad3/i;->a:Z

    return p1
.end method
