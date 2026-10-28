.class public final Lad3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/b0;

.field public static final b:Lad3/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lad3/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/b0;->a:Lad3/b0;

    sget-object v0, Lad3/a0;->b:Lad3/a0;

    sput-object v0, Lad3/b0;->b:Lad3/a0;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    new-instance v0, Lkotlinx/serialization/json/JsonObject;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lad3/n;->a:Lad3/n;

    invoke-static {v1, v2}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v1

    invoke-interface {v1, p1}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/b0;->b:Lad3/a0;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Lkotlinx/serialization/json/JsonObject;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-static {v0, v1}, Lxc3/a;->c(Lwc3/c;Lwc3/c;)Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method
