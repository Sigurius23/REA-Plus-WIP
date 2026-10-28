.class public final synthetic Lvp1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Lvp1/g;->w:I

    iput-object p1, p0, Lvp1/g;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lvp1/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvp1/g;->x:Lc93/a;

    invoke-static {v0}, Lvp1/h;->y(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lvp1/g;->x:Lc93/a;

    invoke-static {v0}, Lvp1/h;->D(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lvp1/g;->x:Lc93/a;

    invoke-static {v0}, Lvp1/h;->a0(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
