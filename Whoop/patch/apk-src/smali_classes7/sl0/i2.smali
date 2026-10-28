.class public final synthetic Lsl0/i2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Liz0/m;

.field public final synthetic y:Lzk0/i0;

.field public final synthetic z:Lsl0/b3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Liz0/m;Lzk0/i0;Lsl0/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/i2;->w:Ljava/lang/String;

    iput-object p2, p0, Lsl0/i2;->x:Liz0/m;

    iput-object p3, p0, Lsl0/i2;->y:Lzk0/i0;

    iput-object p4, p0, Lsl0/i2;->z:Lsl0/b3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v4, p1

    check-cast v4, Ll0/y;

    move-object v5, p2

    check-cast v5, Laf3/t;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    move-object v7, p4

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lsl0/i2;->w:Ljava/lang/String;

    iget-object v1, p0, Lsl0/i2;->x:Liz0/m;

    iget-object v2, p0, Lsl0/i2;->y:Lzk0/i0;

    iget-object v3, p0, Lsl0/i2;->z:Lsl0/b3;

    invoke-static/range {v0 .. v8}, Lsl0/l2;->j(Ljava/lang/String;Liz0/m;Lzk0/i0;Lsl0/b3;Ll0/y;Laf3/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
