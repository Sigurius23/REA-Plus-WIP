.class public abstract Lad3/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# instance fields
.field public final a:Lwc3/c;


# direct methods
.method public constructor <init>(Lkotlinx/serialization/internal/StringSerializer;)V
    .locals 1

    const-string v0, "tSerializer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lad3/e0;->a:Lwc3/c;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    move-result-object p1

    invoke-interface {p1}, Lad3/k;->b()Lkotlinx/serialization/json/JsonElement;

    move-result-object v0

    invoke-interface {p1}, Lad3/k;->a()Lad3/c;

    move-result-object p1

    iget-object v1, p0, Lad3/e0;->a:Lwc3/c;

    check-cast v1, Lwc3/b;

    const-string v2, "element"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lad3/e0;->a:Lwc3/c;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 2

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    move-result-object p1

    invoke-interface {p1}, Lad3/p;->a()Lad3/c;

    move-result-object v0

    iget-object v1, p0, Lad3/e0;->a:Lwc3/c;

    check-cast v1, Lwc3/j;

    invoke-static {v0, p2, v1}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    invoke-interface {p1, p2}, Lad3/p;->c(Lkotlinx/serialization/json/JsonElement;)V

    return-void
.end method
