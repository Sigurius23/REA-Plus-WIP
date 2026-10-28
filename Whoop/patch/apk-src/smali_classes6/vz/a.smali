.class public final Lvz/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvz/c;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;

.field public final y:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lvz/a;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvz/a;->x:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 4
    :goto_0
    const-string p2, "error_message"

    invoke-static {p2, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 5
    iput-object p1, p0, Lvz/a;->y:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lvz/a;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p2, p0, Lvz/a;->x:Ljava/lang/String;

    .line 11
    const-string p2, "is_ready"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 12
    invoke-static {p1, p2}, Lvl/b;->p(Ljava/lang/Boolean;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 13
    iput-object p1, p0, Lvz/a;->y:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lvz/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvz/a;->y:Ljava/util/Map;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvz/a;->y:Ljava/util/Map;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lvz/a;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "elements.captcha.passive.error"

    return-object v0

    :pswitch_0
    const-string v0, "elements.captcha.passive.attach"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lvz/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvz/a;->x:Ljava/lang/String;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvz/a;->x:Ljava/lang/String;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getParams()Ljava/util/Map;
    .locals 1

    iget v0, p0, Lvz/a;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ls2/a;->w(Lvz/c;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {p0}, Ls2/a;->w(Lvz/c;)Ljava/util/LinkedHashMap;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
