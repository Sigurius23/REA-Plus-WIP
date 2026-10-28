.class public final synthetic Lwr0/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:I

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwr0/p0;->w:Ljava/util/List;

    iput p2, p0, Lwr0/p0;->x:I

    iput-object p3, p0, Lwr0/p0;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v3, p1

    check-cast v3, Ll0/u;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v4

    move-object v5, p3

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lwr0/p0;->w:Ljava/util/List;

    iget v1, p0, Lwr0/p0;->x:I

    iget-object v2, p0, Lwr0/p0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Lwr0/u0;->e(Ljava/util/List;ILkotlin/jvm/functions/Function1;Ll0/u;FLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
