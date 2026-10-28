.class public final Lad3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/n;

.field public static final b:Lyc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lad3/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/n;->a:Lad3/n;

    sget-object v0, Lyc3/c;->b:Lyc3/c;

    const/4 v1, 0x0

    new-array v1, v1, [Lyc3/g;

    new-instance v2, La11/g;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, La11/g;-><init>(I)V

    const-string v3, "kotlinx.serialization.json.JsonElement"

    invoke-static {v3, v0, v1, v2}, Lvf3/b;->d(Ljava/lang/String;Lyc3/k;[Lyc3/g;Lkotlin/jvm/functions/Function1;)Lyc3/h;

    move-result-object v0

    sput-object v0, Lad3/n;->b:Lyc3/h;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    move-result-object p1

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/n;->b:Lyc3/h;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/serialization/json/JsonElement;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    instance-of v0, p2, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_0

    sget-object v0, Lad3/d0;->a:Lad3/d0;

    invoke-interface {p1, v0, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_0
    instance-of v0, p2, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_1

    sget-object v0, Lad3/b0;->a:Lad3/b0;

    invoke-interface {p1, v0, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_1
    instance-of v0, p2, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_2

    sget-object v0, Lad3/f;->a:Lad3/f;

    invoke-interface {p1, v0, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
