.class public final Lij/f;
.super Lij/p;
.source "SourceFile"


# instance fields
.field public final c:Lij/m;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Lad3/r;


# direct methods
.method public constructor <init>(Lij/m;)V
    .locals 1

    const-string v0, "callNativeFunction"

    invoke-direct {p0, v0}, Lij/p;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lij/f;->c:Lij/m;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lij/f;->d:Ljava/util/LinkedHashMap;

    sget-object p1, Lij/c;->x:Lij/c;

    sget-object v0, Lad3/c;->d:Lad3/b;

    invoke-static {v0, p1}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object p1

    iput-object p1, p0, Lij/f;->e:Lad3/r;

    new-instance p1, La3/m1;

    const/16 v0, 0x13

    invoke-direct {p1, p0, v0}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lij/p;->b:Lkotlin/jvm/internal/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p2, :cond_0

    const-string p2, "null"

    :cond_0
    iget-object v0, p0, Lij/f;->e:Lad3/r;

    invoke-virtual {v0, p2}, Lad3/c;->f(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    const-string v1, "element"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "id"

    invoke-interface {v0, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "data"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {p3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "error"

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    new-instance p1, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p1, v0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonObject;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lij/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "onNativeMessage("

    const/16 v0, 0x29

    invoke-static {v0, p2, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lij/d;->w:Lij/d;

    iget-object v0, p0, Lij/f;->c:Lij/m;

    invoke-virtual {v0, p1, p2}, Lij/m;->a(Ljava/lang/String;Lc93/m;)V

    return-void
.end method
