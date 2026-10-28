.class public final synthetic Ly21/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lp1/t2;I)V
    .locals 0

    iput p2, p0, Ly21/j;->w:I

    iput-object p1, p0, Ly21/j;->x:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ly21/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly21/j;->x:Lp1/t2;

    check-cast v0, Lp1/c1;

    invoke-static {v0}, Ly21/i;->p(Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly21/j;->x:Lp1/t2;

    invoke-static {v0}, Ly21/i$d;->a(Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ly21/j;->x:Lp1/t2;

    invoke-static {v0}, Ly21/i$d;->c(Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
