.class public final Lxx/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxx/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/Map;


# direct methods
.method public constructor <init>(ILjava/lang/Float;)V
    .locals 1

    iput p1, p0, Lxx/c;->w:I

    packed-switch p1, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ll83/k;

    const-string v0, "duration"

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lxx/c;->x:Ljava/util/Map;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ll83/k;

    const-string v0, "duration"

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lxx/c;->x:Ljava/util/Map;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lxx/c;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements.attestation.confirmation.request_token.succeeded"

    return-object v0

    :pswitch_0
    const-string v0, "elements.attestation.confirmation.prepare.succeeded"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lxx/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxx/c;->x:Ljava/util/Map;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lxx/c;->x:Ljava/util/Map;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
