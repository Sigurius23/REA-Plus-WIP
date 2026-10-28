.class public final synthetic Lsl0/t2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:Lc93/a;

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl0/t2;->w:Lc93/a;

    iput-object p2, p0, Lsl0/t2;->x:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v2, p1

    check-cast v2, Landroidx/compose/foundation/lazy/a;

    move-object v3, p2

    check-cast v3, Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-object v4, p3

    check-cast v4, Lf31/a;

    move-object v5, p4

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lsl0/t2;->w:Lc93/a;

    iget-object v1, p0, Lsl0/t2;->x:Lc93/a;

    invoke-static/range {v0 .. v6}, Lsl0/u2;->d(Lc93/a;Lc93/a;Landroidx/compose/foundation/lazy/a;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
