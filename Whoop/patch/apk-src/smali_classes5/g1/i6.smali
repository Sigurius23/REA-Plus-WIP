.class public final synthetic Lg1/i6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg1/l6;


# direct methods
.method public synthetic constructor <init>(Lg1/l6;I)V
    .locals 0

    iput p2, p0, Lg1/i6;->w:I

    iput-object p1, p0, Lg1/i6;->x:Lg1/l6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg1/i6;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/i6;->x:Lg1/l6;

    iget-object v0, v0, Lg1/l6;->d:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lg1/t6;->x:Lg1/t6;

    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg1/i6;->x:Lg1/l6;

    iget-object v0, v0, Lg1/l6;->d:Lbc3/m;

    invoke-virtual {v0}, Lbc3/m;->isActive()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lg1/t6;->w:Lg1/t6;

    invoke-virtual {v0, v1}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
