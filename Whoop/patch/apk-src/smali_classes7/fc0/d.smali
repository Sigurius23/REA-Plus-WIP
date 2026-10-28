.class public final synthetic Lfc0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lq0/b;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lq0/b;I)V
    .locals 0

    iput p3, p0, Lfc0/d;->w:I

    iput-object p1, p0, Lfc0/d;->x:Lbc3/c0;

    iput-object p2, p0, Lfc0/d;->y:Lq0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lfc0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfc0/d;->x:Lbc3/c0;

    iget-object v1, p0, Lfc0/d;->y:Lq0/b;

    invoke-static {v0, v1}, Lfc0/g;->b(Lbc3/c0;Lq0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfc0/d;->x:Lbc3/c0;

    iget-object v1, p0, Lfc0/d;->y:Lq0/b;

    invoke-static {v0, v1}, Lfc0/g;->c(Lbc3/c0;Lq0/b;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
