.class public final Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt;->generatedBind(Lcom/whoop/design/models/test/fixtures/NestedBindTestFixture;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/test/fixtures/NestedBindTestFixture;
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
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    invoke-direct {v0}, Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;-><init>()V

    sput-object v0, Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;->INSTANCE:Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;

    return-void
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
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/test/fixtures/NestedBindTestFixtureStateBindingKt$generatedBind$$inlined$resolveBinding$6;->invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;",
            ")",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    .line 3
    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    .line 4
    const-class v1, Lcom/whoop/design/models/test/fixtures/PrimitiveBindTestFixture;

    .line 5
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    .line 6
    invoke-static {v0, v1}, Lvb/g;->f(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v0

    .line 7
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v1

    check-cast v0, Lwc3/j;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    invoke-static {v1, p1, v0}, Lds/p;->h0(Lad3/c;Ljava/lang/Object;Lwc3/j;)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method
