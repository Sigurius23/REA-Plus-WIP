.class public final Lad3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/f;

.field public static final b:Lad3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lad3/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/f;->a:Lad3/f;

    sget-object v0, Lad3/e;->b:Lad3/e;

    sput-object v0, Lad3/f;->b:Lad3/e;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    new-instance v0, Lkotlinx/serialization/json/JsonArray;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-static {v1}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v1

    invoke-interface {v1, p1}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-direct {v0, p1}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/f;->b:Lad3/e;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/serialization/json/JsonArray;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    sget-object v0, Lad3/n;->a:Lad3/n;

    invoke-static {v0}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method
