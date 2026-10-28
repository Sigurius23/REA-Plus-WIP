.class public final synthetic Lj31/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj31/m;


# direct methods
.method public synthetic constructor <init>(Lj31/m;I)V
    .locals 0

    iput p2, p0, Lj31/i;->w:I

    iput-object p1, p0, Lj31/i;->x:Lj31/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj31/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj31/i;->x:Lj31/m;

    invoke-static {v0}, Lj31/m;->b(Lj31/m;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj31/i;->x:Lj31/m;

    invoke-static {v0}, Lj31/h$b$a;->h(Lj31/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lj31/i;->x:Lj31/m;

    invoke-static {v0}, Lj31/h$b$a;->i(Lj31/m;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
