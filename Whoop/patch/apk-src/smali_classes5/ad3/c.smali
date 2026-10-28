.class public abstract Lad3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/l;


# static fields
.field public static final d:Lad3/b;


# instance fields
.field public final a:Lad3/i;

.field public final b:Lcd3/f;

.field public final c:Lad3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lad3/b;

    new-instance v1, Lad3/i;

    const/4 v14, 0x0

    sget-object v15, Lad3/a;->x:Lad3/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-string v8, "    "

    const/4 v9, 0x0

    const-string v10, "type"

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lad3/i;-><init>(ZZZZZZLjava/lang/String;ZLjava/lang/String;ZZLad3/v;ZLad3/a;)V

    sget-object v2, Lcd3/i;->a:Lcd3/d;

    invoke-direct {v0, v1, v2}, Lad3/c;-><init>(Lad3/i;Lcd3/f;)V

    sput-object v0, Lad3/c;->d:Lad3/b;

    return-void
.end method

.method public constructor <init>(Lad3/i;Lcd3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad3/c;->a:Lad3/i;

    iput-object p2, p0, Lad3/c;->b:Lcd3/f;

    new-instance p1, Lad3/z;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lad3/z;-><init>(I)V

    iput-object p1, p0, Lad3/c;->c:Lad3/z;

    return-void
.end method


# virtual methods
.method public final a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 3

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_0

    new-instance v0, Lbd3/w;

    check-cast p2, Lkotlinx/serialization/json/JsonObject;

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-direct {v0, p0, p2, v1, v2}, Lbd3/w;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;I)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_1

    new-instance v0, Lbd3/x;

    check-cast p2, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {v0, p0, p2}, Lbd3/x;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonArray;)V

    goto :goto_1

    :cond_1
    instance-of v0, p2, Lad3/s;

    if-nez v0, :cond_3

    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_0
    new-instance v0, Lbd3/s;

    check-cast p2, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-direct {v0, p0, p2}, Lbd3/s;-><init>(Lad3/c;Lkotlinx/serialization/json/JsonElement;)V

    :goto_1
    invoke-virtual {v0, p1}, Lbd3/b;->decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    const-string v0, "deserializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "string"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lbd3/i0;

    invoke-direct {v4, p2}, Lbd3/i0;-><init>(Ljava/lang/String;)V

    new-instance v1, Lbd3/f0;

    sget-object v3, Lbd3/l0;->y:Lbd3/l0;

    invoke-interface {p1}, Lwc3/b;->getDescriptor()Lyc3/g;

    move-result-object v5

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lbd3/f0;-><init>(Lad3/c;Lbd3/l0;Lbd3/a;Lyc3/g;Lbd3/e0;)V

    invoke-virtual {v1, p1}, Lbd3/f0;->decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v4}, Lbd3/a;->p()V

    return-object p1
.end method

.method public final c(Lwc3/j;Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "serializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    const-string v0, "array"

    const-string v1, "serializer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbd3/v;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lbd3/v;-><init>(IC)V

    sget-object v2, Lbd3/g;->z:Lbd3/g;

    const/16 v3, 0x80

    invoke-virtual {v2, v3}, Landroidx/datastore/preferences/protobuf/l;->J(I)[C

    move-result-object v3

    iput-object v3, v1, Lbd3/v;->y:Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, v1, p1, p2}, Lbd3/q;->l(Lad3/c;Lbd3/v;Lwc3/j;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lbd3/v;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, v1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast p2, [C

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Landroidx/datastore/preferences/protobuf/l;->G([C)V

    return-object p1

    :catchall_0
    move-exception p1

    sget-object p2, Lbd3/g;->z:Lbd3/g;

    iget-object v1, v1, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [C

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Landroidx/datastore/preferences/protobuf/l;->G([C)V

    throw p1
.end method

.method public final e()Lcd3/f;
    .locals 1

    iget-object v0, p0, Lad3/c;->b:Lcd3/f;

    return-object v0
.end method

.method public final f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lad3/n;->a:Lad3/n;

    invoke-virtual {p0, v0, p1}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    return-object p1
.end method
