.class public final La3/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La3/d;


# direct methods
.method public synthetic constructor <init>(La3/d;I)V
    .locals 0

    iput p2, p0, La3/c;->w:I

    iput-object p1, p0, La3/c;->x:La3/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, La3/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La3/c;->x:La3/d;

    iget-object v1, v0, La3/d;->O:Lb2/u;

    const-string v2, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lz2/c;

    invoke-interface {v1, v0}, Lz2/c;->h(Lz2/g;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, La3/c;->x:La3/d;

    invoke-virtual {v0}, La3/d;->Z0()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
