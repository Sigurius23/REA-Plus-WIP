.class public final synthetic Lm23/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lm23/d;


# direct methods
.method public synthetic constructor <init>(Lm23/d;I)V
    .locals 0

    iput p2, p0, Lm23/a;->w:I

    iput-object p1, p0, Lm23/a;->x:Lm23/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lm23/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lm23/a;->x:Lm23/d;

    invoke-static {v0}, Lm23/d;->b(Lm23/d;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "this$0"

    iget-object v1, p0, Lm23/a;->x:Lm23/d;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lm23/d;->c()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
