.class public final synthetic Lrz0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:F


# direct methods
.method public synthetic constructor <init>(FJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lrz0/d;->w:J

    iput p1, p0, Lrz0/d;->x:F

    iput p4, p0, Lrz0/d;->y:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Landroidx/compose/ui/Modifier;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-wide v0, p0, Lrz0/d;->w:J

    iget v2, p0, Lrz0/d;->x:F

    iget v3, p0, Lrz0/d;->y:F

    invoke-static/range {v0 .. v6}, Lrz0/e;->d(JFFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
