.class public final synthetic Lg21/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/o;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:Z

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg21/a;->w:Ljava/util/List;

    iput-boolean p2, p0, Lg21/a;->x:Z

    iput-object p3, p0, Lg21/a;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object v5, p3

    check-cast v5, Lf31/a;

    move-object v6, p4

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p5, Ljava/lang/Integer;

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lg21/a;->w:Ljava/util/List;

    iget-boolean v1, p0, Lg21/a;->x:Z

    iget-object v2, p0, Lg21/a;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v7}, Lg21/b;->a(Ljava/util/List;ZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;ILf31/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
