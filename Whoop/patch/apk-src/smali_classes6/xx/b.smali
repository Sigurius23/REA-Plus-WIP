.class public final Lxx/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxx/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/Float;I)V
    .locals 1

    iput p3, p0, Lxx/b;->w:I

    packed-switch p3, :pswitch_data_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v0, "error_message"

    invoke-direct {p3, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v0, "duration"

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lxx/b;->x:Ljava/lang/Object;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    new-instance p3, Ll83/k;

    const-string v0, "error_message"

    invoke-direct {p3, v0, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v0, "duration"

    invoke-direct {p1, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {p3, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lxx/b;->x:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method private final d()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lxx/b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method private final e()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lxx/b;->x:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lxx/b;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements.attestation.confirmation.request_token.failed"

    return-object v0

    :pswitch_0
    const-string v0, "elements.attestation.confirmation.prepare.failed"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lxx/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-direct {p0}, Lxx/b;->e()Ljava/util/Map;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-direct {p0}, Lxx/b;->d()Ljava/util/Map;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
