.class public final Lad3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/d0;

.field public static final b:Lyc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lad3/d0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/d0;->a:Lad3/d0;

    sget-object v0, Lyc3/e;->i:Lyc3/e;

    const/4 v1, 0x0

    new-array v1, v1, [Lyc3/g;

    const-string v2, "kotlinx.serialization.json.JsonPrimitive"

    invoke-static {v2, v0, v1}, Lvf3/b;->e(Ljava/lang/String;Lyc3/k;[Lyc3/g;)Lyc3/h;

    move-result-object v0

    sput-object v0, Lad3/d0;->b:Lyc3/h;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    move-result-object p1

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    instance-of v0, p1, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_0

    check-cast p1, Lkotlinx/serialization/json/JsonPrimitive;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected JSON element, expected JsonPrimitive, had "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-static {v2, v1, v0}, Lr80/c;->r(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {p1, v1, v0}, Lbd3/q;->d(Ljava/lang/CharSequence;ILjava/lang/String;)Lkotlinx/serialization/json/internal/JsonDecodingException;

    move-result-object p1

    throw p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/d0;->b:Lyc3/h;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/serialization/json/JsonPrimitive;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    instance-of v0, p2, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_0

    sget-object p2, Lad3/x;->a:Lad3/x;

    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-interface {p1, p2, v0}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_0
    sget-object v0, Lad3/t;->a:Lad3/t;

    check-cast p2, Lad3/s;

    invoke-interface {p1, v0, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method
