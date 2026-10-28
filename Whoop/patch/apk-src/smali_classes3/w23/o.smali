.class public final Lw23/o;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lw23/p;


# direct methods
.method public synthetic constructor <init>(Lw23/p;I)V
    .locals 0

    iput p2, p0, Lw23/o;->w:I

    iput-object p1, p0, Lw23/o;->x:Lw23/p;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lw23/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw23/o;->x:Lw23/p;

    iget-object v0, v0, Lw23/p;->g:Lw23/r;

    iget-object v0, v0, Lw23/r;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw23/q;

    iget-object v0, v0, Lw23/q;->e:Lx23/f;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lw23/o;->x:Lw23/p;

    iget-object v0, v0, Lw23/p;->g:Lw23/r;

    iget-object v0, v0, Lw23/r;->b:Lec3/r1;

    iget-object v0, v0, Lec3/r1;->w:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw23/q;

    iget-object v0, v0, Lw23/q;->d:Lx23/f;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
