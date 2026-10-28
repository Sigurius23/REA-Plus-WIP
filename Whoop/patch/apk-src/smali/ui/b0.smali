.class public final Lui/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqi/z;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lbc3/m;


# direct methods
.method public synthetic constructor <init>(Lbc3/m;I)V
    .locals 0

    iput p2, p0, Lui/b0;->a:I

    iput-object p1, p0, Lui/b0;->b:Lbc3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lui/b0;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Lui/b0;->b:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->w()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "e"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lui/b0;->b:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->w()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, p1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
