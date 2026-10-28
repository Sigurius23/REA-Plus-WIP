.class public final Lfz/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Lc20/g;


# direct methods
.method public synthetic constructor <init>(Lc20/g;I)V
    .locals 0

    iput p2, p0, Lfz/c;->w:I

    iput-object p1, p0, Lfz/c;->x:Lc20/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lfz/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lfz/a;

    const/4 v1, 0x0

    iget-object v2, p0, Lfz/c;->x:Lc20/g;

    invoke-direct {v0, v2, v1}, Lfz/a;-><init>(Lc20/g;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Lfz/a;

    const/4 v1, 0x1

    iget-object v2, p0, Lfz/c;->x:Lc20/g;

    invoke-direct {v0, v2, v1}, Lfz/a;-><init>(Lc20/g;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
