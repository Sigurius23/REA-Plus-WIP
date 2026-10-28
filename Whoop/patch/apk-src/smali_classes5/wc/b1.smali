.class public final synthetic Lwc/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lud/f;


# direct methods
.method public synthetic constructor <init>(Lud/f;I)V
    .locals 0

    iput p2, p0, Lwc/b1;->w:I

    iput-object p1, p0, Lwc/b1;->x:Lud/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lwc/b1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "obtained assumed credentials via web identity; expiration="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/b1;->x:Lud/f;

    iget-object v1, v1, Lud/f;->b:Lug/b;

    sget-object v2, Lug/t;->w:Lug/t;

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "obtained assumed credentials; expiration="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/b1;->x:Lud/f;

    iget-object v1, v1, Lud/f;->b:Lug/b;

    sget-object v2, Lug/t;->w:Lug/t;

    invoke-virtual {v1, v2}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
