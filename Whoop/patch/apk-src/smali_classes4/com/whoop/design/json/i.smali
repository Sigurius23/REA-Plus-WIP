.class public final synthetic Lcom/whoop/design/json/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map$Entry;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Map$Entry;)V
    .locals 0

    iput p1, p0, Lcom/whoop/design/json/i;->w:I

    iput-object p2, p0, Lcom/whoop/design/json/i;->x:Ljava/util/Map$Entry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/design/json/i;->w:I

    check-cast p1, Lcom/google/gson/JsonDeserializationContext;

    check-cast p2, Lcom/google/gson/JsonObject;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/design/json/i;->x:Ljava/util/Map$Entry;

    invoke-static {v0, p1, p2}, Lcom/whoop/design/json/j;->a(Ljava/util/Map$Entry;Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/design/json/i;->x:Ljava/util/Map$Entry;

    invoke-static {v0, p1, p2}, Lcom/whoop/design/json/DesignSystemTypeAdapter;->a(Ljava/util/Map$Entry;Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
