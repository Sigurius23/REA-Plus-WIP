.class public final Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveContentBinding$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/design/models/binding/ContentBindingResolverKt;->resolveContentBinding(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0xb0
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveContentBinding$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p0, p1}, Lcom/whoop/design/models/binding/ContentBindingResolverKt$resolveContentBinding$2;->invoke(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")TT;"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    .line 3
    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    .line 4
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method
