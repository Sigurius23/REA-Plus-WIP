.class public final Lwc3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# instance fields
.field public final a:Lj93/d;

.field public final b:Lwc3/c;

.field public final c:Ljava/util/List;

.field public final d:Lyc3/b;


# direct methods
.method public constructor <init>(Lj93/d;Lwc3/c;[Lwc3/c;)V
    .locals 2

    const-string v0, "serializableClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc3/a;->a:Lj93/d;

    iput-object p2, p0, Lwc3/a;->b:Lwc3/c;

    invoke-static {p3}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lwc3/a;->c:Ljava/util/List;

    const/4 p2, 0x0

    new-array p2, p2, [Lyc3/g;

    new-instance p3, Lrf/p;

    const/4 v0, 0x7

    invoke-direct {p3, p0, v0}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    const-string v0, "kotlinx.serialization.ContextualSerializer"

    sget-object v1, Lyc3/i;->a:Lyc3/i;

    invoke-static {v0, v1, p2, p3}, Lvf3/b;->d(Ljava/lang/String;Lyc3/k;[Lyc3/g;Lkotlin/jvm/functions/Function1;)Lyc3/h;

    move-result-object p2

    new-instance p3, Lyc3/b;

    invoke-direct {p3, p2, p1}, Lyc3/b;-><init>(Lyc3/h;Lj93/d;)V

    iput-object p3, p0, Lwc3/a;->d:Lyc3/b;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p1}, Lzc3/d;->getSerializersModule()Lcd3/f;

    move-result-object v0

    iget-object v1, p0, Lwc3/a;->c:Ljava/util/List;

    iget-object v2, p0, Lwc3/a;->a:Lj93/d;

    invoke-virtual {v0, v2, v1}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwc3/a;->b:Lwc3/c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlinx/serialization/internal/Platform_commonKt;->serializerNotRegistered(Lj93/d;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    check-cast v0, Lwc3/b;

    invoke-interface {p1, v0}, Lzc3/d;->decodeSerializableValue(Lwc3/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lwc3/a;->d:Lyc3/b;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 3

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lzc3/e;->getSerializersModule()Lcd3/f;

    move-result-object v0

    iget-object v1, p0, Lwc3/a;->c:Ljava/util/List;

    iget-object v2, p0, Lwc3/a;->a:Lj93/d;

    invoke-virtual {v0, v2, v1}, Lcd3/f;->b(Lj93/d;Ljava/util/List;)Lwc3/c;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwc3/a;->b:Lwc3/c;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlinx/serialization/internal/Platform_commonKt;->serializerNotRegistered(Lj93/d;)Ljava/lang/Void;

    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    check-cast v0, Lwc3/j;

    invoke-interface {p1, v0, p2}, Lzc3/e;->encodeSerializableValue(Lwc3/j;Ljava/lang/Object;)V

    return-void
.end method
