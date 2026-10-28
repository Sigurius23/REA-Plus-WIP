.class public final synthetic Lcom/amplitude/quickjs/wrapper/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/amplitude/quickjs/wrapper/JSCallFunction;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/amplitude/quickjs/wrapper/a;->a:I

    iput-object p1, p0, Lcom/amplitude/quickjs/wrapper/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/amplitude/quickjs/wrapper/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/a;->b:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const-string v1, "$tmp0"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/amplitude/quickjs/wrapper/a;->b:Ljava/lang/Object;

    check-cast v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;

    invoke-static {v0, p1}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->b(Lcom/amplitude/quickjs/wrapper/QuickJSContext$Console;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
