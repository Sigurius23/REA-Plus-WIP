.class public final synthetic Lcom/mapbox/common/movement/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/e;
.implements Lqw/o;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/common/movement/a;->w:I

    iput-object p1, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public construct()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/mapbox/common/movement/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    iget-object v1, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    iget-object v1, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    iget-object v1, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_2
    new-instance v0, Lcom/nimbusds/jose/shaded/gson/JsonIOException;

    iget-object v1, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public n(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/movement/a;->x:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/mapbox/common/movement/GoogleActivityRecognition$Companion;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    return-void
.end method
