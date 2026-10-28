.class public final synthetic Ljp1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lhp1/m;

.field public final synthetic F:Lz1/p;

.field public final synthetic w:I

.field public final synthetic x:Lz1/p;

.field public final synthetic y:I

.field public final synthetic z:Lz1/p;


# direct methods
.method public synthetic constructor <init>(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ljp1/s;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/s;->E:Lhp1/m;

    iput-object p2, p0, Ljp1/s;->x:Lz1/p;

    iput p3, p0, Ljp1/s;->y:I

    iput-object p4, p0, Ljp1/s;->z:Lz1/p;

    iput-object p5, p0, Ljp1/s;->F:Lz1/p;

    return-void
.end method

.method public synthetic constructor <init>(Lz1/p;ILz1/p;Lhp1/m;Lz1/p;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ljp1/s;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljp1/s;->x:Lz1/p;

    iput p2, p0, Ljp1/s;->y:I

    iput-object p3, p0, Ljp1/s;->z:Lz1/p;

    iput-object p4, p0, Ljp1/s;->E:Lhp1/m;

    iput-object p5, p0, Ljp1/s;->F:Lz1/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljp1/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v5, p0, Ljp1/s;->F:Lz1/p;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    iget-object v1, p0, Ljp1/s;->E:Lhp1/m;

    iget-object v2, p0, Ljp1/s;->x:Lz1/p;

    iget v3, p0, Ljp1/s;->y:I

    iget-object v4, p0, Ljp1/s;->z:Lz1/p;

    invoke-static/range {v1 .. v6}, Ljp1/u;->g(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v4, p0, Ljp1/s;->F:Lz1/p;

    move-object v5, p1

    check-cast v5, Ljava/lang/String;

    iget-object v0, p0, Ljp1/s;->E:Lhp1/m;

    iget-object v1, p0, Ljp1/s;->x:Lz1/p;

    iget v2, p0, Ljp1/s;->y:I

    iget-object v3, p0, Ljp1/s;->z:Lz1/p;

    invoke-static/range {v0 .. v5}, Ljp1/u;->b(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
