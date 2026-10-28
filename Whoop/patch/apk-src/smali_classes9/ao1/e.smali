.class public final synthetic Lao1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/util/Map;

.field public final synthetic y:Lu82/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map;Lu82/i;I)V
    .locals 0

    iput p3, p0, Lao1/e;->w:I

    iput-object p1, p0, Lao1/e;->x:Ljava/util/Map;

    iput-object p2, p0, Lao1/e;->y:Lu82/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lao1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lao1/e;->x:Ljava/util/Map;

    iget-object v1, p0, Lao1/e;->y:Lu82/i;

    invoke-static {v0, v1}, Lao1/j;->P(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lao1/e;->x:Ljava/util/Map;

    iget-object v1, p0, Lao1/e;->y:Lu82/i;

    invoke-static {v0, v1}, Lao1/j;->Y(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lao1/e;->x:Ljava/util/Map;

    iget-object v1, p0, Lao1/e;->y:Lu82/i;

    invoke-static {v0, v1}, Lao1/j;->n(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
