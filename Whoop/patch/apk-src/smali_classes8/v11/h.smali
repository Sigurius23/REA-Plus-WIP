.class public final synthetic Lv11/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lv11/k;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lv11/k;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lv11/h;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lv11/h;->y:Lv11/k;

    iput-object p3, p0, Lv11/h;->z:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lv11/h;->x:Lc93/a;

    return-void
.end method

.method public synthetic constructor <init>(Lc93/a;Lv11/k;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p4, p0, Lv11/h;->w:I

    iput-object p1, p0, Lv11/h;->x:Lc93/a;

    iput-object p2, p0, Lv11/h;->y:Lv11/k;

    iput-object p3, p0, Lv11/h;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lv11/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lv11/h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lv11/h;->x:Lc93/a;

    iget-object v2, p0, Lv11/h;->y:Lv11/k;

    invoke-static {v1, v2, v0}, Lv11/i;->d(Lc93/a;Lv11/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lv11/h;->y:Lv11/k;

    iget-object v1, p0, Lv11/h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv11/h;->x:Lc93/a;

    invoke-static {v2, v0, v1}, Lv11/i;->h(Lc93/a;Lv11/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lv11/h;->y:Lv11/k;

    iget-object v1, p0, Lv11/h;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lv11/h;->x:Lc93/a;

    invoke-static {v2, v0, v1}, Lv11/i;->n(Lc93/a;Lv11/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
