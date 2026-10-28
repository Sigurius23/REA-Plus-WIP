.class public final Lad3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwc3/c;


# static fields
.field public static final a:Lad3/x;

.field public static final b:Lyc3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lad3/x;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lad3/x;->a:Lad3/x;

    const/4 v0, 0x0

    new-array v0, v0, [Lyc3/g;

    const-string v1, "kotlinx.serialization.json.JsonNull"

    sget-object v2, Lyc3/j;->a:Lyc3/j;

    invoke-static {v1, v2, v0}, Lvf3/b;->e(Ljava/lang/String;Lyc3/k;[Lyc3/g;)Lyc3/h;

    move-result-object v0

    sput-object v0, Lad3/x;->b:Lyc3/h;

    return-void
.end method


# virtual methods
.method public final deserialize(Lzc3/d;)Ljava/lang/Object;
    .locals 1

    invoke-static {p1}, Lq83/g;->i(Lzc3/d;)Lad3/k;

    invoke-interface {p1}, Lzc3/d;->decodeNotNullMark()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lzc3/d;->decodeNull()Ljava/lang/Void;

    sget-object p1, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    return-object p1

    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/JsonDecodingException;

    const-string v0, "Expected \'null\' literal"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    sget-object v0, Lad3/x;->b:Lyc3/h;

    return-object v0
.end method

.method public final serialize(Lzc3/e;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Lkotlinx/serialization/json/JsonNull;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lq83/g;->j(Lzc3/e;)Lad3/p;

    invoke-interface {p1}, Lzc3/e;->encodeNull()V

    return-void
.end method
