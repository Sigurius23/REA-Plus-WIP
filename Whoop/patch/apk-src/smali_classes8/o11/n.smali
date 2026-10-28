.class public final synthetic Lo11/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo11/m$b;


# direct methods
.method public synthetic constructor <init>(Lo11/m$b;I)V
    .locals 0

    iput p2, p0, Lo11/n;->w:I

    iput-object p1, p0, Lo11/n;->x:Lo11/m$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo11/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo11/n;->x:Lo11/m$b;

    invoke-static {v0}, Lo11/m$b;->C(Lo11/m$b;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lo11/n;->x:Lo11/m$b;

    invoke-static {v0}, Lo11/m$b;->A(Lo11/m$b;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lo11/n;->x:Lo11/m$b;

    invoke-static {v0}, Lo11/m$b;->z(Lo11/m$b;)Ly3/f;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lo11/n;->x:Lo11/m$b;

    invoke-static {v0}, Lo11/m$b;->D(Lo11/m$b;)Lkd1/o$c;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
