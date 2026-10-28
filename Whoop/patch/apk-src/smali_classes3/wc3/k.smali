.class public abstract Lwc3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlinx/serialization/internal/SerializerCache;

.field public static final b:Lkotlinx/serialization/internal/SerializerCache;

.field public static final c:Lkotlinx/serialization/internal/ParametrizedSerializerCache;

.field public static final d:Lkotlinx/serialization/internal/ParametrizedSerializerCache;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw01/e;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-static {v0}, Lkotlinx/serialization/internal/CachingKt;->createCache(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/SerializerCache;

    move-result-object v0

    sput-object v0, Lwc3/k;->a:Lkotlinx/serialization/internal/SerializerCache;

    new-instance v0, Lw01/e;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lw01/e;-><init>(I)V

    invoke-static {v0}, Lkotlinx/serialization/internal/CachingKt;->createCache(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/internal/SerializerCache;

    move-result-object v0

    sput-object v0, Lwc3/k;->b:Lkotlinx/serialization/internal/SerializerCache;

    new-instance v0, Lv6/q;

    const/16 v1, 0xe

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv6/q;-><init>(IB)V

    invoke-static {v0}, Lkotlinx/serialization/internal/CachingKt;->createParametrizedCache(Lc93/m;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    move-result-object v0

    sput-object v0, Lwc3/k;->c:Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    new-instance v0, Lv6/q;

    const/16 v1, 0xf

    invoke-direct {v0, v1, v2}, Lv6/q;-><init>(IB)V

    invoke-static {v0}, Lkotlinx/serialization/internal/CachingKt;->createParametrizedCache(Lc93/m;)Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    move-result-object v0

    sput-object v0, Lwc3/k;->d:Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    return-void
.end method

.method public static final a(Lj93/d;Z)Lwc3/c;
    .locals 1

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_1

    sget-object p1, Lwc3/k;->a:Lkotlinx/serialization/internal/SerializerCache;

    invoke-interface {p1, p0}, Lkotlinx/serialization/internal/SerializerCache;->get(Lj93/d;)Lwc3/c;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :cond_1
    sget-object p1, Lwc3/k;->b:Lkotlinx/serialization/internal/SerializerCache;

    invoke-interface {p1, p0}, Lkotlinx/serialization/internal/SerializerCache;->get(Lj93/d;)Lwc3/c;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lj93/d;Ljava/util/ArrayList;Z)Ljava/lang/Object;
    .locals 1

    const-string v0, "clazz"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    sget-object p2, Lwc3/k;->c:Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    invoke-interface {p2, p0, p1}, Lkotlinx/serialization/internal/ParametrizedSerializerCache;->get-gIAlu-s(Lj93/d;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p2, Lwc3/k;->d:Lkotlinx/serialization/internal/ParametrizedSerializerCache;

    invoke-interface {p2, p0, p1}, Lkotlinx/serialization/internal/ParametrizedSerializerCache;->get-gIAlu-s(Lj93/d;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
