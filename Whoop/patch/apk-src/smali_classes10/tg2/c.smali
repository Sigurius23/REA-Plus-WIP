.class public final synthetic Ltg2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lc93/a;

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/design/models/modal/BottomSheet;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Ll1/w3;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/models/modal/BottomSheet;Lbc3/c0;Ll1/w3;Lc93/a;I)V
    .locals 0

    iput p5, p0, Ltg2/c;->w:I

    iput-object p1, p0, Ltg2/c;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iput-object p2, p0, Ltg2/c;->y:Lbc3/c0;

    iput-object p3, p0, Ltg2/c;->z:Ll1/w3;

    iput-object p4, p0, Ltg2/c;->E:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ltg2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ltg2/c;->z:Ll1/w3;

    iget-object v1, p0, Ltg2/c;->E:Lc93/a;

    iget-object v2, p0, Ltg2/c;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v3, p0, Ltg2/c;->y:Lbc3/c0;

    invoke-static {v2, v3, v0, v1}, Ltg2/d;->g(Lcom/whoop/design/models/modal/BottomSheet;Lbc3/c0;Ll1/w3;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ltg2/c;->z:Ll1/w3;

    iget-object v1, p0, Ltg2/c;->E:Lc93/a;

    iget-object v2, p0, Ltg2/c;->x:Lcom/whoop/design/models/modal/BottomSheet;

    iget-object v3, p0, Ltg2/c;->y:Lbc3/c0;

    invoke-static {v2, v3, v0, v1}, Ltg2/d;->c(Lcom/whoop/design/models/modal/BottomSheet;Lbc3/c0;Ll1/w3;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
