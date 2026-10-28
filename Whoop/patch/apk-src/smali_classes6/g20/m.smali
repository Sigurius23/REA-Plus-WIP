.class public final synthetic Lg20/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lg20/l;


# direct methods
.method public synthetic constructor <init>(Lg20/l;I)V
    .locals 0

    iput p2, p0, Lg20/m;->w:I

    iput-object p1, p0, Lg20/m;->x:Lg20/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg20/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg20/m;->x:Lg20/l;

    invoke-virtual {v0}, Lg20/l;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg20/m;->x:Lg20/l;

    invoke-virtual {v0}, Lg20/l;->i()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
