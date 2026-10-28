.class public final synthetic Lwc/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lwc/x;

.field public final synthetic y:Lwc/f0;


# direct methods
.method public synthetic constructor <init>(Lwc/x;Lwc/f0;I)V
    .locals 0

    iput p3, p0, Lwc/z;->w:I

    iput-object p1, p0, Lwc/z;->x:Lwc/x;

    iput-object p2, p0, Lwc/z;->y:Lwc/f0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lwc/z;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "refresh token failed, original token is still valid until "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/z;->x:Lwc/x;

    iget-object v1, v1, Lwc/x;->f:Lug/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for login-session: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc/z;->y:Lwc/f0;

    iget-object v1, v1, Lwc/f0;->w:Ljava/lang/String;

    const-string v2, ", re-using"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "cached token is not refreshable but still valid until "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc/z;->x:Lwc/x;

    iget-object v1, v1, Lwc/x;->f:Lug/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for login-session: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lwc/z;->y:Lwc/f0;

    iget-object v1, v1, Lwc/f0;->w:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
