.class public final Lg40/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg40/z1;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(ILg40/z1;Z)V
    .locals 0

    iput p1, p0, Lg40/c2;->w:I

    iput-object p2, p0, Lg40/c2;->x:Lg40/z1;

    iput-boolean p3, p0, Lg40/c2;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg40/c2;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-boolean p2, p0, Lg40/c2;->y:Z

    const/4 v0, 0x0

    iget-object v1, p0, Lg40/c2;->x:Lg40/z1;

    invoke-static {v1, p2, p1, v0}, Ldp/d;->c(Lg40/z1;ZLandroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    and-int/lit8 p2, p2, 0x3

    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    move-object p2, p1

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-boolean p2, p0, Lg40/c2;->y:Z

    const/4 v0, 0x0

    iget-object v1, p0, Lg40/c2;->x:Lg40/z1;

    invoke-static {v1, p2, p1, v0}, Ldp/d;->c(Lg40/z1;ZLandroidx/compose/runtime/Composer;I)V

    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
