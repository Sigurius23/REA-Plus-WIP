.class public final synthetic Lpp1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p1, p0, Lpp1/f;->w:I

    iput-object p4, p0, Lpp1/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpp1/f;->y:Ljava/lang/String;

    iput-object p3, p0, Lpp1/f;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lpp1/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpp1/f;->y:Ljava/lang/String;

    iput-object p3, p0, Lpp1/f;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lpp1/f;->z:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lpp1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpp1/f;->z:Ljava/lang/String;

    check-cast p1, Landroid/content/Context;

    iget-object v1, p0, Lpp1/f;->y:Ljava/lang/String;

    iget-object v2, p0, Lpp1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2, v0, p1}, Lzo2/f;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroid/content/Context;)Landroid/webkit/WebView;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lpp1/f;->y:Ljava/lang/String;

    iget-object v1, p0, Lpp1/f;->z:Ljava/lang/String;

    iget-object v2, p0, Lpp1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lv01/c;->a(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lpp1/f;->y:Ljava/lang/String;

    iget-object v1, p0, Lpp1/f;->z:Ljava/lang/String;

    iget-object v2, p0, Lpp1/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1, p1}, Lpp1/i;->r(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
