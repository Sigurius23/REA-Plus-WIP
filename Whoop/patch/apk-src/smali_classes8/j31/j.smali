.class public final synthetic Lj31/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj31/m;


# direct methods
.method public synthetic constructor <init>(Lj31/m;I)V
    .locals 0

    iput p2, p0, Lj31/j;->w:I

    iput-object p1, p0, Lj31/j;->x:Lj31/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj31/j;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    iget-object v0, p0, Lj31/j;->x:Lj31/m;

    invoke-static {v0, p1, p2}, Lj31/m;->a(Lj31/m;Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/r;

    check-cast p2, Lh2/b;

    iget-object v0, p0, Lj31/j;->x:Lj31/m;

    invoke-static {v0, p1, p2}, Lj31/h$b$a;->f(Lj31/m;Lu2/r;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
