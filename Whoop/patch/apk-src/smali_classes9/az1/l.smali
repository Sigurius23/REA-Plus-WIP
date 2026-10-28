.class public final synthetic Laz1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Leb/u0;

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Leb/u0;Lc93/a;I)V
    .locals 0

    iput p4, p0, Laz1/l;->w:I

    iput-object p1, p0, Laz1/l;->x:Ljava/lang/String;

    iput-object p2, p0, Laz1/l;->y:Leb/u0;

    iput-object p3, p0, Laz1/l;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Laz1/l;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Laz1/l;->x:Ljava/lang/String;

    iget-object v1, p0, Laz1/l;->y:Leb/u0;

    iget-object v2, p0, Laz1/l;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Laz1/n;->q(Ljava/lang/String;Leb/u0;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Laz1/l;->x:Ljava/lang/String;

    iget-object v1, p0, Laz1/l;->y:Leb/u0;

    iget-object v2, p0, Laz1/l;->z:Lc93/a;

    invoke-static {v0, v1, v2, p1, p2}, Laz1/n;->h(Ljava/lang/String;Leb/u0;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
