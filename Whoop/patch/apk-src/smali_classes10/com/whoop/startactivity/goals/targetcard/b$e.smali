.class public final Lcom/whoop/startactivity/goals/targetcard/b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/startactivity/goals/targetcard/b;->a(Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/startactivity/goals/targetcard/TargetCardModel;
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
.field public static final w:Lcom/whoop/startactivity/goals/targetcard/b$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/startactivity/goals/targetcard/b$e;

    invoke-direct {v0}, Lcom/whoop/startactivity/goals/targetcard/b$e;-><init>()V

    sput-object v0, Lcom/whoop/startactivity/goals/targetcard/b$e;->w:Lcom/whoop/startactivity/goals/targetcard/b$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    const-class v2, Lcom/whoop/design/models/DesignSystemModel;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v0, v2}, Lvb/g;->e(Lcd3/f;Lj93/d;)Lwc3/c;

    move-result-object v0

    invoke-direct {v1, v0}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {p0, p1}, Lcom/whoop/startactivity/goals/targetcard/b$e;->a(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
