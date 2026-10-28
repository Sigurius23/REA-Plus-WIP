.class final Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwc3/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c2\u0002\u0018\u00002\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;",
        "Lwc3/c;",
        "",
        "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
        "<init>",
        "()V",
        "Lzc3/d;",
        "decoder",
        "deserialize",
        "(Lzc3/d;)Ljava/util/List;",
        "Lzc3/e;",
        "encoder",
        "value",
        "Ll83/a0;",
        "serialize",
        "(Lzc3/e;Ljava/util/List;)V",
        "",
        "delegate",
        "Lwc3/c;",
        "Lyc3/g;",
        "descriptor",
        "Lyc3/g;",
        "getDescriptor",
        "()Lyc3/g;",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;

.field private static final delegate:Lwc3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lwc3/c;"
        }
    .end annotation
.end field

.field private static final descriptor:Lyc3/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;

    invoke-direct {v0}, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;-><init>()V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-static {v0}, Lxc3/a;->a(Lwc3/c;)Lkotlinx/serialization/internal/ArrayListSerializer;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->delegate:Lwc3/c;

    invoke-interface {v0}, Lwc3/j;->getDescriptor()Lyc3/g;

    move-result-object v0

    sput-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->descriptor:Lyc3/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->deserialize(Lzc3/d;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public deserialize(Lzc3/d;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/d;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;"
        }
    .end annotation

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->delegate:Lwc3/c;

    invoke-interface {v0, p1}, Lwc3/b;->deserialize(Lzc3/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 5
    check-cast v1, Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/whoop/whoopaction/domain/models/PickMediaType;->getEntries()Lt83/a;

    move-result-object v2

    .line 7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/whoopaction/domain/models/PickMediaType;

    .line 8
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static {v4, v1, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    .line 9
    :goto_1
    check-cast v3, Lcom/whoop/whoopaction/domain/models/PickMediaType;

    if-eqz v3, :cond_0

    .line 10
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->descriptor:Lyc3/g;

    return-object v0
.end method

.method public bridge synthetic serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/util/List;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->serialize(Lzc3/e;Ljava/util/List;)V

    return-void
.end method

.method public serialize(Lzc3/e;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzc3/e;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/whoopaction/domain/models/PickMediaType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/whoop/whoopaction/domain/models/PickMediaTypesSerializer;->delegate:Lwc3/c;

    check-cast p2, Ljava/lang/Iterable;

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 5
    check-cast v2, Lcom/whoop/whoopaction/domain/models/PickMediaType;

    .line 6
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {v0, p1, v1}, Lwc3/j;->serialize(Lzc3/e;Ljava/lang/Object;)V

    return-void
.end method
