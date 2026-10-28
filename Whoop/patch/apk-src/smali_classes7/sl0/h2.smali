.class public final synthetic Lsl0/h2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic E:Lsl0/b3;

.field public final synthetic w:Lsl0/v2;

.field public final synthetic x:I

.field public final synthetic y:Liz0/m;

.field public final synthetic z:Lzk0/i0;


# direct methods
.method public synthetic constructor <init>(Lsl0/v2;ILiz0/m;Lzk0/i0;Lsl0/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/h2;->w:Lsl0/v2;

    iput p2, p0, Lsl0/h2;->x:I

    iput-object p3, p0, Lsl0/h2;->y:Liz0/m;

    iput-object p4, p0, Lsl0/h2;->z:Lzk0/i0;

    iput-object p5, p0, Lsl0/h2;->E:Lsl0/b3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v5, p1

    check-cast v5, Ll0/y;

    move-object v6, p2

    check-cast v6, Laf3/t;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p4

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v0, p0, Lsl0/h2;->w:Lsl0/v2;

    iget v1, p0, Lsl0/h2;->x:I

    iget-object v2, p0, Lsl0/h2;->y:Liz0/m;

    iget-object v3, p0, Lsl0/h2;->z:Lzk0/i0;

    iget-object v4, p0, Lsl0/h2;->E:Lsl0/b3;

    invoke-static/range {v0 .. v9}, Lsl0/l2;->q(Lsl0/v2;ILiz0/m;Lzk0/i0;Lsl0/b3;Ll0/y;Laf3/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
