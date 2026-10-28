.class public final synthetic Lsl0/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lnl0/g;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lnl0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/s0;->w:Lc93/a;

    iput-object p2, p0, Lsl0/s0;->x:Lnl0/g;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lc0/i0;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lsl0/s0;->w:Lc93/a;

    iget-object v1, p0, Lsl0/s0;->x:Lnl0/g;

    invoke-static {v0, v1, p1, p2, p3}, Lsl0/u0;->D(Lc93/a;Lnl0/g;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
