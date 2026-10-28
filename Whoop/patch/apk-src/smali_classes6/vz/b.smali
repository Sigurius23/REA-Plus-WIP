.class public final Lvz/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvz/c;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lvz/b;->w:I

    packed-switch p2, :pswitch_data_0

    const-string p2, "siteKey"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvz/b;->x:Ljava/lang/String;

    return-void

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvz/b;->x:Ljava/lang/String;

    return-void

    :pswitch_1
    const-string p2, "siteKey"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvz/b;->x:Ljava/lang/String;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lvz/b;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_0
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_1
    sget-object v0, Lm83/z;->w:Lm83/z;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lvz/b;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements.captcha.passive.success"

    return-object v0

    :pswitch_0
    const-string v0, "elements.captcha.passive.init"

    return-object v0

    :pswitch_1
    const-string v0, "elements.captcha.passive.execute"

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lvz/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvz/b;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvz/b;->x:Ljava/lang/String;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvz/b;->x:Ljava/lang/String;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lvz/b;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ls2/a;->w(Lvz/c;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ls2/a;->w(Lvz/c;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {p0}, Ls2/a;->w(Lvz/c;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
