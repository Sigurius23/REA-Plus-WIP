.class public final synthetic Lv11/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lv11/b;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lv11/b;Lc93/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lv11/f;->w:I

    iput-object p1, p0, Lv11/f;->x:Lv11/b;

    iput-object p2, p0, Lv11/f;->y:Lc93/a;

    iput-object p3, p0, Lv11/f;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lv11/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv11/f;->y:Lc93/a;

    iget-object v1, p0, Lv11/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv11/f;->x:Lv11/b;

    invoke-static {v2, v0, v1}, Lv11/i;->l(Lv11/b;Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lv11/f;->y:Lc93/a;

    iget-object v1, p0, Lv11/f;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv11/f;->x:Lv11/b;

    invoke-static {v2, v0, v1}, Lv11/i;->c(Lv11/b;Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
