.class public final synthetic Lg1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ly2/j1;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:Ly2/j1;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(ILy2/j1;ILy2/j1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lg1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/c;->x:I

    iput-object p2, p0, Lg1/c;->y:Ly2/j1;

    iput p3, p0, Lg1/c;->z:I

    iput-object p4, p0, Lg1/c;->E:Ly2/j1;

    return-void
.end method

.method public synthetic constructor <init>(Ly2/j1;ILy2/j1;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lg1/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/c;->y:Ly2/j1;

    iput p2, p0, Lg1/c;->x:I

    iput-object p3, p0, Lg1/c;->E:Ly2/j1;

    iput p4, p0, Lg1/c;->z:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lg1/c;->w:I

    check-cast p1, Ly2/i1;

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg1/c;->y:Ly2/j1;

    iget v1, v0, Ly2/j1;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    iget v4, p0, Lg1/c;->x:I

    iget v5, p0, Lg1/c;->z:I

    iget-object v6, p0, Lg1/c;->E:Ly2/j1;

    if-le v4, v1, :cond_0

    invoke-virtual {p1, v0, v3, v5, v2}, Ly2/i1;->f(Ly2/j1;IIF)V

    iget v0, v0, Ly2/j1;->w:I

    invoke-virtual {p1, v6, v0, v3, v2}, Ly2/i1;->f(Ly2/j1;IIF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0, v3, v3, v2}, Ly2/i1;->f(Ly2/j1;IIF)V

    iget v0, v0, Ly2/j1;->w:I

    invoke-virtual {p1, v6, v0, v5, v2}, Ly2/i1;->f(Ly2/j1;IIF)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Lg1/c;->y:Ly2/j1;

    if-eqz v1, :cond_1

    iget v2, p0, Lg1/c;->x:I

    invoke-static {v1, v0, v2, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    :cond_1
    iget-object v1, p0, Lg1/c;->E:Ly2/j1;

    if-eqz v1, :cond_2

    iget v2, p0, Lg1/c;->z:I

    invoke-static {v1, v0, v2, p1}, Ly2/i1;->g(Ly2/j1;IILy2/i1;)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
