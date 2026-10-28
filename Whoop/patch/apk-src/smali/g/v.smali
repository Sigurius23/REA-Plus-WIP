.class public final Lg/v;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg/z;


# direct methods
.method public synthetic constructor <init>(Lg/z;I)V
    .locals 0

    iput p2, p0, Lg/v;->w:I

    iput-object p1, p0, Lg/v;->x:Lg/z;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg/v;->x:Lg/z;

    invoke-virtual {v0}, Lg/z;->c()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg/v;->x:Lg/z;

    invoke-virtual {v0}, Lg/z;->d()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
