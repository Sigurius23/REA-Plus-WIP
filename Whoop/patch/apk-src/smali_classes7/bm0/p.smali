.class public final synthetic Lbm0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkd1/o;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lkd1/o;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lbm0/p;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm0/p;->y:Ljava/lang/String;

    iput-object p2, p0, Lbm0/p;->x:Lkd1/o;

    iput p3, p0, Lbm0/p;->z:I

    return-void
.end method

.method public synthetic constructor <init>(Lkd1/o;Ljava/lang/String;II)V
    .locals 0

    .line 2
    iput p4, p0, Lbm0/p;->w:I

    iput-object p1, p0, Lbm0/p;->x:Lkd1/o;

    iput-object p2, p0, Lbm0/p;->y:Ljava/lang/String;

    iput p3, p0, Lbm0/p;->z:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lbm0/p;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbm0/p;->y:Ljava/lang/String;

    iget-object v1, p0, Lbm0/p;->x:Lkd1/o;

    iget v2, p0, Lbm0/p;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lyw1/o;->c(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lbm0/p;->y:Ljava/lang/String;

    iget-object v1, p0, Lbm0/p;->x:Lkd1/o;

    iget v2, p0, Lbm0/p;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Llm1/c;->a(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lbm0/p;->y:Ljava/lang/String;

    iget-object v1, p0, Lbm0/p;->x:Lkd1/o;

    iget v2, p0, Lbm0/p;->z:I

    invoke-static {v0, v1, v2, p1, p2}, Lbm0/r;->e(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
